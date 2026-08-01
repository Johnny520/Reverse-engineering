package kotlin.collections;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.Util;
import io.ktor.util.C4210;
import p007.AbstractC6136;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4332 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8771(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - Util.maxArraySize <= 0) {
            return i3;
        }
        if (i2 > 2147483639) {
            return Integer.MAX_VALUE;
        }
        return Util.maxArraySize;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m8772(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C4210.m8624(AbstractC0053.m151(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C5919.m11249(AbstractC6136.m11559(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8773(int i, int i2) {
        if (i < 0 || i > i2) {
            C7546.m12743(AbstractC6136.m11559(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8774(int i, int i2) {
        if (i < 0 || i >= i2) {
            C7546.m12743(AbstractC6136.m11559(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8775(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C4210.m8624(AbstractC0053.m151(i, i2, "startIndex: ", ", endIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C5919.m11249(AbstractC6136.m11559(i, i2, "startIndex: ", " > endIndex: "));
        }
    }
}
