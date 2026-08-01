package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f13794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4723 f13795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4700 f13796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f13797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4700 f13798;

    public C4724(InterfaceC4700 interfaceC4700, Object obj, InterfaceC4700 interfaceC47002, C4723 c4723, Class cls) {
        if (interfaceC4700 == null) {
            C5919.m11249("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c4723.f13792 == WireFormat$FieldType.MESSAGE && interfaceC47002 == null) {
            C5919.m11249("Null messageDefaultInstance");
            throw null;
        }
        this.f13798 = interfaceC4700;
        this.f13797 = obj;
        this.f13796 = interfaceC47002;
        this.f13795 = c4723;
        if (InterfaceC4721.class.isAssignableFrom(cls)) {
            this.f13794 = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
        } else {
            this.f13794 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m9422(Object obj) {
        return this.f13795.f13792.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC4721) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m9423(Object obj) {
        if (this.f13795.f13792.getJavaType() != WireFormat$JavaType.ENUM) {
            return obj;
        }
        return GeneratedMessageLite.invokeOrDie(this.f13794, null, (Integer) obj);
    }
}
