.class final Landroidx/compose/runtime/Recomposer$recompositionRunner$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
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
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.runtime.Recomposer$recompositionRunner$2"
    f = "Recomposer.kt"
    l = {
        0x439
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $block:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $parentFrameClock:Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u4e16\u696a;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/runtime/Recomposer$recompositionRunner$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$block:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$parentFrameClock:Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/Set;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    iget-object v3, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 9
    .line 10
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Landroidx/compose/runtime/Recomposer$State;

    .line 15
    .line 16
    sget-object v4, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ltz v3, :cond_7

    .line 23
    .line 24
    iget-object v3, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪苏世兰哲:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 25
    .line 26
    instance-of v4, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    check-cast v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    iget-object v1, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子苏世楪哲兰;

    .line 34
    .line 35
    iget-object v4, v1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v1, v1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 38
    .line 39
    array-length v6, v1

    .line 40
    add-int/lit8 v6, v6, -0x2

    .line 41
    .line 42
    if-ltz v6, :cond_6

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move v8, v7

    .line 46
    :goto_0
    aget-wide v9, v1, v8

    .line 47
    .line 48
    not-long v11, v9

    .line 49
    const/4 v13, 0x7

    .line 50
    shl-long/2addr v11, v13

    .line 51
    and-long/2addr v11, v9

    .line 52
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v11, v13

    .line 58
    cmp-long v11, v11, v13

    .line 59
    .line 60
    if-eqz v11, :cond_3

    .line 61
    .line 62
    sub-int v11, v8, v6

    .line 63
    .line 64
    not-int v11, v11

    .line 65
    ushr-int/lit8 v11, v11, 0x1f

    .line 66
    .line 67
    const/16 v12, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v11, v11, 0x8

    .line 70
    .line 71
    move v13, v7

    .line 72
    :goto_1
    if-ge v13, v11, :cond_2

    .line 73
    .line 74
    const-wide/16 v14, 0xff

    .line 75
    .line 76
    and-long/2addr v14, v9

    .line 77
    const-wide/16 v16, 0x80

    .line 78
    .line 79
    cmp-long v14, v14, v16

    .line 80
    .line 81
    if-gez v14, :cond_1

    .line 82
    .line 83
    shl-int/lit8 v14, v8, 0x3

    .line 84
    .line 85
    add-int/2addr v14, v13

    .line 86
    aget-object v14, v4, v14

    .line 87
    .line 88
    instance-of v15, v14, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;

    .line 89
    .line 90
    if-eqz v15, :cond_0

    .line 91
    .line 92
    move-object v15, v14

    .line 93
    check-cast v15, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;

    .line 94
    .line 95
    invoke-virtual {v15, v5}, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    if-nez v15, :cond_0

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_5

    .line 104
    :cond_0
    invoke-virtual {v3, v14}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_1
    :goto_2
    shr-long/2addr v9, v12

    .line 108
    add-int/lit8 v13, v13, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    if-ne v11, v12, :cond_6

    .line 112
    .line 113
    :cond_3
    if-eq v8, v6, :cond_6

    .line 114
    .line 115
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    check-cast v1, Ljava/lang/Iterable;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    instance-of v6, v4, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;

    .line 135
    .line 136
    if-eqz v6, :cond_5

    .line 137
    .line 138
    move-object v6, v4

    .line 139
    check-cast v6, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;

    .line 140
    .line 141
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/snapshots/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_5

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-virtual {v3, v4}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 153
    .line 154
    .line 155
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    const/4 v0, 0x0

    .line 158
    :goto_4
    monitor-exit v2

    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 162
    .line 163
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 173
    .line 174
    return-object v0

    .line 175
    :goto_5
    monitor-exit v2

    .line 176
    throw v0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/Set;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->invokeSuspend$lambda$0(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Ljava/util/Set;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    new-instance v0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$block:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$parentFrameClock:Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;-><init>(Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$1:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 39
    .line 40
    invoke-interface {p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 49
    .line 50
    iget-object v4, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v4

    .line 53
    :try_start_1
    iget-object v5, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v5, :cond_13

    .line 56
    .line 57
    iget-object v5, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 58
    .line 59
    invoke-virtual {v5}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Landroidx/compose/runtime/Recomposer$State;

    .line 64
    .line 65
    sget-object v6, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lez v5, :cond_12

    .line 72
    .line 73
    iget-object v5, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 74
    .line 75
    if-nez v5, :cond_11

    .line 76
    .line 77
    iput-object v1, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    const-string p1, "called outside of runRecomposeAndApplyChanges"

    .line 86
    .line 87
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :cond_2
    :goto_0
    monitor-exit v4

    .line 95
    iget-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 96
    .line 97
    new-instance v4, Landroidx/compose/runtime/飘花落叶言子苏兰世哲楪;

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-direct {v4, p1, v5}, Landroidx/compose/runtime/飘花落叶言子苏兰世哲楪;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    sget-object p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;

    .line 104
    .line 105
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 109
    .line 110
    monitor-enter p1

    .line 111
    :try_start_2
    sget-object v6, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v6, v4}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏哲世(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    sput-object v6, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 118
    .line 119
    monitor-exit p1

    .line 120
    new-instance p1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;

    .line 121
    .line 122
    invoke-direct {p1, v4}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 123
    .line 124
    .line 125
    sget-object v4, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 126
    .line 127
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 128
    .line 129
    iget-object v4, v4, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 130
    .line 131
    :cond_3
    sget-object v6, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 132
    .line 133
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    check-cast v7, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 138
    .line 139
    invoke-virtual {v7, v4}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    if-eq v7, v8, :cond_4

    .line 144
    .line 145
    invoke-virtual {v6, v7, v8}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_3

    .line 150
    .line 151
    :cond_4
    :try_start_3
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 152
    .line 153
    iget-object v6, v4, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 154
    .line 155
    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 156
    :try_start_4
    invoke-virtual {v4}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世苏楪哲兰()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 160
    :try_start_5
    monitor-exit v6

    .line 161
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    move v7, v5

    .line 166
    :goto_1
    if-ge v7, v6, :cond_8

    .line 167
    .line 168
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    check-cast v8, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 173
    .line 174
    iget-object v8, v8, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世兰哲;

    .line 175
    .line 176
    iget-object v8, v8, Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:[Ljava/lang/Object;

    .line 177
    .line 178
    array-length v9, v8

    .line 179
    move v10, v5

    .line 180
    :goto_2
    if-ge v10, v9, :cond_7

    .line 181
    .line 182
    aget-object v11, v8, v10

    .line 183
    .line 184
    instance-of v12, v11, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 185
    .line 186
    if-eqz v12, :cond_5

    .line 187
    .line 188
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    move-object v11, v2

    .line 192
    :goto_3
    if-eqz v11, :cond_6

    .line 193
    .line 194
    iget-object v12, v11, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 195
    .line 196
    if-eqz v12, :cond_6

    .line 197
    .line 198
    invoke-virtual {v12, v11, v2}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世(Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    .line 199
    .line 200
    .line 201
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :goto_4
    move-object v13, v0

    .line 208
    move-object v0, p1

    .line 209
    move-object p1, v13

    .line 210
    goto :goto_8

    .line 211
    :catchall_2
    move-exception v0

    .line 212
    goto :goto_4

    .line 213
    :cond_8
    new-instance v4, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$2;

    .line 214
    .line 215
    iget-object v5, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$block:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 216
    .line 217
    iget-object v6, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->$parentFrameClock:Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;

    .line 218
    .line 219
    invoke-direct {v4, v5, v6, v2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$2;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 220
    .line 221
    .line 222
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$0:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->L$1:Ljava/lang/Object;

    .line 225
    .line 226
    iput v3, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->label:I

    .line 227
    .line 228
    invoke-static {v4, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 232
    if-ne v3, v0, :cond_9

    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_9
    move-object v0, p1

    .line 236
    :goto_5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 237
    .line 238
    .line 239
    iget-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 240
    .line 241
    iget-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 242
    .line 243
    monitor-enter v0

    .line 244
    :try_start_6
    iget-object v3, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 245
    .line 246
    if-ne v3, v1, :cond_a

    .line 247
    .line 248
    iput-object v2, p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :catchall_3
    move-exception p0

    .line 252
    goto :goto_7

    .line 253
    :cond_a
    :goto_6
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    if-eqz p1, :cond_b

    .line 258
    .line 259
    const-string p1, "called outside of runRecomposeAndApplyChanges"

    .line 260
    .line 261
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 262
    .line 263
    .line 264
    :cond_b
    monitor-exit v0

    .line 265
    sget-object p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 266
    .line 267
    iget-object p0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 268
    .line 269
    iget-object p0, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 270
    .line 271
    :cond_c
    sget-object p1, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 272
    .line 273
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 278
    .line 279
    invoke-virtual {v0, p0}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    if-eq v0, v1, :cond_d

    .line 284
    .line 285
    invoke-virtual {p1, v0, v1}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_c

    .line 290
    .line 291
    :cond_d
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 292
    .line 293
    return-object p0

    .line 294
    :goto_7
    monitor-exit v0

    .line 295
    throw p0

    .line 296
    :catchall_4
    move-exception v0

    .line 297
    :try_start_7
    monitor-exit v6

    .line 298
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 299
    :goto_8
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 300
    .line 301
    .line 302
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 303
    .line 304
    iget-object v3, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 305
    .line 306
    monitor-enter v3

    .line 307
    :try_start_8
    iget-object v4, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 308
    .line 309
    if-ne v4, v1, :cond_e

    .line 310
    .line 311
    iput-object v2, v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :catchall_5
    move-exception p0

    .line 315
    goto :goto_b

    .line 316
    :cond_e
    :goto_9
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_f

    .line 321
    .line 322
    const-string v0, "called outside of runRecomposeAndApplyChanges"

    .line 323
    .line 324
    invoke-static {v0}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 325
    .line 326
    .line 327
    :cond_f
    monitor-exit v3

    .line 328
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 329
    .line 330
    iget-object p0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->this$0:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 331
    .line 332
    iget-object p0, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 333
    .line 334
    :goto_a
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪哲苏兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 335
    .line 336
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 341
    .line 342
    invoke-virtual {v1, p0}, L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)L飘花落叶言子世苏兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    if-eq v1, v2, :cond_10

    .line 347
    .line 348
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-nez v0, :cond_10

    .line 353
    .line 354
    goto :goto_a

    .line 355
    :cond_10
    throw p1

    .line 356
    :goto_b
    monitor-exit v3

    .line 357
    throw p0

    .line 358
    :catchall_6
    move-exception p0

    .line 359
    monitor-exit p1

    .line 360
    throw p0

    .line 361
    :cond_11
    :try_start_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 362
    .line 363
    const-string p1, "Recomposer already running"

    .line 364
    .line 365
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw p0

    .line 369
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 370
    .line 371
    const-string p1, "Recomposer shut down"

    .line 372
    .line 373
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw p0

    .line 377
    :cond_13
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 378
    :goto_c
    monitor-exit v4

    .line 379
    throw p0
.end method
