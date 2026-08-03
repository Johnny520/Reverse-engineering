.class public LYue/ۥۡۡۦۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧ۠;

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

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d3

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

.method public static native synthetic ۥ(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native synthetic ۥ۟(Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
.end method

.method public static ۥ۟۟()Ljava/lang/Object;
    .locals 3

    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۢۨ;->ۥ۟۟(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x11

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static native ۥ۟۟۟()LYue/ۥ۟ۤۧ۠;
.end method

.method public static native ۥ۟۟۟۟()Ljava/lang/Object;
.end method

.method public static native synthetic ۥ۟۟۟۠(Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
.end method

.method public static native synthetic ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method public static ۥ۟۟۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, LYue/ۥۡۡۦۡ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/16 v2, 0xc

    :try_start_0
    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p0, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v4, 0xd

    invoke-static {v4}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {p0, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    const/16 v5, 0xe

    invoke-static {v5}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {p0, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/16 v6, 0xf

    invoke-static {v6}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p0, v6, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    const/4 v3, 0x4

    invoke-static {v3}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v3}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v3, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x7

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    return-object v1
.end method

.method public static native ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
.end method

.method public static ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, LYue/ۥۡۡۦۡ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LYue/ۥۡۡۦۡ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v4}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v4

    if-eqz p0, :cond_1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    filled-new-array {p0, v2, p1, v5, v6}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, v4, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0xb

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    return v1
.end method

.method public static ۥ۟۟۟ۥ(Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, LYue/ۥۡۡۦۡ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x4

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x5

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟۟۟ۥ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x7

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p0, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, p2}, LYue/ۥۡۡۦۡ;->ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const/16 v3, 0x8

    invoke-static {v3}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/16 v3, 0x9

    invoke-static {v3}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 p1, 0xa

    invoke-static {p1}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0x2bc

    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, LYue/ۥۡۡۦۡ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LYue/ۥۡۡۦۡ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LYue/ۥۡۡۦۡ;->ۥ:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v5}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_1

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x4

    invoke-static {v6}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v6, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v3, p0, p3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x7

    invoke-static {p0}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, p3, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p3, 0x0

    filled-new-array {v3, p1, p2, p0, p3}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v4, v5, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p2, 0xb

    invoke-static {p2}, LYue/ۥۡۡۦۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    return v1
.end method

.method public static native ۥ۟۟۟ۧ(LYue/ۥ۟ۤۧ۠;)V
.end method
