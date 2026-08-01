// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS158 implements SeekBar.OnSeekBarChangeListener {
    public final CLS340 FLD1098;
    public final CLS172 FLD1099;

    public CLS158(CLS172 ـˏ0, CLS340 ـﹳ0) {
        this.FLD1099 = ـˏ0;
        this.FLD1098 = ـﹳ0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD1099.FLD1212 = v;
        this.FLD1098.MTH2429(String.valueOf(v));
        this.FLD1099.MTH2420();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

