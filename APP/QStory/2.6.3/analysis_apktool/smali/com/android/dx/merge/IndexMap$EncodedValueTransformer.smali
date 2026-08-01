.class final Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/IndexMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "EncodedValueTransformer"
.end annotation


# instance fields
.field private final out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

.field final synthetic this$0:Lcom/android/dx/merge/IndexMap;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transformArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transformAnnotation(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private transformAnnotation(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 8
    .line 9
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰苏楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰苏楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 29
    .line 30
    iget-object v4, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 31
    .line 32
    invoke-static {v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v3, v4}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰苏楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transform(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method private transformArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 2

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-virtual {p1, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    iget-object v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰苏楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transform(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method private writeTypeAndArg(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x5

    .line 4
    .line 5
    or-int/2addr p1, p2

    .line 6
    invoke-interface {p0, p1}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;->writeByte(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public transform(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    const/4 v4, 0x6

    .line 12
    if-eq v0, v4, :cond_6

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-eq v0, v4, :cond_5

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    if-eq v0, v4, :cond_4

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-eq v0, v4, :cond_3

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const/16 v5, 0x10

    .line 25
    .line 26
    if-eq v0, v5, :cond_2

    .line 27
    .line 28
    const/16 v5, 0x11

    .line 29
    .line 30
    if-eq v0, v5, :cond_1

    .line 31
    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p1, "Unexpected type: "

    .line 44
    .line 45
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    const/16 v0, 0x1f

    .line 50
    .line 51
    invoke-virtual {p1, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 52
    .line 53
    .line 54
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    move v3, v4

    .line 61
    :cond_0
    invoke-direct {p0, v0, v3}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->writeTypeAndArg(II)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    const/16 v0, 0x1e

    .line 66
    .line 67
    invoke-virtual {p1, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 68
    .line 69
    .line 70
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 71
    .line 72
    invoke-direct {p0, v0, v3}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->writeTypeAndArg(II)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_2
    const/16 v0, 0x1d

    .line 77
    .line 78
    invoke-direct {p0, v0, v3}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->writeTypeAndArg(II)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transformAnnotation(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_3
    const/16 v0, 0x1c

    .line 86
    .line 87
    invoke-direct {p0, v0, v3}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->writeTypeAndArg(II)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, p1}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transformArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_4
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 95
    .line 96
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 97
    .line 98
    const/16 v4, 0x1b

    .line 99
    .line 100
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 101
    .line 102
    .line 103
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 104
    .line 105
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 106
    .line 107
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustField(I)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    int-to-long p0, p0

    .line 116
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_5
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 121
    .line 122
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 123
    .line 124
    const/16 v4, 0x1a

    .line 125
    .line 126
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 127
    .line 128
    .line 129
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 130
    .line 131
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 132
    .line 133
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    int-to-long p0, p0

    .line 142
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_6
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 147
    .line 148
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 149
    .line 150
    const/16 v4, 0x19

    .line 151
    .line 152
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 153
    .line 154
    .line 155
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 156
    .line 157
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 158
    .line 159
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustField(I)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    int-to-long p0, p0

    .line 168
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_7
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 173
    .line 174
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 175
    .line 176
    const/16 v4, 0x18

    .line 177
    .line 178
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 179
    .line 180
    .line 181
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 182
    .line 183
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 184
    .line 185
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    int-to-long p0, p0

    .line 194
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_8
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 199
    .line 200
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 201
    .line 202
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    int-to-long p0, p0

    .line 211
    const/16 v1, 0x17

    .line 212
    .line 213
    invoke-static {v0, v1, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_9
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 218
    .line 219
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 220
    .line 221
    const/16 v4, 0x16

    .line 222
    .line 223
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 224
    .line 225
    .line 226
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 227
    .line 228
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 229
    .line 230
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustMethodHandle(I)I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    int-to-long p0, p0

    .line 239
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_a
    iget-object v0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 244
    .line 245
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->this$0:Lcom/android/dx/merge/IndexMap;

    .line 246
    .line 247
    const/16 v4, 0x15

    .line 248
    .line 249
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 250
    .line 251
    .line 252
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 253
    .line 254
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 255
    .line 256
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustProto(I)I

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    int-to-long p0, p0

    .line 265
    invoke-static {v0, v4, p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 270
    .line 271
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏()D

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 276
    .line 277
    .line 278
    move-result-wide v0

    .line 279
    invoke-static {p0, v5, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰世哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_2
    invoke-virtual {p1, v5}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 284
    .line 285
    .line 286
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 287
    .line 288
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 289
    .line 290
    invoke-static {v1, p1, v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    int-to-long v0, p1

    .line 303
    const/16 p1, 0x20

    .line 304
    .line 305
    shl-long/2addr v0, p1

    .line 306
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 307
    .line 308
    invoke-static {p0, v5, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰世哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_3
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 313
    .line 314
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 315
    .line 316
    .line 317
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 318
    .line 319
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 320
    .line 321
    invoke-static {v1, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;I)I

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    int-to-long v0, p1

    .line 326
    invoke-static {p0, v4, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_4
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 331
    .line 332
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 333
    .line 334
    .line 335
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 336
    .line 337
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 338
    .line 339
    invoke-static {v1, p1, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰楪苏哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;IZ)I

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    int-to-char p1, p1

    .line 344
    int-to-long v0, p1

    .line 345
    invoke-static {p0, v4, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 350
    .line 351
    invoke-virtual {p1, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 352
    .line 353
    .line 354
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 355
    .line 356
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 357
    .line 358
    invoke-static {v1, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;I)I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    int-to-short p1, p1

    .line 363
    int-to-long v0, p1

    .line 364
    invoke-static {p0, v4, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_6
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 369
    .line 370
    invoke-virtual {p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()J

    .line 371
    .line 372
    .line 373
    move-result-wide v0

    .line 374
    invoke-static {p0, v4, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :cond_7
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->out:L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 379
    .line 380
    invoke-virtual {p1, v3}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 381
    .line 382
    .line 383
    iput v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 384
    .line 385
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:I

    .line 386
    .line 387
    invoke-static {v1, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;I)I

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    int-to-byte p1, p1

    .line 392
    int-to-long v0, p1

    .line 393
    invoke-static {p0, v3, v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
