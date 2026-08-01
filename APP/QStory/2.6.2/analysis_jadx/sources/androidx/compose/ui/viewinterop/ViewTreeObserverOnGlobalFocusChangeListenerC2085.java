package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.focus.AbstractC1459;
import androidx.compose.ui.focus.AbstractC1481;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1467;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.InterfaceC1463;
import androidx.compose.ui.focus.InterfaceC1469;
import androidx.compose.ui.focus.InterfaceC1476;
import androidx.compose.ui.focus.InterfaceC1483;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5175;
import p052.InterfaceC6557;
import p112.C7327;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2085 extends AbstractC2128 implements InterfaceC1469, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ViewTreeObserver f6182;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f6184 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1463 interfaceC1463) {
            View viewM3808 = AbstractC2075.m3808(this.this$0);
            if (viewM3808.isFocused() || viewM3808.hasFocus()) {
                return;
            }
            InterfaceC1483 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this.this$0)).getFocusOwner();
            View viewM3327 = AbstractC1785.m3327(this.this$0);
            Integer numM2641 = AbstractC1481.m2641(((C1467) interfaceC1463).f4165);
            int[] iArr = new int[2];
            viewM3327.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            viewM3808.getLocationOnScreen(iArr2);
            C1452 c1452M2597 = AbstractC1459.m2597(((C1478) focusOwner).f4189);
            Rect rect = null;
            C7327 c7327M2619 = c1452M2597 != null ? AbstractC1459.m2619(c1452M2597) : null;
            if (c7327M2619 != null) {
                int i = (int) c7327M2619.f19545;
                int i2 = iArr[0];
                int i3 = iArr2[0];
                int i4 = (int) c7327M2619.f19544;
                int i5 = iArr[1];
                int i6 = iArr2[1];
                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) c7327M2619.f19543) + i2) - i3, (((int) c7327M2619.f19542) + i5) - i6);
            }
            if (AbstractC1481.m2642(viewM3808, numM2641, rect)) {
                return;
            }
            ((C1467) interfaceC1463).f4164 = true;
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1463) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f6183 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1463) obj);
            return C5175.f14739;
        }

        public final void invoke(InterfaceC1463 interfaceC1463) {
            AbstractC2075.m3808(this.this$0);
        }
    };

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (AbstractC1785.m3336(this).f5104 == null) {
            return;
        }
        View viewM3808 = AbstractC2075.m3808(this);
        InterfaceC1483 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getFocusOwner();
        InterfaceC1801 interfaceC1801M3337 = AbstractC1785.m3337(this);
        boolean z2 = true;
        if (view == null || view.equals(interfaceC1801M3337)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM3808.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(interfaceC1801M3337)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM3808.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            C1452 c1452M3818 = m3818();
            if (c1452M3818.m2587().getHasFocus()) {
                return;
            }
            AbstractC1459.m2605(c1452M3818);
            return;
        }
        if (z && m3818().m2587().isFocused()) {
            ((C1478) focusOwner).m2631(8, false, false);
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC1469
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo2623(InterfaceC1476 interfaceC1476) {
        interfaceC1476.mo2624(false);
        interfaceC1476.mo2628(this.f6184);
        interfaceC1476.mo2625(this.f6183);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C1452 m3818() {
        boolean z;
        if (!this.f6291.f6278) {
            AbstractC7935.m13395("visitLocalDescendants called on an unattached node");
        }
        AbstractC2128 abstractC2128 = this.f6291;
        if ((abstractC2128.f6284 & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC2128 abstractC21282 = abstractC2128.f6287; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                if ((abstractC21282.f6290 & 1024) != 0) {
                    AbstractC2128 abstractC2128M3329 = abstractC21282;
                    C1224 c1224 = null;
                    while (abstractC2128M3329 != null) {
                        if (abstractC2128M3329 instanceof C1452) {
                            C1452 c1452 = (C1452) abstractC2128M3329;
                            if (z2) {
                                return c1452;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                            int i = 0;
                            for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21283 != null; abstractC21283 = abstractC21283.f6287) {
                                if ((abstractC21283.f6290 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC2128M3329 = abstractC21283;
                                    } else {
                                        if (c1224 == null) {
                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (abstractC2128M3329 != null) {
                                            c1224.m2037(abstractC2128M3329);
                                            abstractC2128M3329 = null;
                                        }
                                        c1224.m2037(abstractC21283);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2128M3329 = AbstractC1785.m3329(c1224);
                    }
                }
            }
        }
        C5919.m11250("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        ViewTreeObserver viewTreeObserver = this.f6182;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f6182 = null;
        AbstractC1785.m3327(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        ViewTreeObserver viewTreeObserver = AbstractC1785.m3327(this).getViewTreeObserver();
        this.f6182 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
