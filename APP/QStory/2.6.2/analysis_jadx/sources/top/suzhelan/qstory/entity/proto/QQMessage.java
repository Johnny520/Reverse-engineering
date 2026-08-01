package top.suzhelan.qstory.entity.proto;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p030.InterfaceC6307;
import p087.AbstractC7136;
import p087.C7102;
import p087.C7117;
import p087.C7134;
import p089.InterfaceC7180;
import p089.InterfaceC7183;
import p090.InterfaceC7187;
import p091.InterfaceC7190;
import p332.C8801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000545673B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001d¨\u00068"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage;", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "messageHead", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "messageContentInfo", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "messageBody", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "component2", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "component3", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "copy", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;)Ltop/suzhelan/qstory/entity/proto/QQMessage;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "getMessageHead", "getMessageHead$annotations", "()V", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "getMessageContentInfo", "getMessageContentInfo$annotations", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "getMessageBody", "getMessageBody$annotations", "Companion", "MessageHead", "MessageContentInfo", "MessageBody", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final /* data */ class QQMessage {
    private final MessageBody messageBody;
    private final MessageContentInfo messageContentInfo;
    private final MessageHead messageHead;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @InterfaceC7180
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0005-./0,B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u00061"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "richMsg", "", "operationInfo", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;[B)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;[BL飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "component2", "()[B", "copy", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;[B)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "getRichMsg", "getRichMsg$annotations", "()V", "[B", "getOperationInfo", "getOperationInfo$annotations", "Companion", "RichMsg", "GroupRecallOperationInfo", "C2CRecallOperationInfo", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final /* data */ class MessageBody {
        private final byte[] operationInfo;
        private final RichMsg richMsg;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0003231B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001c¨\u00064"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo;", "", "", "peerId", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "info", "", "msgSeq", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;I)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJLtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;IL飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "component2", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "component3", "()I", "copy", "(JLtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;I)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPeerId", "getPeerId$annotations", "()V", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "getInfo", "getInfo$annotations", "I", "getMsgSeq", "getMsgSeq$annotations", "Companion", "Info", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class GroupRecallOperationInfo {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Info info;
            private final int msgSeq;
            private final long peerId;

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ GroupRecallOperationInfo(int i, long j, Info info, int i2, AbstractC7136 abstractC7136) {
                this.peerId = (i & 1) == 0 ? 0L : j;
                if ((i & 2) == 0) {
                    this.info = new Info((String) null, (Info.MsgInfo) (0 == true ? 1 : 0), 3, (AbstractC4384) (0 == true ? 1 : 0));
                } else {
                    this.info = info;
                }
                if ((i & 4) == 0) {
                    this.msgSeq = 0;
                } else {
                    this.msgSeq = i2;
                }
            }

            public static /* synthetic */ GroupRecallOperationInfo copy$default(GroupRecallOperationInfo groupRecallOperationInfo, long j, Info info, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = groupRecallOperationInfo.peerId;
                }
                if ((i2 & 2) != 0) {
                    info = groupRecallOperationInfo.info;
                }
                if ((i2 & 4) != 0) {
                    i = groupRecallOperationInfo.msgSeq;
                }
                return groupRecallOperationInfo.copy(j, info, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void write$Self$app_publishRelease(top.suzhelan.qstory.entity.proto.QQMessage.MessageBody.GroupRecallOperationInfo r4, p090.InterfaceC7187 r5, p091.InterfaceC7190 r6) {
                /*
                    boolean r0 = r5.mo10671(r6)
                    if (r0 == 0) goto L7
                    goto Lf
                L7:
                    long r0 = r4.peerId
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 == 0) goto L15
                Lf:
                    long r0 = r4.peerId
                    r2 = 0
                    r5.mo6796(r6, r2, r0)
                L15:
                    boolean r0 = r5.mo10671(r6)
                    if (r0 == 0) goto L1c
                    goto L2b
                L1c:
                    top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info r0 = r4.info
                    top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info r1 = new top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info
                    r2 = 3
                    r3 = 0
                    r1.<init>(r3, r3, r2, r3)
                    boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
                    if (r0 != 0) goto L33
                L2b:
                    top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info$$serializer r0 = top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info$$serializer.INSTANCE
                    top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo$Info r1 = r4.info
                    r2 = 1
                    r5.mo6791(r6, r2, r0, r1)
                L33:
                    boolean r0 = r5.mo10671(r6)
                    if (r0 == 0) goto L3a
                    goto L3e
                L3a:
                    int r0 = r4.msgSeq
                    if (r0 == 0) goto L44
                L3e:
                    int r4 = r4.msgSeq
                    r0 = 2
                    r5.mo6805(r0, r4, r6)
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.entity.proto.QQMessage.MessageBody.GroupRecallOperationInfo.write$Self$app_publishRelease(top.suzhelan.qstory.entity.proto.QQMessage$MessageBody$GroupRecallOperationInfo, 飘花落叶言世苏兰楪哲子.飘花落叶言子楪世苏兰哲, 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲):void");
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getPeerId() {
                return this.peerId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Info getInfo() {
                return this.info;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getMsgSeq() {
                return this.msgSeq;
            }

            public final GroupRecallOperationInfo copy(long peerId, Info info, int msgSeq) {
                AbstractC3056.m6668(-3937696381507208615L);
                info.getClass();
                return new GroupRecallOperationInfo(peerId, info, msgSeq);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GroupRecallOperationInfo)) {
                    return false;
                }
                GroupRecallOperationInfo groupRecallOperationInfo = (GroupRecallOperationInfo) other;
                return this.peerId == groupRecallOperationInfo.peerId && AbstractC4394.m8917(this.info, groupRecallOperationInfo.info) && this.msgSeq == groupRecallOperationInfo.msgSeq;
            }

            public final Info getInfo() {
                return this.info;
            }

            public final int getMsgSeq() {
                return this.msgSeq;
            }

            public final long getPeerId() {
                return this.peerId;
            }

            public int hashCode() {
                return Integer.hashCode(this.msgSeq) + ((this.info.hashCode() + (Long.hashCode(this.peerId) * 31)) * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC3056.m6668(-3937694255498397095L));
                AbstractC6136.m11532(sb, this.peerId, -3937711714540455335L);
                sb.append(this.info);
                sb.append(AbstractC3056.m6668(-3937685549599688103L));
                return AbstractC0053.m154(sb, this.msgSeq, ')');
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @InterfaceC7180
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003+,*B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "", "", "operatorUid", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "msgInfo", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "copy", "(Ljava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOperatorUid", "getOperatorUid$annotations", "()V", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "getMsgInfo", "getMsgInfo$annotations", "Companion", "MsgInfo", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final /* data */ class Info {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final MsgInfo msgInfo;
                private final String operatorUid;

                public /* synthetic */ Info(int i, String str, MsgInfo msgInfo, AbstractC7136 abstractC7136) {
                    this.operatorUid = (i & 1) == 0 ? AbstractC3056.m6668(-3937561979095614887L) : str;
                    if ((i & 2) == 0) {
                        this.msgInfo = new MsgInfo(0, 0L, (String) null, 7, (AbstractC4384) null);
                    } else {
                        this.msgInfo = msgInfo;
                    }
                }

                public static /* synthetic */ Info copy$default(Info info, String str, MsgInfo msgInfo, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = info.operatorUid;
                    }
                    if ((i & 2) != 0) {
                        msgInfo = info.msgInfo;
                    }
                    return info.copy(str, msgInfo);
                }

                public static final /* synthetic */ void write$Self$app_publishRelease(Info self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                    if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.operatorUid, AbstractC3056.m6668(-3937561979095614887L))) {
                        output.mo6814(serialDesc, 0, self.operatorUid);
                    }
                    if (!output.mo10671(serialDesc)) {
                        if (AbstractC4394.m8917(self.msgInfo, new MsgInfo(0, 0L, (String) null, 7, (AbstractC4384) null))) {
                            return;
                        }
                    }
                    output.mo6791(serialDesc, 1, QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo$$serializer.INSTANCE, self.msgInfo);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getOperatorUid() {
                    return this.operatorUid;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final MsgInfo getMsgInfo() {
                    return this.msgInfo;
                }

                public final Info copy(String operatorUid, MsgInfo msgInfo) {
                    AbstractC6136.m11546(-3937702875497760167L, -3937694882563622311L, operatorUid);
                    msgInfo.getClass();
                    return new Info(operatorUid, msgInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Info)) {
                        return false;
                    }
                    Info info = (Info) other;
                    return AbstractC4394.m8917(this.operatorUid, info.operatorUid) && AbstractC4394.m8917(this.msgInfo, info.msgInfo);
                }

                public final MsgInfo getMsgInfo() {
                    return this.msgInfo;
                }

                public final String getOperatorUid() {
                    return this.operatorUid;
                }

                public int hashCode() {
                    return this.msgInfo.hashCode() + (this.operatorUid.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC3056.m6668(-3937695913355773351L));
                    AbstractC6136.m11531(sb, this.operatorUid, -3937694380052448679L);
                    sb.append(this.msgInfo);
                    sb.append(')');
                    return sb.toString();
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @InterfaceC7180
                @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001c¨\u00061"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "", "", "msgSeq", "", "msgTime", "", "senderUid", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IJLjava/lang/String;)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IIJLjava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "copy", "(IJLjava/lang/String;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMsgSeq", "getMsgSeq$annotations", "()V", "J", "getMsgTime", "getMsgTime$annotations", "Ljava/lang/String;", "getSenderUid", "getSenderUid$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final /* data */ class MsgInfo {
                    public static final int $stable = 0;

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final int msgSeq;
                    private final long msgTime;
                    private final String senderUid;

                    public /* synthetic */ MsgInfo(int i, int i2, long j, String str, AbstractC7136 abstractC7136) {
                        this.msgSeq = (i & 1) == 0 ? 0 : i2;
                        if ((i & 2) == 0) {
                            this.msgTime = 0L;
                        } else {
                            this.msgTime = j;
                        }
                        if ((i & 4) == 0) {
                            this.senderUid = AbstractC3056.m6668(-3937561979095614887L);
                        } else {
                            this.senderUid = str;
                        }
                    }

                    public static /* synthetic */ MsgInfo copy$default(MsgInfo msgInfo, int i, long j, String str, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            i = msgInfo.msgSeq;
                        }
                        if ((i2 & 2) != 0) {
                            j = msgInfo.msgTime;
                        }
                        if ((i2 & 4) != 0) {
                            str = msgInfo.senderUid;
                        }
                        return msgInfo.copy(i, j, str);
                    }

                    public static final /* synthetic */ void write$Self$app_publishRelease(MsgInfo self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                        if (output.mo10671(serialDesc) || self.msgSeq != 0) {
                            output.mo6805(0, self.msgSeq, serialDesc);
                        }
                        if (output.mo10671(serialDesc) || self.msgTime != 0) {
                            output.mo6796(serialDesc, 1, self.msgTime);
                        }
                        if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.senderUid, AbstractC3056.m6668(-3937561979095614887L))) {
                            return;
                        }
                        output.mo6814(serialDesc, 2, self.senderUid);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final int getMsgSeq() {
                        return this.msgSeq;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final long getMsgTime() {
                        return this.msgTime;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getSenderUid() {
                        return this.senderUid;
                    }

                    public final MsgInfo copy(int msgSeq, long msgTime, String senderUid) {
                        AbstractC3056.m6668(-3937694487426631079L);
                        senderUid.getClass();
                        return new MsgInfo(msgSeq, msgTime, senderUid);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof MsgInfo)) {
                            return false;
                        }
                        MsgInfo msgInfo = (MsgInfo) other;
                        return this.msgSeq == msgInfo.msgSeq && this.msgTime == msgInfo.msgTime && AbstractC4394.m8917(this.senderUid, msgInfo.senderUid);
                    }

                    public final int getMsgSeq() {
                        return this.msgSeq;
                    }

                    public final long getMsgTime() {
                        return this.msgTime;
                    }

                    public final String getSenderUid() {
                        return this.senderUid;
                    }

                    public int hashCode() {
                        return this.senderUid.hashCode() + AbstractC0053.m141(Integer.hashCode(this.msgSeq) * 31, 31, this.msgTime);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC3056.m6668(-3937694496016565671L));
                        AbstractC6136.m11533(sb, this.msgSeq, -3937695780211787175L);
                        AbstractC6136.m11532(sb, this.msgTime, -3937694427297088935L);
                        return AbstractC0053.m155(sb, this.senderUid, ')');
                    }

                    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                    public static final class Companion {
                        public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                            this();
                        }

                        public final InterfaceC7183 serializer() {
                            return QQMessage$MessageBody$GroupRecallOperationInfo$Info$MsgInfo$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC6307(number = 1)
                    public static /* synthetic */ void getMsgSeq$annotations() {
                    }

                    @InterfaceC6307(number = 2)
                    public static /* synthetic */ void getMsgTime$annotations() {
                    }

                    @InterfaceC6307(number = 6)
                    public static /* synthetic */ void getSenderUid$annotations() {
                    }

                    public MsgInfo() {
                        this(0, 0L, (String) null, 7, (AbstractC4384) null);
                    }

                    public MsgInfo(int i, long j, String str) {
                        AbstractC3056.m6668(-3937694487426631079L);
                        str.getClass();
                        this.msgSeq = i;
                        this.msgTime = j;
                        this.senderUid = str;
                    }

                    public /* synthetic */ MsgInfo(int i, long j, String str, int i2, AbstractC4384 abstractC4384) {
                        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Info;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final class Companion {
                    public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                        this();
                    }

                    public final InterfaceC7183 serializer() {
                        return QQMessage$MessageBody$GroupRecallOperationInfo$Info$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @InterfaceC6307(number = 3)
                public static /* synthetic */ void getMsgInfo$annotations() {
                }

                @InterfaceC6307(number = 1)
                public static /* synthetic */ void getOperatorUid$annotations() {
                }

                public Info(String str, MsgInfo msgInfo) {
                    AbstractC6136.m11546(-3937702875497760167L, -3937694882563622311L, str);
                    msgInfo.getClass();
                    this.operatorUid = str;
                    this.msgInfo = msgInfo;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Info() {
                    this((String) null, (MsgInfo) (0 == true ? 1 : 0), 3, (AbstractC4384) (0 == true ? 1 : 0));
                }

                public /* synthetic */ Info(String str, MsgInfo msgInfo, int i, AbstractC4384 abstractC4384) {
                    this((i & 1) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str, (i & 2) != 0 ? new MsgInfo(0, 0L, (String) null, 7, (AbstractC4384) null) : msgInfo);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$GroupRecallOperationInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return QQMessage$MessageBody$GroupRecallOperationInfo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC6307(number = 11)
            public static /* synthetic */ void getInfo$annotations() {
            }

            @InterfaceC6307(number = 37)
            public static /* synthetic */ void getMsgSeq$annotations() {
            }

            @InterfaceC6307(number = 4)
            public static /* synthetic */ void getPeerId$annotations() {
            }

            public GroupRecallOperationInfo() {
                this(0L, (Info) null, 0, 7, (AbstractC4384) null);
            }

            public GroupRecallOperationInfo(long j, Info info, int i) {
                AbstractC3056.m6668(-3937696381507208615L);
                info.getClass();
                this.peerId = j;
                this.info = info;
                this.msgSeq = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ GroupRecallOperationInfo(long j, Info info, int i, int i2, AbstractC4384 abstractC4384) {
                this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? new Info((String) null, (Info.MsgInfo) (0 == true ? 1 : 0), 3, (AbstractC4384) (0 == true ? 1 : 0)) : info, (i2 & 4) != 0 ? 0 : i);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent;", "msgContent", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/util/List;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMsgContent", "getMsgContent$annotations", "()V", "Companion", "MsgContent", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class RichMsg {
            private final List<MsgContent> msgContent;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;
            private static final InterfaceC5183[] $childSerializers = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(3))};

            public RichMsg(List<MsgContent> list) {
                AbstractC3056.m6668(-3937711465432352167L);
                list.getClass();
                this.msgContent = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC7183 _childSerializers$_anonymous_() {
                return new C7102(QQMessage$MessageBody$RichMsg$MsgContent$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RichMsg copy$default(RichMsg richMsg, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = richMsg.msgContent;
                }
                return richMsg.copy(list);
            }

            public static final void write$Self$app_publishRelease(RichMsg self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                InterfaceC5183[] interfaceC5183Arr = $childSerializers;
                if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.msgContent, EmptyList.INSTANCE)) {
                    return;
                }
                output.mo6791(serialDesc, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), self.msgContent);
            }

            public final List<MsgContent> component1() {
                return this.msgContent;
            }

            public final RichMsg copy(List<MsgContent> msgContent) {
                AbstractC3056.m6668(-3937711465432352167L);
                msgContent.getClass();
                return new RichMsg(msgContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RichMsg) && AbstractC4394.m8917(this.msgContent, ((RichMsg) other).msgContent);
            }

            public final List<MsgContent> getMsgContent() {
                return this.msgContent;
            }

            public int hashCode() {
                return this.msgContent.hashCode();
            }

            public String toString() {
                return AbstractC3056.m6668(-3937710082452882855L) + this.msgContent + ')';
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @InterfaceC7180
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0004-./,B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u00060"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent;", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "textMsg", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "msgSender", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "component2", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "copy", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "getTextMsg", "getTextMsg$annotations", "()V", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "getMsgSender", "getMsgSender$annotations", "Companion", "TextMsg", "MsgSender", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final /* data */ class MsgContent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final MsgSender msgSender;
                private final TextMsg textMsg;

                public /* synthetic */ MsgContent(int i, TextMsg textMsg, MsgSender msgSender, AbstractC7136 abstractC7136) {
                    this.textMsg = (i & 1) == 0 ? new TextMsg(AbstractC3056.m6668(-3937561979095614887L)) : textMsg;
                    if ((i & 2) == 0) {
                        this.msgSender = new MsgSender(AbstractC3056.m6668(-3937561979095614887L));
                    } else {
                        this.msgSender = msgSender;
                    }
                }

                public static /* synthetic */ MsgContent copy$default(MsgContent msgContent, TextMsg textMsg, MsgSender msgSender, int i, Object obj) {
                    if ((i & 1) != 0) {
                        textMsg = msgContent.textMsg;
                    }
                    if ((i & 2) != 0) {
                        msgSender = msgContent.msgSender;
                    }
                    return msgContent.copy(textMsg, msgSender);
                }

                public static final /* synthetic */ void write$Self$app_publishRelease(MsgContent self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                    if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.textMsg, new TextMsg(AbstractC3056.m6668(-3937561979095614887L)))) {
                        output.mo6791(serialDesc, 0, QQMessage$MessageBody$RichMsg$MsgContent$TextMsg$$serializer.INSTANCE, self.textMsg);
                    }
                    if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.msgSender, new MsgSender(AbstractC3056.m6668(-3937561979095614887L)))) {
                        return;
                    }
                    output.mo6791(serialDesc, 1, QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer.INSTANCE, self.msgSender);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final TextMsg getTextMsg() {
                    return this.textMsg;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final MsgSender getMsgSender() {
                    return this.msgSender;
                }

                public final MsgContent copy(TextMsg textMsg, MsgSender msgSender) {
                    AbstractC3056.m6668(-3937711207734314407L);
                    textMsg.getClass();
                    AbstractC3056.m6668(-3937711104655099303L);
                    msgSender.getClass();
                    return new MsgContent(textMsg, msgSender);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MsgContent)) {
                        return false;
                    }
                    MsgContent msgContent = (MsgContent) other;
                    return AbstractC4394.m8917(this.textMsg, msgContent.textMsg) && AbstractC4394.m8917(this.msgSender, msgContent.msgSender);
                }

                public final MsgSender getMsgSender() {
                    return this.msgSender;
                }

                public final TextMsg getTextMsg() {
                    return this.textMsg;
                }

                public int hashCode() {
                    return this.msgSender.hashCode() + (this.textMsg.hashCode() * 31);
                }

                public String toString() {
                    return AbstractC3056.m6668(-3937710215596869031L) + this.textMsg + AbstractC3056.m6668(-3937710129697523111L) + this.msgSender + ')';
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @InterfaceC7180
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006%"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "", "", "nickName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNickName", "getNickName$annotations", "()V", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final /* data */ class MsgSender {
                    public static final int $stable = 0;

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final String nickName;

                    public /* synthetic */ MsgSender(int i, String str, AbstractC7136 abstractC7136) {
                        if ((i & 1) == 0) {
                            this.nickName = AbstractC3056.m6668(-3937561979095614887L);
                        } else {
                            this.nickName = str;
                        }
                    }

                    public static /* synthetic */ MsgSender copy$default(MsgSender msgSender, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = msgSender.nickName;
                        }
                        return msgSender.copy(str);
                    }

                    public static final /* synthetic */ void write$Self$app_publishRelease(MsgSender self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                        if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.nickName, AbstractC3056.m6668(-3937561979095614887L))) {
                            return;
                        }
                        output.mo6814(serialDesc, 0, self.nickName);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getNickName() {
                        return this.nickName;
                    }

                    public final MsgSender copy(String nickName) {
                        AbstractC3056.m6668(-3937710782532552103L);
                        nickName.getClass();
                        return new MsgSender(nickName);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof MsgSender) && AbstractC4394.m8917(this.nickName, ((MsgSender) other).nickName);
                    }

                    public final String getNickName() {
                        return this.nickName;
                    }

                    public int hashCode() {
                        return this.nickName.hashCode();
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC3056.m6668(-3937710683748304295L));
                        return AbstractC0053.m155(sb, this.nickName, ')');
                    }

                    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$MsgSender;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                    public static final class Companion {
                        public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                            this();
                        }

                        public final InterfaceC7183 serializer() {
                            return QQMessage$MessageBody$RichMsg$MsgContent$MsgSender$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC6307(number = 1)
                    public static /* synthetic */ void getNickName$annotations() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public MsgSender() {
                        this((String) null, 1, (AbstractC4384) (0 == true ? 1 : 0));
                    }

                    public MsgSender(String str) {
                        AbstractC3056.m6668(-3937710782532552103L);
                        str.getClass();
                        this.nickName = str;
                    }

                    public /* synthetic */ MsgSender(String str, int i, AbstractC4384 abstractC4384) {
                        this((i & 1) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @InterfaceC7180
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006%"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "", "", "text", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final /* data */ class TextMsg {
                    public static final int $stable = 0;

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final String text;

                    public /* synthetic */ TextMsg(int i, String str, AbstractC7136 abstractC7136) {
                        if ((i & 1) == 0) {
                            this.text = AbstractC3056.m6668(-3937561979095614887L);
                        } else {
                            this.text = str;
                        }
                    }

                    public static /* synthetic */ TextMsg copy$default(TextMsg textMsg, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = textMsg.text;
                        }
                        return textMsg.copy(str);
                    }

                    public static final /* synthetic */ void write$Self$app_publishRelease(TextMsg self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                        if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.text, AbstractC3056.m6668(-3937561979095614887L))) {
                            return;
                        }
                        output.mo6814(serialDesc, 0, self.text);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    public final TextMsg copy(String text) {
                        AbstractC3056.m6668(-3937689599753848231L);
                        text.getClass();
                        return new TextMsg(text);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof TextMsg) && AbstractC4394.m8917(this.text, ((TextMsg) other).text);
                    }

                    public final String getText() {
                        return this.text;
                    }

                    public int hashCode() {
                        return this.text.hashCode();
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC3056.m6668(-3937710292906280359L));
                        return AbstractC0053.m155(sb, this.text, ')');
                    }

                    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$TextMsg;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                    public static final class Companion {
                        public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                            this();
                        }

                        public final InterfaceC7183 serializer() {
                            return QQMessage$MessageBody$RichMsg$MsgContent$TextMsg$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC6307(number = 1)
                    public static /* synthetic */ void getText$annotations() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public TextMsg() {
                        this((String) null, 1, (AbstractC4384) (0 == true ? 1 : 0));
                    }

                    public TextMsg(String str) {
                        AbstractC3056.m6668(-3937689599753848231L);
                        str.getClass();
                        this.text = str;
                    }

                    public /* synthetic */ TextMsg(String str, int i, AbstractC4384 abstractC4384) {
                        this((i & 1) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$MsgContent;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final class Companion {
                    public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                        this();
                    }

                    public final InterfaceC7183 serializer() {
                        return QQMessage$MessageBody$RichMsg$MsgContent$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @InterfaceC6307(number = 16)
                public static /* synthetic */ void getMsgSender$annotations() {
                }

                @InterfaceC6307(number = 1)
                public static /* synthetic */ void getTextMsg$annotations() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                public MsgContent() {
                    this((TextMsg) null, (MsgSender) (0 == true ? 1 : 0), 3, (AbstractC4384) (0 == true ? 1 : 0));
                }

                public MsgContent(TextMsg textMsg, MsgSender msgSender) {
                    AbstractC3056.m6668(-3937711207734314407L);
                    textMsg.getClass();
                    AbstractC3056.m6668(-3937711104655099303L);
                    msgSender.getClass();
                    this.textMsg = textMsg;
                    this.msgSender = msgSender;
                }

                public /* synthetic */ MsgContent(TextMsg textMsg, MsgSender msgSender, int i, AbstractC4384 abstractC4384) {
                    this((i & 1) != 0 ? new TextMsg(AbstractC3056.m6668(-3937561979095614887L)) : textMsg, (i & 2) != 0 ? new MsgSender(AbstractC3056.m6668(-3937561979095614887L)) : msgSender);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$RichMsg;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return QQMessage$MessageBody$RichMsg$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public RichMsg(int i, List list, AbstractC7136 abstractC7136) {
                if ((i & 1) == 0) {
                    this.msgContent = EmptyList.INSTANCE;
                } else {
                    this.msgContent = list;
                }
            }

            public RichMsg() {
                this((List) null, 1, (AbstractC4384) null);
            }

            @InterfaceC6307(number = 2)
            public static /* synthetic */ void getMsgContent$annotations() {
            }

            public RichMsg(List list, int i, AbstractC4384 abstractC4384) {
                this((i & 1) != 0 ? EmptyList.INSTANCE : list);
            }
        }

        public MessageBody(RichMsg richMsg, byte[] bArr) {
            AbstractC3056.m6668(-3937696677859952039L);
            richMsg.getClass();
            AbstractC3056.m6668(-3937696712219690407L);
            bArr.getClass();
            this.richMsg = richMsg;
            this.operationInfo = bArr;
        }

        public static /* synthetic */ MessageBody copy$default(MessageBody messageBody, RichMsg richMsg, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                richMsg = messageBody.richMsg;
            }
            if ((i & 2) != 0) {
                bArr = messageBody.operationInfo;
            }
            return messageBody.copy(richMsg, bArr);
        }

        public static final void write$Self$app_publishRelease(MessageBody self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
            if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.richMsg, new RichMsg(EmptyList.INSTANCE))) {
                output.mo6791(serialDesc, 0, QQMessage$MessageBody$RichMsg$$serializer.INSTANCE, self.richMsg);
            }
            if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.operationInfo, new byte[0])) {
                return;
            }
            output.mo6791(serialDesc, 1, C7117.f19059, self.operationInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RichMsg getRichMsg() {
            return this.richMsg;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getOperationInfo() {
            return this.operationInfo;
        }

        public final MessageBody copy(RichMsg richMsg, byte[] operationInfo) {
            AbstractC3056.m6668(-3937696677859952039L);
            richMsg.getClass();
            AbstractC3056.m6668(-3937696712219690407L);
            operationInfo.getClass();
            return new MessageBody(richMsg, operationInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageBody)) {
                return false;
            }
            MessageBody messageBody = (MessageBody) other;
            return AbstractC4394.m8917(this.richMsg, messageBody.richMsg) && AbstractC4394.m8917(this.operationInfo, messageBody.operationInfo);
        }

        public final byte[] getOperationInfo() {
            return this.operationInfo;
        }

        public final RichMsg getRichMsg() {
            return this.richMsg;
        }

        public int hashCode() {
            return Arrays.hashCode(this.operationInfo) + (this.richMsg.hashCode() * 31);
        }

        public String toString() {
            return AbstractC3056.m6668(-3937709700200793511L) + this.richMsg + AbstractC3056.m6668(-3937709618596414887L) + Arrays.toString(this.operationInfo) + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006("}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo;", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "info", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "copy", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "getInfo", "getInfo$annotations", "()V", "Companion", "Info", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class C2CRecallOperationInfo {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Info info;

            public /* synthetic */ C2CRecallOperationInfo(int i, Info info, AbstractC7136 abstractC7136) {
                if ((i & 1) == 0) {
                    this.info = new Info(AbstractC3056.m6668(-3937561979095614887L), AbstractC3056.m6668(-3937561979095614887L), 0L, 0L, 0);
                } else {
                    this.info = info;
                }
            }

            public static /* synthetic */ C2CRecallOperationInfo copy$default(C2CRecallOperationInfo c2CRecallOperationInfo, Info info, int i, Object obj) {
                if ((i & 1) != 0) {
                    info = c2CRecallOperationInfo.info;
                }
                return c2CRecallOperationInfo.copy(info);
            }

            public static final /* synthetic */ void write$Self$app_publishRelease(C2CRecallOperationInfo self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.info, new Info(AbstractC3056.m6668(-3937561979095614887L), AbstractC3056.m6668(-3937561979095614887L), 0L, 0L, 0))) {
                    return;
                }
                output.mo6791(serialDesc, 0, QQMessage$MessageBody$C2CRecallOperationInfo$Info$$serializer.INSTANCE, self.info);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Info getInfo() {
                return this.info;
            }

            public final C2CRecallOperationInfo copy(Info info) {
                AbstractC3056.m6668(-3937696381507208615L);
                info.getClass();
                return new C2CRecallOperationInfo(info);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C2CRecallOperationInfo) && AbstractC4394.m8917(this.info, ((C2CRecallOperationInfo) other).info);
            }

            public final Info getInfo() {
                return this.info;
            }

            public int hashCode() {
                return this.info.hashCode();
            }

            public String toString() {
                return AbstractC3056.m6668(-3937695745852048807L) + this.info + ')';
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @InterfaceC7180
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001dR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010 ¨\u00069"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "", "", "operatorUid", "receiverUid", "", "msgTime", "msgRandom", "", "msgSeq", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;JJI)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJIL飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;JJI)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOperatorUid", "getOperatorUid$annotations", "()V", "getReceiverUid", "getReceiverUid$annotations", "J", "getMsgTime", "getMsgTime$annotations", "getMsgRandom", "getMsgRandom$annotations", "I", "getMsgSeq", "getMsgSeq$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final /* data */ class Info {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final long msgRandom;
                private final int msgSeq;
                private final long msgTime;
                private final String operatorUid;
                private final String receiverUid;

                public /* synthetic */ Info(int i, String str, String str2, long j, long j2, int i2, AbstractC7136 abstractC7136) {
                    this.operatorUid = (i & 1) == 0 ? AbstractC3056.m6668(-3937561979095614887L) : str;
                    if ((i & 2) == 0) {
                        this.receiverUid = AbstractC3056.m6668(-3937561979095614887L);
                    } else {
                        this.receiverUid = str2;
                    }
                    if ((i & 4) == 0) {
                        this.msgTime = 0L;
                    } else {
                        this.msgTime = j;
                    }
                    if ((i & 8) == 0) {
                        this.msgRandom = 0L;
                    } else {
                        this.msgRandom = j2;
                    }
                    if ((i & 16) == 0) {
                        this.msgSeq = 0;
                    } else {
                        this.msgSeq = i2;
                    }
                }

                public static /* synthetic */ Info copy$default(Info info, String str, String str2, long j, long j2, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = info.operatorUid;
                    }
                    if ((i2 & 2) != 0) {
                        str2 = info.receiverUid;
                    }
                    if ((i2 & 4) != 0) {
                        j = info.msgTime;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = info.msgRandom;
                    }
                    if ((i2 & 16) != 0) {
                        i = info.msgSeq;
                    }
                    int i3 = i;
                    long j3 = j2;
                    return info.copy(str, str2, j, j3, i3);
                }

                public static final /* synthetic */ void write$Self$app_publishRelease(Info self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                    if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.operatorUid, AbstractC3056.m6668(-3937561979095614887L))) {
                        output.mo6814(serialDesc, 0, self.operatorUid);
                    }
                    if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.receiverUid, AbstractC3056.m6668(-3937561979095614887L))) {
                        output.mo6814(serialDesc, 1, self.receiverUid);
                    }
                    if (output.mo10671(serialDesc) || self.msgTime != 0) {
                        output.mo6796(serialDesc, 2, self.msgTime);
                    }
                    if (output.mo10671(serialDesc) || self.msgRandom != 0) {
                        output.mo6796(serialDesc, 3, self.msgRandom);
                    }
                    if (!output.mo10671(serialDesc) && self.msgSeq == 0) {
                        return;
                    }
                    output.mo6805(4, self.msgSeq, serialDesc);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getOperatorUid() {
                    return this.operatorUid;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getReceiverUid() {
                    return this.receiverUid;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final long getMsgTime() {
                    return this.msgTime;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final long getMsgRandom() {
                    return this.msgRandom;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final int getMsgSeq() {
                    return this.msgSeq;
                }

                public final Info copy(String operatorUid, String receiverUid, long msgTime, long msgRandom, int msgSeq) {
                    AbstractC6136.m11546(-3937702875497760167L, -3937696033614857639L, operatorUid);
                    receiverUid.getClass();
                    return new Info(operatorUid, receiverUid, msgTime, msgRandom, msgSeq);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Info)) {
                        return false;
                    }
                    Info info = (Info) other;
                    return AbstractC4394.m8917(this.operatorUid, info.operatorUid) && AbstractC4394.m8917(this.receiverUid, info.receiverUid) && this.msgTime == info.msgTime && this.msgRandom == info.msgRandom && this.msgSeq == info.msgSeq;
                }

                public final long getMsgRandom() {
                    return this.msgRandom;
                }

                public final int getMsgSeq() {
                    return this.msgSeq;
                }

                public final long getMsgTime() {
                    return this.msgTime;
                }

                public final String getOperatorUid() {
                    return this.operatorUid;
                }

                public final String getReceiverUid() {
                    return this.receiverUid;
                }

                public int hashCode() {
                    return Integer.hashCode(this.msgSeq) + AbstractC0053.m141(AbstractC0053.m141(AbstractC6136.m11539(this.operatorUid.hashCode() * 31, 31, this.receiverUid), 31, this.msgTime), 31, this.msgRandom);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC3056.m6668(-3937695913355773351L));
                    AbstractC6136.m11531(sb, this.operatorUid, -3937695887585969575L);
                    AbstractC6136.m11531(sb, this.receiverUid, -3937695780211787175L);
                    AbstractC6136.m11532(sb, this.msgTime, -3937695724377212327L);
                    AbstractC6136.m11532(sb, this.msgRandom, -3937685549599688103L);
                    return AbstractC0053.m154(sb, this.msgSeq, ')');
                }

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Info;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
                public static final class Companion {
                    public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                        this();
                    }

                    public final InterfaceC7183 serializer() {
                        return QQMessage$MessageBody$C2CRecallOperationInfo$Info$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @InterfaceC6307(number = 6)
                public static /* synthetic */ void getMsgRandom$annotations() {
                }

                @InterfaceC6307(number = 20)
                public static /* synthetic */ void getMsgSeq$annotations() {
                }

                @InterfaceC6307(number = 5)
                public static /* synthetic */ void getMsgTime$annotations() {
                }

                @InterfaceC6307(number = 1)
                public static /* synthetic */ void getOperatorUid$annotations() {
                }

                @InterfaceC6307(number = 2)
                public static /* synthetic */ void getReceiverUid$annotations() {
                }

                public Info(String str, String str2, long j, long j2, int i) {
                    AbstractC6136.m11546(-3937702875497760167L, -3937696033614857639L, str);
                    str2.getClass();
                    this.operatorUid = str;
                    this.receiverUid = str2;
                    this.msgTime = j;
                    this.msgRandom = j2;
                    this.msgSeq = i;
                }

                public Info() {
                    this((String) null, (String) null, 0L, 0L, 0, 31, (AbstractC4384) null);
                }

                public /* synthetic */ Info(String str, String str2, long j, long j2, int i, int i2, AbstractC4384 abstractC4384) {
                    this((i2 & 1) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str, (i2 & 2) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0 : i);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$C2CRecallOperationInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return QQMessage$MessageBody$C2CRecallOperationInfo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC6307(number = 1)
            public static /* synthetic */ void getInfo$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2CRecallOperationInfo() {
                this((Info) null, 1, (AbstractC4384) (0 == true ? 1 : 0));
            }

            public C2CRecallOperationInfo(Info info) {
                AbstractC3056.m6668(-3937696381507208615L);
                info.getClass();
                this.info = info;
            }

            public /* synthetic */ C2CRecallOperationInfo(Info info, int i, AbstractC4384 abstractC4384) {
                this((i & 1) != 0 ? new Info(AbstractC3056.m6668(-3937561979095614887L), AbstractC3056.m6668(-3937561979095614887L), 0L, 0L, 0) : info);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageBody;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                this();
            }

            public final InterfaceC7183 serializer() {
                return QQMessage$MessageBody$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC6307(number = 2)
        public static /* synthetic */ void getOperationInfo$annotations() {
        }

        @InterfaceC6307(number = 1)
        public static /* synthetic */ void getRichMsg$annotations() {
        }

        public MessageBody(int i, RichMsg richMsg, byte[] bArr, AbstractC7136 abstractC7136) {
            this.richMsg = (i & 1) == 0 ? new RichMsg(EmptyList.INSTANCE) : richMsg;
            if ((i & 2) == 0) {
                this.operationInfo = new byte[0];
            } else {
                this.operationInfo = bArr;
            }
        }

        public MessageBody() {
            this((RichMsg) null, (byte[]) null, 3, (AbstractC4384) null);
        }

        public MessageBody(RichMsg richMsg, byte[] bArr, int i, AbstractC4384 abstractC4384) {
            this((i & 1) != 0 ? new RichMsg(EmptyList.INSTANCE) : richMsg, (i & 2) != 0 ? new byte[0] : bArr);
        }
    }

    public /* synthetic */ QQMessage(int i, MessageHead messageHead, MessageContentInfo messageContentInfo, MessageBody messageBody, AbstractC7136 abstractC7136) {
        if ((i & 1) == 0) {
            this.messageHead = null;
        } else {
            this.messageHead = messageHead;
        }
        if ((i & 2) == 0) {
            this.messageContentInfo = new MessageContentInfo(0, 0, 0, 0, 0L);
        } else {
            this.messageContentInfo = messageContentInfo;
        }
        if ((i & 4) == 0) {
            this.messageBody = new MessageBody((MessageBody.RichMsg) null, (byte[]) null, 3, (AbstractC4384) null);
        } else {
            this.messageBody = messageBody;
        }
    }

    public static /* synthetic */ QQMessage copy$default(QQMessage qQMessage, MessageHead messageHead, MessageContentInfo messageContentInfo, MessageBody messageBody, int i, Object obj) {
        if ((i & 1) != 0) {
            messageHead = qQMessage.messageHead;
        }
        if ((i & 2) != 0) {
            messageContentInfo = qQMessage.messageContentInfo;
        }
        if ((i & 4) != 0) {
            messageBody = qQMessage.messageBody;
        }
        return qQMessage.copy(messageHead, messageContentInfo, messageBody);
    }

    public static final /* synthetic */ void write$Self$app_publishRelease(QQMessage self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
        if (output.mo10671(serialDesc) || self.messageHead != null) {
            output.mo6807(serialDesc, 0, QQMessage$MessageHead$$serializer.INSTANCE, self.messageHead);
        }
        if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.messageContentInfo, new MessageContentInfo(0, 0, 0, 0, 0L))) {
            output.mo6791(serialDesc, 1, QQMessage$MessageContentInfo$$serializer.INSTANCE, self.messageContentInfo);
        }
        if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.messageBody, new MessageBody((MessageBody.RichMsg) null, (byte[]) null, 3, (AbstractC4384) null))) {
            return;
        }
        output.mo6791(serialDesc, 2, QQMessage$MessageBody$$serializer.INSTANCE, self.messageBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageHead getMessageHead() {
        return this.messageHead;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageContentInfo getMessageContentInfo() {
        return this.messageContentInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    public final QQMessage copy(MessageHead messageHead, MessageContentInfo messageContentInfo, MessageBody messageBody) {
        AbstractC3056.m6668(-3937697034342237607L);
        messageContentInfo.getClass();
        AbstractC3056.m6668(-3937696944147924391L);
        messageBody.getClass();
        return new QQMessage(messageHead, messageContentInfo, messageBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QQMessage)) {
            return false;
        }
        QQMessage qQMessage = (QQMessage) other;
        return AbstractC4394.m8917(this.messageHead, qQMessage.messageHead) && AbstractC4394.m8917(this.messageContentInfo, qQMessage.messageContentInfo) && AbstractC4394.m8917(this.messageBody, qQMessage.messageBody);
    }

    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    public final MessageContentInfo getMessageContentInfo() {
        return this.messageContentInfo;
    }

    public final MessageHead getMessageHead() {
        return this.messageHead;
    }

    public int hashCode() {
        MessageHead messageHead = this.messageHead;
        int iHashCode = messageHead == null ? 0 : messageHead.hashCode();
        return this.messageBody.hashCode() + ((this.messageContentInfo.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return AbstractC3056.m6668(-3937708063818253735L) + this.messageHead + AbstractC3056.m6668(-3937707887724594599L) + this.messageContentInfo + AbstractC3056.m6668(-3937707844774921639L) + this.messageBody + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @InterfaceC7180
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003:;9B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010!¨\u0006<"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "", "", "senderPeerId", "", "senderUid", "receiverPeerId", "receiverUid", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "senderInfo", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "copy", "(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSenderPeerId", "getSenderPeerId$annotations", "()V", "Ljava/lang/String;", "getSenderUid", "getSenderUid$annotations", "getReceiverPeerId", "getReceiverPeerId$annotations", "getReceiverUid", "getReceiverUid$annotations", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "getSenderInfo", "getSenderInfo$annotations", "Companion", "SenderInfo", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final /* data */ class MessageHead {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long receiverPeerId;
        private final String receiverUid;
        private final SenderInfo senderInfo;
        private final long senderPeerId;
        private final String senderUid;

        public /* synthetic */ MessageHead(int i, long j, String str, long j2, String str2, SenderInfo senderInfo, AbstractC7136 abstractC7136) {
            if ((i & 1) == 0) {
                this.senderPeerId = 0L;
            } else {
                this.senderPeerId = j;
            }
            if ((i & 2) == 0) {
                this.senderUid = AbstractC3056.m6668(-3937561979095614887L);
            } else {
                this.senderUid = str;
            }
            if ((i & 4) == 0) {
                this.receiverPeerId = 0L;
            } else {
                this.receiverPeerId = j2;
            }
            if ((i & 8) == 0) {
                this.receiverUid = null;
            } else {
                this.receiverUid = str2;
            }
            if ((i & 16) == 0) {
                this.senderInfo = null;
            } else {
                this.senderInfo = senderInfo;
            }
        }

        public static /* synthetic */ MessageHead copy$default(MessageHead messageHead, long j, String str, long j2, String str2, SenderInfo senderInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                j = messageHead.senderPeerId;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                str = messageHead.senderUid;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                j2 = messageHead.receiverPeerId;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                str2 = messageHead.receiverUid;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                senderInfo = messageHead.senderInfo;
            }
            return messageHead.copy(j3, str3, j4, str4, senderInfo);
        }

        public static final /* synthetic */ void write$Self$app_publishRelease(MessageHead self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
            if (output.mo10671(serialDesc) || self.senderPeerId != 0) {
                output.mo6796(serialDesc, 0, self.senderPeerId);
            }
            if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.senderUid, AbstractC3056.m6668(-3937561979095614887L))) {
                output.mo6814(serialDesc, 1, self.senderUid);
            }
            if (output.mo10671(serialDesc) || self.receiverPeerId != 0) {
                output.mo6796(serialDesc, 2, self.receiverPeerId);
            }
            if (output.mo10671(serialDesc) || self.receiverUid != null) {
                output.mo6807(serialDesc, 3, C7134.f19094, self.receiverUid);
            }
            if (!output.mo10671(serialDesc) && self.senderInfo == null) {
                return;
            }
            output.mo6807(serialDesc, 4, QQMessage$MessageHead$SenderInfo$$serializer.INSTANCE, self.senderInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSenderPeerId() {
            return this.senderPeerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSenderUid() {
            return this.senderUid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getReceiverPeerId() {
            return this.receiverPeerId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReceiverUid() {
            return this.receiverUid;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final SenderInfo getSenderInfo() {
            return this.senderInfo;
        }

        public final MessageHead copy(long senderPeerId, String senderUid, long receiverPeerId, String receiverUid, SenderInfo senderInfo) {
            AbstractC3056.m6668(-3937694487426631079L);
            senderUid.getClass();
            return new MessageHead(senderPeerId, senderUid, receiverPeerId, receiverUid, senderInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageHead)) {
                return false;
            }
            MessageHead messageHead = (MessageHead) other;
            return this.senderPeerId == messageHead.senderPeerId && AbstractC4394.m8917(this.senderUid, messageHead.senderUid) && this.receiverPeerId == messageHead.receiverPeerId && AbstractC4394.m8917(this.receiverUid, messageHead.receiverUid) && AbstractC4394.m8917(this.senderInfo, messageHead.senderInfo);
        }

        public final long getReceiverPeerId() {
            return this.receiverPeerId;
        }

        public final String getReceiverUid() {
            return this.receiverUid;
        }

        public final SenderInfo getSenderInfo() {
            return this.senderInfo;
        }

        public final long getSenderPeerId() {
            return this.senderPeerId;
        }

        public final String getSenderUid() {
            return this.senderUid;
        }

        public int hashCode() {
            int iM141 = AbstractC0053.m141(AbstractC6136.m11539(Long.hashCode(this.senderPeerId) * 31, 31, this.senderUid), 31, this.receiverPeerId);
            String str = this.receiverUid;
            int iHashCode = (iM141 + (str == null ? 0 : str.hashCode())) * 31;
            SenderInfo senderInfo = this.senderInfo;
            return iHashCode + (senderInfo != null ? senderInfo.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC3056.m6668(-3937708227027010983L));
            AbstractC6136.m11532(sb, this.senderPeerId, -3937694427297088935L);
            AbstractC6136.m11531(sb, this.senderUid, -3937708201257207207L);
            AbstractC6136.m11532(sb, this.receiverPeerId, -3937695887585969575L);
            AbstractC6136.m11531(sb, this.receiverUid, -3937708106767926695L);
            sb.append(this.senderInfo);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001c¨\u00061"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "", "", "peerId", "", "msgSubType", "", "nickName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JILjava/lang/String;)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJILjava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "component2", "()I", "component3", "()Ljava/lang/String;", "copy", "(JILjava/lang/String;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPeerId", "getPeerId$annotations", "()V", "I", "getMsgSubType", "getMsgSubType$annotations", "Ljava/lang/String;", "getNickName", "getNickName$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class SenderInfo {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int msgSubType;
            private final String nickName;
            private final long peerId;

            public /* synthetic */ SenderInfo(int i, long j, int i2, String str, AbstractC7136 abstractC7136) {
                this.peerId = (i & 1) == 0 ? 0L : j;
                if ((i & 2) == 0) {
                    this.msgSubType = 0;
                } else {
                    this.msgSubType = i2;
                }
                if ((i & 4) == 0) {
                    this.nickName = AbstractC3056.m6668(-3937561979095614887L);
                } else {
                    this.nickName = str;
                }
            }

            public static /* synthetic */ SenderInfo copy$default(SenderInfo senderInfo, long j, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = senderInfo.peerId;
                }
                if ((i2 & 2) != 0) {
                    i = senderInfo.msgSubType;
                }
                if ((i2 & 4) != 0) {
                    str = senderInfo.nickName;
                }
                return senderInfo.copy(j, i, str);
            }

            public static final /* synthetic */ void write$Self$app_publishRelease(SenderInfo self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                if (output.mo10671(serialDesc) || self.peerId != 0) {
                    output.mo6796(serialDesc, 0, self.peerId);
                }
                if (output.mo10671(serialDesc) || self.msgSubType != 0) {
                    output.mo6805(1, self.msgSubType, serialDesc);
                }
                if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.nickName, AbstractC3056.m6668(-3937561979095614887L))) {
                    return;
                }
                output.mo6814(serialDesc, 2, self.nickName);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getPeerId() {
                return this.peerId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getMsgSubType() {
                return this.msgSubType;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getNickName() {
                return this.nickName;
            }

            public final SenderInfo copy(long peerId, int msgSubType, String nickName) {
                AbstractC3056.m6668(-3937710782532552103L);
                nickName.getClass();
                return new SenderInfo(peerId, msgSubType, nickName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SenderInfo)) {
                    return false;
                }
                SenderInfo senderInfo = (SenderInfo) other;
                return this.peerId == senderInfo.peerId && this.msgSubType == senderInfo.msgSubType && AbstractC4394.m8917(this.nickName, senderInfo.nickName);
            }

            public final int getMsgSubType() {
                return this.msgSubType;
            }

            public final String getNickName() {
                return this.nickName;
            }

            public final long getPeerId() {
                return this.peerId;
            }

            public int hashCode() {
                return this.nickName.hashCode() + AbstractC0053.m143(this.msgSubType, Long.hashCode(this.peerId) * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC3056.m6668(-3937708368760931751L));
                AbstractC6136.m11532(sb, this.peerId, -3937709086020470183L);
                AbstractC6136.m11533(sb, this.msgSubType, -3937708278566618535L);
                return AbstractC0053.m155(sb, this.nickName, ')');
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return QQMessage$MessageHead$SenderInfo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC6307(number = 2)
            public static /* synthetic */ void getMsgSubType$annotations() {
            }

            @InterfaceC6307(number = 4)
            public static /* synthetic */ void getNickName$annotations() {
            }

            @InterfaceC6307(number = 1)
            public static /* synthetic */ void getPeerId$annotations() {
            }

            public SenderInfo() {
                this(0L, 0, (String) null, 7, (AbstractC4384) null);
            }

            public SenderInfo(long j, int i, String str) {
                AbstractC3056.m6668(-3937710782532552103L);
                str.getClass();
                this.peerId = j;
                this.msgSubType = i;
                this.nickName = str;
            }

            public /* synthetic */ SenderInfo(long j, int i, String str, int i2, AbstractC4384 abstractC4384) {
                this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                this();
            }

            public final InterfaceC7183 serializer() {
                return QQMessage$MessageHead$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC6307(number = 5)
        public static /* synthetic */ void getReceiverPeerId$annotations() {
        }

        @InterfaceC6307(number = 6)
        public static /* synthetic */ void getReceiverUid$annotations() {
        }

        @InterfaceC6307(number = 8)
        public static /* synthetic */ void getSenderInfo$annotations() {
        }

        @InterfaceC6307(number = 1)
        public static /* synthetic */ void getSenderPeerId$annotations() {
        }

        @InterfaceC6307(number = 2)
        public static /* synthetic */ void getSenderUid$annotations() {
        }

        public MessageHead() {
            this(0L, (String) null, 0L, (String) null, (SenderInfo) null, 31, (AbstractC4384) null);
        }

        public MessageHead(long j, String str, long j2, String str2, SenderInfo senderInfo) {
            AbstractC3056.m6668(-3937694487426631079L);
            str.getClass();
            this.senderPeerId = j;
            this.senderUid = str;
            this.receiverPeerId = j2;
            this.receiverUid = str2;
            this.senderInfo = senderInfo;
        }

        public /* synthetic */ MessageHead(long j, String str, long j2, String str2, SenderInfo senderInfo, int i, AbstractC4384 abstractC4384) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? AbstractC3056.m6668(-3937561979095614887L) : str, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : senderInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @InterfaceC7180
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u0019R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001e¨\u00068"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "", "", "msgType", "msgSubType", "subSeq", "msgSeq", "", "msgTime", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIIJ)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IIIIIJL飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "()J", "copy", "(IIIIJ)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMsgType", "getMsgType$annotations", "()V", "getMsgSubType", "getMsgSubType$annotations", "getSubSeq", "getSubSeq$annotations", "getMsgSeq", "getMsgSeq$annotations", "J", "getMsgTime", "getMsgTime$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final /* data */ class MessageContentInfo {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int msgSeq;
        private final int msgSubType;
        private final long msgTime;
        private final int msgType;
        private final int subSeq;

        public /* synthetic */ MessageContentInfo(int i, int i2, int i3, int i4, int i5, long j, AbstractC7136 abstractC7136) {
            if ((i & 1) == 0) {
                this.msgType = 0;
            } else {
                this.msgType = i2;
            }
            if ((i & 2) == 0) {
                this.msgSubType = 0;
            } else {
                this.msgSubType = i3;
            }
            if ((i & 4) == 0) {
                this.subSeq = 0;
            } else {
                this.subSeq = i4;
            }
            if ((i & 8) == 0) {
                this.msgSeq = 0;
            } else {
                this.msgSeq = i5;
            }
            if ((i & 16) == 0) {
                this.msgTime = 0L;
            } else {
                this.msgTime = j;
            }
        }

        public static /* synthetic */ MessageContentInfo copy$default(MessageContentInfo messageContentInfo, int i, int i2, int i3, int i4, long j, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = messageContentInfo.msgType;
            }
            if ((i5 & 2) != 0) {
                i2 = messageContentInfo.msgSubType;
            }
            if ((i5 & 4) != 0) {
                i3 = messageContentInfo.subSeq;
            }
            if ((i5 & 8) != 0) {
                i4 = messageContentInfo.msgSeq;
            }
            if ((i5 & 16) != 0) {
                j = messageContentInfo.msgTime;
            }
            long j2 = j;
            return messageContentInfo.copy(i, i2, i3, i4, j2);
        }

        public static final /* synthetic */ void write$Self$app_publishRelease(MessageContentInfo self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
            if (output.mo10671(serialDesc) || self.msgType != 0) {
                output.mo6805(0, self.msgType, serialDesc);
            }
            if (output.mo10671(serialDesc) || self.msgSubType != 0) {
                output.mo6805(1, self.msgSubType, serialDesc);
            }
            if (output.mo10671(serialDesc) || self.subSeq != 0) {
                output.mo6805(2, self.subSeq, serialDesc);
            }
            if (output.mo10671(serialDesc) || self.msgSeq != 0) {
                output.mo6805(3, self.msgSeq, serialDesc);
            }
            if (!output.mo10671(serialDesc) && self.msgTime == 0) {
                return;
            }
            output.mo6796(serialDesc, 4, self.msgTime);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMsgType() {
            return this.msgType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMsgSubType() {
            return this.msgSubType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSubSeq() {
            return this.subSeq;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMsgSeq() {
            return this.msgSeq;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getMsgTime() {
            return this.msgTime;
        }

        public final MessageContentInfo copy(int msgType, int msgSubType, int subSeq, int msgSeq, long msgTime) {
            return new MessageContentInfo(msgType, msgSubType, subSeq, msgSeq, msgTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageContentInfo)) {
                return false;
            }
            MessageContentInfo messageContentInfo = (MessageContentInfo) other;
            return this.msgType == messageContentInfo.msgType && this.msgSubType == messageContentInfo.msgSubType && this.subSeq == messageContentInfo.subSeq && this.msgSeq == messageContentInfo.msgSeq && this.msgTime == messageContentInfo.msgTime;
        }

        public final int getMsgSeq() {
            return this.msgSeq;
        }

        public final int getMsgSubType() {
            return this.msgSubType;
        }

        public final long getMsgTime() {
            return this.msgTime;
        }

        public final int getMsgType() {
            return this.msgType;
        }

        public final int getSubSeq() {
            return this.subSeq;
        }

        public int hashCode() {
            return Long.hashCode(this.msgTime) + AbstractC0053.m143(this.msgSeq, AbstractC0053.m143(this.subSeq, AbstractC0053.m143(this.msgSubType, Integer.hashCode(this.msgType) * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC3056.m6668(-3937709206279554471L));
            AbstractC6136.m11533(sb, this.msgType, -3937709086020470183L);
            AbstractC6136.m11533(sb, this.msgSubType, -3937708974351320487L);
            AbstractC6136.m11533(sb, this.subSeq, -3937685549599688103L);
            AbstractC6136.m11533(sb, this.msgSeq, -3937695780211787175L);
            sb.append(this.msgTime);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageContentInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                this();
            }

            public final InterfaceC7183 serializer() {
                return QQMessage$MessageContentInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC6307(number = 5)
        public static /* synthetic */ void getMsgSeq$annotations() {
        }

        @InterfaceC6307(number = 2)
        public static /* synthetic */ void getMsgSubType$annotations() {
        }

        @InterfaceC6307(number = 6)
        public static /* synthetic */ void getMsgTime$annotations() {
        }

        @InterfaceC6307(number = 1)
        public static /* synthetic */ void getMsgType$annotations() {
        }

        @InterfaceC6307(number = 3)
        public static /* synthetic */ void getSubSeq$annotations() {
        }

        public MessageContentInfo() {
            this(0, 0, 0, 0, 0L, 31, (AbstractC4384) null);
        }

        public MessageContentInfo(int i, int i2, int i3, int i4, long j) {
            this.msgType = i;
            this.msgSubType = i2;
            this.subSeq = i3;
            this.msgSeq = i4;
            this.msgTime = j;
        }

        public /* synthetic */ MessageContentInfo(int i, int i2, int i3, int i4, long j, int i5, AbstractC4384 abstractC4384) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? 0L : j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/QQMessage$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/QQMessage;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
            this();
        }

        public final InterfaceC7183 serializer() {
            return QQMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC6307(number = 3)
    public static /* synthetic */ void getMessageBody$annotations() {
    }

    @InterfaceC6307(number = 2)
    public static /* synthetic */ void getMessageContentInfo$annotations() {
    }

    @InterfaceC6307(number = 1)
    public static /* synthetic */ void getMessageHead$annotations() {
    }

    public QQMessage() {
        this((MessageHead) null, (MessageContentInfo) null, (MessageBody) null, 7, (AbstractC4384) null);
    }

    public QQMessage(MessageHead messageHead, MessageContentInfo messageContentInfo, MessageBody messageBody) {
        AbstractC3056.m6668(-3937697034342237607L);
        messageContentInfo.getClass();
        AbstractC3056.m6668(-3937696944147924391L);
        messageBody.getClass();
        this.messageHead = messageHead;
        this.messageContentInfo = messageContentInfo;
        this.messageBody = messageBody;
    }

    public /* synthetic */ QQMessage(MessageHead messageHead, MessageContentInfo messageContentInfo, MessageBody messageBody, int i, AbstractC4384 abstractC4384) {
        this((i & 1) != 0 ? null : messageHead, (i & 2) != 0 ? new MessageContentInfo(0, 0, 0, 0, 0L) : messageContentInfo, (i & 4) != 0 ? new MessageBody((MessageBody.RichMsg) null, (byte[]) null, 3, (AbstractC4384) null) : messageBody);
    }
}
