package kotlinx.coroutines.internal;

import android.os.Trace;
import androidx.compose.foundation.lazy.C1594;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.text.AbstractC5971;
import kotlinx.coroutines.AbstractC6226;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.AbstractC6252;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.C6247;
import kotlinx.coroutines.C6262;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC6236;
import kotlinx.coroutines.InterfaceC6251;
import kotlinx.coroutines.InterfaceC6284;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6185 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5317 f15274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5317 f15275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f15276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1594 f15272 = new C1594(22);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1594 f15271 = new C1594(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1594 f15277 = new C1594(24);

    static {
        int i = 1;
        f15276 = new C5317("CLOSED", i);
        f15275 = new C5317("UNDEFINED", i);
        f15274 = new C5317("REUSABLE_CLAIMED", i);
        f15273 = new C5317("NO_THREAD_ELEMENTS", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m10921(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m10922(Object obj) {
        return obj == f15276;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10923(InterfaceC5192 interfaceC5192, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC6182.f15265.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC6236) it.next()).handleException(interfaceC5192, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC6019.m10775(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused2) {
                }
            }
        }
        try {
            AbstractC6019.m10775(th, new DiagnosticCoroutineContextException(interfaceC5192));
        } catch (Throwable unused3) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC6193 m10924(Object obj) {
        if (obj != f15276) {
            return (AbstractC6193) obj;
        }
        C6755.m11870("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m10925(AbstractC6193 abstractC6193, long j, InterfaceC7383 interfaceC7383) {
        while (true) {
            if (abstractC6193.f15289 >= j && !abstractC6193.mo10918()) {
                return abstractC6193;
            }
            Object objM10913 = abstractC6193.m10913();
            C5317 c5317 = f15276;
            if (objM10913 == c5317) {
                return c5317;
            }
            AbstractC6193 abstractC61932 = (AbstractC6193) ((AbstractC6184) objM10913);
            if (abstractC61932 == null) {
                abstractC61932 = (AbstractC6193) interfaceC7383.invoke(Long.valueOf(abstractC6193.f15289 + 1), abstractC6193);
                if (abstractC6193.m10920(abstractC61932)) {
                    if (abstractC6193.mo10918()) {
                        abstractC6193.m10919();
                    }
                }
            }
            abstractC6193 = abstractC61932;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10926(int i) {
        if (i >= 1) {
            return;
        }
        C6755.m11873(AbstractC7012.m12147(i, "Expected positive parallelism level, but got "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Object m10927(InterfaceC5192 interfaceC5192, Object obj) {
        if (obj == null) {
            obj = m10928(interfaceC5192);
        }
        if (obj == 0) {
            return f15273;
        }
        if (obj instanceof Integer) {
            return interfaceC5192.fold(new C6186(((Number) obj).intValue(), interfaceC5192), f15277);
        }
        Trace.beginSection(null);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m10928(InterfaceC5192 interfaceC5192) {
        Object objFold = interfaceC5192.fold(0, f15272);
        objFold.getClass();
        return objFold;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #2 {all -> 0x006d, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x0091, B:23:0x006f, B:25:0x007d, B:30:0x0088, B:32:0x008e, B:38:0x009e, B:41:0x00a7, B:40:0x00a4, B:28:0x0083), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10929(Object obj, InterfaceC5189 interfaceC5189) throws DispatchException {
        InterfaceC6284 interfaceC6284;
        if (!(interfaceC5189 instanceof C6181)) {
            interfaceC5189.resumeWith(obj);
            return;
        }
        C6181 c6181 = (C6181) interfaceC5189;
        AbstractC6264 abstractC6264 = c6181.f15262;
        ContinuationImpl continuationImpl = c6181.f15261;
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        Object c6262 = thM9307exceptionOrNullimpl == null ? obj : new C6262(thM9307exceptionOrNullimpl, false);
        if (m10934(abstractC6264, continuationImpl.getContext())) {
            c6181.f15263 = c6262;
            c6181.f15376 = 1;
            m10933(abstractC6264, continuationImpl.getContext(), c6181);
            return;
        }
        AbstractC6226 abstractC6226M11078 = AbstractC6252.m11078();
        if (abstractC6226M11078.f15372 >= 4294967296L) {
            c6181.f15263 = c6262;
            c6181.f15376 = 1;
            abstractC6226M11078.m11021(c6181);
            return;
        }
        abstractC6226M11078.m11019(true);
        try {
            interfaceC6284 = (InterfaceC6284) continuationImpl.getContext().get(C6285.f15450);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC6284 == null || interfaceC6284.mo11121()) {
            Object obj2 = c6181.f15264;
            InterfaceC5192 context = continuationImpl.getContext();
            Object objM10927 = m10927(context, obj2);
            C6247 c6247M11030 = objM10927 != f15273 ? AbstractC6231.m11030(continuationImpl, context, objM10927) : null;
            try {
                continuationImpl.resumeWith(obj);
            } finally {
                if (c6247M11030 == null || c6247M11030.m11076()) {
                    m10930(context, objM10927);
                }
            }
        }
        c6181.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(interfaceC6284.mo11122())));
        while (abstractC6226M11078.m11022()) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m10930(InterfaceC5192 interfaceC5192, Object obj) {
        if (obj == f15273) {
            return;
        }
        if (!(obj instanceof C6186)) {
            Object objFold = interfaceC5192.fold(null, f15271);
            objFold.getClass();
            Trace.endSection();
            return;
        }
        C6186 c6186 = (C6186) obj;
        InterfaceC6251[] interfaceC6251Arr = c6186.f15279;
        int length = interfaceC6251Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            interfaceC6251Arr[length].getClass();
            Trace.endSection();
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final long m10931(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC6191.f15286;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM10697 = AbstractC5971.m10697(property);
        if (lM10697 == null) {
            C5043.m9165("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lM10697.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m10932(int i, int i2, String str) {
        return (int) m10931(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10933(AbstractC6264 abstractC6264, InterfaceC5192 interfaceC5192, Runnable runnable) throws DispatchException {
        try {
            abstractC6264.mo4018(interfaceC5192, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC6264, interfaceC5192);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10934(AbstractC6264 abstractC6264, InterfaceC5192 interfaceC5192) throws DispatchException {
        try {
            return abstractC6264.mo5051(interfaceC5192);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC6264, interfaceC5192);
        }
    }
}
