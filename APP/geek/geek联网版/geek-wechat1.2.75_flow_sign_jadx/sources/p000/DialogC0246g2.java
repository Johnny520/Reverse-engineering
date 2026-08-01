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
public final class DialogC0246g2 extends Dialog implements DialogInterface, InterfaceC0878x2, InterfaceC0716sq, b20 {

    /* JADX INFO: renamed from: a */
    public C0036a f1857a;

    /* JADX INFO: renamed from: b */
    public final C0339im f1858b;

    /* JADX INFO: renamed from: c */
    public final C0029a f1859c;

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0656r3 f1860d;

    /* JADX INFO: renamed from: e */
    public final C0693s3 f1861e;

    /* JADX INFO: renamed from: f */
    public final C0172e2 f1862f;

    /* JADX WARN: Type inference failed for: r2v4, types: [s3] */
    public DialogC0246g2(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM1123h = m1123h(contextThemeWrapper, i);
        if (iM1123h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM1123h;
        }
        super(contextThemeWrapper, i2);
        this.f1858b = new C0339im(this);
        this.f1859c = new C0029a(new RunnableC0884x8(4, this));
        this.f1861e = new InterfaceC0196eq() { // from class: s3
            @Override // p000.InterfaceC0196eq
            /* JADX INFO: renamed from: c */
            public final boolean mo214c(KeyEvent keyEvent) {
                return this.f4194a.m1129j(keyEvent);
            }
        };
        AbstractC0173e3 abstractC0173e3M1124c = m1124c();
        if (iM1123h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM1123h = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0656r3) abstractC0173e3M1124c).f4023T = iM1123h;
        abstractC0173e3M1124c.mo959d();
        this.f1862f = new C0172e2(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: a */
    public static void m1122a(DialogC0246g2 dialogC0246g2) {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: h */
    public static int m1123h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m1124c();
        layoutInflaterFactory2C0656r3.m2220w();
        ((ViewGroup) layoutInflaterFactory2C0656r3.f4004A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0656r3.f4040m.m1727a(layoutInflaterFactory2C0656r3.f4039l.getCallback());
    }

    @Override // p000.b20
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo103b() {
        return (C0004a3) this.f1858b.f2555c;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0173e3 m1124c() {
        if (this.f1860d == null) {
            ExecutorC0769u5 executorC0769u5 = AbstractC0173e3.f1489a;
            this.f1860d = new LayoutInflaterFactory2C0656r3(getContext(), getWindow(), this, this);
        }
        return this.f1860d;
    }

    /* JADX INFO: renamed from: d */
    public final void m1125d(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0493mp.m1856f("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0029a c0029a = this.f1859c;
            c0029a.getClass();
            c0029a.f150e = onBackInvokedDispatcher;
            c0029a.m112c(c0029a.f152g);
        }
        this.f1858b.m1504b(bundle);
        C0036a c0036a = this.f1857a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f1857a = c0036a;
        }
        c0036a.m262d(EnumC0494mq.ON_CREATE);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m1124c().mo960e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0493mp.m1862l(this.f1861e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        C0036a c0036a = this.f1857a;
        if (c0036a != null) {
            return c0036a;
        }
        C0036a c0036a2 = new C0036a(this);
        this.f1857a = c0036a2;
        return c0036a2;
    }

    /* JADX INFO: renamed from: f */
    public final void m1126f(Bundle bundle) {
        m1124c().mo957a();
        m1125d(bundle);
        m1124c().mo959d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m1124c();
        layoutInflaterFactory2C0656r3.m2220w();
        return layoutInflaterFactory2C0656r3.f4039l.findViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m1127g() {
        C0036a c0036a = this.f1857a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f1857a = c0036a;
        }
        c0036a.m262d(EnumC0494mq.ON_DESTROY);
        this.f1857a = null;
        super.onStop();
    }

    /* JADX INFO: renamed from: i */
    public final void m1128i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1124c().mo965l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m1124c().mo958b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1129j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1859c.m111b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m1126f(bundle);
        C0172e2 c0172e2 = this.f1862f;
        c0172e2.f1466b.setContentView(c0172e2.f1481q);
        Context context = c0172e2.f1465a;
        Window window = c0172e2.f1467c;
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
        ViewGroup viewGroupM954a = C0172e2.m954a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM954a2 = C0172e2.m954a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM954a3 = C0172e2.m954a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0172e2.f1473i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0172e2.f1473i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM954a2.findViewById(android.R.id.message);
        c0172e2.f1477m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0172e2.f1473i.removeView(c0172e2.f1477m);
            if (c0172e2.f1469e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0172e2.f1473i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0172e2.f1473i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0172e2.f1469e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM954a2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM954a3.findViewById(android.R.id.button1);
        c0172e2.f1470f = button;
        ViewOnClickListenerC0876x0 viewOnClickListenerC0876x0 = c0172e2.f1487w;
        button.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1470f.setVisibility(8);
            i = 0;
        } else {
            c0172e2.f1470f.setText((CharSequence) null);
            c0172e2.f1470f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM954a3.findViewById(android.R.id.button2);
        c0172e2.f1471g = button2;
        button2.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1471g.setVisibility(8);
        } else {
            c0172e2.f1471g.setText((CharSequence) null);
            c0172e2.f1471g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM954a3.findViewById(android.R.id.button3);
        c0172e2.f1472h = button3;
        button3.setOnClickListener(viewOnClickListenerC0876x0);
        if (TextUtils.isEmpty(null)) {
            c0172e2.f1472h.setVisibility(8);
        } else {
            c0172e2.f1472h.setText((CharSequence) null);
            c0172e2.f1472h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0172e2.f1470f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0172e2.f1471g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0172e2.f1472h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM954a3.setVisibility(8);
        }
        if (c0172e2.f1478n != null) {
            viewGroupM954a.addView(c0172e2.f1478n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0172e2.f1475k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0172e2.f1468d) || !c0172e2.f1485u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0172e2.f1475k.setVisibility(8);
                viewGroupM954a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0172e2.f1476l = textView2;
                textView2.setText(c0172e2.f1468d);
                Drawable drawable = c0172e2.f1474j;
                if (drawable != null) {
                    c0172e2.f1475k.setImageDrawable(drawable);
                } else {
                    c0172e2.f1476l.setPadding(c0172e2.f1475k.getPaddingLeft(), c0172e2.f1475k.getPaddingTop(), c0172e2.f1475k.getPaddingRight(), c0172e2.f1475k.getPaddingBottom());
                    c0172e2.f1475k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM954a == null || viewGroupM954a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM954a3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM954a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0172e2.f1473i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0172e2.f1469e != null ? viewGroupM954a.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM954a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0172e2.f1469e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f153a, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f154b);
        }
        if (!z) {
            View view = c0172e2.f1469e;
            if (view == null) {
                view = c0172e2.f1473i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = oa0.f3426a;
                ea0.m984d(view, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM954a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM954a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0172e2.f1469e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0172e2.f1479o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0172e2.f1480p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1862f.f1473i;
        if (nestedScrollView == null || !nestedScrollView.m222j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1862f.f1473i;
        if (nestedScrollView == null || !nestedScrollView.m222j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0493mp.m1856f("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f1858b.m1505c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0036a c0036a = this.f1857a;
        if (c0036a == null) {
            c0036a = new C0036a(this);
            this.f1857a = c0036a;
        }
        c0036a.m262d(EnumC0494mq.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m1127g();
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) m1124c();
        layoutInflaterFactory2C0656r3.m2204A();
        dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
        if (dc0Var != null) {
            dc0Var.f1375O = false;
            cb0 cb0Var = dc0Var.f1374N;
            if (cb0Var != null) {
                cb0Var.m610a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m1124c().mo962h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m1124c().mo965l(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m1124c().mo963i(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1124c().mo964j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m1128i(charSequence);
        C0172e2 c0172e2 = this.f1862f;
        c0172e2.f1468d = charSequence;
        TextView textView = c0172e2.f1476l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
