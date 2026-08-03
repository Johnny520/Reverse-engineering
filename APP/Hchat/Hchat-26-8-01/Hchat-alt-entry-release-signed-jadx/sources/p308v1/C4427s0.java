package p308v1;

import p069f.C0963u0;

/* JADX INFO: renamed from: v1.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4427s0 implements InterfaceC4407l1 {

    /* JADX INFO: renamed from: h */
    public static final C4427s0 f14736h = new C4427s0(0);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14737g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [v1.s0.<clinit>():void] */
    public /* synthetic */ C4427s0(int i9) {
        this.f14737g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long m8876a(long j3, long j4) {
        switch (this.f14737g) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i9 = AbstractC4389f1.f14626a;
                return jFloatToRawIntBits;
            case 2:
                float fM8879c = AbstractC4434w.m8879c(j3, j4);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM8879c)) << 32) | (((long) Float.floatToRawIntBits(fM8879c)) & 4294967295L);
                int i10 = AbstractC4389f1.f14626a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j3 >> 32)) <= Float.intBitsToFloat((int) (j4 >> 32)) && Float.intBitsToFloat((int) (j3 & 4294967295L)) <= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i11 = AbstractC4389f1.f14626a;
                    return jFloatToRawIntBits3;
                }
                float fM8879c2 = AbstractC4434w.m8879c(j3, j4);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fM8879c2)) << 32) | (((long) Float.floatToRawIntBits(fM8879c2)) & 4294967295L);
                int i12 = AbstractC4389f1.f14626a;
                return jFloatToRawIntBits4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4407l1
    /* JADX INFO: renamed from: f */
    public void mo7024f(C0963u0 c0963u0) {
        c0963u0.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4407l1
    /* JADX INFO: renamed from: g */
    public boolean mo7025g(Object obj, Object obj2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f14737g) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
