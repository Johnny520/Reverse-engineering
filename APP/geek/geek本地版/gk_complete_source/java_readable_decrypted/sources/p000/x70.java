package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x70 {

    /* JADX INFO: renamed from: b */
    public final View f5122b;

    /* JADX INFO: renamed from: a */
    public final HashMap f5121a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f5123c = new ArrayList();

    public x70(View view) {
        this.f5122b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x70)) {
            return false;
        }
        x70 x70Var = (x70) obj;
        return this.f5122b == x70Var.f5122b && this.f5121a.equals(x70Var.f5121a);
    }

    public final int hashCode() {
        return this.f5121a.hashCode() + (this.f5122b.hashCode() * 31);
    }

    public final String toString() {
        String strM2764i = z30.m2764i(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5122b + "\n", "    values:");
        HashMap map = this.f5121a;
        for (String str : map.keySet()) {
            strM2764i = strM2764i + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM2764i;
    }
}
