package a;

/* JADX INFO: renamed from: a.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0219k0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f539a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ RunnableC0219k0(java.lang.Object r1, int r2, java.io.Serializable r3, int r4) {
            r0 = this;
            r0.f539a = r4
            r0.c = r1
            r0.b = r2
            r0.d = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0219k0(top.mmjz.floatingclouds.plugin.IPlugin r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.f539a = r4
            r0.c = r1
            r0.d = r2
            r0.b = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f539a
            switch(r0) {
                case 0: goto L42;
                case 1: goto L35;
                case 2: goto L25;
                case 3: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r4.b
            int r0 = r0 + 1
            java.lang.Object r1 = r4.c
            a.A8 r1 = (a.A8) r1
            java.lang.Object r2 = r4.d
            android.app.Activity r2 = (android.app.Activity) r2
            r1.d(r2, r0)
            return
        L15:
            int r0 = r4.b
            int r0 = r0 + 1
            java.lang.Object r1 = r4.c
            a.z8 r1 = (a.C0496z8) r1
            java.lang.Object r2 = r4.d
            android.app.Activity r2 = (android.app.Activity) r2
            r1.b(r2, r0)
            return
        L25:
            java.lang.Object r0 = r4.c
            androidx.profileinstaller.b r0 = (androidx.profileinstaller.b) r0
            androidx.profileinstaller.c$c r0 = r0.b
            int r1 = r4.b
            java.lang.Object r2 = r4.d
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.a(r1, r2)
            return
        L35:
            r0 = 3
            java.lang.Object r1 = r4.c
            a.o2 r1 = (a.C0293o2) r1
            java.lang.Object r2 = r4.d
            int r3 = r4.b
            r1.a(r2, r3, r0)
            return
        L42:
            java.lang.Object r0 = r4.c
            android.app.ProgressDialog r0 = (android.app.ProgressDialog) r0
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto L66
            int r1 = r4.b
            r0.setProgress(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "正在扫描："
            r1.<init>(r2)
            java.lang.Object r2 = r4.d
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setMessage(r1)
        L66:
            return
    }
}
