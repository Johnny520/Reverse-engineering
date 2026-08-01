package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.activity.AbstractC0900;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C6385;
import p175.AbstractC8463;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m151d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lkotlin/飘花落叶言子楪兰苏哲世;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "F", "getFragment", "()Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment_release"}, m152k = 1, m153mv = {1, 8, 0}, m155xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7067;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f7068;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View.OnApplyWindowInsetsListener f7069;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC3146 abstractC3146) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f7070 = new ArrayList();
        this.f7068 = new ArrayList();
        this.f7067 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8463.f21067, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4936 = abstractC3146.m4936(id);
        if (classAttribute != null && abstractComponentCallbacksC3171M4936 == null) {
            if (id == -1) {
                C6755.m11870(AbstractC0900.m718("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            C3157 c3157M4943 = abstractC3146.m4943();
            context.getClassLoader();
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4983 = c3157M4943.m4983(classAttribute);
            abstractComponentCallbacksC3171M4983.getClass();
            abstractComponentCallbacksC3171M4983.f7224 = true;
            C3152 c3152 = abstractComponentCallbacksC3171M4983.f7242;
            if ((c3152 == null ? null : c3152.f7162) != null) {
                abstractComponentCallbacksC3171M4983.f7224 = true;
            }
            C3165 c3165 = new C3165(abstractC3146);
            c3165.f7199 = true;
            abstractComponentCallbacksC3171M4983.f7227 = this;
            c3165.m4987(getId(), abstractComponentCallbacksC3171M4983, string, 1);
            if (c3165.f7201) {
                C6755.m11870("This transaction is already being added to the back stack");
                throw null;
            }
            c3165.f7200 = false;
            c3165.f7196.m4938(c3165, true);
        }
        for (C3137 c3137 : abstractC3146.f7129.m1525()) {
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3137.f7099;
            if (abstractComponentCallbacksC3171.f7230 == getId() && (view = abstractComponentCallbacksC3171.f7226) != null && view.getParent() == null) {
                abstractComponentCallbacksC3171.f7227 = this;
                c3137.m4895();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(C0328R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC3171 ? (AbstractComponentCallbacksC3171) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            C6755.m11862(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C3058 c3058M4810;
        windowInsets.getClass();
        C3058 c3058M4623 = C3058.m4623(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f7069;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            c3058M4810 = C3058.m4623(null, windowInsetsOnApplyWindowInsets);
        } else {
            c3058M4810 = AbstractC3103.m4810(this, c3058M4623);
        }
        if (!c3058M4810.f6866.mo4579()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC3103.m4796(getChildAt(i), c3058M4810);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f7067) {
            Iterator it = this.f7070.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f7067) {
            ArrayList arrayList = this.f7070;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f7068.remove(view);
        if (this.f7070.remove(view)) {
            this.f7067 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC3171> F getFragment() {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171;
        FragmentActivity fragmentActivity;
        AbstractC3146 supportFragmentManager;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC3171 = null;
                break;
            }
            Object tag = view.getTag(C0328R.id.fragment_container_view_tag);
            abstractComponentCallbacksC3171 = tag instanceof AbstractComponentCallbacksC3171 ? (AbstractComponentCallbacksC3171) tag : null;
            if (abstractComponentCallbacksC3171 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC3171 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                C6385.m11442(this, "View ", " is not within a subclass of FragmentActivity.");
                return null;
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC3171.m5020()) {
                C3141.m4913("The Fragment ", abstractComponentCallbacksC3171, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            supportFragmentManager = abstractComponentCallbacksC3171.m5002();
        }
        return (F) supportFragmentManager.m4936(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                m4890(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m4890(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m4890(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m4890(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m4890(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m4890(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f7067 = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        listener.getClass();
        this.f7069 = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f7068.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4890(View view) {
        if (this.f7068.contains(view)) {
            this.f7070.add(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.f7070 = new ArrayList();
        this.f7068 = new ArrayList();
        this.f7067 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8463.f21067, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
