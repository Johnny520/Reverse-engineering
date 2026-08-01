// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS584;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS895;
import b.ⁱᵔ.CLS432;
import java.io.File;

public final class CLS771 implements CLS3 {
    public final int FLD1069;
    public final String FLD1070;
    public final CLS139 FLD1071;
    public final String FLD1072;

    public CLS771(CLS139 ﹶʼ0, String s, String s1, int v) {
        this.FLD1069 = v;
        this.FLD1071 = ﹶʼ0;
        this.FLD1070 = s;
        this.FLD1072 = s1;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD1070;
        String s1 = this.FLD1072;
        CLS139 ﹶʼ0 = this.FLD1071;
        switch(this.FLD1069) {
            case 0: {
                ﹶʼ0.getClass();
                String s2 = CLS31.MTH980();
                CLS432.MTH6184(s2, s, ((CLS3)new CLS771(ﹶʼ0, s2, s1, 5)));
                return;
            }
            case 1: {
                ﹶʼ0.getClass();
                String s3 = CLS31.MTH980();
                CLS432.MTH6184(s3, s, ((CLS3)new CLS771(ﹶʼ0, s3, s1, 6)));
                return;
            }
            case 2: {
                ﹶʼ0.getClass();
                String s4 = CLS31.MTH980();
                CLS432.MTH6184(s4, s, ((CLS3)new CLS771(ﹶʼ0, s4, s1, 7)));
                return;
            }
            case 3: {
                ﹶʼ0.getClass();
                String s5 = CLS31.MTH980();
                CLS432.MTH6184(s5, s, ((CLS3)new CLS771(ﹶʼ0, s5, s1, 8)));
                return;
            }
            case 4: {
                ﹶʼ0.getClass();
                CLS432.MTH6179(s, ((CLS12)new CLS584(ﹶʼ0, s1, 1)), null);
                return;
            }
            case 5: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3019(((CLS169)new CLS886(new File(s))), s1);
                return;
            }
            case 6: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3019(((CLS169)new CLS889(new File(s))), s1);
                return;
            }
            case 7: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3019(((CLS169)new CLS888(new File(s).getAbsolutePath())), s1);
                return;
            }
            default: {
                ﹶʼ0.getClass();
                ﹶʼ0.MTH3019(((CLS169)new CLS895(new File(s).getAbsolutePath())), s1);
            }
        }
    }
}

