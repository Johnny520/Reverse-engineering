package p000;

/* JADX INFO: renamed from: Qv */
/* JADX INFO: loaded from: classes.dex */
public final class C0726Qv extends AbstractC2634vj {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C0726Qv DEFAULT_INSTANCE = null;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER;
    private String configName_;
    private InterfaceC0458Kl entry_;

    static {
        C0726Qv r0 = new C0726Qv();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0726Qv.class, r0);
    }

    public C0726Qv() {
        this.configName_ = "";
        this.entry_ = C0381Iu.f1312d;
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
        monitor-enter(C0726Qv.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0726Qv.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0726Qv r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C1464gn.class});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 4);
    L25:
        return new C0726Qv();
    L31:
        return (byte) 1;
    }
}
