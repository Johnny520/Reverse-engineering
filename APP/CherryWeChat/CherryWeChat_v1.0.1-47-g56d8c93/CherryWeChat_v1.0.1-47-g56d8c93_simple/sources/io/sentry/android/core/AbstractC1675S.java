package io.sentry.android.core;

import android.content.Context;
import io.sentry.C1981r;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.android.core.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1675S {

    /* JADX INFO: renamed from: a */
    public static String f6006a;

    /* JADX INFO: renamed from: b */
    public static final Charset f6007b = null;

    /* JADX INFO: renamed from: c */
    public static final C2029a f6008c = null;

    static {
        f6007b = Charset.forName("UTF-8");
        f6008c = new C2029a();
    }

    /* JADX INFO: renamed from: a */
    public static String m3851a(Context r5) {
        C1981r r0 = f6008c.m4173a();
    L34:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L41
    L43:
        throw th;
    L41:
        th = move-exception;
        th.addSuppressed(th);
        goto L43
    L4:
        if (f6006a != null) goto L36;
        File r1 = new File(r5.getFilesDir(), "INSTALLATION");     // Catch: Throwable -> L34
        boolean r52 = r1.exists();     // Catch: Throwable -> L14
        Charset r2 = f6007b;
        if (r52 == true) goto L22;
        FileOutputStream r53 = new FileOutputStream(r1);     // Catch: Throwable -> L14
        String r12 = AbstractC1856a.m4065k();     // Catch: Throwable -> L16
        r53.write(r12.getBytes(r2));     // Catch: Throwable -> L16
        r53.flush();     // Catch: Throwable -> L16
        r53.close();     // Catch: Throwable -> L14
        f6006a = r12;     // Catch: Throwable -> L14
        r0.close();
        return r12;
    L16:
        th = move-exception;
        r53.close();     // Catch: Throwable -> L19
    L21:
        throw th;     // Catch: Throwable -> L14
    L19:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
        goto L21
    L22:
        RandomAccessFile r54 = new RandomAccessFile(r1, "r");     // Catch: Throwable -> L14
        byte[] r13 = new byte[(int) r54.length()];     // Catch: Throwable -> L26
        r54.readFully(r13);     // Catch: Throwable -> L26
        String r3 = new String(r13, r2);     // Catch: Throwable -> L26
        r54.close();     // Catch: Throwable -> L14
        f6006a = r3;     // Catch: Throwable -> L14
        goto L36
    L26:
        th = move-exception;
        r54.close();     // Catch: Throwable -> L29
    L31:
        throw th;     // Catch: Throwable -> L14
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw new RuntimeException(th);     // Catch: Throwable -> L34
    L36:
        String r55 = f6006a;     // Catch: Throwable -> L34
        r0.close();
        return r55;
    }
}
