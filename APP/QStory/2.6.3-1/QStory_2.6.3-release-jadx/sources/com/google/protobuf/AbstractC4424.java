package com.google.protobuf;

import androidx.activity.AbstractC0900;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToIntFunction;
import java.util.logging.Logger;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Logger f11564 = Logger.getLogger(AbstractC4424.class.getName());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int[] f11563 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4495[] f11562 = new C4495[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4489[] f11561 = new C4489[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4498[] f11560 = new C4498[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4425[] f11559 = new C4425[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4426[] f11566 = new C4426[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f11565 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static volatile DescriptorProtos$FeatureSetDefaults f11567 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m8356(C4488 c4488, C4495 c4495, String str) {
        if (c4495 == null) {
            String str2 = c4488.f11684.getPackage();
            return !str2.isEmpty() ? AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str2, str) : str;
        }
        return c4495.f11718 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m8357(Object[] objArr, int i, ToIntFunction toIntFunction, int i2) {
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
