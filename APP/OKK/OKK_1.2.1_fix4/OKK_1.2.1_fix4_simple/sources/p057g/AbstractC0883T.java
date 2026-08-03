package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.drawable.ColorStateListDrawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: g.T */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0883T {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m2211a(Insets r02) {
        return r02.top;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ColorStateList m2212b(ColorStateListDrawable r02) {
        return r02.getColorStateList();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m2213c(Object r02) {
        return (ColorStateListDrawable) r02;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m2214d(CoordinatorLayout r7, Context r8, int[] r9, AttributeSet r10, TypedArray r11) {
        r7.saveAttributeDataForStyleable(r8, r9, r10, r11, C1031R.attr.coordinatorLayoutStyle, 0);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ boolean m2215e(Object r02) {
        return r02 instanceof ColorStateListDrawable;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ int m2216f(Insets r02) {
        return r02.right;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ int m2217g(Insets r02) {
        return r02.bottom;
    }
}
