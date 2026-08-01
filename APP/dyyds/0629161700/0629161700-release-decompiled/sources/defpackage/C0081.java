package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0081 implements java.util.Comparator {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0081 f818 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0081 f819 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f820;

    static {
            ᛱᛴᛷᛷ r0 = new ᛱᛴᛷᛷ
            r1 = 0
            r0.<init>(r1)
            defpackage.C0081.f819 = r0
            ᛱᛴᛷᛷ r0 = new ᛱᛴᛷᛷ
            r1 = 1
            r0.<init>(r1)
            defpackage.C0081.f818 = r0
            return
    }

    public /* synthetic */ C0081(int r1) {
            r0 = this;
            r0.f820 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f820
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
            int r0 = r0.f820
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            ᛱᛴᛷᛷ r0 = defpackage.C0081.f819
            return r0
        L8:
            ᛱᛴᛷᛷ r0 = defpackage.C0081.f818
            return r0
    }
}
