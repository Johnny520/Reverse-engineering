package p170le;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p121i4.C1984y;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p350xd.C5778e;

/* JADX INFO: renamed from: le.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2558f {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f8293b = 0;

    /* JADX INFO: renamed from: a */
    public final C1984y f8294a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2558f.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2558f(C4322r c4322r, C1984y c1984y) {
        this.f8294a = c1984y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6014a(C5778e c5778e, AbstractC3508l abstractC3508l, C4305a c4305a, LinkedHashSet linkedHashSet, HashSet hashSet) {
        hashSet.add(c4305a);
        for (C4320p c4320p : c4305a.f14351l) {
            if (c4320p.f14396k == EnumC3400k.f10996z && c4320p.f14398m.size() > 0 && c4320p.mo7179S(0).equals(abstractC3508l)) {
                linkedHashSet.add(c4305a);
                c5778e.f23514l.add(c4320p);
                return;
            }
        }
        for (C4305a c4305a2 : c4305a.f14353n) {
            if (!hashSet.contains(c4305a2)) {
                m6014a(c5778e, abstractC3508l, c4305a2, linkedHashSet, hashSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r5.contains(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r0 = m6015b(r0, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4305a m6015b(C4305a c4305a, LinkedHashSet linkedHashSet, HashSet hashSet) {
        hashSet.add(c4305a);
        loop0: for (C4305a c4305aM6015b : c4305a.f14354o) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                if (!AbstractC0000a.m89s0((C4305a) it.next(), c4305aM6015b)) {
                    break;
                }
            }
            return c4305aM6015b;
        }
        return null;
    }
}
