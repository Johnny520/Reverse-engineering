package androidx.fragment.app;

import Yue.C3229;
import Yue.C4335;
import Yue.C5499;
import Yue.C6884;
import Yue.C8039;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC5572;
import Yue.InterfaceC5573;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7113;
import Yue.InterfaceC7507;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.p001dx.rop.code.RegisterSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n55#2,6:349\n55#2,6:355\n1855#3,2:361\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:349,6\n135#1:355,6\n221#1:361,2\n*E\n"})
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001CB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020$H\u0001¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b5\u0010)J\u0017\u00106\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010)J\u001f\u00109\u001a\u00020\u00102\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00102\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00028\u0000\"\n\b\u0000\u0010?*\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020 H\u0002¢\u0006\u0004\bC\u0010)R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020 0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020 0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010L\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/animation/LayoutTransition;", C3229.f4952, "LYue/ۥۣۢ۠ۤ;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", RegisterSpec.PREFIX, "ۥ", "", "ۥۣ۟۟۠", "Ljava/util/List;", "disappearingFragmentChildren", "ۥ۟۟۠ۤ", "transitioningFragmentViews", "ۥ۟۟۠ۥ", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "ۥ۟۟۠ۦ", "Z", "fragment_release"}, k = 1, mv = {1, 8, 0})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC6399
    public final List<View> disappearingFragmentChildren;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC6399
    public final List<View> transitioningFragmentViews;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC6489
    public View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and from kotlin metadata */
    public boolean drawDisappearingViewsFirst;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentContainerView$ۥ */
    @InterfaceC7113(20)
    public static final class C1683 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C1683 f3800 = new C1683();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final WindowInsets m4813(@InterfaceC6399 View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @InterfaceC6399 View view, @InterfaceC6399 WindowInsets windowInsets) {
            C5499.m17103(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C5499.m17103(view, RegisterSpec.PREFIX);
            C5499.m17103(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C5499.m17102(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public FragmentContainerView(@InterfaceC6399 Context context, @InterfaceC6489 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C5499.m17103(context, "context");
    }

    @Override // android.view.ViewGroup
    public void addView(@InterfaceC6399 View child, int index, @InterfaceC6489 ViewGroup.LayoutParams params) {
        C5499.m17103(child, "child");
        if (FragmentManager.m29738(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @InterfaceC6399
    @InterfaceC7113(20)
    public WindowInsets dispatchApplyWindowInsets(@InterfaceC6399 WindowInsets insets) {
        C8472 c8472M27416;
        C5499.m17103(insets, "insets");
        C8472 c8472M28276 = C8472.m28276(insets);
        C5499.m17102(c8472M28276, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            C1683 c1683 = C1683.f3800;
            C5499.m17100(onApplyWindowInsetsListener);
            c8472M27416 = C8472.m28276(c1683.m4813(onApplyWindowInsetsListener, this, insets));
        } else {
            c8472M27416 = C8273.m27416(this, c8472M28276);
        }
        C5499.m17102(c8472M27416, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c8472M27416.m28301()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C8273.m27317(getChildAt(i), c8472M27416);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@InterfaceC6399 Canvas canvas) {
        C5499.m17103(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@InterfaceC6399 Canvas canvas, @InterfaceC6399 View child, long drawingTime) {
        C5499.m17103(canvas, "canvas");
        C5499.m17103(child, "child");
        if (this.drawDisappearingViewsFirst && (!this.disappearingFragmentChildren.isEmpty()) && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@InterfaceC6399 View view) {
        C5499.m17103(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.m29736(this).m29795(getId());
    }

    @Override // android.view.View
    @InterfaceC6399
    @InterfaceC7113(20)
    public WindowInsets onApplyWindowInsets(@InterfaceC6399 WindowInsets insets) {
        C5499.m17103(insets, "insets");
        return insets;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                C5499.m17102(childAt, "view");
                m4812(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@InterfaceC6399 View view) {
        C5499.m17103(view, "view");
        m4812(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        View childAt = getChildAt(index);
        C5499.m17102(childAt, "view");
        m4812(childAt);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@InterfaceC6399 View view) {
        C5499.m17103(view, "view");
        m4812(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            C5499.m17102(childAt, "view");
            m4812(childAt);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            C5499.m17102(childAt, "view");
            m4812(childAt);
        }
        super.removeViewsInLayout(start, count);
    }

    @InterfaceC5572(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.drawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@InterfaceC6489 LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@InterfaceC6399 View.OnApplyWindowInsetsListener listener) {
        C5499.m17103(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@InterfaceC6399 View view) {
        C5499.m17103(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4812(View v) {
        if (this.transitioningFragmentViews.contains(v)) {
            this.disappearingFragmentChildren.add(v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@InterfaceC6399 Context context) {
        super(context);
        C5499.m17103(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 android.util.AttributeSet)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:6) call: androidx.fragment.app.FragmentContainerView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C4335 c4335) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public FragmentContainerView(@InterfaceC6399 Context context, @InterfaceC6489 AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        C5499.m17103(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C6884.C6886.f18211;
            C5499.m17102(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C6884.C6886.f18212);
                str = "android:name";
            } else {
                str = Name.LABEL;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + C8039.f3212);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@InterfaceC6399 Context context, @InterfaceC6399 AttributeSet attributeSet, @InterfaceC6399 FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        C5499.m17103(context, "context");
        C5499.m17103(attributeSet, "attrs");
        C5499.m17103(fragmentManager, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C6884.C6886.f18211;
        C5499.m17102(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C6884.C6886.f18212) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C6884.C6886.f18213);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM29795 = fragmentManager.m29795(id);
        if (classAttribute != null && fragmentM29795 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentMo4815 = fragmentManager.m29809().mo4815(context.getClassLoader(), classAttribute);
            C5499.m17102(fragmentMo4815, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentMo4815.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m29749().m30066(true).m30044(this, fragmentMo4815, string).mo29907();
        }
        fragmentManager.m29841(this);
    }
}
