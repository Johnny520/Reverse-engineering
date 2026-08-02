package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final go0 a;
    public dq b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final i11 d = new i11();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qx(go0 go0Var, dq dqVar) {
        this.a = go0Var;
        this.b = dqVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = this.g;
        if (i > 0) {
            kv1 kv1Var = this.b.t;
            kv1Var.X(gv1.c);
            kv1Var.o[kv1Var.p - kv1Var.m[kv1Var.n - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        dq dqVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        dqVar.getClass();
        if (size != 0) {
            kv1 kv1Var2 = dqVar.t;
            kv1Var2.X(ju1.c);
            rg3.M(kv1Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                kv1 kv1Var = this.b.t;
                kv1Var.X(yu1.c);
                int i3 = kv1Var.p - kv1Var.m[kv1Var.n - 1].a;
                int[] iArr = kv1Var.o;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                kv1 kv1Var2 = this.b.t;
                kv1Var2.X(uu1.c);
                int i6 = kv1Var2.p - kv1Var2.m[kv1Var2.n - 1].a;
                int[] iArr2 = kv1Var2.o;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z) {
        pr2 pr2Var = this.a.G;
        int i = z ? pr2Var.i : pr2Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            tx.a("Tried to seek backward");
        }
        if (i2 > 0) {
            kv1 kv1Var = this.b.t;
            kv1Var.X(cu1.c);
            kv1Var.o[kv1Var.p - kv1Var.m[kv1Var.n - 1].a] = i2;
            this.f = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                tx.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
