package p007;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.text.C2031;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.util.qq.QQEnvTool;
import p030.InterfaceC6307;
import p032.AbstractC6318;
import p087.C7128;
import p088.C7151;
import p090.InterfaceC7185;
import p106.AbstractC7307;
import p325.AbstractC8753;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6136 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m11530(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m11531(StringBuilder sb, String str, long j) {
        sb.append(str);
        sb.append(AbstractC3056.m6668(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m11532(StringBuilder sb, long j, long j2) {
        sb.append(j);
        sb.append(AbstractC3056.m6668(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m11533(StringBuilder sb, int i, long j) {
        sb.append(i);
        sb.append(AbstractC3056.m6668(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11534(AutoCloseable autoCloseable) throws Exception {
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
                C5919.m11245();
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

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m11535(long j, InterfaceC7185 interfaceC7185, long j2) {
        AbstractC3056.m6668(j);
        interfaceC7185.getClass();
        AbstractC3056.m6668(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC1395 m11536(long j, C1353 c1353) {
        return AbstractC1367.m2466(new C1599(j), c1353);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static View m11537(View view, int i, long j) {
        View viewFindViewById = view.findViewById(i);
        AbstractC3056.m6668(j);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m11538(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m11539(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11540(int i, int i2, C2031 c2031) {
        return (c2031.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m11541(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m11542(int i, int i2, int i3, int i4, int i5) {
        AbstractC7307.m12478(i);
        AbstractC7307.m12478(i2);
        AbstractC7307.m12478(i3);
        AbstractC7307.m12478(i4);
        AbstractC7307.m12478(i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static QQNTPluginMethod m11543(long j, C7151 c7151) {
        AbstractC3056.m6668(j);
        c7151.getClass();
        return AbstractC8753.m14416();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m11544(long j, StringBuilder sb, String str) {
        sb.append(AbstractC3056.m6668(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m11545(long j, C7128 c7128, boolean z, final int i) {
        c7128.m12382(AbstractC3056.m6668(j), z);
        c7128.m12381(new InterfaceC6307() { // from class: top.suzhelan.qstory.entity.proto.QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return InterfaceC6307.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof InterfaceC6307) && number() == ((InterfaceC6307) obj).number();
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Integer.hashCode(i) ^ ("number".hashCode() * 127);
            }

            @Override // p030.InterfaceC6307
            public final /* synthetic */ int number() {
                return i;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0053.m154(sb, i, ')');
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m11546(long j, long j2, String str) {
        AbstractC3056.m6668(j);
        str.getClass();
        AbstractC3056.m6668(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m11547(long j, StringBuilder sb, long j2) {
        sb.append(AbstractC3056.m6668(j));
        sb.append(AbstractC3056.m6668(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static String m11548(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m11549(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static StringBuilder m11550(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static StringBuilder m11551(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m11552(StringBuilder sb, C7151 c7151, char c) {
        sb.append(c7151);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static StringBuilder m11553(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m11554(long j) {
        return QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m11555(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m11556(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m11557(long j, StringBuilder sb, String str) {
        sb.append(AbstractC3056.m6668(j));
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m11558(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m11559(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }
}
