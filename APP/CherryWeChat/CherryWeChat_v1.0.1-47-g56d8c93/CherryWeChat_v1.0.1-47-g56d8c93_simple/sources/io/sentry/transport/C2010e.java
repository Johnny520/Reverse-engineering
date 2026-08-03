package io.sentry.transport;

import io.sentry.C2001s2;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.AbstractC2038j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.transport.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2010e {

    /* JADX INFO: renamed from: e */
    public static final Charset f7189e = null;

    /* JADX INFO: renamed from: a */
    public final Proxy f7190a;

    /* JADX INFO: renamed from: b */
    public final C1901c f7191b;

    /* JADX INFO: renamed from: c */
    public final C2046v2 f7192c;

    /* JADX INFO: renamed from: d */
    public final C2021p f7193d;

    static {
        f7189e = Charset.forName("UTF-8");
    }

    public C2010e(C2046v2 r5, C1901c r6, C2021p r7) {
        this.f7191b = r6;
        this.f7192c = r5;
        this.f7193d = r7;
        C2001s2 r62 = r5.getProxy();
        if (r62 == null) goto L9;
        String r72 = r62.f7169b;
        String r63 = r62.f7168a;
        Proxy r64 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(r63, Integer.parseInt(r72)));     // Catch: NumberFormatException -> L7
    L10:
        this.f7190a = r64;
        if (r64 != null) goto L13;
        return;
    L13:
        if (r5.getProxy() == null) goto L22;
        String r65 = r5.getProxy().f7170c;
        String r52 = r5.getProxy().f7171d;
        if (r65 == null) goto L23;
        if (r52 == null) goto L24;
        Authenticator.setDefault(new C2017l(r65, r52));
        return;
    L24:
        return;
    L23:
        return;
    L22:
        return;
    L7:
        e = move-exception;
        this.f7192c.getLogger().mo3682n(EnumC1657a2.ERROR, e, AbstractC2374ph.m4814k("Failed to parse Sentry Proxy port: ", r72, ". Proxy is ignored"), new Object[0]);
    L9:
        r64 = null;
        goto L10
    }

    /* JADX INFO: renamed from: a */
    public static void m4164a(HttpURLConnection r1) {
        r1.getInputStream().close();     // Catch: Throwable -> L5 IOException -> L8
        r1.disconnect();
        return;
    L8:
        r1.disconnect();
        return;
    L5:
        th = move-exception;
        r1.disconnect();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static String m4165b(HttpURLConnection r4) {
        InputStream r42 = r4.getErrorStream();     // Catch: IOException -> L30
        BufferedReader r0 = new BufferedReader(new InputStreamReader(r42, f7189e));     // Catch: Throwable -> L17
        StringBuilder r1 = new StringBuilder();     // Catch: Throwable -> L9
        boolean r2 = true;
    L5:
        String r3 = r0.readLine();     // Catch: Throwable -> L9
        if (r3 == null) goto L12;
        if (r2 == true) goto L11;
        r1.append("\n");     // Catch: Throwable -> L9
    L11:
        r1.append(r3);     // Catch: Throwable -> L9
        r2 = false;
        goto L5
    L12:
        String r12 = r1.toString();     // Catch: Throwable -> L9
        r0.close();     // Catch: Throwable -> L17
        if (r42 == null) goto L16;
        r42.close();     // Catch: IOException -> L30
    L16:
        return r12;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L21
    L23:
        throw th;     // Catch: Throwable -> L17
    L21:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        if (r42 != null) goto L35;
    L29:
        throw th;     // Catch: IOException -> L30
    L35:
        r42.close();     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L30
    L30:
        return "Failed to obtain error message while analyzing send failure.";
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1856a m4166c(HttpURLConnection r8) {
        C2046v2 r0 = this.f7192c;
        int r2 = r8.getResponseCode();     // Catch: Throwable -> L8 IOException -> L10
        m4168e(r8, r2);     // Catch: Throwable -> L8 IOException -> L10
        if (r2 != 200) goto L12;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope sent successfully.", new Object[0]);     // Catch: Throwable -> L8 IOException -> L10
        C2024s r02 = C2024s.f7212a;     // Catch: Throwable -> L8 IOException -> L10
        m4164a(r8);
        return r02;
    L12:
        ILogger r3 = r0.getLogger();     // Catch: Throwable -> L8 IOException -> L10
        EnumC1657a2 r4 = EnumC1657a2.ERROR;     // Catch: Throwable -> L8 IOException -> L10
        r3.mo3680e(r4, "Request failed, API returned %s", new Object[]{Integer.valueOf(r2)});     // Catch: Throwable -> L8 IOException -> L10
        if (r0.isDebug() == false) goto L15;
        String r32 = m4165b(r8);     // Catch: Throwable -> L8 IOException -> L10
        r0.getLogger().mo3680e(r4, "%s", new Object[]{r32});     // Catch: Throwable -> L8 IOException -> L10
    L15:
        C2023r r33 = new C2023r(r2);     // Catch: Throwable -> L8 IOException -> L10
        m4164a(r8);
        return r33;
    L8:
        th = move-exception;
        m4164a(r8);
        throw th;
    L10:
        e = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Error reading and logging the response stream", new Object[0]);     // Catch: Throwable -> L8
        m4164a(r8);
        return new C2023r(-1);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1856a m4167d(C1901c r7) {
        C2046v2 r0 = this.f7192c;
        r0.getSocketTagger().mo3746b();
        C1901c r1 = this.f7191b;
        URL r2 = (URL) r1.f6781b;
        Proxy r3 = this.f7190a;
        if (r3 != null) goto L5;
        URLConnection r22 = r2.openConnection();
    L6:
        HttpURLConnection r23 = (HttpURLConnection) r22;
        Iterator r12 = ((HashMap) r1.f6782c).entrySet().iterator();
    L8:
        if (r12.hasNext() == false) goto L10;
        Map.Entry r32 = (Map.Entry) r12.next();
        r23.setRequestProperty((String) r32.getKey(), (String) r32.getValue());
        goto L8
    L10:
        r23.setRequestMethod("POST");
        r23.setDoOutput(true);
        r23.setRequestProperty("Content-Encoding", "gzip");
        r23.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        r23.setRequestProperty("Accept", "application/json");
        r23.setRequestProperty("Connection", "close");
        r23.setConnectTimeout(r0.getConnectionTimeoutMillis());
        r23.setReadTimeout(r0.getReadTimeoutMillis());
        SSLSocketFactory r13 = r0.getSslSocketFactory();
        if ((r23 instanceof HttpsURLConnection) == false) goto L14;
        if (r13 == null) goto L14;
        ((HttpsURLConnection) r23).setSSLSocketFactory(r13);
    L14:
        r23.connect();
        OutputStream r14 = r23.getOutputStream();     // Catch: Throwable -> L22
        GZIPOutputStream r33 = new GZIPOutputStream(r14);     // Catch: Throwable -> L26
        r0.getSerializer().mo3611e(r7, r33);     // Catch: Throwable -> L28
        r33.close();     // Catch: Throwable -> L26
        if (r14 == null) goto L24;
        r14.close();     // Catch: Throwable -> L22
    L24:
        AbstractC1856a r72 = m4166c(r23);
        r0.getSocketTagger().mo3745a();
        return r72;
    L28:
        th = move-exception;
        r33.close();     // Catch: Throwable -> L31
    L33:
        throw th;     // Catch: Throwable -> L26
    L31:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        if (r14 != null) goto L46;
    L39:
        throw th;     // Catch: Throwable -> L22
    L46:
        r14.close();     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        m4166c(r23);
        r0.getSocketTagger().mo3745a();
        throw th;
    L5:
        r22 = r2.openConnection(r3);
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public final void m4168e(HttpURLConnection r24, int r25) {
        String r1 = r24.getHeaderField("Retry-After");
        String r0 = r24.getHeaderField("X-Sentry-Rate-Limits");
        C2021p r3 = this.f7193d;
        C2046v2 r4 = r3.f7205b;
        C2009d r5 = r3.f7204a;
        double r6 = 1000.0d;
        if (r0 == null) goto L52;
        int r10 = -1;
        String[] r12 = r0.split(",", -1);
        int r11 = r12.length;
        int r122 = 0;
        int r13 = 0;
    L5:
        if (r13 >= r11) goto L78;
        String[] r02 = r12[r13].replace(" ", "").split(":", r10);
        if (r02.length <= 0) goto L49;
        String r14 = r02[r122];
        if (r14 != null) goto L65;
    L12:
        double r16 = r6;
        long r142 = 60000;
    L14:
        if (r02.length <= 1) goto L47;
        String r03 = r02[1];
        r5.getClass();
        Date r62 = new Date(System.currentTimeMillis() + r142);
        if (r03 != null) goto L18;
    L48:
        String[] r20 = r12;
        r3.m4169d(EnumC1929n.All, r62);
    L50:
        r13 = r13 + 1;
        r6 = r16;
        r12 = r20;
        r10 = -1;
        r122 = 0;
        goto L5
    L18:
        if (r03.isEmpty() == true) goto L48;
        String[] r7 = r03.split(";", r10);
        int r143 = r7.length;
        int r15 = r122;
    L20:
        if (r15 >= r143) goto L47;
        String r8 = r7[r15];
        EnumC1929n r9 = EnumC1929n.Unknown;
        Charset r04 = AbstractC2038j.f7226a;     // Catch: IllegalArgumentException -> L34
        if (r8 != null) goto L25;
    L31:
        String r05 = r8;
    L32:
        if (r05 == null) goto L37;
        r9 = EnumC1929n.valueOf(r05);     // Catch: IllegalArgumentException -> L34
        String[] r202 = r12;
    L43:
        if (EnumC1929n.Unknown.equals(r9) == true) goto L46;
        r3.m4169d(r9, r62);
    L46:
        r15 = r15 + 1;
        r12 = r202;
        r10 = -1;
        goto L20
    L37:
        r202 = r12;
        r4.getLogger().mo3680e(EnumC1657a2.ERROR, "Couldn't capitalize: %s", new Object[]{r8});     // Catch: IllegalArgumentException -> L40
    L40:
        e = e;
    L41:
        r4.getLogger().mo3682n(EnumC1657a2.INFO, e, "Unknown category: %s", new Object[]{r8});
        goto L43
    L25:
        if (r8.isEmpty() == true) goto L31;
        String[] r06 = AbstractC2038j.f7227b.split(r8, r10);     // Catch: IllegalArgumentException -> L34
        StringBuilder r102 = new StringBuilder();     // Catch: IllegalArgumentException -> L34
        int r123 = r06.length;     // Catch: IllegalArgumentException -> L34
        int r07 = 0;
    L28:
        if (r07 >= r123) goto L30;
        r102.append(AbstractC2038j.m4182a(r06[r07]));     // Catch: IllegalArgumentException -> L34
        r07 = r07 + 1;     // Catch: IllegalArgumentException -> L34
        goto L28
    L30:
        r05 = r102.toString();     // Catch: IllegalArgumentException -> L34
    L34:
        e = e;
        r202 = r12;
    L47:
        r20 = r12;
        goto L50
    L65:
        r142 = (long) (Double.parseDouble(r14) * r6);
        r16 = r6;
        goto L14
    L49:
        r20 = r12;
        r16 = r6;
        goto L50
    L78:
        return;
    L52:
        if (r25 != 429) goto L77;
        if (r1 != null) goto L61;
    L56:
        long r82 = 60000;
    L57:
        r5.getClass();
        r3.m4169d(EnumC1929n.All, new Date(System.currentTimeMillis() + r82));
        return;
    L61:
        r82 = (long) (Double.parseDouble(r1) * 1000.0d);
        goto L57
    }
}
