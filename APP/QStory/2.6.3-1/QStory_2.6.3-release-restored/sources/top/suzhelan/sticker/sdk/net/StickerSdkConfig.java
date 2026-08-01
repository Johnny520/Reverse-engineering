package top.suzhelan.sticker.sdk.net;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR$\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, m151d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "BASE_URL", "", "SIGN_SECRET", "STICKER_DIR", "getSTICKER_DIR$annotations", "getSTICKER_DIR", "()Ljava/lang/String;", "setSTICKER_DIR", "(Ljava/lang/String;)V", "USER_UIN", "getUSER_UIN$annotations", "getUSER_UIN", "setUSER_UIN", "USER_NICKNAME", "getUSER_NICKNAME$annotations", "getUSER_NICKNAME", "setUSER_NICKNAME", "online-sticker-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class StickerSdkConfig {
    public static final String BASE_URL = "https://sticker.suzhelan.top/api/v1/";
    public static final String SIGN_SECRET = "UHa6q8eD7T4qzqpksbXX";
    public static final StickerSdkConfig INSTANCE = new StickerSdkConfig();
    private static String STICKER_DIR = "";
    private static String USER_UIN = "";
    private static String USER_NICKNAME = "";

    private StickerSdkConfig() {
    }

    public static final String getSTICKER_DIR() {
        return STICKER_DIR;
    }

    public static final String getUSER_NICKNAME() {
        return USER_NICKNAME;
    }

    public static final String getUSER_UIN() {
        return USER_UIN;
    }

    public static final void setSTICKER_DIR(String str) {
        str.getClass();
        STICKER_DIR = str;
    }

    public static final void setUSER_NICKNAME(String str) {
        str.getClass();
        USER_NICKNAME = str;
    }

    public static final void setUSER_UIN(String str) {
        str.getClass();
        USER_UIN = str;
    }

    public static /* synthetic */ void getSTICKER_DIR$annotations() {
    }

    public static /* synthetic */ void getUSER_NICKNAME$annotations() {
    }

    public static /* synthetic */ void getUSER_UIN$annotations() {
    }
}
