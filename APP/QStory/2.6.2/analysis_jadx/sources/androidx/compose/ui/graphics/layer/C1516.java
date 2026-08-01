package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.foundation.lazy.C0748;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1589;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.AbstractC1603;
import androidx.compose.ui.graphics.C1576;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.C1586;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4210;
import java.util.Locale;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6557;
import p112.C7325;
import p112.C7327;
import p112.C7328;
import p205.InterfaceC7895;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1516 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1526 f4349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Outline f4350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1514 f4355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4356;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4357;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4358;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public RectF f4359;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f4360;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f4361;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f4362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C1614 f4363;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f4364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C1507 f4366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1609 f4367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC1581 f4370;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1614 f4371;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f4373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7895 f4354 = AbstractC1505.f4281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public LayoutDirection f4353 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6557 f4352 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1504) obj);
            return C5175.f14739;
        }

        public final void invoke(InterfaceC1504 interfaceC1504) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f4351 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1504 interfaceC1504) {
            C1516 c1516 = this.this$0;
            C1614 c1614 = c1516.f4371;
            if (!c1516.f4362 || !c1516.f4358 || c1614 == null) {
                c1516.m2784(interfaceC1504);
                return;
            }
            C0108 c0108Mo2696 = interfaceC1504.mo2696();
            long jM367 = c0108Mo2696.m367();
            c0108Mo2696.m385().mo2667();
            try {
                ((C0108) ((C0113) c0108Mo2696.f319).f357).m385().mo2672(c1614);
                c1516.m2784(interfaceC1504);
            } finally {
                c0108Mo2696.m385().mo2679();
                c0108Mo2696.m360(jM367);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1504) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f4369 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f4368 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4372 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0748 f4365 = new C0748();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        f4349 = lowerCase.equals("robolectric") ? C1527.f4417 : Build.VERSION.SDK_INT >= 28 ? C1527.f4416 : C1525.f4415;
    }

    public C1516(InterfaceC1514 interfaceC1514) {
        this.f4355 = interfaceC1514;
        interfaceC1514.mo2716(false);
        this.f4356 = 0L;
        this.f4360 = 0L;
        this.f4361 = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2782(float f) {
        InterfaceC1514 interfaceC1514 = this.f4355;
        if (interfaceC1514.mo2730() == f) {
            return;
        }
        interfaceC1514.mo2732(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1581 m2783() {
        AbstractC1581 c1585;
        AbstractC1581 abstractC1581 = this.f4370;
        C1614 c1614 = this.f4371;
        if (abstractC1581 != null) {
            return abstractC1581;
        }
        if (c1614 != null) {
            C1586 c1586 = new C1586(c1614);
            this.f4370 = c1586;
            return c1586;
        }
        long jM13654 = AbstractC8189.m13654(this.f4360);
        long j = this.f4368;
        long j2 = this.f4372;
        if (j2 != 9205357640488583168L) {
            jM13654 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM13654 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM13654 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f4373;
        if (f > 0.0f) {
            c1585 = new C1576(AbstractC4921.m9888(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c1585 = new C1585(new C7327(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f4370 = c1585;
        return c1585;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2784(androidx.compose.ui.graphics.drawscope.InterfaceC1504 r14) {
        /*
            r13 = this;
            androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏 r0 = r13.f4365
            java.lang.Object r1 = r0.f2154
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰 r1 = (androidx.compose.ui.graphics.layer.C1516) r1
            r0.f2153 = r1
            java.lang.Object r1 = r0.f2152
            androidx.collection.飘花落叶言子世兰楪哲苏 r1 = (androidx.collection.C0235) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.m871()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f2151
            androidx.collection.飘花落叶言子世兰楪哲苏 r2 = (androidx.collection.C0235) r2
            if (r2 != 0) goto L23
            androidx.collection.飘花落叶言子世兰楪哲苏 r2 = androidx.collection.AbstractC0285.f997
            androidx.collection.飘花落叶言子世兰楪哲苏 r2 = new androidx.collection.飘花落叶言子世兰楪哲苏
            r2.<init>()
            r0.f2151 = r2
        L23:
            r2.m747(r1)
            r1.m739()
        L29:
            r1 = 1
            r0.f2155 = r1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r13 = r13.f4352
            r13.invoke(r14)
            r13 = 0
            r0.f2155 = r13
            java.lang.Object r14 = r0.f2153
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰 r14 = (androidx.compose.ui.graphics.layer.C1516) r14
            if (r14 == 0) goto L43
            int r1 = r14.f4364
            int r1 = r1 + (-1)
            r14.f4364 = r1
            r14.m2786()
        L43:
            java.lang.Object r14 = r0.f2151
            androidx.collection.飘花落叶言子世兰楪哲苏 r14 = (androidx.collection.C0235) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.m871()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.f1000
            long[] r1 = r14.f1001
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰 r9 = (androidx.compose.ui.graphics.layer.C1516) r9
            int r10 = r9.f4364
            int r10 = r10 + (-1)
            r9.f4364 = r10
            r9.m2786()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.m739()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.C1516.m2784(androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世兰苏哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2785(InterfaceC1601 interfaceC1601, C1516 c1516) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        if (this.f4357) {
            return;
        }
        m2787();
        InterfaceC1514 interfaceC1514 = this.f4355;
        if (!interfaceC1514.mo2741()) {
            try {
                interfaceC1514.mo2710(this.f4354, this.f4353, this, this.f4351);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = interfaceC1514.mo2720() > 0.0f;
        if (z4) {
            interfaceC1601.mo2674();
        }
        Canvas canvasM2905 = AbstractC1594.m2905(interfaceC1601);
        boolean zIsHardwareAccelerated = canvasM2905.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = this.f4356;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.f4360;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fMo2730 = interfaceC1514.mo2730();
            C1607 c1607Mo2745 = interfaceC1514.mo2745();
            int iMo2711 = interfaceC1514.mo2711();
            if (fMo2730 < 1.0f || iMo2711 != 3 || c1607Mo2745 != null || interfaceC1514.mo2748() == 1) {
                C1609 c1609M2886 = this.f4367;
                if (c1609M2886 == null) {
                    c1609M2886 = AbstractC1581.m2886();
                    this.f4367 = c1609M2886;
                }
                c1609M2886.m2949(fMo2730);
                c1609M2886.m2960(iMo2711);
                c1609M2886.m2963(c1607Mo2745);
                canvasM2905 = canvasM2905;
                f = f2;
                canvasM2905.saveLayer(f, f3, f4, f5, (Paint) c1609M2886.f4715);
            } else {
                canvasM2905.save();
                canvasM2905 = canvasM2905;
                f = f2;
            }
            canvasM2905.translate(f, f3);
            canvasM2905.concat(interfaceC1514.mo2722());
        }
        boolean z5 = !zIsHardwareAccelerated && this.f4358;
        if (z5) {
            interfaceC1601.mo2667();
            AbstractC1581 abstractC1581M2783 = m2783();
            if (abstractC1581M2783 instanceof C1585) {
                InterfaceC1601.m2945(interfaceC1601, ((C1585) abstractC1581M2783).f4671);
            } else if (abstractC1581M2783 instanceof C1576) {
                C1614 c1614M2947 = this.f4363;
                if (c1614M2947 != null) {
                    c1614M2947.f4724.rewind();
                } else {
                    c1614M2947 = AbstractC1603.m2947();
                    this.f4363 = c1614M2947;
                }
                C1614.m2967(c1614M2947, ((C1576) abstractC1581M2783).f4655);
                interfaceC1601.mo2672(c1614M2947);
            } else {
                if (!(abstractC1581M2783 instanceof C1586)) {
                    C4210.m8621();
                    return;
                }
                interfaceC1601.mo2672(((C1586) abstractC1581M2783).f4672);
            }
        }
        if (c1516 != null) {
            C0748 c0748 = c1516.f4365;
            if (!c0748.f2155) {
                AbstractC1589.m2898("Only add dependencies during a tracking");
            }
            C0235 c0235 = (C0235) c0748.f2152;
            if (c0235 != null) {
                c0235.m740(this);
            } else if (((C1516) c0748.f2154) != null) {
                C0235 c02352 = AbstractC0285.f997;
                C0235 c02353 = new C0235();
                C1516 c15162 = (C1516) c0748.f2154;
                c15162.getClass();
                c02353.m740(c15162);
                c02353.m740(this);
                c0748.f2152 = c02353;
                c0748.f2154 = null;
            } else {
                c0748.f2154 = this;
            }
            C0235 c02354 = (C0235) c0748.f2151;
            if (c02354 != null) {
                z3 = !c02354.m745(this);
            } else if (((C1516) c0748.f2153) != this) {
                z3 = true;
            } else {
                c0748.f2153 = null;
                z3 = false;
            }
            if (z3) {
                this.f4364++;
            }
        }
        if (((C1595) interfaceC1601).f4689.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasM2905;
            interfaceC1514.mo2707(interfaceC1601);
        } else {
            C1507 c1507 = this.f4366;
            if (c1507 == null) {
                c1507 = new C1507();
                this.f4366 = c1507;
            }
            C0108 c0108 = c1507.f4283;
            InterfaceC7895 interfaceC7895 = this.f4354;
            LayoutDirection layoutDirection = this.f4353;
            long jM13654 = AbstractC8189.m13654(this.f4360);
            InterfaceC7895 interfaceC7895M388 = c0108.m388();
            LayoutDirection layoutDirectionM369 = c0108.m369();
            InterfaceC1601 interfaceC1601M385 = c0108.m385();
            z2 = z5;
            canvas = canvasM2905;
            long jM367 = c0108.m367();
            z = z4;
            C1516 c15163 = (C1516) c0108.f320;
            c0108.m363(interfaceC7895);
            c0108.m359(layoutDirection);
            c0108.m364(interfaceC1601);
            c0108.m360(jM13654);
            c0108.f320 = this;
            interfaceC1601.mo2667();
            try {
                m2784(c1507);
            } finally {
                interfaceC1601.mo2679();
                c0108.m363(interfaceC7895M388);
                c0108.m359(layoutDirectionM369);
                c0108.m364(interfaceC1601M385);
                c0108.m360(jM367);
                c0108.f320 = c15163;
            }
        }
        if (z2) {
            interfaceC1601.mo2679();
        }
        if (z) {
            interfaceC1601.mo2681();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2786() {
        /*
            r15 = this;
            boolean r0 = r15.f4357
            if (r0 == 0) goto L75
            int r0 = r15.f4364
            if (r0 != 0) goto L75
            androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏 r0 = r15.f4365
            java.lang.Object r1 = r0.f2154
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰 r1 = (androidx.compose.ui.graphics.layer.C1516) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f4364
            int r2 = r2 + (-1)
            r1.f4364 = r2
            r1.m2786()
            r1 = 0
            r0.f2154 = r1
        L1c:
            java.lang.Object r0 = r0.f2152
            androidx.collection.飘花落叶言子世兰楪哲苏 r0 = (androidx.collection.C0235) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f1000
            long[] r2 = r0.f1001
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世苏哲兰 r11 = (androidx.compose.ui.graphics.layer.C1516) r11
            int r12 = r11.f4364
            int r12 = r12 + (-1)
            r11.f4364 = r12
            r11.m2786()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.m739()
        L70:
            androidx.compose.ui.graphics.layer.飘花落叶言子楪世哲苏兰 r15 = r15.f4355
            r15.mo2747()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.C1516.m2786():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2787() {
        Outline outline;
        if (this.f4369) {
            boolean z = this.f4358;
            Outline outline2 = null;
            InterfaceC1514 interfaceC1514 = this.f4355;
            if (z || interfaceC1514.mo2720() > 0.0f) {
                C1614 c1614 = this.f4371;
                if (c1614 != null) {
                    RectF rectF = this.f4359;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f4359 = rectF;
                    }
                    boolean z2 = c1614 instanceof C1614;
                    if (!z2) {
                        C5919.m11247("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c1614.f4724;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f4350;
                        if (outline == null) {
                            outline = new Outline();
                            this.f4350 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                C5919.m11247("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                C5919.m11247("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.f4362 = !outline.canClip();
                    } else {
                        Outline outline3 = this.f4350;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f4362 = true;
                        outline = null;
                    }
                    this.f4371 = c1614;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1514.mo2730());
                        outline2 = outline;
                    }
                    interfaceC1514.mo2744(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f4362 && this.f4358) {
                        interfaceC1514.mo2716(false);
                        interfaceC1514.mo2747();
                    } else {
                        interfaceC1514.mo2716(this.f4358);
                    }
                } else {
                    interfaceC1514.mo2716(this.f4358);
                    Outline outline4 = this.f4350;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f4350 = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM13654 = AbstractC8189.m13654(this.f4360);
                    long j = this.f4368;
                    long j2 = this.f4372;
                    if (j2 != 9205357640488583168L) {
                        jM13654 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM13654 >> 32);
                    int i5 = (int) (jM13654 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.f4373);
                    outline5.setAlpha(interfaceC1514.mo2730());
                    interfaceC1514.mo2744(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                interfaceC1514.mo2716(false);
                interfaceC1514.mo2744(null, 0L);
            }
        }
        this.f4369 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2788(float f, long j, long j2) {
        if (C7328.m12501(this.f4368, j) && C7325.m12488(this.f4372, j2) && this.f4373 == f && this.f4371 == null) {
            return;
        }
        this.f4370 = null;
        this.f4371 = null;
        this.f4369 = true;
        this.f4362 = false;
        this.f4368 = j;
        this.f4372 = j2;
        this.f4373 = f;
        m2787();
    }
}
