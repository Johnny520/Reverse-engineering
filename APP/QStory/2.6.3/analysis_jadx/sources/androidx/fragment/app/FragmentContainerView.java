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
import androidx.activity.AbstractC0053;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C5554;
import p159.AbstractC7634;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lkotlin/飘花落叶言子楪兰苏哲世;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "F", "getFragment", "()Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f6722;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View.OnApplyWindowInsetsListener f6724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6725;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC2313 abstractC2313) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f6725 = new ArrayList();
        this.f6723 = new ArrayList();
        this.f6722 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7634.f20722, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4376 = abstractC2313.m4376(id);
        if (classAttribute != null && abstractComponentCallbacksC2338M4376 == null) {
            if (id == -1) {
                C5925.m11311(AbstractC0053.m158("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            C2324 c2324M4383 = abstractC2313.m4383();
            context.getClassLoader();
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338M4423 = c2324M4383.m4423(classAttribute);
            abstractComponentCallbacksC2338M4423.getClass();
            abstractComponentCallbacksC2338M4423.f6879 = true;
            C2319 c2319 = abstractComponentCallbacksC2338M4423.f6897;
            if ((c2319 == null ? null : c2319.f6817) != null) {
                abstractComponentCallbacksC2338M4423.f6879 = true;
            }
            C2332 c2332 = new C2332(abstractC2313);
            c2332.f6854 = true;
            abstractComponentCallbacksC2338M4423.f6882 = this;
            c2332.m4427(getId(), abstractComponentCallbacksC2338M4423, string, 1);
            if (c2332.f6856) {
                C5925.m11311("This transaction is already being added to the back stack");
                throw null;
            }
            c2332.f6855 = false;
            c2332.f6851.m4378(c2332, true);
        }
        for (C2304 c2304 : abstractC2313.f6784.m965()) {
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2304.f6754;
            if (abstractComponentCallbacksC2338.f6885 == getId() && (view = abstractComponentCallbacksC2338.f6881) != null && view.getParent() == null) {
                abstractComponentCallbacksC2338.f6882 = this;
                c2304.m4335();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC2338 ? (AbstractComponentCallbacksC2338) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            C5925.m11303(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2225 c2225M4250;
        windowInsets.getClass();
        C2225 c2225M4063 = C2225.m4063(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f6724;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            c2225M4250 = C2225.m4063(null, windowInsetsOnApplyWindowInsets);
        } else {
            c2225M4250 = AbstractC2270.m4250(this, c2225M4063);
        }
        if (!c2225M4250.f6521.mo4019()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC2270.m4236(getChildAt(i), c2225M4250);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f6722) {
            Iterator it = this.f6725.iterator();
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
        if (this.f6722) {
            ArrayList arrayList = this.f6725;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f6723.remove(view);
        if (this.f6725.remove(view)) {
            this.f6722 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC2338> F getFragment() {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338;
        FragmentActivity fragmentActivity;
        AbstractC2313 supportFragmentManager;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC2338 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC2338 = tag instanceof AbstractComponentCallbacksC2338 ? (AbstractComponentCallbacksC2338) tag : null;
            if (abstractComponentCallbacksC2338 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC2338 == null) {
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
                C5554.m10883(this, "View ", " is not within a subclass of FragmentActivity.");
                return null;
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC2338.m4460()) {
                C2308.m4353("The Fragment ", abstractComponentCallbacksC2338, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            supportFragmentManager = abstractComponentCallbacksC2338.m4442();
        }
        return (F) supportFragmentManager.m4376(getId());
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
                m4330(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m4330(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m4330(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m4330(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m4330(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m4330(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f6722 = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        listener.getClass();
        this.f6724 = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f6723.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4330(View view) {
        if (this.f6723.contains(view)) {
            this.f6725.add(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.f6725 = new ArrayList();
        this.f6723 = new ArrayList();
        this.f6722 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7634.f20722, 0, 0);
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
