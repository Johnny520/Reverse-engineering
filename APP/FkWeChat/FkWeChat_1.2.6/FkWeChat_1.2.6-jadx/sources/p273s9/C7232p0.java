package p273s9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6044u0;
import p244qb.AbstractC6370a;
import za.AbstractC9905c;
import za.AbstractC9914l;
import za.C9906d;

/* JADX INFO: renamed from: s9.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7232p0 extends AbstractC9914l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC6005h0 f24004b;

    /* JADX INFO: renamed from: c */
    public final C5692c f24005c;

    public C7232p0(InterfaceC6005h0 interfaceC6005h0, C5692c c5692c) {
        interfaceC6005h0.getClass();
        c5692c.getClass();
        this.f24004b = interfaceC6005h0;
        this.f24005c = c5692c;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return AbstractC5068b1.m20483e();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        if (!c9906d.m38433a(C9906d.f33395c.m38442f())) {
            return AbstractC5114x.m20800o();
        }
        if (this.f24005c.m22996c() && c9906d.m38434l().contains(AbstractC9905c.b.f33394a)) {
            return AbstractC5114x.m20800o();
        }
        Collection collectionMo12668q = this.f24004b.mo12668q(this.f24005c, interfaceC0184l);
        ArrayList arrayList = new ArrayList(collectionMo12668q.size());
        Iterator it = collectionMo12668q.iterator();
        while (it.hasNext()) {
            C5695f c5695fM22999f = ((C5692c) it.next()).m22999f();
            if (((Boolean) interfaceC0184l.mo27m(c5695fM22999f)).booleanValue()) {
                AbstractC6370a.m25339a(arrayList, m28573h(c5695fM22999f));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC6044u0 m28573h(C5695f c5695f) {
        c5695f.getClass();
        if (c5695f.m23033k()) {
            return null;
        }
        InterfaceC6044u0 interfaceC6044u0Mo12666e0 = this.f24004b.mo12666e0(this.f24005c.m22995b(c5695f));
        if (interfaceC6044u0Mo12666e0.isEmpty()) {
            return null;
        }
        return interfaceC6044u0Mo12666e0;
    }

    public String toString() {
        return "subpackages of " + this.f24005c + " from " + this.f24004b;
    }
}
