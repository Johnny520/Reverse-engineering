package a;

/* JADX INFO: loaded from: classes.dex */
public final class S8 {
    public static android.content.res.ColorStateList a(android.widget.ImageView r0) {
            android.content.res.ColorStateList r0 = r0.getImageTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode b(android.widget.ImageView r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getImageTintMode()
            return r0
    }

    public static void c(android.widget.ImageView r0, android.content.res.ColorStateList r1) {
            r0.setImageTintList(r1)
            return
    }

    public static void d(android.widget.ImageView r0, android.graphics.PorterDuff.Mode r1) {
            r0.setImageTintMode(r1)
            return
    }
}
