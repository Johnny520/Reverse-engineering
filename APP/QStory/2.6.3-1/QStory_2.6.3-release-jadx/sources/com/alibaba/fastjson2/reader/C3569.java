package com.alibaba.fastjson2.reader;

import bsh.classpath.C3437;
import com.alibaba.fastjson2.AbstractC3732;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3569 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3569 f8704 = new C3569(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8706 = 1;

    public C3569(C3437 c3437) {
        super(AtomicBoolean.class);
        this.f8705 = c3437;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        int i = this.f8706;
        Object obj2 = this.f8705;
        switch (i) {
            case 0:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return new AtomicReference(abstractC3732.mo6699((Type) obj2));
            case 1:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return ((C3437) obj2).apply(Boolean.valueOf(abstractC3732.mo6668()));
            default:
                String strMo6744 = abstractC3732.mo6744();
                if (strMo6744 == null) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6744);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        int i = this.f8706;
        Object obj2 = this.f8705;
        switch (i) {
            case 0:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return new AtomicReference(abstractC3732.mo6699((Type) obj2));
            case 1:
                if (abstractC3732.mo6693()) {
                    return null;
                }
                return ((C3437) obj2).apply(Boolean.valueOf(abstractC3732.mo6668()));
            default:
                String strMo6744 = abstractC3732.mo6744();
                if (strMo6744 == null || strMo6744.isEmpty()) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6744);
        }
    }

    public C3569(Class cls, Function function) {
        super(cls);
        this.f8705 = function;
    }

    public C3569(Type type) {
        super(AtomicReference.class);
        this.f8705 = type;
    }
}
