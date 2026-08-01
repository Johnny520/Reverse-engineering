// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.SeekBar;
import java.lang.ref.WeakReference;
import t.ˆʿ.CLS46;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS304;

public final class CLS172 {
    public interface CLS171 {
        void MTH2418(int arg1, String arg2);
    }

    public int FLD1208;
    public SeekBar FLD1209;
    public SeekBar FLD1210;
    public final String FLD1211;
    public int FLD1212;
    public SeekBar FLD1213;
    public View FLD1214;
    public CLS174 FLD1215;
    public int FLD1216;
    public final CLS171 FLD1217;
    public int FLD1218;
    public final WeakReference FLD1219;
    public String FLD1220;
    public final boolean FLD1221;
    public SeekBar FLD1222;
    public CLS339 FLD1223;

    // 此方法包含解密的字符串
    public CLS172(Activity activity0, String s, String s1, CLS304 ﾞᐧ0, boolean z) {
        this.FLD1219 = new WeakReference(activity0);
        this.FLD1220 = s.trim();
        String s2 = s1.trim();
        this.FLD1211 = s2;
        this.FLD1217 = ﾞᐧ0;
        try {
            if(TextUtils.isEmpty(this.FLD1220)) {
                this.FLD1220 = s2;
            }
            Color.parseColor((this.FLD1220.startsWith("#") ? this.FLD1220 : "#" + this.FLD1220));
        }
        catch(Throwable throwable0) {
            CLS133.MTH2109(this.FLD1220);
            CLS133.MTH2113(throwable0);
            this.FLD1220 = s2;
        }
        this.FLD1221 = z;
    }

    // 此方法包含解密的字符串
    public final void MTH2420() {
        String s;
        int v;
        if(this.FLD1221) {
            v = Color.argb(this.FLD1216, this.FLD1208, this.FLD1212, this.FLD1218);
            s = String.format("%02X%02X%02X%02X", this.FLD1216, this.FLD1208, this.FLD1212, this.FLD1218);
        }
        else {
            v = Color.rgb(this.FLD1208, this.FLD1212, this.FLD1218);
            s = String.format("%02X%02X%02X", this.FLD1208, this.FLD1212, this.FLD1218);
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        this.FLD1215.setColor(v);
        this.FLD1214.setBackgroundColor(v);
        this.FLD1223.MTH2409(s);
    }

    // 此方法包含解密的字符串
    public final void MTH2421(String s) {
        int v2;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        if(s.matches("-?[0-9a-fA-F]+")) {
            int v = CLS46.MTH1447(s);
            if(this.FLD1221) {
                this.FLD1208 = Color.red(v);
                this.FLD1212 = Color.green(v);
                this.FLD1218 = Color.blue(v);
                int v1 = Color.alpha(v);
                this.FLD1216 = v1;
                v2 = Color.argb(v1, this.FLD1208, this.FLD1212, this.FLD1218);
                this.FLD1213.setProgress(this.FLD1216);
            }
            else {
                this.FLD1208 = Color.red(v);
                this.FLD1212 = Color.green(v);
                int v3 = Color.blue(v);
                this.FLD1218 = v3;
                v2 = Color.rgb(this.FLD1208, this.FLD1212, v3);
            }
            this.FLD1215.setColor(v2);
            this.FLD1214.setBackgroundColor(v2);
            this.FLD1222.setProgress(this.FLD1208);
            this.FLD1209.setProgress(this.FLD1212);
            this.FLD1210.setProgress(this.FLD1218);
        }
    }
}

