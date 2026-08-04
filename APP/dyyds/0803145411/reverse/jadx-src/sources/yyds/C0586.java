package yyds;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛳᛵᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586 extends ContextWrapper {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Configuration f2794;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Resources f2795;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f2796;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Resources.Theme f2797;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public LayoutInflater f2798;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Configuration f2799;

    public C0586(Context context, int i) {
        super(context);
        this.f2796 = i;
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
        Resources resources = this.f2795;
        if (resources != null) {
            return resources;
        }
        Configuration configuration = this.f2799;
        if (configuration != null) {
            Configuration configuration2 = f2794;
            if (configuration2 == null) {
                configuration2 = new Configuration();
                configuration2.fontScale = 0.0f;
                f2794 = configuration2;
            }
            if (!configuration.equals(configuration2)) {
                Resources resources2 = AbstractC0098.m504(this, this.f2799).getResources();
                this.f2795 = resources2;
                return resources2;
            }
        }
        Resources resources3 = super.getResources();
        this.f2795 = resources3;
        return resources3;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.f2798;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.f2798 = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2797;
        if (theme != null) {
            return theme;
        }
        if (this.f2796 == 0) {
            this.f2796 = R.style.Theme_AppCompat_Light;
        }
        m1466();
        return this.f2797;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2796 != i) {
            this.f2796 = i;
            m1466();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1466() {
        if (this.f2797 == null) {
            this.f2797 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2797.setTo(theme);
            }
        }
        this.f2797.applyStyle(this.f2796, true);
    }
}
