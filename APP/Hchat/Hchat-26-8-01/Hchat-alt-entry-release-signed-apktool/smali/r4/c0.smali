.class public final Lr4/c0;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lr4/b0;

.field public final l:Lr4/o0;

.field public final m:Lr4/a0;

.field public final n:I


# direct methods
.method public constructor <init>(Lr4/b0;Lr4/o0;Lr4/a0;Lr4/a0;I)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, 0xc

    .line 3
    .line 4
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    if-eqz p3, :cond_2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    if-lez p5, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lr4/c0;->k:Lr4/b0;

    .line 16
    .line 17
    iput-object p2, p0, Lr4/c0;->l:Lr4/o0;

    .line 18
    .line 19
    iput-object p3, p0, Lr4/c0;->m:Lr4/a0;

    .line 20
    .line 21
    iput p5, p0, Lr4/c0;->n:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "itemCount <= 0"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1

    .line 31
    :cond_1
    const-string p1, "lastItem == null"

    .line 32
    .line 33
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1

    .line 38
    :cond_2
    const-string p1, "firstItem == null"

    .line 39
    .line 40
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    throw p1

    .line 45
    :cond_3
    const-string p1, "type == null"

    .line 46
    .line 47
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    throw p1
.end method

.method public constructor <init>(Lr4/k0;)V
    .locals 2

    const/4 v0, 0x4

    const/16 v1, 0xc

    .line 52
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    if-eqz p1, :cond_0

    .line 53
    sget-object v0, Lr4/b0;->s:Lr4/b0;

    iput-object v0, p0, Lr4/c0;->k:Lr4/b0;

    .line 54
    iput-object p1, p0, Lr4/c0;->l:Lr4/o0;

    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lr4/c0;->m:Lr4/a0;

    const/4 p1, 0x1

    .line 56
    iput p1, p0, Lr4/c0;->n:I

    return-void

    .line 57
    :cond_0
    const-string p1, "section == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static n([Lr4/o0;Lr4/k0;)V
    .locals 13

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    iget-object v0, p1, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_6

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v1, 0x32

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v1, p0

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :goto_0
    if-ge v3, v1, :cond_5

    .line 22
    .line 23
    aget-object v6, p0, v3

    .line 24
    .line 25
    invoke-virtual {v6}, Lr4/o0;->c()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    const/4 v4, 0x0

    .line 34
    move v9, v2

    .line 35
    move-object v5, v4

    .line 36
    move-object v7, v5

    .line 37
    move-object v8, v7

    .line 38
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v11, v4

    .line 49
    check-cast v11, Lr4/a0;

    .line 50
    .line 51
    invoke-virtual {v11}, Lr4/a0;->b()Lr4/b0;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    if-eq v12, v5, :cond_1

    .line 56
    .line 57
    if-eqz v9, :cond_0

    .line 58
    .line 59
    new-instance v4, Lr4/c0;

    .line 60
    .line 61
    invoke-direct/range {v4 .. v9}, Lr4/c0;-><init>(Lr4/b0;Lr4/o0;Lr4/a0;Lr4/a0;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_0
    move v9, v2

    .line 68
    move-object v7, v11

    .line 69
    move-object v5, v12

    .line 70
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 71
    .line 72
    move-object v8, v11

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    if-eqz v9, :cond_3

    .line 75
    .line 76
    new-instance v4, Lr4/c0;

    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Lr4/c0;-><init>(Lr4/b0;Lr4/o0;Lr4/a0;Lr4/a0;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    if-ne v6, p1, :cond_4

    .line 86
    .line 87
    new-instance v4, Lr4/c0;

    .line 88
    .line 89
    invoke-direct {v4, p1}, Lr4/c0;-><init>(Lr4/k0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    new-instance p0, Lr4/v0;

    .line 99
    .line 100
    sget-object v1, Lr4/b0;->s:Lr4/b0;

    .line 101
    .line 102
    invoke-direct {p0, v1, v0}, Lr4/v0;-><init>(Lr4/b0;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p0}, Lr4/k0;->k(Lr4/l0;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6
    const-string p0, "mapSection.items().size() != 0"

    .line 110
    .line 111
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_7
    const-string p0, "sections == null"

    .line 116
    .line 117
    invoke-static {p0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->D:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr4/c0;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lr4/c0;->k:Lr4/b0;

    .line 2
    .line 3
    iget v0, p1, Lr4/b0;->g:I

    .line 4
    .line 5
    iget-object v1, p0, Lr4/c0;->m:Lr4/a0;

    .line 6
    .line 7
    iget-object v2, p0, Lr4/c0;->l:Lr4/o0;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lr4/o0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2, v1}, Lr4/o0;->a(Lr4/a0;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, p0, Lr4/c0;->n:I

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v5, p1, Lr4/b0;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v5, " map"

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p2, v4, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v5, "  type:   "

    .line 66
    .line 67
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, " // "

    .line 78
    .line 79
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-virtual {p2, v2, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string p1, "  unused: 0"

    .line 98
    .line 99
    invoke-virtual {p2, v2, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, La/a;->Y0(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v2, "  size:   "

    .line 107
    .line 108
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const/4 v2, 0x4

    .line 113
    invoke-virtual {p2, v2, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v5, "  offset: "

    .line 121
    .line 122
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, v2, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    invoke-virtual {p2, v0}, Lz4/d;->l(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v4}, Lz4/d;->l(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v3}, Lz4/d;->k(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lr4/c0;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lr4/c0;->l:Lr4/o0;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lr4/c0;->k:Lr4/b0;

    .line 37
    .line 38
    iget-object v1, v1, Lr4/b0;->i:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v2, 0x7d

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
