package kotlin.jvm.internal;

import io.ktor.util.C5043;
import java.util.List;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.InterfaceC5932;
import kotlin.reflect.InterfaceC5934;
import kotlin.reflect.InterfaceC5935;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.InterfaceC5946;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5229 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5919 mo9474(InterfaceC5919 interfaceC5919) {
        C5223 c5223 = (C5223) interfaceC5919;
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        List listMo9457 = interfaceC5919.mo9457();
        c5223.getClass();
        return new C5223(interfaceC5924Mo9458, listMo9457, c5223.f13312 | 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC5923 mo9475(Class cls) {
        return new C5231(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC5925 mo9476(Class cls) {
        return new C5218(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC5919 mo9478(InterfaceC5924 interfaceC5924, List list, boolean z) {
        interfaceC5924.getClass();
        list.getClass();
        return new C5223(interfaceC5924, list, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo9479(AbstractC5226 abstractC5226, List list) {
        C5225 c5225 = (C5225) abstractC5226;
        c5225.getClass();
        list.getClass();
        if (c5225.f13315 == null) {
            c5225.f13315 = list;
        } else {
            C5043.m9178(c5225, "Upper bounds of type parameter '", "' have already been initialized.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC5226 mo9480(InterfaceC5925 interfaceC5925, KVariance kVariance) {
        return new C5225(interfaceC5925, kVariance);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String mo9483(InterfaceC5215 interfaceC5215) {
        String string = interfaceC5215.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String mo9484(Lambda lambda) {
        return mo9483(lambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC5944 mo9472(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC5946 mo9473(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5942 mo9477(FunctionReference functionReference) {
        return functionReference;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5929 mo9481(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC5935 mo9482(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5934 mo9485(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC5932 mo9486(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
