package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1001f;
import p071n.C1002g;
import p071n.C1003h;
import p073o.C1013b;
import p075p.AbstractC1052r;
import p075p.AbstractC1053s;
import p075p.C1040f;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC1053s {

    /* JADX INFO: renamed from: i */
    public C1002g f1257i;

    public Flow(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f3870a = new int[32];
        this.f3875f = new HashMap();
        this.f3872c = r2;
        mo1155e(r3);
    }

    @Override // p075p.AbstractC1053s, p075p.AbstractC1037c
    /* JADX INFO: renamed from: e */
    public final void mo1155e(AttributeSet r9) {
        super.mo1155e(r9);
        C1002g r02 = new C1002g();
        r02.f3687f0 = 0;
        r02.f3688g0 = 0;
        r02.f3689h0 = 0;
        r02.f3690i0 = 0;
        r02.f3691j0 = 0;
        r02.f3692k0 = 0;
        r02.f3693l0 = false;
        r02.f3694m0 = 0;
        r02.f3695n0 = 0;
        r02.f3696o0 = new C1013b();
        r02.f3697p0 = null;
        r02.f3698q0 = -1;
        r02.f3699r0 = -1;
        r02.f3700s0 = -1;
        r02.f3701t0 = -1;
        r02.f3702u0 = -1;
        r02.f3703v0 = -1;
        r02.f3704w0 = 0.5f;
        r02.f3705x0 = 0.5f;
        r02.f3706y0 = 0.5f;
        r02.f3707z0 = 0.5f;
        r02.f3672A0 = 0.5f;
        r02.f3673B0 = 0.5f;
        r02.f3674C0 = 0;
        r02.f3675D0 = 0;
        r02.f3676E0 = 2;
        r02.f3677F0 = 2;
        r02.f3678G0 = 0;
        r02.f3679H0 = -1;
        r02.f3680I0 = 0;
        r02.f3681J0 = new ArrayList();
        r02.f3682K0 = null;
        r02.f3683L0 = null;
        r02.f3684M0 = null;
        r02.f3686O0 = 0;
        this.f1257i = r02;
        if (r9 == null) goto L84;
        TypedArray r92 = getContext().obtainStyledAttributes(r9, AbstractC1052r.f4051b);
        int r03 = r92.getIndexCount();
        int r2 = 0;
    L5:
        if (r2 >= r03) goto L84;
        int r6 = r92.getIndex(r2);
        if (r6 != 0) goto L10;
        this.f1257i.f3680I0 = r92.getInt(r6, 0);
    L83:
        r2 = r2 + 1;
        goto L5
    L10:
        if (r6 != 1) goto L13;
        C1002g r7 = this.f1257i;
        int r62 = r92.getDimensionPixelSize(r6, 0);
        r7.f3687f0 = r62;
        r7.f3688g0 = r62;
        r7.f3689h0 = r62;
        r7.f3690i0 = r62;
        goto L83
    L13:
        if (r6 != 11) goto L16;
        C1002g r72 = this.f1257i;
        int r63 = r92.getDimensionPixelSize(r6, 0);
        r72.f3689h0 = r63;
        r72.f3691j0 = r63;
        r72.f3692k0 = r63;
        goto L83
    L16:
        if (r6 != 12) goto L18;
        this.f1257i.f3690i0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L18:
        if (r6 != 2) goto L21;
        this.f1257i.f3691j0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L21:
        if (r6 != 3) goto L24;
        this.f1257i.f3687f0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L24:
        if (r6 != 4) goto L27;
        this.f1257i.f3692k0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L27:
        if (r6 != 5) goto L30;
        this.f1257i.f3688g0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L30:
        if (r6 != 37) goto L33;
        this.f1257i.f3678G0 = r92.getInt(r6, 0);
        goto L83
    L33:
        if (r6 != 27) goto L36;
        this.f1257i.f3698q0 = r92.getInt(r6, 0);
        goto L83
    L36:
        if (r6 != 36) goto L39;
        this.f1257i.f3699r0 = r92.getInt(r6, 0);
        goto L83
    L39:
        if (r6 != 21) goto L42;
        this.f1257i.f3700s0 = r92.getInt(r6, 0);
        goto L83
    L42:
        if (r6 != 29) goto L45;
        this.f1257i.f3702u0 = r92.getInt(r6, 0);
        goto L83
    L45:
        if (r6 != 23) goto L48;
        this.f1257i.f3701t0 = r92.getInt(r6, 0);
        goto L83
    L48:
        if (r6 != 31) goto L51;
        this.f1257i.f3703v0 = r92.getInt(r6, 0);
        goto L83
    L51:
        if (r6 != 25) goto L54;
        this.f1257i.f3704w0 = r92.getFloat(r6, 0.5f);
        goto L83
    L54:
        if (r6 != 20) goto L57;
        this.f1257i.f3706y0 = r92.getFloat(r6, 0.5f);
        goto L83
    L57:
        if (r6 != 28) goto L60;
        this.f1257i.f3672A0 = r92.getFloat(r6, 0.5f);
        goto L83
    L60:
        if (r6 != 22) goto L63;
        this.f1257i.f3707z0 = r92.getFloat(r6, 0.5f);
        goto L83
    L63:
        if (r6 != 30) goto L66;
        this.f1257i.f3673B0 = r92.getFloat(r6, 0.5f);
        goto L83
    L66:
        if (r6 != 34) goto L69;
        this.f1257i.f3705x0 = r92.getFloat(r6, 0.5f);
        goto L83
    L69:
        if (r6 != 24) goto L72;
        this.f1257i.f3676E0 = r92.getInt(r6, 2);
        goto L83
    L72:
        if (r6 != 33) goto L75;
        this.f1257i.f3677F0 = r92.getInt(r6, 2);
        goto L83
    L75:
        if (r6 != 26) goto L78;
        this.f1257i.f3674C0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L78:
        if (r6 != 35) goto L81;
        this.f1257i.f3675D0 = r92.getDimensionPixelSize(r6, 0);
        goto L83
    L81:
        if (r6 != 32) goto L83;
        this.f1257i.f3679H0 = r92.getInt(r6, -1);
    L84:
        this.f3873d = this.f1257i;
        m2517g();
    }

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: f */
    public final void mo1156f(C0999d r3, boolean r4) {
        C1002g r32 = this.f1257i;
        int r02 = r32.f3689h0;
        if (r02 <= 0) goto L5;
    L6:
        if (r4 == false) goto L8;
        r32.f3691j0 = r32.f3690i0;
        r32.f3692k0 = r02;
        return;
    L8:
        r32.f3691j0 = r02;
        r32.f3692k0 = r32.f3690i0;
        return;
    L5:
        if (r32.f3690i0 > 0) goto L6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p075p.AbstractC1053s
    /* JADX INFO: renamed from: h */
    public final void mo1157h(C1002g r40, int r41, int r42) {
        int r10 = View.MeasureSpec.getMode(r41);
        int r11 = View.MeasureSpec.getSize(r41);
        int r12 = View.MeasureSpec.getMode(r42);
        int r13 = View.MeasureSpec.getSize(r42);
        if (r40 != null) goto L5;
        setMeasuredDimension(0, 0);
        return;
    L5:
        if (r40.f3714e0 <= 0) goto L39;
        C0999d r1 = r40.f3592I;
        if (r1 == null) goto L9;
        C1040f r14 = ((C1000e) r1).f3642g0;
    L10:
        if (r14 != null) goto L12;
        r40.f3694m0 = 0;
        r40.f3695n0 = 0;
        r40.f3693l0 = false;
    L330:
        setMeasuredDimension(r40.f3694m0, r40.f3695n0);
        return;
    L12:
        int r3 = 0;
    L14:
        if (r3 >= r40.f3714e0) goto L39;
        C0999d r4 = r40.f3713d0[r3];
        if (r4 == null) goto L38;
        if ((r4 instanceof C1003h) == true) goto L38;
        int r5 = r4.m2403h(0);
        int r6 = r4.m2403h(1);
        if (r5 == 3) goto L24;
    L29:
        if (r5 != 3) goto L31;
        r5 = 2;
    L31:
        if (r6 != 3) goto L33;
        r6 = 2;
    L33:
        C1013b r2 = r40.f3696o0;
        r2.f3724a = r5;
        r2.f3725b = r6;
        r2.f3726c = r4.m2407l();
        r2.f3727d = r4.m2404i();
        r14.m2519a(r4, r2);
        r4.m2420y(r2.f3728e);
        r4.m2417v(r2.f3729f);
        int r22 = r2.f3730g;
        r4.f3599P = r22;
        if (r22 <= 0) goto L36;
        boolean r23 = true;
    L37:
        r4.f3635w = r23;
        goto L38
    L36:
        r23 = false;
        goto L37
    L24:
        if (r4.f3622j == 1) goto L29;
        if (r6 != 3) goto L29;
        if (r4.f3623k == 1) goto L29;
    L38:
        r3 = r3 + 1;
        goto L14
    L9:
        r14 = null;
    L39:
        int r62 = r40.f3691j0;
        int r52 = r40.f3692k0;
        int r43 = r40.f3687f0;
        int r32 = r40.f3688g0;
        int[] r24 = new int[2];
        int r15 = (r11 - r62) - r52;
        int r7 = r40.f3680I0;
        if (r7 != 1) goto L43;
        r15 = (r13 - r43) - r32;
    L43:
        if (r7 != 0) goto L51;
        if (r40.f3698q0 != (-1)) goto L48;
        r40.f3698q0 = 0;
    L48:
        if (r40.f3699r0 != (-1)) goto L56;
        r40.f3699r0 = 0;
    L56:
        C0999d[] r72 = r40.f3713d0;
        int r152 = 0;
        int r17 = 0;
    L57:
        int r142 = r40.f3714e0;
        if (r152 >= r142) goto L63;
        if (r40.f3713d0[r152].f3605V != 8) goto L62;
        r17 = r17 + 1;
    L62:
        r152 = r152 + 1;
        goto L57
    L63:
        if (r17 <= 0) goto L73;
        r72 = new C0999d[r142 - r17];
        int r143 = 0;
        int r153 = 0;
    L66:
        if (r143 >= r40.f3714e0) goto L71;
        C0999d r8 = r40.f3713d0[r143];
        int r19 = r32;
        int r20 = r43;
        if (r8.f3605V == 8) goto L70;
        r72[r153] = r8;
        r153 = r153 + 1;
    L70:
        r143 = r143 + 1;
        r32 = r19;
        r43 = r20;
        goto L66
    L71:
        int r192 = r32;
        int r202 = r43;
    L72:
        C0999d[] r144 = r72;
        r40.f3685N0 = r144;
        r40.f3686O0 = r153;
        int r33 = r40.f3678G0;
        ArrayList r82 = r40.f3681J0;
        if (r33 != 0) goto L77;
        int[] r29 = r24;
        int r322 = r52;
        int r332 = r62;
        int r37 = r10;
        int r36 = r11;
        int r34 = r12;
        int r27 = r13;
        int r30 = r192;
        int r31 = r202;
        char r35 = 1;
        int r112 = r15;
        int r02 = r40.f3680I0;
        if (r153 != 0) goto L302;
    L198:
        char r16 = 0;
    L309:
        int r03 = (r29[r16] + r332) + r322;
        int r18 = (r29[r35] + r31) + r30;
        int r44 = r37;
        if (r44 != 1073741824) goto L312;
        int r04 = r34;
        int r113 = r36;
    L318:
        if (r04 != 1073741824) goto L320;
        int r132 = r27;
    L325:
        r40.f3694m0 = r113;
        r40.f3695n0 = r132;
        r40.m2420y(r113);
        r40.m2417v(r132);
        if (r40.f3714e0 <= 0) goto L328;
        boolean r145 = r35;
    L329:
        r40.f3693l0 = r145;
        goto L330
    L328:
        r145 = 0;
        goto L329
    L320:
        if (r04 != Integer.MIN_VALUE) goto L322;
        r132 = Math.min(r18, r27);
        goto L325
    L322:
        if (r04 != 0) goto L324;
        r132 = r18;
        goto L325
    L324:
        r132 = 0;
        goto L325
    L312:
        if (r44 != Integer.MIN_VALUE) goto L315;
        r113 = Math.min(r03, r36);
    L314:
        r04 = r34;
        goto L318
    L315:
        if (r44 != 0) goto L317;
        r113 = r03;
        goto L314
    L317:
        r04 = r34;
        r113 = 0;
        goto L318
    L302:
        if (r82.size() != 0) goto L304;
        C1001f r102 = new C1001f(r40, r02, r40.f3636x, r40.f3637y, r40.f3638z, r40.f3584A, r112);
        r82.add(r102);
    L305:
        int r05 = 0;
    L306:
        if (r05 >= r153) goto L308;
        r102.m2426a(r144[r05]);
        r05 = r05 + 1;
        goto L306
    L308:
        r16 = 0;
        r29[0] = r102.m2429d();
        r29[1] = r102.m2428c();
        goto L309
    L304:
        r102 = (C1001f) r82.get(0);
        r102.f3656c = 0;
        r102.f3655b = null;
        r102.f3665l = 0;
        r102.f3666m = 0;
        r102.f3667n = 0;
        r102.f3668o = 0;
        r102.f3669p = 0;
        r102.m2431f(r02, r40.f3636x, r40.f3637y, r40.f3638z, r40.f3584A, r40.f3691j0, r40.f3687f0, r40.f3692k0, r40.f3688g0, r112);
        goto L305
    L77:
        if (r33 != 1) goto L79;
        char r06 = 1;
        int r172 = r52;
        int r21 = r62;
        r27 = r13;
        int r133 = r40.f3680I0;
        if (r153 == 0) goto L197;
        r82.clear();
        int r28 = r15;
        r29 = r24;
        r30 = r192;
        r31 = r202;
        r322 = r172;
        r332 = r21;
        r34 = r12;
        r35 = 1;
        C1001f r73 = new C1001f(r40, r133, r40.f3636x, r40.f3637y, r40.f3638z, r40.f3584A, r28);
        r82.add(r73);
        if (r133 != 0) goto L233;
        C1001f r74 = r73;
        int r07 = 0;
        int r110 = 0;
        int r25 = 0;
    L205:
        if (r07 >= r153) goto L231;
        C0999d r83 = r144[r07];
        int r63 = r28;
        int r173 = r40.m2434D(r83, r63);
        if (r83.f3615c0[0] != 3) goto L209;
        r110 = r110 + 1;
    L209:
        int r182 = r110;
        if (r25 == r63) goto L214;
        if (((r40.f3674C0 + r25) + r173) > r63) goto L214;
    L216:
        boolean r111 = false;
    L217:
        if (r111 == true) goto L224;
        if (r07 <= 0) goto L224;
        int r38 = r40.f3679H0;
        if (r38 <= 0) goto L224;
        if ((r07 % r38) != 0) goto L224;
        r111 = true;
    L224:
        if (r111 == false) goto L227;
        r28 = r63;
        int r362 = r11;
        int r372 = r10;
        C0999d r103 = r83;
        C1001f r75 = new C1001f(r40, r133, r40.f3636x, r40.f3637y, r40.f3638z, r40.f3584A, r28);
        r75.f3667n = r07;
        r82.add(r75);
        r74 = r75;
    L226:
        r25 = r173;
    L230:
        r74.m2426a(r103);
        r07 = r07 + 1;
        r110 = r182;
        r11 = r362;
        r10 = r372;
        goto L205
    L227:
        r28 = r63;
        r372 = r10;
        r362 = r11;
        r103 = r83;
        if (r07 <= 0) goto L226;
        r25 = (r40.f3674C0 + r173) + r25;
    L214:
        if (r74.f3655b == null) goto L216;
        r111 = true;
        goto L217
    L231:
        r37 = r10;
        r36 = r11;
    L232:
        int r114 = r28;
        int r08 = r82.size();
        int r26 = r40.f3691j0;
        int r39 = r40.f3687f0;
        int r45 = r40.f3692k0;
        int r53 = r40.f3688g0;
        int[] r64 = r40.f3615c0;
        if (r64[0] != 2) goto L263;
    L266:
        boolean r84 = true;
    L267:
        if (r110 <= 0) goto L276;
        if (r84 == false) goto L276;
        int r115 = 0;
    L270:
        if (r115 >= r08) goto L276;
        C1001f r65 = (C1001f) r82.get(r115);
        if (r133 != 0) goto L274;
        r65.m2430e(r114 - r65.m2429d());
    L275:
        r115 = r115 + 1;
        goto L270
    L274:
        r65.m2430e(r114 - r65.m2428c());
    L276:
        C0998c r116 = r40.f3584A;
        C0998c r66 = r40.f3638z;
        C0998c r76 = r40.f3636x;
        C0998c r85 = r40.f3637y;
        C0998c r282 = r116;
        C0998c r382 = r66;
        int r104 = 0;
        int r146 = 0;
        int r154 = 0;
    L277:
        if (r104 >= r08) goto L297;
        C0998c r412 = r116;
        C1001f r117 = (C1001f) r82.get(r104);
        if (r133 == 0) goto L281;
        C0998c r422 = r66;
        if (r104 >= (r08 - 1)) goto L291;
        r382 = ((C1001f) r82.get(r104 + 1)).f3655b.f3636x;
        r45 = 0;
    L292:
        C0998c r67 = r117.f3655b.f3638z;
        r117.m2431f(r133, r76, r85, r382, r282, r26, r39, r45, r53, r114);
        int r210 = r117.m2429d() + r146;
        int r118 = Math.max(r154, r117.m2428c());
        if (r104 <= 0) goto L295;
        r210 = r210 + r40.f3674C0;
    L295:
        r154 = r118;
        r146 = r210;
        r76 = r67;
        r26 = 0;
    L296:
        r104 = r104 + 1;
        r116 = r412;
        r66 = r422;
        goto L277
    L291:
        r45 = r40.f3692k0;
        r382 = r422;
        goto L292
    L281:
        if (r104 >= (r08 - 1)) goto L283;
        r282 = ((C1001f) r82.get(r104 + 1)).f3655b.f3637y;
        r422 = r66;
        r53 = 0;
    L284:
        C0998c r68 = r117.f3655b.f3584A;
        r117.m2431f(r133, r76, r85, r382, r282, r26, r39, r45, r53, r114);
        int r310 = Math.max(r146, r117.m2429d());
        int r119 = r117.m2428c() + r154;
        if (r104 <= 0) goto L287;
        r119 = r119 + r40.f3675D0;
    L287:
        r154 = r119;
        r146 = r310;
        r85 = r68;
        r39 = 0;
        goto L296
    L283:
        r53 = r40.f3688g0;
        r282 = r412;
        r422 = r66;
        goto L284
    L297:
        r29[0] = r146;
        r29[1] = r154;
        goto L198
    L263:
        if (r64[1] == 2) goto L266;
        r84 = false;
        goto L267
    L233:
        r37 = r10;
        r36 = r11;
        C1001f r77 = r73;
        int r09 = 0;
        r110 = 0;
        int r211 = 0;
    L234:
        if (r09 >= r153) goto L232;
        C0999d r105 = r144[r09];
        int r1110 = r28;
        int r174 = r40.m2433C(r105, r1110);
        if (r105.f3615c0[1] != 3) goto L238;
        r110 = r110 + 1;
    L238:
        int r183 = r110;
        if (r211 == r1110) goto L243;
        if (((r40.f3675D0 + r211) + r174) > r1110) goto L243;
    L245:
        boolean r120 = false;
    L246:
        if (r120 == true) goto L253;
        if (r09 <= 0) goto L253;
        int r311 = r40.f3679H0;
        if (r311 <= 0) goto L253;
        if ((r09 % r311) != 0) goto L253;
        r120 = true;
    L253:
        if (r120 == false) goto L256;
        C0999d[] r283 = r144;
        C1001f r78 = new C1001f(r40, r133, r40.f3636x, r40.f3637y, r40.f3638z, r40.f3584A, r1110);
        r78.f3667n = r09;
        r82.add(r78);
        r77 = r78;
    L255:
        r211 = r174;
    L259:
        r77.m2426a(r105);
        r09 = r09 + 1;
        r110 = r183;
        r144 = r283;
        r28 = r1110;
        goto L234
    L256:
        r283 = r144;
        if (r09 <= 0) goto L255;
        r211 = (r40.f3675D0 + r174) + r211;
    L243:
        if (r77.f3655b == null) goto L245;
        r120 = true;
    L197:
        r35 = r06;
        r29 = r24;
        r37 = r10;
        r36 = r11;
        r34 = r12;
        r322 = r172;
        r30 = r192;
        r31 = r202;
        r332 = r21;
        goto L198
    L79:
        if (r33 == 2) goto L81;
        r29 = r24;
        r322 = r52;
        r332 = r62;
        r37 = r10;
        r36 = r11;
        r34 = r12;
        r27 = r13;
        r30 = r192;
        r31 = r202;
        r16 = 0;
        r35 = 1;
        goto L309
    L81:
        int r312 = r40.f3680I0;
        if (r312 != 0) goto L100;
        int r46 = r40.f3679H0;
        if (r46 > 0) goto L99;
        int r47 = 0;
        int r79 = 0;
        int r86 = 0;
    L86:
        r172 = r52;
        if (r47 >= r153) goto L98;
        if (r47 <= 0) goto L90;
        r79 = r79 + r40.f3674C0;
    L90:
        C0999d r54 = r144[r47];
        if (r54 == null) goto L97;
        int r55 = r40.m2434D(r54, r15) + r79;
        if (r55 > r15) goto L98;
        r86 = r86 + 1;
        r79 = r55;
    L97:
        r47 = r47 + 1;
        r52 = r172;
    L98:
        int r48 = 0;
    L117:
        if (r40.f3684M0 != null) goto L119;
        r40.f3684M0 = new int[2];
    L119:
        if (r48 == 0) goto L121;
    L122:
        if (r86 != 0) goto L125;
        if (r312 != 0) goto L125;
    L124:
        boolean r56 = true;
    L126:
        if (r56 == true) goto L196;
        if (r312 != 0) goto L129;
        boolean r423 = r56;
        r48 = (int) Math.ceil(r153 / r86);
    L130:
        C0999d[] r57 = r40.f3683L0;
        if (r57 == null) goto L136;
        if (r57.length < r86) goto L136;
        Arrays.fill(r57, null);
    L137:
        C0999d[] r58 = r40.f3682K0;
        if (r58 != null) goto L140;
    L143:
        r40.f3682K0 = new C0999d[r48];
    L144:
        int r59 = 0;
    L145:
        if (r59 >= r86) goto L169;
        int r710 = 0;
    L147:
        if (r710 >= r48) goto L168;
        int r162 = (r710 * r86) + r59;
        int r212 = r62;
        if (r312 != 1) goto L151;
        r162 = (r59 * r48) + r710;
    L151:
        int r69 = r162;
        if (r69 < r144.length) goto L154;
    L153:
        int r272 = r13;
    L167:
        r710 = r710 + 1;
        r62 = r212;
        r13 = r272;
        goto L147
    L154:
        C0999d r010 = r144[r69];
        if (r010 == null) goto L153;
        int r610 = r40.m2434D(r010, r15);
        r272 = r13;
        C0999d r134 = r40.f3683L0[r59];
        if (r134 != null) goto L160;
    L161:
        r40.f3683L0[r59] = r010;
    L162:
        int r611 = r40.m2433C(r010, r15);
        C0999d r135 = r40.f3682K0[r710];
        if (r135 != null) goto L165;
    L166:
        r40.f3682K0[r710] = r010;
        goto L167
    L165:
        if (r135.m2404i() >= r611) goto L167;
    L160:
        if (r134.m2407l() >= r610) goto L162;
    L168:
        r59 = r59 + 1;
        goto L145
    L169:
        int r213 = r62;
        int r273 = r13;
        int r011 = 0;
        int r510 = 0;
    L170:
        if (r011 >= r86) goto L177;
        C0999d r612 = r40.f3683L0[r011];
        if (r612 == null) goto L176;
        if (r011 <= 0) goto L175;
        r510 = r510 + r40.f3674C0;
    L175:
        r510 = r40.m2434D(r612, r15) + r510;
    L176:
        r011 = r011 + 1;
        goto L170
    L177:
        int r012 = 0;
        int r613 = 0;
    L178:
        if (r012 >= r48) goto L185;
        C0999d r711 = r40.f3682K0[r012];
        if (r711 == null) goto L184;
        if (r012 <= 0) goto L183;
        r613 = r613 + r40.f3675D0;
    L183:
        r613 = r40.m2433C(r711, r15) + r613;
    L184:
        r012 = r012 + 1;
        goto L178
    L185:
        r24[0] = r510;
        r24[1] = r613;
        if (r312 != 0) goto L192;
        if (r510 <= r15) goto L191;
        if (r86 <= 1) goto L191;
        r86 = r86 - 1;
    L190:
        r56 = r423;
    L195:
        r62 = r213;
        r13 = r273;
    L191:
        r56 = true;
        goto L195
    L192:
        if (r613 <= r15) goto L191;
        if (r48 <= 1) goto L191;
        r48 = r48 - 1;
        goto L190
    L140:
        if (r58.length < r48) goto L143;
        Arrays.fill(r58, null);
    L136:
        r40.f3683L0 = new C0999d[r86];
        goto L137
    L129:
        r423 = r56;
        r86 = (int) Math.ceil(r153 / r48);
        goto L130
    L196:
        r21 = r62;
        r27 = r13;
        r06 = 1;
        int[] r121 = r40.f3684M0;
        r121[0] = r86;
        r121[1] = r48;
    L125:
        r56 = false;
        goto L126
    L121:
        if (r312 == 1) goto L124;
    L99:
        r172 = r52;
        r86 = r46;
        goto L98
    L100:
        r172 = r52;
        r48 = r40.f3679H0;
        if (r48 > 0) goto L115;
        int r49 = 0;
        int r511 = 0;
        int r712 = 0;
    L103:
        if (r49 >= r153) goto L114;
        if (r49 <= 0) goto L106;
        r511 = r511 + r40.f3675D0;
    L106:
        C0999d r87 = r144[r49];
        if (r87 == null) goto L113;
        int r88 = r40.m2433C(r87, r15) + r511;
        if (r88 > r15) goto L114;
        r712 = r712 + 1;
        r511 = r88;
    L113:
        r49 = r49 + 1;
    L114:
        r48 = r712;
    L115:
        r86 = 0;
        goto L117
    L73:
        r192 = r32;
        r202 = r43;
        r153 = r142;
        goto L72
    L51:
        if (r40.f3698q0 != (-1)) goto L54;
        r40.f3698q0 = 0;
    L54:
        if (r40.f3699r0 != (-1)) goto L56;
        r40.f3699r0 = 0;
        goto L56
    }

    @Override // p075p.AbstractC1037c, android.view.View
    public final void onMeasure(int r2, int r3) {
        mo1157h(this.f1257i, r2, r3);
    }

    public void setFirstHorizontalBias(float r2) {
        this.f1257i.f3706y0 = r2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int r2) {
        this.f1257i.f3700s0 = r2;
        requestLayout();
    }

    public void setFirstVerticalBias(float r2) {
        this.f1257i.f3707z0 = r2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int r2) {
        this.f1257i.f3701t0 = r2;
        requestLayout();
    }

    public void setHorizontalAlign(int r2) {
        this.f1257i.f3676E0 = r2;
        requestLayout();
    }

    public void setHorizontalBias(float r2) {
        this.f1257i.f3704w0 = r2;
        requestLayout();
    }

    public void setHorizontalGap(int r2) {
        this.f1257i.f3674C0 = r2;
        requestLayout();
    }

    public void setHorizontalStyle(int r2) {
        this.f1257i.f3698q0 = r2;
        requestLayout();
    }

    public void setMaxElementsWrap(int r2) {
        this.f1257i.f3679H0 = r2;
        requestLayout();
    }

    public void setOrientation(int r2) {
        this.f1257i.f3680I0 = r2;
        requestLayout();
    }

    public void setPadding(int r2) {
        C1002g r02 = this.f1257i;
        r02.f3687f0 = r2;
        r02.f3688g0 = r2;
        r02.f3689h0 = r2;
        r02.f3690i0 = r2;
        requestLayout();
    }

    public void setPaddingBottom(int r2) {
        this.f1257i.f3688g0 = r2;
        requestLayout();
    }

    public void setPaddingLeft(int r2) {
        this.f1257i.f3691j0 = r2;
        requestLayout();
    }

    public void setPaddingRight(int r2) {
        this.f1257i.f3692k0 = r2;
        requestLayout();
    }

    public void setPaddingTop(int r2) {
        this.f1257i.f3687f0 = r2;
        requestLayout();
    }

    public void setVerticalAlign(int r2) {
        this.f1257i.f3677F0 = r2;
        requestLayout();
    }

    public void setVerticalBias(float r2) {
        this.f1257i.f3705x0 = r2;
        requestLayout();
    }

    public void setVerticalGap(int r2) {
        this.f1257i.f3675D0 = r2;
        requestLayout();
    }

    public void setVerticalStyle(int r2) {
        this.f1257i.f3699r0 = r2;
        requestLayout();
    }

    public void setWrapMode(int r2) {
        this.f1257i.f3678G0 = r2;
        requestLayout();
    }
}
