// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ﾞٴ.CLS322;

public final class CLS18 implements SeekBar.OnSeekBarChangeListener {
    public final JSONObject FLD241;
    public final CLS143 FLD242;

    public CLS18(JSONObject jSONObject0, CLS322 ٴـ0) {
        this.FLD241 = jSONObject0;
        this.FLD242 = ٴـ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        try {
            this.FLD241.put("b", v);
            this.FLD242.MTH2169();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
    }
}

