package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {
    public static final ct a = null;
    public static final ds b = null;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L6;
        a = new e80();
    L9:
        b = new ds(16);
        return;
    L6:
        if (r0 < 28) goto L8;
        a = new d80();
        goto L9
    L8:
        a = new c80();
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context r12, cl r13, Resources r14, int r15, String r16, int r17, int r18, zt r19, boolean r20) {
        int r6 = -3;
        if ((r13 instanceof fl) == false) goto L74;
        fl r132 = (fl) r13;
        String r1 = r132.d;
        Typeface r7 = null;
        boolean r8 = false;
        Object[] r82 = 0;
        Object[] r83 = 0;
        Object[] r84 = 0;
        Object[] r85 = 0;
        if (r1 != null) goto L7;
    L14:
        Typeface r110 = null;
    L15:
        if (r110 == null) goto L19;
        if (r19 == null) goto L18;
        new Handler(Looper.getMainLooper()).post(new t5(r19, 9, r110));
    L18:
        return r110;
    L19:
        int r9 = 1;
        if (r20 == true) goto L22;
        if (r19 == null) goto L23;
    L24:
        Object[] r111 = false;
    L28:
        if (r20 == false) goto L30;
        int r10 = r132.b;
    L31:
        Handler r3 = new Handler(Looper.getMainLooper());
        l0 r5 = new l0(28);
        r5.b = r19;
        y1 r133 = r132.a;
        d4 r11 = new d4(r5, r3, 6, r8);
        int r0 = 4;
        if (r111 == false) goto L53;
        ds r112 = al.a;
        String r113 = ((String) r133.f) + "-" + r18;
        Typeface r92 = (Typeface) al.a.a(r113);
        if (r92 == null) goto L36;
        r3.post(new h1(r5, r92, r0, r85 == true ? 1 : 0));
        r7 = r92;
    L79:
        if (r7 == null) goto L81;
        b.b(b(r14, r15, r16, r17, r18), r7);
    L81:
        return r7;
    L36:
        if (r10 != (-1)) goto L82;
        zk r122 = al.a(r113, r12, r133, r18);
        r11.F(r122);
        r7 = r122.a;
        goto L79
    L82:
    L52:
        ((Handler) r11.c).post(new e8((l0) r11.b, r6, r84 == true ? 1 : 0));
        goto L79
    L83:
        zk r123 = (zk) al.b.submit(new xk(r113, r12, r133, r18, 0)).get(r10, TimeUnit.MILLISECONDS);     // Catch: InterruptedException -> L52
        r11.F(r123);     // Catch: InterruptedException -> L52
        r7 = r123.a;     // Catch: InterruptedException -> L52
        goto L79
    L45:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: InterruptedException -> L52
    L43:
        e = move-exception;
        throw e;     // Catch: InterruptedException -> L52
    L48:
        throw new InterruptedException("timeout");     // Catch: InterruptedException -> L52
    L53:
        ds r114 = al.a;
        String r115 = ((String) r133.f) + "-" + r18;
        Typeface r2 = (Typeface) al.a.a(r115);
        if (r2 == null) goto L56;
        r3.post(new h1(r5, r2, r0, r83 == true ? 1 : 0));
        r7 = r2;
        goto L79
    L56:
        yk r02 = new yk(r82 == true ? 1 : 0, r11);
        Object r32 = al.c;
        monitor-enter(r32);
        u30 r22 = al.d;     // Catch: Throwable -> L63
        ArrayList r52 = (ArrayList) r22.getOrDefault(r115, null);     // Catch: Throwable -> L63
        if (r52 == null) goto L65;
        r52.add(r02);     // Catch: Throwable -> L63
        monitor-exit(r32);     // Catch: Throwable -> L63
    L85:
        goto L79
    L65:
        ArrayList r53 = new ArrayList();     // Catch: Throwable -> L63
        r53.add(r02);     // Catch: Throwable -> L63
        r22.put(r115, r53);     // Catch: Throwable -> L63
        monitor-exit(r32);     // Catch: Throwable -> L63
        xk r03 = new xk(r115, r12, r133, r18, 1);
        ThreadPoolExecutor r124 = al.b;
        yk r134 = new yk(r9, r115);
        if (Looper.myLooper() != null) goto L70;
        Handler r116 = new Handler(Looper.getMainLooper());
    L71:
        s00 r23 = new s00();
        r23.b = r03;
        r23.c = r134;
        r23.d = r116;
        r124.execute(r23);
        goto L85
    L70:
        r116 = new Handler();
    L63:
        th = move-exception;
        throw th;
    L30:
        r10 = -1;
    L23:
        r111 = true;
        goto L28
    L22:
        if (r132.c != 0) goto L24;
    L7:
        if (r1.isEmpty() == true) goto L14;
        r110 = Typeface.create(r1, 0);
        Typeface r33 = Typeface.create(Typeface.DEFAULT, 0);
        if (r110 == null) goto L14;
        if (r110.equals(r33) == true) goto L14;
    L74:
        r7 = a.g(r12, (dl) r13, r14, r18);
        if (r19 == null) goto L79;
        if (r7 == null) goto L78;
        new Handler(Looper.getMainLooper()).post(new t5(r19, 9, r7));
        goto L79
    L78:
        r19.c(-3);
        goto L79
    }

    public static String b(Resources r1, int r2, String r3, int r4, int r5) {
        return r1.getResourcePackageName(r2) + '-' + r3 + '-' + r4 + '-' + r2 + '-' + r5;
    }
}
