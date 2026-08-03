package p043Y;

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
import java.util.HashMap;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: Y.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0449h extends AbstractC0454m {

    /* JADX INFO: renamed from: B */
    public static final String[] f992B = null;

    /* JADX INFO: renamed from: A */
    public final int f993A;

    static {
        f992B = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public C0449h(int r1) {
        this();
        this.f993A = r1;
    }

    /* JADX INFO: renamed from: I */
    public static void m1069I(C0462u r3) {
        int r02 = r3.f1042b.getVisibility();
        HashMap r1 = r3.f1041a;
        r1.put("android:visibility:visibility", Integer.valueOf(r02));
        View r32 = r3.f1042b;
        r1.put("android:visibility:parent", r32.getParent());
        int[] r03 = new int[2];
        r32.getLocationOnScreen(r03);
        r1.put("android:visibility:screenLocation", r03);
    }

    /* JADX INFO: renamed from: K */
    public static float m1070K(C0462u r1, float r2) {
        if (r1 == null) goto L7;
        Float r12 = (Float) r1.f1041a.get("android:fade:transitionAlpha");
        if (r12 != null) goto L6;
        return r2;
    L6:
        return r12.floatValue();
    L7:
        return r2;
    }

    /* JADX INFO: renamed from: L */
    public static C0441G m1071L(C0462u r8, C0462u r9) {
        C0441G r02 = new C0441G();
        r02.f963a = false;
        r02.f964b = false;
        if (r8 == null) goto L7;
        HashMap r6 = r8.f1041a;
        if (r6.containsKey("android:visibility:visibility") == false) goto L7;
        r02.f965c = ((Integer) r6.get("android:visibility:visibility")).intValue();
        r02.f967e = (ViewGroup) r6.get("android:visibility:parent");
    L8:
        if (r9 == null) goto L12;
        HashMap r62 = r9.f1041a;
        if (r62.containsKey("android:visibility:visibility") == false) goto L12;
        r02.f966d = ((Integer) r62.get("android:visibility:visibility")).intValue();
        r02.f968f = (ViewGroup) r62.get("android:visibility:parent");
    L14:
        if (r8 == null) goto L32;
        if (r9 == null) goto L32;
        int r82 = r02.f965c;
        int r92 = r02.f966d;
        if (r82 == r92) goto L19;
    L21:
        if (r82 == r92) goto L27;
        if (r82 != 0) goto L24;
        r02.f964b = false;
        r02.f963a = true;
    L40:
        return r02;
    L24:
        if (r92 != 0) goto L40;
        r02.f964b = true;
        r02.f963a = true;
        goto L40
    L27:
        if (r02.f968f != null) goto L30;
        r02.f964b = false;
        r02.f963a = true;
        goto L40
    L30:
        if (r02.f967e != null) goto L40;
        r02.f964b = true;
        r02.f963a = true;
        goto L40
    L19:
        if (r02.f967e != r02.f968f) goto L21;
        return r02;
    L32:
        if (r8 == null) goto L34;
    L36:
        if (r9 != null) goto L40;
        if (r02.f965c != 0) goto L40;
        r02.f964b = false;
        r02.f963a = true;
        goto L40
    L34:
        if (r02.f966d != 0) goto L36;
        r02.f964b = true;
        r02.f963a = true;
    L12:
        r02.f966d = -1;
        r02.f968f = null;
    L7:
        r02.f965c = -1;
        r02.f967e = null;
        goto L8
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m1072J(View r3, float r4, float r5) {
        if (r4 != r5) goto L6;
        return null;
    L6:
        AbstractC0465x.f1048a.mo924k0(r3, r4);
        ObjectAnimator r42 = ObjectAnimator.ofFloat(r3, AbstractC0465x.f1049b, new float[]{r5});
        C0448g r52 = new C0448g(r3);
        r42.addListener(r52);
        m1085o().m1079a(r52);
        return r42;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u r1) {
        m1069I(r1);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u r3) {
        m1069I(r3);
        View r02 = r3.f1042b;
        Float r1 = (Float) r02.getTag(C1031R.id.transition_pause_alpha);
        if (r1 == null) goto L5;
    L8:
        r3.f1041a.put("android:fade:transitionAlpha", r1);
        return;
    L5:
        if (r02.getVisibility() != 0) goto L7;
        r1 = Float.valueOf(AbstractC0465x.f1048a.mo926z(r02));
        goto L8
    L7:
        r1 = Float.valueOf(0.0f);
        goto L8
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: k */
    public final Animator mo1066k(ViewGroup r21, C0462u r22, C0462u r23) {
        int r4 = this.f993A;
        C0441G r5 = m1071L(r22, r23);
        if (r5.f963a == false) goto L109;
        if (r5.f967e == null) goto L7;
    L10:
        boolean r10 = false;
        if (r5.f964b == true) goto L13;
        int r52 = r5.f966d;
        if ((r4 & 2) != 2) goto L26;
        if (r22 == null) goto L26;
        if (r23 == null) goto L31;
        View r42 = r23.f1042b;
    L32:
        View r12 = r22.f1042b;
        View r14 = (View) r12.getTag(C1031R.id.save_overlay_view);
        if (r14 == null) goto L35;
        int r18 = r52;
        r10 = true;
        View r7 = null;
    L88:
        if (r14 == null) goto L100;
        if (r10 == true) goto L92;
        int[] r2 = (int[]) r22.f1041a.get("android:visibility:screenLocation");
        int r43 = r2[0];
        int r24 = r2[1];
        int[] r6 = new int[2];
        r21.getLocationOnScreen(r6);
        r14.offsetLeftAndRight((r43 - r6[0]) - r14.getLeft());
        r14.offsetTopAndBottom((r24 - r6[1]) - r14.getTop());
        r21.getOverlay().add(r14);
    L92:
        C0437C r25 = AbstractC0465x.f1048a;
        r25.getClass();
        ObjectAnimator r72 = m1072J(r14, m1070K(r22, 1.0f), 0.0f);
        if (r72 != null) goto L95;
        r25.mo924k0(r14, m1070K(r23, 1.0f));
    L95:
        if (r10 == true) goto L112;
        if (r72 != null) goto L98;
        r21.getOverlay().remove(r14);
        return r72;
    L98:
        r12.setTag(C1031R.id.save_overlay_view, r14);
        C0440F r02 = new C0440F(this, r21, r14, r12);
        r72.addListener(r02);
        r72.addPauseListener(r02);
        m1085o().m1079a(r02);
        return r72;
    L112:
        return r72;
    L100:
        if (r7 == null) goto L26;
        int r1 = r7.getVisibility();
        AbstractC0465x.m1096b(r7, 0);
        C0437C r26 = AbstractC0465x.f1048a;
        r26.getClass();
        ObjectAnimator r03 = m1072J(r7, m1070K(r22, 1.0f), 0.0f);
        if (r03 != null) goto L104;
        r26.mo924k0(r7, m1070K(r23, 1.0f));
    L104:
        if (r03 == null) goto L106;
        C0439E r13 = new C0439E(r7, r18);
        r03.addListener(r13);
        m1085o().m1079a(r13);
    L108:
        return r03;
    L106:
        AbstractC0465x.m1096b(r7, r1);
        goto L108
    L35:
        if (r42 != null) goto L37;
    L46:
        if (r42 != null) goto L47;
    L44:
        boolean r15 = true;
        r42 = null;
    L45:
        View r142 = null;
    L48:
        if (r15 == true) goto L50;
    L86:
        r18 = r52;
        View r16 = r142;
    L87:
        r14 = r42;
    L80:
        r7 = r16;
        r10 = false;
        goto L88
    L50:
        if (r12.getParent() != null) goto L53;
        r18 = r52;
        r7 = r142;
        r14 = r12;
        goto L88
    L53:
        if ((r12.getParent() instanceof View) == false) goto L86;
        View r152 = (View) r12.getParent();
        if (m1071L(m1086r(r152, true), m1084n(r152, true)).f963a == true) goto L81;
        boolean r44 = AbstractC0461t.f1040a;
        Matrix r45 = new Matrix();
        r45.setTranslate(-r152.getScrollX(), -r152.getScrollY());
        C0437C r73 = AbstractC0465x.f1048a;
        r73.mo1039z0(r12, r45);
        r73.mo1037A0(r21, r45);
        RectF r74 = new RectF(0.0f, 0.0f, r12.getWidth(), r12.getHeight());
        r45.mapRect(r74);
        int r132 = Math.round(r74.left);
        int r153 = Math.round(r74.top);
        int r8 = Math.round(r74.right);
        int r62 = Math.round(r74.bottom);
        ImageView r102 = new ImageView(r12.getContext());
        r102.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean r9 = !r12.isAttachedToWindow();
        if (r21 != null) goto L59;
    L61:
        boolean r162 = false;
    L62:
        if (r9 == false) goto L66;
        if (r162 == true) goto L65;
        r18 = r52;
        r16 = r142;
        Bitmap r04 = null;
    L77:
        if (r04 == null) goto L79;
        r102.setImageBitmap(r04);
    L79:
        r102.measure(View.MeasureSpec.makeMeasureSpec(r8 - r132, 1073741824), View.MeasureSpec.makeMeasureSpec(r62 - r153, 1073741824));
        r102.layout(r132, r153, r8, r62);
        r14 = r102;
        goto L80
    L65:
        ViewGroup r11 = (ViewGroup) r12.getParent();
        int r163 = r11.indexOfChild(r12);
        r21.getOverlay().add(r12);
        ViewGroup r112 = r11;
        r16 = r142;
        int r143 = r163;
    L67:
        r18 = r52;
        int r53 = Math.round(r74.width());
        int r3 = Math.round(r74.height());
        if (r53 <= 0) goto L74;
        if (r3 <= 0) goto L74;
        float r05 = Math.min(1.0f, 1048576.0f / (r53 * r3));
        int r27 = Math.round(r53 * r05);
        int r32 = Math.round(r3 * r05);
        r45.postTranslate(-r74.left, -r74.top);
        r45.postScale(r05, r05);
        if (AbstractC0461t.f1040a == false) goto L73;
        Picture r06 = new Picture();
        Canvas r28 = r06.beginRecording(r27, r32);
        r28.concat(r45);
        r12.draw(r28);
        r06.endRecording();
        r04 = AbstractC0460s.m1091a(r06);
    L75:
        if (r9 == false) goto L77;
        r21.getOverlay().remove(r12);
        r112.addView(r12, r143);
        goto L77
    L73:
        r04 = Bitmap.createBitmap(r27, r32, Bitmap.Config.ARGB_8888);
        Canvas r29 = new Canvas(r04);
        r29.concat(r45);
        r12.draw(r29);
    L74:
        r04 = null;
        goto L75
    L66:
        r16 = r142;
        r112 = null;
        r143 = 0;
        goto L67
    L59:
        if (r21.isAttachedToWindow() == false) goto L61;
        r162 = true;
        goto L62
    L81:
        r18 = r52;
        r16 = r142;
        int r07 = r152.getId();
        if (r152.getParent() != null) goto L87;
        if (r07 == (-1)) goto L87;
        r21.findViewById(r07);
        goto L87
    L47:
        r15 = false;
        goto L45
    L37:
        if (r42.getParent() == null) goto L46;
        if (r52 == 4) goto L43;
        if (r12 != r42) goto L44;
    L43:
        r142 = r42;
        r15 = false;
        r42 = null;
        goto L48
    L31:
        r42 = null;
    L26:
        return null;
    L13:
        if ((r4 & 1) != 1) goto L20;
        if (r23 == null) goto L20;
        View r17 = r23.f1042b;
        if (r22 != null) goto L21;
        View r33 = (View) r17.getParent();
        if (m1071L(m1084n(r33, false), m1086r(r33, false)).f963a == true) goto L20;
    L21:
        AbstractC0465x.f1048a.getClass();
        return m1072J(r17, m1070K(r22, 0.0f), 1.0f);
    L20:
        return null;
    L7:
        if (r5.f968f != null) goto L10;
    L109:
        return null;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: q */
    public final String[] mo1067q() {
        return f992B;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: s */
    public final boolean mo1073s(C0462u r5, C0462u r6) {
        if (r5 != null) goto L6;
        if (r6 != null) goto L6;
        return false;
    L6:
        if (r5 == null) goto L11;
        if (r6 == null) goto L11;
        if (r6.f1041a.containsKey("android:visibility:visibility") == r5.f1041a.containsKey("android:visibility:visibility")) goto L11;
        return false;
    L11:
        C0441G r52 = m1071L(r5, r6);
        if (r52.f963a == true) goto L14;
        return false;
    L14:
        if (r52.f965c != 0) goto L16;
    L17:
        return true;
    L16:
        if (r52.f966d == 0) goto L17;
        return false;
    }

    public C0449h() {
        this.f993A = 3;
    }
}
