.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
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
.field public 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 8

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
    const-wide v0, -0x36a50b93051405a7L    # -2.404447427828158E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-wide v0, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    array-length v0, p1

    .line 41
    const/4 v1, 0x0

    .line 42
    move v2, v1

    .line 43
    :goto_0
    const/4 v3, 0x0

    .line 44
    if-ge v2, v0, :cond_1

    .line 45
    .line 46
    aget-object v4, p1, v2

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const-wide v6, -0x36a50093051405a7L    # -2.4082803684091556E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_0

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x1

    .line 72
    if-ne v5, v6, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v4, v3

    .line 79
    :goto_1
    if-nez v4, :cond_2

    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 83
    .line 84
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v0, Ltop/suzhelan/qstory/hook/api/OnAccountChangeApi$loadHook$1;

    .line 89
    .line 90
    invoke-direct {v0, p0, v3}, Ltop/suzhelan/qstory/hook/api/OnAccountChangeApi$loadHook$1;-><init>(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x3

    .line 94
    invoke-static {p1, v3, v3, v0, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 95
    .line 96
    .line 97
    new-instance p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 98
    .line 99
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 103
    .line 104
    .line 105
    return-void
.end method
