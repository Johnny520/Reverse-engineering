.class public final Lxhss/ᲇᲈᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Landroid/view/ViewParent;

.field public final ᛳᲁᲇᛸ:Landroidx/core/widget/NestedScrollView;

.field public ᛷᛴᛷᛱ:[I

.field public ᛷᛵᛵᲈ:Landroid/view/ViewParent;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᲈᛶᛸ;->ᛳᲁᲇᛸ:Landroidx/core/widget/NestedScrollView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(IIII[II[I)Z
    .locals 12

    .line 1
    move/from16 v6, p4

    .line 2
    .line 3
    move-object/from16 v7, p5

    .line 4
    .line 5
    move/from16 v0, p6

    .line 6
    .line 7
    iget-boolean v1, p0, Lxhss/ᲇᲈᛶᛸ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    if-eqz v1, :cond_a

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lxhss/ᲇᲈᛶᛸ;->ᛳᲁᲇᛸ(I)Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    const/4 v9, 0x1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    if-nez p2, :cond_2

    .line 24
    .line 25
    if-nez p3, :cond_2

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-eqz v7, :cond_a

    .line 31
    .line 32
    aput v8, v7, v8

    .line 33
    .line 34
    aput v8, v7, v9

    .line 35
    .line 36
    return v8

    .line 37
    :cond_2
    :goto_0
    iget-object v2, p0, Lxhss/ᲇᲈᛶᛸ;->ᛳᲁᲇᛸ:Landroidx/core/widget/NestedScrollView;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    invoke-virtual {v2, v7}, Landroid/view/View;->getLocationInWindow([I)V

    .line 42
    .line 43
    .line 44
    aget v3, v7, v8

    .line 45
    .line 46
    aget v4, v7, v9

    .line 47
    .line 48
    move v10, v3

    .line 49
    move v11, v4

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move v10, v8

    .line 52
    move v11, v10

    .line 53
    :goto_1
    if-nez p7, :cond_5

    .line 54
    .line 55
    iget-object v3, p0, Lxhss/ᲇᲈᛶᛸ;->ᛷᛴᛷᛱ:[I

    .line 56
    .line 57
    if-nez v3, :cond_4

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    new-array v3, v3, [I

    .line 61
    .line 62
    iput-object v3, p0, Lxhss/ᲇᲈᛶᛸ;->ᛷᛴᛷᛱ:[I

    .line 63
    .line 64
    :cond_4
    aput v8, v3, v8

    .line 65
    .line 66
    aput v8, v3, v9

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    move-object/from16 v3, p7

    .line 70
    .line 71
    :goto_2
    instance-of p0, v1, Landroidx/core/widget/NestedScrollView;

    .line 72
    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 76
    .line 77
    invoke-virtual {v1, v6, v0, v3}, Landroidx/core/widget/NestedScrollView;->ᲀᲇᛳᲁ(II[I)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_6
    aget p0, v3, v8

    .line 82
    .line 83
    add-int/2addr p0, p3

    .line 84
    aput p0, v3, v8

    .line 85
    .line 86
    aget p0, v3, v9

    .line 87
    .line 88
    add-int/2addr p0, v6

    .line 89
    aput p0, v3, v9

    .line 90
    .line 91
    instance-of p0, v1, Landroidx/core/widget/NestedScrollView;

    .line 92
    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    invoke-virtual {v1, v6, v0, p0}, Landroidx/core/widget/NestedScrollView;->ᲀᲇᛳᲁ(II[I)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    if-nez v0, :cond_8

    .line 103
    .line 104
    move v3, p1

    .line 105
    move v4, p2

    .line 106
    move v5, p3

    .line 107
    :try_start_0
    invoke-interface/range {v1 .. v6}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catch_0
    move-exception v0

    .line 112
    move-object p0, v0

    .line 113
    new-instance p1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string p2, "ViewParent "

    .line 116
    .line 117
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p2, " does not implement interface method onNestedScroll"

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    const-string p2, "ViewParentCompat"

    .line 133
    .line 134
    invoke-static {p2, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 135
    .line 136
    .line 137
    :cond_8
    :goto_3
    if-eqz v7, :cond_9

    .line 138
    .line 139
    invoke-virtual {v2, v7}, Landroid/view/View;->getLocationInWindow([I)V

    .line 140
    .line 141
    .line 142
    aget p0, v7, v8

    .line 143
    .line 144
    sub-int/2addr p0, v10

    .line 145
    aput p0, v7, v8

    .line 146
    .line 147
    aget p0, v7, v9

    .line 148
    .line 149
    sub-int/2addr p0, v11

    .line 150
    aput p0, v7, v9

    .line 151
    .line 152
    :cond_9
    return v9

    .line 153
    :cond_a
    :goto_4
    return v8
.end method

.method public final ᛳᲁᲇᛸ(I)Landroid/view/ViewParent;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object p0, p0, Lxhss/ᲇᲈᛶᛸ;->ᛱᛱᛲᲇ:Landroid/view/ViewParent;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    iget-object p0, p0, Lxhss/ᲇᲈᛶᛸ;->ᛷᛵᛵᲈ:Landroid/view/ViewParent;

    .line 12
    .line 13
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(III[I[I)Z
    .locals 12

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    iget-boolean v1, p0, Lxhss/ᲇᲈᛶᛸ;->ᲇᛴᲇᛵ:Z

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    if-eqz v1, :cond_a

    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lxhss/ᲇᲈᛶᛸ;->ᛳᲁᲇᛸ(I)Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    const/4 v8, 0x1

    .line 17
    if-nez p1, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-eqz v6, :cond_a

    .line 23
    .line 24
    aput v7, v6, v7

    .line 25
    .line 26
    aput v7, v6, v8

    .line 27
    .line 28
    return v7

    .line 29
    :cond_2
    :goto_0
    iget-object v9, p0, Lxhss/ᲇᲈᛶᛸ;->ᛳᲁᲇᛸ:Landroidx/core/widget/NestedScrollView;

    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    invoke-virtual {v9, v6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 34
    .line 35
    .line 36
    aget v2, v6, v7

    .line 37
    .line 38
    aget v4, v6, v8

    .line 39
    .line 40
    move v10, v2

    .line 41
    move v11, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    move v10, v7

    .line 44
    move v11, v10

    .line 45
    :goto_1
    if-nez p4, :cond_5

    .line 46
    .line 47
    iget-object v2, p0, Lxhss/ᲇᲈᛶᛸ;->ᛷᛴᛷᛱ:[I

    .line 48
    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    new-array v2, v2, [I

    .line 53
    .line 54
    iput-object v2, p0, Lxhss/ᲇᲈᛶᛸ;->ᛷᛴᛷᛱ:[I

    .line 55
    .line 56
    :cond_4
    move-object v4, v2

    .line 57
    goto :goto_2

    .line 58
    :cond_5
    move-object/from16 v4, p4

    .line 59
    .line 60
    :goto_2
    aput v7, v4, v7

    .line 61
    .line 62
    aput v7, v4, v8

    .line 63
    .line 64
    instance-of v0, v1, Landroidx/core/widget/NestedScrollView;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    iget-object v0, v1, Landroidx/core/widget/NestedScrollView;->ᛲᛴᲀᲈ:Lxhss/ᲇᲈᛶᛸ;

    .line 72
    .line 73
    move v1, p1

    .line 74
    move v2, p2

    .line 75
    move v3, p3

    .line 76
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲇᲈᛶᛸ;->ᛷᛵᛵᲈ(III[I[I)Z

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    if-nez p3, :cond_7

    .line 81
    .line 82
    :try_start_0
    invoke-interface {v1, v9, p1, p2, v4}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_0
    move-exception v0

    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v3, "ViewParent "

    .line 90
    .line 91
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, " does not implement interface method onNestedPreScroll"

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-string v2, "ViewParentCompat"

    .line 107
    .line 108
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_3
    if-eqz v6, :cond_8

    .line 112
    .line 113
    invoke-virtual {v9, v6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 114
    .line 115
    .line 116
    aget v0, v6, v7

    .line 117
    .line 118
    sub-int/2addr v0, v10

    .line 119
    aput v0, v6, v7

    .line 120
    .line 121
    aget v0, v6, v8

    .line 122
    .line 123
    sub-int/2addr v0, v11

    .line 124
    aput v0, v6, v8

    .line 125
    .line 126
    :cond_8
    aget v0, v4, v7

    .line 127
    .line 128
    if-nez v0, :cond_9

    .line 129
    .line 130
    aget v0, v4, v8

    .line 131
    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    :cond_9
    move v7, v8

    .line 135
    :cond_a
    :goto_4
    return v7
.end method
