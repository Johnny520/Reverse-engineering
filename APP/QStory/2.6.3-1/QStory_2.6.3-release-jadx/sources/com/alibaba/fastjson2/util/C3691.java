package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import p307.InterfaceC9352;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3691 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f9304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f9305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9307;

    public C3691(Class cls) {
        String strM6503 = AbstractC3700.m6503(cls);
        this.f9307 = strM6503;
        this.f9306 = AbstractC3693.m6334(strM6503);
        try {
            this.f9305 = AbstractC9396.m14698(cls.getMethod("asMap", null));
        } catch (NoSuchMethodException e) {
            C1123.m1403("create Guava AsMapWriter error", e);
            throw null;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6618(obj, type, j)) {
            if (this.f9304 == null) {
                this.f9304 = InterfaceC3745.m6915(this.f9307);
            }
            abstractC3730.mo6603(this.f9306, this.f9304);
        }
        abstractC3730.mo6556((Map) this.f9305.apply(obj));
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        abstractC3730.mo6556((Map) this.f9305.apply(obj));
    }
}
