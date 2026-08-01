package p007;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2942;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6135 f16790 = new C6135(AbstractC4344.m8788(new ArrayList()), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6561 f16791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f16792;

    public C6135(Set set, AbstractC6561 abstractC6561) {
        set.getClass();
        this.f16792 = set;
        this.f16791 = abstractC6561;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6135)) {
            return false;
        }
        C6135 c6135 = (C6135) obj;
        return AbstractC4395.m8907(c6135.f16792, this.f16792) && AbstractC4395.m8907(c6135.f16791, this.f16791);
    }

    public final int hashCode() {
        int iHashCode = (this.f16792.hashCode() + 1517) * 41;
        AbstractC6561 abstractC6561 = this.f16791;
        return iHashCode + (abstractC6561 != null ? abstractC6561.hashCode() : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11524(String str, InterfaceC6543 interfaceC6543) {
        str.getClass();
        Set set = this.f16792;
        EmptyList emptyList = EmptyList.INSTANCE;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC6543.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                throw AbstractC2442.m4578(it2);
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(AbstractC0455.m1155(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                C2942.m6394();
                return;
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
