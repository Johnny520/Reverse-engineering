.class public final synthetic Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:I

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:I

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    .line 14
    iput p4, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    iput p2, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:I

    iput p3, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪兰世苏哲:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget v3, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰苏世:I

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;

    .line 17
    .line 18
    iget-object v0, p1, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    invoke-virtual {p1, v3}, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p1, v2}, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v4, v0, Landroidx/compose/ui/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/CharSequence;

    .line 29
    .line 30
    if-ltz v3, :cond_0

    .line 31
    .line 32
    if-gt v3, v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-gt v2, v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v5, ") or end("

    .line 42
    .line 43
    const-string v6, ") is out of range [0.."

    .line 44
    .line 45
    const-string v7, "start("

    .line 46
    .line 47
    invoke-static {v3, v2, v7, v5, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v4, "], or start > end!"

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, L飘花落叶言子苏世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    new-instance v4, Landroid/graphics/Path;

    .line 71
    .line 72
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;

    .line 76
    .line 77
    iget-object v5, v0, L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Landroid/text/Layout;

    .line 78
    .line 79
    invoke-virtual {v5, v3, v2, v4}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 80
    .line 81
    .line 82
    iget v0, v0, L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:I

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-virtual {v4}, Landroid/graphics/Path;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_1

    .line 92
    .line 93
    int-to-float v0, v0

    .line 94
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->offset(FF)V

    .line 95
    .line 96
    .line 97
    :cond_1
    iget p1, p1, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:F

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-long v2, v0

    .line 104
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v5, p1

    .line 109
    const/16 p1, 0x20

    .line 110
    .line 111
    shl-long/2addr v2, p1

    .line 112
    const-wide v7, 0xffffffffL

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long/2addr v5, v7

    .line 118
    or-long/2addr v2, v5

    .line 119
    new-instance v0, Landroid/graphics/Matrix;

    .line 120
    .line 121
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 122
    .line 123
    .line 124
    shr-long v5, v2, p1

    .line 125
    .line 126
    long-to-int p1, v5

    .line 127
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    and-long/2addr v2, v7

    .line 132
    long-to-int v2, v2

    .line 133
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {v0, p1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-virtual {p0, v4, v0, p1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    .line 155
    .line 156
    .line 157
    return-object v1

    .line 158
    :pswitch_0
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 159
    .line 160
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    .line 161
    .line 162
    iget v0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 163
    .line 164
    sub-int/2addr v3, v0

    .line 165
    int-to-float v0, v3

    .line 166
    const/high16 v3, 0x40000000    # 2.0f

    .line 167
    .line 168
    div-float/2addr v0, v3

    .line 169
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世哲楪兰(F)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v4, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 174
    .line 175
    sub-int/2addr v2, v4

    .line 176
    int-to-float v2, v2

    .line 177
    div-float/2addr v2, v3

    .line 178
    invoke-static {v2}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世哲楪兰(F)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-static {p1, p0, v0, v2}, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;II)V

    .line 183
    .line 184
    .line 185
    return-object v1

    .line 186
    :pswitch_1
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 187
    .line 188
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    .line 189
    .line 190
    invoke-static {p1, p0, v3, v2}, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;II)V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :pswitch_2
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 195
    .line 196
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    .line 197
    .line 198
    invoke-static {p1, p0, v3, v2}, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;II)V

    .line 199
    .line 200
    .line 201
    return-object v1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
