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
    public static final Charset f6792d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final ILogger f6793a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6794b = new C2029a();

    /* JADX INFO: renamed from: c */
    public volatile Map f6795c = null;

    public AbstractC1907d(ILogger iLogger) {
        this.f6793a = iLogger;
    }

    @Override // io.sentry.internal.modules.InterfaceC1904a
    /* JADX INFO: renamed from: a */
    public final Map mo4116a() {
        if (this.f6795c == null) {
            C1981r c1981rM4173a = this.f6794b.m4173a();
            try {
                if (this.f6795c == null) {
                    this.f6795c = mo4117b();
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.f6795c;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map mo4117b();

    /* JADX INFO: renamed from: c */
    public final TreeMap m4118c(InputStream inputStream) {
        ILogger iLogger = this.f6793a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f6792d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                iLogger.mo3680e(EnumC1657a2.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            iLogger.mo3682n(EnumC1657a2.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
