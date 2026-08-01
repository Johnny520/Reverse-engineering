// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS76 implements SeekBar.OnSeekBarChangeListener {
    public final CLS87 FLD372;
    public final CLS184 FLD373;

    public CLS76(CLS87 ˏᐧ0, CLS184 י0) {
        this.FLD372 = ˏᐧ0;
        this.FLD373 = י0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD372.FLD432 = v;
        this.FLD373.MTH944(String.valueOf(v));
        this.FLD372.MTH935();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

