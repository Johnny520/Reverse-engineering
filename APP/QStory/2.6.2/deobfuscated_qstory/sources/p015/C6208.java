package p015;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3056;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p033.AbstractC6325;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6208 f17029 = new C6208(AbstractC4343.m8800(new ArrayList()), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3056 f17030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f17031;

    public C6208(Set set, AbstractC3056 abstractC3056) {
        set.getClass();
        this.f17031 = set;
        this.f17030 = abstractC3056;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6208)) {
            return false;
        }
        C6208 c6208 = (C6208) obj;
        return AbstractC4394.m8917(c6208.f17031, this.f17031) && AbstractC4394.m8917(c6208.f17030, this.f17030);
    }

    public final int hashCode() {
        int iHashCode = (this.f17031.hashCode() + 1517) * 41;
        AbstractC3056 abstractC3056 = this.f17030;
        return iHashCode + (abstractC3056 != null ? abstractC3056.hashCode() : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11653(String str, InterfaceC6542 interfaceC6542) {
        str.getClass();
        Set set = this.f17031;
        EmptyList emptyList = EmptyList.INSTANCE;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC6542.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                throw AbstractC2442.m4568(it2);
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(AbstractC6325.m11853(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                C2941.m6336();
                return;
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
