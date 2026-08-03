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
    public static final Charset f6007b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final C2029a f6008c = new C2029a();

    /* JADX INFO: renamed from: a */
    public static String m3851a(Context context) {
        C1981r c1981rM4173a = f6008c.m4173a();
        try {
            if (f6006a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = f6007b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strM4065k = AbstractC1856a.m4065k();
                            fileOutputStream.write(strM4065k.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f6006a = strM4065k;
                            c1981rM4173a.close();
                            return strM4065k;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f6006a = str;
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str2 = f6006a;
            c1981rM4173a.close();
            return str2;
        } catch (Throwable th2) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
