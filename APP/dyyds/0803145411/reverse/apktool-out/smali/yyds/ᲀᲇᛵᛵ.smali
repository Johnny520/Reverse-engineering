.class public final Lyyds/ᲀᲇᛵᛵ;
.super Lyyds/ᛸᲀᛷᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Landroid/content/Context;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛴᲁᛱᲇ;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public constructor <init>(ILandroid/content/Context;Lyyds/ᛴᲁᛱᲇ;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲀᲇᛵᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲀᲇᛵᛵ;->ᛱᲈᲁ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᲀᲇᛵᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲁᛱᲇ;

    .line 6
    .line 7
    const p1, 0x660c0045

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lyyds/ᛸᲀᛷᲀ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final ᛱᲈᲁ(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    iget v0, p1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget p2, p2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    iget p3, p3, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    iget p4, p4, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    invoke-static {v0, p2, p3, p4}, Landroid/graphics/Color;->argb(IIII)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iput p2, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-static {p2, p3}, Lyyds/ᛷᲇᛳᲈ;->ᛵᛸᛸᛷ(IZ)Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p5, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    iget p1, p1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 24
    .line 25
    const/16 p2, 0xff

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    const-wide p1, -0xd55fe68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const p2, 0xffffff

    .line 40
    .line 41
    .line 42
    iget p0, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 43
    .line 44
    and-int/2addr p0, p2

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-wide p4, -0xd565e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {p0, p3, p1, p4, p5}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛲᲈᲈ([Ljava/lang/Object;ILjava/lang/String;J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const-wide p1, -0xd571e68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget p0, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 73
    .line 74
    int-to-long p4, p0

    .line 75
    const-wide v0, 0xffffffffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr p4, v0

    .line 81
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-wide p4, -0xd577e68a836eL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {p0, p3, p1, p4, p5}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛲᲈᲈ([Ljava/lang/Object;ILjava/lang/String;J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :goto_0
    invoke-virtual {p6, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final ᛶᛷᛲᲁ(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;Lyyds/ᛱᛷᛸᲈ;Ljava/util/ArrayList;ILandroid/view/View;)V
    .locals 3

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    move-object/from16 v1, p18

    .line 4
    .line 5
    invoke-static/range {p17 .. p17}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iput v2, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    invoke-static/range {p17 .. p17}, Landroid/graphics/Color;->green(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iput v2, p1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    invoke-static/range {p17 .. p17}, Landroid/graphics/Color;->blue(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iput v2, p2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-static/range {p17 .. p17}, Landroid/graphics/Color;->alpha(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, p3, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    iget v2, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    invoke-virtual {p4, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 32
    .line 33
    .line 34
    iget p4, p1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 35
    .line 36
    invoke-virtual {p5, p4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 37
    .line 38
    .line 39
    iget p4, p2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 40
    .line 41
    invoke-virtual {p6, p4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 42
    .line 43
    .line 44
    iget p4, p3, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 45
    .line 46
    invoke-virtual {p7, p4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 47
    .line 48
    .line 49
    iget p4, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 50
    .line 51
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    invoke-virtual {p8, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget p4, p1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 59
    .line 60
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    invoke-virtual {p9, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget p4, p2, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 68
    .line 69
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    invoke-virtual {p10, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget p4, p3, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 77
    .line 78
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-virtual {p11, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    move-object p7, p0

    .line 86
    move-object p8, p1

    .line 87
    move-object p9, p2

    .line 88
    move-object p6, p3

    .line 89
    move-object p5, p12

    .line 90
    move-object/from16 p10, p13

    .line 91
    .line 92
    move-object/from16 p11, p14

    .line 93
    .line 94
    invoke-static/range {p5 .. p11}, Lyyds/ᲀᲇᛵᛵ;->ᛱᲈᲁ(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Landroid/view/View;

    .line 100
    .line 101
    if-eqz p0, :cond_2

    .line 102
    .line 103
    invoke-virtual/range {p16 .. p16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_1

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    move-object p3, p2

    .line 118
    check-cast p3, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-static {p3, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-eqz p3, :cond_0

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    const/4 p2, 0x0

    .line 132
    :goto_0
    check-cast p2, Lkotlin/Pair;

    .line 133
    .line 134
    if-eqz p2, :cond_2

    .line 135
    .line 136
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    const/4 p2, 0x0

    .line 147
    invoke-static {p1, p2}, Lyyds/ᛷᲇᛳᲈ;->ᛵᛸᛸᛷ(IZ)Landroid/graphics/drawable/GradientDrawable;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    const/4 p0, 0x1

    .line 155
    move/from16 p1, p17

    .line 156
    .line 157
    invoke-static {p1, p0}, Lyyds/ᛷᲇᛳᲈ;->ᛵᛸᛸᛷ(IZ)Landroid/graphics/drawable/GradientDrawable;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Lyyds/ᛴᛱᛱᛸ;

    .line 8
    .line 9
    const-wide v2, -0xd456e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v2, -0xd45de68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const v2, 0x66090163

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    const v2, 0x660904c4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v11, v2

    .line 40
    check-cast v11, Landroid/widget/TextView;

    .line 41
    .line 42
    const v2, 0x660903db

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Landroid/widget/SeekBar;

    .line 50
    .line 51
    const v3, 0x660903da

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    move-object v12, v3

    .line 59
    check-cast v12, Landroid/widget/SeekBar;

    .line 60
    .line 61
    const v3, 0x660903d9

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v13, v3

    .line 69
    check-cast v13, Landroid/widget/SeekBar;

    .line 70
    .line 71
    const v3, 0x660903d8

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    move-object v14, v3

    .line 79
    check-cast v14, Landroid/widget/SeekBar;

    .line 80
    .line 81
    const v3, 0x660904db

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    move-object v15, v3

    .line 89
    check-cast v15, Landroid/widget/TextView;

    .line 90
    .line 91
    const v3, 0x660904cf

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Landroid/widget/TextView;

    .line 99
    .line 100
    const v4, 0x660904ba

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Landroid/widget/TextView;

    .line 108
    .line 109
    const v5, 0x660904b8

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Landroid/widget/TextView;

    .line 117
    .line 118
    const v6, 0x66090161

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Landroid/widget/GridLayout;

    .line 126
    .line 127
    const v7, 0x6609038d

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    check-cast v7, Landroid/widget/GridLayout;

    .line 135
    .line 136
    const v8, 0x660904da

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Landroid/widget/TextView;

    .line 144
    .line 145
    new-instance v8, Lyyds/ᛴᲁᛱᲇ;

    .line 146
    .line 147
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    iget v9, v0, Lyyds/ᲀᲇᛵᛵ;->ᛶᛷᛲᲁ:I

    .line 151
    .line 152
    move-object/from16 p1, v6

    .line 153
    .line 154
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    iput v6, v8, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 159
    .line 160
    new-instance v6, Lyyds/ᛴᲁᛱᲇ;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    move-object/from16 v16, v7

    .line 166
    .line 167
    invoke-static {v9}, Landroid/graphics/Color;->green(I)I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    iput v7, v6, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 172
    .line 173
    new-instance v7, Lyyds/ᛴᲁᛱᲇ;

    .line 174
    .line 175
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    move/from16 v17, v9

    .line 179
    .line 180
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->blue(I)I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    iput v9, v7, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 185
    .line 186
    new-instance v9, Lyyds/ᛴᲁᛱᲇ;

    .line 187
    .line 188
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    move-object/from16 v19, v10

    .line 192
    .line 193
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->alpha(I)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    iput v10, v9, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 198
    .line 199
    new-instance v22, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    new-instance v21, Lyyds/ᛱᛷᛸᲈ;

    .line 205
    .line 206
    invoke-direct/range {v21 .. v21}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    iget v10, v8, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 210
    .line 211
    invoke-virtual {v2, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 212
    .line 213
    .line 214
    iget v10, v6, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 215
    .line 216
    invoke-virtual {v12, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 217
    .line 218
    .line 219
    iget v10, v7, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 220
    .line 221
    invoke-virtual {v13, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 222
    .line 223
    .line 224
    iget v10, v9, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 225
    .line 226
    invoke-virtual {v14, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 227
    .line 228
    .line 229
    iget v10, v8, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 230
    .line 231
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    iget v10, v6, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 239
    .line 240
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    iget v10, v7, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 248
    .line 249
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    iget v10, v9, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 257
    .line 258
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    move-object v10, v3

    .line 266
    iget-object v3, v0, Lyyds/ᲀᲇᛵᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲁᛱᲇ;

    .line 267
    .line 268
    move-object/from16 v17, v11

    .line 269
    .line 270
    move-object/from16 v11, p1

    .line 271
    .line 272
    move-object/from16 p1, v2

    .line 273
    .line 274
    move-object/from16 v2, v16

    .line 275
    .line 276
    move-object/from16 v16, v4

    .line 277
    .line 278
    move-object v4, v9

    .line 279
    move-object/from16 v9, v17

    .line 280
    .line 281
    move-object/from16 v17, v5

    .line 282
    .line 283
    move-object v5, v8

    .line 284
    move-object/from16 v8, v19

    .line 285
    .line 286
    invoke-static/range {v3 .. v9}, Lyyds/ᲀᲇᛵᛵ;->ᛱᲈᲁ(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v18, v3

    .line 290
    .line 291
    move-object/from16 v20, v9

    .line 292
    .line 293
    move-object v9, v7

    .line 294
    move-object v7, v6

    .line 295
    move-object v6, v5

    .line 296
    iget-object v0, v0, Lyyds/ᲀᲇᛵᛵ;->ᛱᲈᲁ:Landroid/content/Context;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 307
    .line 308
    const/high16 v5, 0x42000000    # 32.0f

    .line 309
    .line 310
    mul-float/2addr v5, v3

    .line 311
    float-to-int v5, v5

    .line 312
    const/high16 v8, 0x40400000    # 3.0f

    .line 313
    .line 314
    mul-float/2addr v8, v3

    .line 315
    float-to-int v3, v8

    .line 316
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 325
    .line 326
    sub-int/2addr v8, v5

    .line 327
    div-int/lit8 v8, v8, 0x8

    .line 328
    .line 329
    mul-int/lit8 v5, v3, 0x2

    .line 330
    .line 331
    sub-int v5, v8, v5

    .line 332
    .line 333
    invoke-static {}, Lyyds/ᛷᲇᛳᲈ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v23

    .line 341
    move-object/from16 p2, v4

    .line 342
    .line 343
    const/4 v4, 0x0

    .line 344
    if-eqz v23, :cond_0

    .line 345
    .line 346
    move/from16 v27, v3

    .line 347
    .line 348
    move-object v2, v14

    .line 349
    :goto_0
    move v1, v4

    .line 350
    move/from16 v28, v5

    .line 351
    .line 352
    move-object/from16 v26, v11

    .line 353
    .line 354
    move-object v5, v15

    .line 355
    move-object/from16 v11, v20

    .line 356
    .line 357
    move-object/from16 v4, p2

    .line 358
    .line 359
    move-object v14, v12

    .line 360
    move-object v15, v13

    .line 361
    move-object/from16 v12, v18

    .line 362
    .line 363
    move-object/from16 v13, p1

    .line 364
    .line 365
    move-object/from16 v18, v17

    .line 366
    .line 367
    move-object/from16 v17, v16

    .line 368
    .line 369
    move-object/from16 v16, v10

    .line 370
    .line 371
    goto/16 :goto_2

    .line 372
    .line 373
    :cond_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    if-eqz v8, :cond_1

    .line 391
    .line 392
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    check-cast v8, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    new-instance v4, Landroid/view/View;

    .line 403
    .line 404
    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v24, v1

    .line 408
    .line 409
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 410
    .line 411
    invoke-direct {v1, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    move/from16 v23, v3

    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    invoke-static {v8, v1}, Lyyds/ᛷᲇᛳᲈ;->ᛵᛸᛸᛷ(IZ)Landroid/graphics/drawable/GradientDrawable;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 428
    .line 429
    .line 430
    new-instance v3, Lyyds/ᛵᛴᛳᛶ;

    .line 431
    .line 432
    move/from16 v25, v23

    .line 433
    .line 434
    const/16 v23, 0x1

    .line 435
    .line 436
    move/from16 v28, v5

    .line 437
    .line 438
    move-object/from16 v26, v11

    .line 439
    .line 440
    move-object v11, v12

    .line 441
    move-object v12, v13

    .line 442
    move-object v13, v14

    .line 443
    move-object v14, v15

    .line 444
    move/from16 v27, v25

    .line 445
    .line 446
    move-object v5, v4

    .line 447
    move v4, v8

    .line 448
    move-object v8, v9

    .line 449
    move-object v15, v10

    .line 450
    move-object/from16 v10, p1

    .line 451
    .line 452
    move-object/from16 v9, p2

    .line 453
    .line 454
    invoke-direct/range {v3 .. v23}, Lyyds/ᛵᛴᛳᛶ;-><init>(ILandroid/view/View;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;Lyyds/ᛱᛷᛸᲈ;Ljava/util/ArrayList;I)V

    .line 455
    .line 456
    .line 457
    move-object v4, v10

    .line 458
    move-object v10, v3

    .line 459
    move-object v3, v13

    .line 460
    move-object v13, v4

    .line 461
    move-object v4, v15

    .line 462
    move-object v15, v12

    .line 463
    move-object/from16 v12, v18

    .line 464
    .line 465
    move-object/from16 v18, v17

    .line 466
    .line 467
    move-object/from16 v17, v16

    .line 468
    .line 469
    move-object/from16 v16, v4

    .line 470
    .line 471
    move-object v4, v9

    .line 472
    move-object v9, v8

    .line 473
    move-object v8, v5

    .line 474
    move-object v5, v14

    .line 475
    move-object v14, v11

    .line 476
    move-object/from16 v11, v20

    .line 477
    .line 478
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 482
    .line 483
    .line 484
    move-object/from16 p2, v4

    .line 485
    .line 486
    move-object/from16 p1, v13

    .line 487
    .line 488
    move-object v13, v15

    .line 489
    move-object/from16 v10, v16

    .line 490
    .line 491
    move-object/from16 v16, v17

    .line 492
    .line 493
    move-object/from16 v17, v18

    .line 494
    .line 495
    move-object/from16 v11, v26

    .line 496
    .line 497
    move v4, v1

    .line 498
    move-object v15, v5

    .line 499
    move-object/from16 v18, v12

    .line 500
    .line 501
    move-object v12, v14

    .line 502
    move-object/from16 v1, v24

    .line 503
    .line 504
    move/from16 v5, v28

    .line 505
    .line 506
    move-object v14, v3

    .line 507
    move/from16 v3, v27

    .line 508
    .line 509
    goto :goto_1

    .line 510
    :cond_1
    move/from16 v27, v3

    .line 511
    .line 512
    move-object v3, v14

    .line 513
    move-object v2, v3

    .line 514
    goto/16 :goto_0

    .line 515
    .line 516
    :goto_2
    new-instance v3, Lyyds/ᲀᛴᛲᛱ;

    .line 517
    .line 518
    move-object v8, v6

    .line 519
    move-object v6, v12

    .line 520
    const/4 v12, 0x0

    .line 521
    move-object v10, v7

    .line 522
    move-object v7, v4

    .line 523
    move-object v4, v8

    .line 524
    move-object v8, v10

    .line 525
    move-object/from16 v24, v0

    .line 526
    .line 527
    move-object/from16 v10, v19

    .line 528
    .line 529
    move-object/from16 v0, v21

    .line 530
    .line 531
    move-object/from16 v29, v22

    .line 532
    .line 533
    invoke-direct/range {v3 .. v12}, Lyyds/ᲀᛴᛲᛱ;-><init>(Lyyds/ᛴᲁᛱᲇ;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;I)V

    .line 534
    .line 535
    .line 536
    move-object/from16 v20, v5

    .line 537
    .line 538
    move-object v12, v6

    .line 539
    move-object v6, v4

    .line 540
    move-object v4, v7

    .line 541
    move-object v7, v8

    .line 542
    new-instance v5, Lyyds/ᲁᛱᲈᲇ;

    .line 543
    .line 544
    invoke-direct {v5, v0, v1, v3}, Lyyds/ᲁᛱᲈᲇ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v13, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 548
    .line 549
    .line 550
    new-instance v3, Lyyds/ᲀᛴᛲᛱ;

    .line 551
    .line 552
    move-object v8, v6

    .line 553
    move-object v6, v12

    .line 554
    const/4 v12, 0x1

    .line 555
    move-object v5, v7

    .line 556
    move-object v7, v4

    .line 557
    move-object v4, v5

    .line 558
    move-object/from16 v5, v16

    .line 559
    .line 560
    invoke-direct/range {v3 .. v12}, Lyyds/ᲀᛴᛲᛱ;-><init>(Lyyds/ᛴᲁᛱᲇ;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;I)V

    .line 561
    .line 562
    .line 563
    move-object v12, v7

    .line 564
    move-object v7, v4

    .line 565
    move-object v4, v12

    .line 566
    move-object v12, v6

    .line 567
    move-object v6, v8

    .line 568
    new-instance v5, Lyyds/ᲁᛱᲈᲇ;

    .line 569
    .line 570
    invoke-direct {v5, v0, v1, v3}, Lyyds/ᲁᛱᲈᲇ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v14, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 574
    .line 575
    .line 576
    new-instance v3, Lyyds/ᲀᛴᛲᛱ;

    .line 577
    .line 578
    move-object v6, v12

    .line 579
    const/4 v12, 0x2

    .line 580
    move-object v5, v7

    .line 581
    move-object v7, v4

    .line 582
    move-object v4, v9

    .line 583
    move-object v9, v5

    .line 584
    move-object/from16 v5, v17

    .line 585
    .line 586
    invoke-direct/range {v3 .. v12}, Lyyds/ᲀᛴᛲᛱ;-><init>(Lyyds/ᛴᲁᛱᲇ;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;I)V

    .line 587
    .line 588
    .line 589
    move-object v12, v9

    .line 590
    move-object v9, v4

    .line 591
    move-object v4, v7

    .line 592
    move-object v7, v12

    .line 593
    move-object v12, v6

    .line 594
    move-object v6, v8

    .line 595
    new-instance v5, Lyyds/ᲁᛱᲈᲇ;

    .line 596
    .line 597
    invoke-direct {v5, v0, v1, v3}, Lyyds/ᲁᛱᲈᲇ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v15, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 601
    .line 602
    .line 603
    new-instance v3, Lyyds/ᲀᛴᛲᛱ;

    .line 604
    .line 605
    move-object v6, v12

    .line 606
    const/4 v12, 0x3

    .line 607
    move-object v5, v8

    .line 608
    move-object v8, v7

    .line 609
    move-object v7, v5

    .line 610
    move-object/from16 v5, v18

    .line 611
    .line 612
    invoke-direct/range {v3 .. v12}, Lyyds/ᲀᛴᛲᛱ;-><init>(Lyyds/ᛴᲁᛱᲇ;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;I)V

    .line 613
    .line 614
    .line 615
    move-object v12, v6

    .line 616
    move-object v6, v7

    .line 617
    move-object v7, v8

    .line 618
    new-instance v5, Lyyds/ᲁᛱᲈᲇ;

    .line 619
    .line 620
    invoke-direct {v5, v0, v1, v3}, Lyyds/ᲁᛱᲈᲇ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 624
    .line 625
    .line 626
    const-wide v21, -0xd45fe68a836eL

    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v30

    .line 635
    const-wide v21, -0xd467e68a836eL

    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v31

    .line 644
    const-wide v21, -0xd46fe68a836eL

    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v32

    .line 653
    const-wide v21, -0xd477e68a836eL

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v33

    .line 662
    const-wide v21, -0xd47fe68a836eL

    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v34

    .line 671
    const-wide v21, -0xd487e68a836eL

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v35

    .line 680
    const-wide v21, -0xd48fe68a836eL

    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v36

    .line 689
    const-wide v21, -0xd497e68a836eL

    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v37

    .line 698
    const-wide v21, -0xd49fe68a836eL

    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v38

    .line 707
    const-wide v21, -0xd4a7e68a836eL

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v39

    .line 716
    const-wide v21, -0xd4afe68a836eL

    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v40

    .line 725
    const-wide v21, -0xd4b7e68a836eL

    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v41

    .line 734
    const-wide v21, -0xd4bfe68a836eL

    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v42

    .line 743
    const-wide v21, -0xd4c7e68a836eL

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v43

    .line 752
    const-wide v21, -0xd4cfe68a836eL

    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v44

    .line 761
    const-wide v21, -0xd4d7e68a836eL

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v45

    .line 770
    const-wide v21, -0xd4dfe68a836eL

    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v46

    .line 779
    const-wide v21, -0xd4e7e68a836eL

    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v47

    .line 788
    const-wide v21, -0xd4efe68a836eL

    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v48

    .line 797
    const-wide v21, -0xd4f7e68a836eL

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v49

    .line 806
    const-wide v21, -0xd4ffe68a836eL

    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v50

    .line 815
    const-wide v21, -0xd507e68a836eL

    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v51

    .line 824
    const-wide v21, -0xd50fe68a836eL

    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v52

    .line 833
    const-wide v21, -0xd517e68a836eL

    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v53

    .line 842
    const-wide v21, -0xd51fe68a836eL

    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v54

    .line 851
    const-wide v21, -0xd527e68a836eL

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v55

    .line 860
    const-wide v21, -0xd52fe68a836eL

    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v56

    .line 869
    const-wide v21, -0xd537e68a836eL

    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v57

    .line 878
    const-wide v21, -0xd53fe68a836eL

    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v58

    .line 887
    const-wide v21, -0xd547e68a836eL

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v59

    .line 896
    const-wide v21, -0xd54fe68a836eL

    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v60

    .line 905
    const-wide v21, -0xd557e68a836eL

    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v61

    .line 914
    filled-new-array/range {v30 .. v61}, [Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v25

    .line 918
    move v3, v1

    .line 919
    :goto_3
    const/16 v5, 0x20

    .line 920
    .line 921
    if-ge v3, v5, :cond_2

    .line 922
    .line 923
    aget-object v5, v25, v3

    .line 924
    .line 925
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 926
    .line 927
    .line 928
    move-result v5

    .line 929
    new-instance v8, Landroid/view/View;

    .line 930
    .line 931
    move-object/from16 v10, v24

    .line 932
    .line 933
    invoke-direct {v8, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 934
    .line 935
    .line 936
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 937
    .line 938
    move-object/from16 v21, v0

    .line 939
    .line 940
    move/from16 v0, v28

    .line 941
    .line 942
    invoke-direct {v1, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 943
    .line 944
    .line 945
    move/from16 v0, v27

    .line 946
    .line 947
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v8, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 951
    .line 952
    .line 953
    const/4 v1, 0x0

    .line 954
    invoke-static {v5, v1}, Lyyds/ᛷᲇᛳᲈ;->ᛵᛸᛸᛷ(IZ)Landroid/graphics/drawable/GradientDrawable;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-virtual {v8, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 959
    .line 960
    .line 961
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    new-instance v1, Lkotlin/Pair;

    .line 966
    .line 967
    invoke-direct {v1, v8, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    move-object/from16 v0, v29

    .line 971
    .line 972
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move v1, v3

    .line 976
    new-instance v3, Lyyds/ᛵᛴᛳᛶ;

    .line 977
    .line 978
    const/16 v23, 0x0

    .line 979
    .line 980
    move-object/from16 v22, v9

    .line 981
    .line 982
    move-object v9, v4

    .line 983
    move v4, v5

    .line 984
    move-object v5, v8

    .line 985
    move-object/from16 v8, v22

    .line 986
    .line 987
    move-object/from16 v22, v20

    .line 988
    .line 989
    move-object/from16 v20, v11

    .line 990
    .line 991
    move-object v11, v14

    .line 992
    move-object/from16 v14, v22

    .line 993
    .line 994
    move-object/from16 v22, v18

    .line 995
    .line 996
    move-object/from16 v18, v12

    .line 997
    .line 998
    move-object v12, v15

    .line 999
    move-object/from16 v15, v16

    .line 1000
    .line 1001
    move-object/from16 v16, v17

    .line 1002
    .line 1003
    move-object/from16 v17, v22

    .line 1004
    .line 1005
    move-object/from16 v22, v0

    .line 1006
    .line 1007
    move-object v10, v13

    .line 1008
    move-object v13, v2

    .line 1009
    invoke-direct/range {v3 .. v23}, Lyyds/ᛵᛴᛳᛶ;-><init>(ILandroid/view/View;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lyyds/ᛴᲁᛱᲇ;Landroid/view/View;Landroid/widget/TextView;Lyyds/ᛱᛷᛸᲈ;Ljava/util/ArrayList;I)V

    .line 1010
    .line 1011
    .line 1012
    move-object v0, v5

    .line 1013
    move-object v4, v9

    .line 1014
    move-object v5, v14

    .line 1015
    move-object v9, v8

    .line 1016
    move-object v14, v11

    .line 1017
    move-object/from16 v11, v20

    .line 1018
    .line 1019
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1020
    .line 1021
    .line 1022
    move-object/from16 v2, v26

    .line 1023
    .line 1024
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1025
    .line 1026
    .line 1027
    add-int/lit8 v3, v1, 0x1

    .line 1028
    .line 1029
    move-object v0, v15

    .line 1030
    move-object v15, v12

    .line 1031
    move-object/from16 v12, v18

    .line 1032
    .line 1033
    move-object/from16 v18, v17

    .line 1034
    .line 1035
    move-object/from16 v17, v16

    .line 1036
    .line 1037
    move-object/from16 v16, v0

    .line 1038
    .line 1039
    move-object/from16 v20, v5

    .line 1040
    .line 1041
    move-object v2, v13

    .line 1042
    move-object/from16 v0, v21

    .line 1043
    .line 1044
    move-object/from16 v29, v22

    .line 1045
    .line 1046
    const/4 v1, 0x0

    .line 1047
    move-object v13, v10

    .line 1048
    goto/16 :goto_3

    .line 1049
    .line 1050
    :cond_2
    return-void
.end method
