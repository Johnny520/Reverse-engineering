package kotlin;

import io.ktor.util.C5043;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5217;
import p068.InterfaceC7372;
import p077.AbstractC7688;
import p078.AbstractC7689;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6019 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final double m10771(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m10772(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC6016 m10773(InterfaceC7372 interfaceC7372) {
        interfaceC7372.getClass();
        AbstractC5217 abstractC5217 = null;
        return new SynchronizedLazyImpl(interfaceC7372, abstractC5217, 2, abstractC5217);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC6016 m10774(LazyThreadSafetyMode lazyThreadSafetyMode, InterfaceC7372 interfaceC7372) {
        lazyThreadSafetyMode.getClass();
        interfaceC7372.getClass();
        int i = AbstractC6015.f15091[lazyThreadSafetyMode.ordinal()];
        AbstractC5217 abstractC5217 = null;
        int i2 = 2;
        if (i == 1) {
            return new SynchronizedLazyImpl(interfaceC7372, abstractC5217, i2, abstractC5217);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(interfaceC7372);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(interfaceC7372);
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m10775(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = AbstractC7688.f18645;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC7689.f18647;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
