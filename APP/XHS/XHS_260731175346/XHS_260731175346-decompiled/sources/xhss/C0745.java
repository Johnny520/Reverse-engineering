package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛳᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0745 implements java.util.Comparator {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0745 f2496 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0745 f2497 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2498;

    static {
            xhss.ᛸᛳᛷᛲ r0 = new xhss.ᛸᛳᛷᛲ
            r1 = 0
            r0.<init>(r1)
            xhss.C0745.f2496 = r0
            xhss.ᛸᛳᛷᛲ r0 = new xhss.ᛸᛳᛷᛲ
            r1 = 1
            r0.<init>(r1)
            xhss.C0745.f2497 = r0
            return
    }

    public /* synthetic */ C0745(int r1) {
            r0 = this;
            r0.f2498 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f2498
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r2.compareTo(r1)
            return r0
        Le:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.compareTo(r2)
            return r0
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
            r0 = this;
            int r0 = r0.f2498
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            xhss.ᛸᛳᛷᛲ r0 = xhss.C0745.f2496
            return r0
        L8:
            xhss.ᛸᛳᛷᛲ r0 = xhss.C0745.f2497
            return r0
    }
}
