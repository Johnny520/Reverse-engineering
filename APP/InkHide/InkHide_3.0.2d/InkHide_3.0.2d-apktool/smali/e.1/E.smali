.class public final Le/E;
.super Lb1/h;
.source "SourceFile"

# interfaces
.implements Li/e;


# static fields
.field public static final O:Landroid/view/animation/AccelerateInterpolator;

.field public static final P:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public A:Z

.field public final B:Ljava/util/ArrayList;

.field public C:I

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Lg/k;

.field public J:Z

.field public K:Z

.field public final L:Le/C;

.field public final M:Le/C;

.field public final N:LC/j;

.field public p:Landroid/content/Context;

.field public q:Landroid/content/Context;

.field public r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public s:Landroidx/appcompat/widget/ActionBarContainer;

.field public t:Li/o0;

.field public u:Landroidx/appcompat/widget/ActionBarContextView;

.field public final v:Landroid/view/View;

.field public w:Z

.field public x:Le/D;

.field public y:Le/D;

.field public z:LH/a;


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
    sput-object v0, Le/E;->O:Landroid/view/animation/AccelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Le/E;->P:Landroid/view/animation/DecelerateInterpolator;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/E;->B:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Le/E;->C:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Le/E;->D:Z

    .line 6
    iput-boolean v0, p0, Le/E;->H:Z

    .line 7
    new-instance v0, Le/C;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/C;-><init>(Le/E;I)V

    iput-object v0, p0, Le/E;->L:Le/C;

    .line 8
    new-instance v0, Le/C;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Le/C;-><init>(Le/E;I)V

    iput-object v0, p0, Le/E;->M:Le/C;

    .line 9
    new-instance v0, LC/j;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0}, LC/j;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/E;->N:LC/j;

    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Le/E;->S(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Le/E;->v:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/E;->B:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Le/E;->C:I

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Le/E;->D:Z

    .line 19
    iput-boolean v0, p0, Le/E;->H:Z

    .line 20
    new-instance v0, Le/C;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/C;-><init>(Le/E;I)V

    iput-object v0, p0, Le/E;->L:Le/C;

    .line 21
    new-instance v0, Le/C;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Le/C;-><init>(Le/E;I)V

    iput-object v0, p0, Le/E;->M:Le/C;

    .line 22
    new-instance v0, LC/j;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0}, LC/j;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/E;->N:LC/j;

    .line 23
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/E;->S(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final Q(Z)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-boolean v1, p0, Le/E;->G:Z

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Le/E;->G:Z

    .line 10
    .line 11
    iget-object v2, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Le/E;->V(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-boolean v1, p0, Le/E;->G:Z

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iput-boolean v0, p0, Le/E;->G:Z

    .line 27
    .line 28
    iget-object v1, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0, v0}, Le/E;->V(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    :goto_0
    iget-object v1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 39
    .line 40
    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    const/4 v3, 0x4

    .line 49
    if-eqz v1, :cond_7

    .line 50
    .line 51
    const-wide/16 v4, 0xc8

    .line 52
    .line 53
    const-wide/16 v6, 0x64

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 58
    .line 59
    check-cast p1, Li/m1;

    .line 60
    .line 61
    iget-object v1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 62
    .line 63
    invoke-static {v1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-virtual {v1, v2}, Ly/S;->a(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v6, v7}, Ly/S;->c(J)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lg/j;

    .line 75
    .line 76
    invoke-direct {v2, p1, v3}, Lg/j;-><init>(Li/m1;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ly/S;->d(Ly/T;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 83
    .line 84
    invoke-virtual {p1, v4, v5, v0}, Landroidx/appcompat/widget/ActionBarContextView;->i(JI)Ly/S;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 90
    .line 91
    check-cast p1, Li/m1;

    .line 92
    .line 93
    iget-object v1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 94
    .line 95
    invoke-static {v1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const/high16 v3, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ly/S;->a(F)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v4, v5}, Ly/S;->c(J)V

    .line 105
    .line 106
    .line 107
    new-instance v3, Lg/j;

    .line 108
    .line 109
    invoke-direct {v3, p1, v0}, Lg/j;-><init>(Li/m1;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ly/S;->d(Ly/T;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 116
    .line 117
    invoke-virtual {p1, v6, v7, v2}, Landroidx/appcompat/widget/ActionBarContextView;->i(JI)Ly/S;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    move-object v8, v1

    .line 122
    move-object v1, p1

    .line 123
    move-object p1, v8

    .line 124
    :goto_1
    new-instance v0, Lg/k;

    .line 125
    .line 126
    invoke-direct {v0}, Lg/k;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v2, v0, Lg/k;->a:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    iget-object v1, v1, Ly/S;->a:Ljava/lang/ref/WeakReference;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Landroid/view/View;

    .line 141
    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    const-wide/16 v3, 0x0

    .line 154
    .line 155
    :goto_2
    iget-object v1, p1, Ly/S;->a:Ljava/lang/ref/WeakReference;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Landroid/view/View;

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Lg/k;->b()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_7
    if-eqz p1, :cond_8

    .line 180
    .line 181
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 182
    .line 183
    check-cast p1, Li/m1;

    .line 184
    .line 185
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 186
    .line 187
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_8
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 197
    .line 198
    check-cast p1, Li/m1;

    .line 199
    .line 200
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 206
    .line 207
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public final R()Landroid/content/Context;
    .locals 4

    .line 1
    iget-object v0, p0, Le/E;->q:Landroid/content/Context;

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
    iget-object v1, p0, Le/E;->p:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f04000a

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
    iget-object v2, p0, Le/E;->p:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Le/E;->q:Landroid/content/Context;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Le/E;->p:Landroid/content/Context;

    .line 38
    .line 39
    iput-object v0, p0, Le/E;->q:Landroid/content/Context;

    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Le/E;->q:Landroid/content/Context;

    .line 42
    .line 43
    return-object v0
.end method

.method public final S(Landroid/view/View;)V
    .locals 6

    .line 1
    const v0, 0x7f09004b

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
    iput-object v0, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Li/e;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const v0, 0x7f090027

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Li/o0;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Li/o0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    if-eqz v1, :cond_8

    .line 34
    .line 35
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Li/o0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Le/E;->t:Li/o0;

    .line 42
    .line 43
    const v0, 0x7f09002f

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
    iput-object v0, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 53
    .line 54
    const v0, 0x7f090029

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
    iput-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    iget-object v0, p0, Le/E;->t:Li/o0;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    iget-object v1, p0, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    check-cast v0, Li/m1;

    .line 76
    .line 77
    iget-object p1, v0, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Le/E;->p:Landroid/content/Context;

    .line 84
    .line 85
    iget-object v0, p0, Le/E;->t:Li/o0;

    .line 86
    .line 87
    check-cast v0, Li/m1;

    .line 88
    .line 89
    iget v0, v0, Li/m1;->b:I

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
    iput-boolean v1, p0, Le/E;->w:Z

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
    iget-object v0, p0, Le/E;->t:Li/o0;

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
    const/high16 v0, 0x7f050000

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0, p1}, Le/E;->U(Z)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Le/E;->p:Landroid/content/Context;

    .line 131
    .line 132
    sget-object v0, Ld/a;->a:[I

    .line 133
    .line 134
    const v3, 0x7f040005

    .line 135
    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-virtual {p1, v5, v0, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    iget-object v0, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 149
    .line 150
    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i:Z

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    iput-boolean v1, p0, Le/E;->K:Z

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    .line 163
    .line 164
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_5
    :goto_2
    const/16 v0, 0xc

    .line 169
    .line 170
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    int-to-float v0, v0

    .line 177
    iget-object v1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 178
    .line 179
    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 180
    .line 181
    invoke-static {v1, v0}, Ly/B;->s(Landroid/view/View;F)V

    .line 182
    .line 183
    .line 184
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-class v0, Le/E;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, " can only be used with a compatible window decor layout"

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_3

    .line 219
    :cond_9
    const-string v0, "null"

    .line 220
    .line 221
    :goto_3
    const-string v1, "Can\'t make a decor toolbar out of "

    .line 222
    .line 223
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p1
.end method

.method public final T(Z)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Le/E;->w:Z

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
    iget-object v1, p0, Le/E;->t:Li/o0;

    .line 12
    .line 13
    check-cast v1, Li/m1;

    .line 14
    .line 15
    iget v2, v1, Li/m1;->b:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    iput-boolean v3, p0, Le/E;->w:Z

    .line 19
    .line 20
    and-int/2addr p1, v0

    .line 21
    and-int/lit8 v0, v2, -0x5

    .line 22
    .line 23
    or-int/2addr p1, v0

    .line 24
    invoke-virtual {v1, p1}, Li/m1;->a(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final U(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 5
    .line 6
    check-cast p1, Li/m1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Li/Q0;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Li/Q0;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 23
    .line 24
    check-cast p1, Li/m1;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Le/E;->t:Li/o0;

    .line 35
    .line 36
    check-cast p1, Li/m1;

    .line 37
    .line 38
    iget-object p1, p1, Li/m1;->a:Landroidx/appcompat/widget/Toolbar;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final V(Z)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Le/E;->E:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Le/E;->F:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Le/E;->G:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    move v0, v4

    .line 18
    goto :goto_2

    .line 19
    :cond_2
    :goto_1
    move v0, v3

    .line 20
    :goto_2
    iget-object v1, p0, Le/E;->v:Landroid/view/View;

    .line 21
    .line 22
    const-wide/16 v5, 0xfa

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/high16 v7, 0x3f800000    # 1.0f

    .line 26
    .line 27
    iget-object v8, p0, Le/E;->N:LC/j;

    .line 28
    .line 29
    if-eqz v0, :cond_f

    .line 30
    .line 31
    iget-boolean v0, p0, Le/E;->H:Z

    .line 32
    .line 33
    if-nez v0, :cond_1b

    .line 34
    .line 35
    iput-boolean v4, p0, Le/E;->H:Z

    .line 36
    .line 37
    iget-object v0, p0, Le/E;->I:Lg/k;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0}, Lg/k;->a()V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object v0, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Le/E;->C:I

    .line 50
    .line 51
    iget-object v9, p0, Le/E;->M:Le/C;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    if-nez v0, :cond_d

    .line 55
    .line 56
    iget-boolean v0, p0, Le/E;->J:Z

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    if-eqz p1, :cond_d

    .line 61
    .line 62
    :cond_4
    iget-object v0, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 63
    .line 64
    invoke-virtual {v0, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    neg-int v0, v0

    .line 74
    int-to-float v0, v0

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    filled-new-array {v3, v3}, [I

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v3, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 82
    .line 83
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 84
    .line 85
    .line 86
    aget p1, p1, v4

    .line 87
    .line 88
    int-to-float p1, p1

    .line 89
    sub-float/2addr v0, p1

    .line 90
    :cond_5
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 93
    .line 94
    .line 95
    new-instance p1, Lg/k;

    .line 96
    .line 97
    invoke-direct {p1}, Lg/k;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 101
    .line 102
    invoke-static {v3}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3, v10}, Ly/S;->e(F)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v3, Ly/S;->a:Ljava/lang/ref/WeakReference;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Landroid/view/View;

    .line 116
    .line 117
    if-eqz v4, :cond_7

    .line 118
    .line 119
    if-eqz v8, :cond_6

    .line 120
    .line 121
    new-instance v2, Ly/Q;

    .line 122
    .line 123
    invoke-direct {v2, v8, v4}, Ly/Q;-><init>(LC/j;Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4, v2}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-boolean v2, p1, Lg/k;->e:Z

    .line 134
    .line 135
    iget-object v4, p1, Lg/k;->a:Ljava/util/ArrayList;

    .line 136
    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_8
    iget-boolean v2, p0, Le/E;->D:Z

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    if-eqz v1, :cond_9

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0, v10}, Ly/S;->e(F)V

    .line 156
    .line 157
    .line 158
    iget-boolean v1, p1, Lg/k;->e:Z

    .line 159
    .line 160
    if-nez v1, :cond_9

    .line 161
    .line 162
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :cond_9
    sget-object v0, Le/E;->P:Landroid/view/animation/DecelerateInterpolator;

    .line 166
    .line 167
    iget-boolean v1, p1, Lg/k;->e:Z

    .line 168
    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    iput-object v0, p1, Lg/k;->c:Landroid/view/animation/BaseInterpolator;

    .line 172
    .line 173
    :cond_a
    if-nez v1, :cond_b

    .line 174
    .line 175
    iput-wide v5, p1, Lg/k;->b:J

    .line 176
    .line 177
    :cond_b
    if-nez v1, :cond_c

    .line 178
    .line 179
    iput-object v9, p1, Lg/k;->d:Lb1/h;

    .line 180
    .line 181
    :cond_c
    iput-object p1, p0, Le/E;->I:Lg/k;

    .line 182
    .line 183
    invoke-virtual {p1}, Lg/k;->b()V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_d
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 188
    .line 189
    invoke-virtual {p1, v7}, Landroid/view/View;->setAlpha(F)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 193
    .line 194
    invoke-virtual {p1, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 195
    .line 196
    .line 197
    iget-boolean p1, p0, Le/E;->D:Z

    .line 198
    .line 199
    if-eqz p1, :cond_e

    .line 200
    .line 201
    if-eqz v1, :cond_e

    .line 202
    .line 203
    invoke-virtual {v1, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 204
    .line 205
    .line 206
    :cond_e
    invoke-virtual {v9}, Le/C;->a()V

    .line 207
    .line 208
    .line 209
    :goto_3
    iget-object p1, p0, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 210
    .line 211
    if-eqz p1, :cond_1b

    .line 212
    .line 213
    sget-object v0, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 214
    .line 215
    invoke-static {p1}, Ly/z;->c(Landroid/view/View;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_f
    iget-boolean v0, p0, Le/E;->H:Z

    .line 220
    .line 221
    if-eqz v0, :cond_1b

    .line 222
    .line 223
    iput-boolean v3, p0, Le/E;->H:Z

    .line 224
    .line 225
    iget-object v0, p0, Le/E;->I:Lg/k;

    .line 226
    .line 227
    if-eqz v0, :cond_10

    .line 228
    .line 229
    invoke-virtual {v0}, Lg/k;->a()V

    .line 230
    .line 231
    .line 232
    :cond_10
    iget v0, p0, Le/E;->C:I

    .line 233
    .line 234
    iget-object v9, p0, Le/E;->L:Le/C;

    .line 235
    .line 236
    if-nez v0, :cond_1a

    .line 237
    .line 238
    iget-boolean v0, p0, Le/E;->J:Z

    .line 239
    .line 240
    if-nez v0, :cond_11

    .line 241
    .line 242
    if-eqz p1, :cond_1a

    .line 243
    .line 244
    :cond_11
    iget-object v0, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 245
    .line 246
    invoke-virtual {v0, v7}, Landroid/view/View;->setAlpha(F)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 250
    .line 251
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lg/k;

    .line 255
    .line 256
    invoke-direct {v0}, Lg/k;-><init>()V

    .line 257
    .line 258
    .line 259
    iget-object v7, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 260
    .line 261
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    neg-int v7, v7

    .line 266
    int-to-float v7, v7

    .line 267
    if-eqz p1, :cond_12

    .line 268
    .line 269
    filled-new-array {v3, v3}, [I

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iget-object v3, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 274
    .line 275
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 276
    .line 277
    .line 278
    aget p1, p1, v4

    .line 279
    .line 280
    int-to-float p1, p1

    .line 281
    sub-float/2addr v7, p1

    .line 282
    :cond_12
    iget-object p1, p0, Le/E;->s:Landroidx/appcompat/widget/ActionBarContainer;

    .line 283
    .line 284
    invoke-static {p1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-virtual {p1, v7}, Ly/S;->e(F)V

    .line 289
    .line 290
    .line 291
    iget-object v3, p1, Ly/S;->a:Ljava/lang/ref/WeakReference;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, Landroid/view/View;

    .line 298
    .line 299
    if-eqz v3, :cond_14

    .line 300
    .line 301
    if-eqz v8, :cond_13

    .line 302
    .line 303
    new-instance v2, Ly/Q;

    .line 304
    .line 305
    invoke-direct {v2, v8, v3}, Ly/Q;-><init>(LC/j;Landroid/view/View;)V

    .line 306
    .line 307
    .line 308
    :cond_13
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 313
    .line 314
    .line 315
    :cond_14
    iget-boolean v2, v0, Lg/k;->e:Z

    .line 316
    .line 317
    iget-object v3, v0, Lg/k;->a:Ljava/util/ArrayList;

    .line 318
    .line 319
    if-nez v2, :cond_15

    .line 320
    .line 321
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    :cond_15
    iget-boolean p1, p0, Le/E;->D:Z

    .line 325
    .line 326
    if-eqz p1, :cond_16

    .line 327
    .line 328
    if-eqz v1, :cond_16

    .line 329
    .line 330
    invoke-static {v1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {p1, v7}, Ly/S;->e(F)V

    .line 335
    .line 336
    .line 337
    iget-boolean v1, v0, Lg/k;->e:Z

    .line 338
    .line 339
    if-nez v1, :cond_16

    .line 340
    .line 341
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    :cond_16
    sget-object p1, Le/E;->O:Landroid/view/animation/AccelerateInterpolator;

    .line 345
    .line 346
    iget-boolean v1, v0, Lg/k;->e:Z

    .line 347
    .line 348
    if-nez v1, :cond_17

    .line 349
    .line 350
    iput-object p1, v0, Lg/k;->c:Landroid/view/animation/BaseInterpolator;

    .line 351
    .line 352
    :cond_17
    if-nez v1, :cond_18

    .line 353
    .line 354
    iput-wide v5, v0, Lg/k;->b:J

    .line 355
    .line 356
    :cond_18
    if-nez v1, :cond_19

    .line 357
    .line 358
    iput-object v9, v0, Lg/k;->d:Lb1/h;

    .line 359
    .line 360
    :cond_19
    iput-object v0, p0, Le/E;->I:Lg/k;

    .line 361
    .line 362
    invoke-virtual {v0}, Lg/k;->b()V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :cond_1a
    invoke-virtual {v9}, Le/C;->a()V

    .line 367
    .line 368
    .line 369
    :cond_1b
    return-void
.end method
