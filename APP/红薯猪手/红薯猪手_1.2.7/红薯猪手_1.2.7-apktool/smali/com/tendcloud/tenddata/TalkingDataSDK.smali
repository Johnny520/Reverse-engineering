.class public final Lcom/tendcloud/tenddata/TalkingDataSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ANALYTICS_INTELLIGENT_DISABLE:I = 0x2

.field public static final ANTI_CHEATING_DISABLE:I = 0x8

.field public static final DEVICE_IDENTIFICATION_DISABLE:I = 0x4

.field public static final PRECISE_AREA_DISABLE:I = 0x1

.field private static a:J

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSDK;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ac;->d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static getNFCStatus(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ac;->b(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public static declared-synchronized getOAID(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSDK;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ac;->e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized getShortUrl(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/TDGenerateUrl;",
            ")V"
        }
    .end annotation

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSDK;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v1}, Lcom/tendcloud/tenddata/ac;->a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static initSDK(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/TalkingDataSDK;->a:J

    sput-object p1, Lcom/tendcloud/tenddata/TalkingDataSDK;->b:Ljava/lang/String;

    sput-object p2, Lcom/tendcloud/tenddata/TalkingDataSDK;->c:Ljava/lang/String;

    sput-object p3, Lcom/tendcloud/tenddata/TalkingDataSDK;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static onCreateCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onError(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onEvent(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "D",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p4}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, p3, v0}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onFavorite(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onFavorite(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onLogin(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onLogin(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onPageBegin(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onPageEnd(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onPause(Landroid/app/Activity;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onProfileUpdate(Lcom/tendcloud/tenddata/TalkingDataProfile;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onPunch(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onReceiveDeepLink(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->d(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onRegister(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onRegister(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, p3, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onResume(Landroid/app/Activity;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onSearch(Lcom/tendcloud/tenddata/TalkingDataSearch;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onShare(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static onShare(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/ac;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static removeGlobalKV(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static setConfig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V
    .locals 0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ac;->setConfig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V

    return-void
.end method

.method public static declared-synchronized setConfigurationDisable(I)V
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSDK;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ac;->setConfigurationDisable(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized setCustomDataSwitch(Lcom/tendcloud/tenddata/TalkingDataSharingFilter;)V
    .locals 2

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSDK;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ac;->a(Lcom/tendcloud/tenddata/TalkingDataSharingFilter;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static setGlobalKV(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, v0}, Lcom/tendcloud/tenddata/ac;->a(Ljava/lang/String;Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static setReportUncaughtExceptions(Z)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ac;->a(ZLcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static setVerboseLogDisable()V
    .locals 0

    invoke-static {}, Lcom/tendcloud/tenddata/ac;->c()V

    return-void
.end method

.method public static startA(Landroid/content/Context;)V
    .locals 4

    sget-wide v0, Lcom/tendcloud/tenddata/TalkingDataSDK;->a:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/TalkingDataSDK;->b:Ljava/lang/String;

    sget-object v1, Lcom/tendcloud/tenddata/TalkingDataSDK;->c:Ljava/lang/String;

    sget-object v2, Lcom/tendcloud/tenddata/TalkingDataSDK;->d:Ljava/lang/String;

    sget-object v3, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, v0, v1, v2, v3}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static startA(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object p4, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    invoke-static {p0, p1, p2, p3, p4}, Lcom/tendcloud/tenddata/ac;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method
