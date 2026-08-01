package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yj1 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f12649;

    /* JADX INFO: renamed from: β */
    public final androidx.core.view.insets.C0044 f12650;

    /* JADX INFO: renamed from: γ */
    public int f12651;

    /* JADX INFO: renamed from: δ */
    public boolean f12652;

    public yj1(androidx.core.view.insets.C0044 r4, java.util.ArrayList r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f12649 = r0
            int r1 = r5.size()
            r2 = 0
            if (r1 > 0) goto L45
            int r1 = r5.size()
            if (r1 > 0) goto L40
            java.util.ArrayList r5 = r4.f1021
            boolean r1 = r5.contains(r3)
            if (r1 == 0) goto L20
            goto L33
        L20:
            r5.add(r3)
            int r5 = r0.size()
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L3b
            int r5 = r0.size()
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L36
        L33:
            r3.f12650 = r4
            return
        L36:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r5, r0)
            throw r3
        L3b:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r5, r0)
            throw r3
        L40:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r2, r5)
            throw r3
        L45:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r2, r5)
            throw r3
    }
}
