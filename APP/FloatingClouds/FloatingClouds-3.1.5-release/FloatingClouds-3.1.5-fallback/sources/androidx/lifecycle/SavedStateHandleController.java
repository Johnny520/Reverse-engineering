package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f927a;
    public final androidx.lifecycle.m b;
    public boolean c;

    public SavedStateHandleController(java.lang.String r1, androidx.lifecycle.m r2) {
            r0 = this;
            r0.<init>()
            r0.f927a = r1
            r0.b = r2
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r2, androidx.lifecycle.e.a r3) {
            r1 = this;
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.c = r3
            androidx.lifecycle.e r2 = r2.getLifecycle()
            r2.c(r1)
        Le:
            return
    }

    public final void c(androidx.lifecycle.e r2, androidx.savedstate.a r3) {
            r1 = this;
            java.lang.String r0 = "registry"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "lifecycle"
            a.C0193i9.e(r2, r0)
            boolean r0 = r1.c
            if (r0 != 0) goto L1e
            r0 = 1
            r1.c = r0
            r2.a(r1)
            androidx.lifecycle.m r2 = r1.b
            java.lang.String r0 = r1.f927a
            androidx.savedstate.a$b r2 = r2.e
            r3.c(r0, r2)
            return
        L1e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached to lifecycleOwner"
            r2.<init>(r3)
            throw r2
    }
}
