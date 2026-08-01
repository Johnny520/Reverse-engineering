.class final Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;
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
    c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1"
    f = "MediaQuery.android.kt"
    l = {
        0x84
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $scope:Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/compose/ui/adaptive/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$context:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$scope:Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
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
    new-instance p1, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$context:Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$scope:Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;-><init>(Landroid/content/Context;Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->label:I

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
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Landroidx/window/layout/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/window/layout/飘花落叶言子楪世兰哲苏;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$context:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object p1, Landroidx/window/layout/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 36
    .line 37
    invoke-interface {p1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, L飘花落叶言子兰哲楪世苏/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    if-nez p1, :cond_7

    .line 44
    .line 45
    sget-object p1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;

    .line 46
    .line 47
    sget-object p1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    if-nez p1, :cond_6

    .line 50
    .line 51
    sget-object p1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    sget-object v4, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    .line 58
    if-nez v4, :cond_5

    .line 59
    .line 60
    :try_start_1
    invoke-static {}, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object v5, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v4, v4, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 73
    .line 74
    invoke-interface {v4}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v4, Ljava/math/BigInteger;

    .line 82
    .line 83
    iget-object v5, v5, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 84
    .line 85
    invoke-interface {v5}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v5, Ljava/math/BigInteger;

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ltz v4, :cond_3

    .line 99
    .line 100
    new-instance v4, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲兰世;

    .line 101
    .line 102
    invoke-direct {v4, v1}, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲兰世;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲()Z

    .line 106
    .line 107
    .line 108
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    :catchall_0
    :cond_3
    :goto_0
    move-object v4, v2

    .line 112
    :cond_4
    :try_start_2
    new-instance v1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    invoke-direct {v1, v4}, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲兰世;)V

    .line 115
    .line 116
    .line 117
    sput-object v1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_1
    move-exception p0

    .line 121
    goto :goto_2

    .line 122
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :goto_2
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 127
    .line 128
    .line 129
    throw p0

    .line 130
    :cond_6
    :goto_3
    sget-object p1, L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏兰哲世;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    :cond_7
    new-instance v1, Landroidx/window/layout/飘花落叶言子楪苏哲兰世;

    .line 136
    .line 137
    new-instance v4, Landroidx/window/layout/飘花落叶言子楪哲苏世兰;

    .line 138
    .line 139
    invoke-direct {v4}, Landroidx/window/layout/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v5, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 143
    .line 144
    const/4 v6, 0x4

    .line 145
    invoke-direct {v5, v6}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()I

    .line 149
    .line 150
    .line 151
    invoke-direct {v1, v4, p1, v5}, Landroidx/window/layout/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/window/layout/飘花落叶言子楪哲苏世兰;L飘花落叶言子兰哲楪世苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;)V

    .line 152
    .line 153
    .line 154
    sget-object p1, Landroidx/window/layout/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/window/layout/飘花落叶言子楪世苏哲兰;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->$context:Landroid/content/Context;

    .line 160
    .line 161
    invoke-virtual {v1, p1}, Landroidx/window/layout/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance v1, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1$1;

    .line 166
    .line 167
    invoke-direct {v1, v2, v2}, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1$1;-><init>(Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 168
    .line 169
    .line 170
    iput v3, p0, Landroidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$1$1;->label:I

    .line 171
    .line 172
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v0, :cond_8

    .line 177
    .line 178
    return-object v0

    .line 179
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 180
    .line 181
    return-object p0
.end method
