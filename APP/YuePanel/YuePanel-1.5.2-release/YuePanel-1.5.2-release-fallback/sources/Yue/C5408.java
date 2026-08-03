package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5408 implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5408 f20049 = null;

    static {
            Yue.ۥۡۦۨۧ r0 = new Yue.ۥۡۦۨۧ
            r0.<init>()
            Yue.C5408.f20049 = r0
            return
    }

    public C5408() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Comparable<? super java.lang.Object> r1, java.lang.Comparable<? super java.lang.Object> r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = r0.m20416(r1, r2)
            return r1
    }

    @Override // java.util.Comparator
    @Yue.InterfaceC4418
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
            r1 = this;
            Yue.ۥۡۢۡ r0 = Yue.C4370.f13916
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m20416(@Yue.InterfaceC4418 java.lang.Comparable<java.lang.Object> r2, @Yue.InterfaceC4418 java.lang.Comparable<java.lang.Object> r3) {
            r1 = this;
            java.lang.String r0 = "a"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "b"
            Yue.C3329.m13906(r3, r0)
            int r2 = r3.compareTo(r2)
            return r2
    }
}
