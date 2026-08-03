package p000a;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p000a.AbstractC0272P;
import p000a.AbstractC0461Z9;
import p000a.LayoutInflaterFactory2C0291Q0;
import p000a.ServiceC0870v1;

/* JADX INFO: renamed from: a.O0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0255O0 {

    /* JADX INFO: renamed from: a */
    public static final c f886a = new c(new d());

    /* JADX INFO: renamed from: b */
    public static final int f887b = -100;

    /* JADX INFO: renamed from: c */
    public static C0174J9 f888c = null;

    /* JADX INFO: renamed from: d */
    public static C0174J9 f889d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f890e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f891f = false;

    /* JADX INFO: renamed from: g */
    public static final C0202L1<WeakReference<AbstractC0255O0>> f892g = new C0202L1<>();

    /* JADX INFO: renamed from: h */
    public static final Object f893h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f894i = new Object();

    /* JADX INFO: renamed from: a.O0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocaleList m720a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: a.O0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m721a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: renamed from: b */
        public static void m722b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: a.O0$c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a */
        public final Object f895a = new Object();

        /* JADX INFO: renamed from: b */
        public final ArrayDeque f896b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public final d f897c;

        /* JADX INFO: renamed from: d */
        public Runnable f898d;

        public c(d dVar) {
            this.f897c = dVar;
        }

        /* JADX INFO: renamed from: b */
        public final void m723b() {
            synchronized (this.f895a) {
                try {
                    Runnable runnable = (Runnable) this.f896b.poll();
                    this.f898d = runnable;
                    if (runnable != null) {
                        this.f897c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f895a) {
                try {
                    this.f896b.add(new RunnableC0273P0(this, 0, runnable));
                    if (this.f898d == null) {
                        m723b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.O0$d */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m693m(Context context) {
        if (f890e == null) {
            try {
                int i = ServiceC0870v1.f3414a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0870v1.class), ServiceC0870v1.a.m2082a() | 128).metaData;
                if (bundle != null) {
                    f890e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f890e = Boolean.FALSE;
            }
        }
        return f890e.booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static void m694u(LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0) {
        synchronized (f893h) {
            try {
                Iterator<WeakReference<AbstractC0255O0>> it = f892g.iterator();
                while (true) {
                    AbstractC0461Z9.a aVar = (AbstractC0461Z9.a) it;
                    if (aVar.hasNext()) {
                        AbstractC0255O0 abstractC0255O0 = (AbstractC0255O0) ((WeakReference) aVar.next()).get();
                        if (abstractC0255O0 == layoutInflaterFactory2C0291Q0 || abstractC0255O0 == null) {
                            aVar.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo695A(int i) {
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo696B(CharSequence charSequence);

    /* JADX INFO: renamed from: C */
    public abstract AbstractC0272P mo697C(AbstractC0272P.a aVar);

    /* JADX INFO: renamed from: c */
    public abstract void mo698c(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: d */
    public Context mo699d(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: e */
    public abstract <T extends View> T mo700e(int i);

    /* JADX INFO: renamed from: f */
    public Context mo701f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract LayoutInflaterFactory2C0291Q0.b mo702g();

    /* JADX INFO: renamed from: h */
    public int mo703h() {
        return -100;
    }

    /* JADX INFO: renamed from: i */
    public abstract MenuInflater mo704i();

    /* JADX INFO: renamed from: j */
    public abstract AbstractC0200L mo705j();

    /* JADX INFO: renamed from: k */
    public abstract void mo706k();

    /* JADX INFO: renamed from: l */
    public abstract void mo707l();

    /* JADX INFO: renamed from: n */
    public abstract void mo708n(Configuration configuration);

    /* JADX INFO: renamed from: o */
    public abstract void mo709o();

    /* JADX INFO: renamed from: p */
    public abstract void mo710p();

    /* JADX INFO: renamed from: q */
    public abstract void mo711q();

    /* JADX INFO: renamed from: r */
    public abstract void mo712r();

    /* JADX INFO: renamed from: s */
    public abstract void mo713s();

    /* JADX INFO: renamed from: t */
    public abstract void mo714t();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo715v(int i);

    /* JADX INFO: renamed from: w */
    public abstract void mo716w(int i);

    /* JADX INFO: renamed from: x */
    public abstract void mo717x(View view);

    /* JADX INFO: renamed from: y */
    public abstract void mo718y(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: z */
    public abstract void mo719z(Toolbar toolbar);
}
