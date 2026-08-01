package p000;

import com.p001mr.elaris.HookEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: a */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0000a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m0a(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static StringBuilder m1b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2c(String str, Throwable th) {
        AbstractC0497v4.m1076C(str + th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3d(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getClass().getSimpleName());
        sb.append(str);
        sb.append(th.getMessage());
        HookEntry.log(sb.toString());
    }
}
