// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import b.ʾᵢ.CLS25.CLS24;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS570;
import b.ᵔʾ.CLS1229;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

public final class CLS55 {
    public final HashMap FLD176;
    public CLS24 FLD177;

    public CLS55() {
        this.FLD176 = new HashMap();
        CLS1229 ˆٴ0 = new CLS1229(7, this);
        CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
    }

    public final void MTH1252(String s) {
        CLS24 ˉᐧ$ˆٴ0 = this.FLD177;
        if(ˉᐧ$ˆٴ0 != null) {
            ˉᐧ$ˆٴ0.MTH853(s);
            return;
        }
        CLS25.MTH863(s);
    }

    public final Bitmap MTH1253(String s) {
        Bitmap bitmap0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        HashMap hashMap0 = this.FLD176;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap1 = (Bitmap)hashMap0.get(s);
            if(bitmap1 != null && !bitmap1.isRecycled()) {
                return bitmap1;
            }
        }
        CLS24 ˉᐧ$ˆٴ0 = this.FLD177;
        InputStream inputStream0 = ˉᐧ$ˆٴ0 == null ? CLS25.MTH867(2, s) : ˉᐧ$ˆٴ0.MTH857(s);
        if(inputStream0 != null) {
            bitmap0 = BitmapFactory.decodeStream(inputStream0);
            try {
                inputStream0.close();
            }
            catch(Exception exception0) {
                CLS27.MTH893(exception0);
            }
        }
        hashMap0.put(s, bitmap0);
        return bitmap0;
    }

    public final String MTH1254(String s) {
        File file0 = new File(CLS27.MTH900().getCacheDir(), s);
        if(!CLS31.MTH1001(file0)) {
            CLS24 ˉᐧ$ˆٴ0 = this.FLD177;
            CLS31.MTH1037((ˉᐧ$ˆٴ0 == null ? CLS25.MTH867(2, s) : ˉᐧ$ˆٴ0.MTH857(s)), file0);
            CLS31.MTH996(file0.getAbsolutePath());
        }
        return file0.getAbsolutePath();
    }

    public final String MTH1255(String s) {
        File file0 = new File(s);
        String s1 = CLS31.MTH979(("img_" + Long.toHexString(System.currentTimeMillis())), "png");
        try {
            if(CLS31.MTH990(file0, CLS25.MTH865(2, CLS31.MTH979(s1, "png"), "image/png"))) {
                CLS24 ˉᐧ$ˆٴ0 = this.FLD177;
                ˉᐧ$ˆٴ0.getClass();
                CLS570 ـﹳ0 = new CLS570(ˉᐧ$ˆٴ0, 1);
                CLS40.FLD157.MTH1124(((CLS39)ـﹳ0));
                return s1;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return "";
    }
}

