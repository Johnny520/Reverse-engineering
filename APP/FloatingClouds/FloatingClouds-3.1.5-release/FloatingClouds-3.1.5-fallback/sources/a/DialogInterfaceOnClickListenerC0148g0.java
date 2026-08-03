package a;

/* JADX INFO: renamed from: a.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0148g0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f477a;

    public /* synthetic */ DialogInterfaceOnClickListenerC0148g0(int r1) {
            r0 = this;
            r0.f477a = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            int r3 = r1.f477a
            switch(r3) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            android.content.SharedPreferences r2 = a.K3.a.j()     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = a.K3.f     // Catch: java.lang.Throwable -> L1c
            r0 = 1
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r3, r0)     // Catch: java.lang.Throwable -> L1c
            r2.apply()     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
        L1d:
            r2.dismiss()
            return
    }
}
