package defpackage;

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
import com.ljx.wechatmod.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pj extends r70 {
    public static final String[] x = null;
    public final int w;

    static {
        x = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public pj(int r1) {
        this();
        this.w = r1;
    }

    public static void F(x70 r3) {
        View r0 = r3.b;
        int r1 = r0.getVisibility();
        HashMap r32 = r3.a;
        r32.put("android:visibility:visibility", Integer.valueOf(r1));
        r32.put("android:visibility:parent", r0.getParent());
        int[] r12 = new int[2];
        r0.getLocationOnScreen(r12);
        r32.put("android:visibility:screenLocation", r12);
    }

    public static kb0 H(x70 r8, x70 r9) {
        kb0 r0 = new kb0();
        r0.a = false;
        r0.b = false;
        if (r8 == null) goto L7;
        HashMap r6 = r8.a;
        if (r6.containsKey("android:visibility:visibility") == false) goto L7;
        r0.c = ((Integer) r6.get("android:visibility:visibility")).intValue();
        r0.e = (ViewGroup) r6.get("android:visibility:parent");
    L8:
        if (r9 == null) goto L12;
        HashMap r62 = r9.a;
        if (r62.containsKey("android:visibility:visibility") == false) goto L12;
        r0.d = ((Integer) r62.get("android:visibility:visibility")).intValue();
        r0.f = (ViewGroup) r62.get("android:visibility:parent");
    L14:
        if (r8 == null) goto L36;
        if (r9 == null) goto L36;
        int r82 = r0.c;
        int r92 = r0.d;
        if (r82 == r92) goto L19;
    L21:
        if (r82 == r92) goto L29;
        if (r82 != 0) goto L25;
        r0.b = false;
        r0.a = true;
        return r0;
    L25:
        if (r92 != 0) goto L45;
        r0.b = true;
        r0.a = true;
        return r0;
    L45:
        return r0;
    L29:
        if (r0.f != null) goto L33;
        r0.b = false;
        r0.a = true;
        return r0;
    L33:
        if (r0.e != null) goto L45;
        r0.b = true;
        r0.a = true;
        return r0;
    L19:
        if (r0.e != r0.f) goto L21;
    L36:
        if (r8 == null) goto L38;
    L41:
        if (r9 != null) goto L45;
        if (r0.c != 0) goto L45;
        r0.b = false;
        r0.a = true;
        goto L45
    L38:
        if (r0.d != 0) goto L41;
        r0.b = true;
        r0.a = true;
        return r0;
    L12:
        r0.d = -1;
        r0.f = null;
    L7:
        r0.c = -1;
        r0.e = null;
        goto L8
    }

    public final ObjectAnimator G(View r3, float r4, float r5) {
        if (r4 != r5) goto L6;
        return null;
    L6:
        bb0.a.N(r3, r4);
        ObjectAnimator r42 = ObjectAnimator.ofFloat(r3, bb0.b, new float[]{r5});
        r42.addListener(new oj(r3));
        a(new nj(0, r3));
        return r42;
    }

    @Override // defpackage.r70
    public final void c(x70 r1) {
        F(r1);
    }

    @Override // defpackage.r70
    public final void f(x70 r3) {
        F(r3);
        HashMap r0 = r3.a;
        View r32 = r3.b;
        r0.put("android:fade:transitionAlpha", Float.valueOf(bb0.a.x(r32)));
    }

    @Override // defpackage.r70
    public final Animator j(ViewGroup r24, x70 r25, x70 r26) {
        kb0 r4 = H(r25, r26);
        if (r4.a == false) goto L129;
        if (r4.e == null) goto L7;
    L10:
        boolean r5 = r4.b;
        int r7 = this.w;
        float r10 = 0.0f;
        int r12 = 0;
        if (r5 == true) goto L13;
        int r42 = r4.d;
        if ((r7 & 2) != 2) goto L129;
        if (r25 == null) goto L129;
        HashMap r72 = r25.a;
        View r2 = r25.b;
        if (r26 == null) goto L40;
        View r3 = r26.b;
    L41:
        View r14 = (View) r2.getTag(R.id.save_overlay_view);
        if (r14 == null) goto L44;
        int r22 = r42;
        Object r19 = "android:fade:transitionAlpha";
        char r18 = 1;
        int r17 = 0;
        View r6 = null;
        Animator r16 = null;
        r12 = 1;
    L101:
        if (r14 == null) goto L116;
        if (r12 != 0) goto L104;
        int[] r0 = (int[]) r72.get("android:visibility:screenLocation");
        int r32 = r0[r17];
        int r02 = r0[r18];
        int[] r43 = new int[2];
        r24.getLocationOnScreen(r43);
        r14.offsetLeftAndRight((r32 - r43[r17]) - r14.getLeft());
        r14.offsetTopAndBottom((r02 - r43[r18]) - r14.getTop());
        r24.getOverlay().add(r14);
    L104:
        bb0.a.getClass();
        Float r03 = (Float) r72.get(r19);
        if (r03 == null) goto L108;
        float r9 = r03.floatValue();
    L109:
        ObjectAnimator r04 = G(r14, r9, 0.0f);
        if (r12 != 0) goto L115;
        if (r04 != null) goto L114;
        r24.getOverlay().remove(r14);
        return r04;
    L114:
        r2.setTag(R.id.save_overlay_view, r14);
        a(new ib0(this, r24, r14, r2));
    L115:
        return r04;
    L108:
        r9 = 1.0f;
        goto L109
    L116:
        Object r05 = r19;
        if (r6 == null) goto L130;
        int r1 = r6.getVisibility();
        db0 r23 = bb0.a;
        r23.O(r6, r17);
        r23.getClass();
        Float r06 = (Float) r72.get(r05);
        if (r06 == null) goto L122;
        float r92 = r06.floatValue();
    L123:
        ObjectAnimator r07 = G(r6, r92, 0.0f);
        if (r07 == null) goto L127;
        jb0 r13 = new jb0(r6, r22);
        r07.addListener(r13);
        r07.addPauseListener(r13);
        a(r13);
        return r07;
    L127:
        r23.O(r6, r1);
        return r07;
    L122:
        r92 = 1.0f;
        goto L123
    L130:
        return r16;
    L44:
        if (r3 != null) goto L46;
    L55:
        if (r3 != null) goto L56;
    L53:
        boolean r15 = true;
        r3 = null;
    L54:
        View r142 = null;
    L57:
        if (r15 == true) goto L59;
    L99:
        r22 = r42;
        r19 = "android:fade:transitionAlpha";
        r18 = 1;
        r17 = 0;
        View r21 = r142;
        r16 = null;
    L100:
        r14 = r3;
    L93:
        r12 = r17;
        r6 = r21;
        goto L101
    L59:
        if (r2.getParent() != null) goto L62;
        r22 = r42;
        r19 = "android:fade:transitionAlpha";
        r18 = 1;
        r17 = 0;
        r6 = r142;
        r16 = null;
        r14 = r2;
        goto L101
    L62:
        if ((r2.getParent() instanceof View) == false) goto L99;
        View r152 = (View) r2.getParent();
        r16 = null;
        r17 = 0;
        if (H(p(r152, true), m(r152, true)).a == true) goto L94;
        boolean r33 = w70.a;
        Matrix r34 = new Matrix();
        r34.setTranslate(-r152.getScrollX(), -r152.getScrollY());
        db0 r62 = bb0.a;
        r62.U(r2, r34);
        r62.V(r24, r34);
        RectF r63 = new RectF(0.0f, 0.0f, r2.getWidth(), r2.getHeight());
        r34.mapRect(r63);
        int r122 = Math.round(r63.left);
        int r153 = Math.round(r63.top);
        r18 = 1;
        int r11 = Math.round(r63.right);
        int r132 = Math.round(r63.bottom);
        ImageView r102 = new ImageView(r2.getContext());
        r102.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (w70.a == false) goto L71;
        boolean r52 = !r2.isAttachedToWindow();
        if (r24 != null) goto L70;
        boolean r192 = false;
    L72:
        boolean r20 = w70.b;
        if (r20 == false) goto L78;
        if (r52 == false) goto L78;
        if (r192 == true) goto L77;
        r22 = r42;
        r19 = "android:fade:transitionAlpha";
        r21 = r142;
        Bitmap r08 = null;
    L90:
        if (r08 == null) goto L92;
        r102.setImageBitmap(r08);
    L92:
        r102.measure(View.MeasureSpec.makeMeasureSpec(r11 - r122, 1073741824), View.MeasureSpec.makeMeasureSpec(r132 - r153, 1073741824));
        r102.layout(r122, r153, r11, r132);
        r14 = r102;
        goto L93
    L77:
        ViewGroup r93 = (ViewGroup) r2.getParent();
        int r193 = r93.indexOfChild(r2);
        boolean r262 = r52;
        r24.getOverlay().add(r2);
        int r53 = r193;
    L79:
        r21 = r142;
        int r143 = Math.round(r63.width());
        r22 = r42;
        int r44 = Math.round(r63.height());
        if (r143 <= 0) goto L86;
        if (r44 <= 0) goto L86;
        r19 = "android:fade:transitionAlpha";
        float r09 = Math.min(1.0f, 1048576.0f / (r143 * r44));
        int r144 = Math.round(r143 * r09);
        int r45 = Math.round(r44 * r09);
        r34.postTranslate(-r63.left, -r63.top);
        r34.postScale(r09, r09);
        if (w70.c == false) goto L85;
        Picture r010 = new Picture();
        Canvas r46 = r010.beginRecording(r144, r45);
        r46.concat(r34);
        r2.draw(r46);
        r010.endRecording();
        r08 = c0.d(r010);
    L87:
        if (r20 == false) goto L90;
        if (r262 == false) goto L90;
        r24.getOverlay().remove(r2);
        r93.addView(r2, r53);
        goto L90
    L85:
        r08 = Bitmap.createBitmap(r144, r45, Bitmap.Config.ARGB_8888);
        Canvas r47 = new Canvas(r08);
        r47.concat(r34);
        r2.draw(r47);
    L86:
        r19 = "android:fade:transitionAlpha";
        r08 = null;
    L78:
        r262 = r52;
        r93 = null;
        r53 = 0;
        goto L79
    L70:
        r192 = r24.isAttachedToWindow();
        goto L72
    L71:
        r52 = false;
        r192 = false;
        goto L72
    L94:
        r22 = r42;
        r19 = "android:fade:transitionAlpha";
        r18 = 1;
        r21 = r142;
        int r011 = r152.getId();
        if (r152.getParent() != null) goto L100;
        if (r011 == (-1)) goto L100;
        r24.findViewById(r011);
        goto L100
    L56:
        r15 = false;
        goto L54
    L46:
        if (r3.getParent() == null) goto L55;
        if (r42 == 4) goto L52;
        if (r2 != r3) goto L53;
    L52:
        r142 = r3;
        r15 = false;
        r3 = null;
        goto L57
    L40:
        r3 = null;
        goto L41
    L13:
        if ((r7 & 1) != 1) goto L129;
        if (r26 == null) goto L129;
        View r110 = r26.b;
        if (r25 != null) goto L21;
        View r35 = (View) r110.getParent();
        if (H(m(r35, false), p(r35, false)).a == true) goto L129;
    L21:
        if (r25 == null) goto L25;
        Float r27 = (Float) r25.a.get("android:fade:transitionAlpha");
        if (r27 == null) goto L25;
        float r28 = r27.floatValue();
    L27:
        if (r28 == 1.0f) goto L31;
        r10 = r28;
    L31:
        return G(r110, r10, 1.0f);
    L25:
        r28 = 0.0f;
        goto L27
    L7:
        if (r4.f != null) goto L10;
    L129:
        return null;
    }

    @Override // defpackage.r70
    public final String[] o() {
        return x;
    }

    @Override // defpackage.r70
    public final boolean q(x70 r4, x70 r5) {
        if (r4 != null) goto L5;
        if (r5 != null) goto L5;
        return false;
    L5:
        if (r4 == null) goto L10;
        if (r5 == null) goto L10;
        if (r5.a.containsKey("android:visibility:visibility") == r4.a.containsKey("android:visibility:visibility")) goto L10;
        return false;
    L10:
        kb0 r42 = H(r4, r5);
        if (r42.a == true) goto L13;
        return false;
    L13:
        if (r42.c != 0) goto L15;
        return true;
    L15:
        if (r42.d != 0) goto L21;
        return true;
    L21:
        return false;
    }

    public pj() {
        this.w = 3;
    }
}
