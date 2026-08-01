package me.yun.fkwechat.core.config;

import android.app.Application;
import android.content.Context;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m16758d2 = {"Lme/yun/fkwechat/core/config/AppConfig;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "buildTime", _UrlKt.FRAGMENT_ENCODE_SET, "MODULE_PACKAGE", "moduleVersionName", "moduleVersionCode", _UrlKt.FRAGMENT_ENCODE_SET, "apiVersion", "APP_PACKAGE", "hostPackageName", "hostProcessName", "moduleApkPath", "hostApkPath", "hostDataPath", "hostMediaPath", "hostAppName", "hostVersionName", "hostVersionCode", "hostContext", "Landroid/content/Context;", "hostApplication", "Landroid/app/Application;", "hostClassLoader", "Ljava/lang/ClassLoader;", "isMainProcess", _UrlKt.FRAGMENT_ENCODE_SET, "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class AppConfig {
    public static final int $stable = 0;
    public static final String APP_PACKAGE = "com.tencent.mm";
    public static final AppConfig INSTANCE = null;
    public static final String MODULE_PACKAGE = "me.yun.fkwechat";
    public static int apiVersion = 0;
    public static final String buildTime = "2026-06-25 12:14:58";
    public static String hostApkPath;
    public static String hostAppName;
    public static Application hostApplication;
    public static ClassLoader hostClassLoader;
    public static Context hostContext;
    public static String hostDataPath;
    public static String hostMediaPath;
    public static String hostPackageName;
    public static String hostProcessName;
    public static int hostVersionCode;
    public static String hostVersionName;
    public static String moduleApkPath;
    public static int moduleVersionCode;
    public static String moduleVersionName;

    static {
        FkwLoader.registerNativesForClass(0, AppConfig.class);
        Hidden0.special_clinit_0_00(AppConfig.class);
    }

    private AppConfig() {
    }

    public static final native boolean isMainProcess();
}
