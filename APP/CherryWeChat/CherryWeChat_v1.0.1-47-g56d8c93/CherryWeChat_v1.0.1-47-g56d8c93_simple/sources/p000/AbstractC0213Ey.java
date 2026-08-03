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

/* JADX INFO: renamed from: Ey */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0213Ey {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f629a = null;

    static {
        f629a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    }

    /* JADX INFO: renamed from: a */
    public static int m403a(int r0, int r1, int r2) {
        return (Integer.hashCode(r0) + r1) * r2;
    }

    /* JADX INFO: renamed from: b */
    public static Object m404b(long r0, C2648vx r2) {
        r2.m5180c(AbstractC0295Gu.m625r(r0));
        return r2.m5178a();
    }

    /* JADX INFO: renamed from: c */
    public static String m405c(long r0, StringBuilder r2, Exception r3) {
        r2.append(AbstractC0295Gu.m625r(r0));
        r2.append(r3.getMessage());
        return r2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m406d(RecyclerView r0, StringBuilder r1) {
        r1.append(r0.exceptionLabel());
        return r1.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m407e(String r1, String r2) {
        return r1 + r2;
    }

    /* JADX INFO: renamed from: f */
    public static String m408f(StringBuilder r0, int r1, char r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m409g(StringBuilder r0, int r1, String r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m410h(StringBuilder r0, String r1, String r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m411i(long r0, long r2, Exception r4) {
        AbstractC0295Gu.m625r(r0);
        AbstractC0295Gu.m625r(r2);
        r4.getMessage();
    }

    /* JADX INFO: renamed from: j */
    public static void m412j(long r0, long r2, Lua r4) {
        AbstractC0295Gu.m625r(r0);
        AbstractC0295Gu.m625r(r2);
        r4.pushNil();
    }

    /* JADX INFO: renamed from: k */
    public static void m413k(long r0, Context r2, int r3) {
        Toast.makeText(r2, AbstractC0295Gu.m625r(r0), r3).show();
    }

    /* JADX INFO: renamed from: l */
    public static void m414l(long r0, TextView r2, float r3) {
        r2.setText(AbstractC0295Gu.m625r(r0));
        r2.setTextSize(r3);
    }

    /* JADX INFO: renamed from: m */
    public static void m415m(long r0, StringBuilder r2, Exception r3, Lua r4) {
        r2.append(AbstractC0295Gu.m625r(r0));
        r2.append(r3.getMessage());
        r4.push(r2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m416n(C1981r r5) {
        if ((r5 instanceof AutoCloseable) == false) goto L7;
        r5.close();
        return;
    L7:
        if ((r5 instanceof ExecutorService) == false) goto L23;
        ExecutorService r52 = (ExecutorService) r5;
        if (r52 == ForkJoinPool.commonPool()) goto L34;
        boolean r0 = r52.isTerminated();
        if (r0 == true) goto L32;
        r52.shutdown();
        boolean r1 = false;
    L14:
        if (r0 == true) goto L19;
        r0 = r52.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L17
    L17:
        if (r1 == true) goto L14;
        r52.shutdownNow();
        r1 = true;
        goto L14
    L19:
        if (r1 == false) goto L33;
        Thread.currentThread().interrupt();
        return;
    L33:
        return;
    L32:
        return;
    L34:
        return;
    L23:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m417o(Object r0) {
        if (r0 != null) goto L5;
        return;
    L5:
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: p */
    public static void m418p(StringBuilder r0, int r1, long r2) {
        r0.append(r1);
        r0.append(AbstractC0295Gu.m625r(r2));
    }

    /* JADX INFO: renamed from: q */
    public static void m419q(Lua r0, int r1, String r2, double r3) {
        r0.setField(r1, r2);
        r0.push(Double.valueOf(r3));
    }

    /* JADX INFO: renamed from: r */
    public static String m420r(String r1, String r2) {
        return r1 + r2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m421s(int r1) {
        if (r1 != 1) goto L5;
        return "_32";
    L5:
        if (r1 != 2) goto L7;
        return "_64";
    L7:
        if (r1 != 3) goto L11;
        return "_128";
    L11:
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m422t(int r1) {
        if (r1 != 1) goto L5;
        return "x86";
    L5:
        if (r1 != 2) goto L7;
        return "ARM";
    L7:
        if (r1 != 3) goto L9;
        return "RISCV";
    L9:
        if (r1 != 4) goto L13;
        return "LOONGARCH";
    L13:
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m423u(int r0) {
        switch(r0) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            case 9: goto L5;
            default: goto L4;
        };
    L5:
        return "CENTER_Y";
    L7:
        return "CENTER_X";
    L9:
        return "CENTER";
    L11:
        return "BASELINE";
    L13:
        return "BOTTOM";
    L15:
        return "RIGHT";
    L17:
        return "TOP";
    L19:
        return "LEFT";
    L21:
        return "NONE";
    L4:
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m424v(int r0) {
        if (r0 == 0) goto L6;
        return r0 - 1;
    L6:
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m425w(int r0) {
        switch(r0) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return "null";
    L5:
        return "FINISHED";
    L7:
        return "ENCODE";
    L9:
        return "SOURCE";
    L11:
        return "DATA_CACHE";
    L13:
        return "RESOURCE_CACHE";
    L15:
        return "INITIALIZE";
    }
}
