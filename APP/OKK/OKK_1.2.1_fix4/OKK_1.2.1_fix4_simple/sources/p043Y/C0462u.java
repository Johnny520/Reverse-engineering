package p043Y;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: Y.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0462u {

    /* JADX INFO: renamed from: a */
    public final HashMap f1041a;

    /* JADX INFO: renamed from: b */
    public final View f1042b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1043c;

    public C0462u(View r2) {
        this.f1041a = new HashMap();
        this.f1043c = new ArrayList();
        this.f1042b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0462u) == false) goto L10;
        C0462u r32 = (C0462u) r3;
        View r02 = r32.f1042b;
        if (this.f1042b == r02) goto L7;
        return false;
    L7:
        if (this.f1041a.equals(r32.f1041a) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r02 = this.f1042b.hashCode() * 31;
        return this.f1041a.hashCode() + r02;
    }

    public final String toString() {
        String r1 = AbstractC0324d.m722e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1042b + "\n", "    values:");
        HashMap r2 = this.f1041a;
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
