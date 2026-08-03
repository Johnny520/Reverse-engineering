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
    public static final Charset f6632a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m4000a(C2046v2 c2046v2, String str, String str2) {
        File fileM4001b = m4001b(c2046v2, str);
        if (fileM4001b == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileM4001b, str2);
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: b */
    public static File m4001b(C2046v2 c2046v2, String str) {
        String cacheDirPath = c2046v2.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: c */
    public static Object m4002c(C2046v2 c2046v2, String str, String str2, Class cls) {
        File fileM4001b = m4001b(c2046v2, str);
        if (fileM4001b == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileM4001b, str2);
        if (!file.exists()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f6632a));
            try {
                Object objMo3607a = c2046v2.getSerializer().mo3607a(bufferedReader, cls);
                bufferedReader.close();
                return objMo3607a;
            } finally {
            }
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4003d(C2046v2 c2046v2, Object obj, String str, String str2) {
        File fileM4001b = m4001b(c2046v2, str);
        if (fileM4001b == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM4001b, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f6632a));
                try {
                    c2046v2.getSerializer().mo3610d(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error persisting entity: %s", str2);
        }
    }
}
