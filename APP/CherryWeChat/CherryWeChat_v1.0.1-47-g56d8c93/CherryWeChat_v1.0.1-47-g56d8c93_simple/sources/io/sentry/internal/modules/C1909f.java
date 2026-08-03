package io.sentry.internal.modules;

import android.content.Context;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.RunnableC1631S1;
import io.sentry.config.AbstractC1856a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1909f extends AbstractC1907d {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f6797e;

    /* JADX INFO: renamed from: f */
    public final Object f6798f;

    public C1909f(List r2, ILogger r3) {
        this.f6797e = 2;
        super(r3);
        this.f6798f = r2;
    }

    @Override // io.sentry.internal.modules.AbstractC1907d
    /* JADX INFO: renamed from: b */
    public final Map mo4117b() {
        switch(this.f6797e) {
            case 0: goto L29;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        TreeMap r0 = new TreeMap();
        Iterator r1 = ((List) this.f6798f).iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        Map r2 = ((InterfaceC1904a) r1.next()).mo4116a();
        if (r2 == null) goto L6;
        r0.putAll(r2);
        goto L6
    L10:
        return r0;
    L11:
        ILogger r02 = this.f6793a;
        TreeMap r22 = new TreeMap();
        InputStream r3 = ((Context) this.f6798f).getAssets().open("sentry-external-modules.txt");     // Catch: IOException -> L17 FileNotFoundException -> L27
        TreeMap r4 = m4118c(r3);     // Catch: Throwable -> L19
        if (r3 == null) goto L71;
        r3.close();     // Catch: IOException -> L17 FileNotFoundException -> L27
    L71:
        return r4;
    L19:
        th = move-exception;
        if (r3 != null) goto L54;
    L25:
        throw th;     // Catch: IOException -> L17 FileNotFoundException -> L27
    L54:
        r3.close();     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L17 FileNotFoundException -> L27
    L27:
        r02.mo3680e(EnumC1657a2.INFO, "%s file was not found.", new Object[]{"sentry-external-modules.txt"});
        return r22;
    L17:
        e = move-exception;
        r02.mo3683r(EnumC1657a2.ERROR, "Error extracting modules.", e);
        return r22;
    L29:
        ILogger r12 = this.f6793a;
        TreeMap r23 = new TreeMap();
        InputStream r32 = ((ClassLoader) this.f6798f).getResourceAsStream("sentry-external-modules.txt");     // Catch: IOException -> L36 SecurityException -> L38
        if (r32 != null) goto L42;
        r12.mo3680e(EnumC1657a2.INFO, "%s file was not found.", new Object[]{"sentry-external-modules.txt"});     // Catch: Throwable -> L40
        if (r32 == null) goto L56;
        r32.close();     // Catch: IOException -> L36 SecurityException -> L38
    L56:
    L53:
        return r23;
    L42:
        TreeMap r03 = m4118c(r32);     // Catch: Throwable -> L40
        r32.close();     // Catch: IOException -> L36 SecurityException -> L38
        r23 = r03;
    L40:
        th = move-exception;
        if (r32 != null) goto L59;
    L50:
        throw th;     // Catch: IOException -> L36 SecurityException -> L38
    L59:
        r32.close();     // Catch: Throwable -> L48
    L48:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L36 SecurityException -> L38
    L36:
        e = move-exception;
        r12.mo3683r(EnumC1657a2.INFO, "Access to resources failed.", e);
    L38:
        e = move-exception;
        r12.mo3683r(EnumC1657a2.INFO, "Access to resources denied.", e);
        goto L53
    }

    public C1909f(ILogger r2) {
        this.f6797e = 0;
        ClassLoader r0 = C1909f.class.getClassLoader();
        super(r2);
        this.f6798f = AbstractC1856a.m4058d(r0);
    }

    public C1909f(Context r2, ILogger r3) {
        this.f6797e = 1;
        super(r3);
        Context r32 = r2.getApplicationContext();
        if (r32 == null) goto L5;
        r2 = r32;
    L5:
        this.f6798f = r2;
        new Thread(new RunnableC1631S1(7, this)).start();
    }
}
