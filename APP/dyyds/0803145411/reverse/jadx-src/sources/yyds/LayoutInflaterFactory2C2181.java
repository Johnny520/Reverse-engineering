package yyds;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲁᛲᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2181 extends AbstractC2423 implements InterfaceC1643, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public static final C0988 f10671 = new C0988(0);

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public static final int[] f10672 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public static final boolean f10673 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public static final boolean f10674 = true;

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public ViewGroup f10675;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public Window f10676;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public boolean f10677;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public boolean f10678;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public boolean f10679;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Context f10680;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public PopupWindow f10683;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public boolean f10684;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public C0182 f10685;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public C1871 f10686;

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public final int f10687;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C1198 f10688;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public WindowCallbackC1354 f10689;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public int f10690;

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public boolean f10691;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public boolean f10692;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public CharSequence f10693;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public ActionBarContextView f10695;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public int f10696;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public C1623 f10697;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public boolean f10698;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public boolean f10699;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public AbstractC0451 f10700;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public C0182[] f10701;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C1198 f10702;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public boolean f10703;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Object f10704;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public boolean f10705;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public boolean f10706;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public boolean f10707;

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public Rect f10708;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public boolean f10709;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public TextView f10710;

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public C1441 f10711;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public View f10712;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public ActionBarOverlayLayout f10713;

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public OnBackInvokedCallback f10714;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public boolean f10715;

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f10716;

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public Configuration f10717;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public boolean f10718;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C0528 f10719;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public C1871 f10720;

    /* JADX INFO: renamed from: ᲈᛳ */
    public Rect f29;

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public int f10721;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public boolean f10722;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public RunnableC1745 f10723;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public C0140 f10694 = null;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final boolean f10681 = true;

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final RunnableC1745 f10682 = new RunnableC1745(this, 0);

    public LayoutInflaterFactory2C2181(Context context, Window window, InterfaceC0214 interfaceC0214, Object obj) {
        AppCompatActivity appCompatActivity;
        this.f10687 = -100;
        this.f10680 = context;
        this.f10704 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                throw null;
            }
        }
        if (this.f10687 == -100) {
            String name = this.f10704.getClass().getName();
            C0988 c0988 = f10671;
            Integer num = (Integer) c0988.get(name);
            if (num != null) {
                this.f10687 = num.intValue();
                c0988.remove(this.f10704.getClass().getName());
            }
        }
        if (window != null) {
            m4165(window);
        }
        C1541.m3171();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1441 c1441 = this.f10711;
        if (c1441 == null) {
            int[] iArr = AbstractC1592.f8107;
            Context context2 = this.f10680;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                c1441 = new C1441();
                this.f10711 = c1441;
            } else {
                try {
                    c1441 = (C1441) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.f10711 = c1441;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    c1441 = new C1441();
                    this.f10711 = c1441;
                }
            }
        }
        C1441 c14412 = c1441;
        int i = AbstractC1443.f6857;
        return c14412.createView(view, str, context, attributeSet, false, false, true, false);
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void m4147() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f10716 != null && (m4163(0).f1030 || this.f10700 != null)) {
                z = true;
            }
            if (z && this.f10714 == null) {
                this.f10714 = AbstractC0237.m888(this.f10716, this);
            } else {
                if (z || (onBackInvokedCallback = this.f10714) == null) {
                    return;
                }
                AbstractC0237.m889(this.f10716, onBackInvokedCallback);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m4148(MenuC0836 menuC0836) {
        C1313 c1313;
        if (this.f10718) {
            return;
        }
        this.f10718 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10713;
        actionBarOverlayLayout.m47();
        ActionMenuView actionMenuView = ((C2780) actionBarOverlayLayout.f120).f13571.f234;
        if (actionMenuView != null && (c1313 = actionMenuView.f139) != null) {
            c1313.m2605();
            C0640 c0640 = c1313.f6012;
            if (c0640 != null && c0640.m3361()) {
                c0640.f8390.dismiss();
            }
        }
        Window.Callback callback = this.f10676.getCallback();
        if (callback != null && !this.f10678) {
            callback.onPanelClosed(108, menuC0836);
        }
        this.f10718 = false;
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo381(MenuC0836 menuC0836, MenuItem menuItem) {
        C0182 c0182;
        Window.Callback callback = this.f10676.getCallback();
        if (callback != null && !this.f10678) {
            MenuC0836 menuC0836Mo1910 = menuC0836.mo1910();
            C0182[] c0182Arr = this.f10701;
            int length = c0182Arr != null ? c0182Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0182 = c0182Arr[i];
                    if (c0182 != null && c0182.f1029 == menuC0836Mo1910) {
                        break;
                    }
                    i++;
                } else {
                    c0182 = null;
                    break;
                }
            }
            if (c0182 != null) {
                return callback.onMenuItemSelected(c0182.f1033, menuItem);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m4149(int i, C0182 c0182, MenuC0836 menuC0836) {
        if (menuC0836 == null) {
            if (c0182 == null && i >= 0) {
                C0182[] c0182Arr = this.f10701;
                if (i < c0182Arr.length) {
                    c0182 = c0182Arr[i];
                }
            }
            if (c0182 != null) {
                menuC0836 = c0182.f1029;
            }
        }
        if ((c0182 == null || c0182.f1030) && !this.f10678) {
            WindowCallbackC1354 windowCallbackC1354 = this.f10689;
            Window.Callback callback = this.f10676.getCallback();
            windowCallbackC1354.getClass();
            try {
                windowCallbackC1354.f6254 = true;
                callback.onPanelClosed(i, menuC0836);
            } finally {
                windowCallbackC1354.f6254 = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[PHI: r6
  0x00ce: PHI (r6v2 yyds.ᛴᛴᛵᛸ) = (r6v1 yyds.ᛴᛴᛵᛸ), (r6v8 yyds.ᛴᛴᛵᛸ) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4150(C0182 c0182, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f10678) {
            boolean z = c0182.f1037;
            int i = c0182.f1033;
            if (z) {
                return true;
            }
            C0182 c01822 = this.f10685;
            if (c01822 != null && c01822 != c0182) {
                m4155(c01822, false);
            }
            Window.Callback callback = this.f10676.getCallback();
            if (callback != null) {
                c0182.f1036 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f10713) != null) {
                actionBarOverlayLayout4.m47();
                ((C2780) actionBarOverlayLayout4.f120).f13576 = true;
            }
            if (c0182.f1036 == null) {
                MenuC0836 menuC0836 = c0182.f1029;
                if (menuC0836 == null || c0182.f1034) {
                    if (menuC0836 == null) {
                        Context context = this.f10680;
                        if ((i == 0 || i == 108) && this.f10713 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C0586 c0586 = new C0586(context, 0);
                                c0586.getTheme().setTo(themeNewTheme);
                                context = c0586;
                            }
                        }
                        MenuC0836 menuC08362 = new MenuC0836(context);
                        menuC08362.f3834 = this;
                        MenuC0836 menuC08363 = c0182.f1029;
                        if (menuC08362 != menuC08363) {
                            if (menuC08363 != null) {
                                menuC08363.m1903(c0182.f1031);
                            }
                            c0182.f1029 = menuC08362;
                            C2711 c2711 = c0182.f1031;
                            if (c2711 != null) {
                                menuC08362.m1904(c2711, menuC08362.f3841);
                            }
                        }
                        menuC0836 = c0182.f1029;
                        if (menuC0836 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f10713) != null) {
                                C1198 c1198 = this.f10688;
                                if (c1198 == null) {
                                    c1198 = new C1198(this, 2);
                                    this.f10688 = c1198;
                                }
                                actionBarOverlayLayout2.m48(menuC0836, c1198);
                            }
                            c0182.f1029.m1905();
                            if (callback.onCreatePanelMenu(i, c0182.f1029)) {
                                c0182.f1034 = false;
                            } else {
                                MenuC0836 menuC08364 = c0182.f1029;
                                if (menuC08364 != null) {
                                    if (menuC08364 != null) {
                                        menuC08364.m1903(c0182.f1031);
                                    }
                                    c0182.f1029 = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f10713) != null) {
                                    actionBarOverlayLayout.m48(null, this.f10688);
                                }
                            }
                        }
                    }
                }
                c0182.f1029.m1905();
                Bundle bundle = c0182.f1041;
                if (bundle != null) {
                    c0182.f1029.m1913(bundle);
                    c0182.f1041 = null;
                }
                if (!callback.onPreparePanel(0, c0182.f1036, c0182.f1029)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f10713) != null) {
                        actionBarOverlayLayout3.m48(null, this.f10688);
                    }
                    c0182.f1029.m1908();
                    return false;
                }
                c0182.f1029.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0182.f1029.m1908();
            }
            c0182.f1037 = true;
            c0182.f1038 = false;
            this.f10685 = c0182;
            return true;
        }
        return false;
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo4151(View view, ViewGroup.LayoutParams layoutParams) {
        m4156();
        ViewGroup viewGroup = (ViewGroup) this.f10675.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f10689.m2755(this.f10676.getCallback());
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo4152(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f10709 && i == 108) {
            return false;
        }
        if (this.f10707 && i == 1) {
            this.f10707 = false;
        }
        if (i == 1) {
            m4166();
            this.f10709 = true;
            return true;
        }
        if (i == 2) {
            m4166();
            this.f10715 = true;
            return true;
        }
        if (i == 5) {
            m4166();
            this.f10705 = true;
            return true;
        }
        if (i == 10) {
            m4166();
            this.f10679 = true;
            return true;
        }
        if (i == 108) {
            m4166();
            this.f10707 = true;
            return true;
        }
        if (i != 109) {
            return this.f10676.requestFeature(i);
        }
        m4166();
        this.f10722 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final boolean m4153() {
        InterfaceC0127 interfaceC0127;
        C2784 c2784;
        boolean z = this.f10703;
        this.f10703 = false;
        C0182 c0182M4163 = m4163(0);
        if (!c0182M4163.f1030) {
            AbstractC0451 abstractC0451 = this.f10700;
            if (abstractC0451 != null) {
                abstractC0451.mo834();
                return true;
            }
            m4162();
            C0528 c0528 = this.f10719;
            if (c0528 == null || (interfaceC0127 = c0528.f2534) == null || (c2784 = ((C2780) interfaceC0127).f13571.f221) == null || c2784.f13608 == null) {
                return false;
            }
            C2784 c27842 = ((C2780) interfaceC0127).f13571.f221;
            C1148 c1148 = c27842 == null ? null : c27842.f13608;
            if (c1148 != null) {
                c1148.collapseActionView();
            }
        } else if (!z) {
            m4155(c0182M4163, true);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final AbstractC2315 m4154(Context context) {
        C1871 c1871 = this.f10686;
        if (c1871 == null) {
            C0644 c0644 = C0644.f3098;
            if (c0644 == null) {
                Context applicationContext = context.getApplicationContext();
                c0644 = new C0644(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                C0644.f3098 = c0644;
            }
            c1871 = new C1871(this, c0644);
            this.f10686 = c1871;
        }
        return c1871;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m4155(C0182 c0182, boolean z) {
        C2179 c2179;
        ActionBarOverlayLayout actionBarOverlayLayout;
        C1313 c1313;
        if (z && c0182.f1033 == 0 && (actionBarOverlayLayout = this.f10713) != null) {
            actionBarOverlayLayout.m47();
            ActionMenuView actionMenuView = ((C2780) actionBarOverlayLayout.f120).f13571.f234;
            if (actionMenuView != null && (c1313 = actionMenuView.f139) != null && c1313.m2603()) {
                m4148(c0182.f1029);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f10680.getSystemService("window");
        if (windowManager != null && c0182.f1030 && (c2179 = c0182.f1032) != null) {
            windowManager.removeView(c2179);
            if (z) {
                m4149(c0182.f1033, c0182, null);
            }
        }
        c0182.f1037 = false;
        c0182.f1038 = false;
        c0182.f1030 = false;
        c0182.f1042 = null;
        c0182.f1028 = true;
        if (this.f10685 == c0182) {
            this.f10685 = null;
        }
        if (c0182.f1033 == 0) {
            m4147();
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m4156() {
        ViewGroup viewGroup;
        if (this.f10706) {
            return;
        }
        Context context = this.f10680;
        int[] iArr = AbstractC1592.f8107;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C0188.m800("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo4152(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo4152(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo4152(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo4152(10);
        }
        this.f10677 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m4168();
        this.f10676.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f10709) {
            viewGroup = this.f10679 ? (ViewGroup) layoutInflaterFrom.inflate(com.p000ss.android.ugc.aweme.yyds.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.p000ss.android.ugc.aweme.yyds.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f10677) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.p000ss.android.ugc.aweme.yyds.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f10722 = false;
            this.f10707 = false;
        } else if (this.f10707) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0586(context, typedValue.resourceId) : context).inflate(com.p000ss.android.ugc.aweme.yyds.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.decor_content_parent);
            this.f10713 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f10676.getCallback());
            if (this.f10722) {
                this.f10713.m49(109);
            }
            if (this.f10715) {
                this.f10713.m49(2);
            }
            if (this.f10705) {
                this.f10713.m49(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10707 + ", windowActionBarOverlay: " + this.f10722 + ", android:windowIsFloating: " + this.f10677 + ", windowActionModeOverlay: " + this.f10679 + ", windowNoTitle: " + this.f10709 + " }");
        }
        C1198 c1198 = new C1198(this, i);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC2709.m4820(viewGroup, c1198);
        if (this.f10713 == null) {
            this.f10710 = (TextView) viewGroup.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.title);
        }
        Method method = AbstractC1603.f8163;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f10676.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f10676.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1198(this, i2));
        this.f10675 = viewGroup;
        Object obj = this.f10704;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f10693;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10713;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                C0528 c0528 = this.f10719;
                if (c0528 != null) {
                    C2780 c2780 = (C2780) c0528.f2534;
                    if (!c2780.f13574) {
                        Toolbar toolbar = c2780.f13571;
                        c2780.f13567 = title;
                        if ((c2780.f13573 & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c2780.f13574) {
                                AbstractC1640.m3342(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f10710;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f10675.findViewById(R.id.content);
        View decorView = this.f10676.getDecorView();
        contentFrameLayout2.f148.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = AbstractC1640.f8352;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f10706 = true;
        C0182 c0182M4163 = m4163(0);
        if (this.f10678 || c0182M4163.f1029 != null) {
            return;
        }
        m4159(108);
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo4157() {
        String strM4349;
        this.f10684 = true;
        m4164(false, true);
        m4168();
        Object obj = this.f10704;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM4349 = AbstractC2328.m4349(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM4349 = null;
            }
            if (strM4349 != null) {
                C0528 c0528 = this.f10719;
                if (c0528 == null) {
                    this.f10691 = true;
                } else {
                    c0528.m1369(true);
                }
            }
            synchronized (AbstractC2423.f11964) {
                AbstractC2423.m4472(this);
                AbstractC2423.f11960.add(new WeakReference(this));
            }
        }
        this.f10717 = new Configuration(this.f10680.getResources().getConfiguration());
        this.f10698 = true;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean m4158(C0182 c0182, int i, KeyEvent keyEvent) {
        MenuC0836 menuC0836;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0182.f1037 || m4150(c0182, keyEvent)) && (menuC0836 = c0182.f1029) != null) {
            return menuC0836.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m4159(int i) {
        this.f10721 = (1 << i) | this.f10721;
        if (this.f10692) {
            return;
        }
        View decorView = this.f10676.getDecorView();
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        decorView.postOnAnimation(this.f10682);
        this.f10692 = true;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m4160(int i) {
        C0182 c0182M4163 = m4163(i);
        if (c0182M4163.f1029 != null) {
            Bundle bundle = new Bundle();
            c0182M4163.f1029.m1901(bundle);
            if (bundle.size() > 0) {
                c0182M4163.f1041 = bundle;
            }
            c0182M4163.f1029.m1905();
            c0182M4163.f1029.clear();
        }
        c0182M4163.f1034 = true;
        c0182M4163.f1028 = true;
        if ((i == 108 || i == 0) && this.f10713 != null) {
            C0182 c0182M41632 = m4163(0);
            c0182M41632.f1037 = false;
            m4150(c0182M41632, null);
        }
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void mo4161(View view) {
        m4156();
        ViewGroup viewGroup = (ViewGroup) this.f10675.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f10689.m2755(this.f10676.getCallback());
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m4162() {
        C0528 c0528;
        m4156();
        if (this.f10707 && (c0528 = this.f10719) == null) {
            Object obj = this.f10704;
            if (obj instanceof Activity) {
                c0528 = new C0528((Activity) obj, this.f10722);
                this.f10719 = c0528;
            } else if (obj instanceof Dialog) {
                c0528 = new C0528((Dialog) obj);
                this.f10719 = c0528;
            }
            if (c0528 != null) {
                c0528.m1369(this.f10691);
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final C0182 m4163(int i) {
        C0182[] c0182Arr = this.f10701;
        if (c0182Arr == null || c0182Arr.length <= i) {
            C0182[] c0182Arr2 = new C0182[i + 1];
            if (c0182Arr != null) {
                System.arraycopy(c0182Arr, 0, c0182Arr2, 0, c0182Arr.length);
            }
            this.f10701 = c0182Arr2;
            c0182Arr = c0182Arr2;
        }
        C0182 c0182 = c0182Arr[i];
        if (c0182 != null) {
            return c0182;
        }
        C0182 c01822 = new C0182();
        c01822.f1033 = i;
        c01822.f1028 = false;
        c0182Arr[i] = c01822;
        return c01822;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4164(boolean z, boolean z2) {
        C1773 c1773M4534;
        int i;
        boolean z3;
        C1773 c1773;
        C1773 c17732;
        if (this.f10678) {
            return false;
        }
        int i2 = this.f10687;
        if (i2 == -100) {
            i2 = AbstractC2423.f11967;
        }
        boolean z4 = true;
        Context context = this.f10680;
        int iMo3657 = -1;
        if (i2 != -100) {
            if (i2 == -1) {
                iMo3657 = i2;
            } else if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        C1871 c1871 = this.f10720;
                        if (c1871 == null) {
                            c1871 = new C1871(this, context);
                            this.f10720 = c1871;
                        }
                        iMo3657 = c1871.mo3657();
                    } else {
                        C0188.m800("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        iMo3657 = 0;
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                iMo3657 = m4154(context).mo3657();
            }
        }
        if (Build.VERSION.SDK_INT >= 33 || Build.VERSION.SDK_INT >= 33 || (c1773 = AbstractC2423.f11961) == null) {
            c1773M4534 = null;
        } else {
            C1839 c1839 = c1773.f8884;
            c1773M4534 = AbstractC2495.m4534(context.getApplicationContext().getResources().getConfiguration());
            if (c1839.f9217.isEmpty()) {
                c17732 = C1773.f8883;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i3 = 0;
                while (i3 < c1773M4534.f8884.f9217.size() + c1839.f9217.size()) {
                    Locale locale = i3 < c1839.f9217.size() ? c1839.f9217.get(i3) : c1773M4534.f8884.f9217.get(i3 - c1839.f9217.size());
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i3++;
                }
                c17732 = new C1773(new C1839(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
            }
            if (!c17732.f8884.f9217.isEmpty()) {
                c1773M4534 = c17732;
            }
        }
        if (!z2 && c1773M4534 != null) {
            c1773M4534 = AbstractC2495.m4534(context.getResources().getConfiguration());
        }
        int i4 = iMo3657 != 1 ? iMo3657 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i4 | (configuration.uiMode & (-49));
        if (c1773M4534 != null) {
            AbstractC2495.m4536(configuration, c1773M4534);
        }
        boolean z5 = this.f10699;
        Object obj = this.f10704;
        if (z5 || !(obj instanceof Activity)) {
            this.f10699 = true;
            i = this.f10696;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.f10696 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f10696 = 0;
                }
                this.f10699 = true;
                i = this.f10696;
            }
        }
        Configuration configuration2 = this.f10717;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i5 = configuration2.uiMode & 48;
        int i6 = configuration.uiMode & 48;
        C1773 c1773M45342 = AbstractC2495.m4534(configuration2);
        C1773 c1773M45343 = c1773M4534 == null ? null : AbstractC2495.m4534(configuration);
        int i7 = i5 != i6 ? 512 : 0;
        if (c1773M45343 != null && !c1773M45342.equals(c1773M45343)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.f10684 && ((f10673 || this.f10698) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z4 = z3;
        } else {
            boolean z6 = (i7 & i) == i7;
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (c1773M45343 != null) {
                AbstractC2495.m4536(configuration3, c1773M45343);
            }
            resources.updateConfiguration(configuration3, null);
            int i8 = this.f10690;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.f10690, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC2345) {
                    if (((InterfaceC2345) activity2).mo14().f313.m2970(EnumC1464.f6967)) {
                        activity2.onConfigurationChanged(configuration3);
                    }
                } else if (this.f10698 && !this.f10678) {
                    activity2.onConfigurationChanged(configuration3);
                }
            }
        }
        if (z4 && c1773M45343 != null) {
            AbstractC2495.m4535(AbstractC2495.m4534(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m4154(context).m4325();
        } else {
            C1871 c18712 = this.f10686;
            if (c18712 != null) {
                c18712.m4326();
            }
        }
        C1871 c18713 = this.f10720;
        if (i2 == 3) {
            if (c18713 == null) {
                c18713 = new C1871(this, context);
                this.f10720 = c18713;
            }
            c18713.m4325();
        } else if (c18713 != null) {
            c18713.m4326();
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4165(Window window) {
        Drawable drawableM3177;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f10676 != null) {
            C0188.m800("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC1354) {
            C0188.m800("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC1354 windowCallbackC1354 = new WindowCallbackC1354(this, callback);
        this.f10689 = windowCallbackC1354;
        window.setCallback(windowCallbackC1354);
        Context context = this.f10680;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f10672);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM3177 = null;
        } else {
            C1541 c1541M3170 = C1541.m3170();
            synchronized (c1541M3170) {
                drawableM3177 = c1541M3170.f7388.m3177(context, resourceId, true);
            }
        }
        if (drawableM3177 != null) {
            window.setBackgroundDrawable(drawableM3177);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f10676 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f10716) != null) {
            return;
        }
        Object obj = this.f10704;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f10714) != null) {
            AbstractC0237.m889(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10714 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f10716 = AbstractC0237.m887(activity);
            } else {
                this.f10716 = null;
            }
        }
        m4147();
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final void m4166() {
        if (this.f10706) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void mo4167(CharSequence charSequence) {
        this.f10693 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10713;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        C0528 c0528 = this.f10719;
        if (c0528 == null) {
            TextView textView = this.f10710;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C2780 c2780 = (C2780) c0528.f2534;
        if (c2780.f13574) {
            return;
        }
        Toolbar toolbar = c2780.f13571;
        c2780.f13567 = charSequence;
        if ((c2780.f13573 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2780.f13574) {
                AbstractC1640.m3342(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m4168() {
        if (this.f10676 == null) {
            Object obj = this.f10704;
            if (obj instanceof Activity) {
                m4165(((Activity) obj).getWindow());
            }
        }
        if (this.f10676 != null) {
            return;
        }
        C0188.m800("We have not been given a Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4169(KeyEvent keyEvent) {
        boolean z;
        boolean zM4150;
        ActionMenuView actionMenuView;
        C1313 c1313;
        C1313 c13132;
        C1313 c13133;
        Object obj = this.f10704;
        if (((obj instanceof InterfaceC2523) || (obj instanceof DialogC0194)) && this.f10676.getDecorView() != null) {
            WeakHashMap weakHashMap = AbstractC1640.f8352;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC1354 windowCallbackC1354 = this.f10689;
            Window.Callback callback = this.f10676.getCallback();
            windowCallbackC1354.getClass();
            try {
                windowCallbackC1354.f6251 = true;
                if (!callback.dispatchKeyEvent(keyEvent)) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode == 4) {
                            this.f10703 = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                C0182 c0182M4163 = m4163(0);
                                if (!c0182M4163.f1030) {
                                    m4150(c0182M4163, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f10700 == null) {
                                C0182 c0182M41632 = m4163(0);
                                ActionBarOverlayLayout actionBarOverlayLayout = this.f10713;
                                Context context = this.f10680;
                                if (actionBarOverlayLayout != null) {
                                    actionBarOverlayLayout.m47();
                                    Toolbar toolbar = ((C2780) actionBarOverlayLayout.f120).f13571;
                                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f234) == null || !actionMenuView.f140 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        boolean z2 = c0182M41632.f1030;
                                        if (z2 || c0182M41632.f1038) {
                                            m4155(c0182M41632, true);
                                            z = z2;
                                        } else {
                                            if (c0182M41632.f1037) {
                                                if (c0182M41632.f1034) {
                                                    c0182M41632.f1037 = false;
                                                    zM4150 = m4150(c0182M41632, keyEvent);
                                                } else {
                                                    zM4150 = true;
                                                }
                                                if (zM4150) {
                                                    m4171(c0182M41632, keyEvent);
                                                    z = true;
                                                }
                                            }
                                            z = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10713;
                                        actionBarOverlayLayout2.m47();
                                        ActionMenuView actionMenuView2 = ((C2780) actionBarOverlayLayout2.f120).f13571.f234;
                                        if (actionMenuView2 == null || (c13132 = actionMenuView2.f139) == null || !c13132.m2603()) {
                                            if (!this.f10678 && m4150(c0182M41632, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f10713;
                                                actionBarOverlayLayout3.m47();
                                                ActionMenuView actionMenuView3 = ((C2780) actionBarOverlayLayout3.f120).f13571.f234;
                                                if (actionMenuView3 != null && (c1313 = actionMenuView3.f139) != null && c1313.m2604()) {
                                                    z = true;
                                                }
                                            }
                                            z = false;
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = this.f10713;
                                            actionBarOverlayLayout4.m47();
                                            ActionMenuView actionMenuView4 = ((C2780) actionBarOverlayLayout4.f120).f13571.f234;
                                            if (actionMenuView4 == null || (c13133 = actionMenuView4.f139) == null || !c13133.m2605()) {
                                                z = false;
                                            }
                                        }
                                    }
                                    if (z) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (!m4153()) {
                        return false;
                    }
                }
            } finally {
                windowCallbackC1354.f6251 = false;
            }
        }
        return true;
    }

    @Override // yyds.AbstractC2423
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void mo4170(int i) {
        m4156();
        ViewGroup viewGroup = (ViewGroup) this.f10675.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f10680).inflate(i, viewGroup);
        this.f10689.m2755(this.f10676.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m2603() != false) goto L20;
     */
    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo407(MenuC0836 menuC0836) {
        ActionMenuView actionMenuView;
        C1313 c1313;
        C1313 c13132;
        C1313 c13133;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10713;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m47();
            Toolbar toolbar = ((C2780) actionBarOverlayLayout.f120).f13571;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f234) != null && actionMenuView.f140) {
                if (ViewConfiguration.get(this.f10680).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10713;
                    actionBarOverlayLayout2.m47();
                    ActionMenuView actionMenuView2 = ((C2780) actionBarOverlayLayout2.f120).f13571.f234;
                    if (actionMenuView2 != null) {
                        C1313 c13134 = actionMenuView2.f139;
                        if (c13134 != null) {
                            if (c13134.f6009 == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f10676.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f10713;
                actionBarOverlayLayout3.m47();
                ActionMenuView actionMenuView3 = ((C2780) actionBarOverlayLayout3.f120).f13571.f234;
                if (actionMenuView3 != null && (c13132 = actionMenuView3.f139) != null && c13132.m2603()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.f10713;
                    actionBarOverlayLayout4.m47();
                    ActionMenuView actionMenuView4 = ((C2780) actionBarOverlayLayout4.f120).f13571.f234;
                    if (actionMenuView4 != null && (c13133 = actionMenuView4.f139) != null) {
                        c13133.m2605();
                    }
                    if (this.f10678) {
                        return;
                    }
                    callback.onPanelClosed(108, m4163(0).f1029);
                    return;
                }
                if (callback == null || this.f10678) {
                    return;
                }
                if (this.f10692 && (1 & this.f10721) != 0) {
                    View decorView = this.f10676.getDecorView();
                    RunnableC1745 runnableC1745 = this.f10682;
                    decorView.removeCallbacks(runnableC1745);
                    runnableC1745.run();
                }
                C0182 c0182M4163 = m4163(0);
                MenuC0836 menuC08362 = c0182M4163.f1029;
                if (menuC08362 == null || c0182M4163.f1034 || !callback.onPreparePanel(0, c0182M4163.f1036, menuC08362)) {
                    return;
                }
                callback.onMenuOpened(108, c0182M4163.f1029);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.f10713;
                actionBarOverlayLayout5.m47();
                ActionMenuView actionMenuView5 = ((C2780) actionBarOverlayLayout5.f120).f13571.f234;
                if (actionMenuView5 == null || (c1313 = actionMenuView5.f139) == null) {
                    return;
                }
                c1313.m2604();
                return;
            }
        }
        C0182 c0182M41632 = m4163(0);
        c0182M41632.f1028 = true;
        m4155(c0182M41632, false);
        m4171(c0182M41632, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4171(C0182 c0182, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c0182.f1030;
        int i2 = c0182.f1033;
        if (z || this.f10678) {
            return;
        }
        Context context = this.f10680;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f10676.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0182.f1029)) {
            m4155(c0182, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m4150(c0182, keyEvent)) {
            return;
        }
        C2179 c2179 = c0182.f1032;
        if (c2179 != null && !c0182.f1028) {
            View view = c0182.f1036;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c0182.f1038 = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c0182.f1040;
            layoutParams2.windowAnimations = c0182.f1043;
            windowManager.addView(c0182.f1032, layoutParams2);
            c0182.f1030 = true;
            if (i2 != 0) {
                m4147();
                return;
            }
            return;
        }
        if (c2179 == null) {
            m4162();
            C0528 c0528 = this.f10719;
            Context contextM1367 = c0528 != null ? c0528.m1367() : null;
            if (contextM1367 != null) {
                context = contextM1367;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(com.p000ss.android.ugc.aweme.yyds.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0586 c0586 = new C0586(context, 0);
            c0586.getTheme().setTo(themeNewTheme);
            c0182.f1039 = c0586;
            TypedArray typedArrayObtainStyledAttributes = c0586.obtainStyledAttributes(AbstractC1592.f8107);
            c0182.f1035 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            c0182.f1043 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            c0182.f1032 = new C2179(this, c0182.f1039);
            c0182.f1040 = 81;
        } else if (c0182.f1028 && c2179.getChildCount() > 0) {
            c0182.f1032.removeAllViews();
        }
        View view2 = c0182.f1036;
        if (view2 == null) {
            if (c0182.f1029 != null) {
                C1198 c1198 = this.f10702;
                if (c1198 == null) {
                    c1198 = new C1198(this, 3);
                    this.f10702 = c1198;
                }
                if (c0182.f1031 == null) {
                    C2711 c2711 = new C2711(c0182.f1039);
                    c0182.f1031 = c2711;
                    c2711.f13326 = c1198;
                    MenuC0836 menuC0836 = c0182.f1029;
                    menuC0836.m1904(c2711, menuC0836.f3841);
                }
                C2711 c27112 = c0182.f1031;
                C2179 c21792 = c0182.f1032;
                if (c27112.f13328 == null) {
                    c27112.f13328 = (ExpandedMenuView) c27112.f13329.inflate(com.p000ss.android.ugc.aweme.yyds.R.layout.abc_expanded_menu_layout, (ViewGroup) c21792, false);
                    C0447 c0447 = c27112.f13324;
                    if (c0447 == null) {
                        c0447 = new C0447(c27112);
                        c27112.f13324 = c0447;
                    }
                    c27112.f13328.setAdapter((ListAdapter) c0447);
                    c27112.f13328.setOnItemClickListener(c27112);
                }
                ExpandedMenuView expandedMenuView = c27112.f13328;
                c0182.f1042 = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            c0182.f1028 = true;
            return;
        }
        c0182.f1042 = view2;
        if (c0182.f1042 != null) {
            if (c0182.f1036 == null) {
                C2711 c27113 = c0182.f1031;
                C0447 c04472 = c27113.f13324;
                if (c04472 == null) {
                    c04472 = new C0447(c27113);
                    c27113.f13324 = c04472;
                }
            }
            ViewGroup.LayoutParams layoutParams3 = c0182.f1042.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0182.f1032.setBackgroundResource(c0182.f1035);
            ViewParent parent = c0182.f1042.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0182.f1042);
            }
            c0182.f1032.addView(c0182.f1042, layoutParams3);
            if (!c0182.f1042.hasFocus()) {
                c0182.f1042.requestFocus();
            }
        }
        c0182.f1028 = true;
        return;
        i = -2;
        c0182.f1038 = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = c0182.f1040;
        layoutParams22.windowAnimations = c0182.f1043;
        windowManager.addView(c0182.f1032, layoutParams22);
        c0182.f1030 = true;
        if (i2 != 0) {
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
