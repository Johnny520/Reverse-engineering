package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: Tg */
/* JADX INFO: loaded from: classes.dex */
public final class C0839Tg {

    /* JADX INFO: renamed from: b */
    public static volatile C0839Tg f2666b;

    /* JADX INFO: renamed from: c */
    public static final C0839Tg f2667c = new C0839Tg();

    /* JADX INFO: renamed from: a */
    public final Map f2668a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a */
    public static C0839Tg m1660a() {
        C0839Tg c0839Tg;
        C0839Tg c0839Tg2 = f2666b;
        if (c0839Tg2 != null) {
            return c0839Tg2;
        }
        synchronized (C0839Tg.class) {
            try {
                c0839Tg = f2666b;
                if (c0839Tg == null) {
                    Class cls = AbstractC0796Sg.f2497a;
                    C0839Tg c0839Tg3 = null;
                    if (cls != null) {
                        try {
                            c0839Tg3 = (C0839Tg) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0839Tg = c0839Tg3 != null ? c0839Tg3 : f2667c;
                    f2666b = c0839Tg;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0839Tg;
    }
}
