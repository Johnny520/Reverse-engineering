package p348;

import com.alibaba.fastjson2.JSONObject;
import kotlin.Metadata;
import p332.C8785;
import p332.C8786;
import p397.InterfaceC9120;
import p397.InterfaceC9131;
import retrofit2.InterfaceC5778;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H'¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011À\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;", "", "Lcom/alibaba/fastjson2/JSONObject;", "param", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;", "飘花落叶言子楪世兰苏哲", "(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;", "飘花落叶言子楪世哲兰苏", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "飘花落叶言子楪世苏兰哲", "", "飘花落叶言子楪世苏哲兰", "", "飘花落叶言子楪世哲苏兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public interface InterfaceC8841 {
    @InterfaceC9131("/user-v2/doLogin")
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    InterfaceC5778<QSResult<C8786>> m14507(@InterfaceC9120 JSONObject param);

    @InterfaceC9131("/user-v2/info")
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    InterfaceC5778<QSResult<C8785>> m14508();

    @InterfaceC9131("/user-v2/isLogin")
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    InterfaceC5778<QSResult<Boolean>> m14509();

    @InterfaceC9131("/user-v2/refreshUserInfo")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    InterfaceC5778<QSResult<C8785>> m14510();

    @InterfaceC9131("/user-v2/commitLoginInfo")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    InterfaceC5778<QSResult<String>> m14511(@InterfaceC9120 JSONObject param);
}
