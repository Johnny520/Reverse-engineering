.class public final Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世哲苏;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u54f2\u82cf;",
        "<init>",
        "()V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
        "chain",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u54f2\u696a\u5170;",
        "intercept",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;)L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u54f2\u696a\u5170;",
        "online-sticker-sdk_release"
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
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public intercept(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    iget-object p0, p1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 7
    .line 8
    invoke-static {}, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->getUSER_NICKNAME()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "UTF-8"

    .line 13
    .line 14
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v1, "Uin"

    .line 38
    .line 39
    invoke-static {}, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->getUSER_UIN()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p0, v1, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v1, "Nickname"

    .line 50
    .line 51
    invoke-virtual {p0, v1, v0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 55
    .line 56
    invoke-direct {v0, p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
