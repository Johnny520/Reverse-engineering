package kotlin.jvm.internal;

import io.ktor.util.C4210;
import java.util.List;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5096;
import kotlin.reflect.InterfaceC5099;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.InterfaceC5113;
import kotlin.reflect.KVariance;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4396 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5086 mo8925(InterfaceC5086 interfaceC5086) {
        C4390 c4390 = (C4390) interfaceC5086;
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        List listMo8908 = interfaceC5086.mo8908();
        c4390.getClass();
        return new C4390(interfaceC5091Mo8909, listMo8908, c4390.f12963 | 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC5090 mo8926(Class cls) {
        return new C4398(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC5092 mo8927(Class cls) {
        return new C4385(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC5086 mo8929(InterfaceC5091 interfaceC5091, List list, boolean z) {
        interfaceC5091.getClass();
        list.getClass();
        return new C4390(interfaceC5091, list, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo8930(AbstractC4393 abstractC4393, List list) {
        C4392 c4392 = (C4392) abstractC4393;
        c4392.getClass();
        list.getClass();
        if (c4392.f12966 == null) {
            c4392.f12966 = list;
        } else {
            C4210.m8629(c4392, "Upper bounds of type parameter '", "' have already been initialized.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public AbstractC4393 mo8931(InterfaceC5092 interfaceC5092, KVariance kVariance) {
        return new C4392(interfaceC5092, kVariance);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String mo8934(InterfaceC4382 interfaceC4382) {
        String string = interfaceC4382.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String mo8935(Lambda lambda) {
        return mo8934(lambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC5111 mo8923(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC5113 mo8924(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5109 mo8928(FunctionReference functionReference) {
        return functionReference;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5096 mo8932(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC5102 mo8933(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5101 mo8936(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC5099 mo8937(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
