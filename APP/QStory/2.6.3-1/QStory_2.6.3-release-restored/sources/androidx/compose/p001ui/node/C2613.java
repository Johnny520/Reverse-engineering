package androidx.compose.p001ui.node;

import android.view.View;
import androidx.appcompat.app.C0960;
import androidx.collection.C1092;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.autofill.C2242;
import androidx.compose.p001ui.layout.C2496;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.spatial.C2796;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import androidx.compose.runtime.InterfaceC2191;
import io.ktor.util.C5043;
import java.util.ArrayList;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2613 implements InterfaceC2191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f5558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f5559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f5560;

    public C2613() {
        this.f5560 = new C0960(24);
        this.f5558 = new C0960(24);
        this.f5559 = new C0960(24);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo1500(int i, int i2, int i3) {
        ((C2583) this.f5559).m3791(i, i2, i3);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo1501() {
        C2796 rectManager;
        C2242 c2242;
        C2796 rectManager2;
        C2583 c2583 = (C2583) this.f5559;
        C2646 c2646 = c2583.f5439;
        if (!c2583.m3803()) {
            AbstractC8765.m13984("onReuse is only expected on attached node");
        }
        AbstractC2909 abstractC2909 = c2583.f5461;
        if (abstractC2909 != null) {
            View view = abstractC2909.f6514;
            if (view.getParent() != abstractC2909) {
                abstractC2909.addView(view);
            } else {
                abstractC2909.f6512.invoke();
            }
        }
        C2496 c2496 = c2583.f5476;
        if (c2496 != null) {
            c2496.m3631(false);
        }
        c2583.f5456 = false;
        if (c2583.f5471) {
            c2583.f5471 = false;
        } else {
            AbstractC2961 abstractC2961 = c2583.f5439.f5629;
            for (AbstractC2961 abstractC29612 = abstractC2961; abstractC29612 != null; abstractC29612 = abstractC29612.f6629) {
                if (abstractC29612.f6624) {
                    abstractC29612.mo3930();
                }
            }
            for (AbstractC2961 abstractC29613 = abstractC2961; abstractC29613 != null; abstractC29613 = abstractC29613.f6629) {
                if (abstractC29613.f6624) {
                    abstractC29613.mo3925();
                }
            }
            while (abstractC2961 != null) {
                if (abstractC2961.f6624) {
                    abstractC2961.mo3931();
                }
                abstractC2961 = abstractC2961.f6629;
            }
        }
        int i = c2583.f5468;
        InterfaceC2636 interfaceC2636 = c2583.f5450;
        if (interfaceC2636 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).getRectManager()) != null) {
            rectManager2.m4250(c2583);
        }
        c2583.f5468 = AbstractC2783.f6104.addAndGet(1);
        InterfaceC2636 interfaceC26362 = c2583.f5450;
        if (interfaceC26362 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26362;
            viewTreeObserverOnGlobalLayoutListenerC2719.m4113getLayoutNodes().m1351(i);
            viewTreeObserverOnGlobalLayoutListenerC2719.m4113getLayoutNodes().m1350(c2583.f5468, c2583);
        }
        for (AbstractC2961 abstractC29614 = c2646.f5628; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
            abstractC29614.mo3922();
        }
        c2646.m3987();
        if (c2646.m3988(8)) {
            c2583.m3805();
        }
        C2583.m3783(c2583);
        InterfaceC2636 interfaceC26363 = c2583.f5450;
        if (interfaceC26363 != null && (c2242 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26363).f5832) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = c2242.f4414;
            C0960 c0960 = c2242.f4415;
            C1092 c1092 = c2242.f4409;
            if (c1092.m1341(i)) {
                c0960.m987(viewTreeObserverOnGlobalLayoutListenerC27192, i, false);
            }
            C2791 c2791M3814 = c2583.m3814();
            if (c2791M3814 != null && c2791M3814.f6124.m1313(AbstractC2778.f6089)) {
                c1092.m1345(c2583.f5468);
                c0960.m987(viewTreeObserverOnGlobalLayoutListenerC27192, c2583.f5468, true);
            }
        }
        InterfaceC2636 interfaceC26364 = c2583.f5450;
        if (interfaceC26364 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC26364).getRectManager()) == null) {
            return;
        }
        rectManager.m4246(c2583);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m3887() {
        ((ArrayList) this.f5558).clear();
        this.f5559 = this.f5560;
        ((C2583) this.f5560).m3787();
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1502(Object obj) {
        ((ArrayList) this.f5558).add(this.f5559);
        this.f5559 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1503(int i, Object obj) {
        ((C2583) this.f5559).m3797(i, (C2583) obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3888(C2583 c2583, Invalidation invalidation) {
        C0960 c0960 = (C0960) this.f5560;
        C0960 c09602 = (C0960) this.f5558;
        C0960 c09603 = (C0960) this.f5559;
        int i = AbstractC2621.f5569[invalidation.ordinal()];
        if (i == 1) {
            c0960.m1002(c2583);
            c09603.m1002(c2583);
            return;
        }
        if (i == 2) {
            c09602.m1002(c2583);
            c09603.m1002(c2583);
            return;
        }
        if (i == 3) {
            if (c2583.f5465 != null) {
                c09603.m1002(c2583);
                return;
            } else {
                c0960.m1002(c2583);
                return;
            }
        }
        if (i != 4) {
            C5043.m9170();
        } else if (c2583.f5465 != null) {
            c09603.m1002(c2583);
        } else {
            c09602.m1002(c2583);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean m3889() {
        return !(((SortedSet) ((C0960) this.f5560).f702).isEmpty() && ((SortedSet) ((C0960) this.f5559).f702).isEmpty() && ((SortedSet) ((C0960) this.f5558).f702).isEmpty());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean m3890(C2583 c2583) {
        return !(c2583.f5465 == null) && (((SortedSet) ((C0960) this.f5560).f702).contains(c2583) || ((SortedSet) ((C0960) this.f5558).f702).contains(c2583));
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo1506() {
        this.f5559 = ((ArrayList) this.f5558).remove(r0.size() - 1);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo1507(int i, int i2) {
        ((C2583) this.f5559).m3786(i, i2);
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo2997() {
        InterfaceC2636 interfaceC2636 = ((C2583) this.f5560).f5450;
        if (interfaceC2636 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).m4101();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public Object mo1508() {
        return this.f5559;
    }

    @Override // androidx.compose.runtime.InterfaceC2191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public /* bridge */ /* synthetic */ void mo1510(int i, Object obj) {
    }

    public C2613(C2583 c2583) {
        this.f5560 = c2583;
        this.f5558 = new ArrayList();
        this.f5559 = c2583;
    }
}
