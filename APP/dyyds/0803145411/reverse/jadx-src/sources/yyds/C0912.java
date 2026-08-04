package yyds;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛸᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0475 f4146;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final RunnableC0241 f4147;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ViewOnTouchListenerC0565 f4148;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final WindowManager.LayoutParams f4149;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f4150;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Activity f4151;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public String f4152;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public ComponentCallbacksC0955 f4153;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Object f4154;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public InterfaceC1095 f4155;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0675 f4156;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f4157;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final WindowManager f4158;

    public C0912(Activity activity) {
        WeakReference weakReference = new WeakReference(this);
        this.f4150 = weakReference;
        this.f4154 = new Object();
        new RunnableC0241(this, 1);
        this.f4147 = new RunnableC0241(this, 2);
        this.f4151 = activity;
        this.f4156 = new C0675(activity);
        this.f4158 = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4149 = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation.Toast;
        layoutParams.packageName = activity.getPackageName();
        this.f4149.flags = 40;
        ArrayList arrayList = AbstractC1222.f5603;
        synchronized (AbstractC1222.class) {
            if (((C0912) weakReference.get()) != null) {
                AbstractC1222.f5603.add(weakReference);
            }
        }
        View decorView = activity.getWindow().getDecorView();
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if ((attributes.flags & 1024) != 0 || (decorView.getSystemUiVisibility() & 4) != 0) {
            this.f4149.flags |= 1024;
            m2028();
        }
        this.f4149.layoutInDisplayCutoutMode = attributes.layoutInDisplayCutoutMode;
        m2028();
        int i = attributes.systemUiVisibility;
        if (i != 0) {
            this.f4149.systemUiVisibility = i;
            m2028();
        }
        if (decorView.getSystemUiVisibility() != 0) {
            this.f4156.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
        C0475 c0475 = new C0475();
        c0475.f2381 = activity;
        c0475.f2382 = weakReference;
        this.f4146 = c0475;
        activity.registerActivityLifecycleCallbacks(c0475);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m2024(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f4149;
        layoutParams.gravity = 51;
        layoutParams.x = i;
        layoutParams.y = i2;
        m2028();
        RunnableC0241 runnableC0241 = new RunnableC0241(this, 0);
        Handler handler = AbstractC2094.f10381;
        AbstractC2094.f10381.postAtTime(runnableC0241, this.f4154, SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2025() {
        C0675 c0675 = this.f4156;
        if (c0675 == null) {
            return;
        }
        if (c0675.getChildCount() == 0) {
            C0188.m798("WindowParams and view cannot be empty");
            return;
        }
        if (this.f4157) {
            m2030();
            return;
        }
        Activity activity = this.f4151;
        if (activity == null || !(activity.isFinishing() || activity.isDestroyed())) {
            try {
                ViewParent parent = this.f4156.getParent();
                WindowManager windowManager = this.f4158;
                if (parent != null) {
                    windowManager.removeViewImmediate(this.f4156);
                }
                windowManager.addView(this.f4156, this.f4149);
                this.f4157 = true;
                ViewOnTouchListenerC0565 viewOnTouchListenerC0565 = this.f4148;
                if (viewOnTouchListenerC0565 != null) {
                    viewOnTouchListenerC0565.f2739 = this;
                    C0675 c06752 = this.f4156;
                    viewOnTouchListenerC0565.f2742 = c06752;
                    if (c06752 != null) {
                        c06752.setOnTouchListener(viewOnTouchListenerC0565);
                        viewOnTouchListenerC0565.f2742.post(new RunnableC0309(0, viewOnTouchListenerC0565));
                    }
                }
                InterfaceC1095 interfaceC1095 = this.f4155;
                if (interfaceC1095 != null) {
                    interfaceC1095.mo570(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2026() {
        WindowManager.LayoutParams layoutParams = this.f4149;
        layoutParams.softInputMode = 32;
        layoutParams.flags &= -9;
        m2028();
        m2028();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2027() {
        if (this.f4157) {
            try {
                this.f4158.removeViewImmediate(this.f4156);
                InterfaceC1095 interfaceC1095 = this.f4155;
                if (interfaceC1095 != null) {
                    interfaceC1095.mo549();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.f4157 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2028() {
        if (this.f4157) {
            Handler handler = AbstractC2094.f10381;
            RunnableC0241 runnableC0241 = this.f4147;
            handler.removeCallbacks(runnableC0241);
            handler.postAtTime(runnableC0241, this.f4154, SystemClock.uptimeMillis());
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2029(ViewOnTouchListenerC0565 viewOnTouchListenerC0565) {
        this.f4148 = viewOnTouchListenerC0565;
        WindowManager.LayoutParams layoutParams = this.f4149;
        layoutParams.flags &= -17;
        m2028();
        layoutParams.flags &= -513;
        m2028();
        if (this.f4157) {
            m2030();
            viewOnTouchListenerC0565.f2739 = this;
            C0675 c0675 = this.f4156;
            viewOnTouchListenerC0565.f2742 = c0675;
            if (c0675 != null) {
                c0675.setOnTouchListener(viewOnTouchListenerC0565);
                viewOnTouchListenerC0565.f2742.post(new RunnableC0309(0, viewOnTouchListenerC0565));
            }
        }
        Activity activity = this.f4151;
        Resources resources = activity != null ? activity.getResources() : null;
        Configuration configuration = resources != null ? resources.getConfiguration() : null;
        if (configuration != null) {
            ComponentCallbacksC0955 componentCallbacksC0955 = this.f4153;
            if (componentCallbacksC0955 == null) {
                int i = configuration.orientation;
                componentCallbacksC0955 = new ComponentCallbacksC0955();
                componentCallbacksC0955.f4421 = i;
                this.f4153 = componentCallbacksC0955;
            }
            Activity activity2 = this.f4151;
            if (activity2 == null) {
                return;
            }
            Context applicationContext = activity2.getApplicationContext();
            if (applicationContext != null) {
                applicationContext.registerComponentCallbacks(componentCallbacksC0955);
            }
            componentCallbacksC0955.f4422 = new WeakReference(this);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m2030() {
        if (this.f4157) {
            try {
                this.f4158.updateViewLayout(this.f4156, this.f4149);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2031() {
        AbstractC2094.f10381.removeCallbacksAndMessages(this.f4154);
        if (this.f4157) {
            m2027();
        }
        ComponentCallbacksC0955 componentCallbacksC0955 = this.f4153;
        if (componentCallbacksC0955 != null) {
            Activity activity = this.f4151;
            if (activity != null) {
                Context applicationContext = activity.getApplicationContext();
                if (applicationContext != null) {
                    applicationContext.unregisterComponentCallbacks(componentCallbacksC0955);
                }
                WeakReference weakReference = componentCallbacksC0955.f4422;
                if (weakReference != null) {
                    weakReference.clear();
                }
                componentCallbacksC0955.f4422 = null;
            }
            this.f4153 = null;
        }
        InterfaceC1095 interfaceC1095 = this.f4155;
        if (interfaceC1095 != null) {
            interfaceC1095.mo556();
            this.f4155 = null;
        }
        C0475 c0475 = this.f4146;
        if (c0475 != null) {
            Activity activity2 = c0475.f2381;
            if (activity2 != null) {
                activity2.unregisterActivityLifecycleCallbacks(c0475);
            }
            this.f4146 = null;
        }
        ViewOnTouchListenerC0565 viewOnTouchListenerC0565 = this.f4148;
        if (viewOnTouchListenerC0565 != null) {
            viewOnTouchListenerC0565.f2739 = null;
            C0675 c0675 = viewOnTouchListenerC0565.f2742;
            if (c0675 != null) {
                c0675.setOnTouchListener(null);
                viewOnTouchListenerC0565.f2742 = null;
            }
            this.f4148 = null;
        }
        this.f4151 = null;
        this.f4156 = null;
        WeakReference weakReference2 = this.f4150;
        ArrayList arrayList = AbstractC1222.f5603;
        synchronized (AbstractC1222.class) {
            weakReference2.clear();
            AbstractC1222.f5603.remove(weakReference2);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m2032() {
        this.f4149.windowAnimations = R.style.Animation.Translucent;
        m2028();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2033(ViewGroup viewGroup) {
        int i;
        C0675 c0675 = this.f4156;
        if (c0675 == null) {
            return;
        }
        if (c0675.getChildCount() > 0) {
            this.f4156.removeAllViews();
        }
        this.f4156.addView(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        WindowManager.LayoutParams layoutParams2 = this.f4149;
        int i2 = layoutParams2.gravity;
        if (i2 == 0) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                i = ((FrameLayout.LayoutParams) layoutParams).gravity;
                if (i != -1) {
                    layoutParams2.gravity = i;
                    i2 = i;
                }
                if (i2 == 0) {
                    layoutParams2.gravity = 17;
                }
            } else {
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (i = ((LinearLayout.LayoutParams) layoutParams).gravity) != -1) {
                    layoutParams2.gravity = i;
                    i2 = i;
                }
                if (i2 == 0) {
                }
            }
        }
        if (layoutParams != null) {
            int i3 = layoutParams2.width;
            if (i3 == -2 && layoutParams2.height == -2) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams.width = i3;
                layoutParams.height = layoutParams2.height;
            }
        }
        m2028();
    }
}
