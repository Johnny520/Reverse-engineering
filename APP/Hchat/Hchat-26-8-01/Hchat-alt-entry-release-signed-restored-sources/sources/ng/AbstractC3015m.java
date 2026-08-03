package ng;

import ac.AbstractC0063p;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p054dg.C0791j;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p119i2.C1955z;
import p136j8.C2104o;
import p259r9.C3766p;
import tf.AbstractC4165l;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: ng.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3015m extends AbstractC3016n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static InterfaceC3012j m6408R(Iterator it) {
        it.getClass();
        return new C3003a(new C0795n(it, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static C3005c m6409S(InterfaceC3012j interfaceC3012j) {
        return new C3005c(interfaceC3012j, new C3766p(11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C3011i m6410T(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        return new C3011i(interfaceC3012j, true, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static Object m6411U(InterfaceC3012j interfaceC3012j) {
        Iterator it = interfaceC3012j.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static String m6412V(InterfaceC3012j interfaceC3012j, String str, InterfaceC1231l interfaceC1231l, int i9) {
        if ((i9 & 32) != 0) {
            interfaceC1231l = null;
        }
        interfaceC3012j.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int i10 = 0;
        for (Object obj : interfaceC3012j) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            AbstractC0063p.m413f(sb2, obj, interfaceC1231l);
        }
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static C3022t m6413W(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l) {
        interfaceC3012j.getClass();
        interfaceC1231l.getClass();
        return new C3022t(interfaceC3012j, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static C3011i m6414X(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l) {
        return new C3011i(new C3022t(interfaceC3012j, interfaceC1231l), false, new C1955z(29));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static C0791j m6415Y(InterfaceC3012j interfaceC3012j, C0795n c0795n) {
        InterfaceC3012j interfaceC3012jM8376k0 = AbstractC4165l.m8376k0(new InterfaceC3012j[]{interfaceC3012j, c0795n});
        C1955z c1955z = new C1955z(28);
        if (!(interfaceC3012jM8376k0 instanceof C3022t)) {
            return new C0791j(interfaceC3012jM8376k0, new C3766p(11), c1955z);
        }
        C3022t c3022t = (C3022t) interfaceC3012jM8376k0;
        return new C0791j(c3022t.f9822a, c3022t.f9823b, c1955z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static InterfaceC3012j m6416Z(InterfaceC3012j interfaceC3012j, int i9) {
        if (i9 >= 0) {
            return i9 == 0 ? C3009g.f9799a : interfaceC3012j instanceof InterfaceC3008f ? ((InterfaceC3008f) interfaceC3012j).mo6402a(i9) : new C3007e(interfaceC3012j, i9, 1);
        }
        C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m6417a0(InterfaceC3012j interfaceC3012j, AbstractCollection abstractCollection) {
        Iterator it = interfaceC3012j.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static List m6418b0(InterfaceC3012j interfaceC3012j) {
        interfaceC3012j.getClass();
        Iterator it = interfaceC3012j.iterator();
        if (!it.hasNext()) {
            return C4173t.f13710g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static Set m6419c0(InterfaceC3012j interfaceC3012j) {
        Iterator it = interfaceC3012j.iterator();
        if (!it.hasNext()) {
            return C4175v.f13712g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0063p.m404N(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
