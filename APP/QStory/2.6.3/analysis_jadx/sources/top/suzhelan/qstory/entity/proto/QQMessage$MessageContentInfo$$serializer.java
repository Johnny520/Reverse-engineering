package top.suzhelan.qstory.entity.proto;

import kotlin.InterfaceC5169;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p087.AbstractC7137;
import p087.AbstractC7144;
import p087.C7072;
import p087.C7083;
import p087.C7129;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;
import p287.AbstractC8405;
import top.suzhelan.qstory.entity.proto.QQMessage;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"top/suzhelan/qstory/entity/proto/QQMessage.MessageContentInfo.$serializer", "L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;", "encoder", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "serialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;)V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;", "decoder", "deserialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "childSerializers", "()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "descriptor", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "getDescriptor", "()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
@InterfaceC5169
public final /* synthetic */ class QQMessage$MessageContentInfo$$serializer implements InterfaceC7079 {
    public static final int $stable;
    public static final QQMessage$MessageContentInfo$$serializer INSTANCE;
    private static final InterfaceC7191 descriptor;

    static {
        QQMessage$MessageContentInfo$$serializer qQMessage$MessageContentInfo$$serializer = new QQMessage$MessageContentInfo$$serializer();
        INSTANCE = qQMessage$MessageContentInfo$$serializer;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1529), qQMessage$MessageContentInfo$$serializer, 5);
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"), true);
        c7129.m12408(new QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(1));
        c7129.m12409(AbstractC8405.m13972(1452), true);
        c7129.m12408(new QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(2));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), true);
        c7129.m12408(new QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(3));
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), true);
        c7129.m12408(new QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(5));
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), true);
        c7129.m12408(new QQMessage$MessageHead$SenderInfo$$serializer$annotationImpl$kotlinx_serialization_protobuf_ProtoNumber$0(6));
        descriptor = c7129;
        $stable = 8;
    }

    private QQMessage$MessageContentInfo$$serializer() {
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7083 c7083 = C7083.f18997;
        return new InterfaceC7184[]{c7083, c7083, c7083, c7083, C7072.f18976};
    }

    @Override // p089.InterfaceC7184
    public final QQMessage.MessageContentInfo deserialize(InterfaceC7187 decoder) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        decoder.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = decoder.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        int i = 0;
        int iMo10671 = 0;
        int iMo106712 = 0;
        int iMo106713 = 0;
        int iMo106714 = 0;
        long jMo10699 = 0;
        boolean z = true;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                iMo106712 = interfaceC7189Mo10676.mo10671(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                iMo106713 = interfaceC7189Mo10676.mo10671(interfaceC7191, 2);
                i |= 4;
            } else if (iMo10718 == 3) {
                iMo106714 = interfaceC7189Mo10676.mo10671(interfaceC7191, 3);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                jMo10699 = interfaceC7189Mo10676.mo10699(interfaceC7191, 4);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new QQMessage.MessageContentInfo(i, iMo10671, iMo106712, iMo106713, iMo106714, jMo10699, (AbstractC7137) null);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 encoder, QQMessage.MessageContentInfo value) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        encoder.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        value.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = encoder.mo10710(interfaceC7191);
        QQMessage.MessageContentInfo.write$Self$app_publishRelease(value, interfaceC7188Mo10710, interfaceC7191);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public /* bridge */ InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
