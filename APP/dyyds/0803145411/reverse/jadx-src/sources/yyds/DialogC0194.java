package yyds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0033;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0038;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛱᲀᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0194 extends Dialog implements DialogInterface, InterfaceC0214, InterfaceC2345, InterfaceC2671, InterfaceC2164 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2239 f1149;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0033 f1150;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1044 f1151;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0038 f1152;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public LayoutInflaterFactory2C2181 f1153;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1424 f1154;

    public DialogC0194(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM819 = m819(contextThemeWrapper, i);
        if (iM819 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM819;
        }
        super(contextThemeWrapper, i2);
        this.f1154 = new C1424(this);
        this.f1150 = new C0033(new RunnableC0309(3, this));
        this.f1151 = new C1044(this);
        AbstractC2423 abstractC2423M824 = m824();
        if (iM819 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM819 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C2181) abstractC2423M824).f10690 = iM819;
        abstractC2423M824.mo4157();
        this.f1149 = new C2239(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static int m819(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final void m820(DialogC0194 dialogC0194) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        layoutInflaterFactory2C2181.m4156();
        ((ViewGroup) layoutInflaterFactory2C2181.f10675.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C2181.f10689.m2755(layoutInflaterFactory2C2181.f10676.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dismiss() {
        super.dismiss();
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        if (layoutInflaterFactory2C2181.f10704 instanceof Activity) {
            synchronized (AbstractC2423.f11964) {
                AbstractC2423.m4472(layoutInflaterFactory2C2181);
            }
        }
        if (layoutInflaterFactory2C2181.f10692) {
            layoutInflaterFactory2C2181.f10676.getDecorView().removeCallbacks(layoutInflaterFactory2C2181.f10682);
        }
        layoutInflaterFactory2C2181.f10678 = true;
        if (layoutInflaterFactory2C2181.f10687 != -100) {
            Object obj = layoutInflaterFactory2C2181.f10704;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                LayoutInflaterFactory2C2181.f10671.put(layoutInflaterFactory2C2181.f10704.getClass().getName(), Integer.valueOf(layoutInflaterFactory2C2181.f10687));
            } else {
                LayoutInflaterFactory2C2181.f10671.remove(layoutInflaterFactory2C2181.f10704.getClass().getName());
            }
        }
        C1871 c1871 = layoutInflaterFactory2C2181.f10686;
        if (c1871 != null) {
            c1871.m4326();
        }
        C1871 c18712 = layoutInflaterFactory2C2181.f10720;
        if (c18712 != null) {
            c18712.m4326();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C1044 c1044 = this.f1151;
        if (c1044 == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        layoutInflaterFactory2C2181.m4156();
        return layoutInflaterFactory2C2181.f10676.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        if (layoutInflaterFactory2C2181.f10719 != null) {
            layoutInflaterFactory2C2181.m4162();
            layoutInflaterFactory2C2181.f10719.getClass();
            layoutInflaterFactory2C2181.m4159(0);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1150.m22();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m825(bundle);
        C2239 c2239 = this.f1149;
        c2239.f11054.setContentView(c2239.f11056);
        Context context = c2239.f11050;
        Window window = c2239.f11064;
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
        ViewGroup viewGroupM4239 = C2239.m4239(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM42392 = C2239.m4239(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM42393 = C2239.m4239(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c2239.f11048 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c2239.f11048.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM42392.findViewById(android.R.id.message);
        c2239.f11047 = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c2239.f11048.removeView(c2239.f11047);
            if (c2239.f11049 != null) {
                ViewGroup viewGroup2 = (ViewGroup) c2239.f11048.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c2239.f11048);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c2239.f11049, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM42392.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM42393.findViewById(android.R.id.button1);
        c2239.f11066 = button;
        ViewOnClickListenerC2759 viewOnClickListenerC2759 = c2239.f11055;
        button.setOnClickListener(viewOnClickListenerC2759);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = c2239.f11066;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            c2239.f11066.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM42393.findViewById(android.R.id.button2);
        c2239.f11057 = button3;
        button3.setOnClickListener(viewOnClickListenerC2759);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = c2239.f11057;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            c2239.f11057.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM42393.findViewById(android.R.id.button3);
        c2239.f11046 = button5;
        button5.setOnClickListener(viewOnClickListenerC2759);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = c2239.f11046;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            c2239.f11046.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c2239.f11066;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c2239.f11057;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c2239.f11046;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM42393.setVisibility(8);
        }
        if (c2239.f11045 != null) {
            viewGroupM4239.addView(c2239.f11045, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c2239.f11060 = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c2239.f11067) || !c2239.f11059) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c2239.f11060.setVisibility(8);
                viewGroupM4239.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c2239.f11061 = textView2;
                textView2.setText(c2239.f11067);
                Drawable drawable = c2239.f11062;
                if (drawable != null) {
                    c2239.f11060.setImageDrawable(drawable);
                } else {
                    c2239.f11061.setPadding(c2239.f11060.getPaddingLeft(), c2239.f11060.getPaddingTop(), c2239.f11060.getPaddingRight(), c2239.f11060.getPaddingBottom());
                    c2239.f11060.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM4239 == null || viewGroupM4239.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM42393.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM42392.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c2239.f11048;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c2239.f11049 != null ? viewGroupM4239.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM42392.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c2239.f11049;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f44, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f45);
        }
        if (!z) {
            View view = c2239.f11049;
            if (view == null) {
                view = c2239.f11048;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM42392.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM42392.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c2239.f11049;
        if (alertController$RecycleListView2 == null || (listAdapter = c2239.f11052) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c2239.f11065;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1149.f11048;
        if (nestedScrollView == null || !nestedScrollView.m103(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1149.f11048;
        if (nestedScrollView == null || !nestedScrollView.m103(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C0328 c0328 = (C0328) this.f1154.f6734;
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) c0328.f1718;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0422 c0422 = (C0422) c0328.f1721;
        C2704 c2704 = new C2704(c0422);
        c0422.f2165.put(c2704, Boolean.FALSE);
        while (c2704.hasNext()) {
            Map.Entry entry = (Map.Entry) c2704.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC1801) entry.getValue()).mo1228());
        }
        if (!bundle.isEmpty()) {
            bundleOnSaveInstanceState.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0038 c0038 = this.f1152;
        if (c0038 == null) {
            c0038 = new C0038(this);
            this.f1152 = c0038;
        }
        c0038.m127(EnumC0637.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m821();
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        layoutInflaterFactory2C2181.m4162();
        C0528 c0528 = layoutInflaterFactory2C2181.f10719;
        if (c0528 != null) {
            c0528.f2537 = false;
            C2205 c2205 = c0528.f2549;
            if (c2205 != null) {
                c2205.m4190();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m824().mo4170(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m824().mo4167(getContext().getString(i));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m821() {
        C0038 c0038 = this.f1152;
        if (c0038 == null) {
            c0038 = new C0038(this);
            this.f1152 = c0038;
        }
        c0038.m127(EnumC0637.ON_DESTROY);
        this.f1152 = null;
        super.onStop();
    }

    @Override // yyds.InterfaceC2345
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final C0038 mo14() {
        C0038 c0038 = this.f1152;
        if (c0038 != null) {
            return c0038;
        }
        C0038 c00382 = new C0038(this);
        this.f1152 = c00382;
        return c00382;
    }

    @Override // yyds.InterfaceC2671
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C0033 mo15() {
        return this.f1150;
    }

    @Override // yyds.InterfaceC2164
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final C0328 mo16() {
        return (C0328) this.f1154.f6734;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m822(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C0033 c0033 = this.f1150;
            c0033.f38 = onBackInvokedDispatcher;
            c0033.m23();
        }
        this.f1154.m2893(bundle);
        C0038 c0038 = this.f1152;
        if (c0038 == null) {
            c0038 = new C0038(this);
            this.f1152 = c0038;
        }
        c0038.m127(EnumC0637.ON_CREATE);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m823(CharSequence charSequence) {
        super.setTitle(charSequence);
        m824().mo4167(charSequence);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC2423 m824() {
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f1153;
        if (layoutInflaterFactory2C2181 != null) {
            return layoutInflaterFactory2C2181;
        }
        ExecutorC2250 executorC2250 = AbstractC2423.f11965;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C21812 = new LayoutInflaterFactory2C2181(getContext(), getWindow(), this, this);
        this.f1153 = layoutInflaterFactory2C21812;
        return layoutInflaterFactory2C21812;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m825(Bundle bundle) {
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = (LayoutInflaterFactory2C2181) m824();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C2181.f10680);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C2181);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C2181)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        m822(bundle);
        m824().mo4157();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m824().mo4161(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m824().mo4151(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m823(charSequence);
        C2239 c2239 = this.f1149;
        c2239.f11067 = charSequence;
        TextView textView = c2239.f11061;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
