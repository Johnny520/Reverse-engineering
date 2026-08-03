.class public final Lr4/j;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv4/d0;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/HashMap;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ljava/util/ArrayList;

.field public q:Lv4/d;

.field public r:[B


# direct methods
.method public constructor <init>(Lv4/d0;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lr4/j;->k:Lv4/d0;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v0, 0x14

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    const/16 v1, 0x28

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lr4/j;->m:Ljava/util/HashMap;

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lr4/j;->n:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lr4/j;->o:Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lr4/j;->p:Ljava/util/ArrayList;

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lr4/j;->q:Lv4/d;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p1, "thisClass == null"

    .line 54
    .line 55
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1
.end method

.method public static n(Lr4/p;Lz4/d;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Lz4/d;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "  "

    .line 18
    .line 19
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, ":"

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, v2, p2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move p2, v2

    .line 38
    :goto_0
    if-ge v2, v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lr4/s;

    .line 45
    .line 46
    invoke-virtual {v1, p0, p1, p2, v2}, Lr4/s;->d(Lr4/p;Lz4/d;II)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    return-void
.end method

.method public static p(Lz4/d;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "_size:"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "  %-21s %08x"

    .line 22
    .line 23
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lz4/d;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0, p2}, Lz4/d;->n(I)I

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lr4/j;->q()Lv4/d;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lr4/r;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v2, p1, Lr4/p;->i:Lr4/w;

    .line 32
    .line 33
    iget-object v1, v1, Lr4/r;->h:Lv4/m;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lr4/j;->n:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lr4/r;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v2, p1, Lr4/p;->i:Lr4/w;

    .line 70
    .line 71
    iget-object v1, v1, Lr4/r;->h:Lv4/m;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-object v0, p0, Lr4/j;->o:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lr4/t;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v2, p1, Lr4/p;->j:Lr4/j0;

    .line 108
    .line 109
    iget-object v3, p1, Lr4/p;->b:Lr4/k0;

    .line 110
    .line 111
    iget-object v4, v1, Lr4/t;->h:Lv4/y;

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Lr4/j0;->m(Lv4/e;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, v1, Lr4/t;->i:Lr4/l;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-virtual {v3, v1}, Lr4/k0;->k(Lr4/l0;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    iget-object v0, p0, Lr4/j;->p:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Lr4/t;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v2, p1, Lr4/p;->j:Lr4/j0;

    .line 155
    .line 156
    iget-object v3, p1, Lr4/p;->b:Lr4/k0;

    .line 157
    .line 158
    iget-object v4, v1, Lr4/t;->h:Lv4/y;

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Lr4/j0;->m(Lv4/e;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v1, Lr4/t;->i:Lr4/l;

    .line 164
    .line 165
    if-eqz v1, :cond_4

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Lr4/k0;->k(Lr4/l0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->w:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 0

    .line 1
    new-instance p2, Lz4/d;

    .line 2
    .line 3
    invoke-direct {p2}, Lz4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lr4/o0;->b:Lr4/p;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lr4/j;->o(Lr4/p;Lz4/d;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lz4/d;->h()[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lr4/j;->r:[B

    .line 16
    .line 17
    array-length p1, p1

    .line 18
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lr4/j;->o(Lr4/p;Lz4/d;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p1, p0, Lr4/j;->r:[B

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lz4/d;->i([B)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final o(Lr4/p;Lz4/d;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " class data for "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lr4/j;->k:Lv4/d0;

    .line 25
    .line 26
    iget-object v2, v2, Lv4/d0;->g:Lw4/c;

    .line 27
    .line 28
    invoke-virtual {v2}, Lw4/c;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {p2, v2, v1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const-string v3, "static_fields"

    .line 50
    .line 51
    invoke-static {p2, v3, v2}, Lr4/j;->p(Lz4/d;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lr4/j;->n:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const-string v5, "instance_fields"

    .line 61
    .line 62
    invoke-static {p2, v5, v4}, Lr4/j;->p(Lz4/d;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    iget-object v4, p0, Lr4/j;->o:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const-string v7, "direct_methods"

    .line 72
    .line 73
    invoke-static {p2, v7, v6}, Lr4/j;->p(Lz4/d;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    iget-object v6, p0, Lr4/j;->p:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    const-string v9, "virtual_methods"

    .line 83
    .line 84
    invoke-static {p2, v9, v8}, Lr4/j;->p(Lz4/d;Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2, v3, v1}, Lr4/j;->n(Lr4/p;Lz4/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2, v5, v2}, Lr4/j;->n(Lr4/p;Lz4/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, p2, v7, v4}, Lr4/j;->n(Lr4/p;Lz4/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2, v9, v6}, Lr4/j;->n(Lr4/p;Lz4/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    invoke-virtual {p2}, Lz4/d;->e()V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method

.method public final q()Lv4/d;
    .locals 8

    .line 1
    iget-object v0, p0, Lr4/j;->q:Lv4/d;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    iget-object v2, p0, Lr4/j;->m:Ljava/util/HashMap;

    .line 21
    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    add-int/lit8 v3, v1, -0x1

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lr4/r;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lv4/a;

    .line 37
    .line 38
    instance-of v4, v3, Lv4/u;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    check-cast v3, Lv4/u;

    .line 43
    .line 44
    invoke-virtual {v3}, Lv4/u;->m()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const-wide/16 v5, 0x0

    .line 49
    .line 50
    cmp-long v3, v3, v5

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    if-eqz v3, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_3
    new-instance v3, Lv4/c;

    .line 67
    .line 68
    invoke-direct {v3, v1}, Lz4/e;-><init>(I)V

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    move v5, v4

    .line 73
    :goto_2
    if-ge v5, v1, :cond_5

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Lr4/r;

    .line 80
    .line 81
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lv4/a;

    .line 86
    .line 87
    if-nez v7, :cond_4

    .line 88
    .line 89
    iget-object v6, v6, Lr4/r;->h:Lv4/m;

    .line 90
    .line 91
    iget-object v6, v6, Lv4/w;->h:Lv4/z;

    .line 92
    .line 93
    invoke-virtual {v6}, Lv4/z;->k()Lw4/c;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget v7, v6, Lw4/c;->h:I

    .line 98
    .line 99
    packed-switch v7, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 103
    .line 104
    invoke-virtual {v6}, Lw4/c;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v3, "no zero for type: "

    .line 111
    .line 112
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :pswitch_0
    sget-object v6, Lv4/r;->g:Lv4/r;

    .line 127
    .line 128
    :goto_3
    move-object v7, v6

    .line 129
    goto :goto_4

    .line 130
    :pswitch_1
    sget-object v6, Lv4/b0;->h:Lv4/b0;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :pswitch_2
    sget-object v6, Lv4/v;->h:Lv4/v;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :pswitch_3
    sget-object v6, Lv4/o;->j:Lv4/o;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :pswitch_4
    sget-object v6, Lv4/n;->h:Lv4/n;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :pswitch_5
    sget-object v6, Lv4/k;->h:Lv4/k;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :pswitch_6
    sget-object v6, Lv4/j;->h:Lv4/j;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :pswitch_7
    sget-object v6, Lv4/g;->h:Lv4/g;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :pswitch_8
    sget-object v6, Lv4/f;->h:Lv4/f;

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_4
    :goto_4
    invoke-virtual {v3, v5, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_5
    iput-boolean v4, v3, Lz4/j;->g:Z

    .line 161
    .line 162
    new-instance v0, Lv4/d;

    .line 163
    .line 164
    invoke-direct {v0, v3}, Lv4/d;-><init>(Lv4/c;)V

    .line 165
    .line 166
    .line 167
    :goto_5
    iput-object v0, p0, Lr4/j;->q:Lv4/d;

    .line 168
    .line 169
    :cond_6
    iget-object v0, p0, Lr4/j;->q:Lv4/d;

    .line 170
    .line 171
    return-object v0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lr4/j;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lr4/j;->o:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lr4/j;->p:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return v0
.end method
