package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public final class C6185 implements Yue.InterfaceC1632.InterfaceC1637<Yue.C6183<?>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.ThreadLocal<?> f22163;

    public C6185(@Yue.InterfaceC4418 java.lang.ThreadLocal<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f22163 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6185 m23139(Yue.C6185 r0, java.lang.ThreadLocal r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.ThreadLocal<?> r1 = r0.f22163
        L6:
            Yue.ۥۢۡۢ r0 = r0.m23141(r1)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C6185
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۢۡۢ r4 = (Yue.C6185) r4
            java.lang.ThreadLocal<?> r1 = r3.f22163
            java.lang.ThreadLocal<?> r4 = r4.f22163
            boolean r4 = Yue.C3329.m13897(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.f22163
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocalKey(threadLocal="
            r0.append(r1)
            java.lang.ThreadLocal<?> r1 = r2.f22163
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.ThreadLocal<?> m23140() {
            r1 = this;
            java.lang.ThreadLocal<?> r0 = r1.f22163
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C6185 m23141(@Yue.InterfaceC4418 java.lang.ThreadLocal<?> r2) {
            r1 = this;
            Yue.ۥۢۡۢ r0 = new Yue.ۥۢۡۢ
            r0.<init>(r2)
            return r0
    }
}
