package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.impl.SerializedConfigValue;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p009.AbstractC6183;
import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3838 implements InterfaceC8161 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f12054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OriginType f12056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f12057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f12060;

    public C3838(String str, int i, int i2, OriginType originType, String str2, String str3, List list) {
        if (str == null) {
            C2942.m6408("description may not be null");
            throw null;
        }
        this.f12059 = str;
        this.f12058 = i;
        this.f12057 = i2;
        this.f12056 = originType;
        this.f12055 = str2;
        this.f12054 = str3;
        this.f12060 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8205(C3838 c3838, C3838 c38382) {
        int i = c3838.f12056 == c38382.f12056 ? 1 : 0;
        if (!c3838.f12059.equals(c38382.f12059)) {
            return i;
        }
        int i2 = i + 1;
        if (c3838.f12058 == c38382.f12058) {
            i2 = i + 2;
        }
        if (c3838.f12057 == c38382.f12057) {
            i2++;
        }
        if (AbstractC3864.m8249(c3838.f12055, c38382.f12055)) {
            i2++;
        }
        return AbstractC3864.m8249(c3838.f12054, c38382.f12054) ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C3838 m8206(String str) {
        return new C3838(str, -1, -1, OriginType.GENERIC, null, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3838 m8207(C3838 c3838, C3838 c38382) {
        int i;
        int iMax;
        List list;
        OriginType originType = c3838.f12056;
        String str = c3838.f12054;
        String str2 = c3838.f12055;
        List list2 = c3838.f12060;
        OriginType originType2 = c38382.f12056;
        List list3 = c38382.f12060;
        if (originType != originType2) {
            originType = OriginType.GENERIC;
        }
        OriginType originType3 = originType;
        String strM11581 = c3838.f12059;
        String strSubstring = c38382.f12059;
        if (strM11581.startsWith("merge of ")) {
            strM11581 = strM11581.substring(9);
        }
        if (strSubstring.startsWith("merge of ")) {
            strSubstring = strSubstring.substring(9);
        }
        if (strM11581.equals(strSubstring)) {
            int iMin = c3838.f12058;
            int i2 = c38382.f12058;
            if (iMin < 0) {
                iMin = i2;
            } else if (i2 >= 0) {
                iMin = Math.min(iMin, i2);
            }
            iMax = Math.max(c3838.f12057, c38382.f12057);
            i = iMin;
        } else {
            String strM8210 = c3838.m8210();
            String strM82102 = c38382.m8210();
            if (strM8210.startsWith("merge of ")) {
                strM8210 = strM8210.substring(9);
            }
            if (strM82102.startsWith("merge of ")) {
                strM82102 = strM82102.substring(9);
            }
            strM11581 = AbstractC6183.m11581("merge of ", strM8210, ",", strM82102);
            i = -1;
            iMax = -1;
        }
        String str3 = strM11581;
        String str4 = AbstractC3864.m8249(str2, c38382.f12055) ? str2 : null;
        String str5 = AbstractC3864.m8249(str, c38382.f12054) ? str : null;
        if (AbstractC3864.m8249(list2, list3)) {
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
        return new C3838(str3, i, iMax, originType3, str4, str5, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC8161 m8208(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C2942.m6408("can't merge empty list of origins");
            return null;
        }
        if (arrayList.size() == 1) {
            return (InterfaceC8161) arrayList.iterator().next();
        }
        if (arrayList.size() == 2) {
            Iterator it = arrayList.iterator();
            return m8207((C3838) it.next(), (C3838) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C3838) ((InterfaceC8161) it2.next()));
        }
        while (arrayList2.size() > 2) {
            C3838 c3838 = (C3838) AbstractC6183.m11586(1, arrayList2);
            arrayList2.remove(arrayList2.size() - 1);
            C3838 c38382 = (C3838) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            C3838 c38383 = (C3838) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            arrayList2.add(m8205(c38383, c38382) >= m8205(c38382, c3838) ? m8207(m8207(c38383, c38382), c3838) : m8207(c38383, m8207(c38382, c3838)));
        }
        return m8208(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3838) {
            C3838 c3838 = (C3838) obj;
            if (this.f12059.equals(c3838.f12059) && this.f12058 == c3838.f12058 && this.f12057 == c3838.f12057 && this.f12056 == c3838.f12056 && AbstractC3864.m8249(this.f12055, c3838.f12055) && AbstractC3864.m8249(this.f12054, c3838.f12054)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12056.hashCode() + ((((AbstractC6183.m11572(41, 41, this.f12059) + this.f12058) * 41) + this.f12057) * 41)) * 41;
        String str = this.f12055;
        if (str != null) {
            iHashCode = AbstractC6183.m11572(iHashCode, 41, str);
        }
        String str2 = this.f12054;
        return str2 != null ? AbstractC6183.m11572(iHashCode, 41, str2) : iHashCode;
    }

    public final String toString() {
        return AbstractC0053.m151(new StringBuilder("ConfigOrigin("), this.f12059, ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final EnumMap m8209() {
        EnumMap enumMap = new EnumMap(SerializedConfigValue.SerializedField.class);
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION, this.f12059);
        int i = this.f12058;
        if (i >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER, Integer.valueOf(i));
        }
        int i2 = this.f12057;
        if (i2 >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER, Integer.valueOf(i2));
        }
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_TYPE, Integer.valueOf(this.f12056.ordinal()));
        String str = this.f12055;
        if (str != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_URL, str);
        }
        String str2 = this.f12054;
        if (str2 != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_RESOURCE, str2);
        }
        List list = this.f12060;
        if (list != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_COMMENTS, list);
        }
        return enumMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8210() {
        String str = this.f12059;
        int i = this.f12058;
        if (i < 0) {
            return str;
        }
        int i2 = this.f12057;
        if (i2 == i) {
            return str + ": " + i;
        }
        return str + ": " + i + "-" + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3838 m8211(int i) {
        if (i == this.f12058 && i == this.f12057) {
            return this;
        }
        return new C3838(this.f12059, i, i, this.f12056, this.f12055, this.f12054, this.f12060);
    }
}
