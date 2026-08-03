package p357y1;

import android.view.View;
import ci.C0579e;
import ci.C0589j;
import java.util.concurrent.atomic.AtomicReference;
import okio.C3193a;
import p070f0.C0989u;
import p071f1.C1021p;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p190n2.C2885t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5899k0 implements InterfaceC3599t {

    /* JADX INFO: renamed from: g */
    public final View f23967g;

    /* JADX INFO: renamed from: h */
    public final C2885t f23968h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3599t f23969i;

    /* JADX INFO: renamed from: j */
    public final AtomicReference f23970j = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5899k0(View view, C2885t c2885t, InterfaceC3599t interfaceC3599t) {
        this.f23967g = view;
        this.f23968h = c2885t;
        this.f23969i = interfaceC3599t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10616a(C0989u c0989u, AbstractC6038c abstractC6038c) {
        C5895j0 c5895j0;
        if (abstractC6038c instanceof C5895j0) {
            c5895j0 = (C5895j0) abstractC6038c;
            int i9 = c5895j0.f23958i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5895j0.f23958i = i9 - Integer.MIN_VALUE;
            } else {
                c5895j0 = new C5895j0(this, abstractC6038c);
            }
        }
        Object obj = c5895j0.f23956g;
        int i10 = c5895j0.f23958i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C1021p c1021p = new C1021p(c0989u, 7, this);
            C0589j c0589j = new C0589j(this, (InterfaceC5557c) null, 26);
            c5895j0.f23958i = 1;
            if (AbstractC3603v.m7551e(new C0579e(c1021p, this.f23970j, c0589j, null), c5895j0) == EnumC5799a.f23547g) {
                return;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC1089i.m2732I0(obj);
        }
        C3193a.m6814c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3599t
    /* JADX INFO: renamed from: n */
    public final InterfaceC5561g mo4457n() {
        return this.f23969i.mo4457n();
    }
}
