package p204n0;

import p128a.AbstractC1785a;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2682a {

    /* JADX INFO: renamed from: a */
    public float f8552a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f8553b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f8554c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f8555d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m4640a(float f2, float f5, float f6, float f7) {
        this.f8552a = Math.max(f2, this.f8552a);
        this.f8553b = Math.max(f5, this.f8553b);
        this.f8554c = Math.min(f6, this.f8554c);
        this.f8555d = Math.min(f7, this.f8555d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4641b() {
        return (this.f8552a >= this.f8554c) | (this.f8553b >= this.f8555d);
    }

    /* JADX INFO: renamed from: c */
    public final void m4642c(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        this.f8552a += fIntBitsToFloat;
        this.f8553b += fIntBitsToFloat2;
        this.f8554c += fIntBitsToFloat;
        this.f8555d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + AbstractC1785a.m3258t(this.f8552a) + ", " + AbstractC1785a.m3258t(this.f8553b) + ", " + AbstractC1785a.m3258t(this.f8554c) + ", " + AbstractC1785a.m3258t(this.f8555d) + ')';
    }
}
