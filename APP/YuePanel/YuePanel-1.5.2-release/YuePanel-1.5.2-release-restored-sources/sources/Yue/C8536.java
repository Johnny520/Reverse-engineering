package Yue;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C8536 extends C8535 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f25363 = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static Method f25364;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8536(Drawable drawable) {
        super(drawable);
        m28407();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public Rect getDirtyBounds() {
        return this.f25362.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@InterfaceC6391 Outline outline) {
        this.f25362.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f25362;
        if (drawable == null || (method = f25364) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            Log.w(f25363, "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f25362.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f25362.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // Yue.C8535, android.graphics.drawable.Drawable
    public boolean setState(@InterfaceC6391 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // Yue.C8535, android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTint(int i) {
        if (mo28403()) {
            super.setTint(i);
        } else {
            this.f25362.setTint(i);
        }
    }

    @Override // Yue.C8535, android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(ColorStateList colorStateList) {
        if (mo28403()) {
            super.setTintList(colorStateList);
        } else {
            this.f25362.setTintList(colorStateList);
        }
    }

    @Override // Yue.C8535, android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        if (mo28403()) {
            super.setTintMode(mode);
        } else {
            this.f25362.setTintMode(mode);
        }
    }

    @Override // Yue.C8535
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo28403() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28407() {
        if (f25364 == null) {
            try {
                f25364 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w(f25363, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public C8536(C8537 c8537, Resources resources) {
        super(c8537, resources);
        m28407();
    }
}
