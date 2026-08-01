package com.alibaba.fastjson2.reader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import p278.C8364;
import p297.AbstractC8599;
import p297.C8598;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2761[] f8324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f8325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f8326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8598 f8327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8364 f8329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String f8330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C2771 f8331;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f8332;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f8333;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String f8334;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Constructor f8335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f8336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f8337;

    public C2731(C8364 c8364, Class cls, C8598 c8598, boolean z, AbstractC2761[] abstractC2761Arr, Constructor constructor) {
        this.f8329 = c8364;
        this.f8328 = cls;
        this.f8327 = c8598;
        this.f8326 = cls == null || Modifier.isPublic(cls.getModifiers());
        this.f8325 = z;
        this.f8324 = abstractC2761Arr;
        this.f8335 = constructor;
        this.f8330 = cls == null ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME : AbstractC8599.m14197(cls);
        boolean z2 = false;
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < abstractC2761Arr.length; i++) {
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            z2 = abstractC2761.f8427 == String.class ? true : z2;
            byte[] bytes = abstractC2761.f8426.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            int length2 = bytes.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                if (bytes[i2] <= 0) {
                    length = -1;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                iMin = length;
                iMax = iMin;
            } else {
                iMin = Math.min(length, iMin);
                iMax = Math.max(length, iMax);
            }
        }
        this.f8333 = z2;
        this.f8332 = iMin;
        this.f8336 = iMax;
        StringBuilder sb = new StringBuilder("ORG_");
        sb.append(C2730.f8318.incrementAndGet());
        sb.append(JavaConstant.Dynamic.DEFAULT_NAME);
        sb.append(abstractC2761Arr.length);
        sb.append(cls == null ? "" : JavaConstant.Dynamic.DEFAULT_NAME.concat(cls.getSimpleName()));
        String string = sb.toString();
        if (C2730.class.getPackage() == null) {
            this.f8337 = string;
            this.f8334 = string;
            return;
        }
        String str = C2730.f8309 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + string;
        this.f8334 = str;
        this.f8337 = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m5486() {
        return (this.f8329.f23101 & 288230376151711744L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5487() {
        return (this.f8329.f23101 & 1152921504606846976L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m5488() {
        return (this.f8329.f23101 & 576460752303423488L) != 0;
    }
}
