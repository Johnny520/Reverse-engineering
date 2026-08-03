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

    public C0039Aw(ColorStateList r1, Configuration r2, Resources.Theme r3) {
        this.f90a = r1;
        this.f91b = r2;
        if (r3 != null) goto L5;
        int r12 = 0;
    L6:
        this.f92c = r12;
        return;
    L5:
        r12 = r3.hashCode();
        goto L6
    }
}
