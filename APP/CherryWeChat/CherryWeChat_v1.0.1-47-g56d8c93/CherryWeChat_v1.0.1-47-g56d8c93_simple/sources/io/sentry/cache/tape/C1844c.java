package io.sentry.cache.tape;

import io.sentry.C1871f;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.cache.C1841f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.cache.tape.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1844c implements Iterator {

    /* JADX INFO: renamed from: a */
    public final C1848g f6646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1845d f6647b;

    public C1844c(C1845d r1, C1848g r2) {
        this.f6647b = r1;
        this.f6646a = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6646a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] r0 = (byte[]) this.f6646a.next();
        C2046v2 r1 = ((C1841f) this.f6647b.f6650c.f5600a).f6644a;
        BufferedReader r2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r0), C1841f.f6643c));     // Catch: Throwable -> L7
        C1871f r02 = (C1871f) r1.getSerializer().mo3607a(r2, C1871f.class);     // Catch: Throwable -> L9
        r2.close();     // Catch: Throwable -> L7
        return r02;
    L9:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L12
    L14:
        throw th;     // Catch: Throwable -> L7
    L12:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r1.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error reading entity from scope cache", new Object[0]);
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6646a.remove();
    }
}
