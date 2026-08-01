package p014;

import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p015.InterfaceC6228;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6191 implements InterfaceC6228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f16937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16938;

    public C6191(String str, List list) {
        str.getClass();
        list.getClass();
        this.f16938 = str;
        this.f16937 = list;
    }

    @Override // p015.InterfaceC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo11642(String str) throws UnknownHostException {
        str.getClass();
        String str2 = this.f16938;
        if (AbstractC4394.m8917(str2, str)) {
            return this.f16937;
        }
        throw new UnknownHostException(AbstractC6136.m11548("BootstrapDns called for ", str, " instead of ", str2));
    }
}
