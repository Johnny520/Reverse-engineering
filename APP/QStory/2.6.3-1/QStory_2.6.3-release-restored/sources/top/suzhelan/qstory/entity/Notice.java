package top.suzhelan.qstory.entity;

import androidx.activity.AbstractC0900;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m151d2 = {"Ltop/suzhelan/qstory/entity/Notice;", "", "content", "", "createTime", "Ljava/time/LocalDateTime;", "operator", "title", "version", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getCreateTime", "()Ljava/time/LocalDateTime;", "getOperator", "getTitle", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final /* data */ class Notice {
    public static final int $stable = 8;
    private final String content;
    private final LocalDateTime createTime;
    private final String operator;
    private final String title;
    private final int version;

    public Notice(String str, LocalDateTime localDateTime, String str2, String str3, int i) {
        "content";
        str.getClass();
        "createTime";
        localDateTime.getClass();
        "operator";
        str2.getClass();
        "title";
        str3.getClass();
        this.content = str;
        this.createTime = localDateTime;
        this.operator = str2;
        this.title = str3;
        this.version = i;
    }

    public static /* synthetic */ Notice copy$default(Notice notice, String str, LocalDateTime localDateTime, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notice.content;
        }
        if ((i2 & 2) != 0) {
            localDateTime = notice.createTime;
        }
        if ((i2 & 4) != 0) {
            str2 = notice.operator;
        }
        if ((i2 & 8) != 0) {
            str3 = notice.title;
        }
        if ((i2 & 16) != 0) {
            i = notice.version;
        }
        int i3 = i;
        String str4 = str2;
        return notice.copy(str, localDateTime, str4, str3, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final Notice copy(String content, LocalDateTime createTime, String operator, String title, int version) {
        "content";
        content.getClass();
        "createTime";
        createTime.getClass();
        "operator";
        operator.getClass();
        "title";
        title.getClass();
        return new Notice(content, createTime, operator, title, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) other;
        return AbstractC5227.m9466(this.content, notice.content) && AbstractC5227.m9466(this.createTime, notice.createTime) && AbstractC5227.m9466(this.operator, notice.operator) && AbstractC5227.m9466(this.title, notice.title) && this.version == notice.version;
    }

    public final String getContent() {
        return this.content;
    }

    public final LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + AbstractC7012.m12131(AbstractC7012.m12131((this.createTime.hashCode() + (this.content.hashCode() * 31)) * 31, 31, this.operator), 31, this.title);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Notice(content=");
        AbstractC7012.m12138(sb, this.content, 1499);
        sb.append(this.createTime);
        sb.append(", operator=");
        AbstractC7012.m12138(sb, this.operator, 1501);
        AbstractC7012.m12138(sb, this.title, 1494);
        return AbstractC0900.m716(sb, this.version, ')');
    }

    public Notice() {
        this(null, null, null, null, 0, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Notice(String str, LocalDateTime localDateTime, String str2, String str3, int i, int i2, AbstractC5217 abstractC5217) {
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            localDateTime = LocalDateTime.now();
            "now(...)";
            localDateTime.getClass();
        }
        this(str, localDateTime, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i);
    }
}
