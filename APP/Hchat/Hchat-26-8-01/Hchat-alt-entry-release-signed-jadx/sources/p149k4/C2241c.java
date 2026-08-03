package p149k4;

import bsh.C0353j;
import p096g8.C1361b;
import p104h4.C1607u;
import p136j8.C2104o;
import p163l4.C2474c;
import p163l4.C2475d;
import p163l4.C2477f;
import p163l4.InterfaceC2472a;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4477z;
import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: k4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2241c {

    /* JADX INFO: renamed from: a */
    public final C2240b f7427a;

    /* JADX INFO: renamed from: b */
    public final C4453d0 f7428b;

    /* JADX INFO: renamed from: c */
    public final int f7429c;

    /* JADX INFO: renamed from: d */
    public final C2242d f7430d;

    /* JADX INFO: renamed from: e */
    public int f7431e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7432f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6091e f7433g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2241c(C2240b c2240b, C4453d0 c4453d0, int i9, C2242d c2242d, int i10) {
        this(c2240b, c4453d0, i9, c2242d, (byte) 0);
        this.f7432f = i10;
        switch (i10) {
            case 1:
                this(c2240b, c4453d0, i9, c2242d, (byte) 0);
                this.f7433g = new C1607u(c2240b.f7416b.m3659g(i9));
                break;
            default:
                this.f7433g = new C1607u(c2240b.f7416b.m3659g(i9));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m5481a() {
        switch (this.f7432f) {
            case 0:
                return "field";
            default:
                return "method";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5482b() {
        int i9;
        if (this.f7431e < 0) {
            switch (this.f7432f) {
                case 0:
                    i9 = 1;
                    break;
                default:
                    i9 = 2;
                    break;
            }
            C2240b c2240b = this.f7427a;
            C1361b c1361b = c2240b.f7416b;
            int i10 = this.f7429c;
            int iM3659g = c1361b.m3659g(i10);
            int i11 = i10 + 2;
            C1361b c1361b2 = c2240b.f7416b;
            c2240b.m5480d();
            C4455e0 c4455e0 = c2240b.f7418d;
            for (int i12 = 0; i12 < iM3659g; i12++) {
                try {
                    int iM3659g2 = c1361b2.m3659g(i11);
                    int iM3659g3 = c1361b2.m3659g(i11 + 2);
                    int iM3659g4 = c1361b2.m3659g(i11 + 4);
                    C4451c0 c4451c0 = (C4451c0) c4455e0.m8906l(iM3659g3);
                    C4451c0 c4451c02 = (C4451c0) c4455e0.m8906l(iM3659g4);
                    C2239a c2239a = new C2239a(c2240b, i9, i11 + 6, this.f7430d);
                    c2239a.m5474a();
                    i11 = c2239a.f7411c;
                    c2239a.m5474a();
                    C1607u c1607u = (C1607u) c2239a.f7414f;
                    c1607u.f24613g = false;
                    m5483c(i12, iM3659g2, new C4477z(c4451c0, c4451c02), c1607u);
                } catch (C2474c e6) {
                    e6.m2687a("...while parsing " + m5481a() + "s[" + i12 + "]");
                    throw e6;
                } catch (RuntimeException e7) {
                    C2474c c2474c = new C2474c(null, e7);
                    c2474c.m2687a("...while parsing " + m5481a() + "s[" + i12 + "]");
                    throw c2474c;
                }
            }
            this.f7431e = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC2472a m5483c(int i9, int i10, C4477z c4477z, C1607u c1607u) {
        switch (this.f7432f) {
            case 0:
                C2475d c2475d = new C2475d(this.f7428b, i10, c4477z, c1607u);
                ((C1607u) this.f7433g).m10841m(i9, c2475d);
                return c2475d;
            default:
                C2477f c2477f = new C2477f(this.f7428b, i10, c4477z, c1607u);
                ((C1607u) this.f7433g).m10841m(i9, c2477f);
                return c2477f;
        }
    }

    public C2241c(C2240b c2240b, C4453d0 c4453d0, int i9, C2242d c2242d, byte b10) {
        if (i9 < 0) {
            C2104o.m5294t("offset < 0");
            throw null;
        }
        if (c2242d != null) {
            this.f7427a = c2240b;
            this.f7428b = c4453d0;
            this.f7429c = i9;
            this.f7430d = c2242d;
            this.f7431e = -1;
            return;
        }
        C0353j.m1305c("attributeFactory == null");
        throw null;
    }
}
