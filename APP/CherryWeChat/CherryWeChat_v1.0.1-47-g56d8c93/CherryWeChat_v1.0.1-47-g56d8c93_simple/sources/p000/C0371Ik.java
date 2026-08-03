package p000;

/* JADX INFO: renamed from: Ik */
/* JADX INFO: loaded from: classes.dex */
public final class C0371Ik extends AbstractC2634vj {
    private static final C0371Ik DEFAULT_INSTANCE = null;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        C0371Ik r0 = new C0371Ik();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0371Ik.class, r0);
    }

    /* JADX INFO: renamed from: B */
    public static C0328Hk m814B() {
        return (C0328Hk) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m815w(C0371Ik r0, EnumC2463rk r1) {
        r0.getClass();
        r0.hash_ = r1.m4953a();
    }

    /* JADX INFO: renamed from: x */
    public static void m816x(C0371Ik r0, int r1) {
        r0.tagSize_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static C0371Ik m817y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m818A() {
        return this.tagSize_;
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int r4) {
        switch(AbstractC0213Ey.m424v(r4)) {
            case 0: goto L31;
            case 1: goto L28;
            case 2: goto L26;
            case 3: goto L25;
            case 4: goto L23;
            case 5: goto L21;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        InterfaceC0466Kt r42 = PARSER;
        if (r42 == null) goto L9;
        return r42;
    L9:
        monitor-enter(C0371Ik.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0371Ik.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0371Ik r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0328Hk(DEFAULT_INSTANCE);
    L25:
        return new C0371Ik();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: z */
    public final EnumC2463rk m819z() {
        int r0 = this.hash_;
        if (r0 != 0) goto L5;
        EnumC2463rk r02 = EnumC2463rk.f8677b;
    L21:
        if (r02 == null) goto L23;
        return r02;
    L23:
        return EnumC2463rk.f8683h;
    L5:
        if (r0 != 1) goto L7;
        r02 = EnumC2463rk.f8678c;
        goto L21
    L7:
        if (r0 != 2) goto L9;
        r02 = EnumC2463rk.f8679d;
        goto L21
    L9:
        if (r0 != 3) goto L11;
        r02 = EnumC2463rk.f8680e;
        goto L21
    L11:
        if (r0 != 4) goto L13;
        r02 = EnumC2463rk.f8681f;
        goto L21
    L13:
        if (r0 == 5) goto L15;
        r02 = null;
        goto L21
    L15:
        r02 = EnumC2463rk.f8682g;
        goto L21
    }
}
