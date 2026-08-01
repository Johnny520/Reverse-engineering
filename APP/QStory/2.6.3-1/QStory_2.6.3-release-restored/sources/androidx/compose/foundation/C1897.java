package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.appcompat.widget.C0984;
import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import java.util.ArrayList;
import java.util.List;
import p126.C8150;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1897 extends AbstractC1892 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C8150 f3492;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C2478 f3493;

    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1781(C0984 c0984, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0984.f940;
        m2527();
        if (this.f3467 && this.f3465 == null) {
            C1863 c1863 = new C1863(this);
            m3924(c1863);
            this.f3465 = c1863;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3492 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C8150 c8150 = (C8150) arrayList.get(i);
                if (c8150.f19868 && c8150 != this.f3492) {
                    m2535(true);
                    return;
                }
            }
            return;
        }
        if (this.f3492 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC1362.m1867((C8150) arrayList.get(i2))) {
                    C8150 c81502 = (C8150) arrayList.get(0);
                    c81502.f19868 = true;
                    this.f3492 = c81502;
                    if (this.f3467) {
                        m2528(c81502);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C8150 c81503 = (C8150) arrayList.get(i3);
            if (c81503.f19868 || !c81503.f19866 || c81503.f19862) {
                float fMo3838 = ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).mo3838();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C8150 c81504 = (C8150) arrayList.get(i4);
                    long j = c81504.f19863;
                    C8150 c81505 = this.f3492;
                    c81505.getClass();
                    boolean z = Math.abs(C8158.m13086(C8158.m13085(j, c81505.f19863))) > fMo3838;
                    if (c81504.f19868 || z) {
                        m2535(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C8150) arrayList.get(0)).f19868 = true;
        if (this.f3467) {
            C8150 c81506 = this.f3492;
            c81506.getClass();
            m2526(c81506.f19863, true);
            this.f3466.invoke();
        }
        this.f3492 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1892, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        super.mo1784();
        m2535(false);
    }

    @Override // androidx.compose.foundation.AbstractC1892, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        super.mo1851(c2487, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3493 == null) {
                return;
            }
            List list = c2487.f5197;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2478 c2478 = (C2478) list.get(i);
                if (c2478.m3582() && c2478 != this.f3493) {
                    m2535(false);
                    return;
                }
            }
            return;
        }
        if (this.f3493 == null) {
            if (AbstractC1344.m1838(c2487, true, false)) {
                C2478 c24782 = (C2478) c2487.f5197.get(0);
                c24782.m3584();
                this.f3493 = c24782;
                if (this.f3467) {
                    m2525(c24782);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = c2487.f5197;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC2481.m3588((C2478) list2.get(i2))) {
                long jM2529 = m2529(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C2478 c24783 = (C2478) list2.get(i3);
                    if (c24783.m3582() || AbstractC2481.m3585(c24783, j, jM2529)) {
                        m2535(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C2478) list2.get(0)).m3584();
        if (this.f3467) {
            C2478 c24784 = this.f3493;
            c24784.getClass();
            m2526(c24784.f5152, false);
            this.f3466.invoke();
        }
        this.f3493 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final boolean mo2489(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m2535(boolean z) {
        if (z) {
            this.f3492 = null;
        } else {
            this.f3493 = null;
        }
        m2530(z);
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo2495(KeyEvent keyEvent) {
        this.f3466.invoke();
    }

    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1794() {
        m2535(true);
    }
}
