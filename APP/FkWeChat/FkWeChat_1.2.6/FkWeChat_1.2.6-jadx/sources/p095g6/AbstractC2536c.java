package p095g6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import ge.C2790e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1061t;
import p038ce.AbstractC1522d;
import p038ce.C1523e;
import p038ce.C1524f;
import p038ce.InterfaceC1519a;
import p077f6.InterfaceC2321l0;
import p077f6.InterfaceC2327o0;
import p077f6.InterfaceC2339y;
import p185m8.AbstractC5116y;
import p299ub.AbstractC8621f0;
import p319w2.C9067f3;
import p319w2.C9147v3;
import p354y5.AbstractC9599v;

/* JADX INFO: renamed from: g6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2536c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1519a m9039a(InterfaceC1519a interfaceC1519a, AbstractC1113a abstractC1113a) {
        interfaceC1519a.getClass();
        abstractC1113a.getClass();
        for (InterfaceC1519a interfaceC1519a2 : interfaceC1519a.mo5938f()) {
            if (AbstractC1061t.m3842c(interfaceC1519a2.getType(), abstractC1113a)) {
                return interfaceC1519a2;
            }
            InterfaceC1519a interfaceC1519aM9039a = m9039a(interfaceC1519a2, abstractC1113a);
            if (interfaceC1519aM9039a != null) {
                return interfaceC1519aM9039a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final C9067f3 m9040b(InterfaceC2321l0 interfaceC2321l0, InterfaceC0572r interfaceC0572r, int i10) {
        interfaceC2321l0.getClass();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(456429260, i10, -1, "com.mikepenz.markdown.utils.<get-codeSpanStyle> (Extensions.kt:174)");
        }
        C9067f3 c9067f3M35552O = C9147v3.m35538c(interfaceC2321l0.mo8465i(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, ((InterfaceC2339y) interfaceC0572r.mo2142A(AbstractC9599v.m37569z())).mo8432a(), null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16775167, null).m35552O();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c9067f3M35552O;
    }

    /* JADX INFO: renamed from: c */
    public static final String m9041c(InterfaceC1519a interfaceC1519a, CharSequence charSequence) {
        interfaceC1519a.getClass();
        charSequence.getClass();
        return C2535b.f6796a.m9038b(AbstractC1522d.m5947b(interfaceC1519a, charSequence).toString(), false, true);
    }

    /* JADX INFO: renamed from: d */
    public static final List m9042d(List list) {
        list.getClass();
        return list.subList(1, list.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9043e(java.util.Map r7, p038ce.InterfaceC1519a r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            r7.getClass()
            r8.getClass()
            r9.getClass()
            be.a r0 = r8.getType()
            be.a r1 = be.C1115c.f3364n
            boolean r0 = p024b9.AbstractC1061t.m3842c(r0, r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L26
            be.a r11 = be.C1115c.f3365o
            ce.a r11 = p038ce.AbstractC1522d.m5946a(r8, r11)
            if (r11 == 0) goto L24
            java.lang.String r11 = m9041c(r11, r9)
            goto L84
        L24:
            r11 = r1
            goto L84
        L26:
            if (r11 != 0) goto L41
            be.a r0 = r8.getType()
            be.a r3 = be.C1115c.f3369s
            boolean r0 = p024b9.AbstractC1061t.m3842c(r0, r3)
            if (r0 == 0) goto L41
            be.a r11 = be.C1115c.f3368r
            ce.a r11 = p038ce.AbstractC1522d.m5946a(r8, r11)
            if (r11 == 0) goto L24
            java.lang.String r11 = m9041c(r11, r9)
            goto L84
        L41:
            if (r11 != 0) goto L24
            be.a r11 = r8.getType()
            be.a r0 = be.C1115c.f3373w
            boolean r11 = p024b9.AbstractC1061t.m3842c(r11, r0)
            if (r11 == 0) goto L24
            java.util.List r11 = r8.mo5938f()
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            r2 = r0
            ce.a r2 = (p038ce.InterfaceC1519a) r2
            be.a r2 = r2.getType()
            java.lang.String r2 = r2.m4015a()
            be.a r3 = be.C1115c.f3373w
            java.lang.String r3 = r3.m4015a()
            boolean r2 = p024b9.AbstractC1061t.m3842c(r2, r3)
            if (r2 == 0) goto L57
            goto L7a
        L79:
            r0 = r1
        L7a:
            ce.a r0 = (p038ce.InterfaceC1519a) r0
            if (r0 != 0) goto L7f
            r0 = r8
        L7f:
            java.lang.String r11 = m9041c(r0, r9)
            r2 = 1
        L84:
            if (r11 == 0) goto L99
            if (r2 == 0) goto L8a
            r1 = r11
            goto L96
        L8a:
            be.a r0 = be.C1115c.f3366p
            ce.a r0 = p038ce.AbstractC1522d.m5946a(r8, r0)
            if (r0 == 0) goto L96
            java.lang.String r1 = m9041c(r0, r9)
        L96:
            r7.put(r11, r1)
        L99:
            if (r10 == 0) goto Lbb
            java.util.List r8 = r8.mo5938f()
            java.util.Iterator r8 = r8.iterator()
        La3:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r8.next()
            r1 = r10
            ce.a r1 = (p038ce.InterfaceC1519a) r1
            r5 = 24
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r2 = r9
            m9044f(r0, r1, r2, r3, r4, r5, r6)
            goto La3
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g6.AbstractC2536c.m9043e(java.util.Map, ce.a, java.lang.String, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9044f(Map map, InterfaceC1519a interfaceC1519a, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        m9043e(map, interfaceC1519a, str, z10, z11);
    }

    /* JADX INFO: renamed from: g */
    public static final List m9045g(List list, AbstractC1113a abstractC1113a) {
        InterfaceC1519a c1523e;
        list.getClass();
        abstractC1113a.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1519a interfaceC1519a = (InterfaceC1519a) it.next();
            if (interfaceC1519a instanceof C1524f) {
                interfaceC1519a = (C1524f) interfaceC1519a;
                if (AbstractC1061t.m3842c(interfaceC1519a.getType(), C2790e.f7272d) || AbstractC1061t.m3842c(interfaceC1519a.getType(), C1115c.f3373w)) {
                    c1523e = new C1524f(abstractC1113a, interfaceC1519a.mo5940h(), interfaceC1519a.mo5939g());
                    interfaceC1519a = c1523e;
                }
            } else if (interfaceC1519a instanceof C1523e) {
                C1523e c1523e2 = (C1523e) interfaceC1519a;
                c1523e = new C1523e(c1523e2.getType(), m9045g(c1523e2.mo5938f(), abstractC1113a));
                interfaceC1519a = c1523e;
            }
            arrayList.add(interfaceC1519a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m9046h(List list, AbstractC1113a abstractC1113a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC1113a = AbstractC1117e.f3392b;
        }
        return m9045g(list, abstractC1113a);
    }

    /* JADX INFO: renamed from: i */
    public static final String m9047i(InterfaceC1519a interfaceC1519a, String str) {
        interfaceC1519a.getClass();
        str.getClass();
        InterfaceC1519a interfaceC1519aM9039a = m9039a(interfaceC1519a, C1115c.f3368r);
        if (interfaceC1519aM9039a != null) {
            String string = AbstractC8621f0.m33161r1(AbstractC8621f0.m33163s1(m9041c(interfaceC1519aM9039a, str), '[', ']')).toString();
            if (string.length() > 0) {
                return string;
            }
        }
        InterfaceC1519a interfaceC1519aM9039a2 = m9039a(interfaceC1519a, C1115c.f3365o);
        if (interfaceC1519aM9039a2 == null) {
            return null;
        }
        String string2 = AbstractC8621f0.m33161r1(AbstractC8621f0.m33163s1(m9041c(interfaceC1519aM9039a2, str), '[', ']')).toString();
        if (string2.length() > 0) {
            return string2;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final String m9048j(InterfaceC1519a interfaceC1519a, String str, InterfaceC2327o0 interfaceC2327o0) {
        InterfaceC1519a interfaceC1519aM5946a;
        String strM9041c;
        String strMo8490b;
        interfaceC1519a.getClass();
        str.getClass();
        InterfaceC1519a interfaceC1519aM9039a = m9039a(interfaceC1519a, C1115c.f3366p);
        if (interfaceC1519aM9039a != null) {
            return m9041c(interfaceC1519aM9039a, str);
        }
        InterfaceC1519a interfaceC1519aM9039a2 = m9039a(interfaceC1519a, C1115c.f3370t);
        if ((interfaceC1519aM9039a2 == null && (interfaceC1519aM9039a2 = m9039a(interfaceC1519a, C1115c.f3371u)) == null) || (interfaceC1519aM5946a = AbstractC1522d.m5946a(interfaceC1519aM9039a2, C1115c.f3365o)) == null || (strM9041c = m9041c(interfaceC1519aM5946a, str)) == null || interfaceC2327o0 == null || (strMo8490b = interfaceC2327o0.mo8490b(strM9041c)) == null || strMo8490b.length() <= 0) {
            return null;
        }
        return strMo8490b;
    }
}
