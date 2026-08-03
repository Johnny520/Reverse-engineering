package io.sentry.internal.modules;

import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
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

    public C1906c(ILogger r2) {
        ClassLoader r0 = C1906c.class.getClassLoader();
        super(r2);
        this.f6789e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f6790f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f6791g = AbstractC1856a.m4058d(r0);
    }

    @Override // io.sentry.internal.modules.AbstractC1907d
    /* JADX INFO: renamed from: b */
    public final Map mo4117b() {
        HashMap r0 = new HashMap();
        ArrayList r1 = new ArrayList();
        Enumeration<URL> r2 = this.f6791g.getResources("META-INF/MANIFEST.MF");     // Catch: Throwable -> L22
    L4:
        if (r2.hasMoreElements() == false) goto L24;
        Matcher r3 = this.f6789e.matcher(r2.nextElement().toString());     // Catch: Throwable -> L22
        C1905b r5 = null;
        if (r3.matches() == true) goto L9;
    L11:
        String r32 = null;
    L12:
        if (r32 == null) goto L19;
        Matcher r33 = this.f6790f.matcher(r32);     // Catch: Throwable -> L22
        if (r33.matches() == false) goto L19;
        if (r33.groupCount() != 2) goto L19;
        r5 = new C1905b(r33.group(1), r33.group(2));     // Catch: Throwable -> L22
    L19:
        if (r5 == null) goto L4;
        r1.add(r5);     // Catch: Throwable -> L22
        goto L4
    L9:
        if (r3.groupCount() != 1) goto L11;
        r32 = r3.group(1);     // Catch: Throwable -> L22
    L24:
        Iterator r12 = r1.iterator();
    L26:
        if (r12.hasNext() == false) goto L28;
        C1905b r22 = (C1905b) r12.next();
        r0.put(r22.f6787a, r22.f6788b);
        goto L26
    L28:
        return r0;
    L22:
        th = move-exception;
        this.f6793a.mo3683r(EnumC1657a2.ERROR, "Unable to detect modules via manifest files.", th);
        goto L24
    }
}
