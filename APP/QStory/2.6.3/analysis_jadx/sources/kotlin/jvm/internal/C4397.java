package kotlin.jvm.internal;

import io.ktor.util.C4211;
import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5103;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.InterfaceC5114;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4397 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5087 mo8915(InterfaceC5087 interfaceC5087) {
        C4391 c4391 = (C4391) interfaceC5087;
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        List listMo8898 = interfaceC5087.mo8898();
        c4391.getClass();
        return new C4391(interfaceC5092Mo8899, listMo8898, c4391.f12967 | 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC5091 mo8916(Class cls) {
        return new C4399(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC5093 mo8917(Class cls) {
        return new C4386(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC5087 mo8919(InterfaceC5092 interfaceC5092, List list, boolean z) {
        interfaceC5092.getClass();
        list.getClass();
        return new C4391(interfaceC5092, list, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo8920(AbstractC4394 abstractC4394, List list) {
        C4393 c4393 = (C4393) abstractC4394;
        c4393.getClass();
        list.getClass();
        if (c4393.f12970 == null) {
            c4393.f12970 = list;
        } else {
            C4211.m8619(c4393, "Upper bounds of type parameter '", "' have already been initialized.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC4394 mo8921(InterfaceC5093 interfaceC5093, KVariance kVariance) {
        return new C4393(interfaceC5093, kVariance);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String mo8924(InterfaceC4383 interfaceC4383) {
        String string = interfaceC4383.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String mo8925(Lambda lambda) {
        return mo8924(lambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC5112 mo8913(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC5114 mo8914(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5110 mo8918(FunctionReference functionReference) {
        return functionReference;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5097 mo8922(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC5103 mo8923(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5102 mo8926(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC5100 mo8927(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
