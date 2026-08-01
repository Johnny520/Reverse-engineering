package p205;

import p053.AbstractC6560;
import p204.AbstractC7890;
import p204.InterfaceC7891;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7895 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    default float mo1322(float f) {
        return f / mo1246();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    default float mo1323(int i) {
        return i / mo1246();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    default long mo1324(float f) {
        return mo1330(mo1322(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    default float mo1325(long j) {
        if (!C7900.m13318(C7898.m13316(j), 4294967296L)) {
            AbstractC7906.m13331("Only Sp can convert to Px");
        }
        return mo1334(mo1331(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo1246();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default long mo1329(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC6560.m12023(mo1322(Float.intBitsToFloat((int) (j >> 32))), mo1322(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    default long mo1330(float f) {
        float[] fArr = AbstractC7890.f21861;
        if (mo1247() < 1.03f) {
            return AbstractC9124.m14667(f / mo1247(), 4294967296L);
        }
        InterfaceC7891 interfaceC7891M13288 = AbstractC7890.m13288(mo1247());
        return AbstractC9124.m14667(interfaceC7891M13288 != null ? interfaceC7891M13288.mo13286(f) : f / mo1247(), 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default float mo1331(long j) {
        if (!C7900.m13318(C7898.m13316(j), 4294967296L)) {
            AbstractC7906.m13331("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC7890.f21861;
        if (mo1247() < 1.03f) {
            return mo1247() * C7898.m13315(j);
        }
        InterfaceC7891 interfaceC7891M13288 = AbstractC7890.m13288(mo1247());
        if (interfaceC7891M13288 != null) {
            return interfaceC7891M13288.mo13285(C7898.m13315(j));
        }
        return mo1247() * C7898.m13315(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    default long mo1332(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo1334 = mo1334(C7902.m13325(j));
        float fMo13342 = mo1334(C7902.m13326(j));
        return (((long) Float.floatToRawIntBits(fMo1334)) << 32) | (((long) Float.floatToRawIntBits(fMo13342)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    default int mo1333(float f) {
        float fMo1334 = mo1334(f);
        if (Float.isInfinite(fMo1334)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo1334);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    float mo1247();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    default float mo1334(float f) {
        return mo1246() * f;
    }
}
