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

    public C0764Rr(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f2431b = i4;
        this.f2432c = str;
        this.f2433d = new C1251cA(new C2790z9(4, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0764Rr) && AbstractC0585Nj.m1134a(((C0764Rr) obj).f2432c, this.f2432c);
    }

    /* JADX INFO: renamed from: g */
    public final C0149Dd m1562g() {
        return (C0149Dd) this.f2433d.getValue();
    }

    public final int hashCode() {
        return this.f2432c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f2431b;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m1562g().f404d);
        sb.append(" ");
        sb.append(m1562g().f401a);
        sb.append(".");
        sb.append(m1562g().f402b);
        sb.append("(");
        return AbstractC0213Ey.m410h(sb, AbstractC2453ra.m4901k0(m1562g().f403c, ", ", null, null, null, 62), ")");
    }
}
