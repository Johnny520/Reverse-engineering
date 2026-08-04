package yyds;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroupOverlay;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.app.CustomRecyclerView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛶᲀᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1402 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public float f6618;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f6619;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f6620;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final View f6621;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1809 f6622;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f6623;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final RunnableC1272 f6624;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f6625;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f6626;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f6627;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public float f6628;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f6629;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final Rect f6630;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0580 f6631;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f6632;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final View f6633;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f6634;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final CustomRecyclerView f6635;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public float f6636;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f6637;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0119 f6638;

    public C1402(CustomRecyclerView customRecyclerView, C0119 c0119, Drawable drawable, Drawable drawable2, InterfaceC1886 interfaceC1886, C1809 c1809) {
        C1213 c1213 = (C1213) c0119.f812;
        this.f6624 = new RunnableC1272(this, 0);
        this.f6630 = new Rect();
        this.f6623 = customRecyclerView.getResources().getDimensionPixelSize(R.dimen.afs_min_touch_target_size);
        Context context = customRecyclerView.getContext();
        this.f6627 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6635 = customRecyclerView;
        this.f6638 = c0119;
        this.f6622 = c1809;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth < 0) {
            C0188.m798("trackDrawable.getIntrinsicWidth() < 0");
            throw null;
        }
        this.f6637 = intrinsicWidth;
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        if (intrinsicWidth2 < 0) {
            C0188.m798("thumbDrawable.getIntrinsicWidth() < 0");
            throw null;
        }
        this.f6629 = intrinsicWidth2;
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight < 0) {
            C0188.m798("thumbDrawable.getIntrinsicHeight() < 0");
            throw null;
        }
        this.f6619 = intrinsicHeight;
        View view = new View(context);
        this.f6621 = view;
        view.setBackground(drawable);
        View view2 = new View(context);
        this.f6633 = view2;
        view2.setBackground(drawable2);
        C0580 c0580 = new C0580(context, null);
        this.f6631 = c0580;
        c0580.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        interfaceC1886.accept(c0580);
        ViewGroupOverlay overlay = customRecyclerView.getOverlay();
        overlay.add(view);
        overlay.add(view2);
        overlay.add(c0580);
        m2849();
        c0580.setAlpha(0.0f);
        c1213.m2421(new C0464(new RunnableC1272(this, 1)));
        c1213.m2426(new C0478(1, new RunnableC1272(this, 2)));
        c1213.f5572.add(new C1996(new C1908(3, this)));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m2842(boolean z) {
        if (this.f6634 == z) {
            return;
        }
        this.f6634 = z;
        CustomRecyclerView customRecyclerView = this.f6635;
        if (z) {
            customRecyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z2 = this.f6634;
        View view = this.f6621;
        view.setPressed(z2);
        boolean z3 = this.f6634;
        View view2 = this.f6633;
        view2.setPressed(z3);
        boolean z4 = this.f6634;
        C0580 c0580 = this.f6631;
        C1809 c1809 = this.f6622;
        if (!z4) {
            m2849();
            if (c1809.f9118) {
                c1809.f9118 = false;
                c0580.animate().alpha(0.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        customRecyclerView.removeCallbacks(this.f6624);
        c1809.m3585(view, view2);
        if (c1809.f9118) {
            return;
        }
        c1809.f9118 = true;
        c0580.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2843() {
        int iM4603;
        LinearLayoutManager linearLayoutManagerM547;
        int iM2846 = m2846();
        int paddingTop = 0;
        boolean z = iM2846 > 0;
        this.f6632 = z;
        if (z) {
            Rect rectM2845 = m2845();
            long height = ((this.f6635.getHeight() - rectM2845.top) - rectM2845.bottom) - this.f6619;
            C0119 c0119 = this.f6638;
            C1213 c1213 = (C1213) c0119.f812;
            int i = -1;
            if (c1213.getChildCount() == 0) {
                iM4603 = -1;
                linearLayoutManagerM547 = c0119.m547();
                if (linearLayoutManagerM547 != null) {
                    iM4603 = -1;
                } else if (linearLayoutManagerM547 instanceof GridLayoutManager) {
                    iM4603 /= ((GridLayoutManager) linearLayoutManagerM547).f327;
                }
                if (iM4603 != -1) {
                    int iM566 = c0119.m566();
                    Rect rect = (Rect) c0119.f810;
                    if (c1213.getChildCount() != 0) {
                        C1213.m2414(rect, c1213.getChildAt(0));
                        i = rect.top;
                    }
                    paddingTop = ((iM4603 * iM566) + c1213.getPaddingTop()) - i;
                }
                paddingTop = (int) ((height * ((long) paddingTop)) / ((long) iM2846));
            } else {
                View childAt = c1213.getChildAt(0);
                if (c0119.m547() != null) {
                    iM4603 = AbstractC2551.m4603(childAt);
                }
                linearLayoutManagerM547 = c0119.m547();
                if (linearLayoutManagerM547 != null) {
                }
                if (iM4603 != -1) {
                }
                paddingTop = (int) ((height * ((long) paddingTop)) / ((long) iM2846));
            }
        }
        this.f6620 = paddingTop;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2844(View view, int i, int i2, int i3, int i4) {
        CustomRecyclerView customRecyclerView = this.f6635;
        int scrollX = customRecyclerView.getScrollX();
        int scrollY = customRecyclerView.getScrollY();
        view.layout(i + scrollX, i2 + scrollY, scrollX + i3, scrollY + i4);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Rect m2845() {
        CustomRecyclerView customRecyclerView = this.f6635;
        int paddingLeft = customRecyclerView.getPaddingLeft();
        int paddingTop = customRecyclerView.getPaddingTop();
        int paddingRight = customRecyclerView.getPaddingRight();
        int paddingBottom = customRecyclerView.getPaddingBottom();
        Rect rect = this.f6630;
        rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return rect;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m2846() {
        int iM4618;
        int iM566;
        C0119 c0119 = this.f6638;
        C1213 c1213 = (C1213) c0119.f812;
        LinearLayoutManager linearLayoutManagerM547 = c0119.m547();
        int paddingBottom = 0;
        if (linearLayoutManagerM547 == null || (iM4618 = linearLayoutManagerM547.m4618()) == 0) {
            iM4618 = 0;
        } else if (linearLayoutManagerM547 instanceof GridLayoutManager) {
            iM4618 = ((iM4618 - 1) / ((GridLayoutManager) linearLayoutManagerM547).f327) + 1;
        }
        if (iM4618 != 0 && (iM566 = c0119.m566()) != 0) {
            paddingBottom = c1213.getPaddingBottom() + (iM4618 * iM566) + c1213.getPaddingTop();
        }
        return paddingBottom - this.f6635.getHeight();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2847(int i) {
        Rect rectM2845 = m2845();
        int height = ((this.f6635.getHeight() - rectM2845.top) - rectM2845.bottom) - this.f6619;
        if (i < 0) {
            i = 0;
        } else if (i > height) {
            i = height;
        }
        int iM2846 = (int) ((((long) m2846()) * ((long) i)) / ((long) height));
        C0119 c0119 = this.f6638;
        C1213 c1213 = (C1213) c0119.f812;
        c1213.m2418();
        int paddingTop = iM2846 - c1213.getPaddingTop();
        int iM566 = c0119.m566();
        int iMax = Math.max(0, paddingTop / iM566);
        int i2 = (iM566 * iMax) - paddingTop;
        LinearLayoutManager linearLayoutManagerM547 = c0119.m547();
        if (linearLayoutManagerM547 == null) {
            return;
        }
        if (linearLayoutManagerM547 instanceof GridLayoutManager) {
            iMax *= ((GridLayoutManager) linearLayoutManagerM547).f327;
        }
        linearLayoutManagerM547.m197(iMax, i2 - c1213.getPaddingTop());
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m2848(float f, int i, int i2, int i3) {
        int i4 = i2 - i;
        int i5 = this.f6623;
        if (i4 < i5) {
            int i6 = i - ((i5 - i4) / 2);
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i6 + i5;
            if (i7 > i3) {
                i6 = i3 - i5;
                if (i6 < 0) {
                    i6 = 0;
                }
            } else {
                i3 = i7;
            }
            if (f >= i6 && f < i3) {
                return true;
            }
        } else if (f >= i && f < i2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m2849() {
        CustomRecyclerView customRecyclerView = this.f6635;
        RunnableC1272 runnableC1272 = this.f6624;
        customRecyclerView.removeCallbacks(runnableC1272);
        this.f6622.getClass();
        customRecyclerView.postDelayed(runnableC1272, 1500L);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m2850(View view, float f, float f2) {
        CustomRecyclerView customRecyclerView = this.f6635;
        int scrollX = customRecyclerView.getScrollX();
        int scrollY = customRecyclerView.getScrollY();
        return m2848(f, view.getLeft() - scrollX, view.getRight() - scrollX, customRecyclerView.getWidth()) && m2848(f2, view.getTop() - scrollY, view.getBottom() - scrollY, customRecyclerView.getHeight());
    }
}
