package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0193f1 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0111d f1555a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0193f1(C0111d c0111d) {
        this.f1555a = c0111d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((ViewOnAttachStateChangeListenerC0078c4) this.f1555a.f920f).m458b(i, new C0156e1(accessibilityNodeInfo), str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0156e1 c0156e1M615k = this.f1555a.m615k(i);
        if (c0156e1M615k == null) {
            return null;
        }
        return c0156e1M615k.f1256a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f1555a.getClass();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0156e1 c0156e1M615k;
        C0111d c0111d = this.f1555a;
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = (ViewOnAttachStateChangeListenerC0078c4) c0111d.f920f;
        if (i == 1) {
            int i2 = viewOnAttachStateChangeListenerC0078c4.f678p;
            c0156e1M615k = i2 == Integer.MIN_VALUE ? null : c0111d.m615k(i2);
        } else if (i == 2) {
            c0156e1M615k = c0111d.m615k(viewOnAttachStateChangeListenerC0078c4.f677o);
        } else {
            C0921xc.m5131l(AbstractC0748t1.m4154l("Unknown focus type: ", i));
        }
        if (c0156e1M615k == null) {
            return null;
        }
        return c0156e1M615k.f1256a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:119:0x01b2) to fix multi-entry loop: BACK_EDGE: B:119:0x01b2 -> B:120:0x01b3 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0776  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int r19, int r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r21
            d r2 = r2.f1555a
            java.lang.Object r2 = r2.f920f
            c4 r2 = (p000.ViewOnAttachStateChangeListenerC0078c4) r2
            android.view.accessibility.AccessibilityManager r4 = r2.f672j
            r5 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            w3 r7 = r2.f669g
            u20 r8 = r2.m467k()
            java.lang.Object r8 = r8.m4248b(r0)
            zz0 r8 = (p000.zz0) r8
            if (r8 == 0) goto L27
            xz0 r11 = r8.f8062a
            if (r11 != 0) goto L2b
        L27:
            r17 = 0
            goto L7f3
        L2b:
            b60 r8 = r11.f7470c
            int r10 = r11.f7474g
            sz0 r12 = r11.f7471d
            jh0 r13 = r12.f5877d
            e01 r14 = p000.b01.f335n
            java.lang.Object r14 = r13.m1701g(r14)
            if (r14 != 0) goto L3c
            r14 = 0
        L3c:
            r18 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r14 = p000.p30.m3002l(r14, r5)
            r15 = 1
            if (r14 == 0) goto L56
            int r14 = android.os.Build.VERSION.SDK_INT
            r9 = 34
            if (r14 < r9) goto L52
            boolean r9 = p000.AbstractC0709s0.m3995e(r4)
            goto L53
        L52:
            r9 = r15
        L53:
            if (r9 != 0) goto L56
            goto L27
        L56:
            r9 = 64
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r9) goto L7f6
            r4 = 128(0x80, float:1.8E-43)
            if (r1 == r4) goto L7dc
            r9 = 512(0x200, float:7.17E-43)
            r4 = 256(0x100, float:3.59E-43)
            r14 = -1
            if (r1 == r4) goto L676
            if (r1 == r9) goto L676
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r1 == r4) goto L655
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r1 == r4) goto L62f
            boolean r4 = p000.rd0.m3478g(r11)
            if (r4 != 0) goto L78
            goto L27
        L78:
            if (r1 == r15) goto L605
            r4 = 2
            if (r1 == r4) goto L5e8
            k50 r4 = p000.k50.f3016e
            switch(r1) {
                case 16: goto L5bb;
                case 32: goto L59a;
                case 4096: goto L3bd;
                case 8192: goto L3bd;
                case 32768: goto L39c;
                case 65536: goto L37b;
                case 262144: goto L35a;
                case 524288: goto L339;
                case 1048576: goto L318;
                case 2097152: goto L2e4;
                case 16908342: goto L19c;
                case 16908349: goto L167;
                case 16908372: goto L146;
                default: goto L82;
            }
        L82:
            switch(r1) {
                case 16908344: goto L3bd;
                case 16908345: goto L3bd;
                case 16908346: goto L3bd;
                case 16908347: goto L3bd;
                default: goto L85;
            }
        L85:
            switch(r1) {
                case 16908358: goto L125;
                case 16908359: goto L104;
                case 16908360: goto Le3;
                case 16908361: goto Lc2;
                default: goto L88;
            }
        L88:
            l31 r2 = r2.f684v
            java.lang.Object r0 = r2.m1973b(r0)
            l31 r0 = (p000.l31) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.m1973b(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L9b
            goto L27
        L9b:
            e01 r0 = p000.rz0.f5610w
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto La5
            r15 = 0
            goto La6
        La5:
            r15 = r0
        La6:
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto Lac
            goto L27
        Lac:
            int r0 = r15.size()
            if (r0 > 0) goto Lb4
            goto L27
        Lb4:
            r0 = 0
            java.lang.Object r1 = r15.get(r0)
            r1.getClass()
            p000.C0921xc.m5123d()
            r9 = 0
            goto L820
        Lc2:
            e01 r0 = p000.rz0.f5586A
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto Lcc
            r15 = 0
            goto Lcd
        Lcc:
            r15 = r0
        Lcd:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        Le3:
            e01 r0 = p000.rz0.f5612y
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto Led
            r15 = 0
            goto Lee
        Led:
            r15 = r0
        Lee:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L104:
            e01 r0 = p000.rz0.f5613z
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L10e
            r15 = 0
            goto L10f
        L10e:
            r15 = r0
        L10f:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L125:
            e01 r0 = p000.rz0.f5611x
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L12f
            r15 = 0
            goto L130
        L12f:
            r15 = r0
        L130:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L146:
            e01 r0 = p000.rz0.f5602o
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L150
            r15 = 0
            goto L151
        L150:
            r15 = r0
        L151:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L167:
            if (r3 == 0) goto L27
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto L173
            goto L27
        L173:
            e01 r1 = p000.rz0.f5596i
            java.lang.Object r1 = r13.m1701g(r1)
            if (r1 != 0) goto L17d
            r15 = 0
            goto L17e
        L17d:
            r15 = r1
        L17e:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r1 = r15.f4378b
            sw r1 = (p000.InterfaceC0742sw) r1
            if (r1 == 0) goto L27
            float r0 = r3.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L19c:
            xz0 r0 = r11.m5189l()
            if (r0 == 0) goto L1b2
            sz0 r1 = r0.f7471d
            e01 r2 = p000.rz0.f5591d
            jh0 r1 = r1.f5877d
            java.lang.Object r1 = r1.m1701g(r2)
            if (r1 != 0) goto L1af
            r1 = 0
        L1af:
            o0 r1 = (p000.C0533o0) r1
            goto L1b3
        L1b2:
            r1 = 0
        L1b3:
            if (r0 == 0) goto L1ce
            if (r1 == 0) goto L1b8
            goto L1ce
        L1b8:
            xz0 r0 = r0.m5189l()
            if (r0 == 0) goto L1b2
            sz0 r1 = r0.f7471d
            e01 r2 = p000.rz0.f5591d
            jh0 r1 = r1.f5877d
            java.lang.Object r1 = r1.m1701g(r2)
            if (r1 != 0) goto L1cb
            r1 = 0
        L1cb:
            o0 r1 = (p000.C0533o0) r1
            goto L1b3
        L1ce:
            if (r0 != 0) goto L209
            st0 r0 = r11.m5185g()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r0.f5832a
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            float r3 = r0.f5833b
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r0.f5834c
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = p000.rd0.m3458Q(r4)
            float r0 = r0.f5835d
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
            int r0 = p000.rd0.m3458Q(r0)
            r1.<init>(r2, r3, r4, r0)
            boolean r9 = r7.requestRectangleOnScreen(r1)
            goto L820
        L209:
            sz0 r2 = r0.f7471d
            jh0 r2 = r2.f5877d
            b60 r0 = r0.f7470c
            mj0 r3 = r0.f395I
            c20 r3 = r3.f3995c
            st0 r3 = p000.j50.m1657g(r3)
            mj0 r0 = r0.f395I
            c20 r0 = r0.f3995c
            i50 r0 = r0.mo346k()
            r5 = 0
            if (r0 == 0) goto L22a
            qj0 r0 = (p000.qj0) r0
            long r9 = r0.m3275P0(r5)
            goto L22b
        L22a:
            r9 = r5
        L22b:
            st0 r0 = r3.m4105e(r9)
            qj0 r3 = r11.m5182d()
            if (r3 == 0) goto L246
            oe0 r7 = r3.mo436G0()
            boolean r7 = r7.f4542q
            if (r7 == 0) goto L23e
            goto L23f
        L23e:
            r3 = 0
        L23f:
            if (r3 == 0) goto L246
            long r9 = r3.m3275P0(r5)
            goto L247
        L246:
            r9 = r5
        L247:
            qj0 r3 = r11.m5182d()
            if (r3 == 0) goto L24f
            long r5 = r3.f7402f
        L24f:
            long r5 = p000.o30.m2759C(r5)
            st0 r3 = p000.v50.m4398b(r9, r5)
            e01 r5 = p000.b01.f342u
            java.lang.Object r5 = r2.m1701g(r5)
            if (r5 != 0) goto L260
            r5 = 0
        L260:
            hy0 r5 = (p000.hy0) r5
            e01 r5 = p000.b01.f343v
            java.lang.Object r2 = r2.m1701g(r5)
            if (r2 != 0) goto L26d
            r16 = 0
            goto L26f
        L26d:
            r16 = r2
        L26f:
            hy0 r16 = (p000.hy0) r16
            float r2 = r3.f5832a
            float r5 = r0.f5832a
            float r2 = r2 - r5
            float r5 = r3.f5834c
            float r6 = r0.f5834c
            float r5 = r5 - r6
            float r6 = java.lang.Math.signum(r2)
            float r7 = java.lang.Math.signum(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L296
            float r6 = java.lang.Math.abs(r2)
            float r7 = java.lang.Math.abs(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L294
            goto L298
        L294:
            r2 = r5
            goto L298
        L296:
            r2 = r18
        L298:
            k50 r5 = r8.f389C
            if (r5 != r4) goto L29d
            float r2 = -r2
        L29d:
            float r4 = r3.f5833b
            float r5 = r0.f5833b
            float r4 = r4 - r5
            float r3 = r3.f5835d
            float r0 = r0.f5835d
            float r3 = r3 - r0
            float r0 = java.lang.Math.signum(r4)
            float r5 = java.lang.Math.signum(r3)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L2c3
            float r0 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r3)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2c1
            r5 = r4
            goto L2c5
        L2c1:
            r5 = r3
            goto L2c5
        L2c3:
            r5 = r18
        L2c5:
            if (r1 == 0) goto L27
            ex r0 = r1.f4378b
            ww r0 = (p000.InterfaceC0904ww) r0
            if (r0 == 0) goto L27
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r15) goto L27
        L2e1:
            r9 = r15
            goto L820
        L2e4:
            if (r3 == 0) goto L2ed
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r3.getString(r0)
            goto L2ee
        L2ed:
            r0 = 0
        L2ee:
            e01 r1 = p000.rz0.f5598k
            java.lang.Object r1 = r13.m1701g(r1)
            if (r1 != 0) goto L2f8
            r15 = 0
            goto L2f9
        L2f8:
            r15 = r1
        L2f9:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r1 = r15.f4378b
            sw r1 = (p000.InterfaceC0742sw) r1
            if (r1 == 0) goto L27
            f8 r2 = new f8
            if (r0 != 0) goto L309
            java.lang.String r0 = ""
        L309:
            r2.<init>(r0)
            java.lang.Object r0 = r1.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L318:
            e01 r0 = p000.rz0.f5608u
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L322
            r15 = 0
            goto L323
        L322:
            r15 = r0
        L323:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L339:
            e01 r0 = p000.rz0.f5607t
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L343
            r15 = 0
            goto L344
        L343:
            r15 = r0
        L344:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L35a:
            e01 r0 = p000.rz0.f5606s
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L364
            r15 = 0
            goto L365
        L364:
            r15 = r0
        L365:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L37b:
            e01 r0 = p000.rz0.f5604q
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L385
            r15 = 0
            goto L386
        L385:
            r15 = r0
        L386:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L39c:
            e01 r0 = p000.rz0.f5605r
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L3a6
            r15 = 0
            goto L3a7
        L3a6:
            r15 = r0
        L3a7:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L3bd:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L3c3
            r0 = r15
            goto L3c4
        L3c3:
            r0 = 0
        L3c4:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 != r2) goto L3ca
            r2 = r15
            goto L3cb
        L3ca:
            r2 = 0
        L3cb:
            r3 = 16908345(0x1020039, float:2.387739E-38)
            if (r1 != r3) goto L3d2
            r3 = r15
            goto L3d3
        L3d2:
            r3 = 0
        L3d3:
            r5 = 16908347(0x102003b, float:2.3877394E-38)
            if (r1 != r5) goto L3da
            r5 = r15
            goto L3db
        L3da:
            r5 = 0
        L3db:
            r7 = 16908344(0x1020038, float:2.3877386E-38)
            if (r1 != r7) goto L3e2
            r7 = r15
            goto L3e3
        L3e2:
            r7 = 0
        L3e3:
            r9 = 16908346(0x102003a, float:2.3877392E-38)
            if (r1 != r9) goto L3ea
            r1 = r15
            goto L3eb
        L3ea:
            r1 = 0
        L3eb:
            if (r3 != 0) goto L3f6
            if (r5 != 0) goto L3f6
            if (r0 != 0) goto L3f6
            if (r2 == 0) goto L3f4
            goto L3f6
        L3f4:
            r9 = 0
            goto L3f7
        L3f6:
            r9 = r15
        L3f7:
            if (r7 != 0) goto L401
            if (r1 != 0) goto L401
            if (r0 != 0) goto L401
            if (r2 == 0) goto L400
            goto L401
        L400:
            r15 = 0
        L401:
            if (r0 != 0) goto L405
            if (r2 == 0) goto L43e
        L405:
            e01 r0 = p000.b01.f324c
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L40e
            r0 = 0
        L40e:
            ys0 r0 = (p000.ys0) r0
            e01 r1 = p000.rz0.f5596i
            java.lang.Object r1 = r13.m1701g(r1)
            if (r1 != 0) goto L419
            r1 = 0
        L419:
            o0 r1 = (p000.C0533o0) r1
            if (r0 == 0) goto L43e
            if (r1 == 0) goto L43e
            if (r2 == 0) goto L424
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L426
        L424:
            r0 = r18
        L426:
            ex r1 = r1.f4378b
            sw r1 = (p000.InterfaceC0742sw) r1
            if (r1 == 0) goto L27
            float r5 = r18 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L43e:
            mj0 r0 = r8.f395I
            c20 r0 = r0.f3995c
            st0 r0 = p000.j50.m1657g(r0)
            long r0 = r0.m4102b()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            e01 r11 = p000.rz0.f5587B
            java.lang.Object r11 = r13.m1701g(r11)
            if (r11 != 0) goto L458
            r11 = 0
        L458:
            o0 r11 = (p000.C0533o0) r11
            if (r11 == 0) goto L476
            ex r11 = r11.f4378b
            sw r11 = (p000.InterfaceC0742sw) r11
            if (r11 == 0) goto L476
            java.lang.Object r11 = r11.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L476
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            java.lang.Float r10 = (java.lang.Float) r10
            goto L477
        L476:
            r10 = 0
        L477:
            e01 r11 = p000.rz0.f5591d
            java.lang.Object r11 = r13.m1701g(r11)
            if (r11 != 0) goto L480
            r11 = 0
        L480:
            o0 r11 = (p000.C0533o0) r11
            if (r11 != 0) goto L486
            goto L27
        L486:
            ex r11 = r11.f4378b
            e01 r12 = p000.b01.f342u
            java.lang.Object r12 = r13.m1701g(r12)
            if (r12 != 0) goto L491
            r12 = 0
        L491:
            hy0 r12 = (p000.hy0) r12
            if (r12 == 0) goto L515
            if (r9 == 0) goto L515
            if (r10 == 0) goto L4a0
            float r9 = r10.floatValue()
            r19 = r0
            goto L4ab
        L4a0:
            r9 = 32
            r19 = r0
            long r0 = r19 >> r9
            int r0 = (int) r0
            float r9 = java.lang.Float.intBitsToFloat(r0)
        L4ab:
            if (r3 != 0) goto L4af
            if (r2 == 0) goto L4b0
        L4af:
            float r9 = -r9
        L4b0:
            k50 r0 = r8.f389C
            if (r0 != r4) goto L4b9
            if (r3 != 0) goto L4b8
            if (r5 == 0) goto L4b9
        L4b8:
            float r9 = -r9
        L4b9:
            boolean r0 = p000.ViewOnAttachStateChangeListenerC0078c4.m448p(r12, r9)
            if (r0 == 0) goto L517
            e01 r0 = p000.rz0.f5612y
            boolean r1 = r13.m1697c(r0)
            if (r1 != 0) goto L4e4
            e01 r1 = p000.rz0.f5586A
            boolean r1 = r13.m1697c(r1)
            if (r1 == 0) goto L4d0
            goto L4e4
        L4d0:
            ww r11 = (p000.InterfaceC0904ww) r11
            if (r11 == 0) goto L27
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            java.lang.Object r0 = r11.invoke(r0, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L4e4:
            int r1 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r1 <= 0) goto L4f6
            e01 r0 = p000.rz0.f5586A
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L4f2
            r15 = 0
            goto L4f3
        L4f2:
            r15 = r0
        L4f3:
            o0 r15 = (p000.C0533o0) r15
            goto L501
        L4f6:
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L4fe
            r15 = 0
            goto L4ff
        L4fe:
            r15 = r0
        L4ff:
            o0 r15 = (p000.C0533o0) r15
        L501:
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L515:
            r19 = r0
        L517:
            e01 r0 = p000.b01.f343v
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L520
            r0 = 0
        L520:
            hy0 r0 = (p000.hy0) r0
            if (r0 == 0) goto L27
            if (r15 == 0) goto L27
            if (r10 == 0) goto L52d
            float r1 = r10.floatValue()
            goto L539
        L52d:
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r19 & r3
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L539:
            if (r7 != 0) goto L53d
            if (r2 == 0) goto L53e
        L53d:
            float r1 = -r1
        L53e:
            boolean r0 = p000.ViewOnAttachStateChangeListenerC0078c4.m448p(r0, r1)
            if (r0 == 0) goto L27
            e01 r0 = p000.rz0.f5611x
            boolean r2 = r13.m1697c(r0)
            if (r2 != 0) goto L569
            e01 r2 = p000.rz0.f5613z
            boolean r2 = r13.m1697c(r2)
            if (r2 == 0) goto L555
            goto L569
        L555:
            ww r11 = (p000.InterfaceC0904ww) r11
            if (r11 == 0) goto L27
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r11.invoke(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L569:
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 <= 0) goto L57b
            e01 r0 = p000.rz0.f5613z
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L577
            r15 = 0
            goto L578
        L577:
            r15 = r0
        L578:
            o0 r15 = (p000.C0533o0) r15
            goto L586
        L57b:
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L583
            r15 = 0
            goto L584
        L583:
            r15 = r0
        L584:
            o0 r15 = (p000.C0533o0) r15
        L586:
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L59a:
            e01 r0 = p000.rz0.f5590c
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L5a4
            r15 = 0
            goto L5a5
        L5a4:
            r15 = r0
        L5a5:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L5bb:
            e01 r1 = p000.rz0.f5589b
            java.lang.Object r1 = r13.m1701g(r1)
            if (r1 != 0) goto L5c4
            r1 = 0
        L5c4:
            o0 r1 = (p000.C0533o0) r1
            if (r1 == 0) goto L5da
            ex r1 = r1.f4378b
            hw r1 = (p000.InterfaceC0298hw) r1
            if (r1 == 0) goto L5da
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r16 = r1
        L5d6:
            r1 = 12
            r3 = 0
            goto L5dd
        L5da:
            r16 = 0
            goto L5d6
        L5dd:
            p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r0, r15, r3, r1)
            if (r16 == 0) goto L27
            boolean r9 = r16.booleanValue()
            goto L820
        L5e8:
            e01 r0 = p000.b01.f332k
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L5f1
            r0 = 0
        L5f1:
            boolean r0 = p000.p30.m3002l(r0, r5)
            if (r0 == 0) goto L27
            wu r0 = r7.getFocusOwner()
            zu r0 = (p000.C1017zu) r0
            r1 = 8
            r11 = 0
            r0.m5608b(r1, r11, r15)
            goto L2e1
        L605:
            boolean r0 = r7.isInTouchMode()
            if (r0 == 0) goto L60e
            r7.requestFocusFromTouch()
        L60e:
            e01 r0 = p000.rz0.f5609v
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L618
            r15 = 0
            goto L619
        L618:
            r15 = r0
        L619:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L62f:
            if (r3 == 0) goto L638
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r0 = r3.getInt(r0, r14)
            goto L639
        L638:
            r0 = r14
        L639:
            if (r3 == 0) goto L641
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r14 = r3.getInt(r1, r14)
        L641:
            r1 = 0
            boolean r0 = r2.m454C(r11, r0, r14, r1)
            if (r0 == 0) goto L652
            int r3 = r2.m471s(r10)
            r4 = 12
            r5 = 0
            p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r3, r1, r5, r4)
        L652:
            r9 = r0
            goto L820
        L655:
            e01 r0 = p000.rz0.f5603p
            java.lang.Object r0 = r13.m1701g(r0)
            if (r0 != 0) goto L65f
            r15 = 0
            goto L660
        L65f:
            r15 = r0
        L660:
            o0 r15 = (p000.C0533o0) r15
            if (r15 == 0) goto L27
            ex r0 = r15.f4378b
            hw r0 = (p000.InterfaceC0298hw) r0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L820
        L676:
            if (r3 == 0) goto L27
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r0 = r3.getInt(r0)
            java.lang.String r5 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r3 = r3.getBoolean(r5)
            if (r1 != r4) goto L688
            r1 = r15
            goto L689
        L688:
            r1 = 0
        L689:
            java.lang.Integer r5 = r2.f687y
            if (r5 != 0) goto L68e
            goto L694
        L68e:
            int r5 = r5.intValue()
            if (r10 == r5) goto L69c
        L694:
            r2.f686x = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r2.f687y = r5
        L69c:
            java.lang.String r5 = p000.ViewOnAttachStateChangeListenerC0078c4.m447l(r11)
            if (r5 == 0) goto L27
            int r6 = r5.length()
            if (r6 != 0) goto L6aa
            goto L27
        L6aa:
            java.lang.String r6 = p000.ViewOnAttachStateChangeListenerC0078c4.m447l(r11)
            if (r6 == 0) goto L6c7
            int r8 = r6.length()
            if (r8 != 0) goto L6b7
            goto L6c7
        L6b7:
            if (r0 == r15) goto L74a
            r8 = 2
            if (r0 == r8) goto L722
            r7 = 4
            if (r0 == r7) goto L6de
            r8 = 8
            if (r0 == r8) goto L6ca
            r8 = 16
            if (r0 == r8) goto L6de
        L6c7:
            r7 = 0
            goto L772
        L6ca:
            w0 r7 = p000.C0872w0.f6884c
            if (r7 != 0) goto L6d5
            w0 r7 = new w0
            r7.<init>()
            p000.C0872w0.f6884c = r7
        L6d5:
            w0 r7 = p000.C0872w0.f6884c
            r7.getClass()
            r7.f5882a = r6
            goto L772
        L6de:
            e01 r8 = p000.rz0.f5588a
            boolean r8 = r13.m1697c(r8)
            if (r8 != 0) goto L6e7
            goto L6c7
        L6e7:
            g71 r8 = p000.u50.m4273p(r12)
            if (r8 != 0) goto L6ee
            goto L6c7
        L6ee:
            if (r0 != r7) goto L706
            u0 r7 = p000.C0786u0.f6084g
            if (r7 != 0) goto L6fc
            u0 r7 = new u0
            r10 = 2
            r7.<init>(r10)
            p000.C0786u0.f6084g = r7
        L6fc:
            u0 r7 = p000.C0786u0.f6084g
            r7.getClass()
            r7.f5882a = r6
            r7.f6088d = r8
            goto L772
        L706:
            v0 r7 = p000.C0823v0.f6362e
            if (r7 != 0) goto L716
            v0 r7 = new v0
            r7.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            p000.C0823v0.f6362e = r7
        L716:
            v0 r7 = p000.C0823v0.f6362e
            r7.getClass()
            r7.f5882a = r6
            r7.f6365c = r8
            r7.f6366d = r11
            goto L772
        L722:
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            u0 r8 = p000.C0786u0.f6083f
            if (r8 != 0) goto L741
            u0 r8 = new u0
            r8.<init>(r15)
            java.text.BreakIterator r7 = java.text.BreakIterator.getWordInstance(r7)
            r8.f6088d = r7
            p000.C0786u0.f6083f = r8
        L741:
            u0 r7 = p000.C0786u0.f6083f
            r7.getClass()
            r7.m4240f(r6)
            goto L772
        L74a:
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            u0 r8 = p000.C0786u0.f6082e
            if (r8 != 0) goto L76a
            u0 r8 = new u0
            r10 = 0
            r8.<init>(r10)
            java.text.BreakIterator r7 = java.text.BreakIterator.getCharacterInstance(r7)
            r8.f6088d = r7
            p000.C0786u0.f6082e = r8
        L76a:
            u0 r7 = p000.C0786u0.f6082e
            r7.getClass()
            r7.m4240f(r6)
        L772:
            if (r7 != 0) goto L776
            goto L27
        L776:
            int r6 = r2.m465i(r11)
            if (r6 != r14) goto L785
            if (r1 == 0) goto L780
            r5 = 0
            goto L784
        L780:
            int r5 = r5.length()
        L784:
            r6 = r5
        L785:
            if (r1 == 0) goto L78c
            int[] r5 = r7.mo4139a(r6)
            goto L790
        L78c:
            int[] r5 = r7.mo4142d(r6)
        L790:
            if (r5 != 0) goto L794
            goto L27
        L794:
            r17 = 0
            r6 = r5[r17]
            r5 = r5[r15]
            if (r3 == 0) goto L7bd
            e01 r3 = p000.b01.f322a
            boolean r3 = r13.m1697c(r3)
            if (r3 != 0) goto L7bd
            e01 r3 = p000.b01.f312E
            boolean r3 = r13.m1697c(r3)
            if (r3 == 0) goto L7bd
            int r3 = r2.m466j(r11)
            if (r3 != r14) goto L7b7
            if (r1 == 0) goto L7b6
            r3 = r6
            goto L7b7
        L7b6:
            r3 = r5
        L7b7:
            if (r1 == 0) goto L7bb
            r7 = r5
            goto L7c3
        L7bb:
            r7 = r6
            goto L7c3
        L7bd:
            if (r1 == 0) goto L7c1
            r3 = r5
            goto L7c2
        L7c1:
            r3 = r6
        L7c2:
            r7 = r3
        L7c3:
            if (r1 == 0) goto L7c7
            r12 = r4
            goto L7c8
        L7c7:
            r12 = r9
        L7c8:
            y3 r10 = new y3
            long r16 = android.os.SystemClock.uptimeMillis()
            r13 = r0
            r14 = r6
            r1 = r15
            r15 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.f654C = r10
            r2.m454C(r11, r3, r7, r1)
        L7da:
            r9 = r1
            goto L820
        L7dc:
            r1 = r15
            r17 = 0
            int r3 = r2.f677o
            if (r3 != r0) goto L7f3
            r2.f677o = r14
            r3 = 0
            r2.f679q = r3
            r7.invalidate()
            r5 = 65536(0x10000, float:9.1835E-41)
            r6 = 12
            p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r0, r5, r3, r6)
            goto L7da
        L7f3:
            r9 = r17
            goto L820
        L7f6:
            r1 = r15
            r3 = 0
            r5 = 65536(0x10000, float:9.1835E-41)
            r6 = 12
            r17 = 0
            boolean r8 = r4.isEnabled()
            if (r8 == 0) goto L7f3
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L7f3
            int r4 = r2.f677o
            if (r4 != r0) goto L80f
            goto L7f3
        L80f:
            if (r4 == r14) goto L814
            p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r4, r5, r3, r6)
        L814:
            r2.f677o = r0
            r7.invalidate()
            r4 = 32768(0x8000, float:4.5918E-41)
            p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r0, r4, r3, r6)
            goto L7da
        L820:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0193f1.performAction(int, int, android.os.Bundle):boolean");
    }
}
