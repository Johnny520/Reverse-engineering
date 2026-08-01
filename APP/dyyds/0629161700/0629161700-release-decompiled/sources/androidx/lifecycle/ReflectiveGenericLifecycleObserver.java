package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1995 f278;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f279;

    public ReflectiveGenericLifecycleObserver(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r2.f279 = r3
            ᲇᛳᛵᛲ r0 = defpackage.C2018.f8719
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.f8720
            java.lang.Object r1 = r1.get(r3)
            ᲇᛲᛲᲈ r1 = (defpackage.C1995) r1
            if (r1 == 0) goto L16
            goto L1b
        L16:
            r1 = 0
            ᲇᛲᛲᲈ r1 = r0.m3411(r3, r1)
        L1b:
            r2.f278 = r1
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r3, defpackage.EnumC2255 r4) {
            r2 = this;
            ᲇᛲᛲᲈ r0 = r2.f278
            java.util.HashMap r0 = r0.f8632
            java.lang.Object r1 = r0.get(r4)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r2.f279
            defpackage.C1995.m3394(r1, r3, r4, r2)
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            defpackage.C1995.m3394(r0, r3, r4, r2)
            return
    }
}
