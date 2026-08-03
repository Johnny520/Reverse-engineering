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

    public C1844c(C1845d c1845d, C1848g c1848g) {
        this.f6647b = c1845d;
        this.f6646a = c1848g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6646a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] bArr = (byte[]) this.f6646a.next();
        C2046v2 c2046v2 = ((C1841f) this.f6647b.f6650c.f5600a).f6644a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), C1841f.f6643c));
            try {
                C1871f c1871f = (C1871f) c2046v2.getSerializer().mo3607a(bufferedReader, C1871f.class);
                bufferedReader.close();
                return c1871f;
            } finally {
            }
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6646a.remove();
    }
}
