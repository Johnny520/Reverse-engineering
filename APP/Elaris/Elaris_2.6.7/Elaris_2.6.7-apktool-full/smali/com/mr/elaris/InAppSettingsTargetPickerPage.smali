.class final Lcom/mr/elaris/InAppSettingsTargetPickerPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static clearSelectedTroops(Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string p4, "\u5df2\u9009\u62e9 0 / "

    .line 7
    .line 8
    invoke-direct {p0, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    aget-object p0, p3, p0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static emptyPickerRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 2
    .line 3
    const-string v1, "\u6682\u65e0\u5339\u914d\u7ed3\u679c"

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x11

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v1, 0x41d00000    # 26.0f

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {v0, v3, v2, v3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static friendPickRow(Lcom/mr/elaris/InAppSettings;Lh5;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mr/elaris/InAppSettings;",
            "Lh5;",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            "I",
            "Ljava/lang/Runnable;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x41600000    # 14.0f

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x40c00000    # 6.0f

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/high16 v5, 0x41200000    # 10.0f

    .line 30
    .line 31
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0, v2, v4, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    const/high16 v2, 0x42600000    # 56.0f

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p1, Lh5;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Landroid/widget/LinearLayout;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 67
    .line 68
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 73
    .line 74
    .line 75
    iget-object v5, p1, Lh5;->b:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-lez v6, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p1}, Lh5;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :goto_0
    if-eqz v2, :cond_1

    .line 89
    .line 90
    sget v6, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sget v6, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 94
    .line 95
    :goto_1
    const/16 v7, 0xe

    .line 96
    .line 97
    invoke-virtual {p0, v5, v7, v6, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p1}, Lh5;->a()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    sget v7, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 106
    .line 107
    const/16 v8, 0xc

    .line 108
    .line 109
    invoke-virtual {p0, v6, v8, v7, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    const/high16 v7, 0x40800000    # 4.0f

    .line 114
    .line 115
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-virtual {v6, v1, v7, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 129
    .line 130
    const/4 v6, -0x2

    .line 131
    const/high16 v7, 0x3f800000    # 1.0f

    .line 132
    .line 133
    invoke-direct {v5, v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    const-string v1, "\u2713"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    const-string v1, ""

    .line 145
    .line 146
    :goto_2
    sget v3, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 147
    .line 148
    invoke-virtual {p0, v1, v8, v3, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const/16 v3, 0x11

    .line 153
    .line 154
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->checkCircleDrawable(Z)Landroid/graphics/drawable/Drawable;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 162
    .line 163
    .line 164
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 165
    .line 166
    const/high16 v3, 0x41c00000    # 24.0f

    .line 167
    .line 168
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-direct {v2, v4, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 180
    .line 181
    .line 182
    new-instance v5, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;

    .line 183
    .line 184
    move-object v7, p1

    .line 185
    move-object v6, p2

    .line 186
    move-object v8, p3

    .line 187
    move v9, p4

    .line 188
    move-object/from16 v10, p5

    .line 189
    .line 190
    invoke-direct/range {v5 .. v10}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;-><init>(Ljava/util/LinkedHashSet;Lh5;Landroid/widget/TextView;ILjava/lang/Runnable;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    .line 196
    return-object v0
.end method

.method public static invertSelectedTroops(Ljava/util/List;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lz6;

    .line 16
    .line 17
    iget-object v1, v0, Lz6;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v0, v0, Lz6;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "\u5df2\u9009\u62e9 "

    .line 38
    .line 39
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " / "

    .line 50
    .line 51
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    aget-object p0, p3, p0

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 6

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {p0, p1, v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v1, 0x11

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    const/high16 v1, 0x41400000    # 12.0f

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/high16 v4, 0x40e00000    # 7.0f

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {p1, v3, v5, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    const v1, 0x3f6e147b    # 0.93f

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/high16 v3, 0x41700000    # 15.0f

    .line 46
    .line 47
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/high16 v4, 0x3f400000    # 0.75f

    .line 52
    .line 53
    invoke-virtual {p0, v0, v4}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v1, v3, v0, v2}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    .line 66
    const/high16 v1, 0x42100000    # 36.0f

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, -0x2

    .line 73
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    .line 75
    .line 76
    const/high16 v1, 0x41000000    # 8.0f

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    return-object p1
.end method

.method public static mergeSelectedFriendPlaceholders(Ljava/util/List;Ljava/util/LinkedHashSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh5;",
            ">;",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lh5;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, v2, Lh5;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {v0}, Li5;->H0(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance v1, Lh5;

    .line 56
    .line 57
    const-string v2, "\u5df2\u9009\u597d\u53cb"

    .line 58
    .line 59
    const-string v3, ""

    .line 60
    .line 61
    invoke-direct {v1, v0, v2, v3}, Lh5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    :goto_1
    return-void
.end method

.method public static refreshFriendPickerRows(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->emptyPickerRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    move-object v3, p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v4, v2

    .line 45
    check-cast v4, Lh5;

    .line 46
    .line 47
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v2, 0x0

    .line 52
    aget-object v8, p6, v2

    .line 53
    .line 54
    move-object v3, p0

    .line 55
    move-object v5, p3

    .line 56
    move-object v6, p4

    .line 57
    invoke-static/range {v3 .. v8}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->friendPickRow(Lcom/mr/elaris/InAppSettings;Lh5;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    move-object p0, v3

    .line 65
    goto :goto_0

    .line 66
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {v3, p1, p0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->updatePickerListHeight(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static refreshTroopPickerRows(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->emptyPickerRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    move-object v3, p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v4, v2

    .line 45
    check-cast v4, Lz6;

    .line 46
    .line 47
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v2, 0x0

    .line 52
    aget-object v8, p6, v2

    .line 53
    .line 54
    move-object v3, p0

    .line 55
    move-object v5, p3

    .line 56
    move-object v6, p4

    .line 57
    invoke-static/range {v3 .. v8}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->troopPickRow(Lcom/mr/elaris/InAppSettings;Lz6;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    move-object p0, v3

    .line 65
    goto :goto_0

    .line 66
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {v3, p1, p0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->updatePickerListHeight(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static saveFriendPickerSelection(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getKeepFireTargets()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p6

    .line 5
    invoke-static {p6}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p6

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p6

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lk8;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget v2, v1, Lk8;->a:I

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p6

    .line 45
    :cond_2
    :goto_1
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v1}, Li5;->H0(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    new-instance v2, Lk8;

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-direct {v2, v1, v3}, Lk8;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-static {v0}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p6

    .line 77
    invoke-static {p6}, Lcom/mr/elaris/f;->t(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 81
    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    invoke-static {}, Lcom/mr/elaris/f;->z()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    if-eqz p3, :cond_5

    .line 93
    .line 94
    invoke-static {p6}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-static {}, La7;->m()Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object p6

    .line 102
    invoke-virtual {p0, p2, p6, p4}, Lcom/mr/elaris/InAppSettings;->selectedTargetsCompactPreview(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-virtual {p5}, Landroid/app/Dialog;->dismiss()V

    .line 110
    .line 111
    .line 112
    new-instance p2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string p3, "\u5df2\u9009\u62e9 "

    .line 115
    .line 116
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p1, " \u4e2a\u597d\u53cb"

    .line 127
    .line 128
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public static saveTroopPickerSelection(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;Landroid/app/AlertDialog;ZLandroid/view/View;)V
    .locals 5

    .line 1
    new-instance p7, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_0

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-virtual {p7, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p7

    .line 41
    invoke-static {p7}, La7;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p7

    .line 45
    if-eqz p6, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getKeepFireTargets()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lk8;

    .line 75
    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    iget v3, v2, Lk8;->a:I

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    if-ne v3, v4, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {p7}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/String;

    .line 106
    .line 107
    new-instance v3, Lk8;

    .line 108
    .line 109
    const/4 v4, 0x2

    .line 110
    invoke-direct {v3, v2, v4}, Lk8;-><init>(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-static {v1}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lcom/mr/elaris/f;->t(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    const-string v0, "clock_in_groups"

    .line 129
    .line 130
    invoke-static {p7}, La7;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :try_start_0
    invoke-static {v0, v1}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, La7;->e()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-eqz v2, :cond_6

    .line 142
    .line 143
    const-string v3, "settings"

    .line 144
    .line 145
    const/4 v4, 0x0

    .line 146
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v1, "config_version"

    .line 159
    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    :catchall_0
    :cond_6
    :goto_3
    if-eqz p2, :cond_8

    .line 172
    .line 173
    if-eqz p6, :cond_7

    .line 174
    .line 175
    invoke-static {}, Lcom/mr/elaris/f;->z()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->clockInCountText()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_4
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    :cond_8
    if-eqz p3, :cond_a

    .line 188
    .line 189
    if-eqz p6, :cond_9

    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->keepFireTargetsCompactPreview()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    goto :goto_5

    .line 196
    :cond_9
    invoke-static {p7}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p0, p2, p4}, Lcom/mr/elaris/InAppSettings;->selectedGroupsPreview(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    :goto_5
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-virtual {p5}, Landroid/app/Dialog;->dismiss()V

    .line 208
    .line 209
    .line 210
    new-instance p2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string p3, "\u5df2\u9009\u62e9 "

    .line 213
    .line 214
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string p1, " \u4e2a\u7fa4"

    .line 225
    .line 226
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method public static selectAllTroops(Ljava/util/LinkedHashSet;Ljava/util/List;Landroid/widget/TextView;[Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lz6;

    .line 19
    .line 20
    iget-object v0, v0, Lz6;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "\u5df2\u9009\u62e9 "

    .line 29
    .line 30
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, " / "

    .line 41
    .line 42
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    aget-object p0, p3, p0

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static showFriendPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->getKeepFireTargets()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v8, 0x1

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk8;

    .line 4
    iget v5, v4, Lk8;->a:I

    if-ne v5, v8, :cond_0

    iget-object v4, v4, Lk8;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {v2, v3}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->mergeSelectedFriendPlaceholders(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    move-object v4, v3

    .line 6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    const-string v0, ""

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v9

    .line 8
    new-instance v11, Landroid/widget/LinearLayout;

    iget-object v5, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v11, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 9
    invoke-virtual {v11, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    const-string v5, "elaris_dialog_surface"

    invoke-virtual {v11, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/high16 v5, 0x41900000    # 18.0f

    .line 11
    invoke-virtual {v1, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v7

    invoke-virtual {v1, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v5

    const/high16 v10, 0x41400000    # 12.0f

    invoke-virtual {v1, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v10

    invoke-virtual {v11, v6, v7, v5, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 12
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 13
    new-instance v5, Landroid/widget/LinearLayout;

    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v10, 0x0

    .line 14
    invoke-virtual {v5, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v6, 0x10

    .line 15
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v6, 0x14

    .line 16
    sget v7, Lcom/mr/elaris/InAppSettings;->TEXT:I

    const-string v12, "\u9009\u62e9\u597d\u53cb"

    invoke-virtual {v1, v12, v6, v7, v8}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v6

    const/high16 v7, 0x40000000    # 2.0f

    .line 17
    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v7

    invoke-virtual {v6, v7, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 18
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, -0x2

    invoke-direct {v7, v10, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v6, 0xd

    .line 19
    sget v7, Lcom/mr/elaris/InAppSettings;->SUB:I

    const-string v12, "\u6b63\u5728\u52a0\u8f7d\u597d\u53cb..."

    invoke-virtual {v1, v12, v6, v7, v10}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v6

    const/4 v7, 0x5

    .line 20
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    const-string v5, "\u641c\u7d22\u597d\u53cb\u6635\u79f0\u6216 QQ\u53f7/UID"

    invoke-virtual {v1, v5, v0}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    move-result-object v12

    .line 24
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v14, 0x42200000    # 40.0f

    invoke-virtual {v1, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v5

    const/4 v7, -0x1

    invoke-direct {v0, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v15, 0x41200000    # 10.0f

    .line 25
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v5

    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 26
    invoke-virtual {v11, v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    new-instance v0, Landroid/widget/ScrollView;

    iget-object v5, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v5}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x2

    .line 28
    invoke-virtual {v0, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 29
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 30
    invoke-virtual {v0, v8}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    const/high16 v5, 0x41800000    # 16.0f

    .line 31
    invoke-virtual {v1, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v14

    invoke-virtual {v0, v14}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 32
    sget v14, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 33
    invoke-virtual {v1, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v5

    move/from16 v16, v10

    sget v10, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 34
    invoke-virtual {v1, v14, v5, v10, v8}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object v5, v2

    .line 35
    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v10, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v2, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 37
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v10, v7, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2, v10}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x42c00000    # 96.0f

    invoke-virtual {v1, v13}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v14

    invoke-direct {v10, v7, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v7

    iput v7, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 40
    invoke-virtual {v11, v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    new-array v7, v8, [Ljava/lang/Runnable;

    .line 42
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$1;

    move-object/from16 v17, v6

    move-object v6, v5

    move-object/from16 v5, v17

    invoke-direct/range {v0 .. v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$1;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/ArrayList;[Ljava/lang/Runnable;)V

    move-object v2, v0

    move-object v0, v7

    move-object v7, v5

    move-object v5, v6

    aput-object v2, v0, v16

    .line 43
    new-instance v2, Lcom/mr/elaris/InAppSettingsTargetPickerPage$2;

    invoke-direct {v2, v9, v3, v5, v0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$2;-><init>([Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;[Ljava/lang/Runnable;)V

    new-array v3, v8, [Ljava/lang/Runnable;

    aput-object v2, v3, v16

    .line 44
    aget-object v2, v0, v16

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 45
    new-instance v2, Lcom/mr/elaris/InAppSettingsTargetPickerPage$3;

    invoke-direct {v2, v9, v3}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$3;-><init>([Ljava/lang/String;[Ljava/lang/Runnable;)V

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 46
    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v2, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move/from16 v6, v16

    .line 47
    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/high16 v9, 0x41000000    # 8.0f

    .line 48
    invoke-virtual {v1, v9}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v9

    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v10

    invoke-virtual {v2, v6, v9, v6, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 49
    const-string v6, "\u5168\u9009"

    invoke-static {v1, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v6

    .line 50
    const-string v9, "\u6e05\u7a7a"

    invoke-static {v1, v9}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v9

    .line 51
    const-string v10, "\u53cd\u9009"

    invoke-static {v1, v10}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v10

    .line 52
    new-instance v12, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;

    invoke-direct {v12, v4, v5, v7, v0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;-><init>(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Landroid/widget/TextView;[Ljava/lang/Runnable;)V

    invoke-virtual {v6, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    new-instance v12, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;

    invoke-direct {v12, v4, v7, v5, v0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;-><init>(Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/ArrayList;[Ljava/lang/Runnable;)V

    invoke-virtual {v9, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    new-instance v12, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;

    invoke-direct {v12, v5, v4, v7, v0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;-><init>(Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x15

    .line 60
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 61
    const-string v2, "\u53d6\u6d88"

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v6}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v2

    .line 62
    const-string v9, "\u4fdd\u5b58"

    invoke-virtual {v1, v9, v8}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v9

    .line 63
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1, v13}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    const/high16 v14, 0x42200000    # 40.0f

    invoke-virtual {v1, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    invoke-direct {v10, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    new-instance v6, Landroid/widget/Space;

    iget-object v10, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v6, v10}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    invoke-direct {v10, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1, v13}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v10

    const/high16 v14, 0x42200000    # 40.0f

    invoke-virtual {v1, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    invoke-direct {v6, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 67
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v6

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v6

    const/16 v16, 0x0

    .line 68
    invoke-virtual/range {v10 .. v15}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 69
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$7;

    invoke-direct {v0, v1, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$7;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 70
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$8;

    invoke-direct {v0, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$8;-><init>(Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;

    move-object v10, v3

    move-object v2, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/ArrayList;Landroid/app/AlertDialog;)V

    move-object v4, v2

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    new-array v0, v8, [Z

    aput-boolean v16, v0, v16

    move-object v4, v7

    .line 73
    new-instance v7, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;

    invoke-direct {v7, v0, v6, v1}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;-><init>([ZLandroid/app/AlertDialog;Lcom/mr/elaris/InAppSettings;)V

    .line 74
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v3, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const-wide/16 v8, 0x258

    invoke-virtual {v3, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    new-instance v8, Ljava/lang/Thread;

    move-object v6, v0

    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    move-object v3, v2

    move-object v2, v5

    move-object v5, v10

    invoke-direct/range {v0 .. v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;[ZLjava/lang/Runnable;)V

    const-string v1, "Elaris-FriendPickerLoad"

    invoke-direct {v8, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static showTroopPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, La7;->m()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "\u6682\u65e0\u7fa4\u5217\u8868\uff1b\u8bf7\u91cd\u65b0\u8fdb\u5165 QQ \u8bbe\u7f6e\u540e\u518d\u8bd5"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-static/range {p3 .. p3}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lk8;

    .line 46
    .line 47
    iget v6, v4, Lk8;->a:I

    .line 48
    .line 49
    if-ne v6, v0, :cond_1

    .line 50
    .line 51
    iget-object v4, v4, Lk8;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static/range {p3 .. p3}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    iget-object v4, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 72
    .line 73
    invoke-direct {v8, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    const/4 v9, 0x1

    .line 77
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 78
    .line 79
    .line 80
    const-string v4, "elaris_dialog_surface"

    .line 81
    .line 82
    invoke-virtual {v8, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/high16 v4, 0x41900000    # 18.0f

    .line 86
    .line 87
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    const/high16 v7, 0x41600000    # 14.0f

    .line 92
    .line 93
    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-virtual {v1, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    const/high16 v10, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v1, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    invoke-virtual {v8, v6, v7, v4, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v8, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Landroid/widget/LinearLayout;

    .line 118
    .line 119
    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 120
    .line 121
    invoke-direct {v4, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 122
    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 126
    .line 127
    .line 128
    const/16 v6, 0x10

    .line 129
    .line 130
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 131
    .line 132
    .line 133
    const/16 v6, 0x14

    .line 134
    .line 135
    sget v7, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 136
    .line 137
    const-string v11, "\u9009\u62e9\u7fa4"

    .line 138
    .line 139
    invoke-virtual {v1, v11, v6, v7, v9}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const/high16 v7, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    invoke-virtual {v6, v7, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 150
    .line 151
    .line 152
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 153
    .line 154
    const/high16 v11, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v12, -0x2

    .line 157
    invoke-direct {v7, v10, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 161
    .line 162
    .line 163
    new-instance v6, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v7, "\u5df2\u9009\u62e9 "

    .line 166
    .line 167
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v7, " / "

    .line 178
    .line 179
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    const/16 v7, 0xd

    .line 194
    .line 195
    sget v11, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 196
    .line 197
    invoke-virtual {v1, v6, v7, v11, v10}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    const/4 v7, 0x5

    .line 202
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 203
    .line 204
    .line 205
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 206
    .line 207
    invoke-direct {v7, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    .line 215
    .line 216
    const-string v4, "\u641c\u7d22\u7fa4\u540d\u6216\u7fa4\u53f7"

    .line 217
    .line 218
    const-string v7, ""

    .line 219
    .line 220
    invoke-virtual {v1, v4, v7}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 225
    .line 226
    const/high16 v13, 0x42200000    # 40.0f

    .line 227
    .line 228
    invoke-virtual {v1, v13}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    const/4 v14, -0x1

    .line 233
    invoke-direct {v4, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x41200000    # 10.0f

    .line 237
    .line 238
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 243
    .line 244
    invoke-virtual {v8, v11, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 245
    .line 246
    .line 247
    new-instance v4, Landroid/widget/ScrollView;

    .line 248
    .line 249
    iget-object v7, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 250
    .line 251
    invoke-direct {v4, v7}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v9}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x41800000    # 16.0f

    .line 264
    .line 265
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    invoke-virtual {v4, v7}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 270
    .line 271
    .line 272
    sget v7, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 273
    .line 274
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    sget v13, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 279
    .line 280
    invoke-virtual {v1, v7, v0, v13, v9}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    .line 286
    .line 287
    move-object v0, v2

    .line 288
    new-instance v2, Landroid/widget/LinearLayout;

    .line 289
    .line 290
    iget-object v7, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 291
    .line 292
    invoke-direct {v2, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 296
    .line 297
    .line 298
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 299
    .line 300
    invoke-direct {v7, v14, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v2, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 304
    .line 305
    .line 306
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 307
    .line 308
    const/high16 v12, 0x42c00000    # 96.0f

    .line 309
    .line 310
    invoke-virtual {v1, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    invoke-direct {v7, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 318
    .line 319
    .line 320
    move-result v13

    .line 321
    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 322
    .line 323
    invoke-virtual {v8, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    new-array v7, v9, [Ljava/lang/Runnable;

    .line 327
    .line 328
    move-object v4, v0

    .line 329
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;

    .line 330
    .line 331
    move-object/from16 v16, v6

    .line 332
    .line 333
    move-object v6, v5

    .line 334
    move-object/from16 v5, v16

    .line 335
    .line 336
    invoke-direct/range {v0 .. v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V

    .line 337
    .line 338
    .line 339
    move-object v2, v0

    .line 340
    move-object v0, v5

    .line 341
    move-object v5, v6

    .line 342
    aput-object v2, v7, v10

    .line 343
    .line 344
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 345
    .line 346
    .line 347
    new-instance v2, Lcom/mr/elaris/InAppSettingsTargetPickerPage$13;

    .line 348
    .line 349
    invoke-direct {v2, v3, v5, v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$13;-><init>(Ljava/util/ArrayList;Ljava/util/List;[Ljava/lang/Runnable;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, Landroid/widget/LinearLayout;

    .line 356
    .line 357
    iget-object v3, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 358
    .line 359
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 363
    .line 364
    .line 365
    const/high16 v3, 0x41000000    # 8.0f

    .line 366
    .line 367
    invoke-virtual {v1, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    invoke-virtual {v2, v10, v3, v10, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 376
    .line 377
    .line 378
    const-string v3, "\u5168\u9009"

    .line 379
    .line 380
    invoke-static {v1, v3}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    const-string v6, "\u6e05\u7a7a"

    .line 385
    .line 386
    invoke-static {v1, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    const-string v11, "\u53cd\u9009"

    .line 391
    .line 392
    invoke-static {v1, v11}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->linkButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    .line 393
    .line 394
    .line 395
    move-result-object v11

    .line 396
    new-instance v13, Lcom/mr/elaris/InAppSettingsTargetPickerPage$14;

    .line 397
    .line 398
    invoke-direct {v13, v4, v5, v0, v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$14;-><init>(Ljava/util/LinkedHashSet;Ljava/util/List;Landroid/widget/TextView;[Ljava/lang/Runnable;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 402
    .line 403
    .line 404
    new-instance v13, Lcom/mr/elaris/InAppSettingsTargetPickerPage$15;

    .line 405
    .line 406
    invoke-direct {v13, v4, v0, v5, v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$15;-><init>(Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    .line 411
    .line 412
    new-instance v13, Lcom/mr/elaris/InAppSettingsTargetPickerPage$16;

    .line 413
    .line 414
    invoke-direct {v13, v5, v4, v0, v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$16;-><init>(Ljava/util/List;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v11, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    new-instance v0, Landroid/widget/LinearLayout;

    .line 433
    .line 434
    iget-object v2, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 435
    .line 436
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 437
    .line 438
    .line 439
    const/16 v2, 0x15

    .line 440
    .line 441
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 442
    .line 443
    .line 444
    const-string v2, "\u53d6\u6d88"

    .line 445
    .line 446
    invoke-virtual {v1, v2, v10}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const-string v3, "\u4fdd\u5b58"

    .line 451
    .line 452
    invoke-virtual {v1, v3, v9}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 457
    .line 458
    invoke-virtual {v1, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    const/high16 v7, 0x42200000    # 40.0f

    .line 463
    .line 464
    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-direct {v3, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 472
    .line 473
    .line 474
    new-instance v3, Landroid/widget/Space;

    .line 475
    .line 476
    iget-object v6, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 477
    .line 478
    invoke-direct {v3, v6}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 479
    .line 480
    .line 481
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 482
    .line 483
    invoke-virtual {v1, v15}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    invoke-direct {v6, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 491
    .line 492
    .line 493
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 494
    .line 495
    invoke-virtual {v1, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    const/high16 v7, 0x42200000    # 40.0f

    .line 500
    .line 501
    invoke-virtual {v1, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    invoke-direct {v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 512
    .line 513
    .line 514
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 515
    .line 516
    iget-object v3, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 517
    .line 518
    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    const/4 v10, 0x0

    .line 526
    const/4 v11, 0x0

    .line 527
    move-object v7, v8

    .line 528
    const/4 v8, 0x0

    .line 529
    const/4 v9, 0x0

    .line 530
    invoke-virtual/range {v6 .. v11}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 531
    .line 532
    .line 533
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$17;

    .line 534
    .line 535
    invoke-direct {v0, v1, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$17;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 539
    .line 540
    .line 541
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$18;

    .line 542
    .line 543
    invoke-direct {v0, v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$18;-><init>(Landroid/app/AlertDialog;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 547
    .line 548
    .line 549
    new-instance v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$19;

    .line 550
    .line 551
    move-object/from16 v3, p1

    .line 552
    .line 553
    move/from16 v7, p4

    .line 554
    .line 555
    move-object v2, v4

    .line 556
    move-object/from16 v4, p2

    .line 557
    .line 558
    invoke-direct/range {v0 .. v7}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$19;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;Landroid/app/AlertDialog;Z)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v6}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V

    .line 568
    .line 569
    .line 570
    return-void
.end method

.method public static toggleTroopSelection(Ljava/util/LinkedHashSet;Lz6;Landroid/widget/TextView;ILjava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p5, p1, Lz6;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    iget-object p1, p1, Lz6;->a:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p5, "\u5df2\u9009\u62e9 "

    .line 21
    .line 22
    invoke-direct {p1, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " / "

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    if-eqz p4, :cond_1

    .line 48
    .line 49
    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public static troopPickRow(Lcom/mr/elaris/InAppSettings;Lz6;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mr/elaris/InAppSettings;",
            "Lz6;",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            "I",
            "Ljava/lang/Runnable;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x41600000    # 14.0f

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x40c00000    # 6.0f

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/high16 v5, 0x41200000    # 10.0f

    .line 30
    .line 31
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0, v2, v4, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    const/high16 v2, 0x42600000    # 56.0f

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p1, Lz6;->a:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p1, Lz6;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Landroid/widget/LinearLayout;

    .line 67
    .line 68
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 69
    .line 70
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 75
    .line 76
    .line 77
    iget-object v6, p1, Lz6;->b:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v6, :cond_0

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_1

    .line 86
    .line 87
    :cond_0
    move-object v6, v3

    .line 88
    :cond_1
    if-eqz v2, :cond_2

    .line 89
    .line 90
    sget v7, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    sget v7, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 94
    .line 95
    :goto_0
    const/16 v8, 0xe

    .line 96
    .line 97
    invoke-virtual {p0, v6, v8, v7, v5}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    sget v7, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 102
    .line 103
    const/16 v8, 0xc

    .line 104
    .line 105
    invoke-virtual {p0, v3, v8, v7, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const/high16 v7, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v3, v1, v7, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 125
    .line 126
    const/4 v6, -0x2

    .line 127
    const/high16 v7, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-direct {v3, v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    .line 134
    .line 135
    if-eqz v2, :cond_3

    .line 136
    .line 137
    const-string v1, "\u2713"

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    const-string v1, ""

    .line 141
    .line 142
    :goto_1
    sget v3, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 143
    .line 144
    invoke-virtual {p0, v1, v8, v3, v5}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const/16 v3, 0x11

    .line 149
    .line 150
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->checkCircleDrawable(Z)Landroid/graphics/drawable/Drawable;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 158
    .line 159
    .line 160
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 161
    .line 162
    const/high16 v3, 0x41c00000    # 24.0f

    .line 163
    .line 164
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-direct {v2, v4, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    new-instance v5, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;

    .line 179
    .line 180
    move-object v7, p1

    .line 181
    move-object v6, p2

    .line 182
    move-object v8, p3

    .line 183
    move v9, p4

    .line 184
    move-object/from16 v10, p5

    .line 185
    .line 186
    invoke-direct/range {v5 .. v10}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;-><init>(Ljava/util/LinkedHashSet;Lz6;Landroid/widget/TextView;ILjava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    .line 191
    .line 192
    return-object v0
.end method

.method private static updatePickerListHeight(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x42600000    # 56.0f

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    mul-int/2addr p2, v1

    .line 25
    add-int/2addr p2, v0

    .line 26
    const/high16 v0, 0x43a50000    # 330.0f

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    iget v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 43
    .line 44
    if-eq v0, p0, :cond_1

    .line 45
    .line 46
    iput p0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method
