package p000a;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.transition.AbstractC1235e;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: a.Ff */
/* JADX INFO: loaded from: classes.dex */
public final class C0108Ff {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"UnknownNullness"})
    public final View f367b;

    /* JADX INFO: renamed from: a */
    public final HashMap f366a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC1235e> f368c = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C0108Ff() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0108Ff)) {
            return false;
        }
        C0108Ff c0108Ff = (C0108Ff) obj;
        return this.f367b == c0108Ff.f367b && this.f366a.equals(c0108Ff.f366a);
    }

    public final int hashCode() {
        return this.f366a.hashCode() + (this.f367b.hashCode() * 31);
    }

    public final String toString() {
        String strM2226f = C0944z.m2226f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f367b + "\n", "    values:");
        HashMap map = this.f366a;
        for (String str : map.keySet()) {
            strM2226f = strM2226f + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM2226f;
    }

    public C0108Ff(View view) {
        this.f367b = view;
    }
}
