package p192;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7807 extends ContextWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Configuration f21287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Resources f21288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Configuration f21289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public LayoutInflater f21290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Resources.Theme f21291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21292;

    public C7807(Context context, int i) {
        super(context);
        this.f21292 = i;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f21288
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f21289
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = p192.C7807.f21287
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p192.C7807.f21287 = r1
        L16:
            android.content.res.Configuration r1 = p192.C7807.f21287
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f21289
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f21288 = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f21288 = r0
        L32:
            android.content.res.Resources r3 = r3.f21288
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p192.C7807.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f21290 == null) {
            this.f21290 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f21290;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f21291;
        if (theme != null) {
            return theme;
        }
        if (this.f21292 == 0) {
            this.f21292 = 605225666;
        }
        m13142();
        return this.f21291;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f21292 != i) {
            this.f21292 = i;
            m13142();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13142() {
        if (this.f21291 == null) {
            this.f21291 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f21291.setTo(theme);
            }
        }
        this.f21291.applyStyle(this.f21292, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13143(Configuration configuration) {
        if (this.f21288 != null) {
            C5919.m11250("getResources() or getAssets() has already been called");
        } else if (this.f21289 == null) {
            this.f21289 = new Configuration(configuration);
        } else {
            C5919.m11250("Override configuration has already been set");
        }
    }
}
