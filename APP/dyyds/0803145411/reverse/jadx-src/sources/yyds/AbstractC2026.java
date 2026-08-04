package yyds;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲀᛶᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2026 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC2026 f10101;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public AbstractC2026 f10102;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Boolean f10103 = null;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Boolean f10104 = null;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f10100 = -1;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (m3900()) {
            return mo828();
        }
        return mo828() + m3899().toString();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m3898() {
        Boolean boolValueOf = this.f10104;
        if (boolValueOf == null) {
            AbstractC2026 abstractC2026 = this.f10101;
            boolValueOf = Boolean.valueOf(abstractC2026 == null || (abstractC2026.mo829() && this.f10101.m3898()));
            this.f10104 = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AbstractC2026 m3899() {
        if (!m3900()) {
            return this.f10102;
        }
        C0188.m800("Current path token is a leaf");
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m3900() {
        return this.f10102 == null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public abstract void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract String mo828();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public abstract boolean mo829();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3901(int i, String str, Object obj, C1762 c1762) {
        String strM2013 = AbstractC0902.m2013(str, "[", String.valueOf(i), "]");
        C0989 c0989 = c1762.f8846;
        if (i < 0) {
            i += c0989.f4503.m408(obj);
        }
        try {
            c0989.f4503.getClass();
            Object obj2 = ((List) obj).get(i);
            boolean zM3900 = m3900();
            C0706 c0706 = AbstractC1614.f8231;
            if (zM3900) {
                c1762.m3503(strM2013, c0706, obj2);
            } else {
                m3899().mo827(strM2013, c0706, obj2, c1762);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m3902() {
        Boolean bool = this.f10103;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zMo829 = mo829();
        if (zMo829 && !m3900()) {
            zMo829 = this.f10102.m3902();
        }
        this.f10103 = Boolean.valueOf(zMo829);
        return zMo829;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3903(String str, Object obj, C1762 c1762, List list) {
        Object obj2;
        C0989 c0989 = c1762.f8846;
        int size = list.size();
        AbstractC1614 abstractC1614 = AbstractC1614.f8231;
        Object obj3 = C0052.f549;
        EnumC0445 enumC0445 = EnumC0445.f2268;
        Object obj4 = null;
        EnumC0445 enumC04452 = EnumC0445.f2269;
        if (size != 1) {
            String str2 = str + "[" + AbstractC0902.m2014(", ", "'", list) + "]";
            ((C0721) c0989.f4503.f551).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                C0052 c0052 = c0989.f4503;
                C0052 c00522 = c0989.f4503;
                Set set = c0989.f4505;
                if (c0052.m393(obj).contains(str3)) {
                    c00522.getClass();
                    Map map = (Map) obj;
                    obj2 = !map.containsKey(str3) ? obj3 : map.get(str3);
                    if (obj2 == obj3) {
                        if (set.contains(enumC04452)) {
                            obj2 = null;
                        }
                    }
                } else if (set.contains(enumC04452)) {
                    obj2 = null;
                } else if (set.contains(enumC0445)) {
                    throw new C1553("Missing property in path ".concat(str2));
                }
                c00522.getClass();
                linkedHashMap.put(str3.toString(), obj2);
            }
            c1762.m3503(str2, abstractC1614, linkedHashMap);
            return;
        }
        String str4 = (String) list.get(0);
        String strM2013 = AbstractC0902.m2013(str, "['", str4, "']");
        c0989.f4503.getClass();
        Map map2 = (Map) obj;
        Object obj5 = !map2.containsKey(str4) ? obj3 : map2.get(str4);
        if (obj5 == obj3) {
            boolean zM3900 = m3900();
            EnumC0445 enumC04453 = EnumC0445.f2270;
            if (!zM3900) {
                if (!((m3898() && mo829()) || c0989.f4505.contains(enumC0445)) || c0989.f4505.contains(enumC04453)) {
                    return;
                }
                throw new C1553("Missing property in path " + strM2013);
            }
            Set set2 = c0989.f4505;
            Set set3 = c0989.f4505;
            if (!set2.contains(enumC04452)) {
                if (set3.contains(enumC04453) || !set3.contains(enumC0445)) {
                    return;
                }
                throw new C1553("No results for path: " + strM2013);
            }
        } else {
            obj4 = obj5;
        }
        if (!m3900()) {
            m3899().mo827(strM2013, abstractC1614, obj4, c1762);
            return;
        }
        String strM4014 = AbstractC2104.m4014("[", String.valueOf(this.f10100), "]");
        if (strM4014.equals("[-1]") || c1762.f8851.f12909.f13520.f10101.mo828().equals(strM4014)) {
            c1762.m3503(strM2013, abstractC1614, obj4);
        }
    }
}
