package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l60 {
    public static int a(android.widget.TextView r0) {
            int r0 = r0.getBreakStrategy()
            return r0
    }

    public static android.content.res.ColorStateList b(android.widget.TextView r0) {
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode c(android.widget.TextView r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    public static int d(android.widget.TextView r0) {
            int r0 = r0.getHyphenationFrequency()
            return r0
    }

    public static void e(android.widget.TextView r0, int r1) {
            r0.setBreakStrategy(r1)
            return
    }

    public static void f(android.widget.TextView r0, android.content.res.ColorStateList r1) {
            r0.setCompoundDrawableTintList(r1)
            return
    }

    public static void g(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
            r0.setCompoundDrawableTintMode(r1)
            return
    }

    public static void h(android.widget.TextView r0, int r1) {
            r0.setHyphenationFrequency(r1)
            return
    }
}
