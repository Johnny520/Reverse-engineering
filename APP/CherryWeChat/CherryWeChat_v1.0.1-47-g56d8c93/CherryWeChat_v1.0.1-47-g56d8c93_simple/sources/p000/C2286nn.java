package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: nn */
/* JADX INFO: loaded from: classes.dex */
public final class C2286nn extends AbstractC2634vj {
    private static final C2286nn DEFAULT_INSTANCE = null;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0458Kl key_;
    private int primaryKeyId_;

    static {
        C2286nn r0 = new C2286nn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2286nn.class, r0);
    }

    public C2286nn() {
        this.key_ = C0381Iu.f1312d;
    }

    /* JADX INFO: renamed from: C */
    public static C2153kn m4611C() {
        return (C2153kn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C2286nn m4612D(ByteArrayInputStream r2, C0839Tg r3) {
        AbstractC2634vj r22 = AbstractC2634vj.m5150s(DEFAULT_INSTANCE, new C2096ja(r2), r3);
        AbstractC2634vj.m5145g(r22);
        return (C2286nn) r22;
    }

    /* JADX INFO: renamed from: E */
    public static C2286nn m4613E(byte[] r7, C0839Tg r8) {
        C2286nn r0 = DEFAULT_INSTANCE;
        int r5 = r7.length;
        AbstractC2634vj r2 = r0.m5157q();
        C0338Hu r02 = C0338Hu.f1144c;     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        r02.getClass();     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        InterfaceC2253mx r1 = r02.m725a(r2.getClass());     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        C0091C4 r6 = new C0091C4();     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        r8.getClass();     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        r1.mo1077g(r2, r7, 0, r5, r6);     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        r1.mo1074d(r2);     // Catch: IndexOutOfBoundsException -> L6 IOException -> L8 C0743RC -> L15 C0673Pl -> L18
        AbstractC2634vj.m5145g(r2);
        return (C2286nn) r2;
    L18:
        e = move-exception;
        if (e.f2146a == true) goto L22;
        throw e;
    L22:
        throw new C0673Pl(e.getMessage(), e);
    L15:
        e = move-exception;
        throw new C0673Pl(e.getMessage());
    L8:
        e = move-exception;
        if ((e.getCause() instanceof C0673Pl) == false) goto L14;
        throw ((C0673Pl) e.getCause());
    L14:
        throw new C0673Pl(e.getMessage(), e);
    L7:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: w */
    public static void m4614w(C2286nn r0, int r1) {
        r0.primaryKeyId_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m4615x(C2286nn r2, C2243mn r3) {
        r2.getClass();
        InterfaceC0458Kl r0 = r2.key_;
        if (((AbstractC0172E) r0).f453a == true) goto L9;
        int r1 = r0.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        r2.key_ = r0.mo716f(r12);
        goto L9
    L7:
        r12 = r1 * 2;
    L9:
        r2.key_.add(r3);
    }

    /* JADX INFO: renamed from: A */
    public final List m4616A() {
        return this.key_;
    }

    /* JADX INFO: renamed from: B */
    public final int m4617B() {
        return this.primaryKeyId_;
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
        monitor-enter(C2286nn.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2286nn.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2286nn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C2243mn.class});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C2153kn(DEFAULT_INSTANCE);
    L25:
        return new C2286nn();
    L31:
        return (byte) 1;
    }

    /* JADX INFO: renamed from: y */
    public final C2243mn m4618y(int r2) {
        return (C2243mn) this.key_.get(r2);
    }

    /* JADX INFO: renamed from: z */
    public final int m4619z() {
        return this.key_.size();
    }
}
