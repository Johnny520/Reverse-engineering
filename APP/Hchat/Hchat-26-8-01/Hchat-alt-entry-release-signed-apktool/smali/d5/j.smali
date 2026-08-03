.class public final Ld5/j;
.super Ld5/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/util/ArrayList;

.field public final k:I

.field public final l:Z


# direct methods
.method public constructor <init>(Lb5/i;ILl5/c0;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ld5/e;-><init>(Lb5/i;ILt5/d;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lb5/i;->i:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lac/k;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lac/k;->k(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ld5/j;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    if-ltz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p3}, Lt5/j;->s()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    move v2, v1

    .line 32
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ll5/b0;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ll5/b0;->a()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    move v0, v1

    .line 51
    :cond_0
    iget-object v4, p1, Lb5/i;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lb5/h;

    .line 54
    .line 55
    new-instance v5, Lb5/f;

    .line 56
    .line 57
    iget-object v6, p1, Lb5/i;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lb5/c;

    .line 60
    .line 61
    iget-object v6, v6, Lb5/c;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, La5/a;

    .line 64
    .line 65
    invoke-virtual {v3}, Ll5/b0;->b()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/2addr v3, p2

    .line 70
    const-string v7, "pswitch_"

    .line 71
    .line 72
    invoke-direct {v5, v6, v3, v7}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v5}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iget-object v4, p0, Ld5/j;->j:Ljava/util/ArrayList;

    .line 80
    .line 81
    new-instance v5, Ld5/g;

    .line 82
    .line 83
    invoke-direct {v5, v3}, Ld5/g;-><init>(Lb5/f;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iput-boolean v0, p0, Ld5/j;->l:Z

    .line 91
    .line 92
    invoke-interface {p3}, Lt5/j;->s()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    move v2, v1

    .line 101
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_3

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Ll5/b0;

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    invoke-virtual {p2}, Ll5/b0;->a()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    move v0, v1

    .line 120
    :cond_2
    iget-object p3, p0, Ld5/j;->j:Ljava/util/ArrayList;

    .line 121
    .line 122
    new-instance v3, Ld5/h;

    .line 123
    .line 124
    invoke-virtual {p2}, Ll5/b0;->b()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-direct {v3, p2}, Ld5/h;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    iput v2, p0, Ld5/j;->k:I

    .line 136
    .line 137
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Ld5/j;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld5/e;->h:Lb5/i;

    .line 6
    .line 7
    iget-object v0, v0, Lb5/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lb5/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lb5/c;->q(Le5/a;)Le5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    const-string v0, ".packed-switch "

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lb6/f;

    .line 21
    .line 22
    iget v1, p0, Ld5/j;->k:I

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lb6/f;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Le5/a;->g(Lw5/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Le5/a;->w()V

    .line 31
    .line 32
    .line 33
    const/16 v0, 0xa

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lq5/a;->write(I)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Ld5/j;->j:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x1

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ld5/i;

    .line 56
    .line 57
    invoke-virtual {v3, p1}, Ld5/i;->a(Le5/a;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v1}, Ld5/e;->f(Le5/a;I)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lq5/a;->write(I)V

    .line 64
    .line 65
    .line 66
    add-int/2addr v1, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p1}, Le5/a;->u()V

    .line 69
    .line 70
    .line 71
    const-string v0, ".end packed-switch"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return v4
.end method
