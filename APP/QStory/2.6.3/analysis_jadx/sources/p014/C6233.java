package p014;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p007.InterfaceC6155;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6233 implements InterfaceC6155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17173;

    public C6233(String str, List list) {
        str.getClass();
        list.getClass();
        this.f17173 = str;
        this.f17172 = list;
    }

    @Override // p007.InterfaceC6155
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo11556(String str) throws UnknownHostException {
        str.getClass();
        String str2 = this.f17173;
        if (AbstractC4395.m8907(str2, str)) {
            return this.f17172;
        }
        throw new UnknownHostException(AbstractC6183.m11581("BootstrapDns called for ", str, " instead of ", str2));
    }
}
