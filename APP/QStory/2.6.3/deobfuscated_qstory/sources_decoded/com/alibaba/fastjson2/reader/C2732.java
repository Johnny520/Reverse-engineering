package com.alibaba.fastjson2.reader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import p278.C8365;
import p297.AbstractC8591;
import p297.C8590;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2762[] f8326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f8327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f8328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8590 f8329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8365 f8331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String f8332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C2772 f8333;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f8334;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f8335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String f8336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Constructor f8337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f8338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f8339;

    public C2732(C8365 c8365, Class cls, C8590 c8590, boolean z, AbstractC2762[] abstractC2762Arr, Constructor constructor) {
        this.f8331 = c8365;
        this.f8330 = cls;
        this.f8329 = c8590;
        this.f8328 = cls == null || Modifier.isPublic(cls.getModifiers());
        this.f8327 = z;
        this.f8326 = abstractC2762Arr;
        this.f8337 = constructor;
        this.f8332 = cls == null ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME : AbstractC8591.m14216(cls);
        boolean z2 = false;
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < abstractC2762Arr.length; i++) {
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            z2 = abstractC2762.f8429 == String.class ? true : z2;
            byte[] bytes = abstractC2762.f8428.getBytes(StandardCharsets.UTF_8);
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
        this.f8335 = z2;
        this.f8334 = iMin;
        this.f8338 = iMax;
        StringBuilder sb = new StringBuilder("ORG_");
        sb.append(C2731.f8320.incrementAndGet());
        sb.append(JavaConstant.Dynamic.DEFAULT_NAME);
        sb.append(abstractC2762Arr.length);
        sb.append(cls == null ? "" : JavaConstant.Dynamic.DEFAULT_NAME.concat(cls.getSimpleName()));
        String string = sb.toString();
        if (C2731.class.getPackage() == null) {
            this.f8339 = string;
            this.f8336 = string;
            return;
        }
        String str = C2731.f8311 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + string;
        this.f8336 = str;
        this.f8339 = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m5531() {
        return (this.f8331.f23100 & 288230376151711744L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5532() {
        return (this.f8331.f23100 & 1152921504606846976L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m5533() {
        return (this.f8331.f23100 & 576460752303423488L) != 0;
    }
}
