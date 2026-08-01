.class public final Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000er\u0002\u0008\r\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR(\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000er\u0002\u0008\r\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000f\u0010\u0003\u001a\u0004\u0008\u0010\u0010\n\"\u0004\u0008\u0011\u0010\u000cR(\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000er\u0002\u0008\r\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0013\u0010\u0003\u001a\u0004\u0008\u0014\u0010\n\"\u0004\u0008\u0015\u0010\u000cR(\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000er\u0002\u0008\r\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0017\u0010\u0003\u001a\u0004\u0008\u0018\u0010\n\"\u0004\u0008\u0019\u0010\u000c\u00a8\u0006\u001a"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;",
        "",
        "<init>",
        "()V",
        "BASE_URL",
        "",
        "IMAGE_URL",
        "DOWNLOAD_DIR",
        "getDOWNLOAD_DIR$annotations",
        "getDOWNLOAD_DIR",
        "()Ljava/lang/String;",
        "setDOWNLOAD_DIR",
        "(Ljava/lang/String;)V",
        "Lkotlin/jvm/JvmStatic;",
        "INSTALL_DIR",
        "getINSTALL_DIR$annotations",
        "getINSTALL_DIR",
        "setINSTALL_DIR",
        "USER_UIN",
        "getUSER_UIN$annotations",
        "getUSER_UIN",
        "setUSER_UIN",
        "USER_NICKNAME",
        "getUSER_NICKNAME$annotations",
        "getUSER_NICKNAME",
        "setUSER_NICKNAME",
        "QStory:online-plugin-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BASE_URL:Ljava/lang/String; = "https://plugin.suzhelan.top/api/plugin/"

.field private static DOWNLOAD_DIR:Ljava/lang/String; = null

.field public static final IMAGE_URL:Ljava/lang/String; = "https://plugin.suzhelan.top/api/plugin/images/{cloudId}/{filename}"

.field private static INSTALL_DIR:Ljava/lang/String;

.field public static final INSTANCE:Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;

.field private static USER_NICKNAME:Ljava/lang/String;

.field private static USER_UIN:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->INSTANCE:Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "/Download"

    .line 17
    .line 18
    invoke-static {v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->DOWNLOAD_DIR:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->INSTALL_DIR:Ljava/lang/String;

    .line 37
    .line 38
    const-string v0, ""

    .line 39
    .line 40
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 41
    .line 42
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 43
    .line 44
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getDOWNLOAD_DIR()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->DOWNLOAD_DIR:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getDOWNLOAD_DIR$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getINSTALL_DIR()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->INSTALL_DIR:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getINSTALL_DIR$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getUSER_NICKNAME()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getUSER_NICKNAME$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getUSER_UIN()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getUSER_UIN$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final setDOWNLOAD_DIR(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->DOWNLOAD_DIR:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final setINSTALL_DIR(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->INSTALL_DIR:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final setUSER_NICKNAME(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final setUSER_UIN(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method
