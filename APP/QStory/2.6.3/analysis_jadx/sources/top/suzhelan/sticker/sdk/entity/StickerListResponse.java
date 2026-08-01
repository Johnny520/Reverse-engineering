package top.suzhelan.sticker.sdk.entity;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p267.InterfaceC8265;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Ltop/suzhelan/sticker/sdk/entity/StickerListResponse;", "", "list", "", "Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;", "total", "", "page", "pageSize", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;III)V", "getList", "()Ljava/util/List;", "getTotal", "()I", "getPage", "getPageSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StickerListResponse {

    @InterfaceC8265("list")
    private final List<OnlineStickerInfo> list;

    @InterfaceC8265("page")
    private final int page;

    @InterfaceC8265("pageSize")
    private final int pageSize;

    @InterfaceC8265("total")
    private final int total;

    public StickerListResponse(List<OnlineStickerInfo> list, int i, int i2, int i3) {
        list.getClass();
        this.list = list;
        this.total = i;
        this.page = i2;
        this.pageSize = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerListResponse copy$default(StickerListResponse stickerListResponse, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = stickerListResponse.list;
        }
        if ((i4 & 2) != 0) {
            i = stickerListResponse.total;
        }
        if ((i4 & 4) != 0) {
            i2 = stickerListResponse.page;
        }
        if ((i4 & 8) != 0) {
            i3 = stickerListResponse.pageSize;
        }
        return stickerListResponse.copy(list, i, i2, i3);
    }

    public final List<OnlineStickerInfo> component1() {
        return this.list;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    public final StickerListResponse copy(List<OnlineStickerInfo> list, int total, int page, int pageSize) {
        list.getClass();
        return new StickerListResponse(list, total, page, pageSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerListResponse)) {
            return false;
        }
        StickerListResponse stickerListResponse = (StickerListResponse) other;
        return AbstractC4395.m8907(this.list, stickerListResponse.list) && this.total == stickerListResponse.total && this.page == stickerListResponse.page && this.pageSize == stickerListResponse.pageSize;
    }

    public final List<OnlineStickerInfo> getList() {
        return this.list;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.pageSize) + AbstractC0053.m144(this.page, AbstractC0053.m144(this.total, this.list.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "StickerListResponse(list=" + this.list + ", total=" + this.total + ", page=" + this.page + ", pageSize=" + this.pageSize + ")";
    }
}
