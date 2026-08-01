package p100;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p065.AbstractC7356;
import p068.InterfaceC7387;
import p095.AbstractC7806;
import p114.C8069;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7873 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7873 f19261 = new C7873();

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        AbstractC5714 type;
        InterfaceC5318 interfaceC5318 = (InterfaceC5318) obj;
        Map map = AbstractC7872.f19260;
        interfaceC5318.getClass();
        InterfaceC5313 interfaceC5313M6873 = AbstractC3738.m6873(AbstractC7874.f19264, interfaceC5318.mo9620().m12598(AbstractC7356.f18231));
        return (interfaceC5313M6873 == null || (type = ((AbstractC7806) interfaceC5313M6873).getType()) == null) ? C8069.m13029(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
