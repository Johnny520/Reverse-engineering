package org.luckypray.dexkit.wrap;

import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: loaded from: classes.dex */
public interface ISerializable {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ISerializable deserialize(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
            return iM1011P0 == -1 ? new DexClass(str) : AbstractC0425j.m1011P0(str, ":", iM1011P0 + 1, false, 4) == -1 ? new DexMethod(str) : new DexField(str);
        }

        public final <T> T deserializeAs(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return (T) deserialize(str);
        }
    }

    public static final class DefaultImpls {
        public static String serialize(ISerializable iSerializable) {
            return iSerializable.toString();
        }
    }

    static ISerializable deserialize(String str) {
        return Companion.deserialize(str);
    }

    static <T> T deserializeAs(String str) {
        return (T) Companion.deserializeAs(str);
    }

    String serialize();
}
