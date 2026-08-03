package io.sentry.cache;

import io.sentry.AbstractC2004t1;
import io.sentry.C1589H2;
import io.sentry.C1871f;
import io.sentry.C1979q1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.util.RunnableC1803c;
import io.sentry.cache.tape.AbstractC1846e;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2032d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p000.C2464rl;
import p000.RunnableC2445r8;

/* JADX INFO: renamed from: io.sentry.cache.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1841f extends AbstractC2004t1 {

    /* JADX INFO: renamed from: c */
    public static final Charset f6643c = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6644a;

    /* JADX INFO: renamed from: b */
    public final C2032d f6645b;

    static {
        f6643c = Charset.forName("UTF-8");
    }

    public C1841f(SentryAndroidOptions r4) {
        this.f6645b = new C2032d(new C2464rl(14, this));
        this.f6644a = r4;
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: a */
    public final void mo3783a(Collection r2) {
        if (r2.isEmpty() == false) goto L6;
        m4016h(new RunnableC1631S1(10, this));
        return;
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: b */
    public final void mo3784b(String r3) {
        m4016h(new RunnableC1803c(3, this, r3));
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: c */
    public final void mo3785c(C1871f r3) {
        m4016h(new RunnableC1803c(1, this, r3));
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: d */
    public final void mo3786d(C1589H2 r3, C1979q1 r4) {
        m4016h(new RunnableC2445r8(this, r3, r4, 9));
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: e */
    public final void mo3787e(C1953c r3) {
        m4016h(new RunnableC1803c(5, this, r3));
    }

    /* JADX INFO: renamed from: f */
    public final void m4014f(String r3) {
        AbstractC1836a.m4000a(this.f6644a, ".scope-cache", r3);
    }

    /* JADX INFO: renamed from: g */
    public final Object m4015g(C2046v2 r6, String r7, Class r8) {
        if (r7.equals("breadcrumbs.json") == false) goto L13;
        AbstractC1846e r0 = (AbstractC1846e) this.f6645b.m4175a();     // Catch: IOException -> L10
        int r1 = Math.min(r0.size(), r0.size());     // Catch: IOException -> L10
        ArrayList r2 = new ArrayList(r1);     // Catch: IOException -> L10
        Iterator r02 = r0.iterator();     // Catch: IOException -> L10
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        r2.add(r02.next());     // Catch: IOException -> L10
        r3 = r3 + 1;     // Catch: IOException -> L10
        goto L6
    L8:
        return r8.cast(Collections.unmodifiableList(r2));
    L10:
        r6.getLogger().mo3680e(EnumC1657a2.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
        return null;
    L13:
        return AbstractC1836a.m4002c(r6, ".scope-cache", r7, r8);
    }

    /* JADX INFO: renamed from: h */
    public final void m4016h(Runnable r5) {
        C2046v2 r0 = this.f6644a;
        if (r0.isEnableScopePersistence() == true) goto L6;
        return;
    L6:
        if (Thread.currentThread().getName().contains("SentryExecutor") == true) goto L19;
        r0.getExecutorService().submit(new RunnableC1803c(4, this, r5));     // Catch: Throwable -> L14
        return;
    L14:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task could not be scheduled", th);
        return;
    L19:
        r5.run();     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task failed", th);
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: k */
    public final void mo3788k(C1970t r3) {
        m4016h(new RunnableC1803c(2, this, r3));
    }
}
