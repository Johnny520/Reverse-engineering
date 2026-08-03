package p115hh;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p041d1.C0655c0;
import p071f1.AbstractC1018n0;
import p173lh.C2567a;
import p276sf.C3962i;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: hh.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1724i extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final String f5722h;

    /* JADX INFO: renamed from: i */
    public final int f5723i;

    /* JADX INFO: renamed from: j */
    public final String f5724j;

    /* JADX INFO: renamed from: k */
    public final Integer f5725k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5726l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f5727m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f5728n;

    /* JADX INFO: renamed from: o */
    public final C3962i f5729o;

    /* JADX INFO: renamed from: p */
    public final C3962i f5730p;

    /* JADX INFO: renamed from: q */
    public final C3962i f5731q;

    /* JADX INFO: renamed from: r */
    public final C3962i f5732r;

    /* JADX INFO: renamed from: s */
    public final C3962i f5733s;

    /* JADX INFO: renamed from: t */
    public final C3962i f5734t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1724i(DexKitBridge dexKitBridge, int i9, int i10, String str, int i11, String str2, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i9, i10);
        this.f5722h = str;
        this.f5723i = i11;
        this.f5724j = str2;
        this.f5725k = num;
        this.f5726l = arrayList;
        this.f5727m = arrayList2;
        this.f5728n = arrayList3;
        this.f5729o = new C3962i(new C0655c0(this, 4));
        this.f5730p = new C3962i(new C1722g(this, dexKitBridge, i10));
        this.f5731q = new C3962i(new C1722g(dexKitBridge, this, i10, 1));
        this.f5732r = new C3962i(new C1722g(dexKitBridge, this, i10, 2));
        this.f5733s = new C3962i(new C1722g(dexKitBridge, this, i10, 0));
        this.f5734t = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1724i) {
            return AbstractC1416l.m3825a(this.f5724j, ((C1724i) obj).f5724j);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5724j.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C2567a m4345p() {
        return (C2567a) this.f5729o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Class m4346q(ClassLoader classLoader) {
        classLoader.getClass();
        C2567a c2567aM4345p = m4345p();
        c2567aM4345p.getClass();
        return AbstractC0063p.m428u(classLoader, c2567aM4345p.f8327g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.f5723i;
        if (i9 > 0) {
            sb2.append(Modifier.toString(i9) + " ");
        }
        sb2.append("class " + m4345p().f8327g);
        C1724i c1724i = (C1724i) this.f5730p.getValue();
        if (c1724i != null) {
            sb2.append(" extends ");
            sb2.append(c1724i.m4345p().f8327g);
        }
        if (this.f5726l.size() > 0) {
            sb2.append(" implements ");
            sb2.append(AbstractC4166m.m8392A1((C1725j) this.f5731q.getValue(), ", ", null, null, C1723h.f5721g, 30));
        }
        return sb2.toString();
    }
}
