.class public final Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世兰楪苏哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    sget-object v0, Landroidx/collection/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:[J

    .line 14
    .line 15
    new-instance v0, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 21
    .line 22
    new-instance v0, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    const/16 v1, 0xc

    .line 25
    .line 26
    invoke-direct {v0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/font/飘花落叶言子楪兰苏哲世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;-><init>(Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-boolean p2, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->Z$0:Z

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰苏哲;

    .line 42
    .line 43
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p4, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰苏哲;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    monitor-enter p1

    .line 67
    :try_start_0
    iget-object v2, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 68
    .line 69
    invoke-virtual {v2, p4}, Landroidx/collection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;

    .line 74
    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    iget-object v2, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 78
    .line 79
    invoke-virtual {v2, p4}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_5

    .line 88
    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    .line 89
    .line 90
    iget-object p0, v2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    monitor-exit p1

    .line 93
    return-object p0

    .line 94
    :cond_4
    monitor-exit p1

    .line 95
    iput-object p4, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    iput-boolean p2, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->Z$0:Z

    .line 98
    .line 99
    iput v4, v0, Landroidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1;->label:I

    .line 100
    .line 101
    invoke-interface {p3, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v1, :cond_5

    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_5
    move-object v5, p4

    .line 109
    move-object p4, p1

    .line 110
    move-object p1, v5

    .line 111
    :goto_2
    iget-object p3, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 112
    .line 113
    monitor-enter p3

    .line 114
    if-nez p4, :cond_6

    .line 115
    .line 116
    :try_start_1
    iget-object p0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 117
    .line 118
    new-instance p2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;

    .line 119
    .line 120
    invoke-direct {p2, v3}, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    if-eqz p2, :cond_7

    .line 130
    .line 131
    iget-object p0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 132
    .line 133
    new-instance p2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;

    .line 134
    .line 135
    invoke-direct {p2, p4}, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1, p2}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    iget-object p0, p0, Landroidx/compose/ui/text/font/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 143
    .line 144
    new-instance p2, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;

    .line 145
    .line 146
    invoke-direct {p2, p4}, Landroidx/compose/ui/text/font/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1, p2}, Landroidx/collection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    .line 151
    .line 152
    :goto_3
    monitor-exit p3

    .line 153
    return-object p4

    .line 154
    :goto_4
    monitor-exit p3

    .line 155
    throw p0

    .line 156
    :goto_5
    monitor-exit p1

    .line 157
    throw p0
.end method
