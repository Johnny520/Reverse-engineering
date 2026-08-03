package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3612 implements Yue.InterfaceC5609<java.lang.String> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.BufferedReader f11520;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۥ$ۥ, reason: contains not printable characters */
    public static final class C3613 implements java.util.Iterator<java.lang.String>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.lang.String f11521;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f11522;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3612 f11523;

        public C3613(Yue.C3612 r1) {
                r0 = this;
                r0.f11523 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.lang.String r0 = r2.f11521
                r1 = 1
                if (r0 != 0) goto L19
                boolean r0 = r2.f11522
                if (r0 != 0) goto L19
                Yue.ۥ۠ۧۡۥ r0 = r2.f11523
                java.io.BufferedReader r0 = Yue.C3612.m14608(r0)
                java.lang.String r0 = r0.readLine()
                r2.f11521 = r0
                if (r0 != 0) goto L19
                r2.f11522 = r1
            L19:
                java.lang.String r0 = r2.f11521
                if (r0 == 0) goto L1e
                goto L1f
            L1e:
                r1 = 0
            L1f:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.m14609()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String m14609() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                java.lang.String r0 = r2.f11521
                r1 = 0
                r2.f11521 = r1
                Yue.C3329.m13903(r0)
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    public C3612(@Yue.InterfaceC4418 java.io.BufferedReader r2) {
            r1 = this;
            java.lang.String r0 = "reader"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f11520 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.io.BufferedReader m14608(Yue.C3612 r0) {
            java.io.BufferedReader r0 = r0.f11520
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            Yue.ۥ۠ۧۡۥ$ۥ r0 = new Yue.ۥ۠ۧۡۥ$ۥ
            r0.<init>(r1)
            return r0
    }
}
