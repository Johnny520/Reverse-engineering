package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1955e extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1955e[] $VALUES = null;
    public static final EnumC1955e LANDSCAPE = null;
    public static final EnumC1955e PORTRAIT = null;

    private static /* synthetic */ EnumC1955e[] $values() {
        return new EnumC1955e[]{PORTRAIT, LANDSCAPE};
    }

    static {
        PORTRAIT = new EnumC1955e("PORTRAIT", 0);
        LANDSCAPE = new EnumC1955e("LANDSCAPE", 1);
        $VALUES = $values();
    }

    EnumC1955e(String r1, int r2) {
    }

    public static EnumC1955e valueOf(String r1) {
        return (EnumC1955e) Enum.valueOf(EnumC1955e.class, r1);
    }

    public static EnumC1955e[] values() {
        return (EnumC1955e[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r2, ILogger r3) {
        C1901c r22 = (C1901c) r2;
        r22.m4115z(toString().toLowerCase(Locale.ROOT));
    }
}
