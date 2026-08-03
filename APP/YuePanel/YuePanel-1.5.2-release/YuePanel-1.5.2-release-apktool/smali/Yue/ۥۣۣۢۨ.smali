.class public LYue/ۥۣۣۢۨ;
.super Ljava/lang/Object;


# static fields
.field public static volatile synthetic ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39f

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Ljava/util/concurrent/CompletableFuture;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static ۥ۟()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static native ۥ۟۟()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟()Ljava/lang/String;
.end method

.method public static ۥ۟۟۟۟()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x6

    :try_start_0
    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v2, 0x9

    invoke-static {v2}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    invoke-static {v0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static native ۥ۟۟۟۠()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۡ(Ljava/lang/String;)J
.end method

.method public static native ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-class v0, Ljava/lang/String;

    :try_start_0
    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v2, v0, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static native ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۥ۟۟۟ۧ()Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟ۨ()Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x6

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0xc

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :catch_0
    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0xd

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :catch_0
    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۣۣۢۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static native synthetic ۥ۟۟۠۠(Ljava/util/concurrent/CompletableFuture;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method
