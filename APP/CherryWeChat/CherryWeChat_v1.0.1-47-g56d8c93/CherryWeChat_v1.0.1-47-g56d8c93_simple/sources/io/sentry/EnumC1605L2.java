package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.L2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1605L2 extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1605L2[] $VALUES = null;
    public static final EnumC1605L2 ABORTED = null;
    public static final EnumC1605L2 ALREADY_EXISTS = null;
    public static final EnumC1605L2 CANCELLED = null;
    public static final EnumC1605L2 DATA_LOSS = null;
    public static final EnumC1605L2 DEADLINE_EXCEEDED = null;
    public static final EnumC1605L2 FAILED_PRECONDITION = null;
    public static final EnumC1605L2 INTERNAL_ERROR = null;
    public static final EnumC1605L2 INVALID_ARGUMENT = null;
    public static final EnumC1605L2 NOT_FOUND = null;

    /* JADX INFO: renamed from: OK */
    public static final EnumC1605L2 f5786OK = null;
    public static final EnumC1605L2 OUT_OF_RANGE = null;
    public static final EnumC1605L2 PERMISSION_DENIED = null;
    public static final EnumC1605L2 RESOURCE_EXHAUSTED = null;
    public static final EnumC1605L2 UNAUTHENTICATED = null;
    public static final EnumC1605L2 UNAVAILABLE = null;
    public static final EnumC1605L2 UNIMPLEMENTED = null;
    public static final EnumC1605L2 UNKNOWN = null;
    public static final EnumC1605L2 UNKNOWN_ERROR = null;
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    private static /* synthetic */ EnumC1605L2[] $values() {
        return new EnumC1605L2[]{f5786OK, CANCELLED, INTERNAL_ERROR, UNKNOWN, UNKNOWN_ERROR, INVALID_ARGUMENT, DEADLINE_EXCEEDED, NOT_FOUND, ALREADY_EXISTS, PERMISSION_DENIED, RESOURCE_EXHAUSTED, FAILED_PRECONDITION, ABORTED, OUT_OF_RANGE, UNIMPLEMENTED, UNAVAILABLE, DATA_LOSS, UNAUTHENTICATED};
    }

    static {
        f5786OK = new EnumC1605L2("OK", 0, 0, 399);
        CANCELLED = new EnumC1605L2("CANCELLED", 1, 499);
        INTERNAL_ERROR = new EnumC1605L2("INTERNAL_ERROR", 2, 500);
        UNKNOWN = new EnumC1605L2("UNKNOWN", 3, 500);
        UNKNOWN_ERROR = new EnumC1605L2("UNKNOWN_ERROR", 4, 500);
        INVALID_ARGUMENT = new EnumC1605L2("INVALID_ARGUMENT", 5, 400);
        DEADLINE_EXCEEDED = new EnumC1605L2("DEADLINE_EXCEEDED", 6, 504);
        NOT_FOUND = new EnumC1605L2("NOT_FOUND", 7, 404);
        ALREADY_EXISTS = new EnumC1605L2("ALREADY_EXISTS", 8, 409);
        PERMISSION_DENIED = new EnumC1605L2("PERMISSION_DENIED", 9, 403);
        RESOURCE_EXHAUSTED = new EnumC1605L2("RESOURCE_EXHAUSTED", 10, 429);
        FAILED_PRECONDITION = new EnumC1605L2("FAILED_PRECONDITION", 11, 400);
        ABORTED = new EnumC1605L2("ABORTED", 12, 409);
        OUT_OF_RANGE = new EnumC1605L2("OUT_OF_RANGE", 13, 400);
        UNIMPLEMENTED = new EnumC1605L2("UNIMPLEMENTED", 14, LuaJitConsts.LUA_VERSION_NUM);
        UNAVAILABLE = new EnumC1605L2("UNAVAILABLE", 15, 503);
        DATA_LOSS = new EnumC1605L2("DATA_LOSS", 16, 500);
        UNAUTHENTICATED = new EnumC1605L2("UNAUTHENTICATED", 17, 401);
        $VALUES = $values();
    }

    EnumC1605L2(String r1, int r2, int r3) {
        this.minHttpStatusCode = r3;
        this.maxHttpStatusCode = r3;
    }

    public static EnumC1605L2 fromApiNameSafely(String r2) {
        if (r2 != null) goto L8;
        return null;
    L8:
        return valueOf(r2.toUpperCase(Locale.ROOT));
    L7:
        return null;
    }

    public static EnumC1605L2 fromHttpStatusCode(int r5) {
        EnumC1605L2[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        EnumC1605L2 r3 = r0[r2];
        if (r3.matches(r5) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        return null;
    }

    private boolean matches(int r2) {
        if (r2 >= this.minHttpStatusCode) goto L5;
        return false;
    L5:
        if (r2 > this.maxHttpStatusCode) goto L10;
        return true;
    L10:
        return false;
    }

    public static EnumC1605L2 valueOf(String r1) {
        return (EnumC1605L2) Enum.valueOf(EnumC1605L2.class, r1);
    }

    public static EnumC1605L2[] values() {
        return (EnumC1605L2[]) $VALUES.clone();
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r1, ILogger r2) {
        C1901c r12 = (C1901c) r1;
        r12.m4115z(apiName());
    }

    public static EnumC1605L2 fromHttpStatusCode(Integer r0, EnumC1605L2 r1) {
        if (r0 == null) goto L4;
        EnumC1605L2 r02 = fromHttpStatusCode(r0.intValue());
    L5:
        if (r02 == null) goto L7;
        return r02;
    L7:
        return r1;
    L4:
        r02 = r1;
        goto L5
    }

    EnumC1605L2(String r1, int r2, int r3, int r4) {
        this.minHttpStatusCode = r3;
        this.maxHttpStatusCode = r4;
    }
}
