package p025;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p049.AbstractC7166;
import p104.C7981;
import p122.AbstractC8137;
import p303.RestoredStrings;
import p345.AbstractC9590;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7012 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC2230 m12128(long j, C2188 c2188) {
        return AbstractC2202.m3035(new C2434(j), c2188);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static View m12129(View view, int i, int i2) {
        View viewFindViewById = view.findViewById(i);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m12130(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m12131(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m12132(int i, int i2, C2865 c2865) {
        return (c2865.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12133(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12134(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                C6755.m11865();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m12135(int i, int i2, int i3, int i4, int i5) {
        AbstractC8137.m13064(i);
        AbstractC8137.m13064(i2);
        AbstractC8137.m13064(i3);
        AbstractC8137.m13064(i4);
        AbstractC8137.m13064(i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m12136(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m12137(StringBuilder sb, int i, int i2) {
        sb.append(i);
        sb.append(RestoredStrings.get(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m12138(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(RestoredStrings.get(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static String m12139(StringBuilder sb, C7981 c7981, char c) {
        sb.append(c7981);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m12140(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static StringBuilder m12141(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static QQNTPluginMethod m12142(String str, C7981 c7981) {
        c7981.getClass();
        return AbstractC9590.m15009();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static StringBuilder m12143(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static StringBuilder m12144(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m12145(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m12146(int i) {
        return QQEnvTool.getQRouteApi(AbstractC7166.m12425(RestoredStrings.get(i)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m12147(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m12148(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m12149(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m12150(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }
}
