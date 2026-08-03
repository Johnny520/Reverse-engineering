package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC2697x2 extends DialogC0876Ua implements DialogInterface, InterfaceC1437g3 {

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0176E3 f9272d;

    /* JADX INFO: renamed from: e */
    public final C0219F3 f9273e;

    /* JADX INFO: renamed from: f */
    public final C2611v2 f9274f;

    public DialogInterfaceC2697x2(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM5271e = m5271e(contextThemeWrapper, i);
        if (iM5271e == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM5271e;
        }
        super(contextThemeWrapper, i2);
        this.f9273e = new C0219F3(this);
        AbstractC2397q3 abstractC2397q3M5272c = m5272c();
        if (iM5271e == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM5271e = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0176E3) abstractC2397q3M5272c).f479T = iM5271e;
        abstractC2397q3M5272c.mo342c();
        this.f9274f = new C2611v2(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: e */
    public static int m5271e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1718b();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) m5272c();
        layoutInflaterFactory2C0176E3.m357w();
        ((ViewGroup) layoutInflaterFactory2C0176E3.f460A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0176E3.f496m.m5304a(layoutInflaterFactory2C0176E3.f495l.getCallback());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2397q3 m5272c() {
        if (this.f9272d == null) {
            ExecutorC2303o3 executorC2303o3 = AbstractC2397q3.f8398a;
            this.f9272d = new LayoutInflaterFactory2C0176E3(getContext(), getWindow(), this, this);
        }
        return this.f9272d;
    }

    /* JADX INFO: renamed from: d */
    public final void m5273d(Bundle bundle) {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) m5272c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0176E3.f494k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0176E3);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        m5272c().mo342c();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m5272c().mo343e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C0219F3 c0219f3 = this.f9273e;
        if (c0219f3 == null) {
            return false;
        }
        return c0219f3.f645a.m5275g(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final void m5274f(CharSequence charSequence) {
        super.setTitle(charSequence);
        m5272c().mo348k(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) m5272c();
        layoutInflaterFactory2C0176E3.m357w();
        return layoutInflaterFactory2C0176E3.f495l.findViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5275g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m5272c().mo341a();
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m5273d(bundle);
        C2611v2 c2611v2 = this.f9274f;
        c2611v2.f9034b.setContentView(c2611v2.f9057y);
        Context context = c2611v2.f9033a;
        Window window = c2611v2.f9035c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c2611v2.f9038f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !C2611v2.m5119a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c2611v2.f9039g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c2611v2.f9037e != null) {
                ((LinearLayout.LayoutParams) ((C1421fo) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM5120b = C2611v2.m5120b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM5120b2 = C2611v2.m5120b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM5120b3 = C2611v2.m5120b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c2611v2.f9049q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c2611v2.f9049q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM5120b2.findViewById(android.R.id.message);
        c2611v2.f9053u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c2611v2.f9049q.removeView(c2611v2.f9053u);
            if (c2611v2.f9037e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c2611v2.f9049q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c2611v2.f9049q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c2611v2.f9037e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM5120b2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM5120b3.findViewById(android.R.id.button1);
        c2611v2.f9040h = button;
        ViewOnClickListenerC2343p0 viewOnClickListenerC2343p0 = c2611v2.f9032E;
        button.setOnClickListener(viewOnClickListenerC2343p0);
        if (TextUtils.isEmpty(c2611v2.f9041i)) {
            c2611v2.f9040h.setVisibility(8);
            i = 0;
        } else {
            c2611v2.f9040h.setText(c2611v2.f9041i);
            c2611v2.f9040h.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM5120b3.findViewById(android.R.id.button2);
        c2611v2.f9043k = button2;
        button2.setOnClickListener(viewOnClickListenerC2343p0);
        if (TextUtils.isEmpty(c2611v2.f9044l)) {
            c2611v2.f9043k.setVisibility(8);
        } else {
            c2611v2.f9043k.setText(c2611v2.f9044l);
            c2611v2.f9043k.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM5120b3.findViewById(android.R.id.button3);
        c2611v2.f9046n = button3;
        button3.setOnClickListener(viewOnClickListenerC2343p0);
        if (TextUtils.isEmpty(c2611v2.f9047o)) {
            c2611v2.f9046n.setVisibility(8);
        } else {
            c2611v2.f9046n.setText(c2611v2.f9047o);
            c2611v2.f9046n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c2611v2.f9040h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c2611v2.f9043k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c2611v2.f9046n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM5120b3.setVisibility(8);
        }
        if (c2611v2.f9054v != null) {
            viewGroupM5120b.addView(c2611v2.f9054v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c2611v2.f9051s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c2611v2.f9036d) || !c2611v2.f9030C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c2611v2.f9051s.setVisibility(8);
                viewGroupM5120b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c2611v2.f9052t = textView2;
                textView2.setText(c2611v2.f9036d);
                Drawable drawable = c2611v2.f9050r;
                if (drawable != null) {
                    c2611v2.f9051s.setImageDrawable(drawable);
                } else {
                    c2611v2.f9052t.setPadding(c2611v2.f9051s.getPaddingLeft(), c2611v2.f9051s.getPaddingTop(), c2611v2.f9051s.getPaddingRight(), c2611v2.f9051s.getPaddingBottom());
                    c2611v2.f9051s.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM5120b == null || viewGroupM5120b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM5120b3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM5120b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c2611v2.f9049q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c2611v2.f9037e != null ? viewGroupM5120b.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM5120b2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c2611v2.f9037e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f3684a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f3685b);
        }
        if (!z2) {
            View view2 = c2611v2.f9037e;
            if (view2 == null) {
                view2 = c2611v2.f9049q;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                AbstractC1404fE.m2676b(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM5120b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM5120b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c2611v2.f9037e;
        if (alertController$RecycleListView2 == null || (listAdapter = c2611v2.f9055w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c2611v2.f9056x;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9274f.f9049q;
        if (nestedScrollView == null || !nestedScrollView.m2149j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9274f.f9049q;
        if (nestedScrollView == null || !nestedScrollView.m2149j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) m5272c();
        layoutInflaterFactory2C0176E3.m332A();
        AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
        if (abstractC2257n0 != null) {
            abstractC2257n0.mo4510n(false);
        }
    }

    @Override // p000.InterfaceC1437g3
    public final void onSupportActionModeFinished(AbstractC0345I0 abstractC0345I0) {
    }

    @Override // p000.InterfaceC1437g3
    public final void onSupportActionModeStarted(AbstractC0345I0 abstractC0345I0) {
    }

    @Override // p000.InterfaceC1437g3
    public final AbstractC0345I0 onWindowStartingSupportActionMode(InterfaceC0302H0 interfaceC0302H0) {
        return null;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(int i) {
        m1718b();
        m5272c().mo345h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m5272c().mo348k(getContext().getString(i));
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(View view) {
        m1718b();
        m5272c().mo346i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m5274f(charSequence);
        C2611v2 c2611v2 = this.f9274f;
        c2611v2.f9036d = charSequence;
        TextView textView = c2611v2.f9052t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1718b();
        m5272c().mo347j(view, layoutParams);
    }
}
