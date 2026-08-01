package androidx.compose.ui.window;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.C1267;
import androidx.compose.runtime.snapshots.C1275;
import androidx.compose.ui.graphics.layer.C1521;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.platform.AbstractC1881;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.AbstractC2435;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4210;
import java.util.UUID;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.C7904;
import p205.C7905;
import p205.InterfaceC7895;
import p392.AbstractC9124;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2097 extends AbstractC1881 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final InterfaceC6557 f6205 = new InterfaceC6557() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        public final void invoke(C2097 c2097) {
            if (c2097.isAttachedToWindow()) {
                c2097.m3833();
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2097) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int[] f6206;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f6207;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C2114 f6208;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final InterfaceC1395 f6209;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C1362 f6210;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C7904 f6211;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C1275 f6212;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final Rect f6213;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2099 f6214;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f6215;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final View f6216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String f6217;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C2090 f6218;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC6542 f6219;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC1395 f6220;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final InterfaceC1395 f6221;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public LayoutDirection f6222;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC2100 f6223;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final WindowManager.LayoutParams f6224;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final WindowManager f6225;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2097(InterfaceC6542 interfaceC6542, C2090 c2090, String str, View view, InterfaceC7895 interfaceC7895, InterfaceC2100 interfaceC2100, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        C2099 c2102 = i >= 30 ? new C2102() : i >= 29 ? new C2101() : new C2099();
        this.f6219 = interfaceC6542;
        this.f6218 = c2090;
        this.f6217 = str;
        this.f6216 = view;
        this.f6215 = z;
        this.f6214 = c2102;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f6225 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C2090 c20902 = this.f6218;
        boolean zM3824 = AbstractC2091.m3824(view);
        boolean z2 = c20902.f6194;
        int i2 = c20902.f6195;
        if (z2 && zM3824) {
            i2 |= 8192;
        } else if (z2 && !zM3824) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.f6218.f6190;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f6224 = layoutParams;
        this.f6223 = interfaceC2100;
        this.f6222 = LayoutDirection.Ltr;
        this.f6221 = AbstractC1367.m2465(null);
        this.f6220 = AbstractC1367.m2465(null);
        this.f6210 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                InterfaceC1695 parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo3076()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m3829getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.f6213 = new Rect();
        this.f6212 = new C1275(new PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, AbstractC2435.m4519(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC2435.m4518(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC9124.m14675(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC7895.mo1334(8.0f));
        setOutlineProvider(new C1521(3));
        this.f6209 = AbstractC1367.m2465(AbstractC2104.f6233);
        this.f6206 = new int[2];
    }

    private final InterfaceC6553 getContent() {
        return (InterfaceC6553) ((AbstractC1347) this.f6209).getValue();
    }

    private final C7904 getDisplayBounds() {
        int i = this.f6218.f6195 & 512;
        View view = this.f6216;
        Rect rect = this.f6213;
        C2099 c2099 = this.f6214;
        if (i == 0) {
            c2099.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c2099.mo3837(rect, view);
        }
        return new C7904(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1695 getParentLayoutCoordinates() {
        return (InterfaceC1695) ((AbstractC1347) this.f6220).getValue();
    }

    private final void setContent(InterfaceC6553 interfaceC6553) {
        ((AbstractC1347) this.f6209).setValue(interfaceC6553);
    }

    private final void setParentLayoutCoordinates(InterfaceC1695 interfaceC1695) {
        ((AbstractC1347) this.f6220).setValue(interfaceC1695);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6218.f6193) {
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
                InterfaceC6542 interfaceC6542 = this.f6219;
                if (interfaceC6542 != null) {
                    interfaceC6542.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f6210.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f6224;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f6222;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C7905 m3829getPopupContentSizebOM6tXw() {
        return (C7905) ((AbstractC1347) this.f6221).getValue();
    }

    public final InterfaceC2100 getPositionProvider() {
        return this.f6223;
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6207;
    }

    public final String getTestTag() {
        return this.f6217;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.window.飘花落叶言子楪苏哲兰世] */
    @Override // androidx.compose.ui.platform.AbstractC1881, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6212.m2235();
        if (!this.f6218.f6193 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f6208 == null) {
            final InterfaceC6542 interfaceC6542 = this.f6219;
            this.f6208 = new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.飘花落叶言子楪苏哲兰世
                public final void onBackInvoked() {
                    InterfaceC6542 interfaceC65422 = interfaceC6542;
                    if (interfaceC65422 != null) {
                        interfaceC65422.invoke();
                    }
                }
            };
        }
        AbstractC2111.m3843(this, this.f6208);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1275 c1275 = this.f6212;
        C1267 c1267 = c1275.f3713;
        if (c1267 != null) {
            c1267.m2215();
        }
        c1275.m2238();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2111.m3842(this, this.f6208);
        }
        this.f6208 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6218.f6192) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC6542 interfaceC6542 = this.f6219;
            if (interfaceC6542 != null) {
                interfaceC6542.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC6542 interfaceC65422 = this.f6219;
            if (interfaceC65422 != null) {
                interfaceC65422.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.f6222 = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3830setPopupContentSizefhxjrPA(C7905 c7905) {
        ((AbstractC1347) this.f6221).setValue(c7905);
    }

    public final void setPositionProvider(InterfaceC2100 interfaceC2100) {
        this.f6223 = interfaceC2100;
    }

    public final void setTestTag(String str) {
        this.f6217 = str;
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3489(InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-857613600);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(c1324, 0);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp0_rcvr.mo3489(interfaceC13732, AbstractC1367.m2460(i | 1));
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3831(InterfaceC6542 interfaceC6542, C2090 c2090, String str, LayoutDirection layoutDirection) {
        this.f6219 = interfaceC6542;
        this.f6217 = str;
        if (!AbstractC4394.m8917(this.f6218, c2090)) {
            c2090.getClass();
            this.f6218 = c2090;
            boolean zM3824 = AbstractC2091.m3824(this.f6216);
            boolean z = c2090.f6194;
            int i = c2090.f6195;
            if (z && zM3824) {
                i |= 8192;
            } else if (z && !zM3824) {
                i &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f6224;
            layoutParams.flags = i;
            this.f6214.getClass();
            this.f6225.updateViewLayout(this, layoutParams);
        }
        int i2 = AbstractC2106.f6239[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            C4210.m8621();
            return;
        }
        super.setLayoutDirection(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3832(AbstractC1372 abstractC1372, InterfaceC6553 interfaceC6553) {
        setParentCompositionContext(abstractC1372);
        setContent(interfaceC6553);
        this.f6207 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3833() {
        C7905 c7905M3829getPopupContentSizebOM6tXw;
        final C7904 c7904 = this.f6211;
        if (c7904 == null || (c7905M3829getPopupContentSizebOM6tXw = m3829getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = c7905M3829getPopupContentSizebOM6tXw.f21882;
        C7904 displayBounds = getDisplayBounds();
        final long j2 = (((long) (displayBounds.f21878 - displayBounds.f21880)) & 4294967295L) | (((long) (displayBounds.f21879 - displayBounds.f21881)) << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        this.f6212.m2236(this, f6205, new InterfaceC6542() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3823invoke() {
                ref$LongRef.element = this.getPositionProvider().mo1616(c7904, j2, this.getParentLayoutDirection(), j);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3823invoke();
                return C5175.f14739;
            }
        });
        long j3 = ref$LongRef.element;
        WindowManager.LayoutParams layoutParams = this.f6224;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.f6218.f6191;
        C2099 c2099 = this.f6214;
        if (z) {
            c2099.mo3836(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        c2099.getClass();
        this.f6225.updateViewLayout(this, layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m3834() {
        InterfaceC1695 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo3076()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo3078 = parentLayoutCoordinates.mo3078();
            long jMo3074 = this.f6215 ? parentLayoutCoordinates.mo3074(0L) : parentLayoutCoordinates.mo3072(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo3074 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo3074 & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            C7904 c7904 = new C7904(i, i2, ((int) (jMo3078 >> 32)) + i, ((int) (jMo3078 & 4294967295L)) + i2);
            if (c7904.equals(this.f6211)) {
                return;
            }
            this.f6211 = c7904;
            m3833();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3835(InterfaceC1695 interfaceC1695) {
        setParentLayoutCoordinates(interfaceC1695);
        m3834();
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3490(int i, int i2) {
        this.f6218.getClass();
        C7904 displayBounds = getDisplayBounds();
        super.mo3490(View.MeasureSpec.makeMeasureSpec(displayBounds.f21879 - displayBounds.f21881, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.f21878 - displayBounds.f21880, Integer.MIN_VALUE));
    }

    @Override // androidx.compose.ui.platform.AbstractC1881
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3491(boolean z, int i, int i2, int i3, int i4) {
        super.mo3491(z, i, i2, i3, i4);
        this.f6218.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f6224;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f6214.getClass();
        this.f6225.updateViewLayout(this, layoutParams);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC1881 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
