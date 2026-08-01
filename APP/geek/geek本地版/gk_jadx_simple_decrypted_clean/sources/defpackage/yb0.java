package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends a80 implements a1 {
    public static final AccelerateInterpolator U = null;
    public static final DecelerateInterpolator V = null;
    public hf A;
    public ActionBarContextView B;
    public final View C;
    public boolean D;
    public xb0 E;
    public xb0 F;
    public d4 G;
    public boolean H;
    public final ArrayList I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public xa0 O;
    public boolean P;
    public boolean Q;
    public final wb0 R;
    public final wb0 S;
    public final l0 T;
    public Context w;
    public Context x;
    public ActionBarOverlayLayout y;
    public ActionBarContainer z;

    static {
        U = new AccelerateInterpolator();
        V = new DecelerateInterpolator();
    }

    public yb0(Activity r3, boolean r4) {
        new ArrayList();
        this.I = new ArrayList();
        this.J = 0;
        this.K = true;
        this.N = true;
        this.R = new wb0(this, 0);
        this.S = new wb0(this, 1);
        this.T = new l0(29, this);
        View r32 = r3.getWindow().getDecorView();
        M(r32);
        if (r4 == true) goto L6;
        this.C = r32.findViewById(R.id.content);
        return;
    }

    public final void K(boolean r10) {
        if (r10 == false) goto L11;
        if (this.M == true) goto L16;
        this.M = true;
        ActionBarOverlayLayout r2 = this.y;
        if (r2 == null) goto L9;
        r2.setShowingForActionMode(true);
    L9:
        P(false);
    L16:
        ActionBarContainer r1 = this.z;
        WeakHashMap r22 = ja0.a;
        if (v90.c(r1) == true) goto L19;
        if (r10 == false) goto L34;
        ((k70) this.A).a.setVisibility(4);
        this.B.setVisibility(0);
        return;
    L34:
        ((k70) this.A).a.setVisibility(0);
        this.B.setVisibility(8);
        return;
    L19:
        if (r10 == false) goto L21;
        k70 r102 = (k70) this.A;
        wa0 r12 = ja0.a(r102.a);
        r12.a(0.0f);
        r12.c(100);
        r12.d(new j70(r102, 4));
        wa0 r103 = this.B.i(0, 200);
    L22:
        xa0 r0 = new xa0();
        ArrayList r23 = r0.a;
        r23.add(r12);
        View r13 = (View) r12.a.get();
        if (r13 == null) goto L25;
        long r3 = r13.animate().getDuration();
    L26:
        View r14 = (View) r103.a.get();
        if (r14 == null) goto L29;
        r14.animate().setStartDelay(r3);
    L29:
        r23.add(r103);
        r0.b();
        return;
    L25:
        r3 = 0;
        goto L26
    L21:
        k70 r104 = (k70) this.A;
        wa0 r15 = ja0.a(r104.a);
        r15.a(1.0f);
        r15.c(200);
        r15.d(new j70(r104, 0));
        r12 = this.B.i(8, 100);
        r103 = r15;
        goto L22
    L11:
        if (this.M == false) goto L16;
        this.M = false;
        ActionBarOverlayLayout r16 = this.y;
        if (r16 == null) goto L15;
        r16.setShowingForActionMode(false);
    L15:
        P(false);
        goto L16
    }

    public final Context L() {
        if (this.x != null) goto L9;
        TypedValue r0 = new TypedValue();
        this.w.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarWidgetTheme, r0, true);
        int r02 = r0.resourceId;
        if (r02 == 0) goto L7;
        this.x = new ContextThemeWrapper(this.w, r02);
        goto L9
    L7:
        this.x = this.w;
    L9:
        return this.x;
    }

    public final void M(View r7) {
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) r7.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
        this.y = r0;
        if (r0 == null) goto L5;
        r0.setActionBarVisibilityCallback(this);
    L5:
        KeyEvent.Callback r02 = r7.findViewById(com.ljx.wechatmod.R.id.action_bar);
        if ((r02 instanceof hf) == false) goto L9;
        hf r03 = (hf) r02;
    L11:
        this.A = r03;
        this.B = (ActionBarContextView) r7.findViewById(com.ljx.wechatmod.R.id.action_context_bar);
        ActionBarContainer r72 = (ActionBarContainer) r7.findViewById(com.ljx.wechatmod.R.id.action_bar_container);
        this.z = r72;
        hf r04 = this.A;
        if (r04 == null) goto L35;
        if (this.B == null) goto L35;
        if (r72 == null) goto L35;
        Context r73 = ((k70) r04).a.getContext();
        this.w = r73;
        if ((((k70) this.A).b & 4) == 0) goto L19;
        boolean r05 = true;
    L20:
        if (r05 == false) goto L22;
        this.D = true;
    L22:
        int r3 = r73.getApplicationInfo().targetSdkVersion;
        this.A.getClass();
        O(r73.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
        TypedArray r74 = this.w.obtainStyledAttributes(null, xy.a, com.ljx.wechatmod.R.attr.actionBarStyle, 0);
        if (r74.getBoolean(14, false) == false) goto L29;
        ActionBarOverlayLayout r06 = this.y;
        if (r06.h == false) goto L28;
        this.Q = true;
        r06.setHideOnContentScrollEnabled(true);
        goto L29
    L28:
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    L29:
        int r07 = r74.getDimensionPixelSize(12, 0);
        if (r07 == 0) goto L32;
        ActionBarContainer r1 = this.z;
        WeakHashMap r2 = ja0.a;
        y90.s(r1, r07);
    L32:
        r74.recycle();
        return;
    L19:
        r05 = false;
    L35:
        throw new IllegalStateException(yb0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    L9:
        if ((r02 instanceof Toolbar) == false) goto L37;
        r03 = ((Toolbar) r02).getWrapper();
        goto L11
    L37:
        if (r02 == null) goto L39;
        String r08 = r02.getClass().getSimpleName();
    L41:
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(r08));
    L39:
        r08 = "null";
        goto L41
    }

    public final void N(boolean r5) {
        if (this.D == false) goto L5;
        return;
    L5:
        if (r5 == false) goto L7;
        int r52 = 4;
    L8:
        k70 r1 = (k70) this.A;
        int r2 = r1.b;
        this.D = true;
        r1.a((r52 & 4) | (r2 & (-5)));
        return;
    L7:
        r52 = 0;
        goto L8
    }

    public final void O(boolean r2) {
        if (r2 == true) goto L5;
        ((k70) this.A).getClass();
        this.z.setTabContainer(null);
    L6:
        this.A.getClass();
        ((k70) this.A).a.setCollapsible(false);
        this.y.setHasNonEmbeddedTabs(false);
        return;
    L5:
        this.z.setTabContainer(null);
        ((k70) this.A).getClass();
        goto L6
    }

    public final void P(boolean r12) {
        boolean r0 = this.L;
        boolean r1 = this.M;
        lh r4 = null;
        l0 r6 = this.T;
        View r7 = this.C;
        if (r1 == true) goto L45;
        if (r0 == false) goto L45;
        if (this.N == false) goto L88;
        this.N = false;
        xa0 r02 = this.O;
        if (r02 == null) goto L11;
        r02.a();
    L11:
        int r03 = this.J;
        wb0 r13 = this.R;
        if (r03 == 0) goto L14;
    L42:
        r13.a();
        return;
    L14:
        if (this.P == true) goto L16;
        if (r12 == false) goto L42;
    L16:
        this.z.setAlpha(1.0f);
        this.z.setTransitioning(true);
        xa0 r04 = new xa0();
        float r5 = -this.z.getHeight();
        if (r12 == false) goto L19;
        this.z.getLocationInWindow(new int[]{0, 0});
        r5 = r5 - r12[1];
    L19:
        wa0 r122 = ja0.a(this.z);
        r122.e(r5);
        View r8 = (View) r122.a.get();
        if (r8 == null) goto L24;
        if (r6 == null) goto L23;
        r4 = new lh(r6, r8);
    L23:
        va0.a(r8.animate(), r4);
    L24:
        boolean r42 = r04.e;
        ArrayList r62 = r04.a;
        if (r42 == true) goto L28;
        r62.add(r122);
    L28:
        if (this.K == false) goto L33;
        if (r7 == null) goto L33;
        wa0 r123 = ja0.a(r7);
        r123.e(r5);
        if (r04.e == true) goto L33;
        r62.add(r123);
    L33:
        boolean r124 = r04.e;
        if (r124 == true) goto L36;
        r04.c = U;
    L36:
        if (r124 == true) goto L38;
        r04.b = 250;
    L38:
        if (r124 == true) goto L40;
        r04.d = r13;
    L40:
        this.O = r04;
        r04.b();
        return;
    L88:
        return;
    L45:
        if (this.N == true) goto L89;
        this.N = true;
        xa0 r05 = this.O;
        if (r05 == null) goto L49;
        r05.a();
    L49:
        this.z.setVisibility(0);
        int r06 = this.J;
        wb0 r14 = this.S;
        if (r06 == 0) goto L52;
    L79:
        this.z.setAlpha(1.0f);
        this.z.setTranslationY(0.0f);
        if (this.K == false) goto L83;
        if (r7 == null) goto L83;
        r7.setTranslationY(0.0f);
    L83:
        r14.a();
    L84:
        ActionBarOverlayLayout r125 = this.y;
        if (r125 == null) goto L90;
        WeakHashMap r07 = ja0.a;
        w90.c(r125);
        return;
    L90:
        return;
    L52:
        if (this.P == true) goto L54;
        if (r12 == false) goto L79;
    L54:
        this.z.setTranslationY(0.0f);
        float r08 = -this.z.getHeight();
        if (r12 == false) goto L57;
        this.z.getLocationInWindow(new int[]{0, 0});
        r08 = r08 - r12[1];
    L57:
        this.z.setTranslationY(r08);
        xa0 r126 = new xa0();
        wa0 r52 = ja0.a(this.z);
        r52.e(0.0f);
        View r82 = (View) r52.a.get();
        if (r82 == null) goto L62;
        if (r6 == null) goto L61;
        r4 = new lh(r6, r82);
    L61:
        va0.a(r82.animate(), r4);
    L62:
        boolean r43 = r126.e;
        ArrayList r63 = r126.a;
        if (r43 == true) goto L66;
        r63.add(r52);
    L66:
        if (this.K == false) goto L71;
        if (r7 == null) goto L71;
        r7.setTranslationY(r08);
        wa0 r09 = ja0.a(r7);
        r09.e(0.0f);
        if (r126.e == true) goto L71;
        r63.add(r09);
    L71:
        boolean r010 = r126.e;
        if (r010 == true) goto L74;
        r126.c = V;
    L74:
        if (r010 == true) goto L76;
        r126.b = 250;
    L76:
        if (r010 == true) goto L78;
        r126.d = r14;
    L78:
        this.O = r126;
        r126.b();
        goto L84
    }

    public yb0(Dialog r3) {
        new ArrayList();
        this.I = new ArrayList();
        this.J = 0;
        this.K = true;
        this.N = true;
        this.R = new wb0(this, 0);
        this.S = new wb0(this, 1);
        this.T = new l0(29, this);
        M(r3.getWindow().getDecorView());
    }
}
