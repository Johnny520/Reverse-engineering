// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS556 {
    public interface CLS555 {
        void MTH7428(int arg1, String arg2);
    }

    public int FLD5407;
    public SeekBar FLD5408;
    public SeekBar FLD5409;
    public final String FLD5410;
    public int FLD5411;
    public SeekBar FLD5412;
    public View FLD5413;
    public CLS544 FLD5414;
    public int FLD5415;
    public final CLS555 FLD5416;
    public int FLD5417;
    public final WeakReference FLD5418;
    public String FLD5419;
    public final boolean FLD5420;
    public SeekBar FLD5421;
    public CLS1622 FLD5422;

    // 此方法包含解密的字符串
    public CLS556(Activity activity0, String s, String s1, CLS555 ﾞٴ$ﾞᐧ0, boolean z) {
        this.FLD5418 = new WeakReference(activity0);
        this.FLD5419 = s.trim();
        String s2 = s1.trim();
        this.FLD5410 = s2;
        this.FLD5416 = ﾞٴ$ﾞᐧ0;
        try {
            if(TextUtils.isEmpty(this.FLD5419)) {
                this.FLD5419 = s2;
            }
            Color.parseColor((this.FLD5419.startsWith("#") ? this.FLD5419 : "#" + this.FLD5419));
        }
        catch(Throwable throwable0) {
            CLS27.MTH906(this.FLD5419);
            CLS27.MTH893(throwable0);
            this.FLD5419 = s2;
        }
        this.FLD5420 = z;
    }

    // 此方法包含解密的字符串
    public final void MTH7430() {
        String s;
        int v;
        if(this.FLD5420) {
            v = Color.argb(this.FLD5415, this.FLD5407, this.FLD5411, this.FLD5417);
            s = String.format("%02X%02X%02X%02X", this.FLD5415, this.FLD5407, this.FLD5411, this.FLD5417);
        }
        else {
            v = Color.rgb(this.FLD5407, this.FLD5411, this.FLD5417);
            s = String.format("%02X%02X%02X", this.FLD5407, this.FLD5411, this.FLD5417);
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        this.FLD5414.setColor(v);
        this.FLD5413.setBackgroundColor(v);
        this.FLD5422.MTH7277(s);
    }

    // 此方法包含解密的字符串
    public final void MTH7431(String s) {
        int v2;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.startsWith("#")) {
            s = s.substring(1);
        }
        if(s.matches("-?[0-9a-fA-F]+")) {
            int v = CLS522.MTH7110(s);
            if(this.FLD5420) {
                this.FLD5407 = Color.red(v);
                this.FLD5411 = Color.green(v);
                this.FLD5417 = Color.blue(v);
                int v1 = Color.alpha(v);
                this.FLD5415 = v1;
                v2 = Color.argb(v1, this.FLD5407, this.FLD5411, this.FLD5417);
                this.FLD5412.setProgress(this.FLD5415);
            }
            else {
                this.FLD5407 = Color.red(v);
                this.FLD5411 = Color.green(v);
                int v3 = Color.blue(v);
                this.FLD5417 = v3;
                v2 = Color.rgb(this.FLD5407, this.FLD5411, v3);
            }
            this.FLD5414.setColor(v2);
            this.FLD5413.setBackgroundColor(v2);
            this.FLD5421.setProgress(this.FLD5407);
            this.FLD5408.setProgress(this.FLD5411);
            this.FLD5409.setProgress(this.FLD5417);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH7432() {
        public final class CLS551 implements SeekBar.OnSeekBarChangeListener {
            public final CLS1628 FLD5399;
            public final CLS556 FLD5400;

            public CLS551(CLS1628 ᐧי0) {
                this.FLD5399 = ᐧי0;
                super();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                CLS556.this.FLD5415 = v;
                this.FLD5399.MTH7345(String.valueOf(v));
                CLS556.this.MTH7430();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }


        public final class CLS552 implements SeekBar.OnSeekBarChangeListener {
            public final CLS1628 FLD5401;
            public final CLS556 FLD5402;

            public CLS552(CLS1628 ᐧי0) {
                this.FLD5401 = ᐧי0;
                super();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                CLS556.this.FLD5411 = v;
                this.FLD5401.MTH7345(String.valueOf(v));
                CLS556.this.MTH7430();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }


        public final class CLS553 implements SeekBar.OnSeekBarChangeListener {
            public final CLS1628 FLD5403;
            public final CLS556 FLD5404;

            public CLS553(CLS1628 ᐧי0) {
                this.FLD5403 = ᐧי0;
                super();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                CLS556.this.FLD5407 = v;
                this.FLD5403.MTH7345(String.valueOf(v));
                CLS556.this.MTH7430();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }


        public final class CLS554 implements SeekBar.OnSeekBarChangeListener {
            public final CLS1628 FLD5405;
            public final CLS556 FLD5406;

            public CLS554(CLS1628 ᐧי0) {
                this.FLD5405 = ᐧי0;
                super();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                CLS556.this.FLD5417 = v;
                this.FLD5405.MTH7345(String.valueOf(v));
                CLS556.this.MTH7430();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }


        public final class CLS1633 implements CLS11 {
            public final CLS556 FLD5398;

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                int v = CLS556.this.FLD5420 ? Color.argb(CLS556.this.FLD5415, CLS556.this.FLD5407, CLS556.this.FLD5411, CLS556.this.FLD5417) : Color.rgb(CLS556.this.FLD5407, CLS556.this.FLD5411, CLS556.this.FLD5417);
                String s = CLS556.this.FLD5422.MTH7285();
                CLS556.this.FLD5416.MTH7428(v, s);
            }
        }

        Activity activity0 = (Activity)this.FLD5418.get();
        CLS523.MTH7160(activity0, CLS27.MTH889("select_color"), ((CLS17)new CLS1255(this, activity0, 11)), ((CLS11)new CLS1633(this)));
    }
}

