package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class z00 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public z00(ColorStateList r1, Configuration r2, Resources.Theme r3) {
        this.a = r1;
        this.b = r2;
        if (r3 != null) goto L5;
        int r12 = 0;
    L6:
        this.c = r12;
        return;
    L5:
        r12 = r3.hashCode();
        goto L6
    }
}
