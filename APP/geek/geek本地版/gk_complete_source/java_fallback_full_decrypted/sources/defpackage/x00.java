package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x00 {
    public static android.graphics.drawable.Drawable a(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable b(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
            return r0
    }
}
