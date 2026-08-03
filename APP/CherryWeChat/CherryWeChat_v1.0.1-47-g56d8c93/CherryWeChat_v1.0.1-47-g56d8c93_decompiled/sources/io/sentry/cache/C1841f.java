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
    public static final Charset f6643c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6644a;

    /* JADX INFO: renamed from: b */
    public final C2032d f6645b = new C2032d(new C2464rl(14, this));

    public C1841f(SentryAndroidOptions sentryAndroidOptions) {
        this.f6644a = sentryAndroidOptions;
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: a */
    public final void mo3783a(Collection collection) {
        if (collection.isEmpty()) {
            m4016h(new RunnableC1631S1(10, this));
        }
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: b */
    public final void mo3784b(String str) {
        m4016h(new RunnableC1803c(3, this, str));
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: c */
    public final void mo3785c(C1871f c1871f) {
        m4016h(new RunnableC1803c(1, this, c1871f));
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: d */
    public final void mo3786d(C1589H2 c1589h2, C1979q1 c1979q1) {
        m4016h(new RunnableC2445r8(this, c1589h2, c1979q1, 9));
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: e */
    public final void mo3787e(C1953c c1953c) {
        m4016h(new RunnableC1803c(5, this, c1953c));
    }

    /* JADX INFO: renamed from: f */
    public final void m4014f(String str) {
        AbstractC1836a.m4000a(this.f6644a, ".scope-cache", str);
    }

    /* JADX INFO: renamed from: g */
    public final Object m4015g(C2046v2 c2046v2, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return AbstractC1836a.m4002c(c2046v2, ".scope-cache", str, cls);
        }
        try {
            AbstractC1846e abstractC1846e = (AbstractC1846e) this.f6645b.m4175a();
            int iMin = Math.min(abstractC1846e.size(), abstractC1846e.size());
            ArrayList arrayList = new ArrayList(iMin);
            Iterator it = abstractC1846e.iterator();
            for (int i = 0; i < iMin; i++) {
                arrayList.add(it.next());
            }
            return cls.cast(Collections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4016h(Runnable runnable) {
        C2046v2 c2046v2 = this.f6644a;
        if (c2046v2.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                c2046v2.getExecutorService().submit(new RunnableC1803c(4, this, runnable));
            } catch (Throwable th2) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    @Override // io.sentry.AbstractC2004t1, io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: k */
    public final void mo3788k(C1970t c1970t) {
        m4016h(new RunnableC1803c(2, this, c1970t));
    }
}
