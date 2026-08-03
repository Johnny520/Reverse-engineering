package io.sentry;

import io.sentry.clientreport.C1851b;
import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1870b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.vendor.AbstractC2047a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1620P1 {

    /* JADX INFO: renamed from: d */
    public static final Charset f5821d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C1624Q1 f5822a;

    /* JADX INFO: renamed from: b */
    public final Callable f5823b;

    /* JADX INFO: renamed from: c */
    public byte[] f5824c;

    public C1620P1(C1624Q1 c1624q1, byte[] bArr) {
        this.f5822a = c1624q1;
        this.f5824c = bArr;
        this.f5823b = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m3727a(long j, long j2, String str) throws C1870b {
        if (j > j2) {
            throw new C1870b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1620P1 m3728b(InterfaceC1866e0 interfaceC1866e0, C1851b c1851b) {
        AbstractC1856a.m4048D("ISerializer is required.", interfaceC1866e0);
        C1901c c1901c = new C1901c(new CallableC1600K1(2, interfaceC1866e0, c1851b));
        return new C1620P1(new C1624Q1(EnumC1653Z1.resolve(c1851b), new CallableC1604L1(4, c1901c), "application/json", null, null), new CallableC1604L1(5, c1901c));
    }

    /* JADX INFO: renamed from: c */
    public static C1620P1 m3729c(final C1867e1 c1867e1, final InterfaceC1866e0 interfaceC1866e0) {
        final File file = c1867e1.f6701k;
        C1901c c1901c = new C1901c(new Callable() { // from class: io.sentry.N1
            @Override // java.util.concurrent.Callable
            public final Object call() throws C1870b {
                InterfaceC1866e0 interfaceC1866e02 = interfaceC1866e0;
                File file2 = file;
                if (!file2.exists()) {
                    throw new C1870b(AbstractC2374ph.m4814k("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                }
                try {
                    String str = new String(AbstractC2047a.m4187a(AbstractC1856a.m4046B(file2.getPath(), 52428800L)), "US-ASCII");
                    if (str.isEmpty()) {
                        throw new C1870b("Profiling trace file is empty");
                    }
                    C1867e1 c1867e12 = c1867e1;
                    c1867e12.f6702l = str;
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1620P1.f5821d));
                                try {
                                    interfaceC1866e02.mo3610d(c1867e12, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw new C1870b("Failed to serialize profile chunk\n" + e.getMessage());
                        }
                    } finally {
                        file2.delete();
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
            }
        });
        return new C1620P1(new C1624Q1(EnumC1653Z1.ProfileChunk, new CallableC1604L1(12, c1901c), "application-json", file.getName(), (String) null, c1867e1.f6696f, (Integer) null), new CallableC1604L1(13, c1901c));
    }

    /* JADX INFO: renamed from: d */
    public static C1620P1 m3730d(InterfaceC1866e0 interfaceC1866e0, C1581F2 c1581f2) {
        AbstractC1856a.m4048D("ISerializer is required.", interfaceC1866e0);
        AbstractC1856a.m4048D("Session is required.", c1581f2);
        C1901c c1901c = new C1901c(new CallableC1600K1(0, interfaceC1866e0, c1581f2));
        return new C1620P1(new C1624Q1(EnumC1653Z1.Session, new CallableC1604L1(7, c1901c), "application/json", null, null), new CallableC1604L1(11, c1901c));
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m3731h(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f5821d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C1851b m3732e(InterfaceC1866e0 interfaceC1866e0) throws IOException {
        C1624Q1 c1624q1 = this.f5822a;
        if (c1624q1 == null || c1624q1.f5834e != EnumC1653Z1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m3733f()), f5821d));
        try {
            C1851b c1851b = (C1851b) interfaceC1866e0.mo3607a(bufferedReader, C1851b.class);
            bufferedReader.close();
            return c1851b;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m3733f() {
        Callable callable;
        if (this.f5824c == null && (callable = this.f5823b) != null) {
            this.f5824c = (byte[]) callable.call();
        }
        return this.f5824c;
    }

    /* JADX INFO: renamed from: g */
    public final C1944A m3734g(InterfaceC1866e0 interfaceC1866e0) throws IOException {
        C1624Q1 c1624q1 = this.f5822a;
        if (c1624q1 == null || c1624q1.f5834e != EnumC1653Z1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m3733f()), f5821d));
        try {
            C1944A c1944a = (C1944A) interfaceC1866e0.mo3607a(bufferedReader, C1944A.class);
            bufferedReader.close();
            return c1944a;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C1620P1(C1624Q1 c1624q1, Callable callable) {
        this.f5822a = c1624q1;
        this.f5823b = callable;
        this.f5824c = null;
    }
}
