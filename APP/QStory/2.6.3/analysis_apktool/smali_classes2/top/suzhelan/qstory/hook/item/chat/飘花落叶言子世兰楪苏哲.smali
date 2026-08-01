.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰楪苏哲;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
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


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x2990398

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/16 v0, 0x4e9

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x9d

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
