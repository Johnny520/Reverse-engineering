package kotlin;

import io.ktor.util.C4210;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4384;
import p052.InterfaceC6542;
import p061.AbstractC6858;
import p062.AbstractC6859;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5186 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final double m10208(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10209(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5183 m10210(InterfaceC6542 interfaceC6542) {
        interfaceC6542.getClass();
        AbstractC4384 abstractC4384 = null;
        return new SynchronizedLazyImpl(interfaceC6542, abstractC4384, 2, abstractC4384);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5183 m10211(LazyThreadSafetyMode lazyThreadSafetyMode, InterfaceC6542 interfaceC6542) {
        lazyThreadSafetyMode.getClass();
        interfaceC6542.getClass();
        int i = AbstractC5182.f14746[lazyThreadSafetyMode.ordinal()];
        AbstractC4384 abstractC4384 = null;
        int i2 = 2;
        if (i == 1) {
            return new SynchronizedLazyImpl(interfaceC6542, abstractC4384, i2, abstractC4384);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(interfaceC6542);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(interfaceC6542);
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10212(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = AbstractC6858.f18305;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC6859.f18307;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
