.class public final Lv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 30
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lv;->β:Ljava/lang/Object;

    return-void

    .line 31
    :cond_0
    const-string p0, "The max pool size must be > 0"

    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 33
    iput p1, p0, Lv;->α:I

    .line 34
    iput-object p2, p0, Lv;->β:Ljava/lang/Object;

    return-void

    .line 35
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lv;->β:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lw;->η(Landroid/content/Context;I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lr;

    .line 10
    .line 11
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lw;->η(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Lr;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 24
    .line 25
    iput v0, p0, Lv;->α:I

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lz52;I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv;->β:Ljava/lang/Object;

    iput p2, p0, Lv;->α:I

    return-void
.end method


# virtual methods
.method public α(J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lv;->β(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lv;->α:I

    .line 8
    .line 9
    iget-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    aput-wide p1, v1, v0

    .line 32
    .line 33
    iget p1, p0, Lv;->α:I

    .line 34
    .line 35
    if-lt v0, p1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, Lv;->α:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public β(J)Z
    .locals 5

    .line 1
    iget v0, p0, Lv;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, Lv;->β:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [J

    .line 10
    .line 11
    aget-wide v3, v3, v2

    .line 12
    .line 13
    cmp-long v3, v3, p1

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
.end method

.method public γ()Lw;
    .locals 9

    .line 1
    new-instance v0, Lw;

    .line 2
    .line 3
    iget-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr;

    .line 6
    .line 7
    iget-object v2, v1, Lr;->α:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget p0, p0, Lv;->α:I

    .line 10
    .line 11
    invoke-direct {v0, v2, p0}, Lw;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v1, Lr;->ε:Landroid/view/View;

    .line 15
    .line 16
    iget-object v2, v0, Lw;->κ:Lu;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iput-object p0, v2, Lu;->ξ:Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, v1, Lr;->δ:Ljava/lang/CharSequence;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    iput-object p0, v2, Lu;->δ:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v3, v2, Lu;->μ:Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p0, v1, Lr;->γ:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    iput-object p0, v2, Lu;->κ:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-object v3, v2, Lu;->λ:Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v3, v2, Lu;->λ:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v3, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object p0, v1, Lr;->η:Ljava/lang/Object;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz p0, :cond_7

    .line 60
    .line 61
    iget-object p0, v1, Lr;->β:Landroid/view/LayoutInflater;

    .line 62
    .line 63
    iget v5, v2, Lu;->σ:I

    .line 64
    .line 65
    invoke-virtual {p0, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 70
    .line 71
    iget-boolean v5, v1, Lr;->ι:Z

    .line 72
    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    iget v5, v2, Lu;->τ:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget v5, v2, Lu;->υ:I

    .line 79
    .line 80
    :goto_1
    iget-object v6, v1, Lr;->η:Ljava/lang/Object;

    .line 81
    .line 82
    if-eqz v6, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    new-instance v6, Lt;

    .line 86
    .line 87
    iget-object v7, v1, Lr;->α:Landroid/view/ContextThemeWrapper;

    .line 88
    .line 89
    const v8, 0x1020014

    .line 90
    .line 91
    .line 92
    invoke-direct {v6, v7, v5, v8, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    iput-object v6, v2, Lu;->ο:Landroid/widget/ListAdapter;

    .line 96
    .line 97
    iget v5, v1, Lr;->κ:I

    .line 98
    .line 99
    iput v5, v2, Lu;->π:I

    .line 100
    .line 101
    iget-object v5, v1, Lr;->θ:Landroid/content/DialogInterface$OnClickListener;

    .line 102
    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    new-instance v5, Lq;

    .line 106
    .line 107
    invoke-direct {v5, v1, v2}, Lq;-><init>(Lr;Lu;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-boolean v5, v1, Lr;->ι:Z

    .line 114
    .line 115
    if-eqz v5, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 118
    .line 119
    .line 120
    :cond_6
    iput-object p0, v2, Lu;->ε:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 121
    .line 122
    :cond_7
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 132
    .line 133
    .line 134
    iget-object p0, v1, Lr;->ζ:Ljz0;

    .line 135
    .line 136
    if-eqz p0, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 139
    .line 140
    .line 141
    :cond_8
    return-object v0
.end method

.method public δ(ILi7;)V
    .locals 8

    .line 1
    :goto_0
    shr-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Li7;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-wide v2, v1, Li7;->η:J

    .line 15
    .line 16
    iget-wide v4, p2, Li7;->η:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    sub-long/2addr v4, v2

    .line 21
    invoke-static {v6, v7, v4, v5}, Lln0;->π(JJ)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    iput p1, v1, Li7;->ζ:I

    .line 28
    .line 29
    iget-object v2, p0, Lv;->β:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [Li7;

    .line 32
    .line 33
    aput-object v1, v2, p1

    .line 34
    .line 35
    move p1, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p0, p0, Lv;->β:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, [Li7;

    .line 40
    .line 41
    aput-object p2, p0, p1

    .line 42
    .line 43
    iput p1, p2, Li7;->ζ:I

    .line 44
    .line 45
    return-void
.end method

.method public ε(J)V
    .locals 4

    .line 1
    iget v0, p0, Lv;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Lv;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [J

    .line 9
    .line 10
    aget-wide v2, v2, v1

    .line 11
    .line 12
    cmp-long v2, p1, v2

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, Lv;->α:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Lv;->β:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, [J

    .line 25
    .line 26
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    aget-wide v2, p2, v0

    .line 29
    .line 30
    aput-wide v2, p2, v1

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget p1, p0, Lv;->α:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, Lv;->α:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public ζ(Li7;)V
    .locals 9

    .line 1
    iget v0, p1, Li7;->ζ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    iget v2, p0, Lv;->α:I

    .line 7
    .line 8
    iget-object v3, p0, Lv;->β:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [Li7;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput v1, p1, Li7;->ζ:I

    .line 18
    .line 19
    iget-object v1, p0, Lv;->β:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, [Li7;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v4, v1, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    iput v2, p0, Lv;->α:I

    .line 29
    .line 30
    if-ne p1, v3, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-wide v1, p1, Li7;->η:J

    .line 34
    .line 35
    iget-wide v4, v3, Li7;->η:J

    .line 36
    .line 37
    sub-long/2addr v4, v1

    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    invoke-static {v1, v2, v4, v5}, Lln0;->π(JJ)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Lv;->β:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, [Li7;

    .line 49
    .line 50
    aput-object v3, p0, v0

    .line 51
    .line 52
    iput v0, v3, Li7;->ζ:I

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    if-gez p1, :cond_5

    .line 56
    .line 57
    :goto_0
    shl-int/lit8 p1, v0, 0x1

    .line 58
    .line 59
    add-int/lit8 v4, p1, 0x1

    .line 60
    .line 61
    iget v5, p0, Lv;->α:I

    .line 62
    .line 63
    if-gt v4, v5, :cond_3

    .line 64
    .line 65
    iget-object v5, p0, Lv;->β:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, [Li7;

    .line 68
    .line 69
    aget-object p1, v5, p1

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v5, p0, Lv;->β:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, [Li7;

    .line 77
    .line 78
    aget-object v4, v5, v4

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-wide v5, p1, Li7;->η:J

    .line 84
    .line 85
    iget-wide v7, v4, Li7;->η:J

    .line 86
    .line 87
    sub-long/2addr v7, v5

    .line 88
    invoke-static {v1, v2, v7, v8}, Lln0;->π(JJ)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-gez v5, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move-object p1, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-gt p1, v5, :cond_4

    .line 98
    .line 99
    iget-object v4, p0, Lv;->β:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, [Li7;

    .line 102
    .line 103
    aget-object p1, v4, p1

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    :goto_1
    iget-wide v4, v3, Li7;->η:J

    .line 109
    .line 110
    iget-wide v6, p1, Li7;->η:J

    .line 111
    .line 112
    sub-long/2addr v6, v4

    .line 113
    invoke-static {v1, v2, v6, v7}, Lln0;->π(JJ)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lez v4, :cond_4

    .line 118
    .line 119
    iget v4, p1, Li7;->ζ:I

    .line 120
    .line 121
    iput v0, p1, Li7;->ζ:I

    .line 122
    .line 123
    iget-object v5, p0, Lv;->β:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, [Li7;

    .line 126
    .line 127
    aput-object p1, v5, v0

    .line 128
    .line 129
    move v0, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_4
    iget-object p0, p0, Lv;->β:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, [Li7;

    .line 134
    .line 135
    aput-object v3, p0, v0

    .line 136
    .line 137
    iput v0, v3, Li7;->ζ:I

    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {p0, v0, v3}, Lv;->δ(ILi7;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    const-string p0, "Failed requirement."

    .line 145
    .line 146
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
