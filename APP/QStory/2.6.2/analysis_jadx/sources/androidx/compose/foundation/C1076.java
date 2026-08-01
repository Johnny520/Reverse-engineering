package androidx.compose.foundation;

import android.view.View;
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
import kotlin.C5175;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import p112.C7328;
import p205.C7902;
import p205.C7905;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1076 extends AbstractC2128 implements InterfaceC1782, InterfaceC1781, InterfaceC1761, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1362 f3194;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C5189 f3195;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C7905 f3196;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0914 f3197;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1080 f3199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC7895 f3200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public View f3201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1083 f3202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0936 f3203;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC1395 f3198 = AbstractC1367.m2466(null, C1353.f3919);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f3193 = 9205357640488583168L;

    public C1076(C0914 c0914, C0936 c0936, InterfaceC1083 interfaceC1083) {
        this.f3197 = c0914;
        this.f3203 = c0936;
        this.f3202 = interfaceC1083;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1984() {
        InterfaceC7895 interfaceC7895;
        InterfaceC1080 interfaceC1080 = this.f3199;
        if (interfaceC1080 == null || (interfaceC7895 = this.f3200) == null) {
            return;
        }
        C1082 c1082 = (C1082) interfaceC1080;
        if (C7905.m13330(this.f3196, c1082.m1989())) {
            return;
        }
        this.f3203.invoke(new C7902(interfaceC7895.mo1329(AbstractC8189.m13654(c1082.m1989()))));
        this.f3196 = new C7905(c1082.m1989());
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1628(AbstractC1794 abstractC1794) {
        ((AbstractC1347) this.f3198).setValue(abstractC1794);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m1985() {
        if (this.f3194 == null) {
            this.f3194 = AbstractC1367.m2486(new C1078(this, 2));
        }
        C1362 c1362 = this.f3194;
        if (c1362 != null) {
            return ((C7328) c1362.getValue()).f19546;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m1986() {
        InterfaceC7895 interfaceC7895 = this.f3200;
        if (interfaceC7895 == null) {
            interfaceC7895 = AbstractC1785.m3336(this).f5098;
            this.f3200 = interfaceC7895;
        }
        long j = ((C7328) this.f3197.invoke(interfaceC7895)).f19546;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m1985()) == 9205357640488583168L) {
            this.f3193 = 9205357640488583168L;
            InterfaceC1080 interfaceC1080 = this.f3199;
            if (interfaceC1080 != null) {
                ((C1082) interfaceC1080).m1990();
                return;
            }
            return;
        }
        this.f3193 = C7328.m12498(m1985(), j);
        if (this.f3199 == null) {
            m1987();
        }
        InterfaceC1080 interfaceC10802 = this.f3199;
        if (interfaceC10802 != null) {
            interfaceC10802.mo1939(this.f3193, 9205357640488583168L);
        }
        m1984();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m1987() {
        InterfaceC1080 interfaceC1080 = this.f3199;
        if (interfaceC1080 != null) {
            ((C1082) interfaceC1080).m1990();
        }
        View viewM3327 = this.f3201;
        if (viewM3327 == null) {
            viewM3327 = AbstractC1785.m3327(this);
        }
        this.f3201 = viewM3327;
        InterfaceC7895 interfaceC7895 = this.f3200;
        if (interfaceC7895 == null) {
            interfaceC7895 = AbstractC1785.m3336(this).f5098;
        }
        this.f3200 = interfaceC7895;
        this.f3199 = this.f3202.mo1940(viewM3327, interfaceC7895);
        m1984();
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        interfaceC1944.mo3580(AbstractC1075.f3192, new C1078(this, 1));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        InterfaceC1080 interfaceC1080 = this.f3199;
        if (interfaceC1080 != null) {
            ((C1082) interfaceC1080).m1990();
        }
        this.f3199 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        mo1126();
        this.f3195 = AbstractC5204.m10278(0, 7, null);
        AbstractC5398.m10473(m3857(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        AbstractC1785.m3334(this, new C1078(this, 0));
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        ((C1758) interfaceC1506).m3301();
        C5189 c5189 = this.f3195;
        if (c5189 != null) {
            c5189.mo8445(C5175.f14739);
        }
    }
}
