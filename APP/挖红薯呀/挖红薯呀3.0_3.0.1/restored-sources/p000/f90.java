package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 implements zw0, ww0 {

    /* JADX INFO: renamed from: d */
    public final ax0 f1631d;

    /* JADX INFO: renamed from: e */
    public final yw0 f1632e;

    /* JADX INFO: renamed from: f */
    public final kh0 f1633f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f90(zw0 zw0Var, Map map, yw0 yw0Var) {
        C0532o c0532o = new C0532o(9, zw0Var);
        g41 g41Var = bx0.f604a;
        this.f1631d = new ax0(map, c0532o);
        this.f1632e = yw0Var;
        kh0 kh0Var = ey0.f1546a;
        this.f1633f = new kh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: a */
    public final C0541o8 mo214a(String str, InterfaceC0298hw interfaceC0298hw) {
        return this.f1631d.mo214a(str, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: b */
    public final boolean mo215b(Object obj) {
        return this.f1631d.mo215b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p000.zw0
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo216c() {
        kh0 kh0Var = this.f1633f;
        Object[] objArr = kh0Var.f3151b;
        long[] jArr = kh0Var.f3150a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            yw0 yw0Var = this.f1632e;
                            if (yw0Var.f7699e.m1705k(obj) == null) {
                                yw0Var.f7698d.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f1631d.mo216c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: d */
    public final Object mo217d(String str) {
        return this.f1631d.mo217d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ww0
    /* JADX INFO: renamed from: e */
    public final void mo1070e(Object obj, C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-858296452);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3108h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3108h(c0474mh) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3108h(this) ? 256 : 128;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 147) != 146)) {
            this.f1632e.mo1070e(obj, c0474mh, c0616pi, i2 & 126);
            boolean zM3108h = c0616pi.m3108h(this) | c0616pi.m3108h(obj);
            Object objM3080L = c0616pi.m3080L();
            if (zM3108h || objM3080L == C0320ii.f2572a) {
                objM3080L = new C0073c(9, this, obj);
                c0616pi.m3107g0(objM3080L);
            }
            s91.m4038c(obj, (InterfaceC0742sw) objM3080L, c0616pi);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0394kh(this, obj, c0474mh, i, 2);
        }
    }
}
