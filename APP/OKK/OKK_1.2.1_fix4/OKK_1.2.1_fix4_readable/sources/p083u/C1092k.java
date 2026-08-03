package p083u;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: u.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1092k {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f4205a;

    /* JADX INFO: renamed from: b */
    public final Configuration f4206b;

    /* JADX INFO: renamed from: c */
    public final int f4207c;

    public C1092k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f4205a = colorStateList;
        this.f4206b = configuration;
        this.f4207c = theme == null ? 0 : theme.hashCode();
    }
}
