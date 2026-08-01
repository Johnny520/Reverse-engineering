package p014b;

import java.util.concurrent.CopyOnWriteArrayList;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: b.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714p {

    /* JADX INFO: renamed from: a */
    public boolean f2105a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f2106b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public InterfaceC0173a f2107c;

    public AbstractC0714p(boolean z10) {
        this.f2105a = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m2793a(InterfaceC0701c interfaceC0701c) {
        interfaceC0701c.getClass();
        this.f2106b.add(interfaceC0701c);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a m2794b() {
        return this.f2107c;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2796d();

    /* JADX INFO: renamed from: e */
    public void m2797e(C0700b c0700b) {
        c0700b.getClass();
    }

    /* JADX INFO: renamed from: f */
    public void m2798f(C0700b c0700b) {
        c0700b.getClass();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2799g() {
        return this.f2105a;
    }

    /* JADX INFO: renamed from: h */
    public final void m2800h(InterfaceC0701c interfaceC0701c) {
        interfaceC0701c.getClass();
        this.f2106b.remove(interfaceC0701c);
    }

    /* JADX INFO: renamed from: i */
    public final void m2801i(InterfaceC0173a interfaceC0173a) {
        this.f2107c = interfaceC0173a;
    }

    /* JADX INFO: renamed from: c */
    public void m2795c() {
    }
}
