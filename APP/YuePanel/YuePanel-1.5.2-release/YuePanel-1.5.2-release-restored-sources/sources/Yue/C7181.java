package Yue;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C7181 extends AbstractC7182 {
    public C7181(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@InterfaceC6391 Outline outline) {
        m22501();
        outline.setRoundRect(this.f21670, m22488());
    }

    @Override // Yue.AbstractC7182
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo22484(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // Yue.AbstractC7182
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo22485() {
        Bitmap bitmap = this.f2719;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // Yue.AbstractC7182
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo22486(boolean z) {
        Bitmap bitmap = this.f2719;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
