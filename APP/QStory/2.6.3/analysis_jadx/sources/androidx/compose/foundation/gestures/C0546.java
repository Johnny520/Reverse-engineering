package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0107;
import androidx.collection.C0244;
import androidx.collection.C0255;
import androidx.compose.ui.node.AbstractC1785;
import p110.C7321;
import p110.C7322;
import p112.C7329;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0546 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC0521 f1571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0565 f1572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0562 f1573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0563 f1574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0564 f1575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0463 f1576;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f1577 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5856 f1578;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C0107 f1579;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f1580;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0501 f1581;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0107 f1582;

    public C0546(AbstractC0463 abstractC0463) {
        this.f1576 = abstractC0463;
        C0107 c0107 = new C0107((byte) 0, 1);
        c0107.f315 = new C0244();
        this.f1582 = c0107;
        C0107 c01072 = new C0107((byte) 0, 2);
        c01072.f315 = new C0255();
        this.f1579 = c01072;
        this.f1580 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m1325(C0546 c0546, C7321 c7321, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC0463 abstractC0463 = c0546.f1576;
        C0562 c0562 = c0546.f1573;
        if (c0562 == null) {
            c0562 = new C0562();
            c0562.f1613 = null;
            c0562.f1612 = Long.MAX_VALUE;
            c0562.f1611 = false;
            c0546.f1573 = c0562;
        }
        c0562.f1613 = c7321;
        c0562.f1612 = j;
        C0501 c0501 = c0546.f1581;
        Orientation orientation = abstractC0463.f1424;
        if (c0501 == null) {
            c0546.f1581 = new C0501(orientation, 2);
        } else {
            c0501.f1486 = orientation;
            c0501.f1485 = j2;
        }
        c0562.f1611 = false;
        c0546.f1571 = c0562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1326(C7321 c7321, C7321 c73212, C7322 c7322, long j) {
        if (this.f1578 == null) {
            this.f1578 = new C5856(11);
        }
        this.f1580 = 0L;
        C5856 c5856M1328 = m1328();
        AbstractC0463 abstractC0463 = this.f1576;
        AbstractC0521.m1302(c5856M1328, c7321, abstractC0463.f1424, c7322, this.f1582, this.f1580);
        long jM12526 = C7329.m12526(AbstractC0521.m1305(c73212, abstractC0463.f1424, c7322), j);
        abstractC0463.f1423.getClass();
        this.f1577 = AbstractC1785.m3349(abstractC0463).mo3084(0L);
        abstractC0463.m1227(new C0479(jM12526));
        C0107 c0107 = this.f1579;
        c0107.f314 = 0;
        ((C0255) c0107.f315).f930 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1327(C7321 c7321, C7322 c7322, long j) {
        AbstractC0463 abstractC0463 = this.f1576;
        long jMo3084 = AbstractC1785.m3349(abstractC0463).mo3084(0L);
        if (!C7329.m12528(this.f1577, 9205357640488583168L) && !C7329.m12528(jMo3084, this.f1577)) {
            this.f1580 = C7329.m12525(this.f1580, C7329.m12526(jMo3084, this.f1577));
        }
        this.f1577 = jMo3084;
        Orientation orientation = abstractC0463.f1424;
        orientation.getClass();
        int i = AbstractC0462.f1407;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            AbstractC0521.m1302(m1328(), c7321, abstractC0463.f1424, c7322, this.f1582, this.f1580);
            C0107 c0107 = this.f1579;
            C0255 c0255 = (C0255) c0107.f315;
            int i2 = c0255.f930;
            if (i2 == 3) {
                int i3 = c0107.f314;
                c0107.f314 = i3 + 1;
                if (i3 < 0 || i3 >= i2) {
                    C7547.m12772("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = c0255.f931;
                    long j2 = jArr[i3];
                    jArr[i3] = j;
                }
            } else {
                c0255.m819(j);
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
            abstractC0463.m1227(new C0480((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / c0255.f930)) & 4294967295L), true));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5856 m1328() {
        C5856 c5856 = this.f1578;
        if (c5856 != null) {
            return c5856;
        }
        C5925.m11310("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1329(C7321 c7321, long j, C0501 c0501) {
        C0565 c0565 = this.f1572;
        if (c0565 == null) {
            c0565 = new C0565();
            c0565.f1618 = null;
            c0565.f1617 = Long.MAX_VALUE;
            this.f1572 = c0565;
        }
        c0565.f1618 = c7321;
        c0565.f1617 = j;
        c0501.f1485 = 0L;
        this.f1571 = c0565;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1330() {
        C0564 c0564 = this.f1575;
        if (c0564 == null) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
            c0564 = new C0564();
            c0564.f1616 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;
            c0564.f1615 = false;
            this.f1575 = c0564;
        }
        c0564.f1616 = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
        c0564.f1615 = false;
        this.f1571 = c0564;
    }
}
