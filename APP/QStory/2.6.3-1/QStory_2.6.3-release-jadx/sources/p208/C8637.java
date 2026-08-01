package p208;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8637 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Configuration f21629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Resources f21630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Configuration f21631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public LayoutInflater f21632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Resources.Theme f21633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21634;

    public C8637(Context context, int i) {
        super(context);
        this.f21634 = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
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
        if (this.f21630 == null) {
            Configuration configuration = this.f21631;
            if (configuration == null) {
                this.f21630 = super.getResources();
            } else {
                if (f21629 == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f21629 = configuration2;
                }
                if (!configuration.equals(f21629)) {
                    this.f21630 = createConfigurationContext(this.f21631).getResources();
                }
            }
        }
        return this.f21630;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f21632 == null) {
            this.f21632 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f21632;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f21633;
        if (theme != null) {
            return theme;
        }
        if (this.f21634 == 0) {
            this.f21634 = 605225666;
        }
        m13729();
        return this.f21633;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f21634 != i) {
            this.f21634 = i;
            m13729();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13729() {
        if (this.f21633 == null) {
            this.f21633 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f21633.setTo(theme);
            }
        }
        this.f21633.applyStyle(this.f21634, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13730(Configuration configuration) {
        if (this.f21630 != null) {
            C6755.m11870("getResources() or getAssets() has already been called");
        } else if (this.f21631 == null) {
            this.f21631 = new Configuration(configuration);
        } else {
            C6755.m11870("Override configuration has already been set");
        }
    }
}
