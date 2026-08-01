package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛳᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0348 extends xhss.AbstractC1186 {
    public C0348() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            int r1 = xhss.FragmentC0183.f710
            xhss.ᛵᛶᛲᲈ r1 = xhss.FragmentC0183.C0184.Companion
            r1.getClass()
            xhss.ᛲᛷᛲᲀ$ᛷᛵᛵᲈ r1 = new xhss.ᛲᛷᛲᲀ$ᛷᛵᛵᲈ
            r1.<init>()
            r2.registerActivityLifecycleCallbacks(r1)
            android.app.FragmentManager r1 = r2.getFragmentManager()
            java.lang.String r2 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r3 = r1.findFragmentByTag(r2)
            if (r3 != 0) goto L2e
            android.app.FragmentTransaction r3 = r1.beginTransaction()
            xhss.ᛲᛷᛲᲀ r0 = new xhss.ᛲᛷᛲᲀ
            r0.<init>()
            android.app.FragmentTransaction r2 = r3.add(r0, r2)
            r2.commit()
            r1.executePendingTransactions()
        L2e:
            return
    }
}
