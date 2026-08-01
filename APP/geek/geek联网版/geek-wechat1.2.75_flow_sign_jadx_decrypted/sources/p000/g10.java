package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class g10 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f1854a;

    /* JADX INFO: renamed from: b */
    public final Configuration f1855b;

    /* JADX INFO: renamed from: c */
    public final int f1856c;

    public g10(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1854a = colorStateList;
        this.f1855b = configuration;
        this.f1856c = theme == null ? 0 : theme.hashCode();
    }
}
