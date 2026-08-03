.class public final Lr4/h0;
.super Lr4/u0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr4/p;I)V
    .locals 1

    .line 1
    iput p2, p0, Lr4/h0;->f:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "method_handles"

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const/4 p2, 0x0

    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lr4/x;

    .line 27
    .line 28
    invoke-direct {p1}, Lr4/z;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-virtual {p1, p2}, Lr4/z;->g(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    const-string p2, "type_ids"

    .line 43
    .line 44
    const/4 v0, 0x4

    .line 45
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/util/TreeMap;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    const-string p2, "string_ids"

    .line 57
    .line 58
    const/4 v0, 0x4

    .line 59
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/util/TreeMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_3
    const-string p2, "proto_ids"

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Ljava/util/TreeMap;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final u()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget v0, p0, Lr4/h0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_2
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/util/TreeMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_3
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/TreeMap;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()V
    .locals 4

    .line 1
    iget v0, p0, Lr4/h0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lr4/s0;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Lr4/z;->g(I)V

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
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/TreeMap;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lr4/r0;

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Lr4/z;->g(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    return-void

    .line 71
    :pswitch_2
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/util/TreeMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v1, 0x0

    .line 84
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lr4/n0;

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Lr4/z;->g(I)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    return-void

    .line 103
    :pswitch_3
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/TreeMap;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/4 v1, 0x0

    .line 116
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Lr4/g0;

    .line 127
    .line 128
    add-int/lit8 v3, v1, 0x1

    .line 129
    .line 130
    invoke-virtual {v2, v1}, Lr4/z;->g(I)V

    .line 131
    .line 132
    .line 133
    move v1, v3

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lv4/c0;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr4/r0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const-string p1, "not found"

    .line 24
    .line 25
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    const-string p1, "string == null"

    .line 31
    .line 32
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0
.end method

.method public m(Lv4/d0;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lv4/d0;->g:Lw4/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr4/h0;->o(Lw4/c;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "type == null"

    .line 11
    .line 12
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public n(Lw4/a;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr4/n0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const-string p1, "not found"

    .line 24
    .line 25
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    const-string p1, "prototype == null"

    .line 31
    .line 32
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0
.end method

.method public o(Lw4/c;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lr4/s0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lr4/z;->e()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const-string v0, "not found: "

    .line 24
    .line 25
    invoke-static {p1, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    const-string p1, "type == null"

    .line 31
    .line 32
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0
.end method

.method public declared-synchronized p(Lv4/d0;)Lr4/s0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lv4/d0;->g:Lw4/c;

    .line 8
    .line 9
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    check-cast v1, Lr4/s0;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lr4/s0;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lr4/y;-><init>(Lv4/d0;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    return-object v1

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

.method public declared-synchronized q(Lv4/x;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    check-cast v0, Lr4/g0;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lr4/g0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lr4/g0;-><init>(Lv4/x;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/TreeMap;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 37
    .line 38
    const-string v0, "methodHandle == null"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public r(Lv4/c0;)V
    .locals 2

    .line 1
    new-instance v0, Lr4/r0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lr4/r0;-><init>(Lv4/c0;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    check-cast v1, Lr4/r0;
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
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

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

.method public declared-synchronized s(Lw4/a;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    check-cast v0, Lr4/n0;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lr4/n0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lr4/n0;-><init>(Lw4/a;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/TreeMap;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 37
    .line 38
    const-string v0, "prototype == null"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public declared-synchronized t(Lw4/c;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr4/h0;->g:Ljava/lang/Object;

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
    check-cast v0, Lr4/s0;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lr4/s0;

    .line 20
    .line 21
    new-instance v1, Lv4/d0;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lv4/d0;-><init>(Lw4/c;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lr4/y;-><init>(Lv4/d0;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lr4/h0;->g:Ljava/lang/Object;

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
