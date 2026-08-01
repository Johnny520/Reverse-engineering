package androidx.compose.material3.internal;

import androidx.compose.animation.core.AbstractC1182;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1187;
import androidx.compose.animation.core.C1208;
import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1411;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.InterfaceC1423;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.material3.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1208 f3617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1208 f3618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1208 f3619;

    static {
        C1187 c1187 = new C1187(0.4f, 0.0f, 0.6f, 1.0f);
        f3619 = new C1208(120, 0, AbstractC1182.f1487);
        f3618 = new C1208(150, 0, c1187);
        f3617 = new C1208(120, 0, c1187);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世) = 
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
 binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2577(C1177 c1177, float f, InterfaceC1423 interfaceC1423, InterfaceC1423 interfaceC14232, SuspendLambda suspendLambda) {
        C1208 c1208;
        C1208 c12082 = null;
        if (interfaceC14232 != null) {
            boolean z = interfaceC14232 instanceof C1416;
            c1208 = f3619;
            if (z || (interfaceC14232 instanceof C1411) || (interfaceC14232 instanceof C1418) || (interfaceC14232 instanceof C1407)) {
                c12082 = c1208;
            }
        } else if (interfaceC1423 != null) {
            boolean z2 = interfaceC1423 instanceof C1416;
            c1208 = f3618;
            if (!z2 && !(interfaceC1423 instanceof C1411)) {
                if (interfaceC1423 instanceof C1418) {
                    c12082 = f3617;
                } else if (interfaceC1423 instanceof C1407) {
                }
            }
        }
        C1208 c12083 = c12082;
        if (c12083 != null) {
            Object objM1589 = C1177.m1589(c1177, new C8722(f), c12083, null, null, suspendLambda, 12);
            if (objM1589 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM1589;
            }
        } else {
            Object objM1591 = c1177.m1591(new C8722(f), suspendLambda);
            if (objM1591 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM1591;
            }
        }
        return C6008.f15084;
    }
}
