package androidx.compose.p001ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.collection.C1083;
import androidx.collection.C1099;
import androidx.compose.foundation.text.C1804;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.input.nestedscroll.AbstractC2452;
import androidx.compose.p001ui.input.nestedscroll.C2454;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2606;
import androidx.compose.p001ui.node.C2638;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.node.InterfaceC2639;
import androidx.compose.p001ui.platform.AbstractC2673;
import androidx.compose.p001ui.platform.C2728;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.InterfaceC2205;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.C2110;
import androidx.compose.runtime.snapshots.C2113;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.InterfaceC3038;
import androidx.core.view.InterfaceC3039;
import androidx.lifecycle.InterfaceC3221;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Arrays;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p128.C8157;
import p158.InterfaceC8366;
import p180.C8494;
import p191.AbstractC8568;
import p221.C8735;
import p221.InterfaceC8725;
import p226.AbstractC8765;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2909 extends ViewGroup implements InterfaceC3039, InterfaceC2205, InterfaceC2639, InterfaceC3038 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final InterfaceC7387 f6490 = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C2583 f6491;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f6492;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f6493;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f6494;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1804 f6495;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f6496;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f6497;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC8366 f6498;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public InterfaceC3221 f6499;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC7387 f6500;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC8725 f6501;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int[] f6502;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC7387 f6503;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC7372 f6504;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC7372 f6505;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC7387 f6506;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C3058 f6507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f6508;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7372 f6509;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC2962 f6510;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC7387 f6511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7372 f6512;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC7372 f6513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f6514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2636 f6515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2454 f6516;

    public AbstractC2909(Context context, AbstractC2207 abstractC2207, int i, C2454 c2454, View view, InterfaceC2636 interfaceC2636) {
        super(context);
        this.f6516 = c2454;
        this.f6514 = view;
        this.f6515 = interfaceC2636;
        if (abstractC2207 != null) {
            C1083 c1083 = AbstractC2673.f5685;
            setTag(C0328R.id.androidx_compose_ui_view_composition_context, abstractC2207);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC3103.m4802(this, new C2912(0, this));
        AbstractC3026.m4564(this, this);
        this.f6509 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4371invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4371invoke() {
            }
        };
        this.f6512 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4368invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4368invoke() {
            }
        };
        this.f6513 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4367invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4367invoke() {
            }
        };
        C2958 c2958 = C2958.f6621;
        this.f6510 = c2958;
        this.f6501 = AbstractC8568.m13630();
        this.f6497 = new int[2];
        this.f6496 = 0L;
        this.f6505 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4370invoke() {
                AbstractC2909 abstractC2909 = this.this$0;
                if (abstractC2909.f6508 && abstractC2909.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AbstractC2909 abstractC29092 = this.this$0;
                    if (parent == abstractC29092) {
                        C2638 snapshotObserver = abstractC29092.getSnapshotObserver();
                        AbstractC2909 abstractC29093 = this.this$0;
                        snapshotObserver.f5619.m2806(abstractC29093, AbstractC2909.f6490, abstractC29093.getUpdate());
                    }
                }
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4370invoke();
                return C6008.f15084;
            }
        };
        this.f6504 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4369invoke() {
                this.this$0.getLayoutNode().m3796();
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4369invoke();
                return C6008.f15084;
            }
        };
        this.f6502 = new int[2];
        this.f6493 = Integer.MIN_VALUE;
        this.f6492 = Integer.MIN_VALUE;
        this.f6495 = new C1804();
        final C2583 c2583 = new C2583(3);
        c2583.f5461 = this;
        final InterfaceC2962 interfaceC2962Mo4426 = AbstractC2505.m3665(AbstractC2280.m3145(AbstractC2481.m3592(AbstractC2783.m4209(AbstractC2452.m3550(c2958, AbstractC2908.f6489, c2454), true, new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2779) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2779 interfaceC2779) {
            }
        }), this), new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2339 interfaceC2339) {
                AbstractC2909 abstractC2909 = this.$this_run;
                C2583 c25832 = c2583;
                AbstractC2909 abstractC29092 = this;
                InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
                if (abstractC2909.getView().getVisibility() != 8) {
                    abstractC2909.f6494 = true;
                    InterfaceC2636 interfaceC26362 = c25832.f5450;
                    ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = interfaceC26362 instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26362 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                        Canvas canvasM3475 = AbstractC2429.m3475(interfaceC2436M946);
                        viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getClass();
                        abstractC29092.draw(canvasM3475);
                    }
                    abstractC2909.f6494 = false;
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2339) obj);
                return C6008.f15084;
            }
        }), new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2530 interfaceC2530) {
                WindowInsets windowInsetsM4629;
                AbstractC2908.m4377(this.$this_run, c2583);
                AbstractC2909 abstractC2909 = this.$this_run;
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) abstractC2909.f6515).f5846 = true;
                int[] iArr = abstractC2909.f6497;
                int i2 = iArr[0];
                int i3 = iArr[1];
                abstractC2909.getView().getLocationOnScreen(this.$this_run.f6497);
                AbstractC2909 abstractC29092 = this.$this_run;
                long j = abstractC29092.f6496;
                abstractC29092.f6496 = interfaceC2530.mo3648();
                AbstractC2909 abstractC29093 = this.$this_run;
                C3058 c3058 = abstractC29093.f6507;
                if (c3058 != null) {
                    int[] iArr2 = abstractC29093.f6497;
                    if ((i2 == iArr2[0] && i3 == iArr2[1] && C8735.m13916(j, abstractC29093.f6496)) || (windowInsetsM4629 = this.$this_run.m4382(c3058).m4629()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsM4629);
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2530) obj);
                return C6008.f15084;
            }
        }).mo4426(new C2916(new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC7387) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC7387 interfaceC7387) {
                this.$this_run.f6506 = interfaceC7387;
            }
        }));
        c2583.m3830(this.f6510.mo4426(interfaceC2962Mo4426));
        this.f6511 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2962 interfaceC2962) {
                c2583.m3830(interfaceC2962.mo4426(interfaceC2962Mo4426));
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2962) obj);
                return C6008.f15084;
            }
        };
        c2583.m3835(this.f6501);
        this.f6500 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC8725) obj);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC8725 interfaceC8725) {
                c2583.m3835(interfaceC8725);
            }
        };
        c2583.f5475 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2636 interfaceC26362) {
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = interfaceC26362 instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26362 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                    AbstractC2909 abstractC2909 = this.$this_run;
                    C2583 c25832 = c2583;
                    viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(abstractC2909, c25832);
                    viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().addView(abstractC2909);
                    viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c25832, abstractC2909);
                    abstractC2909.setImportantForAccessibility(1);
                    AbstractC3103.m4804(abstractC2909, new C2728(viewTreeObserverOnGlobalLayoutListenerC2719, c25832, viewTreeObserverOnGlobalLayoutListenerC2719));
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AbstractC2909 abstractC29092 = this.$this_run;
                if (parent != abstractC29092) {
                    abstractC29092.addView(abstractC29092.getView());
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2636) obj);
                return C6008.f15084;
            }
        };
        c2583.f5474 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void invoke(InterfaceC2636 interfaceC26362) {
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = interfaceC26362 instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26362 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                    AbstractC2909 abstractC2909 = this.$this_run;
                    viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().removeViewInLayout(abstractC2909);
                    AbstractC5220.m9449(viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(abstractC2909));
                    abstractC2909.setImportantForAccessibility(0);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2636) obj);
                return C6008.f15084;
            }
        };
        c2583.m3831(new C2910(this, c2583));
        this.f6491 = c2583;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2638 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC8765.m13982("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC2719) this.f6515).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C8494 m4379(C8494 c8494, int i, int i2, int i3, int i4) {
        int i5 = c8494.f21155 - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c8494.f21154 - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c8494.f21153 - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c8494.f21152 - i4;
        return C8494.m13498(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m4381(AbstractC2909 abstractC2909, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(AbstractC3400.m5650(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f6502;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC8725 getDensity() {
        return this.f6501;
    }

    public final View getInteropView() {
        return this.f6514;
    }

    public final C2583 getLayoutNode() {
        return this.f6491;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f6514.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC3221 getLifecycleOwner() {
        return this.f6499;
    }

    public final InterfaceC2962 getModifier() {
        return this.f6510;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1804 c1804 = this.f6495;
        return c1804.f3100 | c1804.f3101;
    }

    public final InterfaceC7387 getOnDensityChanged$ui() {
        return this.f6500;
    }

    public final InterfaceC7387 getOnModifierChanged$ui() {
        return this.f6511;
    }

    public final InterfaceC7387 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f6503;
    }

    public final InterfaceC7372 getRelease() {
        return this.f6513;
    }

    public final InterfaceC7372 getReset() {
        return this.f6512;
    }

    public final InterfaceC8366 getSavedStateRegistryOwner() {
        return this.f6498;
    }

    public final InterfaceC7372 getUpdate() {
        return this.f6509;
    }

    public final View getView() {
        return this.f6514;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f6494) {
            this.f6491.m3796();
            return null;
        }
        this.f6514.postOnAnimation(new RunnableC2911(this.f6504, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6514.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6505.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f6494) {
            this.f6491.m3796();
        } else {
            this.f6514.postOnAnimation(new RunnableC2911(this.f6504, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        C2110 c2110 = getSnapshotObserver().f5619;
        synchronized (c2110.f4060) {
            try {
                C2059 c2059 = c2110.f4053;
                int i3 = c2059.f3865;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = c2059.f3866;
                    if (i4 < i3) {
                        C2113 c2113 = (C2113) objArr[i4];
                        C1099 c1099 = (C1099) c2113.f4072.m1318(this);
                        if (c1099 == null) {
                            i = i4;
                        } else {
                            Object[] objArr2 = c1099.f1262;
                            int[] iArr = c1099.f1261;
                            long[] jArr = c1099.f1263;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                c2113.m2814(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        i4 = i;
                                    }
                                }
                            }
                        }
                        if (!c2113.f4072.m1321()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr3 = c2059.f3866;
                            objArr3[i - i5] = objArr3[i];
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        c2059.f3865 = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6514.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f6514;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f6493 = i;
        this.f6492 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f6514.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC6231.m11036(this.f6516.m3551(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, AbstractC3738.m6871(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f6514.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC6231.m11036(this.f6516.m3551(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, AbstractC3738.m6871(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        InterfaceC7387 interfaceC7387 = this.f6506;
        if (interfaceC7387 == null) {
            return true;
        }
        interfaceC7387.invoke(rect != null ? new C8157(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC7387 interfaceC7387 = this.f6503;
        if (interfaceC7387 != null) {
            interfaceC7387.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC8725 interfaceC8725) {
        if (interfaceC8725 != this.f6501) {
            this.f6501 = interfaceC8725;
            InterfaceC7387 interfaceC7387 = this.f6500;
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(interfaceC8725);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC3221 interfaceC3221) {
        if (interfaceC3221 != this.f6499) {
            this.f6499 = interfaceC3221;
            setTag(C0328R.id.view_tree_lifecycle_owner, interfaceC3221);
        }
    }

    public final void setModifier(InterfaceC2962 interfaceC2962) {
        if (interfaceC2962 != this.f6510) {
            this.f6510 = interfaceC2962;
            InterfaceC7387 interfaceC7387 = this.f6511;
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(interfaceC2962);
            }
        }
    }

    public final void setOnDensityChanged$ui(InterfaceC7387 interfaceC7387) {
        this.f6500 = interfaceC7387;
    }

    public final void setOnModifierChanged$ui(InterfaceC7387 interfaceC7387) {
        this.f6511 = interfaceC7387;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC7387 interfaceC7387) {
        this.f6503 = interfaceC7387;
    }

    public final void setRelease(InterfaceC7372 interfaceC7372) {
        this.f6513 = interfaceC7372;
    }

    public final void setReset(InterfaceC7372 interfaceC7372) {
        this.f6512 = interfaceC7372;
    }

    public final void setSavedStateRegistryOwner(InterfaceC8366 interfaceC8366) {
        if (interfaceC8366 != this.f6498) {
            this.f6498 = interfaceC8366;
            setTag(C0328R.id.view_tree_saved_state_registry_owner, interfaceC8366);
        }
    }

    public final void setUpdate(InterfaceC7372 interfaceC7372) {
        this.f6509 = interfaceC7372;
        this.f6508 = true;
        this.f6505.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo1031(View view, View view2, int i, int i2) {
        C1804 c1804 = this.f6495;
        if (i2 == 1) {
            c1804.f3100 = i;
        } else {
            c1804.f3101 = i;
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo1032(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1033(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f6514.isNestedScrollingEnabled()) {
            this.f6516.m3554((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
        }
    }

    @Override // androidx.core.view.InterfaceC3039
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1034(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f6514.isNestedScrollingEnabled()) {
            long jM3554 = this.f6516.m3554((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
            iArr[0] = AbstractC7390.m12617(Float.intBitsToFloat((int) (jM3554 >> 32))) * (-1);
            iArr[1] = AbstractC7390.m12617(Float.intBitsToFloat((int) (jM3554 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3064() {
        this.f6512.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3065() {
        this.f6513.invoke();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2639
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3815() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1036(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f6514.isNestedScrollingEnabled()) {
            long jM3552 = this.f6516.m3552(i3 == 0 ? 1 : 2, (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L));
            iArr[0] = AbstractC7390.m12617(Float.intBitsToFloat((int) (jM3552 >> 32))) * (-1);
            iArr[1] = AbstractC7390.m12617(Float.intBitsToFloat((int) (jM3552 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1037(View view, int i) {
        C1804 c1804 = this.f6495;
        if (i == 1) {
            c1804.f3100 = 0;
        } else {
            c1804.f3101 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3058 m4382(C3058 c3058) {
        C3071 c3071 = c3058.f6866;
        C8494 c8494Mo4612 = c3071.mo4612(-1);
        C8494 c8494 = C8494.f21151;
        if (!c8494Mo4612.equals(c8494) || !c3071.mo4613(-9).equals(c8494) || c3071.mo4582() != null) {
            C2606 c2606 = this.f6491.f5439.f5631;
            if (c2606.f5548.f6624) {
                long jM14240 = AbstractC9019.m14240(c2606.mo3636(0L));
                int i = (int) (jM14240 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM14240 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo3648 = AbstractC2505.m3673(c2606).mo3648();
                int i3 = (int) (jMo3648 >> 32);
                int i4 = (int) (jMo3648 & 4294967295L);
                long j = c2606.f5343;
                long jM142402 = AbstractC9019.m14240(c2606.mo3636((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM142402 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM142402));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c3058.f6866.mo4609(i, i2, i5, i7);
                }
            }
        }
        return c3058;
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C3058 mo863(View view, C3058 c3058) {
        this.f6507 = new C3058(c3058);
        return m4382(c3058);
    }
}
