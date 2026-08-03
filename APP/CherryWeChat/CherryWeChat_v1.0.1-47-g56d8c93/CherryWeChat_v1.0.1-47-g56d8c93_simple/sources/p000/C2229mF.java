package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
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

/* JADX INFO: renamed from: mF */
/* JADX INFO: loaded from: classes.dex */
public final class C2229mF extends AbstractC2257n0 implements InterfaceC2523t0 {

    /* JADX INFO: renamed from: A */
    public static final DecelerateInterpolator f7770A = null;

    /* JADX INFO: renamed from: z */
    public static final AccelerateInterpolator f7771z = null;

    /* JADX INFO: renamed from: a */
    public Context f7772a;

    /* JADX INFO: renamed from: b */
    public Context f7773b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f7774c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f7775d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0492Lc f7776e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f7777f;

    /* JADX INFO: renamed from: g */
    public final View f7778g;

    /* JADX INFO: renamed from: h */
    public boolean f7779h;

    /* JADX INFO: renamed from: i */
    public C2186lF f7780i;

    /* JADX INFO: renamed from: j */
    public C2186lF f7781j;

    /* JADX INFO: renamed from: k */
    public C0649P3 f7782k;

    /* JADX INFO: renamed from: l */
    public boolean f7783l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f7784m;

    /* JADX INFO: renamed from: n */
    public int f7785n;

    /* JADX INFO: renamed from: o */
    public boolean f7786o;

    /* JADX INFO: renamed from: p */
    public boolean f7787p;

    /* JADX INFO: renamed from: q */
    public boolean f7788q;

    /* JADX INFO: renamed from: r */
    public boolean f7789r;

    /* JADX INFO: renamed from: s */
    public boolean f7790s;

    /* JADX INFO: renamed from: t */
    public C0316HE f7791t;

    /* JADX INFO: renamed from: u */
    public boolean f7792u;

    /* JADX INFO: renamed from: v */
    public boolean f7793v;

    /* JADX INFO: renamed from: w */
    public final C2138kF f7794w;

    /* JADX INFO: renamed from: x */
    public final C2138kF f7795x;

    /* JADX INFO: renamed from: y */
    public final C1017Xm f7796y;

    static {
        f7771z = new AccelerateInterpolator();
        f7770A = new DecelerateInterpolator();
    }

    public C2229mF(Activity r3, boolean r4) {
        new ArrayList();
        this.f7784m = new ArrayList();
        this.f7785n = 0;
        this.f7786o = true;
        this.f7790s = true;
        this.f7794w = new C2138kF(this, 0);
        this.f7795x = new C2138kF(this, 1);
        this.f7796y = new C1017Xm(19, this);
        View r32 = r3.getWindow().getDecorView();
        m4514r(r32);
        if (r4 == true) goto L6;
        this.f7778g = r32.findViewById(R.id.content);
        return;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: b */
    public final boolean mo4502b() {
        InterfaceC0492Lc r0 = this.f7776e;
        if (r0 == null) goto L16;
        C2354pB r1 = ((C2663wB) r0).f9213a.f3815M;
        if (r1 != null) goto L7;
        return false;
    L7:
        if (r1.f8238b == null) goto L20;
        C2354pB r02 = ((C2663wB) r0).f9213a.f3815M;
        if (r02 != null) goto L11;
        C2427qr r03 = null;
    L12:
        if (r03 == null) goto L18;
        r03.collapseActionView();
        return true;
    L18:
        return true;
    L11:
        r03 = r02.f8238b;
        goto L12
    L20:
        return false;
    L16:
        return false;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: c */
    public final void mo4503c(boolean r2) {
        if (r2 == this.f7783l) goto L10;
        this.f7783l = r2;
        ArrayList r22 = this.f7784m;
        if (r22.size() > 0) goto L8;
        return;
    L8:
        r22.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: d */
    public final int mo4504d() {
        return ((C2663wB) this.f7776e).f9214b;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: e */
    public final Context mo4505e() {
        if (this.f7773b != null) goto L9;
        TypedValue r0 = new TypedValue();
        this.f7772a.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, r0, true);
        int r02 = r0.resourceId;
        if (r02 == 0) goto L7;
        this.f7773b = new ContextThemeWrapper(this.f7772a, r02);
        goto L9
    L7:
        this.f7773b = this.f7772a;
    L9:
        return this.f7773b;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: f */
    public final void mo4506f() {
        if (this.f7787p == true) goto L6;
        this.f7787p = true;
        m4516t(false);
        return;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: h */
    public final void mo4507h() {
        m4515s(this.f7772a.getResources().getBoolean(io.github.cherrywechat.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: j */
    public final boolean mo4508j(int r5, KeyEvent r6) {
        C2186lF r0 = this.f7780i;
        if (r0 == null) goto L13;
        MenuC2204lr r02 = r0.f7624d;
        if (r02 == null) goto L13;
        boolean r3 = true;
        if (KeyCharacterMap.load(r6.getDeviceId()).getKeyboardType() != 1) goto L11;
        r3 = false;
    L11:
        r02.setQwertyMode(r3);
        return r02.performShortcut(r5, r6, 0);
    L13:
        return false;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: m */
    public final void mo4509m(boolean r5) {
        if (this.f7779h == false) goto L5;
        return;
    L5:
        if (r5 == false) goto L7;
        int r52 = 4;
    L8:
        C2663wB r1 = (C2663wB) this.f7776e;
        int r2 = r1.f9214b;
        this.f7779h = true;
        r1.m5228a((r52 & 4) | (r2 & (-5)));
        return;
    L7:
        r52 = 0;
        goto L8
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: n */
    public final void mo4510n(boolean r1) {
        this.f7792u = r1;
        if (r1 == true) goto L8;
        C0316HE r12 = this.f7791t;
        if (r12 == null) goto L9;
        r12.m668a();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: o */
    public final void mo4511o(CharSequence r4) {
        C2663wB r0 = (C2663wB) this.f7776e;
        if (r0.f9219g == true) goto L10;
        Toolbar r1 = r0.f9213a;
        r0.f9220h = r4;
        if ((r0.f9214b & 8) == 0) goto L11;
        r1.setTitle(r4);
        if (r0.f9219g == false) goto L12;
        AbstractC2185lE.m4400m(r1.getRootView(), r4);
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: p */
    public final AbstractC0345I0 mo4512p(C0649P3 r3) {
        C2186lF r0 = this.f7780i;
        if (r0 == null) goto L5;
        r0.mo735a();
    L5:
        this.f7774c.setHideOnContentScrollEnabled(false);
        this.f7777f.m2081e();
        C2186lF r02 = new C2186lF(this, this.f7777f.getContext(), r3);
        MenuC2204lr r32 = r02.f7624d;
        r32.m4442w();
        boolean r1 = ((InterfaceC0302H0) r02.f7625e.f2089b).mo642b(r02, r32);     // Catch: Throwable -> L13
        r32.m4441v();
        if (r1 == false) goto L11;
        this.f7780i = r02;
        r02.mo741h();
        this.f7777f.m2079c(r02);
        m4513q(true);
        return r02;
    L11:
        return null;
    L13:
        th = move-exception;
        r32.m4441v();
        throw th;
    }

    /* JADX INFO: renamed from: q */
    public final void m4513q(boolean r10) {
        if (r10 == false) goto L11;
        if (this.f7789r == true) goto L17;
        this.f7789r = true;
        ActionBarOverlayLayout r2 = this.f7774c;
        if (r2 == null) goto L9;
        r2.setShowingForActionMode(true);
    L9:
        m4516t(false);
    L17:
        if (this.f7775d.isLaidOut() == true) goto L19;
        if (r10 == false) goto L34;
        ((C2663wB) this.f7776e).f9213a.setVisibility(4);
        this.f7777f.setVisibility(0);
        return;
    L34:
        ((C2663wB) this.f7776e).f9213a.setVisibility(0);
        this.f7777f.setVisibility(8);
        return;
    L19:
        if (r10 == false) goto L21;
        C2663wB r102 = (C2663wB) this.f7776e;
        C0273GE r1 = AbstractC2185lE.m4388a(r102.f9213a);
        r1.m553a(0.0f);
        r1.m555c(100);
        r1.m556d(new C2620vB(r102, 4));
        C0273GE r103 = this.f7777f.m2083i(0, 200);
    L22:
        C0316HE r0 = new C0316HE();
        ArrayList r22 = r0.f1037a;
        r22.add(r1);
        View r12 = (View) r1.f890a.get();
        if (r12 == null) goto L25;
        long r3 = r12.animate().getDuration();
    L26:
        View r13 = (View) r103.f890a.get();
        if (r13 == null) goto L29;
        r13.animate().setStartDelay(r3);
    L29:
        r22.add(r103);
        r0.m669b();
        return;
    L25:
        r3 = 0;
        goto L26
    L21:
        C2663wB r104 = (C2663wB) this.f7776e;
        C0273GE r14 = AbstractC2185lE.m4388a(r104.f9213a);
        r14.m553a(1.0f);
        r14.m555c(200);
        r14.m556d(new C2620vB(r104, 0));
        r1 = this.f7777f.m2083i(8, 100);
        r103 = r14;
        goto L22
    L11:
        if (this.f7789r == false) goto L17;
        this.f7789r = false;
        ActionBarOverlayLayout r15 = this.f7774c;
        if (r15 == null) goto L15;
        r15.setShowingForActionMode(false);
    L15:
        m4516t(false);
        goto L17
    }

    /* JADX INFO: renamed from: r */
    public final void m4514r(View r7) {
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) r7.findViewById(io.github.cherrywechat.R.id.decor_content_parent);
        this.f7774c = r0;
        if (r0 == null) goto L5;
        r0.setActionBarVisibilityCallback(this);
    L5:
        KeyEvent.Callback r02 = r7.findViewById(io.github.cherrywechat.R.id.action_bar);
        if ((r02 instanceof InterfaceC0492Lc) == false) goto L9;
        InterfaceC0492Lc r03 = (InterfaceC0492Lc) r02;
    L11:
        this.f7776e = r03;
        this.f7777f = (ActionBarContextView) r7.findViewById(io.github.cherrywechat.R.id.action_context_bar);
        ActionBarContainer r72 = (ActionBarContainer) r7.findViewById(io.github.cherrywechat.R.id.action_bar_container);
        this.f7775d = r72;
        InterfaceC0492Lc r04 = this.f7776e;
        if (r04 == null) goto L35;
        if (this.f7777f == null) goto L35;
        if (r72 == null) goto L35;
        Context r73 = ((C2663wB) r04).f9213a.getContext();
        this.f7772a = r73;
        if ((((C2663wB) this.f7776e).f9214b & 4) == 0) goto L19;
        boolean r05 = true;
    L20:
        if (r05 == false) goto L22;
        this.f7779h = true;
    L22:
        int r3 = r73.getApplicationInfo().targetSdkVersion;
        this.f7776e.getClass();
        m4515s(r73.getResources().getBoolean(io.github.cherrywechat.R.bool.abc_action_bar_embed_tabs));
        TypedArray r74 = this.f7772a.obtainStyledAttributes(null, AbstractC0982Wu.f3066a, io.github.cherrywechat.R.attr.actionBarStyle, 0);
        if (r74.getBoolean(14, false) == false) goto L29;
        ActionBarOverlayLayout r06 = this.f7774c;
        if (r06.f3756g == false) goto L28;
        this.f7793v = true;
        r06.setHideOnContentScrollEnabled(true);
        goto L29
    L28:
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    L29:
        int r07 = r74.getDimensionPixelSize(12, 0);
        if (r07 == 0) goto L32;
        ActionBarContainer r1 = this.f7775d;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2639k(r1, r07);
    L32:
        r74.recycle();
        return;
    L19:
        r05 = false;
    L35:
        throw new IllegalStateException(C2229mF.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
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

    /* JADX INFO: renamed from: s */
    public final void m4515s(boolean r2) {
        if (r2 == true) goto L5;
        ((C2663wB) this.f7776e).getClass();
        this.f7775d.setTabContainer(null);
    L6:
        this.f7776e.getClass();
        ((C2663wB) this.f7776e).f9213a.setCollapsible(false);
        this.f7774c.setHasNonEmbeddedTabs(false);
        return;
    L5:
        this.f7775d.setTabContainer(null);
        ((C2663wB) this.f7776e).getClass();
        goto L6
    }

    /* JADX INFO: renamed from: t */
    public final void m4516t(boolean r12) {
        boolean r0 = this.f7787p;
        boolean r1 = this.f7788q;
        boolean r2 = this.f7789r;
        C0733R2 r5 = null;
        C1017Xm r7 = this.f7796y;
        View r8 = this.f7778g;
        if (r2 == true) goto L9;
        if (r0 == true) goto L53;
        if (r1 == false) goto L9;
    L53:
        if (this.f7790s == false) goto L92;
        this.f7790s = false;
        C0316HE r02 = this.f7791t;
        if (r02 == null) goto L57;
        r02.m668a();
    L57:
        int r03 = this.f7785n;
        C2138kF r13 = this.f7794w;
        if (r03 == 0) goto L60;
    L88:
        r13.mo796c();
        return;
    L60:
        if (this.f7792u == true) goto L62;
        if (r12 == false) goto L88;
    L62:
        this.f7775d.setAlpha(1.0f);
        this.f7775d.setTransitioning(true);
        C0316HE r04 = new C0316HE();
        float r22 = -this.f7775d.getHeight();
        if (r12 == false) goto L65;
        this.f7775d.getLocationInWindow(new int[]{0, 0});
        r22 = r22 - r12[1];
    L65:
        C0273GE r122 = AbstractC2185lE.m4388a(this.f7775d);
        r122.m557e(r22);
        View r6 = (View) r122.f890a.get();
        if (r6 == null) goto L70;
        if (r7 == null) goto L69;
        r5 = new C0733R2(r7, r6);
    L69:
        r6.animate().setUpdateListener(r5);
    L70:
        boolean r52 = r04.f1041e;
        ArrayList r62 = r04.f1037a;
        if (r52 == true) goto L74;
        r62.add(r122);
    L74:
        if (this.f7786o == false) goto L79;
        if (r8 == null) goto L79;
        C0273GE r123 = AbstractC2185lE.m4388a(r8);
        r123.m557e(r22);
        if (r04.f1041e == true) goto L79;
        r62.add(r123);
    L79:
        boolean r124 = r04.f1041e;
        if (r124 == true) goto L82;
        r04.f1039c = f7771z;
    L82:
        if (r124 == true) goto L84;
        r04.f1038b = 250;
    L84:
        if (r124 == true) goto L86;
        r04.f1040d = r13;
    L86:
        this.f7791t = r04;
        r04.m669b();
        return;
    L92:
        return;
    L9:
        if (this.f7790s == true) goto L90;
        this.f7790s = true;
        C0316HE r05 = this.f7791t;
        if (r05 == null) goto L13;
        r05.m668a();
    L13:
        this.f7775d.setVisibility(0);
        int r06 = this.f7785n;
        C2138kF r14 = this.f7795x;
        if (r06 == 0) goto L16;
    L43:
        this.f7775d.setAlpha(1.0f);
        this.f7775d.setTranslationY(0.0f);
        if (this.f7786o == false) goto L47;
        if (r8 == null) goto L47;
        r8.setTranslationY(0.0f);
    L47:
        r14.mo796c();
    L48:
        ActionBarOverlayLayout r125 = this.f7774c;
        if (r125 == null) goto L91;
        WeakHashMap r07 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r125);
        return;
    L91:
        return;
    L16:
        if (this.f7792u == true) goto L18;
        if (r12 == false) goto L43;
    L18:
        this.f7775d.setTranslationY(0.0f);
        float r08 = -this.f7775d.getHeight();
        if (r12 == false) goto L21;
        this.f7775d.getLocationInWindow(new int[]{0, 0});
        r08 = r08 - r12[1];
    L21:
        this.f7775d.setTranslationY(r08);
        C0316HE r126 = new C0316HE();
        C0273GE r63 = AbstractC2185lE.m4388a(this.f7775d);
        r63.m557e(0.0f);
        View r9 = (View) r63.f890a.get();
        if (r9 == null) goto L26;
        if (r7 == null) goto L25;
        r5 = new C0733R2(r7, r9);
    L25:
        r9.animate().setUpdateListener(r5);
    L26:
        boolean r53 = r126.f1041e;
        ArrayList r72 = r126.f1037a;
        if (r53 == true) goto L30;
        r72.add(r63);
    L30:
        if (this.f7786o == false) goto L35;
        if (r8 == null) goto L35;
        r8.setTranslationY(r08);
        C0273GE r09 = AbstractC2185lE.m4388a(r8);
        r09.m557e(0.0f);
        if (r126.f1041e == true) goto L35;
        r72.add(r09);
    L35:
        boolean r010 = r126.f1041e;
        if (r010 == true) goto L38;
        r126.f1039c = f7770A;
    L38:
        if (r010 == true) goto L40;
        r126.f1038b = 250;
    L40:
        if (r010 == true) goto L42;
        r126.f1040d = r14;
    L42:
        this.f7791t = r126;
        r126.m669b();
        goto L48
    }

    public C2229mF(Dialog r3) {
        new ArrayList();
        this.f7784m = new ArrayList();
        this.f7785n = 0;
        this.f7786o = true;
        this.f7790s = true;
        this.f7794w = new C2138kF(this, 0);
        this.f7795x = new C2138kF(this, 1);
        this.f7796y = new C1017Xm(19, this);
        m4514r(r3.getWindow().getDecorView());
    }
}
