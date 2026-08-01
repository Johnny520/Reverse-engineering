package p254v4;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p001A0.C0102b;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p271y4.AbstractC3501c;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3354a extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final String f10421e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f10422f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3354a(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f10421e = str;
        this.f10422f = arrayList;
        AbstractC0797o.m1396u(new C0102b(16, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@" + AbstractC3501c.m5755c(this.f10421e));
        sb.append("(");
        int i5 = 0;
        for (Object obj : this.f10422f) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            C3355b c3355b = (C3355b) obj;
            if (i5 != 0) {
                sb.append(", ");
            }
            sb.append(c3355b);
            i5 = i6;
        }
        sb.append(")");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
