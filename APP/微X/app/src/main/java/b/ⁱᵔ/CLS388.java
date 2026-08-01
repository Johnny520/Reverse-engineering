// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;
import b.ﾞˎ.CLS1626;

public final class CLS388 implements View.OnClickListener {
    public final int FLD3655;
    public final CLS1626 FLD3656;
    public final MediaPlayer FLD3657;

    public CLS388(MediaPlayer mediaPlayer0, CLS1626 ـﹳ0, int v) {
        this.FLD3655 = v;
        this.FLD3657 = mediaPlayer0;
        this.FLD3656 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD3656;
        MediaPlayer mediaPlayer0 = this.FLD3657;
        switch(this.FLD3655) {
            case 0: {
                CLS476.FLD4663 = mediaPlayer0.getCurrentPosition();
                if(CLS476.FLD4665 == 0) {
                    CLS476.FLD4665 = mediaPlayer0.getDuration();
                }
                ـﹳ0.MTH7325("00:00");
                return;
            }
            case 1: {
                int v1 = mediaPlayer0.getCurrentPosition();
                if(v1 > CLS476.FLD4663) {
                    CLS476.FLD4665 = v1;
                }
                ـﹳ0.MTH7325("00:00");
                return;
            }
            case 2: {
                CLS476.FLD4663 = mediaPlayer0.getCurrentPosition();
                if(CLS476.FLD4665 == 0) {
                    CLS476.FLD4665 = mediaPlayer0.getDuration();
                }
                ـﹳ0.MTH7325("00:00");
                return;
            }
            case 3: {
                int v2 = mediaPlayer0.getCurrentPosition();
                if(v2 > CLS476.FLD4663) {
                    CLS476.FLD4665 = v2;
                }
                ـﹳ0.MTH7325("00:00");
                return;
            }
            case 4: {
                CLS462.FLD4511 = mediaPlayer0.getCurrentPosition();
                if(CLS462.FLD4513 == 0) {
                    CLS462.FLD4513 = mediaPlayer0.getDuration();
                }
                ـﹳ0.MTH7325("00:00");
                return;
            }
            default: {
                int v = mediaPlayer0.getCurrentPosition();
                if(v > CLS462.FLD4511) {
                    CLS462.FLD4513 = v;
                }
                ـﹳ0.MTH7325("00:00");
            }
        }
    }
}

