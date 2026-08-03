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
    public static final Charset f6633i = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6634a;

    /* JADX INFO: renamed from: b */
    public final C2032d f6635b;

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

    static {
        f6633i = Charset.forName("UTF-8");
    }

    public C1838c(C2046v2 r4, String r5, int r6) {
        this.f6635b = new C2032d(new C2464rl(13, this));
        AbstractC1856a.m4048D("SentryOptions is required.", r4);
        this.f6634a = r4;
        this.f6636c = new File(r5);
        this.f6637d = r6;
        this.f6639f = new WeakHashMap();
        this.f6640g = new C2029a();
        this.f6641h = new C2029a();
        this.f6638e = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: a */
    public final File[] m4004a() {
        File r0 = this.f6636c;
        if (r0.isDirectory() == true) goto L5;
    L12:
        this.f6634a.getLogger().mo3680e(EnumC1657a2.ERROR, "The directory for caching files is inaccessible.: %s", new Object[]{r0.getAbsolutePath()});
    L14:
        return new File[0];
    L5:
        if (r0.canWrite() == false) goto L12;
        if (r0.canRead() == false) goto L12;
        File[] r02 = r0.listFiles(new C1837b());
        if (r02 == null) goto L14;
        return r02;
    }

    /* JADX INFO: renamed from: b */
    public final File m4005b(C1901c r5) {
        WeakHashMap r0 = this.f6639f;
        C1981r r2 = this.f6640g.m4173a();
    L6:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L4:
        if (r0.containsKey(r5) == false) goto L8;
        String r52 = (String) r0.get(r5);     // Catch: Throwable -> L6
    L9:
        File r02 = new File(this.f6636c.getAbsolutePath(), r52);     // Catch: Throwable -> L6
        r2.close();
        return r02;
    L8:
        String r1 = AbstractC1856a.m4065k().concat(".envelope");     // Catch: Throwable -> L6
        r0.put(r5, r1);     // Catch: Throwable -> L6
        r52 = r1;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m4006c(File r8, File r9) {
        C1981r r0 = this.f6641h.m4173a();
        boolean r1 = r9.exists();     // Catch: Throwable -> L9
        C2046v2 r3 = this.f6634a;
        if (r1 == false) goto L12;
        r3.getLogger().mo3680e(EnumC1657a2.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);     // Catch: Throwable -> L9
        if (r9.delete() == true) goto L12;
        r3.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to delete previous session file: %s", new Object[]{r9});     // Catch: Throwable -> L9
    L12:
        if (r8.exists() == false) goto L20;
        r3.getLogger().mo3680e(EnumC1657a2.INFO, "Moving current session to previous session.", new Object[0]);     // Catch: Throwable -> L9
    L18:
        th = move-exception;
        r3.getLogger().mo3683r(EnumC1657a2.ERROR, "Error moving current session to previous session.", th);     // Catch: Throwable -> L9
        goto L20
    L15:
        if (r8.renameTo(r9) == true) goto L20;
        r3.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to move current session to previous session.", new Object[0]);     // Catch: Throwable -> L18
    L20:
        r0.close();
        return;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L24
    L26:
        throw th;
    L24:
        th = move-exception;
        th.addSuppressed(th);
        goto L26
    }

    /* JADX INFO: renamed from: e */
    public final C1901c m4007e(File r4) {
        BufferedInputStream r0 = new BufferedInputStream(new FileInputStream(r4));     // Catch: IOException -> L6
        C1901c r42 = ((InterfaceC1866e0) this.f6635b.m4175a()).mo3609c(r0);     // Catch: Throwable -> L8
        r0.close();     // Catch: IOException -> L6
        return r42;
    L8:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L11
    L13:
        throw th;     // Catch: IOException -> L6
    L11:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L6
    L6:
        e = move-exception;
        this.f6634a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to deserialize the envelope.", e);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C1581F2 m4008g(C1620P1 r4) {
        BufferedReader r0 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4.m3733f()), f6633i));     // Catch: Throwable -> L6
        C1581F2 r42 = (C1581F2) ((InterfaceC1866e0) this.f6635b.m4175a()).mo3607a(r0, C1581F2.class);     // Catch: Throwable -> L8
        r0.close();     // Catch: Throwable -> L6
        return r42;
    L8:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L11
    L13:
        throw th;     // Catch: Throwable -> L6
    L11:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        this.f6634a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to deserialize the session.", th);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4009h() {
        C2046v2 r0 = this.f6634a;
        return this.f6638e.await(r0.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
    L5:
        Thread.currentThread().interrupt();
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: i */
    public boolean mo3868i(C1901c r23, C1586H r24) {
        AbstractC1856a.m4048D("Envelope is required.", r23);
        File[] r3 = m4004a();
        int r0 = r3.length;
        C2032d r5 = this.f6635b;
        int r6 = 0;
        C2046v2 r7 = this.f6634a;
        int r8 = 1;
        int r9 = this.f6637d;
        if (r0 < r9) goto L111;
        r7.getLogger().mo3680e(EnumC1657a2.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
        int r92 = (r0 - r9) + 1;
        if (r3.length <= 1) goto L7;
        Arrays.sort(r3, new C0454Kh(2));
    L7:
        File[] r10 = (File[]) Arrays.copyOfRange(r3, r92, r0);
        int r11 = 0;
    L8:
        if (r11 >= r92) goto L111;
        File r12 = r3[r11];
        C1901c r02 = m4007e(r12);
        if (r02 == null) goto L13;
        Iterable r14 = (Iterable) r02.f6782c;
        if (r14.iterator().hasNext() == false) goto L13;
        r7.getClientReportRecorder().mo4040a(EnumC1853d.CACHE_OVERFLOW, r02);
        Iterator r03 = r14.iterator();
    L16:
        if (r03.hasNext() == false) goto L24;
        C1620P1 r4 = (C1620P1) r03.next();
        if (r4 != null) goto L20;
        boolean r142 = r6;
    L21:
        if (r142 == 0) goto L16;
        C1581F2 r04 = m4008g(r4);
    L25:
        if (r04 == null) goto L13;
        String r42 = r04.f5700e;
        if (r04.f5702g.equals(EnumC1577E2.f5688Ok) == false) goto L31;
        if (r42 == null) goto L31;
        int r143 = r8;
    L32:
        if (r143 == 0) goto L13;
        Boolean r05 = r04.f5701f;
        if (r05 == null) goto L13;
        if (r05.booleanValue() == false) goto L13;
        int r144 = r10.length;
        int r15 = r6;
    L40:
        if (r15 >= r144) goto L13;
        File r82 = r10[r15];
        C1901c r62 = m4007e(r82);
        if (r62 == null) goto L45;
        Iterable r16 = (Iterable) r62.f6782c;
        if (r16.iterator().hasNext() == false) goto L45;
        Iterator r06 = r16.iterator();
    L48:
        if (r06.hasNext() == false) goto L83;
        Iterator r18 = r06;
        C1620P1 r07 = (C1620P1) r06.next();
        if (r07 != null) goto L52;
        File[] r17 = r3;
        C2032d r19 = r5;
        boolean r32 = false;
    L53:
        if (r32 == false) goto L54;
        C1581F2 r08 = m4008g(r07);
        if (r08 == null) goto L54;
        String r33 = r08.f5700e;
        C2046v2 r20 = r7;
        if (r08.f5702g.equals(EnumC1577E2.f5688Ok) == false) goto L62;
        if (r33 == null) goto L62;
        boolean r52 = true;
    L63:
        if (r52 == false) goto L64;
        Boolean r53 = r08.f5701f;
        if (r53 != null) goto L68;
    L70:
        if (r42 != null) goto L72;
    L82:
        r3 = r17;
        r06 = r18;
        r5 = r19;
        r7 = r20;
        r42 = r42;
        goto L48
    L72:
        if (r42.equals(r33) == false) goto L82;
        r08.f5701f = Boolean.TRUE;
        C1620P1 r34 = C1620P1.m3730d((InterfaceC1866e0) r19.m4175a(), r08);     // Catch: IOException -> L79
        r18.remove();     // Catch: IOException -> L77
        String r21 = r42;
    L84:
        if (r34 == null) goto L106;
        ArrayList r09 = new ArrayList();
        Iterator r43 = r16.iterator();
    L87:
        if (r43.hasNext() == false) goto L89;
        r09.add((C1620P1) r43.next());
        goto L87
    L89:
        r09.add(r34);
        C1901c r35 = new C1901c((C1596J1) r62.f6781b, r09);
        long r44 = r82.lastModified();
        if (r82.delete() == true) goto L253;
        r20.getLogger().mo3680e(EnumC1657a2.WARNING, "File can't be deleted: %s", new Object[]{r82.getAbsolutePath()});
    L253:
        FileOutputStream r63 = new FileOutputStream(r82);     // Catch: Throwable -> L96
        ((InterfaceC1866e0) r19.m4175a()).mo3611e(r35, r63);     // Catch: Throwable -> L98
        r82.setLastModified(r44);     // Catch: Throwable -> L98
        r63.close();     // Catch: Throwable -> L96
    L108:
        if (r12.delete() == true) goto L110;
        r20.getLogger().mo3680e(EnumC1657a2.WARNING, "File can't be deleted: %s", new Object[]{r12.getAbsolutePath()});
    L110:
        r11 = r11 + 1;
        r3 = r17;
        r5 = r19;
        r7 = r20;
        r6 = 0;
        r8 = 1;
        goto L8
    L98:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L102
    L104:
        throw th;     // Catch: Throwable -> L96
    L102:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L96
    L96:
        th = move-exception;
        r20.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to serialize the new envelope to the disk.", th);
    L106:
        r15 = r15 + 1;
        r3 = r17;
        r5 = r19;
        r7 = r20;
        r42 = r21;
    L77:
        e = e;
    L81:
        r21 = r42;
        r20.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Failed to create new envelope item for the session %s", new Object[]{r21});
        r34 = r34;
    L79:
        e = e;
        r34 = null;
        goto L81
    L68:
        if (r53.booleanValue() == false) goto L70;
        r20.getLogger().mo3680e(EnumC1657a2.ERROR, "Session %s has 2 times the init flag.", new Object[]{r42});
        goto L108
    L64:
        r3 = r17;
        r06 = r18;
        r5 = r19;
        r7 = r20;
    L62:
        r52 = false;
    L54:
        r3 = r17;
        r06 = r18;
        r5 = r19;
        goto L48
    L52:
        r17 = r3;
        r19 = r5;
        r32 = r07.f5822a.f5834e.equals(EnumC1653Z1.Session);
        goto L53
    L83:
        r17 = r3;
        r21 = r42;
        r19 = r5;
        r20 = r7;
        r34 = null;
    L45:
        r17 = r3;
        r21 = r42;
        r19 = r5;
        r20 = r7;
    L31:
        r143 = r6;
        goto L32
    L20:
        r142 = r4.f5822a.f5834e.equals(EnumC1653Z1.Session);
        goto L21
    L24:
        r04 = null;
    L13:
        r17 = r3;
        r19 = r5;
        r20 = r7;
    L111:
        C2032d r192 = r5;
        C2046v2 r202 = r7;
        File r010 = this.f6636c;
        File r45 = new File(r010.getAbsolutePath(), "session.json");
        File r54 = new File(r010.getAbsolutePath(), "previous_session.json");
        if (AbstractC1856a.m4075v(r24, InterfaceC1890h.class) == true) goto L114;
    L116:
        boolean r36 = InterfaceC1883a.class.isInstance(AbstractC1856a.m4072s(r24));
        Charset r93 = f6633i;
        if (r36 == false) goto L154;
        Object r37 = AbstractC1856a.m4072s(r24);
        if ((r37 instanceof InterfaceC1883a) == false) goto L154;
        File r102 = new File(r010.getAbsolutePath(), "previous_session.json");
        if (r102.exists() == false) goto L152;
        ILogger r011 = r202.getLogger();
        EnumC1657a2 r64 = EnumC1657a2.WARNING;
        r011.mo3680e(r64, "Previous session is not ended, we'd need to end it.", new Object[0]);
        BufferedReader r112 = new BufferedReader(new InputStreamReader(new FileInputStream(r102), r93));     // Catch: Throwable -> L141
        C1581F2 r012 = (C1581F2) ((InterfaceC1866e0) r192.m4175a()).mo3607a(r112, C1581F2.class);     // Catch: Throwable -> L136
        if (r012 == null) goto L139;
        InterfaceC1883a r38 = (InterfaceC1883a) r37;     // Catch: Throwable -> L136
        Long r122 = r38.mo3923b();     // Catch: Throwable -> L136
        if (r122 == null) goto L143;
        Date r123 = AbstractC1856a.m4068n(r122.longValue());     // Catch: Throwable -> L136
        Date r13 = r012.f5696a;     // Catch: Throwable -> L136
        if (r13 != null) goto L131;
        Date r132 = null;
    L132:
        if (r132 != null) goto L134;
    L138:
        r202.getLogger().mo3680e(r64, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);     // Catch: Throwable -> L136
        goto L139
    L134:
        if (r123.before(r132) == true) goto L138;
    L144:
        r012.m3664c(EnumC1577E2.Abnormal, null, true, r38.mo3925e());     // Catch: Throwable -> L136
        r012.m3663b(r123);     // Catch: Throwable -> L136
        m4010j(r102, r012);     // Catch: Throwable -> L136
        goto L139
    L131:
        r132 = (Date) r13.clone();     // Catch: Throwable -> L136
        goto L132
    L143:
        r123 = null;
    L139:
        r112.close();     // Catch: Throwable -> L141
    L136:
        th = move-exception;
        r112.close();     // Catch: Throwable -> L148
    L300:
        throw th;     // Catch: Throwable -> L141
    L148:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L141
        throw th;     // Catch: Throwable -> L141
    L141:
        th = move-exception;
        r202.getLogger().mo3683r(EnumC1657a2.ERROR, "Error processing previous session.", th);
        goto L154
    L152:
        r202.getLogger().mo3680e(EnumC1657a2.DEBUG, "No previous session file to end.", new Object[0]);
    L154:
        if (C1891i.class.isInstance(AbstractC1856a.m4072s(r24)) == false) goto L200;
        m4006c(r45, r54);
        Iterable r013 = (Iterable) r23.f6782c;
        if (r013.iterator().hasNext() == false) goto L177;
        C1620P1 r014 = (C1620P1) r013.iterator().next();
        EnumC1653Z1 r55 = EnumC1653Z1.Session;
        EnumC1653Z1 r65 = r014.f5822a.f5834e;
        if (r55.equals(r65) == true) goto L242;
        r202.getLogger().mo3680e(EnumC1657a2.INFO, "Current envelope has a different envelope type %s", new Object[]{r65});
    L179:
        if (new File(r202.getCacheDirPath(), ".sentry-native/last_crash").exists() == true) goto L185;
        File r015 = new File(r202.getCacheDirPath(), "last_crash");
        if (r015.exists() == false) goto L185;
        boolean r103 = false;
        r202.getLogger().mo3680e(EnumC1657a2.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
        if (r015.delete() == true) goto L186;
        r202.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the crash marker file. %s.", new Object[]{r015.getAbsolutePath()});
    L186:
        C1584G1 r016 = C1584G1.f5714c;
        C1981r r46 = r016.f5716b.m4173a();
    L191:
        th = move-exception;
        r46.close();     // Catch: Throwable -> L197
        throw th;
    L197:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L188:
        if (r016.f5715a == true) goto L193;
        boolean r145 = true;
        r016.f5715a = true;     // Catch: Throwable -> L191
    L194:
        r46.close();
        this.f6638e.countDown();
    L201:
        File r47 = m4005b(r23);
        if (r47.exists() == false) goto L204;
        r202.getLogger().mo3680e(EnumC1657a2.WARNING, "Not adding Envelope to offline storage because it already exists: %s", new Object[]{r47.getAbsolutePath()});
        return r145;
    L204:
        ILogger r017 = r202.getLogger();
        EnumC1657a2 r56 = EnumC1657a2.DEBUG;
        r017.mo3680e(r56, "Adding Envelope to offline storage: %s", new Object[]{r47.getAbsolutePath()});
        if (r47.exists() == false) goto L243;
        r202.getLogger().mo3680e(r56, "Overwriting envelope to offline storage: %s", new Object[]{r47.getAbsolutePath()});
        if (r47.delete() == true) goto L243;
        r202.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete: %s", new Object[]{r47.getAbsolutePath()});
    L243:
        FileOutputStream r57 = new FileOutputStream(r47);     // Catch: Throwable -> L213
        ((InterfaceC1866e0) r192.m4175a()).mo3611e(r23, r57);     // Catch: Throwable -> L215
        r57.close();     // Catch: Throwable -> L213
        boolean r66 = r145;
    L224:
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(r24)) == false) goto L241;
        FileOutputStream r2 = new FileOutputStream(new File(r202.getCacheDirPath(), "last_crash"));     // Catch: Throwable -> L230
        r2.write(AbstractC1856a.m4073t(AbstractC1856a.m4067m()).getBytes(r93));     // Catch: Throwable -> L232
        r2.flush();     // Catch: Throwable -> L232
        r2.close();     // Catch: Throwable -> L230
        goto L241
    L232:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L236
    L304:
        throw th;     // Catch: Throwable -> L230
    L236:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L230
        throw th;     // Catch: Throwable -> L230
    L230:
        th = move-exception;
        r202.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the crash marker file to the disk", th);
    L241:
        return r66;
    L215:
        th = move-exception;
        r57.close();     // Catch: Throwable -> L219
    L303:
        throw th;     // Catch: Throwable -> L213
    L219:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L213
        throw th;     // Catch: Throwable -> L213
    L213:
        th = move-exception;
        r202.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error writing Envelope %s to offline storage", new Object[]{r47.getAbsolutePath()});
        r66 = r103;
        goto L224
    L193:
        r145 = true;
    L185:
        r103 = false;
        goto L186
    L242:
        BufferedReader r58 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r014.m3733f()), r93));     // Catch: Throwable -> L168
        C1581F2 r018 = (C1581F2) ((InterfaceC1866e0) r192.m4175a()).mo3607a(r58, C1581F2.class);     // Catch: Throwable -> L163
        if (r018 != null) goto L165;
        r202.getLogger().mo3680e(EnumC1657a2.ERROR, "Item of type %s returned null by the parser.", new Object[]{r65});     // Catch: Throwable -> L163
    L166:
        r58.close();     // Catch: Throwable -> L168
        goto L179
    L165:
        m4010j(r45, r018);     // Catch: Throwable -> L163
    L163:
        th = move-exception;
        r58.close();     // Catch: Throwable -> L172
    L301:
        throw th;     // Catch: Throwable -> L168
    L172:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L168
        throw th;     // Catch: Throwable -> L168
    L168:
        th = move-exception;
        r202.getLogger().mo3683r(EnumC1657a2.ERROR, "Item failed to process.", th);
        goto L179
    L177:
        r202.getLogger().mo3680e(EnumC1657a2.INFO, "Current envelope %s is empty", new Object[]{r45.getAbsolutePath()});
        goto L179
    L200:
        r103 = false;
        r145 = true;
        goto L201
    L114:
        if (r45.delete() == true) goto L116;
        r202.getLogger().mo3680e(EnumC1657a2.WARNING, "Current envelope doesn't exist.", new Object[0]);
        goto L116
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2046v2 r0 = this.f6634a;
        File[] r1 = m4004a();
        ArrayList r2 = new ArrayList(r1.length);
        int r3 = r1.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L21;
        File r5 = r1[r4];
        BufferedInputStream r6 = new BufferedInputStream(new FileInputStream(r5));     // Catch: IOException -> L9 FileNotFoundException -> L18
        r2.add(((InterfaceC1866e0) this.f6635b.m4175a()).mo3609c(r6));     // Catch: Throwable -> L11
        r6.close();     // Catch: IOException -> L9 FileNotFoundException -> L18
    L19:
        r4 = r4 + 1;
        goto L3
    L11:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L14
    L16:
        throw th;     // Catch: IOException -> L9 FileNotFoundException -> L18
    L14:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L9 FileNotFoundException -> L18
    L18:
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", new Object[]{r5.getAbsolutePath()});
    L9:
        e = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error while reading cached envelope from file " + r5.getAbsolutePath(), e);
        goto L19
    L21:
        return r2.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final void m4010j(File r8, C1581F2 r9) {
        String r0 = r9.f5700e;
        C2046v2 r1 = this.f6634a;
        FileOutputStream r2 = new FileOutputStream(r8);     // Catch: Throwable -> L9
        BufferedWriter r82 = new BufferedWriter(new OutputStreamWriter(r2, f6633i));     // Catch: Throwable -> L11
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Overwriting session to offline storage: %s", new Object[]{r0});     // Catch: Throwable -> L13
        ((InterfaceC1866e0) this.f6635b.m4175a()).mo3610d(r9, r82);     // Catch: Throwable -> L13
        r82.close();     // Catch: Throwable -> L11
        r2.close();     // Catch: Throwable -> L9
        return;
    L13:
        th = move-exception;
        r82.close();     // Catch: Throwable -> L16
    L18:
        throw th;     // Catch: Throwable -> L11
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L21
    L23:
        throw th;     // Catch: Throwable -> L9
    L21:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r1.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error writing Session to offline storage: %s", new Object[]{r0});
    }

    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: p */
    public final void mo4011p(C1901c r6) {
        AbstractC1856a.m4048D("Envelope is required.", r6);
        File r62 = m4005b(r6);
        boolean r0 = r62.exists();
        C2046v2 r1 = this.f6634a;
        if (r0 == false) goto L8;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Discarding envelope from cache: %s", new Object[]{r62.getAbsolutePath()});
        if (r62.delete() == true) goto L10;
        r1.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete envelope: %s", new Object[]{r62.getAbsolutePath()});
        return;
    L10:
        return;
    L8:
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope was not cached: %s", new Object[]{r62.getAbsolutePath()});
    }
}
