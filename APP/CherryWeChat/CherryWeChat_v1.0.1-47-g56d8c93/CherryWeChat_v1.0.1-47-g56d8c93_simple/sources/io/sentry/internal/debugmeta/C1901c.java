package io.sentry.internal.debugmeta;

import android.content.Context;
import io.sentry.C1563B0;
import io.sentry.C1596J1;
import io.sentry.C1599K0;
import io.sentry.C1620P1;
import io.sentry.C2002t;
import io.sentry.C2046v2;
import io.sentry.EnumC1653Z1;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.InterfaceC1652Z0;
import io.sentry.clientreport.C1851b;
import io.sentry.clientreport.C1852c;
import io.sentry.clientreport.C1854e;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.util.C2032d;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.internal.debugmeta.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1901c implements InterfaceC1899a, ILogger, InterfaceC1652Z0, InterfaceC1855f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6780a;

    /* JADX INFO: renamed from: b */
    public Object f6781b;

    /* JADX INFO: renamed from: c */
    public final Object f6782c;

    public /* synthetic */ C1901c(int r1, Object r2, Object r3) {
        this.f6780a = r1;
        this.f6782c = r2;
        this.f6781b = r3;
    }

    /* JADX INFO: renamed from: j */
    public static EnumC1929n m4099j(EnumC1653Z1 r1) {
        if (EnumC1653Z1.Event.equals(r1) == false) goto L7;
        return EnumC1929n.Error;
    L7:
        if (EnumC1653Z1.Session.equals(r1) == false) goto L11;
        return EnumC1929n.Session;
    L11:
        if (EnumC1653Z1.Transaction.equals(r1) == false) goto L15;
        return EnumC1929n.Transaction;
    L15:
        if (EnumC1653Z1.UserFeedback.equals(r1) == false) goto L19;
        return EnumC1929n.UserReport;
    L19:
        if (EnumC1653Z1.Feedback.equals(r1) == false) goto L23;
        return EnumC1929n.Feedback;
    L23:
        if (EnumC1653Z1.Profile.equals(r1) == false) goto L27;
        return EnumC1929n.Profile;
    L27:
        if (EnumC1653Z1.ProfileChunk.equals(r1) == false) goto L31;
        return EnumC1929n.ProfileChunkUi;
    L31:
        if (EnumC1653Z1.Attachment.equals(r1) == false) goto L35;
        return EnumC1929n.Attachment;
    L35:
        if (EnumC1653Z1.CheckIn.equals(r1) == false) goto L39;
        return EnumC1929n.Monitor;
    L39:
        if (EnumC1653Z1.ReplayVideo.equals(r1) == false) goto L43;
        return EnumC1929n.Replay;
    L43:
        if (EnumC1653Z1.Log.equals(r1) == false) goto L47;
        return EnumC1929n.LogItem;
    L47:
        return EnumC1929n.Default;
    }

    /* JADX INFO: renamed from: A */
    public C1901c m4100A(boolean r2) {
        C2051c r0 = (C2051c) this.f6781b;
        r0.m4223p();
        r0.m4217d();
        Writer r02 = r0.f7263a;
        if (r2 == false) goto L5;
        String r22 = "true";
    L6:
        r02.write(r22);
        return this;
    L5:
        r22 = "false";
        goto L6
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: a */
    public void mo4040a(EnumC1853d r4, C1901c r5) {
        if (r5 != null) goto L14;
        return;
    L14:
        Iterator r52 = ((Iterable) r5.f6782c).iterator();     // Catch: Throwable -> L9
    L5:
        if (r52.hasNext() == false) goto L17;
        mo4043f(r4, (C1620P1) r52.next());     // Catch: Throwable -> L9
        goto L5
    L17:
        return;
    L9:
        th = move-exception;
        ((C2046v2) this.f6782c).getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost envelope.", new Object[0]);
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: b */
    public void mo4041b(EnumC1853d r3, EnumC1929n r4) {
        mo4042c(r3, r4, 1);
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: c */
    public void mo4042c(EnumC1853d r2, EnumC1929n r3, long r4) {
        C2046v2 r0 = (C2046v2) this.f6782c;
        m4107q(r2.getReason(), r3.getCategory(), Long.valueOf(r4));     // Catch: Throwable -> L5
        r0.getOnDiscard();     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost event.", new Object[0]);
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC1899a
    /* JADX INFO: renamed from: d */
    public List mo4098d() {
        switch(this.f6780a) {
            case 0: goto L24;
            default: goto L4;
        };
    L4:
        ILogger r0 = (ILogger) this.f6781b;
        BufferedInputStream r3 = new BufferedInputStream(((Context) this.f6782c).getAssets().open("sentry-debug-meta.properties"));     // Catch: RuntimeException -> L9 IOException -> L11 FileNotFoundException -> L21
        Properties r2 = new Properties();     // Catch: Throwable -> L13
        r2.load(r3);     // Catch: Throwable -> L13
        List r22 = Collections.singletonList(r2);     // Catch: Throwable -> L13
        r3.close();     // Catch: RuntimeException -> L9 IOException -> L11 FileNotFoundException -> L21
        return r22;
    L13:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L16
    L18:
        throw th;     // Catch: RuntimeException -> L9 IOException -> L11 FileNotFoundException -> L21
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: RuntimeException -> L9 IOException -> L11 FileNotFoundException -> L21
    L21:
        r0.mo3680e(EnumC1657a2.INFO, "%s file was not found.", new Object[]{"sentry-debug-meta.properties"});
    L22:
        return null;
    L11:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.ERROR, "Error getting Proguard UUIDs.", e);
    L9:
        e = move-exception;
        r0.mo3682n(EnumC1657a2.ERROR, e, "%s file is malformed.", new Object[]{"sentry-debug-meta.properties"});
        goto L22
    L24:
        ILogger r1 = (ILogger) this.f6781b;
        ArrayList r23 = new ArrayList();
        Enumeration<URL> r32 = ((ClassLoader) this.f6782c).getResources("sentry-debug-meta.properties");     // Catch: IOException -> L34
    L27:
        if (r32.hasMoreElements() == false) goto L49;
        URL r4 = r32.nextElement();     // Catch: IOException -> L34
        InputStream r5 = r4.openStream();     // Catch: IOException -> L34 RuntimeException -> L36
        Properties r6 = new Properties();     // Catch: Throwable -> L38
        r6.load(r5);     // Catch: Throwable -> L38
        r23.add(r6);     // Catch: Throwable -> L38
        r1.mo3680e(EnumC1657a2.INFO, "Debug Meta Data Properties loaded from %s", new Object[]{r4});     // Catch: Throwable -> L38
        if (r5 == null) goto L27;
        r5.close();     // Catch: IOException -> L34 RuntimeException -> L36
    L38:
        th = move-exception;
        if (r5 != null) goto L56;
    L44:
        throw th;     // Catch: IOException -> L34 RuntimeException -> L36
    L56:
        r5.close();     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L34 RuntimeException -> L36
    L36:
        e = move-exception;
        r1.mo3682n(EnumC1657a2.ERROR, e, "%s file is malformed.", new Object[]{r4});     // Catch: IOException -> L34
    L49:
        if (r23.isEmpty() == false) goto L73;
        r1.mo3680e(EnumC1657a2.INFO, "No %s file was found.", new Object[]{"sentry-debug-meta.properties"});
        return null;
    L73:
        return r23;
    L34:
        e = move-exception;
        r1.mo3682n(EnumC1657a2.ERROR, e, "Failed to load %s", new Object[]{"sentry-debug-meta.properties"});
        goto L49
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: e */
    public void mo3680e(EnumC1657a2 r3, String r4, Object... r5) {
        ILogger r0 = (ILogger) this.f6781b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (mo3681i(r3) == false) goto L9;
        r0.mo3680e(r3, r4, r5);
        return;
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: f */
    public void mo4043f(EnumC1853d r11, C1620P1 r12) {
        C2046v2 r3 = (C2046v2) this.f6782c;
        if (r12 != null) goto L24;
        return;
    L24:
        EnumC1653Z1 r5 = r12.f5822a.f5834e;     // Catch: Throwable -> L10
        if (EnumC1653Z1.ClientReport.equals(r5) == true) goto L22;
        EnumC1929n r52 = m4099j(r5);     // Catch: Throwable -> L10
        if (r52.equals(EnumC1929n.Transaction) == false) goto L18;
        C1944A r122 = r12.m3734g(r3.getSerializer());     // Catch: Throwable -> L10
        if (r122 == null) goto L18;
        ArrayList r123 = r122.f6842s;     // Catch: Throwable -> L10
        m4107q(r11.getReason(), EnumC1929n.Span.getCategory(), Long.valueOf(((long) r123.size()) + 1));     // Catch: Throwable -> L10
        r123.size();     // Catch: Throwable -> L10
        r3.getOnDiscard();     // Catch: Throwable -> L10
    L18:
        m4107q(r11.getReason(), r52.getCategory(), 1L);     // Catch: Throwable -> L10
        r3.getOnDiscard();     // Catch: Throwable -> L10
        return;
    L22:
        m4108s(r12.m3732e(r3.getSerializer()));     // Catch: Throwable -> L10 Exception -> L12
    L27:
        return;
    L12:
        r3.getLogger().mo3680e(EnumC1657a2.ERROR, "Unable to restore counts from previous client report.", new Object[0]);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        r3.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: g */
    public C1901c mo4044g(C1901c r11) {
        C2046v2 r0 = (C2046v2) this.f6782c;
        Date r1 = AbstractC1856a.m4067m();
        C1563B0 r2 = (C1563B0) this.f6781b;
        r2.getClass();
        ArrayList r3 = new ArrayList();
        Iterator r22 = ((Map) ((C2032d) r2.f5600a).m4175a()).entrySet().iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        Map.Entry r4 = (Map.Entry) r22.next();
        long r8 = ((AtomicLong) r4.getValue()).getAndSet(0);
        Long r5 = Long.valueOf(r8);
        if (r8 <= 0) goto L4;
        r3.add(new C1854e(((C1852c) r4.getKey()).f6673a, ((C1852c) r4.getKey()).f6674b, r5));
        goto L4
    L9:
        if (r3.isEmpty() == false) goto L11;
        C1851b r12 = null;
    L12:
        if (r12 != null) goto L25;
        return r11;
    L25:
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Attaching client report to envelope.", new Object[0]);     // Catch: Throwable -> L19
        ArrayList r32 = new ArrayList();     // Catch: Throwable -> L19
        Iterator r42 = ((Iterable) r11.f6782c).iterator();     // Catch: Throwable -> L19
    L17:
        if (r42.hasNext() == false) goto L21;
        r32.add((C1620P1) r42.next());     // Catch: Throwable -> L19
        goto L17
    L21:
        r32.add(C1620P1.m3728b(r0.getSerializer(), r12));     // Catch: Throwable -> L19
        return new C1901c((C1596J1) r11.f6781b, r32);
    L19:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
        return r11;
    L11:
        r12 = new C1851b(r1, r3);
        goto L12
    }

    /* JADX INFO: renamed from: h */
    public C1901c m4101h() {
        C2051c r0 = (C2051c) this.f6781b;
        r0.m4223p();
        r0.m4217d();
        int r1 = r0.f7265c;
        int[] r2 = r0.f7264b;
        if (r1 != r2.length) goto L5;
        r0.f7264b = Arrays.copyOf(r2, r1 * 2);
    L5:
        int[] r12 = r0.f7264b;
        int r22 = r0.f7265c;
        r0.f7265c = r22 + 1;
        r12[r22] = 3;
        r0.f7263a.write(123);
        return this;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: i */
    public boolean mo3681i(EnumC1657a2 r4) {
        C2046v2 r0 = (C2046v2) this.f6782c;
        EnumC1657a2 r1 = r0.getDiagnosticLevel();
        if (r4 != null) goto L6;
        return false;
    L6:
        if (r0.isDebug() == true) goto L8;
    L11:
        return false;
    L8:
        if (r4.ordinal() < r1.ordinal()) goto L11;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public C1901c m4102k() {
        ((C2051c) this.f6781b).m4218f(3, 5, '}');
        return this;
    }

    /* JADX INFO: renamed from: l */
    public byte[] m4103l() {
        if (((byte[]) this.f6781b) != null) goto L7;
        Callable r0 = (Callable) this.f6782c;
        if (r0 == null) goto L7;
        this.f6781b = (byte[]) r0.call();
    L7:
        byte[] r02 = (byte[]) this.f6781b;
        if (r02 == null) goto L11;
        return r02;
    L11:
        return new byte[0];
    }

    /* JADX INFO: renamed from: m */
    public ArrayList m4104m(Map r10, ArrayList r11, boolean r12) {
        Thread r0 = Thread.currentThread();
        if (r10.isEmpty() == true) goto L27;
        ArrayList r1 = new ArrayList();
        if (r10.containsKey(r0) == true) goto L7;
        r10.put(r0, r0.getStackTrace());
    L7:
        Iterator r102 = r10.entrySet().iterator();
    L9:
        if (r102.hasNext() == false) goto L26;
        Map.Entry r2 = (Map.Entry) r102.next();
        Thread r3 = (Thread) r2.getKey();
        if (r3 != r0) goto L13;
        if (r12 == true) goto L13;
    L17:
        boolean r32 = true;
    L19:
        StackTraceElement[] r5 = (StackTraceElement[]) r2.getValue();
        Thread r22 = (Thread) r2.getKey();
        C1976z r6 = new C1976z();
        r6.f7061c = r22.getName();
        r6.f7060b = Integer.valueOf(r22.getPriority());
        r6.f7059a = Long.valueOf(r22.getId());
        r6.f7065g = Boolean.valueOf(r22.isDaemon());
        r6.f7062d = r22.getState().name();
        r6.f7063e = Boolean.valueOf(r32);
        ArrayList r23 = ((C2002t) this.f6781b).m4155b(r5, false);
        if (((C2046v2) this.f6782c).isAttachStacktrace() == false) goto L25;
        if (r23 == null) goto L25;
        if (r23.isEmpty() == true) goto L25;
        C1975y r33 = new C1975y(r23);
        r33.f7057c = Boolean.TRUE;
        r6.f7067i = r33;
    L25:
        r1.add(r6);
    L13:
        if (r11 != null) goto L15;
    L18:
        r32 = false;
        goto L19
    L15:
        if (r11.contains(Long.valueOf(r3.getId())) == false) goto L18;
        if (r12 == true) goto L18;
    L26:
        return r1;
    L27:
        return null;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: n */
    public void mo3682n(EnumC1657a2 r3, Throwable r4, String r5, Object... r6) {
        ILogger r0 = (ILogger) this.f6781b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (mo3681i(r3) == false) goto L9;
        r0.mo3682n(r3, r4, r5, r6);
        return;
    }

    /* JADX INFO: renamed from: o */
    public Properties m4105o() {
        String r0 = (String) this.f6781b;
        File r2 = new File(r0);     // Catch: IOException -> L11
        if (r2.isFile() == true) goto L6;
    L19:
        return null;
    L6:
        if (r2.canRead() == false) goto L19;
        BufferedInputStream r3 = new BufferedInputStream(new FileInputStream(r2));     // Catch: IOException -> L11
        Properties r22 = new Properties();     // Catch: Throwable -> L13
        r22.load(r3);     // Catch: Throwable -> L13
        r3.close();     // Catch: IOException -> L11
        return r22;
    L13:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L16
    L18:
        throw th;     // Catch: IOException -> L11
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L11
    L11:
        e = move-exception;
        ((C1599K0) this.f6782c).mo3682n(EnumC1657a2.ERROR, e, "Failed to load Sentry configuration from file: %s", new Object[]{r0});
        return null;
    }

    /* JADX INFO: renamed from: p */
    public C1901c m4106p(String r3) {
        C2051c r0 = (C2051c) this.f6781b;
        if (r3 != null) goto L5;
        r0.getClass();
        throw new NullPointerException("name == null");
    L5:
        if (r0.f7269g != null) goto L13;
        if (r0.f7265c == 0) goto L11;
        r0.f7269g = r3;
        return this;
    L11:
        throw new IllegalStateException("JsonWriter is closed.");
    L13:
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: q */
    public void m4107q(String r2, String r3, Long r4) {
        C1852c r0 = new C1852c(r2, r3);
        AtomicLong r22 = (AtomicLong) ((Map) ((C2032d) ((C1563B0) this.f6781b).f5600a).m4175a()).get(r0);
        if (r22 == null) goto L6;
        r22.addAndGet(r4.longValue());
        return;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: r */
    public void mo3683r(EnumC1657a2 r3, String r4, Throwable r5) {
        ILogger r0 = (ILogger) this.f6781b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (mo3681i(r3) == false) goto L9;
        r0.mo3683r(r3, r4, r5);
        return;
    }

    /* JADX INFO: renamed from: s */
    public void m4108s(C1851b r4) {
        if (r4 == null) goto L8;
        Iterator r42 = r4.f6671b.iterator();
    L6:
        if (r42.hasNext() == false) goto L10;
        C1854e r0 = (C1854e) r42.next();
        m4107q(r0.f6675a, r0.f6676b, r0.f6677c);
        goto L6
    L10:
        return;
    }

    /* JADX INFO: renamed from: t */
    public void m4109t(String r3) {
        C2051c r0 = (C2051c) this.f6781b;
        if (r3 == null) goto L9;
        r0.getClass();
        if (r3.length() == 0) goto L9;
        r0.f7266d = r3;
        r0.f7267e = ": ";
        return;
    L9:
        r0.f7266d = null;
        r0.f7267e = ":";
    }

    /* JADX INFO: renamed from: u */
    public C1901c m4110u(double r4) {
        C2051c r0 = (C2051c) this.f6781b;
        r0.m4223p();
        if (r0.f7268f == false) goto L5;
    L11:
        r0.m4217d();
        r0.f7263a.append(Double.toString(r4));
        return this;
    L5:
        if (Double.isNaN(r4) == true) goto L10;
        if (Double.isInfinite(r4) == false) goto L11;
    L10:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    }

    /* JADX INFO: renamed from: v */
    public C1901c m4111v(long r2) {
        C2051c r0 = (C2051c) this.f6781b;
        r0.m4223p();
        r0.m4217d();
        r0.f7263a.write(Long.toString(r2));
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C1901c m4112w(ILogger r2, Object r3) {
        ((C1563B0) this.f6782c).m3600l(this, r2, r3);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C1901c m4113x(Boolean r2) {
        C2051c r0 = (C2051c) this.f6781b;
        if (r2 != null) goto L6;
        r0.m4220l();
        return this;
    L6:
        r0.m4223p();
        r0.m4217d();
        Writer r02 = r0.f7263a;
        if (r2.booleanValue() == false) goto L9;
        String r22 = "true";
    L10:
        r02.write(r22);
        return this;
    L9:
        r22 = "false";
        goto L10
    }

    /* JADX INFO: renamed from: y */
    public C1901c m4114y(Number r4) {
        C2051c r0 = (C2051c) this.f6781b;
        if (r4 != null) goto L6;
        r0.m4220l();
        return this;
    L6:
        r0.m4223p();
        String r1 = r4.toString();
        if (r0.f7268f == false) goto L9;
    L17:
        r0.m4217d();
        r0.f7263a.append(r1);
        return this;
    L9:
        if (r1.equals("-Infinity") == true) goto L16;
        if (r1.equals("Infinity") == true) goto L16;
        if (r1.equals("NaN") == false) goto L17;
    L16:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    }

    /* JADX INFO: renamed from: z */
    public C1901c m4115z(String r2) {
        C2051c r0 = (C2051c) this.f6781b;
        if (r2 != null) goto L6;
        r0.m4220l();
        return this;
    L6:
        r0.m4223p();
        r0.m4217d();
        r0.m4222o(r2);
        return this;
    }

    public /* synthetic */ C1901c(Object r1, Object r2, int r3, boolean r4) {
        this.f6780a = r3;
        this.f6781b = r1;
        this.f6782c = r2;
    }

    public C1901c(Writer r2, int r3) {
        this.f6780a = 2;
        this.f6781b = new C2051c(r2);
        this.f6782c = new C1563B0(r3);
    }

    public C1901c(String r2, HashMap r3) {
        this.f6780a = 3;
        AbstractC1856a.m4048D("url is required", r2);
        this.f6781b = URI.create(r2).toURL();     // Catch: MalformedURLException -> L6
        this.f6782c = r3;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
    }

    public C1901c(C2046v2 r3) {
        this.f6780a = 9;
        this.f6782c = r3;
        this.f6781b = new C1563B0(6, false);
    }

    public C1901c(ILogger r2) {
        this.f6780a = 0;
        ClassLoader r0 = C1901c.class.getClassLoader();
        this.f6781b = r2;
        this.f6782c = AbstractC1856a.m4058d(r0);
    }

    public C1901c(Context r2, ILogger r3) {
        this.f6780a = 8;
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f6782c = r2;
        this.f6781b = r3;
    }

    public C1901c(C1596J1 r2, List r3) {
        this.f6780a = 5;
        AbstractC1856a.m4048D("SentryEnvelopeHeader is required.", r2);
        this.f6781b = r2;
        AbstractC1856a.m4048D("SentryEnvelope items are required.", r3);
        this.f6782c = r3;
    }

    public C1901c(C1970t r3, C1968r r4, C1620P1 r5) {
        this.f6780a = 5;
        this.f6781b = new C1596J1(r3, r4, null);
        ArrayList r32 = new ArrayList(1);
        r32.add(r5);
        this.f6782c = r32;
    }

    public C1901c(Callable r2) {
        this.f6780a = 6;
        this.f6782c = r2;
    }
}
