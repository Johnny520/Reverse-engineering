package androidx.compose.p001ui.window;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.compose.p001ui.graphics.layer.C2356;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.platform.AbstractC2716;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.C2102;
import androidx.compose.runtime.snapshots.C2110;
import androidx.lifecycle.AbstractC3268;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.util.UUID;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.C8734;
import p221.C8735;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2930 extends AbstractC2716 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final InterfaceC7387 f6551 = new InterfaceC7387() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        public final void invoke(C2930 c2930) {
            if (c2930.isAttachedToWindow()) {
                c2930.m4403();
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2930) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int[] f6552;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f6553;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C2947 f6554;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final InterfaceC2230 f6555;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C2197 f6556;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C8734 f6557;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C2110 f6558;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final Rect f6559;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2932 f6560;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f6561;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final View f6562;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String f6563;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2923 f6564;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC7372 f6565;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC2230 f6566;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final InterfaceC2230 f6567;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public LayoutDirection f6568;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC2933 f6569;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final WindowManager.LayoutParams f6570;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final WindowManager f6571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2930(InterfaceC7372 interfaceC7372, C2923 c2923, String str, View view, InterfaceC8725 interfaceC8725, InterfaceC2933 interfaceC2933, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        C2932 c2935 = i >= 30 ? new C2935() : i >= 29 ? new C2934() : new C2932();
        this.f6565 = interfaceC7372;
        this.f6564 = c2923;
        this.f6563 = str;
        this.f6562 = view;
        this.f6561 = z;
        this.f6560 = c2935;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f6571 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C2923 c29232 = this.f6564;
        boolean zM4394 = AbstractC2924.m4394(view);
        boolean z2 = c29232.f6540;
        int i2 = c29232.f6541;
        if (z2 && zM4394) {
            i2 |= 8192;
        } else if (z2 && !zM4394) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.f6564.f6536;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(C0328R.string.default_popup_window_title));
        this.f6570 = layoutParams;
        this.f6569 = interfaceC2933;
        this.f6568 = LayoutDirection.Ltr;
        this.f6567 = AbstractC2202.m3034(null);
        this.f6566 = AbstractC2202.m3034(null);
        this.f6556 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                InterfaceC2530 parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo3646()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m4399getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.f6559 = new Rect();
        this.f6558 = new C2110(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        setTag(C0328R.id.view_tree_lifecycle_owner, AbstractC3268.m5089(view));
        setTag(C0328R.id.view_tree_view_model_store_owner, AbstractC3268.m5088(view));
        setTag(C0328R.id.view_tree_saved_state_registry_owner, AbstractC3889.m7318(view));
        setTag(C0328R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC8725.mo1904(8.0f));
        setOutlineProvider(new C2356(3));
        this.f6555 = AbstractC2202.m3034(AbstractC2937.f6579);
        this.f6552 = new int[2];
    }

    private final InterfaceC7383 getContent() {
        return (InterfaceC7383) ((AbstractC2182) this.f6555).getValue();
    }

    private final C8734 getDisplayBounds() {
        int i = this.f6564.f6541 & 512;
        View view = this.f6562;
        Rect rect = this.f6559;
        C2932 c2932 = this.f6560;
        if (i == 0) {
            c2932.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c2932.mo4407(rect, view);
        }
        return new C8734(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2530 getParentLayoutCoordinates() {
        return (InterfaceC2530) ((AbstractC2182) this.f6566).getValue();
    }

    private final void setContent(InterfaceC7383 interfaceC7383) {
        ((AbstractC2182) this.f6555).setValue(interfaceC7383);
    }

    private final void setParentLayoutCoordinates(InterfaceC2530 interfaceC2530) {
        ((AbstractC2182) this.f6566).setValue(interfaceC2530);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6564.f6539) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC7372 interfaceC7372 = this.f6565;
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f6556.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f6570;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f6568;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C8735 m4399getPopupContentSizebOM6tXw() {
        return (C8735) ((AbstractC2182) this.f6567).getValue();
    }

    public final InterfaceC2933 getPositionProvider() {
        return this.f6569;
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6553;
    }

    public final String getTestTag() {
        return this.f6563;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.window.飘花落叶言子楪苏哲兰世] */
    @Override // androidx.compose.p001ui.platform.AbstractC2716, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6558.m2805();
        if (!this.f6564.f6539 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f6554 == null) {
            final InterfaceC7372 interfaceC7372 = this.f6565;
            this.f6554 = new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.飘花落叶言子楪苏哲兰世
                public final void onBackInvoked() {
                    InterfaceC7372 interfaceC73722 = interfaceC7372;
                    if (interfaceC73722 != null) {
                        interfaceC73722.invoke();
                    }
                }
            };
        }
        AbstractC2944.m4413(this, this.f6554);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2110 c2110 = this.f6558;
        C2102 c2102 = c2110.f4059;
        if (c2102 != null) {
            c2102.m2785();
        }
        c2110.m2808();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2944.m4412(this, this.f6554);
        }
        this.f6554 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6564.f6538) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC7372 interfaceC7372 = this.f6565;
            if (interfaceC7372 != null) {
                interfaceC7372.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC7372 interfaceC73722 = this.f6565;
            if (interfaceC73722 != null) {
                interfaceC73722.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.f6568 = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4400setPopupContentSizefhxjrPA(C8735 c8735) {
        ((AbstractC2182) this.f6567).setValue(c8735);
    }

    public final void setPositionProvider(InterfaceC2933 interfaceC2933) {
        this.f6569 = interfaceC2933;
    }

    public final void setTestTag(String str) {
        this.f6563 = str;
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4059(InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-857613600);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(c2159, 0);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    this.$tmp0_rcvr.mo4059(interfaceC22082, AbstractC2202.m3031(i | 1));
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4401(InterfaceC7372 interfaceC7372, C2923 c2923, String str, LayoutDirection layoutDirection) {
        this.f6565 = interfaceC7372;
        this.f6563 = str;
        if (!AbstractC5227.m9466(this.f6564, c2923)) {
            c2923.getClass();
            this.f6564 = c2923;
            boolean zM4394 = AbstractC2924.m4394(this.f6562);
            boolean z = c2923.f6540;
            int i = c2923.f6541;
            if (z && zM4394) {
                i |= 8192;
            } else if (z && !zM4394) {
                i &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f6570;
            layoutParams.flags = i;
            this.f6560.getClass();
            this.f6571.updateViewLayout(this, layoutParams);
        }
        int i2 = AbstractC2939.f6585[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            C5043.m9170();
            return;
        }
        super.setLayoutDirection(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4402(AbstractC2207 abstractC2207, InterfaceC7383 interfaceC7383) {
        setParentCompositionContext(abstractC2207);
        setContent(interfaceC7383);
        this.f6553 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4403() {
        C8735 c8735M4399getPopupContentSizebOM6tXw;
        final C8734 c8734 = this.f6557;
        if (c8734 == null || (c8735M4399getPopupContentSizebOM6tXw = m4399getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = c8735M4399getPopupContentSizebOM6tXw.f22224;
        C8734 displayBounds = getDisplayBounds();
        final long j2 = (((long) (displayBounds.f22220 - displayBounds.f22222)) & 4294967295L) | (((long) (displayBounds.f22221 - displayBounds.f22223)) << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        this.f6558.m2806(this, f6551, new InterfaceC7372() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4393invoke() {
                ref$LongRef.element = this.getPositionProvider().mo2186(c8734, j2, this.getParentLayoutDirection(), j);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m4393invoke();
                return C6008.f15084;
            }
        });
        long j3 = ref$LongRef.element;
        WindowManager.LayoutParams layoutParams = this.f6570;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.f6564.f6537;
        C2932 c2932 = this.f6560;
        if (z) {
            c2932.mo4406(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        c2932.getClass();
        this.f6571.updateViewLayout(this, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4404() {
        InterfaceC2530 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo3646()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo3648 = parentLayoutCoordinates.mo3648();
            long jMo3644 = this.f6561 ? parentLayoutCoordinates.mo3644(0L) : parentLayoutCoordinates.mo3642(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo3644 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo3644 & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            C8734 c8734 = new C8734(i, i2, ((int) (jMo3648 >> 32)) + i, ((int) (jMo3648 & 4294967295L)) + i2);
            if (c8734.equals(this.f6557)) {
                return;
            }
            this.f6557 = c8734;
            m4403();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4405(InterfaceC2530 interfaceC2530) {
        setParentLayoutCoordinates(interfaceC2530);
        m4404();
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4060(int i, int i2) {
        this.f6564.getClass();
        C8734 displayBounds = getDisplayBounds();
        super.mo4060(View.MeasureSpec.makeMeasureSpec(displayBounds.f22221 - displayBounds.f22223, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.f22220 - displayBounds.f22222, Integer.MIN_VALUE));
    }

    @Override // androidx.compose.p001ui.platform.AbstractC2716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4061(boolean z, int i, int i2, int i3, int i4) {
        super.mo4061(z, i, i2, i3, i4);
        this.f6564.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f6570;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f6560.getClass();
        this.f6571.updateViewLayout(this, layoutParams);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC2716 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
