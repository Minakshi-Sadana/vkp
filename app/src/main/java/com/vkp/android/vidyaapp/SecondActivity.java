package com.vkp.android.vidyaapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by HP on 4/26/2016.
 */
public class SecondActivity extends Activity  {
  //  String companies[] = {"Google", "Windows", "iPhone", "Nokia", "Samsung", "Google", "Windows", "iPhone", "Nokia", "Samsung"};
    //String os[] = {"Android", "Mango", "iOS", "Symbian", "Bada", "Android", "Mango", "iOS", "Symbian", "Bada"};


    TextView download,view,tv_loading;
    //String dest_file_path="test.pdf";
    //int downloadSize=0, totalSize;
    //String download_file_url="http://vidya.edu.in/wp-content/uploads/2014/11/Prospectus-Web.pdf";
    //float per=0;
    //TableLayout tl;
    //TableRow tr;
    //TextView companyTV, valueTV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fees);

        view = (TextView) findViewById(R.id.brochure_view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**  File pdfFile = new File(Environment.getExternalStorageDirectory() + "/testthreepdf/" + "maven.pdf");  // -> filename = maven.pdf
                 Uri path = Uri.fromFile(pdfFile);
                 Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
                 pdfIntent.setDataAndType(path, "application/pdf");
                 pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                 try{
                 startActivity(pdfIntent);
                 }catch(ActivityNotFoundException e){
                 Toast.makeText(SecondActivity.this, "No Application available to view PDF", Toast.LENGTH_SHORT).show();
                 }**/

               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://vidya.edu.in/wp-content/uploads/2014/11/Prospectus-Web.pdf"));

                startActivity(intent);
               // downloadAndOpenPDF();

              /**  File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"http://vidya.edu.in/wp-content/uploads/2014/11/Prospectus-Web.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);**/

              /**  view.setWebViewClient(new WebViewClient(){
                    String url="http://vidya.edu.in/wp-content/uploads/2014/11/Prospectus-Web.pdf";
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }
                });**/

                }


        });
    }}
/**    void downloadAndOpenPDF(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Uri path=Uri.fromFile(downloadFile(download_file_url));
                try{
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(path,"application/pdf");
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
                catch (ActivityNotFoundException e){
                    tv_loading.setError("PDF application reader is not installed on your app");
                }
            }
        }).start();

    }
    File downloadFile(String download_file_path){
        File file=null;
        try{
            URL url=new URL(download_file_path);
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            File SDCardRoot= Environment.getExternalStorageDirectory();
            file=new File(SDCardRoot,dest_file_path);
            FileOutputStream fileOutput=new FileOutputStream(file);
            InputStream inputStream=urlConnection.getInputStream();
            totalSize=urlConnection.getContentLength();
            setText("Starting PDF download...");

byte[] buffer= new byte[1024*1024];
            int bufferLength=0;
            while ((bufferLength=inputStream.read(buffer))>0){
                fileOutput.write(buffer,0,bufferLength);
                downloadSize +=bufferLength;
                per=((float)downloadSize/totalSize)*100;
                setText("Total PDF File size: "+(totalSize/1024)+"KB\n\nDownloading PDF "+(int)per+"% complete");
            }
            fileOutput.close();
            setText("Download Complete. Open PDF Application installed in the device");
        } catch (MalformedURLException e) {
            setTextError("Some error occured. Press back and try again", Color.RED);
        } catch (IOException e) {
            setTextError("Some error occured. Press back and try again", Color.RED);
        }
        catch (final Exception e){
            setTextError("Failed to download image. Please check your internet connection", Color.RED);
        }
        return file;
    }

    private void setTextError(final String message, final int color) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv_loading.setTextColor(color);
                tv_loading.setText(message);
            }
        });
    }

    private void setText(final String txt) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv_loading.setText(txt);
            }
        });

    }

}**/
