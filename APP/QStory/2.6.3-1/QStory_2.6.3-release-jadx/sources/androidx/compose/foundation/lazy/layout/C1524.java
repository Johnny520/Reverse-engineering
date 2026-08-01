package androidx.compose.foundation.lazy.layout;

import androidx.activity.compose.C0849;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import java.util.Map;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p132.AbstractC8177;
import p132.C8168;
import p132.C8173;
import p132.InterfaceC8167;
import p132.InterfaceC8169;
import p132.InterfaceC8174;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1524 implements InterfaceC8174, InterfaceC8169 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8168 f2253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1082 f2254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8173 f2255;

    public C1524(InterfaceC8174 interfaceC8174, Map map, C8168 c8168) {
        C1564 c1564 = new C1564(interfaceC8174, 3);
        C2169 c2169 = AbstractC8177.f19919;
        this.f2255 = new C8173(map, c1564);
        this.f2253 = c8168;
        C1082 c1082 = AbstractC1132.f1342;
        this.f2254 = new C1082();
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC8167 mo2041(String str, InterfaceC7372 interfaceC7372) {
        return this.f2255.mo2041(str, interfaceC7372);
    }

    @Override // p132.InterfaceC8169
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2042(Object obj, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-858296452);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(this) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            this.f2253.mo2042(obj, c2077, c2159, i2 & 126);
            boolean zM2938 = c2159.m2938(this) | c2159.m2938(obj);
            Object objM2905 = c2159.m2905();
            if (zM2938 || objM2905 == C2204.f4319) {
                objM2905 = new C0849(this, 11, obj);
                c2159.m2946(objM2905);
            }
            AbstractC2202.m3044(obj, (InterfaceC7387) objM2905, c2159);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(this, obj, c2077, i, 1);
        }
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo2043(String str) {
        return this.f2255.mo2043(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo2044() {
        C1082 c1082 = this.f2254;
        Object[] objArr = c1082.f1345;
        long[] jArr = c1082.f1346;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            C8168 c8168 = this.f2253;
                            if (c8168.f19897.m1318(obj) == null) {
                                c8168.f19899.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f2255.mo2044();
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo2045(Object obj) {
        return this.f2255.mo2045(obj);
    }
}
