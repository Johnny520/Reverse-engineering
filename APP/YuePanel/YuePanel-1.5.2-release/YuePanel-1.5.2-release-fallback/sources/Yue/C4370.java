package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4370 implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4370 f13916 = null;

    static {
            Yue.ۥۡۢۡ r0 = new Yue.ۥۡۢۡ
            r0.<init>()
            Yue.C4370.f13916 = r0
            return
    }

    public C4370() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Comparable<? super java.lang.Object> r1, java.lang.Comparable<? super java.lang.Object> r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = r0.m17211(r1, r2)
            return r1
    }

    @Override // java.util.Comparator
    @Yue.InterfaceC4418
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
            r1 = this;
            Yue.ۥۡۦۨۧ r0 = Yue.C5408.f20049
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m17211(@Yue.InterfaceC4418 java.lang.Comparable<java.lang.Object> r2, @Yue.InterfaceC4418 java.lang.Comparable<java.lang.Object> r3) {
            r1 = this;
            java.lang.String r0 = "a"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "b"
            Yue.C3329.m13906(r3, r0)
            int r2 = r2.compareTo(r3)
            return r2
    }
}
