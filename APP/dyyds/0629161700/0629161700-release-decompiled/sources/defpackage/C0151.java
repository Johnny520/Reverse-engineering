package defpackage;

/* JADX INFO: renamed from: ᛱᛸᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0151 extends android.graphics.drawable.RippleDrawable {
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            android.graphics.drawable.InsetDrawable r2 = (android.graphics.drawable.InsetDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            r2.setColorFilter(r3)
        L1c:
            return
    }
}
