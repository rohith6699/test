
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GalleryAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GalleryAdapter adapter;
    private Floatingaction_button fab;
    private Context context;
    
     FloatingActionButton fab = findViewById(R.id.fab);
fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
});


    Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;
    
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.image6};

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
        context.add(new context("Gallery","image1");
        context.add(new context("Gallery","image2")
        context.add(new context("Gallery","image3");
         context.add(new context("Gallery","image4");
        context.add(new context("Gallery","image5");
        context.add(new context("Gallery","image6");

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
                
                View button1Ok=dialog.findViewById(R.id.btn_ok);
                View button2Cancel = dialog.findViewById(R.id.btn_cancel);
                
                
                
               
                button1Ok.setOnClickListener(onConfirmListener(simpleGallery,selectedImageview));
                button2Cancel.setOnClickListener(onCancelListener(dialog));
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
