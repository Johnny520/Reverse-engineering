package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o12 {

    /* JADX INFO: renamed from: a */
    public final long f7420a;

    /* JADX INFO: renamed from: b */
    public final long f7421b;

    /* JADX INFO: renamed from: c */
    public final long f7422c;

    /* JADX INFO: renamed from: d */
    public final boolean f7423d;

    /* JADX INFO: renamed from: e */
    public final float f7424e;

    /* JADX INFO: renamed from: f */
    public final long f7425f;

    /* JADX INFO: renamed from: g */
    public final long f7426g;

    /* JADX INFO: renamed from: h */
    public final boolean f7427h;

    /* JADX INFO: renamed from: i */
    public final int f7428i;

    /* JADX INFO: renamed from: j */
    public final long f7429j;

    /* JADX INFO: renamed from: k */
    public final float f7430k;

    /* JADX INFO: renamed from: l */
    public final long f7431l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f7432m;

    /* JADX INFO: renamed from: n */
    public final long f7433n;

    /* JADX INFO: renamed from: o */
    public boolean f7434o;

    /* JADX INFO: renamed from: p */
    public boolean f7435p;

    /* JADX INFO: renamed from: q */
    public o12 f7436q;

    public o12(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f7420a = j;
        this.f7421b = j2;
        this.f7422c = j3;
        this.f7423d = z;
        this.f7424e = f;
        this.f7425f = j4;
        this.f7426g = j5;
        this.f7427h = z2;
        this.f7428i = i;
        this.f7429j = j6;
        this.f7430k = f2;
        this.f7431l = j7;
        this.f7433n = 0L;
        this.f7434o = z3;
        this.f7435p = z3;
    }

    /* JADX INFO: renamed from: a */
    public final void m3463a() {
        o12 o12Var = this.f7436q;
        if (o12Var == null) {
            this.f7434o = true;
            this.f7435p = true;
        } else if (o12Var != null) {
            o12Var.m3463a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3464b() {
        o12 o12Var = this.f7436q;
        return o12Var != null ? o12Var.m3464b() : this.f7434o || this.f7435p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) up0.m5530I(this.f7420a));
        sb.append(", uptimeMillis=");
        sb.append(this.f7421b);
        sb.append(", position=");
        sb.append((Object) rs1.m4614g(this.f7422c));
        sb.append(", pressed=");
        sb.append(this.f7423d);
        sb.append(", pressure=");
        sb.append(this.f7424e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f7425f);
        sb.append(", previousPosition=");
        sb.append((Object) rs1.m4614g(this.f7426g));
        sb.append(", previousPressed=");
        sb.append(this.f7427h);
        sb.append(", isConsumed=");
        sb.append(m3464b());
        sb.append(", type=");
        sb.append((Object) w12.m5826a(this.f7428i));
        sb.append(", historical=");
        Object obj = this.f7432m;
        if (obj == null) {
            obj = be0.f819h;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) rs1.m4614g(this.f7429j));
        sb.append(", scaleFactor=");
        sb.append(this.f7430k);
        sb.append(", panOffset=");
        sb.append((Object) rs1.m4614g(this.f7431l));
        sb.append(')');
        return sb.toString();
    }

    public o12(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f7432m = arrayList;
        this.f7433n = j8;
    }
}
