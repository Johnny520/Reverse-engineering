// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import java.io.File;
import java.lang.ref.WeakReference;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS144;
import t.ﾞᐧ.CLS343;

public final class CLS57 implements AdapterView.OnItemLongClickListener {
    public final CLS38 FLD524;

    public CLS57(CLS38 יᐧ0) {
        this.FLD524 = יᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s;
        Activity activity0;
        this.FLD524.getClass();
        try {
            ContentValues contentValues0 = (ContentValues)this.FLD524.FLD480.getItem(v);
            boolean z = contentValues0.containsKey("img");
            WeakReference weakReference0 = this.FLD524.FLD479;
            if(z) {
                Activity activity2 = (Activity)weakReference0.get();
                String s3 = contentValues0.getAsString("img");
                File file2 = new File(s3);
                if(CLS125.MTH2023(file2)) {
                    CLS43.MTH1433(activity2, file2.getName(), ((CLS144)new CLS272(activity2, s3, 1)), null, "");
                    return true;
                }
            }
            else if(contentValues0.containsKey("vid")) {
                activity0 = (Activity)weakReference0.get();
                s = "vid";
                goto label_12;
            }
            else if(contentValues0.containsKey("mp3")) {
                activity0 = (Activity)weakReference0.get();
                s = "mp3";
            label_12:
                String s1 = contentValues0.getAsString(s);
                File file0 = new File(s1);
                if(CLS125.MTH2023(file0)) {
                    try {
                        MediaPlayer mediaPlayer0 = new MediaPlayer();
                        Handler handler0 = CLS137.FLD972.MTH2142();
                        CLS343 ⁱʾ0 = new CLS343(mediaPlayer0, 4);
                        try {
                            mediaPlayer0.setDataSource(s1);
                        }
                        catch(Throwable throwable2) {
                            CLS133.MTH2113(throwable2);
                            return true;
                        }
                        AlertDialog[] arr_alertDialog = {null};
                        arr_alertDialog[0] = CLS43.MTH1425(activity0, file0.getName(), ((CLS144)new CLS280(activity0, mediaPlayer0, arr_alertDialog, handler0)), ((CLS141)new CLS271(ⁱʾ0)));
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                    return true;
                }
            }
            else if(contentValues0.containsKey("gif")) {
                Activity activity1 = (Activity)weakReference0.get();
                String s2 = contentValues0.getAsString("gif");
                File file1 = new File(s2);
                if(CLS125.MTH2023(file1)) {
                    CLS43.MTH1425(activity1, file1.getName(), ((CLS144)new CLS272(activity1, s2, 0)), null);
                    return true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return true;
    }
}

