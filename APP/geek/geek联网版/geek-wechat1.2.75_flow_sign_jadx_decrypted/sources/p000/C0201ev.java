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

/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes.dex */
public class C0201ev {

    /* JADX INFO: renamed from: a */
    public final Context f1661a;

    /* JADX INFO: renamed from: b */
    public final MenuC0646qu f1662b;

    /* JADX INFO: renamed from: c */
    public final boolean f1663c;

    /* JADX INFO: renamed from: d */
    public final int f1664d;

    /* JADX INFO: renamed from: e */
    public View f1665e;

    /* JADX INFO: renamed from: g */
    public boolean f1667g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0425kv f1668h;

    /* JADX INFO: renamed from: i */
    public AbstractC0082bv f1669i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f1670j;

    /* JADX INFO: renamed from: f */
    public int f1666f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C0128cv f1671k = new C0128cv(this);

    public C0201ev(Context context, MenuC0646qu menuC0646qu, View view, boolean z, int i, int i2) {
        this.f1661a = context;
        this.f1662b = menuC0646qu;
        this.f1665e = view;
        this.f1663c = z;
        this.f1664d = i;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0082bv m1028a() {
        AbstractC0082bv x40Var;
        if (this.f1669i == null) {
            Context context = this.f1661a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0164dv.m940a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                x40Var = new ViewOnKeyListenerC0179e9(context, this.f1665e, this.f1664d, this.f1663c);
            } else {
                x40Var = new x40(this.f1661a, this.f1662b, this.f1665e, this.f1664d, this.f1663c);
            }
            x40Var.mo533l(this.f1662b);
            x40Var.mo538r(this.f1671k);
            x40Var.mo534n(this.f1665e);
            x40Var.mo975e(this.f1668h);
            x40Var.mo535o(this.f1667g);
            x40Var.mo536p(this.f1666f);
            this.f1669i = x40Var;
        }
        return this.f1669i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1029b() {
        AbstractC0082bv abstractC0082bv = this.f1669i;
        return abstractC0082bv != null && abstractC0082bv.mo973b();
    }

    /* JADX INFO: renamed from: c */
    public void mo1030c() {
        this.f1669i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1670j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1031d(int i, int i2, boolean z, boolean z2) {
        AbstractC0082bv abstractC0082bvM1028a = m1028a();
        abstractC0082bvM1028a.mo539s(z2);
        if (z) {
            int i3 = this.f1666f;
            View view = this.f1665e;
            WeakHashMap weakHashMap = oa0.f3426a;
            if ((Gravity.getAbsoluteGravity(i3, y90.m2732d(view)) & 7) == 5) {
                i -= this.f1665e.getWidth();
            }
            abstractC0082bvM1028a.mo537q(i);
            abstractC0082bvM1028a.mo540t(i2);
            int i4 = (int) ((this.f1661a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0082bvM1028a.f782a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC0082bvM1028a.mo976f();
    }
}
