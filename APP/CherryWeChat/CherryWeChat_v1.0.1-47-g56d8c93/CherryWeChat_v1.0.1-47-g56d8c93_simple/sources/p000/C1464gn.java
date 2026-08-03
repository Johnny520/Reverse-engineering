package p000;

/* JADX INFO: renamed from: gn */
/* JADX INFO: loaded from: classes.dex */
public final class C1464gn extends AbstractC2634vj {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final C1464gn DEFAULT_INSTANCE = null;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private String catalogueName_;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_;
    private String typeUrl_;

    static {
        C1464gn r0 = new C1464gn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C1464gn.class, r0);
    }

    public C1464gn() {
        this.primitiveName_ = "";
        this.typeUrl_ = "";
        this.catalogueName_ = "";
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int r5) {
        switch(AbstractC0213Ey.m424v(r5)) {
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
        InterfaceC0466Kt r52 = PARSER;
        if (r52 == null) goto L9;
        return r52;
    L9:
        monitor-enter(C1464gn.class);
        InterfaceC0466Kt r53 = PARSER;     // Catch: Throwable -> L13
        if (r53 != null) goto L15;
        r53 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r53;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C1464gn.class);     // Catch: Throwable -> L13
        return r53;
    L13:
        th = move-exception;
        throw th;
    L26:
        C1464gn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C1441g7(DEFAULT_INSTANCE, 1);
    L25:
        return new C1464gn();
    L31:
        return (byte) 1;
    }
}
