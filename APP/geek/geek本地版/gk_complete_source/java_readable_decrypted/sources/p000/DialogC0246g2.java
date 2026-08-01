package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0029a;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0036a;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0246g2 extends Dialog implements DialogInterface, InterfaceC0878x2, InterfaceC0568oq, u10 {

    /* JADX INFO: renamed from: a */
    public C0036a f2004a;

    /* JADX INFO: renamed from: b */
    public final C0266gm f2005b;

    /* JADX INFO: renamed from: c */
    public final C0029a f2006c;

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0657r3 f2007d;

    /* JADX INFO: renamed from: e */
    public final C0694s3 f2008e;

    /* JADX INFO: renamed from: f */
    public final C0172e2 f2009f;

    /* JADX WARN: Type inference failed for: r2v4, types: [s3] */
    public DialogC0246g2(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM1250h = m1250h(contextThemeWrapper, i);
        if (iM1250h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM1250h;
        }
        super(contextThemeWrapper, i2);
        this.f2005b = new C0266gm(this);
        this.f2006c = new C0029a(new RunnableC0581p1(5, this));
        this.f2008e = new InterfaceC0040aq() { // from class: s3
            @Override // p000.InterfaceC0040aq
            /* JADX INFO: renamed from: c */
            public final boolean mo229c(KeyEvent keyEvent) {
                return this.f4379a.m1256j(keyEvent);
            }
        };
        AbstractC0173e3 abstractC0173e3M1251c = m1251c();
        if (iM1250h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM1250h = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0657r3) abstractC0173e3M1251c).f4162T = iM1250h;
        abstractC0173e3M1251c.mo975d();
        this.f2009f = new C0172e2(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: a */
    public static void m1249a(DialogC0246g2 dialogC0246g2) {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: h */
    public static int m1250h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m1251c();
        layoutInflaterFactory2C0657r3.m2209w();
        ((ViewGroup) layoutInflaterFactory2C0657r3.f4143A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0657r3.f4179m.m1737a(layoutInflaterFactory2C0657r3.f4178l.getCallback());
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo118b() {
        return (C0004a3) this.f2005b.f2143c;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0173e3 m1251c() {
        if (this.f2007d == null) {
            ExecutorC0770u5 executorC0770u5 = AbstractC0173e3.f1684a;
            this.f2007d = new LayoutInflaterFactory2C0657r3(getContext(), getWindow(), this, this);
        }
        return this.f2007d;
    }

    /* JADX INFO: renamed from: d */
    public final void m1252d(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0346ip.m1502n("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0029a c0029a = this.f2006c;
            c0029a.getClass();
            c0029a.f187e = onBackInvokedDispatcher;
            c0029a.m127c(c0029a.f189g);
        }
        this.f2005b.m1279b(bundle);
        C0036a c0036a = this.f2004a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f2004a = c0036a;
        }
        c0036a.m277d(EnumC0347iq.ON_CREATE);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m1251c().mo976e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0346ip.m1507s(this.f2008e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        C0036a c0036a = this.f2004a;
        if (c0036a != null) {
            return c0036a;
        }
        C0036a c0036a2 = new C0036a(this);
        this.f2004a = c0036a2;
        return c0036a2;
    }

    /* JADX INFO: renamed from: f */
    public final void m1253f(Bundle bundle) {
        m1251c().mo973a();
        m1252d(bundle);
        m1251c().mo975d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m1251c();
        layoutInflaterFactory2C0657r3.m2209w();
        return layoutInflaterFactory2C0657r3.f4178l.findViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m1254g() {
        C0036a c0036a = this.f2004a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f2004a = c0036a;
        }
        c0036a.m277d(EnumC0347iq.ON_DESTROY);
        this.f2004a = null;
        super.onStop();
    }

    /* JADX INFO: renamed from: i */
    public final void m1255i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1251c().mo981l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m1251c().mo974b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1256j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2006c.m126b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m1253f(bundle);
        C0172e2 c0172e2 = this.f2009f;
        c0172e2.f1662b.setContentView(c0172e2.f1677q);
        Context context = c0172e2.f1661a;
        Window window = c0172e2.f1663c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM970a = C0172e2.m970a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM970a2 = C0172e2.m970a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM970a3 = C0172e2.m970a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0172e2.f1669i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0172e2.f1669i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM970a2.findViewById(android.R.id.message);
        c0172e2.f1673m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0172e2.f1669i.removeView(c0172e2.f1673m);
            if (c0172e2.f1665e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0172e2.f1669i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0172e2.f1669i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0172e2.f1665e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM970a2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM970a3.findViewById(android.R.id.button1);
        c0172e2.f1666f = button;
        ViewOnClickListenerC0876x0 viewOnClickListenerC0876x0 = c0172e2.f1683w;
        button.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1666f.setVisibility(8);
            i = 0;
        } else {
            c0172e2.f1666f.setText((CharSequence) null);
            c0172e2.f1666f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM970a3.findViewById(android.R.id.button2);
        c0172e2.f1667g = button2;
        button2.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1667g.setVisibility(8);
        } else {
            c0172e2.f1667g.setText((CharSequence) null);
            c0172e2.f1667g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM970a3.findViewById(android.R.id.button3);
        c0172e2.f1668h = button3;
        button3.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1668h.setVisibility(8);
        } else {
            c0172e2.f1668h.setText((CharSequence) null);
            c0172e2.f1668h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0172e2.f1666f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0172e2.f1667g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0172e2.f1668h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM970a3.setVisibility(8);
        }
        if (c0172e2.f1674n != null) {
            viewGroupM970a.addView(c0172e2.f1674n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0172e2.f1671k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0172e2.f1664d) || !c0172e2.f1681u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0172e2.f1671k.setVisibility(8);
                viewGroupM970a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0172e2.f1672l = textView2;
                textView2.setText(c0172e2.f1664d);
                Drawable drawable = c0172e2.f1670j;
                if (drawable != null) {
                    c0172e2.f1671k.setImageDrawable(drawable);
                } else {
                    c0172e2.f1672l.setPadding(c0172e2.f1671k.getPaddingLeft(), c0172e2.f1671k.getPaddingTop(), c0172e2.f1671k.getPaddingRight(), c0172e2.f1671k.getPaddingBottom());
                    c0172e2.f1671k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM970a == null || viewGroupM970a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM970a3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM970a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0172e2.f1669i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0172e2.f1665e != null ? viewGroupM970a.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM970a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0172e2.f1665e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f190a, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f191b);
        }
        if (!z) {
            View view = c0172e2.f1665e;
            if (view == null) {
                view = c0172e2.f1669i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ja0.f2600a;
                z90.m2785d(view, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM970a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM970a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0172e2.f1665e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0172e2.f1675o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0172e2.f1676p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2009f.f1669i;
        if (nestedScrollView == null || !nestedScrollView.m237j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2009f.f1669i;
        if (nestedScrollView == null || !nestedScrollView.m237j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0346ip.m1502n("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f2005b.m1280c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0036a c0036a = this.f2004a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f2004a = c0036a;
        }
        c0036a.m277d(EnumC0347iq.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m1254g();
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) m1251c();
        layoutInflaterFactory2C0657r3.m2193A();
        yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
        if (yb0Var != null) {
            yb0Var.f5322P = false;
            xa0 xa0Var = yb0Var.f5321O;
            if (xa0Var != null) {
                xa0Var.m2617a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m1251c().mo978h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m1251c().mo981l(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m1251c().mo979i(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1251c().mo980j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m1255i(charSequence);
        C0172e2 c0172e2 = this.f2009f;
        c0172e2.f1664d = charSequence;
        TextView textView = c0172e2.f1672l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
