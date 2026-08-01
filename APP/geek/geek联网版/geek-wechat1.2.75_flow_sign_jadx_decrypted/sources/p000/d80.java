package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d80 {

    /* JADX INFO: renamed from: b */
    public final View f1335b;

    /* JADX INFO: renamed from: a */
    public final HashMap f1334a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1336c = new ArrayList();

    public d80(View view) {
        this.f1335b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return this.f1335b == d80Var.f1335b && this.f1334a.equals(d80Var.f1334a);
    }

    public final int hashCode() {
        return this.f1334a.hashCode() + (this.f1335b.hashCode() * 31);
    }

    public final String toString() {
        String strM1146i = g40.m1146i(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1335b + "\n", "    values:");
        HashMap map = this.f1334a;
        for (String str : map.keySet()) {
            strM1146i = strM1146i + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM1146i;
    }
}
