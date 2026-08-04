package yyds;

import android.view.View;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲇᛵᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2450 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final InterpolatorC2694 f12057 = new InterpolatorC2694(0);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final InterpolatorC2694 f12058 = new InterpolatorC2694(1);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f12059 = -1;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m4490(C1213 c1213, AbstractC0185 abstractC0185, float f, float f2, boolean z) {
        View view = abstractC0185.f1093;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = c1213.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = c1213.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = AbstractC1640.f8352;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m4491(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m4492(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public abstract void mo1231();

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo1232(C1213 c1213, AbstractC0185 abstractC0185) {
        View view = abstractC0185.f1093;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public void mo1233(AbstractC0185 abstractC0185, int i) {
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract boolean mo1234(C1213 c1213, AbstractC0185 abstractC0185, AbstractC0185 abstractC01852);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m4493(C1213 c1213, int i, int i2, long j) {
        int dimensionPixelSize = this.f12059;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = c1213.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.f12059 = dimensionPixelSize;
        }
        int interpolation = (int) (f12057.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f12058.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }
}
