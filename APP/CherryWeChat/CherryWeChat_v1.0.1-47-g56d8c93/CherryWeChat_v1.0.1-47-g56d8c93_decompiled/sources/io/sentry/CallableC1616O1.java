package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1870b;
import io.sentry.protocol.C1949F;
import io.sentry.util.AbstractC2030b;
import io.sentry.vendor.AbstractC2047a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.O1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1616O1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5814a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f5815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1866e0 f5816c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5817d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5818e;

    public /* synthetic */ CallableC1616O1(C1654a c1654a, long j, InterfaceC1866e0 interfaceC1866e0, ILogger iLogger) {
        this.f5817d = c1654a;
        this.f5815b = j;
        this.f5816c = interfaceC1866e0;
        this.f5818e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws C1870b {
        int i = this.f5814a;
        InterfaceC1866e0 interfaceC1866e0 = this.f5816c;
        Object obj = this.f5818e;
        long j = this.f5815b;
        Object obj2 = this.f5817d;
        switch (i) {
            case 0:
                C1654a c1654a = (C1654a) obj2;
                ILogger iLogger = (ILogger) obj;
                byte[] byteArray = c1654a.f5899a;
                String str = c1654a.f5902d;
                if (byteArray == null) {
                    C1949F c1949f = c1654a.f5900b;
                    if (c1949f == null) {
                        CallableC1600K1 callableC1600K1 = c1654a.f5901c;
                        if (callableC1600K1 != null && (byteArray = (byte[]) callableC1600K1.call()) != null) {
                            C1620P1.m3727a(byteArray.length, j, str);
                        }
                        throw new C1870b(AbstractC2374ph.m4814k("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = AbstractC2030b.f7215a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, AbstractC2030b.f7215a));
                            try {
                                interfaceC1866e0.mo3610d(c1949f, bufferedWriter);
                                byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    } catch (Throwable th3) {
                        iLogger.mo3683r(EnumC1657a2.ERROR, "Could not serialize serializable", th3);
                        byteArray = null;
                    }
                    if (byteArray != null) {
                        C1620P1.m3727a(byteArray.length, j, str);
                    }
                    throw new C1870b(AbstractC2374ph.m4814k("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                C1620P1.m3727a(byteArray.length, j, str);
                return byteArray;
            default:
                File file = (File) obj2;
                C1881h1 c1881h1 = (C1881h1) obj;
                if (!file.exists()) {
                    throw new C1870b(AbstractC2374ph.m4814k("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(AbstractC2047a.m4187a(AbstractC1856a.m4046B(file.getPath(), j)), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new C1870b("Profiling trace file is empty");
                    }
                    c1881h1.f6733B = str2;
                    try {
                        c1881h1.f6746l = (List) c1881h1.f6736b.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C1620P1.f5821d));
                                try {
                                    interfaceC1866e0.mo3610d(c1881h1, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray2;
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th4) {
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } finally {
                            file.delete();
                        }
                    } catch (IOException e) {
                        throw new C1870b("Failed to serialize profiling trace data\n" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ CallableC1616O1(File file, long j, C1881h1 c1881h1, InterfaceC1866e0 interfaceC1866e0) {
        this.f5817d = file;
        this.f5815b = j;
        this.f5818e = c1881h1;
        this.f5816c = interfaceC1866e0;
    }
}
