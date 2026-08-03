package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/g;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.b[] f920a;

    public CompositeGeneratedAdaptersObserver(androidx.lifecycle.b[] r1) {
            r0 = this;
            r0.<init>()
            r0.f920a = r1
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r4, androidx.lifecycle.e.a r5) {
            r3 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            androidx.lifecycle.b[] r4 = r3.f920a
            int r5 = r4.length
            r0 = 0
            r1 = r0
        La:
            if (r1 >= r5) goto L14
            r2 = r4[r1]
            r2.a()
            int r1 = r1 + 1
            goto La
        L14:
            int r5 = r4.length
        L15:
            if (r0 >= r5) goto L1f
            r1 = r4[r0]
            r1.a()
            int r0 = r0 + 1
            goto L15
        L1f:
            return
    }
}
