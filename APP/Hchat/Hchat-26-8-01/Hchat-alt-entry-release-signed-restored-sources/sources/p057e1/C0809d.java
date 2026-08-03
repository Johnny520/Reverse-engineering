package p057e1;

import be.AbstractC0283h;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809d {

    /* JADX INFO: renamed from: a */
    public final float f2420a;

    /* JADX INFO: renamed from: b */
    public final float f2421b;

    /* JADX INFO: renamed from: c */
    public final float f2422c;

    /* JADX INFO: renamed from: d */
    public final float f2423d;

    /* JADX INFO: renamed from: e */
    public final long f2424e;

    /* JADX INFO: renamed from: f */
    public final long f2425f;

    /* JADX INFO: renamed from: g */
    public final long f2426g;

    /* JADX INFO: renamed from: h */
    public final long f2427h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0283h.m1149b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0809d(float f3, float f10, float f11, float f12, long j3, long j4, long j5, long j10) {
        this.f2420a = f3;
        this.f2421b = f10;
        this.f2422c = f11;
        this.f2423d = f12;
        this.f2424e = j3;
        this.f2425f = j4;
        this.f2426g = j5;
        this.f2427h = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0809d)) {
            return false;
        }
        C0809d c0809d = (C0809d) obj;
        return Float.compare(this.f2420a, c0809d.f2420a) == 0 && Float.compare(this.f2421b, c0809d.f2421b) == 0 && Float.compare(this.f2422c, c0809d.f2422c) == 0 && Float.compare(this.f2423d, c0809d.f2423d) == 0 && AbstractC0000a.m17J(this.f2424e, c0809d.f2424e) && AbstractC0000a.m17J(this.f2425f, c0809d.f2425f) && AbstractC0000a.m17J(this.f2426g, c0809d.f2426g) && AbstractC0000a.m17J(this.f2427h, c0809d.f2427h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2427h) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2241d(this.f2423d, AbstractC0921a.m2241d(this.f2422c, AbstractC0921a.m2241d(this.f2421b, Float.hashCode(this.f2420a) * 31, 31), 31), 31), 31, this.f2424e), 31, this.f2425f), 31, this.f2426g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = AbstractC0018a.m234V(this.f2420a) + ", " + AbstractC0018a.m234V(this.f2421b) + ", " + AbstractC0018a.m234V(this.f2422c) + ", " + AbstractC0018a.m234V(this.f2423d);
        long j3 = this.f2424e;
        long j4 = this.f2425f;
        boolean zM17J = AbstractC0000a.m17J(j3, j4);
        long j5 = this.f2426g;
        long j10 = this.f2427h;
        if (!zM17J || !AbstractC0000a.m17J(j4, j5) || !AbstractC0000a.m17J(j5, j10)) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("RoundRect(rect=", str, ", topLeft=");
            sbM1026o.append((Object) AbstractC0000a.m34R0(j3));
            sbM1026o.append(", topRight=");
            sbM1026o.append((Object) AbstractC0000a.m34R0(j4));
            sbM1026o.append(", bottomRight=");
            sbM1026o.append((Object) AbstractC0000a.m34R0(j5));
            sbM1026o.append(", bottomLeft=");
            sbM1026o.append((Object) AbstractC0000a.m34R0(j10));
            sbM1026o.append(')');
            return sbM1026o.toString();
        }
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.intBitsToFloat(i10)) {
            StringBuilder sbM1026o2 = AbstractC0255e.m1026o("RoundRect(rect=", str, ", radius=");
            sbM1026o2.append(AbstractC0018a.m234V(Float.intBitsToFloat(i9)));
            sbM1026o2.append(')');
            return sbM1026o2.toString();
        }
        StringBuilder sbM1026o3 = AbstractC0255e.m1026o("RoundRect(rect=", str, ", x=");
        sbM1026o3.append(AbstractC0018a.m234V(Float.intBitsToFloat(i9)));
        sbM1026o3.append(", y=");
        sbM1026o3.append(AbstractC0018a.m234V(Float.intBitsToFloat(i10)));
        sbM1026o3.append(')');
        return sbM1026o3.toString();
    }
}
