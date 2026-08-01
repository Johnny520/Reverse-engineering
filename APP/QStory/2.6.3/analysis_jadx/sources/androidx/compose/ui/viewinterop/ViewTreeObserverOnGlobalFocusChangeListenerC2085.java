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
import kotlin.C5176;
import p052.InterfaceC6558;
import p112.C7328;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2085 extends AbstractC2128 implements InterfaceC1469, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ViewTreeObserver f6183;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f6185 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1463 interfaceC1463) {
            View viewM3818 = AbstractC2075.m3818(this.this$0);
            if (viewM3818.isFocused() || viewM3818.hasFocus()) {
                return;
            }
            InterfaceC1483 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this.this$0)).getFocusOwner();
            View viewM3337 = AbstractC1785.m3337(this.this$0);
            Integer numM2651 = AbstractC1481.m2651(((C1467) interfaceC1463).f4166);
            int[] iArr = new int[2];
            viewM3337.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            viewM3818.getLocationOnScreen(iArr2);
            C1452 c1452M2607 = AbstractC1459.m2607(((C1478) focusOwner).f4190);
            Rect rect = null;
            C7328 c7328M2629 = c1452M2607 != null ? AbstractC1459.m2629(c1452M2607) : null;
            if (c7328M2629 != null) {
                int i = (int) c7328M2629.f19540;
                int i2 = iArr[0];
                int i3 = iArr2[0];
                int i4 = (int) c7328M2629.f19539;
                int i5 = iArr[1];
                int i6 = iArr2[1];
                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) c7328M2629.f19538) + i2) - i3, (((int) c7328M2629.f19537) + i5) - i6);
            }
            if (AbstractC1481.m2652(viewM3818, numM2651, rect)) {
                return;
            }
            ((C1467) interfaceC1463).f4165 = true;
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1463) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f6184 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1463) obj);
            return C5176.f14739;
        }

        public final void invoke(InterfaceC1463 interfaceC1463) {
            AbstractC2075.m3818(this.this$0);
        }
    };

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (AbstractC1785.m3346(this).f5105 == null) {
            return;
        }
        View viewM3818 = AbstractC2075.m3818(this);
        InterfaceC1483 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getFocusOwner();
        InterfaceC1801 interfaceC1801M3347 = AbstractC1785.m3347(this);
        boolean z2 = true;
        if (view == null || view.equals(interfaceC1801M3347)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM3818.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(interfaceC1801M3347)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM3818.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            C1452 c1452M3828 = m3828();
            if (c1452M3828.m2597().getHasFocus()) {
                return;
            }
            AbstractC1459.m2615(c1452M3828);
            return;
        }
        if (z && m3828().m2597().isFocused()) {
            ((C1478) focusOwner).m2641(8, false, false);
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC1469
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo2633(InterfaceC1476 interfaceC1476) {
        interfaceC1476.mo2634(false);
        interfaceC1476.mo2638(this.f6185);
        interfaceC1476.mo2635(this.f6184);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C1452 m3828() {
        boolean z;
        if (!this.f6292.f6279) {
            AbstractC7936.m13423("visitLocalDescendants called on an unattached node");
        }
        AbstractC2128 abstractC2128 = this.f6292;
        if ((abstractC2128.f6285 & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC2128 abstractC21282 = abstractC2128.f6288; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                if ((abstractC21282.f6291 & 1024) != 0) {
                    AbstractC2128 abstractC2128M3339 = abstractC21282;
                    C1224 c1224 = null;
                    while (abstractC2128M3339 != null) {
                        if (abstractC2128M3339 instanceof C1452) {
                            C1452 c1452 = (C1452) abstractC2128M3339;
                            if (z2) {
                                return c1452;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                            int i = 0;
                            for (AbstractC2128 abstractC21283 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21283 != null; abstractC21283 = abstractC21283.f6288) {
                                if ((abstractC21283.f6291 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC2128M3339 = abstractC21283;
                                    } else {
                                        if (c1224 == null) {
                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                        }
                                        if (abstractC2128M3339 != null) {
                                            c1224.m2047(abstractC2128M3339);
                                            abstractC2128M3339 = null;
                                        }
                                        c1224.m2047(abstractC21283);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2128M3339 = AbstractC1785.m3339(c1224);
                    }
                }
            }
        }
        C5925.m11311("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        ViewTreeObserver viewTreeObserver = this.f6183;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f6183 = null;
        AbstractC1785.m3337(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        ViewTreeObserver viewTreeObserver = AbstractC1785.m3337(this).getViewTreeObserver();
        this.f6183 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
