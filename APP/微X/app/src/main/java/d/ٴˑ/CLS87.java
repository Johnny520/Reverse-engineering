// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.SeekBar;
import d.ˑʽ.CLS43;
import d.יʻ.CLS173;
import d.יʻ.CLS69;
import java.lang.ref.WeakReference;

public final class CLS87 {
    public interface CLS86 {
        void MTH932(String arg1, int arg2);
    }

    public final boolean FLD431;
    public int FLD432;
    public int FLD433;
    public CLS90 FLD434;
    public SeekBar FLD435;
    public int FLD436;
    public SeekBar FLD437;
    public final WeakReference FLD438;
    public SeekBar FLD439;
    public View FLD440;
    public SeekBar FLD441;
    public int FLD442;
    public final String FLD443;
    public String FLD444;
    public final CLS86 FLD445;
    public CLS190 FLD446;

    public CLS87(Activity activity0, String s, String s1, CLS173 ᐧˈ0) {
        this.FLD438 = new WeakReference(activity0);
        this.FLD444 = s.trim();
        String s2 = s1.trim();
        this.FLD443 = s2;
        this.FLD445 = ᐧˈ0;
        try {
            if(TextUtils.isEmpty(this.FLD444)) {
                this.FLD444 = s2;
            }
            Color.parseColor((this.FLD444.startsWith("#") ? this.FLD444 : "#" + this.FLD444));
        }
        catch(Throwable throwable0) {
            CLS69.MTH809(this.FLD444);
            CLS69.MTH797(throwable0);
            this.FLD444 = s2;
        }
        this.FLD431 = false;
    }

    public final void MTH934(String s) {
        int v2;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        if(s.matches("-?[0-9a-fA-F]+")) {
            int v = CLS43.MTH643(s);
            if(this.FLD431) {
                this.FLD442 = Color.red(v);
                this.FLD433 = Color.green(v);
                this.FLD436 = Color.blue(v);
                int v1 = Color.alpha(v);
                this.FLD432 = v1;
                v2 = Color.argb(v1, this.FLD442, this.FLD433, this.FLD436);
                this.FLD439.setProgress(this.FLD432);
            }
            else {
                this.FLD442 = Color.red(v);
                this.FLD433 = Color.green(v);
                int v3 = Color.blue(v);
                this.FLD436 = v3;
                v2 = Color.rgb(this.FLD442, this.FLD433, v3);
            }
            this.FLD434.setColor(v2);
            this.FLD440.setBackgroundColor(v2);
            this.FLD441.setProgress(this.FLD442);
            this.FLD437.setProgress(this.FLD433);
            this.FLD435.setProgress(this.FLD436);
        }
    }

    public final void MTH935() {
        String s;
        int v;
        if(this.FLD431) {
            v = Color.argb(this.FLD432, this.FLD442, this.FLD433, this.FLD436);
            s = String.format("%02X%02X%02X%02X", this.FLD432, this.FLD442, this.FLD433, this.FLD436);
        }
        else {
            v = Color.rgb(this.FLD442, this.FLD433, this.FLD436);
            s = String.format("%02X%02X%02X", this.FLD442, this.FLD433, this.FLD436);
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        this.FLD434.setColor(v);
        this.FLD440.setBackgroundColor(v);
        this.FLD446.MTH1020(s);
    }
}

