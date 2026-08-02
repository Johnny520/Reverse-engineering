package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zw2 extends th1 implements s12, e70, r12 {
    public final zk1 A;
    public final zk1 B;
    public final zk1 C;
    public h12 D;
    public long E;
    public Object v;
    public Object w;
    public PointerInputEventHandler x;
    public zt2 y;
    public h12 z = vw2.a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zw2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.v = obj;
        this.w = obj2;
        this.x = pointerInputEventHandler;
        zk1 zk1Var = new zk1(new yw2[16]);
        this.A = zk1Var;
        this.B = zk1Var;
        this.C = new zk1(new yw2[16]);
        this.E = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        O0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void J(h12 h12Var, i12 i12Var, long j) {
        this.E = j;
        if (i12Var == i12.h) {
            this.z = h12Var;
        }
        t00 t00Var = null;
        if (this.y == null) {
            this.y = p7.A(A0(), null, new h50(this, t00Var, 9), 1);
        }
        N0(h12Var, i12Var);
        List list = h12Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                h12Var = null;
                break;
            } else if (!tp0.q((o12) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.D = h12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object M0(mn0 mn0Var, t00 t00Var) {
        mp mpVar = new mp(1, gf1.z(t00Var));
        mpVar.u();
        yw2 yw2Var = new yw2(this, mpVar);
        synchronized (this.B) {
            this.A.b(yw2Var);
            new xb2(gf1.z(gf1.p(yw2Var, yw2Var, mn0Var))).h(a83.a);
        }
        mpVar.w(new v5(22, yw2Var));
        return mpVar.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(h12 h12Var, i12 i12Var) {
        int i;
        int i2;
        mp mpVar;
        mp mpVar2;
        synchronized (this.B) {
            zk1 zk1Var = this.C;
            zk1Var.c(zk1Var.j, this.A);
        }
        try {
            int iOrdinal = i12Var.ordinal();
            if (iOrdinal == 0) {
                zk1 zk1Var2 = this.C;
                Object[] objArr = zk1Var2.h;
                i = zk1Var2.j;
                for (i2 = 0; i2 < i; i2++) {
                    yw2 yw2Var = (yw2) objArr[i2];
                    if (i12Var == yw2Var.k && (mpVar = yw2Var.j) != null) {
                        yw2Var.j = null;
                        mpVar.h(h12Var);
                    }
                }
            } else if (iOrdinal == 1) {
                zk1 zk1Var3 = this.C;
                int i3 = zk1Var3.j - 1;
                Object[] objArr2 = zk1Var3.h;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        yw2 yw2Var2 = (yw2) objArr2[i3];
                        if (i12Var == yw2Var2.k && (mpVar2 = yw2Var2.j) != null) {
                            yw2Var2.j = null;
                            mpVar2.h(h12Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new pv();
                }
                zk1 zk1Var22 = this.C;
                Object[] objArr3 = zk1Var22.h;
                i = zk1Var22.j;
                while (i2 < i) {
                }
            }
            this.C.g();
        } catch (Throwable th) {
            this.C.g();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O0() {
        zt2 zt2Var = this.y;
        if (zt2Var != null) {
            zt2Var.D(new xh1("Pointer input was reset", 2));
            this.y = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        O0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return sp0.c0(this).F.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void e0() {
        O0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return sp0.c0(this).F.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        h12 h12Var = this.D;
        if (h12Var == null) {
            return;
        }
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((o12) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o12 o12Var = (o12) list.get(i2);
                    long j = o12Var.a;
                    long j2 = o12Var.c;
                    long j3 = o12Var.b;
                    float f = o12Var.e;
                    boolean z = o12Var.d;
                    arrayList.add(new o12(j, j3, j2, false, f, j3, j2, z, z, o12Var.i, 0L, 1.0f, 0L));
                }
                h12 h12Var2 = new h12(arrayList, null);
                this.z = h12Var2;
                N0(h12Var2, i12.h);
                N0(h12Var2, i12.i);
                N0(h12Var2, i12.j);
                this.D = null;
                return;
            }
        }
    }
}
