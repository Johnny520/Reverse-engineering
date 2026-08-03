package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;
import p000.InterfaceC1061Yn;

/* JADX INFO: renamed from: io.sentry.android.core.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1661D implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final C1660C f5957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1662E f5958b;

    public C1661D(C1662E r2) {
        this.f5958b = r2;
        this.f5957a = new C1660C(0, this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1061Yn r2) {
        C1662E r22 = this.f5958b;
        r22.f5963d = Boolean.FALSE;
        Iterator r23 = this.f5957a.iterator();
    L4:
        if (r23.hasNext() == false) goto L6;
        ((InterfaceC1659B) r23.next()).mo3807d();
        goto L4
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1061Yn r2) {
        C1662E r22 = this.f5958b;
        r22.f5963d = Boolean.TRUE;
        Iterator r23 = this.f5957a.iterator();
    L4:
        if (r23.hasNext() == false) goto L6;
        ((InterfaceC1659B) r23.next()).mo3808f();
        goto L4
    }
}
