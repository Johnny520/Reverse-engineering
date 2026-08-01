package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1199 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1126 f3855;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C1126 f3856;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3857;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f3858;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C1126 f3859;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3860;

    public C1199(xhss.C1126 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f3858 = r0
            r1.f3855 = r2
            r1.f3856 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m1919() {
            r4 = this;
            xhss.ᲈᛲᛷᛳ r0 = r4.f3856
            xhss.ᛵᛵᲇᛷ r0 = r0.f3636
            xhss.ᛲᲀᛴᲇ r0 = r0.m874()
            r1 = 6
            int r1 = r0.m880(r1)
            r2 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.f1739
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.f1737
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            int r4 = r4.f3857
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r4 != r0) goto L26
            return r2
        L26:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1920() {
            r1 = this;
            r0 = 1
            r1.f3858 = r0
            xhss.ᲈᛲᛷᛳ r0 = r1.f3855
            r1.f3856 = r0
            r0 = 0
            r1.f3860 = r0
            return
    }
}
