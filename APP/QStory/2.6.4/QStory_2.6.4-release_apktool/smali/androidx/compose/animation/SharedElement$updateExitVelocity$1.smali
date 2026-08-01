.class final Landroidx/compose/animation/SharedElement$updateExitVelocity$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.animation.SharedElement$updateExitVelocity$1"
    f = "SharedElement.kt"
    l = {
        0x5e
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $velocity:J

.field label:I

.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u4e16\u54f2\u5170;",
            "J",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/animation/SharedElement$updateExitVelocity$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->$velocity:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
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
    new-instance p1, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;

    .line 4
    .line 5
    iget-wide v1, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->$velocity:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;-><init>(Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->label:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->this$0:Landroidx/compose/animation/飘花落叶言子苏楪世哲兰;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v4, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 37
    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    invoke-direct {v4, v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 41
    .line 42
    .line 43
    sget-object v5, Landroidx/compose/animation/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 44
    .line 45
    iget-wide v6, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->$velocity:J

    .line 46
    .line 47
    invoke-static {v6, v7}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(J)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {v6, v7}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(J)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-long v6, p1

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-long v8, p1

    .line 65
    const/16 p1, 0x20

    .line 66
    .line 67
    shl-long/2addr v6, p1

    .line 68
    const-wide v10, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v8, v10

    .line 74
    or-long/2addr v6, v8

    .line 75
    move-wide v7, v6

    .line 76
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 77
    .line 78
    invoke-direct {v6, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 79
    .line 80
    .line 81
    iput v2, p0, Landroidx/compose/animation/SharedElement$updateExitVelocity$1;->label:I

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/16 v9, 0x8

    .line 86
    .line 87
    move-object v8, p0

    .line 88
    invoke-static/range {v3 .. v9}, Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/animation/core/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;Landroidx/compose/foundation/layout/飘花落叶言子哲苏世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    throw v1
.end method
