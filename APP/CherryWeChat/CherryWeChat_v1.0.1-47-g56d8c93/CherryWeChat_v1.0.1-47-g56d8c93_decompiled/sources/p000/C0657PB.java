package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: PB */
/* JADX INFO: loaded from: classes.dex */
public final class C0657PB {

    /* JADX INFO: renamed from: b */
    public final View f2100b;

    /* JADX INFO: renamed from: a */
    public final HashMap f2099a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f2101c = new ArrayList();

    public C0657PB(View view) {
        this.f2100b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0657PB)) {
            return false;
        }
        C0657PB c0657pb = (C0657PB) obj;
        return this.f2100b == c0657pb.f2100b && this.f2099a.equals(c0657pb.f2099a);
    }

    public final int hashCode() {
        return this.f2099a.hashCode() + (this.f2100b.hashCode() * 31);
    }

    public final String toString() {
        String strM407e = AbstractC0213Ey.m407e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2100b + "\n", "    values:");
        HashMap map = this.f2099a;
        for (String str : map.keySet()) {
            strM407e = strM407e + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM407e;
    }
}
