// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.NumberPicker;

public final class CLS16 implements NumberPicker.OnValueChangeListener {
    public final double[] FLD64;

    public CLS16(double[] arr_f) {
        this.FLD64 = arr_f;
    }

    @Override  // android.widget.NumberPicker$OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker0, int v, int v1) {
        this.FLD64[0] = ((double)(v1 + 1)) * 10.0;
    }
}

