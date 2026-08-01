package p083q;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0796j {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f2649a;

    /* JADX INFO: renamed from: b */
    public final Configuration f2650b;

    /* JADX INFO: renamed from: c */
    public final int f2651c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0796j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f2649a = colorStateList;
        this.f2650b = configuration;
        this.f2651c = theme == null ? 0 : theme.hashCode();
    }
}
