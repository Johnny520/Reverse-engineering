package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f13798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4724 f13799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4701 f13800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f13801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4701 f13802;

    public C4725(InterfaceC4701 interfaceC4701, Object obj, InterfaceC4701 interfaceC47012, C4724 c4724, Class cls) {
        if (interfaceC4701 == null) {
            C5925.m11310("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c4724.f13796 == WireFormat$FieldType.MESSAGE && interfaceC47012 == null) {
            C5925.m11310("Null messageDefaultInstance");
            throw null;
        }
        this.f13802 = interfaceC4701;
        this.f13801 = obj;
        this.f13800 = interfaceC47012;
        this.f13799 = c4724;
        if (InterfaceC4722.class.isAssignableFrom(cls)) {
            this.f13798 = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
        } else {
            this.f13798 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m9412(Object obj) {
        return this.f13799.f13796.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC4722) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m9413(Object obj) {
        if (this.f13799.f13796.getJavaType() != WireFormat$JavaType.ENUM) {
            return obj;
        }
        return GeneratedMessageLite.invokeOrDie(this.f13798, null, (Integer) obj);
    }
}
