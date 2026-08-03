package io.sentry.internal.modules;

import io.sentry.C1981r;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1907d implements InterfaceC1904a {

    /* JADX INFO: renamed from: d */
    public static final Charset f6792d = null;

    /* JADX INFO: renamed from: a */
    public final ILogger f6793a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6794b;

    /* JADX INFO: renamed from: c */
    public volatile Map f6795c;

    static {
        f6792d = Charset.forName("UTF-8");
    }

    public AbstractC1907d(ILogger r2) {
        this.f6794b = new C2029a();
        this.f6795c = null;
        this.f6793a = r2;
    }

    @Override // io.sentry.internal.modules.InterfaceC1904a
    /* JADX INFO: renamed from: a */
    public final Map mo4116a() {
        if (this.f6795c != null) goto L18;
        C1981r r0 = this.f6794b.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L6:
        if (this.f6795c != null) goto L11;
        this.f6795c = mo4117b();     // Catch: Throwable -> L9
    L11:
        r0.close();
    L18:
        return this.f6795c;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map mo4117b();

    /* JADX INFO: renamed from: c */
    public final TreeMap m4118c(InputStream r6) {
        ILogger r0 = this.f6793a;
        TreeMap r1 = new TreeMap();
        BufferedReader r2 = new BufferedReader(new InputStreamReader(r6, f6792d));     // Catch: RuntimeException -> L12 IOException -> L14
        String r62 = r2.readLine();     // Catch: Throwable -> L7
    L5:
        if (r62 == null) goto L9;
        int r3 = r62.lastIndexOf(58);     // Catch: Throwable -> L7
        r1.put(r62.substring(0, r3), r62.substring(r3 + 1));     // Catch: Throwable -> L7
        r62 = r2.readLine();     // Catch: Throwable -> L7
        goto L5
    L9:
        r0.mo3680e(EnumC1657a2.DEBUG, "Extracted %d modules from resources.", new Object[]{Integer.valueOf(r1.size())});     // Catch: Throwable -> L7
        r2.close();     // Catch: RuntimeException -> L12 IOException -> L14
        return r1;
    L7:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L18
    L20:
        throw th;     // Catch: RuntimeException -> L12 IOException -> L14
    L18:
        th = move-exception;
        th.addSuppressed(th);     // Catch: RuntimeException -> L12 IOException -> L14
    L14:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.ERROR, "Error extracting modules.", e);
    L23:
        return r1;
    L12:
        e = move-exception;
        r0.mo3682n(EnumC1657a2.ERROR, e, "%s file is malformed.", new Object[]{"sentry-external-modules.txt"});
        goto L23
    }
}
