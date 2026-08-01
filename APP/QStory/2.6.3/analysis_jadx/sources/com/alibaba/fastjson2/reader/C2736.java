package com.alibaba.fastjson2.reader;

import bsh.classpath.C2604;
import com.alibaba.fastjson2.AbstractC2899;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2736 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2736 f8359 = new C2736(Object.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8361 = 1;

    public C2736(C2604 c2604) {
        super(AtomicBoolean.class);
        this.f8360 = c2604;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        int i = this.f8361;
        Object obj2 = this.f8360;
        switch (i) {
            case 0:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return new AtomicReference(abstractC2899.mo6139((Type) obj2));
            case 1:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return ((C2604) obj2).apply(Boolean.valueOf(abstractC2899.mo6108()));
            default:
                String strMo6184 = abstractC2899.mo6184();
                if (strMo6184 == null) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6184);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        int i = this.f8361;
        Object obj2 = this.f8360;
        switch (i) {
            case 0:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return new AtomicReference(abstractC2899.mo6139((Type) obj2));
            case 1:
                if (abstractC2899.mo6133()) {
                    return null;
                }
                return ((C2604) obj2).apply(Boolean.valueOf(abstractC2899.mo6108()));
            default:
                String strMo6184 = abstractC2899.mo6184();
                if (strMo6184 == null || strMo6184.isEmpty()) {
                    return null;
                }
                return ((Function) obj2).apply(strMo6184);
        }
    }

    public C2736(Class cls, Function function) {
        super(cls);
        this.f8360 = function;
    }

    public C2736(Type type) {
        super(AtomicReference.class);
        this.f8360 = type;
    }
}
