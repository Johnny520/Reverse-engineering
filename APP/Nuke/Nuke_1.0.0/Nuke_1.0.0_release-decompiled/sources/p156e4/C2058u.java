package p156e4;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p000A.C0073m;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p133a4.C1807c;
import p208n4.C2709h;
import p208n4.C2716o;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: e4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2058u implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f6882g;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2708g f6883d;

    /* JADX INFO: renamed from: e */
    public final C2057t f6884e;

    /* JADX INFO: renamed from: f */
    public final C2042e f6885f;

    static {
        Logger logger = Logger.getLogger(AbstractC2045h.class.getName());
        AbstractC1665j.m2984d(logger, "getLogger(...)");
        f6882g = logger;
    }

    public C2058u(C2716o c2716o) {
        AbstractC1665j.m2985e(c2716o, "source");
        this.f6883d = c2716o;
        C2057t c2057t = new C2057t(c2716o);
        this.f6884e = c2057t;
        this.f6885f = new C2042e(c2057t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0251, code lost:
    
        throw new java.io.IOException(p011B4.AbstractC0231b.m398i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3761b(boolean r14, p156e4.C2053p r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p156e4.C2058u.m3761b(boolean, e4.p):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r9.m3777i(p118X3.C1707q.f5858e, true);
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3762c(p156e4.C2053p r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p156e4.C2058u.m3762c(e4.p, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6883d.close();
    }

    /* JADX INFO: renamed from: d */
    public final List m3763d(int i5, int i6, int i7, int i8) throws IOException {
        C2057t c2057t = this.f6884e;
        c2057t.f6880g = i5;
        c2057t.f6881h = i6;
        c2057t.f6878e = i7;
        c2057t.f6879f = i8;
        C2042e c2042e = this.f6885f;
        C2716o c2716o = c2042e.f6805d;
        while (!c2716o.m4753b()) {
            byte b2 = c2716o.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            int i9 = b2 & 255;
            if (i9 == 128) {
                throw new IOException("index == 0");
            }
            if ((b2 & 128) == 128) {
                int iM3742f = c2042e.m3742f(i9, 127);
                int i10 = iM3742f - 1;
                if (i10 >= 0) {
                    C2041d[] c2041dArr = AbstractC2044g.f6818a;
                    if (i10 <= c2041dArr.length - 1) {
                        c2042e.m3737a(c2041dArr[i10]);
                    }
                }
                int length = c2042e.f6807f + 1 + (i10 - AbstractC2044g.f6818a.length);
                if (length >= 0) {
                    C2041d[] c2041dArr2 = c2042e.f6806e;
                    if (length < c2041dArr2.length) {
                        C2041d c2041d = c2041dArr2[length];
                        AbstractC1665j.m2982b(c2041d);
                        c2042e.m3737a(c2041d);
                    }
                }
                throw new IOException(AbstractC0231b.m398i("Header index too large ", iM3742f));
            }
            if (i9 == 64) {
                C2041d[] c2041dArr3 = AbstractC2044g.f6818a;
                C2709h c2709hM3741e = c2042e.m3741e();
                AbstractC2044g.m3748a(c2709hM3741e);
                c2042e.m3740d(new C2041d(c2709hM3741e, c2042e.m3741e()));
            } else if ((b2 & 64) == 64) {
                c2042e.m3740d(new C2041d(c2042e.m3739c(c2042e.m3742f(i9, 63) - 1), c2042e.m3741e()));
            } else if ((b2 & 32) == 32) {
                int iM3742f2 = c2042e.m3742f(i9, 31);
                c2042e.f6802a = iM3742f2;
                if (iM3742f2 < 0 || iM3742f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2042e.f6802a);
                }
                int i11 = c2042e.f6809h;
                if (iM3742f2 < i11) {
                    if (iM3742f2 == 0) {
                        C2041d[] c2041dArr4 = c2042e.f6806e;
                        AbstractC0972l.m1998V(c2041dArr4, 0, c2041dArr4.length);
                        c2042e.f6807f = c2042e.f6806e.length - 1;
                        c2042e.f6808g = 0;
                        c2042e.f6809h = 0;
                    } else {
                        c2042e.m3738b(i11 - iM3742f2);
                    }
                }
            } else if (i9 == 16 || i9 == 0) {
                C2041d[] c2041dArr5 = AbstractC2044g.f6818a;
                C2709h c2709hM3741e2 = c2042e.m3741e();
                AbstractC2044g.m3748a(c2709hM3741e2);
                c2042e.m3737a(new C2041d(c2709hM3741e2, c2042e.m3741e()));
            } else {
                c2042e.m3737a(new C2041d(c2042e.m3739c(c2042e.m3742f(i9, 15) - 1), c2042e.m3741e()));
            }
        }
        ArrayList arrayList = c2042e.f6803b;
        List listM2024e0 = AbstractC0973m.m2024e0(arrayList);
        arrayList.clear();
        c2042e.f6804c = 0L;
        return listM2024e0;
    }

    /* JADX INFO: renamed from: f */
    public final void m3764f(C2053p c2053p, int i5, int i6, int i7) throws IOException {
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i8 = 0;
        boolean z5 = (i6 & 1) != 0;
        if ((i6 & 8) != 0) {
            byte b2 = this.f6883d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8 = b2 & 255;
        }
        if ((i6 & 32) != 0) {
            InterfaceC2708g interfaceC2708g = this.f6883d;
            interfaceC2708g.readInt();
            interfaceC2708g.readByte();
            byte[] bArr2 = AbstractC1774e.f6072a;
            i5 -= 5;
        }
        List listM3763d = m3763d(AbstractC2056s.m3760a(i5, i6, i8), i8, i6, i7);
        C2054q c2054q = c2053p.f6842e;
        if (i7 != 0 && (i7 & 1) == 0) {
            C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i7 + "] onHeaders", new C2049l(c2054q, i7, listM3763d, z5));
            return;
        }
        synchronized (c2054q) {
            C2062y c2062yM3753c = c2054q.m3753c(i7);
            if (c2062yM3753c != null) {
                c2062yM3753c.m3777i(AbstractC1776g.m3180g(listM3763d), z5);
                return;
            }
            if (c2054q.f6851i) {
                return;
            }
            if (i7 <= c2054q.f6849g) {
                return;
            }
            if (i7 % 2 == c2054q.f6850h % 2) {
                return;
            }
            C2062y c2062y = new C2062y(i7, c2054q, false, z5, AbstractC1776g.m3180g(listM3763d));
            c2054q.f6849g = i7;
            c2054q.f6847e.put(Integer.valueOf(i7), c2062y);
            C1807c.m3275b(c2054q.f6852j.m3283d(), c2054q.f6848f + '[' + i7 + "] onStream", new C0073m(20, c2054q, c2062y));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3765h(C2053p c2053p, int i5, int i6, int i7) throws IOException {
        int i8;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i9 = 0;
        if ((i6 & 8) != 0) {
            byte b2 = this.f6883d.readByte();
            byte[] bArr = AbstractC1774e.f6072a;
            i8 = b2 & 255;
        } else {
            i8 = 0;
        }
        int i10 = this.f6883d.readInt() & Integer.MAX_VALUE;
        List listM3763d = m3763d(AbstractC2056s.m3760a(i5 - 4, i6, i8), i8, i6, i7);
        C2054q c2054q = c2053p.f6842e;
        synchronized (c2054q) {
            if (c2054q.f6845B.contains(Integer.valueOf(i10))) {
                c2054q.m3758l(i10, EnumC2039b.f6785g);
                return;
            }
            c2054q.f6845B.add(Integer.valueOf(i10));
            C1807c.m3275b(c2054q.f6854l, c2054q.f6848f + '[' + i10 + "] onRequest", new C2049l(c2054q, i10, listM3763d, i9));
        }
    }
}
