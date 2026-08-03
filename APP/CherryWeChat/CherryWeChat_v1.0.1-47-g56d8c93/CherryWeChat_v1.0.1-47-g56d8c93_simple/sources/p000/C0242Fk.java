package p000;

/* JADX INFO: renamed from: Fk */
/* JADX INFO: loaded from: classes.dex */
public final class C0242Fk extends AbstractC2634vj {
    private static final C0242Fk DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private C0371Ik params_;
    private int version_;

    static {
        C0242Fk r0 = new C0242Fk();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0242Fk.class, r0);
    }

    /* JADX INFO: renamed from: B */
    public static C0199Ek m508B() {
        return (C0199Ek) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: C */
    public static C0242Fk m509C(AbstractC2744y6 r1, C0839Tg r2) {
        return (C0242Fk) AbstractC2634vj.m5149r(DEFAULT_INSTANCE, r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public static void m510w(C0242Fk r0, C0371Ik r1) {
        r0.getClass();
        r0.params_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m511x(C0242Fk r0, int r1) {
        r0.keySize_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static C0242Fk m512y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C0371Ik m513A() {
        C0371Ik r0 = this.params_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0371Ik.m817y();
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
        monitor-enter(C0242Fk.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0242Fk.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0242Fk r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0199Ek(DEFAULT_INSTANCE);
    L25:
        return new C0242Fk();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: z */
    public final int m514z() {
        return this.keySize_;
    }
}
