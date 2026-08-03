.class public final Lf/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/List;
.implements Lhg/c;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf/d0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lj0/b;->a(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lf/f0;

    .line 17
    .line 18
    if-ltz p1, :cond_2

    .line 19
    .line 20
    iget v1, v0, Lf/f0;->b:I

    .line 21
    .line 22
    if-gt p1, v1, :cond_2

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    iget-object v2, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    array-length v3, v2

    .line 29
    if-ge v3, v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lf/f0;->m(I[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 35
    .line 36
    iget v2, v0, Lf/f0;->b:I

    .line 37
    .line 38
    if-eq p1, v2, :cond_1

    .line 39
    .line 40
    add-int/lit8 v3, p1, 0x1

    .line 41
    .line 42
    invoke-static {v3, p1, v1, v2, v1}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    aput-object p2, v1, p1

    .line 46
    .line 47
    iget p1, v0, Lf/f0;->b:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    iput p1, v0, Lf/f0;->b:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {v0, p1}, Lf/f0;->p(I)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    throw p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lf/d0;->g:I

    packed-switch v0, :pswitch_data_0

    .line 59
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lj0/b;

    invoke-virtual {v0, p1}, Lj0/b;->b(Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 60
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lf/f0;

    invoke-virtual {v0, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 7

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lj0/b;->e(ILjava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lf/f0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-ltz p1, :cond_5

    .line 24
    .line 25
    iget v2, v0, Lf/f0;->b:I

    .line 26
    .line 27
    if-gt p1, v2, :cond_5

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget v2, v0, Lf/f0;->b:I

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    add-int/2addr v4, v2

    .line 44
    iget-object v2, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 45
    .line 46
    array-length v5, v2

    .line 47
    if-ge v5, v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v4, v2}, Lf/f0;->m(I[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v2, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 53
    .line 54
    iget v4, v0, Lf/f0;->b:I

    .line 55
    .line 56
    if-eq p1, v4, :cond_2

    .line 57
    .line 58
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    add-int/2addr v4, p1

    .line 63
    iget v5, v0, Lf/f0;->b:I

    .line 64
    .line 65
    invoke-static {v4, p1, v2, v5, v2}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    move-object v4, p2

    .line 69
    check-cast v4, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    add-int/lit8 v6, v3, 0x1

    .line 86
    .line 87
    if-ltz v3, :cond_3

    .line 88
    .line 89
    add-int/2addr v3, p1

    .line 90
    aput-object v5, v2, v3

    .line 91
    .line 92
    move v3, v6

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-static {}, La/a;->Q0()V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_4
    iget p1, v0, Lf/f0;->b:I

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    add-int/2addr p2, p1

    .line 105
    iput p2, v0, Lf/f0;->b:I

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    :goto_1
    return v3

    .line 109
    :cond_5
    invoke-virtual {v0, p1}, Lf/f0;->p(I)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 3

    iget v0, p0, Lf/d0;->g:I

    packed-switch v0, :pswitch_data_0

    .line 113
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lj0/b;

    .line 114
    iget v1, v0, Lj0/b;->i:I

    .line 115
    invoke-virtual {v0, v1, p1}, Lj0/b;->e(ILjava/util/Collection;)Z

    move-result p1

    return p1

    .line 116
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lf/f0;

    check-cast p1, Ljava/lang/Iterable;

    .line 118
    iget v1, v0, Lf/f0;->b:I

    .line 119
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 120
    invoke-virtual {v0, v2}, Lf/f0;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 121
    :cond_0
    iget p1, v0, Lf/f0;->b:I

    if-eq v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj0/b;->g()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lf/f0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf/f0;->d()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lj0/b;->h(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lf/f0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lf/f0;->g(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ltz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    return p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lj0/b;->h(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x1

    .line 35
    :goto_0
    return p1

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lf/f0;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Lf/f0;->g(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ltz v1, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    const/4 p1, 0x1

    .line 69
    :goto_2
    return p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p0}, Lj0/c;->a(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lj0/b;

    .line 12
    .line 13
    iget-object v0, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object p1, v0, p1

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    invoke-static {p1, p0}, Lf/p0;->a(ILjava/util/List;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lf/f0;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lj0/b;->i(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lf/f0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lf/f0;->g(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    iget v0, v0, Lj0/b;->i:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lf/f0;

    .line 21
    .line 22
    invoke-virtual {v0}, Lf/f0;->h()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf/c0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, p0, v1, v2}, Lf/c0;-><init>(Ljava/util/List;II)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lf/c0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, p0, v1, v2}, Lf/c0;-><init>(Ljava/util/List;II)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    iget v1, v0, Lj0/b;->i:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iget-object v0, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    :goto_0
    if-ltz v1, :cond_1

    .line 17
    .line 18
    aget-object v2, v0, v1

    .line 19
    .line 20
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, -0x1

    .line 31
    :goto_1
    return v1

    .line 32
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lf/f0;

    .line 35
    .line 36
    iget-object v1, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v0, v0, Lf/f0;->b:I

    .line 39
    .line 40
    const/4 v2, -0x1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    :goto_2
    if-ge v2, v0, :cond_5

    .line 46
    .line 47
    aget-object p1, v1, v0

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    :goto_3
    move v2, v0

    .line 52
    goto :goto_5

    .line 53
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    :goto_4
    if-ge v2, v0, :cond_5

    .line 59
    .line 60
    aget-object v3, v1, v0

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    :goto_5
    return v2

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 3

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf/c0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, p0, v1, v2}, Lf/c0;-><init>(Ljava/util/List;II)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lf/c0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, p0, v1, v2}, Lf/c0;-><init>(Ljava/util/List;II)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    iget v0, p0, Lf/d0;->g:I

    packed-switch v0, :pswitch_data_0

    .line 23
    new-instance v0, Lf/c0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lf/c0;-><init>(Ljava/util/List;II)V

    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Lf/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lf/c0;-><init>(Ljava/util/List;II)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p0}, Lj0/c;->a(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lj0/b;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :pswitch_0
    invoke-static {p1, p0}, Lf/p0;->a(ILjava/util/List;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lf/f0;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lf/d0;->g:I

    packed-switch v0, :pswitch_data_0

    .line 31
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lj0/b;

    invoke-virtual {v0, p1}, Lj0/b;->j(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 32
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    check-cast v0, Lf/f0;

    invoke-virtual {v0, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget v1, v0, Lj0/b;->i:I

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget p1, v0, Lj0/b;->i:I

    .line 40
    .line 41
    if-eq v1, p1, :cond_2

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 46
    :goto_2
    return p1

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lf/f0;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Iterable;

    .line 55
    .line 56
    iget v1, v0, Lf/f0;->b:I

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    iget p1, v0, Lf/f0;->b:I

    .line 77
    .line 78
    if-eq v1, p1, :cond_4

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const/4 p1, 0x0

    .line 83
    :goto_4
    return p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 5

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    iget v1, v0, Lj0/b;->i:I

    .line 11
    .line 12
    add-int/lit8 v2, v1, -0x1

    .line 13
    .line 14
    :goto_0
    const/4 v3, -0x1

    .line 15
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    iget-object v3, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 18
    .line 19
    aget-object v3, v3, v2

    .line 20
    .line 21
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget p1, v0, Lj0/b;->i:I

    .line 34
    .line 35
    if-eq v1, p1, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    :goto_1
    return p1

    .line 41
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lf/f0;

    .line 47
    .line 48
    iget v1, v0, Lf/f0;->b:I

    .line 49
    .line 50
    iget-object v2, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 51
    .line 52
    add-int/lit8 v3, v1, -0x1

    .line 53
    .line 54
    :goto_2
    const/4 v4, -0x1

    .line 55
    if-ge v4, v3, :cond_4

    .line 56
    .line 57
    aget-object v4, v2, v3

    .line 58
    .line 59
    invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_3
    add-int/lit8 v3, v3, -0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget p1, v0, Lf/f0;->b:I

    .line 72
    .line 73
    if-eq v1, p1, :cond_5

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/4 p1, 0x0

    .line 78
    :goto_3
    return p1

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p0}, Lj0/c;->a(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lj0/b;

    .line 12
    .line 13
    iget-object v0, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v1, v0, p1

    .line 16
    .line 17
    aput-object p2, v0, p1

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    invoke-static {p1, p0}, Lf/p0;->a(ILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lf/f0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lf/f0;->n(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/b;

    .line 9
    .line 10
    iget v0, v0, Lj0/b;->i:I

    .line 11
    .line 12
    return v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lf/d0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lf/f0;

    .line 16
    .line 17
    iget v0, v0, Lf/f0;->b:I

    .line 18
    .line 19
    return v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lj0/c;->b(Ljava/util/List;II)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lf/e0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, p1, p2, v1}, Lf/e0;-><init>(Ljava/util/List;III)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    invoke-static {p0, p1, p2}, Lf/p0;->b(Ljava/util/List;II)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lf/e0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p1, p2, v1}, Lf/e0;-><init>(Ljava/util/List;III)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf/d0;->g:I

    packed-switch v0, :pswitch_data_0

    .line 19
    invoke-static {p0}, Lgg/k;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 20
    :pswitch_0
    invoke-static {p0}, Lgg/k;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf/d0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lgg/k;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lgg/k;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
