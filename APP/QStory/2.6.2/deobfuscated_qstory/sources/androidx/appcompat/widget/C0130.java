package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0130 f570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final PorterDuff.Mode f571 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0171 f572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m536(Drawable drawable, C0140 c0140, int[] iArr) {
        PorterDuff.Mode mode = C0171.f679;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0140.f601;
        if (!z && !c0140.f602) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM629 = null;
        ColorStateList colorStateList = z ? (ColorStateList) c0140.f600 : null;
        PorterDuff.Mode mode2 = c0140.f602 ? (PorterDuff.Mode) c0140.f599 : C0171.f679;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM629 = C0171.m629(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM629);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static synchronized void m537() {
        if (f570 == null) {
            C0130 c0130 = new C0130();
            f570 = c0130;
            c0130.f572 = C0171.m630();
            C0171 c0171 = f570.f572;
            C0131 c0131 = new C0131(0);
            synchronized (c0171) {
                c0171.f682 = c0131;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m538(int i, PorterDuff.Mode mode) {
        return C0171.m629(i, mode);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static synchronized C0130 m539() {
        try {
            if (f570 == null) {
                m537();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f570;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Drawable m540(Context context, int i) {
        return this.f572.m633(context, i);
    }
}
