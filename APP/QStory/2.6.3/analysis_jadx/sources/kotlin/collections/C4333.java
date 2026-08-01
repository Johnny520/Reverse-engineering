package kotlin.collections;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.Util;
import io.ktor.util.C4211;
import p009.AbstractC6183;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4333 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8761(int i, int i2) {
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
    public static void m8762(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C4211.m8614(AbstractC0053.m149(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C5925.m11310(AbstractC6183.m11591(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8763(int i, int i2) {
        if (i < 0 || i > i2) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8764(int i, int i2) {
        if (i < 0 || i >= i2) {
            C7547.m12772(AbstractC6183.m11591(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8765(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C4211.m8614(AbstractC0053.m149(i, i2, "startIndex: ", ", endIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C5925.m11310(AbstractC6183.m11591(i, i2, "startIndex: ", " > endIndex: "));
        }
    }
}
