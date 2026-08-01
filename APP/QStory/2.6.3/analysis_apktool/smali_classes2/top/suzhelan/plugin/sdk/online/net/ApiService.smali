.class public interface abstract Ltop/suzhelan/plugin/sdk/online/net/ApiService;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/suzhelan/plugin/sdk/online/net/ApiService$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J?\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00040\u00030\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0003\u0010\t\u001a\u00020\u00052\u0008\u0008\u0003\u0010\n\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00040\u00030\u00022\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\u0014\u0010\u0011Ja\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ9\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u001f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u001fH\'\u00a2\u0006\u0004\u0008 \u0010!J9\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u00030\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0003\u0010\"\u001a\u00020\u00152\u0008\u0008\u0003\u0010#\u001a\u00020\u0015H\'\u00a2\u0006\u0004\u0008%\u0010&J%\u0010\'\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00030\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\'\u0010\u0011J;\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\u0008\u0008\u0001\u0010(\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008+\u0010,J1\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)0\u00030\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008-\u0010\u0011\u00a8\u0006.\u00c0\u0006\u0003"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/net/ApiService;",
        "",
        "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "Ltop/suzhelan/plugin/sdk/online/net/QSResult;",
        "",
        "",
        "getTags",
        "()Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "uin",
        "sort",
        "tag",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "getOnlinePluginList",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "cloudId",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
        "download",
        "(Ljava/lang/String;)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "pluginId",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "getComments",
        "",
        "replyId",
        "nickname",
        "content",
        "ts",
        "sign",
        "addComment",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "file",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;",
        "uploadFile",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "page",
        "pageSize",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "getMessages",
        "(Ljava/lang/String;II)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "getUnreadCount",
        "id",
        "",
        "",
        "markMessageRead",
        "(ILjava/lang/String;)Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "markAllMessagesRead",
        "online-plugin-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic getMessages$default(Ltop/suzhelan/plugin/sdk/online/net/ApiService;Ljava/lang/String;IIILjava/lang/Object;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/16 p3, 0x14

    .line 13
    .line 14
    :cond_1
    invoke-interface {p0, p1, p2, p3}, Ltop/suzhelan/plugin/sdk/online/net/ApiService;->getMessages(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_2
    const-string p0, "Super calls with default arguments not supported in this target, function: getMessages"

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static synthetic getOnlinePluginList$default(Ltop/suzhelan/plugin/sdk/online/net/ApiService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const-string p2, "time"

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const-string p3, "\u5168\u90e8"

    .line 14
    .line 15
    :cond_1
    invoke-interface {p0, p1, p2, p3}, Ltop/suzhelan/plugin/sdk/online/net/ApiService;->getOnlinePluginList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_2
    const-string p0, "Super calls with default arguments not supported in this target, function: getOnlinePluginList"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method


# virtual methods
.method public abstract addComment(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "pluginId"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "replyId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "nickname"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "uin"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "content"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "ts"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "sign"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰苏哲;
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲苏世兰;
        value = "comment/add"
    .end annotation
.end method

.method public abstract download(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世苏哲;
            value = "cloudId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
            ">;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "plugins/files/{cloudId}"
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰哲世苏;
    .end annotation
.end method

.method public abstract getComments(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "pluginId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "comment/get"
    .end annotation
.end method

.method public abstract getMessages(Ljava/lang/String;II)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "uin"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "page"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "messages/list"
    .end annotation
.end method

.method public abstract getOnlinePluginList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "uin"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "sort"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "tag"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5170\u4e16\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "plugins"
    .end annotation
.end method

.method public abstract getTags()Lretrofit2/飘花落叶言子楪世兰苏哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "tags"
    .end annotation
.end method

.method public abstract getUnreadCount(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世哲苏;
            value = "uin"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰哲苏;
        value = "messages/unread-count"
    .end annotation
.end method

.method public abstract markAllMessagesRead(Ljava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "uin"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰苏哲;
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲苏世兰;
        value = "messages/read-all"
    .end annotation
.end method

.method public abstract markMessageRead(ILjava/lang/String;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # I
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪兰世苏哲;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世哲苏兰;
            value = "uin"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世兰苏哲;
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲苏世兰;
        value = "messages/read/{id}"
    .end annotation
.end method

.method public abstract uploadFile(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;
    .param p1    # L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰苏哲世;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲兰世苏;
        .end annotation
    .end param
    .param p2    # L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲兰世苏;
            value = "uin"
        .end annotation
    .end param
    .param p3    # L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;
        .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲兰世苏;
            value = "nickname"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;",
            ")",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪哲苏世兰;
        value = "upload"
    .end annotation

    .annotation runtime L飘花落叶言苏楪子兰哲世/飘花落叶言子楪苏兰哲世;
    .end annotation
.end method
