package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5387
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC5611<T> {
    public AbstractC5611() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public abstract java.lang.Object mo20973(T r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Object m20979(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r0.mo20974(r1, r2)
            java.lang.Object r2 = Yue.C3341.m13947()
            if (r1 != r2) goto Lf
            return r1
        Lf:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.lang.Object m20980(@Yue.InterfaceC4418 java.lang.Iterable<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        L10:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r1.mo20974(r2, r3)
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L1f
            return r2
        L1f:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract java.lang.Object mo20974(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);
}
