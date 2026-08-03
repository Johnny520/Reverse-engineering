.class public LYue/ۥ۠ۥ۟۠;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/lang/Object;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3bb

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

.method public static native ۥ()Ljava/lang/Object;
.end method

.method public static native ۥ۟()Z
.end method

.method public static ۥ۟۟(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-static {}, LYue/ۥ۠ۥ۟۠;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۠ۥ۟۠;->ۥ()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥ۠ۥ۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static native ۥ۟۟۟(Ljava/lang/Object;)V
.end method
