.class public abstract Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static 飘花落叶言子楪世哲苏兰(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/飘花落叶言子楪苏兰世哲;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroidx/window/extensions/layout/DisplayFeature;

    .line 34
    .line 35
    instance-of v2, v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 40
    .line 41
    invoke-static {p0, v1}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/飘花落叶言子楪世哲苏兰;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_1
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/飘花落叶言子楪苏兰世哲;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    sget-object v3, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    sget-object v4, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v6, 0x22

    .line 20
    .line 21
    if-lt v5, v6, :cond_0

    .line 22
    .line 23
    sget-object v7, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v7, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    :goto_0
    const/4 v8, 0x1

    .line 29
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    const/4 v8, 0x2

    .line 34
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    const/4 v8, 0x4

    .line 39
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    const/16 v8, 0x8

    .line 44
    .line 45
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    const/16 v8, 0x10

    .line 50
    .line 51
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    const/16 v8, 0x20

    .line 56
    .line 57
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    const/16 v8, 0x40

    .line 62
    .line 63
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    const/16 v8, 0x80

    .line 68
    .line 69
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v16

    .line 73
    filled-new-array/range {v9 .. v16}, [Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-static {v8}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    const/16 v8, 0x1e

    .line 81
    .line 82
    if-lt v5, v8, :cond_3

    .line 83
    .line 84
    if-lt v5, v6, :cond_1

    .line 85
    .line 86
    move-object v2, v4

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    if-lt v5, v8, :cond_2

    .line 89
    .line 90
    move-object v2, v3

    .line 91
    :cond_2
    :goto_1
    invoke-interface {v2, v0, v7}, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0, v1}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :cond_3
    const/16 v9, 0x1d

    .line 101
    .line 102
    if-lt v5, v9, :cond_6

    .line 103
    .line 104
    instance-of v9, v0, Landroid/app/Activity;

    .line 105
    .line 106
    if-eqz v9, :cond_6

    .line 107
    .line 108
    check-cast v0, Landroid/app/Activity;

    .line 109
    .line 110
    if-lt v5, v6, :cond_4

    .line 111
    .line 112
    move-object v2, v4

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    if-lt v5, v8, :cond_5

    .line 115
    .line 116
    move-object v2, v3

    .line 117
    :cond_5
    :goto_2
    invoke-interface {v2, v0, v7}, L飘花落叶言子兰哲世楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/app/Activity;L飘花落叶言子兰哲世楪苏/飘花落叶言子楪世兰苏哲;)Landroidx/window/layout/飘花落叶言子楪苏兰哲世;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0, v1}, Landroidx/window/layout/adapter/extensions/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_6
    const-string v0, "Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q."

    .line 127
    .line 128
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/window/layout/飘花落叶言子楪苏兰哲世;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/飘花落叶言子楪世哲苏兰;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-object v0, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getState()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eq v3, v2, :cond_3

    .line 29
    .line 30
    if-eq v3, v1, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    sget-object v1, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    sget-object v1, Landroidx/window/layout/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/window/layout/飘花落叶言子楪世苏兰哲;

    .line 37
    .line 38
    :goto_1
    new-instance v2, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/graphics/Rect;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/window/layout/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eq v3, v4, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eq v3, v4, :cond_5

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-ge v3, v4, :cond_6

    .line 97
    .line 98
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-ge v3, v4, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-ne v3, v4, :cond_7

    .line 118
    .line 119
    invoke-virtual {v2}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-ne v2, p0, :cond_7

    .line 128
    .line 129
    :goto_2
    const/4 p0, 0x0

    .line 130
    return-object p0

    .line 131
    :cond_7
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪世哲苏兰;

    .line 132
    .line 133
    new-instance v2, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;

    .line 134
    .line 135
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-direct {v2, p1}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/graphics/Rect;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v2, v0, v1}, Landroidx/window/layout/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;Landroidx/window/layout/飘花落叶言子楪世苏兰哲;Landroidx/window/layout/飘花落叶言子楪世苏兰哲;)V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method
