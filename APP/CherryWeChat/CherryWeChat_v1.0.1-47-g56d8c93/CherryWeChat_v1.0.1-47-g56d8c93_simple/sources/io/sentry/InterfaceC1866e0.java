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
    Object mo3607a(Reader r1, Class r2);

    /* JADX INFO: renamed from: b */
    String mo3608b(ConcurrentHashMap r1);

    /* JADX INFO: renamed from: c */
    C1901c mo3609c(BufferedInputStream r1);

    /* JADX INFO: renamed from: d */
    void mo3610d(Object r1, BufferedWriter r2);

    /* JADX INFO: renamed from: e */
    void mo3611e(C1901c r1, OutputStream r2);
}
