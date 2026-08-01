package top.suzhelan.plugin.sdk.online.net;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6974;
import p401.C9895;
import p401.C9898;
import p401.C9901;
import p413.InterfaceC9944;
import p413.InterfaceC9945;
import p413.InterfaceC9947;
import p413.InterfaceC9950;
import p413.InterfaceC9951;
import p413.InterfaceC9952;
import p413.InterfaceC9958;
import p413.InterfaceC9960;
import p413.InterfaceC9965;
import retrofit2.InterfaceC6608;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0005H'¢\u0006\u0004\b\u0014\u0010\u0011Ja\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0005H'¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\b\u001a\u00020\u001f2\b\b\u0001\u0010\u0017\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J9\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\"\u001a\u00020\u00152\b\b\u0003\u0010#\u001a\u00020\u0015H'¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b'\u0010\u0011J;\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010(\u001a\u00020\u00152\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b+\u0010,J1\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b-\u0010\u0011¨\u0006.À\u0006\u0003"}, m151d2 = {"Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "", "", "getTags", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "uin", "sort", "tag", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;", "getOnlinePluginList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "cloudId", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;", "download", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "pluginId", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;", "getComments", "", "replyId", "nickname", "content", "ts", "sign", "addComment", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;", "file", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;", "uploadFile", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "page", "pageSize", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;", "getMessages", "(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;", "getUnreadCount", "id", "", "", "markMessageRead", "(ILjava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "markAllMessagesRead", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public interface ApiService {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC6608 getMessages$default(ApiService apiService, String str, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C6755.m11867("Super calls with default arguments not supported in this target, function: getMessages");
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

    static /* synthetic */ InterfaceC6608 getOnlinePluginList$default(ApiService apiService, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            C6755.m11867("Super calls with default arguments not supported in this target, function: getOnlinePluginList");
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

    @InterfaceC9945
    @InterfaceC9960("comment/add")
    InterfaceC6608<QSResult<String>> addComment(@InterfaceC9947("pluginId") String pluginId, @InterfaceC9947("replyId") int replyId, @InterfaceC9947("nickname") String nickname, @InterfaceC9947("uin") String uin, @InterfaceC9947("content") String content, @InterfaceC9947("ts") String ts, @InterfaceC9947("sign") String sign);

    @InterfaceC9944("plugins/files/{cloudId}")
    @InterfaceC9952
    InterfaceC6608<AbstractC6957> download(@InterfaceC9951("cloudId") String cloudId);

    @InterfaceC9944("comment/get")
    InterfaceC6608<QSResult<List<C9901>>> getComments(@InterfaceC9950("pluginId") String pluginId);

    @InterfaceC9944("messages/list")
    InterfaceC6608<QSResult<C9898>> getMessages(@InterfaceC9950("uin") String uin, @InterfaceC9950("page") int page, @InterfaceC9950("pageSize") int pageSize);

    @InterfaceC9944("plugins")
    InterfaceC6608<QSResult<List<C9895>>> getOnlinePluginList(@InterfaceC9950("uin") String uin, @InterfaceC9950("sort") String sort, @InterfaceC9950("tag") String tag);

    @InterfaceC9944("tags")
    InterfaceC6608<QSResult<List<String>>> getTags();

    @InterfaceC9944("messages/unread-count")
    InterfaceC6608<QSResult<Integer>> getUnreadCount(@InterfaceC9950("uin") String uin);

    @InterfaceC9945
    @InterfaceC9960("messages/read-all")
    InterfaceC6608<QSResult<Map<String, Boolean>>> markAllMessagesRead(@InterfaceC9947("uin") String uin);

    @InterfaceC9945
    @InterfaceC9960("messages/read/{id}")
    InterfaceC6608<QSResult<Map<String, Boolean>>> markMessageRead(@InterfaceC9951("id") int id, @InterfaceC9947("uin") String uin);

    @InterfaceC9965
    @InterfaceC9960("upload")
    InterfaceC6608<QSResult<String>> uploadFile(@InterfaceC9958 C6974 file, @InterfaceC9958("uin") AbstractC6962 uin, @InterfaceC9958("nickname") AbstractC6962 nickname);
}
