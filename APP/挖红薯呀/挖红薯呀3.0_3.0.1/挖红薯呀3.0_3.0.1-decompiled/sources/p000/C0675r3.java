package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0675r3 implements mr0, InterfaceC0332iv, t71, InterfaceC0794u8, InterfaceC0554ok, f31 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5286d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0675r3() {
        this.f5286d = 8;
        new fc0(16);
        long[] jArr = dy0.f1212a;
        new jh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m3373c(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0794u8
    /* JADX INFO: renamed from: a */
    public float mo3374a() {
        switch (this.f5286d) {
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0794u8
    /* JADX INFO: renamed from: b */
    public void mo3375b(zd0 zd0Var, int i, int[] iArr, k50 k50Var, int[] iArr2) {
        int i2 = this.f5286d;
        k50 k50Var2 = k50.f3015d;
        switch (i2) {
            case 5:
                if (k50Var != k50Var2) {
                    rd0.m3449H(i, iArr, iArr2, true);
                } else {
                    rd0.m3449H(i, iArr, iArr2, false);
                }
                break;
            default:
                if (k50Var != k50Var2) {
                    rd0.m3450I(i, iArr, iArr2, true);
                } else {
                    rd0.m3450I(i, iArr, iArr2, false);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public long m3376d(long j, long j2) {
        switch (this.f5286d) {
            case 12:
                float fM2998h = p30.m2998h(j, j2);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM2998h)) << 32) | (((long) Float.floatToRawIntBits(fM2998h)) & 4294967295L);
                int i = cy0.f913a;
                return jFloatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i2 = cy0.f913a;
                    return jFloatToRawIntBits2;
                }
                float fM2998h2 = p30.m2998h(j, j2);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fM2998h2)) << 32) | (((long) Float.floatToRawIntBits(fM2998h2)) & 4294967295L);
                int i3 = cy0.f913a;
                return jFloatToRawIntBits3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m3377e() {
        switch (this.f5286d) {
            case 28:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5286d) {
            case 5:
                return "Arrangement#Center";
            case 6:
                return "Arrangement#SpaceBetween";
            case 7:
                return "Arrangement#Top";
            case 8:
            case 9:
            default:
                return super.toString();
            case 10:
                return "Empty";
            case 11:
                return "CompositionErrorContext";
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [eq0.<init>(fq0):void, eq0.a():fq0, kl.j(android.content.Context):kv, nb1.<clinit>():void, qj0.<clinit>():void, rd0.<clinit>():void, rr.<init>(tv):void, tv.<clinit>():void, w3.<init>(android.content.Context, pk):void] */
    public /* synthetic */ C0675r3(int i) {
        this.f5286d = i;
    }

    public C0675r3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f5286d = 0;
        lr0.f3581a.getClass();
    }
}
