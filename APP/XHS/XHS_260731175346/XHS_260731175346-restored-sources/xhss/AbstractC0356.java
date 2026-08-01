package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛴᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0832 f1319 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1320;

    static {
            xhss.ᲀᛱᛸᛳ r0 = new xhss.ᲀᛱᛸᛳ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0356.f1319 = r0
            return
    }

    public AbstractC0356(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f1320 = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            xhss.ᛴᛴᛴᛷ r1 = (xhss.AbstractC0356) r1
            int r0 = r0.mo715(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public abstract java.lang.Object mo714();

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int mo715(xhss.AbstractC0356 r1) {
            r0 = this;
            java.lang.Object r0 = r0.mo714()
            java.lang.String r0 = r0.toString()
            java.lang.Object r1 = r1.mo714()
            java.lang.String r1 = r1.toString()
            int r0 = r0.compareTo(r1)
            int r0 = r0 * (-1)
            return r0
    }
}
