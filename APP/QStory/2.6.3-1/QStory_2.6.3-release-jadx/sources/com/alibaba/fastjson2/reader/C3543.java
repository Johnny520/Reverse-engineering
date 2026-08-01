package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3758;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3543 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8584;

    public C3543(Class cls) {
        this.f8584 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        C3758 c3758;
        String strM6676 = abstractC3732.m6676();
        if (abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
            strM6676 = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, strM6676, abstractC3732.m6676());
        }
        char c = abstractC3732.f9538;
        if (c == '/' && abstractC3732.mo6694('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/')) {
            c = abstractC3732.f9538;
        }
        if (c != '(') {
            C1123.m1410(abstractC3732.mo6730("illegal jsonp input"));
            return null;
        }
        abstractC3732.mo6733();
        Class cls = this.f8584;
        if (cls == JSONObject.class) {
            c3758 = new C3758(strM6676);
        } else {
            try {
                c3758 = (C3758) cls.newInstance();
                c3758.f9613 = strM6676;
            } catch (IllegalAccessException | InstantiationException e) {
                C1123.m1403("create jsonp instance error", e);
                return null;
            }
        }
        while (!abstractC3732.mo6725()) {
            if (abstractC3732.mo6704(')')) {
                abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                abstractC3732.mo6694('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '/');
                return c3758;
            }
            c3758.f9612.add(abstractC3732.mo6684());
        }
        C1123.m1410(abstractC3732.mo6730("illegal jsonp input"));
        return null;
    }
}
