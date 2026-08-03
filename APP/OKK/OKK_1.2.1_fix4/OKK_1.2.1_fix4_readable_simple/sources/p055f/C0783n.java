package p055f;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: f.n */
/* JADX INFO: loaded from: classes.dex */
public class C0783n {

    /* JADX INFO: renamed from: a */
    public final Context f2835a;

    /* JADX INFO: renamed from: b */
    public final MenuC0779j f2836b;

    /* JADX INFO: renamed from: c */
    public final boolean f2837c;

    /* JADX INFO: renamed from: d */
    public final int f2838d;

    /* JADX INFO: renamed from: e */
    public final int f2839e;

    /* JADX INFO: renamed from: f */
    public View f2840f;

    /* JADX INFO: renamed from: g */
    public int f2841g;

    /* JADX INFO: renamed from: h */
    public boolean f2842h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0784o f2843i;

    /* JADX INFO: renamed from: j */
    public AbstractC0781l f2844j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f2845k;

    /* JADX INFO: renamed from: l */
    public final C0782m f2846l;

    public C0783n(int r2, int r3, Context r4, View r5, MenuC0779j r6, boolean r7) {
        this.f2841g = 8388611;
        this.f2846l = new C0782m(this);
        this.f2835a = r4;
        this.f2836b = r6;
        this.f2840f = r5;
        this.f2837c = r7;
        this.f2838d = r2;
        this.f2839e = r3;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0781l m2026a() {
        if (this.f2844j != null) goto L10;
        Context r1 = this.f2835a;
        Display r02 = ((WindowManager) r1.getSystemService("window")).getDefaultDisplay();
        Point r2 = new Point();
        r02.getRealSize(r2);
        if (Math.min(r2.x, r2.y) < r1.getResources().getDimensionPixelSize(C1031R.dimen.abc_cascading_menus_min_smallest_width)) goto L7;
        View r4 = this.f2840f;
        int r6 = this.f2839e;
        boolean r7 = this.f2837c;
        AbstractC0781l r03 = new ViewOnKeyListenerC0775f(this.f2835a, r4, this.f2838d, r6, r7);
    L8:
        r03.mo1984l(this.f2836b);
        r03.mo1989r(this.f2846l);
        r03.mo1985n(this.f2840f);
        r03.mo1982j(this.f2843i);
        r03.mo1986o(this.f2842h);
        r03.mo1987p(this.f2841g);
        this.f2844j = r03;
        goto L10
    L7:
        View r12 = this.f2840f;
        int r10 = this.f2839e;
        boolean r14 = this.f2837c;
        Context r11 = this.f2835a;
        MenuC0779j r13 = this.f2836b;
        r03 = new ViewOnKeyListenerC0788s(this.f2838d, r10, r11, r12, r13, r14);
    L10:
        return this.f2844j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2027b() {
        AbstractC0781l r02 = this.f2844j;
        if (r02 != null) goto L5;
    L7:
        return false;
    L5:
        if (r02.mo1978d() == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo2028c() {
        this.f2844j = null;
        PopupWindow.OnDismissListener r02 = this.f2845k;
        if (r02 == null) goto L6;
        r02.onDismiss();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m2029d(int r4, int r5, boolean r6, boolean r7) {
        AbstractC0781l r02 = m2026a();
        r02.mo1990s(r7);
        if (r6 == true) goto L5;
    L8:
        r02.mo1980f();
        return;
    L5:
        if ((Gravity.getAbsoluteGravity(this.f2841g, this.f2840f.getLayoutDirection()) & 7) != 5) goto L7;
        r4 = r4 - this.f2840f.getWidth();
    L7:
        r02.mo1988q(r4);
        r02.mo1991t(r5);
        int r62 = (int) ((this.f2835a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
        r02.f2833a = new Rect(r4 - r62, r5 - r62, r4 + r62, r5 + r62);
        goto L8
    }
}
