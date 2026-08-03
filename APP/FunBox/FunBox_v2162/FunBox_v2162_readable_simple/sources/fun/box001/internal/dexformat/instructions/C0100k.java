package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0174d;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.error.DexGenerationException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: g.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0100k {

    /* JADX INFO: renamed from: a */
    private final C0016a f382a;

    /* JADX INFO: renamed from: b */
    private final C0079B f383b;

    /* JADX INFO: renamed from: c */
    private final C0079B f384c;

    /* JADX INFO: renamed from: d */
    private final C0079B f385d;

    /* JADX INFO: renamed from: e */
    private final C0079B f386e;

    /* JADX INFO: renamed from: f */
    private final C0113x f387f;

    /* JADX INFO: renamed from: g */
    private final C0113x f388g;

    /* JADX INFO: renamed from: h */
    private final C0113x f389h;

    /* JADX INFO: renamed from: i */
    private final C0104o f390i;

    /* JADX INFO: renamed from: j */
    private final C0115z f391j;

    /* JADX INFO: renamed from: k */
    private final C0091b f392k;

    /* JADX INFO: renamed from: l */
    private final C0079B f393l;

    /* JADX INFO: renamed from: m */
    private final C0091b f394m;

    /* JADX INFO: renamed from: n */
    private final C0113x f395n;

    /* JADX INFO: renamed from: o */
    private final C0079B f396o;

    /* JADX INFO: renamed from: p */
    private final C0113x f397p;

    /* JADX INFO: renamed from: q */
    private final AbstractC0082E[] f398q;

    /* JADX INFO: renamed from: r */
    private int f399r;

    public C0100k(C0016a r19) {
        this.f382a = r19;
        C0113x r2 = new C0113x(this, 4);
        this.f397p = r2;
        boolean r5 = true;
        C0079B r11 = new C0079B(null, this, 4, 1);
        this.f384c = r11;
        C0079B r10 = new C0079B("word_data", this, 4, 2);
        this.f383b = r10;
        C0079B r12 = new C0079B("string_data", this, 1, 3);
        this.f386e = r12;
        C0079B r14 = new C0079B(null, this, 1, 1);
        this.f393l = r14;
        C0079B r13 = new C0079B("byte_data", this, 1, 2);
        this.f396o = r13;
        C0113x r3 = new C0113x(this, 2);
        this.f387f = r3;
        C0113x r4 = new C0113x(this, 3);
        this.f388g = r4;
        C0113x r6 = new C0113x(this, 1);
        this.f389h = r6;
        C0104o r7 = new C0104o(this);
        this.f390i = r7;
        C0115z r8 = new C0115z(this);
        this.f391j = r8;
        C0091b r9 = new C0091b(this, 1);
        this.f392k = r9;
        C0079B r15 = new C0079B("map", this, 4, 1);
        this.f385d = r15;
        if (r19.f64a >= 26) goto L6;
        r5 = false;
    L6:
        if (r5 == false) goto L8;
        C0091b r132 = new C0091b(this, 0);
        this.f394m = r132;
        C0113x r52 = new C0113x(this, 0);
        this.f395n = r52;
        this.f398q = new AbstractC0082E[]{r2, r3, r4, r6, r7, r8, r9, r132, r52, r10, r11, r12, r13, r14, r15};
    L9:
        this.f399r = -1;
        return;
    L8:
        this.f394m = null;
        this.f395n = null;
        this.f398q = new AbstractC0082E[]{r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15};
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public final void m291a(C0094e r2) {
        this.f392k.m261p(r2);
    }

    /* JADX INFO: renamed from: b */
    final AbstractC0107r m292b(AbstractC0171a r2) {
        if ((r2 instanceof C0190t) == false) goto L7;
        return this.f387f.m327p(r2);
    L7:
        if ((r2 instanceof C0191u) == false) goto L11;
        return this.f388g.m327p(r2);
    L11:
        if ((r2 instanceof AbstractC0174d) == true) goto L13;
        return null;
    L13:
        return this.f391j.m337p(r2);
    }

    /* JADX INFO: renamed from: c */
    final C0079B m293c() {
        return this.f396o;
    }

    /* JADX INFO: renamed from: d */
    final C0079B m294d() {
        return this.f393l;
    }

    /* JADX INFO: renamed from: e */
    public final C0091b m295e() {
        return this.f392k;
    }

    /* JADX INFO: renamed from: f */
    public final C0016a m296f() {
        return this.f382a;
    }

    /* JADX INFO: renamed from: g */
    public final C0104o m297g() {
        return this.f390i;
    }

    /* JADX INFO: renamed from: h */
    public final int m298h() {
        int r0 = this.f399r;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: renamed from: i */
    final C0079B m299i() {
        return this.f383b;
    }

    /* JADX INFO: renamed from: j */
    final C0079B m300j() {
        return this.f385d;
    }

    /* JADX INFO: renamed from: k */
    final C0079B m301k() {
        return this.f385d;
    }

    /* JADX INFO: renamed from: l */
    public final C0113x m302l() {
        return this.f395n;
    }

    /* JADX INFO: renamed from: m */
    public final C0115z m303m() {
        return this.f391j;
    }

    /* JADX INFO: renamed from: n */
    final C0113x m304n() {
        return this.f389h;
    }

    /* JADX INFO: renamed from: o */
    final C0079B m305o() {
        return this.f386e;
    }

    /* JADX INFO: renamed from: p */
    final C0113x m306p() {
        return this.f387f;
    }

    /* JADX INFO: renamed from: q */
    public final C0113x m307q() {
        return this.f388g;
    }

    /* JADX INFO: renamed from: r */
    final C0079B m308r() {
        return this.f384c;
    }

    /* JADX INFO: renamed from: s */
    final C0079B m309s() {
        return this.f383b;
    }

    /* JADX INFO: renamed from: t */
    final void m310t(AbstractC0171a r2) {
        if (r2 == null) goto L14;
        if ((r2 instanceof C0190t) == false) goto L7;
        this.f387f.m332u((C0190t) r2);
        return;
    L7:
        if ((r2 instanceof C0191u) == false) goto L10;
        this.f388g.m333v((C0191u) r2);
        return;
    L10:
        if ((r2 instanceof AbstractC0174d) == false) goto L17;
        this.f391j.m339r((AbstractC0174d) r2);
        return;
    L17:
        return;
    L14:
        throw new NullPointerException("cst == null");
    }

    /* JADX INFO: renamed from: u */
    public final byte[] m311u() {
        this.f392k.m248g();
        this.f393l.m248g();
        this.f383b.m248g();
        C0016a r0 = this.f382a;
        boolean r3 = true;
        int r4 = 0;
        if (r0.f64a < 26) goto L5;
        boolean r1 = true;
    L6:
        C0091b r5 = this.f394m;
        if (r1 == false) goto L9;
        r5.m248g();
    L9:
        this.f396o.m248g();
        if (r0.f64a >= 26) goto L13;
        r3 = false;
    L13:
        C0113x r02 = this.f395n;
        if (r3 == false) goto L16;
        r02.m248g();
    L16:
        this.f391j.m248g();
        this.f390i.m248g();
        this.f389h.m248g();
        this.f384c.m248g();
        this.f388g.m248g();
        this.f387f.m248g();
        this.f386e.m248g();
        this.f397p.m248g();
        AbstractC0082E[] r12 = this.f398q;
        int r2 = r12.length;
        int r32 = 0;
        int r6 = 0;
    L18:
        if (r32 >= r2) goto L41;
        AbstractC0082E r8 = r12[r32];
        if (r8 == r5) goto L23;
        if (r8 == r02) goto L23;
    L25:
        int r9 = r8.m249i(r6);
        if (r9 < r6) goto L40;
        C0079B r62 = this.f385d;
        if (r8 == r62) goto L88;
    L30:
        if ((r8 instanceof C0079B) == false) goto L34;
        ((C0079B) r8).m231q();     // Catch: RuntimeException -> L36
    L34:
        r6 = r8.mo227l() + r9;
    L35:
        r32 = r32 + 1;
    L36:
        e = move-exception;
        throw DexGenerationException.m22b("...while writing section " + r32, e);
    L88:
        C0110u.m323m(r12, r62);     // Catch: RuntimeException -> L36
        r62.m248g();     // Catch: RuntimeException -> L36
        goto L30
    L40:
        throw new RuntimeException("bogus placement for section " + r32);
    L23:
        if (r8.mo225f().isEmpty() == false) goto L25;
    L41:
        this.f399r = r6;
        byte[] r33 = new byte[r6];
        C0202d r63 = new C0202d(r33);
    L42:
        if (r4 >= r2) goto L64;
        AbstractC0082E r92 = r12[r4];     // Catch: RuntimeException -> L56
        if (r92 == r5) goto L48;
        if (r92 == r02) goto L48;
    L50:
        int r10 = r92.m247e() - r63.m491j();     // Catch: RuntimeException -> L56
        if (r10 < 0) goto L55;
        r63.m501u(r10);     // Catch: RuntimeException -> L56
        r92.m252m(r63);     // Catch: RuntimeException -> L56
    L53:
        r4 = r4 + 1;     // Catch: RuntimeException -> L56
        goto L42
    L55:
        throw new DexGenerationException("excess write of " + (-r10), null);     // Catch: RuntimeException -> L56
    L48:
        if (r92.mo225f().isEmpty() == false) goto L50;
    L56:
        e = move-exception;
        if ((e instanceof DexGenerationException) == false) goto L60;
        DexGenerationException r03 = (DexGenerationException) e;
    L61:
        r03.m23a("...while writing section " + r4);
        throw r03;
    L60:
        r03 = new DexGenerationException(null, e);
        goto L61
    L64:
        if (r63.m491j() != this.f399r) goto L81;
        int r04 = r63.m491j();
        MessageDigest r22 = MessageDigest.getInstance("SHA-1");     // Catch: NoSuchAlgorithmException -> L77
        r22.update(r33, 32, r04 - 32);
        int r23 = r22.digest(r33, 12, 20);     // Catch: DigestException -> L74
        if (r23 != 20) goto L73;
        int r13 = r63.m491j();
        Adler32 r24 = new Adler32();
        r24.update(r33, 12, r13 - 12);
        int r05 = (int) r24.getValue();
        r33[8] = (byte) r05;
        r33[9] = (byte) (r05 >> 8);
        r33[10] = (byte) (r05 >> 16);
        r33[11] = (byte) (r05 >> 24);
        return r63.m490i();
    L73:
        throw new RuntimeException("unexpected digest write: " + r23 + " bytes");     // Catch: DigestException -> L74
    L74:
        e = move-exception;
        throw new RuntimeException(e);
    L77:
        e = move-exception;
        throw new RuntimeException(e);
    L81:
        throw new RuntimeException("foreshortened write");
    L5:
        r1 = false;
        goto L6
    }
}
