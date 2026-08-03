.class public LYue/ۥۢۡۤۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۡۤۥ;->ۥ۟۟۠۠(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۢۡۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥۢۡۤۥ;Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۢۡۤۥ;

    iput-object p2, p0, LYue/ۥۢۡۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p3, p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

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
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x2407024e85de3decL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x3a907b0a11573265L    # -3.048367154664928E26

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x2220792170ed79eL    # -1.960056798742179E298

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x65d290ee38684d27L    # 3.0816186418130405E182

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x3e812602dc361780L    # 1.2776614087219688E-7

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :cond_a
    sget-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, -0x3f3ad9beb6ccc1efL    # -10828.510046391779

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_b
    return-object p0
.end method

.method public static synthetic ۥ(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۟(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۠(Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v1, 0x708

    :cond_0
    const-wide/16 v3, 0x3e8

    const/4 v5, 0x1

    :try_start_0
    invoke-static {v3, v4}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v5}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    invoke-static {v6}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v7}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v6, v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v4, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    add-int/2addr v0, v5

    sget v3, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟ۨ:I

    if-lt v0, v3, :cond_0

    const/4 p0, 0x4

    invoke-static {p0}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x5

    invoke-static {p1}, LYue/ۥۢۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, LYue/ۥۢۡۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iget-object v2, p0, LYue/ۥۢۡۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    new-instance v3, LYue/ۥۢۡۤۤ;

    invoke-direct {v3, v1, v2, p1}, LYue/ۥۢۡۤۤ;-><init>(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V

    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
