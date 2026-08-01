package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 {
    public final LinkedHashMap a;

    public ra0() {
        this.a = new LinkedHashMap();
    }

    public final void a() {
        Iterator r0 = this.a.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L44;
        pa0 r1 = (pa0) r0.next();
        HashMap r2 = r1.a;
        if (r2 == null) goto L24;
        monitor-enter(r2);
        Iterator r3 = r1.a.values().iterator();     // Catch: Throwable -> L18
    L10:
        if (r3.hasNext() == false) goto L20;
        Object r4 = r3.next();     // Catch: Throwable -> L18
        if ((r4 instanceof Closeable) == false) goto L10;
        ((Closeable) r4).close();     // Catch: IOException -> L15 Throwable -> L18
    L15:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L18
    L20:
        monitor-exit(r2);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    L24:
        LinkedHashSet r22 = r1.b;
        if (r22 == null) goto L43;
        monitor-enter(r22);
        Iterator r32 = r1.b.iterator();     // Catch: Throwable -> L37
    L29:
        if (r32.hasNext() == false) goto L39;
        Closeable r42 = (Closeable) r32.next();     // Catch: Throwable -> L37
        if (r42 == null) goto L29;
        r42.close();     // Catch: IOException -> L34 Throwable -> L37
    L34:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L37
    L39:
        monitor-exit(r22);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    L43:
        r1.a();
        goto L4
    L44:
        this.a.clear();
    }
}
