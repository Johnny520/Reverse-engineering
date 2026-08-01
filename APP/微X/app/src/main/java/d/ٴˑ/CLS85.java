// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS85 implements SeekBar.OnSeekBarChangeListener {
    public final CLS87 FLD429;
    public final CLS184 FLD430;

    public CLS85(CLS87 ˏᐧ0, CLS184 י0) {
        this.FLD429 = ˏᐧ0;
        this.FLD430 = י0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD429.FLD433 = v;
        this.FLD430.MTH944(String.valueOf(v));
        this.FLD429.MTH935();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

