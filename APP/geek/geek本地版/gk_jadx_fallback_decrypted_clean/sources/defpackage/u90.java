package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u90 {
    public static android.graphics.Rect a(android.view.View r0) {
            android.graphics.Rect r0 = r0.getClipBounds()
            return r0
    }

    public static boolean b(android.view.View r0) {
            boolean r0 = r0.isInLayout()
            return r0
    }

    public static void c(android.view.View r0, android.graphics.Rect r1) {
            r0.setClipBounds(r1)
            return
    }
}
