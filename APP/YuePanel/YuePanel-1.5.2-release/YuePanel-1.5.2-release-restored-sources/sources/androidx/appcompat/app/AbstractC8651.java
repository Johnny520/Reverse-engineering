package androidx.appcompat.app;

import Yue.AbstractC3086;
import Yue.C3365;
import Yue.C3399;
import Yue.C5782;
import Yue.C8170;
import Yue.InterfaceC3262;
import Yue.InterfaceC3285;
import Yue.InterfaceC3647;
import Yue.InterfaceC4482;
import Yue.InterfaceC5411;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import Yue.ServiceC3364;
import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC8651;
import androidx.appcompat.app.C1584;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8651 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean f25743 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f25744 = "AppCompatDelegate";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f25746 = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f25747 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Deprecated
    public static final int f25748 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Deprecated
    public static final int f25749 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f25750 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f25751 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f25752 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f25753 = -100;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f25762 = 108;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f25763 = 109;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f25764 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static ExecutorC8653 f25745 = new ExecutorC8653(new ExecutorC8654());

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int f25754 = -100;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static C5782 f25755 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static C5782 f25756 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static Boolean f25757 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static boolean f25758 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final C3399<WeakReference<AbstractC8651>> f25759 = new C3399<>();

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final Object f25760 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final Object f25761 = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ */
    @InterfaceC7113(24)
    public static class C1586 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m4608(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟ */
    @InterfaceC7113(33)
    public static class C1587 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m4609(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4610(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8652 {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class ExecutorC8653 implements Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Object f25765 = new Object();

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final Queue<Runnable> f25766 = new ArrayDeque();

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final Executor f25767;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Runnable f25768;

        public ExecutorC8653(Executor executor) {
            this.f25767 = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f25765) {
                try {
                    this.f25766.add(new Runnable() { // from class: Yue.ۥ۟ۡ۠ۤ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5186.m4612(runnable);
                        }
                    });
                    if (this.f25768 == null) {
                        m28874();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ void m4612(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                m28874();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28874() {
            synchronized (this.f25765) {
                try {
                    Runnable runnablePoll = this.f25766.poll();
                    this.f25768 = runnablePoll;
                    if (runnablePoll != null) {
                        this.f25767.execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class ExecutorC8654 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m28813(@InterfaceC6391 AbstractC8651 abstractC8651) {
        synchronized (f25760) {
            m28830(abstractC8651);
            f25759.add(new WeakReference<>(abstractC8651));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m28814() {
        synchronized (f25760) {
            try {
                Iterator<WeakReference<AbstractC8651>> it = f25759.iterator();
                while (it.hasNext()) {
                    AbstractC8651 abstractC8651 = it.next().get();
                    if (abstractC8651 != null) {
                        abstractC8651.mo28840();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m28815() {
        Iterator<WeakReference<AbstractC8651>> it = f25759.iterator();
        while (it.hasNext()) {
            AbstractC8651 abstractC8651 = it.next().get();
            if (abstractC8651 != null) {
                abstractC8651.mo28839();
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static AbstractC8651 m28816(@InterfaceC6391 Activity activity, @InterfaceC6490 InterfaceC3285 interfaceC3285) {
        return new LayoutInflaterFactory2C8655(activity, interfaceC3285);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static AbstractC8651 m28817(@InterfaceC6391 Dialog dialog, @InterfaceC6490 InterfaceC3285 interfaceC3285) {
        return new LayoutInflaterFactory2C8655(dialog, interfaceC3285);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static AbstractC8651 m28818(@InterfaceC6391 Context context, @InterfaceC6391 Activity activity, @InterfaceC6490 InterfaceC3285 interfaceC3285) {
        return new LayoutInflaterFactory2C8655(context, activity, interfaceC3285);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static AbstractC8651 m28819(@InterfaceC6391 Context context, @InterfaceC6391 Window window, @InterfaceC6490 InterfaceC3285 interfaceC3285) {
        return new LayoutInflaterFactory2C8655(context, window, interfaceC3285);
    }

    @InterfaceC6391
    @InterfaceC3262
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static C5782 m28820() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM28822 = m28822();
            if (objM28822 != null) {
                return C5782.m17907(C1587.m4609(objM28822));
            }
        } else {
            C5782 c5782 = f25755;
            if (c5782 != null) {
                return c5782;
            }
        }
        return C5782.m17905();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static int m28821() {
        return f25754;
    }

    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static Object m28822() {
        Context contextMo28846;
        Iterator<WeakReference<AbstractC8651>> it = f25759.iterator();
        while (it.hasNext()) {
            AbstractC8651 abstractC8651 = it.next().get();
            if (abstractC8651 != null && (contextMo28846 = abstractC8651.mo28846()) != null) {
                return contextMo28846.getSystemService("locale");
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static C5782 m28823() {
        return f25755;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static C5782 m28824() {
        return f25756;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static boolean m28825(Context context) {
        if (f25757 == null) {
            try {
                Bundle bundle = ServiceC3364.m443(context).metaData;
                if (bundle != null) {
                    f25757 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d(f25744, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f25757 = Boolean.FALSE;
            }
        }
        return f25757.booleanValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static boolean m28826() {
        return C8170.m26952();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m28828(Context context) {
        m28836(context);
        f25758 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m28829(@InterfaceC6391 AbstractC8651 abstractC8651) {
        synchronized (f25760) {
            m28830(abstractC8651);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static void m28830(@InterfaceC6391 AbstractC8651 abstractC8651) {
        synchronized (f25760) {
            try {
                Iterator<WeakReference<AbstractC8651>> it = f25759.iterator();
                while (it.hasNext()) {
                    AbstractC8651 abstractC86512 = it.next().get();
                    if (abstractC86512 == abstractC8651 || abstractC86512 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static void m28831() {
        f25755 = null;
        f25756 = null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m28832(@InterfaceC6391 C5782 c5782) {
        Objects.requireNonNull(c5782);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM28822 = m28822();
            if (objM28822 != null) {
                C1587.m4610(objM28822, C1586.m4608(c5782.m17914()));
                return;
            }
            return;
        }
        if (c5782.equals(f25755)) {
            return;
        }
        synchronized (f25760) {
            f25755 = c5782;
            m28815();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m28833(boolean z) {
        C8170.m26953(z);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static void m28834(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d(f25744, "setDefaultNightMode() called with an unknown mode");
        } else if (f25754 != i) {
            f25754 = i;
            m28814();
        }
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static void m28835(boolean z) {
        f25757 = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static void m28836(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f25746);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m28820().m17912()) {
                    String strM446 = C3365.m446(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C1587.m4610(systemService, C1586.m4608(strM446));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static void m28837(final Context context) {
        if (m28825(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f25758) {
                    return;
                }
                f25745.execute(new Runnable() { // from class: Yue.ۥ۟ۡ۠ۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8651.m28828(context);
                    }
                });
                return;
            }
            synchronized (f25761) {
                try {
                    C5782 c5782 = f25755;
                    if (c5782 == null) {
                        if (f25756 == null) {
                            f25756 = C5782.m17902(C3365.m446(context));
                        }
                        if (f25756.m17912()) {
                        } else {
                            f25755 = f25756;
                        }
                    } else if (!c5782.equals(f25756)) {
                        C5782 c57822 = f25755;
                        f25756 = c57822;
                        C3365.m445(context, c57822.m17914());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo28838(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo28839() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract boolean mo28840();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28841(final Context context) {
        f25745.execute(new Runnable() { // from class: Yue.ۥۣ۟ۡ۠
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC8651.m28837(context);
            }
        });
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28842(Context context) {
    }

    @InterfaceC6391
    @InterfaceC3647
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Context mo28843(@InterfaceC6391 Context context) {
        m28842(context);
        return context;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract View mo28844(@InterfaceC6490 View view, String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract <T extends View> T mo28845(@InterfaceC5411 int i);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Context mo28846() {
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public abstract C1584.InterfaceC8646 mo28847();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int mo28848() {
        return -100;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public abstract MenuInflater mo28849();

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public abstract AbstractC1583 mo28850();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public abstract boolean mo28851(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public abstract void mo28852();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public abstract void mo28853();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public abstract boolean mo28854();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public abstract void mo28855(Configuration configuration);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28856(Bundle bundle);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public abstract void mo28857();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public abstract void mo28858(Bundle bundle);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public abstract void mo28859();

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public abstract void mo28860(Bundle bundle);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28861();

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public abstract void mo28862();

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public abstract boolean mo28863(int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract void mo28864(@InterfaceC5683 int i);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public abstract void mo28865(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28866(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public abstract void mo28867(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo28868(int i);

    @InterfaceC3647
    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void mo28869(@InterfaceC6490 OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public abstract void mo28870(@InterfaceC6490 Toolbar toolbar);

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void mo28871(@InterfaceC7651 int i) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public abstract void mo28872(@InterfaceC6490 CharSequence charSequence);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public abstract AbstractC3086 mo28873(@InterfaceC6391 AbstractC3086.InterfaceC0044 interfaceC0044);
}
