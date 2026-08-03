package p000;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.C1981r;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Ey */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0213Ey {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f629a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* JADX INFO: renamed from: a */
    public static int m403a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: b */
    public static Object m404b(long j, C2648vx c2648vx) {
        c2648vx.m5180c(AbstractC0295Gu.m625r(j));
        return c2648vx.m5178a();
    }

    /* JADX INFO: renamed from: c */
    public static String m405c(long j, StringBuilder sb, Exception exc) {
        sb.append(AbstractC0295Gu.m625r(j));
        sb.append(exc.getMessage());
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m406d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m407e(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m408f(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m409g(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m410h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m411i(long j, long j2, Exception exc) {
        AbstractC0295Gu.m625r(j);
        AbstractC0295Gu.m625r(j2);
        exc.getMessage();
    }

    /* JADX INFO: renamed from: j */
    public static void m412j(long j, long j2, Lua lua) {
        AbstractC0295Gu.m625r(j);
        AbstractC0295Gu.m625r(j2);
        lua.pushNil();
    }

    /* JADX INFO: renamed from: k */
    public static void m413k(long j, Context context, int i) {
        Toast.makeText(context, AbstractC0295Gu.m625r(j), i).show();
    }

    /* JADX INFO: renamed from: l */
    public static void m414l(long j, TextView textView, float f) {
        textView.setText(AbstractC0295Gu.m625r(j));
        textView.setTextSize(f);
    }

    /* JADX INFO: renamed from: m */
    public static void m415m(long j, StringBuilder sb, Exception exc, Lua lua) {
        sb.append(AbstractC0295Gu.m625r(j));
        sb.append(exc.getMessage());
        lua.push(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m416n(C1981r c1981r) throws Exception {
        boolean zIsTerminated;
        if (c1981r instanceof AutoCloseable) {
            c1981r.close();
            return;
        }
        if (!(c1981r instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) c1981r;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m417o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m418p(StringBuilder sb, int i, long j) {
        sb.append(i);
        sb.append(AbstractC0295Gu.m625r(j));
    }

    /* JADX INFO: renamed from: q */
    public static void m419q(Lua lua, int i, String str, double d) {
        lua.setField(i, str);
        lua.push(Double.valueOf(d));
    }

    /* JADX INFO: renamed from: r */
    public static String m420r(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m421s(int i) {
        if (i == 1) {
            return "_32";
        }
        if (i == 2) {
            return "_64";
        }
        if (i == 3) {
            return "_128";
        }
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m422t(int i) {
        if (i == 1) {
            return "x86";
        }
        if (i == 2) {
            return "ARM";
        }
        if (i == 3) {
            return "RISCV";
        }
        if (i == 4) {
            return "LOONGARCH";
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m423u(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return "CENTER_X";
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m424v(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m425w(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
