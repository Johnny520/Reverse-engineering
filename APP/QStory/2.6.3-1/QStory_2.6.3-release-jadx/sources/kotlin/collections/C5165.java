package kotlin.collections;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.Util;
import io.ktor.util.C5043;
import p025.AbstractC7012;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5165 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m9320(int i, int i2) {
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
    public static void m9321(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C5043.m9173(AbstractC0900.m709(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C6755.m11869(AbstractC7012.m12150(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m9322(int i, int i2) {
        if (i < 0 || i > i2) {
            C8376.m13331(AbstractC7012.m12150(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9323(int i, int i2) {
        if (i < 0 || i >= i2) {
            C8376.m13331(AbstractC7012.m12150(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m9324(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C5043.m9173(AbstractC0900.m709(i, i2, "startIndex: ", ", endIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C6755.m11869(AbstractC7012.m12150(i, i2, "startIndex: ", " > endIndex: "));
        }
    }
}
