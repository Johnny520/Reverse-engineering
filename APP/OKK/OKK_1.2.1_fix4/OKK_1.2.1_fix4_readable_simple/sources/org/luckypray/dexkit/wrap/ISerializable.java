package org.luckypray.dexkit.wrap;

import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: loaded from: classes.dex */
public interface ISerializable {
    public static final Companion Companion = null;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        static {
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }

        public final ISerializable deserialize(String r6) {
            AbstractC0307g.m703e(r6, "descriptor");
            int r02 = AbstractC0425j.m1011P0(r6, "->", 0, false, 6);
            if (r02 != (-1)) goto L6;
            return new DexClass(r6);
        L6:
            if (AbstractC0425j.m1011P0(r6, ":", r02 + 1, false, 4) != (-1)) goto L9;
            return new DexMethod(r6);
        L9:
            return new DexField(r6);
        }

        public final <T> T deserializeAs(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return (T) deserialize(r2);
        }
    }

    public static final class DefaultImpls {
        public static String serialize(ISerializable r02) {
            return r02.toString();
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    static ISerializable deserialize(String r1) {
        return Companion.deserialize(r1);
    }

    static <T> T deserializeAs(String r1) {
        return (T) Companion.deserializeAs(r1);
    }

    String serialize();
}
