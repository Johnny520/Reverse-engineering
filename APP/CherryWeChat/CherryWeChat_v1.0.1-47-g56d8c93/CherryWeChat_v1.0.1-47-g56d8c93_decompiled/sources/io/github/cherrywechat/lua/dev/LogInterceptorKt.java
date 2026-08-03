package io.github.cherrywechat.lua.dev;

import p000.AbstractC0295Gu;

/* JADX INFO: loaded from: classes.dex */
public final class LogInterceptorKt {
    public static final void logd(String str, String str2) {
        AbstractC0295Gu.m625r(-328165566183477L);
        AbstractC0295Gu.m625r(-328195630954549L);
        LogInterceptor.INSTANCE.m3526d(str, str2);
    }

    public static final void loge(String str, String str2, Throwable th) {
        AbstractC0295Gu.m625r(-327809083897909L);
        AbstractC0295Gu.m625r(-327839148668981L);
        LogInterceptor.INSTANCE.m3527e(str, str2, th);
    }

    public static /* synthetic */ void loge$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        loge(str, str2, th);
    }

    public static final void logi(String str, String str2) {
        AbstractC0295Gu.m625r(-327680234879029L);
        AbstractC0295Gu.m625r(-327710299650101L);
        LogInterceptor.INSTANCE.m3528i(str, str2);
    }

    public static final void logv(String str, String str2) {
        AbstractC0295Gu.m625r(-327873508407349L);
        AbstractC0295Gu.m625r(-327903573178421L);
        LogInterceptor.INSTANCE.m3529v(str, str2);
    }

    public static final void logw(String str, String str2) {
        AbstractC0295Gu.m625r(-327744659388469L);
        AbstractC0295Gu.m625r(-327774724159541L);
        LogInterceptor.INSTANCE.m3530w(str, str2);
    }
}
