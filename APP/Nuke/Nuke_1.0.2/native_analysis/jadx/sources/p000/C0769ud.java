package p000;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0769ud extends AbstractC0696sj {

    /* JADX INFO: renamed from: i */
    public final String f11235i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f11236j;

    public C0769ud(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f11235i = str;
        this.f11236j = arrayList;
        new hx2(new C0159ea(3, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@".concat(i80.m2300c(this.f11235i)));
        sb.append("(");
        int i = 0;
        for (Object obj : this.f11236j) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            C0806vd c0806vd = (C0806vd) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0806vd);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }
}
