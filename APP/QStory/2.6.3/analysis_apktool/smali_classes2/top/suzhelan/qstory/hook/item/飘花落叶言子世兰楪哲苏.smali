.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf;",
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
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

.field public final 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 10
    .line 11
    const v0, 0x28ae9320

    .line 12
    .line 13
    .line 14
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

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
    const/16 v0, 0x369

    .line 10
    .line 11
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 20
    .line 21
    const/16 v2, 0x15fa

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    if-lt v1, v2, :cond_0

    .line 26
    .line 27
    const/16 v0, 0xa0

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/16 v0, 0xa4

    .line 38
    .line 39
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 48
    .line 49
    invoke-direct {v0, p0, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 p1, 0x777

    .line 57
    .line 58
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 76
    .line 77
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;

    .line 78
    .line 79
    invoke-direct {p1, p0, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x776

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
