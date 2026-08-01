.class final Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2"
    f = "Transformable.kt"
    l = {
        0x120,
        0x13b,
        0x14b,
        0x15d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
        }
    .end annotation
.end field

.field final synthetic $currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field final synthetic $scrollConfig:Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u4e16\u54f2\u696a;",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$scrollConfig:Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method private static final invokeSuspend$lambda$1(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method private static final invokeSuspend$lambda$3(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$scrollConfig:Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->label:I

    .line 6
    .line 7
    sget-object v6, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏世哲;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x3

    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x1

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    if-eq v2, v10, :cond_3

    .line 16
    .line 17
    if-eq v2, v9, :cond_2

    .line 18
    .line 19
    if-eq v2, v8, :cond_1

    .line 20
    .line 21
    if-ne v2, v7, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v5, p1

    .line 31
    .line 32
    move v4, v7

    .line 33
    move v3, v8

    .line 34
    goto/16 :goto_e

    .line 35
    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_10

    .line 38
    .line 39
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    return-object v0

    .line 46
    :cond_1
    iget-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    move-object/from16 v4, p1

    .line 54
    .line 55
    move v3, v8

    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    :cond_2
    iget-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    move-object/from16 v3, p1

    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_3
    iget-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 72
    .line 73
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    move-object/from16 v11, p1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 85
    .line 86
    :goto_0
    iget-object v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$currentContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    invoke-static {v11}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-eqz v11, :cond_1a

    .line 93
    .line 94
    :cond_5
    :try_start_4
    iput-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->label:I

    .line 97
    .line 98
    invoke-static {v2, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    if-ne v11, v0, :cond_6

    .line 103
    .line 104
    goto/16 :goto_d

    .line 105
    .line 106
    :cond_6
    :goto_1
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 107
    .line 108
    iget-object v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$scrollConfig:Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;

    .line 109
    .line 110
    invoke-static {v2, v11, v12}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-static {v11}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-static {v11}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    if-nez v12, :cond_7

    .line 123
    .line 124
    if-nez v13, :cond_7

    .line 125
    .line 126
    if-eqz v14, :cond_5

    .line 127
    .line 128
    :cond_7
    sget-object v15, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世哲苏;

    .line 129
    .line 130
    if-eqz v12, :cond_e

    .line 131
    .line 132
    :try_start_5
    iget-wide v12, v12, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 133
    .line 134
    iget-object v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 135
    .line 136
    invoke-interface {v14, v15}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :goto_2
    const-wide v14, 0xffffffffL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    and-long/2addr v12, v14

    .line 145
    long-to-int v12, v12

    .line 146
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    const v13, 0x44084000    # 545.0f

    .line 151
    .line 152
    .line 153
    div-float/2addr v12, v13

    .line 154
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 155
    .line 156
    float-to-double v3, v12

    .line 157
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 158
    .line 159
    .line 160
    iget-object v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 161
    .line 162
    new-instance v4, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世苏哲;

    .line 163
    .line 164
    iget-object v5, v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    const/4 v12, 0x0

    .line 171
    const/4 v13, 0x0

    .line 172
    const-wide/16 v14, 0x0

    .line 173
    .line 174
    :goto_3
    if-ge v12, v11, :cond_9

    .line 175
    .line 176
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v16

    .line 180
    move-object/from16 v10, v16

    .line 181
    .line 182
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 183
    .line 184
    invoke-static {v10}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->invokeSuspend$lambda$0(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 185
    .line 186
    .line 187
    move-result v16

    .line 188
    if-eqz v16, :cond_8

    .line 189
    .line 190
    iget-wide v7, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 191
    .line 192
    invoke-static {v14, v15, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 193
    .line 194
    .line 195
    move-result-wide v14

    .line 196
    add-int/lit8 v13, v13, 0x1

    .line 197
    .line 198
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 199
    .line 200
    const/4 v7, 0x4

    .line 201
    const/4 v8, 0x3

    .line 202
    const/4 v10, 0x1

    .line 203
    goto :goto_3

    .line 204
    :cond_9
    if-nez v13, :cond_a

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_a
    int-to-float v5, v13

    .line 208
    invoke-static {v5, v14, v15}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 209
    .line 210
    .line 211
    :goto_4
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-interface {v3, v4}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    iput-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 218
    .line 219
    iput v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->label:I

    .line 220
    .line 221
    invoke-static {v2, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    if-ne v3, v0, :cond_b

    .line 226
    .line 227
    goto/16 :goto_d

    .line 228
    .line 229
    :cond_b
    :goto_5
    move-object v11, v3

    .line 230
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 231
    .line 232
    iget-object v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$scrollConfig:Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;

    .line 233
    .line 234
    invoke-static {v2, v11, v3}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    if-eqz v3, :cond_c

    .line 239
    .line 240
    iget-wide v12, v3, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 241
    .line 242
    const/4 v7, 0x4

    .line 243
    const/4 v8, 0x3

    .line 244
    const/4 v10, 0x1

    .line 245
    goto :goto_2

    .line 246
    :cond_c
    const/4 v3, 0x3

    .line 247
    :cond_d
    const/4 v4, 0x4

    .line 248
    goto/16 :goto_f

    .line 249
    .line 250
    :cond_e
    if-eqz v13, :cond_13

    .line 251
    .line 252
    iget-object v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 253
    .line 254
    invoke-interface {v3, v15}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    :goto_6
    iget-object v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 258
    .line 259
    new-instance v4, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世苏哲;

    .line 260
    .line 261
    iget-object v5, v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    const/4 v8, 0x0

    .line 268
    const/4 v10, 0x0

    .line 269
    const-wide/16 v11, 0x0

    .line 270
    .line 271
    :goto_7
    if-ge v8, v7, :cond_10

    .line 272
    .line 273
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    check-cast v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 278
    .line 279
    invoke-static {v13}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->invokeSuspend$lambda$1(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    if-eqz v14, :cond_f

    .line 284
    .line 285
    iget-wide v13, v13, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 286
    .line 287
    invoke-static {v11, v12, v13, v14}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v11

    .line 291
    add-int/lit8 v10, v10, 0x1

    .line 292
    .line 293
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_10
    if-nez v10, :cond_11

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_11
    int-to-float v5, v10

    .line 300
    invoke-static {v5, v11, v12}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 301
    .line 302
    .line 303
    :goto_8
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-interface {v3, v4}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    iput-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 310
    .line 311
    const/4 v3, 0x3

    .line 312
    iput v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->label:I

    .line 313
    .line 314
    invoke-static {v2, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    if-ne v4, v0, :cond_12

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_12
    :goto_9
    move-object v11, v4

    .line 322
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 323
    .line 324
    invoke-static {v11}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    if-eqz v4, :cond_d

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_13
    const/4 v3, 0x3

    .line 332
    if-eqz v14, :cond_19

    .line 333
    .line 334
    iget-object v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 335
    .line 336
    invoke-interface {v4, v15}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :goto_a
    iget-object v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 340
    .line 341
    new-instance v5, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪世苏哲;

    .line 342
    .line 343
    iget-object v7, v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 344
    .line 345
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    const/4 v10, 0x0

    .line 350
    const/4 v11, 0x0

    .line 351
    const-wide/16 v12, 0x0

    .line 352
    .line 353
    :goto_b
    if-ge v10, v8, :cond_15

    .line 354
    .line 355
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 360
    .line 361
    invoke-static {v14}, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->invokeSuspend$lambda$3(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-eqz v15, :cond_14

    .line 366
    .line 367
    iget-wide v14, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 368
    .line 369
    invoke-static {v12, v13, v14, v15}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 370
    .line 371
    .line 372
    move-result-wide v12

    .line 373
    add-int/lit8 v11, v11, 0x1

    .line 374
    .line 375
    :cond_14
    add-int/lit8 v10, v10, 0x1

    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_15
    if-nez v11, :cond_16

    .line 379
    .line 380
    goto :goto_c

    .line 381
    :cond_16
    int-to-float v7, v11

    .line 382
    invoke-static {v7, v12, v13}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 383
    .line 384
    .line 385
    :goto_c
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-interface {v4, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    iput-object v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->L$0:Ljava/lang/Object;

    .line 392
    .line 393
    const/4 v4, 0x4

    .line 394
    iput v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->label:I

    .line 395
    .line 396
    invoke-static {v2, v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    if-ne v5, v0, :cond_17

    .line 401
    .line 402
    :goto_d
    return-object v0

    .line 403
    :cond_17
    :goto_e
    move-object v11, v5

    .line 404
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 405
    .line 406
    invoke-static {v11}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)Ljava/lang/Float;

    .line 407
    .line 408
    .line 409
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 410
    if-eqz v5, :cond_18

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_18
    :goto_f
    iget-object v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 414
    .line 415
    invoke-interface {v5, v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move v8, v3

    .line 419
    move v7, v4

    .line 420
    const/4 v10, 0x1

    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :cond_19
    :try_start_6
    const-string v0, "One of zoomOffset, panOffset and scaleDelta must be non-null"

    .line 424
    .line 425
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 426
    .line 427
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 431
    :goto_10
    iget-object v1, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectNonTouchGestures$2;->$channel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 432
    .line 433
    invoke-interface {v1, v6}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    throw v0

    .line 437
    :cond_1a
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 438
    .line 439
    return-object v0
.end method
