.class public final Lkx;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/util/Iterator;
.implements Lp40;


# instance fields
.field public final synthetic d:I

.field public e:I

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgh0;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lkx;->d:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lkx;->g:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Lkx;->e:I

    .line 33
    new-instance v0, Lfh0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lfh0;-><init>(Lgh0;Lkx;Lik;)V

    invoke-static {v0}, Lv50;->n(Lww;)Lq01;

    move-result-object p1

    iput-object p1, p0, Lkx;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lkx;->d:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx;->f:Ljava/lang/Object;

    .line 29
    iput-object p2, p0, Lkx;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llx;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lkx;->d:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lkx;->g:Ljava/lang/Object;

    const/4 p1, -0x2

    .line 27
    iput p1, p0, Lkx;->e:I

    return-void
.end method

.method public constructor <init>(Lmh0;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lkx;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkx;->g:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lkx;->e:I

    .line 11
    .line 12
    new-instance v0, Llh0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p1, p0, v1}, Llh0;-><init>(Lmh0;Lkx;Lik;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lv50;->n(Lww;)Lq01;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lkx;->f:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget v0, p0, Lkx;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lkx;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Llx;

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v1, Llx;->a:Lhw;

    .line 11
    .line 12
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, v1, Llx;->b:Lsw;

    .line 18
    .line 19
    iget-object v1, p0, Lkx;->f:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    iput-object v0, p0, Lkx;->f:Ljava/lang/Object;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v0, 0x1

    .line 35
    :goto_1
    iput v0, p0, Lkx;->e:I

    .line 36
    .line 37
    return-void
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, Lkx;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lkx;->e:I

    .line 9
    .line 10
    iget-object p0, p0, Lkx;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ge v0, p0, :cond_0

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_0
    return v1

    .line 22
    :pswitch_0
    iget-object p0, p0, Lkx;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lq01;

    .line 25
    .line 26
    invoke-virtual {p0}, Lq01;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :pswitch_1
    iget-object p0, p0, Lkx;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lq01;

    .line 34
    .line 35
    invoke-virtual {p0}, Lq01;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :pswitch_2
    iget v0, p0, Lkx;->e:I

    .line 41
    .line 42
    if-gez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lkx;->a()V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget p0, p0, Lkx;->e:I

    .line 48
    .line 49
    if-ne p0, v2, :cond_2

    .line 50
    .line 51
    move v1, v2

    .line 52
    :cond_2
    return v1

    .line 53
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
    iget v0, p0, Lkx;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lkx;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lkx;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, p0, Lkx;->e:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Lkx;->e:I

    .line 20
    .line 21
    iget-object v0, p0, Lkx;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    check-cast v0, Lua0;

    .line 32
    .line 33
    iget-object v0, v0, Lua0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v0, p0, Lkx;->f:Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "Hash code of an element ("

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ") has changed after it was added to the persistent set."

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_1
    invoke-static {}, Lxc;->m()V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-object v1

    .line 67
    :pswitch_0
    iget-object p0, p0, Lkx;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lq01;

    .line 70
    .line 71
    invoke-virtual {p0}, Lq01;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_1
    iget-object p0, p0, Lkx;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Lq01;

    .line 79
    .line 80
    invoke-virtual {p0}, Lq01;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_2
    iget v0, p0, Lkx;->e:I

    .line 86
    .line 87
    if-gez v0, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0}, Lkx;->a()V

    .line 90
    .line 91
    .line 92
    :cond_2
    iget v0, p0, Lkx;->e:I

    .line 93
    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object v1, p0, Lkx;->f:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v0, -0x1

    .line 102
    iput v0, p0, Lkx;->e:I

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-static {}, Lxc;->m()V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-object v1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 4

    .line 1
    iget v0, p0, Lkx;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lkx;->g:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const-string v3, "Operation is not supported for read-only collection"

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    invoke-direct {p0, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p0

    .line 17
    :pswitch_0
    iget v0, p0, Lkx;->e:I

    .line 18
    .line 19
    if-eq v0, v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Lmh0;

    .line 22
    .line 23
    iget-object v1, v1, Lmh0;->e:Lkh0;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lkh0;->m(I)V

    .line 26
    .line 27
    .line 28
    iput v2, p0, Lkx;->e:I

    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_1
    iget v0, p0, Lkx;->e:I

    .line 32
    .line 33
    if-eq v0, v2, :cond_1

    .line 34
    .line 35
    check-cast v1, Lgh0;

    .line 36
    .line 37
    iget-object v1, v1, Lgh0;->e:Leh0;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Leh0;->h(I)V

    .line 40
    .line 41
    .line 42
    iput v2, p0, Lkx;->e:I

    .line 43
    .line 44
    :cond_1
    return-void

    .line 45
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 46
    .line 47
    invoke-direct {p0, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
