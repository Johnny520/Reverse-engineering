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

    public C0100k(C0016a c0016a) {
        this.f382a = c0016a;
        C0113x c0113x = new C0113x(this, 4);
        this.f397p = c0113x;
        C0079B c0079b = new C0079B(null, this, 4, 1);
        this.f384c = c0079b;
        C0079B c0079b2 = new C0079B("word_data", this, 4, 2);
        this.f383b = c0079b2;
        C0079B c0079b3 = new C0079B("string_data", this, 1, 3);
        this.f386e = c0079b3;
        C0079B c0079b4 = new C0079B(null, this, 1, 1);
        this.f393l = c0079b4;
        C0079B c0079b5 = new C0079B("byte_data", this, 1, 2);
        this.f396o = c0079b5;
        C0113x c0113x2 = new C0113x(this, 2);
        this.f387f = c0113x2;
        C0113x c0113x3 = new C0113x(this, 3);
        this.f388g = c0113x3;
        C0113x c0113x4 = new C0113x(this, 1);
        this.f389h = c0113x4;
        C0104o c0104o = new C0104o(this);
        this.f390i = c0104o;
        C0115z c0115z = new C0115z(this);
        this.f391j = c0115z;
        C0091b c0091b = new C0091b(this, 1);
        this.f392k = c0091b;
        C0079B c0079b6 = new C0079B("map", this, 4, 1);
        this.f385d = c0079b6;
        if (c0016a.f64a >= 26) {
            C0091b c0091b2 = new C0091b(this, 0);
            this.f394m = c0091b2;
            C0113x c0113x5 = new C0113x(this, 0);
            this.f395n = c0113x5;
            this.f398q = new AbstractC0082E[]{c0113x, c0113x2, c0113x3, c0113x4, c0104o, c0115z, c0091b, c0091b2, c0113x5, c0079b2, c0079b, c0079b3, c0079b5, c0079b4, c0079b6};
        } else {
            this.f394m = null;
            this.f395n = null;
            this.f398q = new AbstractC0082E[]{c0113x, c0113x2, c0113x3, c0113x4, c0104o, c0115z, c0091b, c0079b2, c0079b, c0079b3, c0079b5, c0079b4, c0079b6};
        }
        this.f399r = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m291a(C0094e c0094e) {
        this.f392k.m261p(c0094e);
    }

    /* JADX INFO: renamed from: b */
    final AbstractC0107r m292b(AbstractC0171a abstractC0171a) {
        if (abstractC0171a instanceof C0190t) {
            return this.f387f.m327p(abstractC0171a);
        }
        if (abstractC0171a instanceof C0191u) {
            return this.f388g.m327p(abstractC0171a);
        }
        if (abstractC0171a instanceof AbstractC0174d) {
            return this.f391j.m337p(abstractC0171a);
        }
        return null;
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
        int i2 = this.f399r;
        if (i2 >= 0) {
            return i2;
        }
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
    final void m310t(AbstractC0171a abstractC0171a) {
        if (abstractC0171a == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC0171a instanceof C0190t) {
            this.f387f.m332u((C0190t) abstractC0171a);
        } else if (abstractC0171a instanceof C0191u) {
            this.f388g.m333v((C0191u) abstractC0171a);
        } else if (abstractC0171a instanceof AbstractC0174d) {
            this.f391j.m339r((AbstractC0174d) abstractC0171a);
        }
    }

    /* JADX INFO: renamed from: u */
    public final byte[] m311u() {
        this.f392k.m248g();
        this.f393l.m248g();
        this.f383b.m248g();
        C0016a c0016a = this.f382a;
        boolean z = c0016a.f64a >= 26;
        C0091b c0091b = this.f394m;
        if (z) {
            c0091b.m248g();
        }
        this.f396o.m248g();
        boolean z2 = c0016a.f64a >= 26;
        C0113x c0113x = this.f395n;
        if (z2) {
            c0113x.m248g();
        }
        this.f391j.m248g();
        this.f390i.m248g();
        this.f389h.m248g();
        this.f384c.m248g();
        this.f388g.m248g();
        this.f387f.m248g();
        this.f386e.m248g();
        this.f397p.m248g();
        AbstractC0082E[] abstractC0082EArr = this.f398q;
        int length = abstractC0082EArr.length;
        int iMo227l = 0;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC0082E abstractC0082E = abstractC0082EArr[i2];
            if ((abstractC0082E != c0091b && abstractC0082E != c0113x) || !abstractC0082E.mo225f().isEmpty()) {
                int iM249i = abstractC0082E.m249i(iMo227l);
                if (iM249i < iMo227l) {
                    throw new RuntimeException("bogus placement for section " + i2);
                }
                C0079B c0079b = this.f385d;
                if (abstractC0082E == c0079b) {
                    try {
                        C0110u.m323m(abstractC0082EArr, c0079b);
                        c0079b.m248g();
                    } catch (RuntimeException e2) {
                        throw DexGenerationException.m22b("...while writing section " + i2, e2);
                    }
                }
                if (abstractC0082E instanceof C0079B) {
                    ((C0079B) abstractC0082E).m231q();
                }
                iMo227l = abstractC0082E.mo227l() + iM249i;
            }
        }
        this.f399r = iMo227l;
        byte[] bArr = new byte[iMo227l];
        C0202d c0202d = new C0202d(bArr);
        for (int i3 = 0; i3 < length; i3++) {
            try {
                AbstractC0082E abstractC0082E2 = abstractC0082EArr[i3];
                if ((abstractC0082E2 != c0091b && abstractC0082E2 != c0113x) || !abstractC0082E2.mo225f().isEmpty()) {
                    int iM247e = abstractC0082E2.m247e() - c0202d.m491j();
                    if (iM247e < 0) {
                        throw new DexGenerationException("excess write of " + (-iM247e), null);
                    }
                    c0202d.m501u(iM247e);
                    abstractC0082E2.m252m(c0202d);
                }
            } catch (RuntimeException e3) {
                DexGenerationException dexGenerationException = e3 instanceof DexGenerationException ? (DexGenerationException) e3 : new DexGenerationException(null, e3);
                dexGenerationException.m23a("...while writing section " + i3);
                throw dexGenerationException;
            }
        }
        if (c0202d.m491j() != this.f399r) {
            throw new RuntimeException("foreshortened write");
        }
        int iM491j = c0202d.m491j();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, iM491j - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int iM491j2 = c0202d.m491j();
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, iM491j2 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                return c0202d.m490i();
            } catch (DigestException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }
}
