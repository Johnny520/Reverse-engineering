.class public LYue/ۥۢۦۤۤ$ۥ۟۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۦۤۤ;->ۥ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

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
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x4520cf641089ac0bL    # -4.0311974274127197E-25

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x4c31f60f2d0ed928L    # 1.127440855231909E59

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x417d9f5ea65e14bbL    # -1.3692276185417293E-7

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x4470a63d06f726fdL    # -8.2984430085050865E-22

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x360f93f6029af76eL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_9
    return-object p0

    :cond_a
    sget-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, 0x4b22ce200a96123fL    # 9.005890311547055E53

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/String;

    :cond_b
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    :try_start_0
    sget-object v0, LYue/ۥۢۦۤۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {v0}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x2

    invoke-static {v4}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    const/4 v6, 0x3

    invoke-static {v6}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {p1, v4, v5}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-eqz v1, :cond_2

    if-eqz v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x4

    invoke-static {v4}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v0, [Ljava/lang/Object;

    invoke-static {p1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۢ(Ljava/lang/String;)V

    invoke-static {v1}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۧ(Ljava/lang/String;)V

    invoke-static {v3}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/yuexin/panel/ۥ;->ۥ۟۟۠(Z)V

    invoke-static {}, LYue/ۥ۟ۤۥۢ;->ۥ۟۟۟()V

    sget-object p1, LYue/ۥۢۦۤۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥۢۦۤۤ$ۥ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
