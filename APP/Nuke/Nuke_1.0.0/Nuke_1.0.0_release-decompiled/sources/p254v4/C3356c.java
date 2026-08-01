package p254v4;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p032F3.AbstractC0453a;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: v4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3356c extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final ArrayList f10425e;

    public C3356c(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f10425e = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i5 = 0;
        for (Object obj : this.f10425e) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            C3357d c3357d = (C3357d) obj;
            if (i5 != 0) {
                sb.append(", ");
            }
            sb.append(c3357d);
            i5 = i6;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
