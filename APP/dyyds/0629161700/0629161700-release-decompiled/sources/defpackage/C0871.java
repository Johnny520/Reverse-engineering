package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentLinkedQueue f3939;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1203 f3940;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long f3941;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0658 f3942;

    public C0871(defpackage.C0964 r3) {
            r2 = this;
            r2.<init>()
            r0 = 300000000000(0x45d964b800, double:1.482196937524E-312)
            r2.f3941 = r0
            ᛴᛴᛸᛴ r3 = r3.m1908()
            r2.f3942 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = defpackage.AbstractC0508.f2502
            r3.append(r0)
            java.lang.String r0 = " ConnectionPool connection closer"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            ᛷᛱᛴᲈ r0 = new ᛷᛱᛴᲈ
            r0.<init>(r2, r3)
            r2.f3940 = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.f3939 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1854(defpackage.C1894 r6, long r7) {
            r5 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            java.util.ArrayList r0 = r6.f8210
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
            ᲇᛸᲁᲁ r3 = (defpackage.C2110) r3
            ᲇᛵᲇᲇ r4 = r6.f8204
            ᛱᛲᛶᲈ r4 = r4.f8854
            ᛴᲈᲀᲇ r4 = defpackage.AbstractC1692.f7550
            ᛴᲈᲀᲇ r4 = defpackage.AbstractC1692.f7550
            java.lang.Object r3 = r3.f9064
            r4.getClass()
            android.util.CloseGuard r3 = (android.util.CloseGuard) r3
            r3.warnIfOpen()
            r0.remove(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6
            long r2 = r5.f3941
            long r7 = r7 - r2
            r6.f8207 = r7
            return r1
        L3e:
            int r5 = r0.size()
            return r5
    }
}
