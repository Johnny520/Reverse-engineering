package defpackage;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ud extends sj {
    public final String i;
    public final ArrayList j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ud(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.i = str;
        this.j = arrayList;
        new hx2(new ea(3, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@".concat(i80.c(this.i)));
        sb.append("(");
        int i = 0;
        for (Object obj : this.j) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            vd vdVar = (vd) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(vdVar);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }
}
