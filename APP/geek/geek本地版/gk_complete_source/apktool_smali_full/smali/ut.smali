.class public final Lut;
.super Lpx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lpx;"
    }
.end annotation


# instance fields
.field public S:I

.field public T:Lc8;

.field public U:Lzv;

.field public V:I

.field public W:Ld4;

.field public X:Landroidx/recyclerview/widget/RecyclerView;

.field public Y:Landroidx/recyclerview/widget/RecyclerView;

.field public Z:Landroid/view/View;

.field public a0:Landroid/view/View;

.field public b0:Landroid/view/View;

.field public c0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpx;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final D(Lzv;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lfz;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/c;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/material/datepicker/c;->c:Lc8;

    .line 10
    .line 11
    iget-object v1, v1, Lc8;->a:Lzv;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lzv;->d(Lzv;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lut;->U:Lzv;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->c:Lc8;

    .line 20
    .line 21
    iget-object v0, v0, Lc8;->a:Lzv;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lzv;->d(Lzv;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int v0, v1, v0

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-le v2, v3, :cond_0

    .line 37
    .line 38
    move v2, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v4

    .line 41
    :goto_0
    if-lez v0, :cond_1

    .line 42
    .line 43
    move v4, v5

    .line 44
    :cond_1
    iput-object p1, p0, Lut;->U:Lzv;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    add-int/lit8 v0, v1, -0x3

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    new-instance v0, Le8;

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    invoke-direct {v0, p0, v1, v2}, Le8;-><init>(Ljava/lang/Object;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    add-int/lit8 v0, v1, 0x3

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    new-instance v0, Le8;

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    invoke-direct {v0, p0, v1, v2}, Le8;-><init>(Ljava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    iget-object p1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    new-instance v0, Le8;

    .line 93
    .line 94
    const/4 v2, 0x2

    .line 95
    invoke-direct {v0, p0, v1, v2}, Le8;-><init>(Ljava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final E(I)V
    .locals 4

    .line 1
    iput p1, p0, Lut;->V:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lnz;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lfz;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lfd0;

    .line 22
    .line 23
    iget-object v3, p0, Lut;->U:Lzv;

    .line 24
    .line 25
    iget v3, v3, Lzv;->c:I

    .line 26
    .line 27
    iget-object v0, v0, Lfd0;->c:Lut;

    .line 28
    .line 29
    iget-object v0, v0, Lut;->T:Lc8;

    .line 30
    .line 31
    iget-object v0, v0, Lc8;->a:Lzv;

    .line 32
    .line 33
    iget v0, v0, Lzv;->c:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lnz;->l0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lut;->b0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lut;->c0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lut;->Z:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lut;->a0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lut;->b0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lut;->c0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lut;->Z:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lut;->a0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lut;->U:Lzv;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lut;->D(Lzv;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lml;->m(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lml;->f:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lut;->S:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lc8;

    .line 31
    .line 32
    iput-object v0, p0, Lut;->T:Lc8;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "CURRENT_MONTH_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lzv;

    .line 49
    .line 50
    iput-object p1, p0, Lut;->U:Lzv;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final n(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Lml;->h()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lut;->S:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ld4;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ld4;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lut;->W:Ld4;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lut;->T:Lc8;

    .line 24
    .line 25
    iget-object v1, v1, Lc8;->a:Lzv;

    .line 26
    .line 27
    const v2, 0x101020d

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lbu;->G(Landroid/content/Context;I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    const v3, 0x7f0c004f

    .line 39
    .line 40
    .line 41
    move v6, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v3, 0x7f0c004a

    .line 44
    .line 45
    .line 46
    move v6, v4

    .line 47
    :goto_0
    invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0}, Lml;->z()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const v3, 0x7f070286

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const v7, 0x7f070287

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    add-int/2addr v7, v3

    .line 74
    const v3, 0x7f070285

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/2addr v3, v7

    .line 82
    const v7, 0x7f070276

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    sget v8, Law;->d:I

    .line 90
    .line 91
    const v9, 0x7f070271

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    mul-int/2addr v9, v8

    .line 99
    sub-int/2addr v8, v5

    .line 100
    const v10, 0x7f070284

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    mul-int/2addr v10, v8

    .line 108
    add-int/2addr v10, v9

    .line 109
    const v8, 0x7f07026e

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    add-int/2addr v3, v7

    .line 117
    add-int/2addr v3, v10

    .line 118
    add-int/2addr v3, p2

    .line 119
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 120
    .line 121
    .line 122
    const p2, 0x7f0900f7

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, Landroid/widget/GridView;

    .line 130
    .line 131
    new-instance v3, Lqt;

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    invoke-direct {v3, v7}, Lqt;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {p2, v3}, Lja0;->l(Landroid/view/View;Lx;)V

    .line 138
    .line 139
    .line 140
    iget-object v3, p0, Lut;->T:Lc8;

    .line 141
    .line 142
    iget v3, v3, Lc8;->e:I

    .line 143
    .line 144
    new-instance v7, Ldf;

    .line 145
    .line 146
    if-lez v3, :cond_1

    .line 147
    .line 148
    invoke-direct {v7, v3}, Ldf;-><init>(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    invoke-direct {v7}, Ldf;-><init>()V

    .line 153
    .line 154
    .line 155
    :goto_1
    invoke-virtual {p2, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 156
    .line 157
    .line 158
    iget v1, v1, Lzv;->d:I

    .line 159
    .line 160
    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 164
    .line 165
    .line 166
    const p2, 0x7f0900fa

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 174
    .line 175
    iput-object p2, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 176
    .line 177
    new-instance p2, Lrt;

    .line 178
    .line 179
    invoke-direct {p2, p0, v6, v6}, Lrt;-><init>(Lut;II)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lnz;)V

    .line 185
    .line 186
    .line 187
    iget-object p2, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    .line 190
    .line 191
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance p2, Lcom/google/android/material/datepicker/c;

    .line 195
    .line 196
    iget-object v1, p0, Lut;->T:Lc8;

    .line 197
    .line 198
    new-instance v3, Ll0;

    .line 199
    .line 200
    const/16 v4, 0x13

    .line 201
    .line 202
    invoke-direct {v3, v4, p0}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {p2, v0, v1, v3}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/view/ContextThemeWrapper;Lc8;Ll0;)V

    .line 206
    .line 207
    .line 208
    iget-object v1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lfz;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const v3, 0x7f0a0032

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    const v3, 0x7f0900fd

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    iput-object v4, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 234
    .line 235
    if-eqz v4, :cond_2

    .line 236
    .line 237
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 238
    .line 239
    .line 240
    iget-object v4, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 241
    .line 242
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 243
    .line 244
    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lnz;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    new-instance v4, Lfd0;

    .line 253
    .line 254
    invoke-direct {v4, p0}, Lfd0;-><init>(Lut;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lfz;)V

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Lut;->X:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    new-instance v4, Lst;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    const/4 v6, 0x0

    .line 268
    invoke-static {v6}, Lu80;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 269
    .line 270
    .line 271
    invoke-static {v6}, Lu80;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->g(Lkz;)V

    .line 275
    .line 276
    .line 277
    :cond_2
    const v1, 0x7f0900f0

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    if-eqz v4, :cond_3

    .line 285
    .line 286
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 291
    .line 292
    const-string v4, "SELECTOR_TOGGLE_TAG"

    .line 293
    .line 294
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    new-instance v4, Laa;

    .line 298
    .line 299
    const/4 v6, 0x2

    .line 300
    invoke-direct {v4, v6, p0}, Laa;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v1, v4}, Lja0;->l(Landroid/view/View;Lx;)V

    .line 304
    .line 305
    .line 306
    const v4, 0x7f0900f2

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iput-object v4, p0, Lut;->Z:Landroid/view/View;

    .line 314
    .line 315
    const-string v6, "NAVIGATION_PREV_TAG"

    .line 316
    .line 317
    invoke-virtual {v4, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    const v4, 0x7f0900f1

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    iput-object v4, p0, Lut;->a0:Landroid/view/View;

    .line 328
    .line 329
    const-string v6, "NAVIGATION_NEXT_TAG"

    .line 330
    .line 331
    invoke-virtual {v4, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    iput-object v3, p0, Lut;->b0:Landroid/view/View;

    .line 339
    .line 340
    const v3, 0x7f0900f6

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    iput-object v3, p0, Lut;->c0:Landroid/view/View;

    .line 348
    .line 349
    invoke-virtual {p0, v5}, Lut;->E(I)V

    .line 350
    .line 351
    .line 352
    iget-object v3, p0, Lut;->U:Lzv;

    .line 353
    .line 354
    invoke-virtual {v3}, Lzv;->c()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 359
    .line 360
    .line 361
    iget-object v3, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 362
    .line 363
    new-instance v4, Ltt;

    .line 364
    .line 365
    invoke-direct {v4, p0, p2, v1}, Ltt;-><init>(Lut;Lcom/google/android/material/datepicker/c;Lcom/google/android/material/button/MaterialButton;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->h(Lqz;)V

    .line 369
    .line 370
    .line 371
    new-instance v3, Lx0;

    .line 372
    .line 373
    const/4 v4, 0x2

    .line 374
    invoke-direct {v3, v4, p0}, Lx0;-><init>(ILjava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 378
    .line 379
    .line 380
    iget-object v1, p0, Lut;->a0:Landroid/view/View;

    .line 381
    .line 382
    new-instance v3, Lpt;

    .line 383
    .line 384
    const/4 v4, 0x1

    .line 385
    invoke-direct {v3, p0, p2, v4}, Lpt;-><init>(Lut;Lcom/google/android/material/datepicker/c;I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 389
    .line 390
    .line 391
    iget-object v1, p0, Lut;->Z:Landroid/view/View;

    .line 392
    .line 393
    new-instance v3, Lpt;

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    invoke-direct {v3, p0, p2, v4}, Lpt;-><init>(Lut;Lcom/google/android/material/datepicker/c;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 400
    .line 401
    .line 402
    :cond_3
    invoke-static {v0, v2}, Lbu;->G(Landroid/content/Context;I)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_8

    .line 407
    .line 408
    new-instance v0, Lhx;

    .line 409
    .line 410
    invoke-direct {v0}, Lhx;-><init>()V

    .line 411
    .line 412
    .line 413
    iget-object v1, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 414
    .line 415
    iget-object v2, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 416
    .line 417
    if-ne v2, v1, :cond_4

    .line 418
    .line 419
    goto :goto_2

    .line 420
    :cond_4
    iget-object v3, v0, Lhx;->b:Lw30;

    .line 421
    .line 422
    if-eqz v2, :cond_6

    .line 423
    .line 424
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->e0:Ljava/util/ArrayList;

    .line 425
    .line 426
    if-eqz v2, :cond_5

    .line 427
    .line 428
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    :cond_5
    iget-object v2, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 432
    .line 433
    const/4 v4, 0x0

    .line 434
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lpz;)V

    .line 435
    .line 436
    .line 437
    :cond_6
    iput-object v1, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 438
    .line 439
    if-eqz v1, :cond_8

    .line 440
    .line 441
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Lpz;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    if-nez v1, :cond_7

    .line 446
    .line 447
    iget-object v1, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 448
    .line 449
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->h(Lqz;)V

    .line 450
    .line 451
    .line 452
    iget-object v1, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 453
    .line 454
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lpz;)V

    .line 455
    .line 456
    .line 457
    new-instance v1, Landroid/widget/Scroller;

    .line 458
    .line 459
    iget-object v2, v0, Lhx;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 460
    .line 461
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    .line 466
    .line 467
    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-direct {v1, v2, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Lhx;->f()V

    .line 474
    .line 475
    .line 476
    goto :goto_2

    .line 477
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 478
    .line 479
    const-string p2, "An instance of OnFlingListener already set."

    .line 480
    .line 481
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw p1

    .line 485
    :cond_8
    :goto_2
    iget-object v0, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 486
    .line 487
    iget-object v1, p0, Lut;->U:Lzv;

    .line 488
    .line 489
    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->c:Lc8;

    .line 490
    .line 491
    iget-object p2, p2, Lc8;->a:Lzv;

    .line 492
    .line 493
    invoke-virtual {p2, v1}, Lzv;->d(Lzv;)I

    .line 494
    .line 495
    .line 496
    move-result p2

    .line 497
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 498
    .line 499
    .line 500
    iget-object p2, p0, Lut;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 501
    .line 502
    new-instance v0, Lqt;

    .line 503
    .line 504
    const/4 v1, 0x1

    .line 505
    invoke-direct {v0, v1}, Lqt;-><init>(I)V

    .line 506
    .line 507
    .line 508
    invoke-static {p2, v0}, Lja0;->l(Landroid/view/View;Lx;)V

    .line 509
    .line 510
    .line 511
    return-object p1
.end method

.method public final r(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lut;->S:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lut;->T:Lc8;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lut;->U:Lzv;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
