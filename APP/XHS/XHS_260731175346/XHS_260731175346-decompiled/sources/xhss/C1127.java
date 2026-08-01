package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛲᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1127 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1081 f3638;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0701 f3639;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final long f3640;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentLinkedQueue f3641;

    public C1127(xhss.C0723 r3) {
            r2 = this;
            r2.<init>()
            r0 = 300000000000(0x45d964b800, double:1.482196937524E-312)
            r2.f3640 = r0
            xhss.ᲇᲀᲀᛷ r3 = r3.m1271()
            r2.f3638 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = xhss.AbstractC0559.f1983
            r3.append(r0)
            java.lang.String r0 = " ConnectionPool connection closer"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            xhss.ᛷᲀᲁᲇ r0 = new xhss.ᛷᲀᲁᲇ
            r0.<init>(r2, r3)
            r2.f3639 = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.f3641 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m1821(xhss.C1184 r6, long r7) {
            r5 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            java.util.ArrayList r0 = r6.f3824
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L3e
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L1b
            int r2 = r2 + 1
            goto L6
        L1b:
            xhss.ᛱᛵᲁᲇ r3 = (xhss.C0048) r3
            xhss.ᛱᛷᲁᛶ r4 = r6.f3822
            xhss.ᛵᲈᛱᛳ r4 = r4.f359
            xhss.ᛵᛳᛸᲇ r4 = xhss.AbstractC0831.f2712
            xhss.ᛵᛳᛸᲇ r4 = xhss.AbstractC0831.f2712
            java.lang.Object r3 = r3.f328
            r4.getClass()
            android.util.CloseGuard r3 = (android.util.CloseGuard) r3
            r3.warnIfOpen()
            r0.remove(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6
            long r2 = r5.f3640
            long r7 = r7 - r2
            r6.f3829 = r7
            return r1
        L3e:
            int r5 = r0.size()
            return r5
    }
}
