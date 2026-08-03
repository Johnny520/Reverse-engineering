package io.sentry;

import android.graphics.Bitmap;
import io.sentry.android.core.C1667J;
import io.sentry.android.core.C1670M;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.C1851b;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1600K1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5779c;

    public /* synthetic */ CallableC1600K1(int r1, Object r2, Object r3) {
        this.f5777a = r1;
        this.f5778b = r2;
        this.f5779c = r3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.f5777a) {
            case 0: goto L86;
            case 1: goto L67;
            case 2: goto L48;
            case 3: goto L29;
            case 4: goto L27;
            default: goto L4;
        };
    L4:
        ScreenshotEventProcessor r0 = (ScreenshotEventProcessor) this.f5778b;
        Bitmap r1 = (Bitmap) this.f5779c;
        ILogger r02 = r0.f6009a.getLogger();
        byte[] r3 = null;
        if (r1.isRecycled() == true) goto L26;
        ByteArrayOutputStream r2 = new ByteArrayOutputStream();     // Catch: Throwable -> L13
        r1.compress(Bitmap.CompressFormat.PNG, 0, r2);     // Catch: Throwable -> L15
        r1.recycle();     // Catch: Throwable -> L15
        if (r2.size() > 0) goto L17;
        r02.mo3680e(EnumC1657a2.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);     // Catch: Throwable -> L15
        r2.close();     // Catch: Throwable -> L13
    L136:
    L17:
        byte[] r12 = r2.toByteArray();     // Catch: Throwable -> L15
        r2.close();     // Catch: Throwable -> L13
        r3 = r12;
    L15:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L22
    L24:
        throw th;     // Catch: Throwable -> L13
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r02.mo3683r(EnumC1657a2.ERROR, "Compressing bitmap failed.", th);
    L26:
        return r3;
    L27:
        C1667J r03 = (C1667J) this.f5778b;
        SentryAndroidOptions r13 = (SentryAndroidOptions) this.f5779c;
        return C1670M.m3842c(r03.f5975a, r13);
    L29:
        InterfaceC1866e0 r04 = (InterfaceC1866e0) this.f5778b;
        C1864d2 r14 = (C1864d2) this.f5779c;
        ByteArrayOutputStream r22 = new ByteArrayOutputStream();
        BufferedWriter r32 = new BufferedWriter(new OutputStreamWriter(r22, C1620P1.f5821d));     // Catch: Throwable -> L35
        r04.mo3610d(r14, r32);     // Catch: Throwable -> L37
        byte[] r05 = r22.toByteArray();     // Catch: Throwable -> L37
        r32.close();     // Catch: Throwable -> L35
        r22.close();
        return r05;
    L37:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L40
    L42:
        throw th;     // Catch: Throwable -> L35
    L40:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        r22.close();     // Catch: Throwable -> L45
    L47:
        throw th;
    L45:
        th = move-exception;
        th.addSuppressed(th);
        goto L47
    L48:
        InterfaceC1866e0 r06 = (InterfaceC1866e0) this.f5778b;
        C1851b r15 = (C1851b) this.f5779c;
        ByteArrayOutputStream r23 = new ByteArrayOutputStream();
        BufferedWriter r33 = new BufferedWriter(new OutputStreamWriter(r23, C1620P1.f5821d));     // Catch: Throwable -> L54
        r06.mo3610d(r15, r33);     // Catch: Throwable -> L56
        byte[] r07 = r23.toByteArray();     // Catch: Throwable -> L56
        r33.close();     // Catch: Throwable -> L54
        r23.close();
        return r07;
    L56:
        th = move-exception;
        r33.close();     // Catch: Throwable -> L59
    L61:
        throw th;     // Catch: Throwable -> L54
    L59:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        r23.close();     // Catch: Throwable -> L64
    L66:
        throw th;
    L64:
        th = move-exception;
        th.addSuppressed(th);
        goto L66
    L67:
        InterfaceC1866e0 r08 = (InterfaceC1866e0) this.f5778b;
        AbstractC1568C1 r16 = (AbstractC1568C1) this.f5779c;
        ByteArrayOutputStream r24 = new ByteArrayOutputStream();
        BufferedWriter r34 = new BufferedWriter(new OutputStreamWriter(r24, C1620P1.f5821d));     // Catch: Throwable -> L73
        r08.mo3610d(r16, r34);     // Catch: Throwable -> L75
        byte[] r09 = r24.toByteArray();     // Catch: Throwable -> L75
        r34.close();     // Catch: Throwable -> L73
        r24.close();
        return r09;
    L75:
        th = move-exception;
        r34.close();     // Catch: Throwable -> L78
    L80:
        throw th;     // Catch: Throwable -> L73
    L78:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L73
    L73:
        th = move-exception;
        r24.close();     // Catch: Throwable -> L83
    L85:
        throw th;
    L83:
        th = move-exception;
        th.addSuppressed(th);
        goto L85
    L86:
        InterfaceC1866e0 r010 = (InterfaceC1866e0) this.f5778b;
        C1581F2 r17 = (C1581F2) this.f5779c;
        ByteArrayOutputStream r25 = new ByteArrayOutputStream();
        BufferedWriter r35 = new BufferedWriter(new OutputStreamWriter(r25, C1620P1.f5821d));     // Catch: Throwable -> L92
        r010.mo3610d(r17, r35);     // Catch: Throwable -> L94
        byte[] r011 = r25.toByteArray();     // Catch: Throwable -> L94
        r35.close();     // Catch: Throwable -> L92
        r25.close();
        return r011;
    L94:
        th = move-exception;
        r35.close();     // Catch: Throwable -> L97
    L99:
        throw th;     // Catch: Throwable -> L92
    L97:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L92
    L92:
        th = move-exception;
        r25.close();     // Catch: Throwable -> L102
    L104:
        throw th;
    L102:
        th = move-exception;
        th.addSuppressed(th);
        goto L104
    }
}
