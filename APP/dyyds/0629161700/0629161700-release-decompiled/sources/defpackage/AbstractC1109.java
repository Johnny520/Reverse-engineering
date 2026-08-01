package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1109 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C2229 f4975 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f4976;

    static {
            ᲈᛴᛸᛴ r0 = new ᲈᛴᛸᛴ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC1109.f4975 = r0
            return
    }

    public AbstractC1109(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f4976 = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            ᛶᛷᛵᛸ r1 = (defpackage.AbstractC1109) r1
            int r0 = r0.mo1856(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public int mo1856(defpackage.AbstractC1109 r1) {
            r0 = this;
            java.lang.Object r0 = r0.mo1494()
            java.lang.String r0 = r0.toString()
            java.lang.Object r1 = r1.mo1494()
            java.lang.String r1 = r1.toString()
            int r0 = r0.compareTo(r1)
            int r0 = r0 * (-1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract java.lang.Object mo1494();
}
