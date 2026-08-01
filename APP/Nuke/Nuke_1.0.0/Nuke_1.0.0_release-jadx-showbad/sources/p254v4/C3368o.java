package p254v4;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p001A0.C0102b;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p277z4.C3526d;

/* JADX INFO: renamed from: v4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3368o extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final int f10460e;

    /* JADX INFO: renamed from: f */
    public final int f10461f;

    /* JADX INFO: renamed from: g */
    public final String f10462g;

    /* JADX INFO: renamed from: h */
    public final int f10463h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f10464i;

    /* JADX INFO: renamed from: j */
    public final C0887m f10465j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3368o(DexKitBridge dexKitBridge, int i5, int i6, int i7, int i8, String str, int i9, ArrayList arrayList) {
        super(dexKitBridge, i5, i6);
        this.f10460e = i7;
        this.f10461f = i8;
        this.f10462g = str;
        this.f10463h = i9;
        this.f10464i = arrayList;
        this.f10465j = AbstractC0797o.m1396u(new C0102b(19, this));
        AbstractC0797o.m1396u(new C3367n(dexKitBridge, this, i6, 0));
        AbstractC0797o.m1396u(new C3367n(dexKitBridge, this, i6, 2));
        AbstractC0797o.m1396u(new C3367n(dexKitBridge, this, i6, 1));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 9));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 4));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 8));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 7));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 5));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 6));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 11));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3368o) && AbstractC1665j.m2981a(((C3368o) obj).f10462g, this.f10462g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C3526d m5606f() {
        return (C3526d) this.f10465j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10462g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i5 = this.f10461f;
        if (i5 != 0) {
            sb.append(Modifier.toString(i5) + " ");
        }
        sb.append(m5606f().f10989d);
        sb.append(" ");
        sb.append(m5606f().f10986a);
        sb.append(".");
        sb.append(m5606f().f10987b);
        sb.append("(");
        sb.append(AbstractC0973m.m2016W(m5606f().f10988c, ", ", null, null, null, 62));
        sb.append(")");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
