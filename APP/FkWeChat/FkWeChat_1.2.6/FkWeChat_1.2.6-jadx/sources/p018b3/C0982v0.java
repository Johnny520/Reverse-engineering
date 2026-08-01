package p018b3;

import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0184l;
import p163l.AbstractC4284d1;

/* JADX INFO: renamed from: b3.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0982v0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0964m0 f3000a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f3001b = new AtomicReference(null);

    public C0982v0(InterfaceC0964m0 interfaceC0964m0) {
        this.f3000a = interfaceC0964m0;
    }

    /* JADX INFO: renamed from: a */
    public final C0939b1 m3601a() {
        return (C0939b1) this.f3001b.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m3602b() {
        this.f3000a.mo3522h();
    }

    /* JADX INFO: renamed from: c */
    public final void m3603c() {
        if (m3601a() != null) {
            this.f3000a.mo3517c();
        }
    }

    /* JADX INFO: renamed from: d */
    public C0939b1 m3604d(C0978t0 c0978t0, C0977t c0977t, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        this.f3000a.mo3520f(c0978t0, c0977t, interfaceC0184l, interfaceC0184l2);
        C0939b1 c0939b1 = new C0939b1(this, this.f3000a);
        this.f3001b.set(c0939b1);
        return c0939b1;
    }

    /* JADX INFO: renamed from: e */
    public final void m3605e() {
        this.f3000a.mo3516b();
        this.f3001b.set(new C0939b1(this, this.f3000a));
    }

    /* JADX INFO: renamed from: f */
    public final void m3606f() {
        this.f3001b.set(null);
        this.f3000a.mo3519e();
    }

    /* JADX INFO: renamed from: g */
    public void m3607g(C0939b1 c0939b1) {
        if (AbstractC4284d1.m16830a(this.f3001b, c0939b1, null)) {
            this.f3000a.mo3519e();
        }
    }
}
