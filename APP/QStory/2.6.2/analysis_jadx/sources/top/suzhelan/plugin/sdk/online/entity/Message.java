package top.suzhelan.plugin.sdk.online.entity;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p267.InterfaceC8264;
import p388.C9103;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0011\u0010!R\u001a\u0010$\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006&"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/entity/Message;", "", "", "飘花落叶言子楪世苏哲兰", "I", "飘花落叶言子楪世兰苏哲", "()I", "id", "", "飘花落叶言子楪世苏兰哲", "Ljava/lang/String;", "getUin", "()Ljava/lang/String;", "uin", "飘花落叶言子楪世哲苏兰", "飘花落叶言子楪苏世哲兰", "type", "飘花落叶言子楪世哲兰苏", "飘花落叶言子楪世兰哲苏", "title", "content", "getRelatedId", "relatedId", "getRelatedType", "relatedType", "", "飘花落叶言子楪苏世兰哲", "Z", "飘花落叶言子楪苏哲世兰", "()Z", "isRead", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世哲苏兰;", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世哲苏兰;", "()L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世哲苏兰;", "extraData", "飘花落叶言子楪苏哲兰世", "createdAt", "Type", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Message {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("relatedId")
    private final String relatedId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("content")
    private final String content;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("title")
    private final String title;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("type")
    private final int type;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("uin")
    private final String uin;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("id")
    private final int id;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("isRead")
    private final boolean isRead = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("relatedType")
    private final String relatedType;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("extraData")
    private final C9103 extraData;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("createdAt")
    private final String createdAt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;", "", "", "value", "", "displayName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getValue", "()I", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "Companion", "top/suzhelan/plugin/sdk/online/entity/飘花落叶言子楪世苏哲兰", "UPLOAD_SUCCESS", "APPROVAL_PASS", "APPROVAL_REJECT", "COMMENT_REPLY", "NEW_COMMENT", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ InterfaceC4364 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final C5802 Companion;
        private final String displayName;
        private final int value;
        public static final Type UPLOAD_SUCCESS = new Type("UPLOAD_SUCCESS", 0, 1, "脚本上传成功");
        public static final Type APPROVAL_PASS = new Type("APPROVAL_PASS", 1, 2, "审核通过");
        public static final Type APPROVAL_REJECT = new Type("APPROVAL_REJECT", 2, 3, "审核拒绝");
        public static final Type COMMENT_REPLY = new Type("COMMENT_REPLY", 3, 4, "评论被回复");
        public static final Type NEW_COMMENT = new Type("NEW_COMMENT", 4, 5, "脚本收到新评论");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UPLOAD_SUCCESS, APPROVAL_PASS, APPROVAL_REJECT, COMMENT_REPLY, NEW_COMMENT};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = AbstractC4363.m8876(typeArr$values);
            Companion = new C5802();
        }

        private Type(String str, int i, int i2, String str2) {
            this.value = i2;
            this.displayName = str2;
        }

        public static InterfaceC4364 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public Message(int i, String str, int i2, String str2, String str3, String str4, String str5, C9103 c9103, String str6) {
        this.id = i;
        this.uin = str;
        this.type = i2;
        this.title = str2;
        this.content = str3;
        this.relatedId = str4;
        this.relatedType = str5;
        this.extraData = c9103;
        this.createdAt = str6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Message m11148(Message message) {
        int i = message.id;
        String str = message.uin;
        int i2 = message.type;
        String str2 = message.title;
        String str3 = message.content;
        String str4 = message.relatedId;
        String str5 = message.relatedType;
        C9103 c9103 = message.extraData;
        String str6 = message.createdAt;
        message.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        return new Message(i, str, i2, str2, str3, str4, str5, c9103, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return this.id == message.id && AbstractC4394.m8917(this.uin, message.uin) && this.type == message.type && AbstractC4394.m8917(this.title, message.title) && AbstractC4394.m8917(this.content, message.content) && AbstractC4394.m8917(this.relatedId, message.relatedId) && AbstractC4394.m8917(this.relatedType, message.relatedType) && this.isRead == message.isRead && AbstractC4394.m8917(this.extraData, message.extraData) && AbstractC4394.m8917(this.createdAt, message.createdAt);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(AbstractC6136.m11539(AbstractC0053.m143(this.type, AbstractC6136.m11539(Integer.hashCode(this.id) * 31, 31, this.uin), 31), 31, this.title), 31, this.content);
        String str = this.relatedId;
        int iHashCode = (iM11539 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.relatedType;
        int iM140 = AbstractC0053.m140((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRead);
        C9103 c9103 = this.extraData;
        return this.createdAt.hashCode() + ((iM140 + (c9103 != null ? c9103.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = this.id;
        String str = this.uin;
        int i2 = this.type;
        String str2 = this.title;
        String str3 = this.content;
        String str4 = this.relatedId;
        String str5 = this.relatedType;
        boolean z = this.isRead;
        C9103 c9103 = this.extraData;
        String str6 = this.createdAt;
        StringBuilder sb = new StringBuilder("Message(id=");
        sb.append(i);
        sb.append(", uin=");
        sb.append(str);
        sb.append(", type=");
        sb.append(i2);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", content=");
        AbstractC6136.m11530(sb, str3, ", relatedId=", str4, ", relatedType=");
        sb.append(str5);
        sb.append(", isRead=");
        sb.append(z);
        sb.append(", extraData=");
        sb.append(c9103);
        sb.append(", createdAt=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from getter */
    public final C9103 getExtraData() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String m11154() {
        Type type;
        String displayName;
        C5802 c5802 = Type.Companion;
        int i = this.type;
        c5802.getClass();
        Type[] typeArrValues = Type.values();
        int length = typeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                type = null;
                break;
            }
            type = typeArrValues[i2];
            if (type.getValue() == i) {
                break;
            }
            i2++;
        }
        return (type == null || (displayName = type.getDisplayName()) == null) ? "未知类型" : displayName;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters and from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }
}
