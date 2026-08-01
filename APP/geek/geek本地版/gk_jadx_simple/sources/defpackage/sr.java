package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class sr {
    public static final sr b = null;
    public final tr a;

    static {
        b = new sr(new tr(rr.a(new Locale[0])));
    }

    public sr(tr r1) {
        this.a = r1;
    }

    public static sr a(String r4) {
        if (r4 == null) goto L12;
        if (r4.isEmpty() == true) goto L12;
        String[] r42 = r4.split(",", -1);
        int r0 = r42.length;
        Locale[] r1 = new Locale[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        r1[r2] = qr.a(r42[r2]);
        r2 = r2 + 1;
        goto L7
    L10:
        return new sr(new tr(rr.a(r1)));
    L12:
        return b;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof sr) == false) goto L8;
        tr r22 = ((sr) r2).a;
        if (this.a.equals(r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
