package p029F0;

/* JADX INFO: renamed from: F0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0402h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1226a;

    /* JADX INFO: renamed from: a */
    public long m670a(long j5, long j6) {
        float fMin = Math.min(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L);
        int i5 = AbstractC0403h0.f1227a;
        return jFloatToRawIntBits;
    }

    public String toString() {
        switch (this.f1226a) {
            case 2:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
