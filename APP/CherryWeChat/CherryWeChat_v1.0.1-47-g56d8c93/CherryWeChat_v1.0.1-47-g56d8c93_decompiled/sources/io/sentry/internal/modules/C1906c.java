package io.sentry.internal.modules;

import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.internal.modules.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1906c extends AbstractC1907d {

    /* JADX INFO: renamed from: e */
    public final Pattern f6789e;

    /* JADX INFO: renamed from: f */
    public final Pattern f6790f;

    /* JADX INFO: renamed from: g */
    public final ClassLoader f6791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906c(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = C1906c.class.getClassLoader();
        this.f6789e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f6790f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f6791g = AbstractC1856a.m4058d(classLoader);
    }

    @Override // io.sentry.internal.modules.AbstractC1907d
    /* JADX INFO: renamed from: b */
    public final Map mo4117b() {
        HashMap map = new HashMap();
        ArrayList<C1905b> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f6791g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f6789e.matcher(resources.nextElement().toString());
                C1905b c1905b = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f6790f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        c1905b = new C1905b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (c1905b != null) {
                    arrayList.add(c1905b);
                }
            }
        } catch (Throwable th) {
            this.f6793a.mo3683r(EnumC1657a2.ERROR, "Unable to detect modules via manifest files.", th);
        }
        for (C1905b c1905b2 : arrayList) {
            map.put(c1905b2.f6787a, c1905b2.f6788b);
        }
        return map;
    }
}
