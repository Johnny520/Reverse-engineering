package top.suzhelan.qstory.entity.proto;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
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
import p088.C7166;
import p089.InterfaceC7180;
import p089.InterfaceC7183;
import p090.InterfaceC7187;
import p091.InterfaceC7190;
import p332.C8801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00046785B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001e¨\u00069"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;", "", "", "type", "pushId", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "syncContent", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "syncRecallContent", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IIILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "component4", "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "copy", "(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getType", "getType$annotations", "()V", "getPushId", "getPushId$annotations", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "getSyncContent", "getSyncContent$annotations", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "getSyncRecallContent", "getSyncRecallContent$annotations", "Companion", "SyncContent", "SyncRecallOperateInfo", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final /* data */ class InfoSyncPush {
    private final int pushId;
    private final SyncContent syncContent;
    private final SyncRecallOperateInfo syncRecallContent;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ InfoSyncPush(int i, int i2, int i3, SyncContent syncContent, SyncRecallOperateInfo syncRecallOperateInfo, AbstractC7136 abstractC7136) {
        if ((i & 1) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
        if ((i & 2) == 0) {
            this.pushId = 0;
        } else {
            this.pushId = i3;
        }
        if ((i & 4) == 0) {
            this.syncContent = null;
        } else {
            this.syncContent = syncContent;
        }
        if ((i & 8) == 0) {
            this.syncRecallContent = null;
        } else {
            this.syncRecallContent = syncRecallOperateInfo;
        }
    }

    public static /* synthetic */ InfoSyncPush copy$default(InfoSyncPush infoSyncPush, int i, int i2, SyncContent syncContent, SyncRecallOperateInfo syncRecallOperateInfo, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = infoSyncPush.type;
        }
        if ((i3 & 2) != 0) {
            i2 = infoSyncPush.pushId;
        }
        if ((i3 & 4) != 0) {
            syncContent = infoSyncPush.syncContent;
        }
        if ((i3 & 8) != 0) {
            syncRecallOperateInfo = infoSyncPush.syncRecallContent;
        }
        return infoSyncPush.copy(i, i2, syncContent, syncRecallOperateInfo);
    }

    public static final /* synthetic */ void write$Self$app_publishRelease(InfoSyncPush self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
        if (output.mo10671(serialDesc) || self.type != 0) {
            output.mo6805(0, self.type, serialDesc);
        }
        if (output.mo10671(serialDesc) || self.pushId != 0) {
            output.mo6805(1, self.pushId, serialDesc);
        }
        if (output.mo10671(serialDesc) || self.syncContent != null) {
            output.mo6807(serialDesc, 2, InfoSyncPush$SyncContent$$serializer.INSTANCE, self.syncContent);
        }
        if (!output.mo10671(serialDesc) && self.syncRecallContent == null) {
            return;
        }
        output.mo6807(serialDesc, 3, InfoSyncPush$SyncRecallOperateInfo$$serializer.INSTANCE, self.syncRecallContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPushId() {
        return this.pushId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SyncContent getSyncContent() {
        return this.syncContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SyncRecallOperateInfo getSyncRecallContent() {
        return this.syncRecallContent;
    }

    public final InfoSyncPush copy(int type, int pushId, SyncContent syncContent, SyncRecallOperateInfo syncRecallContent) {
        return new InfoSyncPush(type, pushId, syncContent, syncRecallContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoSyncPush)) {
            return false;
        }
        InfoSyncPush infoSyncPush = (InfoSyncPush) other;
        return this.type == infoSyncPush.type && this.pushId == infoSyncPush.pushId && AbstractC4394.m8917(this.syncContent, infoSyncPush.syncContent) && AbstractC4394.m8917(this.syncRecallContent, infoSyncPush.syncRecallContent);
    }

    public final int getPushId() {
        return this.pushId;
    }

    public final SyncContent getSyncContent() {
        return this.syncContent;
    }

    public final SyncRecallOperateInfo getSyncRecallContent() {
        return this.syncRecallContent;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iM143 = AbstractC0053.m143(this.pushId, Integer.hashCode(this.type) * 31, 31);
        SyncContent syncContent = this.syncContent;
        int iHashCode = (iM143 + (syncContent == null ? 0 : syncContent.hashCode())) * 31;
        SyncRecallOperateInfo syncRecallOperateInfo = this.syncRecallContent;
        return iHashCode + (syncRecallOperateInfo != null ? syncRecallOperateInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InfoSyncPush(type=");
        AbstractC6136.m11533(sb, this.type, -3937699108811441575L);
        AbstractC6136.m11533(sb, this.pushId, -3937699048681899431L);
        sb.append(this.syncContent);
        sb.append(", syncRecallContent=");
        sb.append(this.syncRecallContent);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @InterfaceC7180
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "", "", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent;", "groupSyncContent", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILjava/util/List;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGroupSyncContent", "getGroupSyncContent$annotations", "()V", "Companion", "GroupSyncContent", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final /* data */ class SyncContent {
        private final List<GroupSyncContent> groupSyncContent;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC5183[] $childSerializers = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C7166(29))};

        public SyncContent(List<GroupSyncContent> list) {
            "groupSyncContent";
            list.getClass();
            this.groupSyncContent = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC7183 _childSerializers$_anonymous_() {
            return new C7102(InfoSyncPush$SyncContent$GroupSyncContent$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SyncContent copy$default(SyncContent syncContent, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = syncContent.groupSyncContent;
            }
            return syncContent.copy(list);
        }

        public static final void write$Self$app_publishRelease(SyncContent self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
            InterfaceC5183[] interfaceC5183Arr = $childSerializers;
            if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.groupSyncContent, EmptyList.INSTANCE)) {
                return;
            }
            output.mo6791(serialDesc, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), self.groupSyncContent);
        }

        public final List<GroupSyncContent> component1() {
            return this.groupSyncContent;
        }

        public final SyncContent copy(List<GroupSyncContent> groupSyncContent) {
            "groupSyncContent";
            groupSyncContent.getClass();
            return new SyncContent(groupSyncContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SyncContent) && AbstractC4394.m8917(this.groupSyncContent, ((SyncContent) other).groupSyncContent);
        }

        public final List<GroupSyncContent> getGroupSyncContent() {
            return this.groupSyncContent;
        }

        public int hashCode() {
            return this.groupSyncContent.hashCode();
        }

        public String toString() {
            return "SyncContent(groupSyncContent=" + this.groupSyncContent + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent;", "", "", "groupPeerId", "", "startSeq", "endSeq", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage;", "qqMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIILjava/util/List;)V", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJIILjava/util/List;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "copy", "(JIILjava/util/List;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getGroupPeerId", "getGroupPeerId$annotations", "()V", "I", "getStartSeq", "getStartSeq$annotations", "getEndSeq", "getEndSeq$annotations", "Ljava/util/List;", "getQqMessage", "getQqMessage$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class GroupSyncContent {
            private final int endSeq;
            private final long groupPeerId;
            private final List<QQMessage> qqMessage;
            private final int startSeq;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;
            private static final InterfaceC5183[] $childSerializers = {null, null, null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(0))};

            public GroupSyncContent(int i, long j, int i2, int i3, List list, AbstractC7136 abstractC7136) {
                this.groupPeerId = (i & 1) == 0 ? 0L : j;
                if ((i & 2) == 0) {
                    this.startSeq = 0;
                } else {
                    this.startSeq = i2;
                }
                if ((i & 4) == 0) {
                    this.endSeq = 0;
                } else {
                    this.endSeq = i3;
                }
                if ((i & 8) == 0) {
                    this.qqMessage = EmptyList.INSTANCE;
                } else {
                    this.qqMessage = list;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC7183 _childSerializers$_anonymous_() {
                return new C7102(QQMessage$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GroupSyncContent copy$default(GroupSyncContent groupSyncContent, long j, int i, int i2, List list, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    j = groupSyncContent.groupPeerId;
                }
                long j2 = j;
                if ((i3 & 2) != 0) {
                    i = groupSyncContent.startSeq;
                }
                int i4 = i;
                if ((i3 & 4) != 0) {
                    i2 = groupSyncContent.endSeq;
                }
                int i5 = i2;
                if ((i3 & 8) != 0) {
                    list = groupSyncContent.qqMessage;
                }
                return groupSyncContent.copy(j2, i4, i5, list);
            }

            public static final void write$Self$app_publishRelease(GroupSyncContent self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                InterfaceC5183[] interfaceC5183Arr = $childSerializers;
                if (output.mo10671(serialDesc) || self.groupPeerId != 0) {
                    output.mo6796(serialDesc, 0, self.groupPeerId);
                }
                if (output.mo10671(serialDesc) || self.startSeq != 0) {
                    output.mo6805(1, self.startSeq, serialDesc);
                }
                if (output.mo10671(serialDesc) || self.endSeq != 0) {
                    output.mo6805(2, self.endSeq, serialDesc);
                }
                if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.qqMessage, EmptyList.INSTANCE)) {
                    return;
                }
                output.mo6791(serialDesc, 3, (InterfaceC7183) interfaceC5183Arr[3].getValue(), self.qqMessage);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getGroupPeerId() {
                return this.groupPeerId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getStartSeq() {
                return this.startSeq;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getEndSeq() {
                return this.endSeq;
            }

            public final List<QQMessage> component4() {
                return this.qqMessage;
            }

            public final GroupSyncContent copy(long groupPeerId, int startSeq, int endSeq, List<QQMessage> qqMessage) {
                "qqMessage";
                qqMessage.getClass();
                return new GroupSyncContent(groupPeerId, startSeq, endSeq, qqMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GroupSyncContent)) {
                    return false;
                }
                GroupSyncContent groupSyncContent = (GroupSyncContent) other;
                return this.groupPeerId == groupSyncContent.groupPeerId && this.startSeq == groupSyncContent.startSeq && this.endSeq == groupSyncContent.endSeq && AbstractC4394.m8917(this.qqMessage, groupSyncContent.qqMessage);
            }

            public final int getEndSeq() {
                return this.endSeq;
            }

            public final long getGroupPeerId() {
                return this.groupPeerId;
            }

            public final List<QQMessage> getQqMessage() {
                return this.qqMessage;
            }

            public final int getStartSeq() {
                return this.startSeq;
            }

            public int hashCode() {
                return this.qqMessage.hashCode() + AbstractC0053.m143(this.endSeq, AbstractC0053.m143(this.startSeq, Long.hashCode(this.groupPeerId) * 31, 31), 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GroupSyncContent(groupPeerId=");
                AbstractC6136.m11532(sb, this.groupPeerId, -3937701230525285799L);
                AbstractC6136.m11533(sb, this.startSeq, -3937701178985678247L);
                AbstractC6136.m11533(sb, this.endSeq, -3937701084496397735L);
                sb.append(this.qqMessage);
                sb.append(')');
                return sb.toString();
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$GroupSyncContent;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return InfoSyncPush$SyncContent$GroupSyncContent$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC6307(number = 5)
            public static /* synthetic */ void getEndSeq$annotations() {
            }

            @InterfaceC6307(number = 3)
            public static /* synthetic */ void getGroupPeerId$annotations() {
            }

            @InterfaceC6307(number = 6)
            public static /* synthetic */ void getQqMessage$annotations() {
            }

            @InterfaceC6307(number = 4)
            public static /* synthetic */ void getStartSeq$annotations() {
            }

            public GroupSyncContent() {
                this(0L, 0, 0, (List) null, 15, (AbstractC4384) null);
            }

            public GroupSyncContent(long j, int i, int i2, List<QQMessage> list) {
                "qqMessage";
                list.getClass();
                this.groupPeerId = j;
                this.startSeq = i;
                this.endSeq = i2;
                this.qqMessage = list;
            }

            public GroupSyncContent(long j, int i, int i2, List list, int i3, AbstractC4384 abstractC4384) {
                this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? EmptyList.INSTANCE : list);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                this();
            }

            public final InterfaceC7183 serializer() {
                return InfoSyncPush$SyncContent$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public SyncContent(int i, List list, AbstractC7136 abstractC7136) {
            if ((i & 1) == 0) {
                this.groupSyncContent = EmptyList.INSTANCE;
            } else {
                this.groupSyncContent = list;
            }
        }

        public SyncContent() {
            this((List) null, 1, (AbstractC4384) null);
        }

        @InterfaceC6307(number = 3)
        public static /* synthetic */ void getGroupSyncContent$annotations() {
        }

        public SyncContent(List list, int i, AbstractC4384 abstractC4384) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @InterfaceC7180
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00042341B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u0019¨\u00065"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "syncInfoHead", "", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;", "syncInfoBodyList", "subHead", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(ILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "getSyncInfoHead", "getSyncInfoHead$annotations", "()V", "Ljava/util/List;", "getSyncInfoBodyList", "getSyncInfoBodyList$annotations", "getSubHead", "getSubHead$annotations", "Companion", "SyncInfoHead", "SyncInfoBody", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final /* data */ class SyncRecallOperateInfo {
        private final SyncInfoHead subHead;
        private final List<SyncInfoBody> syncInfoBodyList;
        private final SyncInfoHead syncInfoHead;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC5183[] $childSerializers = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(1)), null};

        public SyncRecallOperateInfo(int i, SyncInfoHead syncInfoHead, List list, SyncInfoHead syncInfoHead2, AbstractC7136 abstractC7136) {
            if ((i & 1) == 0) {
                this.syncInfoHead = null;
            } else {
                this.syncInfoHead = syncInfoHead;
            }
            if ((i & 2) == 0) {
                this.syncInfoBodyList = EmptyList.INSTANCE;
            } else {
                this.syncInfoBodyList = list;
            }
            if ((i & 4) == 0) {
                this.subHead = null;
            } else {
                this.subHead = syncInfoHead2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC7183 _childSerializers$_anonymous_() {
            return new C7102(InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SyncRecallOperateInfo copy$default(SyncRecallOperateInfo syncRecallOperateInfo, SyncInfoHead syncInfoHead, List list, SyncInfoHead syncInfoHead2, int i, Object obj) {
            if ((i & 1) != 0) {
                syncInfoHead = syncRecallOperateInfo.syncInfoHead;
            }
            if ((i & 2) != 0) {
                list = syncRecallOperateInfo.syncInfoBodyList;
            }
            if ((i & 4) != 0) {
                syncInfoHead2 = syncRecallOperateInfo.subHead;
            }
            return syncRecallOperateInfo.copy(syncInfoHead, list, syncInfoHead2);
        }

        public static final void write$Self$app_publishRelease(SyncRecallOperateInfo self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
            InterfaceC5183[] interfaceC5183Arr = $childSerializers;
            if (output.mo10671(serialDesc) || self.syncInfoHead != null) {
                output.mo6807(serialDesc, 0, InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer.INSTANCE, self.syncInfoHead);
            }
            if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.syncInfoBodyList, EmptyList.INSTANCE)) {
                output.mo6791(serialDesc, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), self.syncInfoBodyList);
            }
            if (!output.mo10671(serialDesc) && self.subHead == null) {
                return;
            }
            output.mo6807(serialDesc, 2, InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer.INSTANCE, self.subHead);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SyncInfoHead getSyncInfoHead() {
            return this.syncInfoHead;
        }

        public final List<SyncInfoBody> component2() {
            return this.syncInfoBodyList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final SyncInfoHead getSubHead() {
            return this.subHead;
        }

        public final SyncRecallOperateInfo copy(SyncInfoHead syncInfoHead, List<SyncInfoBody> syncInfoBodyList, SyncInfoHead subHead) {
            "syncInfoBodyList";
            syncInfoBodyList.getClass();
            return new SyncRecallOperateInfo(syncInfoHead, syncInfoBodyList, subHead);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncRecallOperateInfo)) {
                return false;
            }
            SyncRecallOperateInfo syncRecallOperateInfo = (SyncRecallOperateInfo) other;
            return AbstractC4394.m8917(this.syncInfoHead, syncRecallOperateInfo.syncInfoHead) && AbstractC4394.m8917(this.syncInfoBodyList, syncRecallOperateInfo.syncInfoBodyList) && AbstractC4394.m8917(this.subHead, syncRecallOperateInfo.subHead);
        }

        public final SyncInfoHead getSubHead() {
            return this.subHead;
        }

        public final List<SyncInfoBody> getSyncInfoBodyList() {
            return this.syncInfoBodyList;
        }

        public final SyncInfoHead getSyncInfoHead() {
            return this.syncInfoHead;
        }

        public int hashCode() {
            SyncInfoHead syncInfoHead = this.syncInfoHead;
            int iM159 = AbstractC0053.m159(this.syncInfoBodyList, (syncInfoHead == null ? 0 : syncInfoHead.hashCode()) * 31, 31);
            SyncInfoHead syncInfoHead2 = this.subHead;
            return iM159 + (syncInfoHead2 != null ? syncInfoHead2.hashCode() : 0);
        }

        public String toString() {
            return "SyncRecallOperateInfo(syncInfoHead=" + this.syncInfoHead + ", syncInfoBodyList=" + this.syncInfoBodyList + ", subHead=" + this.subHead + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001bR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010 ¨\u00068"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;", "", "", "senderPeerId", "", "senderUid", "eventTime", "", "Ltop/suzhelan/qstory/entity/proto/QQMessage;", "msgList", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;JLjava/util/List;)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJLjava/lang/String;JLjava/util/List;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(JLjava/lang/String;JLjava/util/List;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSenderPeerId", "getSenderPeerId$annotations", "()V", "Ljava/lang/String;", "getSenderUid", "getSenderUid$annotations", "getEventTime", "getEventTime$annotations", "Ljava/util/List;", "getMsgList", "getMsgList$annotations", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class SyncInfoBody {
            private final long eventTime;
            private final List<QQMessage> msgList;
            private final long senderPeerId;
            private final String senderUid;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;
            private static final InterfaceC5183[] $childSerializers = {null, null, null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(2))};

            public SyncInfoBody(int i, long j, String str, long j2, List list, AbstractC7136 abstractC7136) {
                if ((i & 1) == 0) {
                    this.senderPeerId = 0L;
                } else {
                    this.senderPeerId = j;
                }
                if ((i & 2) == 0) {
                    this.senderUid = "";
                } else {
                    this.senderUid = str;
                }
                if ((i & 4) == 0) {
                    this.eventTime = 0L;
                } else {
                    this.eventTime = j2;
                }
                if ((i & 8) == 0) {
                    this.msgList = EmptyList.INSTANCE;
                } else {
                    this.msgList = list;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ InterfaceC7183 _childSerializers$_anonymous_() {
                return new C7102(QQMessage$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SyncInfoBody copy$default(SyncInfoBody syncInfoBody, long j, String str, long j2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = syncInfoBody.senderPeerId;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    str = syncInfoBody.senderUid;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    j2 = syncInfoBody.eventTime;
                }
                long j4 = j2;
                if ((i & 8) != 0) {
                    list = syncInfoBody.msgList;
                }
                return syncInfoBody.copy(j3, str2, j4, list);
            }

            public static final void write$Self$app_publishRelease(SyncInfoBody self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                InterfaceC5183[] interfaceC5183Arr = $childSerializers;
                if (output.mo10671(serialDesc) || self.senderPeerId != 0) {
                    output.mo6796(serialDesc, 0, self.senderPeerId);
                }
                if (output.mo10671(serialDesc) || !AbstractC4394.m8917(self.senderUid, "")) {
                    output.mo6814(serialDesc, 1, self.senderUid);
                }
                if (output.mo10671(serialDesc) || self.eventTime != 0) {
                    output.mo6796(serialDesc, 2, self.eventTime);
                }
                if (!output.mo10671(serialDesc) && AbstractC4394.m8917(self.msgList, EmptyList.INSTANCE)) {
                    return;
                }
                output.mo6791(serialDesc, 3, (InterfaceC7183) interfaceC5183Arr[3].getValue(), self.msgList);
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
            public final long getEventTime() {
                return this.eventTime;
            }

            public final List<QQMessage> component4() {
                return this.msgList;
            }

            public final SyncInfoBody copy(long senderPeerId, String senderUid, long eventTime, List<QQMessage> msgList) {
                AbstractC6136.m11546(-3937694487426631079L, -3937700152488494503L, senderUid);
                msgList.getClass();
                return new SyncInfoBody(senderPeerId, senderUid, eventTime, msgList);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SyncInfoBody)) {
                    return false;
                }
                SyncInfoBody syncInfoBody = (SyncInfoBody) other;
                return this.senderPeerId == syncInfoBody.senderPeerId && AbstractC4394.m8917(this.senderUid, syncInfoBody.senderUid) && this.eventTime == syncInfoBody.eventTime && AbstractC4394.m8917(this.msgList, syncInfoBody.msgList);
            }

            public final long getEventTime() {
                return this.eventTime;
            }

            public final List<QQMessage> getMsgList() {
                return this.msgList;
            }

            public final long getSenderPeerId() {
                return this.senderPeerId;
            }

            public final String getSenderUid() {
                return this.senderUid;
            }

            public int hashCode() {
                return this.msgList.hashCode() + AbstractC0053.m141(AbstractC6136.m11539(Long.hashCode(this.senderPeerId) * 31, 31, this.senderUid), 31, this.eventTime);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncInfoBody(senderPeerId=");
                AbstractC6136.m11532(sb, this.senderPeerId, -3937694427297088935L);
                AbstractC6136.m11531(sb, this.senderUid, -3937699993574704551L);
                AbstractC6136.m11532(sb, this.eventTime, -3937699946330064295L);
                sb.append(this.msgList);
                sb.append(')');
                return sb.toString();
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC6307(number = 5)
            public static /* synthetic */ void getEventTime$annotations() {
            }

            @InterfaceC6307(number = 8)
            public static /* synthetic */ void getMsgList$annotations() {
            }

            @InterfaceC6307(number = 1)
            public static /* synthetic */ void getSenderPeerId$annotations() {
            }

            @InterfaceC6307(number = 2)
            public static /* synthetic */ void getSenderUid$annotations() {
            }

            public SyncInfoBody(long j, String str, long j2, List<QQMessage> list) {
                AbstractC6136.m11546(-3937694487426631079L, -3937700152488494503L, str);
                list.getClass();
                this.senderPeerId = j;
                this.senderUid = str;
                this.eventTime = j2;
                this.msgList = list;
            }

            public SyncInfoBody() {
                this(0L, (String) null, 0L, (List) null, 15, (AbstractC4384) null);
            }

            public SyncInfoBody(long j, String str, long j2, List list, int i, AbstractC4384 abstractC4384) {
                this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? EmptyList.INSTANCE : list);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @InterfaceC7180
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "", "", "syncTime", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(J)V", "", "seen0", "L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;", "serializationConstructorMarker", "(IJL飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V", "self", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;", "output", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "serialDesc", "Lkotlin/飘花落叶言子楪兰苏哲世;", "write$Self$app_publishRelease", "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V", "write$Self", "component1", "()J", "copy", "(J)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSyncTime", "getSyncTime$annotations", "()V", "Companion", "$serializer", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final /* data */ class SyncInfoHead {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final long syncTime;

            public /* synthetic */ SyncInfoHead(int i, long j, AbstractC7136 abstractC7136) {
                if ((i & 1) == 0) {
                    this.syncTime = 0L;
                } else {
                    this.syncTime = j;
                }
            }

            public static /* synthetic */ SyncInfoHead copy$default(SyncInfoHead syncInfoHead, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = syncInfoHead.syncTime;
                }
                return syncInfoHead.copy(j);
            }

            public static final /* synthetic */ void write$Self$app_publishRelease(SyncInfoHead self, InterfaceC7187 output, InterfaceC7190 serialDesc) {
                if (!output.mo10671(serialDesc) && self.syncTime == 0) {
                    return;
                }
                output.mo6796(serialDesc, 0, self.syncTime);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getSyncTime() {
                return this.syncTime;
            }

            public final SyncInfoHead copy(long syncTime) {
                return new SyncInfoHead(syncTime);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SyncInfoHead) && this.syncTime == ((SyncInfoHead) other).syncTime;
            }

            public final long getSyncTime() {
                return this.syncTime;
            }

            public int hashCode() {
                return Long.hashCode(this.syncTime);
            }

            public String toString() {
                return "SyncInfoHead(syncTime=" + this.syncTime + ')';
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                    this();
                }

                public final InterfaceC7183 serializer() {
                    return InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public SyncInfoHead() {
                this(0L, 1, (AbstractC4384) null);
            }

            public SyncInfoHead(long j) {
                this.syncTime = j;
            }

            public /* synthetic */ SyncInfoHead(long j, int i, AbstractC4384 abstractC4384) {
                this((i & 1) != 0 ? 0L : j);
            }

            @InterfaceC6307(number = 1)
            public static /* synthetic */ void getSyncTime$annotations() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
                this();
            }

            public final InterfaceC7183 serializer() {
                return InfoSyncPush$SyncRecallOperateInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC6307(number = 5)
        public static /* synthetic */ void getSubHead$annotations() {
        }

        @InterfaceC6307(number = 4)
        public static /* synthetic */ void getSyncInfoBodyList$annotations() {
        }

        @InterfaceC6307(number = 3)
        public static /* synthetic */ void getSyncInfoHead$annotations() {
        }

        public SyncRecallOperateInfo() {
            this((SyncInfoHead) null, (List) null, (SyncInfoHead) null, 7, (AbstractC4384) null);
        }

        public SyncRecallOperateInfo(SyncInfoHead syncInfoHead, List<SyncInfoBody> list, SyncInfoHead syncInfoHead2) {
            "syncInfoBodyList";
            list.getClass();
            this.syncInfoHead = syncInfoHead;
            this.syncInfoBodyList = list;
            this.subHead = syncInfoHead2;
        }

        public SyncRecallOperateInfo(SyncInfoHead syncInfoHead, List list, SyncInfoHead syncInfoHead2, int i, AbstractC4384 abstractC4384) {
            this((i & 1) != 0 ? null : syncInfoHead, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : syncInfoHead2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;", "serializer", "()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4384 abstractC4384) {
            this();
        }

        public final InterfaceC7183 serializer() {
            return InfoSyncPush$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC6307(number = 4)
    public static /* synthetic */ void getPushId$annotations() {
    }

    @InterfaceC6307(number = 7)
    public static /* synthetic */ void getSyncContent$annotations() {
    }

    @InterfaceC6307(number = 8)
    public static /* synthetic */ void getSyncRecallContent$annotations() {
    }

    @InterfaceC6307(number = 3)
    public static /* synthetic */ void getType$annotations() {
    }

    public InfoSyncPush() {
        this(0, 0, (SyncContent) null, (SyncRecallOperateInfo) null, 15, (AbstractC4384) null);
    }

    public InfoSyncPush(int i, int i2, SyncContent syncContent, SyncRecallOperateInfo syncRecallOperateInfo) {
        this.type = i;
        this.pushId = i2;
        this.syncContent = syncContent;
        this.syncRecallContent = syncRecallOperateInfo;
    }

    public /* synthetic */ InfoSyncPush(int i, int i2, SyncContent syncContent, SyncRecallOperateInfo syncRecallOperateInfo, int i3, AbstractC4384 abstractC4384) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : syncContent, (i3 & 8) != 0 ? null : syncRecallOperateInfo);
    }
}
