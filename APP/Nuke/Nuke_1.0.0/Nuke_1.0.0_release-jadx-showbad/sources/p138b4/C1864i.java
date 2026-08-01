package p138b4;

import p133a4.AbstractC1805a;

/* JADX INFO: renamed from: b4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1864i extends AbstractC1805a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1875t f6313e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1865j f6314f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864i(String str, InterfaceC1875t interfaceC1875t, C1865j c1865j) {
        super(str);
        this.f6313e = interfaceC1875t;
        this.f6314f = c1865j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p133a4.AbstractC1805a
    /* JADX INFO: renamed from: a */
    public final long mo3274a() throws InterruptedException {
        C1874s c1874s;
        InterfaceC1875t interfaceC1875t = this.f6313e;
        try {
            c1874s = interfaceC1875t.mo3332g();
        } catch (Throwable th) {
            c1874s = new C1874s(interfaceC1875t, th, 2);
        }
        C1865j c1865j = this.f6314f;
        if (!c1865j.f6319h.contains(interfaceC1875t)) {
            return -1L;
        }
        c1865j.f6320i.put(c1874s);
        return -1L;
    }
}
