// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ˆٴ.CLS66;

public final class CLS109 implements Runnable {
    public final ContentValues FLD678;
    public final int FLD679;
    public final int FLD680;
    public final String FLD681;
    public final CLS786 FLD682;
    public final int FLD683;
    public final String FLD684;
    public final String FLD685;

    public CLS109(CLS786 ᐧᵢ0, String s, int v, int v1, String s1, String s2, ContentValues contentValues0) {
        this.FLD679 = 1;
        super();
        this.FLD682 = ᐧᵢ0;
        this.FLD681 = s;
        this.FLD683 = v;
        this.FLD680 = v1;
        this.FLD685 = s1;
        this.FLD684 = s2;
        this.FLD678 = contentValues0;
    }

    public CLS109(CLS786 ᐧᵢ0, String s, ContentValues contentValues0, int v, int v1, String s1, String s2) {
        this.FLD679 = 0;
        super();
        this.FLD682 = ᐧᵢ0;
        this.FLD681 = s;
        this.FLD678 = contentValues0;
        this.FLD683 = v;
        this.FLD680 = v1;
        this.FLD685 = s1;
        this.FLD684 = s2;
    }

    @Override
    public final void run() {
        if(this.FLD679 == 0) {
            CLS786 ᐧᵢ0 = this.FLD682;
            String s = this.FLD681;
            ᐧᵢ0.FLD1126.put(s, this.FLD678);
            int v = this.FLD680;
            String s1 = this.FLD685;
            String s2 = this.FLD684;
            if(this.FLD683 == 1005) {
                CLS66.MTH1402(v, s, s1);
            }
            else {
                CLS66.MTH1409(v, s, s1, s2);
            }
            ᐧᵢ0.MTH2656(s2);
            return;
        }
        this.FLD682.MTH2653(this.FLD683, this.FLD680, this.FLD678, this.FLD681, this.FLD685, this.FLD684);
    }
}

