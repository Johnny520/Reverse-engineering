package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: Rr */
/* JADX INFO: loaded from: classes.dex */
public final class C0764Rr extends AbstractC2614v5 {

    /* JADX INFO: renamed from: b */
    public final int f2431b;

    /* JADX INFO: renamed from: c */
    public final String f2432c;

    /* JADX INFO: renamed from: d */
    public final C1251cA f2433d;

    public C0764Rr(DexKitBridge r1, int r2, int r3, int r4, int r5, String r6, int r7, ArrayList r8) {
        super(r1, r2, r3);
        this.f2431b = r5;
        this.f2432c = r6;
        this.f2433d = new C1251cA(new C2790z9(4, this));
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof C0764Rr) == true) goto L8;
        return false;
    L8:
        if (AbstractC0585Nj.m1134a(((C0764Rr) r3).f2432c, this.f2432c) == false) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final C0149Dd m1562g() {
        return (C0149Dd) this.f2433d.getValue();
    }

    public final int hashCode() {
        return this.f2432c.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        int r2 = this.f2431b;
        if (r2 == 0) goto L5;
        r0.append(Modifier.toString(r2) + " ");
    L5:
        r0.append(m1562g().f404d);
        r0.append(" ");
        r0.append(m1562g().f401a);
        r0.append(".");
        r0.append(m1562g().f402b);
        r0.append("(");
        return AbstractC0213Ey.m410h(r0, AbstractC2453ra.m4901k0(m1562g().f403c, ", ", null, null, null, 62), ")");
    }
}
