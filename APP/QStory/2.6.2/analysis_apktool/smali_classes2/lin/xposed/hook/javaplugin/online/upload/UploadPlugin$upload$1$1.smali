.class final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "lin.xposed.hook.javaplugin.online.upload.UploadPlugin$upload$1$1"
    f = "UploadPlugin.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Ltop/suzhelan/plugin/sdk/online/net/QSResult;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->$res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$lambda$0(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method private static final invokeSuspend$lambda$1(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->invokeSuspend$lambda$1(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->invokeSuspend$lambda$0(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->$res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;-><init>(Ltop/suzhelan/plugin/sdk/online/net/QSResult;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->$res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 11
    .line 12
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->getStatus()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 v0, 0xc8

    .line 17
    .line 18
    const-wide v1, -0x36a54ec9051405a7L    # -2.3810278342071914E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const-wide v3, -0x36a57f7b051405a7L    # -2.3640599942630458E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->$res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 35
    .line 36
    invoke-virtual {p0}, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/online/upload/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const-wide v3, -0x36a57f8d051405a7L    # -2.3640354939326274E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$upload$1$1;->$res:Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 68
    .line 69
    invoke-virtual {p0}, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, Llin/xposed/hook/javaplugin/online/upload/飘花落叶言子楪世苏哲兰;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/online/upload/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_1
    const-wide p0, -0x36a57f60051405a7L    # -2.3640967447586732E45

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method
