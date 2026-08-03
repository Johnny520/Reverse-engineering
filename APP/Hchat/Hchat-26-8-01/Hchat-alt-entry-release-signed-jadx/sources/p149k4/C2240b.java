package p149k4;

import ac.C0058k;
import bsh.C0353j;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p071f1.C1005h;
import p096g8.C1361b;
import p104h4.C1607u;
import p136j8.C2104o;
import p163l4.C2474c;
import p311v4.AbstractC4446a;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p326w4.C4682b;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: k4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2240b {

    /* JADX INFO: renamed from: a */
    public final String f7415a;

    /* JADX INFO: renamed from: b */
    public final C1361b f7416b;

    /* JADX INFO: renamed from: c */
    public final boolean f7417c;

    /* JADX INFO: renamed from: d */
    public C4455e0 f7418d;

    /* JADX INFO: renamed from: e */
    public int f7419e;

    /* JADX INFO: renamed from: f */
    public C4453d0 f7420f;

    /* JADX INFO: renamed from: g */
    public C4453d0 f7421g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4685e f7422h;

    /* JADX INFO: renamed from: i */
    public C1607u f7423i;

    /* JADX INFO: renamed from: j */
    public C1607u f7424j;

    /* JADX INFO: renamed from: k */
    public C1607u f7425k;

    /* JADX INFO: renamed from: l */
    public C2242d f7426l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2240b(String str, byte[] bArr) {
        C1361b c1361b = new C1361b(bArr, 3, (byte) 0);
        if (str == null) {
            C0353j.m1305c("filePath == null");
            throw null;
        }
        this.f7415a = str;
        this.f7416b = c1361b;
        this.f7417c = true;
        this.f7419e = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5477a() {
        String str = this.f7415a;
        try {
            m5478b();
        } catch (C2474c e6) {
            e6.m2687a("...while parsing " + str);
            throw e6;
        } catch (RuntimeException e7) {
            C2474c c2474c = new C2474c(null, e7);
            c2474c.m2687a("...while parsing " + str);
            throw c2474c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5478b() {
        AbstractC4446a abstractC4446aM8906l;
        InterfaceC4685e c0058k;
        C1361b c1361b = this.f7416b;
        if (c1361b.f4512c < 10) {
            throw new C2474c("severely truncated class file", null);
        }
        boolean z9 = this.f7417c;
        if (z9) {
            if (c1361b.m3654b(0) != -889275714) {
                throw new C2474c("bad class file magic (" + AbstractC0000a.m48Y0(c1361b.m3654b(0)) + ")", null);
            }
            int iM3659g = c1361b.m3659g(4);
            int iM3659g2 = c1361b.m3659g(6);
            if (iM3659g < 0 || (iM3659g2 != 53 ? iM3659g2 >= 53 || iM3659g2 < 45 : iM3659g > 0)) {
                throw new C2474c("unsupported class file version " + c1361b.m3659g(6) + "." + c1361b.m3659g(4), null);
            }
        }
        C1005h c1005h = new C1005h(c1361b);
        c1005h.m2584s();
        C4455e0 c4455e0 = (C4455e0) c1005h.f3183j;
        this.f7418d = c4455e0;
        c4455e0.f24613g = false;
        c1005h.m2584s();
        int i9 = c1005h.f3181h;
        int iM3659g3 = c1361b.m3659g(i9);
        this.f7420f = (C4453d0) this.f7418d.m8906l(c1361b.m3659g(i9 + 2));
        int iM3659g4 = c1361b.m3659g(i9 + 4);
        C4455e0 c4455e02 = this.f7418d;
        if (iM3659g4 == 0) {
            c4455e02.getClass();
            abstractC4446aM8906l = null;
        } else {
            abstractC4446aM8906l = c4455e02.m8906l(iM3659g4);
        }
        this.f7421g = (C4453d0) abstractC4446aM8906l;
        int iM3659g5 = c1361b.m3659g(i9 + 6);
        int i10 = i9 + 8;
        if (iM3659g5 == 0) {
            c0058k = C4682b.f15591i;
        } else {
            C4455e0 c4455e03 = this.f7418d;
            if (c4455e03 == null) {
                C2104o.m5276A("pool not yet initialized");
                return;
            }
            c0058k = new C0058k(c1361b, i10, iM3659g5, c4455e03);
        }
        this.f7422h = c0058k;
        int i11 = (iM3659g5 * 2) + i10;
        if (z9) {
            String strM9189j = this.f7420f.f14784g.m9189j();
            String str = this.f7415a;
            if (!str.endsWith(".class") || !str.startsWith(strM9189j) || str.length() != strM9189j.length() + 6) {
                throw new C2474c(AbstractC0255e.m1022k("class name (", strM9189j, ") does not match path (", str, ")"), null);
            }
        }
        this.f7419e = iM3659g3;
        C2241c c2241c = new C2241c(this, this.f7420f, i11, this.f7426l, 0);
        c2241c.m5482b();
        this.f7423i = (C1607u) c2241c.f7433g;
        c2241c.m5482b();
        C2241c c2241c2 = new C2241c(this, this.f7420f, c2241c.f7431e, this.f7426l, 1);
        c2241c2.m5482b();
        this.f7424j = (C1607u) c2241c2.f7433g;
        c2241c2.m5482b();
        C2239a c2239a = new C2239a(this, 0, c2241c2.f7431e, this.f7426l);
        c2239a.m5474a();
        C1607u c1607u = (C1607u) c2239a.f7414f;
        this.f7425k = c1607u;
        c1607u.f24613g = false;
        c2239a.m5474a();
        int i12 = c2239a.f7411c;
        if (i12 != c1361b.f4512c) {
            throw new C2474c("extra bytes at end of class file, at offset ".concat(AbstractC0000a.m48Y0(i12)), null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5479c() {
        if (this.f7425k == null) {
            m5477a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5480d() {
        if (this.f7419e == -1) {
            m5477a();
        }
    }
}
