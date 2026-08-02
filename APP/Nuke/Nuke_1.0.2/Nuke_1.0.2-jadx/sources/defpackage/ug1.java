package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends sj {
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final ArrayList m;
    public final hx2 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ug1(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.i = i3;
        this.j = i4;
        this.k = str;
        this.l = i5;
        this.m = arrayList;
        this.n = new hx2(new ea(15, this));
        new hx2(new tg1(dexKitBridge, this, i2, 0));
        new hx2(new tg1(dexKitBridge, this, i2, 2));
        new hx2(new tg1(dexKitBridge, this, i2, 1));
        new hx2(new ss(dexKitBridge, this, i2, i, 9));
        new hx2(new ss(dexKitBridge, this, i2, i, 4));
        new hx2(new ss(dexKitBridge, this, i2, i, 8));
        new hx2(new ss(dexKitBridge, this, i2, i, 7));
        new hx2(new ss(dexKitBridge, this, i2, i, 5));
        new hx2(new ss(dexKitBridge, this, i2, i, 6));
        new hx2(new ss(dexKitBridge, this, i2, i, 11));
        new hx2(new ss(dexKitBridge, this, i2, i, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug1) && t11.l(((ug1) obj).k, this.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g80 k() {
        return (g80) this.n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.j;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(k().d);
        sb.append(" ");
        sb.append(k().a);
        sb.append(".");
        sb.append(k().b);
        sb.append("(");
        return hk1.j(sb, du.u0(k().c, ", ", null, null, null, 62), ")");
    }
}
