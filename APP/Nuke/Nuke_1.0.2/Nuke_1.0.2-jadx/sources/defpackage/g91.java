package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 implements fc2, cc2 {
    public final gc2 h;
    public final dc2 i;
    public final sk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g91(fc2 fc2Var, Map map, dc2 dc2Var) {
        v vVar = new v(15, fc2Var);
        tu2 tu2Var = hc2.a;
        this.h = new gc2(map, vVar);
        this.i = dc2Var;
        sk1 sk1Var = fd2.a;
        this.j = new sk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final ec2 a(String str, xm0 xm0Var) {
        return this.h.a(str, xm0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final boolean b(Object obj) {
        return this.h.b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // defpackage.fc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        sk1 sk1Var = this.j;
        Object[] objArr = sk1Var.b;
        long[] jArr = sk1Var.a;
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
                            dc2 dc2Var = this.i;
                            if (dc2Var.i.k(obj) == null) {
                                dc2Var.h.remove(obj);
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
        return this.h.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final Object d(String str) {
        return this.h.d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cc2
    public final void e(Object obj, kw kwVar, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-858296452);
        if ((i & 6) == 0) {
            i2 = (go0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(kwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(this) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            this.i.e(obj, kwVar, go0Var, i2 & 126);
            boolean zH = go0Var.h(this) | go0Var.h(obj);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                objL = new d2(19, this, obj);
                go0Var.f0(objL);
            }
            eu.c(obj, (in0) objL, go0Var);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(this, obj, kwVar, i, 9);
        }
    }
}
