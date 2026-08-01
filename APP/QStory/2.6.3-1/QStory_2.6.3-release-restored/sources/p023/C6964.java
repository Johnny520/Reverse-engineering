package p023;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.C3775;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6964 f17135 = new C6964(AbstractC5176.m9347(new ArrayList()), null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7390 f17136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f17137;

    public C6964(Set set, AbstractC7390 abstractC7390) {
        set.getClass();
        this.f17137 = set;
        this.f17136 = abstractC7390;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6964)) {
            return false;
        }
        C6964 c6964 = (C6964) obj;
        return AbstractC5227.m9466(c6964.f17137, this.f17137) && AbstractC5227.m9466(c6964.f17136, this.f17136);
    }

    public final int hashCode() {
        int iHashCode = (this.f17137.hashCode() + 1517) * 41;
        AbstractC7390 abstractC7390 = this.f17136;
        return iHashCode + (abstractC7390 != null ? abstractC7390.hashCode() : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12083(String str, InterfaceC7372 interfaceC7372) {
        str.getClass();
        Set set = this.f17137;
        EmptyList emptyList = EmptyList.INSTANCE;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC7372.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                throw AbstractC3275.m5138(it2);
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(AbstractC1298.m1715(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                C3775.m6954();
                return;
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
