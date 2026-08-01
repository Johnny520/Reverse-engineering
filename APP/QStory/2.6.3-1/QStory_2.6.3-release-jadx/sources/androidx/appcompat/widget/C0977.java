package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0977 f915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final PorterDuff.Mode f916 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1018 f917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m1097(Drawable drawable, C0987 c0987, int[] iArr) {
        PorterDuff.Mode mode = C1018.f1024;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0987.f946;
        if (!z && !c0987.f947) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM1190 = null;
        ColorStateList colorStateList = z ? (ColorStateList) c0987.f945 : null;
        PorterDuff.Mode mode2 = c0987.f947 ? (PorterDuff.Mode) c0987.f944 : C1018.f1024;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM1190 = C1018.m1190(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM1190);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static synchronized void m1098() {
        if (f915 == null) {
            C0977 c0977 = new C0977();
            f915 = c0977;
            c0977.f917 = C1018.m1191();
            C1018 c1018 = f915.f917;
            C0978 c0978 = new C0978(0);
            synchronized (c1018) {
                c1018.f1027 = c0978;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m1099(int i, PorterDuff.Mode mode) {
        return C1018.m1190(i, mode);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static synchronized C0977 m1100() {
        try {
            if (f915 == null) {
                m1098();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f915;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Drawable m1101(Context context, int i) {
        return this.f917.m1194(context, i);
    }
}
