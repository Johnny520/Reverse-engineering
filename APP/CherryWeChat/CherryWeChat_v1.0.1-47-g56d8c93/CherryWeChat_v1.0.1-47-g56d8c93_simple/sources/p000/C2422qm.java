package p000;

/* JADX INFO: renamed from: qm */
/* JADX INFO: loaded from: classes.dex */
public final class C2422qm extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final C2341oz f8484g;

    public C2422qm(C2341oz r2) {
        super(4);
        this.f8484g = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    public final long mo841a() {
        C2341oz r1 = this.f8484g;
        String r2 = r1.m4760j();
        int r5 = r2.length();     // Catch: IllegalArgumentException -> L37
        if (r5 != 0) goto L6;
    L5:
        Throwable r16 = null;
    L29:
        C2135kC r4 = r16;
    L32:
        if (r4 != 0) goto L34;
        AbstractC0042Az.m60G(r2);     // Catch: IllegalArgumentException -> L40
        throw r16;     // Catch: IllegalArgumentException -> L40
    L34:
        return r4.f7478a;
    L6:
        char r6 = r2.charAt(0);     // Catch: IllegalArgumentException -> L37
        if (AbstractC0585Nj.m1139g(r6, 48) >= 0) goto L13;
        int r7 = 1;
        if (r5 == 1) goto L5;
        if (r6 != '+') goto L5;
    L14:
        int r62 = 10;
        long r8 = 10;
        long r12 = 0;
        long r14 = 512409557603043100L;
    L15:
        if (r7 >= r5) goto L31;
        r16 = null;
        int r42 = Character.digit(r2.charAt(r7), r62);     // Catch: IllegalArgumentException -> L40
        if (r42 < 0) goto L29;
        if (Long.compareUnsigned(r12, r14) > 0) goto L23;
    L27:
        long r122 = r12 * r8;     // Catch: IllegalArgumentException -> L40
        int r18 = r7;
        long r63 = (((long) r42) & 4294967295L) + r122;     // Catch: IllegalArgumentException -> L40
        if (Long.compareUnsigned(r63, r122) < 0) goto L29;
        r12 = r63;
        r62 = 10;
        r7 = r18 + 1;     // Catch: IllegalArgumentException -> L40
        goto L15
    L23:
        if (r14 != 512409557603043100L) goto L29;
        r14 = Long.divideUnsigned(-1, r8);     // Catch: IllegalArgumentException -> L40
        if (Long.compareUnsigned(r12, r14) <= 0) goto L27;
    L38:
        C2341oz.m4750m(r1, "Failed to parse type 'ULong' for input '" + r2 + '\'', 0, 6);
        throw r16;
    L31:
        r16 = null;
        r4 = new C2135kC(r12);     // Catch: IllegalArgumentException -> L40
        goto L32
    L13:
        r7 = 0;
    L37:
        r16 = null;
        goto L38
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: j */
    public final int mo1770j(InterfaceC0126Cx r2) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public final int mo846p() {
        C2341oz r0 = this.f8484g;
        String r1 = r0.m4760j();
        C1402fC r3 = AbstractC1406fG.m2719s0(r1);     // Catch: IllegalArgumentException -> L9
        if (r3 != null) goto L6;
        AbstractC0042Az.m60G(r1);     // Catch: IllegalArgumentException -> L9
        throw null;     // Catch: IllegalArgumentException -> L9
    L6:
        return r3.f4976a;
    L9:
        C2341oz.m4750m(r0, "Failed to parse type 'UInt' for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public final byte mo847t() {
        C2341oz r0 = this.f8484g;
        String r1 = r0.m4760j();
        C1402fC r3 = AbstractC1406fG.m2719s0(r1);     // Catch: IllegalArgumentException -> L15
        if (r3 == null) goto L9;
        int r32 = r3.f4976a;     // Catch: IllegalArgumentException -> L15
        if (Integer.compareUnsigned(r32, 255) > 0) goto L9;
        C1130aC r4 = new C1130aC((byte) r32);     // Catch: IllegalArgumentException -> L15
    L10:
        if (r4 != null) goto L12;
        AbstractC0042Az.m60G(r1);     // Catch: IllegalArgumentException -> L15
        throw null;     // Catch: IllegalArgumentException -> L15
    L12:
        return r4.f3580a;
    L9:
        r4 = null;
    L15:
        C2341oz.m4750m(r0, "Failed to parse type 'UByte' for input '" + r1 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public final short mo849x() {
        C2341oz r0 = this.f8484g;
        String r1 = r0.m4760j();
        C1402fC r3 = AbstractC1406fG.m2719s0(r1);     // Catch: IllegalArgumentException -> L15
        if (r3 == null) goto L9;
        int r32 = r3.f4976a;     // Catch: IllegalArgumentException -> L15
        if (Integer.compareUnsigned(r32, 65535) > 0) goto L9;
        C2355pC r4 = new C2355pC((short) r32);     // Catch: IllegalArgumentException -> L15
    L10:
        if (r4 != null) goto L12;
        AbstractC0042Az.m60G(r1);     // Catch: IllegalArgumentException -> L15
        throw null;     // Catch: IllegalArgumentException -> L15
    L12:
        return r4.f8240a;
    L9:
        r4 = null;
    L15:
        C2341oz.m4750m(r0, "Failed to parse type 'UShort' for input '" + r1 + '\'', 0, 6);
        throw null;
    }
}
