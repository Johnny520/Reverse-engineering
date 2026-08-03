package Yue;

import android.graphics.PointF;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6628 {

    /* JADX INFO: renamed from: ۥ */
    public final PointF f2195;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f2196;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final PointF f17000;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float f17001;

    public C6628(@InterfaceC6391 PointF pointF, float f, @InterfaceC6391 PointF pointF2, float f2) {
        this.f2195 = (PointF) C6740.m21416(pointF, "start == null");
        this.f2196 = f;
        this.f17000 = (PointF) C6740.m21416(pointF2, "end == null");
        this.f17001 = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6628)) {
            return false;
        }
        C6628 c6628 = (C6628) obj;
        return Float.compare(this.f2196, c6628.f2196) == 0 && Float.compare(this.f17001, c6628.f17001) == 0 && this.f2195.equals(c6628.f2195) && this.f17000.equals(c6628.f17000);
    }

    public int hashCode() {
        int iHashCode = this.f2195.hashCode() * 31;
        float f = this.f2196;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f17000.hashCode()) * 31;
        float f2 = this.f17001;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f2195 + ", startFraction=" + this.f2196 + ", end=" + this.f17000 + ", endFraction=" + this.f17001 + C6193.f1885;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public PointF m3108() {
        return this.f17000;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m3109() {
        return this.f17001;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public PointF m21085() {
        return this.f2195;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m21086() {
        return this.f2196;
    }
}
