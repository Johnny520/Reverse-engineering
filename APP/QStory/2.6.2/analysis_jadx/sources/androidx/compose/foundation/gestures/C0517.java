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
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p106.AbstractC7307;
import p106.AbstractC7310;
import p106.InterfaceC7306;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517 extends AbstractC0463 implements InterfaceC7306, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public InterfaceC6553 f1517;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C0550 f1518;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C0524 f1519;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C1452 f1520;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C0494 f1521;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C0502 f1522;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C0554 f1523;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C0504 f1524;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C1619 f1525;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C0526 f1526;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public InterfaceC1084 f1527;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public InterfaceC0560 f1528;

    public C0517(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        C0520 c0520 = AbstractC0498.f1479;
        this.f1423 = orientation;
        this.f1422 = c0520;
        this.f1421 = z;
        this.f1420 = interfaceC0580;
        this.f1407 = 9205357640488583168L;
        this.f1424 = 0L;
        this.f1527 = interfaceC1084;
        this.f1528 = interfaceC0560;
        C1619 c1619 = new C1619();
        this.f1525 = c1619;
        C0526 c0526 = new C0526(new C0333(new C0113(AbstractC0498.f1476)));
        this.f1526 = c0526;
        InterfaceC1084 interfaceC10842 = this.f1527;
        InterfaceC0560 interfaceC05602 = this.f1528;
        C0502 c0502 = new C0502(interfaceC0513, interfaceC10842, interfaceC05602 == null ? c0526 : interfaceC05602, orientation, z2, c1619, this, new C0495(this, 0));
        this.f1522 = c0502;
        C0494 c0494 = new C0494(c0502, z);
        this.f1521 = c0494;
        C1452 c1452 = new C1452(2, null, 10);
        m3354(c1452);
        this.f1520 = c1452;
        C0524 c0524 = new C0524(orientation, c0502, z2, new C0495(this, 1));
        m3354(c0524);
        this.f1519 = c0524;
        m3354(new C1616(c0494, c1619));
        C0771 c0771 = new C0771();
        c0771.f2240 = c0524;
        m3354(c0771);
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean mo1280(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f1421 || ((!AbstractC7310.m12479(AbstractC7307.m12477(keyEvent), AbstractC7310.f19464) && !AbstractC7310.m12479(AbstractC7307.m12478(keyEvent.getKeyCode()), AbstractC7310.f19465)) || AbstractC7307.m12476(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f1522.f1488 == Orientation.Vertical;
        C0524 c0524 = this.f1519;
        if (z) {
            int iM1310 = (int) (c0524.m1310() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(AbstractC7310.m12479(AbstractC7307.m12478(keyEvent.getKeyCode()), AbstractC7310.f19465) ? iM1310 : -iM1310)));
        } else {
            int iM13102 = (int) (c0524.m1310() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC7310.m12479(AbstractC7307.m12478(keyEvent.getKeyCode()), AbstractC7310.f19465) ? iM13102 : -iM13102)) << 32);
        }
        AbstractC5398.m10473(m3857(), null, null, new ScrollableNode$onKeyEvent$1(this, jFloatToRawIntBits, null), 3);
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
    public final void mo1281(androidx.compose.ui.input.pointer.C1652 r23, androidx.compose.ui.input.pointer.PointerEventPass r24, long r25) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0517.mo1281(androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final void m1282(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f1421 != z) {
            this.f1521.f1472 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC0560 interfaceC05602 = interfaceC0560 == null ? this.f1526 : interfaceC0560;
        C0502 c0502 = this.f1522;
        if (AbstractC4394.m8917(c0502.f1491, interfaceC0513)) {
            z4 = false;
        } else {
            c0502.f1491 = interfaceC0513;
            z4 = true;
        }
        c0502.f1490 = interfaceC1084;
        if (c0502.f1488 != orientation) {
            c0502.f1488 = orientation;
            z4 = true;
        }
        if (c0502.f1487 != z2) {
            c0502.f1487 = z2;
            z4 = true;
        }
        c0502.f1489 = interfaceC05602;
        c0502.f1486 = this.f1525;
        C0524 c0524 = this.f1519;
        c0524.f1536 = orientation;
        c0524.f1541 = z2;
        this.f1527 = interfaceC1084;
        this.f1528 = interfaceC0560;
        C0520 c0520 = AbstractC0498.f1479;
        Orientation orientation2 = c0502.f1488;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        this.f1422 = c0520;
        if (this.f1421 != z) {
            this.f1421 = z;
            if (!z) {
                m1222();
                this.f1425 = null;
            }
            z4 = true;
        }
        if (!AbstractC4394.m8917(this.f1420, interfaceC0580)) {
            m1222();
            this.f1420 = interfaceC0580;
        }
        if (this.f1423 != orientation3) {
            this.f1423 = orientation3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.f1417;
            C0481 c0481 = C0481.f1447;
            if (z6) {
                m1220();
                if (this.f1418) {
                    m1219().mo8445(c0481);
                }
                this.f1411 = null;
            }
            C0546 c0546 = this.f1425;
            if (c0546 != null) {
                c0546.m1320();
                AbstractC0463 abstractC0463 = c0546.f1575;
                if (abstractC0463.f1418) {
                    abstractC0463.m1217(c0481);
                }
                c0546.f1577 = null;
                C0107 c0107 = c0546.f1578;
                c0107.f314 = 0;
                ((C0255) c0107.f315).f930 = 0;
            }
        }
        if (z3) {
            this.f1518 = null;
            this.f1517 = null;
            AbstractC1785.m3344(this);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        if (this.f1421 && (this.f1518 == null || this.f1517 == null)) {
            this.f1518 = new C0550(this);
            this.f1517 = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        C0550 c0550 = this.f1518;
        if (c0550 != null) {
            InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
            interfaceC1944.mo3580(AbstractC1959.f5789, new C1941(null, c0550));
        }
        InterfaceC6553 interfaceC6553 = this.f1517;
        if (interfaceC6553 != null) {
            InterfaceC5087[] interfaceC5087Arr2 = AbstractC1946.f5754;
            interfaceC1944.mo3580(AbstractC1959.f5788, interfaceC6553);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        if (this.f6278) {
            InterfaceC7895 interfaceC7895 = AbstractC1785.m3336(this).f5098;
            C0526 c0526 = this.f1526;
            c0526.getClass();
            c0526.f1547 = new C0333(new C0113(interfaceC7895));
        }
        C0554 c0554 = this.f1523;
        if (c0554 != null) {
            c0554.f1602 = AbstractC1785.m3336(this).f5098;
        }
        C0504 c0504 = this.f1524;
        if (c0504 != null) {
            c0504.f1602 = AbstractC1785.m3336(this).f5098;
        }
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo1285(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1286() {
        mo1214();
        if (this.f6278) {
            InterfaceC7895 interfaceC7895 = AbstractC1785.m3336(this).f5098;
            C0526 c0526 = this.f1526;
            c0526.getClass();
            c0526.f1547 = new C0333(new C0113(interfaceC7895));
        }
        C0554 c0554 = this.f1523;
        if (c0554 != null) {
            c0554.f1602 = AbstractC1785.m3336(this).f5098;
        }
        C0504 c0504 = this.f1524;
        if (c0504 != null) {
            c0504.f1602 = AbstractC1785.m3336(this).f5098;
        }
    }
}
