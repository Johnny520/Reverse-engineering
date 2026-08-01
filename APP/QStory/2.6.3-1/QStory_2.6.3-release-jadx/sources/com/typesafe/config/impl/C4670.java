package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.impl.SerializedConfigValue;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p025.AbstractC7012;
import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4670 implements InterfaceC8990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f12399;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final OriginType f12401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f12402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12404;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f12405;

    public C4670(String str, int i, int i2, OriginType originType, String str2, String str3, List list) {
        if (str == null) {
            C3775.m6968("description may not be null");
            throw null;
        }
        this.f12404 = str;
        this.f12403 = i;
        this.f12402 = i2;
        this.f12401 = originType;
        this.f12400 = str2;
        this.f12399 = str3;
        this.f12405 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8764(C4670 c4670, C4670 c46702) {
        int i = c4670.f12401 == c46702.f12401 ? 1 : 0;
        if (!c4670.f12404.equals(c46702.f12404)) {
            return i;
        }
        int i2 = i + 1;
        if (c4670.f12403 == c46702.f12403) {
            i2 = i + 2;
        }
        if (c4670.f12402 == c46702.f12402) {
            i2++;
        }
        if (AbstractC4696.m8808(c4670.f12400, c46702.f12400)) {
            i2++;
        }
        return AbstractC4696.m8808(c4670.f12399, c46702.f12399) ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4670 m8765(String str) {
        return new C4670(str, -1, -1, OriginType.GENERIC, null, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C4670 m8766(C4670 c4670, C4670 c46702) {
        int i;
        int iMax;
        List list;
        OriginType originType = c4670.f12401;
        String str = c4670.f12399;
        String str2 = c4670.f12400;
        List list2 = c4670.f12405;
        OriginType originType2 = c46702.f12401;
        List list3 = c46702.f12405;
        if (originType != originType2) {
            originType = OriginType.GENERIC;
        }
        OriginType originType3 = originType;
        String strM12140 = c4670.f12404;
        String strSubstring = c46702.f12404;
        if (strM12140.startsWith("merge of ")) {
            strM12140 = strM12140.substring(9);
        }
        if (strSubstring.startsWith("merge of ")) {
            strSubstring = strSubstring.substring(9);
        }
        if (strM12140.equals(strSubstring)) {
            int iMin = c4670.f12403;
            int i2 = c46702.f12403;
            if (iMin < 0) {
                iMin = i2;
            } else if (i2 >= 0) {
                iMin = Math.min(iMin, i2);
            }
            iMax = Math.max(c4670.f12402, c46702.f12402);
            i = iMin;
        } else {
            String strM8769 = c4670.m8769();
            String strM87692 = c46702.m8769();
            if (strM8769.startsWith("merge of ")) {
                strM8769 = strM8769.substring(9);
            }
            if (strM87692.startsWith("merge of ")) {
                strM87692 = strM87692.substring(9);
            }
            strM12140 = AbstractC7012.m12140("merge of ", strM8769, ",", strM87692);
            i = -1;
            iMax = -1;
        }
        String str3 = strM12140;
        String str4 = AbstractC4696.m8808(str2, c46702.f12400) ? str2 : null;
        String str5 = AbstractC4696.m8808(str, c46702.f12399) ? str : null;
        if (AbstractC4696.m8808(list2, list3)) {
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
        return new C4670(str3, i, iMax, originType3, str4, str5, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC8990 m8767(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C3775.m6968("can't merge empty list of origins");
            return null;
        }
        if (arrayList.size() == 1) {
            return (InterfaceC8990) arrayList.iterator().next();
        }
        if (arrayList.size() == 2) {
            Iterator it = arrayList.iterator();
            return m8766((C4670) it.next(), (C4670) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C4670) ((InterfaceC8990) it2.next()));
        }
        while (arrayList2.size() > 2) {
            C4670 c4670 = (C4670) AbstractC7012.m12145(1, arrayList2);
            arrayList2.remove(arrayList2.size() - 1);
            C4670 c46702 = (C4670) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            C4670 c46703 = (C4670) arrayList2.get(arrayList2.size() - 1);
            arrayList2.remove(arrayList2.size() - 1);
            arrayList2.add(m8764(c46703, c46702) >= m8764(c46702, c4670) ? m8766(m8766(c46703, c46702), c4670) : m8766(c46703, m8766(c46702, c4670)));
        }
        return m8767(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4670) {
            C4670 c4670 = (C4670) obj;
            if (this.f12404.equals(c4670.f12404) && this.f12403 == c4670.f12403 && this.f12402 == c4670.f12402 && this.f12401 == c4670.f12401 && AbstractC4696.m8808(this.f12400, c4670.f12400) && AbstractC4696.m8808(this.f12399, c4670.f12399)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12401.hashCode() + ((((AbstractC7012.m12131(41, 41, this.f12404) + this.f12403) * 41) + this.f12402) * 41)) * 41;
        String str = this.f12400;
        if (str != null) {
            iHashCode = AbstractC7012.m12131(iHashCode, 41, str);
        }
        String str2 = this.f12399;
        return str2 != null ? AbstractC7012.m12131(iHashCode, 41, str2) : iHashCode;
    }

    public final String toString() {
        return AbstractC0900.m711(new StringBuilder("ConfigOrigin("), this.f12404, ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final EnumMap m8768() {
        EnumMap enumMap = new EnumMap(SerializedConfigValue.SerializedField.class);
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION, this.f12404);
        int i = this.f12403;
        if (i >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER, Integer.valueOf(i));
        }
        int i2 = this.f12402;
        if (i2 >= 0) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER, Integer.valueOf(i2));
        }
        enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_TYPE, Integer.valueOf(this.f12401.ordinal()));
        String str = this.f12400;
        if (str != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_URL, str);
        }
        String str2 = this.f12399;
        if (str2 != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_RESOURCE, str2);
        }
        List list = this.f12405;
        if (list != null) {
            enumMap.put(SerializedConfigValue.SerializedField.ORIGIN_COMMENTS, list);
        }
        return enumMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8769() {
        String str = this.f12404;
        int i = this.f12403;
        if (i < 0) {
            return str;
        }
        int i2 = this.f12402;
        if (i2 == i) {
            return str + ": " + i;
        }
        return str + ": " + i + "-" + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4670 m8770(int i) {
        if (i == this.f12403 && i == this.f12402) {
            return this;
        }
        return new C4670(this.f12404, i, i, this.f12401, this.f12400, this.f12399, this.f12405);
    }
}
