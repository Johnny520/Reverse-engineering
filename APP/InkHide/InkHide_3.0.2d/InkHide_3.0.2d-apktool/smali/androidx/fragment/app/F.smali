.class public final Landroidx/fragment/app/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LH/a;

.field public final b:LC/h;

.field public final c:Landroidx/fragment/app/l;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(LH/a;LC/h;Landroidx/fragment/app/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/F;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/F;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    return-void
.end method

.method public constructor <init>(LH/a;LC/h;Landroidx/fragment/app/l;Landroidx/fragment/app/D;)V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Landroidx/fragment/app/F;->d:Z

    const/4 v1, -0x1

    .line 37
    iput v1, p0, Landroidx/fragment/app/F;->e:I

    .line 38
    iput-object p1, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 39
    iput-object p2, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 40
    iput-object p3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    const/4 p1, 0x0

    .line 41
    iput-object p1, p3, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 42
    iput-object p1, p3, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 43
    iput v0, p3, Landroidx/fragment/app/l;->r:I

    .line 44
    iput-boolean v0, p3, Landroidx/fragment/app/l;->o:Z

    .line 45
    iput-boolean v0, p3, Landroidx/fragment/app/l;->l:Z

    .line 46
    iget-object p2, p3, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 47
    iput-object p1, p3, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 48
    iget-object p1, p4, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 49
    iput-object p1, p3, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    return-void

    .line 50
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(LH/a;LC/h;Ljava/lang/ClassLoader;Landroidx/fragment/app/v;Landroidx/fragment/app/D;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/F;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/F;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 12
    iget-object p1, p5, Landroidx/fragment/app/D;->a:Ljava/lang/String;

    invoke-virtual {p4, p1}, Landroidx/fragment/app/v;->a(Ljava/lang/String;)Landroidx/fragment/app/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 13
    iget-object p2, p5, Landroidx/fragment/app/D;->j:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    iget-object p3, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    if-eqz p3, :cond_2

    .line 16
    iget-boolean p4, p3, Landroidx/fragment/app/z;->y:Z

    if-nez p4, :cond_1

    iget-boolean p3, p3, Landroidx/fragment/app/z;->z:Z

    if-nez p3, :cond_1

    goto :goto_0

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment already added and state has been saved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    :goto_0
    iput-object p2, p1, Landroidx/fragment/app/l;->g:Landroid/os/Bundle;

    .line 19
    iget-object p2, p5, Landroidx/fragment/app/D;->b:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 20
    iget-boolean p2, p5, Landroidx/fragment/app/D;->c:Z

    iput-boolean p2, p1, Landroidx/fragment/app/l;->n:Z

    const/4 p2, 0x1

    .line 21
    iput-boolean p2, p1, Landroidx/fragment/app/l;->p:Z

    .line 22
    iget p2, p5, Landroidx/fragment/app/D;->d:I

    iput p2, p1, Landroidx/fragment/app/l;->w:I

    .line 23
    iget p2, p5, Landroidx/fragment/app/D;->e:I

    iput p2, p1, Landroidx/fragment/app/l;->x:I

    .line 24
    iget-object p2, p5, Landroidx/fragment/app/D;->f:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 25
    iget-boolean p2, p5, Landroidx/fragment/app/D;->g:Z

    iput-boolean p2, p1, Landroidx/fragment/app/l;->B:Z

    .line 26
    iget-boolean p2, p5, Landroidx/fragment/app/D;->h:Z

    iput-boolean p2, p1, Landroidx/fragment/app/l;->m:Z

    .line 27
    iget-boolean p2, p5, Landroidx/fragment/app/D;->i:Z

    iput-boolean p2, p1, Landroidx/fragment/app/l;->A:Z

    .line 28
    iget-boolean p2, p5, Landroidx/fragment/app/D;->k:Z

    iput-boolean p2, p1, Landroidx/fragment/app/l;->z:Z

    .line 29
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    move-result-object p2

    iget p3, p5, Landroidx/fragment/app/D;->l:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/l;->L:Landroidx/lifecycle/n;

    .line 30
    iget-object p2, p5, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    if-eqz p2, :cond_3

    .line 31
    iput-object p2, p1, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    goto :goto_1

    .line 32
    :cond_3
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    :goto_1
    const/4 p2, 0x2

    .line 33
    invoke-static {p2}, Landroidx/fragment/app/z;->E(I)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Instantiated fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v1, v3, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object v1, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/z;->J()V

    .line 34
    .line 35
    .line 36
    iput v0, v3, Landroidx/fragment/app/l;->b:I

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, v3, Landroidx/fragment/app/l;->D:Z

    .line 40
    .line 41
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

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
    const-string v4, "moveto RESTORE_VIEW_STATE: "

    .line 50
    .line 51
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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
    iget-object v0, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v4, v3, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, v3, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 77
    .line 78
    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    iget-object v0, v3, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 83
    .line 84
    iget-object v4, v3, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 85
    .line 86
    iget-object v0, v0, Landroidx/fragment/app/H;->d:LM/e;

    .line 87
    .line 88
    invoke-virtual {v0, v4}, LM/e;->d(Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    iput-object v2, v3, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 92
    .line 93
    :cond_3
    iput-boolean v1, v3, Landroidx/fragment/app/l;->D:Z

    .line 94
    .line 95
    iget-object v0, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v0, v3, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 100
    .line 101
    sget-object v1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroidx/fragment/app/H;->d(Landroidx/lifecycle/m;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    iput-object v2, v3, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 107
    .line 108
    iget-object v0, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    iput-boolean v1, v0, Landroidx/fragment/app/z;->y:Z

    .line 112
    .line 113
    iput-boolean v1, v0, Landroidx/fragment/app/z;->z:Z

    .line 114
    .line 115
    iget-object v2, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 116
    .line 117
    iput-boolean v1, v2, Landroidx/fragment/app/B;->i:Z

    .line 118
    .line 119
    const/4 v2, 0x4

    .line 120
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->s(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, LH/a;->b(Z)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v0, v0, LC/h;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    add-int/lit8 v5, v4, -0x1

    .line 23
    .line 24
    :goto_0
    if-ltz v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Landroidx/fragment/app/l;

    .line 31
    .line 32
    iget-object v7, v6, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-ne v7, v2, :cond_1

    .line 35
    .line 36
    iget-object v6, v6, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/lit8 v3, v0, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ge v4, v5, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroidx/fragment/app/l;

    .line 63
    .line 64
    iget-object v6, v5, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-ne v6, v2, :cond_3

    .line 67
    .line 68
    iget-object v5, v5, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    iget-object v0, v1, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 79
    .line 80
    iget-object v1, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const-string v3, " that does not belong to this FragmentManager!"

    .line 33
    .line 34
    const-string v4, " declared target fragment "

    .line 35
    .line 36
    iget-object v5, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 37
    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v5, LC/h;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroidx/fragment/app/F;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v3, v1, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 57
    .line 58
    iget-object v3, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v3, v1, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v2, v1, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, v1, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v5, v5, LC/h;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroidx/fragment/app/F;

    .line 107
    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v1, v1, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2, v1, v3}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_4
    move-object v0, v2

    .line 135
    :goto_0
    if-eqz v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/fragment/app/F;->k()V

    .line 138
    .line 139
    .line 140
    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 141
    .line 142
    iget-object v3, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 143
    .line 144
    iput-object v3, v1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 145
    .line 146
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 147
    .line 148
    iput-object v0, v1, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 149
    .line 150
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 151
    .line 152
    const/4 v3, 0x0

    .line 153
    invoke-virtual {v0, v3}, LH/a;->h(Z)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v1, Landroidx/fragment/app/l;->Q:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-nez v7, :cond_c

    .line 167
    .line 168
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v4, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 172
    .line 173
    iget-object v5, v1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 174
    .line 175
    new-instance v7, Landroidx/fragment/app/j;

    .line 176
    .line 177
    invoke-direct {v7, v1}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/l;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v5, v7, v1}, Landroidx/fragment/app/z;->b(Landroidx/fragment/app/o;LD/h;Landroidx/fragment/app/l;)V

    .line 181
    .line 182
    .line 183
    iput v3, v1, Landroidx/fragment/app/l;->b:I

    .line 184
    .line 185
    iput-boolean v3, v1, Landroidx/fragment/app/l;->D:Z

    .line 186
    .line 187
    iget-object v4, v1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 188
    .line 189
    iget-object v4, v4, Landroidx/fragment/app/o;->e:Le/i;

    .line 190
    .line 191
    move-object v5, v1

    .line 192
    check-cast v5, Lf0/b;

    .line 193
    .line 194
    const-string v7, "context"

    .line 195
    .line 196
    invoke-static {v4, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const/4 v4, 0x1

    .line 200
    iput-boolean v4, v5, Landroidx/fragment/app/l;->D:Z

    .line 201
    .line 202
    iget-object v7, v5, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 203
    .line 204
    if-nez v7, :cond_6

    .line 205
    .line 206
    move-object v8, v2

    .line 207
    goto :goto_1

    .line 208
    :cond_6
    iget-object v8, v7, Landroidx/fragment/app/o;->d:Le/i;

    .line 209
    .line 210
    :goto_1
    if-eqz v8, :cond_7

    .line 211
    .line 212
    iput-boolean v4, v5, Landroidx/fragment/app/l;->D:Z

    .line 213
    .line 214
    :cond_7
    if-nez v7, :cond_8

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_8
    iget-object v2, v7, Landroidx/fragment/app/o;->d:Le/i;

    .line 218
    .line 219
    :goto_2
    if-eqz v2, :cond_9

    .line 220
    .line 221
    new-instance v4, Landroidx/fragment/app/u;

    .line 222
    .line 223
    invoke-direct {v4, v5}, Landroidx/fragment/app/u;-><init>(Lf0/b;)V

    .line 224
    .line 225
    .line 226
    iget-object v2, v2, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 227
    .line 228
    invoke-virtual {v2, v5, v4}, Landroidx/activity/i;->a(Landroidx/lifecycle/s;Landroidx/fragment/app/u;)V

    .line 229
    .line 230
    .line 231
    :cond_9
    iget-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 232
    .line 233
    if-eqz v2, :cond_b

    .line 234
    .line 235
    iget-object v2, v1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 236
    .line 237
    iget-object v2, v2, Landroidx/fragment/app/z;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_a

    .line 248
    .line 249
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Landroidx/fragment/app/C;

    .line 254
    .line 255
    invoke-interface {v4}, Landroidx/fragment/app/C;->a()V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_a
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 260
    .line 261
    iput-boolean v3, v1, Landroidx/fragment/app/z;->y:Z

    .line 262
    .line 263
    iput-boolean v3, v1, Landroidx/fragment/app/z;->z:Z

    .line 264
    .line 265
    iget-object v2, v1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 266
    .line 267
    iput-boolean v3, v2, Landroidx/fragment/app/B;->i:Z

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Landroidx/fragment/app/z;->s(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v3}, LH/a;->c(Z)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_b
    new-instance v0, Landroidx/fragment/app/M;

    .line 277
    .line 278
    new-instance v2, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v1, " did not call through to super.onAttach()"

    .line 287
    .line 288
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v0, Ljava/lang/ClassCastException;

    .line 307
    .line 308
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public final d()I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/fragment/app/l;->b:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/F;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/fragment/app/l;->L:Landroidx/lifecycle/n;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x5

    .line 23
    const/4 v8, -0x1

    .line 24
    const/4 v9, 0x4

    .line 25
    if-eq v2, v3, :cond_3

    .line 26
    .line 27
    if-eq v2, v4, :cond_2

    .line 28
    .line 29
    if-eq v2, v5, :cond_1

    .line 30
    .line 31
    if-eq v2, v9, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/l;->n:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Landroidx/fragment/app/l;->o:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/F;->e:I

    .line 61
    .line 62
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Landroidx/fragment/app/F;->e:I

    .line 82
    .line 83
    if-ge v2, v9, :cond_6

    .line 84
    .line 85
    iget v2, v0, Landroidx/fragment/app/l;->b:I

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
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/l;->l:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_d

    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, Landroidx/fragment/app/z;->C()LG/d;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v0}, Landroidx/fragment/app/i;->d(Landroidx/fragment/app/l;)Landroidx/fragment/app/K;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_9

    .line 128
    .line 129
    iget v6, v10, Landroidx/fragment/app/K;->b:I

    .line 130
    .line 131
    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/i;->c:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_b

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    check-cast v10, Landroidx/fragment/app/K;

    .line 148
    .line 149
    iget-object v11, v10, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 150
    .line 151
    invoke-virtual {v11, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-eqz v11, :cond_a

    .line 156
    .line 157
    iget-boolean v11, v10, Landroidx/fragment/app/K;->f:Z

    .line 158
    .line 159
    if-nez v11, :cond_a

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    const/4 v10, 0x0

    .line 163
    :goto_2
    if-eqz v10, :cond_d

    .line 164
    .line 165
    if-eqz v6, :cond_c

    .line 166
    .line 167
    if-ne v6, v3, :cond_d

    .line 168
    .line 169
    :cond_c
    iget v2, v10, Landroidx/fragment/app/K;->b:I

    .line 170
    .line 171
    move v6, v2

    .line 172
    :cond_d
    if-ne v6, v4, :cond_e

    .line 173
    .line 174
    const/4 v2, 0x6

    .line 175
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    goto :goto_3

    .line 180
    :cond_e
    if-ne v6, v5, :cond_f

    .line 181
    .line 182
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    goto :goto_3

    .line 187
    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/l;->m:Z

    .line 188
    .line 189
    if-eqz v2, :cond_11

    .line 190
    .line 191
    iget v2, v0, Landroidx/fragment/app/l;->r:I

    .line 192
    .line 193
    if-lez v2, :cond_10

    .line 194
    .line 195
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    goto :goto_3

    .line 200
    :cond_10
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    :cond_11
    :goto_3
    iget-boolean v2, v0, Landroidx/fragment/app/l;->G:Z

    .line 205
    .line 206
    if-eqz v2, :cond_12

    .line 207
    .line 208
    iget v2, v0, Landroidx/fragment/app/l;->b:I

    .line 209
    .line 210
    if-ge v2, v7, :cond_12

    .line 211
    .line 212
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    :cond_12
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_13

    .line 221
    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v3, "computeExpectedState() of "

    .line 225
    .line 226
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v3, " for "

    .line 233
    .line 234
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const-string v2, "FragmentManager"

    .line 245
    .line 246
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    :cond_13
    return v1
.end method

.method public final e()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-boolean v0, v1, Landroidx/fragment/app/l;->K:Z

    .line 30
    .line 31
    const-string v2, "android:support:fragments"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, LH/a;->i(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v5, v1, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 43
    .line 44
    iget-object v6, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/fragment/app/z;->J()V

    .line 47
    .line 48
    .line 49
    iput v4, v1, Landroidx/fragment/app/l;->b:I

    .line 50
    .line 51
    iput-boolean v3, v1, Landroidx/fragment/app/l;->D:Z

    .line 52
    .line 53
    iget-object v6, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 54
    .line 55
    new-instance v7, Landroidx/fragment/app/Fragment$5;

    .line 56
    .line 57
    invoke-direct {v7, v1}, Landroidx/fragment/app/Fragment$5;-><init>(Landroidx/fragment/app/l;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 61
    .line 62
    .line 63
    iget-object v6, v1, Landroidx/fragment/app/l;->P:LM/e;

    .line 64
    .line 65
    invoke-virtual {v6, v5}, LM/e;->d(Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    iput-boolean v4, v1, Landroidx/fragment/app/l;->D:Z

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    iget-object v5, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 79
    .line 80
    invoke-virtual {v5, v2}, Landroidx/fragment/app/z;->N(Landroid/os/Parcelable;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 84
    .line 85
    iput-boolean v3, v2, Landroidx/fragment/app/z;->y:Z

    .line 86
    .line 87
    iput-boolean v3, v2, Landroidx/fragment/app/z;->z:Z

    .line 88
    .line 89
    iget-object v5, v2, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 90
    .line 91
    iput-boolean v3, v5, Landroidx/fragment/app/B;->i:Z

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/fragment/app/z;->s(I)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 97
    .line 98
    iget v5, v2, Landroidx/fragment/app/z;->m:I

    .line 99
    .line 100
    if-lt v5, v4, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    iput-boolean v3, v2, Landroidx/fragment/app/z;->y:Z

    .line 104
    .line 105
    iput-boolean v3, v2, Landroidx/fragment/app/z;->z:Z

    .line 106
    .line 107
    iget-object v5, v2, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 108
    .line 109
    iput-boolean v3, v5, Landroidx/fragment/app/B;->i:Z

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/fragment/app/z;->s(I)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iput-boolean v4, v1, Landroidx/fragment/app/l;->K:Z

    .line 115
    .line 116
    iget-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 117
    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    iget-object v1, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 121
    .line 122
    sget-object v2, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, LH/a;->d(Z)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    new-instance v0, Landroidx/fragment/app/M;

    .line 132
    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v3, "Fragment "

    .line 136
    .line 137
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, " did not call through to super.onCreate()"

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_4
    iget-object v0, v1, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    iget-object v2, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Landroidx/fragment/app/z;->N(Landroid/os/Parcelable;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 172
    .line 173
    iput-boolean v3, v0, Landroidx/fragment/app/z;->y:Z

    .line 174
    .line 175
    iput-boolean v3, v0, Landroidx/fragment/app/z;->z:Z

    .line 176
    .line 177
    iget-object v2, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 178
    .line 179
    iput-boolean v3, v2, Landroidx/fragment/app/B;->i:Z

    .line 180
    .line 181
    invoke-virtual {v0, v4}, Landroidx/fragment/app/z;->s(I)V

    .line 182
    .line 183
    .line 184
    :cond_5
    iput v4, v1, Landroidx/fragment/app/l;->b:I

    .line 185
    .line 186
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 4
    .line 5
    iget-boolean v3, v2, Landroidx/fragment/app/l;->n:Z

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v3, 0x3

    .line 11
    invoke-static {v3}, Landroidx/fragment/app/z;->E(I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "FragmentManager"

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v5, "moveto CREATE_VIEW: "

    .line 22
    .line 23
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Landroidx/fragment/app/l;->l()Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v5, v2, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    :cond_2
    :goto_0
    move-object v1, v5

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_3
    iget v5, v2, Landroidx/fragment/app/l;->x:I

    .line 48
    .line 49
    if-eqz v5, :cond_8

    .line 50
    .line 51
    const/4 v6, -0x1

    .line 52
    if-eq v5, v6, :cond_7

    .line 53
    .line 54
    iget-object v6, v2, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 55
    .line 56
    iget-object v6, v6, Landroidx/fragment/app/z;->o:LD/h;

    .line 57
    .line 58
    invoke-virtual {v6, v5}, LD/h;->G(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroid/view/ViewGroup;

    .line 63
    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    iget-boolean v6, v2, Landroidx/fragment/app/l;->p:Z

    .line 67
    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    :try_start_0
    iget-object v0, v2, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    iget-object v1, v0, Landroidx/fragment/app/o;->e:Le/i;

    .line 77
    .line 78
    :goto_1
    if-eqz v1, :cond_6

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v1, v2, Landroidx/fragment/app/l;->x:I

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v3, "Fragment "

    .line 96
    .line 97
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v3, " not attached to a context."

    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :catch_0
    const-string v0, "unknown"

    .line 117
    .line 118
    :goto_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    new-instance v3, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v4, "No view found for id 0x"

    .line 123
    .line 124
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget v4, v2, Landroidx/fragment/app/l;->x:I

    .line 128
    .line 129
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v4, " ("

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v0, ") for fragment "

    .line 145
    .line 146
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v1

    .line 160
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 161
    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v3, "Cannot create fragment "

    .line 165
    .line 166
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v2, " for a container view with no id"

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_8
    :goto_3
    iput-object v1, v2, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 186
    .line 187
    iget-object v5, v2, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 188
    .line 189
    invoke-virtual {v2, v3, v1, v5}, Landroidx/fragment/app/l;->k(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    iget-object v3, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 193
    .line 194
    const/4 v5, 0x2

    .line 195
    if-eqz v3, :cond_d

    .line 196
    .line 197
    invoke-virtual {v3, v0}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 198
    .line 199
    .line 200
    iget-object v3, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 201
    .line 202
    const v6, 0x7f090057

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v6, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    if-eqz v1, :cond_9

    .line 209
    .line 210
    invoke-virtual {p0}, Landroidx/fragment/app/F;->b()V

    .line 211
    .line 212
    .line 213
    :cond_9
    iget-boolean v1, v2, Landroidx/fragment/app/l;->z:Z

    .line 214
    .line 215
    if-eqz v1, :cond_a

    .line 216
    .line 217
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 218
    .line 219
    const/16 v3, 0x8

    .line 220
    .line 221
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 222
    .line 223
    .line 224
    :cond_a
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 225
    .line 226
    sget-object v3, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 227
    .line 228
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_b

    .line 233
    .line 234
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 235
    .line 236
    invoke-static {v1}, Ly/z;->c(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_b
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 241
    .line 242
    new-instance v3, Landroidx/fragment/app/E;

    .line 243
    .line 244
    invoke-direct {v3, v0, v1}, Landroidx/fragment/app/E;-><init>(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 248
    .line 249
    .line 250
    :goto_4
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 251
    .line 252
    invoke-virtual {v2, v1}, Landroidx/fragment/app/l;->j(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    iget-object v1, v2, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 256
    .line 257
    invoke-virtual {v1, v5}, Landroidx/fragment/app/z;->s(I)V

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 261
    .line 262
    invoke-virtual {v1, v0}, LH/a;->o(Z)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 266
    .line 267
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-virtual {v2}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iput v1, v3, Landroidx/fragment/app/k;->j:F

    .line 282
    .line 283
    iget-object v1, v2, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 284
    .line 285
    if-eqz v1, :cond_d

    .line 286
    .line 287
    if-nez v0, :cond_d

    .line 288
    .line 289
    iget-object v0, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 290
    .line 291
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_c

    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iput-object v0, v1, Landroidx/fragment/app/k;->k:Landroid/view/View;

    .line 302
    .line 303
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_c

    .line 308
    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v3, "requestFocus: Saved focused view "

    .line 312
    .line 313
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v0, " for Fragment "

    .line 320
    .line 321
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    :cond_c
    iget-object v0, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 335
    .line 336
    const/4 v1, 0x0

    .line 337
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 338
    .line 339
    .line 340
    :cond_d
    iput v5, v2, Landroidx/fragment/app/l;->b:I

    .line 341
    .line 342
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-boolean v1, v3, Landroidx/fragment/app/l;->m:Z

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget v1, v3, Landroidx/fragment/app/l;->r:I

    .line 36
    .line 37
    if-lez v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    move v1, v5

    .line 43
    :goto_1
    iget-object v6, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 44
    .line 45
    if-nez v1, :cond_7

    .line 46
    .line 47
    iget-object v7, v6, LC/h;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Landroidx/fragment/app/B;

    .line 50
    .line 51
    iget-object v8, v7, Landroidx/fragment/app/B;->d:Ljava/util/HashMap;

    .line 52
    .line 53
    iget-object v9, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

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
    iget-boolean v8, v7, Landroidx/fragment/app/B;->g:Z

    .line 63
    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    iget-boolean v7, v7, Landroidx/fragment/app/B;->h:Z

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move v7, v4

    .line 70
    :goto_3
    if-eqz v7, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    iget-object v0, v3, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {v6, v0}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-boolean v1, v0, Landroidx/fragment/app/l;->B:Z

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    iput-object v0, v3, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 88
    .line 89
    :cond_6
    iput v5, v3, Landroidx/fragment/app/l;->b:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_7
    :goto_4
    iget-object v7, v3, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 93
    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    iget-object v7, v6, LC/h;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v7, Landroidx/fragment/app/B;

    .line 99
    .line 100
    iget-boolean v7, v7, Landroidx/fragment/app/B;->h:Z

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    iget-object v7, v7, Landroidx/fragment/app/o;->e:Le/i;

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
    xor-int/2addr v7, v4

    .line 112
    goto :goto_5

    .line 113
    :cond_9
    move v7, v4

    .line 114
    :goto_5
    if-nez v1, :cond_a

    .line 115
    .line 116
    if-eqz v7, :cond_d

    .line 117
    .line 118
    :cond_a
    iget-object v1, v6, LC/h;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Landroidx/fragment/app/B;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_b

    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v7, "Clearing non-config state for "

    .line 134
    .line 135
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_b
    iget-object v0, v1, Landroidx/fragment/app/B;->e:Ljava/util/HashMap;

    .line 149
    .line 150
    iget-object v2, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Landroidx/fragment/app/B;

    .line 157
    .line 158
    if-eqz v2, :cond_c

    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/fragment/app/B;->b()V

    .line 161
    .line 162
    .line 163
    iget-object v2, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_c
    iget-object v0, v1, Landroidx/fragment/app/B;->f:Ljava/util/HashMap;

    .line 169
    .line 170
    iget-object v1, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Landroidx/lifecycle/P;

    .line 177
    .line 178
    if-eqz v1, :cond_d

    .line 179
    .line 180
    invoke-virtual {v1}, Landroidx/lifecycle/P;->a()V

    .line 181
    .line 182
    .line 183
    iget-object v1, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    :cond_d
    iget-object v0, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/fragment/app/z;->k()V

    .line 191
    .line 192
    .line 193
    iget-object v0, v3, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 194
    .line 195
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 198
    .line 199
    .line 200
    iput v5, v3, Landroidx/fragment/app/l;->b:I

    .line 201
    .line 202
    iput-boolean v5, v3, Landroidx/fragment/app/l;->K:Z

    .line 203
    .line 204
    iput-boolean v4, v3, Landroidx/fragment/app/l;->D:Z

    .line 205
    .line 206
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 207
    .line 208
    invoke-virtual {v0, v5}, LH/a;->e(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, LC/h;->k()Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    :cond_e
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_f

    .line 224
    .line 225
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, Landroidx/fragment/app/F;

    .line 230
    .line 231
    if-eqz v1, :cond_e

    .line 232
    .line 233
    iget-object v2, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 234
    .line 235
    iget-object v1, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 236
    .line 237
    iget-object v4, v1, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_e

    .line 244
    .line 245
    iput-object v3, v1, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    iput-object v2, v1, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_f
    iget-object v0, v3, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 252
    .line 253
    if-eqz v0, :cond_10

    .line 254
    .line 255
    invoke-virtual {v6, v0}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, v3, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 260
    .line 261
    :cond_10
    invoke-virtual {v6, p0}, LC/h;->s(Landroidx/fragment/app/F;)V

    .line 262
    .line 263
    .line 264
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->s(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/fragment/app/H;->e()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 58
    .line 59
    sget-object v3, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 68
    .line 69
    sget-object v3, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Landroidx/fragment/app/H;->d(Landroidx/lifecycle/m;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput v2, v1, Landroidx/fragment/app/l;->b:I

    .line 75
    .line 76
    iput-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 77
    .line 78
    invoke-interface {v1}, Landroidx/lifecycle/Q;->getViewModelStore()Landroidx/lifecycle/P;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v2, LC/h;

    .line 83
    .line 84
    sget-object v3, LK/a;->e:LG/d;

    .line 85
    .line 86
    invoke-direct {v2, v0, v3}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 87
    .line 88
    .line 89
    const-class v0, LK/a;

    .line 90
    .line 91
    invoke-virtual {v2, v0}, LC/h;->i(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, LK/a;

    .line 96
    .line 97
    iget-object v0, v0, LK/a;->d:Ll/l;

    .line 98
    .line 99
    iget v2, v0, Ll/l;->c:I

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    if-gtz v2, :cond_3

    .line 103
    .line 104
    iput-boolean v3, v1, Landroidx/fragment/app/l;->q:Z

    .line 105
    .line 106
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-virtual {v0, v2}, LH/a;->p(Z)V

    .line 110
    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    iput-object v0, v1, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 114
    .line 115
    iput-object v0, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 116
    .line 117
    iput-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 118
    .line 119
    iget-object v3, v1, Landroidx/fragment/app/l;->O:Landroidx/lifecycle/x;

    .line 120
    .line 121
    invoke-virtual {v3, v0}, Landroidx/lifecycle/x;->a(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iput-boolean v2, v1, Landroidx/fragment/app/l;->o:Z

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    iget-object v0, v0, Ll/l;->b:[Ljava/lang/Object;

    .line 128
    .line 129
    aget-object v0, v0, v3

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v0, Ljava/lang/ClassCastException;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 137
    .line 138
    .line 139
    throw v0
.end method

.method public final i()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iput v1, v3, Landroidx/fragment/app/l;->b:I

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    iput-boolean v4, v3, Landroidx/fragment/app/l;->D:Z

    .line 34
    .line 35
    iget-object v5, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 36
    .line 37
    iget-boolean v6, v5, Landroidx/fragment/app/z;->A:Z

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    invoke-virtual {v5}, Landroidx/fragment/app/z;->k()V

    .line 42
    .line 43
    .line 44
    new-instance v5, Landroidx/fragment/app/z;

    .line 45
    .line 46
    invoke-direct {v5}, Landroidx/fragment/app/z;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v5, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 50
    .line 51
    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-virtual {v5, v6}, LH/a;->f(Z)V

    .line 55
    .line 56
    .line 57
    iput v1, v3, Landroidx/fragment/app/l;->b:I

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    iput-object v1, v3, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 61
    .line 62
    iput-object v1, v3, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 63
    .line 64
    iput-object v1, v3, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 65
    .line 66
    iget-boolean v5, v3, Landroidx/fragment/app/l;->m:Z

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    iget v5, v3, Landroidx/fragment/app/l;->r:I

    .line 71
    .line 72
    if-lez v5, :cond_5

    .line 73
    .line 74
    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/F;->b:LC/h;

    .line 75
    .line 76
    iget-object v5, v5, LC/h;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Landroidx/fragment/app/B;

    .line 79
    .line 80
    iget-object v7, v5, Landroidx/fragment/app/B;->d:Ljava/util/HashMap;

    .line 81
    .line 82
    iget-object v8, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-nez v7, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget-boolean v7, v5, Landroidx/fragment/app/B;->g:Z

    .line 92
    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    iget-boolean v4, v5, Landroidx/fragment/app/B;->h:Z

    .line 96
    .line 97
    :cond_4
    :goto_0
    if-eqz v4, :cond_7

    .line 98
    .line 99
    :cond_5
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v4, "initState called for fragment: "

    .line 108
    .line 109
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    :cond_6
    new-instance v0, Landroidx/lifecycle/u;

    .line 123
    .line 124
    invoke-direct {v0, v3}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 125
    .line 126
    .line 127
    iput-object v0, v3, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 128
    .line 129
    new-instance v0, LM/e;

    .line 130
    .line 131
    invoke-direct {v0, v3}, LM/e;-><init>(LM/f;)V

    .line 132
    .line 133
    .line 134
    iput-object v0, v3, Landroidx/fragment/app/l;->P:LM/e;

    .line 135
    .line 136
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, v3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 145
    .line 146
    iput-boolean v6, v3, Landroidx/fragment/app/l;->l:Z

    .line 147
    .line 148
    iput-boolean v6, v3, Landroidx/fragment/app/l;->m:Z

    .line 149
    .line 150
    iput-boolean v6, v3, Landroidx/fragment/app/l;->n:Z

    .line 151
    .line 152
    iput-boolean v6, v3, Landroidx/fragment/app/l;->o:Z

    .line 153
    .line 154
    iput-boolean v6, v3, Landroidx/fragment/app/l;->p:Z

    .line 155
    .line 156
    iput v6, v3, Landroidx/fragment/app/l;->r:I

    .line 157
    .line 158
    iput-object v1, v3, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 159
    .line 160
    new-instance v0, Landroidx/fragment/app/z;

    .line 161
    .line 162
    invoke-direct {v0}, Landroidx/fragment/app/z;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v0, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 166
    .line 167
    iput-object v1, v3, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 168
    .line 169
    iput v6, v3, Landroidx/fragment/app/l;->w:I

    .line 170
    .line 171
    iput v6, v3, Landroidx/fragment/app/l;->x:I

    .line 172
    .line 173
    iput-object v1, v3, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 174
    .line 175
    iput-boolean v6, v3, Landroidx/fragment/app/l;->z:Z

    .line 176
    .line 177
    iput-boolean v6, v3, Landroidx/fragment/app/l;->A:Z

    .line 178
    .line 179
    :cond_7
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/l;->n:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/fragment/app/l;->o:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Landroidx/fragment/app/l;->q:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Landroidx/fragment/app/z;->E(I)Z

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
    invoke-virtual {v0}, Landroidx/fragment/app/l;->l()Landroid/view/LayoutInflater;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x0

    .line 46
    iget-object v3, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/l;->k(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 60
    .line 61
    const v3, 0x7f090057

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-boolean v1, v0, Landroidx/fragment/app/l;->z:Z

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    iget-object v1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroidx/fragment/app/l;->j(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    invoke-virtual {v1, v3}, Landroidx/fragment/app/z;->s(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, LH/a;->o(Z)V

    .line 92
    .line 93
    .line 94
    iput v3, v0, Landroidx/fragment/app/l;->b:I

    .line 95
    .line 96
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/F;->d:Z

    .line 2
    .line 3
    const-string v1, "FragmentManager"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v2}, Landroidx/fragment/app/z;->E(I)Z

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
    iput-boolean v0, p0, Landroidx/fragment/app/F;->d:Z

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/F;->d()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, v3, Landroidx/fragment/app/l;->b:I

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
    invoke-virtual {p0}, Landroidx/fragment/app/F;->n()V

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
    iput v5, v3, Landroidx/fragment/app/l;->b:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/F;->p()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_3
    iget-object v5, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    iget-object v5, v3, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {v3}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Landroidx/fragment/app/z;->C()LG/d;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v5, v6}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iget-object v6, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-static {v6}, Landroidx/fragment/app/L;->b(I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Landroidx/fragment/app/z;->E(I)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_2

    .line 108
    .line 109
    new-instance v7, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v8, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 112
    .line 113
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    :cond_2
    invoke-virtual {v5, v6, v2, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/F;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    const/4 v5, 0x4

    .line 130
    iput v5, v3, Landroidx/fragment/app/l;->b:I

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/F;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/F;->j()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/fragment/app/F;->f()V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/F;->e()V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/F;->c()V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_4
    add-int/lit8 v6, v6, -0x1

    .line 153
    .line 154
    packed-switch v6, :pswitch_data_1

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/F;->l()V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :pswitch_9
    const/4 v5, 0x5

    .line 163
    iput v5, v3, Landroidx/fragment/app/l;->b:I

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/F;->q()V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_b
    invoke-static {v7}, Landroidx/fragment/app/z;->E(I)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_5

    .line 176
    .line 177
    new-instance v5, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v6, "movefrom ACTIVITY_CREATED: "

    .line 183
    .line 184
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-static {v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    :cond_5
    iget-object v5, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 198
    .line 199
    if-eqz v5, :cond_6

    .line 200
    .line 201
    iget-object v5, v3, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 202
    .line 203
    if-nez v5, :cond_6

    .line 204
    .line 205
    invoke-virtual {p0}, Landroidx/fragment/app/F;->o()V

    .line 206
    .line 207
    .line 208
    :cond_6
    iget-object v5, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 209
    .line 210
    if-eqz v5, :cond_8

    .line 211
    .line 212
    iget-object v5, v3, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 213
    .line 214
    if-eqz v5, :cond_8

    .line 215
    .line 216
    invoke-virtual {v3}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v6}, Landroidx/fragment/app/z;->C()LG/d;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-static {v5, v6}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {v2}, Landroidx/fragment/app/z;->E(I)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_7

    .line 236
    .line 237
    new-instance v6, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 240
    .line 241
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_7
    invoke-virtual {v5, v0, v7, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/F;)V

    .line 255
    .line 256
    .line 257
    :cond_8
    iput v7, v3, Landroidx/fragment/app/l;->b:I

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :pswitch_c
    iput-boolean v4, v3, Landroidx/fragment/app/l;->o:Z

    .line 262
    .line 263
    iput v2, v3, Landroidx/fragment/app/l;->b:I

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/F;->h()V

    .line 268
    .line 269
    .line 270
    iput v0, v3, Landroidx/fragment/app/l;->b:I

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/F;->g()V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/F;->i()V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_9
    iget-boolean v5, v3, Landroidx/fragment/app/l;->J:Z

    .line 285
    .line 286
    if-eqz v5, :cond_f

    .line 287
    .line 288
    iget-object v5, v3, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 289
    .line 290
    if-eqz v5, :cond_d

    .line 291
    .line 292
    iget-object v5, v3, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 293
    .line 294
    if-eqz v5, :cond_d

    .line 295
    .line 296
    invoke-virtual {v3}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v6}, Landroidx/fragment/app/z;->C()LG/d;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    invoke-static {v5, v6}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    iget-boolean v6, v3, Landroidx/fragment/app/l;->z:Z

    .line 309
    .line 310
    if-eqz v6, :cond_b

    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {v2}, Landroidx/fragment/app/z;->E(I)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_a

    .line 320
    .line 321
    new-instance v2, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 324
    .line 325
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    :cond_a
    invoke-virtual {v5, v7, v0, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/F;)V

    .line 339
    .line 340
    .line 341
    goto :goto_1

    .line 342
    :cond_b
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-static {v2}, Landroidx/fragment/app/z;->E(I)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-eqz v6, :cond_c

    .line 350
    .line 351
    new-instance v6, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 354
    .line 355
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    :cond_c
    invoke-virtual {v5, v2, v0, p0}, Landroidx/fragment/app/i;->a(IILandroidx/fragment/app/F;)V

    .line 369
    .line 370
    .line 371
    :cond_d
    :goto_1
    iget-object v1, v3, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 372
    .line 373
    if-eqz v1, :cond_e

    .line 374
    .line 375
    iget-boolean v2, v3, Landroidx/fragment/app/l;->l:Z

    .line 376
    .line 377
    if-eqz v2, :cond_e

    .line 378
    .line 379
    invoke-static {v3}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_e

    .line 384
    .line 385
    iput-boolean v0, v1, Landroidx/fragment/app/z;->x:Z

    .line 386
    .line 387
    :cond_e
    iput-boolean v4, v3, Landroidx/fragment/app/l;->J:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 388
    .line 389
    :cond_f
    iput-boolean v4, p0, Landroidx/fragment/app/F;->d:Z

    .line 390
    .line 391
    return-void

    .line 392
    :goto_2
    iput-boolean v4, p0, Landroidx/fragment/app/F;->d:Z

    .line 393
    .line 394
    throw v0

    .line 395
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

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
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
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->s(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 40
    .line 41
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroidx/fragment/app/H;->d(Landroidx/lifecycle/m;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, v1, Landroidx/fragment/app/l;->b:I

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, v1, Landroidx/fragment/app/l;->D:Z

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, LH/a;->g(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iget-object p1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iput-object p1, v0, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iput-object p1, v0, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iput-object p1, v0, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iput p1, v0, Landroidx/fragment/app/l;->j:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

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
    iput-boolean p1, v0, Landroidx/fragment/app/l;->H:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, Landroidx/fragment/app/l;->G:Z

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
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v2, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

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
    iget-object v0, v0, Landroidx/fragment/app/k;->k:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v4, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    iget-object v5, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

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
    iget-object v0, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    invoke-virtual {v2}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v3, v0, Landroidx/fragment/app/k;->k:Landroid/view/View;

    .line 131
    .line 132
    iget-object v0, v2, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroidx/fragment/app/z;->J()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->v(Z)Z

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x7

    .line 144
    iput v0, v2, Landroidx/fragment/app/l;->b:I

    .line 145
    .line 146
    iput-boolean v1, v2, Landroidx/fragment/app/l;->D:Z

    .line 147
    .line 148
    iget-object v1, v2, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 149
    .line 150
    sget-object v4, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 151
    .line 152
    invoke-virtual {v1, v4}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v2, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 156
    .line 157
    if-eqz v1, :cond_6

    .line 158
    .line 159
    iget-object v1, v2, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 160
    .line 161
    iget-object v1, v1, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    iget-object v1, v2, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    iput-boolean v4, v1, Landroidx/fragment/app/z;->y:Z

    .line 170
    .line 171
    iput-boolean v4, v1, Landroidx/fragment/app/z;->z:Z

    .line 172
    .line 173
    iget-object v5, v1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 174
    .line 175
    iput-boolean v4, v5, Landroidx/fragment/app/B;->i:Z

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->s(I)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 181
    .line 182
    invoke-virtual {v0, v4}, LH/a;->k(Z)V

    .line 183
    .line 184
    .line 185
    iput-object v3, v2, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 186
    .line 187
    iput-object v3, v2, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 188
    .line 189
    iput-object v3, v2, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 190
    .line 191
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    iget-object v2, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

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
    iput-object v1, v0, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

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
    iget-object v2, v0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 32
    .line 33
    iget-object v2, v2, Landroidx/fragment/app/H;->d:LM/e;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, LM/e;->e(Landroid/os/Bundle;)V

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
    iput-object v1, v0, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/z;->J()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->v(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Landroidx/fragment/app/l;->b:I

    .line 42
    .line 43
    iput-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 44
    .line 45
    iget-object v2, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 46
    .line 47
    sget-object v3, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    iget-object v2, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    iput-boolean v2, v1, Landroidx/fragment/app/z;->y:Z

    .line 67
    .line 68
    iput-boolean v2, v1, Landroidx/fragment/app/z;->z:Z

    .line 69
    .line 70
    iget-object v3, v1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 71
    .line 72
    iput-boolean v2, v3, Landroidx/fragment/app/B;->i:Z

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->s(I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 78
    .line 79
    invoke-virtual {v0, v2}, LH/a;->m(Z)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

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
    iget-object v0, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Landroidx/fragment/app/z;->z:Z

    .line 33
    .line 34
    iget-object v3, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 35
    .line 36
    iput-boolean v2, v3, Landroidx/fragment/app/B;->i:Z

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    invoke-virtual {v0, v3}, Landroidx/fragment/app/z;->s(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 47
    .line 48
    sget-object v4, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 49
    .line 50
    invoke-virtual {v0, v4}, Landroidx/fragment/app/H;->d(Landroidx/lifecycle/m;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 54
    .line 55
    sget-object v4, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 58
    .line 59
    .line 60
    iput v3, v1, Landroidx/fragment/app/l;->b:I

    .line 61
    .line 62
    iput-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 63
    .line 64
    iget-object v0, p0, Landroidx/fragment/app/F;->a:LH/a;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {v0, v1}, LH/a;->n(Z)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
