package gh;

import p094g6.C1354b;
import p136j8.C2104o;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1431c extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public final String f4744g;

    /* JADX INFO: renamed from: h */
    public int f4745h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1431c(String str, int i9) {
        str.getClass();
        if (i9 == 0) {
            throw null;
        }
        this.f4744g = str;
        this.f4745h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        String str = this.f4744g;
        if (str == null) {
            C2104o.m5294t("value must not be null");
            return 0;
        }
        if (str.length() == 0 && this.f4745h != 5) {
            this.f4745h = 5;
        }
        int iM3633e = c1354b.m3633e(str);
        int i9 = this.f4745h;
        byte b10 = 1;
        if (i9 != 1) {
            byte b11 = 2;
            if (i9 != 2) {
                b10 = 3;
                if (i9 != 3) {
                    b11 = 4;
                    if (i9 != 4) {
                        if (i9 != 5) {
                            throw null;
                        }
                        b10 = b11;
                    }
                } else {
                    b10 = b11;
                }
            }
        } else {
            b10 = 0;
        }
        c1354b.m3642n(3);
        c1354b.m3631c(0, iM3633e);
        if (b10 != 0) {
            c1354b.m3629a(b10);
            c1354b.m3641m(1);
        }
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
