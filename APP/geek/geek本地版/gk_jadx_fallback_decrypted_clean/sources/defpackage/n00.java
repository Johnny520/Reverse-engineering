package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n00 {
    public static void a(android.app.Activity r1, defpackage.iq r2) {
            java.lang.String r0 = "event"
            defpackage.ip.o(r0, r2)
            boolean r0 = r1 instanceof defpackage.oq
            if (r0 == 0) goto L14
            oq r1 = (defpackage.oq) r1
            androidx.lifecycle.a r1 = r1.e()
            if (r1 == 0) goto L14
            r1.d(r2)
        L14:
            return
    }

    public static void b(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            o00 r0 = p00.a.Companion
            r0.getClass()
            p00$a r0 = new p00$a
            r0.<init>()
            defpackage.f0.i(r3, r0)
        L13:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L32
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            p00 r2 = new p00
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L32:
            return
    }
}
