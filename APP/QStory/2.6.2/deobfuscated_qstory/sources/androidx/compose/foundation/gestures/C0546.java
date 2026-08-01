package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0107;
import androidx.collection.C0244;
import androidx.collection.C0255;
import androidx.compose.ui.node.AbstractC1785;
import p110.C7320;
import p110.C7321;
import p112.C7328;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0546 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC0521 f1570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0565 f1571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0562 f1572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0563 f1573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0564 f1574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0463 f1575;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f1576 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5851 f1577;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C0107 f1578;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f1579;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0501 f1580;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0107 f1581;

    public C0546(AbstractC0463 abstractC0463) {
        this.f1575 = abstractC0463;
        C0107 c0107 = new C0107((byte) 0, 1);
        c0107.f315 = new C0244();
        this.f1581 = c0107;
        C0107 c01072 = new C0107((byte) 0, 2);
        c01072.f315 = new C0255();
        this.f1578 = c01072;
        this.f1579 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m1315(C0546 c0546, C7320 c7320, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC0463 abstractC0463 = c0546.f1575;
        C0562 c0562 = c0546.f1572;
        if (c0562 == null) {
            c0562 = new C0562();
            c0562.f1612 = null;
            c0562.f1611 = Long.MAX_VALUE;
            c0562.f1610 = false;
            c0546.f1572 = c0562;
        }
        c0562.f1612 = c7320;
        c0562.f1611 = j;
        C0501 c0501 = c0546.f1580;
        Orientation orientation = abstractC0463.f1423;
        if (c0501 == null) {
            c0546.f1580 = new C0501(orientation, 2);
        } else {
            c0501.f1485 = orientation;
            c0501.f1484 = j2;
        }
        c0562.f1610 = false;
        c0546.f1570 = c0562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1316(C7320 c7320, C7320 c73202, C7321 c7321, long j) {
        if (this.f1577 == null) {
            this.f1577 = new C5851(11);
        }
        this.f1579 = 0L;
        C5851 c5851M1318 = m1318();
        AbstractC0463 abstractC0463 = this.f1575;
        AbstractC0521.m1292(c5851M1318, c7320, abstractC0463.f1423, c7321, this.f1581, this.f1579);
        long jM12499 = C7328.m12499(AbstractC0521.m1295(c73202, abstractC0463.f1423, c7321), j);
        abstractC0463.f1422.getClass();
        this.f1576 = AbstractC1785.m3339(abstractC0463).mo3074(0L);
        abstractC0463.m1217(new C0479(jM12499));
        C0107 c0107 = this.f1578;
        c0107.f314 = 0;
        ((C0255) c0107.f315).f930 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1317(C7320 c7320, C7321 c7321, long j) {
        AbstractC0463 abstractC0463 = this.f1575;
        long jMo3074 = AbstractC1785.m3339(abstractC0463).mo3074(0L);
        if (!C7328.m12501(this.f1576, 9205357640488583168L) && !C7328.m12501(jMo3074, this.f1576)) {
            this.f1579 = C7328.m12498(this.f1579, C7328.m12499(jMo3074, this.f1576));
        }
        this.f1576 = jMo3074;
        Orientation orientation = abstractC0463.f1423;
        orientation.getClass();
        int i = AbstractC0462.f1406;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            AbstractC0521.m1292(m1318(), c7320, abstractC0463.f1423, c7321, this.f1581, this.f1579);
            C0107 c0107 = this.f1578;
            C0255 c0255 = (C0255) c0107.f315;
            int i2 = c0255.f930;
            if (i2 == 3) {
                int i3 = c0107.f314;
                c0107.f314 = i3 + 1;
                if (i3 < 0 || i3 >= i2) {
                    C7546.m12743("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = c0255.f931;
                    long j2 = jArr[i3];
                    jArr[i3] = j;
                }
            } else {
                c0255.m818(j);
            }
            if (c0107.f314 == 3) {
                c0107.f314 = 0;
            }
            long[] jArr2 = c0255.f931;
            int i4 = c0255.f930;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i5] >> 32));
            }
            int i6 = c0255.f930;
            float f = fIntBitsToFloat2 / i6;
            long[] jArr3 = c0255.f931;
            for (int i7 = 0; i7 < i6; i7++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i7] & 4294967295L));
            }
            abstractC0463.m1217(new C0480((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / c0255.f930)) & 4294967295L), true));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5851 m1318() {
        C5851 c5851 = this.f1577;
        if (c5851 != null) {
            return c5851;
        }
        C5919.m11249("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1319(C7320 c7320, long j, C0501 c0501) {
        C0565 c0565 = this.f1571;
        if (c0565 == null) {
            c0565 = new C0565();
            c0565.f1617 = null;
            c0565.f1616 = Long.MAX_VALUE;
            this.f1571 = c0565;
        }
        c0565.f1617 = c7320;
        c0565.f1616 = j;
        c0501.f1484 = 0L;
        this.f1570 = c0565;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1320() {
        C0564 c0564 = this.f1574;
        if (c0564 == null) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
            c0564 = new C0564();
            c0564.f1615 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;
            c0564.f1614 = false;
            this.f1574 = c0564;
        }
        c0564.f1615 = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
        c0564.f1614 = false;
        this.f1570 = c0564;
    }
}
