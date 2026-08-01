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
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import com.davemorrissey.labs.subscaleview.R;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4387;
import kotlinx.coroutines.AbstractC5398;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p112.C7327;
import p142.InterfaceC7536;
import p164.C7664;
import p175.AbstractC7738;
import p205.C7905;
import p205.InterfaceC7895;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2076 extends ViewGroup implements InterfaceC2206, InterfaceC1370, InterfaceC1804, InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final InterfaceC6557 f6144 = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C1748 f6145;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f6146;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f6147;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f6148;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C0966 f6149;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f6150;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int[] f6151;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC7536 f6152;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public InterfaceC2388 f6153;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC6557 f6154;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC7895 f6155;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int[] f6156;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC6557 f6157;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC6542 f6158;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC6542 f6159;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC6557 f6160;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2225 f6161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f6162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6542 f6163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC2129 f6164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6557 f6165;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC6542 f6166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC6542 f6167;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f6168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1801 f6169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1619 f6170;

    public AbstractC2076(Context context, AbstractC1372 abstractC1372, int i, C1619 c1619, View view, InterfaceC1801 interfaceC1801) {
        super(context);
        this.f6170 = c1619;
        this.f6168 = view;
        this.f6169 = interfaceC1801;
        if (abstractC1372 != null) {
            C0236 c0236 = AbstractC1838.f5339;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC1372);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC2270.m4232(this, new C2079(0, this));
        AbstractC2193.m3994(this, this);
        this.f6163 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3801invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3801invoke() {
            }
        };
        this.f6166 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3798invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3798invoke() {
            }
        };
        this.f6167 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3797invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3797invoke() {
            }
        };
        C2125 c2125 = C2125.f6275;
        this.f6164 = c2125;
        this.f6155 = AbstractC6325.m11859();
        this.f6151 = new int[2];
        this.f6150 = 0L;
        this.f6159 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3800invoke() {
                AbstractC2076 abstractC2076 = this.this$0;
                if (abstractC2076.f6162 && abstractC2076.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AbstractC2076 abstractC20762 = this.this$0;
                    if (parent == abstractC20762) {
                        C1803 snapshotObserver = abstractC20762.getSnapshotObserver();
                        AbstractC2076 abstractC20763 = this.this$0;
                        snapshotObserver.f5273.m2236(abstractC20763, AbstractC2076.f6144, abstractC20763.getUpdate());
                    }
                }
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3800invoke();
                return C5175.f14739;
            }
        };
        this.f6158 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3799invoke() {
                this.this$0.getLayoutNode().m3226();
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3799invoke();
                return C5175.f14739;
            }
        };
        this.f6156 = new int[2];
        this.f6147 = Integer.MIN_VALUE;
        this.f6146 = Integer.MIN_VALUE;
        this.f6149 = new C0966();
        final C1748 c1748 = new C1748(3);
        c1748.f5115 = this;
        final InterfaceC2129 interfaceC2129Mo3856 = AbstractC1670.m3095(AbstractC1445.m2575(AbstractC1646.m3022(AbstractC1948.m3639(AbstractC1617.m2980(c2125, AbstractC2075.f6143, c1619), true, new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1944) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC1944 interfaceC1944) {
            }
        }), this), new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC1504 interfaceC1504) {
                AbstractC2076 abstractC2076 = this.$this_run;
                C1748 c17482 = c1748;
                AbstractC2076 abstractC20762 = this;
                InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
                if (abstractC2076.getView().getVisibility() != 8) {
                    abstractC2076.f6148 = true;
                    InterfaceC1801 interfaceC18012 = c17482.f5104;
                    ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = interfaceC18012 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                        Canvas canvasM2905 = AbstractC1594.m2905(interfaceC1601M385);
                        viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getClass();
                        abstractC20762.draw(canvasM2905);
                    }
                    abstractC2076.f6148 = false;
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1504) obj);
                return C5175.f14739;
            }
        }), new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC1695 interfaceC1695) {
                WindowInsets windowInsetsM4059;
                AbstractC2075.m3807(this.$this_run, c1748);
                AbstractC2076 abstractC2076 = this.$this_run;
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) abstractC2076.f6169).f5500 = true;
                int[] iArr = abstractC2076.f6151;
                int i2 = iArr[0];
                int i3 = iArr[1];
                abstractC2076.getView().getLocationOnScreen(this.$this_run.f6151);
                AbstractC2076 abstractC20762 = this.$this_run;
                long j = abstractC20762.f6150;
                abstractC20762.f6150 = interfaceC1695.mo3078();
                AbstractC2076 abstractC20763 = this.$this_run;
                C2225 c2225 = abstractC20763.f6161;
                if (c2225 != null) {
                    int[] iArr2 = abstractC20763.f6151;
                    if ((i2 == iArr2[0] && i3 == iArr2[1] && C7905.m13329(j, abstractC20763.f6150)) || (windowInsetsM4059 = this.$this_run.m3812(c2225).m4059()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsM4059);
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1695) obj);
                return C5175.f14739;
            }
        }).mo3856(new C2083(new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6557) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC6557 interfaceC6557) {
                this.$this_run.f6160 = interfaceC6557;
            }
        }));
        c1748.m3260(this.f6164.mo3856(interfaceC2129Mo3856));
        this.f6165 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InterfaceC2129 interfaceC2129) {
                c1748.m3260(interfaceC2129.mo3856(interfaceC2129Mo3856));
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2129) obj);
                return C5175.f14739;
            }
        };
        c1748.m3265(this.f6155);
        this.f6154 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC7895) obj);
                return C5175.f14739;
            }

            public final void invoke(InterfaceC7895 interfaceC7895) {
                c1748.m3265(interfaceC7895);
            }
        };
        c1748.f5129 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
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
                    AbstractC2270.m4234(abstractC2076, new C1893(viewTreeObserverOnGlobalLayoutListenerC1884, c17482, viewTreeObserverOnGlobalLayoutListenerC1884));
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AbstractC2076 abstractC20762 = this.$this_run;
                if (parent != abstractC20762) {
                    abstractC20762.addView(abstractC20762.getView());
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1801) obj);
                return C5175.f14739;
            }
        };
        c1748.f5128 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void invoke(InterfaceC1801 interfaceC18012) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = interfaceC18012 instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    AbstractC2076 abstractC2076 = this.$this_run;
                    viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().removeViewInLayout(abstractC2076);
                    AbstractC4387.m8900(viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC1884.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(abstractC2076));
                    abstractC2076.setImportantForAccessibility(0);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1801) obj);
                return C5175.f14739;
            }
        };
        c1748.m3261(new C2077(this, c1748));
        this.f6145 = c1748;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1803 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC7935.m13395("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1884) this.f6169).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7664 m3809(C7664 c7664, int i, int i2, int i3, int i4) {
        int i5 = c7664.f20815 - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c7664.f20814 - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c7664.f20813 - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c7664.f20812 - i4;
        return C7664.m12910(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m3811(AbstractC2076 abstractC2076, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(AbstractC6087.m11420(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f6156;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC7895 getDensity() {
        return this.f6155;
    }

    public final View getInteropView() {
        return this.f6168;
    }

    public final C1748 getLayoutNode() {
        return this.f6145;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f6168.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC2388 getLifecycleOwner() {
        return this.f6153;
    }

    public final InterfaceC2129 getModifier() {
        return this.f6164;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0966 c0966 = this.f6149;
        return c0966.f2754 | c0966.f2755;
    }

    public final InterfaceC6557 getOnDensityChanged$ui() {
        return this.f6154;
    }

    public final InterfaceC6557 getOnModifierChanged$ui() {
        return this.f6165;
    }

    public final InterfaceC6557 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f6157;
    }

    public final InterfaceC6542 getRelease() {
        return this.f6167;
    }

    public final InterfaceC6542 getReset() {
        return this.f6166;
    }

    public final InterfaceC7536 getSavedStateRegistryOwner() {
        return this.f6152;
    }

    public final InterfaceC6542 getUpdate() {
        return this.f6163;
    }

    public final View getView() {
        return this.f6168;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f6148) {
            this.f6145.m3226();
            return null;
        }
        this.f6168.postOnAnimation(new RunnableC2078(this.f6158, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6168.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6159.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f6148) {
            this.f6145.m3226();
        } else {
            this.f6168.postOnAnimation(new RunnableC2078(this.f6158, 1));
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
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏 r1 = r1.f5273
            java.lang.Object r2 = r1.f3714
            monitor-enter(r2)
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = r1.f3707     // Catch: java.lang.Throwable -> L96
            int r3 = r1.f3519     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            java.lang.Object[] r7 = r1.f3520
            if (r5 >= r3) goto L9c
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏哲世 r7 = (androidx.compose.runtime.snapshots.C1278) r7     // Catch: java.lang.Throwable -> L96
            androidx.collection.飘花落叶言子世兰楪苏哲 r8 = r7.f3726     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.m757(r0)     // Catch: java.lang.Throwable -> L96
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
            r7.m2244(r0, r5)     // Catch: java.lang.Throwable -> L96
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
            androidx.collection.飘花落叶言子世兰楪苏哲 r4 = r7.f3726     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.m760()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r1.f3520     // Catch: java.lang.Throwable -> L96
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
            r1.f3519 = r0     // Catch: java.lang.Throwable -> L96
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
        this.f6168.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f6168;
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
        this.f6147 = i;
        this.f6146 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f6168.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5398.m10473(this.f6170.m2981(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, AbstractC0455.m1149(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f6168.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5398.m10473(this.f6170.m2981(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, AbstractC0455.m1149(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        InterfaceC6557 interfaceC6557 = this.f6160;
        if (interfaceC6557 == null) {
            return true;
        }
        interfaceC6557.invoke(rect != null ? new C7327(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC6557 interfaceC6557 = this.f6157;
        if (interfaceC6557 != null) {
            interfaceC6557.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC7895 interfaceC7895) {
        if (interfaceC7895 != this.f6155) {
            this.f6155 = interfaceC7895;
            InterfaceC6557 interfaceC6557 = this.f6154;
            if (interfaceC6557 != null) {
                interfaceC6557.invoke(interfaceC7895);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC2388 interfaceC2388) {
        if (interfaceC2388 != this.f6153) {
            this.f6153 = interfaceC2388;
            setTag(R.id.view_tree_lifecycle_owner, interfaceC2388);
        }
    }

    public final void setModifier(InterfaceC2129 interfaceC2129) {
        if (interfaceC2129 != this.f6164) {
            this.f6164 = interfaceC2129;
            InterfaceC6557 interfaceC6557 = this.f6165;
            if (interfaceC6557 != null) {
                interfaceC6557.invoke(interfaceC2129);
            }
        }
    }

    public final void setOnDensityChanged$ui(InterfaceC6557 interfaceC6557) {
        this.f6154 = interfaceC6557;
    }

    public final void setOnModifierChanged$ui(InterfaceC6557 interfaceC6557) {
        this.f6165 = interfaceC6557;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC6557 interfaceC6557) {
        this.f6157 = interfaceC6557;
    }

    public final void setRelease(InterfaceC6542 interfaceC6542) {
        this.f6167 = interfaceC6542;
    }

    public final void setReset(InterfaceC6542 interfaceC6542) {
        this.f6166 = interfaceC6542;
    }

    public final void setSavedStateRegistryOwner(InterfaceC7536 interfaceC7536) {
        if (interfaceC7536 != this.f6152) {
            this.f6152 = interfaceC7536;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC7536);
        }
    }

    public final void setUpdate(InterfaceC6542 interfaceC6542) {
        this.f6163 = interfaceC6542;
        this.f6162 = true;
        this.f6159.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo470(View view, View view2, int i, int i2) {
        C0966 c0966 = this.f6149;
        if (i2 == 1) {
            c0966.f2754 = i;
        } else {
            c0966.f2755 = i;
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo471(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo472(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f6168.isNestedScrollingEnabled()) {
            this.f6170.m2984((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
        }
    }

    @Override // androidx.core.view.InterfaceC2206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo473(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f6168.isNestedScrollingEnabled()) {
            long jM2984 = this.f6170.m2984((((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L), i5 == 0 ? 1 : 2);
            iArr[0] = AbstractC6560.m12006(Float.intBitsToFloat((int) (jM2984 >> 32))) * (-1);
            iArr[1] = AbstractC6560.m12006(Float.intBitsToFloat((int) (jM2984 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2494() {
        this.f6166.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2495() {
        this.f6167.invoke();
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3245() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo475(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f6168.isNestedScrollingEnabled()) {
            long jM2982 = this.f6170.m2982(i3 == 0 ? 1 : 2, (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L));
            iArr[0] = AbstractC6560.m12006(Float.intBitsToFloat((int) (jM2982 >> 32))) * (-1);
            iArr[1] = AbstractC6560.m12006(Float.intBitsToFloat((int) (jM2982 & 4294967295L))) * (-1);
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo476(View view, int i) {
        C0966 c0966 = this.f6149;
        if (i == 1) {
            c0966.f2754 = 0;
        } else {
            c0966.f2755 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2225 m3812(C2225 c2225) {
        C2238 c2238 = c2225.f6520;
        C7664 c7664Mo4042 = c2238.mo4042(-1);
        C7664 c7664 = C7664.f20811;
        if (!c7664Mo4042.equals(c7664) || !c2238.mo4043(-9).equals(c7664) || c2238.mo4012() != null) {
            C1771 c1771 = this.f6145.f5093.f5285;
            if (c1771.f5202.f6278) {
                long jM13022 = AbstractC7738.m13022(c1771.mo3066(0L));
                int i = (int) (jM13022 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM13022 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo3078 = AbstractC1670.m3103(c1771).mo3078();
                int i3 = (int) (jMo3078 >> 32);
                int i4 = (int) (jMo3078 & 4294967295L);
                long j = c1771.f4997;
                long jM130222 = AbstractC7738.m13022(c1771.mo3066((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM130222 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM130222));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c2225.f6520.mo4039(i, i2, i5, i7);
                }
            }
        }
        return c2225;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo302(View view, C2225 c2225) {
        this.f6161 = new C2225(c2225);
        return m3812(c2225);
    }
}
