package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 {

    /* JADX INFO: renamed from: a */
    public final int f2508a;

    /* JADX INFO: renamed from: b */
    public final float f2509b;

    /* JADX INFO: renamed from: c */
    public final float f2510c;

    /* JADX INFO: renamed from: d */
    public final float f2511d;

    /* JADX INFO: renamed from: e */
    public final long f2512e;

    public em1(int i, float f, float f2, float f3, long j) {
        this.f2508a = i;
        this.f2509b = f;
        this.f2510c = f2;
        this.f2511d = f3;
        this.f2512e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && em1.class == obj.getClass()) {
            em1 em1Var = (em1) obj;
            return this.f2510c == em1Var.f2510c && this.f2511d == em1Var.f2511d && this.f2509b == em1Var.f2509b && this.f2508a == em1Var.f2508a && this.f2512e == em1Var.f2512e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2512e) + vi0.m5685d(this.f2508a, vi0.m5684c(this.f2509b, vi0.m5684c(this.f2511d, Float.hashCode(this.f2510c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f2510c + ", touchY=" + this.f2511d + ", progress=" + this.f2509b + ", swipeEdge=" + this.f2508a + ", frameTimeMillis=" + this.f2512e + ')';
    }
}
