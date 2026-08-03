package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242c1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4220a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4221b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f4222c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f4223d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f4224e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f4225f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f4226g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m2363a(int i, int i2, Intent intent) {
        String str = (String) this.f4220a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0989X0 c0989x0 = (C0989X0) this.f4224e.get(str);
        if ((c0989x0 != null ? c0989x0.f3158a : null) != null) {
            ArrayList arrayList = this.f4223d;
            if (arrayList.contains(str)) {
                c0989x0.f3158a.mo1524a(c0989x0.f3159b.mo1622c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4225f.remove(str);
        this.f4226g.putParcelable(str, new C0689Q0(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1452b(int i, AbstractC0817T0 abstractC0817T0, Object obj);

    /* JADX INFO: renamed from: c */
    public final C1199b1 m2364c(String str, AbstractC0817T0 abstractC0817T0, InterfaceC0731R0 interfaceC0731R0) {
        m2365d(str);
        this.f4224e.put(str, new C0989X0(abstractC0817T0, interfaceC0731R0));
        LinkedHashMap linkedHashMap = this.f4225f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0731R0.mo1524a(obj);
        }
        Bundle bundle = this.f4226g;
        C0689Q0 c0689q0 = (C0689Q0) AbstractC0671Pj.m1353m(bundle, str);
        if (c0689q0 != null) {
            bundle.remove(str);
            interfaceC0731R0.mo1524a(abstractC0817T0.mo1622c(c0689q0.f2218b, c0689q0.f2217a));
        }
        return new C1199b1(this, str, abstractC0817T0);
    }

    /* JADX INFO: renamed from: d */
    public final void m2365d(String str) {
        LinkedHashMap linkedHashMap = this.f4221b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new C1216bb(new C2763yj(C1075Z0.f3439b, new C0848Tp(27)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f4220a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: e */
    public final void m2366e(String str) {
        Integer num;
        if (!this.f4223d.contains(str) && (num = (Integer) this.f4221b.remove(str)) != null) {
            this.f4220a.remove(num);
        }
        this.f4224e.remove(str);
        LinkedHashMap linkedHashMap = this.f4225f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f4226g;
        if (bundle.containsKey(str)) {
            Objects.toString((C0689Q0) AbstractC0671Pj.m1353m(bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f4222c;
        C1032Y0 c1032y0 = (C1032Y0) linkedHashMap2.get(str);
        if (c1032y0 != null) {
            ArrayList arrayList = c1032y0.f3302b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1032y0.f3301a.mo1556b((InterfaceC0889Un) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
