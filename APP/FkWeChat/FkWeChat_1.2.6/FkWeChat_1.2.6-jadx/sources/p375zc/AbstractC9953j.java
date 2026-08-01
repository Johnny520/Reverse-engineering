package p375zc;

import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p215oc.C5706c;
import p300uc.AbstractC8670x;
import p300uc.C8661o;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9223k;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: zc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9953j implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2549c f33536a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9218f f33537b;

    public AbstractC9953j(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        this.f33536a = interfaceC2549c;
        this.f33537b = AbstractC9223k.m35909e("JsonContentPolymorphicSerializer<" + interfaceC2549c.mo3794w() + '>', AbstractC9216d.b.f31455a, new InterfaceC9218f[0], null, 8, null);
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f33537b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public final void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        obj.getClass();
        InterfaceC8647b interfaceC8647bMo4011f = interfaceC9488f.mo635a().mo4011f(this.f33536a, obj);
        if (interfaceC8647bMo4011f == null) {
            InterfaceC8647b interfaceC8647bM33282e = AbstractC8670x.m33282e(AbstractC1052o0.m3807b(obj.getClass()));
            if (interfaceC8647bM33282e == null) {
                m38567h(AbstractC1052o0.m3807b(obj.getClass()), this.f33536a);
                C5706c.m23089a();
                return;
            }
            interfaceC8647bMo4011f = interfaceC8647bM33282e;
        }
        ((InterfaceC8647b) interfaceC8647bMo4011f).mo15954b(interfaceC9488f, obj);
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public final Object mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        InterfaceC9955k interfaceC9955kM38600d = AbstractC9970v.m38600d(interfaceC9487e);
        AbstractC9957l abstractC9957lMo677h = interfaceC9955kM38600d.mo677h();
        InterfaceC8645a interfaceC8645aMo15983g = mo15983g(abstractC9957lMo677h);
        interfaceC8645aMo15983g.getClass();
        return interfaceC9955kM38600d.mo673b().m38512d((InterfaceC8647b) interfaceC8645aMo15983g, abstractC9957lMo677h);
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC8645a mo15983g(AbstractC9957l abstractC9957l);

    /* JADX INFO: renamed from: h */
    public final Void m38567h(InterfaceC2549c interfaceC2549c, InterfaceC2549c interfaceC2549c2) {
        String strMo3794w = interfaceC2549c.mo3794w();
        if (strMo3794w == null) {
            strMo3794w = String.valueOf(interfaceC2549c);
        }
        throw new C8661o("Class '" + strMo3794w + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC2549c2.mo3794w() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
