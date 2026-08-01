package androidx.compose.foundation.text;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2047;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.C1994;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p176.AbstractC7741;
import p205.AbstractC7897;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0999 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2031 f2931;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0997 f2932;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1969 f2933;

    public C0999(C2031 c2031) {
        this.f2931 = c2031;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1873() {
        C0997 c0997 = this.f2932;
        if (c0997 != null) {
            C0997.m1917(c0997, AbstractC1785.m3346(this).f5100, null, null, 30);
        }
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1920(C2031 c2031, InterfaceC1996 interfaceC1996) {
        C2047 c2047 = c2031.f5984;
        AbstractC1993 abstractC1993 = c2047.f6053;
        C1988 c1988 = c2047.f6056;
        if (c1988 == null) {
            c1988 = C1988.f5876;
        }
        C1990 c1990 = c2047.f6055;
        int i = c1990 != null ? c1990.f5880 : 0;
        C1987 c1987 = c2047.f6054;
        this.f2933 = ((C1994) interfaceC1996).m3703(abstractC1993, c1988, i, c1987 != null ? c1987.f5870 : Opcodes.MAX_VALUE);
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f2933 = null;
        this.f2932 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        C2031 c2031M3772 = AbstractC2048.m3772(this.f2931, AbstractC1785.m3346(this).f5100);
        InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3356(this, AbstractC1902.f5590);
        m1920(c2031M3772, interfaceC1996);
        LayoutDirection layoutDirection = AbstractC1785.m3346(this).f5100;
        InterfaceC7896 interfaceC7896 = AbstractC1785.m3346(this).f5099;
        C1969 c1969 = this.f2933;
        if (c1969 != null) {
            this.f2932 = new C0997(layoutDirection, interfaceC7896, interfaceC1996, c2031M3772, c1969.f5852);
        } else {
            AbstractC7741.m13096("Font resolution state is not set.");
            C4211.m8602();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1296() {
        C0997 c0997 = this.f2932;
        if (c0997 != null) {
            C0997.m1917(c0997, null, AbstractC1785.m3346(this).f5099, null, 29);
        }
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        C0997 c0997 = this.f2932;
        if (c0997 == null) {
            AbstractC7741.m13096("Min size state is not set.");
            C4211.m8602();
            return null;
        }
        InterfaceC1395 interfaceC1395 = c0997.f2917;
        C1969 c1969 = this.f2933;
        if (c1969 == null) {
            AbstractC7741.m13096("Font resolution state is not set.");
            C4211.m8602();
            return null;
        }
        Object obj = c1969.f5852;
        if (!AbstractC4395.m8907(obj, c0997.f2918)) {
            c0997.f2918 = obj;
            ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
            c0997.f2923 = AbstractC0996.m1916(c0997.f2919, c0997.f2921, c0997.f2920, AbstractC0996.f2916, 1);
            ((AbstractC1347) interfaceC1395).setValue(Boolean.FALSE);
        }
        long j2 = c0997.f2923;
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13321(j, AbstractC7897.m13324((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0946(abstractC1724Mo3055, 1));
    }
}
