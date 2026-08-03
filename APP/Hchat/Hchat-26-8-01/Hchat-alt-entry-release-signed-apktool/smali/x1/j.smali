.class public abstract Lx1/j;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final u:I

.field public v:Ly0/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lx1/j1;->e(Ly0/n;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lx1/j;->u:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a1()V
    .locals 2

    .line 1
    invoke-super {p0}, Ly0/n;->a1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Ly0/n;->n:Lx1/i1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ly0/n;->j1(Lx1/i1;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ly0/n;->a1()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final b1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly0/n;->b1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Ly0/n;->b1()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f1()V
    .locals 1

    .line 1
    invoke-super {p0}, Ly0/n;->f1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ly0/n;->f1()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public final g1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly0/n;->g1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Ly0/n;->g1()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h1()V
    .locals 1

    .line 1
    invoke-super {p0}, Ly0/n;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ly0/n;->h1()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public final i1(Ly0/n;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 4
    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ly0/n;->i1(Ly0/n;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public final j1(Lx1/i1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly0/n;->n:Lx1/i1;

    .line 2
    .line 3
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 4
    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ly0/n;->j1(Lx1/i1;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public final k1(Lx1/i;)Lx1/i;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq v0, p1, :cond_3

    .line 8
    .line 9
    instance-of v2, p1, Ly0/n;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    check-cast v2, Ly0/n;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v1, v2, Ly0/n;->k:Ly0/n;

    .line 21
    .line 22
    :cond_1
    iget-object v2, p0, Ly0/n;->g:Ly0/n;

    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_2
    const-string p1, "Cannot delegate to an already delegated node"

    .line 35
    .line 36
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    return-object p1

    .line 41
    :cond_3
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    const-string v2, "Cannot delegate to an already attached node"

    .line 46
    .line 47
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    iget-object v2, p0, Ly0/n;->g:Ly0/n;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ly0/n;->i1(Ly0/n;)V

    .line 53
    .line 54
    .line 55
    iget v2, p0, Ly0/n;->i:I

    .line 56
    .line 57
    invoke-static {v0}, Lx1/j1;->f(Ly0/n;)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iput v3, v0, Ly0/n;->i:I

    .line 62
    .line 63
    iget v4, p0, Ly0/n;->i:I

    .line 64
    .line 65
    and-int/lit8 v5, v3, 0x2

    .line 66
    .line 67
    if-eqz v5, :cond_5

    .line 68
    .line 69
    and-int/lit8 v4, v4, 0x2

    .line 70
    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    instance-of v4, p0, Lx1/v;

    .line 74
    .line 75
    if-nez v4, :cond_5

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v6, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    .line 80
    .line 81
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v6, "\nDelegate Node: "

    .line 88
    .line 89
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v4}, Lu1/a;->b(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    iget-object v4, p0, Lx1/j;->v:Ly0/n;

    .line 103
    .line 104
    iput-object v4, v0, Ly0/n;->l:Ly0/n;

    .line 105
    .line 106
    iput-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 107
    .line 108
    iput-object p0, v0, Ly0/n;->k:Ly0/n;

    .line 109
    .line 110
    iget v4, p0, Ly0/n;->i:I

    .line 111
    .line 112
    or-int/2addr v3, v4

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-virtual {p0, v3, v4}, Lx1/j;->m1(IZ)V

    .line 115
    .line 116
    .line 117
    iget-boolean v3, p0, Ly0/n;->t:Z

    .line 118
    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    if-eqz v5, :cond_7

    .line 122
    .line 123
    and-int/lit8 v2, v2, 0x2

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v2, v2, Lx1/f0;->L:Lx1/b1;

    .line 133
    .line 134
    iget-object v3, p0, Ly0/n;->g:Ly0/n;

    .line 135
    .line 136
    invoke-virtual {v3, v1}, Ly0/n;->j1(Lx1/i1;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Lx1/b1;->g()V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    :goto_1
    iget-object v1, p0, Ly0/n;->n:Lx1/i1;

    .line 144
    .line 145
    invoke-virtual {p0, v1}, Lx1/j;->j1(Lx1/i1;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    invoke-virtual {v0}, Ly0/n;->a1()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ly0/n;->g1()V

    .line 152
    .line 153
    .line 154
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 155
    .line 156
    if-nez v1, :cond_8

    .line 157
    .line 158
    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    .line 159
    .line 160
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    const/4 v1, -0x1

    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-static {v0, v1, v2}, Lx1/j1;->a(Ly0/n;II)V

    .line 166
    .line 167
    .line 168
    :cond_9
    :goto_3
    return-object p1
.end method

.method public final l1(Lx1/i;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/j;->v:Ly0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v1

    .line 5
    :goto_0
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-ne v0, p1, :cond_5

    .line 8
    .line 9
    iget-boolean p1, v0, Ly0/n;->t:Z

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v4, Lx1/j1;->a:Lf/b0;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string p1, "autoInvalidateRemovedNode called on unattached node"

    .line 19
    .line 20
    invoke-static {p1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p1, -0x1

    .line 24
    invoke-static {v0, p1, v3}, Lx1/j1;->a(Ly0/n;II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ly0/n;->h1()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ly0/n;->b1()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0, v0}, Ly0/n;->i1(Ly0/n;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput p1, v0, Ly0/n;->j:I

    .line 38
    .line 39
    iget-object p1, v0, Ly0/n;->l:Ly0/n;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iput-object p1, p0, Lx1/j;->v:Ly0/n;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iput-object p1, v2, Ly0/n;->l:Ly0/n;

    .line 47
    .line 48
    :goto_1
    iput-object v1, v0, Ly0/n;->l:Ly0/n;

    .line 49
    .line 50
    iput-object v1, v0, Ly0/n;->k:Ly0/n;

    .line 51
    .line 52
    iget p1, p0, Ly0/n;->i:I

    .line 53
    .line 54
    invoke-static {p0}, Lx1/j1;->f(Ly0/n;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p0, v0, v2}, Lx1/j;->m1(IZ)V

    .line 60
    .line 61
    .line 62
    iget-boolean v2, p0, Ly0/n;->t:Z

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    and-int/2addr p1, v3

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    and-int/lit8 p1, v0, 0x2

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, Lx1/f0;->L:Lx1/b1;

    .line 79
    .line 80
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ly0/n;->j1(Lx1/i1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lx1/b1;->g()V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_2
    return-void

    .line 89
    :cond_5
    iget-object v2, v0, Ly0/n;->l:Ly0/n;

    .line 90
    .line 91
    move-object v5, v2

    .line 92
    move-object v2, v0

    .line 93
    move-object v0, v5

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    const-string v0, "Could not find delegate: "

    .line 96
    .line 97
    invoke-static {p1, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final m1(IZ)V
    .locals 3

    .line 1
    iget v0, p0, Ly0/n;->i:I

    .line 2
    .line 3
    iput p1, p0, Ly0/n;->i:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    iput p1, p0, Ly0/n;->j:I

    .line 12
    .line 13
    :cond_0
    iget-boolean v1, p0, Ly0/n;->t:Z

    .line 14
    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    :goto_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget v2, v1, Ly0/n;->i:I

    .line 21
    .line 22
    or-int/2addr p1, v2

    .line 23
    iput p1, v1, Ly0/n;->i:I

    .line 24
    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-eqz p2, :cond_2

    .line 31
    .line 32
    if-ne v1, v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0}, Lx1/j1;->f(Ly0/n;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, v0, Ly0/n;->i:I

    .line 39
    .line 40
    :cond_2
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object p2, v1, Ly0/n;->l:Ly0/n;

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    iget p2, p2, Ly0/n;->j:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/4 p2, 0x0

    .line 50
    :goto_1
    or-int/2addr p1, p2

    .line 51
    :goto_2
    if-eqz v1, :cond_4

    .line 52
    .line 53
    iget p2, v1, Ly0/n;->i:I

    .line 54
    .line 55
    or-int/2addr p1, p2

    .line 56
    iput p1, v1, Ly0/n;->j:I

    .line 57
    .line 58
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    return-void
.end method
