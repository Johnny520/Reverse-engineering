package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: PB */
/* JADX INFO: loaded from: classes.dex */
public final class C0657PB {

    /* JADX INFO: renamed from: a */
    public final HashMap f2099a;

    /* JADX INFO: renamed from: b */
    public final View f2100b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2101c;

    public C0657PB(View r2) {
        this.f2099a = new HashMap();
        this.f2101c = new ArrayList();
        this.f2100b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0657PB) == false) goto L10;
        C0657PB r32 = (C0657PB) r3;
        View r0 = r32.f2100b;
        if (this.f2100b == r0) goto L7;
        return false;
    L7:
        if (this.f2099a.equals(r32.f2099a) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f2100b.hashCode() * 31;
        return this.f2099a.hashCode() + r0;
    }

    public final String toString() {
        String r1 = AbstractC0213Ey.m407e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2100b + "\n", "    values:");
        HashMap r2 = this.f2099a;
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
