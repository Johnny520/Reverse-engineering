package p000;

/* JADX INFO: renamed from: Vm */
/* JADX INFO: loaded from: classes.dex */
public final class C0931Vm extends AbstractC2634vj {
    private static final C0931Vm DEFAULT_INSTANCE = null;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_;
    private AbstractC2744y6 value_;

    static {
        C0931Vm r0 = new C0931Vm();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0931Vm.class, r0);
    }

    public C0931Vm() {
        this.typeUrl_ = "";
        this.value_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: D */
    public static C0845Tm m1786D() {
        return (C0845Tm) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m1787w(C0931Vm r0, String r1) {
        r0.getClass();
        r1.getClass();
        r0.typeUrl_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m1788x(C0931Vm r0, C2701x6 r1) {
        r0.getClass();
        r0.value_ = r1;
    }

    /* JADX INFO: renamed from: y */
    public static void m1789y(C0931Vm r1, EnumC0888Um r2) {
        r1.getClass();
        if (r2 == EnumC0888Um.f2781g) goto L6;
        r1.keyMaterialType_ = r2.f2783a;
        return;
    L6:
        r2.getClass();
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX INFO: renamed from: z */
    public static C0931Vm m1790z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final EnumC0888Um m1791A() {
        int r0 = this.keyMaterialType_;
        if (r0 != 0) goto L5;
        EnumC0888Um r02 = EnumC0888Um.f2776b;
    L18:
        if (r02 == null) goto L20;
        return r02;
    L20:
        return EnumC0888Um.f2781g;
    L5:
        if (r0 != 1) goto L7;
        r02 = EnumC0888Um.f2777c;
        goto L18
    L7:
        if (r0 != 2) goto L9;
        r02 = EnumC0888Um.f2778d;
        goto L18
    L9:
        if (r0 != 3) goto L11;
        r02 = EnumC0888Um.f2779e;
        goto L18
    L11:
        if (r0 == 4) goto L13;
        r02 = null;
        goto L18
    L13:
        r02 = EnumC0888Um.f2780f;
        goto L18
    }

    /* JADX INFO: renamed from: B */
    public final String m1792B() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC2744y6 m1793C() {
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
        monitor-enter(C0931Vm.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0931Vm.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0931Vm r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0845Tm(DEFAULT_INSTANCE);
    L25:
        return new C0931Vm();
    L31:
        return (byte) 1;
    }
}
