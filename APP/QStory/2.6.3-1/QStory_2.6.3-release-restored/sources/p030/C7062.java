package p030;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p023.InterfaceC6984;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7062 implements InterfaceC6984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17518;

    public C7062(String str, List list) {
        str.getClass();
        list.getClass();
        this.f17518 = str;
        this.f17517 = list;
    }

    @Override // p023.InterfaceC6984
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo12115(String str) throws UnknownHostException {
        str.getClass();
        String str2 = this.f17518;
        if (AbstractC5227.m9466(str2, str)) {
            return this.f17517;
        }
        throw new UnknownHostException(AbstractC7012.m12140("BootstrapDns called for ", str, " instead of ", str2));
    }
}
