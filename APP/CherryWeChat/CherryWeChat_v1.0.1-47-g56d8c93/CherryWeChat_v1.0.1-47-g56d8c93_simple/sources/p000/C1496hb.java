package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: hb */
/* JADX INFO: loaded from: classes.dex */
public final class C1496hb {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f5273a;

    /* JADX INFO: renamed from: b */
    public int f5274b;

    /* JADX INFO: renamed from: c */
    public int f5275c;

    /* JADX INFO: renamed from: d */
    public int f5276d;

    /* JADX INFO: renamed from: e */
    public int f5277e;

    /* JADX INFO: renamed from: f */
    public int f5278f;

    /* JADX INFO: renamed from: g */
    public int f5279g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f5280h;

    public C1496hb(ConstraintLayout r1, ConstraintLayout r2) {
        this.f5280h = r1;
        this.f5273a = r2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2864a(int r2, int r3, int r4) {
        if (r2 == r3) goto L14;
        int r22 = View.MeasureSpec.getMode(r2);
        int r0 = View.MeasureSpec.getMode(r3);
        int r32 = View.MeasureSpec.getSize(r3);
        if (r0 == 1073741824) goto L7;
        return false;
    L7:
        if (r22 == Integer.MIN_VALUE) goto L9;
        if (r22 == 0) goto L9;
        return false;
    L9:
        if (r4 != r32) goto L16;
        return true;
    L16:
        return false;
    L14:
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2865b(C2454rb r18, C0178E5 r19) {
        if (r18 == null) goto L209;
        C1259cb r3 = r18.f8590K;
        C1259cb r4 = r18.f8588I;
        if (r18.f8619g0 != 8) goto L10;
        r19.f524e = 0;
        r19.f525f = 0;
        r19.f526g = 0;
        return;
    L10:
        if (r18.f8599T == null) goto L210;
        C1475gy r5 = ConstraintLayout.f3870p;
        int r52 = r19.f520a;
        int r6 = r19.f521b;
        int r8 = r19.f522c;
        int r9 = r19.f523d;
        int r10 = this.f5274b + this.f5275c;
        int r11 = this.f5276d;
        View r12 = r18.f8617f0;
        int r13 = AbstractC0213Ey.m424v(r52);
        if (r13 == 0) goto L45;
        if (r13 == 1) goto L44;
        if (r13 == 2) goto L25;
        if (r13 == 3) goto L18;
        int r82 = 0;
    L46:
        int r112 = AbstractC0213Ey.m424v(r6);
        if (r112 == 0) goto L80;
        if (r112 == 1) goto L79;
        if (r112 != 2) goto L51;
        int r32 = ViewGroup.getChildMeasureSpec(this.f5279g, r10, -2);
        if (r18.f8640s != 1) goto L63;
        boolean r42 = true;
    L64:
        int r92 = r19.f529j;
        if (r92 == 1) goto L68;
        if (r92 == 2) goto L68;
    L81:
        C2497sb r43 = (C2497sb) r18.f8599T;
        ConstraintLayout r93 = this.f5280h;
        if (r43 == null) goto L104;
        if (AbstractC0714Qj.m1492n(r93.f3879i, 256) == false) goto L104;
        if (r12.getMeasuredWidth() != r18.m4937q()) goto L104;
        if (r12.getMeasuredWidth() >= r43.m4937q()) goto L104;
        if (r12.getMeasuredHeight() != r18.m4933k()) goto L104;
        if (r12.getMeasuredHeight() >= r43.m4933k()) goto L104;
        if (r12.getBaseline() != r18.f8607a0) goto L104;
        if (r18.m4946z() == true) goto L104;
        if (m2864a(r18.f8586G, r82, r18.m4937q()) == false) goto L104;
        if (m2864a(r18.f8587H, r32, r18.m4933k()) == false) goto L104;
        r19.f524e = r18.m4937q();
        r19.f525f = r18.m4933k();
        r19.f526g = r18.f8607a0;
        return;
    L104:
        if (r52 != 3) goto L106;
        boolean r102 = true;
    L107:
        if (r6 != 3) goto L109;
        boolean r44 = true;
    L111:
        if (r6 == 4) goto L115;
        if (r6 == 1) goto L115;
        boolean r62 = false;
    L116:
        if (r52 == 4) goto L120;
        if (r52 == 1) goto L120;
        boolean r53 = false;
    L122:
        if (r102 == true) goto L124;
    L126:
        boolean r132 = false;
    L127:
        if (r44 == true) goto L129;
    L131:
        boolean r113 = false;
    L132:
        if (r12 != null) goto L134;
        return;
    L134:
        C1452gb r15 = (C1452gb) r12.getLayoutParams();
        int r0 = r19.f529j;
        if (r0 == 1) goto L146;
        if (r0 == 2) goto L146;
        if (r102 == false) goto L146;
        if (r18.f8639r != 0) goto L146;
        if (r44 == false) goto L146;
        if (r18.f8640s != 0) goto L146;
        boolean r02 = false;
        int r33 = 0;
        int r54 = 0;
        int r133 = -1;
        int r14 = 0;
    L187:
        if (r54 == r133) goto L189;
        boolean r45 = true;
    L191:
        if (r33 == r19.f522c) goto L193;
    L196:
        boolean r7 = true;
    L197:
        r19.f528i = r7;
        if (r15.f5111c0 == false) goto L200;
        boolean r94 = true;
    L201:
        if (r94 == true) goto L203;
    L207:
        r19.f524e = r33;
        r19.f525f = r14;
        r19.f527h = r94;
        r19.f526g = r54;
        return;
    L203:
        if (r54 == (-1)) goto L207;
        if (r18.f8607a0 == r54) goto L207;
        r19.f528i = true;
        goto L207
    L200:
        r94 = r45;
        goto L201
    L193:
        if (r14 != r19.f523d) goto L196;
        r7 = r02;
        goto L197
    L189:
        r45 = r02;
    L146:
        if ((r12 instanceof AbstractC0960WE) == true) goto L148;
    L150:
        r12.measure(r82, r32);
    L151:
        r18.f8586G = r82;
        r18.f8587H = r32;
        r18.f8618g = false;
        int r03 = r12.getMeasuredWidth();
        int r46 = r12.getMeasuredHeight();
        int r72 = r12.getBaseline();
        int r103 = r18.f8642u;
        if (r103 <= 0) goto L154;
        int r104 = Math.max(r103, r03);
    L155:
        int r142 = r18.f8643v;
        if (r142 <= 0) goto L158;
        r104 = Math.min(r142, r104);
    L158:
        int r143 = r18.f8645x;
        if (r143 <= 0) goto L162;
        r14 = Math.max(r143, r46);
    L161:
        int r16 = r32;
        int r34 = r18.f8646y;
        if (r34 <= 0) goto L167;
        r14 = Math.min(r34, r14);
    L167:
        if (AbstractC0714Qj.m1492n(r93.f3879i, 1) == false) goto L169;
    L175:
        if (r03 != r104) goto L181;
        if (r46 != r14) goto L181;
        r54 = r72;
        r33 = r104;
        r02 = false;
    L179:
        r133 = -1;
    L181:
        if (r03 == r104) goto L183;
        r82 = View.MeasureSpec.makeMeasureSpec(r104, 1073741824);
    L183:
        if (r46 == r14) goto L185;
        int r35 = View.MeasureSpec.makeMeasureSpec(r14, 1073741824);
    L186:
        r12.measure(r82, r35);
        r18.f8586G = r82;
        r18.f8587H = r35;
        r02 = false;
        r18.f8618g = false;
        r33 = r12.getMeasuredWidth();
        int r47 = r12.getMeasuredHeight();
        r54 = r12.getBaseline();
        r14 = r47;
        goto L179
    L185:
        r35 = r16;
        goto L186
    L169:
        if (r132 == false) goto L172;
        if (r62 == false) goto L172;
        r104 = (int) ((r14 * r18.f8602W) + 0.5f);
    L172:
        if (r113 == false) goto L175;
        if (r53 == false) goto L175;
        r14 = (int) ((r104 / r18.f8602W) + 0.5f);
        goto L175
    L162:
        r14 = r46;
        goto L161
    L154:
        r104 = r03;
        goto L155
    L148:
        if ((r18 instanceof C0368Ih) == false) goto L150;
        ((AbstractC0960WE) r12).mo1836j((C0368Ih) r18, r82, r32);
        goto L151
    L129:
        if (r18.f8602W <= 0.0f) goto L131;
        r113 = true;
        goto L132
    L124:
        if (r18.f8602W <= 0.0f) goto L126;
        r132 = true;
    L120:
        r53 = true;
    L115:
        r62 = true;
        goto L116
    L109:
        r44 = false;
        goto L111
    L106:
        r102 = false;
    L68:
        if (r12.getMeasuredWidth() != r18.m4937q()) goto L70;
        boolean r95 = true;
    L72:
        if (r19.f529j == 2) goto L78;
        if (r42 == false) goto L78;
        if (r42 == false) goto L77;
        if (r95 == true) goto L78;
    L77:
        if (r18.mo4335B() == false) goto L81;
    L78:
        r32 = View.MeasureSpec.makeMeasureSpec(r18.m4933k(), 1073741824);
        goto L81
    L70:
        r95 = false;
        goto L72
    L63:
        r42 = false;
        goto L64
    L51:
        if (r112 == 3) goto L53;
        r32 = 0;
        goto L81
    L53:
        int r96 = this.f5279g;
        if (r4 == null) goto L56;
        int r48 = r18.f8589J.f4271g;
    L57:
        if (r3 == null) goto L59;
        r48 = r48 + r18.f8591L.f4271g;
    L59:
        r32 = ViewGroup.getChildMeasureSpec(r96, r10 + r48, -1);
        goto L81
    L56:
        r48 = 0;
        goto L57
    L79:
        r32 = ViewGroup.getChildMeasureSpec(this.f5279g, r10, -2);
        goto L81
    L80:
        r32 = View.MeasureSpec.makeMeasureSpec(r9, 1073741824);
        goto L81
    L18:
        int r83 = this.f5278f;
        if (r4 == null) goto L21;
        int r134 = r4.f4271g;
    L22:
        if (r3 == null) goto L24;
        r134 = r134 + r3.f4271g;
    L24:
        r82 = ViewGroup.getChildMeasureSpec(r83, r11 + r134, -1);
        goto L46
    L21:
        r134 = 0;
        goto L22
    L25:
        r82 = ViewGroup.getChildMeasureSpec(this.f5278f, r11, -2);
        if (r18.f8639r != 1) goto L28;
        boolean r114 = true;
    L29:
        int r135 = r19.f529j;
        if (r135 == 1) goto L33;
        if (r135 != 2) goto L46;
    L33:
        if (r12.getMeasuredHeight() != r18.m4933k()) goto L35;
        boolean r136 = true;
    L37:
        if (r19.f529j == 2) goto L43;
        if (r114 == false) goto L43;
        if (r114 == false) goto L42;
        if (r136 == true) goto L43;
    L42:
        if (r18.mo4334A() == false) goto L46;
    L43:
        r82 = View.MeasureSpec.makeMeasureSpec(r18.m4937q(), 1073741824);
        goto L46
    L35:
        r136 = false;
        goto L37
    L28:
        r114 = false;
        goto L29
    L44:
        r82 = ViewGroup.getChildMeasureSpec(this.f5278f, r11, -2);
        goto L46
    L45:
        r82 = View.MeasureSpec.makeMeasureSpec(r8, 1073741824);
        goto L46
    L210:
        return;
    }
}
