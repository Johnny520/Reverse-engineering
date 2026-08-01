package androidx.compose.p001ui.platform;

import androidx.collection.AbstractC1120;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.compose.runtime.InterfaceC2187;
import androidx.lifecycle.AbstractC3258;
import androidx.lifecycle.C3244;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2702 extends AbstractC3258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1093 f5714;

    public C2702() {
        C1093 c1093 = AbstractC1120.f1323;
        this.f5714 = new C1093();
    }

    @Override // androidx.lifecycle.AbstractC3258
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4045() {
        C1093 c1093 = this.f5714;
        int[] iArr = c1093.f1318;
        Object[] objArr = c1093.f1317;
        long[] jArr = c1093.f1319;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        C1091 c1091 = (C1091) objArr[i4];
                        Object[] objArr2 = c1091.f1350;
                        int i6 = c1091.f1349;
                        for (int i7 = 0; i7 < i6; i7++) {
                            C2705 c2705 = (C2705) objArr2[i7];
                            InterfaceC2187 interfaceC2187 = c2705.f5719;
                            if (interfaceC2187 != null) {
                                interfaceC2187.cancel();
                            }
                            c2705.f5719 = null;
                            C3244 c3244 = (C3244) c2705.f5722.f702;
                            c3244.f7394 = true;
                            c3244.f7396 = false;
                            c3244.m5074();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
