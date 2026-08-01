package androidx.compose.p001ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.focus.AbstractC2294;
import androidx.compose.p001ui.focus.AbstractC2316;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.C2302;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.InterfaceC2298;
import androidx.compose.p001ui.focus.InterfaceC2304;
import androidx.compose.p001ui.focus.InterfaceC2311;
import androidx.compose.p001ui.focus.InterfaceC2318;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import kotlin.C6008;
import p068.InterfaceC7387;
import p128.C8157;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2918 extends AbstractC2961 implements InterfaceC2304, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ViewTreeObserver f6528;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f6530 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        public final void invoke(InterfaceC2298 interfaceC2298) {
            View viewM4378 = AbstractC2908.m4378(this.this$0);
            if (viewM4378.isFocused() || viewM4378.hasFocus()) {
                return;
            }
            InterfaceC2318 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this.this$0)).getFocusOwner();
            View viewM3897 = AbstractC2620.m3897(this.this$0);
            Integer numM3211 = AbstractC2316.m3211(((C2302) interfaceC2298).f4511);
            int[] iArr = new int[2];
            viewM3897.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            viewM4378.getLocationOnScreen(iArr2);
            C2287 c2287M3167 = AbstractC2294.m3167(((C2313) focusOwner).f4535);
            Rect rect = null;
            C8157 c8157M3189 = c2287M3167 != null ? AbstractC2294.m3189(c2287M3167) : null;
            if (c8157M3189 != null) {
                int i = (int) c8157M3189.f19885;
                int i2 = iArr[0];
                int i3 = iArr2[0];
                int i4 = (int) c8157M3189.f19884;
                int i5 = iArr[1];
                int i6 = iArr2[1];
                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) c8157M3189.f19883) + i2) - i3, (((int) c8157M3189.f19882) + i5) - i6);
            }
            if (AbstractC2316.m3212(viewM4378, numM3211, rect)) {
                return;
            }
            ((C2302) interfaceC2298).f4510 = true;
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2298) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f6529 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2298) obj);
            return C6008.f15084;
        }

        public final void invoke(InterfaceC2298 interfaceC2298) {
            AbstractC2908.m4378(this.this$0);
        }
    };

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (AbstractC2620.m3906(this).f5450 == null) {
            return;
        }
        View viewM4378 = AbstractC2908.m4378(this);
        InterfaceC2318 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getFocusOwner();
        InterfaceC2636 interfaceC2636M3907 = AbstractC2620.m3907(this);
        boolean z2 = true;
        if (view == null || view.equals(interfaceC2636M3907)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM4378.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(interfaceC2636M3907)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM4378.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            C2287 c2287M4388 = m4388();
            if (c2287M4388.m3157().getHasFocus()) {
                return;
            }
            AbstractC2294.m3175(c2287M4388);
            return;
        }
        if (z && m4388().m3157().isFocused()) {
            ((C2313) focusOwner).m3201(8, false, false);
        }
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2304
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo3193(InterfaceC2311 interfaceC2311) {
        interfaceC2311.mo3194(false);
        interfaceC2311.mo3198(this.f6530);
        interfaceC2311.mo3195(this.f6529);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C2287 m4388() {
        boolean z;
        if (!this.f6637.f6624) {
            AbstractC8765.m13982("visitLocalDescendants called on an unattached node");
        }
        AbstractC2961 abstractC2961 = this.f6637;
        if ((abstractC2961.f6630 & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC2961 abstractC29612 = abstractC2961.f6633; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                if ((abstractC29612.f6636 & 1024) != 0) {
                    AbstractC2961 abstractC2961M3899 = abstractC29612;
                    C2059 c2059 = null;
                    while (abstractC2961M3899 != null) {
                        if (abstractC2961M3899 instanceof C2287) {
                            C2287 c2287 = (C2287) abstractC2961M3899;
                            if (z2) {
                                return c2287;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                            int i = 0;
                            for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                if ((abstractC29613.f6636 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC2961M3899 = abstractC29613;
                                    } else {
                                        if (c2059 == null) {
                                            c2059 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (abstractC2961M3899 != null) {
                                            c2059.m2607(abstractC2961M3899);
                                            abstractC2961M3899 = null;
                                        }
                                        c2059.m2607(abstractC29613);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2961M3899 = AbstractC2620.m3899(c2059);
                    }
                }
            }
        }
        C6755.m11870("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        ViewTreeObserver viewTreeObserver = this.f6528;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f6528 = null;
        AbstractC2620.m3897(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        ViewTreeObserver viewTreeObserver = AbstractC2620.m3897(this).getViewTreeObserver();
        this.f6528 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
