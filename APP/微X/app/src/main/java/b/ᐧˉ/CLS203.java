// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS34;

public final class CLS203 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1942;
    public final String FLD1943;
    public final CLS1173 FLD1944;

    public CLS203(CLS1173 ᵢᵢ0, String s, int v) {
        this.FLD1942 = v;
        this.FLD1944 = ᵢᵢ0;
        this.FLD1943 = s;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        String s = this.FLD1943;
        CLS1173 ᵢᵢ0 = this.FLD1944;
        switch(this.FLD1942) {
            case 0: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                String s2 = CLS182.MTH3475(0x38E9E4042B3CD335L, stringBuilder0);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s2);
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(s);
                String s3 = CLS182.MTH3475(4101060149060096821L, stringBuilder1);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s3);
                return;
            }
            case 2: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(s);
                String s4 = CLS182.MTH3475(4101060041685914421L, stringBuilder2);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s4);
                return;
            }
            case 3: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(s);
                String s5 = CLS182.MTH3475(4101060986578719541L, stringBuilder3);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s5);
                return;
            }
            case 4: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(s);
                String s6 = CLS182.MTH3475(4101060776125322037L, stringBuilder4);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s6);
                if(CLS1173.MTH4443() && (CLS182.MTH3480(4101060844844798773L, CLS182.MTH3483(s), ᵢᵢ0.FLD2151, false) || CLS182.MTH3480(4101060917859242805L, CLS182.MTH3483(s), ᵢᵢ0.FLD2151, false))) {
                    ᵢᵢ0.FLD2718.MTH801(0);
                    return;
                }
                ᵢᵢ0.FLD2718.MTH801(8);
                return;
            }
            case 5: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(s);
                String s7 = CLS182.MTH3475(4101061111132771125L, stringBuilder5);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s7);
                if(CLS1173.MTH4443() && (CLS182.MTH3480(4101061184147215157L, CLS182.MTH3483(s), ᵢᵢ0.FLD2151, false) || CLS182.MTH3480(4101061257161659189L, CLS182.MTH3483(s), ᵢᵢ0.FLD2151, false))) {
                    ᵢᵢ0.FLD2718.MTH801(0);
                    return;
                }
                ᵢᵢ0.FLD2718.MTH801(8);
                return;
            }
            case 6: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(s);
                String s8 = CLS182.MTH3475(4101061042413294389L, stringBuilder6);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s8);
                return;
            }
            case 7: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append(s);
                String s9 = CLS182.MTH3475(4101060406758134581L, stringBuilder7);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s9);
                return;
            }
            case 8: {
                ᵢᵢ0.getClass();
                StringBuilder stringBuilder8 = new StringBuilder();
                stringBuilder8.append(s);
                String s10 = CLS182.MTH3475(4101060204894671669L, stringBuilder8);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s10);
                return;
            }
            case 9: {
                ᵢᵢ0.getClass();
                String s11 = CLS34.MTH1079(4101056837640311605L, new StringBuilder(), s, 0x38E9E1022B3CD335L);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s11);
                return;
            }
            case 10: {
                ᵢᵢ0.getClass();
                String s12 = CLS34.MTH1079(4101056038776394549L, new StringBuilder(), s, 4101056635776848693L);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s12);
                return;
            }
            case 11: {
                ᵢᵢ0.getClass();
                String s13 = CLS34.MTH1079(0x38E9E0832B3CD335L, new StringBuilder(), s, 0x38E9E08E2B3CD335L);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s13);
                return;
            }
            default: {
                ᵢᵢ0.getClass();
                String s1 = CLS34.MTH1079(4101056090316002101L, new StringBuilder(), s, 4101056137560642357L);
                ᵢᵢ0.FLD2151.MTH922(Boolean.valueOf(z), s1);
            }
        }
    }
}

