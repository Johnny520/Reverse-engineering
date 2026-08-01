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
import io.ktor.util.C4210;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p176.AbstractC7740;
import p205.AbstractC7896;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0999 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2031 f2930;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0997 f2931;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1969 f2932;

    public C0999(C2031 c2031) {
        this.f2930 = c2031;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1863() {
        C0997 c0997 = this.f2931;
        if (c0997 != null) {
            C0997.m1907(c0997, AbstractC1785.m3336(this).f5099, null, null, 30);
        }
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1910(C2031 c2031, InterfaceC1996 interfaceC1996) {
        C2047 c2047 = c2031.f5983;
        AbstractC1993 abstractC1993 = c2047.f6052;
        C1988 c1988 = c2047.f6055;
        if (c1988 == null) {
            c1988 = C1988.f5875;
        }
        C1990 c1990 = c2047.f6054;
        int i = c1990 != null ? c1990.f5879 : 0;
        C1987 c1987 = c2047.f6053;
        this.f2932 = ((C1994) interfaceC1996).m3693(abstractC1993, c1988, i, c1987 != null ? c1987.f5869 : Opcodes.MAX_VALUE);
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        this.f2932 = null;
        this.f2931 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        C2031 c2031M3762 = AbstractC2048.m3762(this.f2930, AbstractC1785.m3336(this).f5099);
        InterfaceC1996 interfaceC1996 = (InterfaceC1996) AbstractC1785.m3346(this, AbstractC1902.f5589);
        m1910(c2031M3762, interfaceC1996);
        LayoutDirection layoutDirection = AbstractC1785.m3336(this).f5099;
        InterfaceC7895 interfaceC7895 = AbstractC1785.m3336(this).f5098;
        C1969 c1969 = this.f2932;
        if (c1969 != null) {
            this.f2931 = new C0997(layoutDirection, interfaceC7895, interfaceC1996, c2031M3762, c1969.f5851);
        } else {
            AbstractC7740.m13068("Font resolution state is not set.");
            C4210.m8612();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1286() {
        C0997 c0997 = this.f2931;
        if (c0997 != null) {
            C0997.m1907(c0997, null, AbstractC1785.m3336(this).f5098, null, 29);
        }
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        C0997 c0997 = this.f2931;
        if (c0997 == null) {
            AbstractC7740.m13068("Min size state is not set.");
            C4210.m8612();
            return null;
        }
        InterfaceC1395 interfaceC1395 = c0997.f2916;
        C1969 c1969 = this.f2932;
        if (c1969 == null) {
            AbstractC7740.m13068("Font resolution state is not set.");
            C4210.m8612();
            return null;
        }
        Object obj = c1969.f5851;
        if (!AbstractC4394.m8917(obj, c0997.f2917)) {
            c0997.f2917 = obj;
            ((AbstractC1347) interfaceC1395).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
            c0997.f2922 = AbstractC0996.m1906(c0997.f2918, c0997.f2920, c0997.f2919, AbstractC0996.f2915, 1);
            ((AbstractC1347) interfaceC1395).setValue(Boolean.FALSE);
        }
        long j2 = c0997.f2922;
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13293(j, AbstractC7896.m13296((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C0946(abstractC1724Mo3045, 1));
    }
}
