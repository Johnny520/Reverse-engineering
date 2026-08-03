package a;

/* JADX INFO: renamed from: a.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0265ma implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f577a;
    public final /* synthetic */ a.C0354ra b;

    public /* synthetic */ RunnableC0265ma(a.C0354ra r1, int r2) {
            r0 = this;
            r0.f577a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f577a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            a.ra r0 = r6.b
            android.app.Activity r0 = r0.f669a
            java.lang.String r1 = "符号定位失败或 mp0 类不存在"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L14:
            a.ra r0 = r6.b
            android.widget.Switch r1 = r0.h
            if (r1 != 0) goto L1b
            goto L40
        L1b:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            boolean r2 = a.C0460x8.a()
            if (r2 != 0) goto L32
            r2 = r4
            goto L33
        L32:
            r2 = r3
        L33:
            boolean r5 = r1.isChecked()
            if (r5 == r2) goto L40
            r0.i = r4
            r1.setChecked(r2)
            r0.i = r3
        L40:
            return
    }
}
