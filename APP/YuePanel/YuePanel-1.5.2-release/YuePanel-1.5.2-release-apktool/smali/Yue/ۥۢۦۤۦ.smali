.class public LYue/ۥۢۦۤۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12c

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, LYue/ۥۢۦۤۦ;->ۥ:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LYue/ۥۢۦۤۦ;->ۥ۟:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ()V
.end method

.method public static ۥ۟()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, LYue/ۥۢۦۤۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۢۦۤۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۢۦۤۦ$ۥ;

    invoke-direct {v2}, LYue/ۥۢۦۤۦ$ۥ;-><init>()V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۢۦۤۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۢۦۤۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۢۦۤۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۢۦۤۦ$ۥ۟;

    invoke-direct {v2}, LYue/ۥۢۦۤۦ$ۥ۟;-><init>()V

    const-class v3, Landroid/os/Bundle;

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method

.method public static native ۥ۟۟۟()V
.end method
