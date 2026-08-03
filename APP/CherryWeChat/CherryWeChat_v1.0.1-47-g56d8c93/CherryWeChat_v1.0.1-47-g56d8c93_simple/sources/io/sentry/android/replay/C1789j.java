package io.sentry.android.replay;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.video.C1814d;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0585Nj;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.C1216bb;
import p000.C1251cA;
import p000.C2381po;

/* JADX INFO: renamed from: io.sentry.android.replay.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1789j implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6498a;

    /* JADX INFO: renamed from: b */
    public final C1970t f6499b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f6500c;

    /* JADX INFO: renamed from: d */
    public final C2029a f6501d;

    /* JADX INFO: renamed from: e */
    public final C2029a f6502e;

    /* JADX INFO: renamed from: f */
    public C1814d f6503f;

    /* JADX INFO: renamed from: g */
    public final C1251cA f6504g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6505h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f6506i;

    /* JADX INFO: renamed from: j */
    public final C1251cA f6507j;

    public C1789j(C2046v2 r1, C1970t r2) {
        this.f6498a = r1;
        this.f6499b = r2;
        this.f6500c = new AtomicBoolean(false);
        this.f6501d = new C2029a();
        this.f6502e = new C2029a();
        this.f6504g = new C1251cA(new C1783g(this, 1));
        this.f6505h = new ArrayList();
        this.f6506i = new LinkedHashMap();
        this.f6507j = new C1251cA(new C1783g(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f6501d.m4173a();
        C1814d r1 = this.f6503f;     // Catch: Throwable -> L6
        if (r1 == null) goto L8;
        r1.m3984c();     // Catch: Throwable -> L6
    L8:
        this.f6503f = null;     // Catch: Throwable -> L6
        AbstractC0714Qj.m1489k(r0, null);
        this.f6500c.set(true);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final void m3971d(File r6) {
        C2046v2 r1 = this.f6498a;
    L7:
        th = move-exception;
        r1.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to delete replay frame: %s", new Object[]{r6.getAbsolutePath()});
        return;
    L4:
        if (r6.delete() == true) goto L9;
        r1.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete replay frame: %s", new Object[]{r6.getAbsolutePath()});     // Catch: Throwable -> L7
        return;
    }

    /* JADX INFO: renamed from: f */
    public final File m3972f() {
        return (File) this.f6504g.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m3973i(String r12, String r13) {
        C1251cA r0 = this.f6507j;
        LinkedHashMap r1 = this.f6506i;
        C1981r r2 = this.f6502e.m4173a();
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        AbstractC0714Qj.m1489k(r2, th);
        throw th;
    L5:
        if (this.f6500c.get() == false) goto L8;
        AbstractC0714Qj.m1489k(r2, null);
        return;
    L8:
        File r3 = (File) r0.getValue();     // Catch: Throwable -> L13
        if (r3 != null) goto L11;
    L15:
        File r32 = (File) r0.getValue();     // Catch: Throwable -> L13
        if (r32 == null) goto L19;
        r32.createNewFile();     // Catch: Throwable -> L13
    L19:
        if (r1.isEmpty() == false) goto L37;
        File r33 = (File) r0.getValue();     // Catch: Throwable -> L13
        if (r33 == null) goto L37;
        Charset r6 = AbstractC2659w7.f9201a;     // Catch: Throwable -> L13
        BufferedReader r34 = new BufferedReader(new InputStreamReader(new FileInputStream(r33), r6), 8192);     // Catch: Throwable -> L13
        Iterator r62 = new C1216bb(new C2381po(0, r34)).iterator();     // Catch: Throwable -> L28
    L24:
        if (r62.hasNext() == false) goto L30;
        List r7 = AbstractC2564tz.m5065Z((String) r62.next(), new String[]{"="}, 2);     // Catch: Throwable -> L28
        r1.put((String) r7.get(0), (String) r7.get(1));     // Catch: Throwable -> L28
        goto L24
    L30:
        r34.close();     // Catch: Throwable -> L13
        goto L37
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        AbstractC0585Nj.m1138f(r34, th);     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L37:
        if (r13 != null) goto L39;
        r1.remove(r12);     // Catch: Throwable -> L13
    L40:
        File r122 = (File) r0.getValue();     // Catch: Throwable -> L13
        if (r122 == null) goto L43;
        AbstractC2675wh.m5246i0(r122, AbstractC2453ra.m4901k0(r1.entrySet(), "\n", null, null, C1787h.f6493b, 30));     // Catch: Throwable -> L13
    L43:
        AbstractC0714Qj.m1489k(r2, null);
        return;
    L39:
        r1.put(r12, r13);     // Catch: Throwable -> L13
        goto L40
    L11:
        if (r3.exists() != true) goto L15;
        goto L15
    }
}
