package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.C1994;
import androidx.compose.ui.text.font.InterfaceC1996;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4210;
import kotlin.collections.AbstractC4338;
import p000.AbstractC6087;
import p176.AbstractC7740;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1969 f2700;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2031 f2701;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C2031 f2702;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f2703;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f2704;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2705;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f2706;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f2707;

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo1863() {
        this.f2702 = AbstractC2048.m3762(this.f2701, AbstractC1785.m3336(this).f5099);
        this.f2705 = true;
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C2031 m1864() {
        C2031 c2031 = this.f2702;
        if (c2031 != null) {
            return c2031;
        }
        AbstractC7740.m13068("Resolved style is not set.");
        C4210.m8612();
        return null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        this.f2702 = null;
        this.f2700 = null;
        this.f2705 = false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3346(this, AbstractC1902.f5589);
        this.f2702 = AbstractC2048.m3762(this.f2701, AbstractC1785.m3336(this).f5099);
        AbstractC1993 abstractC1993 = m1864().f5983.f6052;
        C1988 c1988 = m1864().f5983.f6055;
        if (c1988 == null) {
            c1988 = C1988.f5875;
        }
        C1990 c1990 = m1864().f5983.f6054;
        int i = c1990 != null ? c1990.f5879 : 0;
        C1987 c1987 = m1864().f5983.f6053;
        this.f2700 = ((C1994) interfaceC1996).m3693(abstractC1993, c1988, i, c1987 != null ? c1987.f5869 : Opcodes.MAX_VALUE);
        AbstractC1785.m3334(this, new C0947(this, 0));
        this.f2705 = true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1286() {
        this.f2705 = true;
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        if (this.f2705) {
            C2031 c2031M1864 = m1864();
            InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3346(this, AbstractC1902.f5589);
            String str = AbstractC0996.f2915;
            int iM1906 = (int) (AbstractC0996.m1906(c2031M1864, interfaceC1653, interfaceC1996, str, 1) & 4294967295L);
            int iM19062 = ((int) (AbstractC0996.m1906(c2031M1864, interfaceC1653, interfaceC1996, AbstractC0053.m163('\n', str, str), 2) & 4294967295L)) - iM1906;
            int i = this.f2707;
            this.f2704 = i == 1 ? -1 : AbstractC0053.m142(i, 1, iM19062, iM1906);
            int i2 = this.f2706;
            this.f2703 = i2 == Integer.MAX_VALUE ? -1 : AbstractC0053.m142(i2, 1, iM19062, iM1906);
            this.f2705 = false;
        }
        int i3 = this.f2704;
        int iM11420 = i3 != -1 ? AbstractC6087.m11420(i3, C7897.m13312(j), C7897.m13310(j)) : C7897.m13312(j);
        int i4 = this.f2703;
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(C7897.m13308(0, 0, iM11420, i4 != -1 ? AbstractC6087.m11420(i4, C7897.m13312(j), C7897.m13310(j)) : C7897.m13310(j), 3, j));
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C0946(abstractC1724Mo3045, 0));
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        if (this.f2700 != null) {
            AbstractC1785.m3334(this, new C0947(this, 1));
        }
        this.f2705 = true;
        AbstractC1785.m3340(this);
    }
}
