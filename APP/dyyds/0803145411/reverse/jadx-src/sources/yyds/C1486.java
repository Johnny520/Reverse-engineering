package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛷᛱᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1486 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2244 f7029;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0972 f7026 = null;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f7027 = 0.0f;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f7028 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f7025 = false;

    public C1486(C0644 c0644) {
        this.f7029 = new C2244(this, c0644);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String strConcat = (this.f7026 == null ? "0" : "" + this.f7026).concat(" = ");
        if (this.f7027 != 0.0f) {
            strConcat = strConcat + this.f7027;
            z = true;
        } else {
            z = false;
        }
        C2244 c2244 = this.f7029;
        int iM4248 = c2244.m4248();
        for (int i = 0; i < iM4248; i++) {
            C0972 c0972M4242 = c2244.m4242(i);
            if (c0972M4242 != null) {
                float fM4247 = c2244.m4247(i);
                if (fM4247 != 0.0f) {
                    String string = c0972M4242.toString();
                    if (!z) {
                        if (fM4247 < 0.0f) {
                            strConcat = strConcat.concat("- ");
                            fM4247 *= -1.0f;
                        }
                        strConcat = fM4247 == 1.0f ? strConcat.concat(string) : strConcat + fM4247 + " " + string;
                        z = true;
                    } else if (fM4247 > 0.0f) {
                        strConcat = strConcat.concat(" + ");
                        if (fM4247 == 1.0f) {
                        }
                        z = true;
                    } else {
                        strConcat = strConcat.concat(" - ");
                        fM4247 *= -1.0f;
                        if (fM4247 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m2980(C2296 c2296, C0972 c0972, boolean z) {
        if (c0972.f4454) {
            C2244 c2244 = this.f7029;
            float fM4246 = c2244.m4246(c0972);
            this.f7027 = (c0972.f4458 * fM4246) + this.f7027;
            c2244.m4241(c0972, z);
            if (z) {
                c0972.m2112(this);
            }
            if (c2244.m4248() == 0) {
                this.f7025 = true;
                c2296.f11282 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void mo2981(C2296 c2296, C1486 c1486, boolean z) {
        C2244 c2244 = this.f7029;
        c2244.getClass();
        float fM4246 = c2244.m4246(c1486.f7026);
        c2244.m4241(c1486.f7026, z);
        C2244 c22442 = c1486.f7029;
        int iM4248 = c22442.m4248();
        for (int i = 0; i < iM4248; i++) {
            C0972 c0972M4242 = c22442.m4242(i);
            c2244.m4243(c0972M4242, c22442.m4246(c0972M4242) * fM4246, z);
        }
        this.f7027 = (c1486.f7027 * fM4246) + this.f7027;
        if (z) {
            c1486.f7026.m2112(this);
        }
        if (this.f7026 == null || c2244.m4248() != 0) {
            return;
        }
        this.f7025 = true;
        c2296.f11282 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean mo2982() {
        return this.f7026 == null && this.f7027 == 0.0f && this.f7029.m4248() == 0;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2983(C2296 c2296, int i) {
        C0972 c0972M4312 = c2296.m4312(i);
        C2244 c2244 = this.f7029;
        c2244.m4245(c0972M4312, 1.0f);
        c2244.m4245(c2296.m4312(i), -1.0f);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2984(C0972 c0972, C0972 c09722, C0972 c09723, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7027 = i;
        }
        C2244 c2244 = this.f7029;
        if (z) {
            c2244.m4245(c0972, 1.0f);
            c2244.m4245(c09722, -1.0f);
            c2244.m4245(c09723, -1.0f);
        } else {
            c2244.m4245(c0972, -1.0f);
            c2244.m4245(c09722, 1.0f);
            c2244.m4245(c09723, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2985(C0972 c0972) {
        C0972 c09722 = this.f7026;
        C2244 c2244 = this.f7029;
        if (c09722 != null) {
            c2244.m4245(c09722, -1.0f);
            this.f7026.f4457 = -1;
            this.f7026 = null;
        }
        float fM4241 = c2244.m4241(c0972, true) * (-1.0f);
        this.f7026 = c0972;
        if (fM4241 == 1.0f) {
            return;
        }
        this.f7027 /= fM4241;
        int i = c2244.f11074;
        for (int i2 = 0; i != -1 && i2 < c2244.f11077; i2++) {
            float[] fArr = c2244.f11079;
            fArr[i] = fArr[i] / fM4241;
            i = c2244.f11082[i];
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2986(C0972 c0972, C0972 c09722, C0972 c09723, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7027 = i;
        }
        C2244 c2244 = this.f7029;
        if (z) {
            c2244.m4245(c0972, 1.0f);
            c2244.m4245(c09722, -1.0f);
            c2244.m4245(c09723, 1.0f);
        } else {
            c2244.m4245(c0972, -1.0f);
            c2244.m4245(c09722, 1.0f);
            c2244.m4245(c09723, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0972 m2987(boolean[] zArr, C0972 c0972) {
        int i;
        C2244 c2244 = this.f7029;
        int iM4248 = c2244.m4248();
        C0972 c09722 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM4248; i2++) {
            float fM4247 = c2244.m4247(i2);
            if (fM4247 < 0.0f) {
                C0972 c0972M4242 = c2244.m4242(i2);
                if ((zArr == null || !zArr[c0972M4242.f4464]) && c0972M4242 != c0972 && (((i = c0972M4242.f4453) == 3 || i == 4) && fM4247 < f)) {
                    f = fM4247;
                    c09722 = c0972M4242;
                }
            }
        }
        return c09722;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0972 mo2988(boolean[] zArr) {
        return m2987(zArr, null);
    }
}
