// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS42;
import t.ˆʿ.CLS46;
import t.ˊﾞ.CLS106;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ⁱʾ.CLS143;

public final class CLS281 implements CLS136 {
    public final int FLD535;
    public final CLS143 FLD536;
    public final ContentValues FLD537;
    public final CLS73 FLD538;
    public final Set FLD539;

    public CLS281(CLS73 ﾞᐧ0, ContentValues contentValues0, Set set0, CLS283 ⁱʾ0, int v) {
        this.FLD535 = v;
        this.FLD538 = ﾞᐧ0;
        this.FLD537 = contentValues0;
        this.FLD539 = set0;
        this.FLD536 = ⁱʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Uri uri1;
        String s1;
        String s2;
        Bitmap bitmap0;
        CLS143 ˆٴ0 = this.FLD536;
        Set set0 = this.FLD539;
        CLS73 ﾞᐧ0 = this.FLD538;
        ContentValues contentValues0 = this.FLD537;
        switch(this.FLD535) {
            case 0: {
                ﾞᐧ0.getClass();
                try {
                    if(ﾞᐧ0.MTH1562(contentValues0) == null) {
                        boolean z = contentValues0.containsKey("img");
                        HashMap hashMap0 = ﾞᐧ0.FLD561;
                        if(z) {
                            s1 = contentValues0.getAsString("img");
                            bitmap0 = CLS41.MTH1398(contentValues0.getAsString("img"));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("gif")) {
                            s1 = contentValues0.getAsString("gif");
                            bitmap0 = CLS41.MTH1398(contentValues0.getAsString("gif"));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("vid")) {
                            hashMap0.put(contentValues0.getAsString("vid"), CLS41.MTH1409(contentValues0.getAsString("vid")));
                        }
                        else if(contentValues0.containsKey("img_uri")) {
                            s1 = contentValues0.getAsString("img_uri");
                            bitmap0 = CLS41.MTH1405(Uri.parse(contentValues0.getAsString("img_uri")));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("gif_uri")) {
                            s1 = contentValues0.getAsString("gif_uri");
                            bitmap0 = CLS41.MTH1405(Uri.parse(contentValues0.getAsString("gif_uri")));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("vid_uri")) {
                            s1 = contentValues0.getAsString("vid_uri");
                            uri1 = Uri.parse(contentValues0.getAsString("vid_uri"));
                            try {
                            label_92:
                                MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                                mediaMetadataRetriever0.setDataSource(CLS133.MTH2108(), uri1);
                                bitmap0 = mediaMetadataRetriever0.getFrameAtTime();
                                mediaMetadataRetriever0.release();
                            }
                            catch(Throwable throwable2) {
                                CLS133.MTH2113(throwable2);
                                bitmap0 = null;
                            }
                            hashMap0.put(s1, bitmap0);
                        }
                        else if(contentValues0.containsKey("web_img")) {
                            s1 = contentValues0.getAsString("web_img");
                            byte[] arr_b2 = CLS33.MTH1355(s1);
                            if(arr_b2 != null) {
                                String s5 = CLS125.MTH2028(CLS133.MTH2108());
                                if(CLS125.MTH2031(new File(s5), arr_b2)) {
                                    CLS125.MTH2037(s5);
                                    bitmap0 = CLS41.MTH1398(s5);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                            }
                                        }
                                        hashMap0.put(s1, bitmap0);
                                        set0.remove(contentValues0);
                                        ˆٴ0.MTH2169();
                                        return;
                                    }
                                }
                            }
                        }
                        else if(contentValues0.containsKey("web_gif")) {
                            s1 = contentValues0.getAsString("web_gif");
                            byte[] arr_b1 = CLS33.MTH1355(s1);
                            if(arr_b1 != null) {
                                String s4 = CLS125.MTH2028(CLS133.MTH2108());
                                if(CLS125.MTH2031(new File(s4), arr_b1)) {
                                    CLS125.MTH2037(s4);
                                    bitmap0 = CLS41.MTH1398(s4);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                            }
                                        }
                                        hashMap0.put(s1, bitmap0);
                                    }
                                }
                            }
                        }
                        else if(contentValues0.containsKey("web_vid")) {
                            s1 = contentValues0.getAsString("web_vid");
                            byte[] arr_b = CLS33.MTH1355(s1);
                            if(arr_b != null) {
                                String s3 = CLS125.MTH2028(CLS133.MTH2108());
                                if(CLS125.MTH2031(new File(s3), arr_b)) {
                                    CLS125.MTH2037(s3);
                                    bitmap0 = CLS41.MTH1409(s3);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                            }
                                        }
                                        hashMap0.put(s1, bitmap0);
                                    }
                                }
                            }
                        }
                        else if(!contentValues0.containsKey("type") || !contentValues0.containsKey("path") && !contentValues0.containsKey("uri")) {
                            if(contentValues0.containsKey("avatar")) {
                                s1 = contentValues0.getAsString("avatar");
                                bitmap0 = ThumbnailUtils.extractThumbnail(CLS42.MTH1410(s1), 0x40, 0x40);
                                if(bitmap0 != null) {
                                    if(contentValues0.containsKey("img_color")) {
                                        s2 = contentValues0.getAsString("img_color");
                                        if(!TextUtils.isEmpty(s2)) {
                                            bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(s2));
                                        }
                                    }
                                    hashMap0.put(s1, bitmap0);
                                }
                            }
                        }
                        else if(((int)contentValues0.getAsInteger("type")) == -16) {
                            if(contentValues0.containsKey("path")) {
                                s1 = contentValues0.getAsString("path");
                                hashMap0.put(s1, CLS41.MTH1409(s1));
                            }
                            else if(contentValues0.containsKey("uri")) {
                                s1 = contentValues0.getAsString("uri");
                                uri1 = Uri.parse(s1);
                                goto label_92;
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH2169();
                return;
            }
            case 1: {
                ﾞᐧ0.getClass();
                File file0 = new File(contentValues0.getAsString("mp3"));
                try {
                    if(TextUtils.isEmpty(ﾞᐧ0.MTH1563(file0))) {
                        CLS106 ٴـ0 = new CLS106(file0);
                        String s6 = CLS33.MTH1348(CLS125.MTH2029(CLS33.MTH1344(CLS133.MTH2108(), new File(ٴـ0.MTH1848()))));
                        String s7 = file0.getAbsolutePath();
                        ﾞᐧ0.FLD564.put(s7, s6);
                    }
                }
                catch(Throwable throwable3) {
                    throwable3.printStackTrace();
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH2169();
                return;
            }
            default: {
                ﾞᐧ0.getClass();
                Uri uri0 = Uri.parse(contentValues0.getAsString("mp3_uri"));
                try {
                    if(TextUtils.isEmpty(ﾞᐧ0.MTH1560(uri0))) {
                        String s = CLS33.MTH1348(CLS125.MTH2029(uri0));
                        ﾞᐧ0.FLD564.put(uri0.toString(), s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH2169();
            }
        }
    }
}

