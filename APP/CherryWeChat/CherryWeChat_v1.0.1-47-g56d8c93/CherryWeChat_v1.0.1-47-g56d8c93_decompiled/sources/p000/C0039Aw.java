package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: Aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0039Aw {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f90a;

    /* JADX INFO: renamed from: b */
    public final Configuration f91b;

    /* JADX INFO: renamed from: c */
    public final int f92c;

    public C0039Aw(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f90a = colorStateList;
        this.f91b = configuration;
        this.f92c = theme == null ? 0 : theme.hashCode();
    }
}
