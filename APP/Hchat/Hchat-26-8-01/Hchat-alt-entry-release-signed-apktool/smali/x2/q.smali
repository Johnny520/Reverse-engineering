.class public final Lx2/q;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld1/u;
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field public u:Landroid/view/ViewTreeObserver;

.field public final v:Lx2/p;

.field public final w:Lx2/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx2/p;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lx2/p;-><init>(Lx2/q;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx2/q;->v:Lx2/p;

    .line 11
    .line 12
    new-instance v0, Lx2/p;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lx2/p;-><init>(Lx2/q;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lx2/q;->w:Lx2/p;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 1

    .line 1
    invoke-static {p0}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lx2/q;->u:Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/q;->u:Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lx2/q;->u:Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    invoke-static {p0}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final k1()Ld1/b0;
    .locals 10

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitLocalDescendants called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 13
    .line 14
    iget v1, v0, Ly0/n;->j:I

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0x400

    .line 17
    .line 18
    if-eqz v1, :cond_a

    .line 19
    .line 20
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-eqz v0, :cond_a

    .line 25
    .line 26
    iget v3, v0, Ly0/n;->i:I

    .line 27
    .line 28
    and-int/lit16 v3, v3, 0x400

    .line 29
    .line 30
    if-eqz v3, :cond_9

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    move-object v4, v0

    .line 34
    move-object v5, v3

    .line 35
    :goto_1
    if-eqz v4, :cond_9

    .line 36
    .line 37
    instance-of v6, v4, Ld1/b0;

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    move-object v6, v4

    .line 43
    check-cast v6, Ld1/b0;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_1
    move v6, v1

    .line 49
    move v2, v7

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v6, v7

    .line 52
    :goto_2
    if-eqz v6, :cond_8

    .line 53
    .line 54
    iget v6, v4, Ly0/n;->i:I

    .line 55
    .line 56
    and-int/lit16 v6, v6, 0x400

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    instance-of v6, v4, Lx1/j;

    .line 61
    .line 62
    if-eqz v6, :cond_8

    .line 63
    .line 64
    move-object v6, v4

    .line 65
    check-cast v6, Lx1/j;

    .line 66
    .line 67
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 68
    .line 69
    move v8, v1

    .line 70
    :goto_3
    if-eqz v6, :cond_7

    .line 71
    .line 72
    iget v9, v6, Ly0/n;->i:I

    .line 73
    .line 74
    and-int/lit16 v9, v9, 0x400

    .line 75
    .line 76
    if-eqz v9, :cond_6

    .line 77
    .line 78
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    if-ne v8, v7, :cond_3

    .line 81
    .line 82
    move-object v4, v6

    .line 83
    goto :goto_4

    .line 84
    :cond_3
    if-nez v5, :cond_4

    .line 85
    .line 86
    new-instance v5, Lj0/b;

    .line 87
    .line 88
    const/16 v9, 0x10

    .line 89
    .line 90
    new-array v9, v9, [Ly0/n;

    .line 91
    .line 92
    invoke-direct {v5, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    if-eqz v4, :cond_5

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v4, v3

    .line 101
    :cond_5
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_7
    if-ne v8, v7, :cond_8

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_8
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    goto :goto_1

    .line 115
    :cond_9
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_a
    const-string v0, "Could not find focus target of embedded view wrapper"

    .line 119
    .line 120
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    return-object v0
.end method

.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lx2/i;->c(Ly0/n;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ly1/t;

    .line 20
    .line 21
    invoke-virtual {v1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-ne p1, v5, :cond_1

    .line 50
    .line 51
    move p1, v3

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move p1, v4

    .line 59
    :goto_1
    if-eqz p2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_2
    if-eqz p2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-ne p2, v2, :cond_3

    .line 78
    .line 79
    move p2, v3

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-interface {p2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move p2, v4

    .line 87
    :goto_3
    if-eqz p1, :cond_5

    .line 88
    .line 89
    if-eqz p2, :cond_5

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    if-eqz p2, :cond_7

    .line 93
    .line 94
    invoke-virtual {p0}, Lx2/q;->k1()Ld1/b0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ld1/b0;->p1()Ld1/z;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_8

    .line 107
    .line 108
    if-eq p2, v3, :cond_8

    .line 109
    .line 110
    const/4 v0, 0x2

    .line 111
    if-eq p2, v0, :cond_8

    .line 112
    .line 113
    const/4 v0, 0x3

    .line 114
    if-ne p2, v0, :cond_6

    .line 115
    .line 116
    invoke-static {p1}, Ld1/d;->w(Ld1/b0;)Z

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_6
    invoke-static {}, Lokio/a;->k()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    if-eqz p1, :cond_8

    .line 125
    .line 126
    invoke-virtual {p0}, Lx2/q;->k1()Ld1/b0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ld1/b0;->p1()Ld1/z;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    const/16 p1, 0x8

    .line 141
    .line 142
    check-cast v1, Ld1/p;

    .line 143
    .line 144
    invoke-virtual {v1, p1, v4, v4}, Ld1/p;->b(IZZ)Z

    .line 145
    .line 146
    .line 147
    :cond_8
    :goto_4
    return-void
.end method

.method public final r0(Ld1/r;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ld1/r;->c(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lx2/q;->v:Lx2/p;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ld1/r;->e(Lx2/p;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx2/q;->w:Lx2/p;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ld1/r;->b(Lx2/p;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
