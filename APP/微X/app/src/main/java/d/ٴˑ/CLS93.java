// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS93 implements SeekBar.OnSeekBarChangeListener {
    public final CLS87 FLD501;
    public final CLS184 FLD502;

    public CLS93(CLS87 ˏᐧ0, CLS184 י0) {
        this.FLD501 = ˏᐧ0;
        this.FLD502 = י0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD501.FLD436 = v;
        this.FLD502.MTH944(String.valueOf(v));
        this.FLD501.MTH935();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

