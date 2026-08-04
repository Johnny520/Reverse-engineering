package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲀᲀᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2076 extends C0944 {

    /* JADX INFO: renamed from: ᛸᲇᛴᲀ, reason: contains not printable characters */
    public boolean f10261;

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public float f10258 = -1.0f;

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public int f10257 = -1;

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public int f10259 = -1;

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public C2141 f10260 = this.f4403;

    /* JADX INFO: renamed from: ᲁᲀᛱᛴ, reason: contains not printable characters */
    public int f10262 = 0;

    public C2076() {
        this.f4351.clear();
        this.f4351.add(this.f10260);
        int length = this.f4378.length;
        for (int i = 0; i < length; i++) {
            this.f4378[i] = this.f10260;
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m3981(int i) {
        C2141 c2141;
        if (this.f10262 == i) {
            return;
        }
        this.f10262 = i;
        ArrayList arrayList = this.f4351;
        arrayList.clear();
        if (this.f10262 == 1) {
            c2141 = this.f4382;
            this.f10260 = c2141;
        } else {
            c2141 = this.f4403;
            this.f10260 = c2141;
        }
        arrayList.add(c2141);
        C2141[] c2141Arr = this.f4378;
        int length = c2141Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c2141Arr[i2] = this.f10260;
        }
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1167(C2296 c2296, boolean z) {
        C0859 c0859 = this.f4342;
        if (c0859 == null) {
            return;
        }
        Object objMo2076 = c0859.mo2076(2);
        Object objMo20762 = c0859.mo2076(4);
        C0859 c08592 = this.f4342;
        boolean z2 = c08592 != null && c08592.f4401[0] == 2;
        if (this.f10262 == 0) {
            objMo2076 = c0859.mo2076(3);
            objMo20762 = c0859.mo2076(5);
            C0859 c08593 = this.f4342;
            z2 = c08593 != null && c08593.f4401[1] == 2;
        }
        if (this.f10261) {
            C2141 c2141 = this.f10260;
            if (c2141.f10576) {
                C0972 c0972M4310 = c2296.m4310(c2141);
                c2296.m4317(c0972M4310, this.f10260.m4086());
                if (this.f10257 != -1) {
                    if (z2) {
                        c2296.m4316(c2296.m4310(objMo20762), c0972M4310, 0, 5);
                    }
                } else if (this.f10259 != -1 && z2) {
                    C0972 c0972M43102 = c2296.m4310(objMo20762);
                    c2296.m4316(c0972M4310, c2296.m4310(objMo2076), 0, 5);
                    c2296.m4316(c0972M43102, c0972M4310, 0, 5);
                }
                this.f10261 = false;
                return;
            }
        }
        if (this.f10257 != -1) {
            C0972 c0972M43103 = c2296.m4310(this.f10260);
            c2296.m4302(c0972M43103, c2296.m4310(objMo2076), this.f10257, 8);
            if (z2) {
                c2296.m4316(c2296.m4310(objMo20762), c0972M43103, 0, 5);
                return;
            }
            return;
        }
        if (this.f10259 != -1) {
            C0972 c0972M43104 = c2296.m4310(this.f10260);
            C0972 c0972M43105 = c2296.m4310(objMo20762);
            c2296.m4302(c0972M43104, c0972M43105, -this.f10259, 8);
            if (z2) {
                c2296.m4316(c0972M43104, c2296.m4310(objMo2076), 0, 5);
                c2296.m4316(c0972M43105, c0972M43104, 0, 5);
                return;
            }
            return;
        }
        if (this.f10258 != -1.0f) {
            C0972 c0972M43106 = c2296.m4310(this.f10260);
            C0972 c0972M43107 = c2296.m4310(objMo20762);
            float f = this.f10258;
            C1486 c1486M4311 = c2296.m4311();
            c1486M4311.f7029.m4245(c0972M43106, -1.0f);
            c1486M4311.f7029.m4245(c0972M43107, f);
            c2296.m4314(c1486M4311);
        }
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public final boolean mo1168() {
        return this.f10261;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final C2141 mo2076(int i) {
        int iM4012 = AbstractC2104.m4012(i);
        if (iM4012 != 1) {
            if (iM4012 != 2) {
                if (iM4012 != 3) {
                    if (iM4012 != 4) {
                        return null;
                    }
                }
            }
            if (this.f10262 == 0) {
                return this.f10260;
            }
            return null;
        }
        if (this.f10262 == 1) {
            return this.f10260;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m3982(int i) {
        this.f10260.m4081(i);
        this.f10261 = true;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1171() {
        return true;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ */
    public final void mo2086(C2296 c2296, boolean z) {
        if (this.f4342 == null) {
            return;
        }
        C2141 c2141 = this.f10260;
        c2296.getClass();
        int iM4298 = C2296.m4298(c2141);
        if (this.f10262 == 1) {
            this.f4371 = iM4298;
            this.f4354 = 0;
            m2082(this.f4342.m2067());
            m2064(0);
            return;
        }
        this.f4371 = 0;
        this.f4354 = iM4298;
        m2064(this.f4342.m2072());
        m2082(0);
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᲈᲀᛲᲀ */
    public final boolean mo1172() {
        return this.f10261;
    }
}
