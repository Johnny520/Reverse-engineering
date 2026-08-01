package p000;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0110ce extends p000.C0628om {

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2077 = null;
    private volatile /* synthetic */ int _resumed$volatile;

    static {
            java.lang.Class<ce> r0 = p000.C0110ce.class
            java.lang.String r1 = "_resumed$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.C0110ce.f2077 = r0
            return
    }

    public C0110ce(p000.C0015ae r3, java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1a:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed$volatile = r3
            return
    }
}
