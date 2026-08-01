package p103;

import java.util.Map;
import kotlin.C6005;
import kotlin.C6007;
import kotlin.C6008;
import kotlin.C6009;
import kotlin.C6010;
import kotlin.C6011;
import kotlin.C6012;
import kotlin.C6013;
import kotlin.C6014;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5925;
import kotlin.time.C5989;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7953 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f19406;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        C5229 c5229 = AbstractC5228.f13320;
        mapBuilder.put(c5229.mo9476(String.class), C7964.f19434);
        mapBuilder.put(c5229.mo9476(Character.TYPE), C7945.f19398);
        mapBuilder.put(c5229.mo9476(char[].class), C7941.f19391);
        mapBuilder.put(c5229.mo9476(Double.TYPE), C7935.f19378);
        mapBuilder.put(c5229.mo9476(double[].class), C7936.f19379);
        mapBuilder.put(c5229.mo9476(Float.TYPE), C7909.f19337);
        mapBuilder.put(c5229.mo9476(float[].class), C7910.f19338);
        mapBuilder.put(c5229.mo9476(Long.TYPE), C7901.f19321);
        mapBuilder.put(c5229.mo9476(long[].class), C7900.f19319);
        mapBuilder.put(c5229.mo9476(C6011.class), C7926.f19364);
        mapBuilder.put(c5229.mo9476(Integer.TYPE), C7912.f19342);
        mapBuilder.put(c5229.mo9476(int[].class), C7913.f19343);
        mapBuilder.put(c5229.mo9476(C6013.class), C7927.f19366);
        mapBuilder.put(c5229.mo9476(Short.TYPE), C7963.f19432);
        mapBuilder.put(c5229.mo9476(short[].class), C7967.f19435);
        mapBuilder.put(c5229.mo9476(C6005.class), C7922.f19358);
        mapBuilder.put(c5229.mo9476(Byte.TYPE), C7951.f19404);
        mapBuilder.put(c5229.mo9476(byte[].class), C7947.f19399);
        mapBuilder.put(c5229.mo9476(C6010.class), C7961.f19429);
        mapBuilder.put(c5229.mo9476(Boolean.TYPE), C7929.f19370);
        mapBuilder.put(c5229.mo9476(boolean[].class), C7930.f19371);
        mapBuilder.put(c5229.mo9476(C6008.class), C7921.f19355);
        mapBuilder.put(c5229.mo9476(Void.class), C7972.f19446);
        try {
            InterfaceC5925 interfaceC5925Mo9476 = c5229.mo9476(C5989.class);
            C9452 c9452 = C5989.f15057;
            mapBuilder.put(interfaceC5925Mo9476, C7939.f19385);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(AbstractC5228.f13320.mo9476(C6012.class), C7925.f19362);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(AbstractC5228.f13320.mo9476(C6014.class), C7923.f19359);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(AbstractC5228.f13320.mo9476(C6007.class), C7919.f19352);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(AbstractC5228.f13320.mo9476(C6009.class), C7962.f19430);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(Uuid.class);
            Uuid.Companion.getClass();
            mapBuilder.put(interfaceC5925Mo94762, C7918.f19351);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(Instant.class);
            Instant.Companion.getClass();
            mapBuilder.put(interfaceC5925Mo94763, C7915.f19347);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f19406 = mapBuilder.build();
    }
}
