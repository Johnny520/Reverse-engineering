.class public final Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    iget-object v1, p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 23
    .line 24
    iget-boolean p1, p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BoxMeasurePolicy(alignment="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", propagateMinConstraints="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Ljava/util/List;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 12

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Landroidx/compose/foundation/飘花落叶言子苏世哲楪兰;

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    invoke-direct {v2, v4}, Landroidx/compose/foundation/飘花落叶言子苏世哲楪兰;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0, v1, v2}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move-wide v0, p3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide v0, -0x1fffffffdL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v0, p3

    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 51
    .line 52
    invoke-interface {v2}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世苏楪哲兰()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, v0, v1}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v4, v1, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 64
    .line 65
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget v5, v1, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 74
    .line 75
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    new-instance v0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲苏兰世;

    .line 80
    .line 81
    move-object v6, p0

    .line 82
    move-object v3, p1

    .line 83
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲苏兰世;-><init>(Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IILandroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v4, v5, v0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    new-array v4, v4, [Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 96
    .line 97
    move-object v5, v4

    .line 98
    new-instance v4, Lkotlin/jvm/internal/Ref$IntRef;

    .line 99
    .line 100
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(J)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    iput v6, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 108
    .line 109
    move-object v6, v5

    .line 110
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    .line 111
    .line 112
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static/range {p3 .. p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(J)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    iput v8, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 120
    .line 121
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    :goto_1
    if-ge v7, v8, :cond_3

    .line 126
    .line 127
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    check-cast v9, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 132
    .line 133
    invoke-interface {v9}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世苏楪哲兰()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    invoke-interface {v9, v0, v1}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    aput-object v9, v6, v7

    .line 141
    .line 142
    iget v10, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 143
    .line 144
    iget v11, v9, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 145
    .line 146
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    iput v10, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 151
    .line 152
    iget v10, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 153
    .line 154
    iget v9, v9, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 155
    .line 156
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    iput v9, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 161
    .line 162
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    iget v7, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 166
    .line 167
    iget v8, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 168
    .line 169
    new-instance v0, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰世苏;

    .line 170
    .line 171
    move-object v3, p1

    .line 172
    move-object v2, p2

    .line 173
    move-object v1, v6

    .line 174
    move-object v6, p0

    .line 175
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰世苏;-><init>([Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;Ljava/util/List;Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/foundation/layout/飘花落叶言子楪哲兰苏世;)V

    .line 176
    .line 177
    .line 178
    invoke-static {p1, v7, v8, v0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0
.end method
