package p075p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p069m.AbstractC0988h;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1002g;
import p073o.C1013b;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1040f {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f3940a;

    /* JADX INFO: renamed from: b */
    public int f3941b;

    /* JADX INFO: renamed from: c */
    public int f3942c;

    /* JADX INFO: renamed from: d */
    public int f3943d;

    /* JADX INFO: renamed from: e */
    public int f3944e;

    /* JADX INFO: renamed from: f */
    public int f3945f;

    /* JADX INFO: renamed from: g */
    public int f3946g;

    public C1040f(ConstraintLayout r1) {
        this.f3940a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2519a(C0999d r18, C1013b r19) {
        if (r18 != null) goto L6;
        return;
    L6:
        if (r18.f3605V != 8) goto L9;
        r19.f3728e = 0;
        r19.f3729f = 0;
        r19.f3730g = 0;
        return;
    L9:
        int r3 = r19.f3724a;
        int r4 = r19.f3725b;
        int r6 = r19.f3726c;
        int r7 = r19.f3727d;
        int r8 = this.f3941b + this.f3942c;
        int r9 = this.f3943d;
        View r10 = (View) r18.f3604U;
        int r11 = AbstractC0988h.m2372a(r3);
        C0998c r12 = r18.f3638z;
        C0998c r13 = r18.f3636x;
        int[] r14 = r18.f3619g;
        if (r11 == 0) goto L46;
        if (r11 == 1) goto L45;
        if (r11 != 2) goto L14;
        int r62 = ViewGroup.getChildMeasureSpec(this.f3945f, r9, -2);
        if (r18.f3622j != 1) goto L28;
        boolean r92 = true;
    L29:
        r14[2] = 0;
        if (r19.f3733j == false) goto L44;
        if (r92 == true) goto L33;
    L38:
        boolean r112 = false;
    L39:
        if (r92 == false) goto L43;
        if (r112 == false) goto L44;
    L43:
        r62 = View.MeasureSpec.makeMeasureSpec(r18.m2407l(), 1073741824);
    L16:
        boolean r93 = false;
    L47:
        int r113 = AbstractC0988h.m2372a(r4);
        if (r113 != 0) goto L50;
        int r82 = 3;
        int r114 = View.MeasureSpec.makeMeasureSpec(r7, 1073741824);
        r14[3] = r7;
    L62:
        boolean r72 = false;
    L87:
        if (r3 != r82) goto L89;
        boolean r122 = true;
    L90:
        if (r4 != r82) goto L92;
        boolean r83 = true;
    L94:
        if (r4 == 4) goto L98;
        if (r4 == 1) goto L98;
        boolean r42 = false;
    L99:
        if (r3 == 4) goto L103;
        if (r3 == 1) goto L103;
        boolean r32 = false;
    L105:
        if (r122 == true) goto L107;
    L109:
        boolean r15 = false;
    L110:
        if (r83 == true) goto L112;
    L114:
        boolean r5 = false;
    L115:
        C1039e r132 = (C1039e) r10.getLayoutParams();
        if (r19.f3733j == true) goto L126;
        if (r122 == false) goto L126;
        if (r18.f3622j != 0) goto L126;
        if (r83 == false) goto L126;
        if (r18.f3623k != 0) goto L126;
        int r02 = -1;
        int r73 = 0;
        int r115 = 0;
        int r142 = 0;
    L169:
        if (r115 == r02) goto L171;
        boolean r03 = true;
    L173:
        if (r73 == r19.f3726c) goto L175;
    L178:
        boolean r52 = true;
    L179:
        r19.f3732i = r52;
        if (r132.f3900X == false) goto L182;
        r03 = true;
    L182:
        if (r03 == true) goto L184;
    L188:
        r19.f3728e = r73;
        r19.f3729f = r142;
        r19.f3731h = r03;
        r19.f3730g = r115;
        return;
    L184:
        if (r115 == (-1)) goto L188;
        if (r18.f3599P == r115) goto L188;
        r19.f3732i = true;
        goto L188
    L175:
        if (r142 != r19.f3727d) goto L178;
        r52 = false;
        goto L179
    L171:
        r03 = false;
    L126:
        if ((r10 instanceof AbstractC1053s) == true) goto L128;
    L130:
        r10.measure(r62, r114);
    L131:
        int r04 = r10.getMeasuredWidth();
        int r84 = r10.getMeasuredHeight();
        int r123 = r10.getBaseline();
        if (r93 == false) goto L134;
        int r94 = 0;
        r14[0] = r04;
        r14[2] = r84;
    L135:
        if (r72 == false) goto L137;
        r14[1] = r84;
        r14[3] = r04;
    L138:
        int r74 = r18.f3625m;
        if (r74 <= 0) goto L141;
        r73 = Math.max(r74, r04);
    L142:
        int r143 = r18.f3626n;
        if (r143 <= 0) goto L145;
        r73 = Math.min(r143, r73);
    L145:
        int r144 = r18.f3628p;
        if (r144 <= 0) goto L148;
        r142 = Math.max(r144, r84);
    L149:
        int r95 = r18.f3629q;
        if (r95 <= 0) goto L153;
        r142 = Math.min(r95, r142);
    L153:
        if (r15 == false) goto L156;
        if (r42 == false) goto L156;
        r73 = (int) ((r142 * r18.f3595L) + 0.5f);
    L159:
        if (r04 != r73) goto L163;
        if (r84 != r142) goto L163;
        r115 = r123;
        r02 = -1;
    L163:
        if (r04 == r73) goto L165;
        int r05 = 1073741824;
        r62 = View.MeasureSpec.makeMeasureSpec(r73, 1073741824);
    L166:
        if (r84 == r142) goto L168;
        r114 = View.MeasureSpec.makeMeasureSpec(r142, r05);
    L168:
        r10.measure(r62, r114);
        int r116 = r10.getMeasuredWidth();
        r142 = r10.getMeasuredHeight();
        r73 = r116;
        r02 = -1;
        r115 = r10.getBaseline();
        goto L169
    L165:
        r05 = 1073741824;
    L156:
        if (r5 == false) goto L159;
        if (r32 == false) goto L159;
        r142 = (int) ((r73 / r18.f3595L) + 0.5f);
        goto L159
    L148:
        r142 = r84;
        goto L149
    L141:
        r73 = r04;
        goto L142
    L137:
        r14[1] = r94;
        r14[3] = r94;
        goto L138
    L134:
        r94 = 0;
        r14[0] = 0;
        r14[2] = 0;
        goto L135
    L128:
        if ((r18 instanceof C1002g) == false) goto L130;
        ((AbstractC1053s) r10).mo1157h((C1002g) r18, r62, r114);
        goto L131
    L112:
        if (r18.f3595L <= 0.0f) goto L114;
        r5 = true;
        goto L115
    L107:
        if (r18.f3595L <= 0.0f) goto L109;
        r15 = true;
    L103:
        r32 = true;
    L98:
        r42 = true;
        goto L99
    L92:
        r83 = false;
        goto L94
    L89:
        r122 = false;
        goto L90
    L50:
        if (r113 == 1) goto L85;
        if (r113 != 2) goto L53;
        r114 = ViewGroup.getChildMeasureSpec(this.f3946g, r8, -2);
        if (r18.f3623k != 1) goto L67;
        boolean r75 = true;
    L68:
        r14[3] = 0;
        if (r19.f3733j == false) goto L84;
        if (r75 == true) goto L72;
    L77:
        boolean r85 = false;
    L78:
        if (r75 == false) goto L82;
        if (r85 == false) goto L84;
    L82:
        r114 = View.MeasureSpec.makeMeasureSpec(r18.m2404i(), 1073741824);
        r72 = false;
    L83:
        r82 = 3;
        goto L87
    L72:
        if (r14[2] == 0) goto L77;
        if (r14[1] == r18.m2404i()) goto L77;
        r85 = true;
    L84:
        r72 = true;
        goto L83
    L67:
        r75 = false;
        goto L68
    L53:
        if (r113 == 3) goto L55;
        r82 = 3;
        r72 = false;
        r114 = 0;
        goto L87
    L55:
        int r76 = this.f3946g;
        if (r13 == null) goto L58;
        int r117 = r18.f3637y.f3581e;
    L59:
        if (r12 == null) goto L61;
        r117 = r117 + r18.f3584A.f3581e;
    L61:
        int r77 = ViewGroup.getChildMeasureSpec(r76, r8 + r117, -1);
        r14[3] = -1;
        r114 = r77;
        r82 = 3;
        goto L62
    L58:
        r117 = 0;
        goto L59
    L85:
        int r78 = ViewGroup.getChildMeasureSpec(this.f3946g, r8, -2);
        r82 = 3;
        r14[3] = -2;
        r114 = r78;
        r72 = true;
        goto L87
    L33:
        if (r14[3] == 0) goto L38;
        if (r14[0] == r18.m2407l()) goto L38;
        r112 = true;
    L44:
        r93 = true;
        goto L47
    L28:
        r92 = false;
        goto L29
    L14:
        if (r11 == 3) goto L17;
        r62 = 0;
        goto L16
    L17:
        int r63 = this.f3945f;
        if (r13 == null) goto L20;
        int r118 = r13.f3581e;
    L21:
        if (r12 == null) goto L23;
        r118 = r118 + r12.f3581e;
    L23:
        r62 = ViewGroup.getChildMeasureSpec(r63, r9 + r118, -1);
        r14[2] = -1;
        goto L16
    L20:
        r118 = 0;
        goto L21
    L45:
        r62 = ViewGroup.getChildMeasureSpec(this.f3945f, r9, -2);
        r14[2] = -2;
        goto L44
    L46:
        int r96 = View.MeasureSpec.makeMeasureSpec(r6, 1073741824);
        r14[2] = r6;
        r62 = r96;
        goto L16
    }
}
