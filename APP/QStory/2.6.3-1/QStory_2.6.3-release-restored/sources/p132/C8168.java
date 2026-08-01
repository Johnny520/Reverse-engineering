package p132;

import androidx.appcompat.widget.C1041;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import java.util.Map;
import kotlin.C6008;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p068.InterfaceC7387;
import p105.C8009;
import p147.AbstractC8333;
import top.suzhelan.qstory.p015ui.components.C6797;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8168 implements InterfaceC8169 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5703 f19895;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6886 f19896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1083 f19897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC8174 f19898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19899;

    static {
        int i = 13;
        f19895 = new C5703(new C6797((byte) 0, 4), i, new C8009(1));
    }

    public C8168(Map map) {
        this.f19899 = map;
        long[] jArr = AbstractC1137.f1352;
        this.f19897 = new C1083();
        this.f19896 = new C6886(this, 5);
    }

    @Override // p132.InterfaceC8169
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2042(Object obj, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(533563200);
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
            c2159.m2955(obj);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                C6886 c6886 = this.f19896;
                if (!((Boolean) c6886.invoke(obj)).booleanValue()) {
                    C1123.m1409(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f19899.get(obj);
                C2169 c2169 = AbstractC8177.f19919;
                C8178 c8178 = new C8178(new C8173(map, c6886));
                c2159.m2946(c8178);
                objM2905 = c8178;
            }
            C8178 c81782 = (C8178) objM2905;
            int i3 = 8;
            AbstractC2202.m3046(new C1041[]{AbstractC8177.f19919.mo2988(c81782), AbstractC8333.f20714.mo2988(c81782)}, c2077, c2159, (i2 & 112) | 8);
            boolean zM2938 = c2159.m2938(this) | c2159.m2938(obj) | c2159.m2938(c81782);
            Object objM29052 = c2159.m2905();
            if (zM2938 || objM29052 == c2188) {
                objM29052 = new C1597(this, obj, c81782, i3);
                c2159.m2946(objM29052);
            }
            AbstractC2202.m3044(C6008.f15084, (InterfaceC7387) objM29052, c2159);
            if (c2159.f4195 && c2159.f4199.f3907 == c2159.f4194) {
                c2159.f4194 = -1;
                c2159.f4195 = false;
            }
            c2159.m2937(false);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(this, obj, c2077, i, 7);
        }
    }
}
