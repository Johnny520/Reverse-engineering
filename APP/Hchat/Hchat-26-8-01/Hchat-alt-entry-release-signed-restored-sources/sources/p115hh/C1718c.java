package p115hh;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p071f1.AbstractC1018n0;

/* JADX INFO: renamed from: hh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1718c extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final ArrayList f5710h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1718c(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f5710h = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        int i9 = 0;
        for (Object obj : this.f5710h) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C1719d c1719d = (C1719d) obj;
            if (i9 != 0) {
                sb2.append(", ");
            }
            sb2.append(c1719d);
            i9 = i10;
        }
        sb2.append("}");
        return sb2.toString();
    }
}
