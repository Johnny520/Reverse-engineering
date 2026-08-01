package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1730 implements InterfaceC1717 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1730 f5005 = new C1730(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5006;

    public /* synthetic */ C1730(int i) {
        this.f5006 = i;
    }

    public String toString() {
        switch (this.f5006) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1717
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo280(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1717
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo283(C1714 c1714) {
        c1714.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long m3142(long j, long j2) {
        switch (this.f5006) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = AbstractC1722.f4994;
                return jFloatToRawIntBits;
            case 2:
                float fM3102 = AbstractC1670.m3102(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM3102)) << 32) | (((long) Float.floatToRawIntBits(fM3102)) & 4294967295L);
                int i2 = AbstractC1722.f4994;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i3 = AbstractC1722.f4994;
                    return jFloatToRawIntBits3;
                }
                float fM31022 = AbstractC1670.m3102(j, j2);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fM31022)) << 32) | (((long) Float.floatToRawIntBits(fM31022)) & 4294967295L);
                int i4 = AbstractC1722.f4994;
                return jFloatToRawIntBits4;
        }
    }
}
