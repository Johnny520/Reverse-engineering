package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.InterfaceC1002j;
import p000a.AbstractC0557eb;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public class C1001i {

    /* JADX INFO: renamed from: a */
    public final Context f3841a;

    /* JADX INFO: renamed from: b */
    public final C0998f f3842b;

    /* JADX INFO: renamed from: c */
    public final boolean f3843c;

    /* JADX INFO: renamed from: d */
    public final int f3844d;

    /* JADX INFO: renamed from: e */
    public View f3845e;

    /* JADX INFO: renamed from: g */
    public boolean f3847g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1002j.a f3848h;

    /* JADX INFO: renamed from: i */
    public AbstractC0557eb f3849i;

    /* JADX INFO: renamed from: j */
    public a f3850j;

    /* JADX INFO: renamed from: f */
    public int f3846f = 8388611;

    /* JADX INFO: renamed from: k */
    public final a f3851k = new a();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C1001i.this.mo2345c();
        }
    }

    public C1001i(int i, Context context, View view, C0998f c0998f, boolean z) {
        this.f3841a = context;
        this.f3842b = c0998f;
        this.f3845e = view;
        this.f3843c = z;
        this.f3844d = i;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0557eb m2343a() {
        AbstractC0557eb viewOnKeyListenerC1004l;
        if (this.f3849i == null) {
            Context context = this.f3841a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(C0983R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1004l = new ViewOnKeyListenerC0994b(context, this.f3845e, this.f3844d, this.f3843c);
            } else {
                View view = this.f3845e;
                Context context2 = this.f3841a;
                boolean z = this.f3843c;
                viewOnKeyListenerC1004l = new ViewOnKeyListenerC1004l(this.f3844d, context2, view, this.f3842b, z);
            }
            viewOnKeyListenerC1004l.mo1399l(this.f3842b);
            viewOnKeyListenerC1004l.mo1404r(this.f3851k);
            viewOnKeyListenerC1004l.mo1400n(this.f3845e);
            viewOnKeyListenerC1004l.mo2309h(this.f3848h);
            viewOnKeyListenerC1004l.mo1401o(this.f3847g);
            viewOnKeyListenerC1004l.mo1402p(this.f3846f);
            this.f3849i = viewOnKeyListenerC1004l;
        }
        return this.f3849i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2344b() {
        AbstractC0557eb abstractC0557eb = this.f3849i;
        return abstractC0557eb != null && abstractC0557eb.mo276b();
    }

    /* JADX INFO: renamed from: c */
    public void mo2345c() {
        this.f3849i = null;
        a aVar = this.f3850j;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2346d(int i, int i2, boolean z, boolean z2) {
        AbstractC0557eb abstractC0557ebM2343a = m2343a();
        abstractC0557ebM2343a.mo1405s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f3846f, this.f3845e.getLayoutDirection()) & 7) == 5) {
                i -= this.f3845e.getWidth();
            }
            abstractC0557ebM2343a.mo1403q(i);
            abstractC0557ebM2343a.mo1406t(i2);
            int i3 = (int) ((this.f3841a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0557ebM2343a.f2101a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC0557ebM2343a.mo279f();
    }
}
