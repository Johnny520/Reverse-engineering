package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Ul */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0887Ul {

    /* JADX INFO: renamed from: b */
    public static final InterpolatorC0844Tl f2773b = new InterpolatorC0844Tl(0);

    /* JADX INFO: renamed from: c */
    public static final InterpolatorC0844Tl f2774c = new InterpolatorC0844Tl(1);

    /* JADX INFO: renamed from: a */
    public int f2775a;

    public AbstractC0887Ul(int i) {
        this.f2775a = i;
    }

    /* JADX INFO: renamed from: b */
    public static int m1733b(int i, int i2) {
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

    /* JADX INFO: renamed from: c */
    public static int m1734c(int i, int i2) {
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

    /* JADX INFO: renamed from: k */
    public static void m1735k(RecyclerView recyclerView, AbstractC1166o abstractC1166o, float f, float f2, boolean z) {
        View view = abstractC1166o.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            Float fValueOf = Float.valueOf(AbstractC1360eE.m2633e(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                    float fM2633e = AbstractC1360eE.m2633e(childAt);
                    if (fM2633e > f3) {
                        f3 = fM2633e;
                    }
                }
            }
            AbstractC1360eE.m2639k(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: a */
    public void mo1531a(RecyclerView recyclerView, AbstractC1166o abstractC1166o) {
        View view = abstractC1166o.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            AbstractC1360eE.m2639k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo1532d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1736e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1737f();

    /* JADX INFO: renamed from: g */
    public abstract int mo1738g();

    /* JADX INFO: renamed from: h */
    public abstract int mo1739h();

    /* JADX INFO: renamed from: i */
    public abstract int mo1740i();

    /* JADX INFO: renamed from: j */
    public int m1741j(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f2775a == -1) {
            this.f2775a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f2773b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f2774c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f2775a)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1533l(AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2);

    /* JADX INFO: renamed from: m */
    public abstract void mo1534m(AbstractC1166o abstractC1166o, int i);

    /* JADX INFO: renamed from: n */
    public abstract void mo1535n();
}
