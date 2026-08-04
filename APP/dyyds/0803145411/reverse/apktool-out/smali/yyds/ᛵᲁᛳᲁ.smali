.class public final Lyyds/ᛵᲁᛳᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛳᲀᲇ;
.implements Lyyds/ᛱᲁᛱᲁ;
.implements Lyyds/ᲇᛲᛸᛶ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲁᛲᲀᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲁᛲᲀᛷ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛵᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᲁᛳᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛲᲀᛷ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public ᛵᛸᛸᛷ(Lyyds/ᛴᛴᛵᛸ;Z)V
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛵᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛵᲁᛳᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛲᲀᛷ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lyyds/ᛴᛴᛵᛸ;->ᛷᛲᲈᛱ()Lyyds/ᛴᛴᛵᛸ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, p1, :cond_0

    .line 15
    .line 16
    move v3, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v1

    .line 19
    :goto_0
    if-eqz v3, :cond_1

    .line 20
    .line 21
    move-object p1, v0

    .line 22
    :cond_1
    iget-object v4, p0, Lyyds/ᲁᛲᲀᛷ;->ᛶᲀᲈᲇ:[Lyyds/ᛱᛷᲈᛳ;

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v5, v1

    .line 29
    :goto_1
    if-ge v1, v5, :cond_4

    .line 30
    .line 31
    aget-object v6, v4, v1

    .line 32
    .line 33
    if-eqz v6, :cond_3

    .line 34
    .line 35
    iget-object v7, v6, Lyyds/ᛱᛷᲈᛳ;->ᛱᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

    .line 36
    .line 37
    if-ne v7, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v6, 0x0

    .line 44
    :goto_2
    if-eqz v6, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v6, Lyyds/ᛱᛷᲈᛳ;->ᛲᲈᲁ:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, v6, v0}, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ(ILyyds/ᛱᛷᲈᛳ;Lyyds/ᛴᛴᛵᛸ;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v6, v2}, Lyyds/ᲁᛲᲀᛷ;->ᛳᲁᲁᲇ(Lyyds/ᛱᛷᲈᛳ;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {p0, v6, p2}, Lyyds/ᲁᛲᲀᛷ;->ᛳᲁᲁᲇ(Lyyds/ᛱᛷᲈᛳ;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    invoke-virtual {p0, p1}, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᲇ(Lyyds/ᛴᛴᛵᛸ;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ᲀᛲᛳᲀ(Lyyds/ᛴᛴᛵᛸ;)Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛵᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x6c

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛵᲁᛳᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛲᲀᛷ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lyyds/ᛴᛴᛵᛸ;->ᛷᛲᲈᛱ()Lyyds/ᛴᛴᛵᛸ;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛷᲇᛲᛱ:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᲇ:Landroid/view/Window;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-boolean p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛱᲀᲈᛲ:Z

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    return v1

    .line 37
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᲇ:Landroid/view/Window;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    invoke-interface {p0, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    return v1

    .line 49
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲈᛶᲈᛴ;)Lyyds/ᲈᛶᲈᛴ;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v3, v2, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 6
    .line 7
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v4, v0, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 12
    .line 13
    move-object/from16 v0, p0

    .line 14
    .line 15
    iget-object v5, v0, Lyyds/ᛵᲁᛳᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛲᲀᛷ;

    .line 16
    .line 17
    iget-object v6, v5, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v7, v0, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 24
    .line 25
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 26
    .line 27
    const/16 v8, 0x8

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    if-eqz v0, :cond_f

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 37
    .line 38
    if-eqz v0, :cond_f

    .line 39
    .line 40
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v10, v0

    .line 47
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    .line 49
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_c

    .line 56
    .line 57
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛷᲈᛳᛲ:Landroid/graphics/Rect;

    .line 58
    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    new-instance v0, Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛷᲈᛳᛲ:Landroid/graphics/Rect;

    .line 67
    .line 68
    new-instance v0, Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲈᛳ:Landroid/graphics/Rect;

    .line 74
    .line 75
    :cond_0
    iget-object v12, v5, Lyyds/ᲁᛲᲀᛷ;->ᛷᲈᛳᛲ:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲈᛳ:Landroid/graphics/Rect;

    .line 78
    .line 79
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    iget v13, v13, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 84
    .line 85
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    iget v14, v14, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 90
    .line 91
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    iget v15, v15, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 96
    .line 97
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    iget v11, v11, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 102
    .line 103
    invoke-virtual {v12, v13, v14, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 104
    .line 105
    .line 106
    iget-object v11, v5, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ:Landroid/view/ViewGroup;

    .line 107
    .line 108
    sget-object v13, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 109
    .line 110
    if-eqz v13, :cond_1

    .line 111
    .line 112
    :try_start_0
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v13, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    const-string v11, "ViewUtils"

    .line 122
    .line 123
    const-string v13, "Could not invoke computeFitSystemWindows"

    .line 124
    .line 125
    invoke-static {v11, v13, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 126
    .line 127
    .line 128
    :cond_1
    :goto_0
    iget v0, v12, Landroid/graphics/Rect;->top:I

    .line 129
    .line 130
    iget v11, v12, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    iget v12, v12, Landroid/graphics/Rect;->right:I

    .line 133
    .line 134
    iget-object v13, v5, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ:Landroid/view/ViewGroup;

    .line 135
    .line 136
    sget-object v14, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 137
    .line 138
    invoke-static {v13}, Lyyds/ᛸᛸᲈᛵ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᲈᛶᲈᛴ;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    if-nez v13, :cond_2

    .line 143
    .line 144
    move v14, v9

    .line 145
    goto :goto_1

    .line 146
    :cond_2
    iget-object v14, v13, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 147
    .line 148
    invoke-virtual {v14}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    iget v14, v14, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 153
    .line 154
    :goto_1
    if-nez v13, :cond_3

    .line 155
    .line 156
    move v13, v9

    .line 157
    goto :goto_2

    .line 158
    :cond_3
    iget-object v13, v13, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 159
    .line 160
    invoke-virtual {v13}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    iget v13, v13, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 165
    .line 166
    :goto_2
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 167
    .line 168
    if-ne v15, v0, :cond_5

    .line 169
    .line 170
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 171
    .line 172
    if-ne v15, v11, :cond_5

    .line 173
    .line 174
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 175
    .line 176
    if-eq v15, v12, :cond_4

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_4
    move v11, v9

    .line 180
    goto :goto_4

    .line 181
    :cond_5
    :goto_3
    iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 182
    .line 183
    iput v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 184
    .line 185
    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 186
    .line 187
    const/4 v11, 0x1

    .line 188
    :goto_4
    if-lez v0, :cond_6

    .line 189
    .line 190
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 191
    .line 192
    if-nez v0, :cond_6

    .line 193
    .line 194
    new-instance v0, Landroid/view/View;

    .line 195
    .line 196
    invoke-direct {v0, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 197
    .line 198
    .line 199
    iput-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 200
    .line 201
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 205
    .line 206
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 207
    .line 208
    const/16 v15, 0x33

    .line 209
    .line 210
    const/4 v8, -0x1

    .line 211
    invoke-direct {v0, v8, v12, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 212
    .line 213
    .line 214
    iput v14, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 215
    .line 216
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 217
    .line 218
    iget-object v12, v5, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ:Landroid/view/ViewGroup;

    .line 219
    .line 220
    iget-object v13, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 221
    .line 222
    invoke-virtual {v12, v13, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_6
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 235
    .line 236
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 237
    .line 238
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 239
    .line 240
    if-ne v8, v12, :cond_7

    .line 241
    .line 242
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 243
    .line 244
    if-ne v8, v14, :cond_7

    .line 245
    .line 246
    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 247
    .line 248
    if-eq v8, v13, :cond_8

    .line 249
    .line 250
    :cond_7
    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 251
    .line 252
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 253
    .line 254
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 255
    .line 256
    iget-object v8, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 257
    .line 258
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    :goto_5
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 262
    .line 263
    if-eqz v0, :cond_9

    .line 264
    .line 265
    const/4 v8, 0x1

    .line 266
    goto :goto_6

    .line 267
    :cond_9
    move v8, v9

    .line 268
    :goto_6
    if-eqz v8, :cond_b

    .line 269
    .line 270
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_b

    .line 275
    .line 276
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    and-int/lit16 v12, v12, 0x2000

    .line 283
    .line 284
    if-eqz v12, :cond_a

    .line 285
    .line 286
    const v12, 0x66060006

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v12}, Landroid/content/Context;->getColor(I)I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    goto :goto_7

    .line 294
    :cond_a
    const v12, 0x66060005

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v12}, Landroid/content/Context;->getColor(I)I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    :goto_7
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 302
    .line 303
    .line 304
    :cond_b
    iget-boolean v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛲᛱᲁᛳ:Z

    .line 305
    .line 306
    if-nez v0, :cond_e

    .line 307
    .line 308
    if-eqz v8, :cond_e

    .line 309
    .line 310
    move v7, v9

    .line 311
    goto :goto_8

    .line 312
    :cond_c
    iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 313
    .line 314
    if-eqz v0, :cond_d

    .line 315
    .line 316
    iput v9, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 317
    .line 318
    move v8, v9

    .line 319
    const/4 v11, 0x1

    .line 320
    goto :goto_8

    .line 321
    :cond_d
    move v8, v9

    .line 322
    move v11, v8

    .line 323
    :cond_e
    :goto_8
    if-eqz v11, :cond_10

    .line 324
    .line 325
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 326
    .line 327
    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 328
    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_f
    move v8, v9

    .line 332
    :cond_10
    :goto_9
    iget-object v0, v5, Lyyds/ᲁᛲᲀᛷ;->ᲀᛲᛱᛱ:Landroid/view/View;

    .line 333
    .line 334
    if-eqz v0, :cond_12

    .line 335
    .line 336
    if-eqz v8, :cond_11

    .line 337
    .line 338
    move v8, v9

    .line 339
    goto :goto_a

    .line 340
    :cond_11
    const/16 v8, 0x8

    .line 341
    .line 342
    :goto_a
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 343
    .line 344
    .line 345
    :cond_12
    if-eq v4, v7, :cond_17

    .line 346
    .line 347
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget v0, v0, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 352
    .line 353
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    iget v4, v4, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 358
    .line 359
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    iget v3, v3, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 364
    .line 365
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 366
    .line 367
    const/16 v6, 0x24

    .line 368
    .line 369
    if-lt v5, v6, :cond_13

    .line 370
    .line 371
    new-instance v5, Lyyds/ᛵᲀᲈᲁ;

    .line 372
    .line 373
    invoke-direct {v5, v2}, Lyyds/ᛵᲀᲈᲁ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 374
    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_13
    const/16 v6, 0x23

    .line 378
    .line 379
    if-lt v5, v6, :cond_14

    .line 380
    .line 381
    new-instance v5, Lyyds/ᛶᲇᲈᲇ;

    .line 382
    .line 383
    invoke-direct {v5, v2}, Lyyds/ᛶᲇᲈᲇ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 384
    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_14
    const/16 v6, 0x22

    .line 388
    .line 389
    if-lt v5, v6, :cond_15

    .line 390
    .line 391
    new-instance v5, Lyyds/ᛴᛵ;

    .line 392
    .line 393
    invoke-direct {v5, v2}, Lyyds/ᛴᛵ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 394
    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_15
    const/16 v6, 0x1f

    .line 398
    .line 399
    if-lt v5, v6, :cond_16

    .line 400
    .line 401
    new-instance v5, Lyyds/ᛶᛴ;

    .line 402
    .line 403
    invoke-direct {v5, v2}, Lyyds/ᛶᛴ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 404
    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_16
    new-instance v5, Lyyds/ᛶᛷᛱ;

    .line 408
    .line 409
    invoke-direct {v5, v2}, Lyyds/ᛶᛷᛱ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 410
    .line 411
    .line 412
    :goto_b
    invoke-static {v0, v7, v4, v3}, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ(IIII)Lyyds/ᛸᲀᲁᛲ;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v5, v0}, Lyyds/ᛴᛳᛷᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛸᲀᲁᛲ;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5}, Lyyds/ᛴᛳᛷᛶ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    goto :goto_c

    .line 424
    :cond_17
    move-object v0, v2

    .line 425
    :goto_c
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 426
    .line 427
    invoke-virtual {v0}, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ()Landroid/view/WindowInsets;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-eqz v2, :cond_18

    .line 432
    .line 433
    invoke-virtual {v1, v2}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-nez v2, :cond_18

    .line 442
    .line 443
    invoke-static {v1, v3}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :cond_18
    return-object v0
.end method
