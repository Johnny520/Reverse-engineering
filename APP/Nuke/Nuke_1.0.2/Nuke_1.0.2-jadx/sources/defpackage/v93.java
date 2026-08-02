package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v93 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(ar0 ar0Var, r93 r93Var) {
        List list = r93Var.q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t93 t93Var = (t93) list.get(i);
            if (t93Var instanceof w93) {
                wx1 wx1Var = new wx1();
                w93 w93Var = (w93) t93Var;
                wx1Var.d = w93Var.i;
                wx1Var.n = true;
                wx1Var.c();
                wx1Var.s.a.setFillType(w93Var.j == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                wx1Var.c();
                wx1Var.c();
                wx1Var.b = w93Var.k;
                wx1Var.c();
                wx1Var.c = w93Var.l;
                wx1Var.c();
                wx1Var.g = w93Var.m;
                wx1Var.c();
                wx1Var.e = w93Var.n;
                wx1Var.c();
                wx1Var.f = w93Var.o;
                wx1Var.o = true;
                wx1Var.c();
                wx1Var.h = w93Var.p;
                wx1Var.o = true;
                wx1Var.c();
                wx1Var.i = w93Var.q;
                wx1Var.o = true;
                wx1Var.c();
                wx1Var.j = w93Var.r;
                wx1Var.o = true;
                wx1Var.c();
                wx1Var.k = w93Var.s;
                wx1Var.p = true;
                wx1Var.c();
                wx1Var.l = w93Var.t;
                wx1Var.p = true;
                wx1Var.c();
                wx1Var.m = w93Var.u;
                wx1Var.p = true;
                wx1Var.c();
                ar0Var.e(i, wx1Var);
            } else if (t93Var instanceof r93) {
                ar0 ar0Var2 = new ar0();
                r93 r93Var2 = (r93) t93Var;
                ar0Var2.k = r93Var2.h;
                ar0Var2.c();
                ar0Var2.l = r93Var2.i;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.o = r93Var2.l;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.p = r93Var2.m;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.q = r93Var2.n;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.r = r93Var2.o;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.m = r93Var2.j;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.n = r93Var2.k;
                ar0Var2.s = true;
                ar0Var2.c();
                ar0Var2.f = r93Var2.p;
                ar0Var2.g = true;
                ar0Var2.c();
                a(ar0Var2, r93Var2);
                ar0Var.e(i, ar0Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b() {
        return Thread.currentThread().getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final u93 c(sx0 sx0Var, px pxVar) {
        go0 go0Var = (go0) pxVar;
        e70 e70Var = (e70) go0Var.j(ly.h);
        boolean zE = go0Var.e((((long) Float.floatToRawIntBits(e70Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(sx0Var.j)) << 32));
        Object objL = go0Var.L();
        if (zE || objL == nx.a) {
            ar0 ar0Var = new ar0();
            a(ar0Var, sx0Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e70Var.A(sx0Var.b))) << 32) | (((long) Float.floatToRawIntBits(e70Var.A(sx0Var.c))) & 4294967295L);
            float fIntBitsToFloat = sx0Var.d;
            float fIntBitsToFloat2 = sx0Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            u93 u93Var = new u93(ar0Var);
            String str = sx0Var.a;
            long j = sx0Var.g;
            cl clVar = j != 16 ? new cl(j, sx0Var.h) : null;
            boolean z = sx0Var.i;
            u93Var.e.setValue(new gr2(jFloatToRawIntBits));
            u93Var.f.setValue(Boolean.valueOf(z));
            q93 q93Var = u93Var.g;
            q93Var.g.setValue(clVar);
            q93Var.i.setValue(new gr2(jFloatToRawIntBits2));
            q93Var.c = str;
            go0Var.f0(u93Var);
            objL = u93Var;
        }
        return (u93) objL;
    }
}
