package p043Y;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: Y.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0462u {

    /* JADX INFO: renamed from: b */
    public final View f1042b;

    /* JADX INFO: renamed from: a */
    public final HashMap f1041a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1043c = new ArrayList();

    public C0462u(View view) {
        this.f1042b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0462u)) {
            return false;
        }
        C0462u c0462u = (C0462u) obj;
        return this.f1042b == c0462u.f1042b && this.f1041a.equals(c0462u.f1041a);
    }

    public final int hashCode() {
        return this.f1041a.hashCode() + (this.f1042b.hashCode() * 31);
    }

    public final String toString() {
        String strM722e = AbstractC0324d.m722e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1042b + "\n", "    values:");
        HashMap map = this.f1041a;
        for (String str : map.keySet()) {
            strM722e = strM722e + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM722e;
    }
}
