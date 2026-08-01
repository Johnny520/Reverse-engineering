// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ﾞˎ.CLS1616.CLS524;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS999 implements CLS524, CLS538, CLS539 {
    public final int FLD2030;
    public final String FLD2031;
    public final CLS1105 FLD2032;

    public CLS999(CLS1105 ᐧˈ0, String s, int v) {
        this.FLD2030 = v;
        this.FLD2032 = ᐧˈ0;
        this.FLD2031 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v = 0;
        String s1 = this.FLD2031;
        CLS1105 ᐧˈ0 = this.FLD2032;
        switch(this.FLD2030) {
            case 1: {
                ᐧˈ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s3 = CLS182.MTH3475(4100576930879558453L, CLS182.MTH3483(s1));
                    ᐧˈ0.FLD2151.MTH922(s, s3);
                }
                return;
            }
            case 2: {
                String s4 = CLS182.MTH3475(4100580083385553717L, CLS182.MTH3491(ᐧˈ0, s1));
                ᐧˈ0.FLD2151.MTH922(s, s4);
                return;
            }
            case 3: {
                ᐧˈ0.getClass();
                try {
                    v = (int)(Double.parseDouble(s) * 100.0);
                }
                catch(Throwable unused_ex) {
                }
                String s5 = CLS182.MTH3475(4100579379010917173L, CLS182.MTH3483(s1));
                ᐧˈ0.FLD2151.MTH922(v, s5);
                return;
            }
            case 5: {
                String s6 = CLS182.MTH3475(4100567477656539957L, CLS182.MTH3491(ᐧˈ0, s1));
                ᐧˈ0.FLD2151.MTH922(s, s6);
                return;
            }
            case 6: {
                String s7 = CLS182.MTH3475(4100567378872292149L, CLS182.MTH3491(ᐧˈ0, s1));
                ᐧˈ0.FLD2151.MTH922(s, s7);
                return;
            }
            default: {
                String s2 = CLS182.MTH3475(4100575805598126901L, CLS182.MTH3491(ᐧˈ0, s1));
                CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
                if(ˎᵢ0.MTH938(s2, false)) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append("red_packet_filter_onlyopen_text");
                    ˎᵢ0.MTH922(s, stringBuilder0.toString());
                    CLS21.FLD76.MTH818("rp_update_filter_onlyopen", new Object[0]);
                    return;
                }
                if(CLS182.MTH3480(4100571824163443509L, CLS182.MTH3483(s1), ˎᵢ0, false)) {
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
                    stringBuilder1.append("red_packet_filter_text");
                    ˎᵢ0.MTH922(s, stringBuilder1.toString());
                    CLS21.FLD76.MTH818("rp_update_filter_notopen", new Object[0]);
                }
            }
        }
    }

    @Override  // b.ﾞˎ.CLS1616$CLS524
    public final void MTH7175(long v, long v1) {
        this.FLD2032.getClass();
        String s = CLS34.MTH1074(new StringBuilder(), this.FLD2031, 4100577381851124533L);
        this.FLD2032.FLD2151.MTH922(((int)v), s);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.FLD2031);
        String s1 = CLS182.MTH3475(4100576948059427637L, stringBuilder0);
        this.FLD2032.FLD2151.MTH922(((int)v1), s1);
    }

    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        this.FLD2032.getClass();
        String s = CLS34.MTH1074(new StringBuilder(), this.FLD2031, 4100577064023544629L);
        this.FLD2032.FLD2151.MTH922(((int)v), s);
    }
}

