package p115hh;

import bsh.C0353j;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.AbstractC2409d;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p041d1.C0655c0;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1018n0;
import p173lh.C2570d;
import p276sf.C3962i;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hh.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1730o extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final int f5748h;

    /* JADX INFO: renamed from: i */
    public final int f5749i;

    /* JADX INFO: renamed from: j */
    public final String f5750j;

    /* JADX INFO: renamed from: k */
    public final int f5751k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5752l;

    /* JADX INFO: renamed from: m */
    public final C3962i f5753m;

    /* JADX INFO: renamed from: n */
    public final C3962i f5754n;

    /* JADX INFO: renamed from: o */
    public final C3962i f5755o;

    /* JADX INFO: renamed from: p */
    public final C3962i f5756p;

    /* JADX INFO: renamed from: q */
    public final C3962i f5757q;

    /* JADX INFO: renamed from: r */
    public final C3962i f5758r;

    /* JADX INFO: renamed from: s */
    public final C3962i f5759s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1730o(DexKitBridge dexKitBridge, int i9, int i10, int i11, int i12, String str, int i13, ArrayList arrayList) {
        super(dexKitBridge, i9, i10);
        this.f5748h = i11;
        this.f5749i = i12;
        this.f5750j = str;
        this.f5751k = i13;
        this.f5752l = arrayList;
        this.f5753m = new C3962i(new C0655c0(this, 6));
        new C3962i(new C1729n(dexKitBridge, this, i10, 0));
        new C3962i(new C1729n(dexKitBridge, this, i10, 2));
        new C3962i(new C1729n(dexKitBridge, this, i10, 1));
        new C3962i(new C1721f(dexKitBridge, this, i10, i9, 9));
        this.f5754n = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 4));
        new C3962i(new C1721f(dexKitBridge, this, i10, i9, 8));
        this.f5755o = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 7));
        this.f5756p = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 5));
        this.f5757q = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 6));
        this.f5758r = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 11));
        this.f5759s = new C3962i(new C1721f(dexKitBridge, this, i10, i9, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1730o) && AbstractC1416l.m3825a(((C1730o) obj).f5750j, this.f5750j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5750j.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C2570d m4348p() {
        return (C2570d) this.f5753m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final C1731p m4349q() {
        return (C1731p) this.f5757q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Method m4350r(ClassLoader classLoader) {
        classLoader.getClass();
        return m4348p().m6023b(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final ArrayList m4351s() {
        List list = (List) this.f5755o.getValue();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue >= 0) {
                String[] strArr = AbstractC2409d.f7884a;
                if (iIntValue < 256) {
                    arrayList.add(strArr[iIntValue]);
                }
            } else {
                String[] strArr2 = AbstractC2409d.f7884a;
            }
            AbstractC0000a.m96w(16);
            String string = Integer.toString(iIntValue, 16);
            string.getClass();
            C0353j.m1304b(string, "opcode: ", " is out of range");
            return null;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m4352t() {
        return AbstractC1416l.m3825a(m4348p().f8334h, "<init>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.f5749i;
        if (i9 != 0) {
            sb2.append(Modifier.toString(i9) + " ");
        }
        sb2.append(m4348p().f8336j);
        sb2.append(" ");
        sb2.append(m4348p().f8333g);
        sb2.append(".");
        sb2.append(m4348p().f8334h);
        sb2.append("(");
        return AbstractC0921a.m2255r(sb2, AbstractC4166m.m8392A1(m4348p().f8335i, ", ", null, null, null, 62), ")");
    }
}
