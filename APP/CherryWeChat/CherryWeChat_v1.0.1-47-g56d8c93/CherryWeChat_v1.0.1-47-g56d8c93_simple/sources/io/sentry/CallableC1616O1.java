package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1870b;
import io.sentry.protocol.C1949F;
import io.sentry.util.AbstractC2030b;
import io.sentry.vendor.AbstractC2047a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.O1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1616O1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f5815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1866e0 f5816c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5817d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5818e;

    public /* synthetic */ CallableC1616O1(C1654a r2, long r3, InterfaceC1866e0 r5, ILogger r6) {
        this.f5814a = 0;
        this.f5817d = r2;
        this.f5815b = r3;
        this.f5816c = r5;
        this.f5818e = r6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int r0 = this.f5814a;
        InterfaceC1866e0 r1 = this.f5816c;
        Object r2 = this.f5818e;
        long r3 = this.f5815b;
        Object r5 = this.f5817d;
        switch(r0) {
            case 0: goto L47;
            default: goto L4;
        };
    L4:
        File r52 = (File) r5;
        C1881h1 r22 = (C1881h1) r2;
        if (r52.exists() == false) goto L46;
        String r4 = new String(AbstractC2047a.m4187a(AbstractC1856a.m4046B(r52.getPath(), r3)), "US-ASCII");     // Catch: UnsupportedEncodingException -> L42
        if (r4.isEmpty() == true) goto L41;
        r22.f6733B = r4;
        r22.f6746l = (List) r22.f6736b.call();     // Catch: Throwable -> L85
    L86:
        ByteArrayOutputStream r32 = new ByteArrayOutputStream();     // Catch: Throwable -> L19 IOException -> L21
        BufferedWriter r42 = new BufferedWriter(new OutputStreamWriter(r32, C1620P1.f5821d));     // Catch: Throwable -> L23
        r1.mo3610d(r22, r42);     // Catch: Throwable -> L25
        byte[] r12 = r32.toByteArray();     // Catch: Throwable -> L25
        r42.close();     // Catch: Throwable -> L23
        r32.close();     // Catch: Throwable -> L19 IOException -> L21
        r52.delete();
        return r12;
    L25:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L28
    L30:
        throw th;     // Catch: Throwable -> L23
    L28:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L33
    L35:
        throw th;     // Catch: Throwable -> L19 IOException -> L21
    L33:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L19 IOException -> L21
    L19:
        th = move-exception;
        r52.delete();
        throw th;
    L21:
        e = move-exception;
        throw new C1870b("Failed to serialize profiling trace data\n" + e.getMessage());     // Catch: Throwable -> L19
    L41:
        throw new C1870b("Profiling trace file is empty");
    L42:
        e = move-exception;
        throw new AssertionError(e);
    L46:
        throw new C1870b(AbstractC2374ph.m4814k("Dropping profiling trace data, because the file '", r52.getName(), "' doesn't exists"));
    L47:
        C1654a r53 = (C1654a) r5;
        ILogger r23 = (ILogger) r2;
        byte[] r02 = r53.f5899a;
        String r6 = r53.f5902d;
        if (r02 == null) goto L50;
        C1620P1.m3727a(r02.length, r3, r6);
    L82:
        return r02;
    L50:
        C1949F r03 = r53.f5900b;
        if (r03 == null) goto L77;
        Charset r54 = AbstractC2030b.f7215a;
        ByteArrayOutputStream r55 = new ByteArrayOutputStream();     // Catch: Throwable -> L59
        BufferedWriter r7 = new BufferedWriter(new OutputStreamWriter(r55, AbstractC2030b.f7215a));     // Catch: Throwable -> L61
        r1.mo3610d(r03, r7);     // Catch: Throwable -> L63
        r02 = r55.toByteArray();     // Catch: Throwable -> L63
        r7.close();     // Catch: Throwable -> L61
        r55.close();     // Catch: Throwable -> L59
    L75:
        if (r02 == null) goto L84;
        C1620P1.m3727a(r02.length, r3, r6);
    L84:
        throw new C1870b(AbstractC2374ph.m4814k("Couldn't attach the attachment ", r6, ".\nPlease check that either bytes, serializable, path or provider is set."));
    L63:
        th = move-exception;
        r7.close();     // Catch: Throwable -> L66
    L68:
        throw th;     // Catch: Throwable -> L61
    L66:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L61
    L61:
        th = move-exception;
        r55.close();     // Catch: Throwable -> L71
    L73:
        throw th;     // Catch: Throwable -> L59
    L71:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L59
    L59:
        th = move-exception;
        r23.mo3683r(EnumC1657a2.ERROR, "Could not serialize serializable", th);
        r02 = null;
        goto L75
    L77:
        CallableC1600K1 r04 = r53.f5901c;
        if (r04 == null) goto L84;
        r02 = (byte[]) r04.call();
        if (r02 == null) goto L84;
        C1620P1.m3727a(r02.length, r3, r6);
        goto L82
    }

    public /* synthetic */ CallableC1616O1(File r2, long r3, C1881h1 r5, InterfaceC1866e0 r6) {
        this.f5814a = 1;
        this.f5817d = r2;
        this.f5815b = r3;
        this.f5818e = r5;
        this.f5816c = r6;
    }
}
