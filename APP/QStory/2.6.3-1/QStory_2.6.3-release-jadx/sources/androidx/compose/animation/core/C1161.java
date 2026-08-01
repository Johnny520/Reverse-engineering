package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1161 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f1405 = new C2059(0, new C1162[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f1404 = AbstractC2202.m3034(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f1403 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f1402 = AbstractC2202.m3034(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1499(InterfaceC2208 interfaceC2208, final int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-318043801);
        int i2 = (c2159.m2938(this) ? 4 : 2) | i;
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                objM2905 = AbstractC2202.m3034(null);
                c2159.m2946(objM2905);
            }
            InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
            if (((Boolean) ((AbstractC2182) this.f1402).getValue()).booleanValue() || ((Boolean) ((AbstractC2182) this.f1404).getValue()).booleanValue()) {
                c2159.m2952(-144841960);
                boolean zM2938 = c2159.m2938(this);
                Object objM29052 = c2159.m2905();
                if (zM2938 || objM29052 == c2188) {
                    objM29052 = new InfiniteTransition$run$1$1(interfaceC2230, this, null);
                    c2159.m2946(objM29052);
                }
                AbstractC2202.m3060(c2159, this, (InterfaceC7383) objM29052);
                c2159.m2937(false);
            } else {
                c2159.m2952(-143455237);
                c2159.m2937(false);
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(i) { // from class: androidx.compose.animation.core.飘花落叶言子世苏楪哲兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(1);
                    this.f1414.m1499((InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }
}
