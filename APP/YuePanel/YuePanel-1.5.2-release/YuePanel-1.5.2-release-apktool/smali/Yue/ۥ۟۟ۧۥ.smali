.class public LYue/ۥ۟۟ۧۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static ۥ۟:Ljava/lang/String;

.field public static final ۥ۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2bb

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥ۟۟ۧۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟۟ۧۥ;->ۥ۟:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, LYue/ۥ۟۟ۧۥ;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ()Ljava/util/List;
.end method

.method public static native synthetic ۥ۟()V
.end method

.method public static native synthetic ۥ۟۟()Ljava/util/concurrent/atomic/AtomicBoolean;
.end method

.method public static ۥ۟۟۟(Ljava/lang/ClassLoader;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟۟ۧۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۟۟ۧۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LYue/ۥ۟۟ۧۥ$ۥ;

    invoke-direct {v1}, LYue/ۥ۟۟ۧۥ$ۥ;-><init>()V

    const-class v2, Landroid/os/Bundle;

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, v0, v1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method

.method public static native ۥ۟۟۟۟()V
.end method

.method public static native ۥ۟۟۟۠(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e6\u06e5\u06df;",
            ">;)V"
        }
    .end annotation
.end method
