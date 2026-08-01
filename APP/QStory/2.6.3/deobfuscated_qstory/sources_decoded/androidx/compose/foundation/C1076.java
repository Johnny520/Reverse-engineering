package androidx.compose.foundation;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.foundation.text.selection.C0936;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.node.InterfaceC1782;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5176;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import p112.C7329;
import p205.C7903;
import p205.C7906;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1076 extends AbstractC2128 implements InterfaceC1782, InterfaceC1781, InterfaceC1761, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1362 f3195;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C5190 f3196;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C7906 f3197;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0914 f3198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1080 f3200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC7896 f3201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public View f3202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1083 f3203;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0936 f3204;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC1395 f3199 = AbstractC1367.m2475(null, C1353.f3920);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f3194 = 9205357640488583168L;

    public C1076(C0914 c0914, C0936 c0936, InterfaceC1083 interfaceC1083) {
        this.f3198 = c0914;
        this.f3204 = c0936;
        this.f3203 = interfaceC1083;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1994() {
        InterfaceC7896 interfaceC7896;
        InterfaceC1080 interfaceC1080 = this.f3200;
        if (interfaceC1080 == null || (interfaceC7896 = this.f3201) == null) {
            return;
        }
        C1082 c1082 = (C1082) interfaceC1080;
        if (C7906.m13358(this.f3197, c1082.m1999())) {
            return;
        }
        this.f3204.invoke(new C7903(interfaceC7896.mo1339(AbstractC0455.m1140(c1082.m1999()))));
        this.f3197 = new C7906(c1082.m1999());
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1638(AbstractC1794 abstractC1794) {
        ((AbstractC1347) this.f3199).setValue(abstractC1794);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m1995() {
        if (this.f3195 == null) {
            this.f3195 = AbstractC1367.m2496(new C1078(this, 2));
        }
        C1362 c1362 = this.f3195;
        if (c1362 != null) {
            return ((C7329) c1362.getValue()).f19541;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m1996() {
        InterfaceC7896 interfaceC7896 = this.f3201;
        if (interfaceC7896 == null) {
            interfaceC7896 = AbstractC1785.m3346(this).f5099;
            this.f3201 = interfaceC7896;
        }
        long j = ((C7329) this.f3198.invoke(interfaceC7896)).f19541;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m1995()) == 9205357640488583168L) {
            this.f3194 = 9205357640488583168L;
            InterfaceC1080 interfaceC1080 = this.f3200;
            if (interfaceC1080 != null) {
                ((C1082) interfaceC1080).m2000();
                return;
            }
            return;
        }
        this.f3194 = C7329.m12525(m1995(), j);
        if (this.f3200 == null) {
            m1997();
        }
        InterfaceC1080 interfaceC10802 = this.f3200;
        if (interfaceC10802 != null) {
            interfaceC10802.mo1949(this.f3194, 9205357640488583168L);
        }
        m1994();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m1997() {
        InterfaceC1080 interfaceC1080 = this.f3200;
        if (interfaceC1080 != null) {
            ((C1082) interfaceC1080).m2000();
        }
        View viewM3337 = this.f3202;
        if (viewM3337 == null) {
            viewM3337 = AbstractC1785.m3337(this);
        }
        this.f3202 = viewM3337;
        InterfaceC7896 interfaceC7896 = this.f3201;
        if (interfaceC7896 == null) {
            interfaceC7896 = AbstractC1785.m3346(this).f5099;
        }
        this.f3201 = interfaceC7896;
        this.f3200 = this.f3203.mo1950(viewM3337, interfaceC7896);
        m1994();
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        interfaceC1944.mo3590(AbstractC1075.f3193, new C1078(this, 1));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        InterfaceC1080 interfaceC1080 = this.f3200;
        if (interfaceC1080 != null) {
            ((C1082) interfaceC1080).m2000();
        }
        this.f3200 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        mo1127();
        this.f3196 = AbstractC5205.m10282(0, 7, null);
        AbstractC5399.m10477(m3867(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        AbstractC1785.m3344(this, new C1078(this, 0));
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        ((C1758) interfaceC1506).m3311();
        C5190 c5190 = this.f3196;
        if (c5190 != null) {
            c5190.mo8436(C5176.f14739);
        }
    }
}
