package kotlinx.coroutines.internal;

import android.os.Trace;
import androidx.compose.foundation.lazy.C0753;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4360;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.text.AbstractC5139;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5404;
import kotlinx.coroutines.InterfaceC5419;
import p009.AbstractC6183;
import p052.InterfaceC6554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f14928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4485 f14929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f14930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f14931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0753 f14927 = new C0753(22);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0753 f14926 = new C0753(23);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0753 f14932 = new C0753(24);

    static {
        int i = 1;
        f14931 = new C4485("CLOSED", i);
        f14930 = new C4485("UNDEFINED", i);
        f14929 = new C4485("REUSABLE_CLAIMED", i);
        f14928 = new C4485("NO_THREAD_ELEMENTS", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m10362(Object obj, Object obj2) {
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
    public static final boolean m10363(Object obj) {
        return obj == f14931;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10364(InterfaceC4360 interfaceC4360, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC5350.f14920.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC5404) it.next()).handleException(interfaceC4360, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC5187.m10216(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused2) {
                }
            }
        }
        try {
            AbstractC5187.m10216(th, new DiagnosticCoroutineContextException(interfaceC4360));
        } catch (Throwable unused3) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC5361 m10365(Object obj) {
        if (obj != f14931) {
            return (AbstractC5361) obj;
        }
        C5925.m11311("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m10366(AbstractC5361 abstractC5361, long j, InterfaceC6554 interfaceC6554) {
        while (true) {
            if (abstractC5361.f14944 >= j && !abstractC5361.mo10359()) {
                return abstractC5361;
            }
            Object objM10354 = abstractC5361.m10354();
            C4485 c4485 = f14931;
            if (objM10354 == c4485) {
                return c4485;
            }
            AbstractC5361 abstractC53612 = (AbstractC5361) ((AbstractC5352) objM10354);
            if (abstractC53612 == null) {
                abstractC53612 = (AbstractC5361) interfaceC6554.invoke(Long.valueOf(abstractC5361.f14944 + 1), abstractC5361);
                if (abstractC5361.m10361(abstractC53612)) {
                    if (abstractC5361.mo10359()) {
                        abstractC5361.m10360();
                    }
                }
            }
            abstractC5361 = abstractC53612;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10367(int i) {
        if (i >= 1) {
            return;
        }
        C5925.m11314(AbstractC6183.m11588(i, "Expected positive parallelism level, but got "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Object m10368(InterfaceC4360 interfaceC4360, Object obj) {
        if (obj == null) {
            obj = m10369(interfaceC4360);
        }
        if (obj == 0) {
            return f14928;
        }
        if (obj instanceof Integer) {
            return interfaceC4360.fold(new C5354(((Number) obj).intValue(), interfaceC4360), f14932);
        }
        Trace.beginSection(null);
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m10369(InterfaceC4360 interfaceC4360) {
        Object objFold = interfaceC4360.fold(0, f14927);
        objFold.getClass();
        return objFold;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #2 {all -> 0x006d, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x0091, B:23:0x006f, B:25:0x007d, B:30:0x0088, B:32:0x008e, B:38:0x009e, B:41:0x00a7, B:40:0x00a4, B:28:0x0083), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10370(java.lang.Object r9, kotlin.coroutines.InterfaceC4357 r10) throws kotlinx.coroutines.DispatchException {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.internal.C5349
            if (r0 == 0) goto Lb2
            kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲 r10 = (kotlinx.coroutines.internal.C5349) r10
            kotlinx.coroutines.飘花落叶言子楪兰哲世苏 r0 = r10.f14917
            kotlin.coroutines.jvm.internal.ContinuationImpl r1 = r10.f14916
            java.lang.Throwable r2 = kotlin.Result.m8748exceptionOrNullimpl(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r3 = new kotlinx.coroutines.飘花落叶言子楪兰世哲苏
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r1.getContext()
            boolean r2 = m10375(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f14918 = r3
            r10.f15031 = r4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r9 = r1.getContext()
            m10374(r0, r9, r10)
            return
        L2f:
            kotlinx.coroutines.飘花落叶言子世哲兰苏楪 r0 = kotlinx.coroutines.AbstractC5420.m10519()
            long r5 = r0.f15027
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f14918 = r3
            r10.f15031 = r4
            r0.m10462(r10)
            goto Lac
        L46:
            r0.m10460(r4)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r3 = kotlinx.coroutines.C5453.f15105     // Catch: java.lang.Throwable -> L6d
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r2 = (kotlinx.coroutines.InterfaceC5452) r2     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L6f
            boolean r3 = r2.mo10562()     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L6f
            java.util.concurrent.CancellationException r9 = r2.mo10563()     // Catch: java.lang.Throwable -> L6d
            kotlin.Result$Failure r9 = kotlin.AbstractC5185.m10211(r9)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r9 = kotlin.Result.m8745constructorimpl(r9)     // Catch: java.lang.Throwable -> L6d
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L6d
            goto L91
        L6d:
            r9 = move-exception
            goto La8
        L6f:
            java.lang.Object r2 = r10.f14919     // Catch: java.lang.Throwable -> L6d
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r3 = r1.getContext()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = m10368(r3, r2)     // Catch: java.lang.Throwable -> L6d
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r5 = kotlinx.coroutines.internal.AbstractC5353.f14928     // Catch: java.lang.Throwable -> L6d
            if (r2 == r5) goto L82
            kotlinx.coroutines.飘花落叶言子哲世苏兰楪 r5 = kotlinx.coroutines.AbstractC5399.m10471(r1, r3, r2)     // Catch: java.lang.Throwable -> L6d
            goto L83
        L82:
            r5 = 0
        L83:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L8e
            boolean r9 = r5.m10517()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L91
        L8e:
            m10371(r3, r2)     // Catch: java.lang.Throwable -> L6d
        L91:
            boolean r9 = r0.m10463()     // Catch: java.lang.Throwable -> L6d
            if (r9 != 0) goto L91
        L97:
            r0.m10461(r4)
            goto Lac
        L9b:
            r9 = move-exception
            if (r5 == 0) goto La4
            boolean r1 = r5.m10517()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto La7
        La4:
            m10371(r3, r2)     // Catch: java.lang.Throwable -> L6d
        La7:
            throw r9     // Catch: java.lang.Throwable -> L6d
        La8:
            r10.m10466(r9)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r9 = move-exception
            r0.m10461(r4)
            throw r9
        Lb2:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.AbstractC5353.m10370(java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m10371(InterfaceC4360 interfaceC4360, Object obj) {
        if (obj == f14928) {
            return;
        }
        if (!(obj instanceof C5354)) {
            Object objFold = interfaceC4360.fold(null, f14926);
            objFold.getClass();
            Trace.endSection();
            return;
        }
        C5354 c5354 = (C5354) obj;
        InterfaceC5419[] interfaceC5419Arr = c5354.f14934;
        int length = interfaceC5419Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            interfaceC5419Arr[length].getClass();
            Trace.endSection();
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final long m10372(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC5359.f14941;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM10138 = AbstractC5139.m10138(property);
        if (lM10138 == null) {
            C4211.m8606("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lM10138.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m10373(int i, int i2, String str) {
        return (int) m10372(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10374(AbstractC5432 abstractC5432, InterfaceC4360 interfaceC4360, Runnable runnable) throws DispatchException {
        try {
            abstractC5432.mo3458(interfaceC4360, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC5432, interfaceC4360);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10375(AbstractC5432 abstractC5432, InterfaceC4360 interfaceC4360) throws DispatchException {
        try {
            return abstractC5432.mo4491(interfaceC4360);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC5432, interfaceC4360);
        }
    }
}
