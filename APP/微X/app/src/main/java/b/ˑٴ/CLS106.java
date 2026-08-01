// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ˈˈ.CLS94;

public final class CLS106 implements SeekBar.OnSeekBarChangeListener {
    public final CLS881 FLD632;

    public CLS106(CLS881 ﾞˏ0) {
        this.FLD632 = ﾞˏ0;
        super();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        CLS94 ⁱˉ0 = this.FLD632.FLD1495;
        if(ⁱˉ0 != null) {
            ⁱˉ0.FLD402 = (int)(((double)v) / 100.0 * 254.0);
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

