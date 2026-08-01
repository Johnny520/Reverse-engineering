.class public abstract Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3f

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x23

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x40

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Character;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏兰楪世哲([Ljava/lang/Object;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 34
    .line 35
    const-string v0, "HTTP/1.0"

    .line 36
    .line 37
    const-string v1, "HTTP/1.1"

    .line 38
    .line 39
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲兰楪苏([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 51
    .line 52
    const/16 v2, 0xf

    .line 53
    .line 54
    invoke-direct {v1, v2}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 58
    .line 59
    const/16 v3, 0xc

    .line 60
    .line 61
    invoke-direct {v2, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/util/List;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 69
    .line 70
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->label:I

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
    iput v1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget p0, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->I$0:I

    .line 41
    .line 42
    iget-object v1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/lang/CharSequence;

    .line 45
    .line 46
    iget-object v2, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/lang/CharSequence;

    .line 49
    .line 50
    iget-object v0, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, v0

    .line 53
    check-cast v3, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    move v9, p0

    .line 59
    move-object v10, v1

    .line 60
    move-object v8, v2

    .line 61
    move-object v12, v3

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v4

    .line 74
    :cond_2
    iget-object p0, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 77
    .line 78
    iget-object v2, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    iget-object v5, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 85
    .line 86
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    move-object p0, v0

    .line 92
    move-object v3, v2

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 99
    .line 100
    invoke-direct {p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v2, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 104
    .line 105
    invoke-direct {v2}, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 106
    .line 107
    .line 108
    :try_start_2
    iput-object p0, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object p1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v2, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$2:Ljava/lang/Object;

    .line 113
    .line 114
    iput v5, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->label:I

    .line 115
    .line 116
    const/16 v5, 0x2000

    .line 117
    .line 118
    invoke-static {p0, p1, v5, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 122
    if-ne v5, v1, :cond_4

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    move-object v13, v5

    .line 126
    move-object v5, p0

    .line 127
    move-object p0, v2

    .line 128
    move-object v2, p1

    .line 129
    move-object p1, v13

    .line 130
    :goto_1
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_5

    .line 137
    .line 138
    return-object v4

    .line 139
    :cond_5
    iget p1, v2, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:I

    .line 140
    .line 141
    iput p1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 142
    .line 143
    invoke-static {v2, p0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {v2, p0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-static {v2, p0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 152
    .line 153
    .line 154
    iget v6, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 155
    .line 156
    iget v7, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 157
    .line 158
    invoke-virtual {v2, v6, v7}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    iget v7, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 163
    .line 164
    iput v7, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 165
    .line 166
    iput-object v2, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object p1, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$1:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v6, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->L$2:Ljava/lang/Object;

    .line 171
    .line 172
    iput v4, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->I$0:I

    .line 173
    .line 174
    iput v3, v0, Lio/ktor/http/cio/HttpParserKt$parseResponse$1;->label:I

    .line 175
    .line 176
    invoke-static {v5, v2, p0, v0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 180
    if-ne p0, v1, :cond_6

    .line 181
    .line 182
    :goto_2
    return-object v1

    .line 183
    :cond_6
    move-object v8, p1

    .line 184
    move-object v12, v2

    .line 185
    move v9, v4

    .line 186
    move-object v10, v6

    .line 187
    move-object p1, p0

    .line 188
    :goto_3
    :try_start_4
    check-cast p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 189
    .line 190
    if-nez p1, :cond_7

    .line 191
    .line 192
    new-instance p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 193
    .line 194
    invoke-direct {p1, v12}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;-><init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    move-object v11, p1

    .line 198
    goto :goto_4

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    move-object p0, v0

    .line 201
    move-object v3, v12

    .line 202
    goto :goto_5

    .line 203
    :goto_4
    new-instance v7, Lio/ktor/http/cio/飘花落叶言子楪兰世苏哲;

    .line 204
    .line 205
    invoke-direct/range {v7 .. v12}, Lio/ktor/http/cio/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 206
    .line 207
    .line 208
    return-object v7

    .line 209
    :catchall_3
    move-exception v0

    .line 210
    move-object p0, v0

    .line 211
    move-object v3, p1

    .line 212
    :goto_5
    invoke-virtual {v3}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()V

    .line 213
    .line 214
    .line 215
    throw p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v1, p1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;

    .line 7
    .line 8
    iget v2, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->label:I

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    and-int v4, v2, v3

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v3, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->label:I

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x1

    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    if-eq v3, v6, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object v2, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$3:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/CharSequence;

    .line 43
    .line 44
    iget-object v3, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ljava/lang/CharSequence;

    .line 47
    .line 48
    iget-object v4, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 51
    .line 52
    iget-object v1, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    move-object v9, v2

    .line 60
    move-object v8, v3

    .line 61
    move-object v7, v4

    .line 62
    :goto_1
    move-object v11, v1

    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_2
    iget-object v3, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 77
    .line 78
    iget-object v7, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v7, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    iget-object v8, v1, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 85
    .line 86
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    move-object v12, v3

    .line 90
    move-object v3, v1

    .line 91
    move-object v1, v7

    .line 92
    move-object v7, v12

    .line 93
    goto :goto_3

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    move-object v1, v7

    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 102
    .line 103
    invoke-direct {v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 107
    .line 108
    invoke-direct {v3}, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 109
    .line 110
    .line 111
    move-object v7, v3

    .line 112
    move-object v3, v1

    .line 113
    move-object v1, v0

    .line 114
    move-object v0, p0

    .line 115
    :goto_2
    :try_start_2
    iput-object v0, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$0:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v1, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$1:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v7, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$2:Ljava/lang/Object;

    .line 120
    .line 121
    iput v6, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->label:I

    .line 122
    .line 123
    const/16 v8, 0x2000

    .line 124
    .line 125
    invoke-static {v0, v1, v8, v3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    if-ne v8, v2, :cond_4

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_4
    move-object v12, v8

    .line 133
    move-object v8, v0

    .line 134
    move-object v0, v12

    .line 135
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_5
    iget v0, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:I

    .line 145
    .line 146
    iput v0, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 147
    .line 148
    iget v9, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 149
    .line 150
    if-eq v9, v0, :cond_d

    .line 151
    .line 152
    invoke-static {v1, v7}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v1, v7}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 157
    .line 158
    .line 159
    iget v9, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 160
    .line 161
    invoke-static {v1, v7}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    sub-int v11, v10, v9

    .line 166
    .line 167
    if-gtz v11, :cond_6

    .line 168
    .line 169
    const-string v6, ""

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    if-ne v11, v6, :cond_7

    .line 173
    .line 174
    invoke-virtual {v1, v9}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->charAt(I)C

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    const/16 v11, 0x2f

    .line 179
    .line 180
    if-ne v6, v11, :cond_7

    .line 181
    .line 182
    iput v10, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 183
    .line 184
    const-string v6, "/"

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_7
    invoke-virtual {v1, v9, v10}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    iput v10, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 192
    .line 193
    :goto_4
    invoke-static {v1, v7}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-static {v1, v7}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 198
    .line 199
    .line 200
    iget v10, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 201
    .line 202
    iget v11, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 203
    .line 204
    if-ne v10, v11, :cond_c

    .line 205
    .line 206
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-eqz v10, :cond_b

    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-eqz v10, :cond_a

    .line 217
    .line 218
    iput-object v1, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$0:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v0, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$1:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v6, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$2:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object v9, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->L$3:Ljava/lang/Object;

    .line 225
    .line 226
    iput v4, v3, Lio/ktor/http/cio/HttpParserKt$parseRequest$1;->label:I

    .line 227
    .line 228
    invoke-static {v8, v1, v7, v3}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 232
    if-ne v3, v2, :cond_8

    .line 233
    .line 234
    :goto_5
    return-object v2

    .line 235
    :cond_8
    move-object v7, v0

    .line 236
    move-object v0, v3

    .line 237
    move-object v8, v6

    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :goto_6
    :try_start_3
    move-object v10, v0

    .line 241
    check-cast v10, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 242
    .line 243
    if-nez v10, :cond_9

    .line 244
    .line 245
    :goto_7
    return-object v5

    .line 246
    :cond_9
    new-instance v6, Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;

    .line 247
    .line 248
    invoke-direct/range {v6 .. v11}, Lio/ktor/http/cio/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 249
    .line 250
    .line 251
    return-object v6

    .line 252
    :catchall_2
    move-exception v0

    .line 253
    move-object v1, v11

    .line 254
    goto :goto_8

    .line 255
    :cond_a
    :try_start_4
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 256
    .line 257
    const-string v2, "HTTP version is not specified"

    .line 258
    .line 259
    invoke-direct {v0, v2}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_b
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 264
    .line 265
    const-string v2, "URI is not specified"

    .line 266
    .line 267
    invoke-direct {v0, v2}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_c
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 272
    .line 273
    new-instance v2, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    const-string v3, "Extra characters in request line: "

    .line 279
    .line 280
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    iget v3, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 284
    .line 285
    iget v4, v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 286
    .line 287
    invoke-virtual {v1, v3, v4}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-direct {v0, v2}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 306
    :cond_d
    move-object v0, v8

    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :goto_8
    invoke-virtual {v1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()V

    .line 310
    .line 311
    .line 312
    throw v0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;
    .locals 6

    .line 1
    invoke-static {p0, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iget v2, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 7
    .line 8
    iget v3, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    new-instance v4, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v4, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    invoke-static/range {v0 .. v5}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(Landroidx/core/view/飘花落叶言子楪世兰哲苏;Ljava/lang/CharSequence;IIL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪世苏(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 33
    .line 34
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 45
    .line 46
    invoke-static {v1, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 51
    .line 52
    invoke-virtual {v1, v2, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/16 v5, 0x2000

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v6, :cond_1

    .line 40
    .line 41
    iget-object v3, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    iget-object v7, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 48
    .line 49
    iget-object v8, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    iget-object v9, v1, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    move-object v10, v7

    .line 61
    move-object v7, v1

    .line 62
    move-object v1, v10

    .line 63
    move-object v10, v3

    .line 64
    move-object v3, v8

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 79
    .line 80
    move-object/from16 v3, p1

    .line 81
    .line 82
    invoke-direct {v0, v3}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;-><init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V

    .line 83
    .line 84
    .line 85
    move-object v8, v0

    .line 86
    move-object v7, v1

    .line 87
    move-object/from16 v0, p0

    .line 88
    .line 89
    move-object/from16 v1, p2

    .line 90
    .line 91
    :goto_1
    :try_start_1
    iput-object v0, v7, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v3, v7, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v1, v7, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$2:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v8, v7, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->L$3:Ljava/lang/Object;

    .line 98
    .line 99
    iput v6, v7, Lio/ktor/http/cio/HttpParserKt$parseHeaders$2;->label:I

    .line 100
    .line 101
    invoke-static {v0, v3, v5, v7}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 105
    if-ne v9, v2, :cond_3

    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_3
    move-object v10, v9

    .line 109
    move-object v9, v0

    .line 110
    move-object v0, v10

    .line 111
    move-object v10, v8

    .line 112
    :goto_2
    :try_start_2
    check-cast v0, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    invoke-virtual {v10}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object v3, v10

    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_4
    iget v0, v3, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:I

    .line 129
    .line 130
    iput v0, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 131
    .line 132
    iget v13, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 133
    .line 134
    sub-int/2addr v0, v13

    .line 135
    if-eqz v0, :cond_c

    .line 136
    .line 137
    if-ge v0, v5, :cond_b

    .line 138
    .line 139
    invoke-static {v3, v1}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    invoke-static {v3, v13, v14}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;II)I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    iget v0, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 148
    .line 149
    iget v8, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 150
    .line 151
    :goto_3
    const/16 v12, 0x9

    .line 152
    .line 153
    if-ge v8, v0, :cond_6

    .line 154
    .line 155
    invoke-virtual {v3, v8}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->charAt(I)C

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    invoke-static {v15}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲(C)Z

    .line 160
    .line 161
    .line 162
    move-result v16

    .line 163
    if-nez v16, :cond_5

    .line 164
    .line 165
    if-ne v15, v12, :cond_6

    .line 166
    .line 167
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    if-lt v8, v0, :cond_7

    .line 171
    .line 172
    iput v0, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 173
    .line 174
    move-object/from16 p3, v4

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_7
    move v15, v8

    .line 178
    move/from16 v16, v15

    .line 179
    .line 180
    :goto_4
    if-ge v15, v0, :cond_a

    .line 181
    .line 182
    move-object/from16 p3, v4

    .line 183
    .line 184
    invoke-virtual {v3, v15}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->charAt(I)C

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eq v4, v12, :cond_9

    .line 189
    .line 190
    const/16 v5, 0xa

    .line 191
    .line 192
    if-eq v4, v5, :cond_8

    .line 193
    .line 194
    const/16 v5, 0xd

    .line 195
    .line 196
    if-eq v4, v5, :cond_8

    .line 197
    .line 198
    const/16 v5, 0x20

    .line 199
    .line 200
    if-eq v4, v5, :cond_9

    .line 201
    .line 202
    move/from16 v16, v15

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    invoke-static {v3, v4}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;C)V

    .line 206
    .line 207
    .line 208
    throw p3

    .line 209
    :cond_9
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 210
    .line 211
    move-object/from16 v4, p3

    .line 212
    .line 213
    const/16 v5, 0x2000

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_a
    move-object/from16 p3, v4

    .line 217
    .line 218
    iput v8, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 219
    .line 220
    add-int/lit8 v4, v16, 0x1

    .line 221
    .line 222
    iput v4, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 223
    .line 224
    :goto_6
    iget v15, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 225
    .line 226
    iget v4, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 227
    .line 228
    invoke-static {v3, v15, v4}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;II)I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    iput v0, v1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 233
    .line 234
    move/from16 v16, v4

    .line 235
    .line 236
    invoke-virtual/range {v10 .. v16}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(IIIIII)V

    .line 237
    .line 238
    .line 239
    move-object/from16 v4, p3

    .line 240
    .line 241
    move-object v0, v9

    .line 242
    move-object v8, v10

    .line 243
    const/16 v5, 0x2000

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    const-string v1, "Header line length limit exceeded"

    .line 250
    .line 251
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_c
    sget-object v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 256
    .line 257
    const-string v0, "Host"

    .line 258
    .line 259
    invoke-virtual {v10, v0}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-eqz v0, :cond_d

    .line 264
    .line 265
    invoke-static {v0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 266
    .line 267
    .line 268
    :cond_d
    return-object v10

    .line 269
    :catchall_2
    move-exception v0

    .line 270
    move-object v3, v8

    .line 271
    :goto_7
    invoke-virtual {v3}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V

    .line 272
    .line 273
    .line 274
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I
    .locals 5

    .line 1
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget v1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    :goto_0
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x3a

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    iget v4, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    if-eq v0, v4, :cond_0

    .line 18
    .line 19
    add-int/lit8 p0, v0, 0x1

    .line 20
    .line 21
    iput p0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    const/16 v4, 0x20

    .line 25
    .line 26
    invoke-static {v2, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lez v4, :cond_2

    .line 31
    .line 32
    const-string v4, "\"(),/:;<=>?@[\\]{}"

    .line 33
    .line 34
    invoke-static {v4, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰楪苏(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget p1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 45
    .line 46
    if-eq v2, v3, :cond_4

    .line 47
    .line 48
    if-ne v0, p1, :cond_3

    .line 49
    .line 50
    new-instance p0, Lio/ktor/http/cio/ParserException;

    .line 51
    .line 52
    const-string p1, "Multiline headers via line folding is not supported since it is deprecated as per RFC7230."

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_3
    invoke-static {p0, v2}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;C)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    throw p0

    .line 63
    :cond_4
    new-instance p0, Lio/ktor/http/cio/ParserException;

    .line 64
    .line 65
    const-string p1, "Empty header names are not allowed as per RFC7230."

    .line 66
    .line 67
    invoke-direct {p0, p1}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_5
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 72
    .line 73
    iget v1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 74
    .line 75
    iget p1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 76
    .line 77
    invoke-virtual {p0, v1, p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v2, "No colon in HTTP header in "

    .line 84
    .line 85
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, " in builder: \n"

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-direct {v0, p0}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;C)V
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Character with code "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " is not allowed in header names, \n"

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 2
    .line 3
    .line 4
    iget v2, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iget v3, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    new-instance v4, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    const/16 v0, 0xb

    .line 13
    .line 14
    invoke-direct {v4, v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    sget-object v0, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    move-object v1, p0

    .line 22
    invoke-static/range {v0 .. v5}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(Landroidx/core/view/飘花落叶言子楪世兰哲苏;Ljava/lang/CharSequence;IIL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪世苏(Ljava/util/List;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    invoke-static {v1, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 49
    .line 50
    invoke-virtual {v1, v0, p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput p0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 55
    .line 56
    new-instance p0, Lio/ktor/http/cio/ParserException;

    .line 57
    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "Unsupported HTTP version: "

    .line 61
    .line 62
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, p1}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_1
    move-object v1, p0

    .line 77
    const-string p0, "Failed to parse version: "

    .line 78
    .line 79
    invoke-static {v1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I
    .locals 5

    .line 1
    invoke-static {p0, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 5
    .line 6
    iget v1, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x20

    .line 16
    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    const/16 p0, 0x64

    .line 20
    .line 21
    if-lt v2, p0, :cond_0

    .line 22
    .line 23
    const/16 p0, 0x3e7

    .line 24
    .line 25
    if-gt v2, p0, :cond_0

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance p0, Lio/ktor/http/cio/ParserException;

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "Status-code must be 3-digit. Status received: "

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v0, 0x2e

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_1
    const/16 v4, 0x30

    .line 55
    .line 56
    if-gt v4, v3, :cond_2

    .line 57
    .line 58
    const/16 v4, 0x3a

    .line 59
    .line 60
    if-ge v3, v4, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v2, v2, 0xa

    .line 63
    .line 64
    add-int/lit8 v3, v3, -0x30

    .line 65
    .line 66
    add-int/2addr v2, v3

    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 71
    .line 72
    invoke-static {p0, p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0, v0, p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "Illegal digit "

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, " in status code "

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    :goto_1
    iput v0, p1, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 113
    .line 114
    return v2
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;)V
    .locals 3

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p0, Lio/ktor/http/cio/ParserException;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Host cannot contain any of the following symbols: "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p0, v0}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    new-instance v0, Lio/ktor/http/cio/ParserException;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "Host header with \':\' should contains port: "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Lio/ktor/http/cio/ParserException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method
