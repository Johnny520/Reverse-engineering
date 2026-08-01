package top.suzhelan.qstory.entity.proto;

import com.bumptech.glide.AbstractC3056;
import kotlin.InterfaceC5168;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p087.AbstractC7136;
import p087.AbstractC7143;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import top.suzhelan.qstory.entity.proto.QQMessage;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"top/suzhelan/qstory/entity/proto/QQMessage.MessageBody.RichMsg.MsgContent.MsgSender.$serializer", "L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;", "encoder", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "serialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;)V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;", "decoder", "deserialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "childSerializers", "()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "descriptor", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "getDescriptor", "()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
@InterfaceC5168
public final /* synthetic */ class QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer implements InterfaceC7078 {
    public static final int $stable;
    public static final QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer INSTANCE;
    private static final InterfaceC7190 descriptor;

    static {
        QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer qQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer = new QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer();
        INSTANCE = qQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer;
        C7128 c7128 = new C7128("top.suzhelan.qstory.entity.proto.QQMessage.MessageBody.RichMsg.MsgContent.MsgSender", qQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer, 1);
        AbstractC6136.m11545(-3937710782532552103L, c7128, true, 1);
        descriptor = c7128;
        $stable = 8;
    }

    private QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer() {
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7134.f19094};
    }

    @Override // p089.InterfaceC7183
    public final QQMessage.MessageBody.RichMsg.MsgContent.MsgSender deserialize(InterfaceC7186 decoder) {
        "decoder";
        decoder.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = decoder.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else {
                if (iMo10672 != 0) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i = 1;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new QQMessage.MessageBody.RichMsg.MsgContent.MsgSender(i, strMo6878, (AbstractC7136) null);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 encoder, QQMessage.MessageBody.RichMsg.MsgContent.MsgSender value) {
        AbstractC6136.m11535(-3937686069290730919L, encoder, -3937685966211515815L);
        value.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = encoder.mo6800(interfaceC7190);
        QQMessage.MessageBody.RichMsg.MsgContent.MsgSender.write$Self$app_publishRelease(value, interfaceC7187Mo6800, interfaceC7190);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public /* bridge */ InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
