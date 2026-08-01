.class final synthetic Landroidx/compose/foundation/AbstractClickableNode$focusableNode$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "onFocusChange(Z)V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    const-string v4, "onFocusChange"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 123
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AbstractClickableNode$focusableNode$1;->invoke(Z)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰苏哲楪:Landroidx/collection/飘花落叶言子世苏哲楪兰;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子兰世苏哲楪()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v2, v0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏楪兰哲:Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/collection/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v4, v1, Landroidx/collection/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:[J

    .line 23
    .line 24
    array-length v5, v4

    .line 25
    add-int/lit8 v5, v5, -0x2

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    if-ltz v5, :cond_4

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    :goto_0
    aget-wide v9, v4, v8

    .line 32
    .line 33
    not-long v11, v9

    .line 34
    const/4 v13, 0x7

    .line 35
    shl-long/2addr v11, v13

    .line 36
    and-long/2addr v11, v9

    .line 37
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v11, v13

    .line 43
    cmp-long v11, v11, v13

    .line 44
    .line 45
    if-eqz v11, :cond_3

    .line 46
    .line 47
    sub-int v11, v8, v5

    .line 48
    .line 49
    not-int v11, v11

    .line 50
    ushr-int/lit8 v11, v11, 0x1f

    .line 51
    .line 52
    const/16 v12, 0x8

    .line 53
    .line 54
    rsub-int/lit8 v11, v11, 0x8

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    :goto_1
    if-ge v13, v11, :cond_2

    .line 58
    .line 59
    const-wide/16 v14, 0xff

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    const-wide/16 v16, 0x80

    .line 63
    .line 64
    cmp-long v14, v14, v16

    .line 65
    .line 66
    if-gez v14, :cond_1

    .line 67
    .line 68
    shl-int/lit8 v14, v8, 0x3

    .line 69
    .line 70
    add-int/2addr v14, v13

    .line 71
    aget-object v14, v2, v14

    .line 72
    .line 73
    check-cast v14, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 76
    .line 77
    .line 78
    move-result-object v15

    .line 79
    new-instance v7, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$1$1;

    .line 80
    .line 81
    invoke-direct {v7, v0, v14, v3}, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$1$1;-><init>(Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v15, v3, v3, v7, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 85
    .line 86
    .line 87
    :cond_1
    shr-long/2addr v9, v12

    .line 88
    add-int/lit8 v13, v13, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    if-ne v11, v12, :cond_4

    .line 92
    .line 93
    :cond_3
    if-eq v8, v5, :cond_4

    .line 94
    .line 95
    add-int/lit8 v8, v8, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    iget-object v2, v0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰哲苏楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    new-instance v5, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$2$1;

    .line 107
    .line 108
    invoke-direct {v5, v0, v2, v3}, Landroidx/compose/foundation/AbstractClickableNode$onFocusChange$2$1;-><init>(Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v4, v3, v3, v5, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()V

    .line 115
    .line 116
    .line 117
    iput-object v3, v0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰哲苏楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子兰世哲楪苏()V

    .line 120
    .line 121
    .line 122
    return-void
.end method
