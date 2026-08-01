package com.alibaba.fastjson2.reader;

import bsh.classpath.C2603;
import com.alibaba.fastjson2.AbstractC2898;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2735 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2735 f8357 = new C2735(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8359 = 1;

    public C2735(C2603 c2603) {
        super(AtomicBoolean.class);
        this.f8358 = c2603;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        int i = this.f8359;
        Object obj2 = this.f8358;
        switch (i) {
            case 0:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return new AtomicReference(abstractC2898.mo6093((Type) obj2));
            case 1:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return ((C2603) obj2).apply(Boolean.valueOf(abstractC2898.mo6062()));
            default:
                String strMo6139 = abstractC2898.mo6139();
                if (strMo6139 == null) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6139);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        int i = this.f8359;
        Object obj2 = this.f8358;
        switch (i) {
            case 0:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return new AtomicReference(abstractC2898.mo6093((Type) obj2));
            case 1:
                if (abstractC2898.mo6087()) {
                    return null;
                }
                return ((C2603) obj2).apply(Boolean.valueOf(abstractC2898.mo6062()));
            default:
                String strMo6139 = abstractC2898.mo6139();
                if (strMo6139 == null || strMo6139.isEmpty()) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6139);
        }
    }

    public C2735(Class cls, Function function) {
        super(cls);
        this.f8358 = function;
    }

    public C2735(Type type) {
        super(AtomicReference.class);
        this.f8358 = type;
    }
}
