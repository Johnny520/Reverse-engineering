package p103h2;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847b {

    /* JADX INFO: renamed from: a */
    public final float f7406a;

    /* JADX INFO: renamed from: b */
    public final float f7407b;

    /* JADX INFO: renamed from: c */
    public final long f7408c;

    /* JADX INFO: renamed from: d */
    public final int f7409d;

    public C2847b(float f10, float f11, long j10, int i10) {
        this.f7406a = f10;
        this.f7407b = f11;
        this.f7408c = j10;
        this.f7409d = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2847b)) {
            return false;
        }
        C2847b c2847b = (C2847b) obj;
        return c2847b.f7406a == this.f7406a && c2847b.f7407b == this.f7407b && c2847b.f7408c == this.f7408c && c2847b.f7409d == this.f7409d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f7406a) * 31) + Float.hashCode(this.f7407b)) * 31) + Long.hashCode(this.f7408c)) * 31) + Integer.hashCode(this.f7409d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f7406a + ",horizontalScrollPixels=" + this.f7407b + ",uptimeMillis=" + this.f7408c + ",deviceId=" + this.f7409d + ')';
    }
}
