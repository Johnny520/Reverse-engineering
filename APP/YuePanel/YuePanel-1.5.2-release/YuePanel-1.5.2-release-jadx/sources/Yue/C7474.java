package Yue;

import android.util.SizeF;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7474 {

    /* JADX INFO: renamed from: ۥ */
    public final float f2906;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f2907;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡۥ$ۥ */
    @InterfaceC7113(21)
    public static final class C1271 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static SizeF m3671(@InterfaceC6391 C7474 c7474) {
            C6740.m21415(c7474);
            return new SizeF(c7474.m3670(), c7474.m3669());
        }

        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static C7474 m3672(@InterfaceC6391 SizeF sizeF) {
            C6740.m21415(sizeF);
            return new C7474(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public C7474(float f, float f2) {
        this.f2906 = C6740.m21407(f, "width");
        this.f2907 = C6740.m21407(f2, "height");
    }

    @InterfaceC6391
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7474 m23431(@InterfaceC6391 SizeF sizeF) {
        return C1271.m3672(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7474)) {
            return false;
        }
        C7474 c7474 = (C7474) obj;
        return c7474.f2906 == this.f2906 && c7474.f2907 == this.f2907;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f2906) ^ Float.floatToIntBits(this.f2907);
    }

    @InterfaceC6391
    public String toString() {
        return this.f2906 + "x" + this.f2907;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m3669() {
        return this.f2907;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m3670() {
        return this.f2906;
    }

    @InterfaceC6391
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public SizeF m23432() {
        return C1271.m3671(this);
    }
}
