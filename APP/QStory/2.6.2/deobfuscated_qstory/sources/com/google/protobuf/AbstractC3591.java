package com.google.protobuf;

import androidx.activity.AbstractC0053;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToIntFunction;
import java.util.logging.Logger;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Logger f11214 = Logger.getLogger(AbstractC3591.class.getName());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int[] f11213 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3662[] f11212 = new C3662[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3656[] f11211 = new C3656[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3665[] f11210 = new C3665[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3592[] f11209 = new C3592[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3593[] f11216 = new C3593[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f11215 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static volatile DescriptorProtos$FeatureSetDefaults f11217 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m7810(C3655 c3655, C3662 c3662, String str) {
        if (c3662 == null) {
            String str2 = c3655.f11334.getPackage();
            return !str2.isEmpty() ? AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str2, str) : str;
        }
        return c3662.f11368 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m7811(Object[] objArr, int i, ToIntFunction toIntFunction, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            Object obj = objArr[i5];
            int iApplyAsInt = toIntFunction.applyAsInt(obj);
            if (i2 < iApplyAsInt) {
                i3 = i5 - 1;
            } else {
                if (i2 <= iApplyAsInt) {
                    return obj;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }
}
