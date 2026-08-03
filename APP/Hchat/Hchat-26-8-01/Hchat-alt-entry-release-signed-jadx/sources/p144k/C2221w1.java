package p144k;

import p015b0.C0136d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1833g1;
import p117i0.C1892x;
import p119i2.C1954y;
import p119i2.C1955z;
import p174m.C2646r;
import p174m.InterfaceC2613i2;
import p187n.C2857k;
import p227p4.C3315t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: k.w1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2221w1 implements InterfaceC2613i2 {

    /* JADX INFO: renamed from: j */
    public static final C3315t f7352j = new C3315t(new C1954y(9), 12, new C1955z(17));

    /* JADX INFO: renamed from: a */
    public final C1833g1 f7353a;

    /* JADX INFO: renamed from: f */
    public float f7358f;

    /* JADX INFO: renamed from: h */
    public final C1892x f7360h;

    /* JADX INFO: renamed from: i */
    public final C1892x f7361i;

    /* JADX INFO: renamed from: b */
    public final C1833g1 f7354b = new C1833g1(0);

    /* JADX INFO: renamed from: c */
    public final C1833g1 f7355c = new C1833g1(0);

    /* JADX INFO: renamed from: d */
    public final C2857k f7356d = new C2857k();

    /* JADX INFO: renamed from: e */
    public final C1833g1 f7357e = new C1833g1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public final C2646r f7359g = new C2646r(new C0136d0(this, 24));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2221w1(int i9) {
        this.f7353a = new C1833g1(i9);
        final int i10 = 0;
        this.f7360h = AbstractC1874r.m4634p(new InterfaceC1220a(this) { // from class: k.v1

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2221w1 f7347h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7347h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C2221w1 c2221w1 = this.f7347h;
                        return Boolean.valueOf(c2221w1.f7353a.m4492g() < c2221w1.f7357e.m4492g());
                    default:
                        return Boolean.valueOf(this.f7347h.f7353a.m4492g() > 0);
                }
            }
        });
        final int i11 = 1;
        this.f7361i = AbstractC1874r.m4634p(new InterfaceC1220a(this) { // from class: k.v1

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2221w1 f7347h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f7347h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        C2221w1 c2221w1 = this.f7347h;
                        return Boolean.valueOf(c2221w1.f7353a.m4492g() < c2221w1.f7357e.m4492g());
                    default:
                        return Boolean.valueOf(this.f7347h.f7353a.m4492g() > 0);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: a */
    public final boolean mo5458a() {
        return this.f7359g.mo5458a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: b */
    public final Object mo5459b(EnumC2164d1 enumC2164d1, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        Object objMo5459b = this.f7359g.mo5459b(enumC2164d1, interfaceC1235p, abstractC6038c);
        return objMo5459b == EnumC5799a.f23547g ? objMo5459b : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: c */
    public final boolean mo5460c() {
        return ((Boolean) this.f7361i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: d */
    public final boolean mo5461d() {
        return ((Boolean) this.f7360h.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: e */
    public final float mo5462e(float f3) {
        return this.f7359g.mo5462e(f3);
    }
}
