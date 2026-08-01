package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x70 {
    public final HashMap a;
    public final View b;
    public final ArrayList c;

    public x70(View r2) {
        this.a = new HashMap();
        this.c = new ArrayList();
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof x70) == false) goto L10;
        x70 r32 = (x70) r3;
        View r0 = r32.b;
        if (this.b == r0) goto L7;
        return false;
    L7:
        if (this.a.equals(r32.a) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.b.hashCode() * 31;
        return this.a.hashCode() + r0;
    }

    public final String toString() {
        String r1 = z30.i(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap r2 = this.a;
        Iterator r3 = r2.keySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        String r4 = (String) r3.next();
        r1 = r1 + "    " + r4 + ": " + r2.get(r4) + "\n";
        goto L4
    L6:
        return r1;
    }
}
