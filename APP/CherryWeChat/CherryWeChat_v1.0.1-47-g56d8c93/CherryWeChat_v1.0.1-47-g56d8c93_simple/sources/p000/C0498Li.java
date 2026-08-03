package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: Li */
/* JADX INFO: loaded from: classes.dex */
public final class C0498Li implements InterfaceC2420qk, InterfaceC2075ix, InterfaceC2752yE {

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC1503hi f1628a;

    /* JADX INFO: renamed from: b */
    public final C2709xE f1629b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0562N2 f1630c;

    /* JADX INFO: renamed from: d */
    public C1185ao f1631d;

    /* JADX INFO: renamed from: e */
    public C2692wy f1632e;

    public C0498Li(AbstractComponentCallbacksC1503hi r2, C2709xE r3, RunnableC0562N2 r4) {
        this.f1631d = null;
        this.f1632e = null;
        this.f1628a = r2;
        this.f1629b = r3;
        this.f1630c = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m961a(EnumC0632On r2) {
        this.f1631d.m2276e(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m962b() {
        if (this.f1631d != null) goto L6;
        this.f1631d = new C1185ao(this);
        C2692wy r0 = new C2692wy(this);
        this.f1632e = r0;
        r0.m5268c();
        this.f1630c.run();
        return;
    }

    @Override // p000.InterfaceC2420qk
    public final AbstractC2189lc getDefaultViewModelCreationExtras() {
        AbstractComponentCallbacksC1503hi r0 = this.f1628a;
        Context r1 = r0.m2878y().getApplicationContext();
    L4:
        if ((r1 instanceof ContextWrapper) == false) goto L9;
        if ((r1 instanceof Application) == true) goto L7;
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L4
    L7:
        Application r12 = (Application) r1;
    L10:
        C2557ts r2 = new C2557ts(0);
        if (r12 == null) goto L13;
        r2.m5044a(C1456gf.f5169m, r12);
    L13:
        r2.m5044a(AbstractC0628Oj.f2014h, r0);
        r2.m5044a(AbstractC0628Oj.f2015i, this);
        Bundle r02 = r0.f5315f;
        if (r02 == null) goto L16;
        r2.m5044a(AbstractC0628Oj.f2016j, r02);
    L16:
        return r2;
    L9:
        r12 = null;
        goto L10
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        m962b();
        return this.f1631d;
    }

    @Override // p000.InterfaceC2075ix
    public final C1518hx getSavedStateRegistry() {
        m962b();
        return (C1518hx) this.f1632e.f9266d;
    }

    @Override // p000.InterfaceC2752yE
    public final C2709xE getViewModelStore() {
        m962b();
        return this.f1629b;
    }
}
