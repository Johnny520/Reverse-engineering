package p115hh;

import gg.AbstractC1416l;
import java.lang.reflect.Modifier;
import org.luckypray.dexkit.DexKitBridge;
import p041d1.C0655c0;
import p071f1.AbstractC1018n0;
import p173lh.C2568b;
import p276sf.C3962i;

/* JADX INFO: renamed from: hh.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1727l extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final int f5739h;

    /* JADX INFO: renamed from: i */
    public final int f5740i;

    /* JADX INFO: renamed from: j */
    public final String f5741j;

    /* JADX INFO: renamed from: k */
    public final int f5742k;

    /* JADX INFO: renamed from: l */
    public final C3962i f5743l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1727l(DexKitBridge dexKitBridge, int i9, int i10, int i11, int i12, String str, int i13) {
        super(dexKitBridge, i9, i10);
        this.f5739h = i11;
        this.f5740i = i12;
        this.f5741j = str;
        this.f5742k = i13;
        this.f5743l = new C3962i(new C0655c0(this, 5));
        new C3962i(new C1726k(dexKitBridge, this, i10, 0));
        new C3962i(new C1726k(dexKitBridge, this, i10, 1));
        new C3962i(new C1721f(dexKitBridge, this, i10, i9, 1));
        new C3962i(new C1721f(dexKitBridge, this, i10, i9, 2));
        new C3962i(new C1721f(dexKitBridge, this, i10, i9, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1727l) && AbstractC1416l.m3825a(((C1727l) obj).f5741j, this.f5741j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5741j.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C2568b m4347p() {
        return (C2568b) this.f5743l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.f5740i;
        if (i9 > 0) {
            sb2.append(Modifier.toString(i9) + " ");
        }
        sb2.append(m4347p().f8330i);
        sb2.append(" ");
        sb2.append(m4347p().f8328g);
        sb2.append(".");
        sb2.append(m4347p().f8329h);
        return sb2.toString();
    }
}
