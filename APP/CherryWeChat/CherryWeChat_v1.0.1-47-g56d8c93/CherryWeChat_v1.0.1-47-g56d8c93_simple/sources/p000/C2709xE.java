package p000;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: xE */
/* JADX INFO: loaded from: classes.dex */
public final class C2709xE {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9284a;

    public C2709xE() {
        this.f9284a = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m5282a() {
        Iterator r0 = this.f9284a.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L32;
        AbstractC2580uE r1 = (AbstractC2580uE) r0.next();
        r1.f8940c = true;
        HashMap r2 = r1.f8938a;
        if (r2 == null) goto L18;
        monitor-enter(r2);
        Iterator r3 = r1.f8938a.values().iterator();     // Catch: Throwable -> L12
    L9:
        if (r3.hasNext() == false) goto L14;
        AbstractC2580uE.m5082a(r3.next());     // Catch: Throwable -> L12
        goto L9
    L14:
        monitor-exit(r2);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    L18:
        LinkedHashSet r22 = r1.f8939b;
        if (r22 == null) goto L31;
        monitor-enter(r22);
        Iterator r32 = r1.f8939b.iterator();     // Catch: Throwable -> L25
    L22:
        if (r32.hasNext() == false) goto L27;
        AbstractC2580uE.m5082a((Closeable) r32.next());     // Catch: Throwable -> L25
        goto L22
    L27:
        monitor-exit(r22);     // Catch: Throwable -> L25
        r1.f8939b.clear();
    L25:
        th = move-exception;
        throw th;
    L31:
        r1.mo297b();
        goto L4
    L32:
        this.f9284a.clear();
    }
}
