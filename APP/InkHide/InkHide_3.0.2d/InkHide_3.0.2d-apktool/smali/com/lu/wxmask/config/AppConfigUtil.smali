.class public final Lcom/lu/wxmask/config/AppConfigUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lu/wxmask/config/AppConfigUtil$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

.field private static final cdnMainUrl:Ljava/lang/String;

.field private static config:Lcom/lu/wxmask/config/AppConfig;

.field private static final configFilePath:Ljava/lang/String;

.field private static final githubMainUrl:Ljava/lang/String;

.field private static final releaseNoteExpiredSetting$delegate:LE0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LE0/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;-><init>(LN0/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->Companion:Lcom/lu/wxmask/config/AppConfigUtil$Companion;

    .line 8
    .line 9
    const-string v0, "res/raw/app_config.json"

    .line 10
    .line 11
    sput-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->configFilePath:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "https://raw.githubusercontent.com/Mingyueyixi/MaskWechat/main"

    .line 14
    .line 15
    sput-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->githubMainUrl:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "https://cdn.jsdelivr.net/gh/Mingyueyixi/MaskWechat@main"

    .line 18
    .line 19
    sput-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->cdnMainUrl:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v0, Lcom/lu/wxmask/config/AppConfig;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/lu/wxmask/config/AppConfig;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->config:Lcom/lu/wxmask/config/AppConfig;

    .line 27
    .line 28
    new-instance v0, LA0/a;

    .line 29
    .line 30
    const/16 v1, 0x19

    .line 31
    .line 32
    invoke-direct {v0, v1}, LA0/a;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, LE0/f;

    .line 36
    .line 37
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lcom/lu/wxmask/config/AppConfigUtil;->releaseNoteExpiredSetting$delegate:LE0/a;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Lz0/x;
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->releaseNoteExpiredSetting_delegate$lambda$0()Lz0/x;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getCdnMainUrl$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->cdnMainUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getConfig$cp()Lcom/lu/wxmask/config/AppConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->config:Lcom/lu/wxmask/config/AppConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getConfigFilePath$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->configFilePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getGithubMainUrl$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->githubMainUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getReleaseNoteExpiredSetting$delegate$cp()LE0/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/lu/wxmask/config/AppConfigUtil;->releaseNoteExpiredSetting$delegate:LE0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setConfig$cp(Lcom/lu/wxmask/config/AppConfig;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/lu/wxmask/config/AppConfigUtil;->config:Lcom/lu/wxmask/config/AppConfig;

    .line 2
    .line 3
    return-void
.end method

.method private static final releaseNoteExpiredSetting_delegate$lambda$0()Lz0/x;
    .locals 1

    .line 1
    new-instance v0, Lz0/x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
