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

    public C0147Db(Context r1, int r2) {
        super(r1);
        this.f379a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m265a(Configuration r2) {
        if (this.f383e != null) goto L11;
        if (this.f382d != null) goto L9;
        this.f382d = new Configuration(r2);
        return;
    L9:
        throw new IllegalStateException("Override configuration has already been set");
    L11:
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context r1) {
        super.attachBaseContext(r1);
    }

    /* JADX INFO: renamed from: b */
    public final void m266b() {
        if (this.f380b != null) goto L7;
        this.f380b = getResources().newTheme();
        Resources.Theme r0 = getBaseContext().getTheme();
        if (r0 == null) goto L7;
        this.f380b.setTo(r0);
    L7:
        this.f380b.applyStyle(this.f379a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f383e != null) goto L15;
        Configuration r0 = this.f382d;
        if (r0 != null) goto L7;
    L13:
        this.f383e = super.getResources();
        goto L15
    L7:
        if (f378f != null) goto L10;
        Configuration r1 = new Configuration();
        r1.fontScale = 0.0f;
        f378f = r1;
    L10:
        if (r0.equals(f378f) == true) goto L13;
        this.f383e = createConfigurationContext(this.f382d).getResources();
    L15:
        return this.f383e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.f381c != null) goto L8;
        this.f381c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.f381c;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme r0 = this.f380b;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (this.f379a != 0) goto L8;
        this.f379a = R.style.Theme_AppCompat_Light;
    L8:
        m266b();
        return this.f380b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.f379a == r2) goto L6;
        this.f379a = r2;
        m266b();
        return;
    }
}
