package defpackage;

import java.lang.reflect.Modifier;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 extends sj {
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final hx2 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ji0(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.i = i3;
        this.j = i4;
        this.k = str;
        this.l = i5;
        this.m = new hx2(new ea(9, this));
        new hx2(new ii0(dexKitBridge, this, i2, 0));
        new hx2(new ii0(dexKitBridge, this, i2, 1));
        new hx2(new ss(dexKitBridge, this, i2, i, 1));
        new hx2(new ss(dexKitBridge, this, i2, i, 2));
        new hx2(new ss(dexKitBridge, this, i2, i, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && t11.l(((ji0) obj).k, this.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y70 k() {
        return (y70) this.m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.j;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(k().c);
        sb.append(" ");
        sb.append(k().a);
        sb.append(".");
        sb.append(k().b);
        return sb.toString();
    }
}
