package p050c0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.AbstractC0762d;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p052d0.C0753n;
import p052d0.C0756q;

/* JADX INFO: renamed from: c0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574B0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1699b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0580D0 f1700c;

    public C0574B0(int r1) {
        this.f1699b = r1;
        switch(r1) {
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L14;
            case 8: goto L12;
            case 9: goto L10;
            case 10: goto L8;
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        this.f1700c = C0580D0.f1723a;
        return;
    L6:
        this.f1700c = C0580D0.f1723a;
        return;
    L8:
        this.f1700c = C0580D0.f1723a;
        return;
    L10:
        this.f1700c = C0580D0.f1723a;
        return;
    L12:
        this.f1700c = C0580D0.f1723a;
        return;
    L14:
        this.f1700c = C0580D0.f1723a;
        return;
    L16:
        this.f1700c = C0580D0.f1723a;
        return;
    L18:
        this.f1700c = C0580D0.f1723a;
        return;
    L20:
        this.f1700c = C0580D0.f1723a;
        return;
    L22:
        this.f1700c = C0580D0.f1723a;
        return;
    L24:
        this.f1700c = C0580D0.f1723a;
        return;
    L26:
        this.f1700c = C0580D0.f1723a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r8) {
        int r1 = 0;
        Activity r2 = null;
        Integer r22 = null;
        Integer r23 = null;
        Activity r24 = null;
        Activity r25 = null;
        Activity r26 = null;
        switch(this.f1699b) {
            case 2: goto L95;
            case 3: goto L85;
            case 4: goto L80;
            case 5: goto L73;
            case 6: goto L58;
            case 7: goto L51;
            case 8: goto L40;
            case 9: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0580D0 r12 = this.f1700c;
        Object r3 = r8.f2669b;
        r12.getClass();
        if (r3 != null) goto L8;
    L28:
        Object[] r82 = r8.f2670c;
        AbstractC0307g.m702d(r82, "args");
        Object r83 = AbstractC0179j.m536m0(r82);
        if ((r83 instanceof Integer) == false) goto L31;
        r22 = (Integer) r83;
    L31:
        if (r22 == null) goto L33;
        int r84 = r22.intValue();
    L34:
        C0580D0.f1735m = r84;
        WeakReference r85 = C0580D0.f1729g;
        if (r85 == null) goto L118;
        Activity r86 = (Activity) r85.get();
        if (r86 == null) goto L119;
        this.f1700c.getClass();
        C0580D0.m1404k(r86);
        return;
    L119:
        return;
    L118:
        return;
    L33:
        r84 = C0580D0.f1735m;
        goto L34
    L8:
        if (C0580D0.f1721B == true) goto L28;
        Object r32 = C0580D0.m1400g(r3);     // Catch: Throwable -> L12
    L14:
        boolean r4 = r32 instanceof C0140f;
        Object r33 = r32;
        if (r4 == false) goto L17;
        r33 = null;
    L17:
        View r34 = (View) r33;
        if (r34 == null) goto L28;
        Class<?> r35 = r34.getClass();
        AbstractC0762d.m1951a(r35, "onInterceptTouchEvent", new C0574B0(10));     // Catch: Throwable -> L23
        AbstractC0762d.m1951a(r35, "onTouchEvent", new C0574B0(11));     // Catch: Throwable -> L23
        C0580D0.f1721B = true;     // Catch: Throwable -> L23
        C0580D0.m1412s("hooked tab ViewPager " + r35 + " edge intercept+touch");     // Catch: Throwable -> L23
        Object r13 = C0146l.f339a;     // Catch: Throwable -> L23
    L25:
        Throwable r14 = AbstractC0141g.m465a(r13);
        if (r14 == null) goto L28;
        C0580D0 r36 = C0580D0.f1723a;
        C0580D0.m1412s("hookTabViewPagerSwipe fail: " + r14.getMessage());
    L23:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
    L12:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L14
    L40:
        Object[] r87 = r8.f2670c;
        AbstractC0307g.m702d(r87, "args");
        Object r88 = AbstractC0179j.m537n0(0, r87);
        if ((r88 instanceof Integer) == false) goto L43;
        r23 = (Integer) r88;
    L43:
        if (r23 == null) goto L45;
        r1 = r23.intValue();
    L45:
        C0580D0.f1735m = r1;
        WeakReference r89 = C0580D0.f1729g;
        if (r89 == null) goto L120;
        Activity r810 = (Activity) r89.get();
        if (r810 == null) goto L121;
        this.f1700c.getClass();
        C0580D0.m1404k(r810);
        return;
    L121:
        return;
    L120:
        return;
    L51:
        Object r811 = r8.f2669b;
        if ((r811 instanceof Activity) == false) goto L54;
        r24 = (Activity) r811;
    L54:
        if (r24 == null) goto L122;
        C0580D0.f1748z = false;
        C0580D0.f1720A = SystemClock.uptimeMillis();
        this.f1700c.getClass();
        C0580D0.m1410q(r24);
        return;
    L122:
        return;
    L58:
        Object[] r37 = r8.f2670c;
        AbstractC0307g.m702d(r37, "args");
        Object r02 = AbstractC0179j.m537n0(0, r37);
        if ((r02 instanceof Boolean) == false) goto L61;
        Boolean r03 = (Boolean) r02;
    L62:
        if (r03 == null) goto L123;
        boolean r04 = r03.booleanValue();
        Object r812 = r8.f2669b;
        if ((r812 instanceof Activity) == false) goto L66;
        r25 = (Activity) r812;
    L66:
        if (r25 == null) goto L125;
        C0580D0 r813 = this.f1700c;
        if (r04 == false) goto L71;
        r813.getClass();
        C0580D0.m1412s("launcher focus gained -> tick");
        C0580D0.m1404k(r25);
        return;
    L71:
        r813.getClass();
        C0580D0.m1412s("launcher focus lost (keep avatar)");
        return;
    L125:
        return;
    L123:
        return;
    L61:
        r03 = null;
        goto L62
    L73:
        WeakReference r814 = C0580D0.f1729g;
        if (r814 == null) goto L126;
        Activity r815 = (Activity) r814.get();
        if (r815 == null) goto L127;
        this.f1700c.getClass();
        C0580D0.m1404k(r815);
        return;
    L127:
        return;
    L126:
        return;
    L85:
        C0580D0.f1748z = false;
        C0580D0.f1720A = SystemClock.uptimeMillis();
        Activity r816 = C0580D0.m1394a(r8.f2669b);
        if (r816 != null) goto L93;
        WeakReference r817 = C0580D0.f1729g;
        if (r817 == null) goto L90;
        r26 = (Activity) r817.get();
    L90:
        if (r26 == null) goto L130;
        r816 = r26;
        goto L93
    L130:
        return;
    L93:
        this.f1700c.getClass();
        C0580D0.m1410q(r816);
        return;
    L95:
        Object[] r38 = r8.f2670c;
        AbstractC0307g.m702d(r38, "args");
        Object r05 = AbstractC0179j.m537n0(0, r38);
        if ((r05 instanceof Integer) == false) goto L98;
        Integer r06 = (Integer) r05;
    L99:
        if (r06 != null) goto L102;
        return;
    L102:
        if (r06.intValue() != 0) goto L132;
        C0580D0.f1748z = false;
        C0580D0.f1720A = SystemClock.uptimeMillis();
        Activity r818 = C0580D0.m1394a(r8.f2669b);
        if (r818 != null) goto L112;
        WeakReference r819 = C0580D0.f1729g;
        if (r819 == null) goto L109;
        r2 = (Activity) r819.get();
    L109:
        if (r2 == null) goto L133;
        r818 = r2;
        goto L112
    L133:
        return;
    L112:
        this.f1700c.getClass();
        C0580D0.m1410q(r818);
        return;
    L132:
        return;
    L98:
        r06 = null;
        goto L99
    L80:
        if (AbstractC0425j.m1005J0(C0580D0.f1722C, "LauncherUI", false) == false) goto L82;
        return;
    L82:
        if (AbstractC0425j.m1005J0(C0580D0.f1722C, "MainTabUI", false) == true) goto L129;
        this.f1700c.getClass();
        C0580D0.m1412s("dialog show on non-home -> hide avatar");
        this.f1700c.getClass();
        C0580D0.m1411r(false);
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r13) {
        ViewParent r2 = null;
        MotionEvent r22 = null;
        switch(this.f1699b) {
            case 0: goto L112;
            case 1: goto L110;
            case 10: goto L48;
            case 11: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Object r6 = r13.f2669b;
        if ((r6 instanceof View) == false) goto L8;
        View r62 = (View) r6;
    L9:
        if (r62 == null) goto L115;
        Object[] r7 = r13.f2670c;
        AbstractC0307g.m702d(r7, "args");
        Object r1 = AbstractC0179j.m537n0(0, r7);
        if ((r1 instanceof MotionEvent) == false) goto L14;
        r22 = (MotionEvent) r1;
    L14:
        if (r22 == null) goto L116;
        C0580D0 r12 = this.f1700c;
        Context r63 = r62.getContext();
        r12.getClass();
        Activity r14 = C0580D0.m1399f(r63);
        if (r14 != null) goto L20;
        return;
    L20:
        if (AbstractC0358S.f742v == true) goto L22;
        return;
    L22:
        if (AbstractC0358S.f743w == false) goto L118;
        int r64 = r22.getActionMasked();
        if (r64 == 1) goto L36;
        if (r64 == 2) goto L29;
        if (r64 == 3) goto L36;
        return;
    L29:
        float r02 = r22.getRawX() - AbstractC0358S.f744x;
        C0753n r23 = AbstractC0358S.m871W();
        if (r23 != null) goto L35;
        C0753n r03 = AbstractC0358S.m881d(r14);
        if (r03 != null) goto L34;
        AbstractC0358S.f742v = false;
    L46:
        r13.m1946c(Boolean.TRUE);
        return;
    L34:
        r03.f2626a.setTranslationX(-r03.f2628c);
        r03.f2627b.setAlpha(0.0f);
        goto L46
    L35:
        float r04 = Math.abs(r02);
        View r15 = r23.f2626a;
        float r3 = r23.f2628c;
        r15.setTranslationX(AbstractC0040p.m110o(r04 - r3, -r3, 0.0f));
        r23.f2627b.setAlpha(AbstractC0040p.m110o(AbstractC0040p.m110o(r04 / r23.f2628c, 0.0f, 1.0f) * 0.42f, 0.0f, 0.42f));
    L36:
        AbstractC0358S.f742v = false;
        AbstractC0358S.f743w = false;
        float r16 = r22.getRawX() - AbstractC0358S.f744x;
        C0753n r65 = AbstractC0358S.m871W();
        if (r65 == null) goto L46;
        if (r22.getActionMasked() != 3) goto L42;
    L45:
        AbstractC0358S.m898n(true);
        goto L46
    L42:
        if (Math.abs(r16) < (r65.f2628c * 0.28f)) goto L45;
        View r05 = r65.f2626a;
        View r17 = r65.f2627b;
        AbstractC0358S.f739s = true;
        AnimatorSet r24 = new AnimatorSet();
        r24.playTogether(new Animator[]{ObjectAnimator.ofFloat(r05, View.TRANSLATION_X, new float[]{r05.getTranslationX(), 0.0f}), ObjectAnimator.ofFloat(r17, View.ALPHA, new float[]{r17.getAlpha(), 0.42f})});
        r24.setDuration(200);
        r24.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        r24.addListener(new C0756q());
        r24.start();
        goto L46
    L118:
        return;
    L116:
        return;
    L115:
        return;
    L8:
        r62 = null;
        goto L9
    L48:
        Object r66 = r13.f2669b;
        if ((r66 instanceof View) == false) goto L51;
        View r67 = (View) r66;
    L52:
        if (r67 == null) goto L125;
        Object[] r72 = r13.f2670c;
        AbstractC0307g.m702d(r72, "args");
        Object r18 = AbstractC0179j.m537n0(0, r72);
        if ((r18 instanceof MotionEvent) == false) goto L57;
        MotionEvent r19 = (MotionEvent) r18;
    L58:
        if (r19 == null) goto L126;
        C0580D0 r73 = this.f1700c;
        Context r68 = r67.getContext();
        r73.getClass();
        Activity r69 = C0580D0.m1399f(r68);
        if (r69 == null) goto L127;
        int r74 = r19.getActionMasked();
        if (r74 == 0) goto L84;
        if (r74 == 1) goto L81;
        if (r74 == 2) goto L70;
        if (r74 == 3) goto L81;
        return;
    L70:
        if (AbstractC0358S.f742v == false) goto L129;
        float r06 = r19.getRawX() - AbstractC0358S.f744x;
        float r110 = Math.abs(r19.getRawY() - AbstractC0358S.f745y);
        float r25 = (int) ((8 * r69.getResources().getDisplayMetrics().density) + 0.5f);
        if (Math.abs(r06) <= r25) goto L78;
        if (Math.abs(r06) <= r110) goto L78;
        AbstractC0358S.f743w = true;
        r13.m1946c(Boolean.TRUE);
        return;
    L78:
        if (r110 <= r25) goto L121;
        AbstractC0358S.f742v = false;
        return;
    L121:
        return;
    L129:
        return;
    L81:
        if (AbstractC0358S.f742v == false) goto L130;
        AbstractC0358S.f742v = false;
        AbstractC0358S.f743w = false;
        return;
    L130:
        return;
    L84:
        FrameLayout r132 = AbstractC0358S.f736p;
        if (r132 == null) goto L87;
        r2 = r132.getParent();
    L87:
        if (r2 == null) goto L94;
        FrameLayout r133 = AbstractC0358S.f736p;
        if (r133 == null) goto L94;
        if (r133.getVisibility() != 0) goto L94;
        return;
    L94:
        if (AbstractC0358S.f739s == false) goto L96;
        return;
    L96:
        if (AbstractC0358S.f742v == true) goto L132;
        float r134 = r69.getResources().getDisplayMetrics().density;
        float r07 = r19.getRawX();
        float r111 = r19.getRawY();
        if (r07 > ((int) ((72 * r134) + 0.5f))) goto L133;
        int r26 = r69.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (r26 <= 0) goto L104;
        int r27 = r69.getResources().getDimensionPixelSize(r26);
    L106:
        if (r111 < (r27 + ((int) ((74 * r134) + 0.5f)))) goto L134;
        AbstractC0358S.f742v = true;
        AbstractC0358S.f743w = false;
        AbstractC0358S.f744x = r07;
        AbstractC0358S.f745y = r111;
        return;
    L134:
        return;
    L104:
        r27 = (int) (28 * r69.getResources().getDisplayMetrics().density);
        goto L106
    L133:
        return;
    L132:
        return;
    L127:
        return;
    L126:
        return;
    L57:
        r19 = null;
        goto L58
    L125:
        return;
    L51:
        r67 = null;
        goto L52
    L110:
        C0580D0.f1748z = true;
        this.f1700c.getClass();
        C0580D0.m1411r(false);
        AbstractC0358S.m898n(false);
        return;
    L112:
        C0580D0.f1748z = true;
        this.f1700c.getClass();
        C0580D0.m1411r(false);
        AbstractC0358S.m898n(false);
    }
}
