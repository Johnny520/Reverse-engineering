package io.sentry.internal.debugmeta;

import android.content.Context;
import io.sentry.C1563B0;
import io.sentry.C1596J1;
import io.sentry.C1599K0;
import io.sentry.C1620P1;
import io.sentry.C2002t;
import io.sentry.C2046v2;
import io.sentry.EnumC1653Z1;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.InterfaceC1652Z0;
import io.sentry.clientreport.C1851b;
import io.sentry.clientreport.C1852c;
import io.sentry.clientreport.C1854e;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.util.C2032d;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.internal.debugmeta.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1901c implements InterfaceC1899a, ILogger, InterfaceC1652Z0, InterfaceC1855f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6780a;

    /* JADX INFO: renamed from: b */
    public Object f6781b;

    /* JADX INFO: renamed from: c */
    public final Object f6782c;

    public /* synthetic */ C1901c(int i, Object obj, Object obj2) {
        this.f6780a = i;
        this.f6782c = obj;
        this.f6781b = obj2;
    }

    /* JADX INFO: renamed from: j */
    public static EnumC1929n m4099j(EnumC1653Z1 enumC1653Z1) {
        return EnumC1653Z1.Event.equals(enumC1653Z1) ? EnumC1929n.Error : EnumC1653Z1.Session.equals(enumC1653Z1) ? EnumC1929n.Session : EnumC1653Z1.Transaction.equals(enumC1653Z1) ? EnumC1929n.Transaction : EnumC1653Z1.UserFeedback.equals(enumC1653Z1) ? EnumC1929n.UserReport : EnumC1653Z1.Feedback.equals(enumC1653Z1) ? EnumC1929n.Feedback : EnumC1653Z1.Profile.equals(enumC1653Z1) ? EnumC1929n.Profile : EnumC1653Z1.ProfileChunk.equals(enumC1653Z1) ? EnumC1929n.ProfileChunkUi : EnumC1653Z1.Attachment.equals(enumC1653Z1) ? EnumC1929n.Attachment : EnumC1653Z1.CheckIn.equals(enumC1653Z1) ? EnumC1929n.Monitor : EnumC1653Z1.ReplayVideo.equals(enumC1653Z1) ? EnumC1929n.Replay : EnumC1653Z1.Log.equals(enumC1653Z1) ? EnumC1929n.LogItem : EnumC1929n.Default;
    }

    /* JADX INFO: renamed from: A */
    public C1901c m4100A(boolean z) throws IOException {
        C2051c c2051c = (C2051c) this.f6781b;
        c2051c.m4223p();
        c2051c.m4217d();
        c2051c.f7263a.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: a */
    public void mo4040a(EnumC1853d enumC1853d, C1901c c1901c) {
        if (c1901c == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) c1901c.f6782c).iterator();
            while (it.hasNext()) {
                mo4043f(enumC1853d, (C1620P1) it.next());
            }
        } catch (Throwable th) {
            ((C2046v2) this.f6782c).getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: b */
    public void mo4041b(EnumC1853d enumC1853d, EnumC1929n enumC1929n) {
        mo4042c(enumC1853d, enumC1929n, 1L);
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: c */
    public void mo4042c(EnumC1853d enumC1853d, EnumC1929n enumC1929n, long j) {
        C2046v2 c2046v2 = (C2046v2) this.f6782c;
        try {
            m4107q(enumC1853d.getReason(), enumC1929n.getCategory(), Long.valueOf(j));
            c2046v2.getOnDiscard();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC1899a
    /* JADX INFO: renamed from: d */
    public List mo4098d() {
        switch (this.f6780a) {
            case 0:
                ILogger iLogger = (ILogger) this.f6781b;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) this.f6782c).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                iLogger.mo3680e(EnumC1657a2.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            iLogger.mo3682n(EnumC1657a2.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                    }
                } catch (IOException e2) {
                    iLogger.mo3682n(EnumC1657a2.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                iLogger.mo3680e(EnumC1657a2.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                ILogger iLogger2 = (ILogger) this.f6781b;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f6782c).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    iLogger2.mo3680e(EnumC1657a2.INFO, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e3) {
                    iLogger2.mo3683r(EnumC1657a2.ERROR, "Error getting Proguard UUIDs.", e3);
                    return null;
                } catch (RuntimeException e4) {
                    iLogger2.mo3682n(EnumC1657a2.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: e */
    public void mo3680e(EnumC1657a2 enumC1657a2, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f6781b;
        if (iLogger == null || !mo3681i(enumC1657a2)) {
            return;
        }
        iLogger.mo3680e(enumC1657a2, str, objArr);
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: f */
    public void mo4043f(EnumC1853d enumC1853d, C1620P1 c1620p1) {
        C1944A c1944aM3734g;
        C2046v2 c2046v2 = (C2046v2) this.f6782c;
        if (c1620p1 == null) {
            return;
        }
        try {
            EnumC1653Z1 enumC1653Z1 = c1620p1.f5822a.f5834e;
            if (EnumC1653Z1.ClientReport.equals(enumC1653Z1)) {
                try {
                    m4108s(c1620p1.m3732e(c2046v2.getSerializer()));
                    return;
                } catch (Exception unused) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC1929n enumC1929nM4099j = m4099j(enumC1653Z1);
            if (enumC1929nM4099j.equals(EnumC1929n.Transaction) && (c1944aM3734g = c1620p1.m3734g(c2046v2.getSerializer())) != null) {
                ArrayList arrayList = c1944aM3734g.f6842s;
                m4107q(enumC1853d.getReason(), EnumC1929n.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                arrayList.size();
                c2046v2.getOnDiscard();
            }
            m4107q(enumC1853d.getReason(), enumC1929nM4099j.getCategory(), 1L);
            c2046v2.getOnDiscard();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: g */
    public C1901c mo4044g(C1901c c1901c) {
        C2046v2 c2046v2 = (C2046v2) this.f6782c;
        Date dateM4067m = AbstractC1856a.m4067m();
        C1563B0 c1563b0 = (C1563B0) this.f6781b;
        c1563b0.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((C2032d) c1563b0.f5600a).m4175a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new C1854e(((C1852c) entry.getKey()).f6673a, ((C1852c) entry.getKey()).f6674b, lValueOf));
            }
        }
        C1851b c1851b = arrayList.isEmpty() ? null : new C1851b(dateM4067m, arrayList);
        if (c1851b == null) {
            return c1901c;
        }
        try {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) c1901c.f6782c).iterator();
            while (it.hasNext()) {
                arrayList2.add((C1620P1) it.next());
            }
            arrayList2.add(C1620P1.m3728b(c2046v2.getSerializer(), c1851b));
            return new C1901c((C1596J1) c1901c.f6781b, arrayList2);
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c1901c;
        }
    }

    /* JADX INFO: renamed from: h */
    public C1901c m4101h() {
        C2051c c2051c = (C2051c) this.f6781b;
        c2051c.m4223p();
        c2051c.m4217d();
        int i = c2051c.f7265c;
        int[] iArr = c2051c.f7264b;
        if (i == iArr.length) {
            c2051c.f7264b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = c2051c.f7264b;
        int i2 = c2051c.f7265c;
        c2051c.f7265c = i2 + 1;
        iArr2[i2] = 3;
        c2051c.f7263a.write(123);
        return this;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: i */
    public boolean mo3681i(EnumC1657a2 enumC1657a2) {
        C2046v2 c2046v2 = (C2046v2) this.f6782c;
        return enumC1657a2 != null && c2046v2.isDebug() && enumC1657a2.ordinal() >= c2046v2.getDiagnosticLevel().ordinal();
    }

    /* JADX INFO: renamed from: k */
    public C1901c m4102k() {
        ((C2051c) this.f6781b).m4218f(3, 5, '}');
        return this;
    }

    /* JADX INFO: renamed from: l */
    public byte[] m4103l() {
        Callable callable;
        if (((byte[]) this.f6781b) == null && (callable = (Callable) this.f6782c) != null) {
            this.f6781b = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f6781b;
        return bArr != null ? bArr : new byte[0];
    }

    /* JADX INFO: renamed from: m */
    public ArrayList m4104m(Map map, ArrayList arrayList, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z2 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            C1976z c1976z = new C1976z();
            c1976z.f7061c = thread2.getName();
            c1976z.f7060b = Integer.valueOf(thread2.getPriority());
            c1976z.f7059a = Long.valueOf(thread2.getId());
            c1976z.f7065g = Boolean.valueOf(thread2.isDaemon());
            c1976z.f7062d = thread2.getState().name();
            c1976z.f7063e = Boolean.valueOf(z2);
            ArrayList arrayListM4155b = ((C2002t) this.f6781b).m4155b(stackTraceElementArr, false);
            if (((C2046v2) this.f6782c).isAttachStacktrace() && arrayListM4155b != null && !arrayListM4155b.isEmpty()) {
                C1975y c1975y = new C1975y(arrayListM4155b);
                c1975y.f7057c = Boolean.TRUE;
                c1976z.f7067i = c1975y;
            }
            arrayList2.add(c1976z);
        }
        return arrayList2;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: n */
    public void mo3682n(EnumC1657a2 enumC1657a2, Throwable th, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f6781b;
        if (iLogger == null || !mo3681i(enumC1657a2)) {
            return;
        }
        iLogger.mo3682n(enumC1657a2, th, str, objArr);
    }

    /* JADX INFO: renamed from: o */
    public Properties m4105o() {
        String str = (String) this.f6781b;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (IOException e) {
            ((C1599K0) this.f6782c).mo3682n(EnumC1657a2.ERROR, e, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public C1901c m4106p(String str) {
        C2051c c2051c = (C2051c) this.f6781b;
        if (str == null) {
            c2051c.getClass();
            throw new NullPointerException("name == null");
        }
        if (c2051c.f7269g != null) {
            throw new IllegalStateException();
        }
        if (c2051c.f7265c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        c2051c.f7269g = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m4107q(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((C2032d) ((C1563B0) this.f6781b).f5600a).m4175a()).get(new C1852c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: r */
    public void mo3683r(EnumC1657a2 enumC1657a2, String str, Throwable th) {
        ILogger iLogger = (ILogger) this.f6781b;
        if (iLogger == null || !mo3681i(enumC1657a2)) {
            return;
        }
        iLogger.mo3683r(enumC1657a2, str, th);
    }

    /* JADX INFO: renamed from: s */
    public void m4108s(C1851b c1851b) {
        if (c1851b == null) {
            return;
        }
        for (C1854e c1854e : c1851b.f6671b) {
            m4107q(c1854e.f6675a, c1854e.f6676b, c1854e.f6677c);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m4109t(String str) {
        C2051c c2051c = (C2051c) this.f6781b;
        if (str != null) {
            c2051c.getClass();
            if (str.length() != 0) {
                c2051c.f7266d = str;
                c2051c.f7267e = ": ";
                return;
            }
        }
        c2051c.f7266d = null;
        c2051c.f7267e = ":";
    }

    /* JADX INFO: renamed from: u */
    public C1901c m4110u(double d) throws IOException {
        C2051c c2051c = (C2051c) this.f6781b;
        c2051c.m4223p();
        if (c2051c.f7268f || !(Double.isNaN(d) || Double.isInfinite(d))) {
            c2051c.m4217d();
            c2051c.f7263a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    /* JADX INFO: renamed from: v */
    public C1901c m4111v(long j) throws IOException {
        C2051c c2051c = (C2051c) this.f6781b;
        c2051c.m4223p();
        c2051c.m4217d();
        c2051c.f7263a.write(Long.toString(j));
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C1901c m4112w(ILogger iLogger, Object obj) {
        ((C1563B0) this.f6782c).m3600l(this, iLogger, obj);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C1901c m4113x(Boolean bool) throws IOException {
        C2051c c2051c = (C2051c) this.f6781b;
        if (bool == null) {
            c2051c.m4220l();
            return this;
        }
        c2051c.m4223p();
        c2051c.m4217d();
        c2051c.f7263a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C1901c m4114y(Number number) throws IOException {
        C2051c c2051c = (C2051c) this.f6781b;
        if (number == null) {
            c2051c.m4220l();
            return this;
        }
        c2051c.m4223p();
        String string = number.toString();
        if (c2051c.f7268f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            c2051c.m4217d();
            c2051c.f7263a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* JADX INFO: renamed from: z */
    public C1901c m4115z(String str) {
        C2051c c2051c = (C2051c) this.f6781b;
        if (str == null) {
            c2051c.m4220l();
            return this;
        }
        c2051c.m4223p();
        c2051c.m4217d();
        c2051c.m4222o(str);
        return this;
    }

    public /* synthetic */ C1901c(Object obj, Object obj2, int i, boolean z) {
        this.f6780a = i;
        this.f6781b = obj;
        this.f6782c = obj2;
    }

    public C1901c(Writer writer, int i) {
        this.f6780a = 2;
        this.f6781b = new C2051c(writer);
        this.f6782c = new C1563B0(i);
    }

    public C1901c(String str, HashMap map) {
        this.f6780a = 3;
        AbstractC1856a.m4048D("url is required", str);
        try {
            this.f6781b = URI.create(str).toURL();
            this.f6782c = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public C1901c(C2046v2 c2046v2) {
        this.f6780a = 9;
        this.f6782c = c2046v2;
        this.f6781b = new C1563B0(6, false);
    }

    public C1901c(ILogger iLogger) {
        this.f6780a = 0;
        ClassLoader classLoader = C1901c.class.getClassLoader();
        this.f6781b = iLogger;
        this.f6782c = AbstractC1856a.m4058d(classLoader);
    }

    public C1901c(Context context, ILogger iLogger) {
        this.f6780a = 8;
        Context applicationContext = context.getApplicationContext();
        this.f6782c = applicationContext != null ? applicationContext : context;
        this.f6781b = iLogger;
    }

    public C1901c(C1596J1 c1596j1, List list) {
        this.f6780a = 5;
        AbstractC1856a.m4048D("SentryEnvelopeHeader is required.", c1596j1);
        this.f6781b = c1596j1;
        AbstractC1856a.m4048D("SentryEnvelope items are required.", list);
        this.f6782c = list;
    }

    public C1901c(C1970t c1970t, C1968r c1968r, C1620P1 c1620p1) {
        this.f6780a = 5;
        this.f6781b = new C1596J1(c1970t, c1968r, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1620p1);
        this.f6782c = arrayList;
    }

    public C1901c(Callable callable) {
        this.f6780a = 6;
        this.f6782c = callable;
    }
}
