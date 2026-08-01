package top.suzhelan.sticker.sdk.net;

import java.util.List;
import kotlin.Metadata;
import p015.AbstractC6201;
import p015.AbstractC6206;
import p015.C6218;
import p384.InterfaceC9062;
import p384.InterfaceC9068;
import p384.InterfaceC9069;
import p384.InterfaceC9070;
import p384.InterfaceC9076;
import p384.InterfaceC9078;
import p384.InterfaceC9083;
import p384.InterfaceC9084;
import retrofit2.InterfaceC5777;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.entity.StickerListResponse;
import top.suzhelan.sticker.sdk.entity.TagInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H'¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\t0\b2\b\b\u0003\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0093\u0001\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001e2\b\b\u0001\u0010\"\u001a\u00020!2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerApiService;", "", "", "page", "pageSize", "", "tag", "sort", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/sticker/sdk/net/StickerResult;", "Ltop/suzhelan/sticker/sdk/entity/StickerListResponse;", "getStickerList", "(IILjava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "query", "searchStickers", "(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;", "id", "Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;", "getStickerDetail", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;", "downloadSticker", "limit", "", "Ltop/suzhelan/sticker/sdk/entity/TagInfo;", "getTags", "(I)Lretrofit2/飘花落叶言子楪世兰苏哲;", "signature", "timestamp", "nonce", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;", "archive", "cover", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;", "title", "tags", "uin", "nickname", "description", "author", "uploadSticker", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StickerApiService {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC5777 getStickerList$default(StickerApiService stickerApiService, int i, int i2, String str, String str2, int i3, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: getStickerList");
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

    static /* synthetic */ InterfaceC5777 getTags$default(StickerApiService stickerApiService, int i, int i2, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: getTags");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 20;
        }
        return stickerApiService.getTags(i);
    }

    static /* synthetic */ InterfaceC5777 searchStickers$default(StickerApiService stickerApiService, String str, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: searchStickers");
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

    @InterfaceC9070
    @InterfaceC9062("stickers/{id}/download")
    InterfaceC5777<AbstractC6201> downloadSticker(@InterfaceC9069("id") String id);

    @InterfaceC9062("stickers/{id}")
    InterfaceC5777<StickerResult<OnlineStickerInfo>> getStickerDetail(@InterfaceC9069("id") String id);

    @InterfaceC9062("stickers/")
    InterfaceC5777<StickerResult<StickerListResponse>> getStickerList(@InterfaceC9068("page") int page, @InterfaceC9068("pageSize") int pageSize, @InterfaceC9068("tag") String tag, @InterfaceC9068("sort") String sort);

    @InterfaceC9062("tags/")
    InterfaceC5777<StickerResult<List<TagInfo>>> getTags(@InterfaceC9068("limit") int limit);

    @InterfaceC9062("stickers/search")
    InterfaceC5777<StickerResult<StickerListResponse>> searchStickers(@InterfaceC9068("q") String query, @InterfaceC9068("page") int page, @InterfaceC9068("pageSize") int pageSize);

    @InterfaceC9083
    @InterfaceC9078("stickers/upload")
    InterfaceC5777<StickerResult<OnlineStickerInfo>> uploadSticker(@InterfaceC9084("X-Signature") String signature, @InterfaceC9084("X-Timestamp") String timestamp, @InterfaceC9084("X-Nonce") String nonce, @InterfaceC9076 C6218 archive, @InterfaceC9076 C6218 cover, @InterfaceC9076("title") AbstractC6206 title, @InterfaceC9076("tags") AbstractC6206 tags, @InterfaceC9076("uin") AbstractC6206 uin, @InterfaceC9076("nickname") AbstractC6206 nickname, @InterfaceC9076("description") AbstractC6206 description, @InterfaceC9076("author") AbstractC6206 author);
}
