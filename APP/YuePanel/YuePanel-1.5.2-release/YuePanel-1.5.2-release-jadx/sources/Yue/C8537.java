package Yue;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8537 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥ */
    public int f3544;

    /* JADX INFO: renamed from: ۥ۟ */
    public Drawable.ConstantState f3545;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ColorStateList f25365;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public PorterDuff.Mode f25366;

    public C8537(@InterfaceC6490 C8537 c8537) {
        this.f25365 = null;
        this.f25366 = C8535.f25356;
        if (c8537 != null) {
            this.f3544 = c8537.f3544;
            this.f3545 = c8537.f3545;
            this.f25365 = c8537.f25365;
            this.f25366 = c8537.f25366;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f3544;
        Drawable.ConstantState constantState = this.f3545;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    @InterfaceC6391
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4523() {
        return this.f3545 != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    @InterfaceC6391
    public Drawable newDrawable(@InterfaceC6490 Resources resources) {
        return new C8536(this, resources);
    }
}
