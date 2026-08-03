package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;

/* JADX INFO: renamed from: io.sentry.rrweb.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1987c extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1987c[] $VALUES = null;
    public static final EnumC1987c Custom = null;
    public static final EnumC1987c DomContentLoaded = null;
    public static final EnumC1987c FullSnapshot = null;
    public static final EnumC1987c IncrementalSnapshot = null;
    public static final EnumC1987c Load = null;
    public static final EnumC1987c Meta = null;
    public static final EnumC1987c Plugin = null;

    private static /* synthetic */ EnumC1987c[] $values() {
        return new EnumC1987c[]{DomContentLoaded, Load, FullSnapshot, IncrementalSnapshot, Meta, Custom, Plugin};
    }

    static {
        DomContentLoaded = new EnumC1987c("DomContentLoaded", 0);
        Load = new EnumC1987c("Load", 1);
        FullSnapshot = new EnumC1987c("FullSnapshot", 2);
        IncrementalSnapshot = new EnumC1987c("IncrementalSnapshot", 3);
        Meta = new EnumC1987c("Meta", 4);
        Custom = new EnumC1987c("Custom", 5);
        Plugin = new EnumC1987c("Plugin", 6);
        $VALUES = $values();
    }

    EnumC1987c(String r1, int r2) {
    }

    public static EnumC1987c valueOf(String r1) {
        return (EnumC1987c) Enum.valueOf(EnumC1987c.class, r1);
    }

    public static EnumC1987c[] values() {
        return (EnumC1987c[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r3, ILogger r4) {
        ((C1901c) r3).m4111v(ordinal());
    }
}
