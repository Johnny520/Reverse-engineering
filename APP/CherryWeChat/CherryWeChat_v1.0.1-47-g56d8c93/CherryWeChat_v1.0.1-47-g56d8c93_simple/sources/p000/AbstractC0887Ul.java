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
    public static final InterpolatorC0844Tl f2773b = null;

    /* JADX INFO: renamed from: c */
    public static final InterpolatorC0844Tl f2774c = null;

    /* JADX INFO: renamed from: a */
    public int f2775a;

    static {
        f2773b = new InterpolatorC0844Tl(0);
        f2774c = new InterpolatorC0844Tl(1);
    }

    public AbstractC0887Ul(int r1) {
        this.f2775a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static int m1733b(int r3, int r4) {
        int r1 = r3 & 3158064;
        if (r1 != 0) goto L5;
        return r3;
    L5:
        int r32 = r3 & (~r1);
        if (r4 != 0) goto L10;
        int r42 = r1 >> 2;
    L9:
        return r32 | r42;
    L10:
        int r43 = r1 >> 1;
        r32 = r32 | ((-3158065) & r43);
        r42 = (r43 & 3158064) >> 2;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public static int m1734c(int r3, int r4) {
        int r1 = r3 & 789516;
        if (r1 != 0) goto L5;
        return r3;
    L5:
        int r32 = r3 & (~r1);
        if (r4 != 0) goto L10;
        int r42 = r1 << 2;
    L9:
        return r32 | r42;
    L10:
        int r43 = r1 << 1;
        r32 = r32 | ((-789517) & r43);
        r42 = (r43 & 789516) << 2;
        goto L9
    }

    /* JADX INFO: renamed from: k */
    public static void m1735k(RecyclerView r6, AbstractC1166o r7, float r8, float r9, boolean r10) {
        View r72 = r7.itemView;
        if (r10 == true) goto L5;
    L16:
        r72.setTranslationX(r8);
        r72.setTranslationY(r9);
        return;
    L5:
        if (r72.getTag(R.id.item_touch_helper_previous_elevation) != null) goto L16;
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        Float r02 = Float.valueOf(AbstractC1360eE.m2633e(r72));
        int r1 = r6.getChildCount();
        float r2 = 0.0f;
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L15;
        View r4 = r6.getChildAt(r3);
        if (r4 == r72) goto L14;
        WeakHashMap r5 = AbstractC2185lE.f7617a;
        float r42 = AbstractC1360eE.m2633e(r4);
        if (r42 <= r2) goto L14;
        r2 = r42;
    L14:
        r3 = r3 + 1;
        goto L7
    L15:
        AbstractC1360eE.m2639k(r72, r2 + 1.0f);
        r72.setTag(R.id.item_touch_helper_previous_elevation, r02);
        goto L16
    }

    /* JADX INFO: renamed from: a */
    public void mo1531a(RecyclerView r3, AbstractC1166o r4) {
        View r32 = r4.itemView;
        Object r0 = r32.getTag(R.id.item_touch_helper_previous_elevation);
        if ((r0 instanceof Float) == false) goto L5;
        float r02 = ((Float) r0).floatValue();
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2639k(r32, r02);
    L5:
        r32.setTag(R.id.item_touch_helper_previous_elevation, null);
        r32.setTranslationX(0.0f);
        r32.setTranslationY(0.0f);
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
    public int m1741j(RecyclerView r7, int r8, int r9, long r10) {
        if (this.f2775a != (-1)) goto L5;
        this.f2775a = r7.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
    L5:
        int r72 = this.f2775a;
        int r0 = Math.abs(r9);
        int r2 = (int) Math.signum(r9);
        float r3 = 1.0f;
        int r73 = (int) (f2774c.getInterpolation(Math.min(1.0f, (r0 * 1.0f) / r8)) * (r2 * r72));
        if (r10 > 2000) goto L9;
        r3 = r10 / 2000.0f;
    L9:
        int r74 = (int) (f2773b.getInterpolation(r3) * r73);
        if (r74 != 0) goto L15;
        if (r9 <= 0) goto L14;
        return 1;
    L14:
        return -1;
    L15:
        return r74;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1533l(AbstractC1166o r1, AbstractC1166o r2);

    /* JADX INFO: renamed from: m */
    public abstract void mo1534m(AbstractC1166o r1, int r2);

    /* JADX INFO: renamed from: n */
    public abstract void mo1535n();
}
