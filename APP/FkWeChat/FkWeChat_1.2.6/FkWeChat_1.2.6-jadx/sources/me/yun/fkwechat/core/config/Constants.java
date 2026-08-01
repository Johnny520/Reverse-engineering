package me.yun.fkwechat.core.config;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m16758d2 = {"Lme/yun/fkwechat/core/config/Constants;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "PLUGIN_PATH", _UrlKt.FRAGMENT_ENCODE_SET, "getPLUGIN_PATH", "()Ljava/lang/String;", "API_URL", "CDN_URL", "DOCS_URL", "DOWN_URL", "CONTROL_URL", "UPDATE_URL", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class Constants {
    public static final int $stable = 0;
    public static final String API_URL = "https://api.yunpro.club";
    public static final String CDN_URL = "https://cdn.yunpro.club";
    public static final String CONTROL_URL = "https://app.yunpro.club/api/control.json";
    public static final String DOCS_URL = "https://docs.yunpro.club";
    public static final String DOWN_URL = "https://down.yunpro.club/api/plugins.json";
    public static final Constants INSTANCE = null;
    private static final String PLUGIN_PATH = null;
    public static final String UPDATE_URL = "https://app.yunpro.club/api/update.json";

    static {
        FkwLoader.registerNativesForClass(3, Constants.class);
        Hidden0.special_clinit_3_00(Constants.class);
    }

    private Constants() {
    }

    public final native String getPLUGIN_PATH();
}
