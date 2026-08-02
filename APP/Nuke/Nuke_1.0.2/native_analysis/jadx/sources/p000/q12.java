package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {

    /* JADX INFO: renamed from: a */
    public final long f8690a;

    /* JADX INFO: renamed from: b */
    public final long f8691b;

    /* JADX INFO: renamed from: c */
    public final long f8692c;

    /* JADX INFO: renamed from: d */
    public final long f8693d;

    /* JADX INFO: renamed from: e */
    public final boolean f8694e;

    /* JADX INFO: renamed from: f */
    public final float f8695f;

    /* JADX INFO: renamed from: g */
    public final int f8696g;

    /* JADX INFO: renamed from: h */
    public final boolean f8697h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8698i;

    /* JADX INFO: renamed from: j */
    public final long f8699j;

    /* JADX INFO: renamed from: k */
    public final float f8700k;

    /* JADX INFO: renamed from: l */
    public final long f8701l;

    /* JADX INFO: renamed from: m */
    public final long f8702m;

    public q12(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f8690a = j;
        this.f8691b = j2;
        this.f8692c = j3;
        this.f8693d = j4;
        this.f8694e = z;
        this.f8695f = f;
        this.f8696g = i;
        this.f8697h = z2;
        this.f8698i = arrayList;
        this.f8699j = j5;
        this.f8700k = f2;
        this.f8701l = j6;
        this.f8702m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q12)) {
            return false;
        }
        q12 q12Var = (q12) obj;
        return up0.m5553s(this.f8690a, q12Var.f8690a) && this.f8691b == q12Var.f8691b && rs1.m4609b(this.f8692c, q12Var.f8692c) && rs1.m4609b(this.f8693d, q12Var.f8693d) && this.f8694e == q12Var.f8694e && Float.compare(this.f8695f, q12Var.f8695f) == 0 && this.f8696g == q12Var.f8696g && this.f8697h == q12Var.f8697h && this.f8698i.equals(q12Var.f8698i) && rs1.m4609b(this.f8699j, q12Var.f8699j) && Float.compare(this.f8700k, q12Var.f8700k) == 0 && rs1.m4609b(this.f8701l, q12Var.f8701l) && rs1.m4609b(this.f8702m, q12Var.f8702m);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8702m) + hk1.m2204c(vi0.m5684c(this.f8700k, hk1.m2204c((this.f8698i.hashCode() + hk1.m2205d(vi0.m5685d(this.f8696g, vi0.m5684c(this.f8695f, hk1.m2205d(hk1.m2204c(hk1.m2204c(hk1.m2204c(Long.hashCode(this.f8690a) * 31, 31, this.f8691b), 31, this.f8692c), 31, this.f8693d), 31, this.f8694e), 31), 31), 31, this.f8697h)) * 31, 31, this.f8699j), 31), 31, this.f8701l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) up0.m5530I(this.f8690a)) + ", uptime=" + this.f8691b + ", positionOnScreen=" + ((Object) rs1.m4614g(this.f8692c)) + ", position=" + ((Object) rs1.m4614g(this.f8693d)) + ", down=" + this.f8694e + ", pressure=" + this.f8695f + ", type=" + ((Object) w12.m5826a(this.f8696g)) + ", activeHover=" + this.f8697h + ", historical=" + this.f8698i + ", scrollDelta=" + ((Object) rs1.m4614g(this.f8699j)) + ", scaleGestureFactor=" + this.f8700k + ", panGestureOffset=" + ((Object) rs1.m4614g(this.f8701l)) + ", originalEventPosition=" + ((Object) rs1.m4614g(this.f8702m)) + ')';
    }
}
