package androidx.compose.ui.node;

import android.view.View;
import androidx.appcompat.app.C0113;
import androidx.collection.C0245;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.autofill.C1407;
import androidx.compose.ui.layout.C1661;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1948;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.spatial.C1961;
import androidx.compose.ui.viewinterop.AbstractC2076;
import io.ktor.util.C4210;
import java.util.ArrayList;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1778 implements InterfaceC1356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f5213;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f5214;

    public C1778() {
        this.f5214 = new C0113(24);
        this.f5212 = new C0113(24);
        this.f5213 = new C0113(24);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo939(int i, int i2, int i3) {
        ((C1748) this.f5213).m3221(i, i2, i3);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo940() {
        C1961 rectManager;
        C1407 c1407;
        C1961 rectManager2;
        C1748 c1748 = (C1748) this.f5213;
        C1811 c1811 = c1748.f5093;
        if (!c1748.m3233()) {
            AbstractC7935.m13397("onReuse is only expected on attached node");
        }
        AbstractC2076 abstractC2076 = c1748.f5115;
        if (abstractC2076 != null) {
            View view = abstractC2076.f6168;
            if (view.getParent() != abstractC2076) {
                abstractC2076.addView(view);
            } else {
                abstractC2076.f6166.invoke();
            }
        }
        C1661 c1661 = c1748.f5130;
        if (c1661 != null) {
            c1661.m3061(false);
        }
        c1748.f5110 = false;
        if (c1748.f5125) {
            c1748.f5125 = false;
        } else {
            AbstractC2128 abstractC2128 = c1748.f5093.f5283;
            for (AbstractC2128 abstractC21282 = abstractC2128; abstractC21282 != null; abstractC21282 = abstractC21282.f6283) {
                if (abstractC21282.f6278) {
                    abstractC21282.mo3360();
                }
            }
            for (AbstractC2128 abstractC21283 = abstractC2128; abstractC21283 != null; abstractC21283 = abstractC21283.f6283) {
                if (abstractC21283.f6278) {
                    abstractC21283.mo3355();
                }
            }
            while (abstractC2128 != null) {
                if (abstractC2128.f6278) {
                    abstractC2128.mo3361();
                }
                abstractC2128 = abstractC2128.f6283;
            }
        }
        int i = c1748.f5122;
        InterfaceC1801 interfaceC1801 = c1748.f5104;
        if (interfaceC1801 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).getRectManager()) != null) {
            rectManager2.m3680(c1748);
        }
        c1748.f5122 = AbstractC1948.f5758.addAndGet(1);
        InterfaceC1801 interfaceC18012 = c1748.f5104;
        if (interfaceC18012 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012;
            viewTreeObserverOnGlobalLayoutListenerC1884.m3543getLayoutNodes().m790(i);
            viewTreeObserverOnGlobalLayoutListenerC1884.m3543getLayoutNodes().m789(c1748.f5122, c1748);
        }
        for (AbstractC2128 abstractC21284 = c1811.f5282; abstractC21284 != null; abstractC21284 = abstractC21284.f6287) {
            abstractC21284.mo3352();
        }
        c1811.m3417();
        if (c1811.m3418(8)) {
            c1748.m3235();
        }
        C1748.m3213(c1748);
        InterfaceC1801 interfaceC18013 = c1748.f5104;
        if (interfaceC18013 != null && (c1407 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18013).f5486) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = c1407.f4068;
            C0113 c0113 = c1407.f4069;
            C0245 c0245 = c1407.f4063;
            if (c0245.m780(i)) {
                c0113.m426(viewTreeObserverOnGlobalLayoutListenerC18842, i, false);
            }
            C1956 c1956M3244 = c1748.m3244();
            if (c1956M3244 != null && c1956M3244.f5778.m752(AbstractC1943.f5743)) {
                c0245.m784(c1748.f5122);
                c0113.m426(viewTreeObserverOnGlobalLayoutListenerC18842, c1748.f5122, true);
            }
        }
        InterfaceC1801 interfaceC18014 = c1748.f5104;
        if (interfaceC18014 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18014).getRectManager()) == null) {
            return;
        }
        rectManager.m3676(c1748);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m3317() {
        ((ArrayList) this.f5212).clear();
        this.f5213 = this.f5214;
        ((C1748) this.f5214).m3217();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo941(Object obj) {
        ((ArrayList) this.f5212).add(this.f5213);
        this.f5213 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo942(int i, Object obj) {
        ((C1748) this.f5213).m3227(i, (C1748) obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3318(C1748 c1748, Invalidation invalidation) {
        C0113 c0113 = (C0113) this.f5214;
        C0113 c01132 = (C0113) this.f5212;
        C0113 c01133 = (C0113) this.f5213;
        int i = AbstractC1786.f5223[invalidation.ordinal()];
        if (i == 1) {
            c0113.m440(c1748);
            c01133.m440(c1748);
            return;
        }
        if (i == 2) {
            c01132.m440(c1748);
            c01133.m440(c1748);
            return;
        }
        if (i == 3) {
            if (c1748.f5119 != null) {
                c01133.m440(c1748);
                return;
            } else {
                c0113.m440(c1748);
                return;
            }
        }
        if (i != 4) {
            C4210.m8621();
        } else if (c1748.f5119 != null) {
            c01133.m440(c1748);
        } else {
            c01132.m440(c1748);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean m3319() {
        return !(((SortedSet) ((C0113) this.f5214).f357).isEmpty() && ((SortedSet) ((C0113) this.f5213).f357).isEmpty() && ((SortedSet) ((C0113) this.f5212).f357).isEmpty());
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Object mo944() {
        return this.f5213;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo946() {
        this.f5213 = ((ArrayList) this.f5212).remove(r0.size() - 1);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo947(int i, int i2) {
        ((C1748) this.f5213).m3216(i, i2);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2427() {
        InterfaceC1801 interfaceC1801 = ((C1748) this.f5214).f5104;
        if (interfaceC1801 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3531();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean m3320(C1748 c1748) {
        return !(c1748.f5119 == null) && (((SortedSet) ((C0113) this.f5214).f357).contains(c1748) || ((SortedSet) ((C0113) this.f5212).f357).contains(c1748));
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public /* bridge */ /* synthetic */ void mo949(int i, Object obj) {
    }

    public C1778(C1748 c1748) {
        this.f5214 = c1748;
        this.f5212 = new ArrayList();
        this.f5213 = c1748;
    }
}
