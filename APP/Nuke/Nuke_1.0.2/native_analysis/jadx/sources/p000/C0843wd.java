package p000;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0843wd extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final ArrayList f12464i;

    public C0843wd(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f12464i = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.f12464i) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            C0882xd c0882xd = (C0882xd) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0882xd);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}
