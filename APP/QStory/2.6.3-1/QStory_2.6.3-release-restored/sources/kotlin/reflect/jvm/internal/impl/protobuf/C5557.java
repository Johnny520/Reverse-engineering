package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f14143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5556 f14144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5533 f14145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f14146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5533 f14147;

    public C5557(InterfaceC5533 interfaceC5533, Object obj, InterfaceC5533 interfaceC55332, C5556 c5556, Class cls) {
        if (interfaceC5533 == null) {
            C6755.m11869("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c5556.f14141 == WireFormat$FieldType.MESSAGE && interfaceC55332 == null) {
            C6755.m11869("Null messageDefaultInstance");
            throw null;
        }
        this.f14147 = interfaceC5533;
        this.f14146 = obj;
        this.f14145 = interfaceC55332;
        this.f14144 = c5556;
        if (InterfaceC5554.class.isAssignableFrom(cls)) {
            this.f14143 = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
        } else {
            this.f14143 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m9971(Object obj) {
        return this.f14144.f14141.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC5554) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m9972(Object obj) {
        if (this.f14144.f14141.getJavaType() != WireFormat$JavaType.ENUM) {
            return obj;
        }
        return GeneratedMessageLite.invokeOrDie(this.f14143, null, (Integer) obj);
    }
}
