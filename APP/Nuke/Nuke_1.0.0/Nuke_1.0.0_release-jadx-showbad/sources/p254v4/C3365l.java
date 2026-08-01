package p254v4;

import java.lang.reflect.Modifier;
import org.luckypray.dexkit.DexKitBridge;
import p001A0.C0102b;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p117X2.AbstractC1665j;
import p277z4.C3524b;

/* JADX INFO: renamed from: v4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3365l extends AbstractC0453a {

    /* JADX INFO: renamed from: e */
    public final int f10450e;

    /* JADX INFO: renamed from: f */
    public final int f10451f;

    /* JADX INFO: renamed from: g */
    public final String f10452g;

    /* JADX INFO: renamed from: h */
    public final int f10453h;

    /* JADX INFO: renamed from: i */
    public final C0887m f10454i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3365l(DexKitBridge dexKitBridge, int i5, int i6, int i7, int i8, String str, int i9) {
        super(dexKitBridge, i5, i6);
        this.f10450e = i7;
        this.f10451f = i8;
        this.f10452g = str;
        this.f10453h = i9;
        this.f10454i = AbstractC0797o.m1396u(new C0102b(18, this));
        AbstractC0797o.m1396u(new C3364k(dexKitBridge, this, i6, 0));
        AbstractC0797o.m1396u(new C3364k(dexKitBridge, this, i6, 1));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 1));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 2));
        AbstractC0797o.m1396u(new C3359f(dexKitBridge, this, i6, i5, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3365l) && AbstractC1665j.m2981a(((C3365l) obj).f10452g, this.f10452g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C3524b m5605f() {
        return (C3524b) this.f10454i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10452g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i5 = this.f10451f;
        if (i5 > 0) {
            sb.append(Modifier.toString(i5) + " ");
        }
        sb.append(m5605f().f10983c);
        sb.append(" ");
        sb.append(m5605f().f10981a);
        sb.append(".");
        sb.append(m5605f().f10982b);
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
