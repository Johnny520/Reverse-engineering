.class public final Luf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lhg/a;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:I

.field public j:I

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luf/b;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Luf/a;->g:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 37
    iput p2, p0, Luf/a;->h:I

    const/4 p2, -0x1

    .line 38
    iput p2, p0, Luf/a;->i:I

    .line 39
    invoke-static {p1}, Luf/b;->d(Luf/b;)I

    move-result p1

    iput p1, p0, Luf/a;->j:I

    return-void
.end method

.method public constructor <init>(Luf/c;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luf/a;->g:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 25
    iput p2, p0, Luf/a;->h:I

    const/4 p2, -0x1

    .line 26
    iput p2, p0, Luf/a;->i:I

    .line 27
    invoke-static {p1}, Luf/c;->d(Luf/c;)I

    move-result p1

    iput p1, p0, Luf/a;->j:I

    return-void
.end method

.method public constructor <init>(Lw0/p;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Luf/a;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 8
    .line 9
    add-int/lit8 p2, p2, -0x1

    .line 10
    .line 11
    iput p2, p0, Luf/a;->h:I

    .line 12
    .line 13
    const/4 p2, -0x1

    .line 14
    iput p2, p0, Luf/a;->i:I

    .line 15
    .line 16
    invoke-static {p1}, Lw0/q;->g(Lw0/p;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Luf/a;->j:I

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lx1/p;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Luf/a;->g:I

    and-int/lit8 p3, p3, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move p2, v0

    .line 28
    :cond_0
    iget-object p3, p1, Lx1/p;->g:Lf/f0;

    .line 29
    iget p3, p3, Lf/f0;->b:I

    .line 30
    invoke-direct {p0, p1, p2, v0, p3}, Luf/a;-><init>(Lx1/p;III)V

    return-void
.end method

.method public constructor <init>(Lx1/p;III)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Luf/a;->g:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 32
    iput p2, p0, Luf/a;->h:I

    .line 33
    iput p3, p0, Luf/a;->i:I

    .line 34
    iput p4, p0, Luf/a;->j:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luf/b;

    .line 4
    .line 5
    iget-object v0, v0, Luf/b;->k:Luf/c;

    .line 6
    .line 7
    invoke-static {v0}, Luf/c;->d(Luf/c;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Luf/a;->j:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Luf/a;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lw0/p;

    .line 20
    .line 21
    iget v1, p0, Luf/a;->h:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lw0/p;->add(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, p0, Luf/a;->i:I

    .line 30
    .line 31
    iget p1, p0, Luf/a;->h:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Luf/a;->h:I

    .line 36
    .line 37
    invoke-static {v0}, Lw0/q;->g(Lw0/p;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Luf/a;->j:I

    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    invoke-virtual {p0}, Luf/a;->c()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Luf/c;

    .line 50
    .line 51
    iget v1, p0, Luf/a;->h:I

    .line 52
    .line 53
    add-int/lit8 v2, v1, 0x1

    .line 54
    .line 55
    iput v2, p0, Luf/a;->h:I

    .line 56
    .line 57
    invoke-virtual {v0, v1, p1}, Luf/c;->add(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, -0x1

    .line 61
    iput p1, p0, Luf/a;->i:I

    .line 62
    .line 63
    invoke-static {v0}, Luf/c;->d(Luf/c;)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput p1, p0, Luf/a;->j:I

    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    invoke-virtual {p0}, Luf/a;->a()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Luf/b;

    .line 76
    .line 77
    iget v1, p0, Luf/a;->h:I

    .line 78
    .line 79
    add-int/lit8 v2, v1, 0x1

    .line 80
    .line 81
    iput v2, p0, Luf/a;->h:I

    .line 82
    .line 83
    invoke-virtual {v0, v1, p1}, Luf/b;->add(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, -0x1

    .line 87
    iput p1, p0, Luf/a;->i:I

    .line 88
    .line 89
    invoke-static {v0}, Luf/b;->d(Luf/b;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Luf/a;->j:I

    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luf/c;

    .line 4
    .line 5
    invoke-static {v0}, Luf/c;->d(Luf/c;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Luf/a;->j:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw0/p;

    .line 4
    .line 5
    invoke-static {v0}, Lw0/q;->g(Lw0/p;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Luf/a;->j:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Luf/a;->h:I

    .line 7
    .line 8
    iget v1, p0, Luf/a;->j:I

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0

    .line 16
    :pswitch_0
    iget v0, p0, Luf/a;->h:I

    .line 17
    .line 18
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lw0/p;

    .line 21
    .line 22
    invoke-virtual {v1}, Lw0/p;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    sub-int/2addr v1, v2

    .line 28
    if-ge v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    :goto_1
    return v2

    .line 33
    :pswitch_1
    iget v0, p0, Luf/a;->h:I

    .line 34
    .line 35
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Luf/c;

    .line 38
    .line 39
    iget v1, v1, Luf/c;->h:I

    .line 40
    .line 41
    if-ge v0, v1, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    :goto_2
    return v0

    .line 47
    :pswitch_2
    iget v0, p0, Luf/a;->h:I

    .line 48
    .line 49
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Luf/b;

    .line 52
    .line 53
    iget v1, v1, Luf/b;->i:I

    .line 54
    .line 55
    if-ge v0, v1, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_3
    return v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Luf/a;->h:I

    .line 7
    .line 8
    iget v1, p0, Luf/a;->i:I

    .line 9
    .line 10
    if-le v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0

    .line 16
    :pswitch_0
    iget v0, p0, Luf/a;->h:I

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_1
    return v0

    .line 24
    :pswitch_1
    iget v0, p0, Luf/a;->h:I

    .line 25
    .line 26
    if-lez v0, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_2
    return v0

    .line 32
    :pswitch_2
    iget v0, p0, Luf/a;->h:I

    .line 33
    .line 34
    if-lez v0, :cond_3

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const/4 v0, 0x0

    .line 39
    :goto_3
    return v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx1/p;

    .line 9
    .line 10
    iget-object v0, v0, Lx1/p;->g:Lf/f0;

    .line 11
    .line 12
    iget v1, p0, Luf/a;->h:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Luf/a;->h:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v0, Ly0/n;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    invoke-virtual {p0}, Luf/a;->d()V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Luf/a;->h:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    iput v0, p0, Luf/a;->i:I

    .line 36
    .line 37
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lw0/p;

    .line 40
    .line 41
    invoke-virtual {v1}, Lw0/p;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v0, v2}, Lw0/q;->a(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput v0, p0, Luf/a;->h:I

    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Luf/a;->c()V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Luf/a;->h:I

    .line 59
    .line 60
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Luf/c;

    .line 63
    .line 64
    iget v2, v1, Luf/c;->h:I

    .line 65
    .line 66
    if-ge v0, v2, :cond_0

    .line 67
    .line 68
    add-int/lit8 v2, v0, 0x1

    .line 69
    .line 70
    iput v2, p0, Luf/a;->h:I

    .line 71
    .line 72
    iput v0, p0, Luf/a;->i:I

    .line 73
    .line 74
    iget-object v1, v1, Luf/c;->g:[Ljava/lang/Object;

    .line 75
    .line 76
    aget-object v0, v1, v0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    :goto_0
    return-object v0

    .line 84
    :pswitch_2
    invoke-virtual {p0}, Luf/a;->a()V

    .line 85
    .line 86
    .line 87
    iget v0, p0, Luf/a;->h:I

    .line 88
    .line 89
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Luf/b;

    .line 92
    .line 93
    iget v2, v1, Luf/b;->i:I

    .line 94
    .line 95
    if-ge v0, v2, :cond_1

    .line 96
    .line 97
    add-int/lit8 v2, v0, 0x1

    .line 98
    .line 99
    iput v2, p0, Luf/a;->h:I

    .line 100
    .line 101
    iput v0, p0, Luf/a;->i:I

    .line 102
    .line 103
    iget-object v2, v1, Luf/b;->g:[Ljava/lang/Object;

    .line 104
    .line 105
    iget v1, v1, Luf/b;->h:I

    .line 106
    .line 107
    add-int/2addr v1, v0

    .line 108
    aget-object v0, v2, v1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    :goto_1
    return-object v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Luf/a;->h:I

    .line 7
    .line 8
    iget v1, p0, Luf/a;->i:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    return v0

    .line 12
    :pswitch_0
    iget v0, p0, Luf/a;->h:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    return v0

    .line 17
    :pswitch_1
    iget v0, p0, Luf/a;->h:I

    .line 18
    .line 19
    return v0

    .line 20
    :pswitch_2
    iget v0, p0, Luf/a;->h:I

    .line 21
    .line 22
    return v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx1/p;

    .line 9
    .line 10
    iget-object v0, v0, Lx1/p;->g:Lf/f0;

    .line 11
    .line 12
    iget v1, p0, Luf/a;->h:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    iput v1, p0, Luf/a;->h:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v0, Ly0/n;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    invoke-virtual {p0}, Luf/a;->d()V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Luf/a;->h:I

    .line 32
    .line 33
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lw0/p;

    .line 36
    .line 37
    invoke-virtual {v1}, Lw0/p;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v0, v2}, Lw0/q;->a(II)V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Luf/a;->h:I

    .line 45
    .line 46
    iput v0, p0, Luf/a;->i:I

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget v1, p0, Luf/a;->h:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, -0x1

    .line 55
    .line 56
    iput v1, p0, Luf/a;->h:I

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_1
    invoke-virtual {p0}, Luf/a;->c()V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Luf/a;->h:I

    .line 63
    .line 64
    if-lez v0, :cond_0

    .line 65
    .line 66
    add-int/lit8 v0, v0, -0x1

    .line 67
    .line 68
    iput v0, p0, Luf/a;->h:I

    .line 69
    .line 70
    iput v0, p0, Luf/a;->i:I

    .line 71
    .line 72
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Luf/c;

    .line 75
    .line 76
    iget-object v1, v1, Luf/c;->g:[Ljava/lang/Object;

    .line 77
    .line 78
    aget-object v0, v1, v0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    :goto_0
    return-object v0

    .line 86
    :pswitch_2
    invoke-virtual {p0}, Luf/a;->a()V

    .line 87
    .line 88
    .line 89
    iget v0, p0, Luf/a;->h:I

    .line 90
    .line 91
    if-lez v0, :cond_1

    .line 92
    .line 93
    add-int/lit8 v0, v0, -0x1

    .line 94
    .line 95
    iput v0, p0, Luf/a;->h:I

    .line 96
    .line 97
    iput v0, p0, Luf/a;->i:I

    .line 98
    .line 99
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Luf/b;

    .line 102
    .line 103
    iget-object v2, v1, Luf/b;->g:[Ljava/lang/Object;

    .line 104
    .line 105
    iget v1, v1, Luf/b;->h:I

    .line 106
    .line 107
    add-int/2addr v1, v0

    .line 108
    aget-object v0, v2, v1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    :goto_1
    return-object v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Luf/a;->h:I

    .line 7
    .line 8
    iget v1, p0, Luf/a;->i:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    return v0

    .line 14
    :pswitch_0
    iget v0, p0, Luf/a;->h:I

    .line 15
    .line 16
    return v0

    .line 17
    :pswitch_1
    iget v0, p0, Luf/a;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_2
    iget v0, p0, Luf/a;->h:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Luf/a;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lw0/p;

    .line 20
    .line 21
    iget v1, p0, Luf/a;->i:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lw0/p;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget v1, p0, Luf/a;->h:I

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    add-int/2addr v1, v2

    .line 30
    iput v1, p0, Luf/a;->h:I

    .line 31
    .line 32
    iput v2, p0, Luf/a;->i:I

    .line 33
    .line 34
    invoke-static {v0}, Lw0/q;->g(Lw0/p;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Luf/a;->j:I

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Luf/c;

    .line 44
    .line 45
    invoke-virtual {p0}, Luf/a;->c()V

    .line 46
    .line 47
    .line 48
    iget v1, p0, Luf/a;->i:I

    .line 49
    .line 50
    const/4 v2, -0x1

    .line 51
    if-eq v1, v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Luf/c;->c(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget v1, p0, Luf/a;->i:I

    .line 57
    .line 58
    iput v1, p0, Luf/a;->h:I

    .line 59
    .line 60
    iput v2, p0, Luf/a;->i:I

    .line 61
    .line 62
    invoke-static {v0}, Luf/c;->d(Luf/c;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, Luf/a;->j:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const-string v0, "Call next() or previous() before removing element from the iterator."

    .line 70
    .line 71
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_2
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Luf/b;

    .line 78
    .line 79
    invoke-virtual {p0}, Luf/a;->a()V

    .line 80
    .line 81
    .line 82
    iget v1, p0, Luf/a;->i:I

    .line 83
    .line 84
    const/4 v2, -0x1

    .line 85
    if-eq v1, v2, :cond_1

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Luf/b;->c(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget v1, p0, Luf/a;->i:I

    .line 91
    .line 92
    iput v1, p0, Luf/a;->h:I

    .line 93
    .line 94
    iput v2, p0, Luf/a;->i:I

    .line 95
    .line 96
    invoke-static {v0}, Luf/b;->d(Luf/b;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, p0, Luf/a;->j:I

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const-string v0, "Call next() or previous() before removing element from the iterator."

    .line 104
    .line 105
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Luf/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    iget-object v0, p0, Luf/a;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lw0/p;

    .line 17
    .line 18
    invoke-virtual {p0}, Luf/a;->d()V

    .line 19
    .line 20
    .line 21
    iget v1, p0, Luf/a;->i:I

    .line 22
    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lw0/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lw0/q;->g(Lw0/p;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Luf/a;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p1, "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"

    .line 36
    .line 37
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :pswitch_1
    invoke-virtual {p0}, Luf/a;->c()V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Luf/a;->i:I

    .line 45
    .line 46
    const/4 v1, -0x1

    .line 47
    if-eq v0, v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Luf/c;

    .line 52
    .line 53
    invoke-virtual {v1, v0, p1}, Luf/c;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p1, "Call next() or previous() before replacing element from the iterator."

    .line 58
    .line 59
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    return-void

    .line 63
    :pswitch_2
    invoke-virtual {p0}, Luf/a;->a()V

    .line 64
    .line 65
    .line 66
    iget v0, p0, Luf/a;->i:I

    .line 67
    .line 68
    const/4 v1, -0x1

    .line 69
    if-eq v0, v1, :cond_2

    .line 70
    .line 71
    iget-object v1, p0, Luf/a;->k:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Luf/b;

    .line 74
    .line 75
    invoke-virtual {v1, v0, p1}, Luf/b;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const-string p1, "Call next() or previous() before replacing element from the iterator."

    .line 80
    .line 81
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
