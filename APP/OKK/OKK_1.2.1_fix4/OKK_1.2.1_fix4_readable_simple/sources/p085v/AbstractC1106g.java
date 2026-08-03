package p085v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.abc.core.runtime.AbstractC0805P;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.AbstractC0009j;
import p000A.C0002c;
import p000A.C0005f;
import p000A.C0007h;
import p000A.C0008i;
import p000A.CallableC0006g;
import p000A.RunnableC0000a;
import p000A.RunnableC0001b;
import p000A.RunnableC0014o;
import p006D.C0095d;
import p034S.RunnableC0328h;
import p063j.C0961f;
import p063j.C0966k;
import p083u.AbstractC1083b;
import p083u.C1087f;
import p083u.C1089h;
import p083u.InterfaceC1086e;

/* JADX INFO: renamed from: v.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0805P f4256a = null;

    /* JADX INFO: renamed from: b */
    public static final C0961f f4257b = null;

    static {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 29) goto L6;
        f4256a = new C1109j();
    L9:
        f4257b = new C0961f(16);
        return;
    L6:
        if (r02 < 28) goto L8;
        f4256a = new C1108i();
        goto L9
    L8:
        f4256a = new C1107h();
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m2604a(Context r15, InterfaceC1086e r16, Resources r17, int r18, String r19, int r20, int r21, AbstractC1083b r22, boolean r23) {
        int r8 = 1;
        int r3 = 8;
        int r4 = 0;
        if ((r16 instanceof C1089h) == false) goto L75;
        C1089h r1 = (C1089h) r16;
        String r5 = r1.f4204d;
        Typeface r10 = null;
        if (r5 != null) goto L7;
    L14:
        Typeface r52 = null;
    L15:
        if (r52 == null) goto L19;
        if (r22 == null) goto L18;
        new Handler(Looper.getMainLooper()).post(new RunnableC0328h(r22, r52, r3));
    L18:
        return r52;
    L19:
        if (r23 == true) goto L21;
        if (r22 == null) goto L22;
    L23:
        boolean r32 = false;
    L27:
        if (r23 == false) goto L29;
        int r11 = r1.f4202b;
    L30:
        Handler r6 = new Handler(Looper.getMainLooper());
        C0095d r12 = new C0095d(24);
        r12.f251b = r22;
        C0005f r13 = r1.f4201a;
        C0002c r14 = new C0002c(r12, r6, r4);
        if (r32 == false) goto L53;
        C0961f r110 = AbstractC0009j.f24a;
        String r2 = r13.f14e + "-" + r21;
        Typeface r111 = (Typeface) AbstractC0009j.f24a.m2313a(r2);
        if (r111 == null) goto L36;
        r6.post(new RunnableC0000a(r12, r111, r4));
    L35:
        r10 = r111;
    L80:
        if (r10 == null) goto L82;
        f4257b.m2314b(m2605b(r17, r18, r19, r20, r21), r10);
    L82:
        return r10;
    L36:
        if (r11 != (-1)) goto L83;
        C0008i r02 = AbstractC0009j.m17a(r2, r15, r13, r21);
        r14.m9j(r02);
        r10 = r02.f22a;
        goto L80
    L83:
    L52:
        ((Handler) r14.f8c).post(new RunnableC0001b((C0095d) r14.f7b, -3));
        goto L80
    L84:
        C0008i r03 = (C0008i) AbstractC0009j.f25b.submit(new CallableC0006g(r2, r15, r13, r21, 0)).get(r11, TimeUnit.MILLISECONDS);     // Catch: InterruptedException -> L52
        r14.m9j(r03);     // Catch: InterruptedException -> L52
        r10 = r03.f22a;     // Catch: InterruptedException -> L52
        goto L80
    L43:
        e = move-exception;
        throw e;     // Catch: InterruptedException -> L52
    L45:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: InterruptedException -> L52
    L48:
        throw new InterruptedException("timeout");     // Catch: InterruptedException -> L52
    L53:
        C0961f r112 = AbstractC0009j.f24a;
        String r9 = r13.f14e + "-" + r21;
        r111 = (Typeface) AbstractC0009j.f24a.m2313a(r9);
        if (r111 == null) goto L56;
        r6.post(new RunnableC0000a(r12, r111, r4));
        goto L35
    L56:
        C0007h r113 = new C0007h(r4, r14);
        Object r42 = AbstractC0009j.f26c;
        monitor-enter(r42);
        C0966k r24 = AbstractC0009j.f27d;     // Catch: Throwable -> L63
        ArrayList r33 = (ArrayList) r24.getOrDefault(r9, null);     // Catch: Throwable -> L63
        if (r33 == null) goto L65;
        r33.add(r113);     // Catch: Throwable -> L63
        monitor-exit(r42);     // Catch: Throwable -> L63
    L86:
        goto L80
    L65:
        ArrayList r34 = new ArrayList();     // Catch: Throwable -> L63
        r34.add(r113);     // Catch: Throwable -> L63
        r24.put(r9, r34);     // Catch: Throwable -> L63
        monitor-exit(r42);     // Catch: Throwable -> L63
        CallableC0006g r114 = new CallableC0006g(r9, r15, r13, r21, 1);
        ThreadPoolExecutor r04 = AbstractC0009j.f25b;
        C0007h r115 = new C0007h(r8, r9);
        if (Looper.myLooper() != null) goto L70;
        Handler r25 = new Handler(Looper.getMainLooper());
    L71:
        RunnableC0014o r35 = new RunnableC0014o();
        r35.f39b = r114;
        r35.f40c = r115;
        r35.f41d = r25;
        r04.execute(r35);
        goto L86
    L70:
        r25 = new Handler();
    L63:
        th = move-exception;
        throw th;
    L29:
        r11 = -1;
    L22:
        r32 = true;
        goto L27
    L21:
        if (r1.f4203c != 0) goto L23;
    L7:
        if (r5.isEmpty() == true) goto L14;
        r52 = Typeface.create(r5, 0);
        Typeface r62 = Typeface.create(Typeface.DEFAULT, 0);
        if (r52 == null) goto L14;
        if (r52.equals(r62) == true) goto L14;
    L75:
        r10 = f4256a.mo2070j(r15, (C1087f) r16, r17, r21);
        if (r22 == null) goto L80;
        if (r10 == null) goto L79;
        new Handler(Looper.getMainLooper()).post(new RunnableC0328h(r22, r10, r3));
        goto L80
    L79:
        r22.m2576a(-3);
        goto L80
    }

    /* JADX INFO: renamed from: b */
    public static String m2605b(Resources r1, int r2, String r3, int r4, int r5) {
        return r1.getResourcePackageName(r2) + '-' + r3 + '-' + r4 + '-' + r2 + '-' + r5;
    }
}
