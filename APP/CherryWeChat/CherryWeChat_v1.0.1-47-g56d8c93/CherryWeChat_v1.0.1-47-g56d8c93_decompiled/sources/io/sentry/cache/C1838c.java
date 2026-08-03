package io.sentry.cache;

import io.sentry.C1581F2;
import io.sentry.C1584G1;
import io.sentry.C1586H;
import io.sentry.C1596J1;
import io.sentry.C1620P1;
import io.sentry.C1628R2;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1577E2;
import io.sentry.EnumC1653Z1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1866e0;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import io.sentry.hints.InterfaceC1883a;
import io.sentry.hints.InterfaceC1890h;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2029a;
import io.sentry.util.C2032d;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.C0454Kh;
import p000.C2464rl;

/* JADX INFO: renamed from: io.sentry.cache.c */
/* JADX INFO: loaded from: classes.dex */
public class C1838c implements InterfaceC1839d {

    /* JADX INFO: renamed from: i */
    public static final Charset f6633i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6634a;

    /* JADX INFO: renamed from: b */
    public final C2032d f6635b = new C2032d(new C2464rl(13, this));

    /* JADX INFO: renamed from: c */
    public final File f6636c;

    /* JADX INFO: renamed from: d */
    public final int f6637d;

    /* JADX INFO: renamed from: e */
    public final CountDownLatch f6638e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f6639f;

    /* JADX INFO: renamed from: g */
    public final C2029a f6640g;

    /* JADX INFO: renamed from: h */
    public final C2029a f6641h;

    public C1838c(C2046v2 c2046v2, String str, int i) {
        AbstractC1856a.m4048D("SentryOptions is required.", c2046v2);
        this.f6634a = c2046v2;
        this.f6636c = new File(str);
        this.f6637d = i;
        this.f6639f = new WeakHashMap();
        this.f6640g = new C2029a();
        this.f6641h = new C2029a();
        this.f6638e = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: a */
    public final File[] m4004a() {
        File file = this.f6636c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new C1837b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f6634a.getLogger().mo3680e(EnumC1657a2.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    /* JADX INFO: renamed from: b */
    public final File m4005b(C1901c c1901c) {
        String str;
        WeakHashMap weakHashMap = this.f6639f;
        C1981r c1981rM4173a = this.f6640g.m4173a();
        try {
            if (weakHashMap.containsKey(c1901c)) {
                str = (String) weakHashMap.get(c1901c);
            } else {
                String strConcat = AbstractC1856a.m4065k().concat(".envelope");
                weakHashMap.put(c1901c, strConcat);
                str = strConcat;
            }
            File file = new File(this.f6636c.getAbsolutePath(), str);
            c1981rM4173a.close();
            return file;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4006c(File file, File file2) {
        C1981r c1981rM4173a = this.f6641h.m4173a();
        try {
            boolean zExists = file2.exists();
            C2046v2 c2046v2 = this.f6634a;
            if (zExists) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error moving current session to previous session.", th);
                }
            }
            c1981rM4173a.close();
        } catch (Throwable th2) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C1901c m4007e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C1901c c1901cMo3609c = ((InterfaceC1866e0) this.f6635b.m4175a()).mo3609c(bufferedInputStream);
                bufferedInputStream.close();
                return c1901cMo3609c;
            } finally {
            }
        } catch (IOException e) {
            this.f6634a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1581F2 m4008g(C1620P1 c1620p1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1620p1.m3733f()), f6633i));
            try {
                C1581F2 c1581f2 = (C1581F2) ((InterfaceC1866e0) this.f6635b.m4175a()).mo3607a(bufferedReader, C1581F2.class);
                bufferedReader.close();
                return c1581f2;
            } finally {
            }
        } catch (Throwable th) {
            this.f6634a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4009h() {
        C2046v2 c2046v2 = this.f6634a;
        try {
            return this.f6638e.await(c2046v2.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[PHI: r3 r5 r7
  0x0056: PHI (r3v23 java.io.File[]) = 
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v26 java.io.File[])
 binds: [B:10:0x0046, B:12:0x0054, B:25:0x008e, B:32:0x00a2, B:35:0x00a7, B:37:0x00ad, B:285:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r5v21 io.sentry.util.d) = 
  (r5v20 io.sentry.util.d)
  (r5v20 io.sentry.util.d)
  (r5v20 io.sentry.util.d)
  (r5v20 io.sentry.util.d)
  (r5v20 io.sentry.util.d)
  (r5v20 io.sentry.util.d)
  (r5v23 io.sentry.util.d)
 binds: [B:10:0x0046, B:12:0x0054, B:25:0x008e, B:32:0x00a2, B:35:0x00a7, B:37:0x00ad, B:285:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r7v4 io.sentry.v2) = 
  (r7v3 io.sentry.v2)
  (r7v3 io.sentry.v2)
  (r7v3 io.sentry.v2)
  (r7v3 io.sentry.v2)
  (r7v3 io.sentry.v2)
  (r7v3 io.sentry.v2)
  (r7v6 io.sentry.v2)
 binds: [B:10:0x0046, B:12:0x0054, B:25:0x008e, B:32:0x00a2, B:35:0x00a7, B:37:0x00ad, B:285:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3868i(C1901c c1901c, C1586H c1586h) {
        boolean z;
        boolean z2;
        boolean z3;
        FileOutputStream fileOutputStream;
        BufferedReader bufferedReader;
        Date dateM4068n;
        File[] fileArr;
        C2032d c2032d;
        C2046v2 c2046v2;
        C1581F2 c1581f2M4008g;
        Boolean bool;
        String str;
        C1620P1 c1620p1M3730d;
        boolean zEquals;
        C1581F2 c1581f2M4008g2;
        AbstractC1856a.m4048D("Envelope is required.", c1901c);
        File[] fileArrM4004a = m4004a();
        int length = fileArrM4004a.length;
        C2032d c2032d2 = this.f6635b;
        int i = 0;
        C2046v2 c2046v22 = this.f6634a;
        int i2 = 1;
        int i3 = this.f6637d;
        if (length >= i3) {
            c2046v22.getLogger().mo3680e(EnumC1657a2.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i4 = (length - i3) + 1;
            if (fileArrM4004a.length > 1) {
                Arrays.sort(fileArrM4004a, new C0454Kh(2));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrM4004a, i4, length);
            int i5 = 0;
            while (i5 < i4) {
                File file = fileArrM4004a[i5];
                C1901c c1901cM4007e = m4007e(file);
                if (c1901cM4007e != null) {
                    Iterable iterable = (Iterable) c1901cM4007e.f6782c;
                    if (iterable.iterator().hasNext()) {
                        c2046v22.getClientReportRecorder().mo4040a(EnumC1853d.CACHE_OVERFLOW, c1901cM4007e);
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c1581f2M4008g = null;
                                break;
                            }
                            C1620P1 c1620p1 = (C1620P1) it.next();
                            if ((c1620p1 == null ? i : c1620p1.f5822a.f5834e.equals(EnumC1653Z1.Session)) != 0) {
                                c1581f2M4008g = m4008g(c1620p1);
                                break;
                            }
                        }
                        if (c1581f2M4008g != null) {
                            String str2 = c1581f2M4008g.f5700e;
                            if (((c1581f2M4008g.f5702g.equals(EnumC1577E2.Ok) && str2 != null) ? i2 : i) != 0 && (bool = c1581f2M4008g.f5701f) != null && bool.booleanValue()) {
                                int length2 = fileArr2.length;
                                int i6 = i;
                                while (i6 < length2) {
                                    File file2 = fileArr2[i6];
                                    C1901c c1901cM4007e2 = m4007e(file2);
                                    if (c1901cM4007e2 != null) {
                                        Iterable iterable2 = (Iterable) c1901cM4007e2.f6782c;
                                        if (iterable2.iterator().hasNext()) {
                                            Iterator it2 = iterable2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    fileArr = fileArrM4004a;
                                                    str = str2;
                                                    c2032d = c2032d2;
                                                    c2046v2 = c2046v22;
                                                    c1620p1M3730d = null;
                                                    break;
                                                }
                                                Iterator it3 = it2;
                                                C1620P1 c1620p12 = (C1620P1) it2.next();
                                                if (c1620p12 == null) {
                                                    fileArr = fileArrM4004a;
                                                    c2032d = c2032d2;
                                                    zEquals = false;
                                                } else {
                                                    fileArr = fileArrM4004a;
                                                    c2032d = c2032d2;
                                                    zEquals = c1620p12.f5822a.f5834e.equals(EnumC1653Z1.Session);
                                                }
                                                if (zEquals && (c1581f2M4008g2 = m4008g(c1620p12)) != null) {
                                                    String str3 = c1581f2M4008g2.f5700e;
                                                    c2046v2 = c2046v22;
                                                    if (c1581f2M4008g2.f5702g.equals(EnumC1577E2.Ok) && str3 != null) {
                                                        Boolean bool2 = c1581f2M4008g2.f5701f;
                                                        if (bool2 != null && bool2.booleanValue()) {
                                                            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Session %s has 2 times the init flag.", str2);
                                                            break;
                                                        }
                                                        if (str2 == null || !str2.equals(str3)) {
                                                            fileArrM4004a = fileArr;
                                                            it2 = it3;
                                                            c2032d2 = c2032d;
                                                            c2046v22 = c2046v2;
                                                            str2 = str2;
                                                        } else {
                                                            c1581f2M4008g2.f5701f = Boolean.TRUE;
                                                            try {
                                                                c1620p1M3730d = C1620P1.m3730d((InterfaceC1866e0) c2032d.m4175a(), c1581f2M4008g2);
                                                            } catch (IOException e) {
                                                                e = e;
                                                                c1620p1M3730d = null;
                                                            }
                                                            try {
                                                                it3.remove();
                                                                str = str2;
                                                                break;
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                str = str2;
                                                                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Failed to create new envelope item for the session %s", str);
                                                                c1620p1M3730d = c1620p1M3730d;
                                                            }
                                                        }
                                                    } else {
                                                        fileArrM4004a = fileArr;
                                                        it2 = it3;
                                                        c2032d2 = c2032d;
                                                        c2046v22 = c2046v2;
                                                    }
                                                } else {
                                                    fileArrM4004a = fileArr;
                                                    it2 = it3;
                                                    c2032d2 = c2032d;
                                                }
                                            }
                                            if (c1620p1M3730d != null) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it4 = iterable2.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add((C1620P1) it4.next());
                                                }
                                                arrayList.add(c1620p1M3730d);
                                                C1901c c1901c2 = new C1901c((C1596J1) c1901cM4007e2.f6781b, arrayList);
                                                long jLastModified = file2.lastModified();
                                                if (!file2.delete()) {
                                                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                                }
                                                try {
                                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                                    try {
                                                        ((InterfaceC1866e0) c2032d.m4175a()).mo3611e(c1901c2, fileOutputStream2);
                                                        file2.setLastModified(jLastModified);
                                                        fileOutputStream2.close();
                                                    } finally {
                                                    }
                                                } catch (Throwable th) {
                                                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to serialize the new envelope to the disk.", th);
                                                }
                                            }
                                        } else {
                                            fileArr = fileArrM4004a;
                                            str = str2;
                                            c2032d = c2032d2;
                                            c2046v2 = c2046v22;
                                        }
                                    }
                                    i6++;
                                    fileArrM4004a = fileArr;
                                    c2032d2 = c2032d;
                                    c2046v22 = c2046v2;
                                    str2 = str;
                                }
                                fileArr = fileArrM4004a;
                                c2032d = c2032d2;
                                c2046v2 = c2046v22;
                            }
                        }
                    } else {
                        fileArr = fileArrM4004a;
                        c2032d = c2032d2;
                        c2046v2 = c2046v22;
                    }
                }
                if (!file.delete()) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
                i5++;
                fileArrM4004a = fileArr;
                c2032d2 = c2032d;
                c2046v22 = c2046v2;
                i = 0;
                i2 = 1;
            }
        }
        C2032d c2032d3 = c2032d2;
        C2046v2 c2046v23 = c2046v22;
        File file3 = this.f6636c;
        File file4 = new File(file3.getAbsolutePath(), "session.json");
        File file5 = new File(file3.getAbsolutePath(), "previous_session.json");
        if (AbstractC1856a.m4075v(c1586h, InterfaceC1890h.class) && !file4.delete()) {
            c2046v23.getLogger().mo3680e(EnumC1657a2.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = InterfaceC1883a.class.isInstance(AbstractC1856a.m4072s(c1586h));
        Charset charset = f6633i;
        if (zIsInstance) {
            Object objM4072s = AbstractC1856a.m4072s(c1586h);
            if (objM4072s instanceof InterfaceC1883a) {
                File file6 = new File(file3.getAbsolutePath(), "previous_session.json");
                if (file6.exists()) {
                    ILogger logger = c2046v23.getLogger();
                    EnumC1657a2 enumC1657a2 = EnumC1657a2.WARNING;
                    logger.mo3680e(enumC1657a2, "Previous session is not ended, we'd need to end it.", new Object[0]);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                        try {
                            C1581F2 c1581f2 = (C1581F2) ((InterfaceC1866e0) c2032d3.m4175a()).mo3607a(bufferedReader, C1581F2.class);
                            if (c1581f2 != null) {
                                InterfaceC1883a interfaceC1883a = (InterfaceC1883a) objM4072s;
                                Long lMo3923b = interfaceC1883a.mo3923b();
                                if (lMo3923b != null) {
                                    dateM4068n = AbstractC1856a.m4068n(lMo3923b.longValue());
                                    Date date = c1581f2.f5696a;
                                    Date date2 = date == null ? null : (Date) date.clone();
                                    if (date2 == null || dateM4068n.before(date2)) {
                                        c2046v23.getLogger().mo3680e(enumC1657a2, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                    }
                                } else {
                                    dateM4068n = null;
                                }
                                c1581f2.m3664c(EnumC1577E2.Abnormal, null, true, interfaceC1883a.mo3925e());
                                c1581f2.m3663b(dateM4068n);
                                m4010j(file6, c1581f2);
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        c2046v23.getLogger().mo3683r(EnumC1657a2.ERROR, "Error processing previous session.", th2);
                    }
                } else {
                    c2046v23.getLogger().mo3680e(EnumC1657a2.DEBUG, "No previous session file to end.", new Object[0]);
                }
            }
        }
        if (C1891i.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            m4006c(file4, file5);
            Iterable iterable3 = (Iterable) c1901c.f6782c;
            if (iterable3.iterator().hasNext()) {
                C1620P1 c1620p13 = (C1620P1) iterable3.iterator().next();
                EnumC1653Z1 enumC1653Z1 = EnumC1653Z1.Session;
                EnumC1653Z1 enumC1653Z12 = c1620p13.f5822a.f5834e;
                if (enumC1653Z1.equals(enumC1653Z12)) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1620p13.m3733f()), charset));
                        try {
                            C1581F2 c1581f22 = (C1581F2) ((InterfaceC1866e0) c2032d3.m4175a()).mo3607a(bufferedReader, C1581F2.class);
                            if (c1581f22 == null) {
                                c2046v23.getLogger().mo3680e(EnumC1657a2.ERROR, "Item of type %s returned null by the parser.", enumC1653Z12);
                            } else {
                                m4010j(file4, c1581f22);
                            }
                            bufferedReader.close();
                        } finally {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                    } catch (Throwable th4) {
                        c2046v23.getLogger().mo3683r(EnumC1657a2.ERROR, "Item failed to process.", th4);
                    }
                } else {
                    c2046v23.getLogger().mo3680e(EnumC1657a2.INFO, "Current envelope has a different envelope type %s", enumC1653Z12);
                }
            } else {
                c2046v23.getLogger().mo3680e(EnumC1657a2.INFO, "Current envelope %s is empty", file4.getAbsolutePath());
            }
            if (!new File(c2046v23.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file7 = new File(c2046v23.getCacheDirPath(), "last_crash");
                if (file7.exists()) {
                    z = false;
                    c2046v23.getLogger().mo3680e(EnumC1657a2.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file7.delete()) {
                        c2046v23.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                    }
                } else {
                    z = false;
                }
                C1584G1 c1584g1 = C1584G1.f5714c;
                C1981r c1981rM4173a = c1584g1.f5716b.m4173a();
                try {
                    if (c1584g1.f5715a) {
                        z2 = true;
                    } else {
                        z2 = true;
                        c1584g1.f5715a = true;
                    }
                    c1981rM4173a.close();
                    this.f6638e.countDown();
                } finally {
                }
            }
        } else {
            z = false;
            z2 = true;
        }
        File fileM4005b = m4005b(c1901c);
        if (fileM4005b.exists()) {
            c2046v23.getLogger().mo3680e(EnumC1657a2.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM4005b.getAbsolutePath());
            return z2;
        }
        ILogger logger2 = c2046v23.getLogger();
        EnumC1657a2 enumC1657a22 = EnumC1657a2.DEBUG;
        logger2.mo3680e(enumC1657a22, "Adding Envelope to offline storage: %s", fileM4005b.getAbsolutePath());
        if (fileM4005b.exists()) {
            c2046v23.getLogger().mo3680e(enumC1657a22, "Overwriting envelope to offline storage: %s", fileM4005b.getAbsolutePath());
            if (!fileM4005b.delete()) {
                c2046v23.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete: %s", fileM4005b.getAbsolutePath());
            }
        }
        try {
            fileOutputStream = new FileOutputStream(fileM4005b);
            try {
                ((InterfaceC1866e0) c2032d3.m4175a()).mo3611e(c1901c, fileOutputStream);
                fileOutputStream.close();
                z3 = z2;
            } finally {
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
            }
        } catch (Throwable th6) {
            c2046v23.getLogger().mo3682n(EnumC1657a2.ERROR, th6, "Error writing Envelope %s to offline storage", fileM4005b.getAbsolutePath());
            z3 = z;
        }
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            try {
                fileOutputStream = new FileOutputStream(new File(c2046v23.getCacheDirPath(), "last_crash"));
                try {
                    fileOutputStream.write(AbstractC1856a.m4073t(AbstractC1856a.m4067m()).getBytes(charset));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th7) {
                c2046v23.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the crash marker file to the disk", th7);
            }
        }
        return z3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2046v2 c2046v2 = this.f6634a;
        File[] fileArrM4004a = m4004a();
        ArrayList arrayList = new ArrayList(fileArrM4004a.length);
        for (File file : fileArrM4004a) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC1866e0) this.f6635b.m4175a()).mo3609c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final void m4010j(File file, C1581F2 c1581f2) {
        String str = c1581f2.f5700e;
        C2046v2 c2046v2 = this.f6634a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f6633i));
                try {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((InterfaceC1866e0) this.f6635b.m4175a()).mo3610d(c1581f2, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: p */
    public final void mo4011p(C1901c c1901c) {
        AbstractC1856a.m4048D("Envelope is required.", c1901c);
        File fileM4005b = m4005b(c1901c);
        boolean zExists = fileM4005b.exists();
        C2046v2 c2046v2 = this.f6634a;
        if (!zExists) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope was not cached: %s", fileM4005b.getAbsolutePath());
            return;
        }
        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Discarding envelope from cache: %s", fileM4005b.getAbsolutePath());
        if (fileM4005b.delete()) {
            return;
        }
        c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete envelope: %s", fileM4005b.getAbsolutePath());
    }
}
