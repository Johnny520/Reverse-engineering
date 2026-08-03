package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1654 extends Yue.AbstractC0044 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1654.C1655 f5105 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f5106;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧۢ$ۥ, reason: contains not printable characters */
    public static final class C1655 implements Yue.InterfaceC1632.InterfaceC1637<Yue.C1654> {
        public C1655() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1655(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۟ۧۧۢ$ۥ r0 = new Yue.ۥ۟ۧۧۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1654.f5105 = r0
            return
    }

    public C1654(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۧۧۢ$ۥ r0 = Yue.C1654.f5105
            r1.<init>(r0)
            r1.f5106 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C1654 m7943(Yue.C1654 r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.f5106
        L6:
            Yue.ۥ۟ۧۧۢ r0 = r0.m7945(r1)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C1654
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۧۧۢ r4 = (Yue.C1654) r4
            java.lang.String r1 = r3.f5106
            java.lang.String r4 = r4.f5106
            boolean r4 = Yue.C3329.m13897(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5106
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineName("
            r0.append(r1)
            java.lang.String r1 = r2.f5106
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final java.lang.String m7944() {
            r1 = this;
            java.lang.String r0 = r1.f5106
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Yue.C1654 m7945(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۧۧۢ r0 = new Yue.ۥ۟ۧۧۢ
            r0.<init>(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final java.lang.String m7946() {
            r1 = this;
            java.lang.String r0 = r1.f5106
            return r0
    }
}
