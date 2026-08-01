package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3539 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3539 f8569 = new C3539(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f8572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8573;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC3621 f8574;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3539(Type type, String str, Locale locale) {
        Type type2;
        super(Optional.class);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            type2 = actualTypeArguments.length == 1 ? actualTypeArguments[0] : null;
        }
        this.f8571 = type2;
        this.f8570 = AbstractC3700.m6504(type2);
        this.f8573 = str;
        this.f8572 = locale;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6023;
        Type type2 = this.f8571;
        if (type2 == null) {
            objMo6023 = abstractC3732.mo6684();
        } else {
            if (this.f8574 == null) {
                String str = this.f8573;
                InterfaceC3621 interfaceC3621M6131 = str != null ? AbstractC3595.m6131(type2, this.f8570, str, this.f8572) : null;
                if (interfaceC3621M6131 == null) {
                    this.f8574 = abstractC3732.m6662(type2);
                } else {
                    this.f8574 = interfaceC3621M6131;
                }
            }
            objMo6023 = this.f8574.mo6023(abstractC3732, this.f8571, obj, 0L);
        }
        return objMo6023 == null ? Optional.empty() : Optional.of(objMo6023);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6027;
        Type type2 = this.f8571;
        if (type2 == null) {
            objMo6027 = abstractC3732.mo6684();
        } else {
            if (this.f8574 == null) {
                String str = this.f8573;
                InterfaceC3621 interfaceC3621M6131 = str != null ? AbstractC3595.m6131(type2, this.f8570, str, this.f8572) : null;
                if (interfaceC3621M6131 == null) {
                    this.f8574 = abstractC3732.m6662(type2);
                } else {
                    this.f8574 = interfaceC3621M6131;
                }
            }
            objMo6027 = this.f8574.mo6027(abstractC3732, this.f8571, obj, 0L);
        }
        return objMo6027 == null ? Optional.empty() : Optional.of(objMo6027);
    }
}
