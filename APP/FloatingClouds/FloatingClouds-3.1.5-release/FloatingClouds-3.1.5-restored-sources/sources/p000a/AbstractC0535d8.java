package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.d8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535d8 extends C0145Hg<View> {

    /* JADX INFO: renamed from: c */
    public final Rect f1925c;

    /* JADX INFO: renamed from: d */
    public final Rect f1926d;

    /* JADX INFO: renamed from: e */
    public int f1927e;

    /* JADX INFO: renamed from: f */
    public int f1928f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0535d8() {
        this.f1925c = new Rect();
        this.f1926d = new Rect();
        this.f1927e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: i */
    public final boolean mo1305i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutMo1306v;
        C0734nh lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutMo1306v = mo1306v(coordinatorLayout.m2443e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (appBarLayoutMo1306v.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m1691a() + lastWindowInsets.m1694d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iMo1308x = mo1308x(appBarLayoutMo1306v) + size;
        int measuredHeight = appBarLayoutMo1306v.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo1308x -= measuredHeight;
        }
        coordinatorLayout.m2449r(view, i, i2, View.MeasureSpec.makeMeasureSpec(iMo1308x, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // p000a.C0145Hg
    /* JADX INFO: renamed from: u */
    public final void mo374u(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutMo1306v = mo1306v(coordinatorLayout.m2443e(view));
        int iM1667j = 0;
        if (appBarLayoutMo1306v == null) {
            coordinatorLayout.m2448q(view, i);
            this.f1927e = 0;
            return;
        }
        CoordinatorLayout.C1062f c1062f = (CoordinatorLayout.C1062f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1062f).leftMargin;
        int bottom = appBarLayoutMo1306v.getBottom() + ((ViewGroup.MarginLayoutParams) c1062f).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1062f).rightMargin;
        int bottom2 = ((appBarLayoutMo1306v.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin;
        Rect rect = this.f1925c;
        rect.set(paddingLeft, bottom, width, bottom2);
        C0734nh lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.m1692b() + rect.left;
                rect.right -= lastWindowInsets.m1693c();
            }
        }
        int i2 = c1062f.f4406c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f1926d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f1928f != 0) {
            float fMo1307w = mo1307w(appBarLayoutMo1306v);
            int i3 = this.f1928f;
            iM1667j = C0726n9.m1667j((int) (fMo1307w * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iM1667j, rect2.right, rect2.bottom - iM1667j);
        this.f1927e = rect2.top - appBarLayoutMo1306v.getBottom();
    }

    /* JADX INFO: renamed from: v */
    public abstract AppBarLayout mo1306v(ArrayList arrayList);

    /* JADX INFO: renamed from: w */
    public float mo1307w(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: x */
    public int mo1308x(View view) {
        return view.getMeasuredHeight();
    }

    public AbstractC0535d8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1925c = new Rect();
        this.f1926d = new Rect();
        this.f1927e = 0;
    }
}
