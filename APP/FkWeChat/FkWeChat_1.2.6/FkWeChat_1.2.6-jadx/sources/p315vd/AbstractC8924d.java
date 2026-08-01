package p315vd;

import android.util.Log;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: vd.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8924d {

    /* JADX INFO: renamed from: a */
    public static boolean f29533a = true;

    /* JADX INFO: renamed from: vd.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29534a;

        static {
            int[] iArr = new int[b.values().length];
            f29534a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29534a[b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29534a[b.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29534a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: vd.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        DEBUG("D"),
        INFO("I"),
        WARN("W"),
        ERROR("E");


        /* JADX INFO: renamed from: q */
        public final String f29540q;

        b(String str) {
            this.f29540q = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34261a(String str, String str2) {
        m34269i(b.DEBUG, str, str2, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m34262b(String str) {
        m34269i(b.ERROR, m34266f(), str, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m34263c(String str, String str2) {
        m34269i(b.ERROR, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m34264d(String str, String str2, Throwable th) {
        m34269i(b.ERROR, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m34265e(String str, Throwable th) {
        m34269i(b.ERROR, m34266f(), str, th);
    }

    /* JADX INFO: renamed from: f */
    public static String m34266f() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 4) {
            return null;
        }
        String className = stackTrace[4].getClassName();
        return className.startsWith("me.yun.fkwechat.") ? className.substring(16) : className;
    }

    /* JADX INFO: renamed from: g */
    public static void m34267g(String str, String str2) {
        m34269i(b.INFO, str, str2, null);
    }

    /* JADX INFO: renamed from: h */
    public static void m34268h(b bVar, String str) {
        try {
            if (HookEngine.provider != null) {
                int i10 = a.f29534a[bVar.ordinal()];
                int i11 = 3;
                if (i10 != 1) {
                    if (i10 == 2) {
                        i11 = 4;
                    } else if (i10 == 3) {
                        i11 = 5;
                    } else if (i10 == 4) {
                        i11 = 6;
                    }
                }
                HookEngine.provider.log(i11, "FkWeChat", str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m34269i(b bVar, String str, String str2, Throwable th) {
        if (bVar != b.DEBUG || f29533a) {
            StringBuilder sb2 = new StringBuilder("[FkWeChat][");
            sb2.append(bVar.f29540q);
            sb2.append("]");
            if (str != null && !str.isEmpty()) {
                sb2.append("[");
                sb2.append(str);
                sb2.append("]");
            }
            sb2.append(" ");
            sb2.append(str2);
            if (th != null) {
                sb2.append("\nException: ");
                sb2.append(th.toString());
                if (th.getMessage() == null && th.getCause() != null) {
                    sb2.append("\nCaused by: ");
                    sb2.append(th.getCause().toString());
                }
                sb2.append("\nStack trace:");
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!stackTraceElement.getClassName().equals(Thread.class.getName())) {
                        sb2.append("\n\tat ");
                        sb2.append(stackTraceElement);
                    }
                }
            }
            m34268h(bVar, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str != null ? "[" + str + "] " : _UrlKt.FRAGMENT_ENCODE_SET);
            sb3.append(str2);
            String string = sb3.toString();
            int i10 = a.f29534a[bVar.ordinal()];
            if (i10 == 1) {
                Log.d("FkWeChat", string, th);
                return;
            }
            if (i10 == 2) {
                Log.i("FkWeChat", string, th);
            } else if (i10 == 3) {
                Log.w("FkWeChat", string, th);
            } else {
                if (i10 != 4) {
                    return;
                }
                Log.e("FkWeChat", string, th);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m34270j(String str, String str2) {
        m34269i(b.WARN, str, str2, null);
    }
}
