.class public LYue/ۥۣ۠ۤۨ;
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

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x354

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

.method public static ۥ(Ljava/lang/String;LYue/ۥۡۡۨۡ;Ljava/lang/String;)V
    .locals 7

    invoke-static {p0}, LYue/ۥ۠ۤ۟ۥ;->ۥ(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    const/16 p0, 0xf

    invoke-static {p0}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/gson/JsonObject;->getAsJsonArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :catchall_0
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v1}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x12

    const/16 v5, 0x11

    if-eqz v3, :cond_1

    invoke-static {v5}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p2

    invoke-virtual {p1, v2}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠ۧ(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LYue/ۥۡۡۨۡ;->ۥ۟۟ۡۢ(I)V

    goto :goto_0

    :cond_1
    const/16 v2, 0x13

    :try_start_0
    invoke-static {v2}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/gson/JsonObject;->getAsJsonArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonElement;

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v2

    invoke-static {v1}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v5}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v1

    invoke-virtual {p1, v3}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠ۧ(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LYue/ۥۡۡۨۡ;->ۥ۟۟ۡۢ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    return-void
.end method

.method public static ۥ۟()Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۢ()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    const/16 v2, 0x14

    invoke-static {v2}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v2, 0x15

    invoke-static {v2}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x16

    invoke-static {v3}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const/16 v1, 0x17

    invoke-static {v1}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v2}, LYue/ۥۣ۠ۤۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static native ۥ۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۡۨۡ;
.end method
