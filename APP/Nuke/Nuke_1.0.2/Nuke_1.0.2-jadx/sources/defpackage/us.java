package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class us extends sj {
    public final int i;
    public final String j;
    public final Integer k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final hx2 o;
    public final hx2 p;
    public final hx2 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public us(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.i = i3;
        this.j = str;
        this.k = num;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = arrayList3;
        this.o = new hx2(new ea(5, this));
        this.p = new hx2(new ts(this, dexKitBridge, i2));
        this.q = new hx2(new ts(dexKitBridge, this, i2, 1));
        new hx2(new ts(dexKitBridge, this, i2, 2));
        new hx2(new ts(dexKitBridge, this, i2, 0));
        new hx2(new ss(dexKitBridge, this, i2, i, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof us) {
            return t11.l(this.j, ((us) obj).j);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u70 k() {
        return (u70) this.o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.i;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + k().a);
        us usVar = (us) this.p.getValue();
        if (usVar != null) {
            sb.append(" extends ");
            sb.append(usVar.k().a);
        }
        if (this.l.size() > 0) {
            sb.append(" implements ");
            sb.append(du.u0((ws) this.q.getValue(), ", ", null, null, v6.x, 30));
        }
        return sb.toString();
    }
}
