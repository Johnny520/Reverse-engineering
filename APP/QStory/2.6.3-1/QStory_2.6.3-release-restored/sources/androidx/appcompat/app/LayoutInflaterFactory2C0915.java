package androidx.appcompat.app;

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
import android.os.Handler;
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
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.AbstractC0991;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0970;
import androidx.appcompat.widget.C0972;
import androidx.appcompat.widget.C0973;
import androidx.appcompat.widget.C0975;
import androidx.appcompat.widget.C0977;
import androidx.appcompat.widget.C0982;
import androidx.appcompat.widget.C0983;
import androidx.appcompat.widget.C0993;
import androidx.appcompat.widget.C1040;
import androidx.appcompat.widget.C1044;
import androidx.appcompat.widget.C1050;
import androidx.appcompat.widget.C1070;
import androidx.appcompat.widget.C1074;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.C1130;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.core.os.C3011;
import androidx.core.os.C3015;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3028;
import androidx.core.view.C3115;
import androidx.core.view.InterfaceC3089;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p178.AbstractC8482;
import p204.AbstractC8602;
import p206.C8608;
import p206.C8609;
import p206.InterfaceC8626;
import p206.MenuC8631;
import p208.AbstractC8639;
import p208.C8636;
import p208.C8637;
import p208.C8646;
import p208.InterfaceC8640;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0915 extends AbstractC0941 implements InterfaceC8626, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f498;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f499;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public View f500;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public TextView f501;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f502;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f503;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f504;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ViewGroup f505;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public PopupWindow f506;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ActionBarContextView f507;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public RunnableC0942 f509;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC0935 f510;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final InterfaceC0943 f511;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public WindowCallbackC0930 f512;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Window f513;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Context f514;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f515;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC8639 f516;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0939 f517;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0939 f518;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public ActionBarOverlayLayout f519;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public CharSequence f520;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C8646 f521;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public OnBackInvokedCallback f522;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public OnBackInvokedDispatcher f523;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int f524;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public Configuration f525;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean f526;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean f527;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f528;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f529;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Rect f530;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f531;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C0913 f532;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public Rect f533;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public int f534;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C0929 f536;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f537;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public boolean f538;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C0929 f539;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f540;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f541;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f542;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f543;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C0916[] f544;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C0916 f545;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f546;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public boolean f547;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static final C1130 f496 = new C1130(0);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static final int[] f497 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static final boolean f495 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C3115 f508 = null;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final RunnableC0942 f535 = new RunnableC0942(this, 0);

    public LayoutInflaterFactory2C0915(Context context, Window window, InterfaceC0943 interfaceC0943, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f524 = -100;
        this.f514 = context;
        this.f511 = interfaceC0943;
        this.f515 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
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
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f524 = ((LayoutInflaterFactory2C0915) appCompatActivity.getDelegate()).f524;
            }
        }
        if (this.f524 == -100) {
            String name = this.f515.getClass().getName();
            C1130 c1130 = f496;
            Integer num = (Integer) c1130.get(name);
            if (num != null) {
                this.f524 = num.intValue();
                c1130.remove(this.f515.getClass().getName());
            }
        }
        if (window != null) {
            m799(window);
        }
        C0977.m1098();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Configuration m773(Context context, int i, C3011 c3011, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c3011 != null) {
            AbstractC0921.m809(configuration2, c3011);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C3011 m774(Context context) {
        C3011 c3011;
        C3011 c30112;
        if (Build.VERSION.SDK_INT >= 33 || (c3011 = AbstractC0941.f619) == null) {
            return null;
        }
        C3015 c3015 = c3011.f6798;
        C3011 c3011M811 = AbstractC0921.m811(context.getApplicationContext().getResources().getConfiguration());
        if (c3015.f6800.isEmpty()) {
            c30112 = C3011.f6797;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c3011M811.f6798.f6800.size() + c3015.f6800.size()) {
                Locale locale = i < c3015.f6800.size() ? c3015.f6800.get(i) : c3011M811.f6798.f6800.get(i - c3015.f6800.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c30112 = new C3011(new C3015(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c30112.f6798.f6800.isEmpty() ? c3011M811 : c30112;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0913 c0913;
        Context c8637;
        View c0970;
        View view2 = null;
        if (this.f532 == null) {
            int[] iArr = AbstractC8602.f21452;
            Context context2 = this.f514;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f532 = new C0913();
            } else {
                try {
                    this.f532 = (C0913) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f532 = new C0913();
                }
            }
        }
        c0913 = this.f532;
        int i = AbstractC0991.f951;
        c0913.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21438, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        c8637 = (resourceId == 0 || ((context instanceof C8637) && ((C8637) context).f21634 == resourceId)) ? context : new C8637(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                c0970 = new C0970(c8637, attributeSet);
                break;
            case "CheckedTextView":
                c0970 = new C1040(c8637, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c0970 = new C0982(c8637, attributeSet);
                break;
            case "TextView":
                c0970 = c0913.mo767(c8637, attributeSet);
                break;
            case "ImageButton":
                c0970 = new C0973(c8637, attributeSet, C0328R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                c0970 = new C0972(c8637, attributeSet);
                break;
            case "Spinner":
                c0970 = new C1074(c8637, attributeSet);
                break;
            case "RadioButton":
                c0970 = c0913.mo768(c8637, attributeSet);
                break;
            case "ToggleButton":
                c0970 = new C1070(c8637, attributeSet);
                break;
            case "ImageView":
                c0970 = new C0983(c8637, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                c0970 = c0913.mo771(c8637, attributeSet);
                break;
            case "CheckBox":
                c0970 = c0913.mo769(c8637, attributeSet);
                break;
            case "EditText":
                c0970 = new C0975(c8637, attributeSet);
                break;
            case "Button":
                c0970 = c0913.mo770(c8637, attributeSet);
                break;
            default:
                c0970 = null;
                break;
        }
        if (c0970 == null && context != c8637) {
            Object[] objArr = c0913.f494;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c8637;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C0913.f493;
                        if (i2 < 3) {
                            View viewM766 = c0913.m766(c8637, str, strArr[i2]);
                            if (viewM766 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM766;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM7662 = c0913.m766(c8637, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM7662;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c0970 = view2;
        }
        if (c0970 != null) {
            Context context3 = c0970.getContext();
            if ((context3 instanceof ContextWrapper) && c0970.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0913.f490);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0970.setOnClickListener(new ViewOnClickListenerC0917(string2, c0970));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c8637.obtainStyledAttributes(attributeSet, C0913.f489);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    new C3028(C0328R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m4563(Boolean.valueOf(z), c0970);
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c8637.obtainStyledAttributes(attributeSet, C0913.f488);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC3103.m4801(c0970, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c8637.obtainStyledAttributes(attributeSet, C0913.f487);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                    new C3028(C0328R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m4563(Boolean.valueOf(z2), c0970);
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c0970;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int m775(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C6755.m11870("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f539 == null) {
                            this.f539 = new C0929(this, context);
                        }
                        return this.f539.mo872();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m779(context).mo872();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m776(int i) {
        this.f534 = (1 << i) | this.f534;
        if (this.f538) {
            return;
        }
        View decorView = this.f513.getDecorView();
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        decorView.postOnAnimation(this.f535);
        this.f538 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m777() {
        m794();
        if (this.f498 && this.f510 == null) {
            Object obj = this.f515;
            if (obj instanceof Activity) {
                this.f510 = new C0958((Activity) obj, this.f499);
            } else if (obj instanceof Dialog) {
                this.f510 = new C0958((Dialog) obj);
            }
            AbstractC0935 abstractC0935 = this.f510;
            if (abstractC0935 != null) {
                abstractC0935.mo740(this.f531);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0916 m778(int i) {
        C0916[] c0916Arr = this.f544;
        if (c0916Arr == null || c0916Arr.length <= i) {
            C0916[] c0916Arr2 = new C0916[i + 1];
            if (c0916Arr != null) {
                System.arraycopy(c0916Arr, 0, c0916Arr2, 0, c0916Arr.length);
            }
            this.f544 = c0916Arr2;
            c0916Arr = c0916Arr2;
        }
        C0916 c0916 = c0916Arr[i];
        if (c0916 != null) {
            return c0916;
        }
        C0916 c09162 = new C0916();
        c09162.f553 = i;
        c09162.f554 = false;
        c0916Arr[i] = c09162;
        return c09162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC0927 m779(Context context) {
        if (this.f536 == null) {
            if (C0955.f662 == null) {
                Context applicationContext = context.getApplicationContext();
                C0955.f662 = new C0955(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f536 = new C0929(this, C0955.f662);
        }
        return this.f536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m780() {
        if (this.f513 == null) {
            Object obj = this.f515;
            if (obj instanceof Activity) {
                m799(((Activity) obj).getWindow());
            }
        }
        if (this.f513 != null) {
            return;
        }
        C6755.m11870("We have not been given a Window");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m781() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f523 != null && (m778(0).f555 || this.f516 != null)) {
                z = true;
            }
            if (z && this.f522 == null) {
                this.f522 = AbstractC0919.m807(this.f523, this);
            } else {
                if (z || (onBackInvokedCallback = this.f522) == null) {
                    return;
                }
                AbstractC0919.m806(this.f523, onBackInvokedCallback);
                this.f522 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m782() {
        if (this.f504) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m783(C0916 c0916, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f526) {
            boolean z = c0916.f560;
            int i = c0916.f553;
            if (z) {
                return true;
            }
            C0916 c09162 = this.f545;
            if (c09162 != null && c09162 != c0916) {
                m791(c09162, false);
            }
            Window.Callback callback = this.f513.getCallback();
            if (callback != null) {
                c0916.f559 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f519) != null) {
                actionBarOverlayLayout4.m1038();
                ((C0993) actionBarOverlayLayout4.f785).f964 = true;
            }
            if (c0916.f559 == null && (!z2 || !(this.f510 instanceof C0907))) {
                MenuC8631 menuC8631 = c0916.f558;
                if (menuC8631 == null || c0916.f556) {
                    if (menuC8631 == null) {
                        Context context = this.f514;
                        if ((i == 0 || i == 108) && this.f519 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C0328R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(C0328R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(C0328R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C8637 c8637 = new C8637(context, 0);
                                c8637.getTheme().setTo(themeNewTheme);
                                context = c8637;
                            }
                        }
                        MenuC8631 menuC86312 = new MenuC8631(context);
                        menuC86312.f21606 = this;
                        MenuC8631 menuC86313 = c0916.f558;
                        if (menuC86312 != menuC86313) {
                            if (menuC86313 != null) {
                                menuC86313.m13722(c0916.f562);
                            }
                            c0916.f558 = menuC86312;
                            C8608 c8608 = c0916.f562;
                            if (c8608 != null) {
                                menuC86312.m13714(c8608, menuC86312.f21614);
                            }
                        }
                        if (c0916.f558 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f519) != null) {
                                if (this.f518 == null) {
                                    this.f518 = new C0939(this, 2);
                                }
                                actionBarOverlayLayout2.m1039(c0916.f558, this.f518);
                            }
                            c0916.f558.m13718();
                            if (callback.onCreatePanelMenu(i, c0916.f558)) {
                                c0916.f556 = false;
                            } else {
                                MenuC8631 menuC86314 = c0916.f558;
                                if (menuC86314 != null) {
                                    if (menuC86314 != null) {
                                        menuC86314.m13722(c0916.f562);
                                    }
                                    c0916.f558 = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f519) != null) {
                                    actionBarOverlayLayout.m1039(null, this.f518);
                                }
                            }
                        }
                    }
                }
                c0916.f558.m13718();
                Bundle bundle = c0916.f557;
                if (bundle != null) {
                    c0916.f558.m13717(bundle);
                    c0916.f557 = null;
                }
                if (!callback.onPreparePanel(0, c0916.f559, c0916.f558)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f519) != null) {
                        actionBarOverlayLayout3.m1039(null, this.f518);
                    }
                    c0916.f558.m13720();
                    return false;
                }
                c0916.f558.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0916.f558.m13720();
            }
            c0916.f560 = true;
            c0916.f561 = false;
            this.f545 = c0916;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m784(C0916 c0916, int i, KeyEvent keyEvent) {
        MenuC8631 menuC8631;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0916.f560 || m783(c0916, keyEvent)) && (menuC8631 = c0916.f558) != null) {
            return menuC8631.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f21478.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m785(C0916 c0916, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c0916.f555;
        int i2 = c0916.f553;
        if (z || this.f526) {
            return;
        }
        Context context = this.f514;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f513.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0916.f558)) {
            m791(c0916, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m783(c0916, keyEvent)) {
            return;
        }
        C0926 c0926 = c0916.f549;
        if (c0926 != null && !c0916.f554) {
            View view = c0916.f559;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c0916.f561 = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c0916.f551;
            layoutParams2.windowAnimations = c0916.f550;
            windowManager.addView(c0916.f549, layoutParams2);
            c0916.f555 = true;
            if (i2 != 0) {
                m781();
                return;
            }
            return;
        }
        if (c0926 == null) {
            m777();
            AbstractC0935 abstractC0935 = this.f510;
            Context contextMo729 = abstractC0935 != null ? abstractC0935.mo729() : null;
            if (contextMo729 != null) {
                context = contextMo729;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C0328R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(C0328R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(605225653, true);
            }
            C8637 c8637 = new C8637(context, 0);
            c8637.getTheme().setTo(themeNewTheme);
            c0916.f563 = c8637;
            TypedArray typedArrayObtainStyledAttributes = c8637.obtainStyledAttributes(AbstractC8602.f21452);
            c0916.f552 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            c0916.f550 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            c0916.f549 = new C0926(this, c0916.f563);
            c0916.f551 = 81;
        } else if (c0916.f554 && c0926.getChildCount() > 0) {
            c0916.f549.removeAllViews();
        }
        View view2 = c0916.f559;
        if (view2 == null) {
            if (c0916.f558 != null) {
                if (this.f517 == null) {
                    this.f517 = new C0939(this, 3);
                }
                C0939 c0939 = this.f517;
                if (c0916.f562 == null) {
                    C8608 c8608 = new C8608(c0916.f563);
                    c0916.f562 = c8608;
                    c8608.f21476 = c0939;
                    MenuC8631 menuC8631 = c0916.f558;
                    menuC8631.m13714(c8608, menuC8631.f21614);
                }
                C8608 c86082 = c0916.f562;
                C0926 c09262 = c0916.f549;
                if (c86082.f21477 == null) {
                    c86082.f21477 = (ExpandedMenuView) c86082.f21479.inflate(C0328R.layout.abc_expanded_menu_layout, (ViewGroup) c09262, false);
                    if (c86082.f21478 == null) {
                        c86082.f21478 = new C8609(c86082);
                    }
                    c86082.f21477.setAdapter((ListAdapter) c86082.f21478);
                    c86082.f21477.setOnItemClickListener(c86082);
                }
                ExpandedMenuView expandedMenuView = c86082.f21477;
                c0916.f548 = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            c0916.f554 = true;
            return;
        }
        c0916.f548 = view2;
        if (c0916.f548 != null) {
            if (c0916.f559 == null) {
                C8608 c86083 = c0916.f562;
                if (c86083.f21478 == null) {
                    c86083.f21478 = new C8609(c86083);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = c0916.f548.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0916.f549.setBackgroundResource(c0916.f552);
            ViewParent parent = c0916.f548.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0916.f548);
            }
            c0916.f549.addView(c0916.f548, layoutParams3);
            if (!c0916.f548.hasFocus()) {
                c0916.f548.requestFocus();
            }
        }
        c0916.f554 = true;
        return;
        i = -2;
        c0916.f561 = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = c0916.f551;
        layoutParams22.windowAnimations = c0916.f550;
        windowManager.addView(c0916.f549, layoutParams22);
        c0916.f555 = true;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m786() {
        boolean z = this.f529;
        this.f529 = false;
        C0916 c0916M778 = m778(0);
        if (!c0916M778.f555) {
            AbstractC8639 abstractC8639 = this.f516;
            if (abstractC8639 != null) {
                abstractC8639.mo971();
                return true;
            }
            m777();
            AbstractC0935 abstractC0935 = this.f510;
            if (abstractC0935 == null || !abstractC0935.mo732()) {
                return false;
            }
        } else if (!z) {
            m791(c0916M778, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo787() {
        if (this.f515 instanceof Activity) {
            synchronized (AbstractC0941.f614) {
                AbstractC0941.m886(this);
            }
        }
        if (this.f538) {
            this.f513.getDecorView().removeCallbacks(this.f535);
        }
        this.f526 = true;
        if (this.f524 != -100) {
            Object obj = this.f515;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f496.put(this.f515.getClass().getName(), Integer.valueOf(this.f524));
            } else {
                f496.remove(this.f515.getClass().getName());
            }
        }
        AbstractC0935 abstractC0935 = this.f510;
        if (abstractC0935 != null) {
            abstractC0935.mo737();
        }
        C0929 c0929 = this.f536;
        if (c0929 != null) {
            c0929.m867();
        }
        C0929 c09292 = this.f539;
        if (c09292 != null) {
            c09292.m867();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo788() {
        String strM13475;
        this.f528 = true;
        m798(false, true);
        m780();
        Object obj = this.f515;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM13475 = AbstractC8482.m13475(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM13475 = null;
            }
            if (strM13475 != null) {
                AbstractC0935 abstractC0935 = this.f510;
                if (abstractC0935 == null) {
                    this.f531 = true;
                } else {
                    abstractC0935.mo740(true);
                }
            }
            synchronized (AbstractC0941.f614) {
                AbstractC0941.m886(this);
                AbstractC0941.f617.add(new WeakReference(this));
            }
        }
        this.f525 = new Configuration(this.f514.getResources().getConfiguration());
        this.f527 = true;
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo789() {
        if (this.f510 != null) {
            m777();
            if (this.f510.mo728()) {
                return;
            }
            m776(0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo790() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f514);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0915) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m791(C0916 c0916, boolean z) {
        C0926 c0926;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && c0916.f553 == 0 && (actionBarOverlayLayout = this.f519) != null) {
            actionBarOverlayLayout.m1038();
            if (((C0993) actionBarOverlayLayout.f785).f957.m1067()) {
                m792(c0916.f558);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f514.getSystemService("window");
        if (windowManager != null && c0916.f555 && (c0926 = c0916.f549) != null) {
            windowManager.removeView(c0926);
            if (z) {
                m797(c0916.f553, c0916, null);
            }
        }
        c0916.f560 = false;
        c0916.f561 = false;
        c0916.f555 = false;
        c0916.f548 = null;
        c0916.f554 = true;
        if (this.f545 == c0916) {
            this.f545 = null;
        }
        if (c0916.f553 == 0) {
            m781();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m792(MenuC8631 menuC8631) {
        C1044 c1044;
        if (this.f547) {
            return;
        }
        this.f547 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f519;
        actionBarOverlayLayout.m1038();
        ActionMenuView actionMenuView = ((C0993) actionBarOverlayLayout.f785).f957.f856;
        if (actionMenuView != null && (c1044 = actionMenuView.f802) != null) {
            c1044.m1264();
            C1050 c1050 = c1044.f1128;
            if (c1050 != null && c1050.m13704()) {
                c1050.f21540.dismiss();
            }
        }
        Window.Callback callback = this.f513.getCallback();
        if (callback != null && !this.f526) {
            callback.onPanelClosed(108, menuC8631);
        }
        this.f547 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m793(int i) {
        C0916 c0916M778 = m778(i);
        if (c0916M778.f558 != null) {
            Bundle bundle = new Bundle();
            c0916M778.f558.m13716(bundle);
            if (bundle.size() > 0) {
                c0916M778.f557 = bundle;
            }
            c0916M778.f558.m13718();
            c0916M778.f558.clear();
        }
        c0916M778.f556 = true;
        c0916M778.f554 = true;
        if ((i == 108 || i == 0) && this.f519 != null) {
            C0916 c0916M7782 = m778(0);
            c0916M7782.f560 = false;
            m783(c0916M7782, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m794() {
        ViewGroup viewGroup;
        if (this.f504) {
            return;
        }
        Context context = this.f514;
        int[] iArr = AbstractC8602.f21452;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C6755.m11870("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo801(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo801(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo801(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo801(10);
        }
        this.f542 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m780();
        this.f513.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f546) {
            viewGroup = this.f543 ? (ViewGroup) layoutInflaterFrom.inflate(C0328R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C0328R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f542) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C0328R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f499 = false;
            this.f498 = false;
        } else if (this.f498) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0328R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C8637(context, typedValue.resourceId) : context).inflate(C0328R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(C0328R.id.decor_content_parent);
            this.f519 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f513.getCallback());
            if (this.f499) {
                this.f519.m1041(109);
            }
            if (this.f503) {
                this.f519.m1041(2);
            }
            if (this.f502) {
                this.f519.m1041(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f498 + ", windowActionBarOverlay: " + this.f499 + ", android:windowIsFloating: " + this.f542 + ", windowActionModeOverlay: " + this.f543 + ", windowNoTitle: " + this.f546 + " }");
        }
        C0939 c0939 = new C0939(this, i);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(viewGroup, c0939);
        if (this.f519 == null) {
            this.f501 = (TextView) viewGroup.findViewById(C0328R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0328R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f513.findViewById(R.id.content);
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
        this.f513.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0939(this, i2));
        this.f505 = viewGroup;
        Object obj = this.f515;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f520;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f519;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                AbstractC0935 abstractC0935 = this.f510;
                if (abstractC0935 != null) {
                    abstractC0935.mo734(title);
                } else {
                    TextView textView = this.f501;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f505.findViewById(R.id.content);
        View decorView = this.f513.getDecorView();
        contentFrameLayout2.f816.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f504 = true;
        C0916 c0916M778 = m778(0);
        if (this.f526 || c0916M778.f558 != null) {
            return;
        }
        m776(108);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m795(KeyEvent keyEvent) {
        View decorView;
        boolean zM1061;
        boolean zM783;
        ActionMenuView actionMenuView;
        C1044 c1044;
        Object obj = this.f515;
        if ((!(obj instanceof InterfaceC3089) && !(obj instanceof DialogInterfaceC0951)) || (decorView = this.f513.getDecorView()) == null || !AbstractC3100.m4787(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC0930 windowCallbackC0930 = this.f512;
                Window.Callback callback = this.f513.getCallback();
                windowCallbackC0930.getClass();
                try {
                    windowCallbackC0930.f585 = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.f529 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    C0916 c0916M778 = m778(0);
                                    if (!c0916M778.f555) {
                                        m783(c0916M778, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f516 == null) {
                                    C0916 c0916M7782 = m778(0);
                                    ActionBarOverlayLayout actionBarOverlayLayout = this.f519;
                                    Context context = this.f514;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.m1038();
                                        Toolbar toolbar = ((C0993) actionBarOverlayLayout.f785).f957;
                                        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f856) == null || !actionMenuView.f803 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            boolean z = c0916M7782.f555;
                                            if (z || c0916M7782.f561) {
                                                m791(c0916M7782, true);
                                                zM1061 = z;
                                                if (zM1061) {
                                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                                    if (audioManager != null) {
                                                        audioManager.playSoundEffect(0);
                                                        return true;
                                                    }
                                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                                    return true;
                                                }
                                            } else {
                                                if (c0916M7782.f560) {
                                                    if (c0916M7782.f556) {
                                                        c0916M7782.f560 = false;
                                                        zM783 = m783(c0916M7782, keyEvent);
                                                    } else {
                                                        zM783 = true;
                                                    }
                                                    if (zM783) {
                                                        m785(c0916M7782, keyEvent);
                                                        zM1061 = true;
                                                        if (zM1061) {
                                                        }
                                                    }
                                                }
                                                zM1061 = false;
                                                if (zM1061) {
                                                }
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f519;
                                            actionBarOverlayLayout2.m1038();
                                            if (((C0993) actionBarOverlayLayout2.f785).f957.m1067()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f519;
                                                actionBarOverlayLayout3.m1038();
                                                ActionMenuView actionMenuView2 = ((C0993) actionBarOverlayLayout3.f785).f957.f856;
                                                if (actionMenuView2 != null && (c1044 = actionMenuView2.f802) != null && c1044.m1264()) {
                                                    zM1061 = true;
                                                }
                                                if (zM1061) {
                                                }
                                            } else {
                                                if (!this.f526 && m783(c0916M7782, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.f519;
                                                    actionBarOverlayLayout4.m1038();
                                                    zM1061 = ((C0993) actionBarOverlayLayout4.f785).f957.m1061();
                                                }
                                                if (zM1061) {
                                                }
                                            }
                                            zM1061 = false;
                                            if (zM1061) {
                                            }
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (!m786()) {
                            return false;
                        }
                    }
                } finally {
                    windowCallbackC0930.f585 = false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m1262() != false) goto L20;
     */
    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo764(MenuC8631 menuC8631) {
        ActionMenuView actionMenuView;
        C1044 c1044;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f519;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m1038();
            Toolbar toolbar = ((C0993) actionBarOverlayLayout.f785).f957;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f856) != null && actionMenuView.f803) {
                if (ViewConfiguration.get(this.f514).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.f519;
                    actionBarOverlayLayout2.m1038();
                    ActionMenuView actionMenuView2 = ((C0993) actionBarOverlayLayout2.f785).f957.f856;
                    if (actionMenuView2 != null) {
                        C1044 c10442 = actionMenuView2.f802;
                        if (c10442 != null) {
                            if (c10442.f1127 == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f513.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f519;
                actionBarOverlayLayout3.m1038();
                if (((C0993) actionBarOverlayLayout3.f785).f957.m1067()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.f519;
                    actionBarOverlayLayout4.m1038();
                    ActionMenuView actionMenuView3 = ((C0993) actionBarOverlayLayout4.f785).f957.f856;
                    if (actionMenuView3 != null && (c1044 = actionMenuView3.f802) != null) {
                        c1044.m1264();
                    }
                    if (this.f526) {
                        return;
                    }
                    callback.onPanelClosed(108, m778(0).f558);
                    return;
                }
                if (callback == null || this.f526) {
                    return;
                }
                if (this.f538 && (1 & this.f534) != 0) {
                    View decorView = this.f513.getDecorView();
                    RunnableC0942 runnableC0942 = this.f535;
                    decorView.removeCallbacks(runnableC0942);
                    runnableC0942.run();
                }
                C0916 c0916M778 = m778(0);
                MenuC8631 menuC86312 = c0916M778.f558;
                if (menuC86312 == null || c0916M778.f556 || !callback.onPreparePanel(0, c0916M778.f559, menuC86312)) {
                    return;
                }
                callback.onMenuOpened(108, c0916M778.f558);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.f519;
                actionBarOverlayLayout5.m1038();
                ((C0993) actionBarOverlayLayout5.f785).f957.m1061();
                return;
            }
        }
        C0916 c0916M7782 = m778(0);
        c0916M7782.f554 = true;
        m791(c0916M7782, false);
        m785(c0916M7782, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC8639 mo796(InterfaceC8640 interfaceC8640) {
        AbstractC8639 abstractC8639OnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC8639 abstractC8639;
        if (interfaceC8640 == null) {
            C6755.m11869("ActionMode callback can not be null.");
            return null;
        }
        AbstractC8639 abstractC86392 = this.f516;
        if (abstractC86392 != null) {
            abstractC86392.mo971();
        }
        C0923 c0923 = new C0923(this, interfaceC8640);
        m777();
        AbstractC0935 abstractC0935 = this.f510;
        InterfaceC0943 interfaceC0943 = this.f511;
        if (abstractC0935 != null) {
            AbstractC8639 abstractC8639Mo882 = abstractC0935.mo882(c0923);
            this.f516 = abstractC8639Mo882;
            if (abstractC8639Mo882 != null) {
                interfaceC0943.onSupportActionModeStarted(abstractC8639Mo882);
            }
        }
        if (this.f516 == null) {
            C3115 c3115 = this.f508;
            if (c3115 != null) {
                c3115.m4831();
            }
            AbstractC8639 abstractC86393 = this.f516;
            if (abstractC86393 != null) {
                abstractC86393.mo971();
            }
            if (this.f526) {
                abstractC8639OnWindowStartingSupportActionMode = null;
                if (abstractC8639OnWindowStartingSupportActionMode == null) {
                }
                abstractC8639 = this.f516;
                if (abstractC8639 != null) {
                }
                m781();
                this.f516 = this.f516;
            } else {
                try {
                    abstractC8639OnWindowStartingSupportActionMode = interfaceC0943.onWindowStartingSupportActionMode(c0923);
                } catch (AbstractMethodError unused) {
                    abstractC8639OnWindowStartingSupportActionMode = null;
                }
                if (abstractC8639OnWindowStartingSupportActionMode == null) {
                    this.f516 = abstractC8639OnWindowStartingSupportActionMode;
                } else {
                    int i = 1;
                    if (this.f507 == null) {
                        boolean z = this.f542;
                        Context context = this.f514;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C0328R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                C8637 c8637 = new C8637(context, 0);
                                c8637.getTheme().setTo(themeNewTheme);
                                context = c8637;
                            }
                            this.f507 = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C0328R.attr.actionModePopupWindowStyle);
                            this.f506 = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.f506.setContentView(this.f507);
                            this.f506.setWidth(-1);
                            context.getTheme().resolveAttribute(C0328R.attr.actionBarSize, typedValue, true);
                            this.f507.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f506.setHeight(-2);
                            this.f509 = new RunnableC0942(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f505.findViewById(C0328R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                m777();
                                AbstractC0935 abstractC09352 = this.f510;
                                Context contextMo729 = abstractC09352 != null ? abstractC09352.mo729() : null;
                                if (contextMo729 != null) {
                                    context = contextMo729;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f507 = (ActionBarContextView) viewStubCompat.m1071();
                            }
                        }
                    }
                    if (this.f507 != null) {
                        C3115 c31152 = this.f508;
                        if (c31152 != null) {
                            c31152.m4831();
                        }
                        this.f507.m1025();
                        Context context2 = this.f507.getContext();
                        ActionBarContextView actionBarContextView = this.f507;
                        C8636 c8636 = new C8636();
                        c8636.f21628 = context2;
                        c8636.f21624 = actionBarContextView;
                        c8636.f21623 = c0923;
                        MenuC8631 menuC8631 = new MenuC8631(actionBarContextView.getContext());
                        menuC8631.f21597 = 1;
                        c8636.f21625 = menuC8631;
                        menuC8631.f21606 = c8636;
                        if (((InterfaceC8640) c0923.f572).mo832(c8636, menuC8631)) {
                            c8636.mo976();
                            this.f507.m1027(c8636);
                            this.f516 = c8636;
                            boolean z2 = this.f504 && (viewGroup = this.f505) != null && viewGroup.isLaidOut();
                            ActionBarContextView actionBarContextView2 = this.f507;
                            if (z2) {
                                actionBarContextView2.setAlpha(0.0f);
                                C3115 c3115M4797 = AbstractC3103.m4797(this.f507);
                                c3115M4797.m4832(1.0f);
                                this.f508 = c3115M4797;
                                c3115M4797.m4829(new C0940(this, i));
                            } else {
                                actionBarContextView2.setAlpha(1.0f);
                                this.f507.setVisibility(0);
                                if (this.f507.getParent() instanceof View) {
                                    View view = (View) this.f507.getParent();
                                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                                    view.requestApplyInsets();
                                }
                            }
                            if (this.f506 != null) {
                                this.f513.getDecorView().post(this.f509);
                            }
                        } else {
                            this.f516 = null;
                        }
                    }
                }
                abstractC8639 = this.f516;
                if (abstractC8639 != null) {
                    interfaceC0943.onSupportActionModeStarted(abstractC8639);
                }
                m781();
                this.f516 = this.f516;
            }
        }
        m781();
        return this.f516;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m797(int i, C0916 c0916, MenuC8631 menuC8631) {
        if (menuC8631 == null) {
            if (c0916 == null && i >= 0) {
                C0916[] c0916Arr = this.f544;
                if (i < c0916Arr.length) {
                    c0916 = c0916Arr[i];
                }
            }
            if (c0916 != null) {
                menuC8631 = c0916.f558;
            }
        }
        if ((c0916 == null || c0916.f555) && !this.f526) {
            WindowCallbackC0930 windowCallbackC0930 = this.f512;
            Window.Callback callback = this.f513.getCallback();
            windowCallbackC0930.getClass();
            try {
                windowCallbackC0930.f584 = true;
                callback.onPanelClosed(i, menuC8631);
            } finally {
                windowCallbackC0930.f584 = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m798(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f526) {
            return false;
        }
        int i2 = this.f524;
        if (i2 == -100) {
            i2 = AbstractC0941.f618;
        }
        Context context = this.f514;
        int iM775 = m775(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        C3011 c3011M774 = i3 < 33 ? m774(context) : null;
        if (!z2 && c3011M774 != null) {
            c3011M774 = AbstractC0921.m811(context.getResources().getConfiguration());
        }
        Configuration configurationM773 = m773(context, iM775, c3011M774, null, false);
        boolean z4 = this.f537;
        boolean z5 = true;
        Object obj = this.f515;
        if (z4 || !(obj instanceof Activity)) {
            this.f537 = true;
            i = this.f541;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f541 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f541 = 0;
                }
                this.f537 = true;
                i = this.f541;
            }
        }
        Configuration configuration = this.f525;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM773.uiMode & 48;
        C3011 c3011M811 = AbstractC0921.m811(configuration);
        C3011 c3011M8112 = c3011M774 == null ? null : AbstractC0921.m811(configurationM773);
        int i6 = i4 != i5 ? 512 : 0;
        if (c3011M8112 != null && !c3011M811.equals(c3011M8112)) {
            i6 |= DexMap.TYPE_ANNOTATION_ITEM;
        }
        if (((~i) & i6) != 0 && z && this.f528 && ((f495 || this.f527) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM773.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC1945(activity, 21));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i & i6) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c3011M8112 != null) {
                AbstractC0921.m809(configuration2, c3011M8112);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.f540;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.f540, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC3221) {
                    if (((C3219) ((InterfaceC3221) activity2).getLifecycle()).f7364.isAtLeast(Lifecycle$State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f527 && !this.f526) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof AppCompatActivity)) {
            if ((i6 & 512) != 0) {
                ((AppCompatActivity) obj).onNightModeChanged(iM775);
            }
            if ((i6 & 4) != 0) {
                ((AppCompatActivity) obj).onLocalesChanged(c3011M774);
            }
        }
        if (c3011M8112 != null) {
            AbstractC0921.m810(AbstractC0921.m811(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m779(context).m870();
        } else {
            C0929 c0929 = this.f536;
            if (c0929 != null) {
                c0929.m867();
            }
        }
        C0929 c09292 = this.f539;
        if (i2 == 3) {
            if (c09292 == null) {
                this.f539 = new C0929(this, context);
            }
            this.f539.m870();
        } else if (c09292 != null) {
            c09292.m867();
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m799(Window window) {
        Drawable drawableM1193;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f513 != null) {
            C6755.m11870("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0930) {
            C6755.m11870("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC0930 windowCallbackC0930 = new WindowCallbackC0930(this, callback);
        this.f512 = windowCallbackC0930;
        window.setCallback(windowCallbackC0930);
        Context context = this.f514;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f497);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM1193 = null;
        } else {
            C0977 c0977M1100 = C0977.m1100();
            synchronized (c0977M1100) {
                drawableM1193 = c0977M1100.f917.m1193(context, resourceId, true);
            }
        }
        if (drawableM1193 != null) {
            window.setBackgroundDrawable(drawableM1193);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f513 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f523) != null) {
            return;
        }
        Object obj = this.f515;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f522) != null) {
            AbstractC0919.m806(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f522 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f523 = AbstractC0919.m808(activity);
            } else {
                this.f523 = null;
            }
        }
        m781();
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo800(int i) {
        m794();
        ViewGroup viewGroup = (ViewGroup) this.f505.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f514).inflate(i, viewGroup);
        this.f512.m881(this.f513.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo801(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f546 && i == 108) {
            return false;
        }
        if (this.f498 && i == 1) {
            this.f498 = false;
        }
        if (i == 1) {
            m782();
            this.f546 = true;
            return true;
        }
        if (i == 2) {
            m782();
            this.f503 = true;
            return true;
        }
        if (i == 5) {
            m782();
            this.f502 = true;
            return true;
        }
        if (i == 10) {
            m782();
            this.f543 = true;
            return true;
        }
        if (i == 108) {
            m782();
            this.f498 = true;
            return true;
        }
        if (i != 109) {
            return this.f513.requestFeature(i);
        }
        m782();
        this.f499 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo802(View view, ViewGroup.LayoutParams layoutParams) {
        m794();
        ViewGroup viewGroup = (ViewGroup) this.f505.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f512.m881(this.f513.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo803(CharSequence charSequence) {
        this.f520 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f519;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        AbstractC0935 abstractC0935 = this.f510;
        if (abstractC0935 != null) {
            abstractC0935.mo734(charSequence);
            return;
        }
        TextView textView = this.f501;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0941
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo804(View view) {
        m794();
        ViewGroup viewGroup = (ViewGroup) this.f505.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f512.m881(this.f513.getCallback());
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        C0916 c0916;
        Window.Callback callback = this.f513.getCallback();
        if (callback != null && !this.f526) {
            MenuC8631 menuC8631Mo13690 = menuC8631.mo13690();
            C0916[] c0916Arr = this.f544;
            int length = c0916Arr != null ? c0916Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0916 = c0916Arr[i];
                    if (c0916 != null && c0916.f558 == menuC8631Mo13690) {
                        break;
                    }
                    i++;
                } else {
                    c0916 = null;
                    break;
                }
            }
            if (c0916 != null) {
                return callback.onMenuItemSelected(c0916.f553, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
