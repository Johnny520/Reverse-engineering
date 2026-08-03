package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.e f922a;
    public final /* synthetic */ androidx.savedstate.a b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(androidx.lifecycle.e r1, androidx.savedstate.a r2) {
            r0 = this;
            r0.<init>()
            r0.f922a = r1
            r0.b = r2
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r1, androidx.lifecycle.e.a r2) {
            r0 = this;
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START
            if (r2 != r1) goto Le
            androidx.lifecycle.e r1 = r0.f922a
            r1.c(r0)
            androidx.savedstate.a r1 = r0.b
            r1.d()
        Le:
            return
    }
}
