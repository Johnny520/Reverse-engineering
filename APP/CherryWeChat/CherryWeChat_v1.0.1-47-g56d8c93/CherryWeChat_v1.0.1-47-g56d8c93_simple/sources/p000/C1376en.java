package p000;

/* JADX INFO: renamed from: en */
/* JADX INFO: loaded from: classes.dex */
public final class C1376en extends AbstractC2634vj {
    private static final C1376en DEFAULT_INSTANCE = null;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_;
    private AbstractC2744y6 value_;

    static {
        C1376en r0 = new C1376en();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C1376en.class, r0);
    }

    public C1376en() {
        this.typeUrl_ = "";
        this.value_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: D */
    public static C1333dn m2660D() {
        return (C1333dn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m2661w(C1376en r0, String r1) {
        r0.getClass();
        r1.getClass();
        r0.typeUrl_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m2662x(C1376en r0, C2701x6 r1) {
        r0.getClass();
        r0.value_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static void m2663y(C1376en r0, EnumC2773yt r1) {
        r0.getClass();
        r0.outputPrefixType_ = r1.m5345b();
    }

    /* JADX INFO: renamed from: z */
    public static C1376en m2664z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final EnumC2773yt m2665A() {
        EnumC2773yt r0 = EnumC2773yt.m5344a(this.outputPrefixType_);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return EnumC2773yt.f9422g;
    }

    /* JADX INFO: renamed from: B */
    public final String m2666B() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC2744y6 m2667C() {
        return this.value_;
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
        monitor-enter(C1376en.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C1376en.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C1376en r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1333dn(DEFAULT_INSTANCE);
    L25:
        return new C1376en();
    L31:
        return (byte) 1;
    }
}
