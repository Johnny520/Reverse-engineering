package p211o0;

/* JADX INFO: renamed from: o0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2741P {

    /* JADX INFO: renamed from: b */
    public static final long f8720b = AbstractC2767z.m4938h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f8721c = 0;

    /* JADX INFO: renamed from: a */
    public final long f8722a;

    /* JADX INFO: renamed from: a */
    public static final boolean m4806a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: b */
    public static final float m4807b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m4808c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m4809d(long j5) {
        return "TransformOrigin(packedValue=" + j5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2741P) {
            return this.f8722a == ((C2741P) obj).f8722a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8722a);
    }

    public final String toString() {
        return m4809d(this.f8722a);
    }
}
