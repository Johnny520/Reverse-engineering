package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: wu */
/* JADX INFO: loaded from: classes.dex */
public class C0869wu {

    /* JADX INFO: renamed from: a */
    public final Context f5023a;

    /* JADX INFO: renamed from: b */
    public final MenuC0424ku f5024b;

    /* JADX INFO: renamed from: c */
    public final boolean f5025c;

    /* JADX INFO: renamed from: d */
    public final int f5026d;

    /* JADX INFO: renamed from: e */
    public View f5027e;

    /* JADX INFO: renamed from: g */
    public boolean f5029g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0128cv f5030h;

    /* JADX INFO: renamed from: i */
    public AbstractC0758tu f5031i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f5032j;

    /* JADX INFO: renamed from: f */
    public int f5028f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C0795uu f5033k = new C0795uu(this);

    public C0869wu(Context context, MenuC0424ku menuC0424ku, View view, boolean z, int i, int i2) {
        this.f5023a = context;
        this.f5024b = menuC0424ku;
        this.f5027e = view;
        this.f5025c = z;
        this.f5026d = i;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0758tu m2599a() {
        AbstractC0758tu q40Var;
        if (this.f5031i == null) {
            Context context = this.f5023a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0832vu.m2525a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                q40Var = new ViewOnKeyListenerC0736t8(context, this.f5027e, this.f5026d, this.f5025c);
            } else {
                q40Var = new q40(this.f5023a, this.f5024b, this.f5027e, this.f5026d, this.f5025c);
            }
            q40Var.mo2142l(this.f5024b);
            q40Var.mo2147r(this.f5033k);
            q40Var.mo2143n(this.f5027e);
            q40Var.mo952e(this.f5030h);
            q40Var.mo2144o(this.f5029g);
            q40Var.mo2145p(this.f5028f);
            this.f5031i = q40Var;
        }
        return this.f5031i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2600b() {
        AbstractC0758tu abstractC0758tu = this.f5031i;
        return abstractC0758tu != null && abstractC0758tu.mo1705b();
    }

    /* JADX INFO: renamed from: c */
    public void mo1131c() {
        this.f5031i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5032j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2601d(int i, int i2, boolean z, boolean z2) {
        AbstractC0758tu abstractC0758tuM2599a = m2599a();
        abstractC0758tuM2599a.mo2148s(z2);
        if (z) {
            int i3 = this.f5028f;
            View view = this.f5027e;
            WeakHashMap weakHashMap = ja0.f2600a;
            if ((Gravity.getAbsoluteGravity(i3, t90.m2367d(view)) & 7) == 5) {
                i -= this.f5027e.getWidth();
            }
            abstractC0758tuM2599a.mo2146q(i);
            abstractC0758tuM2599a.mo2149t(i2);
            int i4 = (int) ((this.f5023a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0758tuM2599a.f4619a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC0758tuM2599a.mo1708f();
    }
}
