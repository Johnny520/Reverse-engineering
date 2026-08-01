package p182m5;

import bsh.C1193i2;
import bsh.C1259t2;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;
import okhttp3.C5750e;
import p123i5.C3198a;
import p182m5.C5002l0;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6495e;
import p254r5.C6488a0;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6503i;
import p254r5.C6507l;
import p254r5.C6508m;
import p254r5.C6519x;
import p309v5.C8823e;

/* JADX INFO: renamed from: m5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5009p {

    /* JADX INFO: renamed from: a */
    public final C3198a f15256a;

    /* JADX INFO: renamed from: b */
    public final C5002l0 f15257b;

    /* JADX INFO: renamed from: c */
    public final C5002l0 f15258c;

    /* JADX INFO: renamed from: d */
    public final C5002l0 f15259d;

    /* JADX INFO: renamed from: e */
    public final C5002l0 f15260e;

    /* JADX INFO: renamed from: f */
    public final C5020u0 f15261f;

    /* JADX INFO: renamed from: g */
    public final C5024w0 f15262g;

    /* JADX INFO: renamed from: h */
    public final C5010p0 f15263h;

    /* JADX INFO: renamed from: i */
    public final C5023w f15264i;

    /* JADX INFO: renamed from: j */
    public final C5000k0 f15265j;

    /* JADX INFO: renamed from: k */
    public final C5001l f15266k;

    /* JADX INFO: renamed from: l */
    public final C5002l0 f15267l;

    /* JADX INFO: renamed from: m */
    public final C4991g f15268m;

    /* JADX INFO: renamed from: n */
    public final C4996i0 f15269n;

    /* JADX INFO: renamed from: o */
    public final C5002l0 f15270o;

    /* JADX INFO: renamed from: p */
    public final C5027y f15271p;

    /* JADX INFO: renamed from: q */
    public final AbstractC5012q0[] f15272q;

    /* JADX INFO: renamed from: r */
    public int f15273r;

    /* JADX INFO: renamed from: s */
    public int f15274s;

    /* JADX INFO: renamed from: m5.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
    }

    public C5009p(C3198a c3198a) {
        this.f15256a = c3198a;
        C5027y c5027y = new C5027y(this);
        this.f15271p = c5027y;
        C5002l0.c cVar = C5002l0.c.NONE;
        C5002l0 c5002l0 = new C5002l0(null, this, 4, cVar);
        this.f15258c = c5002l0;
        C5002l0.c cVar2 = C5002l0.c.TYPE;
        C5002l0 c5002l02 = new C5002l0("word_data", this, 4, cVar2);
        this.f15257b = c5002l02;
        C5002l0 c5002l03 = new C5002l0("string_data", this, 1, C5002l0.c.INSTANCE);
        this.f15260e = c5002l03;
        C5002l0 c5002l04 = new C5002l0(null, this, 1, cVar);
        this.f15267l = c5002l04;
        C5002l0 c5002l05 = new C5002l0("byte_data", this, 1, cVar2);
        this.f15270o = c5002l05;
        C5020u0 c5020u0 = new C5020u0(this);
        this.f15261f = c5020u0;
        C5024w0 c5024w0 = new C5024w0(this);
        this.f15262g = c5024w0;
        C5010p0 c5010p0 = new C5010p0(this);
        this.f15263h = c5010p0;
        C5023w c5023w = new C5023w(this);
        this.f15264i = c5023w;
        C5000k0 c5000k0 = new C5000k0(this);
        this.f15265j = c5000k0;
        C5001l c5001l = new C5001l(this);
        this.f15266k = c5001l;
        C5002l0 c5002l06 = new C5002l0("map", this, 4, cVar);
        this.f15259d = c5002l06;
        if (c3198a.m12146a(26)) {
            C4991g c4991g = new C4991g(this);
            this.f15268m = c4991g;
            C4996i0 c4996i0 = new C4996i0(this);
            this.f15269n = c4996i0;
            this.f15272q = new AbstractC5012q0[]{c5027y, c5020u0, c5024w0, c5010p0, c5023w, c5000k0, c5001l, c4991g, c4996i0, c5002l02, c5002l0, c5002l03, c5002l05, c5002l04, c5002l06};
        } else {
            this.f15268m = null;
            this.f15269n = null;
            this.f15272q = new AbstractC5012q0[]{c5027y, c5020u0, c5024w0, c5010p0, c5023w, c5000k0, c5001l, c5002l02, c5002l0, c5002l03, c5002l05, c5002l04, c5002l06};
        }
        this.f15273r = -1;
        this.f15274s = 79;
    }

    /* JADX INFO: renamed from: b */
    public static void m20239b(byte[] bArr, int i10) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, i10 - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }

    /* JADX INFO: renamed from: c */
    public static void m20240c(byte[] bArr, int i10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i10 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
            } catch (DigestException e10) {
                C5750e.m23251a(e10);
            }
        } catch (NoSuchAlgorithmException e11) {
            C5750e.m23251a(e11);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m20241A(OutputStream outputStream, a aVar, Writer writer, boolean z10) throws IOException {
        boolean z11 = writer != null;
        C8823e c8823eM20264y = m20264y(z11, z10, aVar);
        if (outputStream != null) {
            outputStream.write(c8823eM20264y.m33873p());
        }
        if (z11) {
            c8823eM20264y.m33876t(writer);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20242a(C4999k c4999k) {
        this.f15266k.m20183r(c4999k);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC4979a0 m20243d(AbstractC6487a abstractC6487a) {
        if (abstractC6487a instanceof C6492c0) {
            return this.f15261f.m20300r(abstractC6487a);
        }
        if (abstractC6487a instanceof C6496e0) {
            return this.f15262g.m20310r(abstractC6487a);
        }
        if (abstractC6487a instanceof AbstractC6495e) {
            return this.f15265j.m20179s(abstractC6487a);
        }
        if (abstractC6487a instanceof C6508m) {
            return this.f15264i.m20306s(abstractC6487a);
        }
        if (abstractC6487a instanceof C6507l) {
            return this.f15264i.m20308u(((C6507l) abstractC6487a).m25778p());
        }
        if (abstractC6487a instanceof C6488a0) {
            return this.f15263h.m20266r(abstractC6487a);
        }
        if (abstractC6487a instanceof C6519x) {
            return this.f15269n.m20154r(abstractC6487a);
        }
        if (abstractC6487a instanceof C6503i) {
            return this.f15268m.m20139s(abstractC6487a);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public C5002l0 m20244e() {
        return this.f15270o;
    }

    /* JADX INFO: renamed from: f */
    public C4991g m20245f() {
        return this.f15268m;
    }

    /* JADX INFO: renamed from: g */
    public C5002l0 m20246g() {
        return this.f15267l;
    }

    /* JADX INFO: renamed from: h */
    public C5001l m20247h() {
        return this.f15266k;
    }

    /* JADX INFO: renamed from: i */
    public C3198a m20248i() {
        return this.f15256a;
    }

    /* JADX INFO: renamed from: j */
    public C5023w m20249j() {
        return this.f15264i;
    }

    /* JADX INFO: renamed from: k */
    public int m20250k() {
        int i10 = this.f15273r;
        if (i10 >= 0) {
            return i10;
        }
        C1193i2.m4438a("file size not yet known");
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC5012q0 m20251l() {
        return this.f15257b;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC5012q0 m20252m() {
        return this.f15259d;
    }

    /* JADX INFO: renamed from: n */
    public C5002l0 m20253n() {
        return this.f15259d;
    }

    /* JADX INFO: renamed from: o */
    public C4996i0 m20254o() {
        return this.f15269n;
    }

    /* JADX INFO: renamed from: p */
    public C5000k0 m20255p() {
        return this.f15265j;
    }

    /* JADX INFO: renamed from: q */
    public C5010p0 m20256q() {
        return this.f15263h;
    }

    /* JADX INFO: renamed from: r */
    public C5014r0 m20257r() {
        C5014r0 c5014r0 = new C5014r0();
        for (AbstractC5012q0 abstractC5012q0 : this.f15272q) {
            c5014r0.m20286b(abstractC5012q0);
        }
        return c5014r0;
    }

    /* JADX INFO: renamed from: s */
    public C5002l0 m20258s() {
        return this.f15260e;
    }

    /* JADX INFO: renamed from: t */
    public C5020u0 m20259t() {
        return this.f15261f;
    }

    /* JADX INFO: renamed from: u */
    public C5024w0 m20260u() {
        return this.f15262g;
    }

    /* JADX INFO: renamed from: v */
    public C5002l0 m20261v() {
        return this.f15258c;
    }

    /* JADX INFO: renamed from: w */
    public C5002l0 m20262w() {
        return this.f15257b;
    }

    /* JADX INFO: renamed from: x */
    public void m20263x(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return;
        }
        if (abstractC6487a instanceof C6492c0) {
            this.f15261f.m20303u((C6492c0) abstractC6487a);
            return;
        }
        if (abstractC6487a instanceof C6496e0) {
            this.f15262g.m20313u((C6496e0) abstractC6487a);
            return;
        }
        if (abstractC6487a instanceof AbstractC6495e) {
            this.f15265j.m20181u((AbstractC6495e) abstractC6487a);
            return;
        }
        if (abstractC6487a instanceof C6508m) {
            this.f15264i.m20308u((C6508m) abstractC6487a);
            return;
        }
        if (abstractC6487a instanceof C6507l) {
            this.f15264i.m20308u(((C6507l) abstractC6487a).m25778p());
        } else if (abstractC6487a instanceof C6488a0) {
            this.f15263h.m20268t(((C6488a0) abstractC6487a).m25731k());
        } else if (abstractC6487a instanceof C6519x) {
            this.f15269n.m20156t((C6519x) abstractC6487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3 A[Catch: RuntimeException -> 0x00e6, TryCatch #0 {RuntimeException -> 0x00e6, blocks: (B:39:0x00d9, B:41:0x00e1, B:49:0x00f3, B:51:0x00fe, B:52:0x0104, B:53:0x0107, B:54:0x011e, B:46:0x00e8), top: B:69:0x00d9 }] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p309v5.C8823e m20264y(boolean r8, boolean r9, p182m5.C5009p.a r10) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182m5.C5009p.m20264y(boolean, boolean, m5.p$a):v5.e");
    }

    /* JADX INFO: renamed from: z */
    public void m20265z(OutputStream outputStream, Writer writer, boolean z10) throws IOException {
        m20241A(outputStream, null, writer, z10);
    }
}
