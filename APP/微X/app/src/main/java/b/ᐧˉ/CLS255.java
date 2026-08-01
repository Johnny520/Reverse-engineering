// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS34;
import b.ﾞˎ.CLS1626;

public final class CLS255 implements View.OnClickListener {
    public final int FLD2646;
    public final CLS1626 FLD2647;
    public final CLS1173 FLD2648;
    public final String FLD2649;

    public CLS255(CLS1173 ᵢᵢ0, CLS1626 ـﹳ0, String s, int v) {
        this.FLD2646 = v;
        this.FLD2648 = ᵢᵢ0;
        this.FLD2647 = ـﹳ0;
        this.FLD2649 = s;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2649;
        CLS1626 ـﹳ0 = this.FLD2647;
        CLS1173 ᵢᵢ0 = this.FLD2648;
        switch(this.FLD2646) {
            case 0: {
                ᵢᵢ0.FLD2719 = ـﹳ0;
                String s2 = CLS34.MTH1079(4101056747445998389L, new StringBuilder(), s, 4101056794690638645L);
                ᵢᵢ0.FLD2721 = s2;
                ᵢᵢ0.MTH4447(1, s2);
                return;
            }
            case 1: {
                ᵢᵢ0.FLD2719 = ـﹳ0;
                String s3 = CLS34.MTH1079(4101055948582081333L, new StringBuilder(), s, 0x38E9E0B32B3CD335L);
                ᵢᵢ0.FLD2721 = s3;
                ᵢᵢ0.MTH4447(1, s3);
                return;
            }
            case 2: {
                ᵢᵢ0.FLD2719 = ـﹳ0;
                String s4 = CLS34.MTH1079(4101056249229792053L, new StringBuilder(), s, 0x38E9E0F92B3CD335L);
                ᵢᵢ0.FLD2721 = s4;
                ᵢᵢ0.MTH4447(1, s4);
                return;
            }
            default: {
                ᵢᵢ0.FLD2719 = ـﹳ0;
                String s1 = CLS34.MTH1079(4101055450365874997L, new StringBuilder(), s, 0x38E9E03F2B3CD335L);
                ᵢᵢ0.FLD2721 = s1;
                ᵢᵢ0.MTH4447(1, s1);
            }
        }
    }
}

