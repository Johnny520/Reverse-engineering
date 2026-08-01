package p052b1;

import java.lang.reflect.Modifier;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.C0106f;
import p011F0.C0113a;
import p018J.AbstractC0157b;
import p027N0.AbstractC0223g;
import p065f1.C0558b;

/* JADX INFO: renamed from: b1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0501f extends AbstractC0157b {

    /* JADX INFO: renamed from: b */
    public final int f1587b;

    /* JADX INFO: renamed from: c */
    public final String f1588c;

    /* JADX INFO: renamed from: d */
    public final int f1589d;

    /* JADX INFO: renamed from: e */
    public final C0106f f1590e;

    /* JADX INFO: renamed from: f */
    public final C0106f f1591f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0501f(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6) {
        super(dexKitBridge, i2, i3);
        this.f1587b = i5;
        this.f1588c = str;
        this.f1589d = i6;
        this.f1590e = new C0106f(new C0113a(7, this));
        this.f1591f = new C0106f(new C0497b(dexKitBridge, this, i3, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0558b m964b() {
        return (C0558b) this.f1590e.m247a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0501f) && AbstractC0223g.m414a(((C0501f) obj).f1588c, this.f1588c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1588c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f1587b;
        if (i2 > 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append(m964b().f1866c);
        sb.append(" ");
        sb.append(m964b().f1864a);
        sb.append(".");
        sb.append(m964b().f1865b);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
