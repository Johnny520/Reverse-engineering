package p087;

import java.util.Map;
import kotlin.C5172;
import kotlin.C5174;
import kotlin.C5175;
import kotlin.C5176;
import kotlin.C5177;
import kotlin.C5178;
import kotlin.C5179;
import kotlin.C5180;
import kotlin.C5181;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.InterfaceC5092;
import kotlin.time.C5156;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7123 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f19066;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        C4396 c4396 = AbstractC4395.f12971;
        mapBuilder.put(c4396.mo8927(String.class), C7134.f19094);
        mapBuilder.put(c4396.mo8927(Character.TYPE), C7115.f19058);
        mapBuilder.put(c4396.mo8927(char[].class), C7111.f19051);
        mapBuilder.put(c4396.mo8927(Double.TYPE), C7105.f19038);
        mapBuilder.put(c4396.mo8927(double[].class), C7106.f19039);
        mapBuilder.put(c4396.mo8927(Float.TYPE), C7079.f18997);
        mapBuilder.put(c4396.mo8927(float[].class), C7080.f18998);
        mapBuilder.put(c4396.mo8927(Long.TYPE), C7071.f18981);
        mapBuilder.put(c4396.mo8927(long[].class), C7070.f18979);
        mapBuilder.put(c4396.mo8927(C5178.class), C7096.f19024);
        mapBuilder.put(c4396.mo8927(Integer.TYPE), C7082.f19002);
        mapBuilder.put(c4396.mo8927(int[].class), C7083.f19003);
        mapBuilder.put(c4396.mo8927(C5180.class), C7097.f19026);
        mapBuilder.put(c4396.mo8927(Short.TYPE), C7133.f19092);
        mapBuilder.put(c4396.mo8927(short[].class), C7137.f19095);
        mapBuilder.put(c4396.mo8927(C5172.class), C7092.f19018);
        mapBuilder.put(c4396.mo8927(Byte.TYPE), C7121.f19064);
        mapBuilder.put(c4396.mo8927(byte[].class), C7117.f19059);
        mapBuilder.put(c4396.mo8927(C5177.class), C7131.f19089);
        mapBuilder.put(c4396.mo8927(Boolean.TYPE), C7099.f19030);
        mapBuilder.put(c4396.mo8927(boolean[].class), C7100.f19031);
        mapBuilder.put(c4396.mo8927(C5175.class), C7091.f19015);
        mapBuilder.put(c4396.mo8927(Void.class), C7142.f19106);
        try {
            InterfaceC5092 interfaceC5092Mo8927 = c4396.mo8927(C5156.class);
            C8631 c8631 = C5156.f14712;
            mapBuilder.put(interfaceC5092Mo8927, C7109.f19045);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(AbstractC4395.f12971.mo8927(C5179.class), C7095.f19022);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(AbstractC4395.f12971.mo8927(C5181.class), C7093.f19019);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(AbstractC4395.f12971.mo8927(C5174.class), C7089.f19012);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(AbstractC4395.f12971.mo8927(C5176.class), C7132.f19090);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(Uuid.class);
            Uuid.Companion.getClass();
            mapBuilder.put(interfaceC5092Mo89272, C7088.f19011);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            InterfaceC5092 interfaceC5092Mo89273 = AbstractC4395.f12971.mo8927(Instant.class);
            Instant.Companion.getClass();
            mapBuilder.put(interfaceC5092Mo89273, C7085.f19007);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f19066 = mapBuilder.build();
    }
}
