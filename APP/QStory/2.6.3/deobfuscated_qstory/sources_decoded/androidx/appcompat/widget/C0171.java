package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.collection.C0282;
import com.davemorrissey.labs.subscaleview.R;
import java.util.WeakHashMap;
import p129.C7495;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0171 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final PorterDuff.Mode f679 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0172 f680 = new C0172(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0171 f681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0131 f682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public TypedValue f684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WeakHashMap f685 = new WeakHashMap(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public WeakHashMap f686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m630(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0172 c0172 = f680;
        c0172.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0172.m832(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static synchronized C0171 m631() {
        try {
            if (f681 == null) {
                f681 = new C0171();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f681;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized ColorStateList m632(Context context, int i) {
        ColorStateList colorStateList;
        C0282 c0282;
        WeakHashMap weakHashMap = this.f686;
        ColorStateList colorStateListM551 = null;
        colorStateList = (weakHashMap == null || (c0282 = (C0282) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0282.m859(i);
        if (colorStateList == null) {
            C0131 c0131 = this.f682;
            if (c0131 != null) {
                colorStateListM551 = c0131.m551(context, i);
            }
            if (colorStateListM551 != null) {
                if (this.f686 == null) {
                    this.f686 = new WeakHashMap();
                }
                C0282 c02822 = (C0282) this.f686.get(context);
                if (c02822 == null) {
                    c02822 = new C0282(0);
                    this.f686.put(context, c02822);
                }
                c02822.m861(i, colorStateListM551);
            }
            colorStateList = colorStateListM551;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized Drawable m633(Context context, int i, boolean z) {
        Drawable drawableM635;
        try {
            if (!this.f683) {
                this.f683 = true;
                Drawable drawableM634 = m634(context, R.drawable.abc_vector_test);
                if (drawableM634 == null || (!(drawableM634 instanceof C7495) && !"android.graphics.drawable.VectorDrawable".equals(drawableM634.getClass().getName()))) {
                    this.f683 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM635 = m635(context, i);
            if (drawableM635 == null) {
                drawableM635 = context.getDrawable(i);
            }
            if (drawableM635 != null) {
                drawableM635 = m636(context, i, z, drawableM635);
            }
            if (drawableM635 != null) {
                AbstractC0216.m723(drawableM635);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM635;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized Drawable m634(Context context, int i) {
        return m633(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m635(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0171.m635(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m636(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0171.m636(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
