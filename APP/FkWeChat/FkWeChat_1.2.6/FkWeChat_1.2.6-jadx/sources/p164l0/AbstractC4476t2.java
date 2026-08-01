package p164l0;

import p250r1.C6455e;
import p250r1.C6457g;

/* JADX INFO: renamed from: l0.t2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4476t2 {
    /* JADX INFO: renamed from: a */
    public static final long m17327a(long j10, C6457g c6457g) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) < c6457g.m25583l() ? c6457g.m25583l() : Float.intBitsToFloat(i10) > c6457g.m25584m() ? c6457g.m25584m() : Float.intBitsToFloat(i10))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11) < c6457g.m25586o() ? c6457g.m25586o() : Float.intBitsToFloat(i11) > c6457g.m25580i() ? c6457g.m25580i() : Float.intBitsToFloat(i11))) & 4294967295L));
    }
}
