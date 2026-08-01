package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: ud */
/* JADX INFO: loaded from: classes.dex */
public final class C0777ud extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f4814f;

    /* JADX INFO: renamed from: a */
    public int f4815a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f4816b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f4817c;

    /* JADX INFO: renamed from: d */
    public Configuration f4818d;

    /* JADX INFO: renamed from: e */
    public Resources f4819e;

    public C0777ud(Context context, int i) {
        super(context);
        this.f4815a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2474a(Configuration configuration) {
        if (this.f4819e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f4818d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f4818d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2475b() {
        if (this.f4816b == null) {
            this.f4816b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4816b.setTo(theme);
            }
        }
        this.f4816b.applyStyle(this.f4815a, true);
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
            android.content.res.Resources r0 = r3.f4819e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f4818d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = p000.C0777ud.f4814f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p000.C0777ud.f4814f = r1
        L16:
            android.content.res.Configuration r1 = p000.C0777ud.f4814f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f4818d
            android.content.Context r0 = p000.AbstractC0740td.m2413a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f4819e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f4819e = r0
        L32:
            android.content.res.Resources r0 = r3.f4819e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0777ud.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4817c == null) {
            this.f4817c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4817c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4816b;
        if (theme != null) {
            return theme;
        }
        if (this.f4815a == 0) {
            this.f4815a = R.style.Theme_AppCompat_Light;
        }
        m2475b();
        return this.f4816b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f4815a != i) {
            this.f4815a = i;
            m2475b();
        }
    }
}
