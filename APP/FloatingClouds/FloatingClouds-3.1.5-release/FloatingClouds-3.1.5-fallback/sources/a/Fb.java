package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Fb implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f88a;
    public final /* synthetic */ java.lang.String b;

    public /* synthetic */ Fb(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f88a = r2
            r0.b = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            boolean r0 = r7.f88a
            java.lang.String r1 = r7.b
            java.lang.String r2 = "setHiddenAsync OK: "
            java.lang.Object r3 = a.Gb.c     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5d
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L15
            goto L5d
        L15:
            java.lang.reflect.Method r4 = a.Gb.d     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L1d
            java.lang.Object r4 = a.Gb.c     // Catch: java.lang.Throwable -> L5d
            if (r4 != 0) goto L29
        L1d:
            a.Gb r4 = a.Gb.f99a     // Catch: java.lang.Throwable -> L5d
            r4.getClass()     // Catch: java.lang.Throwable -> L5d
            boolean r3 = a.Gb.i(r3)     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L29
            goto L5d
        L29:
            if (r0 == 0) goto L2e
            java.lang.String r3 = "hidden_conv_parent"
            goto L30
        L2e:
            java.lang.String r3 = ""
        L30:
            java.lang.reflect.Method r4 = a.Gb.d     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L41
            java.lang.Object r5 = a.Gb.c     // Catch: java.lang.Throwable -> L5d
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r3}     // Catch: java.lang.Throwable -> L5d
            r4.invoke(r5, r3)     // Catch: java.lang.Throwable -> L5d
        L41:
            a.Gb r3 = a.Gb.f99a     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            r4.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = " hidden="
            r4.append(r1)     // Catch: java.lang.Throwable -> L5d
            r4.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L5d
            r3.getClass()     // Catch: java.lang.Throwable -> L5d
            a.Gb.j(r0)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
    }
}
