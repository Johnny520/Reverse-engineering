// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.util.Arrays;
import javax.annotation.Nullable;
import p.pkg7.CLS37;
import p.pkg9.CLS60.CLS59;
import p.pkg9.CLS60;

public final class CLS11 {
    public final CLS85 FLD47;
    public static final int[] FLD48;
    @Nullable
    public CLS12 FLD49;
    public final CLS89 FLD50;
    @Nullable
    public String FLD51;
    public boolean FLD52;
    public int FLD53;
    public final CLS88 FLD54;
    public final CLS199 FLD55;
    public final CLS201 FLD56;
    public static final char[] FLD57;
    public final CLS13 FLD58;
    public final int[] FLD59;
    @Nullable
    public String FLD60;
    public CLS87 FLD61;
    public final StringBuilder FLD62;
    public final int[] FLD63;
    @Nullable
    public String FLD64;
    public CLS14 FLD65;
    public final StringBuilder FLD66;
    public final CLS10 FLD67;

    static {
        char[] arr_c = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        CLS11.FLD57 = arr_c;
        CLS11.FLD48 = new int[]{0x20AC, 0x81, 0x201A, 402, 0x201E, 8230, 0x2020, 0x2021, 710, 0x2030, 0x160, 0x2039, 338, 0x8D, 381, 0x8F, 0x90, 0x2018, 0x2019, 8220, 0x201D, 0x2022, 0x2013, 0x2014, 732, 8482, 353, 8250, 339, 0x9D, 382, 376};
        Arrays.sort(arr_c);
    }

    public CLS11(CLS13 ٴʼ0, CLS10 ˎᵔ0) {
        this.FLD65 = CLS14.FLD146;
        this.FLD49 = null;
        this.FLD52 = false;
        this.FLD51 = null;
        this.FLD66 = new StringBuilder(0x400);
        this.FLD62 = new StringBuilder(0x400);
        CLS201 יٴ$ﾞˈ0 = new CLS201();
        this.FLD56 = יٴ$ﾞˈ0;
        this.FLD55 = new CLS199();
        this.FLD61 = יٴ$ﾞˈ0;
        this.FLD50 = new CLS89();
        this.FLD47 = new CLS85();
        this.FLD54 = new CLS88();
        this.FLD53 = -1;
        this.FLD59 = new int[1];
        this.FLD63 = new int[2];
        this.FLD58 = ٴʼ0;
        this.FLD67 = ˎᵔ0;
    }

    public final void MTH456(CLS14 ᐧᴵ0) {
        CLS10 ˎᵔ0 = this.FLD67;
        if(ˎᵔ0.MTH453()) {
            Object[] arr_object = {Character.valueOf(this.FLD58.MTH520()), ᐧᴵ0};
            ˎᵔ0.add(new CLS7(this.FLD58, "Unexpected character \'%s\' in input state [%s]", arr_object));
        }
    }

    public final void MTH457() {
        CLS12.MTH511(this.FLD62);
    }

    public final void MTH458(CLS14 ᐧᴵ0) {
        CLS10 ˎᵔ0 = this.FLD67;
        if(ˎᵔ0.MTH453()) {
            ˎᵔ0.add(new CLS7(this.FLD58, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{ᐧᴵ0}));
        }
    }

    public final void MTH459(String s) {
        if(this.FLD51 == null) {
            this.FLD51 = s;
        }
        else {
            StringBuilder stringBuilder0 = this.FLD66;
            if(stringBuilder0.length() == 0) {
                stringBuilder0.append(this.FLD51);
            }
            stringBuilder0.append(s);
        }
        this.FLD50.getClass();
    }

    public final void MTH460(char c) {
        if(this.FLD51 == null) {
            this.FLD51 = String.valueOf(c);
        }
        else {
            StringBuilder stringBuilder0 = this.FLD66;
            if(stringBuilder0.length() == 0) {
                stringBuilder0.append(this.FLD51);
            }
            stringBuilder0.append(c);
        }
        this.FLD50.getClass();
    }

    public final boolean MTH461() {
        return this.FLD60 != null && this.FLD61.MTH486().equalsIgnoreCase(this.FLD60);
    }

    public final void MTH462() {
        this.MTH467(((CLS12)this.FLD47));
    }

    public final void MTH463() {
        this.MTH467(((CLS12)this.FLD54));
    }

    public final void MTH464(String s, Object[] arr_object) {
        CLS10 ˎᵔ0 = this.FLD67;
        if(ˎᵔ0.MTH453()) {
            ˎᵔ0.add(new CLS7(this.FLD58, String.format(("Invalid character reference: " + s), arr_object)));
        }
    }

    public final void MTH465(CLS14 ᐧᴵ0) {
        CLS13 ٴʼ0 = this.FLD58;
        if(ᐧᴵ0.ordinal() == 0 && this.FLD53 == -1) {
            this.FLD53 = ٴʼ0.FLD91 + ٴʼ0.FLD92;
        }
        this.FLD65 = ᐧᴵ0;
    }

    public final void MTH466() {
        CLS87 יٴ$ᴵᐧ0 = this.FLD61;
        if(יٴ$ᴵᐧ0.FLD75) {
            יٴ$ᴵᐧ0.MTH492();
        }
        this.MTH467(((CLS12)this.FLD61));
    }

    public final void MTH467(CLS12 יٴ0) {
        if(this.FLD52) {
            throw new CLS37("Must be false");
        }
        this.FLD49 = יٴ0;
        this.FLD52 = true;
        יٴ0.getClass();
        CLS13 ٴʼ0 = this.FLD58;
        this.FLD53 = -1;
        int v = יٴ0.FLD87;
        if(v == 2) {
            this.FLD60 = ((CLS201)יٴ0).FLD83;
            this.FLD64 = null;
            return;
        }
        if(v == 3 && ((CLS87)(((CLS199)יٴ0))).MTH482()) {
            Object[] arr_object = {((CLS199)יٴ0).FLD81};
            CLS10 ˎᵔ0 = this.FLD67;
            if(ˎᵔ0.MTH453()) {
                ˎᵔ0.add(new CLS7(ٴʼ0, "Attributes incorrectly present on end tag [/%s]", arr_object));
            }
        }
    }

    public final CLS87 MTH468(boolean z) {
        CLS87 יٴ$ᴵᐧ0;
        if(z) {
            יٴ$ᴵᐧ0 = this.FLD56;
            ((CLS201)יٴ$ᴵᐧ0).MTH485();
        }
        else {
            יٴ$ᴵᐧ0 = this.FLD55;
            יٴ$ᴵᐧ0.MTH485();
        }
        this.FLD61 = יٴ$ᴵᐧ0;
        return יٴ$ᴵᐧ0;
    }

    public final void MTH469(StringBuilder stringBuilder0) {
        if(this.FLD51 == null) {
            this.FLD51 = stringBuilder0.toString();
        }
        else {
            StringBuilder stringBuilder1 = this.FLD66;
            if(stringBuilder1.length() == 0) {
                stringBuilder1.append(this.FLD51);
            }
            stringBuilder1.append(stringBuilder0);
        }
        this.FLD50.getClass();
    }

    @Nullable
    public final int[] MTH470(@Nullable Character character0, boolean z) {
        int v15;
        boolean z5;
        boolean z4;
        int v6;
        String s;
        CLS13 ٴʼ0 = this.FLD58;
        if(ٴʼ0.MTH524()) {
            return null;
        }
        if(character0 != null && character0.charValue() == ٴʼ0.MTH520()) {
            return null;
        }
        ٴʼ0.MTH539();
        if(!ٴʼ0.MTH524() && Arrays.binarySearch(CLS11.FLD57, ٴʼ0.FLD95[ٴʼ0.FLD92]) >= 0) {
            return null;
        }
        if(ٴʼ0.FLD98 - ٴʼ0.FLD92 < 0x400) {
            ٴʼ0.FLD89 = 0;
        }
        ٴʼ0.MTH539();
        ٴʼ0.FLD99 = ٴʼ0.FLD92;
        boolean z1 = ٴʼ0.MTH535("#");
        int[] arr_v = this.FLD59;
        if(z1) {
            boolean z2 = ٴʼ0.MTH523("X");
            if(z2) {
                ٴʼ0.MTH539();
                int v = ٴʼ0.FLD92;
                int v1;
                while((v1 = ٴʼ0.FLD92) < ٴʼ0.FLD98) {
                    int v2 = ٴʼ0.FLD95[v1];
                    if((v2 < 0x30 || v2 > 57) && (v2 < 65 || v2 > 70) && (v2 < 97 || v2 > 102)) {
                        break;
                    }
                    ٴʼ0.FLD92 = v1 + 1;
                }
                s = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v, v1 - v);
            }
            else {
                ٴʼ0.MTH539();
                int v3 = ٴʼ0.FLD92;
                int v4;
                while((v4 = ٴʼ0.FLD92) < ٴʼ0.FLD98) {
                    int v5 = ٴʼ0.FLD95[v4];
                    if(v5 < 0x30 || v5 > 57) {
                        break;
                    }
                    ٴʼ0.FLD92 = v4 + 1;
                }
                s = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v3, v4 - v3);
            }
            if(s.length() == 0) {
                this.MTH464("numeric reference with no numerals", new Object[0]);
                ٴʼ0.MTH538();
                return null;
            }
            ٴʼ0.FLD99 = -1;
            if(!ٴʼ0.MTH535(";")) {
                this.MTH464("missing semicolon on [&#%s]", new Object[]{s});
            }
            try {
                v6 = -1;
                v6 = (int)Integer.valueOf(s, (z2 ? 16 : 10));
            }
            catch(NumberFormatException unused_ex) {
            }
            if(v6 != -1 && (v6 < 0xD800 || v6 > 0xDFFF) && v6 <= 0x10FFFF) {
                if(v6 >= 0x80 && v6 < 0xA0) {
                    this.MTH464("character [%s] is not a valid unicode code point", new Object[]{v6});
                    v6 = CLS11.FLD48[v6 - 0x80];
                }
                arr_v[0] = v6;
                return arr_v;
            }
            this.MTH464("character [%s] outside of valid range", new Object[]{v6});
            arr_v[0] = 0xFFFD;
            return arr_v;
        }
        ٴʼ0.MTH539();
        int v7 = ٴʼ0.FLD92;
        int v8;
        while((v8 = ٴʼ0.FLD92) < ٴʼ0.FLD98) {
            int v9 = ٴʼ0.FLD95[v8];
            if((v9 < 65 || v9 > 90) && (v9 < 97 || v9 > 0x7A) && !Character.isLetter(((char)v9))) {
                break;
            }
            ++ٴʼ0.FLD92;
        }
        int v10;
        while((v10 = ٴʼ0.FLD92) < ٴʼ0.FLD98) {
            int v11 = ٴʼ0.FLD95[v10];
            if(v11 < 0x30 || v11 > 57) {
                break;
            }
            ٴʼ0.FLD92 = v10 + 1;
        }
        String s1 = CLS13.MTH536(ٴʼ0.FLD95, ٴʼ0.FLD97, v7, v10 - v7);
        boolean z3 = ٴʼ0.MTH530(';');
        int v12 = Arrays.binarySearch(CLS59.FLD378.FLD380, s1);
        if((v12 < 0 ? -1 : CLS59.FLD378.FLD384[v12]) == -1) {
            int v13 = Arrays.binarySearch(CLS59.FLD383.FLD380, s1);
            z4 = (v13 < 0 ? -1 : CLS59.FLD383.FLD384[v13]) != -1 && z3;
        }
        else {
            z4 = true;
        }
        if(!z4) {
            ٴʼ0.MTH538();
            if(z3) {
                this.MTH464("invalid named reference [%s]", new Object[]{s1});
            }
            return null;
        }
        if(z) {
            if(ٴʼ0.MTH516()) {
                ٴʼ0.MTH538();
                return null;
            }
            if(ٴʼ0.MTH524()) {
                z5 = false;
            }
            else {
                int v14 = ٴʼ0.FLD95[ٴʼ0.FLD92];
                z5 = v14 < 0x30 || v14 > 57 ? false : true;
            }
            if(z5 || ٴʼ0.MTH534(new char[]{'=', '-', '_'})) {
                ٴʼ0.MTH538();
                return null;
            }
        }
        ٴʼ0.FLD99 = -1;
        if(!ٴʼ0.MTH535(";")) {
            this.MTH464("missing semicolon on [&%s]", new Object[]{s1});
        }
        String s2 = (String)CLS60.FLD386.get(s1);
        int[] arr_v1 = this.FLD63;
        if(s2 == null) {
            int v16 = Arrays.binarySearch(CLS59.FLD383.FLD380, s1);
            int v17 = v16 < 0 ? -1 : CLS59.FLD383.FLD384[v16];
            if(v17 == -1) {
                v15 = 0;
            }
            else {
                arr_v1[0] = v17;
                v15 = 1;
            }
        }
        else {
            arr_v1[0] = s2.codePointAt(0);
            arr_v1[1] = s2.codePointAt(1);
            v15 = 2;
        }
        if(v15 == 1) {
            arr_v[0] = arr_v1[0];
            return arr_v;
        }
        if(v15 != 2) {
            throw new CLS37("Unexpected characters returned for " + s1);
        }
        return arr_v1;
    }
}

