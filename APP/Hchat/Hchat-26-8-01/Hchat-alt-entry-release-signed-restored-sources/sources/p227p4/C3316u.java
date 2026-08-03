package p227p4;

import bsh.C0353j;
import java.util.ArrayList;
import p005a5.C0016a;
import p060e4.C0824a;
import p136j8.C2104o;
import p192n4.C2893a;
import p295u4.C4265o;
import p295u4.C4266p;
import p376z4.C6093g;

/* JADX INFO: renamed from: p4.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3316u {

    /* JADX INFO: renamed from: a */
    public final C2893a f10679a;

    /* JADX INFO: renamed from: b */
    public final int f10680b;

    /* JADX INFO: renamed from: c */
    public ArrayList f10681c;

    /* JADX INFO: renamed from: g */
    public int f10685g;

    /* JADX INFO: renamed from: h */
    public final int f10686h;

    /* JADX INFO: renamed from: f */
    public int f10684f = -1;

    /* JADX INFO: renamed from: d */
    public boolean f10682d = false;

    /* JADX INFO: renamed from: e */
    public boolean f10683e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3316u(C2893a c2893a, int i9, int i10, int i11) {
        this.f10679a = c2893a;
        this.f10680b = i10;
        this.f10681c = new ArrayList(i9);
        this.f10686h = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7032a(AbstractC3303h abstractC3303h) {
        this.f10681c.add(abstractC3303h);
        if (!this.f10682d && abstractC3303h.f10489c.f14183c >= 0) {
            this.f10682d = true;
        }
        if (!this.f10683e && (abstractC3303h instanceof AbstractC3311p)) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7033b() {
        int iM10846n;
        C4265o c4265oM8565o;
        int size = this.f10681c.size();
        int i9 = this.f10680b + this.f10684f + this.f10685g;
        int i10 = i9 - this.f10686h;
        C0016a c0016a = new C0016a(i9, 11);
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 >= i10) {
                c0016a.m200d(i11, i11 + 1, 1);
            } else {
                c0016a.m200d(i11, i11, 1);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC3303h abstractC3303h = (AbstractC3303h) this.f10681c.get(i12);
            if (!(abstractC3303h instanceof C3301f)) {
                ArrayList arrayList = this.f10681c;
                C4266p c4266p = abstractC3303h.f10490d;
                int length = c4266p.f24601h.length;
                C4266p c4266p2 = new C4266p(length);
                for (int i13 = 0; i13 < length; i13++) {
                    C4265o c4265o = (C4265o) c4266p.m10840l(i13);
                    if (c4265o == null) {
                        c4265oM8565o = null;
                    } else {
                        try {
                            iM10846n = ((C6093g) c0016a.f56i).m10846n(c4265o.f13965g);
                        } catch (IndexOutOfBoundsException unused) {
                            iM10846n = -1;
                        }
                        if (iM10846n >= 0) {
                            c4265oM8565o = c4265o.m8565o(iM10846n);
                        } else {
                            C0353j.m1309g("no mapping specified for register");
                            c4265oM8565o = null;
                        }
                    }
                    c4266p2.m10841m(i13, c4265oM8565o);
                }
                c4266p2.f24613g = false;
                if (!c4266p2.equals(c4266p)) {
                    c4266p = c4266p2;
                }
                arrayList.set(i12, abstractC3303h.mo6971k(c4266p));
            }
        }
        this.f10685g++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m7034c() {
        int size = this.f10681c.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3303h abstractC3303h = (AbstractC3303h) this.f10681c.get(i9);
            if (!(abstractC3303h instanceof C3301f)) {
                this.f10681c.set(i9, abstractC3303h.mo6981j(1));
            }
        }
        this.f10684f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C3305j m7035d(AbstractC3303h abstractC3303h) {
        C4266p c4266p = abstractC3303h.f10490d;
        C3305j c3305j = abstractC3303h.f10488b;
        C3305j c3305jM7036e = m7036e(abstractC3303h.mo6971k(c4266p.m8570r(c3305j.f10496e, null)), c3305j);
        if (c3305jM7036e != null) {
            return c3305jM7036e;
        }
        throw new C0824a("No expanded opcode for " + abstractC3303h, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C3305j m7036e(AbstractC3303h abstractC3303h, C3305j c3305j) {
        while (c3305j != null) {
            if (c3305j.f10495d.mo2809S(abstractC3303h)) {
                this.f10679a.getClass();
                return c3305j;
            }
            C3305j[] c3305jArr = AbstractC3306k.f10575a;
            int i9 = c3305j.f10494c;
            if (i9 == -1) {
                c3305j = null;
            } else {
                try {
                    c3305j = AbstractC3306k.f10575a[i9 + 1];
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (c3305j == null) {
                    C2104o.m5294t("bogus opcode");
                    return null;
                }
            }
        }
        return c3305j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [u4.p, z4.e] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final boolean m7037f(C3305j[] c3305jArr) {
        int i9 = this.f10684f;
        if (i9 < 0) {
            i9 = 0;
        }
        boolean z9 = false;
        while (true) {
            int size = this.f10681c.size();
            int i10 = this.f10684f;
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC3303h abstractC3303h = (AbstractC3303h) this.f10681c.get(i11);
                C3305j c3305j = c3305jArr[i11];
                C3305j c3305jM7036e = m7036e(abstractC3303h, c3305j);
                if (c3305jM7036e == null) {
                    ?? Mo2813m = m7035d(abstractC3303h).f10495d.mo2813m(abstractC3303h);
                    boolean z10 = abstractC3303h.f10488b.f10496e;
                    ?? r62 = abstractC3303h.f10490d;
                    int length = r62.f24601h.length;
                    int iM8561j = (!z10 || Mo2813m.get(0)) ? 0 : ((C4265o) r62.m10840l(0)).m8561j();
                    int iM8561j2 = 0;
                    for (?? r92 = z10; r92 < length; r92++) {
                        if (!Mo2813m.get(r92)) {
                            iM8561j2 += ((C4265o) r62.m10840l(r92)).m8561j();
                        }
                    }
                    int iMax = Math.max(iM8561j2, iM8561j);
                    if (iMax > i10) {
                        i10 = iMax;
                    }
                } else {
                    if (c3305j == c3305jM7036e) {
                    }
                }
                c3305jArr[i11] = c3305jM7036e;
            }
            if (i9 >= i10) {
                this.f10684f = i9;
                return z9;
            }
            int i12 = i10 - i9;
            int size2 = this.f10681c.size();
            for (int i13 = 0; i13 < size2; i13++) {
                AbstractC3303h abstractC3303h2 = (AbstractC3303h) this.f10681c.get(i13);
                if (!(abstractC3303h2 instanceof C3301f)) {
                    this.f10681c.set(i13, abstractC3303h2.mo6981j(i12));
                }
            }
            z9 = true;
            i9 = i10;
        }
    }
}
