package p087;

import java.util.Map;
import kotlin.C5173;
import kotlin.C5175;
import kotlin.C5176;
import kotlin.C5177;
import kotlin.C5178;
import kotlin.C5179;
import kotlin.C5180;
import kotlin.C5181;
import kotlin.C5182;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5093;
import kotlin.time.C5157;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f19061;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        C4397 c4397 = AbstractC4396.f12975;
        mapBuilder.put(c4397.mo8917(String.class), C7135.f19089);
        mapBuilder.put(c4397.mo8917(Character.TYPE), C7116.f19053);
        mapBuilder.put(c4397.mo8917(char[].class), C7112.f19046);
        mapBuilder.put(c4397.mo8917(Double.TYPE), C7106.f19033);
        mapBuilder.put(c4397.mo8917(double[].class), C7107.f19034);
        mapBuilder.put(c4397.mo8917(Float.TYPE), C7080.f18992);
        mapBuilder.put(c4397.mo8917(float[].class), C7081.f18993);
        mapBuilder.put(c4397.mo8917(Long.TYPE), C7072.f18976);
        mapBuilder.put(c4397.mo8917(long[].class), C7071.f18974);
        mapBuilder.put(c4397.mo8917(C5179.class), C7097.f19019);
        mapBuilder.put(c4397.mo8917(Integer.TYPE), C7083.f18997);
        mapBuilder.put(c4397.mo8917(int[].class), C7084.f18998);
        mapBuilder.put(c4397.mo8917(C5181.class), C7098.f19021);
        mapBuilder.put(c4397.mo8917(Short.TYPE), C7134.f19087);
        mapBuilder.put(c4397.mo8917(short[].class), C7138.f19090);
        mapBuilder.put(c4397.mo8917(C5173.class), C7093.f19013);
        mapBuilder.put(c4397.mo8917(Byte.TYPE), C7122.f19059);
        mapBuilder.put(c4397.mo8917(byte[].class), C7118.f19054);
        mapBuilder.put(c4397.mo8917(C5178.class), C7132.f19084);
        mapBuilder.put(c4397.mo8917(Boolean.TYPE), C7100.f19025);
        mapBuilder.put(c4397.mo8917(boolean[].class), C7101.f19026);
        mapBuilder.put(c4397.mo8917(C5176.class), C7092.f19010);
        mapBuilder.put(c4397.mo8917(Void.class), C7143.f19101);
        try {
            InterfaceC5093 interfaceC5093Mo8917 = c4397.mo8917(C5157.class);
            C8623 c8623 = C5157.f14712;
            mapBuilder.put(interfaceC5093Mo8917, C7110.f19040);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(AbstractC4396.f12975.mo8917(C5180.class), C7096.f19017);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(AbstractC4396.f12975.mo8917(C5182.class), C7094.f19014);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(AbstractC4396.f12975.mo8917(C5175.class), C7090.f19007);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(AbstractC4396.f12975.mo8917(C5177.class), C7133.f19085);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(Uuid.class);
            Uuid.Companion.getClass();
            mapBuilder.put(interfaceC5093Mo89172, C7089.f19006);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            InterfaceC5093 interfaceC5093Mo89173 = AbstractC4396.f12975.mo8917(Instant.class);
            Instant.Companion.getClass();
            mapBuilder.put(interfaceC5093Mo89173, C7086.f19002);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f19061 = mapBuilder.build();
    }
}
