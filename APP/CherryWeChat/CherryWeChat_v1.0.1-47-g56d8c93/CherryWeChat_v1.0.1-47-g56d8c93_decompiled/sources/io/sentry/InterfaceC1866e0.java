package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.e0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1866e0 {
    /* JADX INFO: renamed from: a */
    Object mo3607a(Reader reader, Class cls);

    /* JADX INFO: renamed from: b */
    String mo3608b(ConcurrentHashMap concurrentHashMap);

    /* JADX INFO: renamed from: c */
    C1901c mo3609c(BufferedInputStream bufferedInputStream);

    /* JADX INFO: renamed from: d */
    void mo3610d(Object obj, BufferedWriter bufferedWriter);

    /* JADX INFO: renamed from: e */
    void mo3611e(C1901c c1901c, OutputStream outputStream);
}
