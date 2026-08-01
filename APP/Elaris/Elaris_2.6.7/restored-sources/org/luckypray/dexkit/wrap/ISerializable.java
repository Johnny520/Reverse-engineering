package org.luckypray.dexkit.wrap;

import p000.AbstractC0319ld;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public interface ISerializable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ISerializable deserialize(String str) {
            str.getClass();
            int iM757K = AbstractC0319ld.m757K(str, "->", 0, 6);
            return iM757K == -1 ? new DexClass(str) : AbstractC0319ld.m757K(str, ":", iM757K + 1, 4) == -1 ? new DexMethod(str) : new DexField(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final <T extends ISerializable> T deserializeAs(String str) {
            str.getClass();
            T t = (T) deserialize(str);
            t.getClass();
            return t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
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
