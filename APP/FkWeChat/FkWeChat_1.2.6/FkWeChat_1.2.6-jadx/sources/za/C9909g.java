package za;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6007i;
import p229p9.InterfaceC6015k1;
import p342x9.InterfaceC9468b;

/* JADX INFO: renamed from: za.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9909g extends AbstractC9914l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9913k f33429b;

    public C9909g(InterfaceC9913k interfaceC9913k) {
        interfaceC9913k.getClass();
        this.f33429b = interfaceC9913k;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        return this.f33429b.mo5514b();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        return this.f33429b.mo5516d();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return this.f33429b.mo5517e();
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        InterfaceC6004h interfaceC6004hMo5518f = this.f33429b.mo5518f(c5695f, interfaceC9468b);
        if (interfaceC6004hMo5518f != null) {
            InterfaceC5995e interfaceC5995e = interfaceC6004hMo5518f instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5518f : null;
            if (interfaceC5995e != null) {
                return interfaceC5995e;
            }
            if (interfaceC6004hMo5518f instanceof InterfaceC6015k1) {
                return (InterfaceC6015k1) interfaceC6004hMo5518f;
            }
        }
        return null;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        C9906d c9906dM38436n = c9906d.m38436n(C9906d.f33395c.m38439c());
        if (c9906dM38436n == null) {
            return AbstractC5114x.m20800o();
        }
        Collection collectionMo5519g = this.f33429b.mo5519g(c9906dM38436n, interfaceC0184l);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo5519g) {
            if (obj instanceof InterfaceC6007i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f33429b;
    }
}
