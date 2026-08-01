// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS256 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2667;
    public final Object FLD2668;
    public final Object FLD2669;
    public final Object FLD2670;
    public final Object FLD2671;
    public final Object FLD2672;

    public CLS256(MediaPlayer mediaPlayer0, boolean[] arr_z, ImageButton imageButton0, ImageButton imageButton1, Runnable[] arr_runnable) {
        this.FLD2667 = 1;
        super();
        this.FLD2670 = mediaPlayer0;
        this.FLD2669 = arr_z;
        this.FLD2671 = imageButton0;
        this.FLD2668 = imageButton1;
        this.FLD2672 = arr_runnable;
    }

    public CLS256(CLS1626 ـﹳ0, CLS1626 ـﹳ1, CLS1622 ˑٴ0, CLS1626 ـﹳ2, ArrayList arrayList0) {
        this.FLD2667 = 0;
        super();
        this.FLD2670 = ـﹳ0;
        this.FLD2669 = ـﹳ1;
        this.FLD2668 = ˑٴ0;
        this.FLD2671 = ـﹳ2;
        this.FLD2672 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        Object object0 = this.FLD2672;
        Object object1 = this.FLD2671;
        Object object2 = this.FLD2668;
        Object object3 = this.FLD2669;
        Object object4 = this.FLD2670;
        if(this.FLD2667 == 0) {
            CLS1626 ـﹳ0 = (CLS1626)object4;
            CLS1626 ـﹳ1 = (CLS1626)object3;
            CLS1622 ˑٴ0 = (CLS1622)object2;
            CLS1626 ـﹳ2 = (CLS1626)object1;
            ArrayList arrayList0 = (ArrayList)object0;
            try {
                CLS523.MTH7157(!z, new CLS18[]{ـﹳ0, ـﹳ1, ˑٴ0});
                CLS523.MTH7157(z, new CLS18[]{ـﹳ2});
                String[] arr_s = ((String)arrayList0.get(2)).split("_");
                arr_s[3] = z ? "t" : "f";
                arrayList0.set(2, TextUtils.join("_", arr_s));
                ˑٴ0.MTH798((z ? String.format(CLS27.MTH889("timestring_repeat_interval"), arr_s[0], arr_s[1], arr_s[2]) : ""));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        MediaPlayer mediaPlayer0 = (MediaPlayer)object4;
        boolean[] arr_z = (boolean[])object3;
        ImageButton imageButton0 = (ImageButton)object1;
        ImageButton imageButton1 = (ImageButton)object2;
        Runnable[] arr_runnable = (Runnable[])object0;
        try {
            if(Build.VERSION.SDK_INT >= 23) {
                mediaPlayer0.setPlaybackParams(mediaPlayer0.getPlaybackParams().setSpeed((z ? 2.0f : 1.0f)));
            }
            if(arr_z[0]) {
                CLS476.FLD4664 = false;
                imageButton0.setVisibility(0);
                imageButton1.setVisibility(8);
                CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

