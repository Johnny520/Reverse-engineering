package p000a;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.C0518ca;

/* JADX INFO: renamed from: a.x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915x8 {

    /* JADX INFO: renamed from: a */
    public static final C0915x8 f3530a = new C0915x8();

    /* JADX INFO: renamed from: b */
    public static volatile C0518ca.b f3531b = C0518ca.b.f1897a;

    /* JADX INFO: renamed from: a */
    public static boolean m2203a() {
        return f3531b != C0518ca.b.f1897a;
    }

    /* JADX INFO: renamed from: b */
    public final void m2204b(C0518ca.c cVar) {
        C0518ca.b bVar = C0518ca.b.f1897a;
        synchronized (this) {
            C0518ca.b bVar2 = f3531b;
            if (bVar2 == bVar) {
                return;
            }
            f3531b = bVar;
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideStateCtrl: force: " + bVar2 + " -> " + bVar + " (source=" + cVar + ")"}, 1));
            CopyOnWriteArrayList<C0518ca.d> copyOnWriteArrayList = C0518ca.f1891a;
            C0518ca.m1279a(new C0518ca.a.C1335a(bVar, bVar2, cVar));
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m2205c(C0518ca.b bVar, C0518ca.c cVar, Set<? extends C0518ca.b> set) {
        if (!set.contains(f3531b)) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideStateCtrl: transition BLOCKED: " + f3531b + " -> " + bVar + " (source=" + cVar + ", allowed=" + set + ")"}, 1));
            return false;
        }
        C0518ca.b bVar2 = f3531b;
        f3531b = bVar;
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideStateCtrl: transition: " + bVar2 + " -> " + bVar + " (source=" + cVar + ")"}, 1));
        CopyOnWriteArrayList<C0518ca.d> copyOnWriteArrayList = C0518ca.f1891a;
        C0518ca.m1279a(new C0518ca.a.C1335a(bVar, bVar2, cVar));
        return true;
    }

    public final String toString() {
        return "HideStateController(state=" + f3531b + ")";
    }
}
