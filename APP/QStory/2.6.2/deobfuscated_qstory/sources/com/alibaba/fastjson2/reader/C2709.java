package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2924;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2709 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8237;

    public C2709(Class cls) {
        this.f8237 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        C2924 c2924;
        String strM6070 = abstractC2898.m6070();
        if (abstractC2898.mo6098(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
            strM6070 = AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM6070, abstractC2898.m6070());
        }
        char c = abstractC2898.f9191;
        if (c == '/' && abstractC2898.mo6088('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/')) {
            c = abstractC2898.f9191;
        }
        if (c != '(') {
            C0276.m849(abstractC2898.mo6124("illegal jsonp input"));
            return null;
        }
        abstractC2898.mo6127();
        Class cls = this.f8237;
        if (cls == JSONObject.class) {
            c2924 = new C2924(strM6070);
        } else {
            try {
                c2924 = (C2924) cls.newInstance();
                c2924.f9266 = strM6070;
            } catch (IllegalAccessException | InstantiationException e) {
                C0276.m842("create jsonp instance error", e);
                return null;
            }
        }
        while (!abstractC2898.mo6119()) {
            if (abstractC2898.mo6098(')')) {
                abstractC2898.mo6098(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                abstractC2898.mo6088('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/');
                return c2924;
            }
            c2924.f9265.add(abstractC2898.mo6078());
        }
        C0276.m849(abstractC2898.mo6124("illegal jsonp input"));
        return null;
    }
}
