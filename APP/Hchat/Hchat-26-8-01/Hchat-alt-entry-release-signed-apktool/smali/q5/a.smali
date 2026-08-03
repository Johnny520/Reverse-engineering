.class public Lq5/a;
.super Ljava/io/Writer;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lp5/a;)V
    .locals 3

    .line 1
    const-string v0, "Annotation["

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
    invoke-virtual {p1}, Lp5/a;->a()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lk5/c;

    .line 34
    .line 35
    const-string v2, ", "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lk5/c;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0, v2}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    const/16 v2, 0x3d

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lk5/c;->b()Lw5/a;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lq5/a;->g(Lw5/a;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/16 p1, 0x5d

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final append(C)Ljava/io/Writer;
    .locals 1

    .line 11
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 9
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 12
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 8
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 10
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public b(Lp5/b;)V
    .locals 4

    .line 1
    const-string v0, "Array["

    .line 2
    .line 3
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lp5/b;->a()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lw5/a;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string v3, ", "

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p0, v2}, Lq5/a;->g(Lw5/a;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 p1, 0x5d

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public c(Ln5/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ln5/a;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lq5/a;->s(Ljava/lang/CharSequence;)V

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
    invoke-virtual {p0, v3}, Lq5/a;->g(Lw5/a;)V

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
    invoke-virtual {p0, p1}, Lq5/a;->i(Li5/b;)V

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

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Ljava/lang/CharSequence;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    move v2, v0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/16 v5, 0x3b

    .line 19
    .line 20
    const-string v6, "Invalid type string: %s"

    .line 21
    .line 22
    if-ge v2, v4, :cond_4

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v7, 0x2f

    .line 29
    .line 30
    if-ne v4, v7, :cond_1

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-interface {p1, v3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {p0, v3}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(I)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v6, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    if-ne v4, v5, :cond_3

    .line 60
    .line 61
    if-eq v2, v3, :cond_2

    .line 62
    .line 63
    invoke-interface {p1, v3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p0, v3}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {v6, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sub-int/2addr v1, v0

    .line 94
    if-ne v2, v1, :cond_5

    .line 95
    .line 96
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-ne v0, v5, :cond_5

    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {v6, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(Lw5/a;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lw5/a;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "0x%x"

    .line 6
    .line 7
    iget-object v2, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    if-eq v0, v3, :cond_5

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eq v0, v3, :cond_4

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    if-eq v0, v3, :cond_3

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    if-eq v0, v3, :cond_2

    .line 22
    .line 23
    const/16 v1, 0x10

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/16 v1, 0x11

    .line 28
    .line 29
    if-eq v0, v1, :cond_0

    .line 30
    .line 31
    packed-switch v0, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    const-string p1, "Unknown encoded value type"

    .line 35
    .line 36
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast p1, Lb6/a;

    .line 41
    .line 42
    iget-boolean p1, p1, Lb6/a;->g:Z

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    const-string p1, "null"

    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_2
    check-cast p1, Lp5/a;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lq5/a;->a(Lp5/a;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_3
    check-cast p1, Lp5/b;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lq5/a;->b(Lp5/b;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    check-cast p1, Lp5/c;

    .line 71
    .line 72
    invoke-virtual {p1}, Lp5/c;->a()Li5/a;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lq5/a;->h(Li5/a;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_5
    check-cast p1, Lp5/e;

    .line 81
    .line 82
    invoke-virtual {p1}, Lp5/e;->a()Li5/b;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Lq5/a;->i(Li5/b;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_6
    check-cast p1, Lp5/d;

    .line 91
    .line 92
    invoke-virtual {p1}, Lp5/d;->a()Li5/a;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Lq5/a;->h(Li5/a;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_7
    check-cast p1, Lp5/i;

    .line 101
    .line 102
    invoke-virtual {p1}, Lp5/i;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_8
    check-cast p1, Lp5/h;

    .line 111
    .line 112
    invoke-virtual {p1}, Lp5/h;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_9
    check-cast p1, Lp5/f;

    .line 121
    .line 122
    invoke-virtual {p1}, Lp5/f;->a()Ln5/c;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p0, p1}, Lq5/a;->k(Ln5/c;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_a
    check-cast p1, Lp5/g;

    .line 131
    .line 132
    invoke-virtual {p1}, Lp5/g;->a()Ln5/d;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p1}, Lq5/a;->l(Ln5/d;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_0
    check-cast p1, Lb6/d;

    .line 141
    .line 142
    iget-wide v0, p1, Lb6/d;->g:D

    .line 143
    .line 144
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_1
    check-cast p1, Lb6/e;

    .line 153
    .line 154
    iget p1, p1, Lb6/e;->g:F

    .line 155
    .line 156
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_2
    check-cast p1, Lb6/f;

    .line 165
    .line 166
    iget p1, p1, Lb6/f;->g:I

    .line 167
    .line 168
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_3
    check-cast p1, Lb6/c;

    .line 185
    .line 186
    iget-char p1, p1, Lb6/c;->g:C

    .line 187
    .line 188
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_4
    check-cast p1, Lb6/i;

    .line 205
    .line 206
    iget-short p1, p1, Lb6/i;->g:S

    .line 207
    .line 208
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_5
    check-cast p1, Lb6/g;

    .line 225
    .line 226
    iget-wide v3, p1, Lb6/g;->g:J

    .line 227
    .line 228
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_6
    check-cast p1, Lb6/b;

    .line 245
    .line 246
    iget-byte p1, p1, Lb6/b;->g:B

    .line 247
    .line 248
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    nop

    .line 265
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

.method public h(Li5/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Li5/a;->f1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "->"

    .line 9
    .line 10
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Li5/a;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x3a

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

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
.end method

.method public i(Li5/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Li5/b;->f1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "->"

    .line 9
    .line 10
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Li5/b;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x28

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Li5/b;->g1()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/CharSequence;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/16 v0, 0x29

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Li5/b;->h1()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final k(Ln5/c;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ln5/c;->g1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lf5/d;->a:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x40

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ln5/c;->f1()Lv5/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    instance-of v0, p1, Li5/b;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast p1, Li5/b;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lq5/a;->i(Li5/b;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    check-cast p1, Li5/a;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lq5/a;->h(Li5/a;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    new-instance p1, Lc6/a;

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    const-string v2, "Invalid method handle type: %d"

    .line 61
    .line 62
    invoke-direct {p1, v1, v2, v0}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public final l(Ln5/d;)V
    .locals 3

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    iget-object v1, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ln5/d;->e1()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

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
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0x29

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ln5/d;->f1()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final m(Ljava/lang/CharSequence;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v2, v3, :cond_7

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x20

    .line 24
    .line 25
    const/16 v5, 0x7f

    .line 26
    .line 27
    if-lt v3, v4, :cond_2

    .line 28
    .line 29
    if-ge v3, v5, :cond_2

    .line 30
    .line 31
    const/16 v4, 0x27

    .line 32
    .line 33
    const/16 v5, 0x5c

    .line 34
    .line 35
    if-eq v3, v4, :cond_0

    .line 36
    .line 37
    if-eq v3, v1, :cond_0

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v0, v5}, Ljava/io/Writer;->write(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    if-gt v3, v5, :cond_6

    .line 49
    .line 50
    const/16 v4, 0x9

    .line 51
    .line 52
    if-eq v3, v4, :cond_5

    .line 53
    .line 54
    const/16 v4, 0xa

    .line 55
    .line 56
    if-eq v3, v4, :cond_4

    .line 57
    .line 58
    const/16 v4, 0xd

    .line 59
    .line 60
    if-eq v3, v4, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const-string v3, "\\r"

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    const-string v3, "\\n"

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    const-string v3, "\\t"

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    :goto_1
    const-string v4, "\\u"

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    shr-int/lit8 v4, v3, 0xc

    .line 87
    .line 88
    const/16 v5, 0x10

    .line 89
    .line 90
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(I)V

    .line 95
    .line 96
    .line 97
    shr-int/lit8 v4, v3, 0x8

    .line 98
    .line 99
    and-int/lit8 v4, v4, 0xf

    .line 100
    .line 101
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(I)V

    .line 106
    .line 107
    .line 108
    shr-int/lit8 v4, v3, 0x4

    .line 109
    .line 110
    and-int/lit8 v4, v4, 0xf

    .line 111
    .line 112
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(I)V

    .line 117
    .line 118
    .line 119
    and-int/lit8 v3, v3, 0xf

    .line 120
    .line 121
    invoke-static {v3, v5}, Ljava/lang/Character;->forDigit(II)C

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    .line 126
    .line 127
    .line 128
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final o(Lv5/b;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ln5/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ln5/f;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p1, Lv5/c;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lv5/c;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v0, p1, Li5/a;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p1, Li5/a;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lq5/a;->h(Li5/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    instance-of v0, p1, Li5/b;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    check-cast p1, Li5/b;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lq5/a;->i(Li5/b;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    instance-of v0, p1, Ln5/d;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    check-cast p1, Ln5/d;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lq5/a;->l(Ln5/d;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    instance-of v0, p1, Ln5/c;

    .line 52
    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    check-cast p1, Ln5/c;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lq5/a;->k(Ln5/c;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_5
    instance-of v0, p1, Ln5/a;

    .line 62
    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    check-cast p1, Ln5/a;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lq5/a;->c(Ln5/a;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "Not a known reference type: "

    .line 76
    .line 77
    invoke-static {p1, v0}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final q(Li5/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Li5/b;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lq5/a;->s(Ljava/lang/CharSequence;)V

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
    invoke-virtual {p1}, Li5/b;->g1()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v0, 0x29

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Li5/b;->h1()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public s(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(Ljava/lang/CharSequence;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "Invalid type string: %s"

    .line 7
    .line 8
    if-ge v0, v1, :cond_5

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v3, 0x4c

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lq5/a;->e(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/16 v3, 0x5b

    .line 31
    .line 32
    iget-object v4, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4, v1}, Ljava/io/Writer;->write(I)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 v3, 0x5a

    .line 43
    .line 44
    if-eq v1, v3, :cond_3

    .line 45
    .line 46
    const/16 v3, 0x42

    .line 47
    .line 48
    if-eq v1, v3, :cond_3

    .line 49
    .line 50
    const/16 v3, 0x53

    .line 51
    .line 52
    if-eq v1, v3, :cond_3

    .line 53
    .line 54
    const/16 v3, 0x43

    .line 55
    .line 56
    if-eq v1, v3, :cond_3

    .line 57
    .line 58
    const/16 v3, 0x49

    .line 59
    .line 60
    if-eq v1, v3, :cond_3

    .line 61
    .line 62
    const/16 v3, 0x4a

    .line 63
    .line 64
    if-eq v1, v3, :cond_3

    .line 65
    .line 66
    const/16 v3, 0x46

    .line 67
    .line 68
    if-eq v1, v3, :cond_3

    .line 69
    .line 70
    const/16 v3, 0x44

    .line 71
    .line 72
    if-eq v1, v3, :cond_3

    .line 73
    .line 74
    const/16 v3, 0x56

    .line 75
    .line 76
    if-ne v1, v3, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {v2, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    :goto_1
    invoke-virtual {v4, v1}, Ljava/io/Writer;->write(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    add-int/lit8 v1, v1, -0x1

    .line 95
    .line 96
    if-ne v0, v1, :cond_4

    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v2, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v2, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 1

    .line 9
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 1

    .line 10
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write([C)V
    .locals 1

    .line 7
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write([C)V

    return-void
.end method

.method public final write([CII)V
    .locals 1

    .line 8
    iget-object v0, p0, Lq5/a;->g:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    return-void
.end method
