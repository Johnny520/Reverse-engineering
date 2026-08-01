package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class hc {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public hc(ConstraintLayout r1) {
        this.a = r1;
    }

    public final void a(pc r22, k7 r23) {
        if (r22 != null) goto L5;
        return;
    L5:
        cc r3 = r22.z;
        cc r4 = r22.x;
        int[] r5 = r22.g;
        if (r22.V != 8) goto L9;
        r23.e = 0;
        r23.f = 0;
        r23.g = 0;
        return;
    L9:
        int r6 = r23.a;
        int r7 = r23.b;
        int r9 = r23.c;
        int r10 = r23.d;
        int r11 = this.b + this.c;
        int r12 = this.d;
        View r13 = r22.U;
        int r14 = z30.t(r6);
        if (r14 == 0) goto L46;
        if (r14 == 1) goto L45;
        if (r14 != 2) goto L14;
        int r19 = 2;
        int r8 = ViewGroup.getChildMeasureSpec(this.f, r12, -2);
        if (r22.j != 1) goto L28;
        boolean r92 = true;
    L29:
        r5[2] = 0;
        if (r23.j == false) goto L44;
        if (r92 == true) goto L33;
    L38:
        boolean r122 = false;
    L39:
        if (r92 == false) goto L43;
        if (r122 == false) goto L44;
    L43:
        int r93 = View.MeasureSpec.makeMeasureSpec(r22.l(), 1073741824);
    L24:
        boolean r82 = false;
    L47:
        int r123 = z30.t(r7);
        if (r123 == 0) goto L84;
        if (r123 != 1) goto L51;
        int r32 = ViewGroup.getChildMeasureSpec(this.g, r11, -2);
        int r112 = 3;
        r5[3] = -2;
        int r42 = r32;
        boolean r33 = true;
    L85:
        if (r6 != r112) goto L87;
        boolean r102 = true;
    L88:
        if (r7 != r112) goto L90;
        boolean r113 = true;
    L92:
        if (r7 == 4) goto L96;
        if (r7 == 1) goto L96;
        boolean r72 = false;
    L97:
        if (r6 == 4) goto L101;
        if (r6 == 1) goto L101;
        boolean r62 = false;
    L103:
        if (r102 == true) goto L105;
    L107:
        boolean r142 = false;
    L108:
        if (r113 == true) goto L110;
    L112:
        boolean r124 = false;
    L113:
        gc r15 = (gc) r13.getLayoutParams();
        if (r23.j == true) goto L125;
        if (r102 == false) goto L125;
        if (r22.j != 0) goto L125;
        if (r113 == false) goto L125;
        if (r22.k != 0) goto L125;
        int r34 = 0;
        int r52 = 0;
        int r114 = 0;
    L166:
        if (r114 == (-1)) goto L168;
        boolean r0 = true;
    L170:
        if (r34 == r23.c) goto L172;
    L175:
        boolean r83 = true;
    L176:
        r23.i = r83;
        if (r15.X == false) goto L179;
        r0 = true;
    L179:
        if (r0 == true) goto L181;
    L185:
        r23.e = r34;
        r23.f = r52;
        r23.h = r0;
        r23.g = r114;
        return;
    L181:
        if (r114 == (-1)) goto L185;
        if (r22.P == r114) goto L185;
        r23.i = true;
        goto L185
    L172:
        if (r52 != r23.d) goto L175;
        r83 = false;
        goto L176
    L168:
        r0 = false;
    L125:
        if ((r13 instanceof hb0) == true) goto L127;
    L129:
        r13.measure(r93, r42);
    L130:
        int r02 = r13.getMeasuredWidth();
        int r103 = r13.getMeasuredHeight();
        r114 = r13.getBaseline();
        if (r82 == false) goto L133;
        r5[0] = r02;
        r5[2] = r103;
    L134:
        if (r33 == false) goto L136;
        r5[1] = r103;
        r5[3] = r02;
    L137:
        int r35 = r22.m;
        if (r35 <= 0) goto L140;
        r34 = Math.max(r35, r02);
    L141:
        int r53 = r22.n;
        if (r53 <= 0) goto L144;
        r34 = Math.min(r53, r34);
    L144:
        int r54 = r22.p;
        if (r54 <= 0) goto L147;
        r52 = Math.max(r54, r103);
    L148:
        int r84 = r22.q;
        if (r84 <= 0) goto L152;
        r52 = Math.min(r84, r52);
    L152:
        if (r142 == false) goto L155;
        if (r72 == false) goto L155;
        r34 = (int) ((r52 * r22.L) + 0.5f);
    L158:
        if (r02 != r34) goto L161;
        if (r103 == r52) goto L166;
    L161:
        if (r02 == r34) goto L163;
        r93 = View.MeasureSpec.makeMeasureSpec(r34, 1073741824);
    L163:
        if (r103 == r52) goto L165;
        r42 = View.MeasureSpec.makeMeasureSpec(r52, 1073741824);
    L165:
        r13.measure(r93, r42);
        r34 = r13.getMeasuredWidth();
        r52 = r13.getMeasuredHeight();
        r114 = r13.getBaseline();
    L155:
        if (r124 == false) goto L158;
        if (r62 == false) goto L158;
        r52 = (int) ((r34 / r22.L) + 0.5f);
        goto L158
    L147:
        r52 = r103;
        goto L148
    L140:
        r34 = r02;
        goto L141
    L136:
        r5[1] = 0;
        r5[3] = 0;
        goto L137
    L133:
        r5[0] = 0;
        r5[2] = 0;
        goto L134
    L127:
        if ((r22 instanceof rk) == false) goto L129;
        ((hb0) r13).h((rk) r22, r93, r42);
        goto L130
    L110:
        if (r22.L <= 0.0f) goto L112;
        r124 = true;
        goto L113
    L105:
        if (r22.L <= 0.0f) goto L107;
        r142 = true;
    L101:
        r62 = true;
    L96:
        r72 = true;
        goto L97
    L90:
        r113 = false;
        goto L92
    L87:
        r102 = false;
        goto L88
    L51:
        if (r123 != r19) goto L53;
        r42 = ViewGroup.getChildMeasureSpec(this.g, r11, -2);
        if (r22.k != 1) goto L65;
        boolean r36 = true;
    L66:
        r5[3] = 0;
        if (r23.j == false) goto L82;
        if (r36 == true) goto L70;
    L75:
        boolean r104 = false;
    L76:
        if (r36 == false) goto L80;
        if (r104 == false) goto L82;
    L80:
        r42 = View.MeasureSpec.makeMeasureSpec(r22.i(), 1073741824);
        r33 = false;
    L81:
        r112 = 3;
        goto L85
    L70:
        if (r5[2] == 0) goto L75;
        if (r5[1] == r22.i()) goto L75;
        r104 = true;
    L82:
        r33 = true;
        goto L81
    L65:
        r36 = false;
        goto L66
    L53:
        if (r123 == 3) goto L55;
        r112 = 3;
        r33 = false;
        r42 = 0;
        goto L85
    L55:
        int r105 = this.g;
        if (r4 == null) goto L58;
        int r43 = r22.y.e;
    L59:
        if (r3 == null) goto L61;
        r43 = r43 + r22.A.e;
    L61:
        r42 = ViewGroup.getChildMeasureSpec(r105, r11 + r43, -1);
        r5[3] = -1;
        r33 = false;
        r112 = 3;
        goto L85
    L58:
        r43 = 0;
        goto L59
    L84:
        r112 = 3;
        r42 = View.MeasureSpec.makeMeasureSpec(r10, 1073741824);
        r5[3] = r10;
        r33 = false;
        goto L85
    L33:
        if (r5[3] == 0) goto L38;
        if (r5[0] == r22.l()) goto L38;
        r122 = true;
    L44:
        r93 = r8;
        r82 = true;
        goto L47
    L28:
        r92 = false;
        goto L29
    L14:
        if (r14 == 3) goto L16;
        r19 = 2;
        r82 = false;
        r93 = 0;
        goto L47
    L16:
        int r94 = this.f;
        if (r4 == null) goto L19;
        int r143 = r4.e;
    L20:
        if (r3 == null) goto L22;
        r19 = 2;
        r143 = r143 + r3.e;
    L23:
        r93 = ViewGroup.getChildMeasureSpec(r94, r12 + r143, -1);
        r5[r19] = -1;
        goto L24
    L22:
        r19 = 2;
        goto L23
    L19:
        r143 = 0;
        goto L20
    L45:
        r19 = 2;
        r8 = ViewGroup.getChildMeasureSpec(this.f, r12, -2);
        r5[2] = -2;
        goto L44
    L46:
        r19 = 2;
        int r85 = View.MeasureSpec.makeMeasureSpec(r9, 1073741824);
        r5[2] = r9;
        r93 = r85;
        goto L24
    }
}
