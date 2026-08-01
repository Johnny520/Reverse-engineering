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
import io.ktor.util.C4211;
import java.util.ArrayList;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1778 implements InterfaceC1356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5213;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f5214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f5215;

    public C1778() {
        this.f5215 = new C0113(24);
        this.f5213 = new C0113(24);
        this.f5214 = new C0113(24);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo940(int i, int i2, int i3) {
        ((C1748) this.f5214).m3231(i, i2, i3);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo941() {
        C1961 rectManager;
        C1407 c1407;
        C1961 rectManager2;
        C1748 c1748 = (C1748) this.f5214;
        C1811 c1811 = c1748.f5094;
        if (!c1748.m3243()) {
            AbstractC7936.m13425("onReuse is only expected on attached node");
        }
        AbstractC2076 abstractC2076 = c1748.f5116;
        if (abstractC2076 != null) {
            View view = abstractC2076.f6169;
            if (view.getParent() != abstractC2076) {
                abstractC2076.addView(view);
            } else {
                abstractC2076.f6167.invoke();
            }
        }
        C1661 c1661 = c1748.f5131;
        if (c1661 != null) {
            c1661.m3071(false);
        }
        c1748.f5111 = false;
        if (c1748.f5126) {
            c1748.f5126 = false;
        } else {
            AbstractC2128 abstractC2128 = c1748.f5094.f5284;
            for (AbstractC2128 abstractC21282 = abstractC2128; abstractC21282 != null; abstractC21282 = abstractC21282.f6284) {
                if (abstractC21282.f6279) {
                    abstractC21282.mo3370();
                }
            }
            for (AbstractC2128 abstractC21283 = abstractC2128; abstractC21283 != null; abstractC21283 = abstractC21283.f6284) {
                if (abstractC21283.f6279) {
                    abstractC21283.mo3365();
                }
            }
            while (abstractC2128 != null) {
                if (abstractC2128.f6279) {
                    abstractC2128.mo3371();
                }
                abstractC2128 = abstractC2128.f6284;
            }
        }
        int i = c1748.f5123;
        InterfaceC1801 interfaceC1801 = c1748.f5105;
        if (interfaceC1801 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).getRectManager()) != null) {
            rectManager2.m3690(c1748);
        }
        c1748.f5123 = AbstractC1948.f5759.addAndGet(1);
        InterfaceC1801 interfaceC18012 = c1748.f5105;
        if (interfaceC18012 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18012;
            viewTreeObserverOnGlobalLayoutListenerC1884.m3553getLayoutNodes().m791(i);
            viewTreeObserverOnGlobalLayoutListenerC1884.m3553getLayoutNodes().m790(c1748.f5123, c1748);
        }
        for (AbstractC2128 abstractC21284 = c1811.f5283; abstractC21284 != null; abstractC21284 = abstractC21284.f6288) {
            abstractC21284.mo3362();
        }
        c1811.m3427();
        if (c1811.m3428(8)) {
            c1748.m3245();
        }
        C1748.m3223(c1748);
        InterfaceC1801 interfaceC18013 = c1748.f5105;
        if (interfaceC18013 != null && (c1407 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18013).f5487) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = c1407.f4069;
            C0113 c0113 = c1407.f4070;
            C0245 c0245 = c1407.f4064;
            if (c0245.m781(i)) {
                c0113.m427(viewTreeObserverOnGlobalLayoutListenerC18842, i, false);
            }
            C1956 c1956M3254 = c1748.m3254();
            if (c1956M3254 != null && c1956M3254.f5779.m753(AbstractC1943.f5744)) {
                c0245.m785(c1748.f5123);
                c0113.m427(viewTreeObserverOnGlobalLayoutListenerC18842, c1748.f5123, true);
            }
        }
        InterfaceC1801 interfaceC18014 = c1748.f5105;
        if (interfaceC18014 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC18014).getRectManager()) == null) {
            return;
        }
        rectManager.m3686(c1748);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m3327() {
        ((ArrayList) this.f5213).clear();
        this.f5214 = this.f5215;
        ((C1748) this.f5215).m3227();
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo942(Object obj) {
        ((ArrayList) this.f5213).add(this.f5214);
        this.f5214 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo943(int i, Object obj) {
        ((C1748) this.f5214).m3237(i, (C1748) obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3328(C1748 c1748, Invalidation invalidation) {
        C0113 c0113 = (C0113) this.f5215;
        C0113 c01132 = (C0113) this.f5213;
        C0113 c01133 = (C0113) this.f5214;
        int i = AbstractC1786.f5224[invalidation.ordinal()];
        if (i == 1) {
            c0113.m442(c1748);
            c01133.m442(c1748);
            return;
        }
        if (i == 2) {
            c01132.m442(c1748);
            c01133.m442(c1748);
            return;
        }
        if (i == 3) {
            if (c1748.f5120 != null) {
                c01133.m442(c1748);
                return;
            } else {
                c0113.m442(c1748);
                return;
            }
        }
        if (i != 4) {
            C4211.m8611();
        } else if (c1748.f5120 != null) {
            c01133.m442(c1748);
        } else {
            c01132.m442(c1748);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean m3329() {
        return !(((SortedSet) ((C0113) this.f5215).f357).isEmpty() && ((SortedSet) ((C0113) this.f5214).f357).isEmpty() && ((SortedSet) ((C0113) this.f5213).f357).isEmpty());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean m3330(C1748 c1748) {
        return !(c1748.f5120 == null) && (((SortedSet) ((C0113) this.f5215).f357).contains(c1748) || ((SortedSet) ((C0113) this.f5213).f357).contains(c1748));
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo946() {
        this.f5214 = ((ArrayList) this.f5213).remove(r0.size() - 1);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo947(int i, int i2) {
        ((C1748) this.f5214).m3226(i, i2);
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2437() {
        InterfaceC1801 interfaceC1801 = ((C1748) this.f5215).f5105;
        if (interfaceC1801 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).m3541();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public Object mo948() {
        return this.f5214;
    }

    @Override // androidx.compose.runtime.InterfaceC1356
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public /* bridge */ /* synthetic */ void mo950(int i, Object obj) {
    }

    public C1778(C1748 c1748) {
        this.f5215 = c1748;
        this.f5213 = new ArrayList();
        this.f5214 = c1748;
    }
}
