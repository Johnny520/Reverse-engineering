.class final Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "R",
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1"
    f = "DBUtil.android.kt"
    l = {
        0x104
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $db:Landroidx/room/飘花落叶言子楪兰哲苏世;

.field final synthetic $inTransaction:Z

.field final synthetic $isReadOnly:Z

.field label:I


# direct methods
.method public constructor <init>(Landroidx/room/飘花落叶言子楪兰哲苏世;ZZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
            "ZZ",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$db:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$inTransaction:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$isReadOnly:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 6
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
    new-instance v0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$db:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$inTransaction:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$isReadOnly:Z

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;-><init>(Landroidx/room/飘花落叶言子楪兰哲苏世;ZZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$db:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$db:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲兰世()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    :cond_2
    iget-boolean p1, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$inTransaction:Z

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    move v4, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 p1, 0x0

    .line 47
    move v4, p1

    .line 48
    :goto_0
    iget-object v6, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$db:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 49
    .line 50
    iget-boolean v5, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$isReadOnly:Z

    .line 51
    .line 52
    iget-object v8, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 53
    .line 54
    new-instance v3, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-direct/range {v3 .. v8}, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1;-><init>(ZZLandroidx/room/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 58
    .line 59
    .line 60
    iput v2, p0, Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1$1;->label:I

    .line 61
    .line 62
    invoke-virtual {v6, v5, v3, p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰哲世(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v0, :cond_4

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_4
    return-object p0
.end method
