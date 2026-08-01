package p138;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.time.C5665;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f20412 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f20411 = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m12725(String str, byte[] bArr, ClassLoader classLoader) {
        String strM13042;
        try {
            strM13042 = AbstractC7738.m13042(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM13042 = null;
        }
        if (strM13042 == null) {
            return null;
        }
        return (Class) f20412.computeIfAbsent(m12726(classLoader, str, strM13042), new C5665(2, (Serializable) bArr, (Object) str, (Object) classLoader));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12726(ClassLoader classLoader, String str, String str2) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }
}
