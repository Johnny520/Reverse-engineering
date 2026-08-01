// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import t.ʻˑ.CLS4;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;
import t.ᵔʾ.CLS300;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS142;
import t.ⁱʾ.CLS144;
import t.ﾞᐧ.CLS337;

public final class CLS312 implements CLS138 {
    public final int FLD1034;
    public final CLS331 FLD1035;

    public CLS312(CLS331 ﾞᐧ0, int v) {
        this.FLD1034 = v;
        this.FLD1035 = ﾞᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        String s2;
        CLS337 ˎᵢ0;
        String s = null;
        CLS331 ﾞᐧ0 = this.FLD1035;
        if(this.FLD1034 == 0) {
            ﾞᐧ0.getClass();
            CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
            int v = (int)(((Integer)ᵔʾ0.MTH1001()[0]));
            Intent intent0 = (Intent)ᵔʾ0.MTH1001()[2];
            if(intent0 != null) {
                try {
                    switch(v) {
                        case 6001: {
                            if(intent0.hasExtra("after_photo_edit")) {
                                String s1 = intent0.getStringExtra("after_photo_edit");
                                if(!TextUtils.isEmpty(ﾞᐧ0.FLD1089)) {
                                    CLS125.MTH2033(s1, ﾞᐧ0.FLD1089);
                                    CLS125.MTH2041(new File(s1));
                                    ﾞᐧ0.FLD1088 = ﾞᐧ0.FLD1089;
                                }
                                ImageView imageView0 = ﾞᐧ0.FLD1087;
                                if(imageView0 != null) {
                                    imageView0.setImageBitmap(CLS41.MTH1394(ﾞᐧ0.FLD1088, 0x200, 0x200));
                                }
                                ˎᵢ0 = ﾞᐧ0.FLD1086;
                                if(ˎᵢ0 != null) {
                                    ˎᵢ0.MTH2388(ﾞᐧ0.FLD1088);
                                    return;
                                }
                            }
                            break;
                        }
                        case 6003: {
                            Uri uri0 = intent0.getData();
                            if(uri0 != null) {
                                try {
                                    s2 = CLS125.MTH2040(CLS133.MTH2108(), uri0);
                                }
                                catch(Throwable throwable1) {
                                    CLS133.MTH2113(throwable1);
                                    s2 = "";
                                }
                                ﾞᐧ0.FLD1088 = s2;
                                Activity activity0 = ((CLS155)ﾞᐧ0).MTH2306();
                                Uri uri1 = intent0.getData();
                                try {
                                    InputStream inputStream0 = activity0.getContentResolver().openInputStream(uri1);
                                    if(inputStream0 != null) {
                                        Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0, null, null);
                                        inputStream0.close();
                                        s = bitmap0;
                                    }
                                }
                                catch(Throwable throwable2) {
                                    CLS133.MTH2113(throwable2);
                                }
                                if(TextUtils.isEmpty(ﾞᐧ0.FLD1088) && s != null) {
                                    ﾞᐧ0.FLD1088 = CLS125.MTH2028(((CLS155)ﾞᐧ0).MTH2306());
                                    File file0 = new File(ﾞᐧ0.FLD1088);
                                    try {
                                        if(!CLS125.MTH2023(file0)) {
                                            file0.createNewFile();
                                        }
                                        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                                        try {
                                            ((Bitmap)s).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream0);
                                            fileOutputStream0.flush();
                                            fileOutputStream0.close();
                                        }
                                        catch(Exception exception1) {
                                            CLS133.MTH2113(exception1);
                                        }
                                    }
                                    catch(Exception exception0) {
                                        CLS133.MTH2109(file0.getAbsolutePath());
                                        CLS133.MTH2113(exception0);
                                    }
                                }
                                ImageView imageView1 = ﾞᐧ0.FLD1087;
                                if(imageView1 != null) {
                                    imageView1.setImageBitmap(CLS41.MTH1406(((Bitmap)s)));
                                }
                                ˎᵢ0 = ﾞᐧ0.FLD1086;
                                if(ˎᵢ0 != null) {
                                    ˎᵢ0.MTH2388(ﾞᐧ0.FLD1088);
                                    return;
                                }
                            }
                            break;
                        }
                        case 6006: {
                            ArrayList arrayList0 = intent0.getStringArrayListExtra("CropImage_OutputPath_List");
                            if(arrayList0 != null && !arrayList0.isEmpty()) {
                                String s3 = (String)arrayList0.get(0);
                                ﾞᐧ0.FLD1088 = s3;
                                Bitmap bitmap1 = CLS41.MTH1393(s3);
                                ImageView imageView2 = ﾞᐧ0.FLD1087;
                                if(imageView2 != null) {
                                    imageView2.setImageBitmap(CLS41.MTH1406(bitmap1));
                                }
                                ˎᵢ0 = ﾞᐧ0.FLD1086;
                                if(ˎᵢ0 != null) {
                                    ˎᵢ0.MTH2388(ﾞᐧ0.FLD1088);
                                    return;
                                }
                            }
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            return;
        }
        ﾞᐧ0.getClass();
        CLS142 ˆʿ0 = (CLS142)arr_object[0];
        String s4 = arr_object.length <= 1 ? null : ((String)arr_object[1]);
        if(arr_object.length > 2) {
            s = (String)arr_object[2];
        }
        String s5 = CLS133.MTH2099("select_img");
        Activity activity1 = ((CLS155)ﾞᐧ0).MTH2306();
        CLS43.MTH1425(activity1, s5, ((CLS144)new CLS300(ﾞᐧ0, activity1, s, s4)), ((CLS141)new CLS328(ﾞᐧ0, s4, ˆʿ0)));
    }
}

