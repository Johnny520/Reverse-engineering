package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.Z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455Z3 extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f1714f;

    /* JADX INFO: renamed from: a */
    public int f1715a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f1716b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f1717c;

    /* JADX INFO: renamed from: d */
    public Configuration f1718d;

    /* JADX INFO: renamed from: e */
    public Resources f1719e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0455Z3() {
        super(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1116a(Configuration configuration) {
        if (this.f1719e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1718d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1718d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m1117b() {
        if (this.f1716b == null) {
            this.f1716b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1716b.setTo(theme);
            }
        }
        this.f1716b.applyStyle(this.f1715a, true);
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
        if (this.f1719e == null) {
            Configuration configuration = this.f1718d;
            if (configuration == null) {
                this.f1719e = super.getResources();
            } else {
                if (f1714f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f1714f = configuration2;
                }
                if (!configuration.equals(f1714f)) {
                    this.f1719e = createConfigurationContext(this.f1718d).getResources();
                }
            }
        }
        return this.f1719e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1717c == null) {
            this.f1717c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1717c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1716b;
        if (theme != null) {
            return theme;
        }
        if (this.f1715a == 0) {
            this.f1715a = C0983R.style.Theme_AppCompat_Light;
        }
        m1117b();
        return this.f1716b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f1715a != i) {
            this.f1715a = i;
            m1117b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0455Z3(Context context, int i) {
        super(context);
        this.f1715a = i;
    }
}
