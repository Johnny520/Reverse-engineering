package p052b1;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.C0106f;
import p011F0.AbstractC0123k;
import p011F0.C0113a;
import p018J.AbstractC0157b;
import p027N0.AbstractC0223g;
import p065f1.C0560d;

/* JADX INFO: renamed from: b1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0505j extends AbstractC0157b {

    /* JADX INFO: renamed from: b */
    public final int f1611b;

    /* JADX INFO: renamed from: c */
    public final String f1612c;

    /* JADX INFO: renamed from: d */
    public final C0106f f1613d;

    /* JADX INFO: renamed from: e */
    public final C0106f f1614e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0505j(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6, ArrayList arrayList) {
        super(dexKitBridge, i2, i3);
        this.f1611b = i5;
        this.f1612c = str;
        this.f1613d = new C0106f(new C0113a(8, this));
        this.f1614e = new C0106f(new C0504i(dexKitBridge, this, i3, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0560d m1006b() {
        return (C0560d) this.f1613d.m247a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1007c() {
        return (String) m1006b().f1873e.m247a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0505j) && AbstractC0223g.m414a(((C0505j) obj).f1612c, this.f1612c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1612c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f1611b;
        if (i2 != 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append(m1006b().f1872d);
        sb.append(" ");
        sb.append(m1006b().f1869a);
        sb.append(".");
        sb.append(m1006b().f1870b);
        sb.append("(");
        sb.append(AbstractC0123k.m271m0(m1006b().f1871c, ", ", null, null, null, 62));
        sb.append(")");
        String string = sb.toString();
        AbstractC0223g.m417d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
