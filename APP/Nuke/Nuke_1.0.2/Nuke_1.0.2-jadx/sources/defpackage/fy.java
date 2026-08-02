package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fy implements xx {
    public final n4 A;
    public final z72 B;
    public final go0 C;
    public int D;
    public final yx h;
    public final s73 i;
    public final AtomicReference j = new AtomicReference(null);
    public final Object k = new Object();
    public final uk1 l;
    public final qr2 m;
    public final rk1 n;
    public final sk1 o;
    public final sk1 p;
    public final rk1 q;
    public final dq r;
    public final dq s;
    public final rk1 t;
    public rk1 u;
    public boolean v;
    public sq2 w;
    public sy1 x;
    public fy y;
    public int z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fy(yx yxVar, s73 s73Var) {
        this.h = yxVar;
        this.i = s73Var;
        uk1 uk1Var = new uk1(new sk1());
        this.l = uk1Var;
        qr2 qr2Var = new qr2();
        if (yxVar.d()) {
            qr2Var.r = new zj1();
        }
        if (yxVar.f()) {
            qr2Var.b();
        }
        this.m = qr2Var;
        this.n = qp0.o();
        this.o = new sk1();
        this.p = new sk1();
        this.q = qp0.o();
        dq dqVar = new dq();
        this.r = dqVar;
        dq dqVar2 = new dq();
        this.s = dqVar2;
        this.t = qp0.o();
        this.u = qp0.o();
        n4 n4Var = new n4(5, yxVar);
        this.A = n4Var;
        this.B = new z72();
        go0 go0Var = new go0(s73Var, yxVar, sr2.d(qr2Var), uk1Var, dqVar, dqVar2, n4Var, this);
        yxVar.p(go0Var);
        this.C = go0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(mn0 mn0Var) {
        boolean zI = i();
        q();
        yx yxVar = this.h;
        if (!zI) {
            yxVar.a(this, mn0Var);
            return;
        }
        go0 go0Var = this.C;
        go0Var.z = 0;
        go0Var.y = true;
        yxVar.a(this, mn0Var);
        go0Var.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.j.set(null);
        this.r.t.U();
        this.s.t.U();
        uk1 uk1Var = this.l;
        if (uk1Var.h.g()) {
            return;
        }
        z72 z72Var = this.B;
        try {
            z72Var.g(uk1Var, this.C.z());
            z72Var.b();
        } finally {
            z72Var.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Object obj, boolean z) {
        Object objG = this.n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof sk1;
        c21 c21Var = c21.h;
        sk1 sk1Var = this.o;
        sk1 sk1Var2 = this.p;
        rk1 rk1Var = this.t;
        if (!z2) {
            b62 b62Var = (b62) objG;
            if (qp0.S(rk1Var, obj, b62Var) || b62Var.b(obj) == c21Var) {
                return;
            }
            if (b62Var.g == null || z) {
                sk1Var.a(b62Var);
                return;
            } else {
                sk1Var2.a(b62Var);
                return;
            }
        }
        sk1 sk1Var3 = (sk1) objG;
        Object[] objArr = sk1Var3.b;
        long[] jArr = sk1Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        b62 b62Var2 = (b62) objArr[(i << 3) + i3];
                        if (!qp0.S(rk1Var, obj, b62Var2) && b62Var2.b(obj) != c21Var) {
                            if (b62Var2.g == null || z) {
                                sk1Var.a(b62Var2);
                            } else {
                                sk1Var2.a(b62Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j6;
        boolean zG;
        int i3;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i4;
        int i5;
        long[] jArr8;
        boolean z2 = set instanceof gd2;
        rk1 rk1Var = this.q;
        Object obj = null;
        int i6 = 8;
        if (z2) {
            sk1 sk1Var = ((gd2) set).h;
            Object[] objArr = sk1Var.b;
            long[] jArr9 = sk1Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i7];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c2 = c3;
                                if (obj2 instanceof b62) {
                                    ((b62) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = rk1Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof sk1) {
                                            sk1 sk1Var2 = (sk1) objG;
                                            Object[] objArr2 = sk1Var2.b;
                                            long[] jArr10 = sk1Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i11];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((n70) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i4 = length;
                                            b((n70) objG, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr9 = jArr6;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof b62) {
                    ((b62) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = rk1Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof sk1) {
                            sk1 sk1Var3 = (sk1) objG2;
                            Object[] objArr3 = sk1Var3.b;
                            long[] jArr12 = sk1Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr12[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((n70) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((n70) objG2, z);
                        }
                    }
                }
            }
        }
        rk1 rk1Var2 = this.n;
        sk1 sk1Var4 = this.o;
        if (z) {
            sk1 sk1Var5 = this.p;
            if (sk1Var5.h()) {
                long[] jArr13 = rk1Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = rk1Var2.b[i20];
                                    Object obj5 = rk1Var2.c[i20];
                                    if (obj5 instanceof sk1) {
                                        sk1 sk1Var6 = (sk1) obj5;
                                        Object[] objArr4 = sk1Var6.b;
                                        long[] jArr14 = sk1Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            b62 b62Var = (b62) objArr4[i24];
                                                            if (sk1Var5.c(b62Var) || sk1Var4.c(b62Var)) {
                                                                sk1Var6.m(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 == length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i2;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        zG = sk1Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        b62 b62Var2 = (b62) obj5;
                                        zG = sk1Var5.c(b62Var2) || sk1Var4.c(b62Var2);
                                    }
                                    if (zG) {
                                        rk1Var2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                sk1Var5.b();
                h();
                return;
            }
        }
        if (sk1Var4.h()) {
            long[] jArr15 = rk1Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = rk1Var2.b[i29];
                                Object obj7 = rk1Var2.c[i29];
                                if (obj7 instanceof sk1) {
                                    sk1 sk1Var7 = (sk1) obj7;
                                    Object[] objArr5 = sk1Var7.b;
                                    long[] jArr16 = sk1Var7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (sk1Var4.c((b62) objArr6[i33])) {
                                                            sk1Var7.m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    zC = sk1Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = sk1Var4.c((b62) obj7);
                                }
                                if (zC) {
                                    rk1Var2.l(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            h();
            sk1Var4.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void d() {
        synchronized (this.k) {
            try {
                e(this.r);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.l.h.g()) {
                        z72 z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            z72Var.b();
                            z72Var.a();
                        } catch (Throwable th2) {
                            z72Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(dq dqVar) throws Throwable {
        rf rfVar;
        z72 z72Var;
        z72 z72Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        z72 z72Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        dq dqVar2 = this.s;
        go0 go0Var = this.C;
        cy cyVarZ = go0Var.z();
        z72 z72Var4 = this.B;
        z72Var4.g(this.l, cyVarZ);
        try {
            if (dqVar.t.W()) {
                try {
                    if (dqVar2.t.W() && this.x == null) {
                        z72Var4.b();
                    }
                    return;
                } finally {
                }
            }
            sy1 sy1Var = this.x;
            if (sy1Var == null || (rfVar = sy1Var.l) == null) {
                rfVar = this.i;
            }
            try {
                Trace.beginSection(rfVar.equals(sy1Var != null ? sy1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    sy1 sy1Var2 = this.x;
                    if (sy1Var2 == null || (z72Var = sy1Var2.k) == null) {
                        z72Var = z72Var4;
                    }
                    qr2 qr2Var = this.m;
                    cy cyVarZ2 = go0Var.z();
                    tr2 tr2VarD = sr2.d(qr2Var).d();
                    int i3 = 0;
                    try {
                        dqVar.b0(rfVar, tr2VarD, z72Var, cyVarZ2);
                        tr2VarD.e(true);
                        rfVar.i();
                        Trace.endSection();
                        z72Var4.c();
                        z72Var4.d();
                        if (this.v) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.v = false;
                                rk1 rk1Var = this.n;
                                long[] jArr3 = rk1Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = rk1Var.b[i8];
                                                    Object obj2 = rk1Var.c[i8];
                                                    if (obj2 instanceof sk1) {
                                                        sk1 sk1Var = (sk1) obj2;
                                                        Object[] objArr = sk1Var.b;
                                                        long[] jArr4 = sk1Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        z72Var3 = z72Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((b62) objArr[i13]).a()) {
                                                                                    sk1Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = sk1Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        z72Var3 = z72Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((b62) obj2).a();
                                                    }
                                                    if (zG) {
                                                        rk1Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    z72Var3 = z72Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                z72Var4 = z72Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            z72Var2 = z72Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            z72Var2 = z72Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        z72Var4 = z72Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    z72Var2 = z72Var4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            z72Var2 = z72Var4;
                        }
                        try {
                            if (dqVar2.t.W() && this.x == null) {
                                z72Var2.b();
                            }
                            return;
                        } finally {
                            z72Var2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            tr2VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (dqVar2.t.W() && this.x == null) {
                z72Var4.b();
            }
            throw th;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void f() {
        synchronized (this.k) {
            try {
                dq dqVar = this.s;
                dqVar.getClass();
                if (!dqVar.t.W()) {
                    e(this.s);
                }
            } catch (Throwable th) {
                try {
                    if (!this.l.h.g()) {
                        z72 z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            z72Var.b();
                            z72Var.a();
                        } catch (Throwable th2) {
                            z72Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void g() {
        z72 z72Var;
        synchronized (this.k) {
            try {
                this.C.v = null;
                if (!this.l.h.g()) {
                    z72Var = this.B;
                    try {
                        z72Var.g(this.l, this.C.z());
                        z72Var.b();
                        z72Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.l.h.g()) {
                        z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            z72Var.b();
                            z72Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zG;
        int i3;
        long j7;
        rk1 rk1Var = this.q;
        long[] jArr3 = rk1Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = rk1Var.b[i8];
                            Object obj2 = rk1Var.c[i8];
                            boolean z = obj2 instanceof sk1;
                            rk1 rk1Var2 = this.n;
                            if (z) {
                                sk1 sk1Var = (sk1) obj2;
                                Object[] objArr = sk1Var.b;
                                long[] jArr4 = sk1Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!rk1Var2.c((n70) objArr[i13])) {
                                                        sk1Var.m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zG = sk1Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                zG = !rk1Var2.c((n70) obj2);
                            }
                            if (zG) {
                                rk1Var.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        sk1 sk1Var2 = this.p;
        if (!sk1Var2.h()) {
            return;
        }
        Object[] objArr2 = sk1Var2.b;
        long[] jArr5 = sk1Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((b62) objArr2[i18]).g != null)) {
                            sk1Var2.m(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        boolean z;
        synchronized (this.k) {
            z = true;
            if (this.D != 1) {
                z = false;
            }
            if (z) {
                this.D = 0;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final void j(mn0 mn0Var) {
        try {
            synchronized (this.k) {
                n();
                rk1 rk1Var = this.u;
                this.u = qp0.o();
                try {
                    go0 go0Var = this.C;
                    sq2 sq2Var = this.w;
                    if (!go0Var.e.t.W()) {
                        tx.a("Expected applyChanges() to have been called");
                    }
                    go0Var.P = sq2Var;
                    try {
                        go0Var.n(rk1Var, mn0Var);
                    } finally {
                        go0Var.P = null;
                    }
                } catch (Throwable th) {
                    this.u = rk1Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.l.h.g()) {
                    z72 z72Var = this.B;
                    try {
                        z72Var.g(this.l, this.C.z());
                        z72Var.b();
                        z72Var.a();
                    } catch (Throwable th3) {
                        z72Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final sy1 k(boolean z, mn0 mn0Var) {
        if (this.x != null) {
            j22.b("A pausable composition is in progress");
        }
        sy1 sy1Var = new sy1(this, this.h, this.C, this.l, mn0Var, z, this.i, this.k);
        this.x = sy1Var;
        return sy1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        synchronized (this.k) {
            try {
                if (this.x != null) {
                    j22.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.m.i == 0;
                if (!z || !this.l.h.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        z72 z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            if (!z) {
                                qr2 qr2Var = this.m;
                                z72 z72Var2 = this.B;
                                tr2 tr2VarD = qr2Var.d();
                                try {
                                    tr2VarD.n(tr2VarD.t, new af(6, z72Var2, tr2VarD));
                                    tr2VarD.e(true);
                                    this.i.i();
                                    z72Var.c();
                                } catch (Throwable th) {
                                    tr2VarD.e(false);
                                    throw th;
                                }
                            }
                            z72Var.b();
                            z72Var.a();
                        } catch (Throwable th2) {
                            z72Var.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.n.a();
                this.q.a();
                this.u.a();
                this.r.t.U();
                this.s.t.U();
                go0 go0Var = this.C;
                go0Var.E.clear();
                go0Var.s.clear();
                go0Var.e.t.U();
                go0Var.v = null;
                this.D = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        synchronized (this.k) {
            try {
                if (this.C.F) {
                    j22.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.D != 3) {
                    this.D = 3;
                    dq dqVar = this.C.L;
                    if (dqVar != null) {
                        e(dqVar);
                    }
                    boolean z = this.m.i == 0;
                    if (!z || !this.l.h.g()) {
                        z72 z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            if (!z) {
                                qr2 qr2Var = this.m;
                                z72 z72Var2 = this.B;
                                tr2 tr2VarD = qr2Var.d();
                                try {
                                    tr2VarD.n(tr2VarD.t, new s9(4, z72Var2));
                                    tr2VarD.H();
                                    tr2VarD.e(true);
                                    this.i.c();
                                    this.i.i();
                                    z72Var.c();
                                } catch (Throwable th) {
                                    tr2VarD.e(false);
                                    throw th;
                                }
                            }
                            z72Var.b();
                            z72Var.a();
                        } catch (Throwable th2) {
                            z72Var.a();
                            throw th2;
                        }
                    }
                    go0 go0Var = this.C;
                    go0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        go0Var.b.u(go0Var);
                        go0Var.E.clear();
                        go0Var.s.clear();
                        go0Var.e.t.U();
                        go0Var.v = null;
                        go0Var.a.c();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.h.v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Object obj = fg1.h;
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                tx.b("pending composition has not been applied");
                s.b();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                tx.b("corrupt pendingModifications drain: " + atomicReference);
                s.b();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(null);
        if (t11.l(andSet, fg1.h)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.x == null) {
                tx.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            tx.b("corrupt pendingModifications drain: " + atomicReference);
            s.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        fe0 fe0Var = fe0.h;
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(fe0Var);
        if (t11.l(andSet, fg1.h) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            tx.b("corrupt pendingModifications drain: " + atomicReference);
            s.b();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        int i = this.D;
        if (i != 0) {
            j22.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.x == null) {
            return;
        }
        j22.b("A pausable composition is in progress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final void r(ArrayList arrayList) {
        uk1 uk1Var = this.l;
        go0 go0Var = this.C;
        if (arrayList.size() > 0) {
            ((ui1) ((ow1) arrayList.get(0)).h).getClass();
            tx.a("Check failed");
        }
        try {
            go0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    go0Var.B(arrayList);
                    go0Var.i();
                } catch (Throwable th) {
                    go0Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!uk1Var.h.g()) {
                    z72 z72Var = this.B;
                    try {
                        z72Var.g(uk1Var, go0Var.z());
                        z72Var.b();
                        z72Var.a();
                    } catch (Throwable th3) {
                        z72Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c21 s(b62 b62Var, Object obj) {
        fy fyVar;
        int i = b62Var.b;
        if ((i & 2) != 0) {
            b62Var.b = i | 4;
        }
        ao0 ao0Var = b62Var.c;
        if (ao0Var == null || !ao0Var.a()) {
            return c21.h;
        }
        qr2 qr2Var = this.m;
        qr2Var.getClass();
        ao0 ao0Var2 = b62Var.c;
        if (ao0Var2 != null && qr2Var.e(up0.e(ao0Var2))) {
            if (b62Var.d == null) {
                return c21.h;
            }
            c21 c21VarT = t(b62Var, ao0Var, obj);
            if (c21VarT != c21.h) {
                this.A.m();
            }
            return c21VarT;
        }
        synchronized (this.k) {
            fyVar = this.y;
        }
        if (fyVar != null) {
            go0 go0Var = fyVar.C;
            if (go0Var.F && go0Var.b0(b62Var, obj)) {
                return c21.k;
            }
        }
        return c21.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c21 t(b62 b62Var, ao0 ao0Var, Object obj) {
        synchronized (this.k) {
            try {
                fy fyVar = this.y;
                fy fyVar2 = null;
                if (fyVar != null) {
                    qr2 qr2Var = this.m;
                    int i = this.z;
                    if (qr2Var.n) {
                        tx.a("Writer is active");
                    }
                    if (i < 0 || i >= qr2Var.i) {
                        tx.a("Invalid group index");
                    }
                    ao0 ao0VarE = up0.e(ao0Var);
                    if (qr2Var.e(ao0VarE)) {
                        int i2 = qr2Var.h[(i * 5) + 3] + i;
                        int i3 = ao0VarE.a;
                        if (i > i3 || i3 >= i2) {
                            fyVar = null;
                        }
                        fyVar2 = fyVar;
                    }
                }
                if (fyVar2 == null) {
                    go0 go0Var = this.C;
                    if (go0Var.F && go0Var.b0(b62Var, obj)) {
                        return c21.k;
                    }
                    if (obj == null) {
                        this.u.m(b62Var, gd3.E);
                    } else {
                        boolean z = obj instanceof n70;
                        rk1 rk1Var = this.u;
                        if (z) {
                            Object objG = rk1Var.g(b62Var);
                            if (objG == null) {
                                qp0.k(this.u, b62Var, obj);
                            } else if (objG instanceof sk1) {
                                sk1 sk1Var = (sk1) objG;
                                Object[] objArr = sk1Var.b;
                                long[] jArr = sk1Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == gd3.E) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    qp0.k(this.u, b62Var, obj);
                                }
                            } else if (objG == gd3.E) {
                            }
                        } else {
                            rk1Var.m(b62Var, gd3.E);
                        }
                    }
                }
                if (fyVar2 != null) {
                    return fyVar2.t(b62Var, ao0Var, obj);
                }
                this.h.l(this);
                return this.C.F ? c21.j : c21.i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(Object obj) {
        Object objG = this.n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof sk1;
        c21 c21Var = c21.k;
        rk1 rk1Var = this.t;
        if (!z) {
            b62 b62Var = (b62) objG;
            if (b62Var.b(obj) == c21Var) {
                qp0.k(rk1Var, obj, b62Var);
                return;
            }
            return;
        }
        sk1 sk1Var = (sk1) objG;
        Object[] objArr = sk1Var.b;
        long[] jArr = sk1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        b62 b62Var2 = (b62) objArr[(i << 3) + i3];
                        if (b62Var2.b(obj) == c21Var) {
                            qp0.k(rk1Var, obj, b62Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(Set set) {
        boolean z = set instanceof gd2;
        rk1 rk1Var = this.q;
        rk1 rk1Var2 = this.n;
        if (z) {
            sk1 sk1Var = ((gd2) set).h;
            Object[] objArr = sk1Var.b;
            long[] jArr = sk1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (rk1Var2.c(obj) || rk1Var.c(obj)) {
                                    break loop0;
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
        } else {
            for (Object obj2 : set) {
                if (rk1Var2.c(obj2) || rk1Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final boolean w() {
        synchronized (this.k) {
            sy1 sy1Var = this.x;
            boolean z = false;
            if (sy1Var != null && (sy1Var.h.get() != uy1.l || sy1Var.i != v93.b())) {
                AtomicReference atomicReference = sy1Var.h;
                uy1 uy1Var = uy1.m;
                uy1 uy1Var2 = uy1.k;
                while (!atomicReference.compareAndSet(uy1Var, uy1Var2) && atomicReference.get() == uy1Var) {
                }
                sy1Var.l.h.a(9);
                return false;
            }
            n();
            try {
                rk1 rk1Var = this.u;
                this.u = qp0.o();
                try {
                    go0 go0Var = this.C;
                    sq2 sq2Var = this.w;
                    kv1 kv1Var = go0Var.e.t;
                    if (!kv1Var.W()) {
                        tx.a("Expected applyChanges() to have been called");
                    }
                    if (rk1Var.e > 0 || !go0Var.s.isEmpty()) {
                        go0Var.P = sq2Var;
                        try {
                            go0Var.n(rk1Var, null);
                            go0Var.P = null;
                            z = !kv1Var.W();
                        } catch (Throwable th) {
                            go0Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.u = rk1Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.l.h.g()) {
                        z72 z72Var = this.B;
                        try {
                            z72Var.g(this.l, this.C.z());
                            z72Var.b();
                            z72Var.a();
                        } catch (Throwable th4) {
                            z72Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(gd2 gd2Var) {
        Object obj;
        while (true) {
            Object obj2 = this.j.get();
            if (obj2 == null || obj2.equals(fg1.h)) {
                obj = gd2Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, gd2Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    s.k("corrupt pendingModifications: ", this.j);
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = gd2Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.j;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.k) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Object obj) {
        b62 b62VarX;
        int i;
        boolean z;
        int i2;
        go0 go0Var = this.C;
        if (go0Var.A <= 0 && (b62VarX = go0Var.x()) != null) {
            int i3 = b62VarX.b | 1;
            b62VarX.b = i3;
            if ((i3 & 32) == 0) {
                gk1 gk1Var = b62VarX.f;
                if (gk1Var == null) {
                    gk1Var = new gk1();
                    b62VarX.f = gk1Var;
                }
                int i4 = b62VarX.e;
                int iC = gk1Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = gk1Var.c[iC];
                }
                gk1Var.b[iC] = obj;
                gk1Var.c[iC] = i4;
                z = i == b62VarX.e;
            }
            this.A.m();
            if (z) {
                return;
            }
            if (obj instanceof qu2) {
                ((qu2) obj).f(1);
            }
            qp0.k(this.n, obj, b62VarX);
            if (obj instanceof n70) {
                n70 n70Var = (n70) obj;
                m70 m70VarH = n70Var.h();
                rk1 rk1Var = this.q;
                qp0.T(rk1Var, obj);
                gk1 gk1Var2 = m70VarH.e;
                Object[] objArr = gk1Var2.b;
                long[] jArr = gk1Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    pu2 pu2Var = (pu2) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (pu2Var instanceof qu2) {
                                        ((qu2) pu2Var).f(1);
                                    }
                                    qp0.k(rk1Var, pu2Var, obj);
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                Object obj2 = m70VarH.f;
                rk1 rk1Var2 = b62VarX.g;
                if (rk1Var2 == null) {
                    rk1Var2 = new rk1();
                    b62VarX.g = rk1Var2;
                }
                rk1Var2.m(n70Var, obj2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Object obj) {
        synchronized (this.k) {
            try {
                u(obj);
                Object objG = this.q.g(obj);
                if (objG != null) {
                    if (objG instanceof sk1) {
                        sk1 sk1Var = (sk1) objG;
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
                                            u((n70) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((n70) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
