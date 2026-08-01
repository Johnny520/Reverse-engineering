package androidx.viewpager2.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2550 extends RecyclerView {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C2549 f7692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2550(C2549 c2549, Context context) {
        super(context, null);
        this.f7692 = c2549;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f7692.f7678.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C2549 c2549 = this.f7692;
        accessibilityEvent.setFromIndex(c2549.f7684);
        accessibilityEvent.setToIndex(c2549.f7684);
        accessibilityEvent.setSource((C2549) c2549.f7678.f1093);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7692.f7680 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7692.f7680 && super.onTouchEvent(motionEvent);
    }
}
