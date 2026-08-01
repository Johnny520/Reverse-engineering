package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.ljx.wechatmod.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g3 implements qw, yc, cv {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ g3(r3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.cv
    public void a(ku r10, boolean r11) {
        switch(this.a) {
            case 2: goto L27;
            default: goto L4;
        };
    L4:
        ku r0 = r10.k();
        int r1 = 0;
        if (r0 == r10) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L10;
        r10 = r0;
    L10:
        r3 r4 = this.b;
        q3[] r5 = r4.L;
        if (r5 == null) goto L13;
        int r6 = r5.length;
    L14:
        if (r1 >= r6) goto L21;
        q3 r7 = r5[r1];
        if (r7 == null) goto L20;
        if (r7.h != r10) goto L20;
    L22:
        if (r7 == null) goto L34;
        if (r3 == false) goto L25;
        r4.q(r7.a, r7, r0);
        r4.s(r7, true);
        return;
    L25:
        r4.s(r7, r11);
        return;
    L34:
        return;
    L20:
        r1 = r1 + 1;
        goto L14
    L21:
        r7 = null;
        goto L22
    L13:
        r6 = 0;
        goto L14
    L7:
        r3 = false;
        goto L8
    L27:
        this.b.r(r10);
    }

    @Override // defpackage.qw
    public wc0 d(View r18, wc0 r19) {
        int r3 = r19.d();
        r3 r5 = this.b;
        Context r6 = r5.k;
        int r7 = r19.d();
        ActionBarContextView r0 = r5.v;
        if (r0 != null) goto L5;
    L68:
        boolean r16 = false;
    L69:
        View r02 = r5.C;
        if (r02 == null) goto L75;
        if (r16 == false) goto L73;
        int r8 = 0;
    L74:
        r02.setVisibility(r8);
        goto L75
    L73:
        r8 = 8;
    L75:
        if (r3 == r7) goto L84;
        int r03 = r19.b();
        int r32 = r19.c();
        int r52 = r19.a();
        int r62 = Build.VERSION.SDK_INT;
        if (r62 < 30) goto L80;
        mc0 r63 = new lc0(r19);
    L83:
        r63.g(ep.b(r03, r7, r32, r52));
        wc0 r04 = r63.b();
    L85:
        WeakHashMap r2 = ja0.a;
        WindowInsets r22 = r04.f();
        if (r22 == null) goto L93;
        WindowInsets r33 = w90.b(r18, r22);
        if (r33.equals(r22) == false) goto L90;
        return r04;
    L90:
        return wc0.g(r18, r33);
    L93:
        return r04;
    L80:
        if (r62 < 29) goto L82;
        r63 = new kc0(r19);
        goto L83
    L82:
        r63 = new ic0(r19);
        goto L83
    L84:
        r04 = r19;
        goto L85
    L5:
        if ((r0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) == false) goto L68;
        ViewGroup.MarginLayoutParams r10 = (ViewGroup.MarginLayoutParams) r5.v.getLayoutParams();
        if (r5.v.isShown() == false) goto L63;
        if (r5.c0 != null) goto L11;
        r5.c0 = new Rect();
        r5.d0 = new Rect();
    L11:
        Rect r12 = r5.c0;
        Rect r05 = r5.d0;
        r12.set(r19.b(), r19.d(), r19.c(), r19.a());
        ViewGroup r11 = r5.A;
        Method r13 = cb0.a;
        if (r13 != null) goto L91;
    L17:
        int r06 = r12.top;
        int r112 = r12.left;
        int r122 = r12.right;
        ViewGroup r132 = r5.A;
        WeakHashMap r14 = ja0.a;
        wc0 r133 = z90.a(r132);
        if (r133 != null) goto L20;
        int r142 = 0;
    L21:
        if (r133 != null) goto L23;
        int r134 = 0;
    L25:
        if (r10.topMargin == r06) goto L27;
    L32:
        r10.topMargin = r06;
        r10.leftMargin = r112;
        r10.rightMargin = r122;
        boolean r113 = true;
    L33:
        if (r06 > 0) goto L35;
    L37:
        View r07 = r5.C;
        if (r07 == null) goto L46;
        ViewGroup.MarginLayoutParams r08 = (ViewGroup.MarginLayoutParams) r07.getLayoutParams();
        int r82 = r08.height;
        int r123 = r10.topMargin;
        if (r82 == r123) goto L42;
    L45:
        r08.height = r123;
        r08.leftMargin = r142;
        r08.rightMargin = r134;
        r5.C.setLayoutParams(r08);
        goto L46
    L42:
        if (r08.leftMargin != r142) goto L45;
        if (r08.rightMargin != r134) goto L45;
    L46:
        View r09 = r5.C;
        if (r09 == null) goto L49;
        r16 = true;
    L50:
        if (r16 == false) goto L59;
        if (r09.getVisibility() == 0) goto L59;
        View r010 = r5.C;
        if ((s90.g(r010) & 8192) == 0) goto L56;
        int r64 = hd.a(r6, R.color.abc_decor_view_status_guard_light);
    L57:
        r010.setBackgroundColor(r64);
        goto L59
    L56:
        r64 = hd.a(r6, R.color.abc_decor_view_status_guard);
    L59:
        if (r5.H == true) goto L66;
        if (r16 == false) goto L66;
        r7 = 0;
    L66:
        if (r113 == false) goto L69;
        r5.v.setLayoutParams(r10);
        goto L69
    L49:
        r16 = false;
        goto L50
    L35:
        if (r5.C != null) goto L37;
        View r011 = new View(r6);
        r5.C = r011;
        r011.setVisibility(8);
        FrameLayout.LayoutParams r012 = new FrameLayout.LayoutParams(-1, r10.topMargin, 51);
        r012.leftMargin = r142;
        r012.rightMargin = r134;
        r5.A.addView(r5.C, -1, r012);
        goto L46
    L27:
        if (r10.leftMargin != r112) goto L32;
        if (r10.rightMargin != r122) goto L32;
        r113 = false;
        goto L33
    L23:
        r134 = r133.c();
        goto L25
    L20:
        r142 = r133.b();
        goto L21
    L91:
        r13.invoke(r11, new Object[]{r12, r05});     // Catch: Exception -> L15
    L15:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
        goto L17
    L63:
        if (r10.topMargin == 0) goto L65;
        r10.topMargin = 0;
        r16 = false;
        r113 = true;
        goto L66
    L65:
        r113 = false;
        r16 = false;
        goto L66
    }

    @Override // defpackage.cv
    public boolean q(ku r3) {
        switch(this.a) {
            case 2: goto L15;
            default: goto L5;
        };
    L15:
        Window.Callback r0 = this.b.l.getCallback();
        if (r0 == null) goto L24;
        r0.onMenuOpened(108, r3);
        return true;
    L24:
        return true;
    L5:
        if (r3 != r3.k()) goto L20;
        r3 r02 = this.b;
        if (r02.F == false) goto L21;
        Window.Callback r1 = r02.l.getCallback();
        if (r1 != null) goto L11;
        return true;
    L11:
        if (r02.Q == true) goto L23;
        r1.onMenuOpened(108, r3);
        return true;
    L23:
        return true;
    L21:
        return true;
    L20:
        return true;
    }
}
