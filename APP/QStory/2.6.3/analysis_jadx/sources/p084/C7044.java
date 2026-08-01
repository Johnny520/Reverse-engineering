package p084;

import com.alibaba.fastjson2.AbstractC2905;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6527;
import p052.InterfaceC6558;
import p079.AbstractC6977;
import p098.C7240;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7044 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7044 f18916 = new C7044();

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        AbstractC4882 type;
        InterfaceC4486 interfaceC4486 = (InterfaceC4486) obj;
        Map map = AbstractC7043.f18915;
        interfaceC4486.getClass();
        InterfaceC4481 interfaceC4481M6313 = AbstractC2905.m6313(AbstractC7045.f18919, interfaceC4486.mo9061().m12039(AbstractC6527.f17886));
        return (interfaceC4481M6313 == null || (type = ((AbstractC6977) interfaceC4481M6313).getType()) == null) ? C7240.m12470(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
