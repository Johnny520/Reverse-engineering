package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: wB */
/* JADX INFO: loaded from: classes.dex */
public final class C2663wB implements InterfaceC0492Lc {

    /* JADX INFO: renamed from: a */
    public final Toolbar f9213a;

    /* JADX INFO: renamed from: b */
    public int f9214b;

    /* JADX INFO: renamed from: c */
    public final View f9215c;

    /* JADX INFO: renamed from: d */
    public Drawable f9216d;

    /* JADX INFO: renamed from: e */
    public Drawable f9217e;

    /* JADX INFO: renamed from: f */
    public final Drawable f9218f;

    /* JADX INFO: renamed from: g */
    public final boolean f9219g;

    /* JADX INFO: renamed from: h */
    public CharSequence f9220h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f9221i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f9222j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f9223k;

    /* JADX INFO: renamed from: l */
    public boolean f9224l;

    /* JADX INFO: renamed from: m */
    public C0130D0 f9225m;

    /* JADX INFO: renamed from: n */
    public final int f9226n;

    /* JADX INFO: renamed from: o */
    public final Drawable f9227o;

    public C2663wB(Toolbar r8, boolean r9) {
        this.f9226n = 0;
        this.f9213a = r8;
        this.f9220h = r8.getTitle();
        this.f9221i = r8.getSubtitle();
        if (this.f9220h == null) goto L5;
        boolean r1 = true;
    L6:
        this.f9219g = r1;
        this.f9218f = r8.getNavigationIcon();
        String r5 = null;
        C2656w4 r12 = C2656w4.m5186A(r8.getContext(), null, AbstractC0982Wu.f3066a, R.attr.actionBarStyle);
        TypedArray r3 = (TypedArray) r12.f9196b;
        int r4 = 15;
        this.f9227o = r12.m5210q(15);
        if (r9 == false) goto L68;
        CharSequence r92 = r3.getText(27);
        if (TextUtils.isEmpty(r92) == true) goto L15;
        this.f9219g = true;
        this.f9220h = r92;
        if ((this.f9214b & 8) == 0) goto L15;
        r8.setTitle(r92);
        if (this.f9219g == false) goto L15;
        AbstractC2185lE.m4400m(r8.getRootView(), r92);
    L15:
        CharSequence r93 = r3.getText(25);
        if (TextUtils.isEmpty(r93) == true) goto L20;
        this.f9221i = r93;
        if ((this.f9214b & 8) == 0) goto L20;
        r8.setSubtitle(r93);
    L20:
        Drawable r94 = r12.m5210q(20);
        if (r94 == null) goto L23;
        this.f9217e = r94;
        m5230c();
    L23:
        Drawable r95 = r12.m5210q(17);
        if (r95 == null) goto L27;
        this.f9216d = r95;
        m5230c();
    L27:
        if (this.f9218f != null) goto L34;
        Drawable r96 = this.f9227o;
        if (r96 == null) goto L34;
        this.f9218f = r96;
        if ((this.f9214b & 4) == 0) goto L33;
        r8.setNavigationIcon(r96);
        goto L34
    L33:
        r8.setNavigationIcon(null);
    L34:
        m5228a(r3.getInt(10, 0));
        int r97 = r3.getResourceId(9, 0);
        if (r97 == 0) goto L47;
        View r98 = LayoutInflater.from(r8.getContext()).inflate(r97, r8, false);
        View r2 = this.f9215c;
        if (r2 != null) goto L39;
    L41:
        this.f9215c = r98;
        if (r98 != null) goto L44;
    L46:
        m5228a(this.f9214b | 16);
        goto L47
    L44:
        if ((this.f9214b & 16) == 0) goto L46;
        r8.addView(r98);
        goto L46
    L39:
        if ((this.f9214b & 16) == 0) goto L41;
        r8.removeView(r2);
    L47:
        int r99 = r3.getLayoutDimension(13, 0);
        if (r99 <= 0) goto L50;
        ViewGroup.LayoutParams r22 = r8.getLayoutParams();
        r22.height = r99;
        r8.setLayoutParams(r22);
    L50:
        int r910 = r3.getDimensionPixelOffset(7, -1);
        int r23 = r3.getDimensionPixelOffset(3, -1);
        if (r910 >= 0) goto L53;
        if (r23 >= 0) goto L53;
    L54:
        int r911 = r3.getResourceId(28, 0);
        if (r911 == 0) goto L59;
        Context r24 = r8.getContext();
        r8.f3834l = r911;
        C2304o4 r42 = r8.f3824b;
        if (r42 == null) goto L59;
        r42.setTextAppearance(r24, r911);
    L59:
        int r912 = r3.getResourceId(26, 0);
        if (r912 == 0) goto L64;
        Context r25 = r8.getContext();
        r8.f3835m = r912;
        C2304o4 r43 = r8.f3825c;
        if (r43 == null) goto L64;
        r43.setTextAppearance(r25, r912);
    L64:
        int r913 = r3.getResourceId(22, 0);
        if (r913 == 0) goto L72;
        r8.setPopupTheme(r913);
    L72:
        r12.m5195E();
        if (R.string.abc_action_bar_up_description == this.f9226n) goto L82;
        this.f9226n = R.string.abc_action_bar_up_description;
        if (TextUtils.isEmpty(r8.getNavigationContentDescription()) == false) goto L82;
        int r914 = this.f9226n;
        if (r914 == 0) goto L81;
        r5 = r8.getContext().getString(r914);
    L81:
        this.f9222j = r5;
        m5229b();
    L82:
        this.f9222j = r8.getNavigationContentDescription();
        r8.setNavigationOnClickListener(new ViewOnClickListenerC0334Hq(this));
        return;
    L53:
        int r915 = Math.max(r910, 0);
        int r26 = Math.max(r23, 0);
        r8.m2104d();
        r8.f3842t.m1510a(r915, r26);
        goto L54
    L68:
        if (r8.getNavigationIcon() == null) goto L70;
        this.f9227o = r8.getNavigationIcon();
    L71:
        this.f9214b = r4;
        goto L72
    L70:
        r4 = 11;
        goto L71
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final void m5228a(int r5) {
        int r0 = this.f9214b ^ r5;
        this.f9214b = r5;
        if (r0 == 0) goto L36;
        int r1 = r0 & 4;
        Toolbar r3 = this.f9213a;
        if (r1 == 0) goto L18;
        if ((r5 & 4) == 0) goto L10;
        m5229b();
    L10:
        if ((this.f9214b & 4) == 0) goto L16;
        Drawable r12 = this.f9218f;
        if (r12 != null) goto L15;
        r12 = this.f9227o;
    L15:
        r3.setNavigationIcon(r12);
        goto L18
    L16:
        r3.setNavigationIcon(null);
    L18:
        if ((r0 & 3) == 0) goto L21;
        m5230c();
    L21:
        if ((r0 & 8) == 0) goto L27;
        if ((r5 & 8) == 0) goto L25;
        r3.setTitle(this.f9220h);
        r3.setSubtitle(this.f9221i);
        goto L27
    L25:
        r3.setTitle(null);
        r3.setSubtitle(null);
    L27:
        if ((r0 & 16) == 0) goto L37;
        View r02 = this.f9215c;
        if (r02 != null) goto L31;
        return;
    L31:
        if ((r5 & 16) == 0) goto L34;
        r3.addView(r02);
        return;
    L34:
        r3.removeView(r02);
        return;
    L37:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m5229b() {
        if ((this.f9214b & 4) == 0) goto L10;
        boolean r0 = TextUtils.isEmpty(this.f9222j);
        Toolbar r1 = this.f9213a;
        if (r0 == false) goto L8;
        r1.setNavigationContentDescription(this.f9226n);
        return;
    L8:
        r1.setNavigationContentDescription(this.f9222j);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m5230c() {
        int r0 = this.f9214b;
        if ((r0 & 2) != 0) goto L5;
        Drawable r02 = null;
    L12:
        this.f9213a.setLogo(r02);
        return;
    L5:
        if ((r0 & 1) == 0) goto L10;
        r02 = this.f9217e;
        if (r02 != null) goto L12;
        r02 = this.f9216d;
        goto L12
    L10:
        r02 = this.f9216d;
        goto L12
    }
}
