package org.luckypray.dexkit.wrap;

import p000.k41;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface ISerializable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ISerializable deserialize(String str) {
            str.getClass();
            int iM1768Z = k41.m1768Z(str, "->", 0, false, 6);
            return iM1768Z == -1 ? new DexClass(str) : k41.m1768Z(str, ":", iM1768Z + 1, false, 4) == -1 ? new DexMethod(str) : new DexField(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final <T extends ISerializable> T deserializeAs(String str) {
            str.getClass();
            T t = (T) deserialize(str);
            t.getClass();
            return t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static String serialize(ISerializable iSerializable) {
            return iSerializable.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static ISerializable deserialize(String str) {
        return Companion.deserialize(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static <T extends ISerializable> T deserializeAs(String str) {
        return (T) Companion.deserializeAs(str);
    }

    String serialize();
}
