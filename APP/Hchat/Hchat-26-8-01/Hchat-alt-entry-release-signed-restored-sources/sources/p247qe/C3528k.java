package p247qe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p036c9.C0415a0;
import p068eh.AbstractC0921a;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3501e;
import p246qd.C3503g;
import p246qd.C3505i;
import p246qd.EnumC3513q;
import p302ud.C4325u;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qe.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3528k {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2844b f11477d = AbstractC2846d.m6274b(C3528k.class);

    /* JADX INFO: renamed from: a */
    public final C4325u f11478a;

    /* JADX INFO: renamed from: b */
    public final C0415a0 f11479b;

    /* JADX INFO: renamed from: c */
    public final Comparator f11480c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3528k(C4325u c4325u) {
        this.f11478a = c4325u;
        C0415a0 c0415a0 = new C0415a0(this, 25);
        this.f11479b = c0415a0;
        this.f11480c = c0415a0.reversed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r2.equals(p246qd.AbstractC3506j.f11394k) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return p247qe.EnumC3529l.f11482h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r2.mo7349a(p246qd.EnumC3513q.ARRAY) != false) goto L11;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC3529l m7427a(AbstractC3506j abstractC3506j) {
        if (abstractC3506j.mo7345w()) {
            if (!abstractC3506j.mo7351v()) {
                if (!(abstractC3506j instanceof C3503g)) {
                    C0086a.m452k(AbstractC0921a.m2251n("Unprocessed type: ", String.valueOf(abstractC3506j), " in array compare"));
                    return null;
                }
            }
            return EnumC3529l.f11486l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static EnumC3529l m7428e(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        if (abstractC3506j2 != AbstractC3506j.f11404u && (abstractC3506j2 != AbstractC3506j.f11405v || (!abstractC3506j.mo7351v() && !(abstractC3506j instanceof C3497a)))) {
            if (abstractC3506j.equals(AbstractC3506j.f11394k) && (abstractC3506j2 instanceof C3497a)) {
                return EnumC3529l.f11484j;
            }
            EnumC3513q enumC3513q = abstractC3506j instanceof C3503g ? ((C3503g) abstractC3506j).f11372K : abstractC3506j instanceof C3497a ? EnumC3513q.ARRAY : EnumC3513q.OBJECT;
            for (EnumC3513q enumC3513q2 : abstractC3506j2.mo7342n()) {
                if (enumC3513q2 != enumC3513q) {
                }
            }
            return EnumC3529l.f11486l;
        }
        return EnumC3529l.f11482h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static byte m7429f(EnumC3513q enumC3513q) {
        switch (enumC3513q) {
            case BOOLEAN:
            case OBJECT:
            case ARRAY:
            case VOID:
                C0086a.m452k(AbstractC0921a.m2251n("Type ", String.valueOf(enumC3513q), " should not be here"));
                return (byte) 0;
            case CHAR:
                return (byte) 2;
            case BYTE:
                return (byte) 0;
            case SHORT:
                return (byte) 1;
            case INT:
                return (byte) 3;
            case FLOAT:
                return (byte) 5;
            case LONG:
                return (byte) 4;
            case DOUBLE:
                return (byte) 6;
            default:
                C0086a.m452k("Unhandled type: ".concat(String.valueOf(enumC3513q)));
                return (byte) 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC3529l m7430b(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        abstractC3506j2.getClass();
        if (!(abstractC3506j2 instanceof C3499c)) {
            if (abstractC3506j2 instanceof C3505i) {
                return EnumC3529l.f11487m;
            }
            boolean zEquals = abstractC3506j2.equals(AbstractC3506j.f11394k);
            List listMo7348i = abstractC3506j.mo7348i();
            if (!listMo7348i.isEmpty()) {
                if (!listMo7348i.contains(abstractC3506j2) && !zEquals) {
                    Iterator it = listMo7348i.iterator();
                    while (it.hasNext()) {
                        EnumC3529l enumC3529lM7431c = m7431c((AbstractC3506j) it.next(), abstractC3506j2);
                        if (!enumC3529lM7431c.m7435c()) {
                            return enumC3529lM7431c;
                        }
                    }
                }
            }
            return EnumC3529l.f11482h;
        }
        if (abstractC3506j.mo7350l().equals(abstractC3506j2.mo7350l())) {
            List listMo7348i2 = abstractC3506j.mo7348i();
            C3501e c3501e = AbstractC3506j.f11394k;
            if (listMo7348i2.contains(c3501e)) {
                if (listMo7348i2.size() == 1) {
                    listMo7348i2 = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(listMo7348i2);
                    arrayList.remove(c3501e);
                    listMo7348i2 = arrayList;
                }
            }
            List listMo7348i3 = abstractC3506j2.mo7348i();
            if (listMo7348i3.contains(c3501e)) {
                if (listMo7348i3.size() == 1) {
                    listMo7348i3 = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList2 = new ArrayList(listMo7348i3);
                    arrayList2.remove(c3501e);
                    listMo7348i3 = arrayList2;
                }
            }
            if (listMo7348i2.equals(listMo7348i3)) {
                return EnumC3529l.f11481g;
            }
            int size = listMo7348i2.size();
            int size2 = listMo7348i3.size();
            if (size == 0) {
                return EnumC3529l.f11484j;
            }
            if (size2 != 0) {
                if (size == 1 && size2 == 1) {
                    return m7432d((AbstractC3506j) listMo7348i2.get(0), (AbstractC3506j) listMo7348i3.get(0));
                }
            }
            return EnumC3529l.f11482h;
        }
        return EnumC3529l.f11486l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        if (r2 != false) goto L72;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC3529l m7431c(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        boolean zEquals = abstractC3506j.mo7350l().equals(abstractC3506j2.mo7350l());
        boolean z9 = abstractC3506j instanceof C3499c;
        boolean z10 = abstractC3506j2 instanceof C3499c;
        if (!z9 || !z10 || zEquals) {
            boolean zMo7354t = abstractC3506j.mo7354t();
            boolean zMo7354t2 = abstractC3506j2.mo7354t();
            if (z9 || z10) {
                AbstractC3506j abstractC3506jMo7356r = abstractC3506j.mo7356r();
                AbstractC3506j abstractC3506jMo7356r2 = abstractC3506j2.mo7356r();
                if ((abstractC3506jMo7356r == null && abstractC3506jMo7356r2 == null) || ((abstractC3506jMo7356r == null || !z10 || abstractC3506j.mo7355q() != 2) && (!z9 || abstractC3506jMo7356r2 == null || abstractC3506j2.mo7355q() != 2))) {
                    return z9 ? m7430b(abstractC3506j, abstractC3506j2) : m7430b(abstractC3506j2, abstractC3506j).m7433a();
                }
            } else {
                if (zEquals) {
                    if (zMo7354t != zMo7354t2) {
                        return zMo7354t ? EnumC3529l.f11483i : EnumC3529l.f11485k;
                    }
                    if (abstractC3506j.mo7355q() != 0 && abstractC3506j2.mo7355q() != 0) {
                        int iMo7355q = abstractC3506j.mo7355q();
                        int iMo7355q2 = abstractC3506j2.mo7355q();
                        if (iMo7355q != 2) {
                            if (iMo7355q2 != 2) {
                                EnumC3529l enumC3529lM7432d = m7432d(abstractC3506j.mo7356r(), abstractC3506j2.mo7356r());
                                if (iMo7355q == iMo7355q2) {
                                    return enumC3529lM7432d;
                                }
                            }
                            return EnumC3529l.f11482h;
                        }
                        return EnumC3529l.f11484j;
                    }
                    List listMo7346j = abstractC3506j.mo7346j();
                    List listMo7346j2 = abstractC3506j2.mo7346j();
                    if (AbstractC5798s.m10514h(listMo7346j) || AbstractC5798s.m10514h(listMo7346j2)) {
                        AbstractC3506j abstractC3506jMo7353m = abstractC3506j.mo7353m();
                        AbstractC3506j abstractC3506jMo7353m2 = abstractC3506j2.mo7353m();
                        if (abstractC3506jMo7353m != null && abstractC3506jMo7353m2 != null) {
                            return m7432d(abstractC3506jMo7353m, abstractC3506jMo7353m2);
                        }
                    } else {
                        int size = listMo7346j.size();
                        if (size == listMo7346j2.size()) {
                            for (int i9 = 0; i9 < size; i9++) {
                                EnumC3529l enumC3529lM7432d2 = m7432d((AbstractC3506j) listMo7346j.get(i9), (AbstractC3506j) listMo7346j2.get(i9));
                                if (enumC3529lM7432d2 != EnumC3529l.f11481g) {
                                    return enumC3529lM7432d2;
                                }
                            }
                        }
                    }
                }
                C3501e c3501e = AbstractC3506j.f11394k;
                boolean zEquals2 = abstractC3506j.equals(c3501e);
                if (!zEquals2 && !abstractC3506j2.equals(c3501e)) {
                    C4325u c4325u = this.f11478a;
                    if (!AbstractC3506j.m7359u(c4325u, abstractC3506j, abstractC3506j2)) {
                        if (!AbstractC3506j.m7359u(c4325u, abstractC3506j2, abstractC3506j)) {
                            if (abstractC3506j.mo7351v() ? c4325u.f14453s.f2834b.containsKey(abstractC3506j.mo7350l()) : false) {
                            }
                            return EnumC3529l.f11488n;
                        }
                        return EnumC3529l.f11484j;
                    }
                    return EnumC3529l.f11482h;
                }
            }
        }
        return EnumC3529l.f11486l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (java.lang.Integer.compare(r6.mo7342n().length, r7.mo7342n().length) > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        if (r6 < r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        return p247qe.EnumC3529l.f11482h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bb, code lost:
    
        if (r6 == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        if (r6 == r7) goto L73;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC3529l m7432d(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        if (abstractC3506j != abstractC3506j2 && !Objects.equals(abstractC3506j, abstractC3506j2)) {
            boolean zMo7345w = abstractC3506j.mo7345w();
            if (zMo7345w != abstractC3506j2.mo7345w()) {
                return zMo7345w ? m7428e(abstractC3506j, abstractC3506j2) : m7428e(abstractC3506j2, abstractC3506j).m7433a();
            }
            boolean z9 = abstractC3506j instanceof C3497a;
            if (z9 != (abstractC3506j2 instanceof C3497a)) {
                return z9 ? m7427a(abstractC3506j2) : m7427a(abstractC3506j).m7433a();
            }
            if (z9) {
                return m7432d(abstractC3506j.mo7340g(), abstractC3506j2.mo7340g());
            }
            if (zMo7345w) {
                boolean z10 = abstractC3506j instanceof C3503g;
                boolean z11 = abstractC3506j2 instanceof C3503g;
                boolean zMo7351v = abstractC3506j.mo7351v();
                boolean zMo7351v2 = abstractC3506j2.mo7351v();
                if (zMo7351v && zMo7351v2) {
                    return m7431c(abstractC3506j, abstractC3506j2);
                }
                EnumC3529l enumC3529l = EnumC3529l.f11486l;
                if (zMo7351v && z11) {
                    return enumC3529l;
                }
                if (!z10 || !zMo7351v2) {
                    if (!z10 || !z11) {
                        f11477d.mo6265s(abstractC3506j, "Type compare function not complete, can't compare {} and {}", abstractC3506j2);
                        return enumC3529l;
                    }
                    EnumC3513q enumC3513qMo7343o = abstractC3506j.mo7343o();
                    EnumC3513q enumC3513qMo7343o2 = abstractC3506j2.mo7343o();
                    EnumC3513q enumC3513q = EnumC3513q.BOOLEAN;
                    if (enumC3513qMo7343o != enumC3513q && enumC3513qMo7343o2 != enumC3513q) {
                        EnumC3513q enumC3513q2 = EnumC3513q.VOID;
                        if (enumC3513qMo7343o != enumC3513q2 && enumC3513qMo7343o2 != enumC3513q2) {
                            if ((enumC3513qMo7343o != EnumC3513q.BYTE || enumC3513qMo7343o2 != EnumC3513q.CHAR) && ((enumC3513qMo7343o != EnumC3513q.SHORT || enumC3513qMo7343o2 != EnumC3513q.CHAR) && (r6 = m7429f(enumC3513qMo7343o)) <= (r7 = m7429f(enumC3513qMo7343o2)))) {
                            }
                            return EnumC3529l.f11484j;
                        }
                    }
                }
                return enumC3529l;
            }
        }
        return EnumC3529l.f11481g;
    }
}
