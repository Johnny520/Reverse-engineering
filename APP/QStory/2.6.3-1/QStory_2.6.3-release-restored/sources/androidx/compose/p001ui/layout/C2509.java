package androidx.compose.p001ui.layout;

import androidx.collection.C1083;
import androidx.compose.runtime.collection.C2059;
import java.util.Map;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2509 implements InterfaceC2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2492 f5245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f5246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2492 f5248;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5249;

    public /* synthetic */ C2509(InterfaceC2492 interfaceC2492, C2496 c2496, int i, InterfaceC2492 interfaceC24922, int i2) {
        this.f5249 = i2;
        this.f5247 = c2496;
        this.f5246 = i;
        this.f5245 = interfaceC24922;
        this.f5248 = interfaceC2492;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2030() {
        switch (this.f5249) {
        }
        return this.f5248.mo2030();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2031() {
        int i = this.f5249;
        InterfaceC2492 interfaceC2492 = this.f5245;
        int i2 = this.f5246;
        C2496 c2496 = this.f5247;
        switch (i) {
            case 0:
                c2496.f5211 = i2;
                interfaceC2492.mo2031();
                C2059 c2059 = c2496.f5206;
                C1083 c1083 = c2496.f5207;
                long[] jArr = c1083.f1226;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = c1083.f1225[i6];
                                    InterfaceC2553 interfaceC2553 = (InterfaceC2553) c1083.f1224[i6];
                                    int iM2614 = c2059.m2614(obj);
                                    if (iM2614 < 0 || iM2614 >= c2496.f5211) {
                                        if (iM2614 >= 0) {
                                            Object[] objArr = c2059.f3866;
                                            Object obj2 = objArr[iM2614];
                                            objArr[iM2614] = AbstractC2505.f5238;
                                        }
                                        if (c2496.f5209.m1313(obj)) {
                                            interfaceC2553.dispose();
                                        }
                                        c1083.m1319(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                c2496.m3628(c2496.f5212);
                break;
            default:
                c2496.f5212 = i2;
                interfaceC2492.mo2031();
                if (c2496.f5219.f5465 == null) {
                    c2496.m3628(c2496.f5212);
                }
                break;
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo2032() {
        switch (this.f5249) {
        }
        return this.f5248.mo2032();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo2033() {
        switch (this.f5249) {
        }
        return this.f5248.mo2033();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2034() {
        switch (this.f5249) {
        }
        return this.f5248.mo2034();
    }
}
