package a;

/* JADX INFO: renamed from: a.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377sf implements a.Oe {
    @Override // a.Oe
    public final a.Ne.a a(android.app.Activity r2, android.view.View r3, java.lang.Class<?> r4) {
            r1 = this;
            a.Ne$a r4 = a.Ne.a.c
            if (r3 != 0) goto L5
            return r4
        L5:
            a.qf r0 = a.C0342qf.f660a     // Catch: java.lang.Throwable -> Lf
            r0.getClass()     // Catch: java.lang.Throwable -> Lf
            android.widget.TextView r2 = a.C0342qf.a(r2, r3)     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L14:
            boolean r3 = r2 instanceof a.C0447wd.a
            if (r3 == 0) goto L19
            r2 = 0
        L19:
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L1e
            return r4
        L1e:
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L50
            int r3 = r2.getVisibility()
            if (r3 == 0) goto L2b
            goto L50
        L2b:
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L50
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L38
            goto L50
        L38:
            a.qf r3 = a.C0342qf.f660a
            r3.getClass()
            java.util.Set<java.lang.String> r3 = a.C0342qf.b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L48
            a.Ne$a r4 = a.Ne.a.f188a
            goto L50
        L48:
            boolean r2 = a.Be.P(r2)
            if (r2 != 0) goto L50
            a.Ne$a r4 = a.Ne.a.b
        L50:
            return r4
    }

    @Override // a.Oe
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "titleText"
            return r0
    }
}
