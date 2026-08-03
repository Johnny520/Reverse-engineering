.class public final Lf/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;
.implements Lhg/a;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf/j0;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lf/i0;->g:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lf/i0;->j:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Lf/i0;->h:I

    .line 37
    new-instance v0, Lf/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lf/h0;-><init>(Lf/j0;Lf/i0;Lwf/c;)V

    invoke-static {v0}, Lfb/v0;->B(Lfg/p;)Lng/k;

    move-result-object p1

    iput-object p1, p0, Lf/i0;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf/n0;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lf/i0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lf/i0;->h:I

    .line 11
    .line 12
    new-instance v0, Lf/m0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p1, p0, v1}, Lf/m0;-><init>(Lf/n0;Lf/i0;Lwf/c;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lfb/v0;->B(Lfg/p;)Lng/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf/i0;->g:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 33
    iput-object p2, p0, Lf/i0;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lng/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lf/i0;->g:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lf/i0;->j:Ljava/lang/Object;

    const/4 p1, -0x2

    .line 31
    iput p1, p0, Lf/i0;->h:I

    return-void
.end method

.method public constructor <init>(Lng/r;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lf/i0;->g:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 27
    iget-object p1, p1, Lng/r;->a:Lng/j;

    .line 28
    invoke-interface {p1}, Lng/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lf/i0;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget v0, p0, Lf/i0;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lng/c;

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v1, Lng/c;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lfg/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v1, Lng/c;->b:Lfg/l;

    .line 20
    .line 21
    iget-object v1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    iput-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    :goto_1
    iput v0, p0, Lf/i0;->h:I

    .line 38
    .line 39
    return-void
.end method

.method public final hasNext()Z
    .locals 5

    .line 1
    iget v0, p0, Lf/i0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lf/i0;->h:I

    .line 7
    .line 8
    iget-object v1, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lng/r;

    .line 25
    .line 26
    iget-object v1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/util/Iterator;

    .line 29
    .line 30
    :goto_1
    iget v2, p0, Lf/i0;->h:I

    .line 31
    .line 32
    iget v3, v0, Lng/r;->b:I

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-ge v2, v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iget v2, p0, Lf/i0;->h:I

    .line 47
    .line 48
    add-int/2addr v2, v4

    .line 49
    iput v2, p0, Lf/i0;->h:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget v2, p0, Lf/i0;->h:I

    .line 53
    .line 54
    iget v0, v0, Lng/r;->c:I

    .line 55
    .line 56
    if-ge v2, v0, :cond_2

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 v4, 0x0

    .line 66
    :goto_2
    return v4

    .line 67
    :pswitch_1
    iget v0, p0, Lf/i0;->h:I

    .line 68
    .line 69
    if-gez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p0}, Lf/i0;->a()V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget v0, p0, Lf/i0;->h:I

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    if-ne v0, v1, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    const/4 v1, 0x0

    .line 81
    :goto_3
    return v1

    .line 82
    :pswitch_2
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lng/k;

    .line 85
    .line 86
    invoke-virtual {v0}, Lng/k;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    return v0

    .line 91
    :pswitch_3
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lng/k;

    .line 94
    .line 95
    invoke-virtual {v0}, Lng/k;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    return v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lf/i0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf/i0;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, p0, Lf/i0;->h:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    iput v1, p0, Lf/i0;->h:I

    .line 19
    .line 20
    iget-object v1, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    check-cast v1, Lq0/a;

    .line 31
    .line 32
    iget-object v1, v1, Lq0/a;->b:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v1, Ljava/util/ConcurrentModificationException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v3, "Hash code of an element ("

    .line 42
    .line 43
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ") has changed after it was added to the persistent set."

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v1, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    :goto_0
    return-object v0

    .line 67
    :pswitch_0
    iget-object v0, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lng/r;

    .line 70
    .line 71
    iget-object v1, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/util/Iterator;

    .line 74
    .line 75
    :goto_1
    iget v2, p0, Lf/i0;->h:I

    .line 76
    .line 77
    iget v3, v0, Lng/r;->b:I

    .line 78
    .line 79
    if-ge v2, v3, :cond_2

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget v2, p0, Lf/i0;->h:I

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    iput v2, p0, Lf/i0;->h:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget v2, p0, Lf/i0;->h:I

    .line 98
    .line 99
    iget v0, v0, Lng/r;->c:I

    .line 100
    .line 101
    if-ge v2, v0, :cond_3

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    iput v2, p0, Lf/i0;->h:I

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    invoke-static {}, Lbsh/j;->e()V

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    :goto_2
    return-object v0

    .line 117
    :pswitch_1
    iget v0, p0, Lf/i0;->h:I

    .line 118
    .line 119
    if-gez v0, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0}, Lf/i0;->a()V

    .line 122
    .line 123
    .line 124
    :cond_4
    iget v0, p0, Lf/i0;->h:I

    .line 125
    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const/4 v1, -0x1

    .line 134
    iput v1, p0, Lf/i0;->h:I

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-static {}, Lbsh/j;->e()V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    :goto_3
    return-object v0

    .line 142
    :pswitch_2
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Lng/k;

    .line 145
    .line 146
    invoke-virtual {v0}, Lng/k;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :pswitch_3
    iget-object v0, p0, Lf/i0;->i:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lng/k;

    .line 154
    .line 155
    invoke-virtual {v0}, Lng/k;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Lf/i0;->g:I

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
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :pswitch_2
    iget v0, p0, Lf/i0;->h:I

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    if-eq v0, v1, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lf/n0;

    .line 38
    .line 39
    iget-object v2, v2, Lf/n0;->h:Lf/l0;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lf/l0;->m(I)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, Lf/i0;->h:I

    .line 45
    .line 46
    :cond_0
    return-void

    .line 47
    :pswitch_3
    iget v0, p0, Lf/i0;->h:I

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    if-eq v0, v1, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lf/i0;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Lf/j0;

    .line 55
    .line 56
    iget-object v2, v2, Lf/j0;->h:Lf/g0;

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Lf/g0;->h(I)V

    .line 59
    .line 60
    .line 61
    iput v1, p0, Lf/i0;->h:I

    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
