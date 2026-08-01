package defpackage;

/* JADX INFO: renamed from: ᛱᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227 {
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m833(android.app.Activity r1, defpackage.EnumC2255 r2) {
            boolean r0 = r1 instanceof defpackage.InterfaceC0770
            if (r0 == 0) goto Lf
            ᛴᲁᲁᛶ r1 = (defpackage.InterfaceC0770) r1
            androidx.lifecycle.ᛷᲁᛳᛳ r1 = r1.mo0()
            if (r1 == 0) goto Lf
            r1.m108(r2)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m834(android.app.Activity r3) {
            ᛷᛲᲇᲀ r0 = defpackage.FragmentC2020.C2021.Companion
            r0.getClass()
            ᲇᛳᛷᛱ$ᛷᲁᛳᛳ r0 = new ᲇᛳᛷᛱ$ᛷᲁᛳᛳ
            r0.<init>()
            r3.registerActivityLifecycleCallbacks(r0)
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L2c
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            ᲇᛳᛷᛱ r2 = new ᲇᛳᛷᛱ
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L2c:
            return
    }
}
