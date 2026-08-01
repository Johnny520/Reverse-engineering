.class public abstract Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[B

.field public static final 飘花落叶言子楪世苏兰哲:[J

.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    sget-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏哲世兰:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    invoke-direct {v3, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰苏哲世;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v3}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    new-instance v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/16 v2, 0xff

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v0, v1, v2, v3}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ljava/util/ArrayList;

    .line 31
    .line 32
    const/16 v4, 0xa

    .line 33
    .line 34
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    move-object v5, v0

    .line 46
    check-cast v5, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    iget-boolean v6, v5, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 49
    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    invoke-virtual {v5}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->nextInt()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const/16 v6, 0x30

    .line 57
    .line 58
    if-gt v6, v5, :cond_0

    .line 59
    .line 60
    const/16 v6, 0x3a

    .line 61
    .line 62
    if-ge v5, v6, :cond_0

    .line 63
    .line 64
    int-to-long v5, v5

    .line 65
    const-wide/16 v7, 0x30

    .line 66
    .line 67
    :goto_1
    sub-long/2addr v5, v7

    .line 68
    goto :goto_2

    .line 69
    :cond_0
    int-to-long v5, v5

    .line 70
    const-wide/16 v7, 0x61

    .line 71
    .line 72
    cmp-long v7, v5, v7

    .line 73
    .line 74
    if-ltz v7, :cond_1

    .line 75
    .line 76
    const-wide/16 v7, 0x66

    .line 77
    .line 78
    cmp-long v7, v5, v7

    .line 79
    .line 80
    if-gtz v7, :cond_1

    .line 81
    .line 82
    const-wide/16 v7, 0x57

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const-wide/16 v7, 0x41

    .line 86
    .line 87
    cmp-long v7, v5, v7

    .line 88
    .line 89
    if-ltz v7, :cond_2

    .line 90
    .line 91
    const-wide/16 v7, 0x46

    .line 92
    .line 93
    cmp-long v7, v5, v7

    .line 94
    .line 95
    if-gtz v7, :cond_2

    .line 96
    .line 97
    const-wide/16 v7, 0x37

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    const-wide/16 v5, -0x1

    .line 101
    .line 102
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰哲楪世苏(Ljava/util/ArrayList;)[J

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sput-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:[J

    .line 115
    .line 116
    new-instance v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 117
    .line 118
    const/16 v2, 0xf

    .line 119
    .line 120
    invoke-direct {v0, v1, v2, v3}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_3
    move-object v2, v0

    .line 137
    check-cast v2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    iget-boolean v3, v2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    invoke-virtual {v2}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->nextInt()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-ge v2, v4, :cond_4

    .line 148
    .line 149
    add-int/lit8 v2, v2, 0x30

    .line 150
    .line 151
    :goto_4
    int-to-byte v2, v2

    .line 152
    goto :goto_5

    .line 153
    :cond_4
    add-int/lit8 v2, v2, 0x61

    .line 154
    .line 155
    int-to-char v2, v2

    .line 156
    sub-int/2addr v2, v4

    .line 157
    int-to-char v2, v2

    .line 158
    goto :goto_4

    .line 159
    :goto_5
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰苏世楪哲(Ljava/util/ArrayList;)[B

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    sput-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:[B

    .line 172
    .line 173
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->label:I

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
    iput v1, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    :goto_1
    iget p0, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$1:I

    .line 50
    .line 51
    iget p1, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$0:I

    .line 52
    .line 53
    iget-object v2, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, [B

    .line 56
    .line 57
    iget-object v3, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object v7, v2

    .line 65
    move v2, p0

    .line 66
    move-object p0, v3

    .line 67
    move-object v3, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    if-lez p1, :cond_8

    .line 73
    .line 74
    const/4 p2, 0x0

    .line 75
    :goto_2
    add-int/lit8 v2, p2, 0x1

    .line 76
    .line 77
    sget-object v3, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:[B

    .line 78
    .line 79
    if-ge p2, v4, :cond_5

    .line 80
    .line 81
    ushr-int/lit8 p2, p1, 0x1c

    .line 82
    .line 83
    shl-int/lit8 p1, p1, 0x4

    .line 84
    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    aget-byte p2, v3, p2

    .line 88
    .line 89
    iput-object p0, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v3, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    iput p1, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$0:I

    .line 94
    .line 95
    iput v2, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$1:I

    .line 96
    .line 97
    iput v6, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->label:I

    .line 98
    .line 99
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-ne p2, v1, :cond_5

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    move p2, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    :goto_3
    add-int/lit8 p2, v2, 0x1

    .line 109
    .line 110
    if-ge v2, v4, :cond_7

    .line 111
    .line 112
    ushr-int/lit8 v2, p1, 0x1c

    .line 113
    .line 114
    shl-int/lit8 p1, p1, 0x4

    .line 115
    .line 116
    aget-byte v2, v3, v2

    .line 117
    .line 118
    iput-object p0, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v3, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput p1, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$0:I

    .line 123
    .line 124
    iput p2, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->I$1:I

    .line 125
    .line 126
    iput v5, v0, Lio/ktor/http/cio/internals/CharsKt$writeIntHex$1;->label:I

    .line 127
    .line 128
    invoke-static {p0, v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-ne v2, v1, :cond_6

    .line 133
    .line 134
    :goto_4
    return-object v1

    .line 135
    :cond_6
    move v2, p2

    .line 136
    goto :goto_3

    .line 137
    :cond_7
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_8
    const-string p0, "Does only work for positive numbers"

    .line 141
    .line 142
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v3
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Ljava/lang/StringBuilder;)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const v5, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v4, v5

    .line 18
    const/16 v5, 0xff

    .line 19
    .line 20
    const-wide/16 v6, -0x1

    .line 21
    .line 22
    if-ge v4, v5, :cond_0

    .line 23
    .line 24
    sget-object v5, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:[J

    .line 25
    .line 26
    aget-wide v4, v5, v4

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move-wide v4, v6

    .line 30
    :goto_1
    cmp-long v6, v4, v6

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    const/4 v6, 0x4

    .line 35
    shl-long/2addr v1, v6

    .line 36
    or-long/2addr v1, v4

    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Invalid HEX number: "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const-string v2, ", wrong digit: "

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_2
    return-wide v1
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, ": too large for Long type"

    .line 8
    .line 9
    const-string v3, "Invalid number "

    .line 10
    .line 11
    const/16 v6, 0x13

    .line 12
    .line 13
    if-gt v1, v6, :cond_6

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x3

    .line 17
    const-wide/16 v9, 0x9

    .line 18
    .line 19
    const-wide/16 v11, 0x30

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x1

    .line 23
    if-ne v1, v6, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const-wide/16 v15, 0x0

    .line 30
    .line 31
    :goto_0
    if-ge v13, v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v13}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const-wide/16 v17, 0x0

    .line 38
    .line 39
    int-to-long v4, v6

    .line 40
    sub-long/2addr v4, v11

    .line 41
    cmp-long v6, v4, v17

    .line 42
    .line 43
    if-ltz v6, :cond_1

    .line 44
    .line 45
    cmp-long v6, v4, v9

    .line 46
    .line 47
    if-gtz v6, :cond_1

    .line 48
    .line 49
    shl-long v19, v15, v8

    .line 50
    .line 51
    shl-long/2addr v15, v14

    .line 52
    add-long v19, v19, v15

    .line 53
    .line 54
    add-long v15, v19, v4

    .line 55
    .line 56
    cmp-long v4, v15, v17

    .line 57
    .line 58
    if-ltz v4, :cond_0

    .line 59
    .line 60
    add-int/lit8 v13, v13, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v0, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-wide v17

    .line 67
    :cond_1
    invoke-static {v0, v13}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;I)V

    .line 68
    .line 69
    .line 70
    throw v7

    .line 71
    :cond_2
    return-wide v15

    .line 72
    :cond_3
    const-wide/16 v17, 0x0

    .line 73
    .line 74
    move-wide/from16 v2, v17

    .line 75
    .line 76
    :goto_1
    if-ge v13, v1, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0, v13}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    int-to-long v4, v4

    .line 83
    sub-long/2addr v4, v11

    .line 84
    cmp-long v6, v4, v17

    .line 85
    .line 86
    if-ltz v6, :cond_4

    .line 87
    .line 88
    cmp-long v6, v4, v9

    .line 89
    .line 90
    if-gtz v6, :cond_4

    .line 91
    .line 92
    shl-long v15, v2, v8

    .line 93
    .line 94
    shl-long/2addr v2, v14

    .line 95
    add-long/2addr v15, v2

    .line 96
    add-long v2, v15, v4

    .line 97
    .line 98
    add-int/lit8 v13, v13, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {v0, v13}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;I)V

    .line 102
    .line 103
    .line 104
    throw v7

    .line 105
    :cond_5
    return-wide v2

    .line 106
    :cond_6
    const-wide/16 v17, 0x0

    .line 107
    .line 108
    invoke-static {v0, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-wide v17
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Invalid number: "

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
    const-string v2, ", wrong digit: "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, " at position "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;II)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge p1, p2, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x41

    .line 12
    .line 13
    if-gt v2, v1, :cond_0

    .line 14
    .line 15
    const/16 v2, 0x5b

    .line 16
    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x20

    .line 20
    .line 21
    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move v1, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_4

    .line 18
    .line 19
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x5b

    .line 24
    .line 25
    const/16 v5, 0x41

    .line 26
    .line 27
    if-gt v5, v3, :cond_1

    .line 28
    .line 29
    if-ge v3, v4, :cond_1

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x20

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-gt v5, v6, :cond_2

    .line 38
    .line 39
    if-ge v6, v4, :cond_2

    .line 40
    .line 41
    add-int/lit8 v6, v6, 0x20

    .line 42
    .line 43
    :cond_2
    if-eq v3, v6, :cond_3

    .line 44
    .line 45
    :goto_1
    return v2

    .line 46
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    const/4 p0, 0x1

    .line 50
    return p0
.end method
