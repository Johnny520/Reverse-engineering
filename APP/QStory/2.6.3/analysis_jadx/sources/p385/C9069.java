package p385;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p267.InterfaceC8265;
import top.suzhelan.plugin.sdk.online.entity.Message;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0014"}, d2 = {"L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;", "", "", "Ltop/suzhelan/plugin/sdk/online/entity/Message;", "飘花落叶言子楪世苏哲兰", "Ljava/util/List;", "()Ljava/util/List;", "list", "", "飘花落叶言子楪世苏兰哲", "I", "飘花落叶言子楪世哲苏兰", "()I", "total", "page", "飘花落叶言子楪世哲兰苏", "getPageSize", "pageSize", "飘花落叶言子楪世兰苏哲", "totalPages", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C9069 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("totalPages")
    private final int totalPages;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("pageSize")
    private final int pageSize;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("page")
    private final int page;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("total")
    private final int total;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("list")
    private final List<Message> list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9069)) {
            return false;
        }
        C9069 c9069 = (C9069) obj;
        return AbstractC4395.m8907(this.list, c9069.list) && this.total == c9069.total && this.page == c9069.page && this.pageSize == c9069.pageSize && this.totalPages == c9069.totalPages;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalPages) + AbstractC0053.m144(this.pageSize, AbstractC0053.m144(this.page, AbstractC0053.m144(this.total, this.list.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        List<Message> list = this.list;
        int i = this.total;
        int i2 = this.page;
        int i3 = this.pageSize;
        int i4 = this.totalPages;
        StringBuilder sb = new StringBuilder("MessageListResponse(list=");
        sb.append(list);
        sb.append(", total=");
        sb.append(i);
        sb.append(", page=");
        sb.append(i2);
        sb.append(", pageSize=");
        sb.append(i3);
        sb.append(", totalPages=");
        return AbstractC0053.m147(sb, ")", i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from getter */
    public final List getList() {
        return this.list;
    }
}
