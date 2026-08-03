package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
public final class C1652 extends Yue.AbstractC0044 implements Yue.InterfaceC6176<java.lang.String> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1652.C1653 f5103 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f5104;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧۡ$ۥ, reason: contains not printable characters */
    public static final class C1653 implements Yue.InterfaceC1632.InterfaceC1637<Yue.C1652> {
        public C1653() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1653(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۟ۧۧۡ$ۥ r0 = new Yue.ۥ۟ۧۧۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1652.f5103 = r0
            return
    }

    public C1652(long r2) {
            r1 = this;
            Yue.ۥ۟ۧۧۡ$ۥ r0 = Yue.C1652.f5103
            r1.<init>(r0)
            r1.f5104 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C1652 m7935(Yue.C1652 r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.f5104
        L6:
            Yue.ۥ۟ۧۧۡ r0 = r0.m7939(r1)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof Yue.C1652
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۧۧۡ r8 = (Yue.C1652) r8
            long r3 = r7.f5104
            long r5 = r8.f5104
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.f5104
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineId("
            r0.append(r1)
            long r1 = r3.f5104
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC6176
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ java.lang.String mo7936(Yue.InterfaceC1632 r1) {
            r0 = this;
            java.lang.String r1 = r0.m7942(r1)
            return r1
    }

    @Override // Yue.InterfaceC6176
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ void mo7937(Yue.InterfaceC1632 r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.m7941(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final long m7938() {
            r2 = this;
            long r0 = r2.f5104
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Yue.C1652 m7939(long r2) {
            r1 = this;
            Yue.ۥ۟ۧۧۡ r0 = new Yue.ۥ۟ۧۧۡ
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final long m7940() {
            r2 = this;
            long r0 = r2.f5104
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m7941(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.String r2) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public java.lang.String m7942(@Yue.InterfaceC4418 Yue.InterfaceC1632 r9) {
            r8 = this;
            Yue.ۥ۟ۧۧۢ$ۥ r0 = Yue.C1654.f5105
            Yue.ۥ۟ۧۦۥ$ۥ۟ r9 = r9.get(r0)
            Yue.ۥ۟ۧۧۢ r9 = (Yue.C1654) r9
            if (r9 == 0) goto L10
            java.lang.String r9 = r9.m7946()
            if (r9 != 0) goto L12
        L10:
            java.lang.String r9 = "coroutine"
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r7 = r0.getName()
            r5 = 6
            r6 = 0
            java.lang.String r2 = " @"
            r3 = 0
            r4 = 0
            r1 = r7
            int r1 = Yue.C5989.m22378(r1, r2, r3, r4, r5, r6)
            if (r1 >= 0) goto L2b
            int r1 = r7.length()
        L2b:
            int r2 = r9.length()
            int r2 = r2 + r1
            int r2 = r2 + 10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = 0
            java.lang.String r1 = r7.substring(r2, r1)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r1, r2)
            r3.append(r1)
            java.lang.String r1 = " @"
            r3.append(r1)
            r3.append(r9)
            r9 = 35
            r3.append(r9)
            long r1 = r8.f5104
            r3.append(r1)
            java.lang.String r9 = r3.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r9, r1)
            r0.setName(r9)
            return r7
    }
}
