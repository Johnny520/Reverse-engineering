.class final synthetic Landroidx/compose/foundation/FocusableNode$focusTargetNode$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v3, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;

    .line 6
    .line 7
    const-string v4, "onFocusStateChange"

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
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 164
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;

    check-cast p2, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/FocusableNode$focusTargetNode$1;->invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-interface {p2}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->isFocused()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-interface {p1}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->isFocused()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-ne p2, p1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏哲楪兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_2
    sget-object p1, Landroidx/compose/foundation/飘花落叶言子世哲楪兰苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/foundation/飘花落叶言子苏哲世兰楪;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Landroidx/compose/foundation/FocusableNode$onFocusStateChange$1;

    .line 44
    .line 45
    invoke-direct {v2, p0, v0}, Landroidx/compose/foundation/FocusableNode$onFocusStateChange$1;-><init>(Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x3

    .line 49
    invoke-static {v1, v0, v0, v2, v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 50
    .line 51
    .line 52
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 53
    .line 54
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v2, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    invoke-direct {v2, v1, v3, p0}, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v2}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    check-cast v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move-object v1, v0

    .line 79
    :goto_0
    iput-object v1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏兰楪哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 80
    .line 81
    iget-object v1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏兰哲楪:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 82
    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子兰楪世苏哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    iget-boolean v1, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;)Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏兰楪哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 106
    .line 107
    .line 108
    :cond_5
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏兰楪哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 109
    .line 110
    iget-boolean v1, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;)Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏楪兰哲:Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iget-object v1, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 125
    .line 126
    if-eqz p2, :cond_8

    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    new-instance p2, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;

    .line 131
    .line 132
    invoke-direct {p2, v1}, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;-><init>(Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 139
    .line 140
    :cond_7
    new-instance p2, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 141
    .line 142
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)V

    .line 146
    .line 147
    .line 148
    iput-object p2, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    if-eqz v1, :cond_9

    .line 152
    .line 153
    new-instance p2, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;

    .line 154
    .line 155
    invoke-direct {p2, v1}, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;-><init>(Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 162
    .line 163
    :cond_9
    :goto_2
    return-void
.end method
