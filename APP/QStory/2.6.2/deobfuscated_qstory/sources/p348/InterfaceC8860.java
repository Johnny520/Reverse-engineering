package p348;

import java.util.List;
import kotlin.Metadata;
import p384.InterfaceC9062;
import p384.InterfaceC9068;
import retrofit2.InterfaceC5777;
import top.suzhelan.qstory.entity.HasUpdate;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\t¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;", "", "", "versionCode", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "", "Ltop/suzhelan/qstory/entity/UpdateInfo;", "飘花落叶言子楪世苏兰哲", "(I)Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/HasUpdate;", "飘花落叶言子楪世苏哲兰", "", "飘花落叶言子楪世哲苏兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public interface InterfaceC8860 {
    @InterfaceC9062("/update/valid")
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    InterfaceC5777<QSResult<Boolean>> m14497(@InterfaceC9068("version") int versionCode);

    @InterfaceC9062("/update/getUpdateLog")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    InterfaceC5777<QSResult<List<UpdateInfo>>> m14498(@InterfaceC9068("version") int versionCode);

    @InterfaceC9062("/update/hasUpdate")
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    InterfaceC5777<QSResult<HasUpdate>> m14499(@InterfaceC9068("version") int versionCode);
}
