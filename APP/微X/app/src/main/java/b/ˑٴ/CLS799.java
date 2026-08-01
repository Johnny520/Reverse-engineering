// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS59;
import b.ˈˈ.CLS94;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS518;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS534.CLS533;
import b.ﾞˎ.CLS556.CLS555;
import java.io.File;

public final class CLS799 implements CLS39, CLS440, CLS533, CLS539, CLS555 {
    public final int FLD1181;
    public final CLS881 FLD1182;

    public CLS799(CLS881 ﾞˏ0, int v) {
        this.FLD1181 = v;
        this.FLD1182 = ﾞˏ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS881 ﾞˏ0 = this.FLD1182;
        Bitmap bitmap0 = ﾞˏ0.FLD1509;
        if(bitmap0 != null) {
            Bitmap bitmap1 = CLS518.MTH7057(bitmap0, ﾞˏ0.FLD1495);
            ﾞˏ0.FLD1496.setImageBitmap(bitmap1);
        }
    }

    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS881 ﾞˏ0 = this.FLD1182;
        if(this.FLD1181 == 2) {
            ﾞˏ0.FLD1495.FLD401 = s;
            return;
        }
        ﾞˏ0.getClass();
        try {
            CLS94 ⁱˉ0 = ﾞˏ0.FLD1495;
            ⁱˉ0.FLD403 = Integer.parseInt(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        CLS881 ﾞˏ0 = this.FLD1182;
        switch(this.FLD1181) {
            case 1: {
                ﾞˏ0.getClass();
                if(file0.isFile()) {
                    String s1 = file0.getAbsolutePath();
                    ﾞˏ0.FLD1498 = s1;
                    ﾞˏ0.FLD1490.MTH798(s1);
                }
                return;
            }
            case 4: {
                ﾞˏ0.getClass();
                if(file0.isFile()) {
                    String s2 = file0.getAbsolutePath();
                    ﾞˏ0.FLD1488 = s2;
                    if(!TextUtils.isEmpty(s2)) {
                        WebView webView0 = ﾞˏ0.FLD1515;
                        if(webView0 != null) {
                            webView0.loadUrl("file://" + ﾞˏ0.FLD1488);
                        }
                        Object object0 = ﾞˏ0.FLD1513;
                        if(object0 != null) {
                            CLS166.MTH3195(object0, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{ﾞˏ0.FLD1488});
                        }
                    }
                }
                return;
            }
            default: {
                ﾞˏ0.getClass();
                if(file0.isFile()) {
                    String s = file0.getAbsolutePath();
                    Bitmap bitmap0 = CLS518.MTH7060(s);
                    ﾞˏ0.FLD1497.setImageBitmap(CLS518.MTH7074(0x200, 0x200, s));
                    CLS518.MTH7058(CLS59.FLD183.MTH1286(ﾞˏ0.FLD1495), bitmap0);
                }
            }
        }
    }

    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        CLS881 ﾞˏ0 = this.FLD1182;
        CLS94 ⁱˉ0 = ﾞˏ0.FLD1500.MTH1283(s);
        if(ⁱˉ0 != null) {
            ﾞˏ0.FLD1495 = ⁱˉ0;
        }
        CLS94 ⁱˉ1 = ﾞˏ0.FLD1495;
        if(ⁱˉ1 != null) {
            Bitmap bitmap0 = CLS59.MTH1284(ⁱˉ1);
            if(bitmap0 != null) {
                ﾞˏ0.FLD1497.setImageBitmap(bitmap0);
            }
            ﾞˏ0.FLD1489.setProgress(((int)(((double)ﾞˏ0.FLD1495.FLD402) / 254.0 * 100.0)));
            ﾞˏ0.FLD1505.MTH7277(ﾞˏ0.FLD1495.FLD401);
            ﾞˏ0.FLD1516.MTH7277(String.valueOf(ﾞˏ0.FLD1495.FLD403));
            ﾞˏ0.MTH3109();
            ﾞˏ0.MTH3112();
        }
    }

    @Override  // b.ﾞˎ.CLS556$CLS555
    public final void MTH7428(int v, String s) {
        this.FLD1182.getClass();
        this.FLD1182.FLD1495.FLD400 = v;
    }
}

