package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 {

    /* JADX INFO: renamed from: a */
    public final long f4305a;

    /* JADX INFO: renamed from: b */
    public final long f4306b;

    /* JADX INFO: renamed from: c */
    public final long f4307c;

    /* JADX INFO: renamed from: d */
    public final boolean f4308d;

    /* JADX INFO: renamed from: e */
    public final float f4309e;

    /* JADX INFO: renamed from: f */
    public final long f4310f;

    /* JADX INFO: renamed from: g */
    public final long f4311g;

    /* JADX INFO: renamed from: h */
    public final boolean f4312h;

    /* JADX INFO: renamed from: i */
    public final int f4313i;

    /* JADX INFO: renamed from: j */
    public final long f4314j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4315k;

    /* JADX INFO: renamed from: l */
    public final long f4316l;

    /* JADX INFO: renamed from: m */
    public boolean f4317m;

    /* JADX INFO: renamed from: n */
    public boolean f4318n;

    /* JADX INFO: renamed from: o */
    public nr0 f4319o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nr0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f4305a = j;
        this.f4306b = j2;
        this.f4307c = j3;
        this.f4308d = z;
        this.f4309e = f;
        this.f4310f = j4;
        this.f4311g = j5;
        this.f4312h = z2;
        this.f4313i = i;
        this.f4314j = j6;
        this.f4316l = 0L;
        this.f4317m = z3;
        this.f4318n = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2736a() {
        nr0 nr0Var = this.f4319o;
        if (nr0Var == null) {
            this.f4317m = true;
            this.f4318n = true;
        } else if (nr0Var != null) {
            nr0Var.m2736a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2737b() {
        nr0 nr0Var = this.f4319o;
        return nr0Var != null ? nr0Var.m2737b() : this.f4317m || this.f4318n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) z60.m5428O(this.f4305a));
        sb.append(", uptimeMillis=");
        sb.append(this.f4306b);
        sb.append(", position=");
        sb.append((Object) ok0.m2936g(this.f4307c));
        sb.append(", pressed=");
        sb.append(this.f4308d);
        sb.append(", pressure=");
        sb.append(this.f4309e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f4310f);
        sb.append(", previousPosition=");
        sb.append((Object) ok0.m2936g(this.f4311g));
        sb.append(", previousPressed=");
        sb.append(this.f4312h);
        sb.append(", isConsumed=");
        sb.append(m2737b());
        sb.append(", type=");
        sb.append((Object) tr0.m4224a(this.f4313i));
        sb.append(", historical=");
        Object obj = this.f4315k;
        if (obj == null) {
            obj = C0294hs.f2354d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) ok0.m2936g(this.f4314j));
        sb.append(')');
        return sb.toString();
    }

    public nr0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.f4315k = arrayList;
        this.f4316l = j7;
    }
}
