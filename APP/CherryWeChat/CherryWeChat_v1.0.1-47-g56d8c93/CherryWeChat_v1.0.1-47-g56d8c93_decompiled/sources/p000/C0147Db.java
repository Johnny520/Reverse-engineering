package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Db */
/* JADX INFO: loaded from: classes.dex */
public final class C0147Db extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f378f;

    /* JADX INFO: renamed from: a */
    public int f379a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f380b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f381c;

    /* JADX INFO: renamed from: d */
    public Configuration f382d;

    /* JADX INFO: renamed from: e */
    public Resources f383e;

    public C0147Db(Context context, int i) {
        super(context);
        this.f379a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m265a(Configuration configuration) {
        if (this.f383e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f382d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f382d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m266b() {
        if (this.f380b == null) {
            this.f380b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f380b.setTo(theme);
            }
        }
        this.f380b.applyStyle(this.f379a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f383e == null) {
            Configuration configuration = this.f382d;
            if (configuration == null) {
                this.f383e = super.getResources();
            } else {
                if (f378f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f378f = configuration2;
                }
                if (!configuration.equals(f378f)) {
                    this.f383e = createConfigurationContext(this.f382d).getResources();
                }
            }
        }
        return this.f383e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f381c == null) {
            this.f381c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f381c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f380b;
        if (theme != null) {
            return theme;
        }
        if (this.f379a == 0) {
            this.f379a = R.style.Theme_AppCompat_Light;
        }
        m266b();
        return this.f380b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f379a != i) {
            this.f379a = i;
            m266b();
        }
    }
}
