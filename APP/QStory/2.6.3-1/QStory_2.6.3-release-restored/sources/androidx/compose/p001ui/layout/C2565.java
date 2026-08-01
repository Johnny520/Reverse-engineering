package androidx.compose.p001ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565 implements InterfaceC2552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2565 f5350 = new C2565(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5351;

    public /* synthetic */ C2565(int i) {
        this.f5351 = i;
    }

    public String toString() {
        switch (this.f5351) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2552
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo840(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2552
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo843(C2549 c2549) {
        c2549.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long m3702(long j, long j2) {
        switch (this.f5351) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = AbstractC2557.f5339;
                return jFloatToRawIntBits;
            case 2:
                float fM3662 = AbstractC2505.m3662(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM3662)) << 32) | (((long) Float.floatToRawIntBits(fM3662)) & 4294967295L);
                int i2 = AbstractC2557.f5339;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i3 = AbstractC2557.f5339;
                    return jFloatToRawIntBits3;
                }
                float fM36622 = AbstractC2505.m3662(j, j2);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fM36622)) << 32) | (((long) Float.floatToRawIntBits(fM36622)) & 4294967295L);
                int i4 = AbstractC2557.f5339;
                return jFloatToRawIntBits4;
        }
    }
}
