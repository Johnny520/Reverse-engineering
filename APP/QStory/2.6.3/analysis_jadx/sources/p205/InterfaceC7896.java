package p205;

import androidx.window.area.AbstractC2567;
import p204.AbstractC7891;
import p204.InterfaceC7892;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7896 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    default float mo1332(float f) {
        return f / mo1256();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    default float mo1333(int i) {
        return i / mo1256();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    default long mo1334(float f) {
        return mo1340(mo1332(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    default float mo1335(long j) {
        if (!C7901.m13346(C7899.m13344(j), 4294967296L)) {
            AbstractC7907.m13359("Only Sp can convert to Px");
        }
        return mo1344(mo1341(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo1256();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default long mo1339(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC8175.m13634(mo1332(Float.intBitsToFloat((int) (j >> 32))), mo1332(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    default long mo1340(float f) {
        float[] fArr = AbstractC7891.f21858;
        if (mo1257() < 1.03f) {
            return AbstractC2567.m5062(f / mo1257(), 4294967296L);
        }
        InterfaceC7892 interfaceC7892M13316 = AbstractC7891.m13316(mo1257());
        return AbstractC2567.m5062(interfaceC7892M13316 != null ? interfaceC7892M13316.mo13314(f) : f / mo1257(), 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default float mo1341(long j) {
        if (!C7901.m13346(C7899.m13344(j), 4294967296L)) {
            AbstractC7907.m13359("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC7891.f21858;
        if (mo1257() < 1.03f) {
            return mo1257() * C7899.m13343(j);
        }
        InterfaceC7892 interfaceC7892M13316 = AbstractC7891.m13316(mo1257());
        if (interfaceC7892M13316 != null) {
            return interfaceC7892M13316.mo13313(C7899.m13343(j));
        }
        return mo1257() * C7899.m13343(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    default long mo1342(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo1344 = mo1344(C7903.m13353(j));
        float fMo13442 = mo1344(C7903.m13354(j));
        return (((long) Float.floatToRawIntBits(fMo1344)) << 32) | (((long) Float.floatToRawIntBits(fMo13442)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    default int mo1343(float f) {
        float fMo1344 = mo1344(f);
        if (Float.isInfinite(fMo1344)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo1344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    float mo1257();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    default float mo1344(float f) {
        return mo1256() * f;
    }
}
