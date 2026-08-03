package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3 implements a.InterfaceC0050ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;
    public final /* synthetic */ androidx.activity.ComponentActivity b;

    public /* synthetic */ C3(androidx.activity.ComponentActivity r1, int r2) {
            r0 = this;
            r0.f41a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0050ac
    public final void a(androidx.activity.ComponentActivity r2) {
            r1 = this;
            int r0 = r1.f41a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            androidx.activity.ComponentActivity r0 = r1.b
            a.X6 r0 = (a.X6) r0
            a.X6.d(r0, r2)
            return
        Ld:
            androidx.activity.ComponentActivity r0 = r1.b
            androidx.activity.ComponentActivity.a(r0, r2)
            return
    }
}
