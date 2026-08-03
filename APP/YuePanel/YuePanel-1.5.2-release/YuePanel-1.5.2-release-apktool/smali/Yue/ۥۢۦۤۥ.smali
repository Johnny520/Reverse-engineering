.class public LYue/ۥۢۦۤۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Z

.field public static ۥ۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ۥ۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, LYue/ۥۢۦۤۥ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LYue/ۥۢۦۤۥ;->ۥ۟۟:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Ljava/lang/Object;)V
.end method

.method public static native synthetic ۥ۟()V
.end method

.method public static native synthetic ۥ۟۟(Ljava/lang/ClassLoader;)V
.end method

.method public static native synthetic ۥ۟۟۟(Ljava/lang/Object;)V
.end method

.method public static native ۥ۟۟۟۟()V
.end method

.method public static native ۥ۟۟۟۠(Ljava/lang/Object;)V
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/ClassLoader;)V
    .locals 1

    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    new-instance v0, LYue/ۥۢۦۤۥ$ۥ۟;

    invoke-direct {v0}, LYue/ۥۢۦۤۥ$ۥ۟;-><init>()V

    invoke-static {p0, v0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟ۥ(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static synthetic ۥ۟۟۟ۢ(Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const-wide/16 v2, 0x64

    :try_start_0
    invoke-static {v2, v3}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v3, 0x4

    invoke-static {v3}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, LYue/ۥۡۢۧۨ;->ۥ(Ljava/lang/Object;)Lcom/google/gson/JsonObject;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x5

    invoke-static {v3}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/JsonObject;->getAsJsonArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/gson/JsonArray;->get(I)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v4}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x7

    invoke-static {v4}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x8

    invoke-static {v5}, LYue/ۥۢۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-static {v2}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۧ(Ljava/lang/String;)V

    invoke-static {v3}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۢ(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v2}, Lcom/yuexin/panel/ۥ;->ۥ۟۟۠(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x64

    if-lt v1, v2, :cond_2

    :cond_1
    :goto_1
    return-void

    :catchall_0
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static native ۥۣ۟۟۟()V
.end method
