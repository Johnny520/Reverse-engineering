// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS164 implements SeekBar.OnSeekBarChangeListener {
    public final CLS340 FLD1131;
    public final CLS172 FLD1132;

    public CLS164(CLS172 ـˏ0, CLS340 ـﹳ0) {
        this.FLD1132 = ـˏ0;
        this.FLD1131 = ـﹳ0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD1132.FLD1218 = v;
        this.FLD1131.MTH2429(String.valueOf(v));
        this.FLD1132.MTH2420();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

