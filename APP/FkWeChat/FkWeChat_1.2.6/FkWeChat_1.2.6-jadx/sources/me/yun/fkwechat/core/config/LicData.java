package me.yun.fkwechat.core.config;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m16758d2 = {"Lme/yun/fkwechat/core/config/LicData;", _UrlKt.FRAGMENT_ENCODE_SET, "verified", _UrlKt.FRAGMENT_ENCODE_SET, "role", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(ZI)V", "getVerified", "()Z", "getRole", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", _UrlKt.FRAGMENT_ENCODE_SET, "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final /* data */ class LicData {
    public static final int $stable = 0;
    private final int role;
    private final boolean verified;

    static {
        FkwLoader.registerNativesForClass(16, LicData.class);
        Hidden0.special_clinit_16_00(LicData.class);
    }

    public LicData(boolean z10, int i10) {
        this.verified = z10;
        this.role = i10;
    }

    public static native /* synthetic */ LicData copy$default(LicData licData, boolean z10, int i10, int i11, Object obj);

    public final native boolean component1();

    public final native int component2();

    public final native LicData copy(boolean verified, int role);

    public native boolean equals(Object other);

    public final native int getRole();

    public final native boolean getVerified();

    public native int hashCode();

    public native String toString();
}
