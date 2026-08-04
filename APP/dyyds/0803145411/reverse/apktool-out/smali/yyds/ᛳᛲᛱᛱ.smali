.class public final Lyyds/ᛳᛲᛱᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛷᛶᛲ;


# static fields
.field public static final ᛵᲀᛵᛸ:Landroid/view/animation/DecelerateInterpolator;

.field public static final ᲈᲀᛲᲀ:Landroid/view/animation/AccelerateInterpolator;


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:Z

.field public final ᛲᛲᲈᲈ:Ljava/util/ArrayList;

.field public ᛲᛳᛶᲁ:Lyyds/ᲁᲀᛸᛴ;

.field public ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

.field public final ᛲᛶᛱᲈ:Lyyds/ᲀᛵᲁᛴ;

.field public ᛲᲈᲁ:Landroid/content/Context;

.field public ᛳᛸᛴᛶ:Z

.field public ᛳᲁᲁᲇ:Z

.field public ᛵᛶᛲᲀ:Z

.field public ᛵᛸᛸᛷ:Landroid/content/Context;

.field public final ᛵᲀᲈᛴ:Lyyds/ᛲᛸᲁᛳ;

.field public ᛶᛳᛶᛵ:Z

.field public final ᛶᛷᛲᲁ:Landroid/view/View;

.field public final ᛶᛸᲀᲁ:Lyyds/ᛲᛸᲁᛳ;

.field public ᛶᲈᛴᲈ:Z

.field public ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:Lyyds/ᲁᲀᛸᛴ;

.field public ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

.field public ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public ᲇᛱᛲ:Z

.field public ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

.field public ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛳᛲᛱᛱ;->ᲈᲀᛲᲀ:Landroid/view/animation/AccelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛳᛲᛱᛱ;->ᛵᲀᛵᛸ:Landroid/view/animation/DecelerateInterpolator;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 21
    .line 22
    iput-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛶᛲᲀ:Z

    .line 23
    .line 24
    new-instance v2, Lyyds/ᛲᛸᲁᛳ;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, Lyyds/ᛲᛸᲁᛳ;-><init>(Lyyds/ᛳᛲᛱᛱ;I)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛸᲀᲁ:Lyyds/ᛲᛸᲁᛳ;

    .line 30
    .line 31
    new-instance v0, Lyyds/ᛲᛸᲁᛳ;

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, Lyyds/ᛲᛸᲁᛳ;-><init>(Lyyds/ᛳᛲᛱᛱ;I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᲀᲈᛴ:Lyyds/ᛲᛸᲁᛳ;

    .line 37
    .line 38
    new-instance v0, Lyyds/ᲀᛵᲁᛴ;

    .line 39
    .line 40
    const/16 v1, 0x18

    .line 41
    .line 42
    invoke-direct {v0, v1, p0}, Lyyds/ᲀᛵᲁᛴ;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛶᛱᲈ:Lyyds/ᲀᛵᲁᛴ;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    if-nez p2, :cond_0

    .line 59
    .line 60
    const p2, 0x1020002

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛷᛲᲁ:Landroid/view/View;

    .line 68
    .line 69
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 73
    iput v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 75
    iput-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛶᛲᲀ:Z

    .line 76
    new-instance v0, Lyyds/ᛲᛸᲁᛳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lyyds/ᛲᛸᲁᛳ;-><init>(Lyyds/ᛳᛲᛱᛱ;I)V

    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛸᲀᲁ:Lyyds/ᛲᛸᲁᛳ;

    .line 77
    new-instance v0, Lyyds/ᛲᛸᲁᛳ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lyyds/ᛲᛸᲁᛳ;-><init>(Lyyds/ᛳᛲᛱᛱ;I)V

    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᲀᲈᛴ:Lyyds/ᛲᛸᲁᛳ;

    .line 78
    new-instance v0, Lyyds/ᲀᛵᲁᛴ;

    const/16 v1, 0x18

    invoke-direct {v0, v1, p0}, Lyyds/ᲀᛵᲁᛴ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛶᛱᲈ:Lyyds/ᲀᛵᲁᛴ;

    .line 79
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Z)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᛱᛲ:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛳᛶᛵ:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move v0, v2

    .line 15
    :goto_1
    iget-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛶᛲᲀ:Z

    .line 16
    .line 17
    const-wide/16 v4, 0xfa

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/high16 v7, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iget-object v8, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛶᛱᲈ:Lyyds/ᲀᛵᲁᛴ;

    .line 23
    .line 24
    iget-object v9, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛷᛲᲁ:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_e

    .line 27
    .line 28
    if-nez v1, :cond_1a

    .line 29
    .line 30
    iput-boolean v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛶᛲᲀ:Z

    .line 31
    .line 32
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    .line 45
    .line 46
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᲀᲈᛴ:Lyyds/ᛲᛸᲁᛳ;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    if-nez v0, :cond_c

    .line 50
    .line 51
    iget-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᛸᛴᛶ:Z

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    if-eqz p1, :cond_c

    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 58
    .line 59
    invoke-virtual {v0, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    neg-int v0, v0

    .line 69
    int-to-float v0, v0

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    filled-new-array {v3, v3}, [I

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v3, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 77
    .line 78
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 79
    .line 80
    .line 81
    aget p1, p1, v2

    .line 82
    .line 83
    int-to-float p1, p1

    .line 84
    sub-float/2addr v0, p1

    .line 85
    :cond_4
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lyyds/ᲁᛳᲀ;

    .line 91
    .line 92
    invoke-direct {p1}, Lyyds/ᲁᛳᲀ;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 96
    .line 97
    invoke-static {v2}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2, v10}, Lyyds/ᛱᛶᛲᛷ;->ᛲᛴᛳᛲ(F)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v2, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Landroid/view/View;

    .line 111
    .line 112
    if-eqz v3, :cond_6

    .line 113
    .line 114
    if-eqz v8, :cond_5

    .line 115
    .line 116
    new-instance v6, Lyyds/ᲇᛲᛷᲀ;

    .line 117
    .line 118
    invoke-direct {v6, v8, v3}, Lyyds/ᲇᛲᛷᲀ;-><init>(Lyyds/ᲀᛵᲁᛴ;Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3, v6}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 126
    .line 127
    .line 128
    :cond_6
    iget-boolean v3, p1, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 129
    .line 130
    iget-object v6, p1, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 131
    .line 132
    if-nez v3, :cond_7

    .line 133
    .line 134
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :cond_7
    iget-boolean v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 138
    .line 139
    if-eqz v2, :cond_8

    .line 140
    .line 141
    if-eqz v9, :cond_8

    .line 142
    .line 143
    invoke-virtual {v9, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 144
    .line 145
    .line 146
    invoke-static {v9}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0, v10}, Lyyds/ᛱᛶᛲᛷ;->ᛲᛴᛳᛲ(F)V

    .line 151
    .line 152
    .line 153
    iget-boolean v2, p1, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 154
    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :cond_8
    iget-boolean v0, p1, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 161
    .line 162
    if-nez v0, :cond_9

    .line 163
    .line 164
    sget-object v2, Lyyds/ᛳᛲᛱᛱ;->ᛵᲀᛵᛸ:Landroid/view/animation/DecelerateInterpolator;

    .line 165
    .line 166
    iput-object v2, p1, Lyyds/ᲁᛳᲀ;->ᲀᛲᛳᲀ:Landroid/view/animation/Interpolator;

    .line 167
    .line 168
    :cond_9
    if-nez v0, :cond_a

    .line 169
    .line 170
    iput-wide v4, p1, Lyyds/ᲁᛳᲀ;->ᛵᛸᛸᛷ:J

    .line 171
    .line 172
    :cond_a
    if-nez v0, :cond_b

    .line 173
    .line 174
    iput-object v1, p1, Lyyds/ᲁᛳᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛸᛳ;

    .line 175
    .line 176
    :cond_b
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 177
    .line 178
    invoke-virtual {p1}, Lyyds/ᲁᛳᲀ;->ᛵᛸᛸᛷ()V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_c
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 183
    .line 184
    invoke-virtual {p1, v7}, Landroid/view/View;->setAlpha(F)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 188
    .line 189
    invoke-virtual {p1, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 190
    .line 191
    .line 192
    iget-boolean p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 193
    .line 194
    if-eqz p1, :cond_d

    .line 195
    .line 196
    if-eqz v9, :cond_d

    .line 197
    .line 198
    invoke-virtual {v9, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 199
    .line 200
    .line 201
    :cond_d
    invoke-virtual {v1}, Lyyds/ᛲᛸᲁᛳ;->ᛲᲈᲁ()V

    .line 202
    .line 203
    .line 204
    :goto_2
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 205
    .line 206
    if-eqz p0, :cond_1a

    .line 207
    .line 208
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 209
    .line 210
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_e
    if-eqz v1, :cond_1a

    .line 215
    .line 216
    iput-boolean v3, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛶᛲᲀ:Z

    .line 217
    .line 218
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 219
    .line 220
    if-eqz v0, :cond_f

    .line 221
    .line 222
    invoke-virtual {v0}, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ()V

    .line 223
    .line 224
    .line 225
    :cond_f
    iget v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    .line 226
    .line 227
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛸᲀᲁ:Lyyds/ᛲᛸᲁᛳ;

    .line 228
    .line 229
    if-nez v0, :cond_19

    .line 230
    .line 231
    iget-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᛸᛴᛶ:Z

    .line 232
    .line 233
    if-nez v0, :cond_10

    .line 234
    .line 235
    if-eqz p1, :cond_19

    .line 236
    .line 237
    :cond_10
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 238
    .line 239
    invoke-virtual {v0, v7}, Landroid/view/View;->setAlpha(F)V

    .line 240
    .line 241
    .line 242
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 243
    .line 244
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 245
    .line 246
    .line 247
    new-instance v0, Lyyds/ᲁᛳᲀ;

    .line 248
    .line 249
    invoke-direct {v0}, Lyyds/ᲁᛳᲀ;-><init>()V

    .line 250
    .line 251
    .line 252
    iget-object v7, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 253
    .line 254
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    neg-int v7, v7

    .line 259
    int-to-float v7, v7

    .line 260
    if-eqz p1, :cond_11

    .line 261
    .line 262
    filled-new-array {v3, v3}, [I

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iget-object v3, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 267
    .line 268
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 269
    .line 270
    .line 271
    aget p1, p1, v2

    .line 272
    .line 273
    int-to-float p1, p1

    .line 274
    sub-float/2addr v7, p1

    .line 275
    :cond_11
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 276
    .line 277
    invoke-static {p1}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {p1, v7}, Lyyds/ᛱᛶᛲᛷ;->ᛲᛴᛳᛲ(F)V

    .line 282
    .line 283
    .line 284
    iget-object v2, p1, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    check-cast v2, Landroid/view/View;

    .line 291
    .line 292
    if-eqz v2, :cond_13

    .line 293
    .line 294
    if-eqz v8, :cond_12

    .line 295
    .line 296
    new-instance v6, Lyyds/ᲇᛲᛷᲀ;

    .line 297
    .line 298
    invoke-direct {v6, v8, v2}, Lyyds/ᲇᛲᛷᲀ;-><init>(Lyyds/ᲀᛵᲁᛴ;Landroid/view/View;)V

    .line 299
    .line 300
    .line 301
    :cond_12
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v2, v6}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 306
    .line 307
    .line 308
    :cond_13
    iget-boolean v2, v0, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 309
    .line 310
    iget-object v3, v0, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 311
    .line 312
    if-nez v2, :cond_14

    .line 313
    .line 314
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_14
    iget-boolean p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 318
    .line 319
    if-eqz p1, :cond_15

    .line 320
    .line 321
    if-eqz v9, :cond_15

    .line 322
    .line 323
    invoke-static {v9}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p1, v7}, Lyyds/ᛱᛶᛲᛷ;->ᛲᛴᛳᛲ(F)V

    .line 328
    .line 329
    .line 330
    iget-boolean v2, v0, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 331
    .line 332
    if-nez v2, :cond_15

    .line 333
    .line 334
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    :cond_15
    iget-boolean p1, v0, Lyyds/ᲁᛳᲀ;->ᛲᛴᛳᛲ:Z

    .line 338
    .line 339
    if-nez p1, :cond_16

    .line 340
    .line 341
    sget-object v2, Lyyds/ᛳᛲᛱᛱ;->ᲈᲀᛲᲀ:Landroid/view/animation/AccelerateInterpolator;

    .line 342
    .line 343
    iput-object v2, v0, Lyyds/ᲁᛳᲀ;->ᲀᛲᛳᲀ:Landroid/view/animation/Interpolator;

    .line 344
    .line 345
    :cond_16
    if-nez p1, :cond_17

    .line 346
    .line 347
    iput-wide v4, v0, Lyyds/ᲁᛳᲀ;->ᛵᛸᛸᛷ:J

    .line 348
    .line 349
    :cond_17
    if-nez p1, :cond_18

    .line 350
    .line 351
    iput-object v1, v0, Lyyds/ᲁᛳᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛸᛳ;

    .line 352
    .line 353
    :cond_18
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 354
    .line 355
    invoke-virtual {v0}, Lyyds/ᲁᛳᲀ;->ᛵᛸᛸᛷ()V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_19
    invoke-virtual {v1}, Lyyds/ᛲᛸᲁᛳ;->ᛲᲈᲁ()V

    .line 360
    .line 361
    .line 362
    :cond_1a
    return-void
.end method

.method public final ᛲᲈᲁ(Z)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛳᛶᛵ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛳᛶᛵ:Z

    .line 10
    .line 11
    iget-object v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iput-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᛳᛶᛵ:Z

    .line 25
    .line 26
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-virtual {p0, v1}, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ(Z)V

    .line 34
    .line 35
    .line 36
    :cond_3
    :goto_0
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 37
    .line 38
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 45
    .line 46
    const/16 v3, 0x8

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    const-wide/16 v5, 0xc8

    .line 52
    .line 53
    const-wide/16 v7, 0x64

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    check-cast v2, Lyyds/ᲈᲇᛳᛳ;

    .line 58
    .line 59
    iget-object p1, v2, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 60
    .line 61
    invoke-static {p1}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-virtual {p1, v0}, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v7, v8}, Lyyds/ᛱᛶᛲᛷ;->ᲀᛲᛳᲀ(J)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lyyds/ᛷᛸᛳᛳ;

    .line 73
    .line 74
    invoke-direct {v0, v2, v4}, Lyyds/ᛷᛸᛳᛳ;-><init>(Lyyds/ᲈᲇᛳᛳ;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lyyds/ᛱᛶᛲᛷ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛷᛸᛳ;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 81
    .line 82
    invoke-virtual {p0, v1, v5, v6}, Landroidx/appcompat/widget/ActionBarContextView;->ᛲᛳᛶᲁ(IJ)Lyyds/ᛱᛶᛲᛷ;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    check-cast v2, Lyyds/ᲈᲇᛳᛳ;

    .line 88
    .line 89
    iget-object p1, v2, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 90
    .line 91
    invoke-static {p1}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/high16 v0, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v5, v6}, Lyyds/ᛱᛶᛲᛷ;->ᲀᛲᛳᲀ(J)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Lyyds/ᛷᛸᛳᛳ;

    .line 104
    .line 105
    invoke-direct {v0, v2, v1}, Lyyds/ᛷᛸᛳᛳ;-><init>(Lyyds/ᲈᲇᛳᛳ;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lyyds/ᛱᛶᛲᛷ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛷᛸᛳ;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 112
    .line 113
    invoke-virtual {p0, v3, v7, v8}, Landroidx/appcompat/widget/ActionBarContextView;->ᛲᛳᛶᲁ(IJ)Lyyds/ᛱᛶᛲᛷ;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    move-object v9, p1

    .line 118
    move-object p1, p0

    .line 119
    move-object p0, v9

    .line 120
    :goto_1
    new-instance v0, Lyyds/ᲁᛳᲀ;

    .line 121
    .line 122
    invoke-direct {v0}, Lyyds/ᲁᛳᲀ;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    iget-object p1, p1, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Landroid/view/View;

    .line 137
    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    const-wide/16 v2, 0x0

    .line 150
    .line 151
    :goto_2
    iget-object p1, p0, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Landroid/view/View;

    .line 158
    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 166
    .line 167
    .line 168
    :cond_6
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lyyds/ᲁᛳᲀ;->ᛵᛸᛸᛷ()V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_7
    if-eqz p1, :cond_8

    .line 176
    .line 177
    check-cast v2, Lyyds/ᲈᲇᛳᛳ;

    .line 178
    .line 179
    iget-object p1, v2, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 180
    .line 181
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 185
    .line 186
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_8
    check-cast v2, Lyyds/ᲈᲇᛳᛳ;

    .line 191
    .line 192
    iget-object p1, v2, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 193
    .line 194
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 198
    .line 199
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Landroid/content/Context;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x6604000c

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 28
    .line 29
    iget-object v2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_0
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 38
    .line 39
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 40
    .line 41
    :cond_1
    return-object v0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/view/View;)V
    .locals 6

    .line 1
    const v0, 0x66090196

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Lyyds/ᛶᛷᛶᛲ;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const v0, 0x6609004b

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lyyds/ᛱᛵᛸᛴ;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lyyds/ᛱᛵᛸᛴ;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    if-eqz v1, :cond_9

    .line 34
    .line 35
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lyyds/ᛱᛵᛸᛴ;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 42
    .line 43
    const v0, 0x66090053

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 51
    .line 52
    iput-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 53
    .line 54
    const v0, 0x6609004d

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    .line 62
    .line 63
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 66
    .line 67
    if-eqz v0, :cond_8

    .line 68
    .line 69
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 70
    .line 71
    if-eqz v1, :cond_8

    .line 72
    .line 73
    if-eqz p1, :cond_8

    .line 74
    .line 75
    check-cast v0, Lyyds/ᲈᲇᛳᛳ;

    .line 76
    .line 77
    iget-object p1, v0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 84
    .line 85
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 86
    .line 87
    check-cast v0, Lyyds/ᲈᲇᛳᛳ;

    .line 88
    .line 89
    iget v0, v0, Lyyds/ᲈᲇᛳᛳ;->ᛵᛸᛸᛷ:I

    .line 90
    .line 91
    and-int/lit8 v0, v0, 0x4

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    const/4 v2, 0x0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    move v0, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v0, v2

    .line 100
    :goto_1
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iput-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᲈᲁ:Z

    .line 103
    .line 104
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 109
    .line 110
    const/16 v4, 0xe

    .line 111
    .line 112
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const/high16 v0, 0x66050000

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    const/4 v0, 0x0

    .line 128
    if-nez p1, :cond_4

    .line 129
    .line 130
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 131
    .line 132
    check-cast p1, Lyyds/ᲈᲇᛳᛳ;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lyyds/ᛳᛷᛲᛷ;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lyyds/ᛳᛷᛲᛷ;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 149
    .line 150
    check-cast p1, Lyyds/ᲈᲇᛳᛳ;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    :goto_2
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 161
    .line 162
    check-cast p1, Lyyds/ᲈᲇᛳᛳ;

    .line 163
    .line 164
    iget-object p1, p1, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 165
    .line 166
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 170
    .line 171
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 175
    .line 176
    sget-object v3, Lyyds/ᛷᛷᛴᛳ;->ᛲᲈᲁ:[I

    .line 177
    .line 178
    const v5, 0x66040007

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0, v3, v5, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 192
    .line 193
    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᲈᲈᲁ:Z

    .line 194
    .line 195
    if-eqz v3, :cond_5

    .line 196
    .line 197
    iput-boolean v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛶᲈᛴᲈ:Z

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    const-string p0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    .line 204
    .line 205
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_6
    :goto_3
    const/16 v0, 0xc

    .line 210
    .line 211
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_7

    .line 216
    .line 217
    int-to-float v0, v0

    .line 218
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛱ;->ᲇᲈᛵᛷ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 219
    .line 220
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 221
    .line 222
    invoke-virtual {p0, v0}, Landroid/view/View;->setElevation(F)V

    .line 223
    .line 224
    .line 225
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_8
    const-class p0, Lyyds/ᛳᛲᛱᛱ;

    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const-string p1, " can only be used with a compatible window decor layout"

    .line 236
    .line 237
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    if-eqz v0, :cond_a

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    goto :goto_4

    .line 258
    :cond_a
    const-string p1, "null"

    .line 259
    .line 260
    :goto_4
    const-string v0, "Can\'t make a decor toolbar out of "

    .line 261
    .line 262
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Z)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᛸᛴ;

    .line 12
    .line 13
    check-cast v1, Lyyds/ᲈᲇᛳᛳ;

    .line 14
    .line 15
    iget v2, v1, Lyyds/ᲈᲇᛳᛳ;->ᛵᛸᛸᛷ:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    iput-boolean v3, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᲈᲁ:Z

    .line 19
    .line 20
    and-int/lit8 p0, p1, 0x4

    .line 21
    .line 22
    and-int/lit8 p1, v2, -0x5

    .line 23
    .line 24
    or-int/2addr p0, p1

    .line 25
    invoke-virtual {v1, p0}, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method
