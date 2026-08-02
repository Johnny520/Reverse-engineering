.class public final Lb42;
.super Lx73;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILz70;)V
    .locals 1

    .line 1
    iput p1, p0, Lb42;->f:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string p1, "proto_ids"

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, v0}, Ljm2;-><init>(Ljava/lang/String;Lz70;I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/TreeMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lb42;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    const/4 p1, 0x0

    .line 21
    invoke-direct {p0, p1, p2, v0}, Ljm2;-><init>(Ljava/lang/String;Lz70;I)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lhs0;

    .line 25
    .line 26
    invoke-direct {p1}, Liy0;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p1, p2}, Liy0;->g(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lb42;->g:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    const-string p1, "type_ids"

    .line 41
    .line 42
    invoke-direct {p0, p1, p2, v0}, Ljm2;-><init>(Ljava/lang/String;Lz70;I)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/TreeMap;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lb42;->g:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_2
    const-string p1, "string_ids"

    .line 54
    .line 55
    invoke-direct {p0, p1, p2, v0}, Ljm2;-><init>(Ljava/lang/String;Lz70;I)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/util/TreeMap;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lb42;->g:Ljava/lang/Object;

    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final r()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget v0, p0, Lb42;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/List;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_2
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/util/TreeMap;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()V
    .locals 2

    .line 1
    iget v0, p0, Lb42;->f:I

    .line 2
    .line 3
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p0, Ljava/util/TreeMap;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lb63;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Liy0;->g(I)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_1
    check-cast p0, Ljava/util/TreeMap;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljv2;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Liy0;->g(I)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    return-void

    .line 68
    :pswitch_2
    check-cast p0, Ljava/util/TreeMap;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La42;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Liy0;->g(I)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lq30;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljm2;->f()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljv2;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Liy0;->e()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const-string p0, "not found"

    .line 25
    .line 26
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_1
    const-string p0, "string == null"

    .line 31
    .line 32
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public m(Lr30;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lr30;->h:Lo43;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lb42;->n(Lo43;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const-string p0, "type == null"

    .line 11
    .line 12
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public n(Lo43;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljm2;->f()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lb63;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Liy0;->e()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const-string p0, "not found: "

    .line 25
    .line 26
    invoke-static {p0, p1}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_1
    const-string p0, "type == null"

    .line 31
    .line 32
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public o(Lq30;)V
    .locals 2

    .line 1
    new-instance v0, Ljv2;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljv2;-><init>(Lq30;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljm2;->g()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/TreeMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljv2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_1
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/TreeMap;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    throw p1
.end method

.method public declared-synchronized p(Lr30;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljm2;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lr30;->h:Lo43;

    .line 8
    .line 9
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb63;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lb63;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lgx0;-><init>(Lr30;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lb42;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ljava/util/TreeMap;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string v0, "type == null"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method

.method public declared-synchronized q(Lo43;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljm2;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lb42;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lb63;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lb63;

    .line 20
    .line 21
    new-instance v1, Lr30;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lr30;-><init>(Lo43;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lgx0;-><init>(Lr30;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/TreeMap;

    .line 32
    .line 33
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 42
    .line 43
    const-string v0, "type == null"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p1
.end method
