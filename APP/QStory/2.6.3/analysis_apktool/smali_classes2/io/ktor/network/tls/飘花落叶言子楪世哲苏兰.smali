.class public abstract Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static final 飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lio/ktor/network/tls/RenderKt$writeRecord$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

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
    iput v1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/network/tls/RenderKt$writeRecord$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :pswitch_1
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :pswitch_2
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 58
    .line 59
    iget-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    move-object v6, p1

    .line 67
    move-object p1, p0

    .line 68
    move-object p0, v6

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :pswitch_3
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 74
    .line 75
    iget-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 78
    .line 79
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :pswitch_4
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 86
    .line 87
    iget-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 90
    .line 91
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_5
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    move-object p1, p0

    .line 98
    check-cast p1, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 99
    .line 100
    iget-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 103
    .line 104
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_6
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p2, p1, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/network/tls/TLSRecordType;

    .line 112
    .line 113
    invoke-virtual {p2}, Lio/ktor/network/tls/TLSRecordType;->getCode()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    int-to-byte p2, p2

    .line 118
    iput-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    iput v2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 124
    .line 125
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-ne p2, v1, :cond_2

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_2
    :goto_1
    iget-object p2, p1, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/network/tls/TLSVersion;

    .line 133
    .line 134
    invoke-virtual {p2}, Lio/ktor/network/tls/TLSVersion;->getCode()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    shr-int/lit8 p2, p2, 0x8

    .line 139
    .line 140
    int-to-byte p2, p2

    .line 141
    iput-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 144
    .line 145
    const/4 v2, 0x2

    .line 146
    iput v2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 147
    .line 148
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-ne p2, v1, :cond_3

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_3
    move-object v6, p1

    .line 156
    move-object p1, p0

    .line 157
    move-object p0, v6

    .line 158
    :goto_2
    iget-object p2, p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/network/tls/TLSVersion;

    .line 159
    .line 160
    invoke-virtual {p2}, Lio/ktor/network/tls/TLSVersion;->getCode()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    int-to-byte p2, p2

    .line 165
    iput-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 168
    .line 169
    const/4 v2, 0x3

    .line 170
    iput v2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 171
    .line 172
    invoke-static {p1, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-ne p2, v1, :cond_4

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_4
    :goto_3
    iget-object p2, p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 180
    .line 181
    invoke-static {p2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    long-to-int p2, v4

    .line 186
    int-to-short p2, p2

    .line 187
    iput-object p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 190
    .line 191
    const/4 v2, 0x4

    .line 192
    iput v2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 193
    .line 194
    invoke-static {p1, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;SLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    if-ne p2, v1, :cond_1

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :goto_4
    iget-object p1, p1, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 202
    .line 203
    iput-object p0, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v3, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$1:Ljava/lang/Object;

    .line 206
    .line 207
    const/4 p2, 0x5

    .line 208
    iput p2, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 209
    .line 210
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-ne p1, v1, :cond_5

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_5
    :goto_5
    iput-object v3, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->L$0:Ljava/lang/Object;

    .line 218
    .line 219
    const/4 p1, 0x6

    .line 220
    iput p1, v0, Lio/ktor/network/tls/RenderKt$writeRecord$1;->label:I

    .line 221
    .line 222
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-ne p0, v1, :cond_6

    .line 229
    .line 230
    :goto_6
    return-object v1

    .line 231
    :cond_6
    :goto_7
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 232
    .line 233
    return-object p0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Enum;
    .locals 6

    .line 1
    instance-of v0, p1, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->label:I

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
    iput v1, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->label:I

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
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lio/ktor/network/tls/飘花落叶言子楪哲苏世兰;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lio/ktor/network/tls/TLSVersion;->Companion:Lio/ktor/network/tls/飘花落叶言子楪哲苏世兰;

    .line 55
    .line 56
    iput-object p1, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput v4, v0, Lio/ktor/network/tls/ParserKt$readTLSVersion$1;->label:I

    .line 59
    .line 60
    invoke-static {p0, v0}, Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    move-object v5, p1

    .line 68
    move-object p1, p0

    .line 69
    move-object p0, v5

    .line 70
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const v0, 0xffff

    .line 77
    .line 78
    .line 79
    and-int/2addr p1, v0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/16 p0, 0x300

    .line 84
    .line 85
    if-gt p0, p1, :cond_4

    .line 86
    .line 87
    const/16 v0, 0x304

    .line 88
    .line 89
    if-ge p1, v0, :cond_4

    .line 90
    .line 91
    invoke-static {}, Lio/ktor/network/tls/TLSVersion;->access$getByOrdinal$cp()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sub-int/2addr p1, p0

    .line 96
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    move-object v3, p0

    .line 101
    check-cast v3, Lio/ktor/network/tls/TLSVersion;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const-string p0, "Invalid TLS version code "

    .line 105
    .line 106
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    return-object v3
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

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
    iput v1, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v5, :cond_4

    .line 39
    .line 40
    if-eq v2, v6, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lio/ktor/network/tls/TLSVersion;

    .line 49
    .line 50
    iget-object v0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lio/ktor/network/tls/TLSRecordType;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v7

    .line 65
    :cond_2
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$2:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lio/ktor/network/tls/TLSVersion;

    .line 68
    .line 69
    iget-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lio/ktor/network/tls/TLSRecordType;

    .line 72
    .line 73
    iget-object v4, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Lio/ktor/network/tls/TLSRecordType;

    .line 85
    .line 86
    iget-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Lio/ktor/network/tls/飘花落叶言子楪苏兰哲世;

    .line 97
    .line 98
    iget-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Lio/ktor/network/tls/TLSRecordType;->Companion:Lio/ktor/network/tls/飘花落叶言子楪苏兰哲世;

    .line 110
    .line 111
    iput-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p1, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput v5, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 116
    .line 117
    invoke-static {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-ne v2, v1, :cond_6

    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_6
    move-object v8, v2

    .line 126
    move-object v2, p0

    .line 127
    move-object p0, p1

    .line 128
    move-object p1, v8

    .line 129
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    and-int/lit16 p1, p1, 0xff

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    if-ltz p1, :cond_7

    .line 141
    .line 142
    const/16 p0, 0x100

    .line 143
    .line 144
    if-ge p1, p0, :cond_7

    .line 145
    .line 146
    invoke-static {}, Lio/ktor/network/tls/TLSRecordType;->access$getByCode$cp()[Lio/ktor/network/tls/TLSRecordType;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    aget-object p0, p0, p1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    move-object p0, v7

    .line 154
    :goto_2
    if-eqz p0, :cond_c

    .line 155
    .line 156
    iput-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 159
    .line 160
    iput v6, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 161
    .line 162
    invoke-static {v2, v0}, Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Enum;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v1, :cond_8

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    :goto_3
    check-cast p1, Lio/ktor/network/tls/TLSVersion;

    .line 170
    .line 171
    iput-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object p1, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$2:Ljava/lang/Object;

    .line 176
    .line 177
    iput v4, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 178
    .line 179
    invoke-static {v2, v0}, Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-ne v4, v1, :cond_9

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_9
    move-object v8, v2

    .line 187
    move-object v2, p0

    .line 188
    move-object p0, p1

    .line 189
    move-object p1, v4

    .line 190
    move-object v4, v8

    .line 191
    :goto_4
    check-cast p1, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    const v5, 0xffff

    .line 198
    .line 199
    .line 200
    and-int/2addr p1, v5

    .line 201
    const/16 v5, 0x4800

    .line 202
    .line 203
    if-gt p1, v5, :cond_b

    .line 204
    .line 205
    iput-object v2, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$0:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object p0, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object v7, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->L$2:Ljava/lang/Object;

    .line 210
    .line 211
    iput v3, v0, Lio/ktor/network/tls/ParserKt$readTLSRecord$1;->label:I

    .line 212
    .line 213
    invoke-static {v4, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-ne p1, v1, :cond_a

    .line 218
    .line 219
    :goto_5
    return-object v1

    .line 220
    :cond_a
    move-object v0, v2

    .line 221
    :goto_6
    check-cast p1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 222
    .line 223
    new-instance v1, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 224
    .line 225
    invoke-direct {v1, v0, p0, p1}, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;-><init>(Lio/ktor/network/tls/TLSRecordType;Lio/ktor/network/tls/TLSVersion;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 226
    .line 227
    .line 228
    return-object v1

    .line 229
    :cond_b
    new-instance p0, Lio/ktor/network/tls/TLSException;

    .line 230
    .line 231
    const-string v0, "Illegal TLS frame size: "

    .line 232
    .line 233
    invoke-static {p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {p0, p1, v7, v6, v7}, Lio/ktor/network/tls/TLSException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 238
    .line 239
    .line 240
    throw p0

    .line 241
    :cond_c
    const-string p0, "Invalid TLS record type code: "

    .line 242
    .line 243
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-object v7
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->label:I

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
    iput v1, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget p0, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->I$0:I

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    iget-object p0, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p0, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v5, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->label:I

    .line 66
    .line 67
    invoke-static {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    and-int/lit16 p1, p1, 0xff

    .line 81
    .line 82
    iput-object v3, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput p1, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->I$0:I

    .line 85
    .line 86
    iput v4, v0, Lio/ktor/network/tls/ParserKt$readShortCompatible$1;->label:I

    .line 87
    .line 88
    invoke-static {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v1, :cond_5

    .line 93
    .line 94
    :goto_2
    return-object v1

    .line 95
    :cond_5
    move v6, p1

    .line 96
    move-object p1, p0

    .line 97
    move p0, v6

    .line 98
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    and-int/lit16 p1, p1, 0xff

    .line 105
    .line 106
    shl-int/lit8 p0, p0, 0x8

    .line 107
    .line 108
    add-int/2addr p0, p1

    .line 109
    new-instance p1, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 112
    .line 113
    .line 114
    return-object p1
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p0, p4, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    move-object p0, p4

    .line 6
    check-cast p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;

    .line 7
    .line 8
    iget v0, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->label:I

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    and-int v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    iput v0, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;

    .line 21
    .line 22
    invoke-direct {p0, p4}, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v0, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->label:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    if-ne v0, p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lio/ktor/network/tls/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    iget-object p2, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 44
    .line 45
    iget-object p0, p0, Lio/ktor/network/tls/TLSClientSessionJvmKt$openTLSSession$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    new-instance p3, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-direct {p3, v1, v1, p0, p2}, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 58
    .line 59
    .line 60
    return-object p3

    .line 61
    :catch_0
    move-exception p0

    .line 62
    new-instance p1, Lio/ktor/network/tls/TLSException;

    .line 63
    .line 64
    const-string p2, "Negotiation failed due to EOS"

    .line 65
    .line 66
    invoke-direct {p1, p2, p0}, Lio/ktor/network/tls/TLSException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    throw v1
.end method
