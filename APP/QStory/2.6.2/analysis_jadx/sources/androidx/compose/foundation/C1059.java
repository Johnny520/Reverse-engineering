package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.appcompat.widget.C0137;
import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import java.util.ArrayList;
import java.util.List;
import p110.C7320;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C1059 extends AbstractC1054 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C7320 f3146;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C1643 f3147;

    @Override // p110.InterfaceC7319
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1211(C0137 c0137, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0137.f595;
        m1957();
        if (this.f3121 && this.f3119 == null) {
            C1025 c1025 = new C1025(this);
            m3354(c1025);
            this.f3119 = c1025;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3146 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C7320 c7320 = (C7320) arrayList.get(i);
                if (c7320.f19528 && c7320 != this.f3146) {
                    m1965(true);
                    return;
                }
            }
            return;
        }
        if (this.f3146 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0521.m1297((C7320) arrayList.get(i2))) {
                    C7320 c73202 = (C7320) arrayList.get(0);
                    c73202.f19528 = true;
                    this.f3146 = c73202;
                    if (this.f3121) {
                        m1958(c73202);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C7320 c73203 = (C7320) arrayList.get(i3);
            if (c73203.f19528 || !c73203.f19526 || c73203.f19522) {
                float fMo3268 = ((InterfaceC1863) AbstractC1785.m3346(this, AbstractC1902.f5575)).mo3268();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C7320 c73204 = (C7320) arrayList.get(i4);
                    long j = c73204.f19523;
                    C7320 c73205 = this.f3146;
                    c73205.getClass();
                    boolean z = Math.abs(C7328.m12500(C7328.m12499(j, c73205.f19523))) > fMo3268;
                    if (c73204.f19528 || z) {
                        m1965(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C7320) arrayList.get(0)).f19528 = true;
        if (this.f3121) {
            C7320 c73206 = this.f3146;
            c73206.getClass();
            m1956(c73206.f19523, true);
            this.f3120.invoke();
        }
        this.f3146 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        super.mo1214();
        m1965(false);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        super.mo1281(c1652, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3147 == null) {
                return;
            }
            List list = c1652.f4851;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1643 c1643 = (C1643) list.get(i);
                if (c1643.m3012() && c1643 != this.f3147) {
                    m1965(false);
                    return;
                }
            }
            return;
        }
        if (this.f3147 == null) {
            if (AbstractC0503.m1268(c1652, true, false)) {
                C1643 c16432 = (C1643) c1652.f4851.get(0);
                c16432.m3014();
                this.f3147 = c16432;
                if (this.f3121) {
                    m1955(c16432);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = c1652.f4851;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC1646.m3018((C1643) list2.get(i2))) {
                long jM1959 = m1959(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C1643 c16433 = (C1643) list2.get(i3);
                    if (c16433.m3012() || AbstractC1646.m3015(c16433, j, jM1959)) {
                        m1965(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C1643) list2.get(0)).m3014();
        if (this.f3121) {
            C1643 c16434 = this.f3147;
            c16434.getClass();
            m1956(c16434.f4806, false);
            this.f3120.invoke();
        }
        this.f3147 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final boolean mo1919(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m1965(boolean z) {
        if (z) {
            this.f3146 = null;
        } else {
            this.f3147 = null;
        }
        m1960(z);
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo1925(KeyEvent keyEvent) {
        this.f3120.invoke();
    }

    @Override // p110.InterfaceC7319
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1224() {
        m1965(true);
    }
}
