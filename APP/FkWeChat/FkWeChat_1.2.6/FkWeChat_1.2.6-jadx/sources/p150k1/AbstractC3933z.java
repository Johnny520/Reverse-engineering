package p150k1;

import java.util.ArrayList;
import java.util.List;
import p057e1.AbstractC1973b0;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: k1.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3933z {
    /* JADX INFO: renamed from: a */
    public static final boolean m15625a(C3931x c3931x) {
        return c3931x.m15613g() < c3931x.m15612f().length() - 1 && Character.isLetter(c3931x.m15612f().charAt(c3931x.m15613g())) && c3931x.m15612f().charAt(c3931x.m15613g() + 1) == '(';
    }

    /* JADX INFO: renamed from: b */
    public static final List m15626b(C3931x c3931x) throws C3929v {
        boolean z10;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!c3931x.m15609c() && !c3931x.m15614h(':')) {
            if (c3931x.m15614h('*')) {
                C3931x.m15607b(c3931x, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            Integer numValueOf2 = !c3931x.m15614h('@') ? Integer.valueOf(c3931x.m15616j("@") + 1) : null;
            C3931x.m15607b(c3931x, 0, 1, null);
            int iM15616j = c3931x.m15616j("L,:");
            if (c3931x.m15614h('L')) {
                C3931x.m15607b(c3931x, 0, 1, null);
                numValueOf = Integer.valueOf(c3931x.m15616j(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new C3925r(numValueOf2 != null ? numValueOf2.intValue() : -1, iM15616j, numValueOf != null ? numValueOf.intValue() : -1, z10));
            if (c3931x.m15614h(',')) {
                C3931x.m15607b(c3931x, 0, 1, null);
            }
        }
        C3931x.m15607b(c3931x, 0, 1, null);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final List m15627c(C3931x c3931x) throws C3929v {
        String strM15631g;
        c3931x.m15608a(2);
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (!c3931x.m15609c() && !c3931x.m15614h(')')) {
            if (c3931x.m15614h('!')) {
                C3931x.m15607b(c3931x, 0, 1, null);
                String strM15617k = c3931x.m15617k("!,)");
                if (strM15617k.length() != 0) {
                    int i10 = Integer.parseInt(strM15617k);
                    int i11 = 0;
                    while (i10 > 0) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                arrayList.add(new C3928u(i11, null, null, 6, null));
                                i10--;
                                break;
                            }
                            if (((C3928u) arrayList.get(i12)).m15606a() == i11) {
                                i11++;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    z10 = true;
                }
            } else {
                int iM15616j = c3931x.m15616j("!:,)");
                if (c3931x.m15614h(':')) {
                    C3931x.m15607b(c3931x, 0, 1, null);
                    strM15631g = m15631g(c3931x.m15617k("!,)"));
                } else {
                    strM15631g = null;
                }
                if (z10) {
                    int i13 = 0;
                    while (i13 < iM15616j) {
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                arrayList.add(new C3928u(i13, null, null, 6, null));
                                break;
                            }
                            if (((C3928u) arrayList.get(i14)).m15606a() == i13) {
                                i13++;
                                break;
                            }
                            i14++;
                        }
                    }
                    z10 = false;
                }
                arrayList.add(new C3928u(iM15616j, null, strM15631g, 2, null));
            }
            if (c3931x.m15614h(',')) {
                C3931x.m15607b(c3931x, 0, 1, null);
            }
        }
        c3931x.m15611e(')');
        C3931x.m15607b(c3931x, 0, 1, null);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final List m15628d(C3931x c3931x) throws C3929v {
        String strM15631g;
        c3931x.m15608a(2);
        ArrayList arrayList = new ArrayList();
        while (!c3931x.m15609c() && !c3931x.m15614h(')')) {
            String strM15617k = c3931x.m15617k(":,)");
            if (c3931x.m15614h(':')) {
                C3931x.m15607b(c3931x, 0, 1, null);
                strM15631g = m15631g(c3931x.m15617k(",)"));
            } else {
                strM15631g = null;
            }
            arrayList.add(new C3928u(arrayList.size(), strM15617k, strM15631g));
            if (c3931x.m15614h(',')) {
                C3931x.m15607b(c3931x, 0, 1, null);
            }
        }
        c3931x.m15611e(')');
        C3931x.m15607b(c3931x, 0, 1, null);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final C3932y m15629e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return m15630f(str);
        } catch (C3929v e10) {
            AbstractC1973b0.m7135a(e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p150k1.C3932y m15630f(java.lang.String r13) throws p150k1.C3929v {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p150k1.AbstractC3933z.m15630f(java.lang.String):k1.y");
    }

    /* JADX INFO: renamed from: g */
    public static final String m15631g(String str) {
        return AbstractC8611a0.m33071P(str, "c#", "androidx.compose.", false, 4, null);
    }
}
