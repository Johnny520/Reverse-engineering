package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B3 implements androidx.savedstate.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ B3(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f23a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // androidx.savedstate.a.b
    public final android.os.Bundle a() {
            r1 = this;
            int r0 = r1.f23a
            switch(r0) {
                case 0: goto L20;
                case 1: goto L17;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            androidx.lifecycle.m r0 = (androidx.lifecycle.m) r0
            android.os.Bundle r0 = androidx.lifecycle.m.a(r0)
            return r0
        Le:
            java.lang.Object r0 = r1.b
            a.e7 r0 = (a.AbstractC0119e7) r0
            android.os.Bundle r0 = r0.W()
            return r0
        L17:
            java.lang.Object r0 = r1.b
            a.X6 r0 = (a.X6) r0
            android.os.Bundle r0 = a.X6.f(r0)
            return r0
        L20:
            java.lang.Object r0 = r1.b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            android.os.Bundle r0 = androidx.activity.ComponentActivity.b(r0)
            return r0
    }
}
