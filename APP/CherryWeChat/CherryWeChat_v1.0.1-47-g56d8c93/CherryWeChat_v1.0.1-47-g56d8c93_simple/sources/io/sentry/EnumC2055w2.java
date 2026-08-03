package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.w2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2055w2 extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC2055w2[] $VALUES = null;
    public static final EnumC2055w2 BUFFER = null;
    public static final EnumC2055w2 SESSION = null;

    private static /* synthetic */ EnumC2055w2[] $values() {
        return new EnumC2055w2[]{SESSION, BUFFER};
    }

    static {
        SESSION = new EnumC2055w2("SESSION", 0);
        BUFFER = new EnumC2055w2("BUFFER", 1);
        $VALUES = $values();
    }

    EnumC2055w2(String r1, int r2) {
    }

    public static EnumC2055w2 valueOf(String r1) {
        return (EnumC2055w2) Enum.valueOf(EnumC2055w2.class, r1);
    }

    public static EnumC2055w2[] values() {
        return (EnumC2055w2[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r2, ILogger r3) {
        C1901c r22 = (C1901c) r2;
        r22.m4115z(name().toLowerCase(Locale.ROOT));
    }
}
