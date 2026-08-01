package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class z00 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f5431a;

    /* JADX INFO: renamed from: b */
    public final Configuration f5432b;

    /* JADX INFO: renamed from: c */
    public final int f5433c;

    public z00(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f5431a = colorStateList;
        this.f5432b = configuration;
        this.f5433c = theme == null ? 0 : theme.hashCode();
    }
}
