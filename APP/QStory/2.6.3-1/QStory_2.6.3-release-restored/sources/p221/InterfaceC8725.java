package p221;

import androidx.window.area.AbstractC3400;
import p220.AbstractC8720;
import p220.InterfaceC8721;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8725 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    default float mo1892(float f) {
        return f / mo1816();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    default float mo1893(int i) {
        return i / mo1816();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    default long mo1894(float f) {
        return mo1900(mo1892(f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    default float mo1895(long j) {
        if (!C8730.m13905(C8728.m13903(j), 4294967296L)) {
            AbstractC8736.m13918("Only Sp can convert to Px");
        }
        return mo1904(mo1901(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo1816();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    default long mo1899(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC9004.m14193(mo1892(Float.intBitsToFloat((int) (j >> 32))), mo1892(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    default long mo1900(float f) {
        float[] fArr = AbstractC8720.f22203;
        if (mo1817() < 1.03f) {
            return AbstractC3400.m5622(f / mo1817(), 4294967296L);
        }
        InterfaceC8721 interfaceC8721M13875 = AbstractC8720.m13875(mo1817());
        return AbstractC3400.m5622(interfaceC8721M13875 != null ? interfaceC8721M13875.mo13873(f) : f / mo1817(), 4294967296L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default float mo1901(long j) {
        if (!C8730.m13905(C8728.m13903(j), 4294967296L)) {
            AbstractC8736.m13918("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC8720.f22203;
        if (mo1817() < 1.03f) {
            return mo1817() * C8728.m13902(j);
        }
        InterfaceC8721 interfaceC8721M13875 = AbstractC8720.m13875(mo1817());
        if (interfaceC8721M13875 != null) {
            return interfaceC8721M13875.mo13872(C8728.m13902(j));
        }
        return mo1817() * C8728.m13902(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    default long mo1902(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo1904 = mo1904(C8732.m13912(j));
        float fMo19042 = mo1904(C8732.m13913(j));
        return (((long) Float.floatToRawIntBits(fMo1904)) << 32) | (((long) Float.floatToRawIntBits(fMo19042)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    default int mo1903(float f) {
        float fMo1904 = mo1904(f);
        if (Float.isInfinite(fMo1904)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo1904);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    float mo1817();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    default float mo1904(float f) {
        return mo1816() * f;
    }
}
