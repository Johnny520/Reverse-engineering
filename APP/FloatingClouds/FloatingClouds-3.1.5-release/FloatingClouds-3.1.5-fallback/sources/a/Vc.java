package a;

/* JADX INFO: loaded from: classes.dex */
public final class Vc implements a.Oe {
    @Override // a.Oe
    public final a.Ne.a a(android.app.Activity r7, android.view.View r8, java.lang.Class<?> r9) {
            r6 = this;
            java.lang.String r8 = "getCurrentTab"
            a.Ne$a r0 = a.Ne.a.c
            if (r9 != 0) goto L7
            return r0
        L7:
            boolean r1 = r9.isInstance(r7)
            if (r1 != 0) goto Le
            return r0
        Le:
            java.lang.String r1 = "getCurrentTabIndex"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = a.A1.d(r9, r1, r3)     // Catch: java.lang.Throwable -> L2a
            a.Ne$a r3 = a.Ne.a.b
            a.Ne$a r4 = a.Ne.a.f188a
            r5 = 0
            if (r1 == 0) goto L42
            java.lang.Object r7 = r1.invoke(r5, r5)     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L2c
            r5 = r7
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r7 = move-exception
            goto L6a
        L2c:
            if (r5 != 0) goto L2f
            goto L37
        L2f:
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto L37
        L35:
            r3 = r4
            goto L6e
        L37:
            if (r5 == 0) goto L40
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L2a
            if (r7 <= 0) goto L40
            goto L6e
        L40:
            r3 = r0
            goto L6e
        L42:
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r9 = a.A1.d(r9, r8, r1)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L40
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = a.A1.a(r7, r8, r9)     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L57
            r5 = r7
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2a
        L57:
            if (r5 != 0) goto L5a
            goto L61
        L5a:
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto L61
            goto L35
        L61:
            if (r5 == 0) goto L40
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L2a
            if (r7 <= 0) goto L40
            goto L6e
        L6a:
            a.wd$a r3 = a.C0465xd.a(r7)
        L6e:
            boolean r7 = r3 instanceof a.C0447wd.a
            if (r7 == 0) goto L73
            goto L74
        L73:
            r0 = r3
        L74:
            a.Ne$a r0 = (a.Ne.a) r0
            return r0
    }

    @Override // a.Oe
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "reflection"
            return r0
    }
}
