// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS69;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import java.io.File;
import java.util.HashMap;
import java.util.Set;

public final class CLS1273 implements CLS39 {
    public final int FLD3427;
    public final CLS3 FLD3428;
    public final ContentValues FLD3429;
    public final CLS338 FLD3430;
    public final Set FLD3431;

    public CLS1273(CLS338 יᐧ0, ContentValues contentValues0, Set set0, CLS1274 ﾞˎ0, int v) {
        this.FLD3427 = v;
        this.FLD3430 = יᐧ0;
        this.FLD3429 = contentValues0;
        this.FLD3431 = set0;
        this.FLD3428 = ﾞˎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s1;
        String s2;
        Bitmap bitmap0;
        CLS3 ˆٴ0 = this.FLD3428;
        Set set0 = this.FLD3431;
        CLS338 יᐧ0 = this.FLD3430;
        ContentValues contentValues0 = this.FLD3429;
        switch(this.FLD3427) {
            case 0: {
                יᐧ0.getClass();
                try {
                    if(יᐧ0.MTH5132(contentValues0) == null) {
                        boolean z = contentValues0.containsKey("img");
                        HashMap hashMap0 = יᐧ0.FLD3344;
                        if(z) {
                            s1 = contentValues0.getAsString("img");
                            bitmap0 = CLS518.MTH7076(contentValues0.getAsString("img"));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("gif")) {
                            s1 = contentValues0.getAsString("gif");
                            bitmap0 = CLS518.MTH7076(contentValues0.getAsString("gif"));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("vid")) {
                            hashMap0.put(contentValues0.getAsString("vid"), CLS518.MTH7052(contentValues0.getAsString("vid")));
                        }
                        else if(contentValues0.containsKey("img_uri")) {
                            s1 = contentValues0.getAsString("img_uri");
                            bitmap0 = CLS518.MTH7059(Uri.parse(contentValues0.getAsString("img_uri")));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("gif_uri")) {
                            s1 = contentValues0.getAsString("gif_uri");
                            bitmap0 = CLS518.MTH7059(Uri.parse(contentValues0.getAsString("gif_uri")));
                            if(bitmap0 != null) {
                                if(contentValues0.containsKey("img_color")) {
                                    s2 = contentValues0.getAsString("img_color");
                                    if(!TextUtils.isEmpty(s2)) {
                                        bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                    }
                                }
                                hashMap0.put(s1, bitmap0);
                            }
                        }
                        else if(contentValues0.containsKey("vid_uri")) {
                            hashMap0.put(contentValues0.getAsString("vid_uri"), CLS518.MTH7075(Uri.parse(contentValues0.getAsString("vid_uri"))));
                        }
                        else if(contentValues0.containsKey("web_img")) {
                            s1 = contentValues0.getAsString("web_img");
                            byte[] arr_b2 = CLS432.MTH6171(s1);
                            if(arr_b2 != null) {
                                String s5 = CLS31.MTH1013(CLS27.MTH900());
                                if(CLS31.MTH1033(new File(s5), arr_b2)) {
                                    CLS31.MTH996(s5);
                                    bitmap0 = CLS518.MTH7076(s5);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                            }
                                        }
                                        hashMap0.put(s1, bitmap0);
                                    }
                                }
                            }
                        }
                        else if(contentValues0.containsKey("web_gif")) {
                            s1 = contentValues0.getAsString("web_gif");
                            byte[] arr_b1 = CLS432.MTH6171(s1);
                            if(arr_b1 != null) {
                                String s4 = CLS31.MTH1013(CLS27.MTH900());
                                if(CLS31.MTH1033(new File(s4), arr_b1)) {
                                    CLS31.MTH996(s4);
                                    bitmap0 = CLS518.MTH7076(s4);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                            }
                                        }
                                        hashMap0.put(s1, bitmap0);
                                    }
                                }
                            }
                        }
                        else if(contentValues0.containsKey("web_vid")) {
                            s1 = contentValues0.getAsString("web_vid");
                            byte[] arr_b = CLS432.MTH6171(s1);
                            if(arr_b != null) {
                                String s3 = CLS31.MTH1013(CLS27.MTH900());
                                if(CLS31.MTH1033(new File(s3), arr_b)) {
                                    CLS31.MTH996(s3);
                                    bitmap0 = CLS518.MTH7052(s3);
                                    if(bitmap0 != null) {
                                        if(contentValues0.containsKey("img_color")) {
                                            s2 = contentValues0.getAsString("img_color");
                                            if(!TextUtils.isEmpty(s2)) {
                                                bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
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
                                bitmap0 = ThumbnailUtils.extractThumbnail(CLS372.MTH5411(s1), 0x40, 0x40);
                                if(bitmap0 != null) {
                                    if(contentValues0.containsKey("img_color")) {
                                        s2 = contentValues0.getAsString("img_color");
                                        if(!TextUtils.isEmpty(s2)) {
                                            bitmap0 = CLS518.MTH7065(bitmap0, CLS522.MTH7110(s2));
                                        }
                                    }
                                    hashMap0.put(s1, bitmap0);
                                }
                            }
                        }
                        else if(((int)contentValues0.getAsInteger("type")) == -16) {
                            if(contentValues0.containsKey("path")) {
                                s1 = contentValues0.getAsString("path");
                                hashMap0.put(s1, CLS518.MTH7052(s1));
                            }
                            else if(contentValues0.containsKey("uri")) {
                                s1 = contentValues0.getAsString("uri");
                                hashMap0.put(s1, CLS518.MTH7075(Uri.parse(s1)));
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH774();
                return;
            }
            case 1: {
                יᐧ0.getClass();
                File file0 = new File(contentValues0.getAsString("mp3"));
                try {
                    if(TextUtils.isEmpty(יᐧ0.MTH5131(file0))) {
                        String s6 = CLS481.MTH6693(CLS31.MTH984(new CLS69(file0)));
                        String s7 = file0.getAbsolutePath();
                        יᐧ0.FLD3348.put(s7, s6);
                    }
                }
                catch(Throwable throwable2) {
                    throwable2.printStackTrace();
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH774();
                return;
            }
            default: {
                יᐧ0.getClass();
                Uri uri0 = Uri.parse(contentValues0.getAsString("mp3_uri"));
                try {
                    if(TextUtils.isEmpty(יᐧ0.MTH5126(uri0))) {
                        String s = CLS481.MTH6693(CLS31.MTH1028(uri0));
                        יᐧ0.FLD3348.put(uri0.toString(), s);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                set0.remove(contentValues0);
                ˆٴ0.MTH774();
            }
        }
    }
}

