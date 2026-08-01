.class public abstract Lokio/internal/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lokio/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lokio/SegmentedByteString;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length p0, p0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    add-int/lit8 p0, p0, -0x1

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-gt v1, p0, :cond_1

    .line 19
    .line 20
    add-int v2, v1, p0

    .line 21
    .line 22
    ushr-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    aget v3, v0, v2

    .line 25
    .line 26
    if-ge v3, p1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-le v3, p1, :cond_2

    .line 32
    .line 33
    add-int/lit8 p0, v2, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    neg-int p0, v1

    .line 37
    add-int/lit8 v2, p0, -0x1

    .line 38
    .line 39
    :cond_2
    if-ltz v2, :cond_3

    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    not-int p0, v2

    .line 43
    return p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/collections/飘花落叶言子楪苏兰哲世;ZZLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 7
    .line 8
    iget v1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

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
    iput v1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lokio/internal/-FileSystem$collectRecursively$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_c

    .line 34
    .line 35
    if-eq v2, v4, :cond_9

    .line 36
    .line 37
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    const/4 p2, 0x2

    .line 41
    if-eq v2, p2, :cond_2

    .line 42
    .line 43
    if-ne v2, p1, :cond_1

    .line 44
    .line 45
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    iget-boolean p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 56
    .line 57
    iget-boolean v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 58
    .line 59
    iget-object v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 64
    .line 65
    if-nez v5, :cond_8

    .line 66
    .line 67
    iget-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 70
    .line 71
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    if-nez v6, :cond_7

    .line 74
    .line 75
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v6, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 78
    .line 79
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    if-eqz p4, :cond_5

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    if-nez p4, :cond_4

    .line 93
    .line 94
    iput-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 103
    .line 104
    iput-boolean v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 105
    .line 106
    iput-boolean p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 107
    .line 108
    iput p2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 109
    .line 110
    invoke-static {v6, v5, v2, p3, v0}, Lokio/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/collections/飘花落叶言子楪苏兰哲世;ZZLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    if-ne p4, v1, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    new-instance p0, Ljava/lang/ClassCastException;

    .line 120
    .line 121
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :cond_5
    invoke-virtual {v5}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->removeLast()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    if-eqz p3, :cond_6

    .line 129
    .line 130
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 139
    .line 140
    iput p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 141
    .line 142
    invoke-virtual {v6, v3, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v1, :cond_6

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    return-object p0

    .line 150
    :goto_1
    invoke-virtual {v5}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->removeLast()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :cond_7
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 155
    .line 156
    .line 157
    return-object v3

    .line 158
    :cond_8
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 159
    .line 160
    .line 161
    return-object v3

    .line 162
    :cond_9
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 163
    .line 164
    if-nez p0, :cond_b

    .line 165
    .line 166
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 169
    .line 170
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 171
    .line 172
    if-eqz p0, :cond_a

    .line 173
    .line 174
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 175
    .line 176
    .line 177
    return-object v3

    .line 178
    :cond_a
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p0, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 181
    .line 182
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_b
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 187
    .line 188
    .line 189
    return-object v3

    .line 190
    :cond_c
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    if-nez p3, :cond_d

    .line 194
    .line 195
    iput-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 202
    .line 203
    iput-boolean p2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 204
    .line 205
    iput-boolean p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 206
    .line 207
    iput v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 208
    .line 209
    invoke-virtual {p0, v3, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    if-ne p0, v1, :cond_d

    .line 214
    .line 215
    :goto_2
    return-object v1

    .line 216
    :cond_d
    :goto_3
    throw v3
.end method

.method public static final 飘花落叶言子楪世苏哲兰(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const-string v0, "Unexpected hex digit: "

    .line 34
    .line 35
    invoke-static {p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0
.end method
