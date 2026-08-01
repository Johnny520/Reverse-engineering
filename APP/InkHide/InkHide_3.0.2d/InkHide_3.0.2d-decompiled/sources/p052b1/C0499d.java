package p052b1;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.C0106f;
import p011F0.AbstractC0123k;
import p011F0.C0113a;
import p018J.AbstractC0157b;
import p027N0.AbstractC0223g;
import p063e1.AbstractC0554b;
import p065f1.C0557a;

/* JADX INFO: renamed from: b1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0499d extends AbstractC0157b {

    /* JADX INFO: renamed from: b */
    public final int f1578b;

    /* JADX INFO: renamed from: c */
    public final String f1579c;

    /* JADX INFO: renamed from: d */
    public final Integer f1580d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1581e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1582f;

    /* JADX INFO: renamed from: g */
    public final C0106f f1583g;

    /* JADX INFO: renamed from: h */
    public final C0106f f1584h;

    /* JADX INFO: renamed from: i */
    public final C0106f f1585i;

    /* JADX INFO: renamed from: j */
    public final C0106f f1586j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0499d(DexKitBridge dexKitBridge, int i2, int i3, int i4, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i2, i3);
        this.f1578b = i4;
        this.f1579c = str;
        this.f1580d = num;
        this.f1581e = arrayList;
        this.f1582f = arrayList3;
        this.f1583g = new C0106f(new C0113a(6, this));
        this.f1584h = new C0106f(new C0497b(this, dexKitBridge, i3));
        this.f1585i = new C0106f(new C0497b(dexKitBridge, this, i3, 1));
        this.f1586j = new C0106f(new C0497b(dexKitBridge, this, i3, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0557a m962b() {
        return (C0557a) this.f1583g.m247a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Class m963c(ClassLoader classLoader) {
        AbstractC0223g.m418e(classLoader, "classLoader");
        C0557a c0557aM962b = m962b();
        c0557aM962b.getClass();
        int i2 = AbstractC0554b.f1862a;
        return AbstractC0554b.m1129a(classLoader, c0557aM962b.f1863a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0499d) {
            return AbstractC0223g.m414a(this.f1579c, ((C0499d) obj).f1579c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1579c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f1578b;
        if (i2 > 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append("class " + m962b().f1863a);
        C0499d c0499d = (C0499d) this.f1584h.m247a();
        if (c0499d != null) {
            sb.append(" extends ");
            sb.append(c0499d.m962b().f1863a);
        }
        if (this.f1581e.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC0123k.m271m0((C0500e) this.f1585i.m247a(), ", ", null, null, C0498c.f1577a, 30));
        }
        String string = sb.toString();
        AbstractC0223g.m417d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
