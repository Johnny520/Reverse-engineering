package kotlin;

import io.ktor.util.C4211;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4385;
import p052.InterfaceC6543;
import p061.AbstractC6859;
import p062.AbstractC6860;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5187 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final double m10212(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10213(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5184 m10214(InterfaceC6543 interfaceC6543) {
        interfaceC6543.getClass();
        AbstractC4385 abstractC4385 = null;
        return new SynchronizedLazyImpl(interfaceC6543, abstractC4385, 2, abstractC4385);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5184 m10215(LazyThreadSafetyMode lazyThreadSafetyMode, InterfaceC6543 interfaceC6543) {
        lazyThreadSafetyMode.getClass();
        interfaceC6543.getClass();
        int i = AbstractC5183.f14746[lazyThreadSafetyMode.ordinal()];
        AbstractC4385 abstractC4385 = null;
        int i2 = 2;
        if (i == 1) {
            return new SynchronizedLazyImpl(interfaceC6543, abstractC4385, i2, abstractC4385);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(interfaceC6543);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(interfaceC6543);
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10216(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = AbstractC6859.f18300;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC6860.f18302;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
