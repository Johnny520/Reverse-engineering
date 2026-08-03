package a;

/* JADX INFO: loaded from: classes.dex */
public final class F3 {
    public static android.content.res.ColorStateList a(android.widget.CompoundButton r0) {
            android.content.res.ColorStateList r0 = r0.getButtonTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode b(android.widget.CompoundButton r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getButtonTintMode()
            return r0
    }

    public static void c(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
            r0.setButtonTintList(r1)
            return
    }

    public static void d(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
            r0.setButtonTintMode(r1)
            return
    }
}
