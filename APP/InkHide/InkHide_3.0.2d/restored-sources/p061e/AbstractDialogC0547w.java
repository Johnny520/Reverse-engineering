package p061e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0378i;
import androidx.activity.RunnableC0371b;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0484s;
import com.p055lu.wxmask272.R;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p066g.C0571k;
import p075l.C0745c;
import p099y.InterfaceC1078j;

/* JADX INFO: renamed from: e.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC0547w extends Dialog implements InterfaceC0534j, InterfaceC0484s {

    /* JADX INFO: renamed from: b */
    public C0486u f1843b;

    /* JADX INFO: renamed from: c */
    public final C0378i f1844c;

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0545u f1845d;

    /* JADX INFO: renamed from: e */
    public final C0546v f1846e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [e.v] */
    public AbstractDialogC0547w(Context context, int i2) {
        int i3;
        if (i2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = i2;
        }
        AbstractC0223g.m418e(context, "context");
        super(context, i3);
        this.f1844c = new C0378i(new RunnableC0371b(1, this));
        this.f1846e = new InterfaceC1078j() { // from class: e.v
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p099y.InterfaceC1078j
            /* JADX INFO: renamed from: d */
            public final boolean mo637d(KeyEvent keyEvent) {
                return this.f1842b.m1124g(keyEvent);
            }
        };
        AbstractC0535k abstractC0535kM1121d = m1121d();
        if (i2 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i2 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0545u) abstractC0535kM1121d).f1807N = i2;
        abstractC0535kM1121d.mo1085c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1120a(AbstractDialogC0547w abstractDialogC0547w) {
        AbstractC0223g.m418e(abstractDialogC0547w, "this$0");
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1121d();
        layoutInflaterFactory2C0545u.m1114u();
        ((ViewGroup) layoutInflaterFactory2C0545u.f1836u.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0545u.f1822g.m1097a(layoutInflaterFactory2C0545u.f1821f.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        C0486u c0486u = this.f1843b;
        if (c0486u != null) {
            return c0486u;
        }
        C0486u c0486u2 = new C0486u(this);
        this.f1843b = c0486u2;
        return c0486u2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC0535k m1121d() {
        if (this.f1845d == null) {
            C0745c c0745c = AbstractC0535k.f1755b;
            this.f1845d = new LayoutInflaterFactory2C0545u(getContext(), getWindow(), this, this);
        }
        return this.f1845d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m1121d().mo1086d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0503h.m986r(this.f1846e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1122e(Bundle bundle) {
        super.onCreate(bundle);
        C0486u c0486u = this.f1843b;
        if (c0486u == null) {
            c0486u = new C0486u(this);
            this.f1843b = c0486u;
        }
        c0486u.m930d(EnumC0478m.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1123f() {
        C0486u c0486u = this.f1843b;
        if (c0486u == null) {
            c0486u = new C0486u(this);
            this.f1843b = c0486u;
        }
        c0486u.m930d(EnumC0478m.ON_DESTROY);
        this.f1843b = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final View findViewById(int i2) {
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1121d();
        layoutInflaterFactory2C0545u.m1114u();
        return layoutInflaterFactory2C0545u.f1821f.findViewById(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m1124g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m1121d().mo1084b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1844c.m642b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1121d().mo1083a();
        m1122e(bundle);
        m1121d().mo1085c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0486u c0486u = this.f1843b;
        if (c0486u == null) {
            c0486u = new C0486u(this);
            this.f1843b = c0486u;
        }
        c0486u.m930d(EnumC0478m.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStop() {
        m1123f();
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1121d();
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e != null) {
            c0524e.f1692J = false;
            C0571k c0571k = c0524e.f1691I;
            if (c0571k != null) {
                c0571k.m1137a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        m1121d().mo1088i(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1121d().mo1091l(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m1121d().mo1089j(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1121d().mo1090k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        m1121d().mo1091l(getContext().getString(i2));
    }
}
