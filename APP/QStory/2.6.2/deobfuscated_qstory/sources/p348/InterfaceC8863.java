package p348;

import java.util.List;
import kotlin.Metadata;
import p384.InterfaceC9062;
import retrofit2.InterfaceC5777;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏兰哲;", "", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "", "Ltop/suzhelan/qstory/entity/Notice;", "飘花落叶言子楪世苏兰哲", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "飘花落叶言子楪世苏哲兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public interface InterfaceC8863 {
    @InterfaceC9062("/notice/all")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    InterfaceC5777<QSResult<List<Notice>>> m14503();

    @InterfaceC9062("/notice/last")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    InterfaceC5777<QSResult<Notice>> m14504();
}
