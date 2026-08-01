package top.suzhelan.sticker.sdk.net;

import java.util.List;
import kotlin.Metadata;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6974;
import p413.InterfaceC9944;
import p413.InterfaceC9950;
import p413.InterfaceC9951;
import p413.InterfaceC9952;
import p413.InterfaceC9958;
import p413.InterfaceC9960;
import p413.InterfaceC9965;
import p413.InterfaceC9966;
import retrofit2.InterfaceC6608;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.entity.TagInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H'¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\t0\b2\b\b\u0003\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0093\u0001\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001e2\b\b\u0001\u0010\"\u001a\u00020!2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, m151d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerApiService;", "", "", "page", "pageSize", "", "tag", "sort", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/sticker/sdk/net/StickerResult;", "Ltop/suzhelan/sticker/sdk/entity/StickerListResponse;", "getStickerList", "(IILjava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "query", "searchStickers", "(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;", "id", "Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;", "getStickerDetail", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;", "downloadSticker", "limit", "", "Ltop/suzhelan/sticker/sdk/entity/TagInfo;", "getTags", "(I)Lretrofit2/飘花落叶言子楪世兰苏哲;", "signature", "timestamp", "nonce", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;", "archive", "cover", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;", "title", "tags", "uin", "nickname", "description", "author", "uploadSticker", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "online-sticker-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public interface StickerApiService {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC6608 getStickerList$default(StickerApiService stickerApiService, int i, int i2, String str, String str2, int i3, Object obj) {
        if (obj != null) {
            C6755.m11867("Super calls with default arguments not supported in this target, function: getStickerList");
            return null;
        }
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 20;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            str2 = "latest";
        }
        return stickerApiService.getStickerList(i, i2, str, str2);
    }

    static /* synthetic */ InterfaceC6608 getTags$default(StickerApiService stickerApiService, int i, int i2, Object obj) {
        if (obj != null) {
            C6755.m11867("Super calls with default arguments not supported in this target, function: getTags");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 20;
        }
        return stickerApiService.getTags(i);
    }

    static /* synthetic */ InterfaceC6608 searchStickers$default(StickerApiService stickerApiService, String str, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C6755.m11867("Super calls with default arguments not supported in this target, function: searchStickers");
            return null;
        }
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        return stickerApiService.searchStickers(str, i, i2);
    }

    @InterfaceC9944("stickers/{id}/download")
    @InterfaceC9952
    InterfaceC6608<AbstractC6957> downloadSticker(@InterfaceC9951("id") String id);

    @InterfaceC9944("stickers/{id}")
    InterfaceC6608<StickerResult<OnlineStickerInfo>> getStickerDetail(@InterfaceC9951("id") String id);

    @InterfaceC9944("stickers/")
    InterfaceC6608<StickerResult<StickerListResponse>> getStickerList(@InterfaceC9950("page") int page, @InterfaceC9950("pageSize") int pageSize, @InterfaceC9950("tag") String tag, @InterfaceC9950("sort") String sort);

    @InterfaceC9944("tags/")
    InterfaceC6608<StickerResult<List<TagInfo>>> getTags(@InterfaceC9950("limit") int limit);

    @InterfaceC9944("stickers/search")
    InterfaceC6608<StickerResult<StickerListResponse>> searchStickers(@InterfaceC9950("q") String query, @InterfaceC9950("page") int page, @InterfaceC9950("pageSize") int pageSize);

    @InterfaceC9965
    @InterfaceC9960("stickers/upload")
    InterfaceC6608<StickerResult<OnlineStickerInfo>> uploadSticker(@InterfaceC9966("X-Signature") String signature, @InterfaceC9966("X-Timestamp") String timestamp, @InterfaceC9966("X-Nonce") String nonce, @InterfaceC9958 C6974 archive, @InterfaceC9958 C6974 cover, @InterfaceC9958("title") AbstractC6962 title, @InterfaceC9958("tags") AbstractC6962 tags, @InterfaceC9958("uin") AbstractC6962 uin, @InterfaceC9958("nickname") AbstractC6962 nickname, @InterfaceC9958("description") AbstractC6962 description, @InterfaceC9958("author") AbstractC6962 author);
}
