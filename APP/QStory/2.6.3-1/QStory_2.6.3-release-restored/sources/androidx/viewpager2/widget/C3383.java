package androidx.viewpager2.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3383 extends RecyclerView {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C3382 f8037;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3383(C3382 c3382, Context context) {
        super(context, null);
        this.f8037 = c3382;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f8037.f8023.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C3382 c3382 = this.f8037;
        accessibilityEvent.setFromIndex(c3382.f8029);
        accessibilityEvent.setToIndex(c3382.f8029);
        accessibilityEvent.setSource((C3382) c3382.f8023.f1438);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8037.f8025 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f8037.f8025 && super.onTouchEvent(motionEvent);
    }
}
