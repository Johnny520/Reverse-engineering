package p053e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0763a extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public int f2676a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f2677b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f2678c;

    /* JADX INFO: renamed from: d */
    public Resources f2679d;

    /* JADX INFO: renamed from: a */
    public final void m1956a() {
        if (this.f2677b == null) {
            this.f2677b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2677b.setTo(theme);
            }
        }
        this.f2677b.applyStyle(this.f2676a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2679d == null) {
            this.f2679d = super.getResources();
        }
        return this.f2679d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2678c == null) {
            this.f2678c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2678c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2677b;
        if (theme != null) {
            return theme;
        }
        if (this.f2676a == 0) {
            this.f2676a = C1031R.style.Theme_AppCompat_Light;
        }
        m1956a();
        return this.f2677b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f2676a != i2) {
            this.f2676a = i2;
            m1956a();
        }
    }
}
