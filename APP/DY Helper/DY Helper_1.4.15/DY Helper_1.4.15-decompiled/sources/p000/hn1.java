package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn1 {
    /* JADX INFO: renamed from: α */
    public static void m2523(android.app.Activity r1, p000.br0 r2) {
            r2.getClass()
            boolean r0 = r1 instanceof p000.hr0
            if (r0 == 0) goto L12
            hr0 r1 = (p000.hr0) r1
            jr0 r1 = r1.mo192()
            if (r1 == 0) goto L12
            r1.m2983(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2524(android.app.Activity r3) {
            in1 r0 = p000.jn1.C0438.Companion
            r0.getClass()
            jn1$α r0 = new jn1$α
            r0.<init>()
            r3.registerActivityLifecycleCallbacks(r0)
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L2c
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            jn1 r2 = new jn1
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L2c:
            return
    }
}
