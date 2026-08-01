package p030F1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: F1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0437b {

    /* JADX INFO: renamed from: a */
    public final int f1309a;

    /* JADX INFO: renamed from: b */
    public final float f1310b;

    /* JADX INFO: renamed from: c */
    public final float f1311c;

    /* JADX INFO: renamed from: d */
    public final float f1312d;

    /* JADX INFO: renamed from: e */
    public final long f1313e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0437b(int i5, float f2, float f5, float f6, long j5) {
        this.f1309a = i5;
        this.f1310b = f2;
        this.f1311c = f5;
        this.f1312d = f6;
        this.f1313e = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0437b.class == obj.getClass()) {
            C0437b c0437b = (C0437b) obj;
            return this.f1311c == c0437b.f1311c && this.f1312d == c0437b.f1312d && this.f1310b == c0437b.f1310b && this.f1309a == c0437b.f1309a && this.f1313e == c0437b.f1313e;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f1313e) + AbstractC0231b.m391b(this.f1309a, AbstractC0231b.m390a(this.f1310b, AbstractC0231b.m390a(this.f1312d, Float.hashCode(this.f1311c) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NavigationEvent(touchX=" + this.f1311c + ", touchY=" + this.f1312d + ", progress=" + this.f1310b + ", swipeEdge=" + this.f1309a + ", frameTimeMillis=" + this.f1313e + ')';
    }
}
