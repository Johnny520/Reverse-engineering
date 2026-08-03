package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5409<T> implements java.util.Comparator<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Comparator<T> f20050;

    public C5409(@Yue.InterfaceC4418 java.util.Comparator<T> r2) {
            r1 = this;
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20050 = r2
            return
    }

    @Override // java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f20050
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    @Yue.InterfaceC4418
    public final java.util.Comparator<T> reversed() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f20050
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Comparator<T> m20417() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f20050
            return r0
    }
}
