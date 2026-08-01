package p000;

import android.content.Context;
import android.text.Layout;
import android.view.DragEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pf1 {

    /* JADX INFO: renamed from: d */
    public static final C1014zr f4838d;

    /* JADX INFO: renamed from: e */
    public static final C1014zr f4839e;

    /* JADX INFO: renamed from: g */
    public static final C1014zr f4841g;

    /* JADX INFO: renamed from: j */
    public static final C1014zr f4844j;

    /* JADX INFO: renamed from: k */
    public static final C1014zr f4845k;

    /* JADX INFO: renamed from: a */
    public static final C0190ez f4835a = new C0190ez(0, null);

    /* JADX INFO: renamed from: b */
    public static final C0190ez f4836b = new C0190ez(1, null);

    /* JADX INFO: renamed from: c */
    public static final C0272h6 f4837c = new C0272h6(1);

    /* JADX INFO: renamed from: f */
    public static final v00 f4840f = new v00(false);

    /* JADX INFO: renamed from: h */
    public static final StackTraceElement[] f4842h = new StackTraceElement[0];

    /* JADX INFO: renamed from: i */
    public static final C0227fz f4843i = new C0227fz(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f4838d = new C1014zr("UNDEFINED", i);
        f4839e = new C1014zr("REUSABLE_CLAIMED", i);
        f4841g = new C1014zr("NO_OWNER", i);
        f4844j = new C1014zr("NONE", i);
        f4845k = new C1014zr("PENDING", i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final int m3025A(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final long m3026B(C0910x1 c0910x1) {
        DragEvent dragEvent = (DragEvent) c0910x1.f7232e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC0622po m3027C(c40 c40Var, boolean z, f40 f40Var) {
        if (c40Var instanceof j40) {
            return ((j40) c40Var).m1626R(z, f40Var);
        }
        return c40Var.mo484w(f40Var.mo18r(), z, new C0191f(1, f40Var, f40.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final boolean m3028D(InterfaceC0618pk interfaceC0618pk) {
        c40 c40Var = (c40) interfaceC0618pk.mo64l(C0496n2.f4129I);
        if (c40Var != null) {
            return c40Var.mo479b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final pe0 m3029E(String str) {
        return new n50(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static InterfaceC0618pk m3030F(InterfaceC0515nk interfaceC0515nk, InterfaceC0554ok interfaceC0554ok) {
        interfaceC0554ok.getClass();
        return p30.m3002l(interfaceC0515nk.getKey(), interfaceC0554ok) ? C0220fs.f1799d : interfaceC0515nk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final EnumC0287hl m3031G(C0149dv c0149dv) {
        int iOrdinal = c0149dv.m727B0().ordinal();
        EnumC0287hl enumC0287hl = EnumC0287hl.f2282d;
        if (iOrdinal != 0) {
            EnumC0287hl enumC0287hl2 = EnumC0287hl.f2283e;
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (c0149dvM1541q == null) {
                    C0921xc.m5131l("ActiveParent with no focused child");
                    return null;
                }
                EnumC0287hl enumC0287hlM3031G = m3031G(c0149dvM1541q);
                EnumC0287hl enumC0287hl3 = enumC0287hlM3031G != enumC0287hl ? enumC0287hlM3031G : null;
                if (enumC0287hl3 != null) {
                    return enumC0287hl3;
                }
                if (c0149dv.f1195s) {
                    return enumC0287hl;
                }
                c0149dv.f1195s = true;
                try {
                    C0032av c0032avM733y0 = c0149dv.m733y0();
                    C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) m3040R(c0149dv)).getFocusOwner();
                    C0149dv c0149dvM5612f = c1017zu.m5612f();
                    c0032avM733y0.f278k.getClass();
                    C0149dv c0149dvM5612f2 = c1017zu.m5612f();
                    return (c0149dvM5612f == c0149dvM5612f2 || c0149dvM5612f2 == null) ? enumC0287hl : C0069bv.f591d == C0069bv.f590c ? enumC0287hl2 : EnumC0287hl.f2284f;
                } finally {
                    c0149dv.f1195s = false;
                }
            }
            if (iOrdinal == 2) {
                return enumC0287hl2;
            }
            if (iOrdinal != 3) {
                C0921xc.m5129j();
                return null;
            }
        }
        return enumC0287hl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final EnumC0287hl m3032H(C0149dv c0149dv) {
        if (!c0149dv.f1196t) {
            c0149dv.f1196t = true;
            try {
                C0032av c0032avM733y0 = c0149dv.m733y0();
                C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) m3040R(c0149dv)).getFocusOwner();
                C0149dv c0149dvM5612f = c1017zu.m5612f();
                c0032avM733y0.f277j.getClass();
                C0149dv c0149dvM5612f2 = c1017zu.m5612f();
                if (c0149dvM5612f != c0149dvM5612f2 && c0149dvM5612f2 != null) {
                    return C0069bv.f591d == C0069bv.f590c ? EnumC0287hl.f2283e : EnumC0287hl.f2284f;
                }
            } finally {
                c0149dv.f1196t = false;
            }
        }
        return EnumC0287hl.f2282d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final EnumC0287hl m3033I(C0149dv c0149dv) {
        oe0 oe0VarM3050f;
        mj0 mj0Var;
        int iOrdinal = c0149dv.m727B0().ordinal();
        EnumC0287hl enumC0287hl = EnumC0287hl.f2282d;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (c0149dvM1541q != null) {
                    return m3031G(c0149dvM1541q);
                }
                C0921xc.m5131l("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0921xc.m5129j();
                    return null;
                }
                if (!c0149dv.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = c0149dv.f4529d.f4533h;
                b60 b60VarM3039Q = m3039Q(c0149dv);
                loop0: while (true) {
                    if (b60VarM3039Q == null) {
                        oe0VarM3050f = null;
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 1024) != 0) {
                                oe0VarM3050f = oe0Var;
                                sh0 sh0Var = null;
                                while (oe0VarM3050f != null) {
                                    if (oe0VarM3050f instanceof C0149dv) {
                                        break loop0;
                                    }
                                    if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                        int i = 0;
                                        for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                            if ((oe0Var2.f4531f & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    oe0VarM3050f = oe0Var2;
                                                } else {
                                                    if (sh0Var == null) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f != null) {
                                                        sh0Var.m4072b(oe0VarM3050f);
                                                        oe0VarM3050f = null;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    oe0VarM3050f = m3050f(sh0Var);
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                }
                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                if (c0149dv2 == null) {
                    return enumC0287hl;
                }
                int iOrdinal2 = c0149dv2.m727B0().ordinal();
                if (iOrdinal2 == 0) {
                    return m3032H(c0149dv2);
                }
                if (iOrdinal2 == 1) {
                    return m3033I(c0149dv2);
                }
                if (iOrdinal2 == 2) {
                    return EnumC0287hl.f2283e;
                }
                if (iOrdinal2 != 3) {
                    C0921xc.m5129j();
                    return null;
                }
                EnumC0287hl enumC0287hlM3033I = m3033I(c0149dv2);
                EnumC0287hl enumC0287hl2 = enumC0287hlM3033I != enumC0287hl ? enumC0287hlM3033I : null;
                return enumC0287hl2 == null ? m3032H(c0149dv2) : enumC0287hl2;
            }
        }
        return enumC0287hl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static InterfaceC0618pk m3034J(InterfaceC0515nk interfaceC0515nk, InterfaceC0618pk interfaceC0618pk) {
        interfaceC0618pk.getClass();
        return interfaceC0618pk == C0220fs.f1799d ? interfaceC0515nk : (InterfaceC0618pk) interfaceC0618pk.mo65p(new C0717s8(9), interfaceC0515nk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final Object m3035K(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final void m3036N(z11 z11Var, int i, Object obj) {
        int iM5395h = z11Var.m5395h(i);
        Object[] objArr = z11Var.f7753c;
        Object obj2 = objArr[iM5395h];
        objArr[iM5395h] = C0320ii.f2572a;
        if (obj == obj2) {
            return;
        }
        AbstractC0653qi.m3252a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static final qj0 m3037O(InterfaceC0694rm interfaceC0694rm, int i) {
        qj0 qj0Var = ((oe0) interfaceC0694rm).f4529d.f4536k;
        qj0Var.getClass();
        if (qj0Var.mo436G0() != interfaceC0694rm || !rj0.m3515f(i)) {
            return qj0Var;
        }
        qj0 qj0Var2 = qj0Var.f5181s;
        qj0Var2.getClass();
        return qj0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final qj0 m3038P(InterfaceC0694rm interfaceC0694rm) {
        if (!((oe0) interfaceC0694rm).f4529d.f4542q) {
            w10.m4824b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        qj0 qj0VarM3037O = m3037O(interfaceC0694rm, 2);
        if (!qj0VarM3037O.mo436G0().f4542q) {
            w10.m4824b("LayoutCoordinates is not attached.");
        }
        return qj0VarM3037O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static final b60 m3039Q(InterfaceC0694rm interfaceC0694rm) {
        qj0 qj0Var = ((oe0) interfaceC0694rm).f4529d.f4536k;
        if (qj0Var != null) {
            return qj0Var.f5180r;
        }
        throw AbstractC0748t1.m4149g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final dn0 m3040R(InterfaceC0694rm interfaceC0694rm) {
        dn0 dn0Var = m3039Q(interfaceC0694rm).f419r;
        if (dn0Var != null) {
            return dn0Var;
        }
        throw AbstractC0748t1.m4149g("This node does not have an owner.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3041S(InterfaceC0322ik interfaceC0322ik, Object obj) {
        c40 c40Var;
        if (!(interfaceC0322ik instanceof C0179eo)) {
            interfaceC0322ik.mo541i(obj);
            return;
        }
        C0179eo c0179eo = (C0179eo) interfaceC0322ik;
        AbstractC0692rk abstractC0692rk = c0179eo.f1489g;
        AbstractC0358jk abstractC0358jk = c0179eo.f1490h;
        Throwable thM604a = cv0.m604a(obj);
        Object c0688rg = thM604a == null ? obj : new C0688rg(thM604a, false);
        if (abstractC0692rk.mo1509f(abstractC0358jk.mo540e())) {
            c0179eo.f1491i = c0688rg;
            c0179eo.f2025f = 1;
            abstractC0692rk.mo358e(abstractC0358jk.mo540e(), c0179eo);
            return;
        }
        AbstractC0030at abstractC0030atM5216a = y71.m5216a();
        if (abstractC0030atM5216a.f261f >= 4294967296L) {
            c0179eo.f1491i = c0688rg;
            c0179eo.f2025f = 1;
            abstractC0030atM5216a.m202k(c0179eo);
            return;
        }
        abstractC0030atM5216a.m203m(true);
        try {
            c40Var = (c40) abstractC0358jk.mo540e().mo64l(C0496n2.f4129I);
        } finally {
            try {
            } finally {
            }
        }
        if (c40Var == null || c40Var.mo479b()) {
            Object obj2 = c0179eo.f1492j;
            InterfaceC0618pk interfaceC0618pkMo540e = abstractC0358jk.mo540e();
            Object objM4035V = s91.m4035V(interfaceC0618pkMo540e, obj2);
            la1 la1VarM1521G = objM4035V != s91.f5695C ? AbstractC0307i4.m1521G(abstractC0358jk, interfaceC0618pkMo540e, objM4035V) : null;
            try {
                abstractC0358jk.mo541i(obj);
            } finally {
                if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                    s91.m4026M(interfaceC0618pkMo540e, objM4035V);
                }
            }
        }
        c0179eo.mo541i(w60.m4909p(c40Var.mo481o()));
        while (abstractC0030atM5216a.m205s()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final pe0 m3042T(pe0 pe0Var, boolean z, xg0 xg0Var, boolean z2, xv0 xv0Var, InterfaceC0298hw interfaceC0298hw) {
        return pe0Var.mo2499c(new oz0(z, xg0Var, z2, xv0Var, interfaceC0298hw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U */
    public static String m3043U(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static final pe0 m3044V(boolean z, xg0 xg0Var, boolean z2, xv0 xv0Var, InterfaceC0742sw interfaceC0742sw) {
        return ke0.f3087a.mo2499c(new m81(z, xg0Var, z2, xv0Var, interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0879w7 m3045a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C0879w7(AbstractC0398kl.f3213x, Float.valueOf(f), new C0916x7(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0024an m3046b(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC0817uv interfaceC0817uvM4791a = AbstractC0866vv.m4791a(f);
        if (interfaceC0817uvM4791a == null) {
            interfaceC0817uvM4791a = new na0(f);
        }
        return new C0024an(f2, f, interfaceC0817uvM4791a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m3047c(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final z31 m3048d(Object obj) {
        if (obj == null) {
            obj = o30.f4442l;
        }
        return new z31(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m3049e(sh0 sh0Var, oe0 oe0Var) {
        sh0 sh0VarM319z = m3039Q(oe0Var).m319z();
        int i = sh0VarM319z.f5770f - 1;
        Object[] objArr = sh0VarM319z.f5768d;
        if (i < objArr.length) {
            while (i >= 0) {
                sh0Var.m4072b(((b60) objArr[i]).f395I.f3998f);
                i--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final oe0 m3050f(sh0 sh0Var) {
        int i;
        if (sh0Var == null || (i = sh0Var.f5770f) == 0) {
            return null;
        }
        return (oe0) sh0Var.m4081k(i - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m3051g(List list, int i, int i2) {
        int iM3061u = m3061u(i, list);
        if (iM3061u < 0) {
            iM3061u = -(iM3061u + 1);
        }
        while (iM3061u < list.size() && ((x30) list.get(iM3061u)).f7254b < i2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0016 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: oe0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: oe0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: oe0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: oe0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: oe0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: oe0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final r50 m3052i(oe0 oe0Var) {
        if ((oe0Var.f4531f & 2) != 0) {
            if (oe0Var instanceof r50) {
                return (r50) oe0Var;
            }
            if (oe0Var instanceof AbstractC0731sm) {
                oe0 oe0Var2 = ((AbstractC0731sm) oe0Var).f5782s;
                while (oe0Var2 != 0) {
                    if (oe0Var2 instanceof r50) {
                        return (r50) oe0Var2;
                    }
                    oe0Var2 = (!(oe0Var2 instanceof AbstractC0731sm) || (oe0Var2.f4531f & 2) == 0) ? oe0Var2.f4534i : ((AbstractC0731sm) oe0Var2).f5782s;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public static String m3053m(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m3054n(C0149dv c0149dv, boolean z) {
        int iOrdinal = c0149dv.m727B0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0149dv c0149dvM1541q = AbstractC0307i4.m1541q(c0149dv);
                if (!(c0149dvM1541q != null ? m3054n(c0149dvM1541q, z) : true)) {
                    return false;
                }
                c0149dv.m732x0(EnumC0106cv.f894e, EnumC0106cv.f895f);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                C0921xc.m5129j();
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m3055o(v11 v11Var, ArrayList arrayList, int i) {
        boolean zM4376l = v11Var.m4376l(i);
        int[] iArr = v11Var.f6375b;
        if (zM4376l) {
            arrayList.add(v11Var.m4378n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m3055o(v11Var, arrayList, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m3056p(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C0879w7 m3057q(C0879w7 c0879w7, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) c0879w7.f7016e.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C0916x7) c0879w7.f7017f).f7277a;
        }
        return new C0879w7(c0879w7.f7015d, Float.valueOf(f), new C0916x7(f2), c0879w7.f7018g, c0879w7.f7019h, c0879w7.f7020i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: zi */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final Object m3058r(InterfaceC1005zi interfaceC1005zi, at0 at0Var) {
        if (!((oe0) interfaceC1005zi).f4529d.f4542q) {
            w10.m4824b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        fq0 fq0Var = (fq0) m3039Q(interfaceC1005zi).f391E;
        fq0Var.getClass();
        return AbstractC0398kl.m1936v(fq0Var, at0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m3059s(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m3059s(file2) && z;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m3060t(InterfaceC0618pk interfaceC0618pk) {
        c40 c40Var = (c40) interfaceC0618pk.mo64l(C0496n2.f4129I);
        if (c40Var != null && !c40Var.mo479b()) {
            throw c40Var.mo481o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final int m3061u(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM3008r = p30.m3008r(((x30) list.get(i3)).f7254b, i);
            if (iM3008r < 0) {
                i2 = i3 + 1;
            } else {
                if (iM3008r <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static InterfaceC0515nk m3062v(InterfaceC0515nk interfaceC0515nk, InterfaceC0554ok interfaceC0554ok) {
        interfaceC0554ok.getClass();
        if (p30.m3002l(interfaceC0515nk.getKey(), interfaceC0554ok)) {
            return interfaceC0515nk;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static C0205fd m3063w(C0429lf c0429lf) {
        C0205fd c0205fd = c0429lf.f3450Y;
        if (c0205fd != null) {
            return c0205fd;
        }
        EnumC0472mf enumC0472mf = o30.f4436f;
        C0205fd c0205fd2 = new C0205fd(AbstractC0510nf.m2697c(c0429lf, enumC0472mf), AbstractC0510nf.m2695a(c0429lf, AbstractC0510nf.m2697c(c0429lf, enumC0472mf)), p30.m3011u(C0207ff.m1093b(o30.f4438h, AbstractC0510nf.m2697c(c0429lf, o30.f4437g)), AbstractC0510nf.m2697c(c0429lf, enumC0472mf)), C0207ff.m1093b(0.38f, AbstractC0510nf.m2695a(c0429lf, AbstractC0510nf.m2697c(c0429lf, enumC0472mf))));
        c0429lf.f3450Y = c0205fd2;
        return c0205fd2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static Set m3064x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final c40 m3065y(InterfaceC0618pk interfaceC0618pk) {
        c40 c40Var = (c40) interfaceC0618pk.mo64l(C0496n2.f4129I);
        if (c40Var != null) {
            return c40Var;
        }
        C0921xc.m5130k(interfaceC0618pk, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final Object m3066z(sd0 sd0Var) {
        Object objMo50j = sd0Var.mo50j();
        o50 o50Var = objMo50j instanceof o50 ? (o50) objMo50j : null;
        if (o50Var != null) {
            return o50Var.f4464r;
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo1267L(C0338j0 c0338j0, C0338j0 c0338j02);

    /* JADX INFO: renamed from: M */
    public abstract void mo1268M(C0338j0 c0338j0, Thread thread);

    /* JADX INFO: renamed from: h */
    public abstract void mo1197h(float f, long j, C0877w5 c0877w5);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1269j(AbstractFutureC0375k0 abstractFutureC0375k0, C0229g0 c0229g0);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1270k(AbstractFutureC0375k0 abstractFutureC0375k0, Object obj, Object obj2);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo1271l(AbstractFutureC0375k0 abstractFutureC0375k0, C0338j0 c0338j0, C0338j0 c0338j02);
}
