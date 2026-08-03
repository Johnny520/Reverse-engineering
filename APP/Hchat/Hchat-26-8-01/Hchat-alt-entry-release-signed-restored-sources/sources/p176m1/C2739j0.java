package p176m1;

import androidx.lifecycle.C0119x;
import p020b5.C0184c;
import p041d1.C0655c0;
import p057e1.C0810e;
import p071f1.C1017n;
import p101h1.C1565b;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1845j1;
import p146k1.AbstractC2233b;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p339x1.C5610h0;

/* JADX INFO: renamed from: m1.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2739j0 extends AbstractC2233b {

    /* JADX INFO: renamed from: e */
    public final C1845j1 f8918e = AbstractC1874r.m4639u(new C0810e(0));

    /* JADX INFO: renamed from: f */
    public final C1845j1 f8919f = AbstractC1874r.m4639u(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final C2729e0 f8920g;

    /* JADX INFO: renamed from: h */
    public final C1845j1 f8921h;

    /* JADX INFO: renamed from: i */
    public float f8922i;

    /* JADX INFO: renamed from: j */
    public C1017n f8923j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2739j0(C2724c c2724c) {
        C2729e0 c2729e0 = new C2729e0(c2724c);
        c2729e0.f8854f = new C0655c0(this, 9);
        this.f8920g = c2729e0;
        this.f8921h = new C1845j1(C3967n.f12976a, C1823e.f6049j);
        this.f8922i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: a */
    public final void mo5467a(float f3) {
        this.f8922i = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: b */
    public final void mo5468b(C1017n c1017n) {
        this.f8923j = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: d */
    public final long mo5469d() {
        return ((C0810e) this.f8918e.getValue()).f2428a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: e */
    public final void mo5470e(C5610h0 c5610h0) {
        C1565b c1565b = c5610h0.f22833g;
        C1017n c1017n = this.f8923j;
        C2729e0 c2729e0 = this.f8920g;
        if (c1017n == null) {
            c1017n = (C1017n) c2729e0.f8855g.getValue();
        }
        if (((Boolean) this.f8919f.getValue()).booleanValue() && c5610h0.getLayoutDirection() == EnumC4243m.f13920h) {
            long jMo4090I0 = c1565b.mo4090I0();
            C0184c c0184c = c1565b.f5220h;
            long jM825v = c0184c.m825v();
            c0184c.m819p().mo2487e();
            try {
                ((C0119x) c0184c.f469a).m587S(-1.0f, 1.0f, jMo4090I0);
                c2729e0.m6150e(c5610h0, this.f8922i, c1017n);
            } finally {
                c0184c.m819p().mo2497p();
                c0184c.m803U(jM825v);
            }
        } else {
            c2729e0.m6150e(c5610h0, this.f8922i, c1017n);
        }
        this.f8921h.getValue();
    }
}
