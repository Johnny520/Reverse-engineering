package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.a;
        Object r8 = this.b;
        switch(r0) {
            case 0: goto L98;
            case 1: goto L89;
            case 2: goto L122;
            case 3: goto L73;
            case 4: goto L71;
            case 5: goto L69;
            case 6: goto L61;
            case 7: goto L59;
            case 8: goto L16;
            case 9: goto L14;
            case 10: goto L12;
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        ((ma0) r8).n(0);
        return;
    L6:
        ActionMenuView r02 = ((Toolbar) r8).a;
        if (r02 == null) goto L125;
        j1 r03 = r02.t;
        if (r03 == null) goto L126;
        r03.l();
        return;
    L126:
        return;
    L125:
        return;
    L12:
        CheckableImageButton r04 = ((TextInputLayout) r8).c.g;
        r04.performClick();
        r04.jumpDrawablesToCurrentState();
        return;
    L14:
        ((StaggeredGridLayoutManager) r8).y0();
        return;
    L16:
        RecyclerView r82 = (RecyclerView) r8;
        jz r05 = r82.H;
        if (r05 == null) goto L56;
        uf r06 = (uf) r05;
        long r9 = r06.d;
        ArrayList r11 = r06.h;
        boolean r12 = r11.isEmpty();
        ArrayList r13 = r06.j;
        boolean r14 = r13.isEmpty();
        ArrayList r15 = r06.k;
        boolean r16 = r15.isEmpty();
        ArrayList r3 = r06.i;
        boolean r4 = r3.isEmpty();
        if (r12 == false) goto L24;
        if (r14 == false) goto L24;
        if (r4 == false) goto L24;
        if (r16 == true) goto L56;
    L24:
        int r5 = r11.size();
        int r6 = 0;
    L25:
        if (r6 >= r5) goto L27;
        Object r20 = r11.get(r6);
        b00 r7 = (b00) r20;
        View r2 = r7.a;
        boolean r22 = r4;
        ViewPropertyAnimator r42 = r2.animate();
        r06.q.add(r7);
        r42.setDuration(r9).alpha(0.0f).setListener(new pf(r06, r7, r42, r2)).start();
        r4 = r22;
        r5 = r5;
        r6 = r6 + 1;
        goto L25
    L27:
        boolean r222 = r4;
        r11.clear();
        if (r14 == true) goto L33;
        ArrayList r23 = new ArrayList();
        r23.addAll(r13);
        r06.m.add(r23);
        r13.clear();
        of r43 = new of(r06, r23, 0);
        if (r12 == true) goto L32;
        View r24 = ((tf) r23.get(0)).a.a;
        WeakHashMap r52 = ja0.a;
        s90.n(r24, r43, r9);
        goto L33
    L32:
        r43.run();
    L33:
        if (r16 == true) goto L38;
        ArrayList r25 = new ArrayList();
        r25.addAll(r15);
        r06.n.add(r25);
        r15.clear();
        of r44 = new of(r06, r25, 1);
        if (r12 == true) goto L37;
        View r26 = ((sf) r25.get(0)).a.a;
        WeakHashMap r53 = ja0.a;
        s90.n(r26, r44, r9);
        goto L38
    L37:
        r44.run();
    L38:
        if (r222 == true) goto L55;
        ArrayList r27 = new ArrayList();
        r27.addAll(r3);
        r06.l.add(r27);
        r3.clear();
        of r32 = new of(r06, r27, 2);
        if (r12 == false) goto L45;
        if (r14 == false) goto L45;
        if (r16 == false) goto L45;
        r32.run();
    L45:
        if (r12 == false) goto L48;
        r9 = 0;
    L48:
        if (r14 == true) goto L50;
        long r45 = r06.e;
    L51:
        if (r16 == true) goto L53;
        long r62 = r06.f;
    L54:
        long r46 = Math.max(r45, r62) + r9;
        boolean r07 = false;
        View r28 = ((b00) r27.get(0)).a;
        WeakHashMap r63 = ja0.a;
        s90.n(r28, r32, r46);
    L57:
        r82.i0 = r07;
        return;
    L53:
        r62 = 0;
        goto L54
    L50:
        r45 = 0;
    L55:
        r07 = false;
    L56:
        r07 = false;
        goto L57
    L59:
        ((yl) r8).t(true);
        return;
    L61:
        wj r83 = (wj) r8;
        ValueAnimator r08 = r83.z;
        int r29 = r83.A;
        if (r29 == 1) goto L66;
        int r47 = 2;
        if (r29 != 2) goto L127;
    L67:
        r83.A = 3;
        float[] r33 = new float[r47];
        r33[0] = ((Float) r08.getAnimatedValue()).floatValue();
        r33[1] = 0.0f;
        r08.setFloatValues(r33);
        r08.setDuration(500);
        r08.start();
        return;
    L127:
        return;
    L66:
        r47 = 2;
        r08.cancel();
        goto L67
    L69:
        kh r84 = (kh) r8;
        r84.l = null;
        r84.drawableStateChanged();
        return;
    L71:
        rg r85 = (rg) r8;
        r85.S.onDismiss(r85.a0);
        return;
    L73:
        zf r86 = (zf) r8;
        r86.a.endViewTransition(r86.b);
        r86.c.d();
        return;
    L89:
        u7 r87 = (u7) r8;
        r87.c = false;
        BottomSheetBehavior r09 = (BottomSheetBehavior) r87.e;
        ma0 r210 = r09.M;
        if (r210 == null) goto L95;
        if (r210.f() == false) goto L95;
        r87.a(r87.b);
        return;
    L95:
        if (r09.L != 2) goto L131;
        r09.C(r87.b);
        return;
    L131:
        return;
    L98:
        lr r88 = (lr) r8;
        kh r010 = r88.c;
        x6 r211 = r88.a;
        if (r88.o == true) goto L102;
        return;
    L102:
        if (r88.m == false) goto L105;
        r88.m = false;
        long r34 = AnimationUtils.currentAnimationTimeMillis();
        r211.e = r34;
        r211.g = -1;
        r211.f = r34;
        r211.h = 0.5f;
    L105:
        if (r211.g <= 0) goto L110;
        if (AnimationUtils.currentAnimationTimeMillis() <= (r211.g + ((long) r211.i))) goto L110;
    L112:
        r88.o = false;
        return;
    L110:
        if (r88.e() == false) goto L112;
        if (r88.n == false) goto L117;
        r88.n = false;
        long r92 = SystemClock.uptimeMillis();
        MotionEvent r35 = MotionEvent.obtain(r92, r92, 3, 0.0f, 0.0f, 0);
        r010.onTouchEvent(r35);
        r35.recycle();
    L117:
        if (r211.f == 0) goto L121;
        long r36 = AnimationUtils.currentAnimationTimeMillis();
        float r54 = r211.a(r36);
        float r55 = (r54 * 4.0f) + (((-4.0f) * r54) * r54);
        long r64 = r36 - r211.f;
        r211.f = r36;
        mr.b(r88.q, (int) ((r64 * r55) * r211.d));
        WeakHashMap r212 = ja0.a;
        s90.m(r010, this);
        return;
    L121:
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
    L122:
        ComponentActivity.g((ComponentActivity) r8);     // Catch: NullPointerException -> L77 IllegalStateException -> L79
    L128:
        return;
    L79:
        e = move-exception;
        if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState") == false) goto L88;
        return;
    L88:
        throw e;
    L77:
        e = move-exception;
        if (TextUtils.equals(e.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference") == true) goto L129;
        throw e;
    }
}
