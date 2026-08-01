package p376zd;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: zd.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10012q0 {

    /* JADX INFO: renamed from: h */
    public static final a f33615h = new a(null);

    /* JADX INFO: renamed from: a */
    public final byte[] f33616a;

    /* JADX INFO: renamed from: b */
    public int f33617b;

    /* JADX INFO: renamed from: c */
    public int f33618c;

    /* JADX INFO: renamed from: d */
    public boolean f33619d;

    /* JADX INFO: renamed from: e */
    public boolean f33620e;

    /* JADX INFO: renamed from: f */
    public C10012q0 f33621f;

    /* JADX INFO: renamed from: g */
    public C10012q0 f33622g;

    public C10012q0(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        bArr.getClass();
        this.f33616a = bArr;
        this.f33617b = i10;
        this.f33618c = i11;
        this.f33619d = z10;
        this.f33620e = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m38821a() {
        int i10;
        C10012q0 c10012q0 = this.f33622g;
        if (c10012q0 == this) {
            C10010p0.m38820a("cannot compact");
            return;
        }
        c10012q0.getClass();
        if (c10012q0.f33620e) {
            int i11 = this.f33618c - this.f33617b;
            C10012q0 c10012q02 = this.f33622g;
            c10012q02.getClass();
            int i12 = 8192 - c10012q02.f33618c;
            C10012q0 c10012q03 = this.f33622g;
            c10012q03.getClass();
            if (c10012q03.f33619d) {
                i10 = 0;
            } else {
                C10012q0 c10012q04 = this.f33622g;
                c10012q04.getClass();
                i10 = c10012q04.f33617b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            C10012q0 c10012q05 = this.f33622g;
            c10012q05.getClass();
            m38827g(c10012q05, i11);
            m38822b();
            C10014r0.m38829b(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C10012q0 m38822b() {
        C10012q0 c10012q0 = this.f33621f;
        if (c10012q0 == this) {
            c10012q0 = null;
        }
        C10012q0 c10012q02 = this.f33622g;
        c10012q02.getClass();
        c10012q02.f33621f = this.f33621f;
        C10012q0 c10012q03 = this.f33621f;
        c10012q03.getClass();
        c10012q03.f33622g = this.f33622g;
        this.f33621f = null;
        this.f33622g = null;
        return c10012q0;
    }

    /* JADX INFO: renamed from: c */
    public final C10012q0 m38823c(C10012q0 c10012q0) {
        c10012q0.getClass();
        c10012q0.f33622g = this;
        c10012q0.f33621f = this.f33621f;
        C10012q0 c10012q02 = this.f33621f;
        c10012q02.getClass();
        c10012q02.f33622g = c10012q0;
        this.f33621f = c10012q0;
        return c10012q0;
    }

    /* JADX INFO: renamed from: d */
    public final C10012q0 m38824d() {
        this.f33619d = true;
        return new C10012q0(this.f33616a, this.f33617b, this.f33618c, true, false);
    }

    /* JADX INFO: renamed from: e */
    public final C10012q0 m38825e(int i10) {
        C10012q0 c10012q0M38830c;
        if (i10 <= 0 || i10 > this.f33618c - this.f33617b) {
            C9987e.m38645a("byteCount out of range");
            return null;
        }
        if (i10 >= 1024) {
            c10012q0M38830c = m38824d();
        } else {
            c10012q0M38830c = C10014r0.m38830c();
            byte[] bArr = this.f33616a;
            byte[] bArr2 = c10012q0M38830c.f33616a;
            int i11 = this.f33617b;
            AbstractC5102r.m20661m(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        c10012q0M38830c.f33618c = c10012q0M38830c.f33617b + i10;
        this.f33617b += i10;
        C10012q0 c10012q0 = this.f33622g;
        c10012q0.getClass();
        c10012q0.m38823c(c10012q0M38830c);
        return c10012q0M38830c;
    }

    /* JADX INFO: renamed from: f */
    public final C10012q0 m38826f() {
        byte[] bArr = this.f33616a;
        return new C10012q0(Arrays.copyOf(bArr, bArr.length), this.f33617b, this.f33618c, false, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m38827g(C10012q0 c10012q0, int i10) {
        c10012q0.getClass();
        if (!c10012q0.f33620e) {
            C10010p0.m38820a("only owner can write");
            return;
        }
        int i11 = c10012q0.f33618c;
        if (i11 + i10 > 8192) {
            if (c10012q0.f33619d) {
                throw new IllegalArgumentException();
            }
            int i12 = c10012q0.f33617b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c10012q0.f33616a;
            AbstractC5102r.m20661m(bArr, bArr, 0, i12, i11, 2, null);
            c10012q0.f33618c -= c10012q0.f33617b;
            c10012q0.f33617b = 0;
        }
        byte[] bArr2 = this.f33616a;
        byte[] bArr3 = c10012q0.f33616a;
        int i13 = c10012q0.f33618c;
        int i14 = this.f33617b;
        AbstractC5102r.m20655g(bArr2, bArr3, i13, i14, i14 + i10);
        c10012q0.f33618c += i10;
        this.f33617b += i10;
    }

    /* JADX INFO: renamed from: zd.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C10012q0() {
        this.f33616a = new byte[8192];
        this.f33620e = true;
        this.f33619d = false;
    }
}
