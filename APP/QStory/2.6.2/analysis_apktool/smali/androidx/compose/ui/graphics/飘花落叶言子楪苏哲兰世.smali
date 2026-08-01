.class public final Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:[F

.field public 飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;)V
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v2, Landroidx/compose/ui/graphics/Path$Direction;->CounterClockwise:Landroidx/compose/ui/graphics/Path$Direction;

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-nez v3, :cond_0

    .line 8
    .line 9
    new-instance v3, Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 15
    .line 16
    :cond_0
    iget-object v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget v4, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 22
    .line 23
    iget-wide v5, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:J

    .line 24
    .line 25
    iget-wide v7, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:J

    .line 26
    .line 27
    iget-wide v9, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:J

    .line 28
    .line 29
    iget-wide v11, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:J

    .line 30
    .line 31
    iget v13, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:F

    .line 32
    .line 33
    iget v14, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 34
    .line 35
    iget v1, v1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:F

    .line 36
    .line 37
    invoke-virtual {v3, v4, v13, v14, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:[F

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    new-array v1, v1, [F

    .line 47
    .line 48
    iput-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:[F

    .line 49
    .line 50
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:[F

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/16 v3, 0x20

    .line 56
    .line 57
    shr-long v13, v11, v3

    .line 58
    .line 59
    long-to-int v4, v13

    .line 60
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/4 v13, 0x0

    .line 65
    aput v4, v1, v13

    .line 66
    .line 67
    const-wide v13, 0xffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v11, v13

    .line 73
    long-to-int v4, v11

    .line 74
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    const/4 v11, 0x1

    .line 79
    aput v4, v1, v11

    .line 80
    .line 81
    move/from16 p1, v3

    .line 82
    .line 83
    shr-long v3, v9, p1

    .line 84
    .line 85
    long-to-int v3, v3

    .line 86
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x2

    .line 91
    aput v3, v1, v4

    .line 92
    .line 93
    and-long/2addr v9, v13

    .line 94
    long-to-int v3, v9

    .line 95
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v9, 0x3

    .line 100
    aput v3, v1, v9

    .line 101
    .line 102
    shr-long v9, v7, p1

    .line 103
    .line 104
    long-to-int v3, v9

    .line 105
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    const/4 v9, 0x4

    .line 110
    aput v3, v1, v9

    .line 111
    .line 112
    and-long/2addr v7, v13

    .line 113
    long-to-int v3, v7

    .line 114
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const/4 v7, 0x5

    .line 119
    aput v3, v1, v7

    .line 120
    .line 121
    shr-long v7, v5, p1

    .line 122
    .line 123
    long-to-int v3, v7

    .line 124
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    const/4 v7, 0x6

    .line 129
    aput v3, v1, v7

    .line 130
    .line 131
    and-long/2addr v5, v13

    .line 132
    long-to-int v3, v5

    .line 133
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    const/4 v5, 0x7

    .line 138
    aput v3, v1, v5

    .line 139
    .line 140
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 141
    .line 142
    iget-object v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:[F

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v5, Landroidx/compose/ui/graphics/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    aget v2, v5, v2

    .line 159
    .line 160
    if-eq v2, v11, :cond_3

    .line 161
    .line 162
    if-ne v2, v4, :cond_2

    .line 163
    .line 164
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_2
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_3
    sget-object v2, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 172
    .line 173
    :goto_0
    invoke-virtual {v1, v3, v0, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)V
    .locals 5

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/Path$Direction;->CounterClockwise:Landroidx/compose/ui/graphics/Path$Direction;

    .line 2
    .line 3
    iget v1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 4
    .line 5
    iget v2, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 6
    .line 7
    iget v3, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 8
    .line 9
    iget p1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    :cond_0
    const-string v4, "Invalid rectangle, make sure no value is NaN"

    .line 36
    .line 37
    invoke-static {v4}, Landroidx/compose/ui/graphics/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v4, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    new-instance v4, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v4, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 50
    .line 51
    :cond_2
    iget-object v4, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v1, p1, v3, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 60
    .line 61
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    aget v0, v1, v0

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    if-eq v0, v1, :cond_4

    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    sget-object v0, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 88
    .line 89
    :goto_0
    invoke-virtual {p1, p0, v0}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, p1, v1, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;I)Z
    .locals 3

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p3, v0, :cond_1

    .line 8
    .line 9
    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x4

    .line 13
    if-ne p3, v0, :cond_2

    .line 14
    .line 15
    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/4 v0, 0x2

    .line 19
    if-ne p3, v0, :cond_3

    .line 20
    .line 21
    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    .line 25
    .line 26
    :goto_0
    instance-of v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const-string v2, "Unable to obtain android.graphics.Path"

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 34
    .line 35
    instance-of v0, p2, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object p2, p2, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_4
    invoke-static {v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :cond_5
    invoke-static {v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v1
.end method

.method public final 飘花落叶言子楪世兰苏哲(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 21
    .line 22
    .line 23
    new-instance p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 32
    .line 33
    invoke-direct {p0, v1, v2, v3, v0}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
