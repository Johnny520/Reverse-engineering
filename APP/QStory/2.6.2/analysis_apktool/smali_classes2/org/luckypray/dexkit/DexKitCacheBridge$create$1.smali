.class final Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lorg/luckypray/dexkit/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "invoke",
        "()Lorg/luckypray/dexkit/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $appTag:Ljava/lang/String;

.field final synthetic $path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;->$appTag:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;->$path:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;->invoke()Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;->$appTag:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;->$path:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v0, p0, v2, v2}, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method
