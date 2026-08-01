package p066g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.p055lu.wxmask272.R;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0564d extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f1876f;

    /* JADX INFO: renamed from: a */
    public int f1877a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f1878b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f1879c;

    /* JADX INFO: renamed from: d */
    public Configuration f1880d;

    /* JADX INFO: renamed from: e */
    public Resources f1881e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0564d(Context context, int i2) {
        super(context);
        this.f1877a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1131a(Configuration configuration) {
        if (this.f1881e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1880d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1880d = new Configuration(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1132b() {
        if (this.f1878b == null) {
            this.f1878b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1878b.setTo(theme);
            }
        }
        this.f1878b.applyStyle(this.f1877a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f1881e == null) {
            Configuration configuration = this.f1880d;
            if (configuration == null) {
                this.f1881e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f1876f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f1876f = configuration2;
                    }
                    if (configuration.equals(f1876f)) {
                    }
                }
                this.f1881e = AbstractC0563c.m1130a(this, this.f1880d).getResources();
            }
        }
        return this.f1881e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1879c == null) {
            this.f1879c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1879c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1878b;
        if (theme != null) {
            return theme;
        }
        if (this.f1877a == 0) {
            this.f1877a = R.style.Theme_AppCompat_Light;
        }
        m1132b();
        return this.f1878b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f1877a != i2) {
            this.f1877a = i2;
            m1132b();
        }
    }
}
