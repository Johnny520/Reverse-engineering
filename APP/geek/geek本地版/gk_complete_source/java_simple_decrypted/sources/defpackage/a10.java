package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class a10 {
    public final Resources a;
    public final Resources.Theme b;

    public a10(Resources r1, Resources.Theme r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (a10.class != r5.getClass()) goto L15;
        a10 r52 = (a10) r5;
        if (this.a.equals(r52.a) == false) goto L15;
        if (pw.a(this.b, r52.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return pw.b(new Object[]{this.a, this.b});
    }
}
