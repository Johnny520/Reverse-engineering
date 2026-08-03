package io.sentry;

import io.sentry.clientreport.C1851b;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1870b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1620P1 {

    /* JADX INFO: renamed from: d */
    public static final Charset f5821d = null;

    /* JADX INFO: renamed from: a */
    public final C1624Q1 f5822a;

    /* JADX INFO: renamed from: b */
    public final Callable f5823b;

    /* JADX INFO: renamed from: c */
    public byte[] f5824c;

    static {
        f5821d = Charset.forName("UTF-8");
    }

    public C1620P1(C1624Q1 r1, byte[] r2) {
        this.f5822a = r1;
        this.f5824c = r2;
        this.f5823b = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m3727a(long r1, long r3, String r5) {
        if (r1 > r3) goto L6;
        return;
    L6:
        throw new C1870b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", new Object[]{r5, Long.valueOf(r1), Long.valueOf(r3)}));
    }

    /* JADX INFO: renamed from: b */
    public static C1620P1 m3728b(InterfaceC1866e0 r9, C1851b r10) {
        AbstractC1856a.m4048D("ISerializer is required.", r9);
        C1901c r0 = new C1901c(new CallableC1600K1(2, r9, r10));
        return new C1620P1(new C1624Q1(EnumC1653Z1.resolve(r10), new CallableC1604L1(4, r0), "application/json", null, null), new CallableC1604L1(5, r0));
    }

    /* JADX INFO: renamed from: c */
    public static C1620P1 m3729c(final C1867e1 r11, final InterfaceC1866e0 r12) {
        final File r0 = r11.f6701k;
        C1901c r1 = new C1901c(new CallableC1612N1(r0, r11, r12));
        return new C1620P1(new C1624Q1(EnumC1653Z1.ProfileChunk, new CallableC1604L1(12, r1), "application-json", r0.getName(), null, r11.f6696f, null), new CallableC1604L1(13, r1));
    }

    /* JADX INFO: renamed from: d */
    public static C1620P1 m3730d(InterfaceC1866e0 r9, C1581F2 r10) {
        AbstractC1856a.m4048D("ISerializer is required.", r9);
        AbstractC1856a.m4048D("Session is required.", r10);
        C1901c r0 = new C1901c(new CallableC1600K1(0, r9, r10));
        return new C1620P1(new C1624Q1(EnumC1653Z1.Session, new CallableC1604L1(7, r0), "application/json", null, null), new CallableC1604L1(11, r0));
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m3731h(LinkedHashMap r5) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write((byte) (r5.size() | 128));     // Catch: Throwable -> L7
        Iterator r52 = r5.entrySet().iterator();     // Catch: Throwable -> L7
    L5:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r1 = (Map.Entry) r52.next();     // Catch: Throwable -> L7
        byte[] r2 = ((String) r1.getKey()).getBytes(f5821d);     // Catch: Throwable -> L7
        int r3 = r2.length;     // Catch: Throwable -> L7
        r0.write(-39);     // Catch: Throwable -> L7
        r0.write((byte) r3);     // Catch: Throwable -> L7
        r0.write(r2);     // Catch: Throwable -> L7
        byte[] r12 = (byte[]) r1.getValue();     // Catch: Throwable -> L7
        int r22 = r12.length;     // Catch: Throwable -> L7
        r0.write(-58);     // Catch: Throwable -> L7
        r0.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(r22).array());     // Catch: Throwable -> L7
        r0.write(r12);     // Catch: Throwable -> L7
        goto L5
    L9:
        byte[] r53 = r0.toByteArray();     // Catch: Throwable -> L7
        r0.close();
        return r53;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    }

    /* JADX INFO: renamed from: e */
    public final C1851b m3732e(InterfaceC1866e0 r5) {
        C1624Q1 r0 = this.f5822a;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.f5834e != EnumC1653Z1.ClientReport) goto L23;
        BufferedReader r02 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m3733f()), f5821d));
        C1851b r52 = (C1851b) r5.mo3607a(r02, C1851b.class);     // Catch: Throwable -> L11
        r02.close();
        return r52;
    L11:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L23:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m3733f() {
        if (this.f5824c != null) goto L8;
        Callable r0 = this.f5823b;
        if (r0 == null) goto L8;
        this.f5824c = (byte[]) r0.call();
    L8:
        return this.f5824c;
    }

    /* JADX INFO: renamed from: g */
    public final C1944A m3734g(InterfaceC1866e0 r5) {
        C1624Q1 r0 = this.f5822a;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.f5834e != EnumC1653Z1.Transaction) goto L23;
        BufferedReader r02 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m3733f()), f5821d));
        C1944A r52 = (C1944A) r5.mo3607a(r02, C1944A.class);     // Catch: Throwable -> L11
        r02.close();
        return r52;
    L11:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L23:
        return null;
    }

    public C1620P1(C1624Q1 r1, Callable r2) {
        this.f5822a = r1;
        this.f5823b = r2;
        this.f5824c = null;
    }
}
