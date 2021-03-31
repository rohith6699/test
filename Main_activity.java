public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private ArrayList<Emp>empArrayList;
    private FloatingActionButton fab;
    private Context context;



public class MainActivity extends AppCompatActivity {

    Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;
    
    int[] images = {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Gallery);
        simpleGallery = (Gallery) findViewById(R.id.simpleGallery); 
        selectedImageView = (ImageView) findViewById(R.id.selectedImageView); 
        customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images); 
        simpleGallery.setAdapter(customGalleryAdapter); 
        simpleGallery.setSpacing(10);
        
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
                selectedImageView.setImageResource(images[position]);

             @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Recyclerview);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        setRecyclerViewData();
        adapter = new MyAdapter(this,context);
        recyclerView.setAdapter(adapter);
        fab.setOnClickListener(onAddingListener());
    }
    private void setRecyclerViewData() {
        context.add(new context(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11,
            R.drawable.image12, R.drawable.image13);
        
    }
    private View.OnClickListener onAddingListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.Floatingaction_dialoguebox); 
                dialog.setTitle("Enter a text");
                dialog.setCancelable(false); 
                
                EditText name = (EditText) dialog.findViewById(R.id.simpleGallery);
                EditText job = (EditText) dialog.findViewById(R.id.selectedImageview);
                
                View buttonOk=dialog.findViewById(R.id.btn_ok);
                View buttonCancel = dialog.findViewById(R.id.btn_cancel);
                
                
                
               
                buttonOk.setOnClickListener(onConfirmListener(simpleGallery,selectedImageview));
                buttonCancel.setOnClickListener(onCancelListener(dialog));
                dialog.show();
            }
        };
    }
    private AdapterView.OnItemSelectedListener onItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                if (position == 0) {
                   image = true;
                } else {
                    image = false;
                }
            }
            @Override
            public void onNothingSelected(AdapterView parent) {
            }
        };
    }
