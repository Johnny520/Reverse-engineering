package androidx.core.graphics;

/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0086\b¨\u0006\u0007"}, m115d2 = {"toColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/graphics/PorterDuff$Mode;", "color", "", "toXfermode", "Landroid/graphics/PorterDuffXfermode;", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class PorterDuffKt {
    public static final android.graphics.PorterDuffColorFilter toColorFilter(android.graphics.PorterDuff.Mode r2, int r3) {
            r0 = 0
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r3, r2)
            return r1
    }

    public static final android.graphics.PorterDuffXfermode toXfermode(android.graphics.PorterDuff.Mode r2) {
            r0 = 0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            r1.<init>(r2)
            return r1
    }
}
