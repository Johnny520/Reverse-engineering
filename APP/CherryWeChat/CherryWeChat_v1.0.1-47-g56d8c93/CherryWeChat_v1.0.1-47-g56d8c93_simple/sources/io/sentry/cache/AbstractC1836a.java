package io.sentry.cache;

import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.cache.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1836a {

    /* JADX INFO: renamed from: a */
    public static final Charset f6632a = null;

    static {
        f6632a = Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static void m4000a(C2046v2 r3, String r4, String r5) {
        File r42 = m4001b(r3, r4);
        if (r42 != null) goto L6;
        r3.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
        return;
    L6:
        File r0 = new File(r42, r5);
        r3.getLogger().mo3680e(EnumC1657a2.DEBUG, "Deleting %s from scope cache", new Object[]{r5});
        if (r0.delete() == true) goto L10;
        r3.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to delete: %s", new Object[]{r0.getAbsolutePath()});
        return;
    }

    /* JADX INFO: renamed from: b */
    public static File m4001b(C2046v2 r1, String r2) {
        String r12 = r1.getCacheDirPath();
        if (r12 != null) goto L6;
        return null;
    L6:
        File r0 = new File(r12, r2);
        r0.mkdirs();
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m4002c(C2046v2 r4, String r5, String r6, Class r7) {
        File r52 = m4001b(r4, r5);
        if (r52 != null) goto L6;
        r4.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
        return null;
    L6:
        File r1 = new File(r52, r6);
        if (r1.exists() == true) goto L28;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, "No entry stored for %s", new Object[]{r6});
        return null;
    L28:
        BufferedReader r53 = new BufferedReader(new InputStreamReader(new FileInputStream(r1), f6632a));     // Catch: Throwable -> L12
        Object r72 = r4.getSerializer().mo3607a(r53, r7);     // Catch: Throwable -> L14
        r53.close();     // Catch: Throwable -> L12
        return r72;
    L14:
        th = move-exception;
        r53.close();     // Catch: Throwable -> L17
    L19:
        throw th;     // Catch: Throwable -> L12
    L17:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r4.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error reading entity from scope cache: %s", new Object[]{r6});
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m4003d(C2046v2 r3, Object r4, String r5, String r6) {
        File r52 = m4001b(r3, r5);
        if (r52 != null) goto L32;
        r3.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
        return;
    L32:
        FileOutputStream r53 = new FileOutputStream(new File(r52, r6));     // Catch: Throwable -> L13
        BufferedWriter r0 = new BufferedWriter(new OutputStreamWriter(r53, f6632a));     // Catch: Throwable -> L15
        r3.getSerializer().mo3610d(r4, r0);     // Catch: Throwable -> L17
        r0.close();     // Catch: Throwable -> L15
        r53.close();     // Catch: Throwable -> L13
        return;
    L17:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L20
    L22:
        throw th;     // Catch: Throwable -> L15
    L20:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r53.close();     // Catch: Throwable -> L25
    L27:
        throw th;     // Catch: Throwable -> L13
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r3.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error persisting entity: %s", new Object[]{r6});
    }
}
