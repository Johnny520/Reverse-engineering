package p348;

import java.util.List;
import kotlin.Metadata;
import p397.InterfaceC9115;
import p397.InterfaceC9121;
import retrofit2.InterfaceC5778;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世哲苏兰;", "", "", "uin", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "", "Ltop/suzhelan/qstory/entity/PayItem;", "飘花落叶言子楪世苏哲兰", "(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "", "飘花落叶言子楪世苏兰哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public interface InterfaceC8843 {
    @InterfaceC9115("/pay-v2/queryOrderResult")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    InterfaceC5778<QSResult<Boolean>> m14515(@InterfaceC9121("uin") String uin);

    @InterfaceC9115("/pay-v2/getPayItemList")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    InterfaceC5778<QSResult<List<PayItem>>> m14516(@InterfaceC9121("uin") String uin);
}
