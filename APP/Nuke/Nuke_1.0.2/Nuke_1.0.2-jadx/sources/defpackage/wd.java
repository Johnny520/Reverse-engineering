package defpackage;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wd extends sj {
    public final ArrayList i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wd(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.i = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.i) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            xd xdVar = (xd) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(xdVar);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}
