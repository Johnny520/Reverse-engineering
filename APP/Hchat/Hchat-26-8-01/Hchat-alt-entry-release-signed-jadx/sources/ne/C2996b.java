package ne;

import be.AbstractC0269a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import p012ah.C0086a;
import p025bc.C0257g;
import p025bc.EnumC0256f;
import p157kd.AbstractC2390d;
import p157kd.C2387a;
import p157kd.C2389c;
import p199nd.C2971f0;
import p199nd.C2992x;
import p215od.C3128a;
import p215od.C3132e;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4323s;
import p302ud.C4325u;
import p351xe.C5796q;

/* JADX INFO: renamed from: ne.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2996b extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final Pattern f9772g = Pattern.compile("^\\d+$");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "RenameVisitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[PHI: r1
  0x00de: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:36:0x00b8, B:43:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
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
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1052f(C4325u c4325u) {
        EnumC0256f enumC0256f;
        boolean z9;
        C0257g c0257g;
        String strM5716e;
        String strConcat;
        HashSet hashSet;
        C0257g c0257g2 = c4325u.f14435a;
        ArrayList<C4323s> arrayList = c4325u.f14450p;
        if (c0257g2.f738g.isEmpty()) {
            return;
        }
        int i9 = AbstractC2998d.f9776a;
        c0257g2.getClass();
        EnumSet enumSet = c0257g2.f718D;
        if (!enumSet.isEmpty()) {
            C2387a c2387a = c0257g2.f715A;
            ArrayList<C4309e> arrayList2 = c4325u.f14448n;
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                enumC0256f = EnumC0256f.f710i;
                if (!zHasNext) {
                    break;
                }
                C4309e c4309e = (C4309e) it.next();
                C2829f c2829f = c4309e.f9217g;
                EnumC2824a enumC2824a = EnumC2824a.f9171x;
                if (c2829f.mo6235a(enumC2824a)) {
                    c0257g = c0257g2;
                } else {
                    C3128a c3128a = c4309e.f14373m;
                    String strM6646k = c3128a.m6646k();
                    if (C5796q.m10501g(strM6646k)) {
                        c0257g = c0257g2;
                    } else {
                        boolean zM1036a = c0257g2.m1036a();
                        if (zM1036a) {
                            if (f9772g.matcher(strM6646k).matches()) {
                                strConcat = "AnonymousClass".concat(AbstractC2390d.m5716e(strM6646k));
                            } else {
                                char cCharAt = strM6646k.charAt(0);
                                if (cCharAt == '$' || Character.isDigit(cCharAt)) {
                                    strConcat = "C".concat(AbstractC2390d.m5716e(strM6646k));
                                }
                                if (enumSet.contains(enumC0256f)) {
                                }
                                if (strM5716e.isEmpty()) {
                                }
                                if (strConcat != null) {
                                }
                            }
                            c0257g = c0257g2;
                            if (strConcat != null) {
                            }
                        } else {
                            if (enumSet.contains(enumC0256f)) {
                                c0257g = c0257g2;
                                strM5716e = strM6646k;
                            } else {
                                Pattern pattern = AbstractC2390d.f7853a;
                                StringBuilder sb2 = new StringBuilder(strM6646k.length());
                                c0257g = c0257g2;
                                C5796q.m10503j(strM6646k, new C2389c(sb2, 0));
                                strM5716e = sb2.toString();
                            }
                            if (strM5716e.isEmpty()) {
                                if (zM1036a) {
                                    strM5716e = AbstractC2390d.m5716e(strM6646k);
                                    if (!strM5716e.isEmpty() && !Character.isJavaIdentifierStart(strM5716e.codePointAt(0))) {
                                        strM5716e = "C".concat(strM5716e);
                                    }
                                    strConcat = !AbstractC2390d.m5715d(strM5716e) ? "C".concat(strM5716e) : strM5716e;
                                }
                            }
                            if (strConcat != null) {
                                c4309e.m8663j0(c2387a.m5705a(c4309e));
                                C2971f0 c2971f0 = new C2971f0(c4309e);
                                c2971f0.m6390b("contains not printable characters");
                                c4309e.m6233y(c2971f0);
                            } else {
                                if (!strConcat.equals(strM6646k)) {
                                    c3128a.m6639a(strConcat);
                                    C2971f0 c2971f02 = new C2971f0(c4309e);
                                    c2971f02.m6390b("invalid class name");
                                    c4309e.m6233y(c2971f02);
                                }
                                if (c3128a.m6650o() && c0257g.m1036a()) {
                                    C3128a c3128a2 = c3128a.f10142k;
                                    while (true) {
                                        if (c3128a2 == null) {
                                            break;
                                        }
                                        if (c3128a2.m6646k().equals(strConcat)) {
                                            c4309e.m8663j0(c2387a.m5705a(c4309e));
                                            C2971f0 c2971f03 = new C2971f0(c4309e);
                                            c2971f03.m6390b("collision with other inner class name");
                                            c4309e.m6233y(c2971f03);
                                            break;
                                        }
                                        c3128a2 = c3128a2.f10142k;
                                    }
                                }
                            }
                        }
                    }
                    strConcat = null;
                    if (strConcat != null) {
                    }
                }
                HashSet hashSet2 = new HashSet();
                for (C4311g c4311g : c4309e.f14381u) {
                    String str = c4311g.f14390l.f10149j;
                    boolean zAdd = hashSet2.add(str);
                    boolean z10 = c0257g.m1036a() && !AbstractC2390d.m5715d(str);
                    boolean z11 = enumSet.contains(enumC0256f) && !AbstractC2390d.m5712a(str);
                    if (!zAdd || z10 || z11) {
                        hashSet = hashSet2;
                        c4311g.f14390l.f10149j = c2387a.m5706b(c4311g);
                        c4311g.m6233y(new C2971f0(c4311g, z10, z11));
                        if (!zAdd) {
                            C2971f0 c2971f04 = new C2971f0(c4311g);
                            c2971f04.m6390b("collision with other field name");
                            c4311g.m6233y(c2971f04);
                        }
                    } else {
                        hashSet = hashSet2;
                    }
                    hashSet2 = hashSet;
                }
                ArrayList<C4322r> arrayList3 = new ArrayList(c4309e.f14380t.size());
                for (C4322r c4322r : c4309e.f14380t) {
                    if (!c4322r.f14412m.m849a()) {
                        arrayList3.add(c4322r);
                    }
                }
                for (C4322r c4322r2 : arrayList3) {
                    String str2 = c4322r2.f14410k.f10157n;
                    boolean z12 = c0257g.m1036a() && !AbstractC2390d.m5715d(str2);
                    boolean z13 = enumSet.contains(enumC0256f) && !AbstractC2390d.m5712a(str2);
                    if (z12 || z13) {
                        c4322r2.m8705d0(c2387a.m5707c(c4322r2));
                        c4322r2.m6233y(new C2971f0(c4322r2, z12, z13));
                    }
                }
                if (c0257g.m1036a()) {
                    HashSet hashSet3 = new HashSet(arrayList3.size());
                    for (C4322r c4322r3 : arrayList3) {
                        if (!hashSet3.add(c4322r3.f14410k.m6665j(true, false)) && !c4322r3.f9217g.mo6235a(enumC2824a)) {
                            C2992x c2992x = (C2992x) c4322r3.f9217g.mo6237c(C2825b.f9203r);
                            if (c2992x != null) {
                                for (C4322r c4322r4 : c2992x.f9766h) {
                                    if (c4322r4 == c4322r3 || !c4322r3.f14411l.equals(c4322r4.f14411l)) {
                                    }
                                }
                            }
                            c4322r3.m8705d0(c2387a.m5707c(c4322r3));
                            c4322r3.m6233y(new C2971f0("collision with other method in class"));
                        }
                    }
                }
                c0257g2 = c0257g;
            }
            C0257g c0257g3 = c0257g2;
            if (enumSet.contains(EnumC0256f.f708g)) {
                HashSet hashSet4 = new HashSet(arrayList2.size());
                for (C4309e c4309e2 : arrayList2) {
                    C3128a c3128a3 = c4309e2.f14373m;
                    if (!hashSet4.add(c3128a3.m6643g().toLowerCase())) {
                        c3128a3.m6639a(c2387a.m5705a(c4309e2));
                        C2971f0 c2971f05 = new C2971f0(c4309e2);
                        c2971f05.m6390b("case insensitive filesystem");
                        c4309e2.m6233y(c2971f05);
                        hashSet4.add(c3128a3.m6643g().toLowerCase());
                    }
                }
            }
            boolean z14 = false;
            for (C4323s c4323s : arrayList) {
                if (c0257g3.m1036a() && c4323s.f14431p.f10159b.isEmpty()) {
                    C3132e c3132e = c4323s.f14427l;
                    if (c3132e.f10159b.equals("defpackage")) {
                        c4323s.f14431p = c3132e;
                    } else {
                        c4323s.f14431p = C3132e.m6666a(c4323s.f14426k, "defpackage");
                    }
                } else {
                    String str3 = c4323s.f14431p.f10160c;
                    boolean z15 = c0257g3.m1036a() && !AbstractC2390d.m5715d(str3);
                    boolean z16 = enumSet.contains(enumC0256f) && !AbstractC2390d.m5712a(str3);
                    if (z15 || z16) {
                        int i10 = c2387a.f7839a;
                        c2387a.f7839a = i10 + 1;
                        String str4 = String.format("p%03d%s", Integer.valueOf(i10), c2387a.m5708e(c4323s.f14427l.f10160c));
                        C3132e c3132e2 = c4323s.f14427l;
                        if (c3132e2.f10160c.equals(str4)) {
                            c4323s.f14431p = c3132e2;
                        } else {
                            C4325u c4325u2 = c4323s.f14426k;
                            C4323s c4323s2 = c4323s.f14428m;
                            c4323s.f14431p = C3132e.m6667b(c4325u2, c4323s2 == null ? null : c4323s2.f14431p, str4);
                        }
                    } else {
                        z9 = false;
                        z14 |= z9;
                    }
                }
                z9 = true;
                z14 |= z9;
            }
            if (z14) {
                for (C4323s c4323s3 : arrayList) {
                    if (c4323s3.f14428m == null) {
                        c4323s3.m8709J();
                    }
                }
            }
            HashSet hashSet5 = new HashSet();
            for (C4323s c4323s4 : arrayList) {
                if (c4323s4.f14428m == null) {
                    hashSet5.add(c4323s4.f14427l.f10160c);
                }
            }
            c4325u.f14440f.f23527b = hashSet5;
            if (c0257g3.m1036a()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    for (C4311g c4311g2 : ((C4309e) it2.next()).f14381u) {
                        if (hashSet5.contains(c4311g2.f14390l.f10149j)) {
                            c4311g2.f14390l.f10149j = c2387a.m5706b(c4311g2);
                            c4311g2.m6233y(new C2971f0("collision with root package name"));
                        }
                    }
                }
            }
        }
        c4325u.f14444j.add(new C0086a(4));
    }
}
