package io.ktor.utils.p131io;

import java.io.IOException;
import p215oc.C5708d;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p231pc.AbstractC6062c;
import p231pc.C6060a;
import p257r8.AbstractC6535d;
import p299ub.AbstractC8611a0;
import p376zd.C9987e;

/* JADX INFO: renamed from: io.ktor.utils.io.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3460c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3468g f9563a;

    /* JADX INFO: renamed from: b */
    public final C6060a f9564b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3473k f9565c;

    /* JADX INFO: renamed from: d */
    public final long f9566d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5728w f9567e;

    /* JADX INFO: renamed from: f */
    public final int[] f9568f;

    /* JADX INFO: renamed from: g */
    public final C5708d f9569g;

    /* JADX INFO: renamed from: h */
    public long f9570h;

    /* JADX INFO: renamed from: i */
    public int f9571i;

    /* JADX INFO: renamed from: io.ktor.utils.io.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9572q;

        /* JADX INFO: renamed from: s */
        public int f9574s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9572q = obj;
            this.f9574s |= Integer.MIN_VALUE;
            return C3460c.this.m12925c(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9575q;

        /* JADX INFO: renamed from: s */
        public int f9577s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9575q = obj;
            this.f9577s |= Integer.MIN_VALUE;
            return C3460c.this.m12928f(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public boolean f9578q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9579r;

        /* JADX INFO: renamed from: t */
        public int f9581t;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9579r = obj;
            this.f9581t |= Integer.MIN_VALUE;
            return C3460c.this.m12929g(false, this);
        }
    }

    public C3460c(InterfaceC3468g interfaceC3468g, C6060a c6060a, InterfaceC3473k interfaceC3473k, long j10) {
        interfaceC3468g.getClass();
        c6060a.getClass();
        interfaceC3473k.getClass();
        this.f9563a = interfaceC3468g;
        this.f9564b = c6060a;
        this.f9565c = interfaceC3473k;
        this.f9566d = j10;
        if (c6060a.m24129i() <= 0) {
            C9987e.m38645a("Empty match string not permitted for scanning");
            throw null;
        }
        this.f9567e = interfaceC3468g.mo8542e();
        this.f9568f = m12926d();
        this.f9569g = new C5708d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (io.ktor.utils.p131io.AbstractC3474l.m12970b(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12925c(p228p8.InterfaceC5976f r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3460c.m12925c(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final int[] m12926d() {
        int[] iArr = new int[this.f9564b.m24129i()];
        int iM24129i = this.f9564b.m24129i();
        int i10 = 0;
        for (int i11 = 1; i11 < iM24129i; i11++) {
            while (i10 > 0 && this.f9564b.m24127g(i11) != this.f9564b.m24127g(i10)) {
                i10 = iArr[i10 - 1];
            }
            if (this.f9564b.m24127g(i11) == this.f9564b.m24127g(i10)) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public final void m12927e(long j10) throws IOException {
        if (this.f9570h + j10 <= this.f9566d) {
            return;
        }
        throw new IOException("Limit of " + this.f9566d + " bytes exceeded while searching for \"" + m12930h(this.f9564b) + '\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (io.ktor.utils.p131io.AbstractC3476n.m12980i(r11.f9565c, r12, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0042 -> B:27:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:22:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12928f(p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3460c.m12928f(p8.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r10.mo12879b(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r11 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[PHI: r10
  0x00b8: PHI (r10v2 boolean) = (r10v3 boolean), (r10v9 boolean) binds: [B:27:0x0071, B:22:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cb -> B:43:0x00ce). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12929g(boolean r10, p228p8.InterfaceC5976f r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3460c.m12929g(boolean, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public final String m12930h(C6060a c6060a) {
        return AbstractC8611a0.m33069N(AbstractC6062c.m24135b(c6060a), "\n", "\\n", false, 4, null);
    }
}
