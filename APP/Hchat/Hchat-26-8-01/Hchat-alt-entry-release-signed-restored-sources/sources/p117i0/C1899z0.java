package p117i0;

import af.C0081d;
import java.util.ArrayList;
import p015b0.C0154t;
import p036c9.C0446i;
import p069f.AbstractC0959s0;
import p069f.C0943k0;
import p069f.C0945l0;
import p071f1.AbstractC1018n0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p243q9.C3465a;
import p322w0.AbstractC4662m;
import sg.InterfaceC3975g;
import sg.InterfaceC3984p;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: i0.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899z0 extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final C0943k0 f6328h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6329i;

    /* JADX INFO: renamed from: j */
    public final C0945l0 f6330j;

    /* JADX INFO: renamed from: k */
    public final C0943k0 f6331k;

    /* JADX INFO: renamed from: l */
    public final C3465a f6332l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    public C1899z0() {
        super(1);
        this.f6328h = AbstractC1089i.m2781o();
        this.f6329i = new ArrayList();
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f6330j = new C0945l0();
        this.f6331k = new C0943k0();
        C0154t c0154t = new C0154t(this, 10);
        AbstractC4662m.m9124e(AbstractC4662m.f15510a);
        synchronized (AbstractC4662m.f15512c) {
            AbstractC4662m.f15517h = AbstractC4166m.m8398G1(AbstractC4662m.f15517h, c0154t);
        }
        this.f6332l = new C3465a(c0154t, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: g */
    public final void mo2620g(InterfaceC3984p interfaceC3984p) {
        this.f6329i.add(new C1893x0(interfaceC3984p));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: h */
    public final void mo2621h() {
        synchronized (this.f3204g) {
            try {
                ArrayList arrayList = this.f6329i;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    InterfaceC1896y0 interfaceC1896y0 = (InterfaceC1896y0) arrayList.get(i9);
                    if (interfaceC1896y0 instanceof C1890w0) {
                        AbstractC1089i.m2760c(this.f6328h, ((C1890w0) interfaceC1896y0).f6272a, ((C1890w0) interfaceC1896y0).f6273b);
                    } else {
                        if (!(interfaceC1896y0 instanceof C1893x0)) {
                            throw new C0081d();
                        }
                        AbstractC1089i.m2799x0(this.f6328h, ((C1893x0) interfaceC1896y0).f6287a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6329i.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: j */
    public final void mo2622j() {
        this.f6332l.m7269e();
        this.f6329i.clear();
        this.f6331k.m2314a();
        synchronized (this.f3204g) {
            this.f6328h.m2314a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: n */
    public final InterfaceC1231l mo2625n(InterfaceC3984p interfaceC3984p) {
        C0943k0 c0943k0 = this.f6331k;
        InterfaceC1231l c0446i = (InterfaceC1231l) c0943k0.m2320g(interfaceC3984p);
        if (c0446i == null) {
            c0446i = new C0446i(this, 19, interfaceC3984p);
            int iM2319f = c0943k0.m2319f(interfaceC3984p);
            if (iM2319f < 0) {
                iM2319f = ~iM2319f;
            }
            Object[] objArr = c0943k0.f2970c;
            Object obj = objArr[iM2319f];
            c0943k0.f2969b[iM2319f] = interfaceC3984p;
            objArr[iM2319f] = c0446i;
        }
        return c0446i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: o */
    public final void mo2626o(InterfaceC3975g interfaceC3975g) {
        this.f6331k.m2324k(interfaceC3975g);
        mo2620g(interfaceC3975g);
        mo2621h();
    }
}
