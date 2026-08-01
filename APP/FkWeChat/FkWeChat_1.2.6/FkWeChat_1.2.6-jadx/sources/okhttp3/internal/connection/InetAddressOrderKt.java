package okhttp3.internal.connection;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import p172l8.C4711r;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, m16758d2 = {"reorderForHappyEyeballs", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "addresses", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class InetAddressOrderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<InetAddress> reorderForHappyEyeballs(List<? extends InetAddress> list) {
        list.getClass();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4711r c4711r = new C4711r(arrayList, arrayList2);
        List list2 = (List) c4711r.m18792a();
        List list3 = (List) c4711r.m18793b();
        return (list2.isEmpty() || list3.isEmpty()) ? list : _UtilCommonKt.interleave(list2, list3);
    }
}
