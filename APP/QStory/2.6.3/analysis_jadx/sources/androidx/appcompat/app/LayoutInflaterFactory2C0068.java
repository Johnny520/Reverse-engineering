package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.AbstractC0144;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0123;
import androidx.appcompat.widget.C0125;
import androidx.appcompat.widget.C0126;
import androidx.appcompat.widget.C0128;
import androidx.appcompat.widget.C0130;
import androidx.appcompat.widget.C0135;
import androidx.appcompat.widget.C0136;
import androidx.appcompat.widget.C0146;
import androidx.appcompat.widget.C0193;
import androidx.appcompat.widget.C0197;
import androidx.appcompat.widget.C0203;
import androidx.appcompat.widget.C0223;
import androidx.appcompat.widget.C0227;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.collection.C0283;
import androidx.core.os.C2178;
import androidx.core.os.C2182;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2195;
import androidx.core.view.C2282;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p162.AbstractC7653;
import p188.AbstractC7773;
import p190.InterfaceC7797;
import p190.MenuC7802;
import p192.AbstractC7810;
import p192.C7808;
import p192.C7817;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0068 extends AbstractC0094 implements InterfaceC7797, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f153;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f154;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public View f155;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public TextView f156;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f157;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f158;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public boolean f159;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ViewGroup f160;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public PopupWindow f161;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ActionBarContextView f162;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public RunnableC0095 f164;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC0088 f165;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final InterfaceC0096 f166;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public WindowCallbackC0083 f167;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Window f168;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Context f169;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f170;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC7810 f171;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0092 f172;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0092 f173;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public ActionBarOverlayLayout f174;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public CharSequence f175;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C7817 f176;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public OnBackInvokedCallback f177;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public OnBackInvokedDispatcher f178;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int f179;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public Configuration f180;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean f181;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean f182;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f183;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f184;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Rect f185;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f186;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C0066 f187;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public Rect f188;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public int f189;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C0082 f191;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f192;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public boolean f193;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C0082 f194;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f195;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f196;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f197;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f198;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C0069[] f199;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C0069 f200;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public boolean f201;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public boolean f202;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static final C0283 f151 = new C0283(0);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static final int[] f152 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static final boolean f150 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C2282 f163 = null;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final RunnableC0095 f190 = new RunnableC0095(this, 0);

    public LayoutInflaterFactory2C0068(Context context, Window window, InterfaceC0096 interfaceC0096, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f179 = -100;
        this.f169 = context;
        this.f166 = interfaceC0096;
        this.f170 = obj;
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
                this.f179 = ((LayoutInflaterFactory2C0068) appCompatActivity.getDelegate()).f179;
            }
        }
        if (this.f179 == -100) {
            String name = this.f170.getClass().getName();
            C0283 c0283 = f151;
            Integer num = (Integer) c0283.get(name);
            if (num != null) {
                this.f179 = num.intValue();
                c0283.remove(this.f170.getClass().getName());
            }
        }
        if (window != null) {
            m239(window);
        }
        C0130.m538();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Configuration m213(Context context, int i, C2178 c2178, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c2178 != null) {
            AbstractC0074.m249(configuration2, c2178);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C2178 m214(Context context) {
        C2178 c2178;
        C2178 c21782;
        if (Build.VERSION.SDK_INT >= 33 || (c2178 = AbstractC0094.f274) == null) {
            return null;
        }
        C2182 c2182 = c2178.f6453;
        C2178 c2178M251 = AbstractC0074.m251(context.getApplicationContext().getResources().getConfiguration());
        if (c2182.f6455.isEmpty()) {
            c21782 = C2178.f6452;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c2178M251.f6453.f6455.size() + c2182.f6455.size()) {
                Locale locale = i < c2182.f6455.size() ? c2182.f6455.get(i) : c2178M251.f6453.f6455.get(i - c2182.f6455.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c21782 = new C2178(new C2182(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c21782.f6453.f6455.isEmpty() ? c2178M251 : c21782;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0066 c0066;
        Context c7808;
        View c0123;
        View view2 = null;
        if (this.f187 == null) {
            int[] iArr = AbstractC7773.f21107;
            Context context2 = this.f169;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f187 = new C0066();
            } else {
                try {
                    this.f187 = (C0066) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f187 = new C0066();
                }
            }
        }
        c0066 = this.f187;
        int i = AbstractC0144.f606;
        c0066.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21093, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        c7808 = (resourceId == 0 || ((context instanceof C7808) && ((C7808) context).f21289 == resourceId)) ? context : new C7808(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                c0123 = new C0123(c7808, attributeSet);
                break;
            case "CheckedTextView":
                c0123 = new C0193(c7808, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c0123 = new C0135(c7808, attributeSet);
                break;
            case "TextView":
                c0123 = c0066.mo207(c7808, attributeSet);
                break;
            case "ImageButton":
                c0123 = new C0126(c7808, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                c0123 = new C0125(c7808, attributeSet);
                break;
            case "Spinner":
                c0123 = new C0227(c7808, attributeSet);
                break;
            case "RadioButton":
                c0123 = c0066.mo208(c7808, attributeSet);
                break;
            case "ToggleButton":
                c0123 = new C0223(c7808, attributeSet);
                break;
            case "ImageView":
                c0123 = new C0136(c7808, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                c0123 = c0066.mo211(c7808, attributeSet);
                break;
            case "CheckBox":
                c0123 = c0066.mo209(c7808, attributeSet);
                break;
            case "EditText":
                c0123 = new C0128(c7808, attributeSet);
                break;
            case "Button":
                c0123 = c0066.mo210(c7808, attributeSet);
                break;
            default:
                c0123 = null;
                break;
        }
        if (c0123 == null && context != c7808) {
            Object[] objArr = c0066.f149;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c7808;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C0066.f148;
                        if (i2 < 3) {
                            View viewM206 = c0066.m206(c7808, str, strArr[i2]);
                            if (viewM206 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM206;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM2062 = c0066.m206(c7808, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM2062;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c0123 = view2;
        }
        if (c0123 != null) {
            Context context3 = c0123.getContext();
            if ((context3 instanceof ContextWrapper) && c0123.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0066.f145);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0123.setOnClickListener(new ViewOnClickListenerC0070(string2, c0123));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c7808.obtainStyledAttributes(attributeSet, C0066.f144);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC2270.f6594;
                    new C2195(com.davemorrissey.labs.subscaleview.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m4003(Boolean.valueOf(z), c0123);
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c7808.obtainStyledAttributes(attributeSet, C0066.f143);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC2270.m4241(c0123, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c7808.obtainStyledAttributes(attributeSet, C0066.f142);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC2270.f6594;
                    new C2195(com.davemorrissey.labs.subscaleview.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m4003(Boolean.valueOf(z2), c0123);
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c0123;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int m215(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C5925.m11311("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f194 == null) {
                            this.f194 = new C0082(this, context);
                        }
                        return this.f194.mo312();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m219(context).mo312();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m216(int i) {
        this.f189 = (1 << i) | this.f189;
        if (this.f193) {
            return;
        }
        View decorView = this.f168.getDecorView();
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        decorView.postOnAnimation(this.f190);
        this.f193 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m217() {
        m234();
        if (this.f153 && this.f165 == null) {
            Object obj = this.f170;
            if (obj instanceof Activity) {
                this.f165 = new C0111((Activity) obj, this.f154);
            } else if (obj instanceof Dialog) {
                this.f165 = new C0111((Dialog) obj);
            }
            AbstractC0088 abstractC0088 = this.f165;
            if (abstractC0088 != null) {
                abstractC0088.mo180(this.f186);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0069 m218(int i) {
        C0069[] c0069Arr = this.f199;
        if (c0069Arr == null || c0069Arr.length <= i) {
            C0069[] c0069Arr2 = new C0069[i + 1];
            if (c0069Arr != null) {
                System.arraycopy(c0069Arr, 0, c0069Arr2, 0, c0069Arr.length);
            }
            this.f199 = c0069Arr2;
            c0069Arr = c0069Arr2;
        }
        C0069 c0069 = c0069Arr[i];
        if (c0069 != null) {
            return c0069;
        }
        C0069 c00692 = new C0069();
        c00692.f208 = i;
        c00692.f209 = false;
        c0069Arr[i] = c00692;
        return c00692;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC0080 m219(Context context) {
        if (this.f191 == null) {
            if (C0108.f317 == null) {
                Context applicationContext = context.getApplicationContext();
                C0108.f317 = new C0108(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f191 = new C0082(this, C0108.f317);
        }
        return this.f191;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m220() {
        if (this.f168 == null) {
            Object obj = this.f170;
            if (obj instanceof Activity) {
                m239(((Activity) obj).getWindow());
            }
        }
        if (this.f168 != null) {
            return;
        }
        C5925.m11311("We have not been given a Window");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m221() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f178 != null && (m218(0).f210 || this.f171 != null)) {
                z = true;
            }
            if (z && this.f177 == null) {
                this.f177 = AbstractC0072.m247(this.f178, this);
            } else {
                if (z || (onBackInvokedCallback = this.f177) == null) {
                    return;
                }
                AbstractC0072.m246(this.f178, onBackInvokedCallback);
                this.f177 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m222() {
        if (this.f159) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m223(androidx.appcompat.app.C0069 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.m223(androidx.appcompat.app.飘花落叶言子世哲楪苏兰, android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m224(C0069 c0069, int i, KeyEvent keyEvent) {
        MenuC7802 menuC7802;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0069.f215 || m223(c0069, keyEvent)) && (menuC7802 = c0069.f213) != null) {
            return menuC7802.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f21133.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m225(androidx.appcompat.app.C0069 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.m225(androidx.appcompat.app.飘花落叶言子世哲楪苏兰, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m226() {
        boolean z = this.f184;
        this.f184 = false;
        C0069 c0069M218 = m218(0);
        if (!c0069M218.f210) {
            AbstractC7810 abstractC7810 = this.f171;
            if (abstractC7810 != null) {
                abstractC7810.mo411();
                return true;
            }
            m217();
            AbstractC0088 abstractC0088 = this.f165;
            if (abstractC0088 == null || !abstractC0088.mo172()) {
                return false;
            }
        } else if (!z) {
            m231(c0069M218, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo227() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f170
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AbstractC0094.f269
            monitor-enter(r0)
            androidx.appcompat.app.AbstractC0094.m326(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f193
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f168
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.飘花落叶言子楪兰苏哲世 r1 = r3.f190
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f181 = r0
            int r0 = r3.f179
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f170
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.飘花落叶言子苏世哲兰楪 r0 = androidx.appcompat.app.LayoutInflaterFactory2C0068.f151
            java.lang.Object r1 = r3.f170
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f179
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.飘花落叶言子苏世哲兰楪 r0 = androidx.appcompat.app.LayoutInflaterFactory2C0068.f151
            java.lang.Object r1 = r3.f170
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.飘花落叶言子楪世苏兰哲 r0 = r3.f165
            if (r0 == 0) goto L63
            r0.mo177()
        L63:
            androidx.appcompat.app.飘花落叶言子世苏楪兰哲 r0 = r3.f191
            if (r0 == 0) goto L6a
            r0.m307()
        L6a:
            androidx.appcompat.app.飘花落叶言子世苏楪兰哲 r3 = r3.f194
            if (r3 == 0) goto L71
            r3.m307()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.mo227():void");
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo228() {
        String strM12916;
        this.f183 = true;
        m238(false, true);
        m220();
        Object obj = this.f170;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM12916 = AbstractC7653.m12916(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM12916 = null;
            }
            if (strM12916 != null) {
                AbstractC0088 abstractC0088 = this.f165;
                if (abstractC0088 == null) {
                    this.f186 = true;
                } else {
                    abstractC0088.mo180(true);
                }
            }
            synchronized (AbstractC0094.f269) {
                AbstractC0094.m326(this);
                AbstractC0094.f272.add(new WeakReference(this));
            }
        }
        this.f180 = new Configuration(this.f169.getResources().getConfiguration());
        this.f182 = true;
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo229() {
        if (this.f165 != null) {
            m217();
            if (this.f165.mo168()) {
                return;
            }
            m216(0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo230() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f169);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0068) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m231(C0069 c0069, boolean z) {
        C0079 c0079;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && c0069.f208 == 0 && (actionBarOverlayLayout = this.f174) != null) {
            actionBarOverlayLayout.m478();
            if (((C0146) actionBarOverlayLayout.f440).f612.m507()) {
                m232(c0069.f213);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f169.getSystemService("window");
        if (windowManager != null && c0069.f210 && (c0079 = c0069.f204) != null) {
            windowManager.removeView(c0079);
            if (z) {
                m237(c0069.f208, c0069, null);
            }
        }
        c0069.f215 = false;
        c0069.f216 = false;
        c0069.f210 = false;
        c0069.f203 = null;
        c0069.f209 = true;
        if (this.f200 == c0069) {
            this.f200 = null;
        }
        if (c0069.f208 == 0) {
            m221();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m232(MenuC7802 menuC7802) {
        C0197 c0197;
        if (this.f202) {
            return;
        }
        this.f202 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f174;
        actionBarOverlayLayout.m478();
        ActionMenuView actionMenuView = ((C0146) actionBarOverlayLayout.f440).f612.f511;
        if (actionMenuView != null && (c0197 = actionMenuView.f457) != null) {
            c0197.m704();
            C0203 c0203 = c0197.f783;
            if (c0203 != null && c0203.m13145()) {
                c0203.f21195.dismiss();
            }
        }
        Window.Callback callback = this.f168.getCallback();
        if (callback != null && !this.f181) {
            callback.onPanelClosed(108, menuC7802);
        }
        this.f202 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m233(int i) {
        C0069 c0069M218 = m218(i);
        if (c0069M218.f213 != null) {
            Bundle bundle = new Bundle();
            c0069M218.f213.m13157(bundle);
            if (bundle.size() > 0) {
                c0069M218.f212 = bundle;
            }
            c0069M218.f213.m13159();
            c0069M218.f213.clear();
        }
        c0069M218.f211 = true;
        c0069M218.f209 = true;
        if ((i == 108 || i == 0) && this.f174 != null) {
            C0069 c0069M2182 = m218(0);
            c0069M2182.f215 = false;
            m223(c0069M2182, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m234() {
        ViewGroup viewGroup;
        if (this.f159) {
            return;
        }
        Context context = this.f169;
        int[] iArr = AbstractC7773.f21107;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C5925.m11311("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo241(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo241(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo241(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo241(10);
        }
        this.f197 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m220();
        this.f168.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f201) {
            viewGroup = this.f198 ? (ViewGroup) layoutInflaterFrom.inflate(com.davemorrissey.labs.subscaleview.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.davemorrissey.labs.subscaleview.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f197) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.davemorrissey.labs.subscaleview.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f154 = false;
            this.f153 = false;
        } else if (this.f153) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.davemorrissey.labs.subscaleview.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C7808(context, typedValue.resourceId) : context).inflate(com.davemorrissey.labs.subscaleview.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.davemorrissey.labs.subscaleview.R.id.decor_content_parent);
            this.f174 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f168.getCallback());
            if (this.f154) {
                this.f174.m481(109);
            }
            if (this.f158) {
                this.f174.m481(2);
            }
            if (this.f157) {
                this.f174.m481(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f153 + ", windowActionBarOverlay: " + this.f154 + ", android:windowIsFloating: " + this.f197 + ", windowActionModeOverlay: " + this.f198 + ", windowNoTitle: " + this.f201 + " }");
        }
        C0092 c0092 = new C0092(this, i);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(viewGroup, c0092);
        if (this.f174 == null) {
            this.f156 = (TextView) viewGroup.findViewById(com.davemorrissey.labs.subscaleview.R.id.title);
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.davemorrissey.labs.subscaleview.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f168.findViewById(R.id.content);
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
        this.f168.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0092(this, i2));
        this.f160 = viewGroup;
        Object obj = this.f170;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f175;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f174;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                AbstractC0088 abstractC0088 = this.f165;
                if (abstractC0088 != null) {
                    abstractC0088.mo174(title);
                } else {
                    TextView textView = this.f156;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f160.findViewById(R.id.content);
        View decorView = this.f168.getDecorView();
        contentFrameLayout2.f471.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f159 = true;
        C0069 c0069M218 = m218(0);
        if (this.f181 || c0069M218.f213 != null) {
            return;
        }
        m216(108);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m235(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.m235(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m702() != false) goto L20;
     */
    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo204(p190.MenuC7802 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.mo204(飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏哲兰世):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p192.AbstractC7810 mo236(p192.InterfaceC7811 r9) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.mo236(飘花落叶言子楪苏哲兰世.飘花落叶言子楪世苏哲兰):飘花落叶言子楪苏哲兰世.飘花落叶言子楪世苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m237(int i, C0069 c0069, MenuC7802 menuC7802) {
        if (menuC7802 == null) {
            if (c0069 == null && i >= 0) {
                C0069[] c0069Arr = this.f199;
                if (i < c0069Arr.length) {
                    c0069 = c0069Arr[i];
                }
            }
            if (c0069 != null) {
                menuC7802 = c0069.f213;
            }
        }
        if ((c0069 == null || c0069.f210) && !this.f181) {
            WindowCallbackC0083 windowCallbackC0083 = this.f167;
            Window.Callback callback = this.f168.getCallback();
            windowCallbackC0083.getClass();
            try {
                windowCallbackC0083.f239 = true;
                callback.onPanelClosed(i, menuC7802);
            } finally {
                windowCallbackC0083.f239 = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m238(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.m238(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m239(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f168
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof androidx.appcompat.app.WindowCallbackC0083
            if (r2 != 0) goto L7a
            androidx.appcompat.app.飘花落叶言子世苏楪哲兰 r0 = new androidx.appcompat.app.飘花落叶言子世苏楪哲兰
            r0.<init>(r7, r1)
            r7.f167 = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f169
            int[] r1 = androidx.appcompat.app.LayoutInflaterFactory2C0068.f152
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            androidx.appcompat.widget.飘花落叶言子世楪苏兰哲 r4 = androidx.appcompat.widget.C0130.m540()
            monitor-enter(r4)
            androidx.appcompat.widget.飘花落叶言子哲兰苏世楪 r5 = r4.f572     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.m633(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.f168 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f178
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f170
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f177
            if (r1 == 0) goto L61
            androidx.appcompat.app.AbstractC0072.m246(r8, r1)
            r7.f177 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = androidx.appcompat.app.AbstractC0072.m248(r0)
            r7.f178 = r8
            goto L76
        L74:
            r7.f178 = r2
        L76:
            r7.m221()
        L79:
            return
        L7a:
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            return
        L7e:
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0068.m239(android.view.Window):void");
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo240(int i) {
        m234();
        ViewGroup viewGroup = (ViewGroup) this.f160.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f169).inflate(i, viewGroup);
        this.f167.m321(this.f168.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo241(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f201 && i == 108) {
            return false;
        }
        if (this.f153 && i == 1) {
            this.f153 = false;
        }
        if (i == 1) {
            m222();
            this.f201 = true;
            return true;
        }
        if (i == 2) {
            m222();
            this.f158 = true;
            return true;
        }
        if (i == 5) {
            m222();
            this.f157 = true;
            return true;
        }
        if (i == 10) {
            m222();
            this.f198 = true;
            return true;
        }
        if (i == 108) {
            m222();
            this.f153 = true;
            return true;
        }
        if (i != 109) {
            return this.f168.requestFeature(i);
        }
        m222();
        this.f154 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo242(View view, ViewGroup.LayoutParams layoutParams) {
        m234();
        ViewGroup viewGroup = (ViewGroup) this.f160.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f167.m321(this.f168.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo243(CharSequence charSequence) {
        this.f175 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f174;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        AbstractC0088 abstractC0088 = this.f165;
        if (abstractC0088 != null) {
            abstractC0088.mo174(charSequence);
            return;
        }
        TextView textView = this.f156;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0094
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo244(View view) {
        m234();
        ViewGroup viewGroup = (ViewGroup) this.f160.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f167.m321(this.f168.getCallback());
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo205(MenuC7802 menuC7802, MenuItem menuItem) {
        C0069 c0069;
        Window.Callback callback = this.f168.getCallback();
        if (callback != null && !this.f181) {
            MenuC7802 menuC7802Mo13131 = menuC7802.mo13131();
            C0069[] c0069Arr = this.f199;
            int length = c0069Arr != null ? c0069Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0069 = c0069Arr[i];
                    if (c0069 != null && c0069.f213 == menuC7802Mo13131) {
                        break;
                    }
                    i++;
                } else {
                    c0069 = null;
                    break;
                }
            }
            if (c0069 != null) {
                return callback.onMenuItemSelected(c0069.f208, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
