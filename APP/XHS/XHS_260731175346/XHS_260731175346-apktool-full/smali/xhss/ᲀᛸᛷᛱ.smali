.class public final Lxhss/ᲀᛸᛷᛱ;
.super Lxhss/ᛱᛴᛳᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛴᲀ:Ljava/util/ArrayList;

.field public ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

.field public ᛱᲁᛳᛲ:Ljava/util/HashMap;

.field public ᛲᛵᲁᲁ:[I

.field public ᛴᛴᛲᛸ:F

.field public ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

.field public ᛴᲀᛸᛵ:I

.field public ᛴᲈᲀᲀ:Landroid/widget/EditText;

.field public ᛵᲈᛱᛳ:I

.field public ᛶᲀᛵᲇ:Ljava/lang/String;

.field public ᛷᛸᛷ:Ljava/util/ArrayList;

.field public ᛸᛴᛸᛲ:Lxhss/ᲀᛸᛷᛱ;

.field public ᲁᛲᲈᛵ:Ljava/lang/String;

.field public ᲁᛷᲇᲇ:Z

.field public ᲇᛸᛶ:[Ljava/lang/CharSequence;

.field public ᲈᛱᛷᛵ:J


# direct methods
.method public static ᛴᛴᛲᛸ(Landroid/content/Context;)Lxhss/ᲀᛸᛷᛱ;
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᲀᛸᛷᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᲇᛲ:Z

    .line 8
    .line 9
    iput-object v0, v0, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 10
    .line 11
    sget v2, Lxhss/ᲇᛸᲀᛸ;->ᲇᛴᲇᛵ:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    iput v2, v0, Lxhss/ᛱᛴᛳᛴ;->ᛵᛲᲁᛶ:F

    .line 15
    .line 16
    iput-object v0, v0, Lxhss/ᲀᛸᛷᛱ;->ᛸᛴᛸᛲ:Lxhss/ᲀᛸᛷᛱ;

    .line 17
    .line 18
    iput-boolean v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᲁᛷᲇᲇ:Z

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    iput v2, v0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲀᛸᛵ:I

    .line 22
    .line 23
    iput v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᛵᲈᛱᛳ:I

    .line 24
    .line 25
    new-instance v1, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᛱᲁᛳᛲ:Ljava/util/HashMap;

    .line 31
    .line 32
    const-string v1, "Search"

    .line 33
    .line 34
    iput-object v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᛶᲀᛵᲇ:Ljava/lang/String;

    .line 35
    .line 36
    const-string v1, ""

    .line 37
    .line 38
    iput-object v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᲁᛲᲈᛵ:Ljava/lang/String;

    .line 39
    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    iput-wide v1, v0, Lxhss/ᲀᛸᛷᛱ;->ᲈᛱᛷᛵ:J

    .line 43
    .line 44
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 45
    .line 46
    return-object v0
.end method


# virtual methods
.method public final ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛱᛱᲈᲀ([I)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛵᲈᛱᛳ:I

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲀᛸᛵ:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v0, p1

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    aget v2, p1, v1

    .line 19
    .line 20
    iget-object v3, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 34
    .line 35
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᛲᛵᲁᲁ()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛱᛲᛸᲇ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᲈᛱᛷᛵ()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final ᛱᲁᛳᛲ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᛲᛴᲇᛲ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᲁᛷᲇᲇ:Z

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 23
    .line 24
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const v2, 0x640700c0

    .line 34
    .line 35
    .line 36
    const v3, 0x640700bf

    .line 37
    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Lxhss/ᛱᛱᲀᛱ;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v4, Lxhss/ᛸᛱᲁᛸ;

    .line 58
    .line 59
    invoke-direct {v4, v3}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    const v3, 0x640e00a1

    .line 63
    .line 64
    .line 65
    iput v3, v4, Lxhss/ᛸᛱᲁᛸ;->ᛷᛵᛵᲈ:I

    .line 66
    .line 67
    invoke-direct {v0, v4}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v0, Lxhss/ᛱᛱᲀᛱ;

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-direct {v0, v3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 89
    .line 90
    :goto_0
    const/4 v3, 0x2

    .line 91
    invoke-virtual {v0, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 114
    .line 115
    new-instance v2, Lxhss/ᛵᛷᛵᛱ;

    .line 116
    .line 117
    invoke-direct {v2, p0}, Lxhss/ᛵᛷᛵᛱ;-><init>(Lxhss/ᲀᛸᛷᛱ;)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v0, Lxhss/ᛱᛱᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᛵᛱ;

    .line 121
    .line 122
    new-instance v2, Lxhss/ᛷᛵᛲᲈ;

    .line 123
    .line 124
    invoke-direct {v2, p0}, Lxhss/ᛷᛵᛲᲈ;-><init>(Lxhss/ᲀᛸᛷᛱ;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 131
    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 135
    .line 136
    if-eqz v0, :cond_5

    .line 137
    .line 138
    iget-object v2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 139
    .line 140
    if-nez v2, :cond_3

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 144
    .line 145
    .line 146
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 147
    .line 148
    const/4 v2, -0x1

    .line 149
    const/4 v3, -0x2

    .line 150
    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 151
    .line 152
    .line 153
    iget-object v2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 154
    .line 155
    if-eqz v2, :cond_4

    .line 156
    .line 157
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᲈᛱᛷᛵ()V

    .line 158
    .line 159
    .line 160
    :cond_4
    iget-object v2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 161
    .line 162
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    const/4 v1, 0x0

    .line 166
    iput-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 167
    .line 168
    iget-object v1, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 169
    .line 170
    iget-object v1, v1, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 171
    .line 172
    iget-object v2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 173
    .line 174
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ()V

    .line 178
    .line 179
    .line 180
    :cond_6
    return-void
.end method

.method public final ᛲᛵᲁᲁ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lxhss/ᛴᲈᲀᲇ;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-direct {v0, v1, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ᛴᛷᛵᛴ(Ljava/lang/CharSequence;)Lxhss/ᛱᛴᛳᛴ;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ᛴᲈᲀᲀ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    new-instance v0, Lxhss/ᛲᛳᛴᛳ;

    .line 15
    .line 16
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛸᛴᛸᛲ:Lxhss/ᲀᛸᛷᛱ;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Lxhss/ᲀᛸᛷᛱ;->ᛷᛸᛷ:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-direct {v0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v3, v0, Lxhss/ᛲᛳᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 35
    .line 36
    iput-object v2, v0, Lxhss/ᛲᛳᛴᛳ;->ᛳᲁᲇᛸ:Landroid/app/Activity;

    .line 37
    .line 38
    iput-object v1, v0, Lxhss/ᛲᛳᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

    .line 39
    .line 40
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛷᛸᛷ:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    new-instance v1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    :cond_3
    iput-object v1, v0, Lxhss/ᛲᛳᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 53
    .line 54
    :goto_0
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 75
    .line 76
    if-eq v0, v1, :cond_5

    .line 77
    .line 78
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛲᛸᲇ:Lxhss/ᛱᛱᲀᛱ;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 85
    .line 86
    .line 87
    :cond_6
    :goto_1
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 88
    .line 89
    if-nez v0, :cond_7

    .line 90
    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_7
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛶᲀᛵᲇ:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_8

    .line 105
    .line 106
    const v1, 0x640700bd

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_8
    const v1, 0x640700be

    .line 111
    .line 112
    .line 113
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    const v2, 0x6405002d

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_9
    const v2, 0x64050094

    .line 144
    .line 145
    .line 146
    :goto_3
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    const v2, 0x64050026

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_a
    const v2, 0x6405008d

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-static {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 186
    .line 187
    const/4 v1, 0x1

    .line 188
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᲇᛸᛶ()V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v1, p0, Lxhss/ᲀᛸᛷᛱ;->ᲁᛲᲈᛵ:Ljava/lang/String;

    .line 206
    .line 207
    if-nez v1, :cond_b

    .line 208
    .line 209
    const-string v1, ""

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    :goto_5
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-nez v0, :cond_c

    .line 221
    .line 222
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᲇᛸᛶ()V

    .line 241
    .line 242
    .line 243
    :cond_c
    :goto_6
    invoke-super {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲈᲀᲀ()V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public final ᛵᲈᛱᛳ()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛵᲈᛱᛳ:I

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲀᛸᛵ:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 16
    .line 17
    invoke-virtual {p0}, Lxhss/ᲀᛸᛷᛱ;->ᛲᛵᲁᲁ()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final ᛷᛴᛷᛱ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lxhss/ᲀᛸᛷᛱ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "("

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᛷᛸᛷ(Ljava/lang/CharSequence;Lxhss/ᛸᲈᲁᲇ;)Lxhss/ᛱᛴᛳᛴ;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ᲇᛸᛶ()V
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const v1, 0x6407008c

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, v1}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x6405008d

    .line 18
    .line 19
    .line 20
    const v2, 0x64050026

    .line 21
    .line 22
    .line 23
    const/high16 v3, 0x41900000    # 18.0f

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    move v6, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v6, v1

    .line 45
    :goto_0
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v0, v4, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v5, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, 0x0

    .line 78
    if-nez v5, :cond_4

    .line 79
    .line 80
    iget-object v5, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const v7, 0x6407008b

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v7}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-eqz v5, :cond_5

    .line 94
    .line 95
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_3

    .line 108
    .line 109
    move v1, v2

    .line 110
    :cond_3
    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-virtual {v5, v4, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v5, v6

    .line 134
    :cond_5
    :goto_1
    iget-object p0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 135
    .line 136
    invoke-virtual {p0, v0, v6, v5, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final ᲈᛱᛷᛵ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛲᛴᛴ(Landroid/widget/EditText;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲈᲀᲀ:Landroid/widget/EditText;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method
