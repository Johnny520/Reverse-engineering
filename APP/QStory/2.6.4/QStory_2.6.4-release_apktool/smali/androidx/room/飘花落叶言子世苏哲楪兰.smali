.class public final Landroidx/room/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:[I

.field public final synthetic 飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Z

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;ZLkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世哲苏:[I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [I

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰([ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰([ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;-><init>(Landroidx/room/飘花落叶言子世苏哲楪兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    iget-object v7, v0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    if-eq v5, v9, :cond_2

    .line 45
    .line 46
    if-ne v5, v8, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    :goto_1
    iget-object v0, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, [I

    .line 58
    .line 59
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v5, v0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 69
    .line 70
    iget-object v10, v0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 71
    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    iget-boolean v0, v0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 75
    .line 76
    if-eqz v0, :cond_8

    .line 77
    .line 78
    invoke-static {v5}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏兰楪世哲([Ljava/lang/Object;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v1, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput v9, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->label:I

    .line 85
    .line 86
    invoke-interface {v10, v0, v3}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v4, :cond_8

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    array-length v9, v5

    .line 99
    const/4 v11, 0x0

    .line 100
    move v12, v11

    .line 101
    :goto_2
    if-ge v11, v9, :cond_7

    .line 102
    .line 103
    aget-object v13, v5, v11

    .line 104
    .line 105
    add-int/lit8 v14, v12, 0x1

    .line 106
    .line 107
    iget-object v15, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 108
    .line 109
    if-eqz v15, :cond_6

    .line 110
    .line 111
    check-cast v15, [I

    .line 112
    .line 113
    move-object/from16 p2, v6

    .line 114
    .line 115
    iget-object v6, v0, Landroidx/room/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世哲苏:[I

    .line 116
    .line 117
    aget v6, v6, v12

    .line 118
    .line 119
    aget v12, v15, v6

    .line 120
    .line 121
    aget v6, v1, v6

    .line 122
    .line 123
    if-eq v12, v6, :cond_5

    .line 124
    .line 125
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 129
    .line 130
    move-object/from16 v6, p2

    .line 131
    .line 132
    move v12, v14

    .line 133
    goto :goto_2

    .line 134
    :cond_6
    move-object/from16 p2, v6

    .line 135
    .line 136
    const-string v0, "Required value was null."

    .line 137
    .line 138
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object p2

    .line 142
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_8

    .line 147
    .line 148
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世楪哲苏(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v1, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput v8, v3, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2$emit$1;->label:I

    .line 155
    .line 156
    invoke-interface {v10, v0, v3}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-ne v0, v4, :cond_8

    .line 161
    .line 162
    :goto_3
    return-object v4

    .line 163
    :cond_8
    move-object v0, v1

    .line 164
    :goto_4
    iput-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 165
    .line 166
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 167
    .line 168
    return-object v0
.end method
