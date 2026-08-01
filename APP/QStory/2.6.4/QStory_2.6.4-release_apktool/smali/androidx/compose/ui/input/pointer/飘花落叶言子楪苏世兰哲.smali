.class public final Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;
.super Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

.field public final 飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

.field public final 飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

.field public 飘花落叶言子楪苏世兰哲:Z

.field public 飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

.field public 飘花落叶言子楪苏哲世兰:Z

.field public 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v1, v0}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;-><init>(BI)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    new-array v1, v0, [J

    .line 16
    .line 17
    iput-object v1, p1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 20
    .line 21
    new-instance p1, Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Landroidx/collection/飘花落叶言子楪兰世哲苏;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 30
    .line 31
    iput-boolean p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(modifierNode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pointerIds="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(JLandroidx/collection/飘花落叶言子世哲苏楪兰;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3, p0}, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 27
    .line 28
    iget p0, p0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_1
    if-ge v1, p0, :cond_2

    .line 32
    .line 33
    aget-object v2, v0, v1

    .line 34
    .line 35
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;

    .line 36
    .line 37
    invoke-virtual {v2, p1, p2, p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(JLandroidx/collection/飘花落叶言子世哲苏楪兰;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;Z)Z
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    iget-boolean v2, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v2, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰楪哲()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v2, v1

    .line 32
    :goto_0
    if-nez v2, :cond_3

    .line 33
    .line 34
    :goto_1
    return v1

    .line 35
    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-wide v3, v3, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    move-object v6, v0

    .line 49
    move-object v7, v5

    .line 50
    :goto_2
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v6, :cond_b

    .line 54
    .line 55
    instance-of v10, v6, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    check-cast v6, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 60
    .line 61
    sget-object v8, Landroidx/compose/ui/input/pointer/PointerEventPass;->Initial:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 62
    .line 63
    invoke-interface {v6, v2, v8, v3, v4}, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;->飘花落叶言子世苏楪兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 64
    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_4
    iget v10, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 68
    .line 69
    and-int/2addr v10, v8

    .line 70
    if-eqz v10, :cond_a

    .line 71
    .line 72
    instance-of v10, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 73
    .line 74
    if-eqz v10, :cond_a

    .line 75
    .line 76
    move-object v10, v6

    .line 77
    check-cast v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 78
    .line 79
    iget-object v10, v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 80
    .line 81
    move v11, v1

    .line 82
    :goto_3
    if-eqz v10, :cond_9

    .line 83
    .line 84
    iget v12, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 85
    .line 86
    and-int/2addr v12, v8

    .line 87
    if-eqz v12, :cond_8

    .line 88
    .line 89
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    if-ne v11, v9, :cond_5

    .line 92
    .line 93
    move-object v6, v10

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    if-nez v7, :cond_6

    .line 96
    .line 97
    new-instance v7, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 98
    .line 99
    new-array v12, v8, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 100
    .line 101
    invoke-direct {v7, v1, v12}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    if-eqz v6, :cond_7

    .line 105
    .line 106
    invoke-virtual {v7, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v6, v5

    .line 110
    :cond_7
    invoke-virtual {v7, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_4
    iget-object v10, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_9
    if-ne v11, v9, :cond_a

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_a
    :goto_5
    invoke-static {v7}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_2

    .line 124
    :cond_b
    iget-boolean v6, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 125
    .line 126
    if-eqz v6, :cond_c

    .line 127
    .line 128
    iget-object v6, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 129
    .line 130
    iget-object v7, v6, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 131
    .line 132
    iget v6, v6, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 133
    .line 134
    move v10, v1

    .line 135
    :goto_6
    if-ge v10, v6, :cond_c

    .line 136
    .line 137
    aget-object v11, v7, v10

    .line 138
    .line 139
    check-cast v11, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;

    .line 140
    .line 141
    iget-object v12, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11, p1, p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;Z)Z

    .line 147
    .line 148
    .line 149
    add-int/lit8 v10, v10, 0x1

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_c
    iget-boolean p0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 153
    .line 154
    if-eqz p0, :cond_14

    .line 155
    .line 156
    move-object p0, v5

    .line 157
    :goto_7
    if-eqz v0, :cond_14

    .line 158
    .line 159
    instance-of p1, v0, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 160
    .line 161
    if-eqz p1, :cond_d

    .line 162
    .line 163
    check-cast v0, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 164
    .line 165
    sget-object p1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 166
    .line 167
    invoke-interface {v0, v2, p1, v3, v4}, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;->飘花落叶言子世苏楪兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 168
    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_d
    iget p1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 172
    .line 173
    and-int/2addr p1, v8

    .line 174
    if-eqz p1, :cond_13

    .line 175
    .line 176
    instance-of p1, v0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 177
    .line 178
    if-eqz p1, :cond_13

    .line 179
    .line 180
    move-object p1, v0

    .line 181
    check-cast p1, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 182
    .line 183
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 184
    .line 185
    move p2, v1

    .line 186
    :goto_8
    if-eqz p1, :cond_12

    .line 187
    .line 188
    iget v6, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 189
    .line 190
    and-int/2addr v6, v8

    .line 191
    if-eqz v6, :cond_11

    .line 192
    .line 193
    add-int/lit8 p2, p2, 0x1

    .line 194
    .line 195
    if-ne p2, v9, :cond_e

    .line 196
    .line 197
    move-object v0, p1

    .line 198
    goto :goto_9

    .line 199
    :cond_e
    if-nez p0, :cond_f

    .line 200
    .line 201
    new-instance p0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 202
    .line 203
    new-array v6, v8, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 204
    .line 205
    invoke-direct {p0, v1, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_f
    if-eqz v0, :cond_10

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move-object v0, v5

    .line 214
    :cond_10
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_11
    :goto_9
    iget-object p1, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_12
    if-ne p2, v9, :cond_13

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_13
    :goto_a
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    goto :goto_7

    .line 228
    :cond_14
    return v9
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)Z
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    iget-boolean v4, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_1
    iget-object v4, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v4}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰楪哲()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :goto_0
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_3
    iget-object v4, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-wide v5, v5, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 50
    .line 51
    move-object v7, v1

    .line 52
    move-object v8, v2

    .line 53
    :goto_1
    const/4 v9, 0x1

    .line 54
    if-eqz v7, :cond_b

    .line 55
    .line 56
    instance-of v10, v7, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 57
    .line 58
    if-eqz v10, :cond_4

    .line 59
    .line 60
    check-cast v7, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 61
    .line 62
    sget-object v9, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 63
    .line 64
    invoke-interface {v7, v4, v9, v5, v6}, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;->飘花落叶言子世苏楪兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    iget v10, v7, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 69
    .line 70
    const/16 v11, 0x10

    .line 71
    .line 72
    and-int/2addr v10, v11

    .line 73
    if-eqz v10, :cond_a

    .line 74
    .line 75
    instance-of v10, v7, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 76
    .line 77
    if-eqz v10, :cond_a

    .line 78
    .line 79
    move-object v10, v7

    .line 80
    check-cast v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 81
    .line 82
    iget-object v10, v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 83
    .line 84
    move v12, v3

    .line 85
    :goto_2
    if-eqz v10, :cond_9

    .line 86
    .line 87
    iget v13, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 88
    .line 89
    and-int/2addr v13, v11

    .line 90
    if-eqz v13, :cond_8

    .line 91
    .line 92
    add-int/lit8 v12, v12, 0x1

    .line 93
    .line 94
    if-ne v12, v9, :cond_5

    .line 95
    .line 96
    move-object v7, v10

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    if-nez v8, :cond_6

    .line 99
    .line 100
    new-instance v8, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 101
    .line 102
    new-array v13, v11, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 103
    .line 104
    invoke-direct {v8, v3, v13}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    if-eqz v7, :cond_7

    .line 108
    .line 109
    invoke-virtual {v8, v7}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move-object v7, v2

    .line 113
    :cond_7
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    :goto_3
    iget-object v10, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    if-ne v12, v9, :cond_a

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_a
    :goto_4
    invoke-static {v8}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    goto :goto_1

    .line 127
    :cond_b
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 128
    .line 129
    if-eqz v1, :cond_c

    .line 130
    .line 131
    iget-object v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    iget-object v4, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 134
    .line 135
    iget v1, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 136
    .line 137
    :goto_5
    if-ge v3, v1, :cond_c

    .line 138
    .line 139
    aget-object v5, v4, v3

    .line 140
    .line 141
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;

    .line 142
    .line 143
    invoke-virtual {v5, p1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)Z

    .line 144
    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_c
    move v3, v9

    .line 150
    :goto_6
    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 154
    .line 155
    .line 156
    iput-object v2, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 157
    .line 158
    return v3
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    :goto_1
    if-eqz p0, :cond_8

    .line 26
    .line 27
    instance-of v3, p0, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 32
    .line 33
    invoke-interface {p0}, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;->飘花落叶言子世苏哲楪兰()V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget v3, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 38
    .line 39
    const/16 v4, 0x10

    .line 40
    .line 41
    and-int/2addr v3, v4

    .line 42
    if-eqz v3, :cond_7

    .line 43
    .line 44
    instance-of v3, p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 45
    .line 46
    if-eqz v3, :cond_7

    .line 47
    .line 48
    move-object v3, p0

    .line 49
    check-cast v3, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 50
    .line 51
    iget-object v3, v3, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 52
    .line 53
    move v5, v2

    .line 54
    :goto_2
    const/4 v6, 0x1

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    iget v7, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 58
    .line 59
    and-int/2addr v7, v4

    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    if-ne v5, v6, :cond_2

    .line 65
    .line 66
    move-object p0, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-nez v1, :cond_3

    .line 69
    .line 70
    new-instance v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 71
    .line 72
    new-array v6, v4, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    invoke-direct {v1, v2, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz p0, :cond_4

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object p0, v0

    .line 83
    :cond_4
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    iget-object v3, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    if-ne v5, v6, :cond_7

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_4
    invoke-static {v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_1

    .line 97
    :cond_8
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_4

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 28
    .line 29
    iget-boolean v6, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 30
    .line 31
    iget-wide v7, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 32
    .line 33
    invoke-virtual {p1, v7, v8}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(J)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-boolean v9, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    :cond_1
    if-nez v6, :cond_3

    .line 44
    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    :cond_2
    iget-object v5, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    invoke-virtual {v5, v7, v8}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(J)V

    .line 50
    .line 51
    .line 52
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iput-boolean v3, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 56
    .line 57
    iget p1, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    :cond_5
    iput-boolean v3, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 64
    .line 65
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/collection/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;Z)Z
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/collection/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    iget-boolean v6, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    const/4 v9, 0x0

    .line 23
    if-eqz v5, :cond_8

    .line 24
    .line 25
    instance-of v10, v5, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 26
    .line 27
    const/16 v11, 0x10

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;

    .line 32
    .line 33
    invoke-static {v5, v11}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iput-object v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_1
    iget v10, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 41
    .line 42
    and-int/2addr v10, v11

    .line 43
    if-eqz v10, :cond_7

    .line 44
    .line 45
    instance-of v10, v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 46
    .line 47
    if-eqz v10, :cond_7

    .line 48
    .line 49
    move-object v10, v5

    .line 50
    check-cast v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 51
    .line 52
    iget-object v10, v10, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 53
    .line 54
    move v12, v9

    .line 55
    :goto_1
    if-eqz v10, :cond_6

    .line 56
    .line 57
    iget v13, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 58
    .line 59
    and-int/2addr v13, v11

    .line 60
    if-eqz v13, :cond_5

    .line 61
    .line 62
    add-int/lit8 v12, v12, 0x1

    .line 63
    .line 64
    if-ne v12, v7, :cond_2

    .line 65
    .line 66
    move-object v5, v10

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    if-nez v8, :cond_3

    .line 69
    .line 70
    new-instance v8, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 71
    .line 72
    new-array v13, v11, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    invoke-direct {v8, v9, v13}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {v8, v5}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    :cond_4
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_2
    iget-object v10, v10, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    if-ne v12, v7, :cond_7

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    :goto_3
    invoke-static {v8}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    goto :goto_0

    .line 97
    :cond_8
    iget-object v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 98
    .line 99
    if-nez v5, :cond_9

    .line 100
    .line 101
    :goto_4
    return v7

    .line 102
    :cond_9
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    move v8, v9

    .line 107
    :goto_5
    iget-object v10, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 108
    .line 109
    iget-object v11, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 110
    .line 111
    if-ge v8, v5, :cond_10

    .line 112
    .line 113
    invoke-virtual {v1, v8}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 114
    .line 115
    .line 116
    move-result-wide v12

    .line 117
    invoke-virtual {v1, v8}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    check-cast v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 122
    .line 123
    invoke-virtual {v10, v12, v13}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(J)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-eqz v10, :cond_f

    .line 128
    .line 129
    move v15, v7

    .line 130
    iget-wide v6, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:J

    .line 131
    .line 132
    iget-wide v9, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 133
    .line 134
    const-wide v16, 0x7fffffff7fffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long v18, v6, v16

    .line 140
    .line 141
    const-wide v20, 0x7fffff007fffffL

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    add-long v18, v18, v20

    .line 147
    .line 148
    const-wide v22, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    and-long v18, v18, v22

    .line 154
    .line 155
    const-wide/16 v24, 0x0

    .line 156
    .line 157
    cmp-long v18, v18, v24

    .line 158
    .line 159
    if-nez v18, :cond_e

    .line 160
    .line 161
    and-long v18, v9, v16

    .line 162
    .line 163
    add-long v18, v18, v20

    .line 164
    .line 165
    and-long v18, v18, v22

    .line 166
    .line 167
    cmp-long v18, v18, v24

    .line 168
    .line 169
    if-nez v18, :cond_e

    .line 170
    .line 171
    move/from16 v18, v15

    .line 172
    .line 173
    new-instance v15, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v19

    .line 179
    move/from16 v49, v4

    .line 180
    .line 181
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    move/from16 v19, v5

    .line 193
    .line 194
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    move/from16 v50, v8

    .line 199
    .line 200
    const/4 v8, 0x0

    .line 201
    :goto_6
    if-ge v8, v5, :cond_b

    .line 202
    .line 203
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v26

    .line 207
    move-object/from16 v27, v4

    .line 208
    .line 209
    move-object/from16 v4, v26

    .line 210
    .line 211
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;

    .line 212
    .line 213
    move-object/from16 v51, v11

    .line 214
    .line 215
    move-wide/from16 v52, v12

    .line 216
    .line 217
    iget-wide v11, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 218
    .line 219
    and-long v28, v11, v16

    .line 220
    .line 221
    add-long v28, v28, v20

    .line 222
    .line 223
    and-long v28, v28, v22

    .line 224
    .line 225
    cmp-long v13, v28, v24

    .line 226
    .line 227
    if-nez v13, :cond_a

    .line 228
    .line 229
    new-instance v28, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;

    .line 230
    .line 231
    move-object/from16 v54, v14

    .line 232
    .line 233
    iget-wide v13, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:J

    .line 234
    .line 235
    move/from16 v26, v5

    .line 236
    .line 237
    iget-object v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 238
    .line 239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v2, v11, v12}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v31

    .line 246
    iget v5, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 247
    .line 248
    iget-wide v11, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 249
    .line 250
    move/from16 v33, v5

    .line 251
    .line 252
    iget-wide v4, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 253
    .line 254
    move-wide/from16 v36, v4

    .line 255
    .line 256
    move-wide/from16 v34, v11

    .line 257
    .line 258
    move-wide/from16 v29, v13

    .line 259
    .line 260
    invoke-direct/range {v28 .. v37}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;-><init>(JJFJJ)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v4, v28

    .line 264
    .line 265
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_a
    move/from16 v26, v5

    .line 270
    .line 271
    move-object/from16 v54, v14

    .line 272
    .line 273
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 274
    .line 275
    move/from16 v5, v26

    .line 276
    .line 277
    move-object/from16 v4, v27

    .line 278
    .line 279
    move-object/from16 v11, v51

    .line 280
    .line 281
    move-wide/from16 v12, v52

    .line 282
    .line 283
    move-object/from16 v14, v54

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_b
    move-object/from16 v51, v11

    .line 287
    .line 288
    move-wide/from16 v52, v12

    .line 289
    .line 290
    move-object/from16 v54, v14

    .line 291
    .line 292
    iget-object v4, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v2, v6, v7}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;J)J

    .line 298
    .line 299
    .line 300
    move-result-wide v37

    .line 301
    iget-object v4, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v2, v9, v10}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;J)J

    .line 307
    .line 308
    .line 309
    move-result-wide v31

    .line 310
    iget-wide v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 311
    .line 312
    iget-wide v6, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:J

    .line 313
    .line 314
    iget-boolean v8, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 315
    .line 316
    iget-wide v9, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:J

    .line 317
    .line 318
    iget-boolean v11, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 319
    .line 320
    iget v12, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 321
    .line 322
    move-wide/from16 v27, v4

    .line 323
    .line 324
    iget-wide v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲兰世:J

    .line 325
    .line 326
    iget v13, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:F

    .line 327
    .line 328
    new-instance v26, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 329
    .line 330
    iget v2, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰世哲:F

    .line 331
    .line 332
    move-wide/from16 v42, v4

    .line 333
    .line 334
    iget-wide v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世:J

    .line 335
    .line 336
    move-wide/from16 v45, v4

    .line 337
    .line 338
    iget-wide v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世兰苏:J

    .line 339
    .line 340
    move/from16 v44, v2

    .line 341
    .line 342
    move-wide/from16 v47, v4

    .line 343
    .line 344
    move-wide/from16 v29, v6

    .line 345
    .line 346
    move/from16 v33, v8

    .line 347
    .line 348
    move-wide/from16 v35, v9

    .line 349
    .line 350
    move/from16 v39, v11

    .line 351
    .line 352
    move/from16 v40, v12

    .line 353
    .line 354
    move/from16 v34, v13

    .line 355
    .line 356
    move-object/from16 v41, v15

    .line 357
    .line 358
    invoke-direct/range {v26 .. v48}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 359
    .line 360
    .line 361
    move-object/from16 v2, v26

    .line 362
    .line 363
    iget-object v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 364
    .line 365
    if-nez v4, :cond_c

    .line 366
    .line 367
    move-object v4, v14

    .line 368
    :cond_c
    iput-object v4, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 369
    .line 370
    iget-object v4, v14, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 371
    .line 372
    if-nez v4, :cond_d

    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_d
    move-object v14, v4

    .line 376
    :goto_8
    iput-object v14, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 377
    .line 378
    move-object/from16 v6, v51

    .line 379
    .line 380
    move-wide/from16 v4, v52

    .line 381
    .line 382
    invoke-virtual {v6, v2, v4, v5}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;J)V

    .line 383
    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_e
    move/from16 v49, v4

    .line 387
    .line 388
    move/from16 v19, v5

    .line 389
    .line 390
    move/from16 v50, v8

    .line 391
    .line 392
    move/from16 v18, v15

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_f
    move/from16 v49, v4

    .line 396
    .line 397
    move/from16 v19, v5

    .line 398
    .line 399
    move/from16 v18, v7

    .line 400
    .line 401
    move/from16 v50, v8

    .line 402
    .line 403
    :goto_9
    add-int/lit8 v8, v50, 0x1

    .line 404
    .line 405
    move-object/from16 v2, p2

    .line 406
    .line 407
    move/from16 v7, v18

    .line 408
    .line 409
    move/from16 v5, v19

    .line 410
    .line 411
    move/from16 v4, v49

    .line 412
    .line 413
    const/4 v9, 0x0

    .line 414
    goto/16 :goto_5

    .line 415
    .line 416
    :cond_10
    move/from16 v49, v4

    .line 417
    .line 418
    move/from16 v18, v7

    .line 419
    .line 420
    move-object v6, v11

    .line 421
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-nez v2, :cond_11

    .line 426
    .line 427
    const/4 v2, 0x0

    .line 428
    iput v2, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 429
    .line 430
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 431
    .line 432
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V

    .line 433
    .line 434
    .line 435
    return v18

    .line 436
    :cond_11
    iget v2, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 437
    .line 438
    add-int/lit8 v2, v2, -0x1

    .line 439
    .line 440
    :goto_a
    const/4 v4, -0x1

    .line 441
    if-ge v4, v2, :cond_15

    .line 442
    .line 443
    iget-object v5, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v5, [J

    .line 446
    .line 447
    aget-wide v7, v5, v2

    .line 448
    .line 449
    invoke-virtual {v1, v7, v8}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(J)I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    if-ltz v5, :cond_12

    .line 454
    .line 455
    goto :goto_c

    .line 456
    :cond_12
    iget v5, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 457
    .line 458
    if-ge v2, v5, :cond_14

    .line 459
    .line 460
    add-int/lit8 v5, v5, -0x1

    .line 461
    .line 462
    move v7, v2

    .line 463
    :goto_b
    if-ge v7, v5, :cond_13

    .line 464
    .line 465
    iget-object v8, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v8, [J

    .line 468
    .line 469
    add-int/lit8 v9, v7, 0x1

    .line 470
    .line 471
    aget-wide v11, v8, v9

    .line 472
    .line 473
    aput-wide v11, v8, v7

    .line 474
    .line 475
    move v7, v9

    .line 476
    goto :goto_b

    .line 477
    :cond_13
    iget v5, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 478
    .line 479
    add-int/2addr v5, v4

    .line 480
    iput v5, v10, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 481
    .line 482
    :cond_14
    :goto_c
    add-int/lit8 v2, v2, -0x1

    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰()I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    const/4 v4, 0x0

    .line 499
    :goto_d
    if-ge v4, v2, :cond_16

    .line 500
    .line 501
    invoke-virtual {v6, v4}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    add-int/lit8 v4, v4, 0x1

    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_16
    new-instance v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 512
    .line 513
    invoke-direct {v2, v1, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;-><init>(Ljava/util/List;L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    const/4 v5, 0x0

    .line 521
    :goto_e
    if-ge v5, v4, :cond_18

    .line 522
    .line 523
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    move-object v7, v6

    .line 528
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 529
    .line 530
    iget-wide v7, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 531
    .line 532
    invoke-virtual {v3, v7, v8}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(J)Z

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    if-eqz v7, :cond_17

    .line 537
    .line 538
    goto :goto_f

    .line 539
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_18
    const/4 v6, 0x0

    .line 543
    :goto_f
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 544
    .line 545
    const/4 v1, 0x3

    .line 546
    if-eqz v6, :cond_25

    .line 547
    .line 548
    iget-boolean v3, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 549
    .line 550
    if-nez p4, :cond_19

    .line 551
    .line 552
    const/4 v4, 0x0

    .line 553
    iput-boolean v4, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 554
    .line 555
    goto :goto_14

    .line 556
    :cond_19
    const/4 v4, 0x0

    .line 557
    iget-boolean v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 558
    .line 559
    if-nez v5, :cond_1f

    .line 560
    .line 561
    if-nez v3, :cond_1a

    .line 562
    .line 563
    iget-boolean v5, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 564
    .line 565
    if-eqz v5, :cond_1f

    .line 566
    .line 567
    :cond_1a
    iget-object v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 568
    .line 569
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-wide v7, v5, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 573
    .line 574
    iget-wide v5, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 575
    .line 576
    const/16 v9, 0x20

    .line 577
    .line 578
    shr-long v10, v5, v9

    .line 579
    .line 580
    long-to-int v10, v10

    .line 581
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 582
    .line 583
    .line 584
    move-result v10

    .line 585
    const-wide v11, 0xffffffffL

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    and-long/2addr v5, v11

    .line 591
    long-to-int v5, v5

    .line 592
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    shr-long v13, v7, v9

    .line 597
    .line 598
    long-to-int v6, v13

    .line 599
    and-long/2addr v7, v11

    .line 600
    long-to-int v7, v7

    .line 601
    const/4 v8, 0x0

    .line 602
    cmpg-float v9, v10, v8

    .line 603
    .line 604
    if-gez v9, :cond_1b

    .line 605
    .line 606
    move/from16 v9, v18

    .line 607
    .line 608
    goto :goto_10

    .line 609
    :cond_1b
    move v9, v4

    .line 610
    :goto_10
    int-to-float v6, v6

    .line 611
    cmpl-float v6, v10, v6

    .line 612
    .line 613
    if-lez v6, :cond_1c

    .line 614
    .line 615
    move/from16 v6, v18

    .line 616
    .line 617
    goto :goto_11

    .line 618
    :cond_1c
    move v6, v4

    .line 619
    :goto_11
    or-int/2addr v6, v9

    .line 620
    cmpg-float v8, v5, v8

    .line 621
    .line 622
    if-gez v8, :cond_1d

    .line 623
    .line 624
    move/from16 v8, v18

    .line 625
    .line 626
    goto :goto_12

    .line 627
    :cond_1d
    move v8, v4

    .line 628
    :goto_12
    or-int/2addr v6, v8

    .line 629
    int-to-float v7, v7

    .line 630
    cmpl-float v5, v5, v7

    .line 631
    .line 632
    if-lez v5, :cond_1e

    .line 633
    .line 634
    move/from16 v5, v18

    .line 635
    .line 636
    goto :goto_13

    .line 637
    :cond_1e
    move v5, v4

    .line 638
    :goto_13
    or-int/2addr v5, v6

    .line 639
    xor-int/lit8 v5, v5, 0x1

    .line 640
    .line 641
    iput-boolean v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 642
    .line 643
    :cond_1f
    :goto_14
    iget-boolean v5, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 644
    .line 645
    iget-boolean v6, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 646
    .line 647
    const/4 v7, 0x5

    .line 648
    const/4 v8, 0x4

    .line 649
    if-eq v5, v6, :cond_23

    .line 650
    .line 651
    iget v9, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 652
    .line 653
    if-ne v9, v1, :cond_20

    .line 654
    .line 655
    goto :goto_15

    .line 656
    :cond_20
    if-ne v9, v8, :cond_21

    .line 657
    .line 658
    goto :goto_15

    .line 659
    :cond_21
    if-ne v9, v7, :cond_23

    .line 660
    .line 661
    :goto_15
    if-eqz v5, :cond_22

    .line 662
    .line 663
    move v7, v8

    .line 664
    :cond_22
    iput v7, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 665
    .line 666
    goto :goto_16

    .line 667
    :cond_23
    iget v9, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 668
    .line 669
    if-ne v9, v8, :cond_24

    .line 670
    .line 671
    if-eqz v6, :cond_24

    .line 672
    .line 673
    iget-boolean v6, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 674
    .line 675
    if-nez v6, :cond_24

    .line 676
    .line 677
    iput v1, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 678
    .line 679
    goto :goto_16

    .line 680
    :cond_24
    if-ne v9, v7, :cond_26

    .line 681
    .line 682
    if-eqz v5, :cond_26

    .line 683
    .line 684
    if-eqz v3, :cond_26

    .line 685
    .line 686
    iput v1, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 687
    .line 688
    goto :goto_16

    .line 689
    :cond_25
    const/4 v4, 0x0

    .line 690
    :cond_26
    :goto_16
    if-nez v49, :cond_2a

    .line 691
    .line 692
    iget v3, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 693
    .line 694
    if-ne v3, v1, :cond_2a

    .line 695
    .line 696
    iget-object v1, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 697
    .line 698
    if-eqz v1, :cond_2a

    .line 699
    .line 700
    iget-object v1, v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 701
    .line 702
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    iget-object v5, v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 707
    .line 708
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 709
    .line 710
    .line 711
    move-result v6

    .line 712
    if-eq v3, v6, :cond_27

    .line 713
    .line 714
    goto :goto_18

    .line 715
    :cond_27
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    move v6, v4

    .line 720
    :goto_17
    if-ge v6, v3, :cond_29

    .line 721
    .line 722
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 727
    .line 728
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 733
    .line 734
    iget-wide v9, v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 735
    .line 736
    iget-wide v7, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 737
    .line 738
    invoke-static {v9, v10, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 739
    .line 740
    .line 741
    move-result v7

    .line 742
    if-nez v7, :cond_28

    .line 743
    .line 744
    goto :goto_18

    .line 745
    :cond_28
    add-int/lit8 v6, v6, 0x1

    .line 746
    .line 747
    goto :goto_17

    .line 748
    :cond_29
    move v7, v4

    .line 749
    goto :goto_19

    .line 750
    :cond_2a
    :goto_18
    move/from16 v7, v18

    .line 751
    .line 752
    :goto_19
    iput-object v2, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 753
    .line 754
    return v7
.end method
