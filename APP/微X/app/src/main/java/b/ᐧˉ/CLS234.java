// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS34;

public final class CLS234 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2324;
    public final String FLD2325;
    public final CLS1030 FLD2326;

    public CLS234(CLS1030 ˎᵢ0, String s, int v) {
        this.FLD2324 = v;
        this.FLD2326 = ˎᵢ0;
        this.FLD2325 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        String s = this.FLD2325;
        CLS1030 ˎᵢ0 = this.FLD2326;
        switch(this.FLD2324) {
            case 0: {
                String s2 = CLS182.MTH3475(4100980700755055413L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s2);
                return;
            }
            case 1: {
                String s3 = CLS182.MTH3475(4100980464531854133L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s3);
                return;
            }
            case 2: {
                String s4 = CLS182.MTH3475(4100980833899041589L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s4);
                return;
            }
            case 3: {
                String s5 = CLS182.MTH3475(4100982423036941109L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s5);
                return;
            }
            case 4: {
                ˎᵢ0.getClass();
                String s6 = CLS34.MTH1074(new StringBuilder(), (TextUtils.isEmpty(s) ? "" : CLS182.MTH3475(0x38E99FB42B3CD335L, CLS182.MTH3483(s))), 4100984540455818037L);
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s6);
                return;
            }
            case 5: {
                ˎᵢ0.getClass();
                String s7 = CLS34.MTH1074(new StringBuilder(), (TextUtils.isEmpty(s) ? "" : CLS182.MTH3475(4100984424491701045L, CLS182.MTH3483(s))), 4100984433081635637L);
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s7);
                return;
            }
            case 6: {
                String s8 = CLS182.MTH3475(0x38E99FF82B3CD335L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s8);
                return;
            }
            case 7: {
                String s9 = CLS182.MTH3475(0x38E99FC22B3CD335L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s9);
                return;
            }
            case 8: {
                String s10 = CLS182.MTH3475(4100983806016410421L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s10);
                return;
            }
            case 9: {
                String s11 = CLS182.MTH3475(4100984119549023029L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s11);
                return;
            }
            case 10: {
                String s12 = CLS182.MTH3475(4100983299210269493L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s12);
                return;
            }
            case 11: {
                String s13 = CLS182.MTH3475(4100983544023405365L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s13);
                return;
            }
            case 12: {
                String s14 = CLS182.MTH3475(4100982732274586421L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s14);
                return;
            }
            case 13: {
                String s15 = CLS182.MTH3475(4100981710072369973L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s15);
                return;
            }
            case 14: {
                String s16 = CLS182.MTH3475(4100981671417664309L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s16);
                return;
            }
            case 15: {
                String s17 = CLS182.MTH3475(4100982079439557429L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s17);
                return;
            }
            case 16: {
                String s18 = CLS182.MTH3475(4100981160316556085L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s18);
                return;
            }
            default: {
                String s1 = CLS182.MTH3475(4100973038533399349L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s1);
            }
        }
    }
}

