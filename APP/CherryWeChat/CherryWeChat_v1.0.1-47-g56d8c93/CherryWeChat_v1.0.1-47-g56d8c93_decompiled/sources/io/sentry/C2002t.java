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

    public /* synthetic */ C2002t(C2046v2 c2046v2, int i) {
        this.f7172a = i;
        this.f7173b = c2046v2;
    }

    @Override // io.sentry.InterfaceC1919l0
    /* JADX INFO: renamed from: a */
    public boolean mo3789a() {
        C1981r c1981rM4173a;
        switch (this.f7172a) {
            case 0:
                return C1650Y1.m3790d().m3793c(this.f7173b.getFatalLogger());
            default:
                if (C1898a.f6775c == null) {
                    c1981rM4173a = C1898a.f6776d.m4173a();
                    try {
                        if (C1898a.f6775c == null) {
                            C1898a.f6775c = new C1898a();
                        }
                        c1981rM4173a.close();
                    } finally {
                        try {
                            c1981rM4173a.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    break;
                }
                C1898a c1898a = C1898a.f6775c;
                if (!c1898a.f6777a) {
                    try {
                        c1981rM4173a = c1898a.f6778b.m4173a();
                        try {
                            if (!c1898a.f6777a) {
                                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                                while (resources.hasMoreElements()) {
                                    try {
                                        Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                        if (mainAttributes != null) {
                                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                            String value2 = mainAttributes.getValue("Implementation-Version");
                                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                            if (value != null && value2 != null) {
                                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                                if (value5 != null) {
                                                    C1650Y1.m3790d().m3792b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                    C1650Y1.m3790d().m3791a("OpenTelemetry");
                                                }
                                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                if (value6 != null) {
                                                    C1650Y1.m3790d().m3792b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                    C1650Y1.m3790d().m3791a("OpenTelemetry-Agent");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                    C1650Y1.m3790d().m3791a("OpenTelemetry-Agentless");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                    C1650Y1.m3790d().m3791a("OpenTelemetry-Agentless-Spring");
                                                }
                                            }
                                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                                C1650Y1.m3790d().m3792b(value4, value2);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            c1981rM4173a.close();
                        } catch (Throwable th2) {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                            throw th2;
                        }
                        break;
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        c1898a.f6777a = true;
                        throw th4;
                    }
                    c1898a.f6777a = true;
                }
                return C1650Y1.m3790d().m3793c(this.f7173b.getFatalLogger());
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList m4155b(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    C1974x c1974x = new C1974x();
                    c1974x.f7043k = m4156c(className);
                    c1974x.f7038f = className;
                    c1974x.f7037e = stackTraceElement.getMethodName();
                    c1974x.f7036d = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        c1974x.f7039g = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    c1974x.f7045m = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(c1974x);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public Boolean m4156c(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        C2046v2 c2046v2 = this.f7173b;
        Iterator<String> it = c2046v2.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = c2046v2.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
