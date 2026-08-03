package p222p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p012ah.C0086a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p136j8.C2113x;
import p153k8.C2343g;
import p218og.AbstractC3149m;
import p227p4.AbstractC3306k;
import p227p4.C3305j;
import p236q1.AbstractC3424d;
import p270s4.AbstractC3928a;
import p281t3.AbstractC4106c;
import p288tb.C4143c;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3199a {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (4 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (5 int)) ? ("null") : ("GENERATED_AND_UNLOADED")) : ("PROCESS_COMPLETE")) : ("PROCESS_STARTED")) : ("LOADED")) : ("NOT_LOADED") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m6827A(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "null" : "GENERATED_AND_UNLOADED" : "PROCESS_COMPLETE" : "PROCESS_STARTED" : "LOADED" : "NOT_LOADED";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m6828a(int i9) {
        String str;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            return 2;
        }
        if (iM8279b == 1) {
            return 1;
        }
        if (iM8279b == 2) {
            return 6;
        }
        if (iM8279b == 3) {
            return 5;
        }
        if (iM8279b == 4) {
            return 4;
        }
        if (iM8279b == 5) {
            return 3;
        }
        switch (i9) {
            case 1:
                str = "EQ";
                break;
            case 2:
                str = "NE";
                break;
            case 3:
                str = "LT";
                break;
            case 4:
                str = "LE";
                break;
            case 5:
                str = "GT";
                break;
            case 6:
                str = "GE";
                break;
            default:
                str = "null";
                break;
        }
        C0086a.m452k("Unknown if operations type: ".concat(str));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m6829b(int i9) {
        int iM8279b = AbstractC4106c.m8279b(i9);
        return iM8279b == 5 || iM8279b == 6 || iM8279b == 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m6830c(int i9) {
        if (i9 == 1) {
            return "runtime";
        }
        if (i9 == 2) {
            return "build";
        }
        if (i9 == 3) {
            return "system";
        }
        if (i9 == 4) {
            return "embedded";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m6831d(int i9) {
        if (i9 == 1) {
            return "? extends ";
        }
        if (i9 == 2) {
            return "?";
        }
        if (i9 == 3) {
            return "? super ";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m6832e(int i9) {
        switch (i9) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            case 5:
                return "%";
            case 6:
                return "&";
            case 7:
                return "|";
            case 8:
                return "^";
            case 9:
                return "<<";
            case 10:
                return ">>";
            case 11:
                return ">>>";
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m6833f(int i9) {
        switch (i9) {
            case 1:
                return "==";
            case 2:
                return "!=";
            case 3:
                return "<";
            case 4:
                return "<=";
            case 5:
                return ">";
            case 6:
                return ">=";
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m6834g(int i9, int i10, int i11, int i12) {
        return (i9 * i10) + i11 + i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C1845j1 m6835h(boolean z9, C1836h0 c1836h0) {
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(Boolean.valueOf(z9));
        c1836h0.m4545k0(c1845j1M4639u);
        return c1845j1M4639u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m6836i(int i9, String str) {
        return i9 + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m6837j(int i9, String str, String str2, int i10) {
        return str + i9 + str2 + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m6838k(Class cls, String str) {
        return str + cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m6839l(String str, String str2) {
        str.getClass();
        return AbstractC3149m.m6703R0(str2).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m6840m(String str, StringBuilder sb2, boolean z9) {
        sb2.append(z9);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m6841n(StringBuilder sb2, int i9, char c10) {
        sb2.append(i9);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static StringBuilder m6842o(long j3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j3);
        sb2.append(str2);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static Map m6843p() {
        return Collections.synchronizedMap(new WeakHashMap());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C2343g m6844q() {
        WeChatApis.message().getClass();
        return WeChatApis.messageApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m6845r(int i9, int i10, int i11, int i12, int i13) {
        AbstractC3424d.m7197a(i9);
        AbstractC3424d.m7197a(i10);
        AbstractC3424d.m7197a(i11);
        AbstractC3424d.m7197a(i12);
        AbstractC3424d.m7197a(i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m6846s(C2113x c2113x, C2113x c2113x2, C2113x c2113x3, C2113x c2113x4, C2113x c2113x5) {
        AbstractC3928a.m8121a(c2113x);
        AbstractC3928a.m8121a(c2113x2);
        AbstractC3928a.m8121a(c2113x3);
        AbstractC3928a.m8121a(c2113x4);
        AbstractC3928a.m8121a(c2113x5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m6847t(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                C2104o.m5289o();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z9 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z9) {
                    executorService.shutdownNow();
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m6848u(Number number, int i9, InterfaceC1809a1 interfaceC1809a1) {
        interfaceC1809a1.setValue(Integer.valueOf(number.intValue() + i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m6849v(String str) {
        new File(str).delete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m6850w(String str, String str2, C4143c c4143c) {
        c4143c.log(str + str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m6851x(StringBuilder sb2, boolean z9, String str, boolean z10, String str2) {
        sb2.append(z9);
        sb2.append(str);
        sb2.append(z10);
        sb2.append(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m6852y(C3305j c3305j, C3305j c3305j2, C3305j c3305j3, C3305j c3305j4, C3305j c3305j5) {
        AbstractC3306k.m6994a(c3305j);
        AbstractC3306k.m6994a(c3305j2);
        AbstractC3306k.m6994a(c3305j3);
        AbstractC3306k.m6994a(c3305j4);
        AbstractC3306k.m6994a(c3305j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static int m6853z(int i9, int i10, int i11, int i12) {
        return ((i9 - i10) * i11) + i12;
    }
}
