package p227r;

import java.util.concurrent.CancellationException;
import p000A.C0006D;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1672q;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p203n.AbstractC2649d;
import p203n.C2661j;
import p203n.C2673r;
import p203n.C2674s;

/* JADX INFO: renamed from: r.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2994j extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public C1672q f9480h;

    /* JADX INFO: renamed from: i */
    public C2661j f9481i;

    /* JADX INFO: renamed from: j */
    public int f9482j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f9483k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2996k f9484l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C3021w0 f9485m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2994j(float f2, C2996k c2996k, C3021w0 c3021w0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9483k = f2;
        this.f9484l = c2996k;
        this.f9485m = c3021w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2994j) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C2994j(this.f9483k, this.f9484l, this.f9485m, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        float f2;
        C2661j c2661j;
        C1672q c1672q;
        C2661j c2661j2;
        Object objM4609b;
        Object obj2;
        int i5 = this.f9482j;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            f2 = this.f9483k;
            if (Math.abs(f2) > 1.0f) {
                C1672q c1672q2 = new C1672q();
                c1672q2.f5706d = f2;
                C1672q c1672q3 = new C1672q();
                C2661j c2661jM4608a = AbstractC2649d.m4608a(f2, 28);
                try {
                    C2996k c2996k = this.f9484l;
                    C2674s c2674s = c2996k.f9490a;
                    C0006D c0006d = new C0006D(c1672q3, this.f9485m, c1672q2, c2996k, 3);
                    this.f9480h = c1672q2;
                    this.f9481i = c2661jM4608a;
                    this.f9482j = 1;
                    c2661j = c2661jM4608a;
                    try {
                        objM4609b = AbstractC2649d.m4609b(c2661j, new C2673r(c2674s, AbstractC2649d.f8446j, c2661jM4608a.f8478e.getValue(), c2661jM4608a.f8479f), Long.MIN_VALUE, c0006d, this);
                        obj2 = EnumC1152a.f3788d;
                        if (objM4609b != obj2) {
                            objM4609b = C0891q.f2780a;
                        }
                    } catch (CancellationException unused) {
                        c1672q = c1672q2;
                        c2661j2 = c2661j;
                        c1672q.f5706d = ((Number) c2661j2.f8477d.f8460b.mo1h(c2661j2.f8479f)).floatValue();
                    }
                } catch (CancellationException unused2) {
                    c2661j = c2661jM4608a;
                }
                if (objM4609b == obj2) {
                    return obj2;
                }
                c1672q = c1672q2;
                f2 = c1672q.f5706d;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2661j2 = this.f9481i;
            c1672q = this.f9480h;
            try {
                AbstractC1784a.m3205S(obj);
            } catch (CancellationException unused3) {
                c1672q.f5706d = ((Number) c2661j2.f8477d.f8460b.mo1h(c2661j2.f8479f)).floatValue();
            }
            f2 = c1672q.f5706d;
        }
        return new Float(f2);
    }
}
