package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.github.cherrywechat.R;
import java.util.HashMap;

/* JADX INFO: renamed from: bh */
/* JADX INFO: loaded from: classes.dex */
public final class C1222bh extends AbstractC0356IB {

    /* JADX INFO: renamed from: B */
    public static final String[] f4177B = null;

    /* JADX INFO: renamed from: A */
    public final int f4178A;

    static {
        f4177B = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public C1222bh(int r1) {
        this();
        this.f4178A = r1;
    }

    /* JADX INFO: renamed from: I */
    public static void m2349I(C0657PB r3) {
        View r0 = r3.f2100b;
        int r1 = r0.getVisibility();
        HashMap r32 = r3.f2099a;
        r32.put("android:visibility:visibility", Integer.valueOf(r1));
        r32.put("android:visibility:parent", r0.getParent());
        int[] r12 = new int[2];
        r0.getLocationOnScreen(r12);
        r32.put("android:visibility:screenLocation", r12);
    }

    /* JADX INFO: renamed from: K */
    public static float m2350K(C0657PB r1, float r2) {
        if (r1 == null) goto L7;
        Float r12 = (Float) r1.f2099a.get("android:fade:transitionAlpha");
        if (r12 == null) goto L7;
        return r12.floatValue();
    L7:
        return r2;
    }

    /* JADX INFO: renamed from: L */
    public static C1089ZE m2351L(C0657PB r8, C0657PB r9) {
        C1089ZE r0 = new C1089ZE();
        r0.f3465a = false;
        r0.f3466b = false;
        if (r8 == null) goto L7;
        HashMap r6 = r8.f2099a;
        if (r6.containsKey("android:visibility:visibility") == false) goto L7;
        r0.f3467c = ((Integer) r6.get("android:visibility:visibility")).intValue();
        r0.f3469e = (ViewGroup) r6.get("android:visibility:parent");
    L8:
        if (r9 == null) goto L12;
        HashMap r62 = r9.f2099a;
        if (r62.containsKey("android:visibility:visibility") == false) goto L12;
        r0.f3468d = ((Integer) r62.get("android:visibility:visibility")).intValue();
        r0.f3470f = (ViewGroup) r62.get("android:visibility:parent");
    L14:
        if (r8 == null) goto L36;
        if (r9 == null) goto L36;
        int r82 = r0.f3467c;
        int r92 = r0.f3468d;
        if (r82 == r92) goto L19;
    L21:
        if (r82 == r92) goto L29;
        if (r82 != 0) goto L25;
        r0.f3466b = false;
        r0.f3465a = true;
        return r0;
    L25:
        if (r92 != 0) goto L45;
        r0.f3466b = true;
        r0.f3465a = true;
        return r0;
    L45:
        return r0;
    L29:
        if (r0.f3470f != null) goto L33;
        r0.f3466b = false;
        r0.f3465a = true;
        return r0;
    L33:
        if (r0.f3469e != null) goto L45;
        r0.f3466b = true;
        r0.f3465a = true;
        return r0;
    L19:
        if (r0.f3469e != r0.f3470f) goto L21;
    L36:
        if (r8 == null) goto L38;
    L41:
        if (r9 != null) goto L45;
        if (r0.f3467c != 0) goto L45;
        r0.f3466b = false;
        r0.f3465a = true;
        goto L45
    L38:
        if (r0.f3468d != 0) goto L41;
        r0.f3466b = true;
        r0.f3465a = true;
        return r0;
    L12:
        r0.f3468d = -1;
        r0.f3470f = null;
    L7:
        r0.f3467c = -1;
        r0.f3469e = null;
        goto L8
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m2352J(View r3, float r4, float r5) {
        if (r4 != r5) goto L6;
        return null;
    L6:
        AbstractC0574NE.f1868a.mo1252Q(r3, r4);
        ObjectAnimator r42 = ObjectAnimator.ofFloat(r3, AbstractC0574NE.f1869b, new float[]{r5});
        C1142ah r52 = new C1142ah(r3);
        r42.addListener(r52);
        m779o().m766a(r52);
        return r42;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB r1) {
        m2349I(r1);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB r3) {
        m2349I(r3);
        View r0 = r3.f2100b;
        Float r1 = (Float) r0.getTag(R.id.transition_pause_alpha);
        if (r1 == null) goto L5;
    L8:
        r3.f2099a.put("android:fade:transitionAlpha", r1);
        return;
    L5:
        if (r0.getVisibility() != 0) goto L7;
        r1 = Float.valueOf(AbstractC0574NE.f1868a.mo1251A(r0));
        goto L8
    L7:
        r1 = Float.valueOf(0.0f);
        goto L8
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: k */
    public final Animator mo775k(ViewGroup r24, C0657PB r25, C0657PB r26) {
        C1089ZE r4 = m2351L(r25, r26);
        if (r4.f3465a == false) goto L107;
        if (r4.f3469e == null) goto L7;
    L10:
        int r9 = 1;
        if (r4.f3466b == true) goto L13;
        int r42 = r4.f3468d;
        if ((this.f4178A & 2) != 2) goto L107;
        if (r25 == null) goto L107;
        View r5 = r25.f2100b;
        if (r26 == null) goto L31;
        View r12 = r26.f2100b;
    L32:
        View r14 = (View) r5.getTag(R.id.save_overlay_view);
        if (r14 == null) goto L35;
        int r22 = r42;
        char r18 = 1;
        int r17 = 0;
        View r6 = null;
        Animator r16 = null;
    L85:
        if (r14 == null) goto L98;
        if (r9 != 0) goto L88;
        int[] r0 = (int[]) r25.f2099a.get("android:visibility:screenLocation");
        int r3 = r0[r17];
        int r02 = r0[r18];
        int[] r43 = new int[2];
        r24.getLocationOnScreen(r43);
        r14.offsetLeftAndRight((r3 - r43[r17]) - r14.getLeft());
        r14.offsetTopAndBottom((r02 - r43[r18]) - r14.getTop());
        r24.getOverlay().add(r14);
    L88:
        C0831TE r03 = AbstractC0574NE.f1868a;
        r03.getClass();
        ObjectAnimator r2 = m2352J(r14, m2350K(r25, 1.0f), 0.0f);
        if (r2 != null) goto L91;
        r03.mo1252Q(r14, m2350K(r26, 1.0f));
    L91:
        if (r9 != 0) goto L96;
        if (r2 != null) goto L95;
        r24.getOverlay().remove(r14);
        return r2;
    L95:
        r5.setTag(R.id.save_overlay_view, r14);
        C1046YE r04 = new C1046YE(this, r24, r14, r5);
        r2.addListener(r04);
        r2.addPauseListener(r04);
        m779o().m766a(r04);
    L96:
        return r2;
    L98:
        if (r6 == null) goto L108;
        int r05 = r6.getVisibility();
        AbstractC0574NE.m1117b(r6, r17);
        C0831TE r1 = AbstractC0574NE.f1868a;
        r1.getClass();
        ObjectAnimator r23 = m2352J(r6, m2350K(r25, 1.0f), 0.0f);
        if (r23 != null) goto L102;
        r1.mo1252Q(r6, m2350K(r26, 1.0f));
    L102:
        if (r23 == null) goto L105;
        C1003XE r06 = new C1003XE(r6, r22);
        r23.addListener(r06);
        m779o().m766a(r06);
        return r23;
    L105:
        AbstractC0574NE.m1117b(r6, r05);
        return r23;
    L108:
        return r16;
    L35:
        if (r12 != null) goto L37;
    L46:
        if (r12 != null) goto L47;
    L44:
        boolean r15 = true;
        r12 = null;
    L45:
        View r142 = null;
    L48:
        if (r15 == true) goto L50;
    L83:
        r22 = r42;
        r18 = 1;
        r17 = 0;
        View r21 = r142;
        r16 = null;
    L84:
        r14 = r12;
    L77:
        r9 = r17;
        r6 = r21;
        goto L85
    L50:
        if (r5.getParent() != null) goto L53;
        r22 = r42;
        r18 = 1;
        r9 = 0;
        r17 = 0;
        r6 = r142;
        r16 = null;
        r14 = r5;
        goto L85
    L53:
        if ((r5.getParent() instanceof View) == false) goto L83;
        View r152 = (View) r5.getParent();
        r16 = null;
        r17 = 0;
        if (m2351L(m781r(r152, true), m778n(r152, true)).f3465a == true) goto L78;
        Matrix r62 = new Matrix();
        r62.setTranslate(-r152.getScrollX(), -r152.getScrollY());
        C0831TE r10 = AbstractC0574NE.f1868a;
        r10.mo1657a0(r5, r62);
        r10.mo1658b0(r24, r62);
        RectF r102 = new RectF(0.0f, 0.0f, r5.getWidth(), r5.getHeight());
        r62.mapRect(r102);
        int r122 = Math.round(r102.left);
        int r153 = Math.round(r102.top);
        r18 = 1;
        int r92 = Math.round(r102.right);
        int r13 = Math.round(r102.bottom);
        ImageView r8 = new ImageView(r5.getContext());
        r8.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean r11 = r5.isAttachedToWindow();
        if (r24 != null) goto L59;
    L61:
        boolean r19 = false;
    L62:
        if (r11 == true) goto L66;
        if (r19 == true) goto L65;
        r22 = r42;
        r21 = r142;
        Bitmap r07 = null;
    L74:
        if (r07 == null) goto L76;
        r8.setImageBitmap(r07);
    L76:
        r8.measure(View.MeasureSpec.makeMeasureSpec(r92 - r122, 1073741824), View.MeasureSpec.makeMeasureSpec(r13 - r153, 1073741824));
        r8.layout(r122, r153, r92, r13);
        r14 = r8;
        goto L77
    L65:
        ViewGroup r7 = (ViewGroup) r5.getParent();
        int r192 = r7.indexOfChild(r5);
        r24.getOverlay().add(r5);
        boolean r193 = r11;
        int r112 = r192;
        ViewGroup r72 = r7;
    L67:
        r21 = r142;
        int r143 = Math.round(r102.width());
        r22 = r42;
        int r44 = Math.round(r102.height());
        if (r143 <= 0) goto L71;
        if (r44 <= 0) goto L71;
        float r32 = Math.min(1.0f, 1048576.0f / (r143 * r44));
        int r08 = Math.round(r143 * r32);
        int r45 = Math.round(r44 * r32);
        r62.postTranslate(-r102.left, -r102.top);
        r62.postScale(r32, r32);
        Picture r33 = new Picture();
        Canvas r09 = r33.beginRecording(r08, r45);
        r09.concat(r62);
        r5.draw(r09);
        r33.endRecording();
        r07 = AbstractC0614OB.m1192a(r33);
    L72:
        if (r193 == true) goto L74;
        r24.getOverlay().remove(r5);
        r72.addView(r5, r112);
    L71:
        r07 = null;
        goto L72
    L66:
        r193 = r11;
        r72 = null;
        r112 = 0;
        goto L67
    L59:
        if (r24.isAttachedToWindow() == false) goto L61;
        r19 = true;
        goto L62
    L78:
        r22 = r42;
        r18 = 1;
        r21 = r142;
        int r010 = r152.getId();
        if (r152.getParent() != null) goto L84;
        if (r010 == (-1)) goto L84;
        r24.findViewById(r010);
        goto L84
    L47:
        r15 = false;
        goto L45
    L37:
        if (r12.getParent() == null) goto L46;
        if (r42 == 4) goto L43;
        if (r5 != r12) goto L44;
    L43:
        r15 = false;
        r142 = r12;
        r12 = null;
        goto L48
    L31:
        r12 = null;
        goto L32
    L13:
        if ((this.f4178A & 1) != 1) goto L107;
        if (r26 == null) goto L107;
        View r110 = r26.f2100b;
        if (r25 != null) goto L21;
        View r34 = (View) r110.getParent();
        if (m2351L(m778n(r34, false), m781r(r34, false)).f3465a == true) goto L107;
    L21:
        AbstractC0574NE.f1868a.getClass();
        return m2352J(r110, m2350K(r25, 0.0f), 1.0f);
    L7:
        if (r4.f3470f != null) goto L10;
    L107:
        return null;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: q */
    public final String[] mo780q() {
        return f4177B;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: s */
    public final boolean mo782s(C0657PB r4, C0657PB r5) {
        if (r4 != null) goto L5;
        if (r5 != null) goto L5;
        return false;
    L5:
        if (r4 == null) goto L10;
        if (r5 == null) goto L10;
        if (r5.f2099a.containsKey("android:visibility:visibility") == r4.f2099a.containsKey("android:visibility:visibility")) goto L10;
        return false;
    L10:
        C1089ZE r42 = m2351L(r4, r5);
        if (r42.f3465a == true) goto L13;
        return false;
    L13:
        if (r42.f3467c != 0) goto L15;
        return true;
    L15:
        if (r42.f3468d != 0) goto L21;
        return true;
    L21:
        return false;
    }

    public C1222bh() {
        this.f4178A = 3;
    }
}
