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
import androidx.window.area.AbstractC2567;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import kotlin.collections.AbstractC4339;
import p176.AbstractC7741;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1969 f2701;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2031 f2702;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C2031 f2703;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f2704;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f2705;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2706;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f2707;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f2708;

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo1873() {
        this.f2703 = AbstractC2048.m3772(this.f2702, AbstractC1785.m3346(this).f5100);
        this.f2706 = true;
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C2031 m1874() {
        C2031 c2031 = this.f2703;
        if (c2031 != null) {
            return c2031;
        }
        AbstractC7741.m13096("Resolved style is not set.");
        C4211.m8602();
        return null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f2703 = null;
        this.f2701 = null;
        this.f2706 = false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3356(this, AbstractC1902.f5590);
        this.f2703 = AbstractC2048.m3772(this.f2702, AbstractC1785.m3346(this).f5100);
        AbstractC1993 abstractC1993 = m1874().f5984.f6053;
        C1988 c1988 = m1874().f5984.f6056;
        if (c1988 == null) {
            c1988 = C1988.f5876;
        }
        C1990 c1990 = m1874().f5984.f6055;
        int i = c1990 != null ? c1990.f5880 : 0;
        C1987 c1987 = m1874().f5984.f6054;
        this.f2701 = ((C1994) interfaceC1996).m3703(abstractC1993, c1988, i, c1987 != null ? c1987.f5870 : Opcodes.MAX_VALUE);
        AbstractC1785.m3344(this, new C0947(this, 0));
        this.f2706 = true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1296() {
        this.f2706 = true;
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        if (this.f2706) {
            C2031 c2031M1874 = m1874();
            InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3356(this, AbstractC1902.f5590);
            String str = AbstractC0996.f2916;
            int iM1916 = (int) (AbstractC0996.m1916(c2031M1874, interfaceC1653, interfaceC1996, str, 1) & 4294967295L);
            int iM19162 = ((int) (AbstractC0996.m1916(c2031M1874, interfaceC1653, interfaceC1996, AbstractC0053.m164('\n', str, str), 2) & 4294967295L)) - iM1916;
            int i = this.f2708;
            this.f2705 = i == 1 ? -1 : AbstractC0053.m143(i, 1, iM19162, iM1916);
            int i2 = this.f2707;
            this.f2704 = i2 == Integer.MAX_VALUE ? -1 : AbstractC0053.m143(i2, 1, iM19162, iM1916);
            this.f2706 = false;
        }
        int i3 = this.f2705;
        int iM5090 = i3 != -1 ? AbstractC2567.m5090(i3, C7898.m13340(j), C7898.m13338(j)) : C7898.m13340(j);
        int i4 = this.f2704;
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(C7898.m13336(0, 0, iM5090, i4 != -1 ? AbstractC2567.m5090(i4, C7898.m13340(j), C7898.m13338(j)) : C7898.m13338(j), 3, j));
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0946(abstractC1724Mo3055, 0));
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        if (this.f2701 != null) {
            AbstractC1785.m3344(this, new C0947(this, 1));
        }
        this.f2706 = true;
        AbstractC1785.m3350(this);
    }
}
