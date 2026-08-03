.class public LYue/ۥۣۣ۟ۢ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۣ۟ۢ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۣ۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟ۢ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_a

    const/4 v0, 0x1

    if-eq p0, v0, :cond_8

    const/4 v0, 0x2

    if-eq p0, v0, :cond_6

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x5cc2b7c067be098fL    # 6.965661215432738E138

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x3c5d9f8129f4129eL    # -6.620988741175667E17

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x602265d8f85c88eL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x65520f24b59afffaL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, -0x6e709944d074e78fL    # -4.241708117251526E-224

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_9
    return-object p0

    :cond_a
    sget-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, 0x2a7e5fdfd37ff547L    # 5.297497692750305E-104

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_b
    return-object p0
.end method

.method public static synthetic ۥ(LYue/ۥۣۣ۟ۢ$ۥ۟;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥ۟۟۟(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LYue/ۥۣ۟ۢۤ;

    invoke-direct {v1, p0, p1}, LYue/ۥۣ۟ۢۤ;-><init>(LYue/ۥۣۣ۟ۢ$ۥ۟;Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟(Landroid/app/Activity;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x64

    if-ge v1, v2, :cond_2

    const-wide/16 v2, 0x64

    :try_start_0
    invoke-static {v2, v3}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    invoke-static {}, LYue/ۥۣۣ۟ۢ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :try_start_1
    invoke-static {v2}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, LYue/ۥۢۡ۠ۨ;->ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LYue/ۥۣۣ۟ۢ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟ۢ;

    invoke-static {}, LYue/ۥۣۣ۟ۢ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v4, v2, v3, v6}, LYue/ۥۣۣ۟ۢ;->ۥ۟۟۟ۥ(LYue/ۥۣۣ۟ۢ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۣۣ۟ۢ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, LYue/ۥۣ۟ۢۥ;

    invoke-direct {v3, p1}, LYue/ۥۣ۟ۢۥ;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
