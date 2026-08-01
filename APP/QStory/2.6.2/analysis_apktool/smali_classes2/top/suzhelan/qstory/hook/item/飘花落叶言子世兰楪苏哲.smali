.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
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
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

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
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/HashSet;

    .line 10
    .line 11
    const v0, 0x28ae9320

    .line 12
    .line 13
    .line 14
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a554cd051405a7L    # -2.3789316948269584E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 26
    .line 27
    const/16 v2, 0x15fa

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    if-lt v1, v2, :cond_0

    .line 32
    .line 33
    const-wide v0, -0x36a50a19051405a7L    # -2.4049619347669426E45

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-wide v0, -0x36a50923051405a7L    # -2.4052967726159928E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const-wide v1, -0x36a5b068051405a7L    # -2.3470118476803067E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 83
    .line 84
    invoke-direct {v0, p0, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 91
    .line 92
    new-instance p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;

    .line 93
    .line 94
    invoke-direct {p1, p0, v3}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5b072051405a7L    # -2.34699823638563E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
