package io.sentry;

import io.sentry.internal.C1898a;
import io.sentry.protocol.C1974x;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: renamed from: io.sentry.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2002t implements InterfaceC1919l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7172a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f7173b;

    public /* synthetic */ C2002t(C2046v2 r1, int r2) {
        this.f7172a = r2;
        this.f7173b = r1;
    }

    @Override // io.sentry.InterfaceC1919l0
    /* JADX INFO: renamed from: a */
    public boolean mo3789a() {
        switch(this.f7172a) {
            case 0: goto L69;
            default: goto L5;
        };
    L5:
        if (C1898a.f6775c != null) goto L19;
        C1981r r0 = C1898a.f6776d.m4173a();
    L11:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L16
    L18:
        throw th;
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L8:
        if (C1898a.f6775c != null) goto L13;
        C1898a.f6775c = new C1898a();     // Catch: Throwable -> L11
    L13:
        r0.close();
    L19:
        C1898a r02 = C1898a.f6775c;
        if (r02.f6777a == true) goto L67;
        C1981r r2 = r02.f6778b.m4173a();     // Catch: IOException -> L71 Throwable -> L28
    L41:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L61
    L63:
        throw th;     // Catch: IOException -> L71 Throwable -> L28
    L61:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L71 Throwable -> L28
        goto L63
    L25:
        if (r02.f6777a == false) goto L30;
    L26:
        r2.close();     // Catch: IOException -> L71 Throwable -> L28
        goto L27
    L30:
        Enumeration<URL> r3 = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");     // Catch: Throwable -> L41
    L31:
        if (r3.hasMoreElements() == false) goto L26;
        Attributes r4 = new Manifest(r3.nextElement().openStream()).getMainAttributes();     // Catch: Exception -> L70 Throwable -> L41
        if (r4 == null) goto L31;
        String r5 = r4.getValue("Sentry-Opentelemetry-SDK-Name");     // Catch: Exception -> L70 Throwable -> L41
        String r6 = r4.getValue("Implementation-Version");     // Catch: Exception -> L70 Throwable -> L41
        String r7 = r4.getValue("Sentry-SDK-Name");     // Catch: Exception -> L70 Throwable -> L41
        String r8 = r4.getValue("Sentry-SDK-Package-Name");     // Catch: Exception -> L70 Throwable -> L41
        if (r5 == null) goto L52;
        if (r6 == null) goto L52;
        String r9 = r4.getValue("Sentry-Opentelemetry-Version-Name");     // Catch: Exception -> L70 Throwable -> L41
        if (r9 == null) goto L43;
        C1650Y1.m3790d().m3792b("maven:io.opentelemetry:opentelemetry-sdk", r9);     // Catch: Exception -> L70 Throwable -> L41
        C1650Y1.m3790d().m3791a("OpenTelemetry");     // Catch: Exception -> L70 Throwable -> L41
    L43:
        String r42 = r4.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");     // Catch: Exception -> L70 Throwable -> L41
        if (r42 == null) goto L47;
        C1650Y1.m3790d().m3792b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", r42);     // Catch: Exception -> L70 Throwable -> L41
        C1650Y1.m3790d().m3791a("OpenTelemetry-Agent");     // Catch: Exception -> L70 Throwable -> L41
    L47:
        if (r5.equals("sentry.java.opentelemetry.agentless") == false) goto L50;
        C1650Y1.m3790d().m3791a("OpenTelemetry-Agentless");     // Catch: Exception -> L70 Throwable -> L41
    L50:
        if (r5.equals("sentry.java.opentelemetry.agentless-spring") == false) goto L52;
        C1650Y1.m3790d().m3791a("OpenTelemetry-Agentless-Spring");     // Catch: Exception -> L70 Throwable -> L41
    L52:
        if (r7 == null) goto L31;
        if (r6 == null) goto L31;
        if (r8 == null) goto L31;
        if (r7.startsWith("sentry.java") == false) goto L31;
        C1650Y1.m3790d().m3792b(r8, r6);     // Catch: Exception -> L70 Throwable -> L41
    L28:
        th = move-exception;
        r02.f6777a = true;
        throw th;
    L27:
        r02.f6777a = true;
    L67:
        return C1650Y1.m3790d().m3793c(this.f7173b.getFatalLogger());
    L69:
        return C1650Y1.m3790d().m3793c(this.f7173b.getFatalLogger());
    }

    /* JADX INFO: renamed from: b */
    public ArrayList m4155b(StackTraceElement[] r8, boolean r9) {
        if (r8 != null) goto L4;
        return null;
    L4:
        if (r8.length <= 0) goto L34;
        ArrayList r0 = new ArrayList();
        int r1 = r8.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L25;
        StackTraceElement r3 = r8[r2];
        if (r3 == null) goto L24;
        String r4 = r3.getClassName();
        if (r9 == false) goto L12;
    L18:
        C1974x r5 = new C1974x();
        r5.f7043k = m4156c(r4);
        r5.f7038f = r4;
        r5.f7037e = r3.getMethodName();
        r5.f7036d = r3.getFileName();
        if (r3.getLineNumber() < 0) goto L21;
        r5.f7039g = Integer.valueOf(r3.getLineNumber());
    L21:
        r5.f7045m = Boolean.valueOf(r3.isNativeMethod());
        r0.add(r5);
        if (r0.size() < 100) goto L24;
    L12:
        if (r4.startsWith("io.sentry.") == false) goto L18;
        if (r4.startsWith("io.sentry.samples.") == true) goto L18;
        if (r4.startsWith("io.sentry.mobile.") == true) goto L18;
    L24:
        r2 = r2 + 1;
    L25:
        Collections.reverse(r0);
        return r0;
    L34:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Boolean m4156c(String r4) {
        if (r4 == null) goto L23;
        if (r4.isEmpty() == true) goto L23;
        C2046v2 r0 = this.f7173b;
        Iterator<String> r1 = r0.getInAppIncludes().iterator();
    L8:
        if (r1.hasNext() == false) goto L13;
        if (r4.startsWith(r1.next()) == false) goto L8;
        return Boolean.TRUE;
    L13:
        Iterator<String> r02 = r0.getInAppExcludes().iterator();
    L15:
        if (r02.hasNext() == false) goto L20;
        if (r4.startsWith(r02.next()) == false) goto L15;
        return Boolean.FALSE;
    L20:
        return null;
    L23:
        return Boolean.TRUE;
    }
}
