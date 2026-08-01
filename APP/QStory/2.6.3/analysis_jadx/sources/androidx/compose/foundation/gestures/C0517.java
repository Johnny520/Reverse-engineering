package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.appcompat.app.C0107;
import androidx.appcompat.app.C0113;
import androidx.collection.C0255;
import androidx.compose.animation.core.C0333;
import androidx.compose.foundation.InterfaceC1084;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.relocation.C0771;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.input.nestedscroll.C1616;
import androidx.compose.ui.input.nestedscroll.C1619;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p106.AbstractC7308;
import p106.AbstractC7311;
import p106.InterfaceC7307;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517 extends AbstractC0463 implements InterfaceC7307, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public InterfaceC6554 f1518;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C0550 f1519;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C0524 f1520;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C1452 f1521;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C0494 f1522;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C0502 f1523;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C0554 f1524;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C0504 f1525;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C1619 f1526;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C0526 f1527;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC1084 f1528;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC0560 f1529;

    public C0517(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        C0520 c0520 = AbstractC0498.f1480;
        this.f1424 = orientation;
        this.f1423 = c0520;
        this.f1422 = z;
        this.f1421 = interfaceC0580;
        this.f1408 = 9205357640488583168L;
        this.f1425 = 0L;
        this.f1528 = interfaceC1084;
        this.f1529 = interfaceC0560;
        C1619 c1619 = new C1619();
        this.f1526 = c1619;
        C0526 c0526 = new C0526(new C0333(new C0113(AbstractC0498.f1477)));
        this.f1527 = c0526;
        InterfaceC1084 interfaceC10842 = this.f1528;
        InterfaceC0560 interfaceC05602 = this.f1529;
        C0502 c0502 = new C0502(interfaceC0513, interfaceC10842, interfaceC05602 == null ? c0526 : interfaceC05602, orientation, z2, c1619, this, new C0495(this, 0));
        this.f1523 = c0502;
        C0494 c0494 = new C0494(c0502, z);
        this.f1522 = c0494;
        C1452 c1452 = new C1452(2, null, 10);
        m3364(c1452);
        this.f1521 = c1452;
        C0524 c0524 = new C0524(orientation, c0502, z2, new C0495(this, 1));
        m3364(c0524);
        this.f1520 = c0524;
        m3364(new C1616(c0494, c1619));
        C0771 c0771 = new C0771();
        c0771.f2241 = c0524;
        m3364(c0771);
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean mo1290(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f1422 || ((!AbstractC7311.m12506(AbstractC7308.m12504(keyEvent), AbstractC7311.f19459) && !AbstractC7311.m12506(AbstractC7308.m12505(keyEvent.getKeyCode()), AbstractC7311.f19460)) || AbstractC7308.m12503(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f1523.f1489 == Orientation.Vertical;
        C0524 c0524 = this.f1520;
        if (z) {
            int iM1320 = (int) (c0524.m1320() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(AbstractC7311.m12506(AbstractC7308.m12505(keyEvent.getKeyCode()), AbstractC7311.f19460) ? iM1320 : -iM1320)));
        } else {
            int iM13202 = (int) (c0524.m1320() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC7311.m12506(AbstractC7308.m12505(keyEvent.getKeyCode()), AbstractC7311.f19460) ? iM13202 : -iM13202)) << 32);
        }
        AbstractC5399.m10477(m3867(), null, null, new ScrollableNode$onKeyEvent$1(this, jFloatToRawIntBits, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1291(androidx.compose.ui.input.pointer.C1652 r23, androidx.compose.ui.input.pointer.PointerEventPass r24, long r25) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0517.mo1291(androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final void m1292(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f1422 != z) {
            this.f1522.f1473 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC0560 interfaceC05602 = interfaceC0560 == null ? this.f1527 : interfaceC0560;
        C0502 c0502 = this.f1523;
        if (AbstractC4395.m8907(c0502.f1492, interfaceC0513)) {
            z4 = false;
        } else {
            c0502.f1492 = interfaceC0513;
            z4 = true;
        }
        c0502.f1491 = interfaceC1084;
        if (c0502.f1489 != orientation) {
            c0502.f1489 = orientation;
            z4 = true;
        }
        if (c0502.f1488 != z2) {
            c0502.f1488 = z2;
            z4 = true;
        }
        c0502.f1490 = interfaceC05602;
        c0502.f1487 = this.f1526;
        C0524 c0524 = this.f1520;
        c0524.f1537 = orientation;
        c0524.f1542 = z2;
        this.f1528 = interfaceC1084;
        this.f1529 = interfaceC0560;
        C0520 c0520 = AbstractC0498.f1480;
        Orientation orientation2 = c0502.f1489;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        this.f1423 = c0520;
        if (this.f1422 != z) {
            this.f1422 = z;
            if (!z) {
                m1232();
                this.f1426 = null;
            }
            z4 = true;
        }
        if (!AbstractC4395.m8907(this.f1421, interfaceC0580)) {
            m1232();
            this.f1421 = interfaceC0580;
        }
        if (this.f1424 != orientation3) {
            this.f1424 = orientation3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.f1418;
            C0481 c0481 = C0481.f1448;
            if (z6) {
                m1230();
                if (this.f1419) {
                    m1229().mo8436(c0481);
                }
                this.f1412 = null;
            }
            C0546 c0546 = this.f1426;
            if (c0546 != null) {
                c0546.m1330();
                AbstractC0463 abstractC0463 = c0546.f1576;
                if (abstractC0463.f1419) {
                    abstractC0463.m1227(c0481);
                }
                c0546.f1578 = null;
                C0107 c0107 = c0546.f1579;
                c0107.f314 = 0;
                ((C0255) c0107.f315).f930 = 0;
            }
        }
        if (z3) {
            this.f1519 = null;
            this.f1518 = null;
            AbstractC1785.m3354(this);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        if (this.f1422 && (this.f1519 == null || this.f1518 == null)) {
            this.f1519 = new C0550(this);
            this.f1518 = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        C0550 c0550 = this.f1519;
        if (c0550 != null) {
            InterfaceC5088[] interfaceC5088Arr = AbstractC1946.f5755;
            interfaceC1944.mo3590(AbstractC1959.f5790, new C1941(null, c0550));
        }
        InterfaceC6554 interfaceC6554 = this.f1518;
        if (interfaceC6554 != null) {
            InterfaceC5088[] interfaceC5088Arr2 = AbstractC1946.f5755;
            interfaceC1944.mo3590(AbstractC1959.f5789, interfaceC6554);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        if (this.f6279) {
            InterfaceC7896 interfaceC7896 = AbstractC1785.m3346(this).f5099;
            C0526 c0526 = this.f1527;
            c0526.getClass();
            c0526.f1548 = new C0333(new C0113(interfaceC7896));
        }
        C0554 c0554 = this.f1524;
        if (c0554 != null) {
            c0554.f1603 = AbstractC1785.m3346(this).f5099;
        }
        C0504 c0504 = this.f1525;
        if (c0504 != null) {
            c0504.f1603 = AbstractC1785.m3346(this).f5099;
        }
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo1295(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1296() {
        mo1224();
        if (this.f6279) {
            InterfaceC7896 interfaceC7896 = AbstractC1785.m3346(this).f5099;
            C0526 c0526 = this.f1527;
            c0526.getClass();
            c0526.f1548 = new C0333(new C0113(interfaceC7896));
        }
        C0554 c0554 = this.f1524;
        if (c0554 != null) {
            c0554.f1603 = AbstractC1785.m3346(this).f5099;
        }
        C0504 c0504 = this.f1525;
        if (c0504 != null) {
            c0504.f1603 = AbstractC1785.m3346(this).f5099;
        }
    }
}
