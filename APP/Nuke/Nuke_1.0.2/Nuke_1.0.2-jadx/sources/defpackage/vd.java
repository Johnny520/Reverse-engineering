package defpackage;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends sj {
    public final String i;
    public final xd j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vd(DexKitBridge dexKitBridge, String str, xd xdVar) {
        super(dexKitBridge, -1, -1);
        this.i = str;
        this.j = xdVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.i + " = " + this.j;
    }
}
