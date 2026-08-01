.class public final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;",
        "",
        "<init>",
        "()V",
        "Ljava/io/File;",
        "pluginZipFile",
        "Ltop/suzhelan/plugin/sdk/online/net/QSResult;",
        "",
        "uploadToNet",
        "(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;",
        "Llin/xposed/hook/javaplugin/bean/PluginInfo;",
        "plugin",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
        "upload",
        "(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
        "TAG",
        "Ljava/lang/String;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u5170\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
        "waitDialog",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u4e16\u5170\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "exceptionHandler",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "scope",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final exceptionHandler:Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;

.field private final scope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field private final waitDialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x4f5

    .line 5
    .line 6
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 13
    .line 14
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x4f6

    .line 18
    .line 19
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->waitDialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 23
    .line 24
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$special$$inlined$CoroutineExceptionHandler$1;

    .line 25
    .line 26
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$special$$inlined$CoroutineExceptionHandler$1;-><init>(Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->exceptionHandler:Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;

    .line 32
    .line 33
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 34
    .line 35
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->scope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 46
    .line 47
    return-void
.end method

.method public static final synthetic access$getTAG$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->waitDialog:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$uploadToNet(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->uploadToNet(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final uploadToNet(Ljava/io/File;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;->getApiService()Ltop/suzhelan/plugin/sdk/online/net/ApiService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 6
    .line 7
    sget-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 8
    .line 9
    const/16 v0, 0x25

    .line 10
    .line 11
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲兰苏;

    .line 23
    .line 24
    invoke-direct {v1, v0, p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲兰苏;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0, p1, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲兰苏;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->getUSER_UIN()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/16 v1, 0x2be

    .line 46
    .line 47
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v2}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪兰哲苏;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->getUSER_NICKNAME()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v2, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏世哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪兰哲苏;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {p0, p1, v0, v1}, Ltop/suzhelan/plugin/sdk/online/net/ApiService;->uploadFile(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object p0, p0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 89
    .line 90
    return-object p0
.end method


# virtual methods
.method public final upload(Llin/xposed/hook/javaplugin/bean/PluginInfo;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;
    .locals 3

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->scope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 10
    .line 11
    new-instance v1, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, p1, v2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;-><init>(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Llin/xposed/hook/javaplugin/bean/PluginInfo;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    invoke-static {v0, v2, v2, v1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
