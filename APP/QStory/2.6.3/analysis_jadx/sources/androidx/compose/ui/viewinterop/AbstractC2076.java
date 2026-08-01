package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.collection.C0236;
import androidx.compose.foundation.text.C0966;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.InterfaceC1370;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.input.nestedscroll.AbstractC1617;
import androidx.compose.ui.input.nestedscroll.C1619;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1771;
import androidx.compose.ui.node.C1803;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.node.InterfaceC1804;
import androidx.compose.ui.platform.AbstractC1838;
import androidx.compose.ui.platform.C1893;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.AbstractC1948;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.InterfaceC2205;
import androidx.core.view.InterfaceC2206;
import androidx.lifecycle.InterfaceC2388;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4388;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p112.C7328;
import p142.InterfaceC7537;
import p164.C7665;
import p175.AbstractC7739;
import p205.C7906;
import p205.InterfaceC7896;
import p210.AbstractC7936;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2076 extends ViewGroup implements InterfaceC2206, InterfaceC1370, InterfaceC1804, InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final InterfaceC6558 f6145 = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C1748 f6146;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f6147;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f6148;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f6149;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C0966 f6150;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f6151;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f6152;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC7537 f6153;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public InterfaceC2388 f6154;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC6558 f6155;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC7896 f6156;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int[] f6157;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC6558 f6158;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC6543 f6159;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC6543 f6160;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC6558 f6161;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2225 f6162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f6163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6543 f6164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC2129 f6165;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6558 f6166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC6543 f6167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC6543 f6168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f6169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1801 f6170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1619 f6171;

    public AbstractC2076(Context context, AbstractC1372 abstractC1372, int i, C1619 c1619, View view, InterfaceC1801 interfaceC1801) {
        super(context);
        this.f6171 = c1619;
        this.f6169 = view;
        this.f6170 = interfaceC1801;
        if (abstractC1372 != null) {
            C0236 c0236 = AbstractC1838.f5340;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC1372);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC2270.m4242(this, new C2079(0, this));
        AbstractC2193.m4004(this, this);
        this.f6164 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3811invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3811invoke() {
            }
        };
        this.f6167 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3808invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3808invoke() {
            }
        };
        this.f6168 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3807invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3807invoke() {
            }
        };
        C2125 c2125 = C2125.f6276;
        this.f6165 = c2125;
        this.f6156 = AbstractC7739.m13071();
        this.f6152 = new int[2];
        this.f6151 = 0L;
        this.f6160 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3810invoke() {
                AbstractC2076 abstractC2076 = this.this$0;
                if (abstractC2076.f6163 && abstractC2076.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AbstractC2076 abstractC20762 = this.this$0;
                    if (parent == abstractC20762) {
                        C1803 snapshotObserver = abstractC20762.getSnapshotObserver();
                        AbstractC2076 abstractC20763 = this.this$0;
                        snapshotObserver.f5274.m2246(abstractC20763, AbstractC2076.f6145, abstractC20763.getUpdate());
                    }
                }
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3810invoke();
                return C5176.f14739;
            }
        };
        this.f6159 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3809invoke() {
                this.this$0.getLayoutNode().m3236();
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3809invoke();
                return C5176.f14739;
            }
        };
        this.f6157 = new int[2];
        this.f6148 = Integer.MIN_VALUE;
        this.f6147 = Integer.MIN_VALUE;
        this.f6150 = new C0966();
        final C1748 c1748 = new C1748(3);
        c1748.f5116 = this;
        final InterfaceC2129 interfaceC2129Mo3866 = AbstractC1670.m3105(AbstractC1445.m2585(AbstractC1646.m3032(AbstractC1948.m3649(AbstractC1617.m2990(c2125, AbstractC2075.f6144, c1619), true, new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1944) obj);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1944 interfaceC1944) {
            }
        }), this), new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC1504 interfaceC1504) {
                AbstractC2076 abstractC2076 = this.$this_run;
                C1748 c17482 = c1748;
                AbstractC2076 abstractC20762 = this;
                InterfaceC1601 interfaceC1601M386 = interfaceC1504.mo2706().m386();
                if (abstractC2076.getView().getVisibility() != 8) {
                    abstractC2076.f6149 = true;
                    InterfaceC1801 interfaceC18012 = c17482.f5105;
                    ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = interfaceC18012 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                        Canvas canvasM2915 = AbstractC1594.m2915(interfaceC1601M386);
                        viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getClass();
                        abstractC20762.draw(canvasM2915);
                    }
                    abstractC2076.f6149 = false;
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1504) obj);
                return C5176.f14739;
            }
        }), new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC1695 interfaceC1695) {
                WindowInsets windowInsetsM4069;
                AbstractC2075.m3817(this.$this_run, c1748);
                AbstractC2076 abstractC2076 = this.$this_run;
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) abstractC2076.f6170).f5501 = true;
                int[] iArr = abstractC2076.f6152;
                int i2 = iArr[0];
                int i3 = iArr[1];
                abstractC2076.getView().getLocationOnScreen(this.$this_run.f6152);
                AbstractC2076 abstractC20762 = this.$this_run;
                long j = abstractC20762.f6151;
                abstractC20762.f6151 = interfaceC1695.mo3088();
                AbstractC2076 abstractC20763 = this.$this_run;
                C2225 c2225 = abstractC20763.f6162;
                if (c2225 != null) {
                    int[] iArr2 = abstractC20763.f6152;
                    if ((i2 == iArr2[0] && i3 == iArr2[1] && C7906.m13357(j, abstractC20763.f6151)) || (windowInsetsM4069 = this.$this_run.m3822(c2225).m4069()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsM4069);
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1695) obj);
                return C5176.f14739;
            }
        }).mo3866(new C2083(new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6558) obj);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC6558 interfaceC6558) {
                this.$this_run.f6161 = interfaceC6558;
            }
        }));
        c1748.m3270(this.f6165.mo3866(interfaceC2129Mo3866));
        this.f6166 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2129 interfaceC2129) {
                c1748.m3270(interfaceC2129.mo3866(interfaceC2129Mo3866));
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2129) obj);
                return C5176.f14739;
            }
        };
        c1748.m3275(this.f6156);
        this.f6155 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC7896) obj);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC7896 interfaceC7896) {
                c1748.m3275(interfaceC7896);
            }
        };
        c1748.f5130 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC1801 interfaceC18012) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = interfaceC18012 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    AbstractC2076 abstractC2076 = this.$this_run;
                    C1748 c17482 = c1748;
                    viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(abstractC2076, c17482);
                    viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().addView(abstractC2076);
                    viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c17482, abstractC2076);
                    abstractC2076.setImportantForAccessibility(1);
                    AbstractC2270.m4244(abstractC2076, new C1893(viewTreeObserverOnGlobalLayoutListenerC1884, c17482, viewTreeObserverOnGlobalLayoutListenerC1884));
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AbstractC2076 abstractC20762 = this.$this_run;
                if (parent != abstractC20762) {
                    abstractC20762.addView(abstractC20762.getView());
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1801) obj);
                return C5176.f14739;
            }
        };
        c1748.f5129 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void invoke(InterfaceC1801 interfaceC18012) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = interfaceC18012 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    AbstractC2076 abstractC2076 = this.$this_run;
                    viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().removeViewInLayout(abstractC2076);
                    AbstractC4388.m8890(viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(abstractC2076));
                    abstractC2076.setImportantForAccessibility(0);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1801) obj);
                return C5176.f14739;
            }
        };
        c1748.m3271(new C2077(this, c1748));
        this.f6146 = c1748;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1803 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC7936.m13423("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1884) this.f6170).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7665 m3819(C7665 c7665, int i, int i2, int i3, int i4) {
        int i5 = c7665.f20810 - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c7665.f20809 - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c7665.f20808 - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c7665.f20807 - i4;
        return C7665.m12939(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m3821(AbstractC2076 abstractC2076, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(AbstractC2567.m5090(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f6157;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC7896 getDensity() {
        return this.f6156;
    }

    public final View getInteropView() {
        return this.f6169;
    }

    public final C1748 getLayoutNode() {
        return this.f6146;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f6169.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC2388 getLifecycleOwner() {
        return this.f6154;
    }

    public final InterfaceC2129 getModifier() {
        return this.f6165;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0966 c0966 = this.f6150;
        return c0966.f2755 | c0966.f2756;
    }

    public final InterfaceC6558 getOnDensityChanged$ui() {
        return this.f6155;
    }

    public final InterfaceC6558 getOnModifierChanged$ui() {
        return this.f6166;
    }

    public final InterfaceC6558 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f6158;
    }

    public final InterfaceC6543 getRelease() {
        return this.f6168;
    }

    public final InterfaceC6543 getReset() {
        return this.f6167;
    }

    public final InterfaceC7537 getSavedStateRegistryOwner() {
        return this.f6153;
    }

    public final InterfaceC6543 getUpdate() {
        return this.f6164;
    }

    public final View getView() {
        return this.f6169;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f6149) {
            this.f6146.m3236();
            return null;
        }
        this.f6169.postOnAnimation(new RunnableC2078(this.f6159, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6169.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6160.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f6149) {
            this.f6146.m3236();
        } else {
            this.f6169.postOnAnimation(new RunnableC2078(this.f6159, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r0 = r22
            super.onDetachedFromWindow()
            androidx.compose.ui.node.飘花落叶言子苏哲兰世楪 r1 = r0.getSnapshotObserver()
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏 r1 = r1.f5274
            java.lang.Object r2 = r1.f3715
            monitor-enter(r2)
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = r1.f3708     // Catch: java.lang.Throwable -> L96
            int r3 = r1.f3520     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            java.lang.Object[] r7 = r1.f3521
            if (r5 >= r3) goto L9c
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏哲世 r7 = (androidx.compose.runtime.snapshots.C1278) r7     // Catch: java.lang.Throwable -> L96
            androidx.collection.飘花落叶言子世兰楪苏哲 r8 = r7.f3727     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.m758(r0)     // Catch: java.lang.Throwable -> L96
            androidx.collection.飘花落叶言子世苏兰楪哲 r8 = (androidx.collection.C0252) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f917     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.f916     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.f918     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.m2254(r0, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            androidx.collection.飘花落叶言子世兰楪苏哲 r4 = r7.f3727     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.m761()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r1.f3521     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La6
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            int r0 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r0, r3, r4)     // Catch: java.lang.Throwable -> L96
            r1.f3520 = r0     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        La6:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AbstractC2076.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6169.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f6169;
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
        this.f6148 = i;
        this.f6147 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f6169.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5399.m10477(this.f6171.m2991(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, AbstractC2905.m6311(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f6169.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5399.m10477(this.f6171.m2991(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, AbstractC2905.m6311(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        InterfaceC6558 interfaceC6558 = this.f6161;
        if (interfaceC6558 == null) {
            return true;
        }
        interfaceC6558.invoke(rect != null ? new C7328(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC6558 interfaceC6558 = this.f6158;
        if (interfaceC6558 != null) {
            interfaceC6558.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC7896 interfaceC7896) {
        if (interfaceC7896 != this.f6156) {
            this.f6156 = interfaceC7896;
            InterfaceC6558 interfaceC6558 = this.f6155;
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(interfaceC7896);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC2388 interfaceC2388) {
        if (interfaceC2388 != this.f6154) {
            this.f6154 = interfaceC2388;
            setTag(R.id.view_tree_lifecycle_owner, interfaceC2388);
        }
    }

    public final void setModifier(InterfaceC2129 interfaceC2129) {
        if (interfaceC2129 != this.f6165) {
            this.f6165 = interfaceC2129;
            InterfaceC6558 interfaceC6558 = this.f6166;
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(interfaceC2129);
            }
        }
    }

    public final void setOnDensityChanged$ui(InterfaceC6558 interfaceC6558) {
        this.f6155 = interfaceC6558;
    }

    public final void setOnModifierChanged$ui(InterfaceC6558 interfaceC6558) {
        this.f6166 = interfaceC6558;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC6558 interfaceC6558) {
        this.f6158 = interfaceC6558;
    }

    public final void setRelease(InterfaceC6543 interfaceC6543) {
        this.f6168 = interfaceC6543;
    }

    public final void setReset(InterfaceC6543 interfaceC6543) {
        this.f6167 = interfaceC6543;
    }

    public final void setSavedStateRegistryOwner(InterfaceC7537 interfaceC7537) {
        if (interfaceC7537 != this.f6153) {
            this.f6153 = interfaceC7537;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC7537);
        }
    }

    public final void setUpdate(InterfaceC6543 interfaceC6543) {
        this.f6164 = interfaceC6543;
        this.f6163 = true;
        this.f6160.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo471(View view, View view2, int i, int i2) {
        C0966 c0966 = this.f6150;
        if (i2 == 1) {
            c0966.f2755 = i;
        } else {
            c0966.f2756 = i;
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo472(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo473(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f6169.isNestedScrollingEnabled()) {
            this.f6171.m2994((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
        }
    }

    @Override // androidx.core.view.InterfaceC2206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo474(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f6169.isNestedScrollingEnabled()) {
            long jM2994 = this.f6171.m2994((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
            iArr[0] = AbstractC6561.m12058(Float.intBitsToFloat((int) (jM2994 >> 32))) * (-1);
            iArr[1] = AbstractC6561.m12058(Float.intBitsToFloat((int) (jM2994 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2504() {
        this.f6167.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2505() {
        this.f6168.invoke();
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3255() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo476(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f6169.isNestedScrollingEnabled()) {
            long jM2992 = this.f6171.m2992(i3 == 0 ? 1 : 2, (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L));
            iArr[0] = AbstractC6561.m12058(Float.intBitsToFloat((int) (jM2992 >> 32))) * (-1);
            iArr[1] = AbstractC6561.m12058(Float.intBitsToFloat((int) (jM2992 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo477(View view, int i) {
        C0966 c0966 = this.f6150;
        if (i == 1) {
            c0966.f2755 = 0;
        } else {
            c0966.f2756 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2225 m3822(C2225 c2225) {
        C2238 c2238 = c2225.f6521;
        C7665 c7665Mo4052 = c2238.mo4052(-1);
        C7665 c7665 = C7665.f20806;
        if (!c7665Mo4052.equals(c7665) || !c2238.mo4053(-9).equals(c7665) || c2238.mo4022() != null) {
            C1771 c1771 = this.f6146.f5094.f5286;
            if (c1771.f5203.f6279) {
                long jM13681 = AbstractC8190.m13681(c1771.mo3076(0L));
                int i = (int) (jM13681 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM13681 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo3088 = AbstractC1670.m3113(c1771).mo3088();
                int i3 = (int) (jMo3088 >> 32);
                int i4 = (int) (jMo3088 & 4294967295L);
                long j = c1771.f4998;
                long jM136812 = AbstractC8190.m13681(c1771.mo3076((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM136812 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM136812));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c2225.f6521.mo4049(i, i2, i5, i7);
                }
            }
        }
        return c2225;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo303(View view, C2225 c2225) {
        this.f6162 = new C2225(c2225);
        return m3822(c2225);
    }
}
