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

    /* JADX INFO: renamed from: f */
    public int f9320f;

    /* JADX INFO: renamed from: g */
    public boolean f9321g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0120Cr f9322h;

    /* JADX INFO: renamed from: i */
    public AbstractC2642vr f9323i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f9324j;

    /* JADX INFO: renamed from: k */
    public final C2685wr f9325k;

    public C2728xr(Context r1, MenuC2204lr r2, View r3, boolean r4, int r5, int r6) {
        this.f9320f = 8388611;
        this.f9325k = new C2685wr(this);
        this.f9315a = r1;
        this.f9316b = r2;
        this.f9319e = r3;
        this.f9317c = r4;
        this.f9318d = r5;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2642vr m5290a() {
        if (this.f9323i != null) goto L10;
        Context r1 = this.f9315a;
        Display r0 = ((WindowManager) r1.getSystemService("window")).getDefaultDisplay();
        Point r2 = new Point();
        r0.getRealSize(r2);
        if (Math.min(r2.x, r2.y) < r1.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) goto L7;
        AbstractC2642vr r02 = new ViewOnKeyListenerC1125a7(r1, this.f9319e, this.f9318d, this.f9317c);
    L8:
        r02.mo1945l(this.f9316b);
        r02.mo1950r(this.f9325k);
        r02.mo1946n(this.f9319e);
        r02.mo216e(this.f9322h);
        r02.mo1947o(this.f9321g);
        r02.mo1948p(this.f9320f);
        this.f9323i = r02;
        goto L10
    L7:
        View r8 = this.f9319e;
        int r9 = this.f9318d;
        boolean r10 = this.f9317c;
        r02 = new ViewOnKeyListenerC1029Xy(this.f9315a, this.f9316b, r8, r9, r10);
    L10:
        return this.f9323i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5291b() {
        AbstractC2642vr r0 = this.f9323i;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.mo575a() == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo5292c() {
        this.f9323i = null;
        PopupWindow.OnDismissListener r0 = this.f9324j;
        if (r0 == null) goto L6;
        r0.onDismiss();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m5293d(int r4, int r5, boolean r6, boolean r7) {
        AbstractC2642vr r0 = m5290a();
        r0.mo1951s(r7);
        if (r6 == true) goto L5;
    L8:
        r0.mo577c();
        return;
    L5:
        if ((Gravity.getAbsoluteGravity(this.f9320f, this.f9319e.getLayoutDirection()) & 7) != 5) goto L7;
        r4 = r4 - this.f9319e.getWidth();
    L7:
        r0.mo1949q(r4);
        r0.mo1952t(r5);
        int r62 = (int) ((this.f9315a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
        r0.f9155a = new Rect(r4 - r62, r5 - r62, r4 + r62, r5 + r62);
        goto L8
    }
}
