package com.alibaba.fastjson2.reader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import p294.C9194;
import p313.AbstractC9420;
import p313.C9419;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3595[] f8671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f8672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f8673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9419 f8674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9194 f8676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final String f8677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C3605 f8678;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f8679;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f8680;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String f8681;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Constructor f8682;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f8683;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f8684;

    public C3565(C9194 c9194, Class cls, C9419 c9419, boolean z, AbstractC3595[] abstractC3595Arr, Constructor constructor) {
        this.f8676 = c9194;
        this.f8675 = cls;
        this.f8674 = c9419;
        this.f8673 = cls == null || Modifier.isPublic(cls.getModifiers());
        this.f8672 = z;
        this.f8671 = abstractC3595Arr;
        this.f8682 = constructor;
        this.f8677 = cls == null ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME : AbstractC9420.m14775(cls);
        boolean z2 = false;
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < abstractC3595Arr.length; i++) {
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            z2 = abstractC3595.f8774 == String.class ? true : z2;
            byte[] bytes = abstractC3595.f8773.getBytes(StandardCharsets.UTF_8);
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
        this.f8680 = z2;
        this.f8679 = iMin;
        this.f8683 = iMax;
        StringBuilder sb = new StringBuilder("ORG_");
        sb.append(C3564.f8665.incrementAndGet());
        sb.append(JavaConstant.Dynamic.DEFAULT_NAME);
        sb.append(abstractC3595Arr.length);
        sb.append(cls == null ? "" : JavaConstant.Dynamic.DEFAULT_NAME.concat(cls.getSimpleName()));
        String string = sb.toString();
        if (C3564.class.getPackage() == null) {
            this.f8684 = string;
            this.f8681 = string;
            return;
        }
        String str = C3564.f8656 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + string;
        this.f8681 = str;
        this.f8684 = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m6091() {
        return (this.f8676.f23445 & 288230376151711744L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m6092() {
        return (this.f8676.f23445 & 1152921504606846976L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m6093() {
        return (this.f8676.f23445 & 576460752303423488L) != 0;
    }
}
