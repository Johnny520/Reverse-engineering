package p276t1;

/* JADX INFO: renamed from: t1.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8040i0 {

    /* JADX INFO: renamed from: a */
    public final float f26789a;

    /* JADX INFO: renamed from: b */
    public final float f26790b;

    public C8040i0(float f10, float f11) {
        this.f26789a = f10;
        this.f26790b = f11;
    }

    /* JADX INFO: renamed from: a */
    public final float m30930a() {
        return this.f26789a;
    }

    /* JADX INFO: renamed from: b */
    public final float m30931b() {
        return this.f26790b;
    }

    /* JADX INFO: renamed from: c */
    public final float[] m30932c() {
        float f10 = this.f26789a;
        float f11 = this.f26790b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8040i0)) {
            return false;
        }
        C8040i0 c8040i0 = (C8040i0) obj;
        return Float.compare(this.f26789a, c8040i0.f26789a) == 0 && Float.compare(this.f26790b, c8040i0.f26790b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f26789a) * 31) + Float.hashCode(this.f26790b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f26789a + ", y=" + this.f26790b + ')';
    }
}
