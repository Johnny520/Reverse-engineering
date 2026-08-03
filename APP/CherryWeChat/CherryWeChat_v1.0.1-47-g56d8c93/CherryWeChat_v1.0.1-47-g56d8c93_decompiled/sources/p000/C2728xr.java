package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: xr */
/* JADX INFO: loaded from: classes.dex */
public class C2728xr {

    /* JADX INFO: renamed from: a */
    public final Context f9315a;

    /* JADX INFO: renamed from: b */
    public final MenuC2204lr f9316b;

    /* JADX INFO: renamed from: c */
    public final boolean f9317c;

    /* JADX INFO: renamed from: d */
    public final int f9318d;

    /* JADX INFO: renamed from: e */
    public View f9319e;

    /* JADX INFO: renamed from: g */
    public boolean f9321g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0120Cr f9322h;

    /* JADX INFO: renamed from: i */
    public AbstractC2642vr f9323i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f9324j;

    /* JADX INFO: renamed from: f */
    public int f9320f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C2685wr f9325k = new C2685wr(this);

    public C2728xr(Context context, MenuC2204lr menuC2204lr, View view, boolean z, int i, int i2) {
        this.f9315a = context;
        this.f9316b = menuC2204lr;
        this.f9319e = view;
        this.f9317c = z;
        this.f9318d = i;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2642vr m5290a() {
        AbstractC2642vr viewOnKeyListenerC1029Xy;
        if (this.f9323i == null) {
            Context context = this.f9315a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1029Xy = new ViewOnKeyListenerC1125a7(context, this.f9319e, this.f9318d, this.f9317c);
            } else {
                viewOnKeyListenerC1029Xy = new ViewOnKeyListenerC1029Xy(this.f9315a, this.f9316b, this.f9319e, this.f9318d, this.f9317c);
            }
            viewOnKeyListenerC1029Xy.mo1945l(this.f9316b);
            viewOnKeyListenerC1029Xy.mo1950r(this.f9325k);
            viewOnKeyListenerC1029Xy.mo1946n(this.f9319e);
            viewOnKeyListenerC1029Xy.mo216e(this.f9322h);
            viewOnKeyListenerC1029Xy.mo1947o(this.f9321g);
            viewOnKeyListenerC1029Xy.mo1948p(this.f9320f);
            this.f9323i = viewOnKeyListenerC1029Xy;
        }
        return this.f9323i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5291b() {
        AbstractC2642vr abstractC2642vr = this.f9323i;
        return abstractC2642vr != null && abstractC2642vr.mo575a();
    }

    /* JADX INFO: renamed from: c */
    public void mo5292c() {
        this.f9323i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9324j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5293d(int i, int i2, boolean z, boolean z2) {
        AbstractC2642vr abstractC2642vrM5290a = m5290a();
        abstractC2642vrM5290a.mo1951s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f9320f, this.f9319e.getLayoutDirection()) & 7) == 5) {
                i -= this.f9319e.getWidth();
            }
            abstractC2642vrM5290a.mo1949q(i);
            abstractC2642vrM5290a.mo1952t(i2);
            int i3 = (int) ((this.f9315a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC2642vrM5290a.f9155a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC2642vrM5290a.mo577c();
    }
}
