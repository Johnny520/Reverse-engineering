// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ˈˈ.CLS94;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS534.CLS533;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS663 implements CLS35 {
    public final int FLD686;
    public final CLS881 FLD687;

    public CLS663(CLS881 ﾞˏ0, int v) {
        this.FLD686 = v;
        this.FLD687 = ﾞˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s3;
        CLS1626 ـﹳ0;
        Bitmap bitmap1;
        ImageView imageView1;
        String s = null;
        CLS881 ﾞˏ0 = this.FLD687;
        switch(this.FLD686) {
            case 0: {
                ﾞˏ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                int v = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
                Intent intent0 = (Intent)ᵔʾ0.MTH3204()[2];
                if(intent0 != null) {
                    try {
                        switch(v) {
                            case 5000: {
                                if(intent0.getData() != null) {
                                    Activity activity1 = ((CLS140)ﾞˏ0).MTH3042();
                                    Uri uri0 = intent0.getData();
                                    try {
                                        InputStream inputStream0 = activity1.getContentResolver().openInputStream(uri0);
                                        if(inputStream0 != null) {
                                            Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0, null, null);
                                            inputStream0.close();
                                            s = bitmap0;
                                        }
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                    }
                                    if(!TextUtils.isEmpty(ﾞˏ0.FLD1494)) {
                                        CLS518.MTH7058(new File(ﾞˏ0.FLD1494), ((Bitmap)s));
                                    }
                                    ImageView imageView0 = ﾞˏ0.FLD1517;
                                    if(imageView0 != null) {
                                        imageView1 = imageView0;
                                        bitmap1 = s;
                                        imageView1.setImageBitmap(CLS518.MTH7064(bitmap1));
                                        return;
                                    }
                                }
                                break;
                            }
                            case 5001: {
                                if(intent0.hasExtra("after_photo_edit")) {
                                    String s2 = intent0.getStringExtra("after_photo_edit");
                                    if(!TextUtils.isEmpty(ﾞˏ0.FLD1510)) {
                                        CLS31.MTH976(s2, ﾞˏ0.FLD1510);
                                        CLS31.MTH1011(new File(s2));
                                        ﾞˏ0.FLD1501 = ﾞˏ0.FLD1510;
                                    }
                                    ImageView imageView2 = ﾞˏ0.FLD1517;
                                    if(imageView2 != null) {
                                        imageView2.setImageBitmap(CLS518.MTH7074(0x200, 0x200, ﾞˏ0.FLD1501));
                                    }
                                    ـﹳ0 = ﾞˏ0.FLD1493;
                                    if(ـﹳ0 != null) {
                                        ـﹳ0.MTH798(ﾞˏ0.FLD1501);
                                        return;
                                    }
                                }
                                break;
                            }
                            case 5002: {
                                Uri uri1 = intent0.getData();
                                if(uri1 != null) {
                                    s3 = CLS881.MTH3115(uri1);
                                    ﾞˏ0.FLD1498 = s3;
                                    ﾞˏ0.FLD1490.MTH798(s3);
                                    return;
                                }
                                break;
                            }
                            case 5003: {
                                Uri uri2 = intent0.getData();
                                if(uri2 != null) {
                                    ﾞˏ0.FLD1501 = CLS881.MTH3115(uri2);
                                    Activity activity2 = ((CLS140)ﾞˏ0).MTH3042();
                                    Uri uri3 = intent0.getData();
                                    try {
                                        InputStream inputStream1 = activity2.getContentResolver().openInputStream(uri3);
                                        if(inputStream1 != null) {
                                            Bitmap bitmap2 = BitmapFactory.decodeStream(inputStream1, null, null);
                                            inputStream1.close();
                                            s = bitmap2;
                                        }
                                    }
                                    catch(Throwable throwable2) {
                                        CLS27.MTH893(throwable2);
                                    }
                                    if(TextUtils.isEmpty(ﾞˏ0.FLD1501) && s != null) {
                                        ﾞˏ0.FLD1501 = CLS31.MTH1013(((CLS140)ﾞˏ0).MTH3042());
                                        CLS518.MTH7058(new File(ﾞˏ0.FLD1501), ((Bitmap)s));
                                    }
                                    ImageView imageView3 = ﾞˏ0.FLD1517;
                                    if(imageView3 != null) {
                                        imageView3.setImageBitmap(CLS518.MTH7064(((Bitmap)s)));
                                    }
                                    ـﹳ0 = ﾞˏ0.FLD1493;
                                    if(ـﹳ0 != null) {
                                        ـﹳ0.MTH798(ﾞˏ0.FLD1501);
                                        return;
                                    }
                                }
                                break;
                            }
                            case 5004: {
                                Uri uri4 = intent0.getData();
                                if(uri4 != null) {
                                    String s4 = CLS881.MTH3115(uri4);
                                    ﾞˏ0.FLD1488 = s4;
                                    if(!TextUtils.isEmpty(s4)) {
                                        WebView webView0 = ﾞˏ0.FLD1515;
                                        if(webView0 != null) {
                                            webView0.loadUrl("file://" + ﾞˏ0.FLD1488);
                                        }
                                        Object object0 = ﾞˏ0.FLD1513;
                                        if(object0 != null) {
                                            CLS166.MTH3195(object0, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{ﾞˏ0.FLD1488});
                                            return;
                                        }
                                    }
                                }
                                break;
                            }
                            case 5005: {
                                ArrayList arrayList0 = intent0.getStringArrayListExtra("CropImage_OutputPath_List");
                                if(arrayList0 != null && !arrayList0.isEmpty()) {
                                    bitmap1 = CLS518.MTH7060(((String)arrayList0.get(0)));
                                    if(!TextUtils.isEmpty(ﾞˏ0.FLD1494)) {
                                        CLS518.MTH7058(new File(ﾞˏ0.FLD1494), bitmap1);
                                    }
                                    imageView1 = ﾞˏ0.FLD1517;
                                    if(imageView1 != null) {
                                        imageView1.setImageBitmap(CLS518.MTH7064(bitmap1));
                                        return;
                                    }
                                }
                                break;
                            }
                            case 5006: {
                                ArrayList arrayList1 = intent0.getStringArrayListExtra("CropImage_OutputPath_List");
                                if(arrayList1 != null && !arrayList1.isEmpty()) {
                                    String s5 = (String)arrayList1.get(0);
                                    ﾞˏ0.FLD1501 = s5;
                                    Bitmap bitmap3 = CLS518.MTH7060(s5);
                                    ImageView imageView4 = ﾞˏ0.FLD1517;
                                    if(imageView4 != null) {
                                        imageView4.setImageBitmap(CLS518.MTH7064(bitmap3));
                                    }
                                    ـﹳ0 = ﾞˏ0.FLD1493;
                                    if(ـﹳ0 != null) {
                                        ـﹳ0.MTH798(ﾞˏ0.FLD1501);
                                        return;
                                    }
                                }
                                break;
                            }
                            case 5007: {
                                ArrayList arrayList2 = intent0.getStringArrayListExtra("key_select_video_list");
                                if(arrayList2 != null && !arrayList2.isEmpty()) {
                                    s3 = (String)arrayList2.get(0);
                                    ﾞˏ0.FLD1498 = s3;
                                    ﾞˏ0.FLD1490.MTH798(s3);
                                    return;
                                }
                                break;
                            }
                            case 5008: {
                                ArrayList arrayList3 = intent0.getStringArrayListExtra("CropImage_OutputPath_List");
                                if(arrayList3 != null && !arrayList3.isEmpty()) {
                                    String s6 = (String)arrayList3.get(0);
                                    if(s6.endsWith("gif")) {
                                        ﾞˏ0.FLD1488 = s6;
                                        if(!TextUtils.isEmpty(s6)) {
                                            WebView webView1 = ﾞˏ0.FLD1515;
                                            if(webView1 != null) {
                                                webView1.loadUrl("file://" + ﾞˏ0.FLD1488);
                                            }
                                            Object object1 = ﾞˏ0.FLD1513;
                                            if(object1 != null) {
                                                CLS166.MTH3195(object1, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{ﾞˏ0.FLD1488});
                                                return;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 5009: {
                                ArrayList arrayList4 = intent0.getStringArrayListExtra("CropImage_OutputPath_List");
                                if(arrayList4 != null && !arrayList4.isEmpty()) {
                                    ﾞˏ0.FLD1518.clear();
                                    ﾞˏ0.FLD1518.addAll(arrayList4);
                                    CLS412.MTH5998(((CLS3)ﾞˏ0.FLD1491));
                                    return;
                                }
                                break;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                ﾞˏ0.getClass();
                CLS8 ـˏ1 = (CLS8)arr_object[0];
                String s7 = CLS27.MTH889("select_img");
                Activity activity3 = ((CLS140)ﾞˏ0).MTH3042();
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_temp_img");
                CLS31.MTH1011(file0);
                CLS523.MTH7145(activity3, s7, ((CLS17)new CLS1259(ﾞˏ0, activity3, file0, 8)), ((CLS11)new CLS641(ـˏ1, file0)));
                return;
            }
            case 2: {
                ﾞˏ0.getClass();
                String s8 = (String)arr_object[0];
                CLS11 ᐧⁱ0 = (CLS11)arr_object[1];
                String s9 = CLS27.MTH889("select_img");
                Activity activity4 = ((CLS140)ﾞˏ0).MTH3042();
                File file1 = new File(CLS27.MTH900().getCacheDir(), s8);
                CLS31.MTH996(file1.getAbsolutePath());
                if(CLS25.MTH860(2, s8)) {
                    CLS31.MTH1037(CLS25.MTH867(2, s8), file1);
                }
                new CLS141(file1, s8, file1).startWatching();
                CLS523.MTH7145(activity4, s9, ((CLS17)new CLS612(ﾞˏ0, activity4, file1, s8, 8, 0)), ᐧⁱ0);
                return;
            }
            case 3: {
                ﾞˏ0.getClass();
                CLS8 ـˏ2 = (CLS8)arr_object[0];
                String s10 = arr_object.length <= 1 ? null : ((String)arr_object[1]);
                if(arr_object.length > 2) {
                    s = (String)arr_object[2];
                }
                String s11 = CLS27.MTH889("select_img");
                Activity activity5 = ((CLS140)ﾞˏ0).MTH3042();
                CLS523.MTH7160(activity5, s11, ((CLS17)new CLS612(ﾞˏ0, activity5, s, s10, 7)), ((CLS11)new CLS803(ﾞˏ0, ـˏ2)));
                return;
            }
            case 4: {
                ﾞˏ0.getClass();
                CLS8 ـˏ3 = (CLS8)arr_object[0];
                String s12 = CLS27.MTH889("select_img");
                Activity activity6 = ((CLS140)ﾞˏ0).MTH3042();
                ArrayList arrayList5 = new ArrayList();
                CLS335 ˑٴ0 = new CLS335(activity6, arrayList5);
                CLS523.MTH7160(activity6, s12, ((CLS17)new CLS766(1, ﾞˏ0, activity6, new HashSet(), ˑٴ0, arrayList5)), ((CLS11)new CLS785(ـˏ3, ˑٴ0)));
                return;
            }
            case 5: {
                ﾞˏ0.getClass();
                CLS8 ـˏ4 = (CLS8)arr_object[0];
                String s13 = CLS27.MTH889("select_gif");
                Activity activity7 = ((CLS140)ﾞˏ0).MTH3042();
                CLS523.MTH7160(activity7, s13, ((CLS17)new CLS707(ﾞˏ0, activity7, 0)), ((CLS11)new CLS775(ﾞˏ0, ـˏ4)));
                return;
            }
            case 6: {
                ﾞˏ0.getClass();
                ﾞˏ0.FLD1495 = (CLS94)arr_object[0];
                CLS8 ـˏ5 = (CLS8)arr_object[1];
                String s14 = CLS27.MTH889("config_watermark");
                Activity activity8 = ((CLS140)ﾞˏ0).MTH3042();
                ArrayList arrayList6 = new ArrayList();
                for(Object object2: ﾞˏ0.FLD1500.MTH1285()) {
                    arrayList6.add(((CLS94)object2).FLD398);
                }
                ArrayList arrayList7 = new ArrayList(arrayList6);
                CLS1620 ˊˏ0 = new CLS1620(activity8);
                ˊˏ0.MTH7248(((CLS533)new CLS799(ﾞˏ0, 0)));
                CLS523.MTH7133(activity8, s14, ((CLS379)new CLS870(ﾞˏ0, activity8, arrayList7, ˊˏ0)), ((CLS378)new CLS870(ﾞˏ0, ˊˏ0, activity8, arrayList7)), ((CLS11)new CLS826(ﾞˏ0, ـˏ5)));
                return;
            }
            default: {
                ﾞˏ0.getClass();
                CLS8 ـˏ0 = (CLS8)arr_object[0];
                String s1 = CLS27.MTH889("select_video");
                Activity activity0 = ((CLS140)ﾞˏ0).MTH3042();
                CLS523.MTH7160(activity0, s1, ((CLS17)new CLS707(ﾞˏ0, activity0, 1)), ((CLS11)new CLS668(ﾞˏ0, ـˏ0)));
            }
        }
    }
}

