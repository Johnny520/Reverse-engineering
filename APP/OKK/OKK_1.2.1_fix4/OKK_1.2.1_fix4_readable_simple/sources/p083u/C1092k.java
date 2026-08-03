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

    public C1092k(ColorStateList r1, Configuration r2, Resources.Theme r3) {
        this.f4205a = r1;
        this.f4206b = r2;
        if (r3 != null) goto L5;
        int r12 = 0;
    L6:
        this.f4207c = r12;
        return;
    L5:
        r12 = r3.hashCode();
        goto L6
    }
}
