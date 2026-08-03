package p265s;

import p071f1.InterfaceC1037z;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1746e0;
import p116i.InterfaceC1803y;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p118i1.C1902b;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p293u2.C4240j;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: s.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3857t {

    /* JADX INFO: renamed from: q */
    public static final long f12630q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f12631r = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3599t f12632a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1037z f12633b;

    /* JADX INFO: renamed from: c */
    public final C1746e0 f12634c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1803y f12635d;

    /* JADX INFO: renamed from: e */
    public boolean f12636e;

    /* JADX INFO: renamed from: f */
    public final C1845j1 f12637f;

    /* JADX INFO: renamed from: g */
    public final C1845j1 f12638g;

    /* JADX INFO: renamed from: h */
    public final C1845j1 f12639h;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f12640i;

    /* JADX INFO: renamed from: j */
    public long f12641j;

    /* JADX INFO: renamed from: k */
    public long f12642k;

    /* JADX INFO: renamed from: l */
    public C1902b f12643l;

    /* JADX INFO: renamed from: m */
    public final C1739c f12644m;

    /* JADX INFO: renamed from: n */
    public final C1739c f12645n;

    /* JADX INFO: renamed from: o */
    public final C1845j1 f12646o;

    /* JADX INFO: renamed from: p */
    public long f12647p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j3 = Integer.MAX_VALUE;
        f12630q = (j3 & 4294967295L) | (j3 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3857t(InterfaceC3599t interfaceC3599t, InterfaceC1037z interfaceC1037z, C1746e0 c1746e0) {
        this.f12632a = interfaceC3599t;
        this.f12633b = interfaceC1037z;
        this.f12634c = c1746e0;
        Boolean bool = Boolean.FALSE;
        this.f12637f = AbstractC1874r.m4639u(bool);
        this.f12638g = AbstractC1874r.m4639u(bool);
        this.f12639h = AbstractC1874r.m4639u(bool);
        this.f12640i = AbstractC1874r.m4639u(bool);
        long j3 = f12630q;
        this.f12641j = j3;
        this.f12642k = 0L;
        this.f12643l = interfaceC1037z != null ? interfaceC1037z.mo2557c() : null;
        this.f12644m = new C1739c(new C4240j(0L), AbstractC1742d.f5816p, null, 12);
        this.f12645n = new C1739c(Float.valueOf(1.0f), AbstractC1742d.f5810j, null, 12);
        this.f12646o = AbstractC1874r.m4639u(new C4240j(0L));
        this.f12647p = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8028a() {
        C1902b c1902b = this.f12643l;
        ((Boolean) this.f12638g.getValue()).booleanValue();
        if (m8029b()) {
            if (c1902b != null) {
                c1902b.m4678f(1.0f);
            }
            AbstractC3603v.m7563q(this.f12632a, null, new C3855s(this, null, 0), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m8029b() {
        return ((Boolean) this.f12639h.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m8030c() {
        InterfaceC1037z interfaceC1037z;
        boolean zBooleanValue = ((Boolean) this.f12637f.getValue()).booleanValue();
        InterfaceC3599t interfaceC3599t = this.f12632a;
        InterfaceC5557c interfaceC5557c = null;
        if (zBooleanValue) {
            m8031d(false);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C3855s(this, interfaceC5557c, 2), 3);
        }
        if (((Boolean) this.f12638g.getValue()).booleanValue()) {
            this.f12638g.setValue(false);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C3855s(this, interfaceC5557c, 3), 3);
        }
        if (m8029b()) {
            this.f12639h.setValue(false);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C3855s(this, interfaceC5557c, 4), 3);
        }
        this.f12636e = false;
        m8032e(0L);
        this.f12641j = f12630q;
        C1902b c1902b = this.f12643l;
        if (c1902b != null && (interfaceC1037z = this.f12633b) != null) {
            interfaceC1037z.mo2555a(c1902b);
        }
        this.f12643l = null;
        this.f12635d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8031d(boolean z9) {
        this.f12637f.setValue(Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8032e(long j3) {
        this.f12646o.setValue(new C4240j(j3));
    }
}
