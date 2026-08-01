.class public final Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏世兰楪哲;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;Landroidx/compose/runtime/飘花落叶言子苏世兰楪哲;Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏世兰楪哲;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪兰世苏哲:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 9

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    packed-switch p2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰哲苏世()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_0
    iput-boolean v1, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰苏世哲:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit p1

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p0, v0

    .line 35
    monitor-exit p1

    .line 36
    throw p0

    .line 37
    :pswitch_2
    iget-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏世兰楪哲;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p1, Landroidx/compose/runtime/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 43
    .line 44
    iget-object v2, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_1
    iget-object v3, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :try_start_2
    iget-boolean v4, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 51
    .line 52
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    :goto_0
    monitor-exit v2

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    :try_start_4
    iget-object v3, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v4, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ljava/util/ArrayList;

    .line 64
    .line 65
    iput-object v4, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v3, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 68
    .line 69
    iput-boolean v1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    move v1, p2

    .line 76
    :goto_1
    if-ge v1, p1, :cond_1

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 83
    .line 84
    sget-object v5, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 85
    .line 86
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-interface {v4, v5}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    goto :goto_2

    .line 99
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_2
    move-exception v0

    .line 104
    move-object p0, v0

    .line 105
    monitor-exit v3

    .line 106
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 107
    :goto_2
    monitor-exit v2

    .line 108
    throw p0

    .line 109
    :cond_2
    :goto_3
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 110
    .line 111
    iget-object p1, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 112
    .line 113
    monitor-enter p1

    .line 114
    :try_start_5
    iget-boolean v1, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰苏世哲:Z

    .line 115
    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    iput-boolean p2, p0, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪兰苏世哲:Z

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;->飘花落叶言子世楪苏哲兰()Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 124
    goto :goto_4

    .line 125
    :catchall_3
    move-exception v0

    .line 126
    move-object p0, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_3
    :goto_4
    monitor-exit p1

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 132
    .line 133
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    :pswitch_3
    return-void

    .line 143
    :goto_5
    monitor-exit p1

    .line 144
    throw p0

    .line 145
    :pswitch_4
    iget-object p2, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 146
    .line 147
    sget-object v2, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 148
    .line 149
    new-instance v3, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;

    .line 150
    .line 151
    iget-object v4, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪兰世苏哲:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 152
    .line 153
    iget-object v5, p0, Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;

    .line 154
    .line 155
    const/4 v8, 0x0

    .line 156
    move-object v7, p0

    .line 157
    move-object v6, p1

    .line 158
    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/飘花落叶言子苏兰哲世楪;Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/compose/ui/platform/飘花落叶言子兰世苏楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p2, v0, v2, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method
