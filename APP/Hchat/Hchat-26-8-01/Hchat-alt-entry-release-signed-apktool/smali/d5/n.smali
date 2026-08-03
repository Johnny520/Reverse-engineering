.class public final Ld5/n;
.super Ld5/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/util/ArrayList;

.field public final k:Z


# direct methods
.method public constructor <init>(Lb5/i;ILl5/e0;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ld5/e;-><init>(Lb5/i;ILt5/d;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lb5/i;->j:Ljava/lang/Object;

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
    iput-object v0, p0, Ld5/n;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    if-ltz p2, :cond_0

    .line 20
    .line 21
    invoke-interface {p3}, Lt5/j;->s()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ll5/b0;

    .line 40
    .line 41
    iget-object v1, p1, Lb5/i;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lb5/h;

    .line 44
    .line 45
    new-instance v2, Lb5/f;

    .line 46
    .line 47
    iget-object v3, p1, Lb5/i;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lb5/c;

    .line 50
    .line 51
    iget-object v3, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, La5/a;

    .line 54
    .line 55
    invoke-virtual {v0}, Ll5/b0;->b()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    add-int/2addr v4, p2

    .line 60
    const-string v5, "sswitch_"

    .line 61
    .line 62
    invoke-direct {v2, v3, v4, v5}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Ld5/n;->j:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance v3, Ld5/k;

    .line 72
    .line 73
    invoke-virtual {v0}, Ll5/b0;->a()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {v3, v0, v1}, Ld5/k;-><init>(ILb5/f;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const/4 p1, 0x1

    .line 85
    iput-boolean p1, p0, Ld5/n;->k:Z

    .line 86
    .line 87
    invoke-interface {p3}, Lt5/j;->s()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_1

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Ll5/b0;

    .line 106
    .line 107
    iget-object p3, p0, Ld5/n;->j:Ljava/util/ArrayList;

    .line 108
    .line 109
    new-instance v0, Ld5/l;

    .line 110
    .line 111
    invoke-virtual {p2}, Ll5/b0;->a()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {p2}, Ll5/b0;->b()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-direct {v0, v1, p2}, Ld5/l;-><init>(II)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Ld5/n;->k:Z

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
    const-string v0, ".sparse-switch\n"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Le5/a;->w()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ld5/n;->j:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ld5/m;

    .line 40
    .line 41
    new-instance v2, Lb6/f;

    .line 42
    .line 43
    iget v3, v1, Ld5/m;->a:I

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lb6/f;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, Le5/a;->g(Lw5/a;)V

    .line 49
    .line 50
    .line 51
    const-string v2, " -> "

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ld5/m;->a(Le5/a;)V

    .line 57
    .line 58
    .line 59
    iget v1, v1, Ld5/m;->a:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v1}, Ld5/e;->f(Le5/a;I)Z

    .line 62
    .line 63
    .line 64
    const/16 v1, 0xa

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lq5/a;->write(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p1}, Le5/a;->u()V

    .line 71
    .line 72
    .line 73
    const-string v0, ".end sparse-switch"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1
.end method
