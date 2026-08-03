package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7834 extends ContextWrapper {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object f23444 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static ArrayList<WeakReference<C7834>> f23445;

    /* JADX INFO: renamed from: ۥ */
    public final Resources f3106;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Resources.Theme f3107;

    public C7834(@InterfaceC6391 Context context) {
        super(context);
        if (!C8170.m26954()) {
            this.f3106 = new C7836(this, context.getResources());
            this.f3107 = null;
            return;
        }
        C8170 c8170 = new C8170(this, context.getResources());
        this.f3106 = c8170;
        Resources.Theme themeNewTheme = c8170.newTheme();
        this.f3107 = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3930(@InterfaceC6391 Context context) {
        if ((context instanceof C7834) || (context.getResources() instanceof C7836) || (context.getResources() instanceof C8170)) {
            return false;
        }
        return C8170.m26954();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Context m3931(@InterfaceC6391 Context context) {
        if (!m3930(context)) {
            return context;
        }
        synchronized (f23444) {
            try {
                ArrayList<WeakReference<C7834>> arrayList = f23445;
                if (arrayList == null) {
                    f23445 = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<C7834> weakReference = f23445.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f23445.remove(size);
                        }
                    }
                    for (int size2 = f23445.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C7834> weakReference2 = f23445.get(size2);
                        C7834 c7834 = weakReference2 != null ? weakReference2.get() : null;
                        if (c7834 != null && c7834.getBaseContext() == context) {
                            return c7834;
                        }
                    }
                }
                C7834 c78342 = new C7834(context);
                f23445.add(new WeakReference<>(c78342));
                return c78342;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3106.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3106;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3107;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f3107;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
