.class public final Le5/a;
.super Lq5/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:[C


# direct methods
.method public constructor <init>(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ld6/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ld6/g;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ld6/g;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :goto_0
    invoke-direct {p0, p1}, Lq5/a;-><init>(Ljava/io/Writer;)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x18

    .line 16
    .line 17
    new-array p1, p1, [C

    .line 18
    .line 19
    iput-object p1, p0, Le5/a;->i:[C

    .line 20
    .line 21
    iput-object p2, p0, Le5/a;->h:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/16 v1, 0x4c

    .line 6
    .line 7
    iget-object v2, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "-0x"

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    neg-long v3, p1

    .line 17
    invoke-virtual {p0, v3, v4}, Le5/a;->C(J)V

    .line 18
    .line 19
    .line 20
    const-wide/32 v3, -0x80000000

    .line 21
    .line 22
    .line 23
    cmp-long p1, p1, v3

    .line 24
    .line 25
    if-gez p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string v0, "0x"

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Le5/a;->C(J)V

    .line 37
    .line 38
    .line 39
    const-wide/32 v3, 0x7fffffff

    .line 40
    .line 41
    .line 42
    cmp-long p1, p1, v3

    .line 43
    .line 44
    if-lez p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public final B(Ljava/lang/CharSequence;Z)V
    .locals 2

    .line 1
    const/16 v0, 0x60

    .line 2
    .line 3
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v1, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final C(J)V
    .locals 4

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    :cond_0
    const-wide/16 v1, 0xf

    .line 4
    .line 5
    and-long/2addr v1, p1

    .line 6
    long-to-int v1, v1

    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    iget-object v3, p0, Le5/a;->i:[C

    .line 10
    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    add-int/lit8 v2, v0, -0x1

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x30

    .line 16
    .line 17
    int-to-char v1, v1

    .line 18
    aput-char v1, v3, v0

    .line 19
    .line 20
    :goto_0
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v0, -0x1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x57

    .line 25
    .line 26
    int-to-char v1, v1

    .line 27
    aput-char v1, v3, v0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/4 v1, 0x4

    .line 31
    ushr-long/2addr p1, v1

    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    cmp-long v1, p1, v1

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    rsub-int/lit8 p1, v0, 0x18

    .line 41
    .line 42
    invoke-virtual {p0, v3, v0, p1}, Lq5/a;->write([CII)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final a(Lp5/a;)V
    .locals 2

    .line 1
    const-string v0, ".subannotation "

    .line 2
    .line 3
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lp5/a;->getType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lp5/a;->a()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Set;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Le5/a;->x(Ljava/util/Set;)V

    .line 27
    .line 28
    .line 29
    const-string p1, ".end subannotation"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final b(Lp5/b;)V
    .locals 3

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lp5/b;->a()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x7d

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/16 v0, 0xa

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Le5/a;->w()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lw5/a;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const-string v0, ",\n"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p0, v2}, Le5/a;->g(Lw5/a;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p0}, Le5/a;->u()V

    .line 62
    .line 63
    .line 64
    const-string p1, "\n}"

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final c(Ln5/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ln5/a;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Le5/a;->s(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0x28

    .line 9
    .line 10
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ln5/a;->h1()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const-string v0, ", "

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ln5/a;->i1()Ln5/d;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Lq5/a;->l(Ln5/d;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ln5/a;->f1()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lw5/a;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v3}, Le5/a;->g(Lw5/a;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v0, ")@"

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ln5/a;->g1()Ln5/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ln5/c;->g1()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x4

    .line 75
    if-ne v0, v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1}, Ln5/a;->g1()Ln5/c;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Li5/b;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Le5/a;->i(Li5/b;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    const-string p1, "The linker method handle for a call site must be of type invoke-static"

    .line 92
    .line 93
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final e(Ljava/lang/CharSequence;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    move v5, v0

    .line 13
    move v3, v1

    .line 14
    move v4, v3

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/16 v7, 0x3b

    .line 20
    .line 21
    const-string v8, "Invalid type string: %s"

    .line 22
    .line 23
    if-ge v3, v6, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v6}, Ljava/lang/Character;->getType(C)I

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    const/16 v10, 0xc

    .line 34
    .line 35
    if-ne v9, v10, :cond_0

    .line 36
    .line 37
    move v5, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/16 v9, 0x2f

    .line 40
    .line 41
    if-ne v6, v9, :cond_2

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    invoke-interface {p1, v4, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p0, v4, v5}, Le5/a;->B(Ljava/lang/CharSequence;Z)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-virtual {v2, v4}, Ljava/io/Writer;->write(I)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v4, v3, 0x1

    .line 60
    .line 61
    move v5, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {v8, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    if-ne v6, v7, :cond_4

    .line 72
    .line 73
    if-eq v3, v4, :cond_3

    .line 74
    .line 75
    invoke-interface {p1, v4, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0, v5}, Le5/a;->B(Ljava/lang/CharSequence;Z)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v8, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    sub-int/2addr v0, v1

    .line 106
    if-ne v3, v0, :cond_6

    .line 107
    .line 108
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-ne v0, v7, :cond_6

    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {v8, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final g(Lw5/a;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lw5/a;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    if-eq v0, v1, :cond_c

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_b

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    iget-object v3, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    const-string p1, "Unknown encoded value type"

    .line 33
    .line 34
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    check-cast p1, Lb6/a;

    .line 39
    .line 40
    iget-boolean p1, p1, Lb6/a;->g:Z

    .line 41
    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    const-string p1, "null"

    .line 51
    .line 52
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    check-cast p1, Lp5/a;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Le5/a;->a(Lp5/a;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3
    check-cast p1, Lp5/b;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Le5/a;->b(Lp5/b;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_4
    check-cast p1, Lp5/c;

    .line 69
    .line 70
    const-string v0, ".enum "

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lp5/c;->a()Li5/a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Le5/a;->h(Li5/a;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    check-cast p1, Lp5/e;

    .line 84
    .line 85
    invoke-virtual {p1}, Lp5/e;->a()Li5/b;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Le5/a;->i(Li5/b;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_6
    check-cast p1, Lp5/d;

    .line 94
    .line 95
    invoke-virtual {p1}, Lp5/d;->a()Li5/a;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Le5/a;->h(Li5/a;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_7
    check-cast p1, Lp5/i;

    .line 104
    .line 105
    invoke-virtual {p1}, Lp5/i;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_8
    check-cast p1, Lp5/h;

    .line 114
    .line 115
    invoke-virtual {p1}, Lp5/h;->a()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, p1}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_9
    check-cast p1, Lp5/f;

    .line 124
    .line 125
    invoke-virtual {p1}, Lp5/f;->a()Ln5/c;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Lq5/a;->k(Ln5/c;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_a
    check-cast p1, Lp5/g;

    .line 134
    .line 135
    invoke-virtual {p1}, Lp5/g;->a()Ln5/d;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p1}, Lq5/a;->l(Ln5/d;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_0
    check-cast p1, Lb6/d;

    .line 144
    .line 145
    iget-wide v0, p1, Lb6/d;->g:D

    .line 146
    .line 147
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_1
    check-cast p1, Lb6/e;

    .line 156
    .line 157
    iget p1, p1, Lb6/e;->g:F

    .line 158
    .line 159
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 p1, 0x66

    .line 167
    .line 168
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(I)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_2
    check-cast p1, Lb6/f;

    .line 173
    .line 174
    iget p1, p1, Lb6/f;->g:I

    .line 175
    .line 176
    int-to-long v0, p1

    .line 177
    const/4 p1, 0x0

    .line 178
    invoke-virtual {p0, v0, v1, p1}, Le5/a;->y(JLjava/lang/Character;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_3
    check-cast p1, Lb6/c;

    .line 183
    .line 184
    iget-char p1, p1, Lb6/c;->g:C

    .line 185
    .line 186
    const/16 v0, 0x20

    .line 187
    .line 188
    const/16 v1, 0x7f

    .line 189
    .line 190
    const/16 v4, 0x27

    .line 191
    .line 192
    if-lt p1, v0, :cond_6

    .line 193
    .line 194
    if-ge p1, v1, :cond_6

    .line 195
    .line 196
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(I)V

    .line 197
    .line 198
    .line 199
    const/16 v0, 0x5c

    .line 200
    .line 201
    if-eq p1, v4, :cond_4

    .line 202
    .line 203
    const/16 v1, 0x22

    .line 204
    .line 205
    if-eq p1, v1, :cond_4

    .line 206
    .line 207
    if-ne p1, v0, :cond_5

    .line 208
    .line 209
    :cond_4
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(I)V

    .line 210
    .line 211
    .line 212
    :cond_5
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(I)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_6
    if-gt p1, v1, :cond_a

    .line 220
    .line 221
    const/16 v0, 0x9

    .line 222
    .line 223
    if-eq p1, v0, :cond_9

    .line 224
    .line 225
    const/16 v0, 0xa

    .line 226
    .line 227
    if-eq p1, v0, :cond_8

    .line 228
    .line 229
    const/16 v0, 0xd

    .line 230
    .line 231
    if-eq p1, v0, :cond_7

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_7
    const-string p1, "\'\\r\'"

    .line 235
    .line 236
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_8
    const-string p1, "\'\\n\'"

    .line 241
    .line 242
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_9
    const-string p1, "\'\\t\'"

    .line 247
    .line 248
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_a
    :goto_0
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(I)V

    .line 253
    .line 254
    .line 255
    const-string v0, "\\u"

    .line 256
    .line 257
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    shr-int/lit8 v0, p1, 0xc

    .line 261
    .line 262
    invoke-static {v0, v2}, Ljava/lang/Character;->forDigit(II)C

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(I)V

    .line 267
    .line 268
    .line 269
    shr-int/lit8 v0, p1, 0x8

    .line 270
    .line 271
    and-int/lit8 v0, v0, 0xf

    .line 272
    .line 273
    invoke-static {v0, v2}, Ljava/lang/Character;->forDigit(II)C

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(I)V

    .line 278
    .line 279
    .line 280
    shr-int/lit8 v0, p1, 0x4

    .line 281
    .line 282
    and-int/lit8 v0, v0, 0xf

    .line 283
    .line 284
    invoke-static {v0, v2}, Ljava/lang/Character;->forDigit(II)C

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(I)V

    .line 289
    .line 290
    .line 291
    and-int/lit8 p1, p1, 0xf

    .line 292
    .line 293
    invoke-static {p1, v2}, Ljava/lang/Character;->forDigit(II)C

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(I)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_b
    check-cast p1, Lb6/i;

    .line 305
    .line 306
    iget-short p1, p1, Lb6/i;->g:S

    .line 307
    .line 308
    int-to-long v0, p1

    .line 309
    const/16 p1, 0x73

    .line 310
    .line 311
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p0, v0, v1, p1}, Le5/a;->y(JLjava/lang/Character;)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :cond_c
    check-cast p1, Lb6/g;

    .line 320
    .line 321
    iget-wide v0, p1, Lb6/g;->g:J

    .line 322
    .line 323
    const/16 p1, 0x4c

    .line 324
    .line 325
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p0, v0, v1, p1}, Le5/a;->y(JLjava/lang/Character;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_d
    check-cast p1, Lb6/b;

    .line 334
    .line 335
    iget-byte p1, p1, Lb6/b;->g:B

    .line 336
    .line 337
    int-to-long v0, p1

    .line 338
    const/16 p1, 0x74

    .line 339
    .line 340
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-virtual {p0, v0, v1, p1}, Le5/a;->y(JLjava/lang/Character;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    nop

    .line 349
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
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

.method public final h(Li5/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Li5/a;->f1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Le5/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Li5/a;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Le5/a;->s(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 21
    .line 22
    const/16 v1, 0x3a

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Li5/a;->getType()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-super {p0, p1}, Lq5/a;->h(Li5/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final i(Li5/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Li5/b;->f1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Le5/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lq5/a;->q(Li5/b;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-super {p0, p1}, Lq5/a;->i(Li5/b;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final s(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Character;->getType(C)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    invoke-virtual {p0, p1, v0}, Le5/a;->B(Ljava/lang/CharSequence;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    check-cast v0, Ld6/g;

    .line 4
    .line 5
    iget v1, v0, Ld6/g;->h:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x4

    .line 8
    .line 9
    iput v1, v0, Ld6/g;->h:I

    .line 10
    .line 11
    if-gez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Ld6/g;->h:I

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    check-cast v0, Ld6/g;

    .line 4
    .line 5
    iget v1, v0, Ld6/g;->h:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    iput v1, v0, Ld6/g;->h:I

    .line 10
    .line 11
    if-gez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Ld6/g;->h:I

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final x(Ljava/util/Set;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le5/a;->w()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lk5/c;

    .line 19
    .line 20
    invoke-virtual {v0}, Lk5/c;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v1}, Le5/a;->s(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    const-string v1, " = "

    .line 28
    .line 29
    iget-object v2, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lk5/c;->b()Lw5/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Le5/a;->g(Lw5/a;)V

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, Le5/a;->u()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final y(JLjava/lang/Character;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "-0x"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    neg-long p1, p1

    .line 15
    invoke-virtual {p0, p1, p2}, Le5/a;->C(J)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "0x"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Le5/a;->C(J)V

    .line 25
    .line 26
    .line 27
    :goto_0
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final z(I)V
    .locals 4

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x2d

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lq5/a;->write(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/16 v0, 0xf

    .line 9
    .line 10
    :goto_0
    rem-int/lit8 v1, p1, 0xa

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v2, v0, -0x1

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x30

    .line 19
    .line 20
    int-to-char v1, v1

    .line 21
    iget-object v3, p0, Le5/a;->i:[C

    .line 22
    .line 23
    aput-char v1, v3, v0

    .line 24
    .line 25
    div-int/lit8 p1, p1, 0xa

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    rsub-int/lit8 p1, v0, 0x10

    .line 30
    .line 31
    invoke-virtual {p0, v3, v0, p1}, Lq5/a;->write([CII)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    move v0, v2

    .line 36
    goto :goto_0
.end method
