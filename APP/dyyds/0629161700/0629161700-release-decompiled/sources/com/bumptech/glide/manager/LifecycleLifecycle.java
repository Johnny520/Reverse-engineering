package com.bumptech.glide.manager;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements defpackage.InterfaceC1280, defpackage.InterfaceC1597 {
    @defpackage.InterfaceC0266(defpackage.EnumC2255.ON_DESTROY)
    public void onDestroy(defpackage.InterfaceC0770 r3) {
            r2 = this;
            r0 = 0
            java.util.ArrayList r0 = defpackage.AbstractC1754.m3151(r0)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            ᲁᲈᛳᛷ r1 = (defpackage.InterfaceC1960) r1
            r1.mo321()
            goto L9
        L19:
            androidx.lifecycle.ᛷᲁᛳᛳ r3 = r3.mo0()
            r3.m112(r2)
            return
    }

    @defpackage.InterfaceC0266(defpackage.EnumC2255.ON_START)
    public void onStart(defpackage.InterfaceC0770 r1) {
            r0 = this;
            r0 = 0
            java.util.ArrayList r0 = defpackage.AbstractC1754.m3151(r0)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            ᲁᲈᛳᛷ r1 = (defpackage.InterfaceC1960) r1
            r1.mo322()
            goto L9
        L19:
            return
    }

    @defpackage.InterfaceC0266(defpackage.EnumC2255.ON_STOP)
    public void onStop(defpackage.InterfaceC0770 r1) {
            r0 = this;
            r0 = 0
            java.util.ArrayList r0 = defpackage.AbstractC1754.m3151(r0)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            ᲁᲈᛳᛷ r1 = (defpackage.InterfaceC1960) r1
            r1.mo323()
            goto L9
        L19:
            return
    }

    @Override // defpackage.InterfaceC1280
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo232(defpackage.InterfaceC1960 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC1280
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo233(defpackage.InterfaceC1960 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
