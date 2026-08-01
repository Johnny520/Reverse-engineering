// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS179 implements SeekBar.OnSeekBarChangeListener {
    public final CLS340 FLD1263;
    public final CLS172 FLD1264;

    public CLS179(CLS172 ـˏ0, CLS340 ـﹳ0) {
        this.FLD1264 = ـˏ0;
        this.FLD1263 = ـﹳ0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD1264.FLD1216 = v;
        this.FLD1263.MTH2429(String.valueOf(v));
        this.FLD1264.MTH2420();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

