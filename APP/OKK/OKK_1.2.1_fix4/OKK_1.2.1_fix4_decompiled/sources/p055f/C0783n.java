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

    /* JADX INFO: renamed from: h */
    public boolean f2842h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0784o f2843i;

    /* JADX INFO: renamed from: j */
    public AbstractC0781l f2844j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f2845k;

    /* JADX INFO: renamed from: g */
    public int f2841g = 8388611;

    /* JADX INFO: renamed from: l */
    public final C0782m f2846l = new C0782m(this);

    public C0783n(int i2, int i3, Context context, View view, MenuC0779j menuC0779j, boolean z2) {
        this.f2835a = context;
        this.f2836b = menuC0779j;
        this.f2840f = view;
        this.f2837c = z2;
        this.f2838d = i2;
        this.f2839e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0781l m2026a() {
        AbstractC0781l viewOnKeyListenerC0788s;
        if (this.f2844j == null) {
            Context context = this.f2835a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(C1031R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0788s = new ViewOnKeyListenerC0775f(this.f2835a, this.f2840f, this.f2838d, this.f2839e, this.f2837c);
            } else {
                View view = this.f2840f;
                int i2 = this.f2839e;
                boolean z2 = this.f2837c;
                viewOnKeyListenerC0788s = new ViewOnKeyListenerC0788s(this.f2838d, i2, this.f2835a, view, this.f2836b, z2);
            }
            viewOnKeyListenerC0788s.mo1984l(this.f2836b);
            viewOnKeyListenerC0788s.mo1989r(this.f2846l);
            viewOnKeyListenerC0788s.mo1985n(this.f2840f);
            viewOnKeyListenerC0788s.mo1982j(this.f2843i);
            viewOnKeyListenerC0788s.mo1986o(this.f2842h);
            viewOnKeyListenerC0788s.mo1987p(this.f2841g);
            this.f2844j = viewOnKeyListenerC0788s;
        }
        return this.f2844j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2027b() {
        AbstractC0781l abstractC0781l = this.f2844j;
        return abstractC0781l != null && abstractC0781l.mo1978d();
    }

    /* JADX INFO: renamed from: c */
    public void mo2028c() {
        this.f2844j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2845k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2029d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC0781l abstractC0781lM2026a = m2026a();
        abstractC0781lM2026a.mo1990s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2841g, this.f2840f.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2840f.getWidth();
            }
            abstractC0781lM2026a.mo1988q(i2);
            abstractC0781lM2026a.mo1991t(i3);
            int i4 = (int) ((this.f2835a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0781lM2026a.f2833a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        abstractC0781lM2026a.mo1980f();
    }
}
