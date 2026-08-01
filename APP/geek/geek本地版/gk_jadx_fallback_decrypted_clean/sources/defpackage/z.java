package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static boolean a(android.view.accessibility.AccessibilityManager r1, defpackage.a0 r2) {
            b0 r0 = new b0
            r0.<init>(r2)
            boolean r1 = r1.addTouchExplorationStateChangeListener(r0)
            return r1
    }

    public static boolean b(android.view.accessibility.AccessibilityManager r1, defpackage.a0 r2) {
            b0 r0 = new b0
            r0.<init>(r2)
            boolean r1 = r1.removeTouchExplorationStateChangeListener(r0)
            return r1
    }
}
