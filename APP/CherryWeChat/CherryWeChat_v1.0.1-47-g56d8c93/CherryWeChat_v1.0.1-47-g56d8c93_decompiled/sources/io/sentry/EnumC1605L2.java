package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.L2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1605L2 implements InterfaceC1567C0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(LuaJitConsts.LUA_VERSION_NUM),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    EnumC1605L2(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static EnumC1605L2 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static EnumC1605L2 fromHttpStatusCode(int i) {
        for (EnumC1605L2 enumC1605L2 : values()) {
            if (enumC1605L2.matches(i)) {
                return enumC1605L2;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(apiName());
    }

    public static EnumC1605L2 fromHttpStatusCode(Integer num, EnumC1605L2 enumC1605L2) {
        EnumC1605L2 enumC1605L2FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC1605L2;
        return enumC1605L2FromHttpStatusCode != null ? enumC1605L2FromHttpStatusCode : enumC1605L2;
    }

    EnumC1605L2(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
