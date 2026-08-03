package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0461x9 f925a;
    public final androidx.lifecycle.a.C0019a b;

    public ReflectiveGenericLifecycleObserver(a.InterfaceC0461x9 r3) {
            r2 = this;
            r2.<init>()
            r2.f925a = r3
            androidx.lifecycle.a r0 = androidx.lifecycle.a.c
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.f929a
            java.lang.Object r1 = r1.get(r3)
            androidx.lifecycle.a$a r1 = (androidx.lifecycle.a.C0019a) r1
            if (r1 == 0) goto L16
            goto L1b
        L16:
            r1 = 0
            androidx.lifecycle.a$a r1 = r0.a(r3, r1)
        L1b:
            r2.b = r1
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r4, androidx.lifecycle.e.a r5) {
            r3 = this;
            androidx.lifecycle.a$a r0 = r3.b
            java.util.HashMap r0 = r0.f930a
            java.lang.Object r1 = r0.get(r5)
            java.util.List r1 = (java.util.List) r1
            a.x9 r2 = r3.f925a
            androidx.lifecycle.a.C0019a.a(r1, r4, r5, r2)
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.a.C0019a.a(r0, r4, r5, r2)
            return
    }
}
