.class public final Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Closeable;
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;
.implements Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;


# instance fields
.field private volatile closed:Z

.field private volatile inSelect:Z

.field private volatile selectorRef:Ljava/nio/channels/Selector;

.field public final 飘花落叶言子楪兰世哲苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicLong;

.field public final 飘花落叶言子楪兰苏世哲:Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/SelectorProvider;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/nio/channels/spi/SelectorProvider;->provider()Ljava/nio/channels/spi/SelectorProvider;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/SelectorProvider;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v2, v1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(BI)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    new-instance v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 31
    .line 32
    invoke-direct {v0}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 36
    .line 37
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 38
    .line 39
    const-string v1, "selector"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 49
    .line 50
    new-instance p1, Lio/ktor/network/selector/ActorSelectorManager$1;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p1, p0, v0}, Lio/ktor/network/selector/ActorSelectorManager$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-static {p0, v0, v0, p1, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;Ljava/nio/channels/spi/AbstractSelector;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Lio/ktor/network/selector/ActorSelectorManager$process$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Lio/ktor/network/selector/ActorSelectorManager$process$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljava/nio/channels/Selector;

    .line 48
    .line 49
    iget-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 52
    .line 53
    iget-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v6, p2

    .line 61
    move-object p2, p0

    .line 62
    move-object p0, v6

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_2
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/nio/channels/Selector;

    .line 75
    .line 76
    iget-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 79
    .line 80
    iget-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v6, p2

    .line 88
    move-object p2, p0

    .line 89
    move-object p0, v6

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Ljava/nio/channels/Selector;

    .line 94
    .line 95
    iget-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 98
    .line 99
    iget-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 102
    .line 103
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v6, p2

    .line 107
    move-object p2, p0

    .line 108
    move-object p0, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_1
    iget-boolean p3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 114
    .line 115
    if-nez p3, :cond_10

    .line 116
    .line 117
    :goto_2
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    check-cast p3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 122
    .line 123
    if-nez p3, :cond_f

    .line 124
    .line 125
    iget p3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 126
    .line 127
    if-lez p3, :cond_9

    .line 128
    .line 129
    iput-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 134
    .line 135
    iput v5, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 136
    .line 137
    invoke-virtual {p0, p2, v0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/nio/channels/Selector;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    if-ne p3, v1, :cond_6

    .line 142
    .line 143
    goto/16 :goto_4

    .line 144
    .line 145
    :cond_6
    :goto_3
    check-cast p3, Ljava/lang/Number;

    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    if-lez p3, :cond_7

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/nio/channels/Selector;->keys()Ljava/util/Set;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p3, v2}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/util/Set;Ljava/util/Set;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    check-cast p3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 176
    .line 177
    if-eqz p3, :cond_8

    .line 178
    .line 179
    invoke-virtual {p0, p2, p3}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/nio/channels/Selector;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_8
    iput-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 188
    .line 189
    iput v4, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 190
    .line 191
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    if-ne p3, v1, :cond_5

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_9
    iget p3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 199
    .line 200
    if-lez p3, :cond_b

    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/nio/channels/Selector;->selectNow()I

    .line 203
    .line 204
    .line 205
    iget p3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 206
    .line 207
    if-lez p3, :cond_a

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/nio/channels/Selector;->keys()Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p3, v2}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/util/Set;Ljava/util/Set;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_a
    const/4 p3, 0x0

    .line 228
    iput p3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_b
    iput-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$0:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$1:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->L$2:Ljava/lang/Object;

    .line 236
    .line 237
    iput v3, v0, Lio/ktor/network/selector/ActorSelectorManager$process$1;->label:I

    .line 238
    .line 239
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    check-cast p3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 244
    .line 245
    if-nez p3, :cond_c

    .line 246
    .line 247
    invoke-virtual {p0, p1, v0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p3

    .line 251
    :cond_c
    if-ne p3, v1, :cond_d

    .line 252
    .line 253
    :goto_4
    return-object v1

    .line 254
    :cond_d
    :goto_5
    check-cast p3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 255
    .line 256
    if-nez p3, :cond_e

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_e
    invoke-virtual {p0, p2, p3}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/nio/channels/Selector;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_f
    invoke-virtual {p0, p2, p3}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/nio/channels/Selector;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_2

    .line 268
    .line 269
    :cond_10
    :goto_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 270
    .line 271
    return-object p0
.end method

.method public static 飘花落叶言子楪兰苏哲世(Ljava/nio/channels/spi/AbstractSelector;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lio/ktor/network/selector/SelectorManagerSupport$ClosedSelectorCancellationException;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/ktor/network/selector/SelectorManagerSupport$ClosedSelectorCancellationException;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/nio/channels/Selector;->keys()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/nio/channels/SelectionKey;

    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    :catch_0
    :cond_1
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    instance-of v2, v1, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/4 v1, 0x0

    .line 58
    :goto_1
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-static {v1, p1}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    return-void
.end method

.method public static 飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世()Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->access$getAllInterests$cp()[Lio/ktor/network/selector/SelectInterest;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v1, v0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_1

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v4, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    aget-object v3, v4, v3

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v3, p0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    new-instance v4, Lkotlin/Result$Failure;

    .line 47
    .line 48
    invoke-direct {v4, p1}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v3, v4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪苏世兰哲(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic 飘花落叶言子楪苏兰世哲(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Ljava/nio/channels/spi/AbstractSelector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->selectorRef:Ljava/nio/channels/Selector;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {v0, p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final 飘花落叶言子世兰楪哲苏()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->inSelect:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->selectorRef:Ljava/nio/channels/Selector;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子世兰楪苏哲(Ljava/nio/channels/Selector;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lio/ktor/network/selector/ActorSelectorManager$select$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->label:I

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
    iput v1, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/network/selector/ActorSelectorManager$select$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    move-object p1, p0

    .line 39
    check-cast p1, Ljava/nio/channels/Selector;

    .line 40
    .line 41
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-boolean v3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->inSelect:Z

    .line 60
    .line 61
    iput-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lio/ktor/network/selector/ActorSelectorManager$select$1;->label:I

    .line 66
    .line 67
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    iget-object p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    const-wide/16 v2, 0x0

    .line 81
    .line 82
    cmp-long p2, v0, v2

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    const-wide/16 v1, 0x1f4

    .line 88
    .line 89
    invoke-virtual {p1, v1, v2}, Ljava/nio/channels/Selector;->select(J)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput-boolean v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->inSelect:Z

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iput-boolean v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->inSelect:Z

    .line 97
    .line 98
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 99
    .line 100
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/nio/channels/Selector;->selectNow()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    :goto_2
    new-instance p0, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-direct {p0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 110
    .line 111
    .line 112
    return-object p0
.end method

.method public final 飘花落叶言子世哲苏兰楪(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lio/ktor/network/selector/SelectInterest;->getFlag()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->isClosed()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_8

    .line 15
    .line 16
    and-int v2, v0, v1

    .line 17
    .line 18
    if-eqz v2, :cond_7

    .line 19
    .line 20
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 21
    .line 22
    invoke-static {p3}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1, p3}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲()V

    .line 31
    .line 32
    .line 33
    sget-object p3, Lio/ktor/network/selector/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lio/ktor/network/selector/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    invoke-virtual {v0, p3}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世()Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v1, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    sget-object v1, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    aget-object v1, v1, v2

    .line 54
    .line 55
    :goto_0
    invoke-virtual {v1, p3, v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    instance-of p2, p2, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 66
    .line 67
    sget-object p3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 68
    .line 69
    if-nez p2, :cond_3

    .line 70
    .line 71
    :try_start_0
    iget-object p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_1

    .line 78
    .line 79
    iget-object p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 80
    .line 81
    iget-object p2, p2, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 84
    .line 85
    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 90
    .line 91
    if-nez p2, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_0
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {p2, v1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    goto :goto_2

    .line 107
    :cond_1
    invoke-interface {p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲兰苏()Ljava/nio/channels/SelectableChannel;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_2

    .line 116
    .line 117
    new-instance p0, Ljava/nio/channels/ClosedSelectorException;

    .line 118
    .line 119
    invoke-direct {p0}, Ljava/nio/channels/ClosedSelectorException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :cond_2
    new-instance p0, Ljava/nio/channels/ClosedChannelException;

    .line 124
    .line 125
    invoke-direct {p0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    .line 126
    .line 127
    .line 128
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    :goto_2
    invoke-static {p1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_3
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 137
    .line 138
    if-ne p0, p1, :cond_4

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_4
    return-object p3

    .line 142
    :cond_5
    invoke-virtual {v1, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-nez v2, :cond_6

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance p2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string p3, "Handler for "

    .line 158
    .line 159
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p1, " is already registered"

    .line 166
    .line 167
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p0

    .line 182
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    new-instance p1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string p2, "Selectable is invalid state: "

    .line 187
    .line 188
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p2, ", "

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0

    .line 214
    :cond_8
    const-string p0, "Selectable is already closed"

    .line 215
    .line 216
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v3
.end method

.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世楪哲苏兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->selectorRef:Ljava/nio/channels/Selector;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲兰苏()Ljava/nio/channels/SelectableChannel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, v0}, Ljava/nio/channels/SelectableChannel;->keyFor(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子世楪苏哲兰(Ljava/util/Set;Ljava/util/Set;)V
    .locals 10

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    sub-int/2addr p2, v0

    .line 10
    iput p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_8

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/nio/channels/SelectionKey;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->readyOps()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->interestOps()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    instance-of v5, v4, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    check-cast v4, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v4, v1

    .line 59
    :goto_1
    if-nez v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 62
    .line 63
    .line 64
    iget v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    iput v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :catchall_0
    move-exception v2

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    invoke-interface {v4}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世()Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sget-object v5, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->access$getFlags$cp()[I

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    array-length v6, v5

    .line 87
    move v7, p2

    .line 88
    :goto_2
    if-ge v7, v6, :cond_4

    .line 89
    .line 90
    aget v8, v5, v7

    .line 91
    .line 92
    and-int/2addr v8, v2

    .line 93
    if-eqz v8, :cond_3

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v8, Lio/ktor/network/selector/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 99
    .line 100
    aget-object v8, v8, v7

    .line 101
    .line 102
    invoke-virtual {v8, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;

    .line 107
    .line 108
    if-eqz v8, :cond_3

    .line 109
    .line 110
    sget-object v9, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 111
    .line 112
    invoke-static {v9}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-interface {v8, v9}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    not-int v2, v2

    .line 123
    and-int/2addr v2, v3

    .line 124
    if-eq v2, v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v2, :cond_7

    .line 130
    .line 131
    iget v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    iput v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :goto_3
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 139
    .line 140
    .line 141
    iget v3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 142
    .line 143
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    iput v3, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    instance-of v4, v3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    check-cast v3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    move-object v3, v1

    .line 159
    :goto_4
    if-eqz v3, :cond_7

    .line 160
    .line 161
    invoke-static {v3, v2}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/nio/channels/SelectionKey;->attach(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_8
    :goto_6
    return-void
.end method

.method public final 飘花落叶言子世苏楪兰哲(Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->label:I

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
    iput v1, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 40
    .line 41
    iget-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v6, p1

    .line 49
    move-object p1, p0

    .line 50
    move-object p0, v6

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v4

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 66
    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    return-object p2

    .line 70
    :cond_4
    iget-boolean p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_5
    iput-object p0, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, v0, Lio/ktor/network/selector/ActorSelectorManager$receiveOrNullSuspend$1;->label:I

    .line 80
    .line 81
    iget-object p2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 82
    .line 83
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    iget-boolean v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 90
    .line 91
    if-nez v2, :cond_8

    .line 92
    .line 93
    iget-object v2, p2, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 96
    .line 97
    :goto_2
    invoke-virtual {v2, v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_a

    .line 102
    .line 103
    invoke-virtual {p1}, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    iget-boolean v2, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->closed:Z

    .line 110
    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    iget-object p2, p2, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v5, p2

    .line 117
    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 118
    .line 119
    :cond_7
    invoke-virtual {v5, v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_9

    .line 124
    .line 125
    :cond_8
    move-object p2, v4

    .line 126
    goto :goto_4

    .line 127
    :cond_9
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eq p2, v0, :cond_7

    .line 132
    .line 133
    :goto_3
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    if-nez v5, :cond_b

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_b
    const-string p0, "Continuation is already set"

    .line 144
    .line 145
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v4

    .line 149
    :goto_4
    if-nez p2, :cond_c

    .line 150
    .line 151
    sget-object p2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 152
    .line 153
    :cond_c
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 154
    .line 155
    if-ne p2, v1, :cond_3

    .line 156
    .line 157
    return-object v1
.end method

.method public final 飘花落叶言子楪哲世苏兰(Ljava/nio/channels/Selector;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲兰苏()Ljava/nio/channels/SelectableChannel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Ljava/nio/channels/SelectableChannel;->keyFor(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p2}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏哲兰楪()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, p1, v2, p2}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->interestOps()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eq v0, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iput v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    :cond_2
    return-void

    .line 44
    :goto_1
    invoke-interface {p2}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲兰苏()Ljava/nio/channels/SelectableChannel;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Ljava/nio/channels/SelectableChannel;->keyFor(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-static {p2, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
