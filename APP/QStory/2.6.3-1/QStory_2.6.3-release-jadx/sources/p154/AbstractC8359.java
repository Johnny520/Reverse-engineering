package p154;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.time.C6496;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f20752 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f20751 = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m13313(String str, byte[] bArr, ClassLoader classLoader) {
        String strM1717;
        try {
            strM1717 = AbstractC1298.m1717(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM1717 = null;
        }
        if (strM1717 == null) {
            return null;
        }
        return (Class) f20752.computeIfAbsent(m13314(classLoader, str, strM1717), new C6496(2, (Serializable) bArr, (Object) str, (Object) classLoader));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13314(ClassLoader classLoader, String str, String str2) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }
}
