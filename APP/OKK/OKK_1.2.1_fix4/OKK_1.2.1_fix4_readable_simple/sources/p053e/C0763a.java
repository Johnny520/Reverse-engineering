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
        if (this.f2677b != null) goto L7;
        this.f2677b = getResources().newTheme();
        Resources.Theme r02 = getBaseContext().getTheme();
        if (r02 == null) goto L7;
        this.f2677b.setTo(r02);
    L7:
        this.f2677b.applyStyle(this.f2676a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context r1) {
        super.attachBaseContext(r1);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2679d != null) goto L6;
        this.f2679d = super.getResources();
    L6:
        return this.f2679d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.f2678c != null) goto L8;
        this.f2678c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.f2678c;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme r02 = this.f2677b;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (this.f2676a != 0) goto L8;
        this.f2676a = C1031R.style.Theme_AppCompat_Light;
    L8:
        m1956a();
        return this.f2677b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.f2676a == r2) goto L6;
        this.f2676a = r2;
        m1956a();
        return;
    }
}
