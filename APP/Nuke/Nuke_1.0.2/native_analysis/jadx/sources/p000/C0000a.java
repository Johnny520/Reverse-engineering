package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a extends ox2 {
    /* JADX INFO: renamed from: g */
    public C0073c m0g(int i) {
        C0073c c0073c = new C0073c();
        int iM3661b = m3661b(4);
        if (iM3661b == 0) {
            return null;
        }
        int iM3660a = m3660a((i * 4) + m3664e(iM3661b));
        ByteBuffer byteBuffer = this.f7869b;
        byteBuffer.getClass();
        c0073c.m3662c(iM3660a, byteBuffer);
        return c0073c;
    }

    /* JADX INFO: renamed from: h */
    public C0185f m1h(int i) {
        C0185f c0185f = new C0185f();
        int iM3661b = m3661b(4);
        if (iM3661b == 0) {
            return null;
        }
        int iM3660a = m3660a((i * 4) + m3664e(iM3661b));
        ByteBuffer byteBuffer = this.f7869b;
        byteBuffer.getClass();
        c0185f.m3662c(iM3660a, byteBuffer);
        return c0185f;
    }

    /* JADX INFO: renamed from: i */
    public int m2i() {
        int iM3661b = m3661b(4);
        if (iM3661b != 0) {
            return m3665f(iM3661b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public C0638r m3j(int i) {
        C0638r c0638r = new C0638r();
        int iM3661b = m3661b(4);
        if (iM3661b == 0) {
            return null;
        }
        int iM3660a = m3660a((i * 4) + m3664e(iM3661b));
        ByteBuffer byteBuffer = this.f7869b;
        byteBuffer.getClass();
        c0638r.m3662c(iM3660a, byteBuffer);
        return c0638r;
    }

    /* JADX INFO: renamed from: k */
    public ox2 m4k(ox2 ox2Var) {
        int iM3661b = m3661b(8);
        if (iM3661b == 0) {
            return null;
        }
        int i = iM3661b + this.f7868a;
        ByteBuffer byteBuffer = this.f7869b;
        ox2Var.m3662c(byteBuffer.getInt(i) + i, byteBuffer);
        return ox2Var;
    }
}
