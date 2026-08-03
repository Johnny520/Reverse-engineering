package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: Tg */
/* JADX INFO: loaded from: classes.dex */
public final class C0839Tg {

    /* JADX INFO: renamed from: b */
    public static volatile C0839Tg f2666b;

    /* JADX INFO: renamed from: c */
    public static final C0839Tg f2667c = null;

    /* JADX INFO: renamed from: a */
    public final Map f2668a;

    static {
        f2667c = new C0839Tg();
    }

    public C0839Tg() {
        this.f2668a = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: a */
    public static C0839Tg m1660a() {
        C0839Tg r0 = f2666b;
        if (r0 == null) goto L5;
        return r0;
    L5:
        monitor-enter(C0839Tg.class);
        C0839Tg r02 = f2666b;     // Catch: Throwable -> L18
        if (r02 != null) goto L20;
        Class r2 = AbstractC0796Sg.f2497a;     // Catch: Throwable -> L18
        C0839Tg r3 = null;
        if (r2 != null) goto L26;
    L14:
        if (r3 == null) goto L16;
        r02 = r3;
    L17:
        f2666b = r02;     // Catch: Throwable -> L18
        goto L20
    L16:
        r02 = f2667c;     // Catch: Throwable -> L18
        goto L17
    L26:
        r3 = (C0839Tg) r2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);     // Catch: Exception -> L25 Throwable -> L18
    L20:
        monitor-exit(C0839Tg.class);     // Catch: Throwable -> L18
        return r02;
    L18:
        th = move-exception;
        throw th;
    }
}
