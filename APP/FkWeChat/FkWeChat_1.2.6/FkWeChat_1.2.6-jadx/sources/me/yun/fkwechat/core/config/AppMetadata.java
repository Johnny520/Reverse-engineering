package me.yun.fkwechat.core.config;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.io.File;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001b¨\u0006%"}, m16758d2 = {"Lme/yun/fkwechat/core/config/AppMetadata;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/io/File;", "getStoreFile", "()Ljava/io/File;", "getExternalMediaFile", "getPrivateFile", _UrlKt.FRAGMENT_ENCODE_SET, "encryptedBase64", "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", "Lme/yun/fkwechat/core/config/LicData;", "selfDestruct", "()Lme/yun/fkwechat/core/config/LicData;", "input", "sha256", _UrlKt.FRAGMENT_ENCODE_SET, "verified", _UrlKt.FRAGMENT_ENCODE_SET, "role", "Ll8/i0;", "save", "(ZI)V", "load", "FILE_NAME", "Ljava/lang/String;", "MIRROR_KEY", _UrlKt.FRAGMENT_ENCODE_SET, "MAX_CACHE_AGE_MS", "J", _UrlKt.FRAGMENT_ENCODE_SET, "KEY_BYTES", "[B", "IV_BYTES", "SIGNATURE_SALT", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class AppMetadata {
    public static final int $stable = 0;
    private static final String FILE_NAME = ".mm_sys_lic_data";
    public static final AppMetadata INSTANCE = null;
    private static final byte[] IV_BYTES = null;
    private static final byte[] KEY_BYTES = null;
    private static final long MAX_CACHE_AGE_MS = 43200000;
    private static final String MIRROR_KEY = "sys_state_sign_node";
    private static final String SIGNATURE_SALT = "FkWeChatAntiTamperSalt_2026_#";

    static {
        FkwLoader.registerNativesForClass(1, AppMetadata.class);
        Hidden0.special_clinit_1_00(AppMetadata.class);
    }

    private AppMetadata() {
    }

    private final native String decrypt(String encryptedBase64);

    private final native File getExternalMediaFile();

    private final native File getPrivateFile();

    private final native File getStoreFile();

    private final native LicData selfDestruct();

    private final native String sha256(String input);

    public final native LicData load();

    public final native void save(boolean verified, int role);
}
