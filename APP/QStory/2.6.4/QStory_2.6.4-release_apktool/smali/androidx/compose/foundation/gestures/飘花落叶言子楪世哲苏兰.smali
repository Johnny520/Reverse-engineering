.class public abstract Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2, v3}, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;-><init>(FFJ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(F)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    cmpg-float p0, p0, v0

    .line 14
    .line 15
    if-gez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)Ljava/lang/Float;
    .locals 9

    .line 1
    iget v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v1, 0x8

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/16 v1, 0x9

    .line 15
    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move v4, v1

    .line 26
    move v3, v2

    .line 27
    :goto_1
    if-ge v3, v0, :cond_3

    .line 28
    .line 29
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 34
    .line 35
    iget v6, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰世哲:F

    .line 36
    .line 37
    mul-float/2addr v4, v6

    .line 38
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    move v7, v2

    .line 47
    :goto_2
    if-ge v7, v6, :cond_2

    .line 48
    .line 49
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;

    .line 54
    .line 55
    iget v8, v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 56
    .line 57
    mul-float/2addr v4, v8

    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    cmpg-float v0, v4, v1

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    :goto_3
    if-ge v2, v0, :cond_5

    .line 74
    .line 75
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_6
    :goto_4
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;
    .locals 13

    .line 1
    iget v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v1, 0xb

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/16 v1, 0xc

    .line 16
    .line 17
    if-ne v0, v1, :cond_6

    .line 18
    .line 19
    :goto_0
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪苏世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-wide v4, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世:J

    .line 31
    .line 32
    const-wide v6, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    xor-long/2addr v4, v6

    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-direct {v6, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    move v8, v1

    .line 52
    :goto_1
    iget-wide v9, v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 53
    .line 54
    if-ge v8, v7, :cond_2

    .line 55
    .line 56
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;

    .line 61
    .line 62
    iget-wide v11, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 63
    .line 64
    invoke-static {v9, v10, v11, v12}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v9

    .line 68
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    invoke-direct {v6, v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v8, v8, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {v4, v5, v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move-wide v4, v2

    .line 82
    :goto_2
    invoke-static {v4, v5, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_3
    if-ge v1, v0, :cond_5

    .line 94
    .line 95
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    new-instance p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    invoke-direct {p0, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_6
    :goto_4
    const/4 p0, 0x0

    .line 114
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世哲楪;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;
    .locals 13

    .line 1
    iget v0, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x1000

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    iget v0, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v2, 0xa

    .line 16
    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v2, 0xb

    .line 21
    .line 22
    if-ne v0, v2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/16 v2, 0xc

    .line 26
    .line 27
    if-ne v0, v2, :cond_7

    .line 28
    .line 29
    :goto_0
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 32
    .line 33
    check-cast p2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪苏世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    iget-wide v4, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世:J

    .line 51
    .line 52
    const-wide v6, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    xor-long/2addr v4, v6

    .line 58
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    invoke-direct {v6, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    move v8, v0

    .line 72
    :goto_1
    iget-wide v9, v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 73
    .line 74
    if-ge v8, v7, :cond_3

    .line 75
    .line 76
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    iget-wide v11, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 83
    .line 84
    invoke-static {v9, v10, v11, v12}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    new-instance v6, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 89
    .line 90
    invoke-direct {v6, v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {v4, v5, v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-wide v4, v2

    .line 102
    :goto_2
    invoke-static {p0, p1, v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    invoke-static {p0, p1, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_5

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    :goto_3
    if-ge v0, p2, :cond_6

    .line 118
    .line 119
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance p2, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    invoke-direct {p2, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(J)V

    .line 134
    .line 135
    .line 136
    return-object p2

    .line 137
    :cond_7
    :goto_4
    const/4 p0, 0x0

    .line 138
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;J)V
    .locals 13

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    iget-object v2, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 6
    .line 7
    iget-wide v3, p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 8
    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    shr-long/2addr v3, v5

    .line 12
    long-to-int v3, v3

    .line 13
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-wide v6, p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 18
    .line 19
    const-wide v8, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v6, v8

    .line 25
    long-to-int v4, v6

    .line 26
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {p1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v7, 0x0

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    iput v7, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲兰世()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {p1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v10, 0x0

    .line 47
    if-nez v6, :cond_5

    .line 48
    .line 49
    invoke-static {p1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    iget v3, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    if-ne v3, v4, :cond_1

    .line 59
    .line 60
    iget v3, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 61
    .line 62
    add-int/lit8 v6, v3, 0x1

    .line 63
    .line 64
    iput v6, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 65
    .line 66
    invoke-virtual {v2, v3, p1}, Landroidx/collection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏世兰(ILjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v2, p1}, Landroidx/collection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget v3, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 74
    .line 75
    if-ne v3, v4, :cond_2

    .line 76
    .line 77
    iput v7, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 78
    .line 79
    :cond_2
    iget-object v1, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 80
    .line 81
    iget v3, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 82
    .line 83
    move v4, v7

    .line 84
    move v6, v10

    .line 85
    :goto_1
    if-ge v4, v3, :cond_3

    .line 86
    .line 87
    aget-object v11, v1, v4

    .line 88
    .line 89
    check-cast v11, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 90
    .line 91
    iget-wide v11, v11, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 92
    .line 93
    shr-long/2addr v11, v5

    .line 94
    long-to-int v11, v11

    .line 95
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    add-float/2addr v6, v11

    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget v1, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 104
    .line 105
    int-to-float v3, v1

    .line 106
    div-float v3, v6, v3

    .line 107
    .line 108
    iget-object v4, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 109
    .line 110
    move v6, v10

    .line 111
    :goto_2
    if-ge v7, v1, :cond_4

    .line 112
    .line 113
    aget-object v11, v4, v7

    .line 114
    .line 115
    check-cast v11, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 116
    .line 117
    iget-wide v11, v11, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 118
    .line 119
    and-long/2addr v11, v8

    .line 120
    long-to-int v11, v11

    .line 121
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    add-float/2addr v6, v11

    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    iget v1, v2, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 130
    .line 131
    int-to-float v1, v1

    .line 132
    div-float v4, v6, v1

    .line 133
    .line 134
    :cond_5
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    int-to-long v1, v1

    .line 139
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    int-to-long v3, v3

    .line 144
    shl-long/2addr v1, v5

    .line 145
    and-long/2addr v3, v8

    .line 146
    or-long/2addr v1, v3

    .line 147
    if-nez p2, :cond_6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    move-object/from16 v3, p3

    .line 151
    .line 152
    iget v3, v3, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 153
    .line 154
    const/4 v4, 0x1

    .line 155
    if-ne v3, v4, :cond_7

    .line 156
    .line 157
    shr-long/2addr v1, v5

    .line 158
    long-to-int v1, v1

    .line 159
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    goto :goto_3

    .line 164
    :cond_7
    const/4 v4, 0x2

    .line 165
    if-ne v3, v4, :cond_9

    .line 166
    .line 167
    and-long/2addr v1, v8

    .line 168
    long-to-int v1, v1

    .line 169
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    :goto_3
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 174
    .line 175
    if-ne p2, v2, :cond_8

    .line 176
    .line 177
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    int-to-long v0, v0

    .line 182
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    int-to-long v2, v2

    .line 187
    shl-long/2addr v0, v5

    .line 188
    and-long/2addr v2, v8

    .line 189
    or-long v1, v0, v2

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    int-to-long v2, v0

    .line 197
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    int-to-long v0, v0

    .line 202
    shl-long/2addr v2, v5

    .line 203
    and-long/2addr v0, v8

    .line 204
    or-long v1, v2, v0

    .line 205
    .line 206
    :cond_9
    :goto_4
    iget-wide v3, p1, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 207
    .line 208
    move-wide/from16 v5, p5

    .line 209
    .line 210
    invoke-static {v1, v2, v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 217
    .line 218
    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰(JJ)V

    .line 219
    .line 220
    .line 221
    return-void
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;)F
    .locals 15

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    const/4 v5, 0x1

    .line 11
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 18
    .line 19
    iget-boolean v7, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    iget-boolean v6, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v5, v2

    .line 29
    :goto_1
    add-int/2addr v4, v5

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-ge v4, v1, :cond_2

    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_2
    new-instance v1, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    const/16 v4, 0x8

    .line 41
    .line 42
    invoke-direct {v1, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v5, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    new-instance v1, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 50
    .line 51
    invoke-direct {v1, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    move v1, v3

    .line 63
    move v4, v1

    .line 64
    :goto_2
    if-ge v2, p0, :cond_6

    .line 65
    .line 66
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 71
    .line 72
    iget-boolean v10, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 73
    .line 74
    if-eqz v10, :cond_5

    .line 75
    .line 76
    iget-boolean v10, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 77
    .line 78
    if-eqz v10, :cond_5

    .line 79
    .line 80
    iget-wide v10, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 81
    .line 82
    iget-wide v12, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:J

    .line 83
    .line 84
    invoke-static {v12, v13, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v12

    .line 88
    invoke-static {v10, v11, v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    invoke-static {v12, v13}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(J)F

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    invoke-static {v9, v10}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(J)F

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    sub-float/2addr v14, v11

    .line 101
    invoke-static {v9, v10, v12, v13}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v9

    .line 105
    invoke-static {v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    const/high16 v10, 0x40000000    # 2.0f

    .line 110
    .line 111
    div-float/2addr v9, v10

    .line 112
    const/high16 v10, 0x43340000    # 180.0f

    .line 113
    .line 114
    cmpl-float v10, v14, v10

    .line 115
    .line 116
    const/high16 v11, 0x43b40000    # 360.0f

    .line 117
    .line 118
    if-lez v10, :cond_3

    .line 119
    .line 120
    sub-float/2addr v14, v11

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    const/high16 v10, -0x3ccc0000    # -180.0f

    .line 123
    .line 124
    cmpg-float v10, v14, v10

    .line 125
    .line 126
    if-gez v10, :cond_4

    .line 127
    .line 128
    add-float/2addr v14, v11

    .line 129
    :cond_4
    :goto_3
    mul-float/2addr v14, v9

    .line 130
    add-float/2addr v4, v14

    .line 131
    add-float/2addr v1, v9

    .line 132
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    cmpg-float p0, v1, v3

    .line 136
    .line 137
    if-nez p0, :cond_7

    .line 138
    .line 139
    :goto_4
    return v3

    .line 140
    :cond_7
    div-float/2addr v4, v1

    .line 141
    return v4
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Z)F
    .locals 8

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    :goto_0
    if-ge v4, v2, :cond_3

    .line 34
    .line 35
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 40
    .line 41
    iget-boolean v7, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    iget-boolean v7, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 46
    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-wide v6, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-wide v6, v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:J

    .line 55
    .line 56
    :goto_1
    invoke-static {v6, v7, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    invoke-static {v6, v7}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    add-float/2addr v6, v3

    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    move v3, v6

    .line 68
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    int-to-float p0, v5

    .line 72
    div-float/2addr v3, p0

    .line 73
    return v3
.end method

.method public static final 飘花落叶言子楪哲兰世苏(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;)J
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-wide p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 4
    .line 5
    return-wide p0

    .line 6
    :cond_0
    iget p2, p2, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 7
    .line 8
    const-wide v0, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne p2, v3, :cond_1

    .line 17
    .line 18
    iget-wide v3, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 19
    .line 20
    shr-long/2addr v3, v2

    .line 21
    long-to-int p0, v3

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v3, 0x2

    .line 28
    if-ne p2, v3, :cond_3

    .line 29
    .line 30
    iget-wide v3, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 31
    .line 32
    and-long/2addr v3, v0

    .line 33
    long-to-int p0, v3

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    sget-object p2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long p0, p0

    .line 48
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    int-to-long v3, p2

    .line 53
    shl-long/2addr p0, v2

    .line 54
    :goto_1
    and-long/2addr v0, v3

    .line 55
    or-long/2addr p0, v0

    .line 56
    return-wide p0

    .line 57
    :cond_2
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    int-to-long p1, p1

    .line 62
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-long v3, p0

    .line 67
    shl-long p0, p1, v2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-wide p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 71
    .line 72
    return-wide p0
.end method

.method public static 飘花落叶言子楪哲兰苏世(Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/foundation/MutatePriority;->Default:Landroidx/compose/foundation/MutatePriority;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$stopScroll$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Landroidx/compose/foundation/gestures/ScrollExtensionsKt$stopScroll$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0, v1, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/MutatePriority;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲苏世兰(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final 飘花落叶言子楪哲苏兰世(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;Z)J
    .locals 8

    .line 1
    iget-wide v0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:J

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget v2, p2, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 7
    .line 8
    const-wide v3, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-ne v2, v6, :cond_1

    .line 17
    .line 18
    shr-long/2addr v0, v5

    .line 19
    long-to-int v0, v0

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v6, 0x2

    .line 26
    if-ne v2, v6, :cond_3

    .line 27
    .line 28
    and-long/2addr v0, v3

    .line 29
    long-to-int v0, v0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :goto_0
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v0, v0

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v6, v2

    .line 49
    shl-long/2addr v0, v5

    .line 50
    :goto_1
    and-long v2, v6, v3

    .line 51
    .line 52
    or-long/2addr v0, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-long v1, v1

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v6, v0

    .line 64
    shl-long v0, v1, v5

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_2
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/gestures/Orientation;L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏哲兰;)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    invoke-static {p1, p2, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    iget-boolean p0, p0, L飘花落叶言子世兰苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Z

    .line 78
    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    const-wide/16 p0, 0x0

    .line 82
    .line 83
    return-wide p0

    .line 84
    :cond_4
    return-wide p1
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Z
    .locals 5

    .line 1
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    const/4 v3, 0x1

    .line 16
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 23
    .line 24
    iget-boolean v4, v4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    xor-int/lit8 p0, v1, 0x1

    .line 34
    .line 35
    return p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子楪世兰哲苏;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;->label:I

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
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    new-instance p2, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$2;

    .line 51
    .line 52
    invoke-direct {p2, p0, p1, v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$2;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 53
    .line 54
    .line 55
    iput v4, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableKt$restartable$1;->label:I

    .line 56
    .line 57
    invoke-static {p2, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    if-ne p0, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 65
    .line 66
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitEachGesture$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, p1, v2}, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitEachGesture$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 12
    .line 13
    invoke-virtual {p0, v1, p2}, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子哲兰世苏楪(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)J
    .locals 7

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v3, v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 18
    .line 19
    invoke-interface {p2, v5}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-wide v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-wide v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:J

    .line 37
    .line 38
    :goto_1
    invoke-static {v1, v2, v5, v6}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    if-nez v4, :cond_3

    .line 48
    .line 49
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    return-wide p0

    .line 55
    :cond_3
    int-to-float p0, v4

    .line 56
    invoke-static {p0, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    return-wide p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(J)F
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    cmpg-float v1, v1, v2

    .line 12
    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    and-long v5, p0, v3

    .line 21
    .line 22
    long-to-int v1, v5

    .line 23
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    cmpg-float v1, v1, v2

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    return v2

    .line 32
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    and-long/2addr p0, v3

    .line 37
    long-to-int p0, p0

    .line 38
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    float-to-double v0, v0

    .line 43
    float-to-double p0, p0

    .line 44
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    double-to-float p0, p0

    .line 49
    neg-float p0, p0

    .line 50
    const/high16 p1, 0x43340000    # 180.0f

    .line 51
    .line 52
    mul-float/2addr p0, p1

    .line 53
    const p1, 0x40490fdb    # (float)Math.PI

    .line 54
    .line 55
    .line 56
    div-float/2addr p0, p1

    .line 57
    return p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->label:I

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
    iget-object p0, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 39
    .line 40
    iget-object p1, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v6, p1

    .line 48
    move-object p1, p0

    .line 49
    move-object p0, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-nez p2, :cond_5

    .line 66
    .line 67
    :goto_1
    iput-object p0, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$3;->label:I

    .line 72
    .line 73
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v1, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    :goto_2
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 83
    .line 84
    iget-object p2, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v4, 0x0

    .line 91
    :goto_3
    if-ge v4, v2, :cond_5

    .line 92
    .line 93
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 98
    .line 99
    iget-boolean v5, v5, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 108
    .line 109
    return-object p0
.end method
