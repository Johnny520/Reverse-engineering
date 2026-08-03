package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"UnknownNullness"})
public interface InterfaceC4877<T> {
    @android.annotation.SuppressLint({"MissingNullability"})
    static <T> Yue.InterfaceC4877<T> isEqual(@android.annotation.SuppressLint({"MissingNullability"}) java.lang.Object r1) {
            if (r1 != 0) goto L8
            Yue.ۥۣۡۤۧ r1 = new Yue.ۥۣۡۤۧ
            r1.<init>()
            goto Le
        L8:
            Yue.ۥۡۤۧۤ r0 = new Yue.ۥۡۤۧۤ
            r0.<init>(r1)
            r1 = r0
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    static /* synthetic */ boolean m19199(Yue.InterfaceC4877 r0, Yue.InterfaceC4877 r1, java.lang.Object r2) {
            boolean r0 = r0.m19209(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    static /* synthetic */ boolean m19200(java.lang.Object r0) {
            boolean r0 = java.util.Objects.isNull(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    static /* synthetic */ boolean m19201(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = m19204(r0, r1)
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    static <T> Yue.InterfaceC4877<T> m19202(@android.annotation.SuppressLint({"MissingNullability"}) Yue.InterfaceC4877<? super T> r0) {
            java.util.Objects.requireNonNull(r0)
            Yue.ۥۡۤۧۧ r0 = r0.negate()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    static /* synthetic */ boolean m19203(Yue.InterfaceC4877 r0, java.lang.Object r1) {
            boolean r0 = r0.m19208(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    static /* synthetic */ boolean m19204(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    static /* synthetic */ boolean m19205(java.lang.Object r0) {
            boolean r0 = m19200(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    static /* synthetic */ boolean m19206(Yue.InterfaceC4877 r0, Yue.InterfaceC4877 r1, java.lang.Object r2) {
            boolean r0 = r0.m19211(r1, r2)
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    default Yue.InterfaceC4877<T> negate() {
            r1 = this;
            Yue.ۥۡۤۧۦ r0 = new Yue.ۥۡۤۧۦ
            r0.<init>(r1)
            return r0
    }

    boolean test(T r1);

    @android.annotation.SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    default Yue.InterfaceC4877<T> m19207(@android.annotation.SuppressLint({"MissingNullability"}) Yue.InterfaceC4877<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            Yue.ۥۡۤۧۢ r0 = new Yue.ۥۡۤۧۢ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /* synthetic */ default boolean m19208(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.test(r1)
            r1 = r1 ^ 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /* synthetic */ default boolean m19209(Yue.InterfaceC4877 r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.test(r3)
            if (r0 != 0) goto Lf
            boolean r2 = r2.test(r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    default Yue.InterfaceC4877<T> m19210(@android.annotation.SuppressLint({"MissingNullability"}) Yue.InterfaceC4877<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            Yue.ۥۡۤۧۥ r0 = new Yue.ۥۡۤۧۥ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    /* synthetic */ default boolean m19211(Yue.InterfaceC4877 r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.test(r3)
            if (r0 == 0) goto Le
            boolean r2 = r2.test(r3)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }
}
