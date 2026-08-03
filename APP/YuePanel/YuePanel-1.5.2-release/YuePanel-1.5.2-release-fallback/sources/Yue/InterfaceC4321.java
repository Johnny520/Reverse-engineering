package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4321 {

    /* JADX INFO: renamed from: Yue.ۥۡۡۧۧ$ۥ, reason: contains not printable characters */
    public static final class C4322 {
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m16936() {
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m16937(Yue.InterfaceC4321 r0, java.lang.Object r1, Yue.InterfaceC1598 r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Lc
                r3 = r3 & 1
                if (r3 == 0) goto L7
                r1 = 0
            L7:
                java.lang.Object r0 = r0.mo16930(r1, r2)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lock"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m16938(Yue.InterfaceC4321 r0, java.lang.Object r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo16931(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: tryLock"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m16939(Yue.InterfaceC4321 r0, java.lang.Object r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.mo16933(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: unlock"
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    java.lang.Object mo16930(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    boolean mo16931(@Yue.InterfaceC4543 java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo16932();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo16933(@Yue.InterfaceC4543 java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    boolean mo16934(@Yue.InterfaceC4418 java.lang.Object r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    Yue.InterfaceC5563<java.lang.Object, Yue.InterfaceC4321> mo16935();
}
