package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛲᛸᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411 extends C0944 {

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public int f2142;

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public C0944[] f2143;

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public int f2144;

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public boolean f2145;

    /* JADX INFO: renamed from: ᛸᲇᛴᲀ, reason: contains not printable characters */
    public boolean f2146;

    /* JADX INFO: renamed from: ᲁᲀᛱᛴ, reason: contains not printable characters */
    public int f2147;

    @Override // yyds.C0944
    public final String toString() {
        String strM4015 = AbstractC2104.m4015(new StringBuilder("[Barrier] "), this.f4387, " {");
        for (int i = 0; i < this.f2142; i++) {
            C0944 c0944 = this.f2143[i];
            if (i > 0) {
                strM4015 = strM4015.concat(", ");
            }
            strM4015 = strM4015 + c0944.f4387;
        }
        return strM4015.concat("}");
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final boolean m1166() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f2142;
            if (i4 >= i) {
                break;
            }
            C0944 c0944 = this.f2143[i4];
            if ((this.f2145 || c0944.mo1171()) && ((((i2 = this.f2144) == 0 || i2 == 1) && !c0944.mo1172()) || (((i3 = this.f2144) == 2 || i3 == 3) && !c0944.mo1168()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f2142; i5++) {
            C0944 c09442 = this.f2143[i5];
            if (this.f2145 || c09442.mo1171()) {
                if (!z2) {
                    int i6 = this.f2144;
                    if (i6 == 0) {
                        iMax = c09442.mo2076(2).m4086();
                    } else if (i6 == 1) {
                        iMax = c09442.mo2076(4).m4086();
                    } else if (i6 == 2) {
                        iMax = c09442.mo2076(3).m4086();
                    } else if (i6 == 3) {
                        iMax = c09442.mo2076(5).m4086();
                    }
                    z2 = true;
                }
                int i7 = this.f2144;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c09442.mo2076(2).m4086());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c09442.mo2076(4).m4086());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c09442.mo2076(3).m4086());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c09442.mo2076(5).m4086());
                }
            }
        }
        int i8 = iMax + this.f2147;
        int i9 = this.f2144;
        if (i9 == 0 || i9 == 1) {
            m2085(i8, i8);
        } else {
            m2080(i8, i8);
        }
        this.f2146 = true;
        return true;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo1167(C2296 c2296, boolean z) {
        boolean z2;
        int i;
        int i2;
        C2141[] c2141Arr = this.f4378;
        C2141 c2141 = this.f4382;
        c2141Arr[0] = c2141;
        int i3 = 2;
        C2141 c21412 = this.f4403;
        c2141Arr[2] = c21412;
        C2141 c21413 = this.f4344;
        c2141Arr[1] = c21413;
        C2141 c21414 = this.f4341;
        c2141Arr[3] = c21414;
        for (C2141 c21415 : c2141Arr) {
            c21415.f10571 = c2296.m4310(c21415);
        }
        int i4 = this.f2144;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C2141 c21416 = c2141Arr[i4];
        if (!this.f2146) {
            m1166();
        }
        if (this.f2146) {
            this.f2146 = false;
            int i5 = this.f2144;
            if (i5 == 0 || i5 == 1) {
                c2296.m4317(c2141.f10571, this.f4371);
                c2296.m4317(c21413.f10571, this.f4371);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c2296.m4317(c21412.f10571, this.f4354);
                    c2296.m4317(c21414.f10571, this.f4354);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f2142; i6++) {
            C0944 c0944 = this.f2143[i6];
            if ((this.f2145 || c0944.mo1171()) && ((((i2 = this.f2144) == 0 || i2 == 1) && c0944.f4401[0] == 3 && c0944.f4382.f10577 != null && c0944.f4344.f10577 != null) || ((i2 == 2 || i2 == 3) && c0944.f4401[1] == 3 && c0944.f4403.f10577 != null && c0944.f4341.f10577 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c2141.m4082() || c21413.m4082();
        boolean z4 = c21412.m4082() || c21414.m4082();
        int i7 = !(!z2 && (((i = this.f2144) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f2142) {
            C0944 c09442 = this.f2143[i8];
            if (this.f2145 || c09442.mo1171()) {
                C0972 c0972M4310 = c2296.m4310(c09442.f4378[this.f2144]);
                C2141[] c2141Arr2 = c09442.f4378;
                int i9 = this.f2144;
                C2141 c21417 = c2141Arr2[i9];
                c21417.f10571 = c0972M4310;
                C2141 c21418 = c21417.f10577;
                int i10 = (c21418 == null || c21418.f10578 != this) ? 0 : c21417.f10575;
                if (i9 == 0 || i9 == i3) {
                    C0972 c0972 = c21416.f10571;
                    int i11 = this.f2147 - i10;
                    C1486 c1486M4311 = c2296.m4311();
                    C0972 c0972M4300 = c2296.m4300();
                    c0972M4300.f4463 = 0;
                    c1486M4311.m2986(c0972, c0972M4310, c0972M4300, i11);
                    c2296.m4314(c1486M4311);
                } else {
                    C0972 c09722 = c21416.f10571;
                    int i12 = this.f2147 + i10;
                    C1486 c1486M43112 = c2296.m4311();
                    C0972 c0972M43002 = c2296.m4300();
                    c0972M43002.f4463 = 0;
                    c1486M43112.m2984(c09722, c0972M4310, c0972M43002, i12);
                    c2296.m4314(c1486M43112);
                }
                c2296.m4302(c21416.f10571, c0972M4310, this.f2147 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f2144;
        if (i13 == 0) {
            c2296.m4302(c21413.f10571, c2141.f10571, 0, 8);
            c2296.m4302(c2141.f10571, this.f4342.f4344.f10571, 0, 4);
            c2296.m4302(c2141.f10571, this.f4342.f4382.f10571, 0, 0);
            return;
        }
        if (i13 == 1) {
            c2296.m4302(c2141.f10571, c21413.f10571, 0, 8);
            c2296.m4302(c2141.f10571, this.f4342.f4382.f10571, 0, 4);
            c2296.m4302(c2141.f10571, this.f4342.f4344.f10571, 0, 0);
        } else if (i13 == 2) {
            c2296.m4302(c21414.f10571, c21412.f10571, 0, 8);
            c2296.m4302(c21412.f10571, this.f4342.f4341.f10571, 0, 4);
            c2296.m4302(c21412.f10571, this.f4342.f4403.f10571, 0, 0);
        } else if (i13 == 3) {
            c2296.m4302(c21412.f10571, c21414.f10571, 0, 8);
            c2296.m4302(c21412.f10571, this.f4342.f4403.f10571, 0, 4);
            c2296.m4302(c21412.f10571, this.f4342.f4341.f10571, 0, 0);
        }
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean mo1168() {
        return this.f2146;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m1169(int i, ArrayList arrayList, C2183 c2183) {
        for (int i2 = 0; i2 < this.f2142; i2++) {
            C0944 c0944 = this.f2143[i2];
            ArrayList arrayList2 = c2183.f10735;
            if (!arrayList2.contains(c0944)) {
                arrayList2.add(c0944);
            }
        }
        for (int i3 = 0; i3 < this.f2142; i3++) {
            AbstractC0395.m1138(this.f2143[i3], i, arrayList, c2183);
        }
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final int m1170() {
        int i = this.f2144;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean mo1171() {
        return true;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final boolean mo1172() {
        return this.f2146;
    }
}
