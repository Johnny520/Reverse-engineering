package top.suzhelan.qstory.entity.proto;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p047.InterfaceC7155;
import p103.AbstractC7966;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p105.InterfaceC8013;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
@Metadata(m150d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, m151d2 = {"Ltop/suzhelan/qstory/entity/proto/MsgPush;", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage;", "qqMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/QQMessage;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/QQMessage;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/MsgPush;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/QQMessage;", "copy", "(Ltop/suzhelan/qstory/entity/proto/QQMessage;)Ltop/suzhelan/qstory/entity/proto/MsgPush;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/QQMessage;", "getQqMessage", "getQqMessage$annotations", "()V", "Companion", "$serializer", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final /* data */ class MsgPush {
    private final QQMessage qqMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MsgPush(int i, QQMessage qQMessage, AbstractC7966 abstractC7966) {
        if (1 == (i & 1)) {
            this.qqMessage = qQMessage;
        } else {
            AbstractC7973.m12979(i, 1, MsgPush$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ MsgPush copy$default(MsgPush msgPush, QQMessage qQMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            qQMessage = msgPush.qqMessage;
        }
        return msgPush.copy(qQMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QQMessage getQqMessage() {
        return this.qqMessage;
    }

    public final MsgPush copy(QQMessage qqMessage) {
        "qqMessage";
        qqMessage.getClass();
        return new MsgPush(qqMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MsgPush) && AbstractC5227.m9466(this.qqMessage, ((MsgPush) other).qqMessage);
    }

    public final QQMessage getQqMessage() {
        return this.qqMessage;
    }

    public int hashCode() {
        return this.qqMessage.hashCode();
    }

    public String toString() {
        return "MsgPush(qqMessage=" + this.qqMessage + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m151d2 = {"Ltop/suzhelan/qstory/entity/proto/MsgPush$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/MsgPush;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5217 abstractC5217) {
            this();
        }

        public final InterfaceC8013 serializer() {
            return MsgPush$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC7155(number = 1)
    public static /* synthetic */ void getQqMessage$annotations() {
    }

    public MsgPush(QQMessage qQMessage) {
        "qqMessage";
        qQMessage.getClass();
        this.qqMessage = qQMessage;
    }
}
