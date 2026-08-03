package io.github.cherrywechat.lua.dev;

import p000.AbstractC0295Gu;

/* JADX INFO: loaded from: classes.dex */
public final class LogInterceptorKt {
    public static final void logd(String r2, String r3) {
        AbstractC0295Gu.m625r(-328165566183477L);
        AbstractC0295Gu.m625r(-328195630954549L);
        LogInterceptor.INSTANCE.m3526d(r2, r3);
    }

    public static final void loge(String r2, String r3, Throwable r4) {
        AbstractC0295Gu.m625r(-327809083897909L);
        AbstractC0295Gu.m625r(-327839148668981L);
        LogInterceptor.INSTANCE.m3527e(r2, r3, r4);
    }

    public static /* synthetic */ void loge$default(String r0, String r1, Throwable r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        loge(r0, r1, r2);
    }

    public static final void logi(String r2, String r3) {
        AbstractC0295Gu.m625r(-327680234879029L);
        AbstractC0295Gu.m625r(-327710299650101L);
        LogInterceptor.INSTANCE.m3528i(r2, r3);
    }

    public static final void logv(String r2, String r3) {
        AbstractC0295Gu.m625r(-327873508407349L);
        AbstractC0295Gu.m625r(-327903573178421L);
        LogInterceptor.INSTANCE.m3529v(r2, r3);
    }

    public static final void logw(String r2, String r3) {
        AbstractC0295Gu.m625r(-327744659388469L);
        AbstractC0295Gu.m625r(-327774724159541L);
        LogInterceptor.INSTANCE.m3530w(r2, r3);
    }
}
