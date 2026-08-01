.class public final Landroidx/compose/material3/飘花落叶言子世苏哲楪兰;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;
.implements Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;


# virtual methods
.method public final 飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 6

    .line 1
    sget-object v0, Landroidx/compose/material3/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    iget v0, v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpg-float v2, v0, v1

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    :cond_0
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪兰哲苏(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-boolean p3, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_1

    .line 31
    .line 32
    invoke-static {v0, v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(FF)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-lez p3, :cond_1

    .line 37
    .line 38
    const/4 p3, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move p3, p4

    .line 41
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-interface {p1, v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲兰楪世(F)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v0, p4

    .line 53
    :goto_1
    iget v1, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 54
    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    :cond_3
    iget v2, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 62
    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :cond_4
    if-eqz p3, :cond_8

    .line 70
    .line 71
    iget-object p3, p0, Landroidx/compose/material3/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    if-nez p3, :cond_5

    .line 74
    .line 75
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    const/4 v3, 0x2

    .line 78
    invoke-direct {p3, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object p3, p0, Landroidx/compose/material3/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    :cond_5
    sget-object v3, Landroidx/compose/material3/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/layout/飘花落叶言子哲楪世苏兰;

    .line 84
    .line 85
    iget v4, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 86
    .line 87
    sub-int v4, v0, v4

    .line 88
    .line 89
    int-to-float v4, v4

    .line 90
    const/high16 v5, 0x40000000    # 2.0f

    .line 91
    .line 92
    div-float/2addr v4, v5

    .line 93
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-gez v4, :cond_6

    .line 98
    .line 99
    move v4, p4

    .line 100
    :cond_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {p3, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget-object v3, Landroidx/compose/material3/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/layout/飘花落叶言子楪哲世苏兰;

    .line 108
    .line 109
    iget v4, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 110
    .line 111
    sub-int/2addr v0, v4

    .line 112
    int-to-float v0, v0

    .line 113
    div-float/2addr v0, v5

    .line 114
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-gez v0, :cond_7

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    move p4, v0

    .line 122
    :goto_2
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-interface {p3, v3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_8
    iget-object p0, p0, Landroidx/compose/material3/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 130
    .line 131
    if-nez p0, :cond_9

    .line 132
    .line 133
    invoke-static {}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世苏兰哲楪()Ljava/util/Map;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :cond_9
    new-instance p3, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;

    .line 138
    .line 139
    invoke-direct {p3, v1, p2, v2}, Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲世兰;-><init>(ILandroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p1, v1, v2, p0, p3}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世哲兰楪(IILjava/util/Map;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
.end method
