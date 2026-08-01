package p138;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.time.C5666;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7530 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f20407 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f20406 = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m12754(String str, byte[] bArr, ClassLoader classLoader) {
        String strM1157;
        try {
            strM1157 = AbstractC0455.m1157(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM1157 = null;
        }
        if (strM1157 == null) {
            return null;
        }
        return (Class) f20407.computeIfAbsent(m12755(classLoader, str, strM1157), new C5666(2, (Serializable) bArr, (Object) str, (Object) classLoader));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12755(ClassLoader classLoader, String str, String str2) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }
}
