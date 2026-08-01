package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛷᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0292 implements xhss.InterfaceC0733 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f1124;

    public C0292(xhss.C1061 r4) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.f1124 = r0
            xhss.ᲈᲀᲀᛵ r4 = r4.f3425
            java.lang.String r0 = "androidx.savedstate.Restarter"
            xhss.ᛴᛴᲁᲈ r1 = r4.mo1301(r0)
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.Object r3 = r1.f1323
            goto L33
        L18:
            xhss.ᛴᛴᲁᲈ r1 = new xhss.ᛴᛴᲁᲈ
            r1.<init>(r0, r3)
            int r3 = r4.f3799
            int r3 = r3 + 1
            r4.f3799 = r3
            xhss.ᛴᛴᲁᲈ r3 = r4.f3798
            if (r3 != 0) goto L2c
            r4.f3797 = r1
            r4.f3798 = r1
            goto L32
        L2c:
            r3.f1325 = r1
            r1.f1324 = r3
            r4.f3798 = r1
        L32:
            r3 = r2
        L33:
            xhss.ᛸᛲᛶᛱ r3 = (xhss.InterfaceC0733) r3
            if (r3 != 0) goto L38
            return
        L38:
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            xhss.C0532.m959(r3)
            throw r2
    }
}
