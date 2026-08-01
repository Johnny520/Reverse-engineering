package p068h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: h.x */
/* JADX INFO: loaded from: classes.dex */
public class C0605x {

    /* JADX INFO: renamed from: a */
    public final Context f2098a;

    /* JADX INFO: renamed from: b */
    public final MenuC0594m f2099b;

    /* JADX INFO: renamed from: c */
    public final boolean f2100c;

    /* JADX INFO: renamed from: d */
    public final int f2101d;

    /* JADX INFO: renamed from: e */
    public View f2102e;

    /* JADX INFO: renamed from: g */
    public boolean f2104g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0606y f2105h;

    /* JADX INFO: renamed from: i */
    public AbstractC0602u f2106i;

    /* JADX INFO: renamed from: j */
    public C0603v f2107j;

    /* JADX INFO: renamed from: f */
    public int f2103f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C0603v f2108k = new C0603v(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0605x(int i2, Context context, View view, MenuC0594m menuC0594m, boolean z2) {
        this.f2098a = context;
        this.f2099b = menuC0594m;
        this.f2102e = view;
        this.f2100c = z2;
        this.f2101d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC0602u m1205a() {
        AbstractC0602u viewOnKeyListenerC0580E;
        if (this.f2106i == null) {
            Context context = this.f2098a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0604w.m1204a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0580E = new ViewOnKeyListenerC0588g(context, this.f2102e, this.f2101d, this.f2100c);
            } else {
                View view = this.f2102e;
                Context context2 = this.f2098a;
                boolean z2 = this.f2100c;
                viewOnKeyListenerC0580E = new ViewOnKeyListenerC0580E(this.f2101d, context2, view, this.f2099b, z2);
            }
            viewOnKeyListenerC0580E.mo1152l(this.f2099b);
            viewOnKeyListenerC0580E.mo1157r(this.f2108k);
            viewOnKeyListenerC0580E.mo1153n(this.f2102e);
            viewOnKeyListenerC0580E.mo1149e(this.f2105h);
            viewOnKeyListenerC0580E.mo1154o(this.f2104g);
            viewOnKeyListenerC0580E.mo1155p(this.f2103f);
            this.f2106i = viewOnKeyListenerC0580E;
        }
        return this.f2106i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1206b() {
        AbstractC0602u abstractC0602u = this.f2106i;
        return abstractC0602u != null && abstractC0602u.mo1144a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo1207c() {
        this.f2106i = null;
        C0603v c0603v = this.f2107j;
        if (c0603v != null) {
            c0603v.onDismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1208d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC0602u abstractC0602uM1205a = m1205a();
        abstractC0602uM1205a.mo1158s(z3);
        if (z2) {
            int i4 = this.f2103f;
            View view = this.f2102e;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2102e.getWidth();
            }
            abstractC0602uM1205a.mo1156q(i2);
            abstractC0602uM1205a.mo1159t(i3);
            int i5 = (int) ((this.f2098a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0602uM1205a.f2096b = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        abstractC0602uM1205a.mo1146h();
    }
}
