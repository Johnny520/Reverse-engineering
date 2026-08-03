package p115hh;

import java.util.ArrayList;
import kh.AbstractC2407b;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p041d1.C0655c0;
import p071f1.AbstractC1018n0;
import p276sf.C3962i;

/* JADX INFO: renamed from: hh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1716a extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final String f5704h;

    /* JADX INFO: renamed from: i */
    public final int f5705i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f5706j;

    /* JADX INFO: renamed from: k */
    public final C3962i f5707k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1716a(DexKitBridge dexKitBridge, String str, int i9, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f5704h = str;
        this.f5705i = i9;
        this.f5706j = arrayList;
        this.f5707k = new C3962i(new C0655c0(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("@".concat(AbstractC2407b.m5747e(this.f5704h)));
        sb2.append("(");
        int i9 = 0;
        for (Object obj : this.f5706j) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C1717b c1717b = (C1717b) obj;
            if (i9 != 0) {
                sb2.append(", ");
            }
            sb2.append(c1717b);
            i9 = i10;
        }
        sb2.append(")");
        return sb2.toString();
    }
}
