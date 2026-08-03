package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleAttacher implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Hd f926a;

    public SavedStateHandleAttacher(a.Hd r1) {
            r0 = this;
            r0.<init>()
            r0.f926a = r1
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r2, androidx.lifecycle.e.a r3) {
            r1 = this;
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_CREATE
            if (r3 != r0) goto L11
            androidx.lifecycle.e r2 = r2.getLifecycle()
            r2.c(r1)
            a.Hd r2 = r1.f926a
            r2.b()
            return
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Next event must be ON_CREATE, it was "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
