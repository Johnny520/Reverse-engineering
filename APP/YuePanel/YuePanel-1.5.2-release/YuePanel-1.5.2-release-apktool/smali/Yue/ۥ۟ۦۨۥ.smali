.class public LYue/ۥ۟ۦۨۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static ۥ۟:LYue/ۥ۠ۧۤ۟;

.field public static ۥ۟۟:Ljava/lang/String;

.field public static ۥ۟۟۟:Lcom/shoujiduoduo/util/NativeDES;

.field public static ۥ۟۟۟۟:LYue/ۥۡۧۦ۠;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x42d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۨۥ;->ۥ:Ljava/util/List;

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۦۨۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۨۥ;->ۥ۟۟:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    sget-object v1, LYue/ۥ۟ۦۨۥ;->ۥ۟۟:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    sget-object v1, LYue/ۥ۟ۦۨۥ;->ۥ۟۟:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method
