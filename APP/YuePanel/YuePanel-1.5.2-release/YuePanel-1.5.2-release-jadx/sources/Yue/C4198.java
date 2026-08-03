package Yue;

import Yue.C6898;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4198 extends ContextWrapper {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Configuration f8514;

    /* JADX INFO: renamed from: ۥ */
    public int f733;

    /* JADX INFO: renamed from: ۥ۟ */
    public Resources.Theme f734;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public LayoutInflater f8515;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Configuration f8516;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Resources f8517;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4198() {
        super(null);
    }

    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m12088(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f8514 == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f8514 = configuration2;
        }
        return configuration.equals(f8514);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m1160();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8515 == null) {
            this.f8515 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8515;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f734;
        if (theme != null) {
            return theme;
        }
        if (this.f733 == 0) {
            this.f733 = C6898.C6908.f19286;
        }
        m12090();
        return this.f734;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f733 != i) {
            this.f733 = i;
            m12090();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1159(Configuration configuration) {
        if (this.f8517 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8516 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8516 = new Configuration(configuration);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final Resources m1160() {
        if (this.f8517 == null) {
            Configuration configuration = this.f8516;
            if (configuration == null || m12088(configuration)) {
                this.f8517 = super.getResources();
            } else {
                this.f8517 = createConfigurationContext(this.f8516).getResources();
            }
        }
        return this.f8517;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m12089() {
        return this.f733;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12090() {
        boolean z = this.f734 == null;
        if (z) {
            this.f734 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f734.setTo(theme);
            }
        }
        m12091(this.f734, this.f733, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12091(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4198(Context context, @InterfaceC7651 int i) {
        super(context);
        this.f733 = i;
    }

    public C4198(Context context, Resources.Theme theme) {
        super(context);
        this.f734 = theme;
    }
}
