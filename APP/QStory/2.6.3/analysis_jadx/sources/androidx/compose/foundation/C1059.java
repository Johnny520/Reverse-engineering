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
import p110.C7321;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1059 extends AbstractC1054 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C7321 f3147;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C1643 f3148;

    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1221(C0137 c0137, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0137.f595;
        m1967();
        if (this.f3122 && this.f3120 == null) {
            C1025 c1025 = new C1025(this);
            m3364(c1025);
            this.f3120 = c1025;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3147 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C7321 c7321 = (C7321) arrayList.get(i);
                if (c7321.f19523 && c7321 != this.f3147) {
                    m1975(true);
                    return;
                }
            }
            return;
        }
        if (this.f3147 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0521.m1307((C7321) arrayList.get(i2))) {
                    C7321 c73212 = (C7321) arrayList.get(0);
                    c73212.f19523 = true;
                    this.f3147 = c73212;
                    if (this.f3122) {
                        m1968(c73212);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C7321 c73213 = (C7321) arrayList.get(i3);
            if (c73213.f19523 || !c73213.f19521 || c73213.f19517) {
                float fMo3278 = ((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).mo3278();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C7321 c73214 = (C7321) arrayList.get(i4);
                    long j = c73214.f19518;
                    C7321 c73215 = this.f3147;
                    c73215.getClass();
                    boolean z = Math.abs(C7329.m12527(C7329.m12526(j, c73215.f19518))) > fMo3278;
                    if (c73214.f19523 || z) {
                        m1975(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C7321) arrayList.get(0)).f19523 = true;
        if (this.f3122) {
            C7321 c73216 = this.f3147;
            c73216.getClass();
            m1966(c73216.f19518, true);
            this.f3121.invoke();
        }
        this.f3147 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        super.mo1224();
        m1975(false);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        super.mo1291(c1652, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3148 == null) {
                return;
            }
            List list = c1652.f4852;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1643 c1643 = (C1643) list.get(i);
                if (c1643.m3022() && c1643 != this.f3148) {
                    m1975(false);
                    return;
                }
            }
            return;
        }
        if (this.f3148 == null) {
            if (AbstractC0503.m1278(c1652, true, false)) {
                C1643 c16432 = (C1643) c1652.f4852.get(0);
                c16432.m3024();
                this.f3148 = c16432;
                if (this.f3122) {
                    m1965(c16432);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = c1652.f4852;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC1646.m3028((C1643) list2.get(i2))) {
                long jM1969 = m1969(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C1643 c16433 = (C1643) list2.get(i3);
                    if (c16433.m3022() || AbstractC1646.m3025(c16433, j, jM1969)) {
                        m1975(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C1643) list2.get(0)).m3024();
        if (this.f3122) {
            C1643 c16434 = this.f3148;
            c16434.getClass();
            m1966(c16434.f4807, false);
            this.f3121.invoke();
        }
        this.f3148 = null;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final boolean mo1929(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m1975(boolean z) {
        if (z) {
            this.f3147 = null;
        } else {
            this.f3148 = null;
        }
        m1970(z);
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final void mo1935(KeyEvent keyEvent) {
        this.f3121.invoke();
    }

    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1234() {
        m1975(true);
    }
}
