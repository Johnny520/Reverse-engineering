package top.suzhelan.plugin.sdk.online.net;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p015.AbstractC6201;
import p015.AbstractC6206;
import p015.C6218;
import p384.InterfaceC9062;
import p384.InterfaceC9063;
import p384.InterfaceC9065;
import p384.InterfaceC9068;
import p384.InterfaceC9069;
import p384.InterfaceC9070;
import p384.InterfaceC9076;
import p384.InterfaceC9078;
import p384.InterfaceC9083;
import p388.C9099;
import p388.C9102;
import p388.C9105;
import retrofit2.InterfaceC5777;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0005H'¢\u0006\u0004\b\u0014\u0010\u0011Ja\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0005H'¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\b\u001a\u00020\u001f2\b\b\u0001\u0010\u0017\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J9\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\"\u001a\u00020\u00152\b\b\u0003\u0010#\u001a\u00020\u0015H'¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b'\u0010\u0011J;\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010(\u001a\u00020\u00152\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b+\u0010,J1\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b-\u0010\u0011¨\u0006.À\u0006\u0003"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "", "getTags", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "uin", "sort", "tag", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;", "getOnlinePluginList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "cloudId", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;", "download", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "pluginId", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;", "getComments", "", "replyId", "nickname", "content", "ts", "sign", "addComment", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;", "file", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;", "uploadFile", "(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "page", "pageSize", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世哲兰苏;", "getMessages", "(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;", "getUnreadCount", "id", "", "", "markMessageRead", "(ILjava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "markAllMessagesRead", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ApiService {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC5777 getMessages$default(ApiService apiService, String str, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: getMessages");
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

    static /* synthetic */ InterfaceC5777 getOnlinePluginList$default(ApiService apiService, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: getOnlinePluginList");
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

    @InterfaceC9078("comment/add")
    @InterfaceC9063
    InterfaceC5777<QSResult<String>> addComment(@InterfaceC9065("pluginId") String pluginId, @InterfaceC9065("replyId") int replyId, @InterfaceC9065("nickname") String nickname, @InterfaceC9065("uin") String uin, @InterfaceC9065("content") String content, @InterfaceC9065("ts") String ts, @InterfaceC9065("sign") String sign);

    @InterfaceC9070
    @InterfaceC9062("plugins/files/{cloudId}")
    InterfaceC5777<AbstractC6201> download(@InterfaceC9069("cloudId") String cloudId);

    @InterfaceC9062("comment/get")
    InterfaceC5777<QSResult<List<C9105>>> getComments(@InterfaceC9068("pluginId") String pluginId);

    @InterfaceC9062("messages/list")
    InterfaceC5777<QSResult<C9102>> getMessages(@InterfaceC9068("uin") String uin, @InterfaceC9068("page") int page, @InterfaceC9068("pageSize") int pageSize);

    @InterfaceC9062("plugins")
    InterfaceC5777<QSResult<List<C9099>>> getOnlinePluginList(@InterfaceC9068("uin") String uin, @InterfaceC9068("sort") String sort, @InterfaceC9068("tag") String tag);

    @InterfaceC9062("tags")
    InterfaceC5777<QSResult<List<String>>> getTags();

    @InterfaceC9062("messages/unread-count")
    InterfaceC5777<QSResult<Integer>> getUnreadCount(@InterfaceC9068("uin") String uin);

    @InterfaceC9078("messages/read-all")
    @InterfaceC9063
    InterfaceC5777<QSResult<Map<String, Boolean>>> markAllMessagesRead(@InterfaceC9065("uin") String uin);

    @InterfaceC9078("messages/read/{id}")
    @InterfaceC9063
    InterfaceC5777<QSResult<Map<String, Boolean>>> markMessageRead(@InterfaceC9069("id") int id, @InterfaceC9065("uin") String uin);

    @InterfaceC9083
    @InterfaceC9078("upload")
    InterfaceC5777<QSResult<String>> uploadFile(@InterfaceC9076 C6218 file, @InterfaceC9076("uin") AbstractC6206 uin, @InterfaceC9076("nickname") AbstractC6206 nickname);
}
