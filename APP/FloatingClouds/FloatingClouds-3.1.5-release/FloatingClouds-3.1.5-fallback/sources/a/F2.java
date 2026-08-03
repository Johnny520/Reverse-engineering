package a;

/* JADX INFO: loaded from: classes.dex */
public final class F2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.Mf.a f80a;
    public final /* synthetic */ android.graphics.Typeface b;

    public F2(a.Mf.a r1, android.graphics.Typeface r2) {
            r0 = this;
            r0.<init>()
            r0.f80a = r1
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            a.Mf$a r0 = r2.f80a
            a.qd$e r0 = r0.u
            if (r0 == 0) goto Lb
            android.graphics.Typeface r1 = r2.b
            r0.c(r1)
        Lb:
            return
    }
}
