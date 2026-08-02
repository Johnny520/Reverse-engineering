package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q12(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q12)) {
            return false;
        }
        q12 q12Var = (q12) obj;
        return up0.s(this.a, q12Var.a) && this.b == q12Var.b && rs1.b(this.c, q12Var.c) && rs1.b(this.d, q12Var.d) && this.e == q12Var.e && Float.compare(this.f, q12Var.f) == 0 && this.g == q12Var.g && this.h == q12Var.h && this.i.equals(q12Var.i) && rs1.b(this.j, q12Var.j) && Float.compare(this.k, q12Var.k) == 0 && rs1.b(this.l, q12Var.l) && rs1.b(this.m, q12Var.m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.m) + hk1.c(vi0.c(this.k, hk1.c((this.i.hashCode() + hk1.d(vi0.d(this.g, vi0.c(this.f, hk1.d(hk1.c(hk1.c(hk1.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) up0.I(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) rs1.g(this.c)) + ", position=" + ((Object) rs1.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) w12.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) rs1.g(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) rs1.g(this.l)) + ", originalEventPosition=" + ((Object) rs1.g(this.m)) + ')';
    }
}
