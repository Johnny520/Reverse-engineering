package p000;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: Uf */
/* JADX INFO: loaded from: classes.dex */
public final class C0881Uf extends AbstractC2634vj {
    private static final C0881Uf DEFAULT_INSTANCE = null;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER;
    private AbstractC2744y6 encryptedKeyset_;
    private C2509sn keysetInfo_;

    static {
        C0881Uf r0 = new C0881Uf();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C0881Uf.class, r0);
    }

    public C0881Uf() {
        this.encryptedKeyset_ = AbstractC2744y6.f9369b;
    }

    /* JADX INFO: renamed from: A */
    public static C0881Uf m1727A(ByteArrayInputStream r2, C0839Tg r3) {
        AbstractC2634vj r22 = AbstractC2634vj.m5150s(DEFAULT_INSTANCE, new C2096ja(r2), r3);
        AbstractC2634vj.m5145g(r22);
        return (C0881Uf) r22;
    }

    /* JADX INFO: renamed from: w */
    public static void m1728w(C0881Uf r0, C2701x6 r1) {
        r0.getClass();
        r0.encryptedKeyset_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m1729x(C0881Uf r0, C2509sn r1) {
        r0.getClass();
        r0.keysetInfo_ = r1;
    }

    /* JADX INFO: renamed from: z */
    public static C0838Tf m1730z() {
        return (C0838Tf) DEFAULT_INSTANCE.m5152h();
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
        monitor-enter(C0881Uf.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C0881Uf.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C0881Uf r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C0838Tf(DEFAULT_INSTANCE);
    L25:
        return new C0881Uf();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC2744y6 m1731y() {
        return this.encryptedKeyset_;
    }
}
