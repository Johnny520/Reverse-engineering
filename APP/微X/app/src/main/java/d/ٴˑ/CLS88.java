// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;

public final class CLS88 implements SeekBar.OnSeekBarChangeListener {
    public final CLS87 FLD447;
    public final CLS184 FLD448;

    public CLS88(CLS87 ˏᐧ0, CLS184 י0) {
        this.FLD447 = ˏᐧ0;
        this.FLD448 = י0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        this.FLD447.FLD442 = v;
        this.FLD448.MTH944(String.valueOf(v));
        this.FLD447.MTH935();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

