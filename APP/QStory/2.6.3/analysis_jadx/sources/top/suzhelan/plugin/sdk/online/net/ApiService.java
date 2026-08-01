package top.suzhelan.plugin.sdk.online.net;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p007.AbstractC6128;
import p007.AbstractC6133;
import p007.C6145;
import p385.C9066;
import p385.C9069;
import p385.C9072;
import p397.InterfaceC9115;
import p397.InterfaceC9116;
import p397.InterfaceC9118;
import p397.InterfaceC9121;
import p397.InterfaceC9122;
import p397.InterfaceC9123;
import p397.InterfaceC9129;
import p397.InterfaceC9131;
import p397.InterfaceC9136;
import retrofit2.InterfaceC5778;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0005H'¢\u0006\u0004\b\u0014\u0010\u0011Ja\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0005H'¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\b\u001a\u00020\u001f2\b\b\u0001\u0010\u0017\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J9\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\"\u001a\u00020\u00152\b\b\u0003\u0010#\u001a\u00020\u0015H'¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b'\u0010\u0011J;\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010(\u001a\u00020\u00152\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b+\u0010,J1\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b-\u0010\u0011¨\u0006.À\u0006\u0003"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "", "getTags", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "uin", "sort", "tag", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;", "getOnlinePluginList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "cloudId", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;", "download", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "pluginId", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;", "getComments", "", "replyId", "nickname", "content", "ts", "sign", "addComment", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;", "file", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;", "uploadFile", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "page", "pageSize", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;", "getMessages", "(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;", "getUnreadCount", "id", "", "", "markMessageRead", "(ILjava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "markAllMessagesRead", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ApiService {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC5778 getMessages$default(ApiService apiService, String str, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C5925.m11308("Super calls with default arguments not supported in this target, function: getMessages");
            return null;
        }
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        return apiService.getMessages(str, i, i2);
    }

    static /* synthetic */ InterfaceC5778 getOnlinePluginList$default(ApiService apiService, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            C5925.m11308("Super calls with default arguments not supported in this target, function: getOnlinePluginList");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "time";
        }
        if ((i & 4) != 0) {
            str3 = "全部";
        }
        return apiService.getOnlinePluginList(str, str2, str3);
    }

    @InterfaceC9116
    @InterfaceC9131("comment/add")
    InterfaceC5778<QSResult<String>> addComment(@InterfaceC9118("pluginId") String pluginId, @InterfaceC9118("replyId") int replyId, @InterfaceC9118("nickname") String nickname, @InterfaceC9118("uin") String uin, @InterfaceC9118("content") String content, @InterfaceC9118("ts") String ts, @InterfaceC9118("sign") String sign);

    @InterfaceC9115("plugins/files/{cloudId}")
    @InterfaceC9123
    InterfaceC5778<AbstractC6128> download(@InterfaceC9122("cloudId") String cloudId);

    @InterfaceC9115("comment/get")
    InterfaceC5778<QSResult<List<C9072>>> getComments(@InterfaceC9121("pluginId") String pluginId);

    @InterfaceC9115("messages/list")
    InterfaceC5778<QSResult<C9069>> getMessages(@InterfaceC9121("uin") String uin, @InterfaceC9121("page") int page, @InterfaceC9121("pageSize") int pageSize);

    @InterfaceC9115("plugins")
    InterfaceC5778<QSResult<List<C9066>>> getOnlinePluginList(@InterfaceC9121("uin") String uin, @InterfaceC9121("sort") String sort, @InterfaceC9121("tag") String tag);

    @InterfaceC9115("tags")
    InterfaceC5778<QSResult<List<String>>> getTags();

    @InterfaceC9115("messages/unread-count")
    InterfaceC5778<QSResult<Integer>> getUnreadCount(@InterfaceC9121("uin") String uin);

    @InterfaceC9116
    @InterfaceC9131("messages/read-all")
    InterfaceC5778<QSResult<Map<String, Boolean>>> markAllMessagesRead(@InterfaceC9118("uin") String uin);

    @InterfaceC9116
    @InterfaceC9131("messages/read/{id}")
    InterfaceC5778<QSResult<Map<String, Boolean>>> markMessageRead(@InterfaceC9122("id") int id, @InterfaceC9118("uin") String uin);

    @InterfaceC9136
    @InterfaceC9131("upload")
    InterfaceC5778<QSResult<String>> uploadFile(@InterfaceC9129 C6145 file, @InterfaceC9129("uin") AbstractC6133 uin, @InterfaceC9129("nickname") AbstractC6133 nickname);
}
