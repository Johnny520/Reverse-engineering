package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;
import p000.InterfaceC1061Yn;

/* JADX INFO: renamed from: io.sentry.android.core.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1661D implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final C1660C f5957a = new C1660C(0, this);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1662E f5958b;

    public C1661D(C1662E c1662e) {
        this.f5958b = c1662e;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1061Yn interfaceC1061Yn) {
        this.f5958b.f5963d = Boolean.FALSE;
        Iterator it = this.f5957a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1659B) it.next()).mo3807d();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1061Yn interfaceC1061Yn) {
        this.f5958b.f5963d = Boolean.TRUE;
        Iterator it = this.f5957a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1659B) it.next()).mo3808f();
        }
    }
}
