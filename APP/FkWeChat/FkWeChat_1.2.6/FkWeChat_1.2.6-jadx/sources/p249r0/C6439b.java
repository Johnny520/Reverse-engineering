package p249r0;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6439b {

    /* JADX INFO: renamed from: a */
    public final float f20251a;

    /* JADX INFO: renamed from: b */
    public final float f20252b;

    /* JADX INFO: renamed from: c */
    public final float f20253c;

    /* JADX INFO: renamed from: d */
    public final float f20254d;

    public C6439b(float f10, float f11, float f12, float f13) {
        this.f20251a = f10;
        this.f20252b = f11;
        this.f20253c = f12;
        this.f20254d = f13;
    }

    /* JADX INFO: renamed from: a */
    public final float m25479a() {
        return this.f20251a;
    }

    /* JADX INFO: renamed from: b */
    public final float m25480b() {
        return this.f20252b;
    }

    /* JADX INFO: renamed from: c */
    public final float m25481c() {
        return this.f20253c;
    }

    /* JADX INFO: renamed from: d */
    public final float m25482d() {
        return this.f20254d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6439b)) {
            return false;
        }
        C6439b c6439b = (C6439b) obj;
        return this.f20251a == c6439b.f20251a && this.f20252b == c6439b.f20252b && this.f20253c == c6439b.f20253c && this.f20254d == c6439b.f20254d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f20251a) * 31) + Float.hashCode(this.f20252b)) * 31) + Float.hashCode(this.f20253c)) * 31) + Float.hashCode(this.f20254d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f20251a + ", focusedAlpha=" + this.f20252b + ", hoveredAlpha=" + this.f20253c + ", pressedAlpha=" + this.f20254d + ')';
    }
}
