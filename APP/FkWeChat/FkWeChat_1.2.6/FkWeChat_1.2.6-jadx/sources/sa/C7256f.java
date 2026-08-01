package sa;

import p010a9.InterfaceC0188p;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC6019m;

/* JADX INFO: renamed from: sa.f */
/* JADX INFO: loaded from: classes2.dex */
public class C7256f implements InterfaceC0188p {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5983a f24127q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5983a f24128r;

    public C7256f(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
        this.f24127q = interfaceC5983a;
        this.f24128r = interfaceC5983a2;
    }

    @Override // p010a9.InterfaceC0188p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(C7257g.m28706i(this.f24127q, this.f24128r, (InterfaceC6019m) obj, (InterfaceC6019m) obj2));
    }
}
