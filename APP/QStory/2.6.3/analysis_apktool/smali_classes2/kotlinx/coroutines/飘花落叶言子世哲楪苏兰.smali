.class public abstract Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;
.super L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v0, v1, v2}, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪苏世兰哲;-><init>(JZ)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    iget-object v1, v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 11
    .line 12
    iget-object v0, v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {v1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v3, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪苏兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)Lkotlinx/coroutines/飘花落叶言子哲世苏兰楪;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catch Lkotlinx/coroutines/DispatchException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    move-object v3, v4

    .line 39
    :goto_0
    :try_start_1
    invoke-interface {v1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪苏哲世兰()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {p0, v6}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    if-nez v7, :cond_3

    .line 52
    .line 53
    iget v8, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 54
    .line 55
    const/4 v9, 0x1

    .line 56
    if-eq v8, v9, :cond_2

    .line 57
    .line 58
    const/4 v10, 0x2

    .line 59
    if-ne v8, v10, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v9, 0x0

    .line 63
    :cond_2
    :goto_1
    if-eqz v9, :cond_3

    .line 64
    .line 65
    sget-object v4, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 66
    .line 67
    invoke-interface {v5, v4}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    :goto_2
    if-eqz v4, :cond_4

    .line 77
    .line 78
    invoke-interface {v4}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世兰哲苏()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    invoke-interface {v4}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰苏哲世()Ljava/util/concurrent/CancellationException;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p0, v4}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-interface {v1, v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    if-eqz v7, :cond_5

    .line 104
    .line 105
    new-instance v4, Lkotlin/Result$Failure;

    .line 106
    .line 107
    invoke-direct {v4, v7}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v1, v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    invoke-virtual {p0, v6}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-interface {v1, v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    .line 129
    :goto_3
    if-eqz v3, :cond_6

    .line 130
    .line 131
    :try_start_2
    invoke-virtual {v3}, Lkotlinx/coroutines/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲世苏兰楪()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    :cond_6
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :goto_4
    if-eqz v3, :cond_7

    .line 142
    .line 143
    invoke-virtual {v3}, Lkotlinx/coroutines/飘花落叶言子哲世苏兰楪;->飘花落叶言子哲世苏兰楪()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_8

    .line 148
    .line 149
    :cond_7
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    throw v1
    :try_end_2
    .catch Lkotlinx/coroutines/DispatchException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    :goto_5
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :goto_6
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v0}, Lkotlinx/coroutines/DispatchException;->getCause()Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p0, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_7
    return-void
.end method

.method public 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 1

    .line 1
    instance-of p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    return-object v0
.end method

.method public abstract 飘花落叶言子楪世哲兰苏()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
.end method

.method public 飘花落叶言子楪世哲苏兰(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/coroutines/CoroutinesInternalError;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fatal exception in coroutines machinery for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/CoroutinesInternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public abstract 飘花落叶言子楪苏哲世兰()Ljava/lang/Object;
.end method
