package p082fd;

import ae.C0076g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.C2833a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p157kd.AbstractC2390d;
import p174m.C2579b2;
import p174m.C2637o2;
import p246qd.C3507k;
import p246qd.C3515s;
import p253r1.InterfaceC3644a;
import p293u2.C4247q;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p332wb.AbstractC4855en;
import p333wc.C5552a;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: fd.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1211h implements InterfaceC3644a {

    /* JADX INFO: renamed from: g */
    public boolean f4071g;

    /* JADX INFO: renamed from: h */
    public final Object f4072h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1211h() {
        ArrayList<C5552a> arrayList = new ArrayList();
        this.f4072h = arrayList;
        C5552a c5552a = new C5552a();
        Boolean bool = Boolean.TRUE;
        c5552a.f22650c = Arrays.asList(bool, Boolean.FALSE);
        c5552a.f22652e = new C2833a(21);
        c5552a.f22651d = new C2833a(22);
        arrayList.add(c5552a);
        c5552a.f22649b = "verify dex file checksum before load";
        c5552a.f22654g = bool;
        c5552a.f22653f = new C0076g(this, 8);
        for (C5552a c5552a2 : arrayList) {
            String str = c5552a2.f22648a;
            String str2 = c5552a2.f22649b;
            if (str2 == null || str2.isEmpty()) {
                C2104o.m5294t(AbstractC4855en.m9263g("Description should be set for option: ", str));
                throw null;
            }
            if (c5552a2.f22651d == null) {
                C2104o.m5294t(AbstractC4855en.m9263g("Parser should be set for option: ", str));
                throw null;
            }
            if (c5552a2.f22652e == null) {
                C2104o.m5294t(AbstractC4855en.m9263g("Formatter should be set for option: ", str));
                throw null;
            }
            if (c5552a2.f22653f == null) {
                C2104o.m5294t(AbstractC4855en.m9263g("Setter should be set for option: ", str));
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: M0 */
    public long mo1581M0(long j3, long j4, int i9) {
        if (!this.f4071g) {
            return 0L;
        }
        C2637o2 c2637o2 = (C2637o2) this.f4072h;
        if (c2637o2.f8588a.mo5458a()) {
            return 0L;
        }
        return c2637o2.m6095h(c2637o2.m6091d(c2637o2.f8588a.mo5462e(c2637o2.m6091d(c2637o2.m6094g(j4)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public String m3323a(C3507k c3507k) {
        if (this.f4071g) {
            List list = c3507k.f11413c;
            return list.isEmpty() ? "v" : AbstractC0921a.m2249l(((C3515s) list.get(0)).f11444i.f11439l, "r");
        }
        if (c3507k.f11415e) {
            return "this";
        }
        String strM2249l = c3507k.f11411a;
        if (!AbstractC2390d.m5714c(strM2249l)) {
            List list2 = c3507k.f11413c;
            strM2249l = list2.isEmpty() ? "v" : AbstractC0921a.m2249l(((C3515s) list2.get(0)).f11444i.f11439l, "r");
        }
        String strM3324b = m3324b(strM2249l);
        c3507k.f11411a = strM3324b;
        return strM3324b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public String m3324b(String str) {
        HashSet hashSet = (HashSet) this.f4072h;
        int i9 = 2;
        String str2 = str;
        while (hashSet.contains(str2)) {
            str2 = str + i9;
            i9++;
        }
        hashSet.add(str2);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m3325c(HashMap map) {
        Object objApply;
        for (C5552a c5552a : (ArrayList) this.f4072h) {
            String str = c5552a.f22648a;
            String str2 = (String) map.get(str);
            if (str2 == null) {
                objApply = c5552a.f22654g;
            } else {
                try {
                    objApply = c5552a.f22651d.apply(str2);
                } catch (Exception e6) {
                    C0086a.m457p(AbstractC0255e.m1021j("Parse failed for option: ", str, ", value: ", str2), e6);
                    return;
                }
            }
            try {
                c5552a.f22653f.accept(objApply);
            } catch (Exception e7) {
                C0086a.m457p(AbstractC0255e.m1021j("Setter invoke failed for option: ", str, ", value: ", String.valueOf(objApply)), e7);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p253r1.InterfaceC3644a
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1583m0(long j3, long j4, AbstractC6038c abstractC6038c) {
        C2579b2 c2579b2;
        long jM8546d;
        if (abstractC6038c instanceof C2579b2) {
            c2579b2 = (C2579b2) abstractC6038c;
            int i9 = c2579b2.f8367j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2579b2.f8367j = i9 - Integer.MIN_VALUE;
            } else {
                c2579b2 = new C2579b2(this, abstractC6038c);
            }
        }
        Object objM6088a = c2579b2.f8365h;
        int i10 = c2579b2.f8367j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objM6088a);
            jM8546d = 0;
            if (this.f4071g) {
                C2637o2 c2637o2 = (C2637o2) this.f4072h;
                if (!c2637o2.f8596i) {
                    c2579b2.f8364g = j4;
                    c2579b2.f8367j = 1;
                    objM6088a = c2637o2.m6088a(j4, c2579b2);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6088a == enumC5799a) {
                        return enumC5799a;
                    }
                }
                jM8546d = C4247q.m8546d(j4, jM8546d);
            }
            return new C4247q(jM8546d);
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j4 = c2579b2.f8364g;
        AbstractC1089i.m2732I0(objM6088a);
        jM8546d = ((C4247q) objM6088a).f13927a;
        jM8546d = C4247q.m8546d(j4, jM8546d);
        return new C4247q(jM8546d);
    }

    public C1211h(C1204a c1204a, C4322r c4322r) {
        HashSet hashSet = new HashSet();
        this.f4072h = hashSet;
        this.f4071g = c1204a.f4043d;
        C1211h c1211h = c1204a.f4050k;
        if (c1211h != null) {
            hashSet.addAll((HashSet) c1211h.f4072h);
        }
        C4309e c4309e = c4322r.f14411l;
        for (C4311g c4311g : c4309e.f14381u) {
            if (c4311g.f14391m.m856h()) {
                hashSet.add(c4311g.f14390l.f10149j);
            }
        }
        Iterator it = c4309e.f14382v.iterator();
        while (it.hasNext()) {
            hashSet.add(((C4309e) it.next()).f14373m.m6646k());
        }
        hashSet.addAll((Set) c4322r.f14411l.f14371k.f14440f.f23527b);
    }

    public /* synthetic */ C1211h(Object obj, boolean z9) {
        this.f4072h = obj;
        this.f4071g = z9;
    }
}
