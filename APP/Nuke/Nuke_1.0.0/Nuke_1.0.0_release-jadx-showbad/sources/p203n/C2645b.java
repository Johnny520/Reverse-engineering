package p203n;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2645b extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2647c f8422h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8423i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2645b(C2647c c2647c, Object obj, InterfaceC1046d interfaceC1046d) {
        super(1, interfaceC1046d);
        this.f8422h = c2647c;
        this.f8423i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2645b c2645b = new C2645b(this.f8422h, this.f8423i, (InterfaceC1046d) obj);
        C0891q c0891q = C0891q.f2780a;
        c2645b.mo8p(c0891q);
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        AbstractC1784a.m3205S(obj);
        C2647c c2647c = this.f8422h;
        C2647c.m4603b(c2647c);
        Object objM4602a = C2647c.m4602a(c2647c, this.f8423i);
        c2647c.f8428c.f8478e.setValue(objM4602a);
        c2647c.f8430e.setValue(objM4602a);
        return C0891q.f2780a;
    }
}
