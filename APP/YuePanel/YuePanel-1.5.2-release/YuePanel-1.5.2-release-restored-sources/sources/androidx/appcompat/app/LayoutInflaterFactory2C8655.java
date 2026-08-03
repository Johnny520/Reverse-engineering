package androidx.appcompat.app;

import Yue.AbstractC3086;
import Yue.C3090;
import Yue.C3295;
import Yue.C3296;
import Yue.C3304;
import Yue.C3323;
import Yue.C3353;
import Yue.C4187;
import Yue.C4198;
import Yue.C5637;
import Yue.C5680;
import Yue.C5681;
import Yue.C5782;
import Yue.C5788;
import Yue.C6355;
import Yue.C6711;
import Yue.C6898;
import Yue.C7130;
import Yue.C7467;
import Yue.C7566;
import Yue.C7681;
import Yue.C7683;
import Yue.C7837;
import Yue.C8005;
import Yue.C8170;
import Yue.C8273;
import Yue.C8357;
import Yue.C8360;
import Yue.C8370;
import Yue.C8472;
import Yue.DialogC3302;
import Yue.InterfaceC3285;
import Yue.InterfaceC3647;
import Yue.InterfaceC4329;
import Yue.InterfaceC4482;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import Yue.WindowCallbackC8434;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C1584;
import androidx.appcompat.view.menu.C8692;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC8753;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class LayoutInflaterFactory2C8655 extends AbstractC8651 implements C8694.InterfaceC1603, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final C7467<String, Integer> f25769 = new C7467<>();

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final boolean f25770 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final int[] f25771 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final boolean f25772 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static boolean f25773 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final String f25774 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final Object f25775;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final Context f25776;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Window f25777;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C8669 f25778;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final InterfaceC3285 f25779;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public AbstractC1583 f25780;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public MenuInflater f25781;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public CharSequence f25782;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC4329 f25783;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C8663 f25784;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C8676 f25785;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public AbstractC3086 f25786;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public ActionBarContextView f25787;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public PopupWindow f25788;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public Runnable f25789;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public C8357 f25790;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean f25791;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public boolean f25792;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public ViewGroup f25793;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public TextView f25794;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public View f25795;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public boolean f25796;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean f25797;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean f25798;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean f25799;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public boolean f25800;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public boolean f25801;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public boolean f25802;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean f25803;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public C8674[] f25804;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public C8674 f25805;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean f25806;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public boolean f25807;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public boolean f25808;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public boolean f25809;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public Configuration f25810;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public int f25811;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public int f25812;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public int f25813;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public boolean f25814;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public AbstractC8671 f25815;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public AbstractC8671 f25816;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public boolean f25817;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public int f25818;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public final Runnable f25819;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public boolean f25820;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public Rect f25821;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public Rect f25822;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public C3353 f25823;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public C5680 f25824;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f25825;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public OnBackInvokedCallback f25826;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ */
    public class C1588 implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f3626;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C1588(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f3626 = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@InterfaceC6391 Thread thread, @InterfaceC6391 Throwable th) {
            if (!m4613(th)) {
                this.f3626.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + LayoutInflaterFactory2C8655.f25774);
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f3626.uncaughtException(thread, notFoundException);
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m4613(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟ */
    public class RunnableC1589 implements Runnable {
        public RunnableC1589() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
            if ((layoutInflaterFactory2C8655.f25818 & 1) != 0) {
                layoutInflaterFactory2C8655.m28891(0);
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C86552 = LayoutInflaterFactory2C8655.this;
            if ((layoutInflaterFactory2C86552.f25818 & 4096) != 0) {
                layoutInflaterFactory2C86552.m28891(108);
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C86553 = LayoutInflaterFactory2C8655.this;
            layoutInflaterFactory2C86553.f25817 = false;
            layoutInflaterFactory2C86553.f25818 = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class C8656 implements InterfaceC6545 {
        public C8656() {
        }

        @Override // Yue.InterfaceC6545
        public C8472 onApplyWindowInsets(View view, C8472 c8472) {
            int iM28293 = c8472.m28293();
            int iM28939 = LayoutInflaterFactory2C8655.this.m28939(c8472, null);
            if (iM28293 != iM28939) {
                c8472 = c8472.m28304(c8472.m28291(), iM28939, c8472.m28292(), c8472.m28290());
            }
            return C8273.m27416(view, c8472);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C8657 implements InterfaceC8753.InterfaceC1630 {
        public C8657() {
        }

        @Override // androidx.appcompat.widget.InterfaceC8753.InterfaceC1630
        /* JADX INFO: renamed from: ۥ */
        public void mo4614(Rect rect) {
            rect.top = LayoutInflaterFactory2C8655.this.m28939(null, rect);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8658 implements ContentFrameLayout.InterfaceC1619 {
        public C8658() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1619
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C8655.this.m28889();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1619
        /* JADX INFO: renamed from: ۥ */
        public void mo4615() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public class RunnableC8659 implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟۠$ۥ */
        public class C1590 extends C8360 {
            public C1590() {
            }

            @Override // Yue.C8360, Yue.InterfaceC8359
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo34(View view) {
                LayoutInflaterFactory2C8655.this.f25787.setAlpha(1.0f);
                LayoutInflaterFactory2C8655.this.f25790.m27873(null);
                LayoutInflaterFactory2C8655.this.f25790 = null;
            }

            @Override // Yue.C8360, Yue.InterfaceC8359
            /* JADX INFO: renamed from: ۥ۟۟ */
            public void mo5710(View view) {
                LayoutInflaterFactory2C8655.this.f25787.setVisibility(0);
            }
        }

        public RunnableC8659() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
            layoutInflaterFactory2C8655.f25788.showAtLocation(layoutInflaterFactory2C8655.f25787, 55, 0, 0);
            LayoutInflaterFactory2C8655.this.m28892();
            if (!LayoutInflaterFactory2C8655.this.m28929()) {
                LayoutInflaterFactory2C8655.this.f25787.setAlpha(1.0f);
                LayoutInflaterFactory2C8655.this.f25787.setVisibility(0);
            } else {
                LayoutInflaterFactory2C8655.this.f25787.setAlpha(0.0f);
                LayoutInflaterFactory2C8655 layoutInflaterFactory2C86552 = LayoutInflaterFactory2C8655.this;
                layoutInflaterFactory2C86552.f25790 = C8273.m27308(layoutInflaterFactory2C86552.f25787).m4324(1.0f);
                LayoutInflaterFactory2C8655.this.f25790.m27873(new C1590());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C8660 extends C8360 {
        public C8660() {
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            LayoutInflaterFactory2C8655.this.f25787.setAlpha(1.0f);
            LayoutInflaterFactory2C8655.this.f25790.m27873(null);
            LayoutInflaterFactory2C8655.this.f25790 = null;
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo5710(View view) {
            LayoutInflaterFactory2C8655.this.f25787.setVisibility(0);
            if (LayoutInflaterFactory2C8655.this.f25787.getParent() instanceof View) {
                C8273.m27433((View) LayoutInflaterFactory2C8655.this.f25787.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8661 implements C1584.InterfaceC8646 {
        public C8661() {
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4604() {
            AbstractC1583 abstractC1583Mo28850 = LayoutInflaterFactory2C8655.this.mo28850();
            return (abstractC1583Mo28850 == null || (abstractC1583Mo28850.mo28697() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟ */
        public Context mo4605() {
            return LayoutInflaterFactory2C8655.this.m28896();
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo28796(Drawable drawable, int i) {
            AbstractC1583 abstractC1583Mo28850 = LayoutInflaterFactory2C8655.this.mo28850();
            if (abstractC1583Mo28850 != null) {
                abstractC1583Mo28850.mo28745(drawable);
                abstractC1583Mo28850.mo28742(i);
            }
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public Drawable mo28797() {
            C7837 c7837M24868 = C7837.m24868(mo4605(), null, new int[]{C6898.C1110.f18484});
            Drawable drawableM24875 = c7837M24868.m24875(0);
            c7837M24868.m24899();
            return drawableM24875;
        }

        @Override // androidx.appcompat.app.C1584.InterfaceC8646
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28798(int i) {
            AbstractC1583 abstractC1583Mo28850 = LayoutInflaterFactory2C8655.this.mo28850();
            if (abstractC1583Mo28850 != null) {
                abstractC1583Mo28850.mo28742(i);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥۣ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8662 {
        @InterfaceC6490
        View onCreatePanelView(int i);

        /* JADX INFO: renamed from: ۥ */
        boolean mo4616(int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final class C8663 implements InterfaceC8699.InterfaceC1607 {
        public C8663() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
            LayoutInflaterFactory2C8655.this.m28883(c8694);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4617(@InterfaceC6391 C8694 c8694) {
            Window.Callback callbackM28905 = LayoutInflaterFactory2C8655.this.m28905();
            if (callbackM28905 == null) {
                return true;
            }
            callbackM28905.onMenuOpened(108, c8694);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public class C8664 implements AbstractC3086.InterfaceC0044 {

        /* JADX INFO: renamed from: ۥ */
        public AbstractC3086.InterfaceC0044 f3633;

        /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۥ$ۥ */
        public class C1591 extends C8360 {
            public C1591() {
            }

            @Override // Yue.C8360, Yue.InterfaceC8359
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo34(View view) {
                LayoutInflaterFactory2C8655.this.f25787.setVisibility(8);
                LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
                PopupWindow popupWindow = layoutInflaterFactory2C8655.f25788;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C8655.f25787.getParent() instanceof View) {
                    C8273.m27433((View) LayoutInflaterFactory2C8655.this.f25787.getParent());
                }
                LayoutInflaterFactory2C8655.this.f25787.m29072();
                LayoutInflaterFactory2C8655.this.f25790.m27873(null);
                LayoutInflaterFactory2C8655 layoutInflaterFactory2C86552 = LayoutInflaterFactory2C8655.this;
                layoutInflaterFactory2C86552.f25790 = null;
                C8273.m27433(layoutInflaterFactory2C86552.f25793);
            }
        }

        public C8664(AbstractC3086.InterfaceC0044 interfaceC0044) {
            this.f3633 = interfaceC0044;
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ */
        public boolean mo176(AbstractC3086 abstractC3086, Menu menu) {
            return this.f3633.mo176(abstractC3086, menu);
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo177(AbstractC3086 abstractC3086, Menu menu) {
            C8273.m27433(LayoutInflaterFactory2C8655.this.f25793);
            return this.f3633.mo177(abstractC3086, menu);
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6287(AbstractC3086 abstractC3086) {
            this.f3633.mo6287(abstractC3086);
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
            if (layoutInflaterFactory2C8655.f25788 != null) {
                layoutInflaterFactory2C8655.f25777.getDecorView().removeCallbacks(LayoutInflaterFactory2C8655.this.f25789);
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C86552 = LayoutInflaterFactory2C8655.this;
            if (layoutInflaterFactory2C86552.f25787 != null) {
                layoutInflaterFactory2C86552.m28892();
                LayoutInflaterFactory2C8655 layoutInflaterFactory2C86553 = LayoutInflaterFactory2C8655.this;
                layoutInflaterFactory2C86553.f25790 = C8273.m27308(layoutInflaterFactory2C86553.f25787).m4324(0.0f);
                LayoutInflaterFactory2C8655.this.f25790.m27873(new C1591());
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C86554 = LayoutInflaterFactory2C8655.this;
            InterfaceC3285 interfaceC3285 = layoutInflaterFactory2C86554.f25779;
            if (interfaceC3285 != null) {
                interfaceC3285.onSupportActionModeFinished(layoutInflaterFactory2C86554.f25786);
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C86555 = LayoutInflaterFactory2C8655.this;
            layoutInflaterFactory2C86555.f25786 = null;
            C8273.m27433(layoutInflaterFactory2C86555.f25793);
            LayoutInflaterFactory2C8655.this.m28937();
        }

        @Override // Yue.AbstractC3086.InterfaceC0044
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo6288(AbstractC3086 abstractC3086, MenuItem menuItem) {
            return this.f3633.mo6288(abstractC3086, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class C8665 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m4618(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m4619(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C8666 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4620(@InterfaceC6391 Configuration configuration, @InterfaceC6391 Configuration configuration2, @InterfaceC6391 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static C5782 m4621(Configuration configuration) {
            return C5782.m17902(configuration.getLocales().toLanguageTags());
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m28941(C5782 c5782) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c5782.m17914()));
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m28942(Configuration configuration, C5782 c5782) {
            configuration.setLocales(LocaleList.forLanguageTags(c5782.m17914()));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C8667 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4622(@InterfaceC6391 Configuration configuration, @InterfaceC6391 Configuration configuration2, @InterfaceC6391 Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C8668 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static OnBackInvokedDispatcher m4623(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static OnBackInvokedCallback m4624(Object obj, final LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655) {
            Objects.requireNonNull(layoutInflaterFactory2C8655);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: Yue.ۥ۟ۡۡ۟
                public final void onBackInvoked() {
                    layoutInflaterFactory2C8655.m28912();
                }
            };
            C3296.m363(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m28943(Object obj, Object obj2) {
            C3296.m363(obj).unregisterOnBackInvokedCallback(C3295.m362(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠۟, reason: contains not printable characters */
    public class C8669 extends WindowCallbackC8434 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public InterfaceC8662 f25830;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f25831;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f25832;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f25833;

        public C8669(Window.Callback callback) {
            super(callback);
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f25832 ? m4417().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C8655.this.m28890(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C8655.this.m28915(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f25831) {
                m4417().onContentChanged();
            }
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C8694)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            InterfaceC8662 interfaceC8662 = this.f25830;
            return (interfaceC8662 == null || (viewOnCreatePanelView = interfaceC8662.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C8655.this.m28918(i);
            return true;
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f25833) {
                m4417().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                LayoutInflaterFactory2C8655.this.m28919(i);
            }
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C8694 c8694 = menu instanceof C8694 ? (C8694) menu : null;
            if (i == 0 && c8694 == null) {
                return false;
            }
            if (c8694 != null) {
                c8694.setOverrideVisibleItems(true);
            }
            InterfaceC8662 interfaceC8662 = this.f25830;
            boolean zOnPreparePanel = interfaceC8662 != null && interfaceC8662.mo4616(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (c8694 != null) {
                c8694.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        @InterfaceC7113(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C8694 c8694;
            C8674 c8674M28902 = LayoutInflaterFactory2C8655.this.m28902(0, true);
            if (c8674M28902 == null || (c8694 = c8674M28902.f25847) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c8694, i);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4625(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f25832 = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f25832 = false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28944(Window.Callback callback) {
            try {
                this.f25831 = true;
                callback.onContentChanged();
            } finally {
                this.f25831 = false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m28945(Window.Callback callback, int i, Menu menu) {
            try {
                this.f25833 = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f25833 = false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m28946(@InterfaceC6490 InterfaceC8662 interfaceC8662) {
            this.f25830 = interfaceC8662;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final ActionMode m28947(ActionMode.Callback callback) {
            C7681.C1323 c1323 = new C7681.C1323(LayoutInflaterFactory2C8655.this.f25776, callback);
            AbstractC3086 abstractC3086Mo28873 = LayoutInflaterFactory2C8655.this.mo28873(c1323);
            if (abstractC3086Mo28873 != null) {
                return c1323.m24450(abstractC3086Mo28873);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // Yue.WindowCallbackC8434, android.view.Window.Callback
        @InterfaceC7113(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (LayoutInflaterFactory2C8655.this.mo28854() && i == 0) ? m28947(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠۠, reason: contains not printable characters */
    public class C8670 extends AbstractC8671 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final PowerManager f25835;

        public C8670(@InterfaceC6391 Context context) {
            super();
            this.f25835 = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟ */
        public IntentFilter mo4626() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo28948() {
            return C8665.m4618(this.f25835) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo28949() {
            LayoutInflaterFactory2C8655.this.mo28840();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    public abstract class AbstractC8671 {

        /* JADX INFO: renamed from: ۥ */
        public BroadcastReceiver f3636;

        /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۡ$ۥ */
        public class C1592 extends BroadcastReceiver {
            public C1592() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC8671.this.mo28949();
            }
        }

        public AbstractC8671() {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4627() {
            BroadcastReceiver broadcastReceiver = this.f3636;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C8655.this.f25776.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f3636 = null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public abstract IntentFilter mo4626();

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract int mo28948();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m28950() {
            return this.f3636 != null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public abstract void mo28949();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m28951() {
            m4627();
            IntentFilter intentFilterMo4626 = mo4626();
            if (intentFilterMo4626 == null || intentFilterMo4626.countActions() == 0) {
                return;
            }
            if (this.f3636 == null) {
                this.f3636 = new C1592();
            }
            LayoutInflaterFactory2C8655.this.f25776.registerReceiver(this.f3636, intentFilterMo4626);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public class C8672 extends AbstractC8671 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C8005 f25837;

        public C8672(@InterfaceC6391 C8005 c8005) {
            super();
            this.f25837 = c8005;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟ */
        public IntentFilter mo4626() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo28948() {
            return this.f25837.m25229() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.AbstractC8671
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo28949() {
            LayoutInflaterFactory2C8655.this.mo28840();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥۣ۟۟۠, reason: contains not printable characters */
    public class C8673 extends ContentFrameLayout {
        public C8673(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C8655.this.m28890(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m28952((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C8655.this.m28885(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3323.m396(getContext(), i));
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m28952(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final class C8674 {

        /* JADX INFO: renamed from: ۥ */
        public int f3639;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3640;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f25840;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f25841;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f25842;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f25843;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public ViewGroup f25844;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public View f25845;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public View f25846;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C8694 f25847;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C8692 f25848;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Context f25849;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f25850;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f25851;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f25852;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f25853;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean f25854 = false;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f25855;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean f25856;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Bundle f25857;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Bundle f25858;

        /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ */
        @SuppressLint({"BanParcelableUsage"})
        public static class C1593 implements Parcelable {
            public static final Parcelable.Creator<C1593> CREATOR = new C8675();

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f25859;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public boolean f25860;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public Bundle f25861;

            /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ, reason: contains not printable characters */
            public class C8675 implements Parcelable.ClassLoaderCreator<C1593> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
                public C1593 createFromParcel(Parcel parcel) {
                    return C1593.m4630(parcel, null);
                }

                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
                public C1593 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return C1593.m4630(parcel, classLoader);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public C1593[] newArray(int i) {
                    return new C1593[i];
                }
            }

            /* JADX INFO: renamed from: ۥ */
            public static C1593 m4630(Parcel parcel, ClassLoader classLoader) {
                C1593 c1593 = new C1593();
                c1593.f25859 = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                c1593.f25860 = z;
                if (z) {
                    c1593.f25861 = parcel.readBundle(classLoader);
                }
                return c1593;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f25859);
                parcel.writeInt(this.f25860 ? 1 : 0);
                if (this.f25860) {
                    parcel.writeBundle(this.f25861);
                }
            }
        }

        public C8674(int i) {
            this.f3639 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4628() {
            Bundle bundle;
            C8694 c8694 = this.f25847;
            if (c8694 == null || (bundle = this.f25857) == null) {
                return;
            }
            c8694.restorePresenterStates(bundle);
            this.f25857 = null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4629() {
            C8694 c8694 = this.f25847;
            if (c8694 != null) {
                c8694.removeMenuPresenter(this.f25848);
            }
            this.f25848 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InterfaceC8700 m28953(InterfaceC8699.InterfaceC1607 interfaceC1607) {
            if (this.f25847 == null) {
                return null;
            }
            if (this.f25848 == null) {
                C8692 c8692 = new C8692(this.f25849, C6898.C6906.f18984);
                this.f25848 = c8692;
                c8692.setCallback(interfaceC1607);
                this.f25847.addMenuPresenter(this.f25848);
            }
            return this.f25848.getMenuView(this.f25844);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m28954() {
            if (this.f25845 == null) {
                return false;
            }
            return this.f25846 != null || this.f25848.m4643().getCount() > 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m28955(Parcelable parcelable) {
            C1593 c1593 = (C1593) parcelable;
            this.f3639 = c1593.f25859;
            this.f25856 = c1593.f25860;
            this.f25857 = c1593.f25861;
            this.f25845 = null;
            this.f25844 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Parcelable m28956() {
            C1593 c1593 = new C1593();
            c1593.f25859 = this.f3639;
            c1593.f25860 = this.f25852;
            if (this.f25847 != null) {
                Bundle bundle = new Bundle();
                c1593.f25861 = bundle;
                this.f25847.savePresenterStates(bundle);
            }
            return c1593;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m28957(C8694 c8694) {
            C8692 c8692;
            C8694 c86942 = this.f25847;
            if (c8694 == c86942) {
                return;
            }
            if (c86942 != null) {
                c86942.removeMenuPresenter(this.f25848);
            }
            this.f25847 = c8694;
            if (c8694 == null || (c8692 = this.f25848) == null) {
                return;
            }
            c8694.addMenuPresenter(c8692);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m28958(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C6898.C1110.f18352, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(C6898.C1110.f18529, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(C6898.C6908.f19273, true);
            }
            C4198 c4198 = new C4198(context, 0);
            c4198.getTheme().setTo(themeNewTheme);
            this.f25849 = c4198;
            TypedArray typedArrayObtainStyledAttributes = c4198.obtainStyledAttributes(C6898.C6909.f19461);
            this.f3640 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19548, 0);
            this.f25843 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19463, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۟$ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final class C8676 implements InterfaceC8699.InterfaceC1607 {
        public C8676() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
            C8694 rootMenu = c8694.getRootMenu();
            boolean z2 = rootMenu != c8694;
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
            if (z2) {
                c8694 = rootMenu;
            }
            C8674 c8674M28895 = layoutInflaterFactory2C8655.m28895(c8694);
            if (c8674M28895 != null) {
                if (!z2) {
                    LayoutInflaterFactory2C8655.this.m28886(c8674M28895, z);
                } else {
                    LayoutInflaterFactory2C8655.this.m28882(c8674M28895.f3639, c8674M28895, rootMenu);
                    LayoutInflaterFactory2C8655.this.m28886(c8674M28895, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4617(@InterfaceC6391 C8694 c8694) {
            Window.Callback callbackM28905;
            if (c8694 != c8694.getRootMenu()) {
                return true;
            }
            LayoutInflaterFactory2C8655 layoutInflaterFactory2C8655 = LayoutInflaterFactory2C8655.this;
            if (!layoutInflaterFactory2C8655.f25798 || (callbackM28905 = layoutInflaterFactory2C8655.m28905()) == null || LayoutInflaterFactory2C8655.this.f25809) {
                return true;
            }
            callbackM28905.onMenuOpened(108, c8694);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutInflaterFactory2C8655(Activity activity, InterfaceC3285 interfaceC3285) {
        this(activity, null, interfaceC3285, activity);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static Configuration m28875(@InterfaceC6391 Configuration configuration, @InterfaceC6490 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            C8666.m4620(configuration, configuration2, configuration3);
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout;
            if (i17 != (i18 & 15)) {
                configuration3.screenLayout |= i18 & 15;
            }
            int i19 = configuration.screenLayout & 192;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 192)) {
                configuration3.screenLayout |= i20 & 192;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 48)) {
                configuration3.screenLayout |= i22 & 48;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 768)) {
                configuration3.screenLayout |= i24 & 768;
            }
            C8667.m4622(configuration, configuration2, configuration3);
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode;
            if (i25 != (i26 & 15)) {
                configuration3.uiMode |= i26 & 15;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 48)) {
                configuration3.uiMode |= i28 & 48;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            int i35 = configuration.densityDpi;
            int i36 = configuration2.densityDpi;
            if (i35 != i36) {
                configuration3.densityDpi = i36;
            }
        }
        return configuration3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo28844(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
    public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        C8674 c8674M28895;
        Window.Callback callbackM28905 = m28905();
        if (callbackM28905 == null || this.f25809 || (c8674M28895 = m28895(c8694.getRootMenu())) == null) {
            return false;
        }
        return callbackM28905.onMenuItemSelected(c8674M28895.f3639, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
    public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
        m28925(true);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28838(View view, ViewGroup.LayoutParams layoutParams) {
        m28893();
        ((ViewGroup) this.f25793.findViewById(R.id.content)).addView(view, layoutParams);
        this.f25778.m28944(this.f25777.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo28839() {
        if (AbstractC8651.m28825(this.f25776) && AbstractC8651.m28823() != null && !AbstractC8651.m28823().equals(AbstractC8651.m28824())) {
            m28841(this.f25776);
        }
        return m28876(true);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo28840() {
        return m28876(true);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    @InterfaceC6391
    @InterfaceC3647
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public Context mo28843(@InterfaceC6391 Context context) {
        this.f25807 = true;
        int iM28911 = m28911(context, m28881());
        if (AbstractC8651.m28825(context)) {
            AbstractC8651.m28837(context);
        }
        C5782 c5782M28880 = m28880(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m28887(context, iM28911, c5782M28880, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C4198) {
            try {
                ((C4198) context).m1159(m28887(context, iM28911, c5782M28880, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f25772) {
            return super.mo28843(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM28887 = m28887(context, iM28911, c5782M28880, !configuration2.equals(configuration3) ? m28875(configuration2, configuration3) : null, true);
        C4198 c4198 = new C4198(context, C6898.C6908.f19285);
        c4198.m1159(configurationM28887);
        try {
            if (context.getTheme() != null) {
                C7130.C7135.m3422(c4198.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.mo28843(c4198);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public View mo28844(View view, String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        boolean z;
        if (this.f25823 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f25776.obtainStyledAttributes(C6898.C6909.f19461);
            String string = typedArrayObtainStyledAttributes.getString(C6898.C6909.f19578);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f25823 = new C3353();
            } else {
                try {
                    this.f25823 = (C3353) this.f25776.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i(AbstractC8651.f25744, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f25823 = new C3353();
                }
            }
        }
        boolean z2 = f25770;
        boolean zM28930 = false;
        if (z2) {
            if (this.f25824 == null) {
                this.f25824 = new C5680();
            }
            if (this.f25824.m2367(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zM28930 = m28930((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zM28930 = true;
                }
                z = zM28930;
            }
        } else {
            z = zM28930;
        }
        return this.f25823.createView(view, str, context, attributeSet, z, z2, true, C8170.m26954());
    }

    @Override // androidx.appcompat.app.AbstractC8651
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public <T extends View> T mo28845(@InterfaceC5411 int i) {
        m28893();
        return (T) this.f25777.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Context mo28846() {
        return this.f25776;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public final C1584.InterfaceC8646 mo28847() {
        return new C8661();
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public int mo28848() {
        return this.f25811;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public MenuInflater mo28849() {
        if (this.f25781 == null) {
            m28906();
            AbstractC1583 abstractC1583 = this.f25780;
            this.f25781 = new C7683(abstractC1583 != null ? abstractC1583.mo28708() : this.f25776);
        }
        return this.f25781;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public AbstractC1583 mo28850() {
        m28906();
        return this.f25780;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public boolean mo28851(int i) {
        int iM28926 = m28926(i);
        return (iM28926 != 1 ? iM28926 != 2 ? iM28926 != 5 ? iM28926 != 10 ? iM28926 != 108 ? iM28926 != 109 ? false : this.f25799 : this.f25798 : this.f25800 : this.f25797 : this.f25796 : this.f25802) || this.f25777.hasFeature(i);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo28852() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f25776);
        if (layoutInflaterFrom.getFactory() == null) {
            C5681.m17588(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C8655) {
                return;
            }
            Log.i(AbstractC8651.f25744, "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo28853() {
        if (m28922() == null || mo28850().mo28711()) {
            return;
        }
        m28910(0);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public boolean mo28854() {
        return this.f25791;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo28855(Configuration configuration) {
        AbstractC1583 abstractC1583Mo28850;
        if (this.f25798 && this.f25792 && (abstractC1583Mo28850 = mo28850()) != null) {
            abstractC1583Mo28850.mo28716(configuration);
        }
        C3304.m368().m6748(this.f25776);
        this.f25810 = new Configuration(this.f25776.getResources().getConfiguration());
        m28877(false, false);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo28856(Bundle bundle) {
        String strM19858;
        this.f25807 = true;
        m28876(false);
        m28894();
        Object obj = this.f25775;
        if (obj instanceof Activity) {
            try {
                strM19858 = C6355.m19858((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM19858 = null;
            }
            if (strM19858 != null) {
                AbstractC1583 abstractC1583M28922 = m28922();
                if (abstractC1583M28922 == null) {
                    this.f25820 = true;
                } else {
                    abstractC1583M28922.mo28731(true);
                }
            }
            AbstractC8651.m28813(this);
        }
        this.f25810 = new Configuration(this.f25776.getResources().getConfiguration());
        this.f25808 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28857() {
        if (this.f25775 instanceof Activity) {
            AbstractC8651.m28829(this);
        }
        if (this.f25817) {
            this.f25777.getDecorView().removeCallbacks(this.f25819);
        }
        this.f25809 = true;
        if (this.f25811 != -100) {
            Object obj = this.f25775;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f25769.put(this.f25775.getClass().getName(), Integer.valueOf(this.f25811));
            } else {
                f25769.remove(this.f25775.getClass().getName());
            }
        }
        AbstractC1583 abstractC1583 = this.f25780;
        if (abstractC1583 != null) {
            abstractC1583.mo28717();
        }
        m28884();
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo28858(Bundle bundle) {
        m28893();
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo28859() {
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        if (abstractC1583Mo28850 != null) {
            abstractC1583Mo28850.mo28754(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public void mo28860(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28861() {
        m28877(true, false);
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo28862() {
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        if (abstractC1583Mo28850 != null) {
            abstractC1583Mo28850.mo28754(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public boolean mo28863(int i) {
        int iM28926 = m28926(i);
        if (this.f25802 && iM28926 == 108) {
            return false;
        }
        if (this.f25798 && iM28926 == 1) {
            this.f25798 = false;
        }
        if (iM28926 == 1) {
            m28933();
            this.f25802 = true;
            return true;
        }
        if (iM28926 == 2) {
            m28933();
            this.f25796 = true;
            return true;
        }
        if (iM28926 == 5) {
            m28933();
            this.f25797 = true;
            return true;
        }
        if (iM28926 == 10) {
            m28933();
            this.f25800 = true;
            return true;
        }
        if (iM28926 == 108) {
            m28933();
            this.f25798 = true;
            return true;
        }
        if (iM28926 != 109) {
            return this.f25777.requestFeature(iM28926);
        }
        m28933();
        this.f25799 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo28864(int i) {
        m28893();
        ViewGroup viewGroup = (ViewGroup) this.f25793.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f25776).inflate(i, viewGroup);
        this.f25778.m28944(this.f25777.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo28865(View view) {
        m28893();
        ViewGroup viewGroup = (ViewGroup) this.f25793.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f25778.m28944(this.f25777.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28866(View view, ViewGroup.LayoutParams layoutParams) {
        m28893();
        ViewGroup viewGroup = (ViewGroup) this.f25793.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f25778.m28944(this.f25777.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo28867(boolean z) {
        this.f25791 = z;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public void mo28868(int i) {
        if (this.f25811 != i) {
            this.f25811 = i;
            if (this.f25807) {
                mo28840();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AbstractC8651
    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28869(@InterfaceC6490 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo28869(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f25825;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f25826) != null) {
            C8668.m28943(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f25826 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f25775;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f25825 = onBackInvokedDispatcher;
            } else {
                this.f25825 = C8668.m4623((Activity) this.f25775);
            }
        }
        m28937();
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo28870(Toolbar toolbar) {
        if (this.f25775 instanceof Activity) {
            AbstractC1583 abstractC1583Mo28850 = mo28850();
            if (abstractC1583Mo28850 instanceof C8682) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f25781 = null;
            if (abstractC1583Mo28850 != null) {
                abstractC1583Mo28850.mo28717();
            }
            this.f25780 = null;
            if (toolbar != null) {
                C8678 c8678 = new C8678(toolbar, m28904(), this.f25778);
                this.f25780 = c8678;
                this.f25778.m28946(c8678.f25866);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f25778.m28946(null);
            }
            mo28853();
        }
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public void mo28871(@InterfaceC7651 int i) {
        this.f25812 = i;
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    public final void mo28872(CharSequence charSequence) {
        this.f25782 = charSequence;
        InterfaceC4329 interfaceC4329 = this.f25783;
        if (interfaceC4329 != null) {
            interfaceC4329.setWindowTitle(charSequence);
            return;
        }
        if (m28922() != null) {
            m28922().mo28761(charSequence);
            return;
        }
        TextView textView = this.f25794;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC8651
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public AbstractC3086 mo28873(@InterfaceC6391 AbstractC3086.InterfaceC0044 interfaceC0044) {
        InterfaceC3285 interfaceC3285;
        if (interfaceC0044 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC3086 abstractC3086 = this.f25786;
        if (abstractC3086 != null) {
            abstractC3086.mo174();
        }
        C8664 c8664 = new C8664(interfaceC0044);
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        if (abstractC1583Mo28850 != null) {
            AbstractC3086 abstractC3086Mo28763 = abstractC1583Mo28850.mo28763(c8664);
            this.f25786 = abstractC3086Mo28763;
            if (abstractC3086Mo28763 != null && (interfaceC3285 = this.f25779) != null) {
                interfaceC3285.onSupportActionModeStarted(abstractC3086Mo28763);
            }
        }
        if (this.f25786 == null) {
            this.f25786 = m28932(c8664);
        }
        m28937();
        return this.f25786;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m28876(boolean z) {
        return m28877(z, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m28877(boolean z, boolean z2) {
        if (this.f25809) {
            return false;
        }
        int iM28881 = m28881();
        int iM28911 = m28911(this.f25776, iM28881);
        C5782 c5782M28880 = Build.VERSION.SDK_INT < 33 ? m28880(this.f25776) : null;
        if (!z2 && c5782M28880 != null) {
            c5782M28880 = m28901(this.f25776.getResources().getConfiguration());
        }
        boolean zM28936 = m28936(iM28911, c5782M28880, z);
        if (iM28881 == 0) {
            m28900(this.f25776).m28951();
        } else {
            AbstractC8671 abstractC8671 = this.f25815;
            if (abstractC8671 != null) {
                abstractC8671.m4627();
            }
        }
        if (iM28881 == 3) {
            m28898(this.f25776).m28951();
        } else {
            AbstractC8671 abstractC86712 = this.f25816;
            if (abstractC86712 != null) {
                abstractC86712.m4627();
            }
        }
        return zM28936;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final void m28878() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f25793.findViewById(R.id.content);
        View decorView = this.f25777.getDecorView();
        contentFrameLayout.m4665(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f25776.obtainStyledAttributes(C6898.C6909.f19461);
        typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19586, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19587, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19584)) {
            typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19584, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19585)) {
            typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19585, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19582)) {
            typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19582, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19583)) {
            typedArrayObtainStyledAttributes.getValue(C6898.C6909.f19583, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final void m28879(@InterfaceC6391 Window window) {
        if (this.f25777 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C8669) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C8669 c8669 = new C8669(callback);
        this.f25778 = c8669;
        window.setCallback(c8669);
        C7837 c7837M24868 = C7837.m24868(this.f25776, null, f25771);
        Drawable drawableM24876 = c7837M24868.m24876(0);
        if (drawableM24876 != null) {
            window.setBackgroundDrawable(drawableM24876);
        }
        c7837M24868.m24899();
        this.f25777 = window;
        if (Build.VERSION.SDK_INT < 33 || this.f25825 != null) {
            return;
        }
        mo28869(null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public C5782 m28880(@InterfaceC6391 Context context) {
        C5782 c5782M28823;
        if (Build.VERSION.SDK_INT >= 33 || (c5782M28823 = AbstractC8651.m28823()) == null) {
            return null;
        }
        C5782 c5782M28901 = m28901(context.getApplicationContext().getResources().getConfiguration());
        C5782 c5782M2462 = C5788.m2462(c5782M28823, c5782M28901);
        return c5782M2462.m17912() ? c5782M28901 : c5782M2462;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final int m28881() {
        int i = this.f25811;
        return i != -100 ? i : AbstractC8651.m28821();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m28882(int i, C8674 c8674, Menu menu) {
        if (menu == null) {
            if (c8674 == null && i >= 0) {
                C8674[] c8674Arr = this.f25804;
                if (i < c8674Arr.length) {
                    c8674 = c8674Arr[i];
                }
            }
            if (c8674 != null) {
                menu = c8674.f25847;
            }
        }
        if ((c8674 == null || c8674.f25852) && !this.f25809) {
            this.f25778.m28945(this.f25777.getCallback(), i, menu);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m28883(@InterfaceC6391 C8694 c8694) {
        if (this.f25803) {
            return;
        }
        this.f25803 = true;
        this.f25783.mo12535();
        Window.Callback callbackM28905 = m28905();
        if (callbackM28905 != null && !this.f25809) {
            callbackM28905.onPanelClosed(108, c8694);
        }
        this.f25803 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final void m28884() {
        AbstractC8671 abstractC8671 = this.f25815;
        if (abstractC8671 != null) {
            abstractC8671.m4627();
        }
        AbstractC8671 abstractC86712 = this.f25816;
        if (abstractC86712 != null) {
            abstractC86712.m4627();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m28885(int i) {
        m28886(m28902(i, true), true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m28886(C8674 c8674, boolean z) {
        ViewGroup viewGroup;
        InterfaceC4329 interfaceC4329;
        if (z && c8674.f3639 == 0 && (interfaceC4329 = this.f25783) != null && interfaceC4329.mo1295()) {
            m28883(c8674.f25847);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f25776.getSystemService("window");
        if (windowManager != null && c8674.f25852 && (viewGroup = c8674.f25844) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m28882(c8674.f3639, c8674, null);
            }
        }
        c8674.f25850 = false;
        c8674.f25851 = false;
        c8674.f25852 = false;
        c8674.f25845 = null;
        c8674.f25854 = true;
        if (this.f25805 == c8674) {
            this.f25805 = null;
        }
        if (c8674.f3639 == 0) {
            m28937();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final Configuration m28887(@InterfaceC6391 Context context, int i, @InterfaceC6490 C5782 c5782, @InterfaceC6490 Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c5782 != null) {
            m28927(configuration2, c5782);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final ViewGroup m28888() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f25776.obtainStyledAttributes(C6898.C6909.f19461);
        if (!typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19579)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19588, false)) {
            mo28863(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19579, false)) {
            mo28863(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19580, false)) {
            mo28863(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19581, false)) {
            mo28863(10);
        }
        this.f25801 = typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19462, false);
        typedArrayObtainStyledAttributes.recycle();
        m28894();
        this.f25777.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f25776);
        if (this.f25802) {
            viewGroup = this.f25800 ? (ViewGroup) layoutInflaterFrom.inflate(C6898.C6906.f18990, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C6898.C6906.f18989, (ViewGroup) null);
        } else if (this.f25801) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C6898.C6906.f18980, (ViewGroup) null);
            this.f25799 = false;
            this.f25798 = false;
        } else if (this.f25798) {
            TypedValue typedValue = new TypedValue();
            this.f25776.getTheme().resolveAttribute(C6898.C1110.f18359, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C4198(this.f25776, typedValue.resourceId) : this.f25776).inflate(C6898.C6906.f18991, (ViewGroup) null);
            InterfaceC4329 interfaceC4329 = (InterfaceC4329) viewGroup.findViewById(C6898.C6903.f18908);
            this.f25783 = interfaceC4329;
            interfaceC4329.setWindowCallback(m28905());
            if (this.f25799) {
                this.f25783.mo12534(109);
            }
            if (this.f25796) {
                this.f25783.mo12534(2);
            }
            if (this.f25797) {
                this.f25783.mo12534(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f25798 + ", windowActionBarOverlay: " + this.f25799 + ", android:windowIsFloating: " + this.f25801 + ", windowActionModeOverlay: " + this.f25800 + ", windowNoTitle: " + this.f25802 + " }");
        }
        C8273.m27468(viewGroup, new C8656());
        if (this.f25783 == null) {
            this.f25794 = (TextView) viewGroup.findViewById(C6898.C6903.f18955);
        }
        C8370.m27930(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C6898.C6903.f2449);
        ViewGroup viewGroup2 = (ViewGroup) this.f25777.findViewById(R.id.content);
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
        this.f25777.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C8658());
        return viewGroup;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m28889() {
        C8694 c8694;
        InterfaceC4329 interfaceC4329 = this.f25783;
        if (interfaceC4329 != null) {
            interfaceC4329.mo12535();
        }
        if (this.f25788 != null) {
            this.f25777.getDecorView().removeCallbacks(this.f25789);
            if (this.f25788.isShowing()) {
                try {
                    this.f25788.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f25788 = null;
        }
        m28892();
        C8674 c8674M28902 = m28902(0, false);
        if (c8674M28902 == null || (c8694 = c8674M28902.f25847) == null) {
            return;
        }
        c8694.close();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public boolean m28890(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f25775;
        if (((obj instanceof C5637.InterfaceC0820) || (obj instanceof DialogC3302)) && (decorView = this.f25777.getDecorView()) != null && C5637.m17497(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f25778.m4625(this.f25777.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m28913(keyCode, keyEvent) : m28916(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m28891(int i) {
        C8674 c8674M28902;
        C8674 c8674M289022 = m28902(i, true);
        if (c8674M289022.f25847 != null) {
            Bundle bundle = new Bundle();
            c8674M289022.f25847.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c8674M289022.f25858 = bundle;
            }
            c8674M289022.f25847.stopDispatchingItemsChanged();
            c8674M289022.f25847.clear();
        }
        c8674M289022.f25855 = true;
        c8674M289022.f25854 = true;
        if ((i != 108 && i != 0) || this.f25783 == null || (c8674M28902 = m28902(0, false)) == null) {
            return;
        }
        c8674M28902.f25850 = false;
        m28924(c8674M28902, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m28892() {
        C8357 c8357 = this.f25790;
        if (c8357 != null) {
            c8357.m27857();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final void m28893() {
        if (this.f25792) {
            return;
        }
        this.f25793 = m28888();
        CharSequence charSequenceM28904 = m28904();
        if (!TextUtils.isEmpty(charSequenceM28904)) {
            InterfaceC4329 interfaceC4329 = this.f25783;
            if (interfaceC4329 != null) {
                interfaceC4329.setWindowTitle(charSequenceM28904);
            } else if (m28922() != null) {
                m28922().mo28761(charSequenceM28904);
            } else {
                TextView textView = this.f25794;
                if (textView != null) {
                    textView.setText(charSequenceM28904);
                }
            }
        }
        m28878();
        m28920(this.f25793);
        this.f25792 = true;
        C8674 c8674M28902 = m28902(0, false);
        if (this.f25809) {
            return;
        }
        if (c8674M28902 == null || c8674M28902.f25847 == null) {
            m28910(108);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final void m28894() {
        if (this.f25777 == null) {
            Object obj = this.f25775;
            if (obj instanceof Activity) {
                m28879(((Activity) obj).getWindow());
            }
        }
        if (this.f25777 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public C8674 m28895(Menu menu) {
        C8674[] c8674Arr = this.f25804;
        int length = c8674Arr != null ? c8674Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C8674 c8674 = c8674Arr[i];
            if (c8674 != null && c8674.f25847 == menu) {
                return c8674;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final Context m28896() {
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        Context contextMo28708 = abstractC1583Mo28850 != null ? abstractC1583Mo28850.mo28708() : null;
        return contextMo28708 == null ? this.f25776 : contextMo28708;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public final int m28897(Context context) {
        if (!this.f25814 && (this.f25775 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f25775.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f25813 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d(AbstractC8651.f25744, "Exception while getting ActivityInfo", e);
                this.f25813 = 0;
            }
        }
        this.f25814 = true;
        return this.f25813;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public final AbstractC8671 m28898(@InterfaceC6391 Context context) {
        if (this.f25816 == null) {
            this.f25816 = new C8670(context);
        }
        return this.f25816;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final AbstractC8671 m28899() {
        return m28900(this.f25776);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final AbstractC8671 m28900(@InterfaceC6391 Context context) {
        if (this.f25815 == null) {
            this.f25815 = new C8672(C8005.m4018(context));
        }
        return this.f25815;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public C5782 m28901(Configuration configuration) {
        return C8666.m4621(configuration);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public C8674 m28902(int i, boolean z) {
        C8674[] c8674Arr = this.f25804;
        if (c8674Arr == null || c8674Arr.length <= i) {
            C8674[] c8674Arr2 = new C8674[i + 1];
            if (c8674Arr != null) {
                System.arraycopy(c8674Arr, 0, c8674Arr2, 0, c8674Arr.length);
            }
            this.f25804 = c8674Arr2;
            c8674Arr = c8674Arr2;
        }
        C8674 c8674 = c8674Arr[i];
        if (c8674 != null) {
            return c8674;
        }
        C8674 c86742 = new C8674(i);
        c8674Arr[i] = c86742;
        return c86742;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public ViewGroup m28903() {
        return this.f25793;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final CharSequence m28904() {
        Object obj = this.f25775;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f25782;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Window.Callback m28905() {
        return this.f25777.getCallback();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final void m28906() {
        m28893();
        if (this.f25798 && this.f25780 == null) {
            Object obj = this.f25775;
            if (obj instanceof Activity) {
                this.f25780 = new C8682((Activity) this.f25775, this.f25799);
            } else if (obj instanceof Dialog) {
                this.f25780 = new C8682((Dialog) this.f25775);
            }
            AbstractC1583 abstractC1583 = this.f25780;
            if (abstractC1583 != null) {
                abstractC1583.mo28731(this.f25820);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final boolean m28907(C8674 c8674) {
        View view = c8674.f25846;
        if (view != null) {
            c8674.f25845 = view;
            return true;
        }
        if (c8674.f25847 == null) {
            return false;
        }
        if (this.f25785 == null) {
            this.f25785 = new C8676();
        }
        View view2 = (View) c8674.m28953(this.f25785);
        c8674.f25845 = view2;
        return view2 != null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m28908(C8674 c8674) {
        c8674.m28958(m28896());
        c8674.f25844 = new C8673(c8674.f25849);
        c8674.f25840 = 81;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final boolean m28909(C8674 c8674) {
        Resources.Theme themeNewTheme;
        Context context = this.f25776;
        int i = c8674.f3639;
        if ((i == 0 || i == 108) && this.f25783 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C6898.C1110.f18359, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C6898.C1110.f18360, typedValue, true);
            } else {
                theme.resolveAttribute(C6898.C1110.f18360, typedValue, true);
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
                C4198 c4198 = new C4198(context, 0);
                c4198.getTheme().setTo(themeNewTheme);
                context = c4198;
            }
        }
        C8694 c8694 = new C8694(context);
        c8694.setCallback(this);
        c8674.m28957(c8694);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m28910(int i) {
        this.f25818 = (1 << i) | this.f25818;
        if (this.f25817) {
            return;
        }
        C8273.m27427(this.f25777.getDecorView(), this.f25819);
        this.f25817 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public int m28911(@InterfaceC6391 Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m28900(context).mo28948();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return m28898(context).mo28948();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public boolean m28912() {
        boolean z = this.f25806;
        this.f25806 = false;
        C8674 c8674M28902 = m28902(0, false);
        if (c8674M28902 != null && c8674M28902.f25852) {
            if (!z) {
                m28886(c8674M28902, true);
            }
            return true;
        }
        AbstractC3086 abstractC3086 = this.f25786;
        if (abstractC3086 != null) {
            abstractC3086.mo174();
            return true;
        }
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        return abstractC1583Mo28850 != null && abstractC1583Mo28850.mo28694();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public boolean m28913(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f25806 = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m28914(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final boolean m28914(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C8674 c8674M28902 = m28902(i, true);
        if (c8674M28902.f25852) {
            return false;
        }
        return m28924(c8674M28902, keyEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public boolean m28915(int i, KeyEvent keyEvent) {
        AbstractC1583 abstractC1583Mo28850 = mo28850();
        if (abstractC1583Mo28850 != null && abstractC1583Mo28850.mo28718(i, keyEvent)) {
            return true;
        }
        C8674 c8674 = this.f25805;
        if (c8674 != null && m28923(c8674, keyEvent.getKeyCode(), keyEvent, 1)) {
            C8674 c86742 = this.f25805;
            if (c86742 != null) {
                c86742.f25851 = true;
            }
            return true;
        }
        if (this.f25805 == null) {
            C8674 c8674M28902 = m28902(0, true);
            m28924(c8674M28902, keyEvent);
            boolean zM28923 = m28923(c8674M28902, keyEvent.getKeyCode(), keyEvent, 1);
            c8674M28902.f25850 = false;
            if (zM28923) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m28916(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m28917(0, keyEvent);
                return true;
            }
        } else if (m28912()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m28917(int i, KeyEvent keyEvent) {
        boolean zM28924;
        InterfaceC4329 interfaceC4329;
        if (this.f25786 != null) {
            return false;
        }
        boolean zMo12531 = true;
        C8674 c8674M28902 = m28902(i, true);
        if (i != 0 || (interfaceC4329 = this.f25783) == null || !interfaceC4329.mo12528() || ViewConfiguration.get(this.f25776).hasPermanentMenuKey()) {
            boolean z = c8674M28902.f25852;
            if (z || c8674M28902.f25851) {
                m28886(c8674M28902, true);
                zMo12531 = z;
            } else if (c8674M28902.f25850) {
                if (c8674M28902.f25855) {
                    c8674M28902.f25850 = false;
                    zM28924 = m28924(c8674M28902, keyEvent);
                } else {
                    zM28924 = true;
                }
                if (zM28924) {
                    m28921(c8674M28902, keyEvent);
                }
            } else {
                zMo12531 = false;
            }
        } else if (this.f25783.mo1295()) {
            zMo12531 = this.f25783.mo12531();
        } else if (!this.f25809 && m28924(c8674M28902, keyEvent)) {
            zMo12531 = this.f25783.mo12532();
        }
        if (zMo12531) {
            AudioManager audioManager = (AudioManager) this.f25776.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w(AbstractC8651.f25744, "Couldn't get audio manager");
            }
        }
        return zMo12531;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m28918(int i) {
        AbstractC1583 abstractC1583Mo28850;
        if (i != 108 || (abstractC1583Mo28850 = mo28850()) == null) {
            return;
        }
        abstractC1583Mo28850.mo28695(true);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m28919(int i) {
        if (i == 108) {
            AbstractC1583 abstractC1583Mo28850 = mo28850();
            if (abstractC1583Mo28850 != null) {
                abstractC1583Mo28850.mo28695(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C8674 c8674M28902 = m28902(i, true);
            if (c8674M28902.f25852) {
                m28886(c8674M28902, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public void m28920(ViewGroup viewGroup) {
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28921(C8674 c8674, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c8674.f25852 || this.f25809) {
            return;
        }
        if (c8674.f3639 == 0 && (this.f25776.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM28905 = m28905();
        if (callbackM28905 != null && !callbackM28905.onMenuOpened(c8674.f3639, c8674.f25847)) {
            m28886(c8674, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f25776.getSystemService("window");
        if (windowManager == null || !m28924(c8674, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = c8674.f25844;
        if (viewGroup != null && !c8674.f25854) {
            View view = c8674.f25846;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c8674.f25851 = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, c8674.f25841, c8674.f25842, 1002, 8519680, -3);
            layoutParams2.gravity = c8674.f25840;
            layoutParams2.windowAnimations = c8674.f25843;
            windowManager.addView(c8674.f25844, layoutParams2);
            c8674.f25852 = true;
            if (c8674.f3639 != 0) {
                m28937();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (!m28908(c8674) || c8674.f25844 == null) {
                return;
            }
        } else if (c8674.f25854 && viewGroup.getChildCount() > 0) {
            c8674.f25844.removeAllViews();
        }
        if (!m28907(c8674) || !c8674.m28954()) {
            c8674.f25854 = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = c8674.f25845.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        }
        c8674.f25844.setBackgroundResource(c8674.f3640);
        ViewParent parent = c8674.f25845.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c8674.f25845);
        }
        c8674.f25844.addView(c8674.f25845, layoutParams3);
        if (!c8674.f25845.hasFocus()) {
            c8674.f25845.requestFocus();
        }
        i = -2;
        c8674.f25851 = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, c8674.f25841, c8674.f25842, 1002, 8519680, -3);
        layoutParams22.gravity = c8674.f25840;
        layoutParams22.windowAnimations = c8674.f25843;
        windowManager.addView(c8674.f25844, layoutParams22);
        c8674.f25852 = true;
        if (c8674.f3639 != 0) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public final AbstractC1583 m28922() {
        return this.f25780;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public final boolean m28923(C8674 c8674, int i, KeyEvent keyEvent, int i2) {
        C8694 c8694;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c8674.f25850 || m28924(c8674, keyEvent)) && (c8694 = c8674.f25847) != null) {
            zPerformShortcut = c8694.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.f25783 == null) {
            m28886(c8674, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final boolean m28924(C8674 c8674, KeyEvent keyEvent) {
        InterfaceC4329 interfaceC4329;
        InterfaceC4329 interfaceC43292;
        InterfaceC4329 interfaceC43293;
        if (this.f25809) {
            return false;
        }
        if (c8674.f25850) {
            return true;
        }
        C8674 c86742 = this.f25805;
        if (c86742 != null && c86742 != c8674) {
            m28886(c86742, false);
        }
        Window.Callback callbackM28905 = m28905();
        if (callbackM28905 != null) {
            c8674.f25846 = callbackM28905.onCreatePanelView(c8674.f3639);
        }
        int i = c8674.f3639;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC43293 = this.f25783) != null) {
            interfaceC43293.mo12526();
        }
        if (c8674.f25846 == null && (!z || !(m28922() instanceof C8678))) {
            C8694 c8694 = c8674.f25847;
            if (c8694 == null || c8674.f25855) {
                if (c8694 == null && (!m28909(c8674) || c8674.f25847 == null)) {
                    return false;
                }
                if (z && this.f25783 != null) {
                    if (this.f25784 == null) {
                        this.f25784 = new C8663();
                    }
                    this.f25783.mo1294(c8674.f25847, this.f25784);
                }
                c8674.f25847.stopDispatchingItemsChanged();
                if (!callbackM28905.onCreatePanelMenu(c8674.f3639, c8674.f25847)) {
                    c8674.m28957(null);
                    if (z && (interfaceC4329 = this.f25783) != null) {
                        interfaceC4329.mo1294(null, this.f25784);
                    }
                    return false;
                }
                c8674.f25855 = false;
            }
            c8674.f25847.stopDispatchingItemsChanged();
            Bundle bundle = c8674.f25858;
            if (bundle != null) {
                c8674.f25847.restoreActionViewStates(bundle);
                c8674.f25858 = null;
            }
            if (!callbackM28905.onPreparePanel(0, c8674.f25846, c8674.f25847)) {
                if (z && (interfaceC43292 = this.f25783) != null) {
                    interfaceC43292.mo1294(null, this.f25784);
                }
                c8674.f25847.startDispatchingItemsChanged();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c8674.f25853 = z2;
            c8674.f25847.setQwertyMode(z2);
            c8674.f25847.startDispatchingItemsChanged();
        }
        c8674.f25850 = true;
        c8674.f25851 = false;
        this.f25805 = c8674;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m28925(boolean z) {
        InterfaceC4329 interfaceC4329 = this.f25783;
        if (interfaceC4329 == null || !interfaceC4329.mo12528() || (ViewConfiguration.get(this.f25776).hasPermanentMenuKey() && !this.f25783.mo12530())) {
            C8674 c8674M28902 = m28902(0, true);
            c8674M28902.f25854 = true;
            m28886(c8674M28902, false);
            m28921(c8674M28902, null);
            return;
        }
        Window.Callback callbackM28905 = m28905();
        if (this.f25783.mo1295() && z) {
            this.f25783.mo12531();
            if (this.f25809) {
                return;
            }
            callbackM28905.onPanelClosed(108, m28902(0, true).f25847);
            return;
        }
        if (callbackM28905 == null || this.f25809) {
            return;
        }
        if (this.f25817 && (this.f25818 & 1) != 0) {
            this.f25777.getDecorView().removeCallbacks(this.f25819);
            this.f25819.run();
        }
        C8674 c8674M289022 = m28902(0, true);
        C8694 c8694 = c8674M289022.f25847;
        if (c8694 == null || c8674M289022.f25855 || !callbackM28905.onPreparePanel(0, c8674M289022.f25846, c8694)) {
            return;
        }
        callbackM28905.onMenuOpened(108, c8674M289022.f25847);
        this.f25783.mo12532();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public final int m28926(int i) {
        if (i == 8) {
            Log.i(AbstractC8651.f25744, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i(AbstractC8651.f25744, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m28927(Configuration configuration, @InterfaceC6391 C5782 c5782) {
        C8666.m28942(configuration, c5782);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m28928(C5782 c5782) {
        C8666.m28941(c5782);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final boolean m28929() {
        ViewGroup viewGroup;
        return this.f25792 && (viewGroup = this.f25793) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final boolean m28930(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f25777.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public boolean m28931() {
        if (this.f25825 == null) {
            return false;
        }
        C8674 c8674M28902 = m28902(0, false);
        return (c8674M28902 != null && c8674M28902.f25852) || this.f25786 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public AbstractC3086 m28932(@InterfaceC6391 AbstractC3086.InterfaceC0044 interfaceC0044) {
        AbstractC3086 abstractC3086OnWindowStartingSupportActionMode;
        Context c4198;
        InterfaceC3285 interfaceC3285;
        m28892();
        AbstractC3086 abstractC3086 = this.f25786;
        if (abstractC3086 != null) {
            abstractC3086.mo174();
        }
        if (!(interfaceC0044 instanceof C8664)) {
            interfaceC0044 = new C8664(interfaceC0044);
        }
        InterfaceC3285 interfaceC32852 = this.f25779;
        if (interfaceC32852 == null || this.f25809) {
            abstractC3086OnWindowStartingSupportActionMode = null;
        } else {
            try {
                abstractC3086OnWindowStartingSupportActionMode = interfaceC32852.onWindowStartingSupportActionMode(interfaceC0044);
            } catch (AbstractMethodError unused) {
                abstractC3086OnWindowStartingSupportActionMode = null;
            }
        }
        if (abstractC3086OnWindowStartingSupportActionMode != null) {
            this.f25786 = abstractC3086OnWindowStartingSupportActionMode;
        } else {
            if (this.f25787 == null) {
                if (this.f25801) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f25776.getTheme();
                    theme.resolveAttribute(C6898.C1110.f18359, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f25776.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c4198 = new C4198(this.f25776, 0);
                        c4198.getTheme().setTo(themeNewTheme);
                    } else {
                        c4198 = this.f25776;
                    }
                    this.f25787 = new ActionBarContextView(c4198);
                    PopupWindow popupWindow = new PopupWindow(c4198, (AttributeSet) null, C6898.C1110.f18374);
                    this.f25788 = popupWindow;
                    C6711.m21390(popupWindow, 2);
                    this.f25788.setContentView(this.f25787);
                    this.f25788.setWidth(-1);
                    c4198.getTheme().resolveAttribute(C6898.C1110.f18353, typedValue, true);
                    this.f25787.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c4198.getResources().getDisplayMetrics()));
                    this.f25788.setHeight(-2);
                    this.f25789 = new RunnableC8659();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f25793.findViewById(C6898.C6903.f18896);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m28896()));
                        this.f25787 = (ActionBarContextView) viewStubCompat.m4687();
                    }
                }
            }
            if (this.f25787 != null) {
                m28892();
                this.f25787.m29072();
                C7566 c7566 = new C7566(this.f25787.getContext(), this.f25787, interfaceC0044, this.f25788 == null);
                if (interfaceC0044.mo176(c7566, c7566.mo6271())) {
                    c7566.mo6277();
                    this.f25787.m29069(c7566);
                    this.f25786 = c7566;
                    if (m28929()) {
                        this.f25787.setAlpha(0.0f);
                        C8357 c8357M4324 = C8273.m27308(this.f25787).m4324(1.0f);
                        this.f25790 = c8357M4324;
                        c8357M4324.m27873(new C8660());
                    } else {
                        this.f25787.setAlpha(1.0f);
                        this.f25787.setVisibility(0);
                        if (this.f25787.getParent() instanceof View) {
                            C8273.m27433((View) this.f25787.getParent());
                        }
                    }
                    if (this.f25788 != null) {
                        this.f25777.getDecorView().post(this.f25789);
                    }
                } else {
                    this.f25786 = null;
                }
            }
        }
        AbstractC3086 abstractC30862 = this.f25786;
        if (abstractC30862 != null && (interfaceC3285 = this.f25779) != null) {
            interfaceC3285.onSupportActionModeStarted(abstractC30862);
        }
        m28937();
        return this.f25786;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public final void m28933() {
        if (this.f25792) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final AppCompatActivity m28934() {
        for (Context baseContext = this.f25776; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final void m28935(Configuration configuration) {
        Activity activity = (Activity) this.f25775;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f25808 || this.f25809) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m28936(int i, @InterfaceC6490 C5782 c5782, boolean z) {
        boolean z2;
        Configuration configurationM28887 = m28887(this.f25776, i, c5782, null, false);
        int iM28897 = m28897(this.f25776);
        Configuration configuration = this.f25810;
        if (configuration == null) {
            configuration = this.f25776.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = configurationM28887.uiMode & 48;
        C5782 c5782M28901 = m28901(configuration);
        C5782 c5782M289012 = c5782 == null ? null : m28901(configurationM28887);
        int i4 = i2 != i3 ? 512 : 0;
        if (c5782M289012 != null && !c5782M28901.equals(c5782M289012)) {
            i4 |= 8196;
        }
        boolean z3 = true;
        if (((~iM28897) & i4) != 0 && z && this.f25807 && (f25772 || this.f25808)) {
            Object obj = this.f25775;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i4 & 8192) != 0) {
                    ((Activity) this.f25775).getWindow().getDecorView().setLayoutDirection(configurationM28887.getLayoutDirection());
                }
                C3090.m6309((Activity) this.f25775);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 || i4 == 0) {
            z3 = z2;
        } else {
            m28938(i3, c5782M289012, (i4 & iM28897) == i4, null);
        }
        if (z3) {
            Object obj2 = this.f25775;
            if (obj2 instanceof AppCompatActivity) {
                if ((i4 & 512) != 0) {
                    ((AppCompatActivity) obj2).onNightModeChanged(i);
                }
                if ((i4 & 4) != 0) {
                    ((AppCompatActivity) this.f25775).onLocalesChanged(c5782);
                }
            }
        }
        if (c5782M289012 != null) {
            m28928(m28901(this.f25776.getResources().getConfiguration()));
        }
        return z3;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void m28937() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zM28931 = m28931();
            if (zM28931 && this.f25826 == null) {
                this.f25826 = C8668.m4624(this.f25825, this);
            } else {
                if (zM28931 || (onBackInvokedCallback = this.f25826) == null) {
                    return;
                }
                C8668.m28943(this.f25825, onBackInvokedCallback);
                this.f25826 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public final void m28938(int i, @InterfaceC6490 C5782 c5782, boolean z, @InterfaceC6490 Configuration configuration) {
        Resources resources = this.f25776.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (c5782 != null) {
            m28927(configuration2, c5782);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = this.f25812;
        if (i2 != 0) {
            this.f25776.setTheme(i2);
            this.f25776.getTheme().applyStyle(this.f25812, true);
        }
        if (z && (this.f25775 instanceof Activity)) {
            m28935(configuration2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public final int m28939(@InterfaceC6490 C8472 c8472, @InterfaceC6490 Rect rect) {
        boolean z;
        boolean z2;
        int iM28293 = c8472 != null ? c8472.m28293() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f25787;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25787.getLayoutParams();
            if (this.f25787.isShown()) {
                if (this.f25821 == null) {
                    this.f25821 = new Rect();
                    this.f25822 = new Rect();
                }
                Rect rect2 = this.f25821;
                Rect rect3 = this.f25822;
                if (c8472 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c8472.m28291(), c8472.m28293(), c8472.m28292(), c8472.m28290());
                }
                C8370.m4343(this.f25793, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                C8472 c8472M27371 = C8273.m27371(this.f25793);
                int iM28291 = c8472M27371 == null ? 0 : c8472M27371.m28291();
                int iM28292 = c8472M27371 == null ? 0 : c8472M27371.m28292();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.f25795 != null) {
                    View view = this.f25795;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM28291 || marginLayoutParams2.rightMargin != iM28292) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM28291;
                            marginLayoutParams2.rightMargin = iM28292;
                            this.f25795.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f25776);
                    this.f25795 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM28291;
                    layoutParams.rightMargin = iM28292;
                    this.f25793.addView(this.f25795, -1, layoutParams);
                }
                View view3 = this.f25795;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    m28940(this.f25795);
                }
                if (!this.f25800 && z) {
                    iM28293 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.f25787.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f25795;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iM28293;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final void m28940(View view) {
        view.setBackgroundColor((C8273.m27385(view) & 8192) != 0 ? C4187.m12060(this.f25776, C6898.C6900.f18627) : C4187.m12060(this.f25776, C6898.C6900.f18626));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LayoutInflaterFactory2C8655(Dialog dialog, InterfaceC3285 interfaceC3285) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC3285, dialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflaterFactory2C8655(Context context, Window window, InterfaceC3285 interfaceC3285) {
        this(context, window, interfaceC3285, context);
    }

    public LayoutInflaterFactory2C8655(Context context, Activity activity, InterfaceC3285 interfaceC3285) {
        this(context, null, interfaceC3285, activity);
    }

    public LayoutInflaterFactory2C8655(Context context, Window window, InterfaceC3285 interfaceC3285, Object obj) {
        C7467<String, Integer> c7467;
        Integer num;
        AppCompatActivity appCompatActivityM28934;
        this.f25790 = null;
        this.f25791 = true;
        this.f25811 = -100;
        this.f25819 = new RunnableC1589();
        this.f25776 = context;
        this.f25779 = interfaceC3285;
        this.f25775 = obj;
        if (this.f25811 == -100 && (obj instanceof Dialog) && (appCompatActivityM28934 = m28934()) != null) {
            this.f25811 = appCompatActivityM28934.getDelegate().mo28848();
        }
        if (this.f25811 == -100 && (num = (c7467 = f25769).get(obj.getClass().getName())) != null) {
            this.f25811 = num.intValue();
            c7467.remove(obj.getClass().getName());
        }
        if (window != null) {
            m28879(window);
        }
        C3304.m6743();
    }
}
