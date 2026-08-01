package p348;

import java.util.List;
import kotlin.Metadata;
import p384.InterfaceC9062;
import p384.InterfaceC9063;
import p384.InterfaceC9065;
import p384.InterfaceC9078;
import retrofit2.InterfaceC5777;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007Ja\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏哲兰;", "", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "", "", "飘花落叶言子楪世苏哲兰", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "troop", "troopName", "operator", "operatorName", "uin", "uinName", "reason", "", "飘花落叶言子楪世苏兰哲", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public interface InterfaceC8864 {
    @InterfaceC9078("/user-v2/onKickBlacklist")
    @InterfaceC9063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    InterfaceC5777<QSResult<Integer>> m14505(@InterfaceC9065("troop") String troop, @InterfaceC9065("troopName") String troopName, @InterfaceC9065("operator") String operator, @InterfaceC9065("operatorName") String operatorName, @InterfaceC9065("uin") String uin, @InterfaceC9065("uinName") String uinName, @InterfaceC9065("reason") String reason);

    @InterfaceC9062("/user-v2/queryBlacklist")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    InterfaceC5777<QSResult<List<String>>> m14506();
}
