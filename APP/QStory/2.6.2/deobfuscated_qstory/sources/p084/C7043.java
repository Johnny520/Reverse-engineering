package p084;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6526;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p079.AbstractC6976;
import p098.C7239;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7043 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7043 f18921 = new C7043();

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        AbstractC4881 type;
        InterfaceC4485 interfaceC4485 = (InterfaceC4485) obj;
        Map map = AbstractC7042.f18920;
        interfaceC4485.getClass();
        InterfaceC4480 interfaceC4480M12025 = AbstractC6560.m12025(AbstractC7044.f18924, interfaceC4485.mo9071().m11996(AbstractC6526.f17890));
        return (interfaceC4480M12025 == null || (type = ((AbstractC6976) interfaceC4480M12025).getType()) == null) ? C7239.m12443(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
