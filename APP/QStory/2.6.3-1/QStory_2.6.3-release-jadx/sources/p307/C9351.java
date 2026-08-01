package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9351 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f24055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9351 f24054 = new C9351(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9351 f24053 = new C9351(1);

    public /* synthetic */ C9351(int i) {
        this.f24055 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        String strPattern;
        switch (this.f24055) {
            case 0:
                break;
            default:
                if (obj != null) {
                    String name = obj.getClass().getName();
                    if (name.equals("java.util.regex.Pattern")) {
                        strPattern = ((Pattern) obj).pattern();
                    } else if (name.equals("net.sf.json.JSONNull")) {
                        abstractC3730.mo6527();
                        break;
                    } else if (name.equals("java.net.Inet6Address")) {
                        strPattern = ((InetAddress) obj).getHostName();
                    } else if (name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                        String string = obj.toString();
                        if (!abstractC3730.f9521) {
                            abstractC3730.mo6569(string);
                        } else {
                            abstractC3730.mo6568(string.getBytes(StandardCharsets.UTF_8));
                        }
                        break;
                    } else if (!name.equals("java.net.Inet4Address")) {
                        if (name.equals("java.text.SimpleDateFormat")) {
                            strPattern = ((SimpleDateFormat) obj).toPattern();
                        } else if (!name.equals("java.net.InetSocketAddress")) {
                            C1123.m1410("not support class : ".concat(name));
                        } else {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                            abstractC3730.mo6557();
                            abstractC3730.mo6591("address");
                            abstractC3730.mo6539();
                            abstractC3730.mo6597(inetSocketAddress.getAddress());
                            abstractC3730.mo6591("port");
                            abstractC3730.mo6539();
                            abstractC3730.mo6533(inetSocketAddress.getPort());
                            abstractC3730.mo6554();
                        }
                        break;
                    }
                    abstractC3730.mo6577(strPattern);
                } else {
                    abstractC3730.mo6527();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m14654(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
    }
}
