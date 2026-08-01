// Decompiled by JEB v5.42.0.202606242140

package d.ᐧי;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS34;
import d.ˑʽ.CLS43;
import d.ˑʽ.CLS5;
import d.יʻ.CLS63;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS119;
import d.ⁱٴ.CLS123;
import java.io.File;
import java.util.HashMap;
import java.util.Set;

public final class CLS209 implements CLS67 {
    public final CLS113 FLD648;
    public final CLS123 FLD649;
    public final int FLD650;
    public final Set FLD651;
    public final ContentValues FLD652;

    public CLS209(CLS113 ᵎʻ0, ContentValues contentValues0, Set set0, CLS207 יʻ0, int v) {
        this.FLD650 = v;
        this.FLD648 = ᵎʻ0;
        this.FLD652 = contentValues0;
        this.FLD651 = set0;
        this.FLD649 = יʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS68$CLS67
    public final void run() {
        long v1;
        String s2;
        Bitmap bitmap0;
        String s;
        CLS123 ᐧי0 = this.FLD649;
        Set set0 = this.FLD651;
        CLS113 ᵎʻ0 = this.FLD648;
        ContentValues contentValues0 = this.FLD652;
        if(this.FLD650 == 0) {
            ᵎʻ0.getClass();
            try {
                if(ᵎʻ0.MTH1127(contentValues0) == null) {
                    boolean z = contentValues0.containsKey("img");
                    HashMap hashMap0 = ᵎʻ0.FLD644;
                    if(z) {
                        s = contentValues0.getAsString("img");
                        bitmap0 = CLS5.MTH399(contentValues0.getAsString("img"));
                        if(bitmap0 != null) {
                            if(contentValues0.containsKey("img_color")) {
                                s2 = contentValues0.getAsString("img_color");
                                if(!TextUtils.isEmpty(s2)) {
                                label_82:
                                    int v = CLS43.MTH643(s2);
                                    ColorMatrixColorFilter colorMatrixColorFilter0 = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                                    Paint paint0 = new Paint();
                                    paint0.setColorFilter(colorMatrixColorFilter0);
                                    paint0.setAlpha(Color.alpha(v));
                                    bitmap0 = bitmap0.copy(bitmap0.getConfig(), true);
                                    new Canvas(bitmap0).drawBitmap(bitmap0, 0.0f, 0.0f, paint0);
                                }
                            }
                            hashMap0.put(s, bitmap0);
                        }
                    }
                    else if(contentValues0.containsKey("gif")) {
                        s = contentValues0.getAsString("gif");
                        bitmap0 = CLS5.MTH399(contentValues0.getAsString("gif"));
                        if(bitmap0 != null) {
                            if(contentValues0.containsKey("img_color")) {
                                s2 = contentValues0.getAsString("img_color");
                                if(TextUtils.isEmpty(s2)) {
                                    hashMap0.put(s, bitmap0);
                                }
                                else {
                                    goto label_82;
                                }
                            }
                            else {
                                hashMap0.put(s, bitmap0);
                            }
                        }
                    }
                    else if(contentValues0.containsKey("vid")) {
                        hashMap0.put(contentValues0.getAsString("vid"), CLS5.MTH398(contentValues0.getAsString("vid")));
                    }
                    else if(contentValues0.containsKey("web_img")) {
                        s = contentValues0.getAsString("web_img");
                        byte[] arr_b2 = CLS1.MTH374(s);
                        if(arr_b2 != null) {
                            String s4 = CLS63.MTH766(CLS69.MTH810());
                            if(CLS63.MTH769(new File(s4), arr_b2)) {
                                CLS63.MTH764(s4);
                                bitmap0 = CLS5.MTH399(s4);
                                if(bitmap0 != null) {
                                    if(contentValues0.containsKey("img_color")) {
                                        s2 = contentValues0.getAsString("img_color");
                                        if(TextUtils.isEmpty(s2)) {
                                            hashMap0.put(s, bitmap0);
                                        }
                                        else {
                                            goto label_82;
                                        }
                                    }
                                    else {
                                        hashMap0.put(s, bitmap0);
                                    }
                                }
                            }
                        }
                    }
                    else if(contentValues0.containsKey("web_gif")) {
                        s = contentValues0.getAsString("web_gif");
                        byte[] arr_b1 = CLS1.MTH374(s);
                        if(arr_b1 != null) {
                            String s3 = CLS63.MTH766(CLS69.MTH810());
                            if(CLS63.MTH769(new File(s3), arr_b1)) {
                                CLS63.MTH764(s3);
                                bitmap0 = CLS5.MTH399(s3);
                                if(bitmap0 != null) {
                                    if(contentValues0.containsKey("img_color")) {
                                        s2 = contentValues0.getAsString("img_color");
                                        if(TextUtils.isEmpty(s2)) {
                                            hashMap0.put(s, bitmap0);
                                        }
                                        else {
                                            goto label_82;
                                        }
                                    }
                                    else {
                                        hashMap0.put(s, bitmap0);
                                    }
                                }
                            }
                        }
                    }
                    else if(contentValues0.containsKey("web_vid")) {
                        s = contentValues0.getAsString("web_vid");
                        byte[] arr_b = CLS1.MTH374(s);
                        if(arr_b != null) {
                            String s1 = CLS63.MTH766(CLS69.MTH810());
                            if(CLS63.MTH769(new File(s1), arr_b)) {
                                CLS63.MTH764(s1);
                                bitmap0 = CLS5.MTH398(s1);
                                if(bitmap0 != null) {
                                    if(contentValues0.containsKey("img_color")) {
                                        s2 = contentValues0.getAsString("img_color");
                                        if(TextUtils.isEmpty(s2)) {
                                            hashMap0.put(s, bitmap0);
                                        }
                                        else {
                                            goto label_82;
                                        }
                                    }
                                    else {
                                        hashMap0.put(s, bitmap0);
                                    }
                                }
                            }
                        }
                    }
                    else if(contentValues0.containsKey("type") && contentValues0.containsKey("path") && ((int)contentValues0.getAsInteger("type")) == -16) {
                        s = contentValues0.getAsString("path");
                        bitmap0 = CLS5.MTH398(s);
                        hashMap0.put(s, bitmap0);
                        set0.remove(contentValues0);
                        ᐧי0.MTH1174();
                        return;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            set0.remove(contentValues0);
            ᐧי0.MTH1174();
            return;
        }
        ᵎʻ0.getClass();
        File file0 = new File(contentValues0.getAsString("mp3"));
        try {
            if(TextUtils.isEmpty(ᵎʻ0.MTH1130(file0))) {
                CLS119 ⁱٴ0 = new CLS119(file0);
                Uri uri0 = CLS1.MTH371(CLS69.MTH810(), new File(ⁱٴ0.MTH1166()));
                try {
                    MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    mediaMetadataRetriever0.setDataSource(CLS69.MTH810(), uri0);
                    String s5 = mediaMetadataRetriever0.extractMetadata(9);
                    mediaMetadataRetriever0.release();
                    if(TextUtils.isEmpty(s5)) {
                        goto label_110;
                    }
                    else {
                        v1 = Long.parseLong(s5);
                    }
                    goto label_111;
                }
                catch(Throwable throwable2) {
                    CLS69.MTH797(throwable2);
                }
            label_110:
                v1 = 0L;
            label_111:
                String s6 = CLS34.MTH572(v1);
                String s7 = file0.getAbsolutePath();
                ᵎʻ0.FLD641.put(s7, s6);
            }
        }
        catch(Throwable throwable1) {
            throwable1.printStackTrace();
        }
        set0.remove(contentValues0);
        ᐧי0.MTH1174();
    }
}

