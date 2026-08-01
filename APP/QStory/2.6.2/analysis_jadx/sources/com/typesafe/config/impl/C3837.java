package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import com.typesafe.config.impl.SerializedConfigValue;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p007.AbstractC6136;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3837 implements InterfaceC8160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f12049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OriginType f12051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f12052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f12055;

    public C3837(String str, int i, int i2, OriginType originType, String str2, String str3, List list) {
        if (str == null) {
            C2941.m6350("description may not be null");
            throw null;
        }
        this.f12054 = str;
        this.f12053 = i;
        this.f12052 = i2;
        this.f12051 = originType;
        this.f12050 = str2;
        this.f12049 = str3;
        this.f12055 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8218(C3837 c3837, C3837 c38372) {
        int i = c3837.f12051 == c38372.f12051 ? 1 : 0;
        if (!c3837.f12054.equals(c38372.f12054)) {
            return i;
        }
        int i2 = i + 1;
        if (c3837.f12053 == c38372.f12053) {
            i2 = i + 2;
        }
        if (c3837.f12052 == c38372.f12052) {
            i2++;
        }
        if (AbstractC3863.m8262(c3837.f12050, c38372.f12050)) {
            i2++;
        }
        return AbstractC3863.m8262(c3837.f12049, c38372.f12049) ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C3837 m8219(String str) {
        return new C3837(str, -1, -1, OriginType.GENERIC, null, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3837 m8220(C3837 c3837, C3837 c38372) {
        int i;
        int iMax;
        List list;
        OriginType originType = c3837.f12051;
        String str = c3837.f12049;
        String str2 = c3837.f12050;
        List list2 = c3837.f12055;
        OriginType originType2 = c38372.f12051;
        List list3 = c38372.f12055;
        if (originType != originType2) {
            originType = OriginType.GENERIC;
        }
        OriginType originType3 = originType;
        String strM11548 = c3837.f12054;
        String strSubstring = c38372.f12054;
        if (strM11548.startsWith("merge of ")) {
            strM11548 = strM11548.substring(9);
        }
        if (strSubstring.startsWith("merge of ")) {
            strSubstring = strSubstring.substring(9);
        }
        if (strM11548.equals(strSubstring)) {
            int iMin = c3837.f12053;
            int i2 = c38372.f12053;
            if (iMin < 0) {
                iMin = i2;
            } else if (i2 >= 0) {
                iMin = Math.min(iMin, i2);
            }
            iMax = Math.max(c3837.f12052, c38372.f12052);
            i = iMin;
        } else {
            String strM8223 = c3837.m8223();
            String strM82232 = c38372.m8223();
            if (strM8223.startsWith("merge of ")) {
                strM8223 = strM8223.substring(9);
            }
            if (strM82232.startsWith("merge of ")) {
                strM82232 = strM82232.substring(9);
            }
            strM11548 = AbstractC6136.m11548("merge of ", strM8223, ",", strM82232);
            i = -1;
            iMax = -1;
        }
        String str3 = strM11548;
        String str4 = AbstractC3863.m8262(str2, c38372.f12050) ? str2 : null;
        String str5 = AbstractC3863.m8262(str, c38372.f12049) ? str : null;
        if (AbstractC3863.m8262(list2, list3)) {
            list = list2;
        } else {
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            list = arrayList;
        }
        return new C3837(str3, i, iMax, originType3, str4, str5, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC8160 m8221(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C2941.m6350("can't merge empty list of origins");
            return null;
        }
        if (arrayList.size() == 1) {
            return (InterfaceC8160) arrayList.iterator().next();
        }
        if (arrayList.size() == 2) {
            Iterator it = arrayList.iterator();
            return m8220((C3837) it.next(), (C3837) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C3837) ((InterfaceC8160) it2.next()));
        }
        while (arrayList2.size() > 2) {
            C3837 c3837 = (C3837) AbstractC6136.m11555(1, arrayList2);
            arrayList2.remove(arrayList2.size() - 1);
            C3837 c38372 = (C3837) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            C3837 c38373 = (C3837) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            arrayList2.add(m8218(c38373, c38372) >= m8218(c38372, c3837) ? m8220(m8220(c38373, c38372), c3837) : m8220(c38373, m8220(c38372, c3837)));
        }
        return m8221(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3837) {
            C3837 c3837 = (C3837) obj;
            if (this.f12054.equals(c3837.f12054) && this.f12053 == c3837.f12053 && this.f12052 == c3837.f12052 && this.f12051 == c3837.f12051 && AbstractC3863.m8262(this.f12050, c3837.f12050) && AbstractC3863.m8262(this.f12049, c3837.f12049)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12051.hashCode() + ((((AbstractC6136.m11539(41, 41, this.f12054) + this.f12053) * 41) + this.f12052) * 41)) * 41;
        String str = this.f12050;
        if (str != null) {
            iHashCode = AbstractC6136.m11539(iHashCode, 41, str);
        }
        String str2 = this.f12049;
        return str2 != null ? AbstractC6136.m11539(iHashCode, 41, str2) : iHashCode;
    }

    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("ConfigOrigin("), this.f12054, ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final EnumMap m8222() {
        EnumMap enumMap = new EnumMap(SerializedConfigValue.SerializedField.class);
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION, this.f12054);
        int i = this.f12053;
        if (i >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER, Integer.valueOf(i));
        }
        int i2 = this.f12052;
        if (i2 >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER, Integer.valueOf(i2));
        }
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_TYPE, Integer.valueOf(this.f12051.ordinal()));
        String str = this.f12050;
        if (str != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_URL, str);
        }
        String str2 = this.f12049;
        if (str2 != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_RESOURCE, str2);
        }
        List list = this.f12055;
        if (list != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_COMMENTS, list);
        }
        return enumMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8223() {
        String str = this.f12054;
        int i = this.f12053;
        if (i < 0) {
            return str;
        }
        int i2 = this.f12052;
        if (i2 == i) {
            return str + ": " + i;
        }
        return str + ": " + i + "-" + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3837 m8224(int i) {
        if (i == this.f12053 && i == this.f12052) {
            return this;
        }
        return new C3837(this.f12054, i, i, this.f12051, this.f12050, this.f12049, this.f12055);
    }
}
