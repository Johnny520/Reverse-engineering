package p000a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: a.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0742o6 {

    /* JADX INFO: renamed from: a */
    public final String f2930a;

    /* JADX INFO: renamed from: b */
    public volatile EnumC0780q6 f2931b = EnumC0780q6.f3074a;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f2932c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final AtomicLong f2933d = new AtomicLong(0);

    /* JADX INFO: renamed from: e */
    public final AtomicLong f2934e = new AtomicLong(0);

    /* JADX INFO: renamed from: f */
    public volatile String f2935f;

    /* JADX INFO: renamed from: g */
    public volatile String f2936g;

    /* JADX INFO: renamed from: h */
    public volatile long f2937h;

    /* JADX INFO: renamed from: i */
    public volatile int f2938i;

    public C0742o6(String str) {
        this.f2930a = str;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1761a(C0742o6 c0742o6, InterfaceC0819s7 interfaceC0819s7) {
        List listM633g0;
        EnumC0780q6 enumC0780q6 = c0742o6.f2931b;
        EnumC0780q6 enumC0780q62 = EnumC0780q6.f3075b;
        if (enumC0780q6 != enumC0780q62 && c0742o6.f2931b != EnumC0780q6.f3076c) {
            c0742o6.f2934e.incrementAndGet();
            try {
                Object objMo31a = interfaceC0819s7.mo31a();
                c0742o6.f2932c.set(0);
                return objMo31a;
            } catch (Throwable th) {
                int iIncrementAndGet = c0742o6.f2932c.incrementAndGet();
                c0742o6.f2933d.incrementAndGet();
                c0742o6.f2935f = th.getClass().getSimpleName();
                String message = th.getMessage();
                c0742o6.f2936g = message != null ? C0053Ce.m143X(message, 200) : null;
                c0742o6.f2937h = System.currentTimeMillis();
                ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                C0101F8 c0101f8 = C0083E8.f263a.get(c0742o6.f2930a.concat("/callback"));
                if (c0101f8 != null) {
                    c0101f8.f325a.incrementAndGet();
                    String message2 = th.getMessage();
                    if (message2 != null) {
                        C0053Ce.m143X(message2, 200);
                    }
                    System.currentTimeMillis();
                }
                if (iIncrementAndGet >= 3) {
                    c0742o6.f2931b = enumC0780q62;
                    c0742o6.f2938i++;
                    String str = c0742o6.f2930a;
                    int i = c0742o6.f2932c.get();
                    String simpleName = th.getClass().getSimpleName();
                    String message3 = th.getMessage();
                    C0908x1.m2193a("StabilityLayer", "[" + str + "] ISOLATED after " + i + " consecutive failures. Last: " + simpleName + ": " + (message3 != null ? C0053Ce.m143X(message3, 150) : null));
                    try {
                        th.getMessage();
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        C0631i9.m1481d(stackTrace, "getStackTrace(...)");
                        if (5 >= stackTrace.length) {
                            listM633g0 = C0238N1.m633g0(stackTrace);
                        } else {
                            ArrayList arrayList = new ArrayList(5);
                            int i2 = 0;
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                arrayList.add(stackTraceElement);
                                i2++;
                                if (i2 == 5) {
                                    break;
                                }
                            }
                            listM633g0 = arrayList;
                        }
                        String strM1952p0 = C0834t3.m1952p0(listM633g0, "\n", new C0586g2(9), 30);
                        C0949z4.m2240a();
                        C0631i9.m1482e(strM1952p0, "stackSummary");
                    } catch (Throwable unused) {
                    }
                } else {
                    String str2 = c0742o6.f2930a;
                    String simpleName2 = th.getClass().getSimpleName();
                    String message4 = th.getMessage();
                    C0908x1.m2197e("StabilityLayer", "[" + str2 + "] hook error (" + iIncrementAndGet + "/3): " + simpleName2 + ": " + (message4 != null ? C0053Ce.m143X(message4, 100) : null));
                }
            }
        }
        return null;
    }
}
