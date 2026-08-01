.class public final Landroidx/fragment/app/a;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ld4;

.field public final b:Lr5;

.field public final c:Lol;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Ld4;Lr5;Ljava/lang/ClassLoader;Lvl;Lem;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/a;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/a;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 12
    iget-object p1, p5, Lem;->a:Ljava/lang/String;

    invoke-virtual {p4, p1}, Lvl;->a(Ljava/lang/String;)Lol;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 13
    iget-object p2, p5, Lem;->j:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, Lol;->C(Landroid/os/Bundle;)V

    .line 16
    iget-object p2, p5, Lem;->b:Ljava/lang/String;

    iput-object p2, p1, Lol;->e:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, Lem;->c:Z

    iput-boolean p2, p1, Lol;->m:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, Lol;->o:Z

    .line 19
    iget p2, p5, Lem;->d:I

    iput p2, p1, Lol;->v:I

    .line 20
    iget p2, p5, Lem;->e:I

    iput p2, p1, Lol;->w:I

    .line 21
    iget-object p2, p5, Lem;->f:Ljava/lang/String;

    iput-object p2, p1, Lol;->x:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, Lem;->g:Z

    iput-boolean p2, p1, Lol;->A:Z

    .line 23
    iget-boolean p2, p5, Lem;->h:Z

    iput-boolean p2, p1, Lol;->l:Z

    .line 24
    iget-boolean p2, p5, Lem;->i:Z

    iput-boolean p2, p1, Lol;->z:Z

    .line 25
    iget-boolean p2, p5, Lem;->k:Z

    iput-boolean p2, p1, Lol;->y:Z

    .line 26
    invoke-static {}, Lnq;->values()[Lnq;

    move-result-object p2

    iget p3, p5, Lem;->l:I

    aget-object p2, p2, p3

    iput-object p2, p1, Lol;->K:Lnq;

    .line 27
    iget-object p2, p5, Lem;->m:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 28
    iput-object p2, p1, Lol;->b:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Lol;->b:Landroid/os/Bundle;

    :goto_0
    const/4 p2, 0x2

    .line 30
    invoke-static {p2}, Lam;->A(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 31
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Instantiated fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public constructor <init>(Ld4;Lr5;Lol;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/a;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/a;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/a;->c:Lol;

    return-void
.end method

.method public constructor <init>(Ld4;Lr5;Lol;Lem;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Landroidx/fragment/app/a;->d:Z

    const/4 v1, -0x1

    .line 34
    iput v1, p0, Landroidx/fragment/app/a;->e:I

    .line 35
    iput-object p1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 36
    iput-object p2, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 37
    iput-object p3, p0, Landroidx/fragment/app/a;->c:Lol;

    const/4 p1, 0x0

    .line 38
    iput-object p1, p3, Lol;->c:Landroid/util/SparseArray;

    .line 39
    iput-object p1, p3, Lol;->d:Landroid/os/Bundle;

    .line 40
    iput v0, p3, Lol;->q:I

    .line 41
    iput-boolean v0, p3, Lol;->n:Z

    .line 42
    iput-boolean v0, p3, Lol;->k:Z

    .line 43
    iget-object p2, p3, Lol;->g:Lol;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lol;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Lol;->h:Ljava/lang/String;

    .line 44
    iput-object p1, p3, Lol;->g:Lol;

    .line 45
    iget-object p1, p4, Lem;->m:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 46
    iput-object p1, p3, Lol;->b:Landroid/os/Bundle;

    return-void

    .line 47
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Lol;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Lol;->b:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object v1, v3, Lol;->t:Lam;

    .line 32
    .line 33
    invoke-virtual {v1}, Lam;->F()V

    .line 34
    .line 35
    .line 36
    iput v0, v3, Lol;->a:I

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, v3, Lol;->C:Z

    .line 40
    .line 41
    invoke-static {v0}, Lam;->A(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "moveto RESTORE_VIEW_STATE: "

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, v3, Lol;->E:Landroid/view/View;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    iget-object v4, v3, Lol;->b:Landroid/os/Bundle;

    .line 71
    .line 72
    iget-object v5, v3, Lol;->c:Landroid/util/SparseArray;

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v5}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 77
    .line 78
    .line 79
    iput-object v2, v3, Lol;->c:Landroid/util/SparseArray;

    .line 80
    .line 81
    :cond_2
    iget-object v0, v3, Lol;->E:Landroid/view/View;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    iget-object v0, v3, Lol;->M:Lhm;

    .line 86
    .line 87
    iget-object v5, v3, Lol;->d:Landroid/os/Bundle;

    .line 88
    .line 89
    iget-object v0, v0, Lhm;->c:Lim;

    .line 90
    .line 91
    invoke-virtual {v0, v5}, Lim;->b(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, v3, Lol;->d:Landroid/os/Bundle;

    .line 95
    .line 96
    :cond_3
    iput-boolean v1, v3, Lol;->C:Z

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Lol;->u(Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    iget-boolean v0, v3, Lol;->C:Z

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    iget-object v0, v3, Lol;->E:Landroid/view/View;

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    iget-object v0, v3, Lol;->M:Lhm;

    .line 110
    .line 111
    sget-object v4, Lmq;->ON_CREATE:Lmq;

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Lhm;->c(Lmq;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    new-instance v0, Lm50;

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "Fragment "

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v2, " did not call through to super.onViewStateRestored()"

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :cond_5
    :goto_0
    iput-object v2, v3, Lol;->b:Landroid/os/Bundle;

    .line 143
    .line 144
    iget-object v0, v3, Lol;->t:Lam;

    .line 145
    .line 146
    iput-boolean v1, v0, Lam;->y:Z

    .line 147
    .line 148
    iput-boolean v1, v0, Lam;->z:Z

    .line 149
    .line 150
    iget-object v2, v0, Lam;->F:Lcm;

    .line 151
    .line 152
    iput-boolean v1, v2, Lcm;->h:Z

    .line 153
    .line 154
    const/4 v2, 0x4

    .line 155
    invoke-virtual {v0, v2}, Lam;->p(I)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ld4;->c(Z)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 2
    .line 3
    iget-object v0, v0, Lr5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 8
    .line 9
    iget-object v2, v1, Lol;->D:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/lit8 v5, v4, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v5, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lol;

    .line 28
    .line 29
    iget-object v7, v6, Lol;->D:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-ne v7, v2, :cond_1

    .line 32
    .line 33
    iget-object v6, v6, Lol;->E:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ge v4, v5, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lol;

    .line 60
    .line 61
    iget-object v6, v5, Lol;->D:Landroid/view/ViewGroup;

    .line 62
    .line 63
    if-ne v6, v2, :cond_3

    .line 64
    .line 65
    iget-object v5, v5, Lol;->E:Landroid/view/View;

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    iget-object v0, v1, Lol;->D:Landroid/view/ViewGroup;

    .line 76
    .line 77
    iget-object v1, v1, Lol;->E:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lol;->g:Lol;

    .line 30
    .line 31
    const-string v2, " that does not belong to this FragmentManager!"

    .line 32
    .line 33
    const-string v3, " declared target fragment "

    .line 34
    .line 35
    iget-object v4, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Lol;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v4, Lr5;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroidx/fragment/app/a;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v2, v1, Lol;->g:Lol;

    .line 57
    .line 58
    iget-object v2, v2, Lol;->e:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v2, v1, Lol;->h:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v5, v1, Lol;->g:Lol;

    .line 63
    .line 64
    move-object v5, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, v1, Lol;->g:Lol;

    .line 80
    .line 81
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_2
    iget-object v0, v1, Lol;->h:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v4, v4, Lr5;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v5, v0

    .line 108
    check-cast v5, Landroidx/fragment/app/a;

    .line 109
    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    new-instance v4, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget-object v1, v1, Lol;->h:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v4, v1, v2}, Lg40;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_4
    :goto_0
    if-eqz v5, :cond_5

    .line 137
    .line 138
    invoke-virtual {v5}, Landroidx/fragment/app/a;->k()V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object v0, v1, Lol;->r:Lam;

    .line 142
    .line 143
    iget-object v2, v0, Lam;->n:Lpl;

    .line 144
    .line 145
    iput-object v2, v1, Lol;->s:Lpl;

    .line 146
    .line 147
    iget-object v0, v0, Lam;->p:Lol;

    .line 148
    .line 149
    iput-object v0, v1, Lol;->u:Lol;

    .line 150
    .line 151
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 152
    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-virtual {v0, v2}, Ld4;->j(Z)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v1, Lol;->P:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_8

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 170
    .line 171
    .line 172
    iget-object v3, v1, Lol;->t:Lam;

    .line 173
    .line 174
    iget-object v4, v1, Lol;->s:Lpl;

    .line 175
    .line 176
    invoke-virtual {v1}, Lol;->c()Lgf;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v3, v4, v5, v1}, Lam;->b(Lpl;Lgf;Lol;)V

    .line 181
    .line 182
    .line 183
    iput v2, v1, Lol;->a:I

    .line 184
    .line 185
    iput-boolean v2, v1, Lol;->C:Z

    .line 186
    .line 187
    iget-object v3, v1, Lol;->s:Lpl;

    .line 188
    .line 189
    iget-object v3, v3, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Lol;->l(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    iget-boolean v3, v1, Lol;->C:Z

    .line 195
    .line 196
    if-eqz v3, :cond_7

    .line 197
    .line 198
    iget-object v3, v1, Lol;->r:Lam;

    .line 199
    .line 200
    iget-object v3, v3, Lam;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_6

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ldm;

    .line 217
    .line 218
    invoke-interface {v4}, Ldm;->a()V

    .line 219
    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_6
    iget-object v1, v1, Lol;->t:Lam;

    .line 223
    .line 224
    iput-boolean v2, v1, Lam;->y:Z

    .line 225
    .line 226
    iput-boolean v2, v1, Lam;->z:Z

    .line 227
    .line 228
    iget-object v3, v1, Lam;->F:Lcm;

    .line 229
    .line 230
    iput-boolean v2, v3, Lcm;->h:Z

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Lam;->p(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, Ld4;->d(Z)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_7
    new-instance v0, Lm50;

    .line 240
    .line 241
    new-instance v2, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v1, " did not call through to super.onAttach()"

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_8
    invoke-static {v4}, Lg40;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    throw v0
.end method

.method public final d()I
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 2
    .line 3
    iget-object v1, v0, Lol;->r:Lam;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lol;->a:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/a;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Lol;->K:Lnq;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x5

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x3

    .line 22
    const/4 v7, 0x4

    .line 23
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_3

    .line 26
    .line 27
    if-eq v2, v8, :cond_2

    .line 28
    .line 29
    if-eq v2, v6, :cond_1

    .line 30
    .line 31
    if-eq v2, v7, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Lol;->m:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Lol;->n:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/a;->e:I

    .line 61
    .line 62
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Lol;->E:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Landroidx/fragment/app/a;->e:I

    .line 82
    .line 83
    if-ge v2, v7, :cond_6

    .line 84
    .line 85
    iget v2, v0, Lol;->a:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Lol;->k:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, Lol;->D:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_e

    .line 107
    .line 108
    invoke-virtual {v0}, Lol;->j()Lam;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, Lam;->y()Lxh;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2, v0}, Ldg;->d(Lol;)Ln40;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    iget v10, v10, Ln40;->b:I

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    move v10, v3

    .line 130
    :goto_2
    iget-object v2, v2, Ldg;->c:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    :cond_a
    if-ge v3, v11, :cond_b

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    check-cast v12, Ln40;

    .line 145
    .line 146
    iget-object v13, v12, Ln40;->c:Lol;

    .line 147
    .line 148
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_a

    .line 153
    .line 154
    iget-boolean v13, v12, Ln40;->f:Z

    .line 155
    .line 156
    if-nez v13, :cond_a

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_b
    const/4 v12, 0x0

    .line 160
    :goto_3
    if-eqz v12, :cond_d

    .line 161
    .line 162
    if-eqz v10, :cond_c

    .line 163
    .line 164
    if-ne v10, v9, :cond_d

    .line 165
    .line 166
    :cond_c
    iget v2, v12, Ln40;->b:I

    .line 167
    .line 168
    move v3, v2

    .line 169
    goto :goto_4

    .line 170
    :cond_d
    move v3, v10

    .line 171
    :cond_e
    :goto_4
    if-ne v3, v8, :cond_f

    .line 172
    .line 173
    const/4 v2, 0x6

    .line 174
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    goto :goto_5

    .line 179
    :cond_f
    if-ne v3, v6, :cond_10

    .line 180
    .line 181
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    goto :goto_5

    .line 186
    :cond_10
    iget-boolean v2, v0, Lol;->l:Z

    .line 187
    .line 188
    if-eqz v2, :cond_12

    .line 189
    .line 190
    iget v2, v0, Lol;->q:I

    .line 191
    .line 192
    if-lez v2, :cond_11

    .line 193
    .line 194
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    goto :goto_5

    .line 199
    :cond_11
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    :cond_12
    :goto_5
    iget-boolean v2, v0, Lol;->F:Z

    .line 204
    .line 205
    if-eqz v2, :cond_13

    .line 206
    .line 207
    iget v2, v0, Lol;->a:I

    .line 208
    .line 209
    if-ge v2, v4, :cond_13

    .line 210
    .line 211
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    :cond_13
    invoke-static {v8}, Lam;->A(I)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_14

    .line 220
    .line 221
    new-instance v2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v3, "computeExpectedState() of "

    .line 224
    .line 225
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v3, " for "

    .line 232
    .line 233
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    const-string v2, "FragmentManager"

    .line 244
    .line 245
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    :cond_14
    return v1
.end method

.method public final e()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, Lol;->J:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ld4;->k(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v1, Lol;->b:Landroid/os/Bundle;

    .line 41
    .line 42
    iget-object v5, v1, Lol;->t:Lam;

    .line 43
    .line 44
    invoke-virtual {v5}, Lam;->F()V

    .line 45
    .line 46
    .line 47
    iput v2, v1, Lol;->a:I

    .line 48
    .line 49
    iput-boolean v3, v1, Lol;->C:Z

    .line 50
    .line 51
    iget-object v5, v1, Lol;->L:Landroidx/lifecycle/a;

    .line 52
    .line 53
    new-instance v6, Landroidx/fragment/app/Fragment$5;

    .line 54
    .line 55
    invoke-direct {v6, v1}, Landroidx/fragment/app/Fragment$5;-><init>(Lol;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v6}, Landroidx/lifecycle/a;->a(Lrq;)V

    .line 59
    .line 60
    .line 61
    iget-object v5, v1, Lol;->O:Lim;

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Lim;->b(Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, Lol;->m(Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v2, v1, Lol;->J:Z

    .line 70
    .line 71
    iget-boolean v2, v1, Lol;->C:Z

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    iget-object v1, v1, Lol;->L:Landroidx/lifecycle/a;

    .line 76
    .line 77
    sget-object v2, Lmq;->ON_CREATE:Lmq;

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ld4;->f(Z)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    new-instance v0, Lm50;

    .line 87
    .line 88
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v3, "Fragment "

    .line 91
    .line 92
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, " did not call through to super.onCreate()"

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_2
    iget-object v0, v1, Lol;->b:Landroid/os/Bundle;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    const-string v4, "android:support:fragments"

    .line 116
    .line 117
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    iget-object v4, v1, Lol;->t:Lam;

    .line 124
    .line 125
    invoke-virtual {v4, v0}, Lam;->K(Landroid/os/Parcelable;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v1, Lol;->t:Lam;

    .line 129
    .line 130
    iput-boolean v3, v0, Lam;->y:Z

    .line 131
    .line 132
    iput-boolean v3, v0, Lam;->z:Z

    .line 133
    .line 134
    iget-object v4, v0, Lam;->F:Lcm;

    .line 135
    .line 136
    iput-boolean v3, v4, Lcm;->h:Z

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Lam;->p(I)V

    .line 139
    .line 140
    .line 141
    :cond_3
    iput v2, v1, Lol;->a:I

    .line 142
    .line 143
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 2
    .line 3
    iget-boolean v1, v0, Lol;->m:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, Lam;->A(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "FragmentManager"

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "moveto CREATE_VIEW: "

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v1, v0, Lol;->b:Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lol;->q(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v3, v0, Lol;->D:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget v3, v0, Lol;->w:I

    .line 46
    .line 47
    if-eqz v3, :cond_5

    .line 48
    .line 49
    const/4 v4, -0x1

    .line 50
    if-eq v3, v4, :cond_4

    .line 51
    .line 52
    iget-object v4, v0, Lol;->r:Lam;

    .line 53
    .line 54
    iget-object v4, v4, Lam;->o:Lgf;

    .line 55
    .line 56
    invoke-virtual {v4, v3}, Lgf;->K(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Landroid/view/ViewGroup;

    .line 61
    .line 62
    if-nez v3, :cond_6

    .line 63
    .line 64
    iget-boolean v4, v0, Lol;->o:Z

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Lol;->z()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget v2, v0, Lol;->w:I

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 84
    :catch_0
    const-string v1, "unknown"

    .line 85
    .line 86
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v4, "No view found for id 0x"

    .line 91
    .line 92
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget v4, v0, Lol;->w:I

    .line 96
    .line 97
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, " ("

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ") for fragment "

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v2

    .line 128
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v3, "Cannot create fragment "

    .line 133
    .line 134
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v0, " for a container view with no id"

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1

    .line 153
    :cond_5
    const/4 v3, 0x0

    .line 154
    :cond_6
    :goto_1
    iput-object v3, v0, Lol;->D:Landroid/view/ViewGroup;

    .line 155
    .line 156
    iget-object v4, v0, Lol;->b:Landroid/os/Bundle;

    .line 157
    .line 158
    invoke-virtual {v0, v1, v3, v4}, Lol;->v(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 162
    .line 163
    const/4 v4, 0x2

    .line 164
    if-eqz v1, :cond_b

    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 171
    .line 172
    const v6, 0x7f0900ac

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    if-eqz v3, :cond_7

    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/fragment/app/a;->b()V

    .line 181
    .line 182
    .line 183
    :cond_7
    iget-boolean v1, v0, Lol;->y:Z

    .line 184
    .line 185
    if-eqz v1, :cond_8

    .line 186
    .line 187
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 188
    .line 189
    const/16 v3, 0x8

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 195
    .line 196
    sget-object v3, Loa0;->a:Ljava/util/WeakHashMap;

    .line 197
    .line 198
    invoke-static {v1}, Laa0;->b(Landroid/view/View;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 205
    .line 206
    invoke-static {v1}, Lba0;->c(Landroid/view/View;)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_9
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 211
    .line 212
    new-instance v3, Lfm;

    .line 213
    .line 214
    invoke-direct {v3, v1, v5}, Lfm;-><init>(Landroid/view/View;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    iget-object v1, v0, Lol;->t:Lam;

    .line 221
    .line 222
    invoke-virtual {v1, v4}, Lam;->p(I)V

    .line 223
    .line 224
    .line 225
    iget-object v1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 226
    .line 227
    invoke-virtual {v1, v5}, Ld4;->p(Z)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 231
    .line 232
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    iget-object v3, v0, Lol;->E:Landroid/view/View;

    .line 237
    .line 238
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v0}, Lol;->f()Lnl;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    iput v3, v5, Lnl;->j:F

    .line 247
    .line 248
    iget-object v3, v0, Lol;->D:Landroid/view/ViewGroup;

    .line 249
    .line 250
    if-eqz v3, :cond_b

    .line 251
    .line 252
    if-nez v1, :cond_b

    .line 253
    .line 254
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    if-eqz v1, :cond_a

    .line 261
    .line 262
    invoke-virtual {v0}, Lol;->f()Lnl;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    iput-object v1, v3, Lnl;->k:Landroid/view/View;

    .line 267
    .line 268
    invoke-static {v4}, Lam;->A(I)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_a

    .line 273
    .line 274
    new-instance v3, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v5, "requestFocus: Saved focused view "

    .line 277
    .line 278
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v1, " for Fragment "

    .line 285
    .line 286
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    :cond_a
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 300
    .line 301
    const/4 v2, 0x0

    .line 302
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 303
    .line 304
    .line 305
    :cond_b
    iput v4, v0, Lol;->a:I

    .line 306
    .line 307
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v1, v3, Lol;->l:Z

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget v1, v3, Lol;->q:I

    .line 36
    .line 37
    if-lez v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    move v1, v4

    .line 43
    :goto_1
    iget-object v6, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 44
    .line 45
    if-nez v1, :cond_7

    .line 46
    .line 47
    iget-object v7, v6, Lr5;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Lcm;

    .line 50
    .line 51
    iget-object v8, v7, Lcm;->c:Ljava/util/HashMap;

    .line 52
    .line 53
    iget-object v9, v3, Lol;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-nez v8, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iget-boolean v8, v7, Lcm;->f:Z

    .line 63
    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    iget-boolean v7, v7, Lcm;->g:Z

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move v7, v5

    .line 70
    :goto_3
    if-eqz v7, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    iget-object v0, v3, Lol;->h:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {v6, v0}, Lr5;->g(Ljava/lang/String;)Lol;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-boolean v1, v0, Lol;->A:Z

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    iput-object v0, v3, Lol;->g:Lol;

    .line 88
    .line 89
    :cond_6
    iput v4, v3, Lol;->a:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_7
    :goto_4
    iget-object v7, v3, Lol;->s:Lpl;

    .line 93
    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    iget-object v7, v6, Lr5;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v7, Lcm;

    .line 99
    .line 100
    iget-boolean v7, v7, Lcm;->g:Z

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    iget-object v7, v7, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 104
    .line 105
    if-eqz v7, :cond_9

    .line 106
    .line 107
    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    xor-int/2addr v7, v5

    .line 112
    goto :goto_5

    .line 113
    :cond_9
    move v7, v5

    .line 114
    :goto_5
    if-nez v1, :cond_a

    .line 115
    .line 116
    if-eqz v7, :cond_d

    .line 117
    .line 118
    :cond_a
    iget-object v1, v6, Lr5;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lcm;

    .line 121
    .line 122
    iget-object v7, v1, Lcm;->e:Ljava/util/HashMap;

    .line 123
    .line 124
    iget-object v1, v1, Lcm;->d:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-static {v0}, Lam;->A(I)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_b

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v8, "Clearing non-config state for "

    .line 135
    .line 136
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    :cond_b
    iget-object v0, v3, Lol;->e:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lcm;

    .line 156
    .line 157
    if-eqz v0, :cond_c

    .line 158
    .line 159
    invoke-virtual {v0}, Lcm;->a()V

    .line 160
    .line 161
    .line 162
    iget-object v0, v3, Lol;->e:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    :cond_c
    iget-object v0, v3, Lol;->e:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lwa0;

    .line 174
    .line 175
    if-eqz v0, :cond_d

    .line 176
    .line 177
    invoke-virtual {v0}, Lwa0;->a()V

    .line 178
    .line 179
    .line 180
    iget-object v0, v3, Lol;->e:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_d
    iget-object v0, v3, Lol;->t:Lam;

    .line 186
    .line 187
    invoke-virtual {v0}, Lam;->k()V

    .line 188
    .line 189
    .line 190
    iget-object v0, v3, Lol;->L:Landroidx/lifecycle/a;

    .line 191
    .line 192
    sget-object v1, Lmq;->ON_DESTROY:Lmq;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 195
    .line 196
    .line 197
    iput v4, v3, Lol;->a:I

    .line 198
    .line 199
    iput-boolean v4, v3, Lol;->J:Z

    .line 200
    .line 201
    iput-boolean v5, v3, Lol;->C:Z

    .line 202
    .line 203
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 204
    .line 205
    invoke-virtual {v0, v4}, Ld4;->g(Z)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6}, Lr5;->i()Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    :cond_e
    :goto_6
    if-ge v4, v1, :cond_f

    .line 217
    .line 218
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    add-int/lit8 v4, v4, 0x1

    .line 223
    .line 224
    check-cast v2, Landroidx/fragment/app/a;

    .line 225
    .line 226
    if-eqz v2, :cond_e

    .line 227
    .line 228
    iget-object v2, v2, Landroidx/fragment/app/a;->c:Lol;

    .line 229
    .line 230
    iget-object v5, v3, Lol;->e:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v7, v2, Lol;->h:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_e

    .line 239
    .line 240
    iput-object v3, v2, Lol;->g:Lol;

    .line 241
    .line 242
    const/4 v5, 0x0

    .line 243
    iput-object v5, v2, Lol;->h:Ljava/lang/String;

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_f
    iget-object v0, v3, Lol;->h:Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v0, :cond_10

    .line 249
    .line 250
    invoke-virtual {v6, v0}, Lr5;->g(Ljava/lang/String;)Lol;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iput-object v0, v3, Lol;->g:Lol;

    .line 255
    .line 256
    :cond_10
    invoke-virtual {v6, p0}, Lr5;->w(Landroidx/fragment/app/a;)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lol;->D:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Lol;->E:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, v1, Lol;->t:Lam;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, v2}, Lam;->p(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Lol;->E:Landroid/view/View;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, Lol;->M:Lhm;

    .line 51
    .line 52
    invoke-virtual {v0}, Lhm;->f()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Lhm;->b:Landroidx/lifecycle/a;

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/lifecycle/a;->c:Lnq;

    .line 58
    .line 59
    sget-object v3, Lnq;->c:Lnq;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-ltz v0, :cond_2

    .line 66
    .line 67
    iget-object v0, v1, Lol;->M:Lhm;

    .line 68
    .line 69
    sget-object v3, Lmq;->ON_DESTROY:Lmq;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lhm;->c(Lmq;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput v2, v1, Lol;->a:I

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, v1, Lol;->C:Z

    .line 78
    .line 79
    invoke-virtual {v1}, Lol;->o()V

    .line 80
    .line 81
    .line 82
    iget-boolean v2, v1, Lol;->C:Z

    .line 83
    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    invoke-interface {v1}, Lxa0;->d()Lwa0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "store"

    .line 91
    .line 92
    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v3, Lte;->b:Lte;

    .line 96
    .line 97
    const-string v4, "defaultCreationExtras"

    .line 98
    .line 99
    invoke-static {v4, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-class v4, Ltr;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    const-string v6, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 111
    .line 112
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const-string v6, "key"

    .line 117
    .line 118
    invoke-static {v6, v5}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, v2, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    check-cast v6, Lua0;

    .line 128
    .line 129
    invoke-virtual {v4, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    const-string v2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 136
    .line 137
    invoke-static {v2, v6}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 142
    .line 143
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v3, v3, Lue;->a:Ljava/util/LinkedHashMap;

    .line 147
    .line 148
    invoke-interface {v4, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 149
    .line 150
    .line 151
    sget-object v3, Lxh;->p:Lxh;

    .line 152
    .line 153
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :try_start_0
    new-instance v3, Ltr;

    .line 157
    .line 158
    invoke-direct {v3}, Ltr;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    :goto_0
    move-object v6, v3

    .line 162
    goto :goto_1

    .line 163
    :catch_0
    new-instance v3, Ltr;

    .line 164
    .line 165
    invoke-direct {v3}, Ltr;-><init>()V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :goto_1
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Lua0;

    .line 174
    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    invoke-virtual {v2}, Lua0;->a()V

    .line 178
    .line 179
    .line 180
    :cond_4
    :goto_2
    check-cast v6, Ltr;

    .line 181
    .line 182
    iget-object v2, v6, Ltr;->c:Ll40;

    .line 183
    .line 184
    iget v3, v2, Ll40;->c:I

    .line 185
    .line 186
    if-gtz v3, :cond_5

    .line 187
    .line 188
    iput-boolean v0, v1, Lol;->p:Z

    .line 189
    .line 190
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-virtual {v0, v2}, Ld4;->q(Z)V

    .line 194
    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    iput-object v0, v1, Lol;->D:Landroid/view/ViewGroup;

    .line 198
    .line 199
    iput-object v0, v1, Lol;->E:Landroid/view/View;

    .line 200
    .line 201
    iput-object v0, v1, Lol;->M:Lhm;

    .line 202
    .line 203
    iget-object v3, v1, Lol;->N:Landroidx/lifecycle/b;

    .line 204
    .line 205
    invoke-virtual {v3, v0}, Landroidx/lifecycle/b;->e(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iput-boolean v2, v1, Lol;->n:Z

    .line 209
    .line 210
    return-void

    .line 211
    :cond_5
    iget-object v1, v2, Ll40;->b:[Ljava/lang/Object;

    .line 212
    .line 213
    aget-object v0, v1, v0

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v0, Ljava/lang/ClassCastException;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 225
    .line 226
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 227
    .line 228
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :cond_7
    new-instance v0, Lm50;

    .line 233
    .line 234
    new-instance v2, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v3, "Fragment "

    .line 237
    .line 238
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v1, " did not call through to super.onDestroyView()"

    .line 245
    .line 246
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0
.end method

.method public final i()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom ATTACHED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, -0x1

    .line 30
    iput v1, v3, Lol;->a:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, Lol;->C:Z

    .line 34
    .line 35
    invoke-virtual {v3}, Lol;->p()V

    .line 36
    .line 37
    .line 38
    iget-boolean v5, v3, Lol;->C:Z

    .line 39
    .line 40
    if-eqz v5, :cond_8

    .line 41
    .line 42
    iget-object v5, v3, Lol;->t:Lam;

    .line 43
    .line 44
    iget-boolean v6, v5, Lam;->A:Z

    .line 45
    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, Lam;->k()V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lam;

    .line 52
    .line 53
    invoke-direct {v5}, Lam;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v5, v3, Lol;->t:Lam;

    .line 57
    .line 58
    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ld4;->h(Z)V

    .line 61
    .line 62
    .line 63
    iput v1, v3, Lol;->a:I

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-object v1, v3, Lol;->s:Lpl;

    .line 67
    .line 68
    iput-object v1, v3, Lol;->u:Lol;

    .line 69
    .line 70
    iput-object v1, v3, Lol;->r:Lam;

    .line 71
    .line 72
    iget-boolean v5, v3, Lol;->l:Z

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    iget v5, v3, Lol;->q:I

    .line 77
    .line 78
    if-lez v5, :cond_5

    .line 79
    .line 80
    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/a;->b:Lr5;

    .line 81
    .line 82
    iget-object v5, v5, Lr5;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lcm;

    .line 85
    .line 86
    iget-object v6, v5, Lcm;->c:Ljava/util/HashMap;

    .line 87
    .line 88
    iget-object v7, v3, Lol;->e:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    iget-boolean v6, v5, Lcm;->f:Z

    .line 98
    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    iget-boolean v5, v5, Lcm;->g:Z

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    :goto_0
    const/4 v5, 0x1

    .line 105
    :goto_1
    if-eqz v5, :cond_7

    .line 106
    .line 107
    :cond_5
    invoke-static {v0}, Lam;->A(I)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v5, "initState called for fragment: "

    .line 116
    .line 117
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    new-instance v0, Landroidx/lifecycle/a;

    .line 131
    .line 132
    invoke-direct {v0, v3}, Landroidx/lifecycle/a;-><init>(Lsq;)V

    .line 133
    .line 134
    .line 135
    iput-object v0, v3, Lol;->L:Landroidx/lifecycle/a;

    .line 136
    .line 137
    new-instance v0, Lim;

    .line 138
    .line 139
    invoke-direct {v0, v3}, Lim;-><init>(Lb20;)V

    .line 140
    .line 141
    .line 142
    iput-object v0, v3, Lol;->O:Lim;

    .line 143
    .line 144
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, v3, Lol;->e:Ljava/lang/String;

    .line 153
    .line 154
    iput-boolean v4, v3, Lol;->k:Z

    .line 155
    .line 156
    iput-boolean v4, v3, Lol;->l:Z

    .line 157
    .line 158
    iput-boolean v4, v3, Lol;->m:Z

    .line 159
    .line 160
    iput-boolean v4, v3, Lol;->n:Z

    .line 161
    .line 162
    iput-boolean v4, v3, Lol;->o:Z

    .line 163
    .line 164
    iput v4, v3, Lol;->q:I

    .line 165
    .line 166
    iput-object v1, v3, Lol;->r:Lam;

    .line 167
    .line 168
    new-instance v0, Lam;

    .line 169
    .line 170
    invoke-direct {v0}, Lam;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v0, v3, Lol;->t:Lam;

    .line 174
    .line 175
    iput-object v1, v3, Lol;->s:Lpl;

    .line 176
    .line 177
    iput v4, v3, Lol;->v:I

    .line 178
    .line 179
    iput v4, v3, Lol;->w:I

    .line 180
    .line 181
    iput-object v1, v3, Lol;->x:Ljava/lang/String;

    .line 182
    .line 183
    iput-boolean v4, v3, Lol;->y:Z

    .line 184
    .line 185
    iput-boolean v4, v3, Lol;->z:Z

    .line 186
    .line 187
    :cond_7
    return-void

    .line 188
    :cond_8
    new-instance v0, Lm50;

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v2, "Fragment "

    .line 193
    .line 194
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v2, " did not call through to super.onDetach()"

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 2
    .line 3
    iget-boolean v1, v0, Lol;->m:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Lol;->n:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Lol;->p:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Lam;->A(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, v0, Lol;->b:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lol;->q(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    iget-object v3, v0, Lol;->b:Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Lol;->v(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 62
    .line 63
    const v3, 0x7f0900ac

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v1, v0, Lol;->y:Z

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 74
    .line 75
    const/16 v3, 0x8

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v1, v0, Lol;->t:Lam;

    .line 81
    .line 82
    const/4 v3, 0x2

    .line 83
    invoke-virtual {v1, v3}, Lam;->p(I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ld4;->p(Z)V

    .line 89
    .line 90
    .line 91
    iput v3, v0, Lol;->a:I

    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/a;->d:Z

    .line 2
    .line 3
    const-string v1, "FragmentManager"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v2}, Lam;->A(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :cond_1
    const/4 v0, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/a;->d:Z

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/a;->d()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, v3, Lol;->a:I

    .line 43
    .line 44
    const/4 v7, 0x3

    .line 45
    if-eq v5, v6, :cond_9

    .line 46
    .line 47
    if-le v5, v6, :cond_4

    .line 48
    .line 49
    add-int/lit8 v6, v6, 0x1

    .line 50
    .line 51
    packed-switch v6, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/a;->n()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :pswitch_1
    const/4 v5, 0x6

    .line 63
    iput v5, v3, Lol;->a:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/a;->p()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_3
    iget-object v5, v3, Lol;->E:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    iget-object v5, v3, Lol;->D:Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {v3}, Lol;->j()Lam;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Lam;->y()Lxh;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v5, v6}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iget-object v6, v3, Lol;->E:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-static {v6}, Lg40;->b(I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-static {v2}, Lam;->A(I)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_2

    .line 105
    .line 106
    new-instance v7, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v8, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 109
    .line 110
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-virtual {v5, v6, v2, p0}, Ldg;->a(IILandroidx/fragment/app/a;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    const/4 v5, 0x4

    .line 127
    iput v5, v3, Lol;->a:I

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/a;->a()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/a;->j()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/a;->f()V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/a;->e()V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/a;->c()V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    add-int/lit8 v6, v6, -0x1

    .line 150
    .line 151
    packed-switch v6, :pswitch_data_1

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/a;->l()V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :pswitch_9
    const/4 v5, 0x5

    .line 160
    iput v5, v3, Lol;->a:I

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/a;->q()V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :pswitch_b
    invoke-static {v7}, Lam;->A(I)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_5

    .line 173
    .line 174
    new-instance v5, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v6, "movefrom ACTIVITY_CREATED: "

    .line 180
    .line 181
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-static {v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    :cond_5
    iget-object v5, v3, Lol;->E:Landroid/view/View;

    .line 195
    .line 196
    if-eqz v5, :cond_6

    .line 197
    .line 198
    iget-object v5, v3, Lol;->c:Landroid/util/SparseArray;

    .line 199
    .line 200
    if-nez v5, :cond_6

    .line 201
    .line 202
    invoke-virtual {p0}, Landroidx/fragment/app/a;->o()V

    .line 203
    .line 204
    .line 205
    :cond_6
    iget-object v5, v3, Lol;->E:Landroid/view/View;

    .line 206
    .line 207
    if-eqz v5, :cond_8

    .line 208
    .line 209
    iget-object v5, v3, Lol;->D:Landroid/view/ViewGroup;

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    invoke-virtual {v3}, Lol;->j()Lam;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-virtual {v6}, Lam;->y()Lxh;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-static {v5, v6}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-static {v2}, Lam;->A(I)Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-eqz v6, :cond_7

    .line 230
    .line 231
    new-instance v6, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 234
    .line 235
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    :cond_7
    invoke-virtual {v5, v0, v7, p0}, Ldg;->a(IILandroidx/fragment/app/a;)V

    .line 249
    .line 250
    .line 251
    :cond_8
    iput v7, v3, Lol;->a:I

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :pswitch_c
    iput-boolean v4, v3, Lol;->n:Z

    .line 256
    .line 257
    iput v2, v3, Lol;->a:I

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/a;->h()V

    .line 262
    .line 263
    .line 264
    iput v0, v3, Lol;->a:I

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/a;->g()V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/a;->i()V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_9
    iget-boolean v5, v3, Lol;->I:Z

    .line 279
    .line 280
    if-eqz v5, :cond_f

    .line 281
    .line 282
    iget-object v5, v3, Lol;->E:Landroid/view/View;

    .line 283
    .line 284
    if-eqz v5, :cond_d

    .line 285
    .line 286
    iget-object v5, v3, Lol;->D:Landroid/view/ViewGroup;

    .line 287
    .line 288
    if-eqz v5, :cond_d

    .line 289
    .line 290
    invoke-virtual {v3}, Lol;->j()Lam;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-virtual {v6}, Lam;->y()Lxh;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-static {v5, v6}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    iget-boolean v6, v3, Lol;->y:Z

    .line 303
    .line 304
    if-eqz v6, :cond_b

    .line 305
    .line 306
    invoke-static {v2}, Lam;->A(I)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_a

    .line 311
    .line 312
    new-instance v2, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 315
    .line 316
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    .line 328
    .line 329
    :cond_a
    invoke-virtual {v5, v7, v0, p0}, Ldg;->a(IILandroidx/fragment/app/a;)V

    .line 330
    .line 331
    .line 332
    goto :goto_1

    .line 333
    :cond_b
    invoke-static {v2}, Lam;->A(I)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_c

    .line 338
    .line 339
    new-instance v6, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 342
    .line 343
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    :cond_c
    invoke-virtual {v5, v2, v0, p0}, Ldg;->a(IILandroidx/fragment/app/a;)V

    .line 357
    .line 358
    .line 359
    :cond_d
    :goto_1
    iget-object v1, v3, Lol;->r:Lam;

    .line 360
    .line 361
    if-eqz v1, :cond_e

    .line 362
    .line 363
    iget-boolean v2, v3, Lol;->k:Z

    .line 364
    .line 365
    if-eqz v2, :cond_e

    .line 366
    .line 367
    invoke-static {v3}, Lam;->B(Lol;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_e

    .line 372
    .line 373
    iput-boolean v0, v1, Lam;->x:Z

    .line 374
    .line 375
    :cond_e
    iput-boolean v4, v3, Lol;->I:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    .line 377
    :cond_f
    iput-boolean v4, p0, Landroidx/fragment/app/a;->d:Z

    .line 378
    .line 379
    return-void

    .line 380
    :goto_2
    iput-boolean v4, p0, Landroidx/fragment/app/a;->d:Z

    .line 381
    .line 382
    throw v0

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lol;->t:Lam;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, Lam;->p(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Lol;->E:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, Lol;->M:Lhm;

    .line 40
    .line 41
    sget-object v2, Lmq;->ON_PAUSE:Lmq;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lhm;->c(Lmq;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Lol;->L:Landroidx/lifecycle/a;

    .line 47
    .line 48
    sget-object v2, Lmq;->ON_PAUSE:Lmq;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, v1, Lol;->a:I

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, v1, Lol;->C:Z

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, Ld4;->i(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 2
    .line 3
    iget-object v1, v0, Lol;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lol;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "android:view_state"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, v0, Lol;->c:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, Lol;->b:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "android:view_registry_state"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, Lol;->d:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, Lol;->b:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "android:target_state"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Lol;->h:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lol;->b:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "android:target_req_state"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, Lol;->i:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, Lol;->b:Landroid/os/Bundle;

    .line 55
    .line 56
    const-string v1, "android:user_visible_hint"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput-boolean p1, v0, Lol;->G:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, Lol;->F:Z

    .line 68
    .line 69
    :cond_2
    :goto_0
    return-void
.end method

.method public final n()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "moveto RESUMED: "

    .line 15
    .line 16
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v2, Lol;->H:Lnl;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Lnl;->k:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v4, v2, Lol;->E:Landroid/view/View;

    .line 41
    .line 42
    if-ne v0, v4, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_1
    if-eqz v4, :cond_5

    .line 50
    .line 51
    iget-object v5, v2, Lol;->E:Landroid/view/View;

    .line 52
    .line 53
    if-ne v4, v5, :cond_4

    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x2

    .line 60
    invoke-static {v5}, Lam;->A(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "requestFocus: Restoring focused view "

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " "

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    const-string v0, "succeeded"

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    const-string v0, "failed"

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, " on Fragment "

    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " resulting in focused view "

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, Lol;->E:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    :goto_4
    invoke-virtual {v2}, Lol;->f()Lnl;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v3, v0, Lnl;->k:Landroid/view/View;

    .line 131
    .line 132
    iget-object v0, v2, Lol;->t:Lam;

    .line 133
    .line 134
    invoke-virtual {v0}, Lam;->F()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, Lol;->t:Lam;

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Lam;->t(Z)Z

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x7

    .line 144
    iput v0, v2, Lol;->a:I

    .line 145
    .line 146
    iput-boolean v1, v2, Lol;->C:Z

    .line 147
    .line 148
    iget-object v1, v2, Lol;->L:Landroidx/lifecycle/a;

    .line 149
    .line 150
    sget-object v4, Lmq;->ON_RESUME:Lmq;

    .line 151
    .line 152
    invoke-virtual {v1, v4}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v2, Lol;->E:Landroid/view/View;

    .line 156
    .line 157
    if-eqz v1, :cond_6

    .line 158
    .line 159
    iget-object v1, v2, Lol;->M:Lhm;

    .line 160
    .line 161
    iget-object v1, v1, Lhm;->b:Landroidx/lifecycle/a;

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    iget-object v1, v2, Lol;->t:Lam;

    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    iput-boolean v4, v1, Lam;->y:Z

    .line 170
    .line 171
    iput-boolean v4, v1, Lam;->z:Z

    .line 172
    .line 173
    iget-object v5, v1, Lam;->F:Lcm;

    .line 174
    .line 175
    iput-boolean v4, v5, Lcm;->h:Z

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Lam;->p(I)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 181
    .line 182
    invoke-virtual {v0, v4}, Ld4;->l(Z)V

    .line 183
    .line 184
    .line 185
    iput-object v3, v2, Lol;->b:Landroid/os/Bundle;

    .line 186
    .line 187
    iput-object v3, v2, Lol;->c:Landroid/util/SparseArray;

    .line 188
    .line 189
    iput-object v3, v2, Lol;->d:Landroid/os/Bundle;

    .line 190
    .line 191
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 2
    .line 3
    iget-object v1, v0, Lol;->E:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lol;->E:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    iput-object v1, v0, Lol;->c:Landroid/util/SparseArray;

    .line 25
    .line 26
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lol;->M:Lhm;

    .line 32
    .line 33
    iget-object v2, v2, Lhm;->c:Lim;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lim;->c(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    iput-object v1, v0, Lol;->d:Landroid/os/Bundle;

    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lol;->t:Lam;

    .line 30
    .line 31
    invoke-virtual {v0}, Lam;->F()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Lol;->t:Lam;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Lam;->t(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Lol;->a:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-boolean v2, v1, Lol;->C:Z

    .line 45
    .line 46
    invoke-virtual {v1}, Lol;->s()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, v1, Lol;->C:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v3, v1, Lol;->L:Landroidx/lifecycle/a;

    .line 54
    .line 55
    sget-object v4, Lmq;->ON_START:Lmq;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, Lol;->E:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    iget-object v3, v1, Lol;->M:Lhm;

    .line 65
    .line 66
    iget-object v3, v3, Lhm;->b:Landroidx/lifecycle/a;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v1, v1, Lol;->t:Lam;

    .line 72
    .line 73
    iput-boolean v2, v1, Lam;->y:Z

    .line 74
    .line 75
    iput-boolean v2, v1, Lam;->z:Z

    .line 76
    .line 77
    iget-object v3, v1, Lam;->F:Lcm;

    .line 78
    .line 79
    iput-boolean v2, v3, Lcm;->h:Z

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lam;->p(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ld4;->n(Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    new-instance v0, Lm50;

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "Fragment "

    .line 95
    .line 96
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, " did not call through to super.onStart()"

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/a;->c:Lol;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Lol;->t:Lam;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Lam;->z:Z

    .line 33
    .line 34
    iget-object v3, v0, Lam;->F:Lcm;

    .line 35
    .line 36
    iput-boolean v2, v3, Lcm;->h:Z

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-virtual {v0, v2}, Lam;->p(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Lol;->E:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, Lol;->M:Lhm;

    .line 47
    .line 48
    sget-object v3, Lmq;->ON_STOP:Lmq;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lhm;->c(Lmq;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Lol;->L:Landroidx/lifecycle/a;

    .line 54
    .line 55
    sget-object v3, Lmq;->ON_STOP:Lmq;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 58
    .line 59
    .line 60
    iput v2, v1, Lol;->a:I

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-boolean v0, v1, Lol;->C:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Lol;->t()V

    .line 66
    .line 67
    .line 68
    iget-boolean v2, v1, Lol;->C:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/fragment/app/a;->a:Ld4;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ld4;->o(Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    new-instance v0, Lm50;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "Fragment "

    .line 83
    .line 84
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, " did not call through to super.onStop()"

    .line 91
    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0
.end method
