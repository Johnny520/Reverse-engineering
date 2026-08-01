package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends ContextWrapper {
    public static Configuration f;
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public kd(Context r1, int r2) {
        super(r1);
        this.a = r2;
    }

    public final void a(Configuration r2) {
        if (this.e != null) goto L11;
        if (this.d != null) goto L9;
        this.d = new Configuration(r2);
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

    public final void b() {
        if (this.b != null) goto L7;
        this.b = getResources().newTheme();
        Resources.Theme r0 = getBaseContext().getTheme();
        if (r0 == null) goto L7;
        this.b.setTo(r0);
    L7:
        this.b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e != null) goto L15;
        Configuration r0 = this.d;
        if (r0 != null) goto L7;
    L13:
        this.e = super.getResources();
        goto L15
    L7:
        if (f != null) goto L10;
        Configuration r1 = new Configuration();
        r1.fontScale = 0.0f;
        f = r1;
    L10:
        if (r0.equals(f) == true) goto L13;
        this.e = jd.a(this, this.d).getResources();
    L15:
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.c != null) goto L8;
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.c;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme r0 = this.b;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (this.a != 0) goto L8;
        this.a = R.style.Theme_AppCompat_Light;
    L8:
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.a == r2) goto L6;
        this.a = r2;
        b();
        return;
    }
}
