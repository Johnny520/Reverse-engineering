package org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15619 = new char[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object[] f15618 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f15617 = new String[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type[] f15616 = new Type[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m11052(Object obj) {
        return m11053(obj) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11053(Object obj) {
        if (obj != null) {
            return Array.getLength(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m11054(Object obj, Object[] objArr) {
        int iMax;
        if (objArr == null) {
            iMax = -1;
        } else {
            iMax = Math.max(0, 0);
            if (obj == null) {
                while (iMax < objArr.length) {
                    if (objArr[iMax] == null) {
                        break;
                    }
                    iMax++;
                }
                iMax = -1;
            } else {
                while (iMax < objArr.length) {
                    if (obj.equals(objArr[iMax])) {
                        break;
                    }
                    iMax++;
                }
                iMax = -1;
            }
        }
        return iMax != -1;
    }
}
