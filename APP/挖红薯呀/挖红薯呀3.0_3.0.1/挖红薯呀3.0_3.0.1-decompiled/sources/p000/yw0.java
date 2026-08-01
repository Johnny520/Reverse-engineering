package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 implements ww0 {

    /* JADX INFO: renamed from: h */
    public static final C0111d f7697h = new C0111d(19, new C0717s8(17), new pg0(4));

    /* JADX INFO: renamed from: d */
    public final Map f7698d;

    /* JADX INFO: renamed from: e */
    public final jh0 f7699e;

    /* JADX INFO: renamed from: f */
    public zw0 f7700f;

    /* JADX INFO: renamed from: g */
    public final C0532o f7701g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yw0(Map map) {
        this.f7698d = map;
        long[] jArr = dy0.f1212a;
        this.f7699e = new jh0();
        this.f7701g = new C0532o(18, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ww0
    /* JADX INFO: renamed from: e */
    public final void mo1070e(Object obj, C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(533563200);
        int i3 = 4;
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
            c0616pi.m3092Y(obj);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                C0532o c0532o = this.f7701g;
                if (!((Boolean) c0532o.invoke(obj)).booleanValue()) {
                    C0921xc.m5127h("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f7698d.get(obj);
                g41 g41Var = bx0.f604a;
                cx0 cx0Var = new cx0(new ax0(map, c0532o));
                c0616pi.m3107g0(cx0Var);
                objM3080L = cx0Var;
            }
            cx0 cx0Var2 = (cx0) objM3080L;
            AbstractC0307i4.m1527c(new ct0[]{bx0.f604a.mo206a(cx0Var2), db0.f1042a.mo206a(cx0Var2)}, c0474mh, c0616pi, (i2 & 112) | 8);
            boolean zM3108h = c0616pi.m3108h(this) | c0616pi.m3108h(obj) | c0616pi.m3108h(cx0Var2);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3108h || objM3080L2 == c0675r3) {
                objM3080L2 = new C1006zj(this, obj, cx0Var2, i3);
                c0616pi.m3107g0(objM3080L2);
            }
            s91.m4038c(na1.f4229a, (InterfaceC0742sw) objM3080L2, c0616pi);
            if (c0616pi.f4904y && c0616pi.f4865G.f6382i == c0616pi.f4905z) {
                c0616pi.f4905z = -1;
                c0616pi.f4904y = false;
            }
            c0616pi.m3119p(false);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0394kh(this, obj, c0474mh, i, 3);
        }
    }
}
