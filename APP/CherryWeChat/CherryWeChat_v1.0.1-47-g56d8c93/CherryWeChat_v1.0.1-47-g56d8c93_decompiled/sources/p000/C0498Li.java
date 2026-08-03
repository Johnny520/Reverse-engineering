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
    public C1185ao f1631d = null;

    /* JADX INFO: renamed from: e */
    public C2692wy f1632e = null;

    public C0498Li(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, C2709xE c2709xE, RunnableC0562N2 runnableC0562N2) {
        this.f1628a = abstractComponentCallbacksC1503hi;
        this.f1629b = c2709xE;
        this.f1630c = runnableC0562N2;
    }

    /* JADX INFO: renamed from: a */
    public final void m961a(EnumC0632On enumC0632On) {
        this.f1631d.m2276e(enumC0632On);
    }

    /* JADX INFO: renamed from: b */
    public final void m962b() {
        if (this.f1631d == null) {
            this.f1631d = new C1185ao(this);
            C2692wy c2692wy = new C2692wy(this);
            this.f1632e = c2692wy;
            c2692wy.m5268c();
            this.f1630c.run();
        }
    }

    @Override // p000.InterfaceC2420qk
    public final AbstractC2189lc getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = this.f1628a;
        Context applicationContext = abstractComponentCallbacksC1503hi.m2878y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C2557ts c2557ts = new C2557ts(0);
        if (application != null) {
            c2557ts.m5044a(C1456gf.f5169m, application);
        }
        c2557ts.m5044a(AbstractC0628Oj.f2014h, abstractComponentCallbacksC1503hi);
        c2557ts.m5044a(AbstractC0628Oj.f2015i, this);
        Bundle bundle = abstractComponentCallbacksC1503hi.f5315f;
        if (bundle != null) {
            c2557ts.m5044a(AbstractC0628Oj.f2016j, bundle);
        }
        return c2557ts;
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
