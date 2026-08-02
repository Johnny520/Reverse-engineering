package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 implements of1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ of1 b;
    public final /* synthetic */ f71 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ of1 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a71(of1 of1Var, f71 f71Var, int i, of1 of1Var2, int i2) {
        this.a = i2;
        this.c = f71Var;
        this.d = i;
        this.e = of1Var2;
        this.b = of1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    @Override // defpackage.of1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        int i2 = this.a;
        of1 of1Var = this.e;
        int i3 = this.d;
        f71 f71Var = this.c;
        switch (i2) {
            case 0:
                f71Var.l = i3;
                of1Var.b();
                zk1 zk1Var = f71Var.t;
                rk1 rk1Var = f71Var.s;
                long[] jArr = rk1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = rk1Var.b[i8];
                                    fw2 fw2Var = (fw2) rk1Var.c[i8];
                                    int i9 = zk1Var.i(obj);
                                    if (i9 < 0 || i9 >= f71Var.l) {
                                        if (i9 >= 0) {
                                            Object obj2 = rp0.l;
                                            i = i5;
                                            Object[] objArr = zk1Var.h;
                                            Object obj3 = objArr[i9];
                                            objArr[i9] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (f71Var.q.b(obj)) {
                                            fw2Var.a();
                                        }
                                        rk1Var.l(i8);
                                    } else {
                                        i = i5;
                                    }
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                f71Var.g(f71Var.k);
                break;
            default:
                f71Var.k = i3;
                of1Var.b();
                if (f71Var.h.o == null) {
                    f71Var.g(f71Var.k);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final in0 d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
