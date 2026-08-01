package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: kd */
/* JADX INFO: loaded from: classes.dex */
public final class C0407kd extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f2879f;

    /* JADX INFO: renamed from: a */
    public int f2880a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f2881b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f2882c;

    /* JADX INFO: renamed from: d */
    public Configuration f2883d;

    /* JADX INFO: renamed from: e */
    public Resources f2884e;

    public C0407kd(Context context, int i) {
        super(context);
        this.f2880a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1693a(Configuration configuration) {
        if (this.f2884e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2883d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2883d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m1694b() {
        if (this.f2881b == null) {
            this.f2881b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2881b.setTo(theme);
            }
        }
        this.f2881b.applyStyle(this.f2880a, true);
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
            android.content.res.Resources r0 = r3.f2884e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f2883d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = p000.C0407kd.f2879f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p000.C0407kd.f2879f = r1
        L16:
            android.content.res.Configuration r1 = p000.C0407kd.f2879f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f2883d
            android.content.Context r0 = p000.AbstractC0370jd.m1593a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f2884e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f2884e = r0
        L32:
            android.content.res.Resources r0 = r3.f2884e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0407kd.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2882c == null) {
            this.f2882c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2882c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2881b;
        if (theme != null) {
            return theme;
        }
        if (this.f2880a == 0) {
            this.f2880a = R.style.Theme_AppCompat_Light;
        }
        m1694b();
        return this.f2881b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2880a != i) {
            this.f2880a = i;
            m1694b();
        }
    }
}
