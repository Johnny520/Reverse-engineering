package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5176;
import kotlin.reflect.InterfaceC5088;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6063 extends AbstractC1788 implements InterfaceC1796, InterfaceC1761, InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6072 f16572 = new C6072();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC0580 f16573;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C0575 f16574;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C6072 f16575;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f16576;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC1787 f16577;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1627 f16578;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f16579 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1095 f16580;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0580 f16581;

    public AbstractC6063(InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095) {
        this.f16581 = interfaceC0580;
        this.f16580 = interfaceC1095;
        this.f16573 = interfaceC0580;
        this.f16576 = interfaceC0580 == null && interfaceC1095 != null;
        this.f16575 = f16572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final void m11416(AbstractC6063 abstractC6063, InterfaceC5401 interfaceC5401, InterfaceC5452 interfaceC5452, InterfaceC6554 interfaceC6554) {
        abstractC6063.getClass();
        AbstractC5399.m10477(interfaceC5401, null, null, new AbstractPressableNode$launchAwaitingReset$1(interfaceC5452, interfaceC6554, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        C1627 c1627 = this.f16578;
        if (c1627 != null) {
            c1627.mo1224();
        }
        InterfaceC1787 interfaceC1787 = this.f16577;
        if (interfaceC1787 instanceof InterfaceC1796) {
            InterfaceC1796 interfaceC1796 = interfaceC1787 instanceof InterfaceC1796 ? (InterfaceC1796) interfaceC1787 : null;
            if (interfaceC1796 != null) {
                interfaceC1796.mo1224();
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        c1652.getClass();
        pointerEventPass.getClass();
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j2 >> 32));
        Float.floatToRawIntBits((int) (j2 & 4294967295L));
        m11418();
        if (this.f16578 == null) {
            C6064 c6064 = new C6064(this);
            C1652 c16522 = AbstractC1622.f4745;
            C1627 c1627 = new C1627(null, null, c6064);
            m3364(c1627);
            this.f16578 = c1627;
        }
        C1627 c16272 = this.f16578;
        if (c16272 != null) {
            c16272.mo1291(c1652, pointerEventPass, j);
        }
        InterfaceC1787 interfaceC1787 = this.f16577;
        if (interfaceC1787 instanceof InterfaceC1796) {
            ((InterfaceC1796) interfaceC1787).mo1291(c1652, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m11417() {
        C0575 c0575;
        InterfaceC0580 interfaceC0580 = this.f16581;
        if (interfaceC0580 != null && (c0575 = this.f16574) != null) {
            ((C0573) interfaceC0580).m1353(new C0572(c0575));
        }
        this.f16574 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11418() {
        InterfaceC1095 interfaceC1095;
        if (this.f16577 == null && (interfaceC1095 = this.f16580) != null) {
            if (this.f16581 == null) {
                this.f16581 = new C0573();
            }
            InterfaceC0580 interfaceC0580 = this.f16581;
            interfaceC0580.getClass();
            InterfaceC1787 interfaceC1787Mo1944 = interfaceC1095.mo1944(interfaceC0580);
            m3364(interfaceC1787Mo1944);
            this.f16577 = interfaceC1787Mo1944;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo1696() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        interfaceC1944.getClass();
        if (this.f16579) {
            return;
        }
        InterfaceC5088[] interfaceC5088Arr = AbstractC1946.f5755;
        interfaceC1944.mo3590(AbstractC1943.f5752, C5176.f14739);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        m11417();
        if (this.f16573 == null) {
            this.f16581 = null;
        }
        InterfaceC1787 interfaceC1787 = this.f16577;
        if (interfaceC1787 != null) {
            m3368(interfaceC1787);
        }
        this.f16577 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        if (this.f16576) {
            return;
        }
        m11418();
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1359() {
        return this.f16575;
    }
}
