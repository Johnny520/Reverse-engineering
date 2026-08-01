package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2925;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2710 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8239;

    public C2710(Class cls) {
        this.f8239 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2925 c2925;
        String strM6116 = abstractC2899.m6116();
        if (abstractC2899.mo6144(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
            strM6116 = AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM6116, abstractC2899.m6116());
        }
        char c = abstractC2899.f9193;
        if (c == '/' && abstractC2899.mo6134('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/')) {
            c = abstractC2899.f9193;
        }
        if (c != '(') {
            C0276.m850(abstractC2899.mo6170("illegal jsonp input"));
            return null;
        }
        abstractC2899.mo6173();
        Class cls = this.f8239;
        if (cls == JSONObject.class) {
            c2925 = new C2925(strM6116);
        } else {
            try {
                c2925 = (C2925) cls.newInstance();
                c2925.f9268 = strM6116;
            } catch (IllegalAccessException | InstantiationException e) {
                C0276.m843("create jsonp instance error", e);
                return null;
            }
        }
        while (!abstractC2899.mo6165()) {
            if (abstractC2899.mo6144(')')) {
                abstractC2899.mo6144(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                abstractC2899.mo6134('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/');
                return c2925;
            }
            c2925.f9267.add(abstractC2899.mo6124());
        }
        C0276.m850(abstractC2899.mo6170("illegal jsonp input"));
        return null;
    }
}
