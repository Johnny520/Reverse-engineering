package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0107;
import androidx.collection.C0255;
import androidx.compose.foundation.C1025;
import androidx.compose.foundation.InterfaceC1026;
import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0571;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.InterfaceC5207;
import p034.AbstractC6344;
import p110.C7321;
import p110.InterfaceC7320;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0463 extends AbstractC1788 implements InterfaceC1796, InterfaceC7320, InterfaceC1783, InterfaceC1026 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f1408;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C0501 f1409;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C0484 f1410;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C0483 f1411;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public C5856 f1412;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public AbstractC0521 f1413;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C0473 f1414;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C0482 f1415;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C0570 f1416;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C5190 f1417;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f1418;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f1419;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1025 f1420;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC0580 f1421;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f1422;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C0520 f1423;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f1424;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public long f1425;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C0546 f1426;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public static void m1217(C0517 c0517, C1643 c1643, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C0483 c0483 = c0517.f1411;
        if (c0483 == null) {
            c0483 = new C0483();
            c0483.f1452 = null;
            c0483.f1451 = Long.MAX_VALUE;
            c0483.f1450 = false;
            c0517.f1411 = c0483;
        }
        c0483.f1452 = c1643;
        c0483.f1451 = j;
        C0501 c0501 = c0517.f1409;
        Orientation orientation = c0517.f1424;
        if (c0501 == null) {
            c0517.f1409 = new C0501(orientation, 2);
        } else {
            c0501.f1486 = orientation;
            c0501.f1485 = j2;
        }
        c0483.f1450 = false;
        c0517.f1413 = c0483;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1218(androidx.compose.foundation.gestures.AbstractC0463 r6, androidx.compose.foundation.gestures.C0479 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r7 = (androidx.compose.foundation.interaction.C0570) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.飘花落叶言子世苏兰哲楪 r0 = (androidx.compose.foundation.gestures.C0479) r0
            kotlin.AbstractC5185.m10210(r8)
            goto L7b
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L3c:
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.飘花落叶言子世苏兰哲楪 r7 = (androidx.compose.foundation.gestures.C0479) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L61
        L44:
            kotlin.AbstractC5185.m10210(r8)
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r8 = r6.f1416
            if (r8 == 0) goto L61
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r2 = r6.f1421
            if (r2 == 0) goto L61
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏哲兰 r5 = new androidx.compose.foundation.interaction.飘花落叶言子楪世苏哲兰
            r5.<init>(r8)
            r0.L$0 = r7
            r0.label = r4
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r2 = (androidx.compose.foundation.interaction.C0573) r2
            java.lang.Object r8 = r2.m1354(r5, r0)
            if (r8 != r1) goto L61
            goto L78
        L61:
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r8 = new androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲
            r8.<init>()
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r2 = r6.f1421
            if (r2 == 0) goto L7d
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r2 = (androidx.compose.foundation.interaction.C0573) r2
            java.lang.Object r0 = r2.m1354(r8, r0)
            if (r0 != r1) goto L79
        L78:
            return r1
        L79:
            r0 = r7
            r7 = r8
        L7b:
            r8 = r7
            r7 = r0
        L7d:
            r6.f1416 = r8
            long r6 = r7.f1445
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0463.m1218(androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏, androidx.compose.foundation.gestures.飘花落叶言子世苏兰哲楪, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1219(androidx.compose.foundation.gestures.AbstractC0463 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L16
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5185.m10210(r7)
            goto L4c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r7 = r6.f1416
            if (r7 == 0) goto L4e
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r2 = r6.f1421
            if (r2 == 0) goto L4c
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏哲兰 r5 = new androidx.compose.foundation.interaction.飘花落叶言子楪世苏哲兰
            r5.<init>(r7)
            r0.label = r4
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r2 = (androidx.compose.foundation.interaction.C0573) r2
            java.lang.Object r7 = r2.m1354(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r6.f1416 = r3
        L4e:
            androidx.compose.foundation.gestures.飘花落叶言子世哲楪苏兰 r7 = new androidx.compose.foundation.gestures.飘花落叶言子世哲楪苏兰
            r0 = 0
            r2 = 0
            r7.<init>(r0, r2)
            androidx.compose.foundation.gestures.飘花落叶言子哲苏楪兰世 r6 = (androidx.compose.foundation.gestures.C0517) r6
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r0 = r6.f1526
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = r0.m2991()
            androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1 r1 = new androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1
            r1.<init>(r7, r6, r3)
            r6 = 3
            kotlinx.coroutines.AbstractC5399.m10477(r0, r3, r3, r1, r6)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0463.m1219(androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1220(androidx.compose.foundation.gestures.AbstractC0463 r6, androidx.compose.foundation.gestures.C0470 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.飘花落叶言子世哲楪苏兰 r7 = (androidx.compose.foundation.gestures.C0470) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L52
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L35:
            kotlin.AbstractC5185.m10210(r8)
            androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r8 = r6.f1416
            if (r8 == 0) goto L54
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r2 = r6.f1421
            if (r2 == 0) goto L52
            androidx.compose.foundation.interaction.飘花落叶言子楪世哲苏兰 r5 = new androidx.compose.foundation.interaction.飘花落叶言子楪世哲苏兰
            r5.<init>(r8)
            r0.L$0 = r7
            r0.label = r4
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r2 = (androidx.compose.foundation.interaction.C0573) r2
            java.lang.Object r8 = r2.m1354(r5, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r6.f1416 = r3
        L54:
            androidx.compose.foundation.gestures.飘花落叶言子哲苏楪兰世 r6 = (androidx.compose.foundation.gestures.C0517) r6
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r8 = r6.f1526
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r8 = r8.m2991()
            androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1
            r0.<init>(r7, r6, r3)
            r6 = 3
            kotlinx.coroutines.AbstractC5399.m10477(r8, r3, r3, r0, r6)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0463.m1220(androidx.compose.foundation.gestures.飘花落叶言子世兰楪哲苏, androidx.compose.foundation.gestures.飘花落叶言子世哲楪苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1221(androidx.appcompat.widget.C0137 r24, androidx.compose.ui.input.pointer.PointerEventPass r25) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0463.mo1221(androidx.appcompat.widget.飘花落叶言子世苏楪哲兰, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }

    @Override // androidx.compose.foundation.InterfaceC1026
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean mo1222(C1643 c1643) {
        if (AbstractC1646.m3029(c1643)) {
            return this.f1422;
        }
        if (!AbstractC1646.m3027(c1643)) {
            if (this.f1409 == null) {
                this.f1409 = new C0501(this.f1424, 2);
            }
            float fMo3278 = ((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).mo3278();
            long jM3031 = AbstractC1646.m3031(c1643, false);
            C0501 c0501 = this.f1409;
            if (c0501 == null) {
                C5925.m11310("Touch slop detector not initialized.");
                return false;
            }
            if (!C7329.m12528(c0501.m1261(fMo3278, jM3031, false), 9205357640488583168L)) {
                long jM12525 = C7329.m12525(c0501.f1485, jM3031);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM12525 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM12525 >> 32))))) * 180.0f)) / 3.141592653589793d;
                Orientation orientation = c0501.f1486;
                int i = orientation == null ? -1 : AbstractC0500.f1484[orientation.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1026
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean mo1223(C7321 c7321) {
        return AbstractC0521.m1307(c7321) && this.f1422;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo1224() {
        if (this.f1418) {
            m1230();
            if (this.f1419) {
                m1229().mo8436(C0481.f1448);
            }
            this.f1412 = null;
        }
        this.f1418 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void m1225(long j, C1643 c1643) {
        long jMo3084 = AbstractC1785.m3349(this.f6292).mo3084(0L);
        if (!C7329.m12528(this.f1408, 9205357640488583168L) && !C7329.m12528(jMo3084, this.f1408)) {
            this.f1425 = C7329.m12525(this.f1425, C7329.m12526(jMo3084, this.f1408));
        }
        this.f1408 = jMo3084;
        AbstractC6344.m11873(m1228(), c1643, this.f1425);
        m1229().mo8436(new C0480(j, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final void m1226(C1643 c1643, C1643 c16432, long j) {
        if (this.f1412 == null) {
            this.f1412 = new C5856(11);
        }
        AbstractC6344.m11873(m1228(), c1643, 0L);
        long jM12526 = C7329.m12526(c16432.f4807, j);
        this.f1425 = 0L;
        C0520 c0520 = this.f1423;
        int i = c1643.f4819;
        c0520.getClass();
        if (i == 2) {
            return;
        }
        if (!this.f1419) {
            if (this.f1417 == null) {
                this.f1417 = AbstractC5205.m10282(Integer.MAX_VALUE, 6, null);
            }
            m1233();
        }
        this.f1408 = AbstractC1785.m3349(this).mo3084(0L);
        m1229().mo8436(new C0479(jM12526));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m1227(AbstractC0469 abstractC0469) {
        if ((abstractC0469 instanceof C0479) && !this.f1419) {
            this.f1419 = true;
            m1233();
        }
        m1229().mo8436(abstractC0469);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final C5856 m1228() {
        C5856 c5856 = this.f1412;
        if (c5856 != null) {
            return c5856;
        }
        C5925.m11310("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final InterfaceC5207 m1229() {
        C5190 c5190 = this.f1417;
        if (c5190 != null) {
            return c5190;
        }
        C5925.m11310("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final void m1230() {
        C0473 c0473 = this.f1414;
        if (c0473 == null) {
            DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
            c0473 = new C0473();
            c0473.f1437 = dragDetectionState$AwaitDown$AwaitTouchSlop;
            c0473.f1436 = false;
            this.f1414 = c0473;
        }
        c0473.f1437 = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
        c0473.f1436 = false;
        this.f1413 = c0473;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m1231(C1643 c1643, long j, C0501 c0501) {
        C0484 c0484 = this.f1410;
        if (c0484 == null) {
            c0484 = new C0484();
            c0484.f1454 = null;
            c0484.f1453 = Long.MAX_VALUE;
            this.f1410 = c0484;
        }
        c0484.f1454 = c1643;
        c0484.f1453 = j;
        c0501.f1485 = 0L;
        this.f1413 = c0484;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m1232() {
        C0570 c0570 = this.f1416;
        if (c0570 != null) {
            InterfaceC0580 interfaceC0580 = this.f1421;
            if (interfaceC0580 != null) {
                ((C0573) interfaceC0580).m1353(new C0571(c0570));
            }
            this.f1416 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void m1233() {
        this.f1419 = true;
        if (this.f1417 == null) {
            this.f1417 = AbstractC5205.m10282(Integer.MAX_VALUE, 6, null);
        }
        AbstractC5399.m10477(m3867(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f1419 = false;
        m1232();
        this.f1425 = 0L;
        C1025 c1025 = this.f1420;
        if (c1025 != null) {
            m3368(c1025);
        }
        this.f1420 = null;
    }

    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void mo1234() {
        C0546 c0546 = this.f1426;
        if (c0546 != null) {
            c0546.m1330();
            AbstractC0463 abstractC0463 = c0546.f1576;
            if (abstractC0463.f1419) {
                abstractC0463.m1227(C0481.f1448);
            }
            c0546.f1578 = null;
            C0107 c0107 = c0546.f1579;
            c0107.f314 = 0;
            ((C0255) c0107.f315).f930 = 0;
        }
    }
}
