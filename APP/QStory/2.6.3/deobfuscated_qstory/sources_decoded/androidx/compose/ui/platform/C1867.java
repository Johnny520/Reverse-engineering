package androidx.compose.ui.platform;

import androidx.collection.AbstractC0273;
import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.compose.runtime.InterfaceC1352;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.C2411;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1867 extends AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0246 f5369;

    public C1867() {
        C0246 c0246 = AbstractC0273.f978;
        this.f5369 = new C0246();
    }

    @Override // androidx.lifecycle.AbstractC2425
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo3485() {
        C0246 c0246 = this.f5369;
        int[] iArr = c0246.f973;
        Object[] objArr = c0246.f972;
        long[] jArr = c0246.f974;
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
                        C0244 c0244 = (C0244) objArr[i4];
                        Object[] objArr2 = c0244.f1005;
                        int i6 = c0244.f1004;
                        for (int i7 = 0; i7 < i6; i7++) {
                            C1870 c1870 = (C1870) objArr2[i7];
                            InterfaceC1352 interfaceC1352 = c1870.f5374;
                            if (interfaceC1352 != null) {
                                interfaceC1352.cancel();
                            }
                            c1870.f5374 = null;
                            C2411 c2411 = (C2411) c1870.f5377.f357;
                            c2411.f7049 = true;
                            c2411.f7051 = false;
                            c2411.m4514();
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
