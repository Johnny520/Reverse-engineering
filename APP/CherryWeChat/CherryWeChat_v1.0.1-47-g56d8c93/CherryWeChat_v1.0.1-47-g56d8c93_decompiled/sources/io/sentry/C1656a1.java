package io.sentry;

import io.sentry.android.core.C1672O;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1888f;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1656a1 extends AbstractC2052w {

    /* JADX INFO: renamed from: i */
    public static final Charset f5905i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public final InterfaceC1651Z f5906e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1622Q f5907f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1866e0 f5908g;

    /* JADX INFO: renamed from: h */
    public final ILogger f5909h;

    public C1656a1(InterfaceC1651Z interfaceC1651Z, InterfaceC1622Q interfaceC1622Q, InterfaceC1866e0 interfaceC1866e0, ILogger iLogger, long j, int i) {
        super(interfaceC1651Z, iLogger, j, i);
        AbstractC1856a.m4048D("Scopes are required.", interfaceC1651Z);
        this.f5906e = interfaceC1651Z;
        AbstractC1856a.m4048D("Envelope reader is required.", interfaceC1622Q);
        this.f5907f = interfaceC1622Q;
        AbstractC1856a.m4048D("Serializer is required.", interfaceC1866e0);
        this.f5908g = interfaceC1866e0;
        AbstractC1856a.m4048D("Logger is required.", iLogger);
        this.f5909h = iLogger;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3794c(C1656a1 c1656a1, File file, InterfaceC1889g interfaceC1889g) {
        ILogger iLogger = c1656a1.f5909h;
        if (interfaceC1889g.mo3846a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.mo3680e(EnumC1657a2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.mo3682n(EnumC1657a2.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: a */
    public final boolean mo3587a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: b */
    public final void mo3588b(File file, C1586H c1586h) {
        boolean zMo3587a = mo3587a(file.getName());
        ILogger iLogger = this.f5909h;
        try {
            if (!zMo3587a) {
                iLogger.mo3680e(EnumC1657a2.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C1901c c1901cMo3556a = this.f5907f.mo3556a(bufferedInputStream);
                    if (c1901cMo3556a == null) {
                        iLogger.mo3680e(EnumC1657a2.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m3796e(c1901cMo3556a, c1586h);
                        iLogger.mo3680e(EnumC1657a2.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objM4072s = AbstractC1856a.m4072s(c1586h);
                    if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s == null) {
                        AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s, iLogger);
                    } else {
                        m3794c(this, file, (InterfaceC1889g) objM4072s);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                iLogger.mo3683r(EnumC1657a2.ERROR, "Error processing envelope.", e);
                Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
                if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s2 == null) {
                    AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s2, iLogger);
                } else {
                    m3794c(this, file, (InterfaceC1889g) objM4072s2);
                }
            }
        } catch (Throwable th3) {
            Object objM4072s3 = AbstractC1856a.m4072s(c1586h);
            if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s3 == null) {
                AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s3, iLogger);
            } else {
                m3794c(this, file, (InterfaceC1889g) objM4072s3);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2648vx m3795d(C1613N2 c1613n2) {
        String str;
        ILogger iLogger = this.f5909h;
        if (c1613n2 != null && (str = c1613n2.f5807g) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (AbstractC1856a.m4077y(dValueOf, false)) {
                    String str2 = c1613n2.f5808h;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (AbstractC1856a.m4077y(dValueOf2, false)) {
                            return new C2648vx(Boolean.TRUE, dValueOf, dValueOf2, Boolean.FALSE, (Double) null);
                        }
                    }
                    return AbstractC1856a.m4056b(new C2648vx(Boolean.TRUE, dValueOf));
                }
                iLogger.mo3680e(EnumC1657a2.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.mo3680e(EnumC1657a2.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new C2648vx(Boolean.TRUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3796e(C1901c c1901c, C1586H c1586h) {
        int size;
        Iterator it;
        int i;
        String str;
        BufferedReader bufferedReader;
        C1627R1 c1627r1;
        Object objM4072s;
        String str2;
        C1944A c1944a;
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        Iterable iterable = (Iterable) c1901c.f6782c;
        C1596J1 c1596j1 = (C1596J1) c1901c.f6781b;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                it2.next();
                i2++;
            }
            size = i2;
        }
        Object[] objArr = {Integer.valueOf(size)};
        ILogger iLogger = this.f5909h;
        iLogger.mo3680e(enumC1657a2, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            C1620P1 c1620p1 = (C1620P1) it3.next();
            int i4 = i3 + 1;
            C1624Q1 c1624q1 = c1620p1.f5822a;
            C1624Q1 c1624q12 = c1620p1.f5822a;
            if (c1624q1 == null) {
                iLogger.mo3680e(EnumC1657a2.ERROR, "Item %d has no header", Integer.valueOf(i4));
                it = it3;
                i = i4;
            } else {
                boolean zEquals = EnumC1653Z1.Event.equals(c1624q1.f5834e);
                InterfaceC1866e0 interfaceC1866e0 = this.f5908g;
                it = it3;
                Charset charset = f5905i;
                i = i4;
                InterfaceC1651Z interfaceC1651Z = this.f5906e;
                if (zEquals) {
                    try {
                        str = "Item failed to process.";
                    } catch (Throwable th) {
                        th = th;
                        str = "Item failed to process.";
                    }
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1620p1.m3733f()), charset));
                        try {
                            c1627r1 = (C1627R1) interfaceC1866e0.mo3607a(bufferedReader, C1627R1.class);
                        } finally {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iLogger.mo3683r(EnumC1657a2.ERROR, str, th);
                    }
                    if (c1627r1 == null) {
                        iLogger.mo3680e(EnumC1657a2.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), c1624q12.f5834e);
                    } else {
                        C1968r c1968r = c1627r1.f5606c;
                        if (c1968r != null) {
                            String str3 = c1968r.f6999a;
                            if (str3.startsWith("sentry.javascript") || str3.startsWith("sentry.dart") || str3.startsWith("sentry.dotnet")) {
                                c1586h.m3668c("sentry:isFromHybridSdk", Boolean.TRUE);
                            }
                        }
                        C1970t c1970t = c1596j1.f5755a;
                        if (c1970t == null || c1970t.equals(c1627r1.f5604a)) {
                            interfaceC1651Z.mo3723r(c1627r1, c1586h);
                            iLogger.mo3680e(EnumC1657a2.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
                            if (!m3797f(c1586h)) {
                                iLogger.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for event id submission: %s", c1627r1.f5604a);
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            iLogger.mo3680e(EnumC1657a2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), c1596j1.f5755a, c1627r1.f5604a);
                            bufferedReader.close();
                        }
                        th = th2;
                        iLogger.mo3683r(EnumC1657a2.ERROR, str, th);
                        objM4072s = AbstractC1856a.m4072s(c1586h);
                        if (!(objM4072s instanceof InterfaceC1892j) && !((InterfaceC1892j) objM4072s).mo3848c()) {
                            iLogger.mo3680e(EnumC1657a2.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
                            return;
                        }
                        Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
                        if (C1672O.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s2 != null) {
                            C1672O c1672o = (C1672O) objM4072s2;
                            c1672o.f5999c = new CountDownLatch(1);
                            c1672o.f5997a = false;
                            c1672o.f5998b = false;
                        }
                    }
                    bufferedReader.close();
                    objM4072s = AbstractC1856a.m4072s(c1586h);
                    if (!(objM4072s instanceof InterfaceC1892j)) {
                    }
                    Object objM4072s22 = AbstractC1856a.m4072s(c1586h);
                    if (C1672O.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
                    }
                } else {
                    EnumC1653Z1 enumC1653Z1 = EnumC1653Z1.Transaction;
                    EnumC1653Z1 enumC1653Z12 = c1624q1.f5834e;
                    EnumC1653Z1 enumC1653Z13 = c1624q1.f5834e;
                    if (enumC1653Z1.equals(enumC1653Z12)) {
                        try {
                            str2 = "Item failed to process.";
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = "Item failed to process.";
                        }
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1620p1.m3733f()), charset));
                            try {
                                c1944a = (C1944A) interfaceC1866e0.mo3607a(bufferedReader, C1944A.class);
                            } finally {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            iLogger.mo3683r(EnumC1657a2.ERROR, str2, th);
                        }
                        if (c1944a == null) {
                            iLogger.mo3680e(EnumC1657a2.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), c1624q12.f5834e);
                        } else {
                            C1970t c1970t2 = c1596j1.f5755a;
                            if (c1970t2 == null || c1970t2.equals(c1944a.f5604a)) {
                                C1613N2 c1613n2 = c1596j1.f5757c;
                                if (c1944a.f5605b.mo4126h() != null) {
                                    c1944a.f5605b.mo4126h().m3673a(m3795d(c1613n2));
                                }
                                interfaceC1651Z.mo3720o(c1944a, c1613n2, c1586h, null);
                                iLogger.mo3680e(EnumC1657a2.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
                                if (!m3797f(c1586h)) {
                                    iLogger.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for event id submission: %s", c1944a.f5604a);
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                iLogger.mo3680e(EnumC1657a2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), c1596j1.f5755a, c1944a.f5604a);
                                bufferedReader.close();
                            }
                            th = th5;
                            iLogger.mo3683r(EnumC1657a2.ERROR, str2, th);
                        }
                        bufferedReader.close();
                    } else {
                        interfaceC1651Z.mo3713g(new C1901c(c1596j1.f5755a, c1596j1.f5756b, c1620p1), c1586h);
                        iLogger.mo3680e(EnumC1657a2.DEBUG, "%s item %d is being captured.", enumC1653Z13.getItemType(), Integer.valueOf(i));
                        if (!m3797f(c1586h)) {
                            iLogger.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for item type submission: %s", enumC1653Z13.getItemType());
                            return;
                        }
                    }
                    objM4072s = AbstractC1856a.m4072s(c1586h);
                    if (!(objM4072s instanceof InterfaceC1892j)) {
                    }
                    Object objM4072s222 = AbstractC1856a.m4072s(c1586h);
                    if (C1672O.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
                    }
                }
                it3 = it;
                i3 = i;
            }
            it3 = it;
            i3 = i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3797f(C1586H c1586h) {
        Object objM4072s = AbstractC1856a.m4072s(c1586h);
        if (objM4072s instanceof InterfaceC1888f) {
            return ((InterfaceC1888f) objM4072s).mo3849d();
        }
        AbstractC1856a.m4078z(InterfaceC1888f.class, objM4072s, this.f5909h);
        return true;
    }
}
