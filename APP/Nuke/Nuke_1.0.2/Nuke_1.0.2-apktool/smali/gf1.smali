.class public abstract Lgf1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lkw;

.field public static final b:Lkw;

.field public static final c:Lqa;

.field public static d:Lsx0;

.field public static e:Lsx0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Low;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lkw;

    .line 9
    .line 10
    const v2, -0x6fea239

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lgf1;->a:Lkw;

    .line 18
    .line 19
    new-instance v0, Low;

    .line 20
    .line 21
    const/16 v1, 0x11

    .line 22
    .line 23
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lkw;

    .line 27
    .line 28
    const v2, 0x12907144

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lgf1;->b:Lkw;

    .line 35
    .line 36
    new-instance v0, Lqa;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-direct {v0, v1}, Lqa;-><init>(I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lgf1;->c:Lqa;

    .line 43
    .line 44
    return-void
.end method

.method public static final A(Lj61;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lr61;->E()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static B(Lb5;)Z
    .locals 4

    .line 1
    const-string v0, "GlideBitmapFactory"

    .line 2
    .line 3
    const-string v1, "isLikelyToContainGainmap="

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    :try_start_0
    invoke-virtual {p0}, Lb5;->v()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return p0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return p0

    .line 35
    :goto_0
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-string v1, "isLikelyToContainGainmap failed"

    .line 42
    .line 43
    invoke-static {v0, v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public static C(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    if-ge p0, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v2, 0x1

    .line 7
    if-ne p0, v1, :cond_1

    .line 8
    .line 9
    return v2

    .line 10
    :cond_1
    and-int/lit16 v1, p0, 0xff

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    const/16 v3, 0xff

    .line 15
    .line 16
    if-ne v1, v3, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    const v1, 0xff00

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v1

    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    return v2

    .line 26
    :cond_3
    return v0

    .line 27
    :cond_4
    :goto_0
    return v2
.end method

.method public static D(III)I
    .locals 1

    .line 1
    and-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    :cond_0
    if-gt p2, p0, :cond_1

    .line 8
    .line 9
    sub-int/2addr p0, p2

    .line 10
    return p0

    .line 11
    :cond_1
    const-string p1, "PROTOCOL_ERROR padding "

    .line 12
    .line 13
    const-string v0, " > remaining length "

    .line 14
    .line 15
    invoke-static {p1, p2, v0, p0}, Lvi0;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final E(Lt91;Lk03;Lus1;)V
    .locals 11

    .line 1
    invoke-static {}, Ltl;->B()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lvr2;->e()Lin0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    move-object v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-static {v1}, Ltl;->K(Lvr2;)Lvr2;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lt91;->d()Lz03;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {v1, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    iget-object v8, p0, Lt91;->e:Lt03;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    if-nez v8, :cond_2

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lt91;->c()Lc61;

    .line 38
    .line 39
    .line 40
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    if-nez v7, :cond_3

    .line 42
    .line 43
    invoke-static {v1, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :try_start_3
    iget-object v5, p0, Lt91;->a:Liz2;

    .line 48
    .line 49
    iget-object v6, v0, Lz03;->a:Ly03;

    .line 50
    .line 51
    invoke-virtual {p0}, Lt91;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    move-object v4, p1

    .line 56
    move-object v10, p2

    .line 57
    invoke-static/range {v4 .. v10}, Leu;->S(Lk03;Liz2;Ly03;Lc61;Lt03;ZLus1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    invoke-static {v1, v3, v2}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public static final F(Luh1;Lin0;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lmk0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lmk0;-><init>(Lin0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final G(Luh1;Lin0;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lut1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lut1;-><init>(Lin0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final H(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, " must be a boolean."

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v5, 0x0

    .line 23
    const/16 v6, 0x1c

    .line 24
    .line 25
    const-string v1, "INVALID_ARGUMENT"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static I(Ll41;)Lk31;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ll41;->I()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lke1; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_1
    sget-object v1, Lv53;->z:Lq31;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Lq31;->b(Ll41;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lk31;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lke1; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 12
    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception p0

    .line 17
    new-instance v0, Lt31;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :catch_2
    move-exception p0

    .line 24
    new-instance v0, Lt31;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :catch_3
    move-exception p0

    .line 31
    new-instance v0, Lt31;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :catch_4
    move-exception p0

    .line 38
    const/4 v0, 0x1

    .line 39
    :goto_0
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget-object p0, La41;->h:La41;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, Lt31;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public static final J(Ljava/lang/Object;)Lbg2;
    .locals 19

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v0, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "media"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "request.media"

    .line 16
    .line 17
    invoke-static {v2, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "metadata"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const-string v5, "request.media.metadata"

    .line 32
    .line 33
    invoke-static {v2, v5, v3}, Lgf1;->Z(Ljava/lang/Object;Ljava/lang/String;I)Lj31;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    instance-of v5, v2, Ld41;

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    check-cast v2, Ld41;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v2, v4

    .line 45
    :goto_0
    if-eqz v2, :cond_1

    .line 46
    .line 47
    :goto_1
    move-object v12, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/4 v9, 0x0

    .line 50
    const/16 v10, 0x1c

    .line 51
    .line 52
    const-string v5, "INVALID_ARGUMENT"

    .line 53
    .line 54
    const-string v6, "request.media.metadata must be an object."

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_2
    new-instance v2, Ld41;

    .line 63
    .line 64
    sget-object v5, Lce0;->h:Lce0;

    .line 65
    .line 66
    invoke-direct {v2, v5}, Ld41;-><init>(Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    new-instance v6, Lai2;

    .line 71
    .line 72
    const-string v2, "platform"

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v5, "request.media.platform"

    .line 79
    .line 80
    invoke-static {v5, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const-string v2, "accountId"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v5, "request.media.accountId"

    .line 91
    .line 92
    invoke-static {v5, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const-string v2, "id"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v5, "request.media.id"

    .line 103
    .line 104
    invoke-static {v5, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    const-string v2, "kind"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v5, "request.media.kind"

    .line 115
    .line 116
    invoke-static {v5, v2}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    const-string v2, "expiresAt"

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    if-eqz v13, :cond_3

    .line 127
    .line 128
    const-wide/high16 v15, -0x8000000000000000L

    .line 129
    .line 130
    const-wide v17, 0x7fffffffffffffffL

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    const-string v14, "request.media.expiresAt"

    .line 136
    .line 137
    invoke-static/range {v13 .. v18}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    move-object v11, v1

    .line 146
    goto :goto_3

    .line 147
    :cond_3
    move-object v11, v4

    .line 148
    :goto_3
    invoke-direct/range {v6 .. v12}, Lai2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ld41;)V

    .line 149
    .line 150
    .line 151
    const-string v1, "destination"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v2, "request.destination"

    .line 158
    .line 159
    invoke-static {v2, v1}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v2, v1, Lhg2;->a:Lfg2;

    .line 164
    .line 165
    sget-object v5, Lfg2;->h:Lfg2;

    .line 166
    .line 167
    if-eq v2, v5, :cond_6

    .line 168
    .line 169
    const-string v4, "options"

    .line 170
    .line 171
    invoke-virtual {v0, v4}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v4, "request.options"

    .line 176
    .line 177
    invoke-static {v4, v0}, Lsp0;->S(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v4, Lbg2;

    .line 182
    .line 183
    new-instance v5, Ldi2;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 190
    .line 191
    invoke-virtual {v2, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v1, v1, Lhg2;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {v5, v2, v1}, Ldi2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    if-eqz v0, :cond_4

    .line 204
    .line 205
    const-string v1, "overwrite"

    .line 206
    .line 207
    invoke-static {v0, v1}, Lgf1;->H(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    goto :goto_4

    .line 218
    :cond_4
    move v1, v3

    .line 219
    :goto_4
    if-eqz v0, :cond_5

    .line 220
    .line 221
    const-string v2, "createParents"

    .line 222
    .line 223
    invoke-static {v0, v2}, Lgf1;->H(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-eqz v0, :cond_5

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    :cond_5
    invoke-direct {v4, v6, v5, v1, v3}, Lbg2;-><init>(Lai2;Ldi2;ZZ)V

    .line 234
    .line 235
    .line 236
    return-object v4

    .line 237
    :cond_6
    const/4 v11, 0x0

    .line 238
    const/16 v12, 0x1c

    .line 239
    .line 240
    const-string v7, "PERMISSION_DENIED"

    .line 241
    .line 242
    const-string v8, "Media cannot be downloaded into package."

    .line 243
    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 246
    invoke-static/range {v7 .. v12}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 247
    .line 248
    .line 249
    return-object v4
.end method

.method public static final K(Ljava/lang/Object;)Lzj2;
    .locals 17

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v0, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "conversation"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "request.conversation"

    .line 16
    .line 17
    invoke-static {v2, v1}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, Lyf2;

    .line 22
    .line 23
    const-string v4, "platform"

    .line 24
    .line 25
    invoke-virtual {v1, v4}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, ".platform"

    .line 30
    .line 31
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5, v4}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "accountId"

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v6, ".accountId"

    .line 46
    .line 47
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6, v5}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v6, "id"

    .line 56
    .line 57
    invoke-virtual {v1, v6}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const-string v7, ".id"

    .line 62
    .line 63
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v7, v6}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const-string v9, "type"

    .line 72
    .line 73
    invoke-virtual {v1, v9}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const-string v8, ".type"

    .line 78
    .line 79
    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2, v7}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v2, "name"

    .line 88
    .line 89
    invoke-static {v1, v2}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-direct/range {v3 .. v8}, Lyf2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v1, "segments"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    instance-of v2, v1, Ljava/util/List;

    .line 103
    .line 104
    if-eqz v2, :cond_0

    .line 105
    .line 106
    check-cast v1, Ljava/util/List;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 v1, 0x0

    .line 110
    :goto_0
    if-eqz v1, :cond_8

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_7

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const/16 v5, 0x80

    .line 123
    .line 124
    if-gt v2, v5, :cond_7

    .line 125
    .line 126
    new-instance v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    const/16 v5, 0xa

    .line 129
    .line 130
    invoke-static {v1, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const/4 v6, 0x0

    .line 142
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_6

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    add-int/lit8 v8, v6, 0x1

    .line 153
    .line 154
    if-ltz v6, :cond_5

    .line 155
    .line 156
    new-instance v10, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v11, "request.segments["

    .line 159
    .line 160
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v12, "]"

    .line 167
    .line 168
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-static {v10, v7}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v7, v9}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    new-instance v12, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v13, "].type"

    .line 192
    .line 193
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-static {v12, v10}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-static {v10}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-nez v12, :cond_4

    .line 209
    .line 210
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, Lcom/dokar/quickjs/binding/JsObject;->entrySet()Ljava/util/Set;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    :cond_1
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-eqz v13, :cond_2

    .line 228
    .line 229
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    check-cast v13, Ljava/util/Map$Entry;

    .line 234
    .line 235
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    check-cast v14, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v14, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v14

    .line 245
    if-nez v14, :cond_1

    .line 246
    .line 247
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v14

    .line 251
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-virtual {v12, v14, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_2
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 260
    .line 261
    invoke-interface {v12}, Ljava/util/Map;->size()I

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    invoke-static {v13}, Lxe1;->U(I)I

    .line 266
    .line 267
    .line 268
    move-result v13

    .line 269
    invoke-direct {v7, v13}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    check-cast v12, Ljava/lang/Iterable;

    .line 277
    .line 278
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v13

    .line 286
    if-eqz v13, :cond_3

    .line 287
    .line 288
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    check-cast v13, Ljava/util/Map$Entry;

    .line 293
    .line 294
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v14

    .line 298
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    check-cast v15, Ljava/lang/String;

    .line 303
    .line 304
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    const/16 p0, 0x0

    .line 309
    .line 310
    new-instance v4, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v5, "]."

    .line 319
    .line 320
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    const/4 v5, 0x0

    .line 331
    invoke-static {v13, v4, v5}, Lgf1;->Z(Ljava/lang/Object;Ljava/lang/String;I)Lj31;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-interface {v7, v14, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_3
    const/16 p0, 0x0

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    new-instance v4, Ld41;

    .line 343
    .line 344
    invoke-direct {v4, v7}, Ld41;-><init>(Ljava/util/Map;)V

    .line 345
    .line 346
    .line 347
    new-instance v6, Lki2;

    .line 348
    .line 349
    invoke-direct {v6, v4, v10}, Lki2;-><init>(Ld41;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move v6, v8

    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :cond_4
    const/16 p0, 0x0

    .line 359
    .line 360
    const/4 v15, 0x0

    .line 361
    const/16 v16, 0x1c

    .line 362
    .line 363
    const-string v11, "INVALID_ARGUMENT"

    .line 364
    .line 365
    const-string v12, "Message segment type must not be blank."

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    invoke-static/range {v11 .. v16}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 370
    .line 371
    .line 372
    return-object p0

    .line 373
    :cond_5
    const/16 p0, 0x0

    .line 374
    .line 375
    invoke-static {}, Leu;->a0()V

    .line 376
    .line 377
    .line 378
    throw p0

    .line 379
    :cond_6
    new-instance v1, Lzj2;

    .line 380
    .line 381
    const-string v4, "replyTo"

    .line 382
    .line 383
    invoke-static {v0, v4}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-direct {v1, v3, v2, v0}, Lzj2;-><init>(Lyf2;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    return-object v1

    .line 391
    :cond_7
    const/16 p0, 0x0

    .line 392
    .line 393
    const/4 v8, 0x0

    .line 394
    const/16 v9, 0x1c

    .line 395
    .line 396
    const-string v4, "INVALID_ARGUMENT"

    .line 397
    .line 398
    const-string v5, "request.segments must contain 1 to 128 items."

    .line 399
    .line 400
    const/4 v6, 0x0

    .line 401
    const/4 v7, 0x0

    .line 402
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 403
    .line 404
    .line 405
    return-object p0

    .line 406
    :cond_8
    const/16 p0, 0x0

    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const/16 v15, 0x1c

    .line 410
    .line 411
    const-string v10, "INVALID_ARGUMENT"

    .line 412
    .line 413
    const-string v11, "request.segments must be an array."

    .line 414
    .line 415
    const/4 v12, 0x0

    .line 416
    const/4 v13, 0x0

    .line 417
    invoke-static/range {v10 .. v15}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 418
    .line 419
    .line 420
    return-object p0
.end method

.method public static final L(Landroid/view/ViewStructure;Lr61;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lq62;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lvn2;->a:Lyn2;

    .line 6
    .line 7
    sget-object v2, Lkn2;->a:Lyn2;

    .line 8
    .line 9
    invoke-virtual {v1}, Lr61;->w()Lln2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v8, 0x2

    .line 14
    const/16 v11, 0x8

    .line 15
    .line 16
    const/4 v14, 0x1

    .line 17
    if-eqz v2, :cond_14

    .line 18
    .line 19
    iget-object v2, v2, Lln2;->h:Lrk1;

    .line 20
    .line 21
    if-eqz v2, :cond_14

    .line 22
    .line 23
    iget-object v15, v2, Lrk1;->b:[Ljava/lang/Object;

    .line 24
    .line 25
    const-wide/16 v16, 0x80

    .line 26
    .line 27
    iget-object v3, v2, Lrk1;->c:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, v2, Lrk1;->a:[J

    .line 30
    .line 31
    array-length v4, v2

    .line 32
    sub-int/2addr v4, v8

    .line 33
    move/from16 v31, v8

    .line 34
    .line 35
    if-ltz v4, :cond_12

    .line 36
    .line 37
    move/from16 v28, v14

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const-wide/16 v18, 0xff

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    .line 45
    const/16 v21, 0x0

    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const/16 v23, 0x0

    .line 50
    .line 51
    const/16 v24, 0x0

    .line 52
    .line 53
    const/16 v25, 0x0

    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const/16 v30, 0x7

    .line 62
    .line 63
    :goto_0
    aget-wide v7, v2, v5

    .line 64
    .line 65
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    not-long v9, v7

    .line 71
    shl-long v9, v9, v30

    .line 72
    .line 73
    and-long/2addr v9, v7

    .line 74
    and-long v9, v9, v32

    .line 75
    .line 76
    cmp-long v9, v9, v32

    .line 77
    .line 78
    if-eqz v9, :cond_11

    .line 79
    .line 80
    sub-int v9, v5, v4

    .line 81
    .line 82
    not-int v9, v9

    .line 83
    ushr-int/lit8 v9, v9, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v9, v9, 0x8

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    :goto_1
    if-ge v10, v9, :cond_10

    .line 89
    .line 90
    and-long v34, v7, v18

    .line 91
    .line 92
    cmp-long v34, v34, v16

    .line 93
    .line 94
    if-gez v34, :cond_f

    .line 95
    .line 96
    shl-int/lit8 v34, v5, 0x3

    .line 97
    .line 98
    add-int v34, v34, v10

    .line 99
    .line 100
    aget-object v35, v15, v34

    .line 101
    .line 102
    aget-object v34, v3, v34

    .line 103
    .line 104
    move-object/from16 v12, v35

    .line 105
    .line 106
    check-cast v12, Lyn2;

    .line 107
    .line 108
    sget-object v13, Lvn2;->s:Lyn2;

    .line 109
    .line 110
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_0

    .line 115
    .line 116
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object/from16 v6, v34

    .line 120
    .line 121
    check-cast v6, Lx7;

    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_0
    sget-object v13, Lvn2;->a:Lyn2;

    .line 126
    .line 127
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-eqz v13, :cond_1

    .line 132
    .line 133
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast v34, Ljava/util/List;

    .line 137
    .line 138
    invoke-static/range {v34 .. v34}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    check-cast v12, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v12, :cond_f

    .line 145
    .line 146
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_1
    sget-object v13, Lvn2;->r:Lyn2;

    .line 152
    .line 153
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_2

    .line 158
    .line 159
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object/from16 v24, v34

    .line 163
    .line 164
    check-cast v24, Lk00;

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_2
    sget-object v13, Lvn2;->t:Lyn2;

    .line 169
    .line 170
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_3

    .line 175
    .line 176
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v23, v34

    .line 180
    .line 181
    check-cast v23, Lv8;

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_3
    sget-object v13, Lvn2;->G:Lyn2;

    .line 186
    .line 187
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-eqz v13, :cond_4

    .line 192
    .line 193
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-object/from16 v22, v34

    .line 197
    .line 198
    check-cast v22, Lsd;

    .line 199
    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_4
    sget-object v13, Lvn2;->l:Lyn2;

    .line 203
    .line 204
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_5

    .line 209
    .line 210
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    check-cast v34, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setFocused(Z)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_5
    sget-object v13, Lvn2;->P:Lyn2;

    .line 225
    .line 226
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-eqz v13, :cond_6

    .line 231
    .line 232
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-object/from16 v29, v34

    .line 236
    .line 237
    check-cast v29, Ljava/lang/Integer;

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_6
    sget-object v13, Lvn2;->L:Lyn2;

    .line 242
    .line 243
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    if-eqz v13, :cond_7

    .line 248
    .line 249
    move/from16 v27, v14

    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_7
    sget-object v13, Lvn2;->o:Lyn2;

    .line 254
    .line 255
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_8

    .line 260
    .line 261
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast v34, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v28

    .line 270
    goto :goto_2

    .line 271
    :cond_8
    sget-object v13, Lvn2;->z:Lyn2;

    .line 272
    .line 273
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-eqz v13, :cond_9

    .line 278
    .line 279
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object/from16 v26, v34

    .line 283
    .line 284
    check-cast v26, Lva2;

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_9
    sget-object v13, Lvn2;->J:Lyn2;

    .line 288
    .line 289
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-eqz v13, :cond_a

    .line 294
    .line 295
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-object/from16 v25, v34

    .line 299
    .line 300
    check-cast v25, Ljava/lang/Boolean;

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_a
    sget-object v13, Lvn2;->K:Lyn2;

    .line 304
    .line 305
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    if-eqz v13, :cond_b

    .line 310
    .line 311
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-object/from16 v21, v34

    .line 315
    .line 316
    check-cast v21, Lu23;

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_b
    sget-object v13, Lkn2;->b:Lyn2;

    .line 320
    .line 321
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_c

    .line 326
    .line 327
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setClickable(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_2

    .line 331
    :cond_c
    sget-object v13, Lkn2;->c:Lyn2;

    .line 332
    .line 333
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-eqz v13, :cond_d

    .line 338
    .line 339
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_d
    sget-object v13, Lkn2;->w:Lyn2;

    .line 344
    .line 345
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    if-eqz v13, :cond_e

    .line 350
    .line 351
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setFocusable(Z)V

    .line 352
    .line 353
    .line 354
    goto :goto_2

    .line 355
    :cond_e
    sget-object v13, Lkn2;->k:Lyn2;

    .line 356
    .line 357
    invoke-static {v12, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    if-eqz v12, :cond_f

    .line 362
    .line 363
    move/from16 v20, v14

    .line 364
    .line 365
    :cond_f
    :goto_2
    shr-long/2addr v7, v11

    .line 366
    add-int/lit8 v10, v10, 0x1

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_10
    if-ne v9, v11, :cond_13

    .line 371
    .line 372
    :cond_11
    if-eq v5, v4, :cond_13

    .line 373
    .line 374
    add-int/lit8 v5, v5, 0x1

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_12
    const-wide/16 v18, 0xff

    .line 379
    .line 380
    const/16 v30, 0x7

    .line 381
    .line 382
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    move/from16 v28, v14

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v29, 0x0

    .line 407
    .line 408
    :cond_13
    move-object/from16 v2, v21

    .line 409
    .line 410
    move-object/from16 v3, v22

    .line 411
    .line 412
    move-object/from16 v4, v23

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_14
    move/from16 v31, v8

    .line 416
    .line 417
    const-wide/16 v16, 0x80

    .line 418
    .line 419
    const-wide/16 v18, 0xff

    .line 420
    .line 421
    const/16 v30, 0x7

    .line 422
    .line 423
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    move/from16 v28, v14

    .line 429
    .line 430
    const/4 v2, 0x0

    .line 431
    const/4 v3, 0x0

    .line 432
    const/4 v4, 0x0

    .line 433
    const/4 v6, 0x0

    .line 434
    const/16 v20, 0x0

    .line 435
    .line 436
    const/16 v24, 0x0

    .line 437
    .line 438
    const/16 v25, 0x0

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const/16 v29, 0x0

    .line 445
    .line 446
    :goto_3
    invoke-virtual {v1}, Lr61;->w()Lln2;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    if-eqz v5, :cond_18

    .line 451
    .line 452
    iget-boolean v7, v5, Lln2;->j:Z

    .line 453
    .line 454
    if-eqz v7, :cond_18

    .line 455
    .line 456
    iget-boolean v7, v5, Lln2;->k:Z

    .line 457
    .line 458
    if-eqz v7, :cond_15

    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_15
    invoke-virtual {v5}, Lln2;->b()Lln2;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    new-instance v7, Llk1;

    .line 466
    .line 467
    invoke-virtual {v1}, Lr61;->n()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    check-cast v8, Ljk1;

    .line 472
    .line 473
    iget-object v8, v8, Ljk1;->i:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v8, Lzk1;

    .line 476
    .line 477
    iget v8, v8, Lzk1;->j:I

    .line 478
    .line 479
    invoke-direct {v7, v8}, Llk1;-><init>(I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, Lr61;->n()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-virtual {v7, v8}, Llk1;->c(Ljava/util/List;)V

    .line 487
    .line 488
    .line 489
    :cond_16
    :goto_4
    invoke-virtual {v7}, Llk1;->i()Z

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    if-eqz v8, :cond_18

    .line 494
    .line 495
    iget v8, v7, Llk1;->b:I

    .line 496
    .line 497
    sub-int/2addr v8, v14

    .line 498
    invoke-virtual {v7, v8}, Llk1;->k(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    check-cast v8, Lr61;

    .line 503
    .line 504
    invoke-virtual {v8}, Lr61;->w()Lln2;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    if-eqz v9, :cond_16

    .line 509
    .line 510
    iget-boolean v10, v9, Lln2;->j:Z

    .line 511
    .line 512
    if-eqz v10, :cond_17

    .line 513
    .line 514
    goto :goto_4

    .line 515
    :cond_17
    invoke-virtual {v5, v9}, Lln2;->d(Lln2;)V

    .line 516
    .line 517
    .line 518
    iget-boolean v9, v9, Lln2;->k:Z

    .line 519
    .line 520
    if-nez v9, :cond_16

    .line 521
    .line 522
    invoke-virtual {v8}, Lr61;->n()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    invoke-virtual {v7, v8}, Llk1;->c(Ljava/util/List;)V

    .line 527
    .line 528
    .line 529
    goto :goto_4

    .line 530
    :cond_18
    :goto_5
    if-eqz v5, :cond_1e

    .line 531
    .line 532
    iget-object v5, v5, Lln2;->h:Lrk1;

    .line 533
    .line 534
    if-eqz v5, :cond_1e

    .line 535
    .line 536
    iget-object v7, v5, Lrk1;->b:[Ljava/lang/Object;

    .line 537
    .line 538
    iget-object v8, v5, Lrk1;->c:[Ljava/lang/Object;

    .line 539
    .line 540
    iget-object v5, v5, Lrk1;->a:[J

    .line 541
    .line 542
    array-length v9, v5

    .line 543
    add-int/lit8 v9, v9, -0x2

    .line 544
    .line 545
    if-ltz v9, :cond_1e

    .line 546
    .line 547
    move v13, v14

    .line 548
    const/4 v10, 0x0

    .line 549
    const/4 v12, 0x0

    .line 550
    :goto_6
    aget-wide v14, v5, v10

    .line 551
    .line 552
    move/from16 v21, v11

    .line 553
    .line 554
    move-object/from16 v22, v12

    .line 555
    .line 556
    not-long v11, v14

    .line 557
    shl-long v11, v11, v30

    .line 558
    .line 559
    and-long/2addr v11, v14

    .line 560
    and-long v11, v11, v32

    .line 561
    .line 562
    cmp-long v11, v11, v32

    .line 563
    .line 564
    if-eqz v11, :cond_1d

    .line 565
    .line 566
    sub-int v11, v10, v9

    .line 567
    .line 568
    not-int v11, v11

    .line 569
    ushr-int/lit8 v11, v11, 0x1f

    .line 570
    .line 571
    rsub-int/lit8 v11, v11, 0x8

    .line 572
    .line 573
    move/from16 v23, v13

    .line 574
    .line 575
    move-object/from16 v12, v22

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    :goto_7
    if-ge v13, v11, :cond_1c

    .line 579
    .line 580
    and-long v36, v14, v18

    .line 581
    .line 582
    cmp-long v22, v36, v16

    .line 583
    .line 584
    if-gez v22, :cond_1a

    .line 585
    .line 586
    shl-int/lit8 v22, v10, 0x3

    .line 587
    .line 588
    add-int v22, v22, v13

    .line 589
    .line 590
    aget-object v34, v7, v22

    .line 591
    .line 592
    aget-object v22, v8, v22

    .line 593
    .line 594
    move-object/from16 v36, v5

    .line 595
    .line 596
    move-object/from16 v5, v34

    .line 597
    .line 598
    check-cast v5, Lyn2;

    .line 599
    .line 600
    move-object/from16 v34, v7

    .line 601
    .line 602
    sget-object v7, Lvn2;->j:Lyn2;

    .line 603
    .line 604
    invoke-static {v5, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    if-eqz v7, :cond_19

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    invoke-virtual {v0, v7}, Landroid/view/ViewStructure;->setEnabled(Z)V

    .line 612
    .line 613
    .line 614
    goto :goto_8

    .line 615
    :cond_19
    sget-object v7, Lvn2;->C:Lyn2;

    .line 616
    .line 617
    invoke-static {v5, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    if-eqz v5, :cond_1b

    .line 622
    .line 623
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    move-object/from16 v12, v22

    .line 627
    .line 628
    check-cast v12, Ljava/util/List;

    .line 629
    .line 630
    goto :goto_8

    .line 631
    :cond_1a
    move-object/from16 v36, v5

    .line 632
    .line 633
    move-object/from16 v34, v7

    .line 634
    .line 635
    :cond_1b
    :goto_8
    shr-long v14, v14, v21

    .line 636
    .line 637
    add-int/lit8 v13, v13, 0x1

    .line 638
    .line 639
    move-object/from16 v7, v34

    .line 640
    .line 641
    move-object/from16 v5, v36

    .line 642
    .line 643
    goto :goto_7

    .line 644
    :cond_1c
    move-object/from16 v36, v5

    .line 645
    .line 646
    move-object/from16 v34, v7

    .line 647
    .line 648
    move/from16 v5, v21

    .line 649
    .line 650
    if-ne v11, v5, :cond_1f

    .line 651
    .line 652
    goto :goto_9

    .line 653
    :cond_1d
    move-object/from16 v36, v5

    .line 654
    .line 655
    move-object/from16 v34, v7

    .line 656
    .line 657
    move/from16 v23, v13

    .line 658
    .line 659
    move/from16 v5, v21

    .line 660
    .line 661
    move-object/from16 v12, v22

    .line 662
    .line 663
    :goto_9
    if-eq v10, v9, :cond_1f

    .line 664
    .line 665
    add-int/lit8 v10, v10, 0x1

    .line 666
    .line 667
    move v11, v5

    .line 668
    move/from16 v13, v23

    .line 669
    .line 670
    move-object/from16 v7, v34

    .line 671
    .line 672
    move-object/from16 v5, v36

    .line 673
    .line 674
    goto :goto_6

    .line 675
    :cond_1e
    move/from16 v23, v14

    .line 676
    .line 677
    const/4 v12, 0x0

    .line 678
    :cond_1f
    iget v5, v1, Lr61;->i:I

    .line 679
    .line 680
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    invoke-virtual {v1}, Lr61;->u()Lr61;

    .line 685
    .line 686
    .line 687
    move-result-object v7

    .line 688
    if-nez v7, :cond_20

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    :cond_20
    if-eqz v5, :cond_21

    .line 692
    .line 693
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    :goto_a
    move-object/from16 v7, p2

    .line 698
    .line 699
    goto :goto_b

    .line 700
    :cond_21
    const/4 v5, -0x1

    .line 701
    goto :goto_a

    .line 702
    :goto_b
    invoke-virtual {v0, v7, v5}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 703
    .line 704
    .line 705
    move-object/from16 v7, p3

    .line 706
    .line 707
    const/4 v8, 0x0

    .line 708
    invoke-virtual {v0, v5, v7, v8, v8}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    if-eqz v6, :cond_22

    .line 712
    .line 713
    iget v5, v6, Lx7;->a:I

    .line 714
    .line 715
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    goto :goto_c

    .line 720
    :cond_22
    if-eqz v20, :cond_23

    .line 721
    .line 722
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    goto :goto_c

    .line 727
    :cond_23
    if-eqz v2, :cond_24

    .line 728
    .line 729
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    goto :goto_c

    .line 734
    :cond_24
    move-object v5, v8

    .line 735
    :goto_c
    if-eqz v5, :cond_25

    .line 736
    .line 737
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 738
    .line 739
    .line 740
    move-result v5

    .line 741
    invoke-virtual {v0, v5}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 742
    .line 743
    .line 744
    :cond_25
    if-eqz v3, :cond_28

    .line 745
    .line 746
    iget-object v3, v3, Lsd;->i:Ljava/lang/String;

    .line 747
    .line 748
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    const/16 v6, 0x1388

    .line 753
    .line 754
    if-ge v5, v6, :cond_26

    .line 755
    .line 756
    goto :goto_d

    .line 757
    :cond_26
    const/16 v5, 0x1387

    .line 758
    .line 759
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 760
    .line 761
    .line 762
    move-result v7

    .line 763
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 764
    .line 765
    .line 766
    move-result v7

    .line 767
    if-eqz v7, :cond_27

    .line 768
    .line 769
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 770
    .line 771
    .line 772
    move-result v7

    .line 773
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 774
    .line 775
    .line 776
    move-result v7

    .line 777
    if-eqz v7, :cond_27

    .line 778
    .line 779
    invoke-static {v3, v5}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    goto :goto_d

    .line 784
    :cond_27
    invoke-static {v3, v6}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    :goto_d
    invoke-static {v3}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 793
    .line 794
    .line 795
    :cond_28
    if-eqz v4, :cond_29

    .line 796
    .line 797
    iget-object v3, v4, Lv8;->a:Landroid/view/autofill/AutofillValue;

    .line 798
    .line 799
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 800
    .line 801
    .line 802
    :cond_29
    if-eqz v24, :cond_2a

    .line 803
    .line 804
    invoke-static/range {v24 .. v24}, Lsp0;->A(Lk00;)[Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    if-eqz v3, :cond_2a

    .line 809
    .line 810
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    :cond_2a
    move-object/from16 v3, p4

    .line 814
    .line 815
    iget-object v3, v3, Lq62;->b:Le9;

    .line 816
    .line 817
    iget v4, v1, Lr61;->i:I

    .line 818
    .line 819
    new-instance v5, Lb22;

    .line 820
    .line 821
    invoke-direct {v5, v0}, Lb22;-><init>(Landroid/view/ViewStructure;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3, v4, v5}, Le9;->v(ILon0;)V

    .line 825
    .line 826
    .line 827
    if-eqz v25, :cond_2b

    .line 828
    .line 829
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 830
    .line 831
    .line 832
    move-result v3

    .line 833
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setSelected(Z)V

    .line 834
    .line 835
    .line 836
    :cond_2b
    if-eqz v2, :cond_2d

    .line 837
    .line 838
    move/from16 v13, v23

    .line 839
    .line 840
    invoke-virtual {v0, v13}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 841
    .line 842
    .line 843
    sget-object v3, Lu23;->h:Lu23;

    .line 844
    .line 845
    if-ne v2, v3, :cond_2c

    .line 846
    .line 847
    move v2, v13

    .line 848
    goto :goto_e

    .line 849
    :cond_2c
    const/4 v2, 0x0

    .line 850
    :goto_e
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 851
    .line 852
    .line 853
    goto :goto_f

    .line 854
    :cond_2d
    move/from16 v13, v23

    .line 855
    .line 856
    if-eqz v25, :cond_2e

    .line 857
    .line 858
    invoke-virtual {v0, v13}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 866
    .line 867
    .line 868
    :cond_2e
    :goto_f
    sget-object v2, Lk00;->a:Lj00;

    .line 869
    .line 870
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    sget-object v2, Lj00;->b:Ly7;

    .line 874
    .line 875
    invoke-static {v2}, Lsp0;->A(Lk00;)[Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    array-length v3, v2

    .line 883
    if-eqz v3, :cond_3a

    .line 884
    .line 885
    const/16 v35, 0x0

    .line 886
    .line 887
    aget-object v2, v2, v35

    .line 888
    .line 889
    if-eqz v24, :cond_2f

    .line 890
    .line 891
    invoke-static/range {v24 .. v24}, Lsp0;->A(Lk00;)[Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v3

    .line 895
    if-eqz v3, :cond_2f

    .line 896
    .line 897
    invoke-static {v3, v2}, Lmg;->o0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-ltz v2, :cond_2f

    .line 902
    .line 903
    move/from16 v23, v13

    .line 904
    .line 905
    goto :goto_10

    .line 906
    :cond_2f
    move/from16 v23, v35

    .line 907
    .line 908
    :goto_10
    if-nez v27, :cond_31

    .line 909
    .line 910
    if-eqz v23, :cond_30

    .line 911
    .line 912
    goto :goto_11

    .line 913
    :cond_30
    move/from16 v23, v35

    .line 914
    .line 915
    goto :goto_12

    .line 916
    :cond_31
    :goto_11
    move/from16 v23, v13

    .line 917
    .line 918
    :goto_12
    if-nez v23, :cond_33

    .line 919
    .line 920
    if-eqz v28, :cond_32

    .line 921
    .line 922
    goto :goto_13

    .line 923
    :cond_32
    move/from16 v14, v35

    .line 924
    .line 925
    goto :goto_14

    .line 926
    :cond_33
    :goto_13
    move v14, v13

    .line 927
    :goto_14
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setDataIsSensitive(Z)V

    .line 928
    .line 929
    .line 930
    iget-object v2, v1, Lr61;->M:Lvn1;

    .line 931
    .line 932
    iget-object v2, v2, Lvn1;->e:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v2, Lzn1;

    .line 935
    .line 936
    invoke-virtual {v2}, Lzn1;->a1()Z

    .line 937
    .line 938
    .line 939
    move-result v2

    .line 940
    if-eqz v2, :cond_34

    .line 941
    .line 942
    const/4 v7, 0x4

    .line 943
    goto :goto_15

    .line 944
    :cond_34
    move/from16 v7, v35

    .line 945
    .line 946
    :goto_15
    invoke-virtual {v0, v7}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 947
    .line 948
    .line 949
    if-eqz v12, :cond_36

    .line 950
    .line 951
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    const-string v3, ""

    .line 956
    .line 957
    move/from16 v13, v35

    .line 958
    .line 959
    :goto_16
    if-ge v13, v2, :cond_35

    .line 960
    .line 961
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v4

    .line 965
    check-cast v4, Lsd;

    .line 966
    .line 967
    new-instance v5, Ljava/lang/StringBuilder;

    .line 968
    .line 969
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 973
    .line 974
    .line 975
    iget-object v3, v4, Lsd;->i:Ljava/lang/String;

    .line 976
    .line 977
    const/16 v4, 0xa

    .line 978
    .line 979
    invoke-static {v5, v3, v4}, Lhk1;->i(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    add-int/lit8 v13, v13, 0x1

    .line 984
    .line 985
    goto :goto_16

    .line 986
    :cond_35
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 987
    .line 988
    .line 989
    const-string v2, "android.widget.TextView"

    .line 990
    .line 991
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    :cond_36
    invoke-virtual {v1}, Lr61;->n()Ljava/util/List;

    .line 995
    .line 996
    .line 997
    move-result-object v1

    .line 998
    check-cast v1, Ljk1;

    .line 999
    .line 1000
    invoke-virtual {v1}, Ljk1;->isEmpty()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v1

    .line 1004
    if-eqz v1, :cond_37

    .line 1005
    .line 1006
    if-eqz v26, :cond_37

    .line 1007
    .line 1008
    const-string v1, "android.widget.ImageView"

    .line 1009
    .line 1010
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_37
    if-eqz v20, :cond_39

    .line 1014
    .line 1015
    const-string v1, "android.widget.EditText"

    .line 1016
    .line 1017
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1021
    .line 1022
    const/16 v2, 0x1c

    .line 1023
    .line 1024
    if-lt v1, v2, :cond_38

    .line 1025
    .line 1026
    if-eqz v29, :cond_38

    .line 1027
    .line 1028
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Number;->intValue()I

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    invoke-static {v0, v1}, La4;->s(Landroid/view/ViewStructure;I)V

    .line 1033
    .line 1034
    .line 1035
    :cond_38
    if-eqz v23, :cond_39

    .line 1036
    .line 1037
    const/16 v1, 0x81

    .line 1038
    .line 1039
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setInputType(I)V

    .line 1040
    .line 1041
    .line 1042
    :cond_39
    return-void

    .line 1043
    :cond_3a
    const-string v0, "Array is empty."

    .line 1044
    .line 1045
    invoke-static {v0}, Lum2;->i(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    return-void
.end method

.method public static final M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    sget-object v0, Ls11;->e:Ldq1;

    .line 7
    .line 8
    shl-int/lit8 p3, p3, 0x6

    .line 9
    .line 10
    and-int/lit16 p3, p3, 0x1c00

    .line 11
    .line 12
    or-int/lit16 p3, p3, 0x180

    .line 13
    .line 14
    invoke-static {p0, v0, p1, p2, p3}, Lgf1;->N([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final N([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    iget-wide v0, p3, Lgo0;->T:J

    .line 4
    .line 5
    const/16 v2, 0x24

    .line 6
    .line 7
    invoke-static {v2}, Lxe1;->j(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lhc2;->a:Ltu2;

    .line 21
    .line 22
    invoke-virtual {p3, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v5, v0

    .line 27
    check-cast v5, Lfc2;

    .line 28
    .line 29
    invoke-virtual {p3}, Lgo0;->L()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    sget-object v2, Lnx;->a:Leb;

    .line 35
    .line 36
    if-ne v0, v2, :cond_2

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v5, v6}, Lfc2;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p1, v0}, Lwc2;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v1

    .line 52
    :goto_0
    if-nez v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p2}, Lxm0;->a()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_1
    move-object v7, v0

    .line 59
    new-instance v3, Lbc2;

    .line 60
    .line 61
    move-object v8, p0

    .line 62
    move-object v4, p1

    .line 63
    invoke-direct/range {v3 .. v8}, Lbc2;-><init>(Lwc2;Lfc2;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v0, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v8, p0

    .line 72
    move-object v4, p1

    .line 73
    :goto_1
    check-cast v0, Lbc2;

    .line 74
    .line 75
    iget-object p0, v0, Lbc2;->l:[Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v8, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    iget-object v1, v0, Lbc2;->k:Ljava/lang/Object;

    .line 84
    .line 85
    :cond_3
    if-nez v1, :cond_4

    .line 86
    .line 87
    invoke-interface {p2}, Lxm0;->a()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_4
    invoke-virtual {p3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    and-int/lit8 p1, p4, 0x70

    .line 96
    .line 97
    xor-int/lit8 p1, p1, 0x30

    .line 98
    .line 99
    const/16 p2, 0x20

    .line 100
    .line 101
    if-le p1, p2, :cond_5

    .line 102
    .line 103
    invoke-virtual {p3, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    :cond_5
    and-int/lit8 p1, p4, 0x30

    .line 110
    .line 111
    if-ne p1, p2, :cond_7

    .line 112
    .line 113
    :cond_6
    const/4 p1, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_7
    const/4 p1, 0x0

    .line 116
    :goto_2
    or-int/2addr p0, p1

    .line 117
    invoke-virtual {p3, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    or-int/2addr p0, p1

    .line 122
    invoke-virtual {p3, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    or-int/2addr p0, p1

    .line 127
    invoke-virtual {p3, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    or-int/2addr p0, p1

    .line 132
    invoke-virtual {p3, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    or-int/2addr p0, p1

    .line 137
    invoke-virtual {p3}, Lgo0;->L()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-nez p0, :cond_9

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    move-object v8, v1

    .line 147
    goto :goto_4

    .line 148
    :cond_9
    :goto_3
    new-instance v3, Lmf;

    .line 149
    .line 150
    move-object v7, v6

    .line 151
    move-object v9, v8

    .line 152
    move-object v8, v1

    .line 153
    move-object v6, v5

    .line 154
    move-object v5, v4

    .line 155
    move-object v4, v0

    .line 156
    invoke-direct/range {v3 .. v9}, Lmf;-><init>(Lbc2;Lwc2;Lfc2;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object p1, v3

    .line 163
    :goto_4
    check-cast p1, Lxm0;

    .line 164
    .line 165
    invoke-static {p1, p3}, Leu;->r(Lxm0;Lpx;)V

    .line 166
    .line 167
    .line 168
    return-object v8
.end method

.method public static final O([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    shl-int/lit8 p4, p4, 0x3

    .line 7
    .line 8
    and-int/lit16 p4, p4, 0x1c00

    .line 9
    .line 10
    const/16 v0, 0x180

    .line 11
    .line 12
    or-int/2addr p4, v0

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Lgf1;->N([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final P(Lpx;)Lnl2;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    move-object v2, p0

    .line 5
    check-cast v2, Lgo0;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lgo0;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    check-cast p0, Lgo0;

    .line 12
    .line 13
    invoke-virtual {p0}, Lgo0;->L()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    sget-object v2, Lnx;->a:Leb;

    .line 20
    .line 21
    if-ne v3, v2, :cond_1

    .line 22
    .line 23
    :cond_0
    new-instance v3, Lhn1;

    .line 24
    .line 25
    const/16 v2, 0xe

    .line 26
    .line 27
    invoke-direct {v3, v2}, Lhn1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    check-cast v3, Lxm0;

    .line 34
    .line 35
    sget-object v2, Lnl2;->j:Ldq1;

    .line 36
    .line 37
    invoke-static {v1, v2, v3, p0, v0}, Lgf1;->O([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lnl2;

    .line 42
    .line 43
    return-object p0
.end method

.method public static Q(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 13
    .line 14
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static R(D)J
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 13
    .line 14
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 p0, 0x0

    .line 18
    .line 19
    return-wide p0
.end method

.method public static S(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    invoke-static {p0}, Lf9;->e(Landroid/graphics/Bitmap;)Landroid/graphics/Gainmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {v0}, Lf9;->c(Landroid/graphics/Gainmap;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    if-ne v2, v3, :cond_2

    .line 19
    .line 20
    sget-object v2, Lnp0;->a:Landroid/graphics/ColorMatrixColorFilter;

    .line 21
    .line 22
    invoke-static {v0}, Lf9;->c(Landroid/graphics/Gainmap;)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eq v4, v3, :cond_0

    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v4, v3, :cond_1

    .line 40
    .line 41
    move v3, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v3, v1

    .line 44
    :goto_0
    const-string v4, ""

    .line 45
    .line 46
    invoke-static {v4, v3}, Lfg1;->o(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    invoke-static {v3, v4, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v4, Landroid/graphics/Canvas;

    .line 64
    .line 65
    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 66
    .line 67
    .line 68
    new-instance v6, Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v7, Lnp0;->a:Landroid/graphics/ColorMatrixColorFilter;

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 76
    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-virtual {v4, v2, v7, v7, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Lf9;->u(Landroid/graphics/Bitmap;)Landroid/graphics/Gainmap;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v0}, Lmp0;->s(Landroid/graphics/Gainmap;)[F

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    aget v4, v3, v1

    .line 95
    .line 96
    aget v6, v3, v5

    .line 97
    .line 98
    const/4 v7, 0x2

    .line 99
    aget v3, v3, v7

    .line 100
    .line 101
    invoke-static {v2, v4, v6, v3}, Lmp0;->q(Landroid/graphics/Gainmap;FFF)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lmp0;->y(Landroid/graphics/Gainmap;)[F

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    aget v4, v3, v1

    .line 109
    .line 110
    aget v6, v3, v5

    .line 111
    .line 112
    aget v3, v3, v7

    .line 113
    .line 114
    invoke-static {v2, v4, v6, v3}, Lmp0;->w(Landroid/graphics/Gainmap;FFF)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lmp0;->B(Landroid/graphics/Gainmap;)[F

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    aget v4, v3, v1

    .line 122
    .line 123
    aget v6, v3, v5

    .line 124
    .line 125
    aget v3, v3, v7

    .line 126
    .line 127
    invoke-static {v2, v4, v6, v3}, Lf9;->w(Landroid/graphics/Gainmap;FFF)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Lf9;->p(Landroid/graphics/Gainmap;)[F

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    aget v4, v3, v1

    .line 135
    .line 136
    aget v6, v3, v5

    .line 137
    .line 138
    aget v3, v3, v7

    .line 139
    .line 140
    invoke-static {v2, v4, v6, v3}, Lf9;->z(Landroid/graphics/Gainmap;FFF)V

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lf9;->x(Landroid/graphics/Gainmap;)[F

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    aget v4, v3, v1

    .line 148
    .line 149
    aget v5, v3, v5

    .line 150
    .line 151
    aget v3, v3, v7

    .line 152
    .line 153
    invoke-static {v2, v4, v5, v3}, Lf9;->l(Landroid/graphics/Gainmap;FFF)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lf9;->a(Landroid/graphics/Gainmap;)F

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-static {v2, v3}, Lf9;->k(Landroid/graphics/Gainmap;F)V

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Lf9;->r(Landroid/graphics/Gainmap;)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-static {v2, v0}, Lmp0;->p(Landroid/graphics/Gainmap;F)V

    .line 168
    .line 169
    .line 170
    move-object v0, v2

    .line 171
    :goto_1
    invoke-static {p0, v0}, Lf9;->j(Landroid/graphics/Bitmap;Landroid/graphics/Gainmap;)V

    .line 172
    .line 173
    .line 174
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 175
    .line 176
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0
.end method

.method public static final T(Lo03;Lt91;Lk03;Lxx0;Lus1;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lt91;->d:Lsz0;

    .line 2
    .line 3
    iget-object v1, p1, Lt91;->v:Ln10;

    .line 4
    .line 5
    iget-object v2, p1, Lt91;->w:Ln10;

    .line 6
    .line 7
    new-instance v3, Lo72;

    .line 8
    .line 9
    invoke-direct {v3}, Lo72;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Lm0;

    .line 13
    .line 14
    invoke-direct {v4, v0, v1, v3}, Lm0;-><init>(Lsz0;Ln10;Lo72;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lo03;->a:Lv02;

    .line 18
    .line 19
    invoke-interface {v0, p2, p3, v4, v2}, Lv02;->f(Lk03;Lxx0;Lm0;Ln10;)V

    .line 20
    .line 21
    .line 22
    new-instance p3, Lt03;

    .line 23
    .line 24
    invoke-direct {p3, p0, v0}, Lt03;-><init>(Lo03;Lv02;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lo03;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {p0, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v3, Lo72;->i:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p3, p1, Lt91;->e:Lt03;

    .line 35
    .line 36
    invoke-static {p1, p2, p4}, Lgf1;->E(Lt91;Lk03;Lus1;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final U(Lx13;)J
    .locals 4

    .line 1
    iget v0, p0, Lx13;->a:F

    .line 2
    .line 3
    const v1, 0x43b3ffdf    # 359.999f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v2, v1}, Lci0;->C(FFF)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lx13;->b:F

    .line 12
    .line 13
    const/high16 v3, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Lci0;->C(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget p0, p0, Lx13;->c:F

    .line 20
    .line 21
    invoke-static {p0, v2, v3}, Lci0;->C(FFF)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v2, 0x3

    .line 26
    new-array v2, v2, [F

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    aput v0, v2, v3

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput v1, v2, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput p0, v2, v0

    .line 36
    .line 37
    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p0}, Lsp0;->b(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0
.end method

.method public static final V(Ljava/lang/String;)Lx13;
    .locals 6

    .line 1
    invoke-static {p0}, Lp7;->N(Ljava/lang/String;)Lju;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lju;->a:J

    .line 8
    .line 9
    const/4 p0, 0x3

    .line 10
    new-array p0, p0, [F

    .line 11
    .line 12
    invoke-static {v0, v1}, Lsp0;->j0(J)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0, p0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lx13;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget v1, p0, v1

    .line 23
    .line 24
    const v2, 0x43b3ffdf    # 359.999f

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v1, v3, v2}, Lci0;->C(FFF)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    aget v2, p0, v2

    .line 34
    .line 35
    const/high16 v4, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-static {v2, v3, v4}, Lci0;->C(FFF)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v5, 0x2

    .line 42
    aget p0, p0, v5

    .line 43
    .line 44
    invoke-static {p0, v3, v4}, Lci0;->C(FFF)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-direct {v0, v1, v2, p0}, Lx13;-><init>(FFF)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public static final W(Lyf2;)Lcom/dokar/quickjs/binding/JsObject;
    .locals 6

    .line 1
    iget-object v0, p0, Lyf2;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Low1;

    .line 4
    .line 5
    const-string v2, "platform"

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyf2;->b:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v2, Low1;

    .line 13
    .line 14
    const-string v3, "accountId"

    .line 15
    .line 16
    invoke-direct {v2, v3, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lyf2;->c:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v3, Low1;

    .line 22
    .line 23
    const-string v4, "id"

    .line 24
    .line 25
    invoke-direct {v3, v4, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lyf2;->d:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v4, Low1;

    .line 31
    .line 32
    const-string v5, "type"

    .line 33
    .line 34
    invoke-direct {v4, v5, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lyf2;->e:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v0, Low1;

    .line 40
    .line 41
    const-string v5, "name"

    .line 42
    .line 43
    invoke-direct {v0, v5, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v1, v2, v3, v4, v0}, [Low1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance v0, Lcom/dokar/quickjs/binding/JsObject;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public static final X(Lci2;Ljh2;)Lcom/dokar/quickjs/binding/JsObject;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lci2;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Low1;

    .line 12
    .line 13
    const-string v3, "eventId"

    .line 14
    .line 15
    invoke-direct {v2, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-wide v3, v0, Lci2;->b:J

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Low1;

    .line 25
    .line 26
    const-string v4, "receivedAt"

    .line 27
    .line 28
    invoke-direct {v3, v4, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Low1;

    .line 32
    .line 33
    const-string v1, "platform"

    .line 34
    .line 35
    const-string v5, "wechat"

    .line 36
    .line 37
    invoke-direct {v4, v1, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v6, v0, Lci2;->c:Lid2;

    .line 41
    .line 42
    new-instance v7, Low1;

    .line 43
    .line 44
    invoke-direct {v7, v1, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v6, Lid2;->a:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v5, Low1;

    .line 50
    .line 51
    const-string v8, "id"

    .line 52
    .line 53
    invoke-direct {v5, v8, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v6, Lid2;->b:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v6, Low1;

    .line 59
    .line 60
    const-string v9, "name"

    .line 61
    .line 62
    invoke-direct {v6, v9, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v7, v5, v6}, [Low1;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v5, Lcom/dokar/quickjs/binding/JsObject;

    .line 74
    .line 75
    invoke-direct {v5, v1}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Low1;

    .line 79
    .line 80
    const-string v6, "account"

    .line 81
    .line 82
    invoke-direct {v1, v6, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v5, v0, Lci2;->d:Lyf2;

    .line 86
    .line 87
    invoke-static {v5}, Lgf1;->W(Lyf2;)Lcom/dokar/quickjs/binding/JsObject;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    new-instance v6, Low1;

    .line 92
    .line 93
    const-string v7, "conversation"

    .line 94
    .line 95
    invoke-direct {v6, v7, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v5, v0, Lci2;->e:Lcl2;

    .line 99
    .line 100
    iget-object v7, v5, Lcl2;->a:Ljava/lang/String;

    .line 101
    .line 102
    new-instance v10, Low1;

    .line 103
    .line 104
    invoke-direct {v10, v8, v7}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v7, Low1;

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    invoke-direct {v7, v9, v11}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance v9, Low1;

    .line 114
    .line 115
    const-string v12, "displayName"

    .line 116
    .line 117
    invoke-direct {v9, v12, v11}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-boolean v5, v5, Lcl2;->b:Z

    .line 121
    .line 122
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    new-instance v11, Low1;

    .line 127
    .line 128
    const-string v12, "isSelf"

    .line 129
    .line 130
    invoke-direct {v11, v12, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    filled-new-array {v10, v7, v9, v11}, [Low1;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {v5}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    new-instance v7, Lcom/dokar/quickjs/binding/JsObject;

    .line 142
    .line 143
    invoke-direct {v7, v5}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 144
    .line 145
    .line 146
    new-instance v5, Low1;

    .line 147
    .line 148
    const-string v9, "sender"

    .line 149
    .line 150
    invoke-direct {v5, v9, v7}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v7, v0, Lci2;->f:Lti2;

    .line 154
    .line 155
    iget-object v9, v7, Lti2;->a:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v10, Low1;

    .line 158
    .line 159
    invoke-direct {v10, v8, v9}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-wide v8, v7, Lti2;->b:J

    .line 163
    .line 164
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    new-instance v9, Low1;

    .line 169
    .line 170
    const-string v11, "timestamp"

    .line 171
    .line 172
    invoke-direct {v9, v11, v8}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    new-instance v8, Low1;

    .line 176
    .line 177
    const-string v11, "direction"

    .line 178
    .line 179
    const-string v12, "incoming"

    .line 180
    .line 181
    invoke-direct {v8, v11, v12}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v11, v7, Lti2;->c:Ljava/lang/String;

    .line 185
    .line 186
    new-instance v12, Low1;

    .line 187
    .line 188
    const-string v13, "text"

    .line 189
    .line 190
    invoke-direct {v12, v13, v11}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v7, v7, Lti2;->d:Ljava/util/List;

    .line 194
    .line 195
    new-instance v11, Ljava/util/ArrayList;

    .line 196
    .line 197
    const/16 v14, 0xa

    .line 198
    .line 199
    invoke-static {v7, v14}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_1

    .line 215
    .line 216
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    check-cast v14, Lei2;

    .line 221
    .line 222
    new-instance v15, Lpe1;

    .line 223
    .line 224
    invoke-direct {v15}, Lpe1;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-object/from16 v16, v1

    .line 231
    .line 232
    const-string v1, "type"

    .line 233
    .line 234
    invoke-virtual {v15, v1, v13}, Lpe1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    iget-object v1, v14, Lei2;->a:Ld41;

    .line 238
    .line 239
    iget-object v1, v1, Ld41;->h:Ljava/util/Map;

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    if-eqz v14, :cond_0

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    check-cast v14, Ljava/util/Map$Entry;

    .line 260
    .line 261
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v17

    .line 265
    move-object/from16 v18, v1

    .line 266
    .line 267
    move-object/from16 v1, v17

    .line 268
    .line 269
    check-cast v1, Ljava/lang/String;

    .line 270
    .line 271
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    check-cast v14, Lj31;

    .line 276
    .line 277
    invoke-static {v14}, Lt11;->U(Lj31;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    invoke-virtual {v15, v1, v14}, Lpe1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-object/from16 v1, v18

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_0
    invoke-virtual {v15}, Lpe1;->b()Lpe1;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v14, Lcom/dokar/quickjs/binding/JsObject;

    .line 292
    .line 293
    invoke-direct {v14, v1}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-object/from16 v1, v16

    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_1
    move-object/from16 v16, v1

    .line 303
    .line 304
    new-instance v1, Low1;

    .line 305
    .line 306
    const-string v7, "segments"

    .line 307
    .line 308
    invoke-direct {v1, v7, v11}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    filled-new-array {v10, v9, v8, v12, v1}, [Low1;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-static {v1}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    new-instance v7, Lcom/dokar/quickjs/binding/JsObject;

    .line 320
    .line 321
    invoke-direct {v7, v1}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 322
    .line 323
    .line 324
    new-instance v8, Low1;

    .line 325
    .line 326
    const-string v1, "message"

    .line 327
    .line 328
    invoke-direct {v8, v1, v7}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, v0, Lci2;->g:Ljava/lang/Object;

    .line 332
    .line 333
    move-object/from16 v1, p1

    .line 334
    .line 335
    invoke-virtual {v1, v0}, Ljh2;->a(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    new-instance v9, Low1;

    .line 340
    .line 341
    const-string v1, "rawMessage"

    .line 342
    .line 343
    invoke-direct {v9, v1, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    move-object v7, v5

    .line 347
    move-object/from16 v5, v16

    .line 348
    .line 349
    filled-new-array/range {v2 .. v9}, [Low1;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v1, Lcom/dokar/quickjs/binding/JsObject;

    .line 358
    .line 359
    invoke-direct {v1, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 360
    .line 361
    .line 362
    return-object v1
.end method

.method public static final Y(Lak2;)Lcom/dokar/quickjs/binding/JsObject;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Low1;

    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v1, p0, Lak2;->a:J

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Low1;

    .line 19
    .line 20
    const-string v3, "timestamp"

    .line 21
    .line 22
    invoke-direct {v2, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lak2;->b:Lyf2;

    .line 26
    .line 27
    invoke-static {p0}, Lgf1;->W(Lyf2;)Lcom/dokar/quickjs/binding/JsObject;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v1, Low1;

    .line 32
    .line 33
    const-string v3, "conversation"

    .line 34
    .line 35
    invoke-direct {v1, v3, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    filled-new-array {v0, v2, v1}, [Low1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v0, Lcom/dokar/quickjs/binding/JsObject;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public static final Z(Ljava/lang/Object;Ljava/lang/String;I)Lj31;
    .locals 8

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gt p2, v0, :cond_a

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lz31;->INSTANCE:Lz31;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p0}, Ll31;->a(Ljava/lang/Boolean;)Li41;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    instance-of v0, p0, Ljava/lang/Number;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    check-cast p0, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmpg-double p2, v2, v4

    .line 53
    .line 54
    if-gtz p2, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Ll31;->b(Ljava/lang/Number;)Li41;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    const-string p0, " must be finite."

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v6, 0x0

    .line 68
    const/16 v7, 0x1c

    .line 69
    .line 70
    const-string v2, "INVALID_ARGUMENT"

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_4
    instance-of v0, p0, Lcom/dokar/quickjs/binding/JsObject;

    .line 79
    .line 80
    const-string v2, "."

    .line 81
    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    check-cast p0, Ljava/util/Map;

    .line 85
    .line 86
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Lxe1;->U(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Ljava/lang/Iterable;

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/util/Map$Entry;

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Ljava/lang/String;

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v5, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    add-int/lit8 v5, p2, 0x1

    .line 154
    .line 155
    invoke-static {v1, v4, v5}, Lgf1;->Z(Ljava/lang/Object;Ljava/lang/String;I)Lj31;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_5
    new-instance p0, Ld41;

    .line 164
    .line 165
    invoke-direct {p0, v0}, Ld41;-><init>(Ljava/util/Map;)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :cond_6
    instance-of v0, p0, Ljava/util/List;

    .line 170
    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    check-cast p0, Ljava/lang/Iterable;

    .line 174
    .line 175
    new-instance v0, Ljava/util/ArrayList;

    .line 176
    .line 177
    const/16 v2, 0xa

    .line 178
    .line 179
    invoke-static {p0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    const/4 v2, 0x0

    .line 191
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_8

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    add-int/lit8 v4, v2, 0x1

    .line 202
    .line 203
    if-ltz v2, :cond_7

    .line 204
    .line 205
    new-instance v5, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v6, "["

    .line 214
    .line 215
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v2, "]"

    .line 222
    .line 223
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    add-int/lit8 v5, p2, 0x1

    .line 231
    .line 232
    invoke-static {v3, v2, v5}, Lgf1;->Z(Ljava/lang/Object;Ljava/lang/String;I)Lj31;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move v2, v4

    .line 240
    goto :goto_1

    .line 241
    :cond_7
    invoke-static {}, Leu;->a0()V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_8
    new-instance p0, Lz21;

    .line 246
    .line 247
    invoke-direct {p0, v0}, Lz21;-><init>(Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    return-object p0

    .line 251
    :cond_9
    new-instance v1, Lsd2;

    .line 252
    .line 253
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    new-instance p2, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string p1, " contains unsupported value type "

    .line 270
    .line 271
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    const/4 v6, 0x0

    .line 285
    const/16 v7, 0x1c

    .line 286
    .line 287
    const-string v2, "INVALID_ARGUMENT"

    .line 288
    .line 289
    const/4 v4, 0x0

    .line 290
    const/4 v5, 0x0

    .line 291
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 292
    .line 293
    .line 294
    throw v1

    .line 295
    :cond_a
    const-string p0, " is nested too deeply."

    .line 296
    .line 297
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const/4 v6, 0x0

    .line 302
    const/16 v7, 0x1c

    .line 303
    .line 304
    const-string v2, "INVALID_ARGUMENT"

    .line 305
    .line 306
    const/4 v4, 0x0

    .line 307
    const/4 v5, 0x0

    .line 308
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 309
    .line 310
    .line 311
    return-object v1
.end method

.method public static final a(Lk03;Lin0;Luh1;Lm13;Lwb3;Lin0;Lft2;ZIILxx0;Lk51;ZZLkw;Lpx;II)V
    .locals 64

    move-object/from16 v3, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v6, p3

    move-object/from16 v13, p4

    move/from16 v7, p7

    move/from16 v14, p8

    move-object/from16 v0, p10

    move-object/from16 v15, p11

    move/from16 v2, p12

    move/from16 v1, p13

    move/from16 v4, p16

    move/from16 v5, p17

    .line 1
    iget-wide v8, v3, Lk03;->b:J

    iget-object v10, v3, Lk03;->c:Lf13;

    move-wide/from16 v16, v8

    iget-object v8, v3, Lk03;->a:Lsd;

    move-object/from16 v9, p15

    check-cast v9, Lgo0;

    move-object/from16 v18, v10

    const v10, 0x1d9f981

    invoke-virtual {v9, v10}, Lgo0;->X(I)Lgo0;

    and-int/lit8 v10, v4, 0x6

    const/16 v19, 0x2

    move/from16 p15, v10

    if-nez p15, :cond_1

    invoke-virtual {v9, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_0

    const/16 v20, 0x4

    goto :goto_0

    :cond_0
    move/from16 v20, v19

    :goto_0
    or-int v20, v4, v20

    goto :goto_1

    :cond_1
    move/from16 v20, v4

    :goto_1
    and-int/lit8 v21, v4, 0x30

    const/16 v22, 0x10

    if-nez v21, :cond_3

    invoke-virtual {v9, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_2

    const/16 v21, 0x20

    goto :goto_2

    :cond_2
    move/from16 v21, v22

    :goto_2
    or-int v20, v20, v21

    :cond_3
    const/16 v21, 0x20

    and-int/lit16 v10, v4, 0x180

    const/16 v23, 0x80

    const/16 v24, 0x100

    if-nez v10, :cond_5

    invoke-virtual {v9, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move/from16 v10, v24

    goto :goto_3

    :cond_4
    move/from16 v10, v23

    :goto_3
    or-int v20, v20, v10

    :cond_5
    and-int/lit16 v10, v4, 0xc00

    const/16 v25, 0x400

    move/from16 v26, v10

    if-nez v26, :cond_7

    invoke-virtual {v9, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_6

    const/16 v26, 0x800

    goto :goto_4

    :cond_6
    move/from16 v26, v25

    :goto_4
    or-int v20, v20, v26

    :cond_7
    and-int/lit16 v10, v4, 0x6000

    const/16 v27, 0x2000

    move/from16 v28, v10

    if-nez v28, :cond_9

    invoke-virtual {v9, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_8

    const/16 v28, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v28, v27

    :goto_5
    or-int v20, v20, v28

    :cond_9
    const/high16 v28, 0x30000

    and-int v29, v4, v28

    const/high16 v30, 0x20000

    const/high16 v31, 0x10000

    move-object/from16 v10, p5

    if-nez v29, :cond_b

    invoke-virtual {v9, v10}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_a

    move/from16 v32, v30

    goto :goto_6

    :cond_a
    move/from16 v32, v31

    :goto_6
    or-int v20, v20, v32

    :cond_b
    const/high16 v32, 0x180000

    and-int v33, v4, v32

    const/4 v10, 0x0

    if-nez v33, :cond_d

    invoke-virtual {v9, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_c

    const/high16 v33, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v33, 0x80000

    :goto_7
    or-int v20, v20, v33

    :cond_d
    const/high16 v33, 0xc00000

    and-int v33, v4, v33

    move-object/from16 v10, p6

    if-nez v33, :cond_f

    invoke-virtual {v9, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_e

    const/high16 v34, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v34, 0x400000

    :goto_8
    or-int v20, v20, v34

    :cond_f
    const/high16 v34, 0x6000000

    and-int v34, v4, v34

    if-nez v34, :cond_11

    invoke-virtual {v9, v7}, Lgo0;->g(Z)Z

    move-result v34

    if-eqz v34, :cond_10

    const/high16 v34, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v34, 0x2000000

    :goto_9
    or-int v20, v20, v34

    :cond_11
    const/high16 v34, 0x30000000

    and-int v34, v4, v34

    if-nez v34, :cond_13

    invoke-virtual {v9, v14}, Lgo0;->d(I)Z

    move-result v34

    if-eqz v34, :cond_12

    const/high16 v34, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v34, 0x10000000

    :goto_a
    or-int v20, v20, v34

    :cond_13
    and-int/lit8 v34, v5, 0x6

    move/from16 v10, p9

    if-nez v34, :cond_15

    invoke-virtual {v9, v10}, Lgo0;->d(I)Z

    move-result v34

    if-eqz v34, :cond_14

    const/16 v19, 0x4

    :cond_14
    or-int v19, v5, v19

    goto :goto_b

    :cond_15
    move/from16 v19, v5

    :goto_b
    and-int/lit8 v34, v5, 0x30

    if-nez v34, :cond_17

    invoke-virtual {v9, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_16

    move/from16 v22, v21

    :cond_16
    or-int v19, v19, v22

    :cond_17
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_19

    invoke-virtual {v9, v15}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    move/from16 v23, v24

    :cond_18
    or-int v19, v19, v23

    :cond_19
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_1b

    invoke-virtual {v9, v2}, Lgo0;->g(Z)Z

    move-result v4

    if-eqz v4, :cond_1a

    const/16 v25, 0x800

    :cond_1a
    or-int v19, v19, v25

    :cond_1b
    and-int/lit16 v4, v5, 0x6000

    if-nez v4, :cond_1d

    invoke-virtual {v9, v1}, Lgo0;->g(Z)Z

    move-result v4

    if-eqz v4, :cond_1c

    const/16 v27, 0x4000

    :cond_1c
    or-int v19, v19, v27

    :cond_1d
    and-int v4, v5, v28

    if-nez v4, :cond_1f

    move-object/from16 v4, p14

    invoke-virtual {v9, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1e

    goto :goto_c

    :cond_1e
    move/from16 v30, v31

    :goto_c
    or-int v19, v19, v30

    goto :goto_d

    :cond_1f
    move-object/from16 v4, p14

    :goto_d
    or-int v10, v19, v32

    const v19, 0x12492493

    and-int v1, v20, v19

    const v2, 0x12492492

    move/from16 v19, v10

    if-ne v1, v2, :cond_21

    const v1, 0x92493

    and-int v1, v19, v1

    const v2, 0x92492

    if-eq v1, v2, :cond_20

    goto :goto_e

    :cond_20
    const/4 v1, 0x0

    goto :goto_f

    :cond_21
    :goto_e
    const/4 v1, 0x1

    :goto_f
    and-int/lit8 v2, v20, 0x1

    invoke-virtual {v9, v2, v1}, Lgo0;->O(IZ)Z

    move-result v1

    if-eqz v1, :cond_74

    invoke-virtual {v9}, Lgo0;->T()V

    and-int/lit8 v1, p16, 0x1

    if-eqz v1, :cond_23

    invoke-virtual {v9}, Lgo0;->y()Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_10

    .line 2
    :cond_22
    invoke-virtual {v9}, Lgo0;->R()V

    :cond_23
    :goto_10
    invoke-virtual {v9}, Lgo0;->q()V

    .line 3
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v1

    .line 4
    sget-object v2, Lnx;->a:Leb;

    if-ne v1, v2, :cond_24

    .line 5
    new-instance v1, Lgl0;

    invoke-direct {v1}, Lgl0;-><init>()V

    .line 6
    invoke-virtual {v9, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 7
    :cond_24
    check-cast v1, Lgl0;

    .line 8
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_25

    .line 9
    sget-object v10, Lp91;->a:Lo91;

    .line 10
    new-instance v10, Ll9;

    .line 11
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {v9, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 13
    :cond_25
    check-cast v10, Ll9;

    .line 14
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_26

    .line 15
    new-instance v4, Lo03;

    invoke-direct {v4, v10}, Lo03;-><init>(Lv02;)V

    .line 16
    invoke-virtual {v9, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 17
    :cond_26
    check-cast v4, Lo03;

    move-object/from16 v24, v4

    .line 18
    sget-object v4, Lly;->h:Ltu2;

    .line 19
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    .line 20
    check-cast v4, Le70;

    move-object/from16 v25, v4

    .line 21
    sget-object v4, Lly;->k:Ltu2;

    .line 22
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    .line 23
    check-cast v4, Lxl0;

    move-object/from16 v27, v4

    .line 24
    sget-object v4, Lh13;->a:Lmy;

    .line 25
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg13;

    move-object/from16 v28, v10

    .line 26
    iget-wide v10, v4, Lg13;->b:J

    .line 27
    sget-object v4, Lly;->i:Ltu2;

    .line 28
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    .line 29
    check-cast v4, Lyk0;

    move-object/from16 v30, v4

    .line 30
    sget-object v4, Lly;->u:Ltu2;

    .line 31
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    .line 32
    check-cast v4, Ltd3;

    move-object/from16 v31, v4

    .line 33
    sget-object v4, Lly;->q:Ltu2;

    .line 34
    invoke-virtual {v9, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v4

    .line 35
    check-cast v4, Lbt2;

    .line 36
    sget-object v5, Lqv1;->h:Lqv1;

    const/4 v6, 0x1

    if-ne v14, v6, :cond_27

    if-nez v7, :cond_27

    .line 37
    iget-boolean v6, v0, Lxx0;->a:Z

    if-eqz v6, :cond_27

    .line 38
    sget-object v6, Lqv1;->i:Lqv1;

    goto :goto_11

    :cond_27
    move-object v6, v5

    :goto_11
    const v7, -0xcbd7bf2

    .line 39
    invoke-virtual {v9, v7}, Lgo0;->W(I)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v7

    move-wide/from16 v34, v10

    .line 40
    sget-object v10, Ltz2;->g:Ldq1;

    .line 41
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    invoke-virtual {v9, v11}, Lgo0;->d(I)Z

    move-result v11

    move/from16 v32, v11

    .line 42
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v11

    if-nez v32, :cond_28

    if-ne v11, v2, :cond_29

    .line 43
    :cond_28
    new-instance v11, Lta;

    const/4 v12, 0x4

    invoke-direct {v11, v12, v6}, Lta;-><init>(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {v9, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 45
    :cond_29
    check-cast v11, Lxm0;

    const/4 v12, 0x0

    invoke-static {v7, v10, v11, v9, v12}, Lgf1;->O([Ljava/lang/Object;Lwc2;Lxm0;Lpx;I)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ltz2;

    .line 46
    invoke-virtual {v9, v12}, Lgo0;->p(Z)V

    .line 47
    iget-object v7, v11, Ltz2;->f:Lnx1;

    .line 48
    invoke-virtual {v7}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqv1;

    if-eq v7, v6, :cond_2b

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    if-ne v6, v5, :cond_2a

    .line 50
    const-string v1, "only single-line, non-wrap text fields can scroll horizontally"

    goto :goto_12

    .line 51
    :cond_2a
    const-string v1, "single-line, non-wrap text fields can only scroll horizontally"

    .line 52
    :goto_12
    const-string v2, "Mismatching scroller orientation; "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    and-int/lit8 v5, v20, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_2c

    const/4 v7, 0x1

    goto :goto_13

    :cond_2c
    move v7, v12

    :goto_13
    const v22, 0xe000

    and-int v10, v20, v22

    const/16 v6, 0x4000

    if-ne v10, v6, :cond_2d

    const/4 v10, 0x1

    goto :goto_14

    :cond_2d
    move v10, v12

    :goto_14
    or-int/2addr v7, v10

    .line 54
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_2f

    if-ne v10, v2, :cond_2e

    goto :goto_15

    :cond_2e
    move/from16 v20, v5

    move-object/from16 v36, v8

    move-object/from16 v32, v18

    goto/16 :goto_17

    .line 55
    :cond_2f
    :goto_15
    invoke-static {v13, v8}, Ll93;->a(Lwb3;Lsd;)Lq33;

    move-result-object v7

    iget-object v10, v7, Lq33;->b:Lus1;

    if-eqz v18, :cond_30

    move-object/from16 v6, v18

    .line 56
    iget-wide v12, v6, Lf13;->a:J

    .line 57
    sget v20, Lf13;->c:I

    move/from16 v20, v5

    move-object/from16 v32, v6

    shr-long v5, v12, v21

    long-to-int v5, v5

    invoke-interface {v10, v5}, Lus1;->p(I)I

    move-result v5

    const-wide v36, 0xffffffffL

    and-long v12, v12, v36

    long-to-int v6, v12

    .line 58
    invoke-interface {v10, v6}, Lus1;->p(I)I

    move-result v6

    .line 59
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 60
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 61
    new-instance v6, Lqd;

    .line 62
    iget-object v7, v7, Lq33;->a:Lsd;

    .line 63
    invoke-direct {v6, v7}, Lqd;-><init>(Lsd;)V

    .line 64
    new-instance v36, Llt2;

    const/16 v54, 0x0

    const v55, 0xefff

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    sget-object v53, Lgz2;->c:Lgz2;

    invoke-direct/range {v36 .. v55}, Llt2;-><init>(JJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;I)V

    move-object/from16 v7, v36

    .line 65
    new-instance v13, Lpd;

    move-object/from16 v36, v8

    .line 66
    const-string v8, ""

    .line 67
    invoke-direct {v13, v12, v5, v7, v8}, Lpd;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v5, v6, Lqd;->i:Ljava/util/ArrayList;

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-virtual {v6}, Lqd;->b()Lsd;

    move-result-object v5

    .line 70
    new-instance v6, Lq33;

    invoke-direct {v6, v5, v10}, Lq33;-><init>(Lsd;Lus1;)V

    move-object v10, v6

    goto :goto_16

    :cond_30
    move/from16 v20, v5

    move-object/from16 v36, v8

    move-object/from16 v32, v18

    move-object v10, v7

    .line 71
    :goto_16
    invoke-virtual {v9, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 72
    :goto_17
    move-object v12, v10

    check-cast v12, Lq33;

    .line 73
    iget-object v5, v12, Lq33;->a:Lsd;

    .line 74
    iget-object v13, v12, Lq33;->b:Lus1;

    .line 75
    invoke-virtual {v9}, Lgo0;->x()Lb62;

    move-result-object v6

    if-eqz v6, :cond_73

    .line 76
    iget v7, v6, Lb62;->b:I

    const/16 v23, 0x1

    or-int/lit8 v7, v7, 0x1

    .line 77
    iput v7, v6, Lb62;->b:I

    .line 78
    invoke-virtual {v9, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v7

    .line 79
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_32

    if-ne v8, v2, :cond_31

    goto :goto_18

    :cond_31
    move-object/from16 v6, p3

    move/from16 v7, p7

    move-object v0, v9

    move-object/from16 p15, v11

    move-object/from16 v37, v12

    move-object/from16 v18, v13

    move/from16 v56, v19

    move/from16 v21, v20

    move-object/from16 v58, v24

    move-object/from16 v9, v27

    move-object/from16 v57, v28

    move-object/from16 v3, v30

    move-object/from16 v59, v31

    move-object/from16 v14, v36

    move-object v11, v8

    move-wide/from16 v19, v16

    move-object/from16 v8, v25

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move-wide/from16 v1, v34

    goto :goto_19

    .line 80
    :cond_32
    :goto_18
    new-instance v8, Lt91;

    move-object v7, v4

    .line 81
    new-instance v4, Liz2;

    const/4 v10, 0x0

    move-object v0, v9

    move-object/from16 p15, v11

    move-object/from16 v37, v12

    move-object/from16 v18, v13

    move/from16 v56, v19

    move/from16 v21, v20

    move-object/from16 v58, v24

    move-object/from16 v9, v27

    move-object/from16 v57, v28

    move-object/from16 v3, v30

    move-object/from16 v59, v31

    move-object/from16 v14, v36

    move-object v13, v6

    move-object v12, v7

    move-object v11, v8

    move-wide/from16 v19, v16

    move-object/from16 v8, v25

    move-object/from16 v6, p3

    move/from16 v7, p7

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move-wide/from16 v1, v34

    .line 82
    invoke-direct/range {v4 .. v10}, Liz2;-><init>(Lsd;Lm13;ZLe70;Lxl0;I)V

    .line 83
    invoke-direct {v11, v4, v13, v12}, Lt91;-><init>(Liz2;Lb62;Lbt2;)V

    .line 84
    invoke-virtual {v0, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 85
    :goto_19
    check-cast v11, Lt91;

    move-object/from16 v12, p1

    .line 86
    iput-object v12, v11, Lt91;->u:Lin0;

    .line 87
    iput-wide v1, v11, Lt91;->z:J

    .line 88
    iget-object v1, v11, Lt91;->r:Lb5;

    .line 89
    iput-object v15, v1, Lb5;->j:Ljava/lang/Object;

    .line 90
    iput-object v3, v1, Lb5;->k:Ljava/lang/Object;

    .line 91
    iput-object v14, v11, Lt91;->j:Lsd;

    .line 92
    iget-object v1, v11, Lt91;->a:Liz2;

    .line 93
    iget-object v2, v1, Liz2;->a:Lsd;

    .line 94
    invoke-static {v2, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 95
    iget-object v2, v1, Liz2;->b:Lm13;

    .line 96
    invoke-static {v2, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 97
    iget-boolean v2, v1, Liz2;->e:Z

    if-ne v2, v7, :cond_34

    .line 98
    iget v2, v1, Liz2;->f:I

    const/4 v13, 0x1

    if-ne v2, v13, :cond_35

    .line 99
    iget v2, v1, Liz2;->c:I

    const v4, 0x7fffffff

    if-ne v2, v4, :cond_35

    .line 100
    iget v2, v1, Liz2;->d:I

    if-ne v2, v13, :cond_35

    .line 101
    iget-object v2, v1, Liz2;->g:Le70;

    .line 102
    invoke-static {v2, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    .line 103
    iget-object v2, v1, Liz2;->i:Ljava/util/List;

    .line 104
    sget-object v4, Lbe0;->h:Lbe0;

    invoke-static {v2, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    .line 105
    iget-object v2, v1, Liz2;->h:Lxl0;

    if-eq v2, v9, :cond_33

    goto :goto_1b

    :cond_33
    move-object v4, v1

    :goto_1a
    move-object v1, v6

    move-object/from16 v25, v8

    goto :goto_1c

    :cond_34
    const/4 v13, 0x1

    .line 106
    :cond_35
    :goto_1b
    new-instance v4, Liz2;

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v10}, Liz2;-><init>(Lsd;Lm13;ZLe70;Lxl0;I)V

    goto :goto_1a

    .line 107
    :goto_1c
    iget-object v2, v11, Lt91;->a:Liz2;

    if-eq v2, v4, :cond_36

    iput-boolean v13, v11, Lt91;->p:Z

    .line 108
    :cond_36
    iput-object v4, v11, Lt91;->a:Liz2;

    .line 109
    iget-object v2, v11, Lt91;->d:Lsz0;

    .line 110
    iget-object v4, v11, Lt91;->e:Lt03;

    .line 111
    iget-object v5, v2, Lsz0;->j:Ljava/lang/Object;

    check-cast v5, Lsd0;

    invoke-virtual {v5}, Lsd0;->h()Lf13;

    move-result-object v5

    move-object/from16 v6, v32

    invoke-static {v6, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 112
    iget-object v7, v2, Lsz0;->i:Ljava/lang/Object;

    check-cast v7, Lk03;

    .line 113
    iget-object v7, v7, Lk03;->a:Lsd;

    .line 114
    iget-object v7, v7, Lsd;->i:Ljava/lang/String;

    iget-object v8, v14, Lsd;->i:Ljava/lang/String;

    .line 115
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_37

    .line 116
    new-instance v7, Lsd0;

    move-wide/from16 v8, v19

    invoke-direct {v7, v14, v8, v9}, Lsd0;-><init>(Lsd;J)V

    iput-object v7, v2, Lsz0;->j:Ljava/lang/Object;

    move v10, v13

    const/4 v7, 0x0

    goto :goto_1e

    :cond_37
    move-wide/from16 v8, v19

    .line 117
    iget-object v7, v2, Lsz0;->i:Ljava/lang/Object;

    check-cast v7, Lk03;

    .line 118
    iget-wide v13, v7, Lk03;->b:J

    .line 119
    invoke-static {v13, v14, v8, v9}, Lf13;->b(JJ)Z

    move-result v7

    if-nez v7, :cond_38

    .line 120
    iget-object v7, v2, Lsz0;->j:Ljava/lang/Object;

    check-cast v7, Lsd0;

    invoke-static {v8, v9}, Lf13;->f(J)I

    move-result v10

    invoke-static {v8, v9}, Lf13;->e(J)I

    move-result v13

    invoke-virtual {v7, v10, v13}, Lsd0;->l(II)V

    const/4 v7, 0x1

    :goto_1d
    const/4 v10, 0x0

    goto :goto_1e

    :cond_38
    const/4 v7, 0x0

    goto :goto_1d

    :goto_1e
    const/4 v13, -0x1

    if-nez v6, :cond_3a

    .line 121
    iget-object v6, v2, Lsz0;->j:Ljava/lang/Object;

    check-cast v6, Lsd0;

    .line 122
    iput v13, v6, Lsd0;->d:I

    .line 123
    iput v13, v6, Lsd0;->e:I

    :cond_39
    move-object/from16 v30, v3

    goto :goto_1f

    .line 124
    :cond_3a
    iget-wide v13, v6, Lf13;->a:J

    .line 125
    invoke-static {v13, v14}, Lf13;->c(J)Z

    move-result v6

    if-nez v6, :cond_39

    .line 126
    iget-object v6, v2, Lsz0;->j:Ljava/lang/Object;

    check-cast v6, Lsd0;

    move-object/from16 v30, v3

    invoke-static {v13, v14}, Lf13;->f(J)I

    move-result v3

    invoke-static {v13, v14}, Lf13;->e(J)I

    move-result v13

    invoke-virtual {v6, v3, v13}, Lsd0;->k(II)V

    :goto_1f
    const-wide/16 v13, 0x0

    if-nez v10, :cond_3c

    if-nez v7, :cond_3b

    if-nez v5, :cond_3b

    goto :goto_20

    :cond_3b
    const/4 v6, 0x0

    move-object/from16 v3, p0

    move-object v7, v3

    goto :goto_21

    .line 127
    :cond_3c
    :goto_20
    iget-object v3, v2, Lsz0;->j:Ljava/lang/Object;

    check-cast v3, Lsd0;

    const/4 v5, -0x1

    .line 128
    iput v5, v3, Lsd0;->d:I

    .line 129
    iput v5, v3, Lsd0;->e:I

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object/from16 v3, p0

    .line 130
    invoke-static {v3, v6, v13, v14, v5}, Lk03;->a(Lk03;Lsd;JI)Lk03;

    move-result-object v7

    .line 131
    :goto_21
    iget-object v5, v2, Lsz0;->i:Ljava/lang/Object;

    check-cast v5, Lk03;

    .line 132
    iput-object v7, v2, Lsz0;->i:Ljava/lang/Object;

    if-eqz v4, :cond_3d

    .line 133
    invoke-virtual {v4, v5, v7}, Lt03;->a(Lk03;Lk03;)V

    .line 134
    :cond_3d
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v4, v16

    if-ne v2, v4, :cond_3e

    .line 135
    new-instance v2, Lw73;

    .line 136
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 137
    invoke-virtual {v0, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 138
    :cond_3e
    check-cast v2, Lw73;

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v26

    .line 140
    iget-boolean v5, v2, Lw73;->e:Z

    if-nez v5, :cond_40

    .line 141
    iget-object v5, v2, Lw73;->d:Ljava/lang/Long;

    if-eqz v5, :cond_3f

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :cond_3f
    const-wide/16 v28, 0x1388

    add-long v13, v13, v28

    cmp-long v5, v26, v13

    if-lez v5, :cond_41

    .line 142
    :cond_40
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v2, Lw73;->d:Ljava/lang/Long;

    .line 143
    invoke-virtual {v2, v3}, Lw73;->a(Lk03;)V

    .line 144
    :cond_41
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_42

    .line 145
    invoke-static {v0}, Leu;->C(Lpx;)Lj20;

    move-result-object v5

    .line 146
    invoke-virtual {v0, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 147
    :cond_42
    check-cast v5, Lj20;

    .line 148
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_43

    .line 149
    new-instance v7, Lom;

    invoke-direct {v7}, Lom;-><init>()V

    .line 150
    invoke-virtual {v0, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 151
    :cond_43
    move-object v10, v7

    check-cast v10, Lom;

    .line 152
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_44

    .line 153
    new-instance v7, Lb03;

    invoke-direct {v7, v2}, Lb03;-><init>(Lw73;)V

    .line 154
    invoke-virtual {v0, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 155
    :cond_44
    move-object v14, v7

    check-cast v14, Lb03;

    move-object/from16 v7, v18

    .line 156
    iput-object v7, v14, Lb03;->b:Lus1;

    move-object/from16 v13, p4

    .line 157
    iput-object v13, v14, Lb03;->f:Lwb3;

    .line 158
    iget-object v6, v11, Lt91;->v:Ln10;

    .line 159
    iput-object v6, v14, Lb03;->c:Lin0;

    .line 160
    iput-object v11, v14, Lb03;->d:Lt91;

    .line 161
    iget-object v6, v14, Lb03;->e:Lnx1;

    invoke-virtual {v6, v3}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 162
    new-instance v6, Lf13;

    invoke-direct {v6, v8, v9}, Lf13;-><init>(J)V

    .line 163
    iput-object v6, v14, Lb03;->w:Lf13;

    .line 164
    sget-object v6, Lly;->f:Ltu2;

    .line 165
    invoke-virtual {v0, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lrt;

    .line 166
    iput-object v6, v14, Lb03;->h:Lrt;

    .line 167
    iput-object v5, v14, Lb03;->i:Lj20;

    .line 168
    sget-object v6, Lly;->r:Ltu2;

    .line 169
    invoke-virtual {v0, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln13;

    .line 170
    sget-object v6, Lly;->l:Ltu2;

    .line 171
    invoke-virtual {v0, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbs0;

    .line 172
    iput-object v6, v14, Lb03;->k:Lbs0;

    move-object/from16 v6, v17

    .line 173
    iput-object v6, v14, Lb03;->l:Lgl0;

    xor-int/lit8 v16, p13, 0x1

    .line 174
    iget-object v8, v14, Lb03;->m:Lnx1;

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    .line 175
    invoke-virtual {v8, v9}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 176
    iget-object v8, v14, Lb03;->n:Lnx1;

    invoke-static/range {p12 .. p12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    .line 177
    invoke-virtual {v8, v9}, Lnx1;->setValue(Ljava/lang/Object;)V

    const v8, 0x753a5109

    .line 178
    invoke-virtual {v0, v8}, Lgo0;->W(I)V

    .line 179
    iget-object v8, v1, Lm13;->a:Llt2;

    .line 180
    iget-object v8, v8, Llt2;->k:Lkc1;

    .line 181
    sget-object v9, Lr02;->a:Ltu2;

    const v9, 0x19a9604b

    .line 182
    invoke-virtual {v0, v9}, Lgo0;->W(I)V

    .line 183
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v9, v1, :cond_45

    const/4 v1, 0x0

    .line 184
    invoke-virtual {v0, v1}, Lgo0;->p(Z)V

    move-object/from16 v19, v2

    move v2, v1

    const/4 v1, 0x0

    goto :goto_22

    :cond_45
    const/4 v1, 0x0

    .line 185
    sget-object v9, Lr7;->b:Ltu2;

    .line 186
    invoke-virtual {v0, v9}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v9

    .line 187
    check-cast v9, Landroid/content/Context;

    .line 188
    sget-object v1, Lr02;->a:Ltu2;

    .line 189
    invoke-virtual {v0, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v1

    .line 190
    check-cast v1, La20;

    .line 191
    invoke-virtual {v0, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v0, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v19

    or-int v17, v17, v19

    invoke-virtual {v0, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v19

    or-int v17, v17, v19

    move-object/from16 v19, v2

    .line 192
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v17, :cond_46

    if-ne v2, v4, :cond_47

    .line 193
    :cond_46
    sget-object v2, Lr02;->b:Lq02;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    new-instance v2, Lp02;

    sget-object v3, Lrm2;->h:Lrm2;

    invoke-direct {v2, v1, v9, v3, v8}, Lp02;-><init>(La20;Landroid/content/Context;Lrm2;Lkc1;)V

    .line 195
    invoke-virtual {v0, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 196
    :cond_47
    move-object v1, v2

    check-cast v1, Lp02;

    const/4 v2, 0x0

    .line 197
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 198
    :goto_22
    iput-object v1, v14, Lb03;->j:Lp02;

    .line 199
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 200
    invoke-virtual {v11}, Lt91;->b()Z

    .line 201
    invoke-virtual {v0, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v3, v56

    and-int/lit16 v8, v3, 0x1c00

    const/16 v9, 0x800

    if-ne v8, v9, :cond_48

    const/16 v17, 0x1

    goto :goto_23

    :cond_48
    move/from16 v17, v2

    :goto_23
    or-int v1, v1, v17

    and-int v2, v3, v22

    const/16 v9, 0x4000

    if-ne v2, v9, :cond_49

    const/4 v2, 0x1

    goto :goto_24

    :cond_49
    const/4 v2, 0x0

    :goto_24
    or-int/2addr v1, v2

    move-object/from16 v2, v58

    invoke-virtual {v0, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v1, v9

    move-object/from16 v17, v11

    move/from16 v9, v21

    const/4 v11, 0x4

    if-ne v9, v11, :cond_4a

    const/16 v21, 0x1

    goto :goto_25

    :cond_4a
    const/16 v21, 0x0

    :goto_25
    or-int v1, v1, v21

    and-int/lit8 v21, v3, 0x70

    xor-int/lit8 v11, v21, 0x30

    const/16 v12, 0x20

    if-le v11, v12, :cond_4c

    move-object/from16 v12, p10

    invoke-virtual {v0, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_4b

    goto :goto_26

    :cond_4b
    move/from16 v22, v1

    move-object/from16 v24, v2

    goto :goto_27

    :cond_4c
    move-object/from16 v12, p10

    :goto_26
    move/from16 v22, v1

    and-int/lit8 v1, v3, 0x30

    move-object/from16 v24, v2

    const/16 v2, 0x20

    if-ne v1, v2, :cond_4d

    :goto_27
    const/4 v1, 0x1

    goto :goto_28

    :cond_4d
    const/4 v1, 0x0

    :goto_28
    or-int v1, v22, v1

    invoke-virtual {v0, v7}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v10}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 202
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4e

    if-ne v2, v4, :cond_4f

    :cond_4e
    move-object v1, v0

    goto :goto_29

    :cond_4f
    move-object v13, v4

    move v15, v9

    move-object/from16 v22, v10

    move-object v4, v12

    move-object/from16 v1, v17

    move-object/from16 v18, v19

    move-object v12, v0

    move-object v0, v2

    move/from16 v19, v3

    move-object v10, v5

    move-object/from16 v17, v6

    move-object v9, v7

    move-object v5, v14

    move-object/from16 v2, v24

    move-object/from16 v7, p0

    move v14, v8

    move/from16 v8, p12

    goto :goto_2a

    .line 203
    :goto_29
    new-instance v0, Lh10;

    move-object v2, v12

    move-object v12, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v6

    move-object v6, v2

    move-object v2, v14

    move v14, v8

    move-object v8, v2

    move/from16 v2, p12

    move-object v13, v4

    move v15, v9

    move-object/from16 v18, v19

    move-object/from16 v4, v24

    move/from16 v19, v3

    move-object v9, v5

    move-object/from16 v5, p0

    move/from16 v3, p13

    invoke-direct/range {v0 .. v10}, Lh10;-><init>(Lt91;ZZLo03;Lk03;Lxx0;Lus1;Lb03;Lj20;Lom;)V

    move-object/from16 v22, v10

    move-object v10, v9

    move-object v9, v7

    move-object v7, v5

    move-object v5, v8

    move v8, v2

    move-object v2, v4

    move-object v4, v6

    .line 204
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 205
    :goto_2a
    check-cast v0, Lin0;

    .line 206
    invoke-static/range {v17 .. v17}, Lfg1;->w(Lgl0;)Luh1;

    move-result-object v3

    .line 207
    invoke-static {v3, v0}, Lgf1;->F(Luh1;Lin0;)Luh1;

    move-result-object v0

    .line 208
    invoke-static {v0, v8}, Lxe1;->s(Luh1;Z)Luh1;

    move-result-object v0

    if-eqz v8, :cond_50

    if-nez p13, :cond_50

    const/4 v3, 0x1

    goto :goto_2b

    :cond_50
    const/4 v3, 0x0

    .line 209
    :goto_2b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3, v12}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    move-result-object v3

    .line 210
    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v24

    or-int v6, v6, v24

    invoke-virtual {v12, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v24

    or-int v6, v6, v24

    invoke-virtual {v12, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v24

    or-int v6, v6, v24

    move-object/from16 v24, v0

    const/16 v0, 0x20

    if-le v11, v0, :cond_52

    invoke-virtual {v12, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_51

    goto :goto_2c

    :cond_51
    move-object/from16 v27, v1

    goto :goto_2d

    :cond_52
    :goto_2c
    move-object/from16 v27, v1

    and-int/lit8 v1, v19, 0x30

    if-ne v1, v0, :cond_53

    :goto_2d
    const/4 v0, 0x1

    goto :goto_2e

    :cond_53
    const/4 v0, 0x0

    :goto_2e
    or-int/2addr v0, v6

    .line 211
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_55

    if-ne v1, v13, :cond_54

    goto :goto_2f

    :cond_54
    move-object v0, v1

    move-object v4, v5

    move-object/from16 v60, v24

    move-object/from16 v1, v27

    move-object/from16 v24, v3

    goto :goto_30

    .line 212
    :cond_55
    :goto_2f
    new-instance v0, Lv0;

    const/4 v6, 0x0

    move-object v1, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v5

    move-object v5, v4

    move-object v4, v1

    move-object/from16 v60, v24

    move-object/from16 v1, v27

    invoke-direct/range {v0 .. v6}, Lv0;-><init>(Lt91;Lxk1;Lo03;Lb03;Lxx0;Lt00;)V

    move-object/from16 v24, v2

    move-object v2, v3

    .line 213
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 214
    :goto_30
    check-cast v0, Lmn0;

    sget-object v3, La83;->a:La83;

    invoke-static {v12, v0, v3}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 215
    new-instance v0, Ln10;

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Ln10;-><init>(Lt91;I)V

    const v3, 0x845fed

    .line 216
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Lr8;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v0}, Lr8;-><init>(ILjava/lang/Object;)V

    sget-object v0, Lrh1;->a:Lrh1;

    invoke-static {v0, v3, v5}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    move-result-object v3

    move-object v5, v0

    .line 217
    new-instance v0, Loz2;

    move v6, v11

    move-object v11, v2

    move-object/from16 v2, v17

    move/from16 v17, v6

    move-object v6, v5

    move-object v5, v4

    move v4, v8

    move-object v8, v6

    move-object v6, v9

    move-object v9, v3

    move/from16 v3, p13

    invoke-direct/range {v0 .. v6}, Loz2;-><init>(Lt91;Lgl0;ZZLb03;Lus1;)V

    move-object v4, v5

    move-object/from16 v27, v10

    move-object v10, v2

    if-eqz p12, :cond_56

    .line 218
    new-instance v2, Lwt0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0}, Lwt0;-><init>(ILjava/lang/Object;)V

    invoke-static {v9, v2}, Ltl;->s(Luh1;Lnn0;)Luh1;

    move-result-object v3

    goto :goto_31

    :cond_56
    move-object v3, v9

    .line 219
    :goto_31
    iget-object v0, v4, Lb03;->A:Ler2;

    .line 220
    iget-object v2, v4, Lb03;->z:Lzz2;

    .line 221
    new-instance v5, Lr8;

    const/4 v9, 0x4

    invoke-direct {v5, v9, v4}, Lr8;-><init>(ILjava/lang/Object;)V

    move-object/from16 v28, v10

    .line 222
    new-instance v10, Luw2;

    invoke-direct {v10, v0, v2, v5, v9}, Luw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    invoke-interface {v3, v10}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    .line 223
    sget-object v2, Lm12;->a:Lsn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    new-instance v2, Lk12;

    .line 225
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 226
    invoke-interface {v0, v2}, Luh1;->c(Luh1;)Luh1;

    move-result-object v9

    .line 227
    new-instance v0, Lm0;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v7, v6, v2}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v8, v0}, Lqp0;->s(Luh1;Lin0;)Luh1;

    move-result-object v29

    .line 228
    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v0

    const/16 v2, 0x800

    if-ne v14, v2, :cond_57

    const/4 v10, 0x1

    goto :goto_32

    :cond_57
    const/4 v10, 0x0

    :goto_32
    or-int/2addr v0, v10

    move-object/from16 v3, v59

    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v12, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    const/4 v2, 0x4

    if-ne v15, v2, :cond_58

    const/4 v10, 0x1

    goto :goto_33

    :cond_58
    const/4 v10, 0x0

    :goto_33
    or-int/2addr v0, v10

    invoke-virtual {v12, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 229
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5a

    if-ne v2, v13, :cond_59

    goto :goto_34

    :cond_59
    move-object/from16 v31, v3

    goto :goto_35

    .line 230
    :cond_5a
    :goto_34
    new-instance v0, Li10;

    move/from16 v2, p12

    move-object v5, v7

    invoke-direct/range {v0 .. v6}, Li10;-><init>(Lt91;ZLtd3;Lb03;Lk03;Lus1;)V

    move-object/from16 v31, v3

    .line 231
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    move-object v2, v0

    .line 232
    :goto_35
    check-cast v2, Lin0;

    invoke-static {v8, v2}, Lt11;->E(Luh1;Lin0;)Luh1;

    move-result-object v14

    move-object/from16 v0, p4

    move-object v7, v6

    .line 233
    instance-of v6, v0, Ltx1;

    .line 234
    new-instance v0, Lt10;

    move-object/from16 v2, p0

    move/from16 v5, p12

    move-object v3, v1

    move-object/from16 v26, v14

    move-object/from16 v10, v28

    move-object/from16 v1, v37

    move-object v14, v8

    move-object/from16 v28, v9

    move-object/from16 v9, p10

    move-object v8, v4

    move/from16 v4, p13

    invoke-direct/range {v0 .. v10}, Lt10;-><init>(Lq33;Lk03;Lt91;ZZZLus1;Lb03;Lxx0;Lgl0;)V

    move-object v1, v3

    move v10, v5

    move-object v6, v9

    move-object v9, v0

    if-eqz v10, :cond_5c

    if-nez p13, :cond_5c

    .line 235
    move-object/from16 v4, v31

    check-cast v4, Lk91;

    .line 236
    iget-object v0, v4, Lk91;->a:Lnx1;

    .line 237
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 238
    iget-object v0, v1, Lt91;->A:Lnx1;

    .line 239
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf13;

    .line 240
    iget-wide v2, v0, Lf13;->a:J

    .line 241
    invoke-static {v2, v3}, Lf13;->c(J)Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 242
    iget-object v0, v1, Lt91;->B:Lnx1;

    .line 243
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf13;

    .line 244
    iget-wide v2, v0, Lf13;->a:J

    .line 245
    invoke-static {v2, v3}, Lf13;->c(J)Z

    move-result v0

    if-nez v0, :cond_5b

    goto :goto_36

    :cond_5b
    const/4 v0, 0x1

    goto :goto_37

    :cond_5c
    :goto_36
    const/4 v0, 0x0

    :goto_37
    if-eqz v0, :cond_5d

    .line 246
    new-instance v0, Lb81;

    const/4 v5, 0x7

    move-object/from16 v3, p0

    move-object v2, v1

    move-object v4, v7

    move-object/from16 v1, p6

    invoke-direct/range {v0 .. v5}, Lb81;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v2

    invoke-static {v14, v0}, Ltl;->s(Luh1;Lnn0;)Luh1;

    move-result-object v0

    move-object/from16 v32, v0

    goto :goto_38

    :cond_5d
    move-object/from16 v32, v14

    .line 247
    :goto_38
    invoke-virtual {v12, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v0

    .line 248
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5f

    if-ne v2, v13, :cond_5e

    goto :goto_39

    :cond_5e
    const/4 v0, 0x0

    goto :goto_3a

    .line 249
    :cond_5f
    :goto_39
    new-instance v2, Lj10;

    const/4 v0, 0x0

    invoke-direct {v2, v8, v0}, Lj10;-><init>(Lb03;I)V

    .line 250
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 251
    :goto_3a
    check-cast v2, Lin0;

    invoke-static {v8, v2, v12}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 252
    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    const/4 v3, 0x4

    if-ne v15, v3, :cond_60

    const/4 v3, 0x1

    goto :goto_3b

    :cond_60
    move v3, v0

    :goto_3b
    or-int/2addr v2, v3

    move/from16 v3, v17

    const/16 v4, 0x20

    if-le v3, v4, :cond_61

    invoke-virtual {v12, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_62

    :cond_61
    and-int/lit8 v3, v19, 0x30

    if-ne v3, v4, :cond_63

    :cond_62
    const/4 v3, 0x1

    goto :goto_3c

    :cond_63
    move v3, v0

    :goto_3c
    or-int/2addr v2, v3

    .line 253
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_64

    if-ne v3, v13, :cond_65

    :cond_64
    move v2, v0

    goto :goto_3d

    :cond_65
    move v11, v0

    move-object v15, v6

    goto :goto_3e

    .line 254
    :goto_3d
    new-instance v0, Lpc;

    const/4 v5, 0x2

    move-object v3, v11

    move v11, v2

    move-object v2, v3

    move-object/from16 v3, p0

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lpc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v15, v4

    .line 255
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    move-object v3, v0

    .line 256
    :goto_3e
    check-cast v3, Lin0;

    invoke-static {v15, v3, v12}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    move-object v4, v8

    .line 257
    iget-object v8, v1, Lt91;->v:Ln10;

    move/from16 v0, p8

    const/4 v6, 0x1

    if-ne v0, v6, :cond_66

    const/4 v5, 0x1

    :goto_3f
    move-object v2, v9

    goto :goto_40

    :cond_66
    move v5, v11

    goto :goto_3f

    .line 258
    :goto_40
    iget v9, v15, Lxx0;->e:I

    .line 259
    new-instance v0, Lnz2;

    move-object/from16 v3, p0

    move-object v11, v2

    move-object v2, v4

    move-object v6, v7

    move/from16 v4, v16

    move-object/from16 v7, v18

    invoke-direct/range {v0 .. v9}, Lnz2;-><init>(Lt91;Lb03;Lk03;ZZLus1;Lw73;Lin0;I)V

    move-object v4, v2

    move-object v7, v6

    invoke-static {v14, v0}, Ltl;->s(Luh1;Lnn0;)Luh1;

    move-result-object v0

    .line 260
    iget v2, v15, Lxx0;->d:I

    const/4 v3, 0x7

    if-ne v2, v3, :cond_67

    goto :goto_41

    :cond_67
    const/16 v3, 0x8

    if-ne v2, v3, :cond_68

    :goto_41
    const/4 v2, 0x0

    goto :goto_42

    :cond_68
    const/4 v2, 0x1

    .line 261
    :goto_42
    invoke-interface/range {v24 .. v24}, Lgu2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 262
    invoke-virtual {v12, v2}, Lgo0;->g(Z)Z

    move-result v5

    move-object/from16 v6, v57

    invoke-virtual {v12, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    .line 263
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_6a

    if-ne v8, v13, :cond_69

    goto :goto_43

    :cond_69
    const/4 v5, 0x1

    goto :goto_44

    .line 264
    :cond_6a
    :goto_43
    new-instance v8, Lp00;

    const/4 v5, 0x1

    invoke-direct {v8, v5, v6, v2}, Lp00;-><init>(ILjava/lang/Object;Z)V

    .line 265
    invoke-virtual {v12, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 266
    :goto_44
    check-cast v8, Lxm0;

    if-eqz v3, :cond_6c

    .line 267
    sget-boolean v3, Lbw2;->a:Z

    if-eqz v3, :cond_6c

    if-eqz v2, :cond_6b

    .line 268
    sget-object v2, Lqp0;->q:Ldb0;

    .line 269
    new-instance v3, Lcw2;

    invoke-direct {v3, v2}, Lcw2;-><init>(Ldb0;)V

    goto :goto_45

    :cond_6b
    move-object v3, v14

    .line 270
    :goto_45
    new-instance v2, Lzv2;

    invoke-direct {v2, v8}, Lzv2;-><init>(Lxm0;)V

    invoke-interface {v3, v2}, Luh1;->c(Luh1;)Luh1;

    move-result-object v2

    goto :goto_46

    :cond_6c
    move-object v2, v14

    .line 271
    :goto_46
    sget-object v3, Lri;->a:Lmy;

    .line 272
    invoke-virtual {v12, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lan;

    .line 273
    sget-object v8, Lri;->b:Lmy;

    .line 274
    invoke-virtual {v12, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lju;

    .line 275
    iget-wide v8, v8, Lju;->a:J

    const v16, 0x4dffeb3b    # 5.3670077E8f

    move-object/from16 v57, v6

    .line 276
    invoke-static/range {v16 .. v16}, Lsp0;->b(I)J

    move-result-wide v5

    .line 277
    invoke-static {v8, v9, v5, v6}, Lju;->c(JJ)Z

    move-result v5

    if-nez v5, :cond_6d

    .line 278
    new-instance v3, Lft2;

    invoke-direct {v3, v8, v9}, Lft2;-><init>(J)V

    .line 279
    :cond_6d
    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 280
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6e

    if-ne v6, v13, :cond_6f

    .line 281
    :cond_6e
    new-instance v6, Ld2;

    const/16 v5, 0xc

    invoke-direct {v6, v5, v1, v3}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 282
    invoke-virtual {v12, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 283
    :cond_6f
    check-cast v6, Lin0;

    invoke-static {v14, v6}, Lqp0;->u(Luh1;Lin0;)Luh1;

    move-result-object v3

    move-object/from16 v5, p2

    .line 284
    invoke-interface {v5, v3}, Luh1;->c(Luh1;)Luh1;

    move-result-object v3

    move-object/from16 v6, v57

    .line 285
    invoke-static {v3, v6, v1, v4}, Lse;->O(Luh1;Ll9;Lt91;Lb03;)Luh1;

    move-result-object v3

    .line 286
    invoke-interface {v3, v2}, Luh1;->c(Luh1;)Luh1;

    move-result-object v2

    move-object/from16 v3, v60

    .line 287
    invoke-interface {v2, v3}, Luh1;->c(Luh1;)Luh1;

    move-result-object v2

    .line 288
    new-instance v3, Lzh;

    const/16 v6, 0xb

    move-object/from16 v8, v30

    invoke-direct {v3, v6, v8, v1}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lup0;->C(Luh1;Lin0;)Luh1;

    move-result-object v2

    .line 289
    new-instance v3, Lzh;

    const/4 v8, 0x3

    invoke-direct {v3, v8, v1, v4}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lup0;->C(Luh1;Lin0;)Luh1;

    move-result-object v2

    .line 290
    invoke-interface {v2, v0}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    .line 291
    new-instance v2, Lcb;

    move-object/from16 v3, p15

    invoke-direct {v2, v8, v3, v10}, Lcb;-><init>(ILjava/lang/Object;Z)V

    .line 292
    new-instance v8, Lmx;

    invoke-direct {v8, v2}, Lmx;-><init>(Lnn0;)V

    invoke-interface {v0, v8}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    move-object/from16 v2, v28

    .line 293
    invoke-interface {v0, v2}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    .line 294
    invoke-interface {v0, v11}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    .line 295
    new-instance v2, Ln10;

    const/4 v11, 0x0

    invoke-direct {v2, v1, v11}, Ln10;-><init>(Lt91;I)V

    invoke-static {v0, v2}, Lt11;->E(Luh1;Lin0;)Luh1;

    move-result-object v0

    .line 296
    new-instance v2, Laf;

    const/16 v8, 0x14

    move-object/from16 v9, v27

    invoke-direct {v2, v8, v4, v9}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 297
    new-instance v8, Lo5;

    invoke-direct {v8, v2}, Lo5;-><init>(Laf;)V

    invoke-interface {v0, v8}, Luh1;->c(Luh1;)Luh1;

    move-result-object v0

    if-eqz v10, :cond_70

    .line 298
    invoke-virtual {v1}, Lt91;->b()Z

    move-result v2

    if-eqz v2, :cond_70

    .line 299
    iget-object v2, v1, Lt91;->q:Lnx1;

    .line 300
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_70

    .line 301
    move-object/from16 v2, v31

    check-cast v2, Lk91;

    .line 302
    iget-object v2, v2, Lk91;->a:Lnx1;

    .line 303
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_70

    const/16 v23, 0x1

    goto :goto_47

    :cond_70
    move/from16 v23, v11

    :goto_47
    if-eqz v23, :cond_72

    .line 304
    invoke-static {}, Lhe1;->a()Z

    move-result v2

    if-nez v2, :cond_71

    goto :goto_48

    .line 305
    :cond_71
    new-instance v2, Lwt0;

    invoke-direct {v2, v6, v4}, Lwt0;-><init>(ILjava/lang/Object;)V

    invoke-static {v14, v2}, Ltl;->s(Luh1;Lnn0;)Luh1;

    move-result-object v2

    move-object v14, v2

    :cond_72
    :goto_48
    move-object v2, v0

    .line 306
    new-instance v0, Lf10;

    move-object/from16 v8, p4

    move-object/from16 v17, p5

    move/from16 v5, p8

    move/from16 v16, p13

    move-object/from16 v62, v2

    move-object v6, v3

    move-object/from16 v18, v7

    move-object/from16 v61, v12

    move-object v12, v14

    move-object/from16 v13, v22

    move/from16 v15, v23

    move-object/from16 v19, v25

    move-object/from16 v11, v26

    move-object/from16 v10, v29

    move-object/from16 v9, v32

    move-object/from16 v7, p0

    move-object/from16 v3, p3

    move-object v2, v1

    move-object v14, v4

    move/from16 v4, p9

    move-object/from16 v1, p14

    invoke-direct/range {v0 .. v19}, Lf10;-><init>(Lkw;Lt91;Lm13;IILtz2;Lk03;Lwb3;Luh1;Luh1;Luh1;Luh1;Lom;Lb03;ZZLin0;Lus1;Le70;)V

    move-object v4, v14

    const v1, -0x308d4209

    move-object/from16 v12, v61

    invoke-static {v1, v0, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    move-result-object v0

    const/16 v1, 0x180

    move-object/from16 v2, v62

    invoke-static {v2, v4, v0, v12, v1}, Lgf1;->b(Luh1;Lb03;Lkw;Lpx;I)V

    goto :goto_49

    .line 307
    :cond_73
    const-string v0, "no recompose scope found"

    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    return-void

    :cond_74
    move-object v12, v9

    .line 308
    invoke-virtual {v12}, Lgo0;->R()V

    .line 309
    :goto_49
    invoke-virtual {v12}, Lgo0;->r()Lb62;

    move-result-object v0

    if-eqz v0, :cond_75

    move-object v1, v0

    new-instance v0, Lg10;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v63, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, Lg10;-><init>(Lk03;Lin0;Luh1;Lm13;Lwb3;Lin0;Lft2;ZIILxx0;Lk51;ZZLkw;II)V

    move-object/from16 v1, v63

    .line 310
    iput-object v0, v1, Lb62;->d:Lmn0;

    :cond_75
    return-void
.end method

.method public static a0(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "Clear"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    const-string p0, "Src"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    const-string p0, "Dst"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    if-ne p0, v0, :cond_3

    .line 20
    .line 21
    const-string p0, "SrcOver"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    const/4 v0, 0x4

    .line 25
    if-ne p0, v0, :cond_4

    .line 26
    .line 27
    const-string p0, "DstOver"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_5

    .line 32
    .line 33
    const-string p0, "SrcIn"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const/4 v0, 0x6

    .line 37
    if-ne p0, v0, :cond_6

    .line 38
    .line 39
    const-string p0, "DstIn"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_6
    const/4 v0, 0x7

    .line 43
    if-ne p0, v0, :cond_7

    .line 44
    .line 45
    const-string p0, "SrcOut"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_7
    const/16 v0, 0x8

    .line 49
    .line 50
    if-ne p0, v0, :cond_8

    .line 51
    .line 52
    const-string p0, "DstOut"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_8
    const/16 v0, 0x9

    .line 56
    .line 57
    if-ne p0, v0, :cond_9

    .line 58
    .line 59
    const-string p0, "SrcAtop"

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_9
    const/16 v0, 0xa

    .line 63
    .line 64
    if-ne p0, v0, :cond_a

    .line 65
    .line 66
    const-string p0, "DstAtop"

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_a
    const/16 v0, 0xb

    .line 70
    .line 71
    if-ne p0, v0, :cond_b

    .line 72
    .line 73
    const-string p0, "Xor"

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_b
    const/16 v0, 0xc

    .line 77
    .line 78
    if-ne p0, v0, :cond_c

    .line 79
    .line 80
    const-string p0, "Plus"

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_c
    const/16 v0, 0xd

    .line 84
    .line 85
    if-ne p0, v0, :cond_d

    .line 86
    .line 87
    const-string p0, "Modulate"

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_d
    const/16 v0, 0xe

    .line 91
    .line 92
    if-ne p0, v0, :cond_e

    .line 93
    .line 94
    const-string p0, "Screen"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_e
    const/16 v0, 0xf

    .line 98
    .line 99
    if-ne p0, v0, :cond_f

    .line 100
    .line 101
    const-string p0, "Overlay"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_f
    const/16 v0, 0x10

    .line 105
    .line 106
    if-ne p0, v0, :cond_10

    .line 107
    .line 108
    const-string p0, "Darken"

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_10
    const/16 v0, 0x11

    .line 112
    .line 113
    if-ne p0, v0, :cond_11

    .line 114
    .line 115
    const-string p0, "Lighten"

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_11
    const/16 v0, 0x12

    .line 119
    .line 120
    if-ne p0, v0, :cond_12

    .line 121
    .line 122
    const-string p0, "ColorDodge"

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_12
    const/16 v0, 0x13

    .line 126
    .line 127
    if-ne p0, v0, :cond_13

    .line 128
    .line 129
    const-string p0, "ColorBurn"

    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_13
    const/16 v0, 0x14

    .line 133
    .line 134
    if-ne p0, v0, :cond_14

    .line 135
    .line 136
    const-string p0, "HardLight"

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_14
    const/16 v0, 0x15

    .line 140
    .line 141
    if-ne p0, v0, :cond_15

    .line 142
    .line 143
    const-string p0, "Softlight"

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_15
    const/16 v0, 0x16

    .line 147
    .line 148
    if-ne p0, v0, :cond_16

    .line 149
    .line 150
    const-string p0, "Difference"

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_16
    const/16 v0, 0x17

    .line 154
    .line 155
    if-ne p0, v0, :cond_17

    .line 156
    .line 157
    const-string p0, "Exclusion"

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_17
    const/16 v0, 0x18

    .line 161
    .line 162
    if-ne p0, v0, :cond_18

    .line 163
    .line 164
    const-string p0, "Multiply"

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_18
    const/16 v0, 0x19

    .line 168
    .line 169
    if-ne p0, v0, :cond_19

    .line 170
    .line 171
    const-string p0, "Hue"

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_19
    const/16 v0, 0x1a

    .line 175
    .line 176
    if-ne p0, v0, :cond_1a

    .line 177
    .line 178
    const-string p0, "Saturation"

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_1a
    const/16 v0, 0x1b

    .line 182
    .line 183
    if-ne p0, v0, :cond_1b

    .line 184
    .line 185
    const-string p0, "Color"

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_1b
    const/16 v0, 0x1c

    .line 189
    .line 190
    if-ne p0, v0, :cond_1c

    .line 191
    .line 192
    const-string p0, "Luminosity"

    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_1c
    const-string p0, "Unknown"

    .line 196
    .line 197
    return-object p0
.end method

.method public static final b(Luh1;Lb03;Lkw;Lpx;I)V
    .locals 8

    .line 1
    check-cast p3, Lgo0;

    .line 2
    .line 3
    const v0, 0x795d8dec

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p4

    .line 19
    invoke-virtual {p3, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    and-int/lit16 v1, v0, 0x93

    .line 32
    .line 33
    const/16 v2, 0x92

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/4 v1, 0x0

    .line 41
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p3, v2, v1}, Lgo0;->O(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    sget-object v1, Lsn;->j:Lrk;

    .line 50
    .line 51
    invoke-static {v1, v3}, Ldm;->d(Lr5;Z)Lnf1;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-wide v4, p3, Lgo0;->T:J

    .line 56
    .line 57
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {p3}, Lgo0;->l()Lyy1;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {p3, p0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v6, Lhx;->c:Lgx;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v6, Lgx;->b:Ljy;

    .line 75
    .line 76
    invoke-virtual {p3}, Lgo0;->Z()V

    .line 77
    .line 78
    .line 79
    iget-boolean v7, p3, Lgo0;->S:Z

    .line 80
    .line 81
    if-eqz v7, :cond_3

    .line 82
    .line 83
    invoke-virtual {p3, v6}, Lgo0;->k(Lxm0;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {p3}, Lgo0;->i0()V

    .line 88
    .line 89
    .line 90
    :goto_3
    sget-object v6, Lgx;->e:Llc;

    .line 91
    .line 92
    invoke-static {p3, v6, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lgx;->d:Llc;

    .line 96
    .line 97
    invoke-static {p3, v1, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, Lgx;->f:Llc;

    .line 105
    .line 106
    invoke-static {p3, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v1, Lgx;->g:Lv6;

    .line 110
    .line 111
    invoke-static {p3, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 112
    .line 113
    .line 114
    sget-object v1, Lgx;->c:Llc;

    .line 115
    .line 116
    invoke-static {p3, v1, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    shr-int/lit8 v0, v0, 0x3

    .line 120
    .line 121
    and-int/lit8 v0, v0, 0x7e

    .line 122
    .line 123
    invoke-static {p1, p2, p3, v0}, Ls11;->f(Lb03;Lkw;Lpx;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3, v3}, Lgo0;->p(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    invoke-virtual {p3}, Lgo0;->R()V

    .line 131
    .line 132
    .line 133
    :goto_4
    invoke-virtual {p3}, Lgo0;->r()Lb62;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    if-eqz p3, :cond_5

    .line 138
    .line 139
    new-instance v0, Ltt0;

    .line 140
    .line 141
    const/4 v5, 0x5

    .line 142
    move-object v1, p0

    .line 143
    move-object v2, p1

    .line 144
    move-object v3, p2

    .line 145
    move v4, p4

    .line 146
    invoke-direct/range {v0 .. v5}, Ltt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 147
    .line 148
    .line 149
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 150
    .line 151
    :cond_5
    return-void
.end method

.method public static b0(Luh1;Lnl2;)Luh1;
    .locals 8

    .line 1
    iget-object v3, p1, Lnl2;->d:Lbk1;

    .line 2
    .line 3
    sget-object v0, Lrh1;->a:Lrh1;

    .line 4
    .line 5
    sget-object v1, Liu0;->c:Liu0;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Lol2;

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    sget-object v4, Lqv1;->h:Lqv1;

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v0 .. v7}, Lol2;-><init>(Ls8;Ln50;Lbk1;Lqv1;Lbm2;ZZ)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Lcm2;

    .line 32
    .line 33
    invoke-direct {p1, v5}, Lcm2;-><init>(Lnl2;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, p1}, Luh1;->c(Luh1;)Luh1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static final c(Lb03;ZLpx;I)V
    .locals 11

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0x25552d88

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    invoke-virtual {p2, p1}, Lgo0;->g(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v1, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr v0, v1

    .line 32
    and-int/lit8 v1, v0, 0x13

    .line 33
    .line 34
    const/16 v3, 0x12

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    move v1, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v1, v5

    .line 43
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 44
    .line 45
    invoke-virtual {p2, v3, v1}, Lgo0;->O(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_d

    .line 50
    .line 51
    if-eqz p1, :cond_c

    .line 52
    .line 53
    const v1, 0x5b336eec

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v1}, Lgo0;->W(I)V

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Lb03;->d:Lt91;

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {v3}, Lt91;->d()Lz03;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    iget-object v3, v3, Lz03;->a:Ly03;

    .line 71
    .line 72
    iget-object v7, p0, Lb03;->d:Lt91;

    .line 73
    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    iget-boolean v7, v7, Lt91;->p:Z

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v7, v4

    .line 80
    :goto_3
    if-nez v7, :cond_4

    .line 81
    .line 82
    move-object v6, v3

    .line 83
    :cond_4
    if-nez v6, :cond_5

    .line 84
    .line 85
    const v0, 0x5b336eeb

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v0}, Lgo0;->W(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_5
    invoke-virtual {p2, v1}, Lgo0;->W(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-wide v7, v1, Lk03;->b:J

    .line 104
    .line 105
    invoke-static {v7, v8}, Lf13;->c(J)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_8

    .line 110
    .line 111
    const v1, 0x7dc11ac6

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, v1}, Lgo0;->W(I)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lb03;->b:Lus1;

    .line 118
    .line 119
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-wide v7, v3, Lk03;->b:J

    .line 124
    .line 125
    shr-long v2, v7, v2

    .line 126
    .line 127
    long-to-int v2, v2

    .line 128
    invoke-interface {v1, v2}, Lus1;->p(I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iget-object v2, p0, Lb03;->b:Lus1;

    .line 133
    .line 134
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget-wide v7, v3, Lk03;->b:J

    .line 139
    .line 140
    const-wide v9, 0xffffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    and-long/2addr v7, v9

    .line 146
    long-to-int v3, v7

    .line 147
    invoke-interface {v2, v3}, Lus1;->p(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-virtual {v6, v1}, Ly03;->a(I)Lc92;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    sub-int/2addr v2, v4

    .line 156
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-virtual {v6, v2}, Ly03;->a(I)Lc92;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget-object v3, p0, Lb03;->d:Lt91;

    .line 165
    .line 166
    if-eqz v3, :cond_6

    .line 167
    .line 168
    iget-object v3, v3, Lt91;->m:Lnx1;

    .line 169
    .line 170
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-ne v3, v4, :cond_6

    .line 181
    .line 182
    const v3, 0x7dc77b9a

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, v3}, Lgo0;->W(I)V

    .line 186
    .line 187
    .line 188
    shl-int/lit8 v3, v0, 0x6

    .line 189
    .line 190
    and-int/lit16 v3, v3, 0x380

    .line 191
    .line 192
    or-int/lit8 v3, v3, 0x6

    .line 193
    .line 194
    invoke-static {v4, v1, p0, p2, v3}, Lup0;->c(ZLc92;Lb03;Lpx;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    const v1, 0x7dcb87ae

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v1}, Lgo0;->W(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 208
    .line 209
    .line 210
    :goto_4
    iget-object v1, p0, Lb03;->d:Lt91;

    .line 211
    .line 212
    if-eqz v1, :cond_7

    .line 213
    .line 214
    iget-object v1, v1, Lt91;->n:Lnx1;

    .line 215
    .line 216
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    check-cast v1, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-ne v1, v4, :cond_7

    .line 227
    .line 228
    const v1, 0x7dcccf7b

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, v1}, Lgo0;->W(I)V

    .line 232
    .line 233
    .line 234
    shl-int/lit8 v0, v0, 0x6

    .line 235
    .line 236
    and-int/lit16 v0, v0, 0x380

    .line 237
    .line 238
    or-int/lit8 v0, v0, 0x6

    .line 239
    .line 240
    invoke-static {v5, v2, p0, p2, v0}, Lup0;->c(ZLc92;Lb03;Lpx;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_7
    const v0, 0x7dd0d7ce    # 3.4699993E37f

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2, v0}, Lgo0;->W(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 254
    .line 255
    .line 256
    :goto_5
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_8
    const v0, 0x7dd12d0e

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, v0}, Lgo0;->W(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 267
    .line 268
    .line 269
    :goto_6
    iget-object v0, p0, Lb03;->d:Lt91;

    .line 270
    .line 271
    if-eqz v0, :cond_b

    .line 272
    .line 273
    iget-object v1, v0, Lt91;->l:Lnx1;

    .line 274
    .line 275
    iget-object v2, p0, Lb03;->u:Lk03;

    .line 276
    .line 277
    iget-object v2, v2, Lk03;->a:Lsd;

    .line 278
    .line 279
    iget-object v2, v2, Lsd;->i:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    iget-object v3, v3, Lk03;->a:Lsd;

    .line 286
    .line 287
    iget-object v3, v3, Lsd;->i:Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v2, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-nez v2, :cond_9

    .line 294
    .line 295
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v1, v2}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_9
    invoke-virtual {v0}, Lt91;->b()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_b

    .line 305
    .line 306
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_a

    .line 317
    .line 318
    invoke-virtual {p0}, Lb03;->r()V

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_a
    invoke-virtual {p0}, Lb03;->o()V

    .line 323
    .line 324
    .line 325
    :cond_b
    :goto_7
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 326
    .line 327
    .line 328
    :goto_8
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_c
    const v0, 0x768ee72a

    .line 333
    .line 334
    .line 335
    invoke-virtual {p2, v0}, Lgo0;->W(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p2, v5}, Lgo0;->p(Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0}, Lb03;->o()V

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_d
    invoke-virtual {p2}, Lgo0;->R()V

    .line 346
    .line 347
    .line 348
    :goto_9
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    if-eqz p2, :cond_e

    .line 353
    .line 354
    new-instance v0, Lm10;

    .line 355
    .line 356
    invoke-direct {v0, p0, p1, p3}, Lm10;-><init>(Lb03;ZI)V

    .line 357
    .line 358
    .line 359
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 360
    .line 361
    :cond_e
    return-void
.end method

.method public static final c0(La20;Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lt00;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Liq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Liq;

    .line 7
    .line 8
    iget v1, v0, Liq;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Liq;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Liq;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lu00;-><init>(Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Liq;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Liq;->o:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Liq;->m:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p1, v0, Liq;->l:La20;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object p2, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_3

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    move-object v4, p2

    .line 46
    move-object p2, p0

    .line 47
    move-object p0, p1

    .line 48
    move-object p1, v4

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p2}, Lfg1;->V(La20;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :try_start_1
    iput-object p1, v0, Liq;->k:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p0, v0, Liq;->l:La20;

    .line 67
    .line 68
    iput-object p2, v0, Liq;->m:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, v0, Liq;->o:I

    .line 71
    .line 72
    new-instance p4, Lxt2;

    .line 73
    .line 74
    invoke-direct {p4, v0, p0}, Lxt2;-><init>(Liq;La20;)V

    .line 75
    .line 76
    .line 77
    if-nez p3, :cond_3

    .line 78
    .line 79
    invoke-static {p3, p1, p4}, Lgf1;->d0(Lmn0;Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    move-object p4, p1

    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    goto :goto_4

    .line 87
    :cond_3
    const/4 v0, 0x2

    .line 88
    invoke-static {v0, p3}, Lxe1;->f(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, p1, p4}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    goto :goto_1

    .line 96
    :goto_2
    sget-object p1, Lk20;->h:Lk20;

    .line 97
    .line 98
    if-ne p4, p1, :cond_4

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_4
    :goto_3
    invoke-static {p0, p2}, Lfg1;->M(La20;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object p4

    .line 105
    :goto_4
    invoke-static {p0, p2}, Lfg1;->M(La20;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method public static final d(Lb03;Lpx;I)V
    .locals 13

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lgo0;

    .line 3
    .line 4
    const p1, -0x5597ad88

    .line 5
    .line 6
    .line 7
    invoke-virtual {v4, p1}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x2

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v0

    .line 20
    :goto_0
    or-int/2addr p1, p2

    .line 21
    and-int/lit8 v1, p1, 0x3

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v6

    .line 30
    :goto_1
    and-int/2addr p1, v2

    .line 31
    invoke-virtual {v4, p1, v1}, Lgo0;->O(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_c

    .line 36
    .line 37
    iget-object p1, p0, Lb03;->d:Lt91;

    .line 38
    .line 39
    if-eqz p1, :cond_b

    .line 40
    .line 41
    iget-object p1, p1, Lt91;->o:Lnx1;

    .line 42
    .line 43
    invoke-virtual {p1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-ne p1, v2, :cond_b

    .line 54
    .line 55
    invoke-virtual {p0}, Lb03;->m()Lsd;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_b

    .line 60
    .line 61
    iget-object p1, p1, Lsd;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-lez p1, :cond_b

    .line 68
    .line 69
    const p1, -0x7de7ecc8

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p1}, Lgo0;->W(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v2, Lnx;->a:Leb;

    .line 84
    .line 85
    if-nez p1, :cond_2

    .line 86
    .line 87
    if-ne v1, v2, :cond_3

    .line 88
    .line 89
    :cond_2
    new-instance v1, Lxz2;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Lxz2;-><init>(Lb03;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    check-cast v1, Lkz2;

    .line 98
    .line 99
    sget-object p1, Lly;->h:Ltu2;

    .line 100
    .line 101
    invoke-virtual {v4, p1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Le70;

    .line 106
    .line 107
    iget-object v3, p0, Lb03;->b:Lus1;

    .line 108
    .line 109
    invoke-virtual {p0}, Lb03;->n()Lk03;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-wide v7, v5, Lk03;->b:J

    .line 114
    .line 115
    sget v5, Lf13;->c:I

    .line 116
    .line 117
    const/16 v5, 0x20

    .line 118
    .line 119
    shr-long/2addr v7, v5

    .line 120
    long-to-int v7, v7

    .line 121
    invoke-interface {v3, v7}, Lus1;->p(I)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    iget-object v7, p0, Lb03;->d:Lt91;

    .line 126
    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    invoke-virtual {v7}, Lt91;->d()Lz03;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 v7, 0x0

    .line 135
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v7, v7, Lz03;->a:Ly03;

    .line 139
    .line 140
    iget-object v8, v7, Ly03;->a:Lx03;

    .line 141
    .line 142
    iget-object v8, v8, Lx03;->a:Lsd;

    .line 143
    .line 144
    iget-object v8, v8, Lsd;->i:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-static {v3, v6, v8}, Lci0;->D(III)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-virtual {v7, v3}, Ly03;->c(I)Lo62;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget v7, v3, Lo62;->a:F

    .line 159
    .line 160
    const/high16 v8, 0x40000000    # 2.0f

    .line 161
    .line 162
    invoke-interface {p1, v8}, Le70;->A(F)F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    div-float/2addr p1, v8

    .line 167
    add-float/2addr p1, v7

    .line 168
    iget v3, v3, Lo62;->d:F

    .line 169
    .line 170
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    int-to-long v7, p1

    .line 175
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    int-to-long v9, p1

    .line 180
    shl-long/2addr v7, v5

    .line 181
    const-wide v11, 0xffffffffL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v9, v11

    .line 187
    or-long/2addr v7, v9

    .line 188
    invoke-virtual {v4, v7, v8}, Lgo0;->e(J)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    if-nez p1, :cond_5

    .line 197
    .line 198
    if-ne v3, v2, :cond_6

    .line 199
    .line 200
    :cond_5
    new-instance v3, Lp10;

    .line 201
    .line 202
    invoke-direct {v3, v7, v8}, Lp10;-><init>(J)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_6
    check-cast v3, Lws1;

    .line 209
    .line 210
    invoke-virtual {v4, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    invoke-virtual {v4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    or-int/2addr p1, v5

    .line 219
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    if-nez p1, :cond_7

    .line 224
    .line 225
    if-ne v5, v2, :cond_8

    .line 226
    .line 227
    :cond_7
    new-instance v5, Ls10;

    .line 228
    .line 229
    invoke-direct {v5, v1, p0}, Ls10;-><init>(Lkz2;Lb03;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 236
    .line 237
    sget-object p1, Lrh1;->a:Lrh1;

    .line 238
    .line 239
    invoke-static {p1, v1, v5}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {v4, v7, v8}, Lgo0;->e(J)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    if-nez v1, :cond_9

    .line 252
    .line 253
    if-ne v5, v2, :cond_a

    .line 254
    .line 255
    :cond_9
    new-instance v5, Lc8;

    .line 256
    .line 257
    invoke-direct {v5, v7, v8, v0}, Lc8;-><init>(JI)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_a
    check-cast v5, Lin0;

    .line 264
    .line 265
    invoke-static {p1, v6, v5}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    move-object v0, v3

    .line 270
    const-wide/16 v2, 0x0

    .line 271
    .line 272
    const/4 v5, 0x0

    .line 273
    invoke-static/range {v0 .. v5}, Le8;->a(Lws1;Luh1;JLpx;I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v6}, Lgo0;->p(Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_b
    const p1, -0x7dd3f3f6

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4, p1}, Lgo0;->W(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v6}, Lgo0;->p(Z)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_c
    invoke-virtual {v4}, Lgo0;->R()V

    .line 291
    .line 292
    .line 293
    :goto_3
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    if-eqz p1, :cond_d

    .line 298
    .line 299
    new-instance v0, Ls9;

    .line 300
    .line 301
    const/4 v1, 0x5

    .line 302
    invoke-direct {v0, p2, v1, p0}, Ls9;-><init>(IILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 306
    .line 307
    :cond_d
    return-void
.end method

.method public static d0(Lmn0;Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lt00;->f()La20;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lzd0;->h:Lzd0;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lw11;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Lv92;-><init>(Lt00;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Lx11;

    .line 19
    .line 20
    invoke-direct {v1, p2, v0}, Lu00;-><init>(Lt00;La20;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v1

    .line 24
    :goto_0
    const/4 p2, 0x2

    .line 25
    invoke-static {p2, p0}, Lxe1;->f(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, v0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final e(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLin0;Lxm0;Lxm0;Lpx;I)V
    .locals 21

    move-object/from16 v6, p2

    move-object/from16 v1, p3

    move-object/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v11, p7

    move-object/from16 v10, p8

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    move-object/from16 v12, p9

    check-cast v12, Lgo0;

    const v0, 0x2faddb9c

    invoke-virtual {v12, v0}, Lgo0;->X(I)Lgo0;

    move/from16 v13, p0

    invoke-virtual {v12, v13}, Lgo0;->g(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p10, v0

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    invoke-virtual {v12, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0x100

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v0, v2

    invoke-virtual {v12, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x800

    goto :goto_3

    :cond_3
    const/16 v2, 0x400

    :goto_3
    or-int/2addr v0, v2

    invoke-virtual {v12, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x4000

    goto :goto_4

    :cond_4
    const/16 v2, 0x2000

    :goto_4
    or-int/2addr v0, v2

    invoke-virtual {v12, v9}, Lgo0;->g(Z)Z

    move-result v2

    if-eqz v2, :cond_5

    const/high16 v2, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v2, 0x10000

    :goto_5
    or-int/2addr v0, v2

    move-object/from16 v14, p6

    invoke-virtual {v12, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/high16 v2, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v2, 0x80000

    :goto_6
    or-int/2addr v0, v2

    invoke-virtual {v12, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/high16 v2, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v2, 0x400000

    :goto_7
    or-int/2addr v0, v2

    invoke-virtual {v12, v10}, Lgo0;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/high16 v2, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v2, 0x2000000

    :goto_8
    or-int v15, v0, v2

    const v0, 0x2492493

    and-int/2addr v0, v15

    const v2, 0x2492492

    const/16 v16, 0x0

    if-eq v0, v2, :cond_9

    const/4 v0, 0x1

    goto :goto_9

    :cond_9
    move/from16 v0, v16

    :goto_9
    and-int/lit8 v2, v15, 0x1

    invoke-virtual {v12, v2, v0}, Lgo0;->O(IZ)Z

    move-result v0

    if-eqz v0, :cond_1c

    and-int/lit16 v0, v15, 0x380

    if-ne v0, v3, :cond_a

    const/4 v2, 0x1

    goto :goto_a

    :cond_a
    move/from16 v2, v16

    .line 2
    :goto_a
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v4

    .line 3
    sget-object v3, Lnx;->a:Leb;

    if-nez v2, :cond_b

    if-ne v4, v3, :cond_e

    .line 4
    :cond_b
    invoke-static {v6}, Lp7;->M(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 7
    check-cast v19, Ljava/lang/String;

    .line 8
    invoke-static/range {v19 .. v19}, Lp7;->N(Ljava/lang/String;)Lju;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 10
    :cond_d
    invoke-virtual {v12, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 11
    :cond_e
    move-object/from16 v19, v4

    check-cast v19, Ljava/util/List;

    const v2, 0xe000

    and-int/2addr v2, v15

    const/16 v4, 0x4000

    if-eq v2, v4, :cond_f

    move/from16 v2, v16

    :goto_c
    const/16 v4, 0x100

    goto :goto_d

    :cond_f
    const/4 v2, 0x1

    goto :goto_c

    :goto_d
    if-ne v0, v4, :cond_10

    const/4 v4, 0x1

    goto :goto_e

    :cond_10
    move/from16 v4, v16

    :goto_e
    or-int/2addr v2, v4

    .line 12
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_11

    if-ne v4, v3, :cond_14

    .line 13
    :cond_11
    invoke-static {v6, v8}, Lp7;->I(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 14
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_12
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 16
    check-cast v5, Ljava/lang/String;

    .line 17
    invoke-static {v5}, Lp7;->N(Ljava/lang/String;)Lju;

    move-result-object v5

    if-eqz v5, :cond_12

    .line 18
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 19
    :cond_13
    invoke-virtual {v12, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 20
    :cond_14
    move-object/from16 v20, v4

    check-cast v20, Ljava/util/List;

    .line 21
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_17

    if-nez v1, :cond_15

    move-object v2, v6

    goto :goto_10

    :cond_15
    move-object v2, v1

    .line 22
    :goto_10
    invoke-static {v2}, Lgf1;->V(Ljava/lang/String;)Lx13;

    move-result-object v2

    if-nez v2, :cond_16

    .line 23
    new-instance v2, Lx13;

    const v4, 0x3f333333    # 0.7f

    const v5, 0x3f6e147b    # 0.93f

    const/high16 v1, 0x43a50000    # 330.0f

    invoke-direct {v2, v1, v4, v5}, Lx13;-><init>(FFF)V

    .line 24
    :cond_16
    invoke-static {v2}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    move-result-object v2

    .line 25
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 26
    :cond_17
    check-cast v2, Lxk1;

    and-int/lit16 v1, v15, 0x1c00

    const/16 v4, 0x800

    if-ne v1, v4, :cond_18

    const/4 v1, 0x1

    :goto_11
    const/16 v4, 0x100

    goto :goto_12

    :cond_18
    move/from16 v1, v16

    goto :goto_11

    :goto_12
    if-ne v0, v4, :cond_19

    const/16 v16, 0x1

    :cond_19
    or-int v0, v1, v16

    .line 27
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1b

    if-ne v1, v3, :cond_1a

    goto :goto_13

    :cond_1a
    move-object v0, v1

    move-object v3, v2

    move-object v2, v6

    const/4 v6, 0x1

    move-object/from16 v1, p3

    goto :goto_14

    .line 28
    :cond_1b
    :goto_13
    new-instance v0, Lu0;

    const/4 v5, 0x5

    const/4 v4, 0x0

    move-object/from16 v1, p3

    move-object v3, v2

    move-object v2, v6

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v5}, Lu0;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 29
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 30
    :goto_14
    check-cast v0, Lmn0;

    invoke-static {v1, v2, v0, v12}, Leu;->g(Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lpx;)V

    const v0, 0x790b0154

    .line 31
    invoke-static {v0, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    move-result-object v16

    .line 32
    new-instance v0, Lge;

    invoke-direct {v0, v6, v11, v10, v9}, Lge;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    const v4, 0x6050c7f9

    invoke-static {v4, v0, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    move-result-object v17

    .line 33
    new-instance v0, Ls13;

    move-object v6, v2

    move-object v5, v7

    move-object/from16 v4, v20

    move-object v2, v1

    move-object v7, v3

    move-object v3, v14

    move-object/from16 v1, v19

    invoke-direct/range {v0 .. v7}, Ls13;-><init>(Ljava/util/List;Ljava/lang/String;Lin0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxk1;)V

    const v1, 0x5a050ff0

    invoke-static {v1, v0, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    move-result-object v0

    const/high16 v1, 0x1b0000

    and-int/lit8 v2, v15, 0xe

    or-int/2addr v1, v2

    shr-int/lit8 v2, v15, 0x12

    and-int/lit8 v2, v2, 0x70

    or-int v18, v1, v2

    const/16 v19, 0x14

    move-object/from16 v15, v17

    move-object/from16 v17, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    move v10, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v0

    .line 34
    invoke-static/range {v10 .. v19}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    goto :goto_15

    :cond_1c
    move-object/from16 v17, v12

    .line 35
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 36
    :goto_15
    invoke-virtual/range {v17 .. v17}, Lgo0;->r()Lb62;

    move-result-object v11

    if-eqz v11, :cond_1d

    new-instance v0, Lt13;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v10, p10

    move-object v5, v8

    move v6, v9

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lt13;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLin0;Lxm0;Lxm0;I)V

    .line 37
    iput-object v0, v11, Lb62;->d:Lmn0;

    :cond_1d
    return-void
.end method

.method public static final f(Lx13;Lin0;Lpx;I)V
    .locals 9

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0x3f218ffa

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, p3

    .line 20
    invoke-virtual {p2, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0x20

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v2, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr v0, v2

    .line 32
    and-int/lit8 v2, v0, 0x13

    .line 33
    .line 34
    const/16 v3, 0x12

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    move v2, v4

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/4 v2, 0x0

    .line 42
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {p2, v3, v2}, Lgo0;->O(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    new-instance v2, Lxf;

    .line 51
    .line 52
    new-instance v3, Ls;

    .line 53
    .line 54
    invoke-direct {v3, v1}, Ls;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const/high16 v5, 0x41200000    # 10.0f

    .line 58
    .line 59
    invoke-direct {v2, v5, v3}, Lxf;-><init>(FLs;)V

    .line 60
    .line 61
    .line 62
    sget-object v3, Lsn;->u:Lpk;

    .line 63
    .line 64
    const/4 v5, 0x6

    .line 65
    invoke-static {v2, v3, p2, v5}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-wide v5, p2, Lgo0;->T:J

    .line 70
    .line 71
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {p2}, Lgo0;->l()Lyy1;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    sget-object v6, Lrh1;->a:Lrh1;

    .line 80
    .line 81
    invoke-static {p2, v6}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    sget-object v7, Lhx;->c:Lgx;

    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v7, Lgx;->b:Ljy;

    .line 91
    .line 92
    invoke-virtual {p2}, Lgo0;->Z()V

    .line 93
    .line 94
    .line 95
    iget-boolean v8, p2, Lgo0;->S:Z

    .line 96
    .line 97
    if-eqz v8, :cond_3

    .line 98
    .line 99
    invoke-virtual {p2, v7}, Lgo0;->k(Lxm0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p2}, Lgo0;->i0()V

    .line 104
    .line 105
    .line 106
    :goto_3
    sget-object v7, Lgx;->e:Llc;

    .line 107
    .line 108
    invoke-static {p2, v7, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lgx;->d:Llc;

    .line 112
    .line 113
    invoke-static {p2, v2, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, Lgx;->f:Llc;

    .line 121
    .line 122
    invoke-static {p2, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v2, Lgx;->g:Lv6;

    .line 126
    .line 127
    invoke-static {p2, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 128
    .line 129
    .line 130
    sget-object v2, Lgx;->c:Llc;

    .line 131
    .line 132
    invoke-static {p2, v2, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    and-int/lit8 v0, v0, 0x7e

    .line 136
    .line 137
    invoke-static {p0, p1, p2, v0}, Lgf1;->k(Lx13;Lin0;Lpx;I)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, p1, p2, v0}, Lgf1;->j(Lx13;Lin0;Lpx;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v4}, Lgo0;->p(Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_4
    invoke-virtual {p2}, Lgo0;->R()V

    .line 148
    .line 149
    .line 150
    :goto_4
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    if-eqz p2, :cond_5

    .line 155
    .line 156
    new-instance v0, Lr13;

    .line 157
    .line 158
    invoke-direct {v0, p0, p1, p3, v1}, Lr13;-><init>(Lx13;Lin0;II)V

    .line 159
    .line 160
    .line 161
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 162
    .line 163
    :cond_5
    return-void
.end method

.method public static final g(Ljava/lang/String;Lpx;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v10, p2

    .line 4
    .line 5
    move-object/from16 v7, p1

    .line 6
    .line 7
    check-cast v7, Lgo0;

    .line 8
    .line 9
    const v1, 0x1fb635c

    .line 10
    .line 11
    .line 12
    invoke-virtual {v7, v1}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_0
    or-int/2addr v1, v10

    .line 26
    and-int/lit8 v3, v1, 0x3

    .line 27
    .line 28
    if-eq v3, v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_1
    and-int/lit8 v3, v1, 0x1

    .line 34
    .line 35
    invoke-virtual {v7, v3, v2}, Lgo0;->O(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    sget-object v2, Lur1;->a:Ltu2;

    .line 42
    .line 43
    invoke-virtual {v7, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Llp1;

    .line 48
    .line 49
    iget-wide v12, v2, Llp1;->e:J

    .line 50
    .line 51
    const/16 v2, 0xd

    .line 52
    .line 53
    invoke-static {v2}, Lrg3;->D(I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v14

    .line 57
    const/16 v2, 0x12

    .line 58
    .line 59
    invoke-static {v2}, Lrg3;->D(I)J

    .line 60
    .line 61
    .line 62
    move-result-wide v20

    .line 63
    sget-object v16, Lim0;->l:Lim0;

    .line 64
    .line 65
    new-instance v2, Lm13;

    .line 66
    .line 67
    const/16 v23, 0x0

    .line 68
    .line 69
    const v24, 0xfdfff8

    .line 70
    .line 71
    .line 72
    const-wide/16 v17, 0x0

    .line 73
    .line 74
    const/16 v19, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    move-object v11, v2

    .line 79
    invoke-direct/range {v11 .. v24}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 80
    .line 81
    .line 82
    and-int/lit8 v8, v1, 0xe

    .line 83
    .line 84
    const/16 v9, 0x3fa

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 92
    .line 93
    .line 94
    sget-object v1, Lrh1;->a:Lrh1;

    .line 95
    .line 96
    const/high16 v2, 0x41000000    # 8.0f

    .line 97
    .line 98
    invoke-static {v1, v2}, Lte;->O(Luh1;F)Luh1;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v7, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    invoke-virtual {v7}, Lgo0;->R()V

    .line 107
    .line 108
    .line 109
    :goto_2
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    new-instance v2, Ln0;

    .line 116
    .line 117
    const/16 v3, 0xc

    .line 118
    .line 119
    invoke-direct {v2, v0, v10, v3}, Ln0;-><init>(Ljava/lang/String;II)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 123
    .line 124
    :cond_3
    return-void
.end method

.method public static final h(Lju;Luh1;ZFLxm0;Lpx;II)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v9, p5

    .line 6
    .line 7
    check-cast v9, Lgo0;

    .line 8
    .line 9
    const v0, 0xa0abc82

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p6, v0

    .line 25
    .line 26
    or-int/lit8 v2, v0, 0x30

    .line 27
    .line 28
    and-int/lit8 v3, p7, 0x4

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    or-int/lit16 v0, v0, 0x1b0

    .line 33
    .line 34
    move v2, v0

    .line 35
    move/from16 v0, p2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    move/from16 v0, p2

    .line 39
    .line 40
    invoke-virtual {v9, v0}, Lgo0;->g(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x100

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/16 v5, 0x80

    .line 50
    .line 51
    :goto_1
    or-int/2addr v2, v5

    .line 52
    :goto_2
    and-int/lit8 v5, p7, 0x10

    .line 53
    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    or-int/lit16 v2, v2, 0x6000

    .line 57
    .line 58
    move-object/from16 v6, p4

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    move-object/from16 v6, p4

    .line 62
    .line 63
    invoke-virtual {v9, v6}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_4

    .line 68
    .line 69
    const/16 v7, 0x4000

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 v7, 0x2000

    .line 73
    .line 74
    :goto_3
    or-int/2addr v2, v7

    .line 75
    :goto_4
    and-int/lit16 v7, v2, 0x2493

    .line 76
    .line 77
    const/16 v8, 0x2492

    .line 78
    .line 79
    const/4 v15, 0x1

    .line 80
    const/4 v11, 0x0

    .line 81
    if-eq v7, v8, :cond_5

    .line 82
    .line 83
    move v7, v15

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move v7, v11

    .line 86
    :goto_5
    and-int/2addr v2, v15

    .line 87
    invoke-virtual {v9, v2, v7}, Lgo0;->O(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_15

    .line 92
    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    move v0, v11

    .line 96
    :cond_6
    if-eqz v5, :cond_7

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    goto :goto_6

    .line 100
    :cond_7
    move-object v2, v6

    .line 101
    :goto_6
    const/high16 v3, 0x41200000    # 10.0f

    .line 102
    .line 103
    invoke-static {v3}, Lgb2;->a(F)Lfb2;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    sget-object v12, Lrh1;->a:Lrh1;

    .line 108
    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    invoke-static {v12, v2}, Ltl;->O(Luh1;Lxm0;)Luh1;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    goto :goto_7

    .line 116
    :cond_8
    move-object v5, v12

    .line 117
    :goto_7
    invoke-static {v12, v4}, Lte;->g0(Luh1;F)Luh1;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v6, v3}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-nez v1, :cond_9

    .line 126
    .line 127
    const v7, -0x4db220b7

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v7}, Lgo0;->W(I)V

    .line 131
    .line 132
    .line 133
    sget-object v7, Lur1;->a:Ltu2;

    .line 134
    .line 135
    invoke-virtual {v9, v7}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Llp1;

    .line 140
    .line 141
    iget-wide v7, v7, Llp1;->c:J

    .line 142
    .line 143
    invoke-virtual {v9, v11}, Lgo0;->p(Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_9
    const v7, -0x4db223dd

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v7}, Lgo0;->W(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v11}, Lgo0;->p(Z)V

    .line 154
    .line 155
    .line 156
    iget-wide v7, v1, Lju;->a:J

    .line 157
    .line 158
    :goto_8
    sget-object v10, Lsp0;->h:Liu0;

    .line 159
    .line 160
    invoke-static {v6, v7, v8, v10}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    const/high16 v8, 0x40000000    # 2.0f

    .line 167
    .line 168
    goto :goto_9

    .line 169
    :cond_a
    const/high16 v8, 0x3f800000    # 1.0f

    .line 170
    .line 171
    :goto_9
    if-eqz v0, :cond_b

    .line 172
    .line 173
    const v10, -0x68901604

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9, v10}, Lgo0;->W(I)V

    .line 177
    .line 178
    .line 179
    sget-object v10, Lur1;->a:Ltu2;

    .line 180
    .line 181
    invoke-virtual {v9, v10}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    check-cast v10, Llp1;

    .line 186
    .line 187
    iget-wide v13, v10, Llp1;->e:J

    .line 188
    .line 189
    invoke-virtual {v9, v11}, Lgo0;->p(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_a

    .line 193
    :cond_b
    if-nez v1, :cond_c

    .line 194
    .line 195
    const v10, -0x688eae3f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v10}, Lgo0;->W(I)V

    .line 199
    .line 200
    .line 201
    sget-object v10, Lur1;->a:Ltu2;

    .line 202
    .line 203
    invoke-virtual {v9, v10}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    check-cast v10, Llp1;

    .line 208
    .line 209
    iget-wide v13, v10, Llp1;->d:J

    .line 210
    .line 211
    invoke-virtual {v9, v11}, Lgo0;->p(Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_c
    const v10, -0x688d9f9a

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9, v10}, Lgo0;->W(I)V

    .line 219
    .line 220
    .line 221
    sget-object v10, Lur1;->a:Ltu2;

    .line 222
    .line 223
    invoke-virtual {v9, v10}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    check-cast v10, Llp1;

    .line 228
    .line 229
    iget-wide v13, v10, Llp1;->f:J

    .line 230
    .line 231
    const v10, 0x3e3851ec    # 0.18f

    .line 232
    .line 233
    .line 234
    invoke-static {v10, v13, v14}, Lju;->b(FJ)J

    .line 235
    .line 236
    .line 237
    move-result-wide v13

    .line 238
    invoke-virtual {v9, v11}, Lgo0;->p(Z)V

    .line 239
    .line 240
    .line 241
    :goto_a
    new-instance v10, Lft2;

    .line 242
    .line 243
    invoke-direct {v10, v13, v14}, Lft2;-><init>(J)V

    .line 244
    .line 245
    .line 246
    new-instance v13, Lrl;

    .line 247
    .line 248
    invoke-direct {v13, v8, v10, v3}, Lrl;-><init>(FLft2;Leq2;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v6, v13}, Luh1;->c(Luh1;)Luh1;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-interface {v3, v5}, Luh1;->c(Luh1;)Luh1;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    sget-object v5, Lsn;->n:Lrk;

    .line 260
    .line 261
    invoke-static {v5, v11}, Ldm;->d(Lr5;Z)Lnf1;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    iget-wide v13, v9, Lgo0;->T:J

    .line 266
    .line 267
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    invoke-virtual {v9}, Lgo0;->l()Lyy1;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-static {v9, v3}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    sget-object v10, Lhx;->c:Lgx;

    .line 280
    .line 281
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    sget-object v10, Lgx;->b:Ljy;

    .line 285
    .line 286
    invoke-virtual {v9}, Lgo0;->Z()V

    .line 287
    .line 288
    .line 289
    iget-boolean v13, v9, Lgo0;->S:Z

    .line 290
    .line 291
    if-eqz v13, :cond_d

    .line 292
    .line 293
    invoke-virtual {v9, v10}, Lgo0;->k(Lxm0;)V

    .line 294
    .line 295
    .line 296
    goto :goto_b

    .line 297
    :cond_d
    invoke-virtual {v9}, Lgo0;->i0()V

    .line 298
    .line 299
    .line 300
    :goto_b
    sget-object v10, Lgx;->e:Llc;

    .line 301
    .line 302
    invoke-static {v9, v10, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v5, Lgx;->d:Llc;

    .line 306
    .line 307
    invoke-static {v9, v5, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    sget-object v6, Lgx;->f:Llc;

    .line 315
    .line 316
    invoke-static {v9, v6, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object v5, Lgx;->g:Lv6;

    .line 320
    .line 321
    invoke-static {v9, v5}, Lyf3;->b(Lpx;Lin0;)V

    .line 322
    .line 323
    .line 324
    sget-object v5, Lgx;->c:Llc;

    .line 325
    .line 326
    invoke-static {v9, v5, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    if-eqz v0, :cond_13

    .line 330
    .line 331
    if-eqz v1, :cond_13

    .line 332
    .line 333
    const v3, 0x4b3847c3    # 1.2076995E7f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v3}, Lgo0;->W(I)V

    .line 337
    .line 338
    .line 339
    sget-object v3, Lse;->f:Lsx0;

    .line 340
    .line 341
    if-eqz v3, :cond_e

    .line 342
    .line 343
    :goto_c
    move-object v5, v3

    .line 344
    goto/16 :goto_d

    .line 345
    .line 346
    :cond_e
    new-instance v16, Lrx0;

    .line 347
    .line 348
    const/16 v24, 0x0

    .line 349
    .line 350
    const/16 v26, 0x60

    .line 351
    .line 352
    const-string v17, "Filled.Check"

    .line 353
    .line 354
    const/high16 v18, 0x41c00000    # 24.0f

    .line 355
    .line 356
    const/high16 v19, 0x41c00000    # 24.0f

    .line 357
    .line 358
    const/high16 v20, 0x41c00000    # 24.0f

    .line 359
    .line 360
    const/high16 v21, 0x41c00000    # 24.0f

    .line 361
    .line 362
    const-wide/16 v22, 0x0

    .line 363
    .line 364
    const/16 v25, 0x0

    .line 365
    .line 366
    invoke-direct/range {v16 .. v26}, Lrx0;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 367
    .line 368
    .line 369
    move-object/from16 v3, v16

    .line 370
    .line 371
    sget v5, Ls93;->a:I

    .line 372
    .line 373
    new-instance v5, Lft2;

    .line 374
    .line 375
    sget-wide v13, Lju;->b:J

    .line 376
    .line 377
    invoke-direct {v5, v13, v14}, Lft2;-><init>(J)V

    .line 378
    .line 379
    .line 380
    new-instance v6, Ljava/util/ArrayList;

    .line 381
    .line 382
    const/16 v8, 0x20

    .line 383
    .line 384
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 385
    .line 386
    .line 387
    new-instance v8, Lcy1;

    .line 388
    .line 389
    const/high16 v10, 0x41100000    # 9.0f

    .line 390
    .line 391
    const v13, 0x41815c29    # 16.17f

    .line 392
    .line 393
    .line 394
    invoke-direct {v8, v10, v13}, Lcy1;-><init>(FF)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    new-instance v8, Lby1;

    .line 401
    .line 402
    const v13, 0x409a8f5c    # 4.83f

    .line 403
    .line 404
    .line 405
    const/high16 v14, 0x41400000    # 12.0f

    .line 406
    .line 407
    invoke-direct {v8, v13, v14}, Lby1;-><init>(FF)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    new-instance v8, Ljy1;

    .line 414
    .line 415
    const v13, -0x404a3d71    # -1.42f

    .line 416
    .line 417
    .line 418
    const v14, 0x3fb47ae1    # 1.41f

    .line 419
    .line 420
    .line 421
    invoke-direct {v8, v13, v14}, Ljy1;-><init>(FF)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    new-instance v8, Lby1;

    .line 428
    .line 429
    const/high16 v13, 0x41980000    # 19.0f

    .line 430
    .line 431
    invoke-direct {v8, v10, v13}, Lby1;-><init>(FF)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    new-instance v8, Lby1;

    .line 438
    .line 439
    const/high16 v10, 0x41a80000    # 21.0f

    .line 440
    .line 441
    const/high16 v13, 0x40e00000    # 7.0f

    .line 442
    .line 443
    invoke-direct {v8, v10, v13}, Lby1;-><init>(FF)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    new-instance v8, Ljy1;

    .line 450
    .line 451
    const v10, -0x404b851f    # -1.41f

    .line 452
    .line 453
    .line 454
    invoke-direct {v8, v10, v10}, Ljy1;-><init>(FF)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    sget-object v8, Lyx1;->c:Lyx1;

    .line 461
    .line 462
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    invoke-static {v3, v6, v5}, Lrx0;->a(Lrx0;Ljava/util/ArrayList;Lft2;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3}, Lrx0;->b()Lsx0;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    sput-object v3, Lse;->f:Lsx0;

    .line 473
    .line 474
    goto/16 :goto_c

    .line 475
    .line 476
    :goto_d
    const v3, 0x3f051eb8    # 0.52f

    .line 477
    .line 478
    .line 479
    mul-float/2addr v3, v4

    .line 480
    invoke-static {v12, v3}, Lte;->g0(Luh1;F)Luh1;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    iget-wide v13, v1, Lju;->a:J

    .line 485
    .line 486
    invoke-static {v13, v14}, Lju;->f(J)Lsu;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    const/high16 p1, 0x3f800000    # 1.0f

    .line 491
    .line 492
    iget-wide v7, v3, Lsu;->b:J

    .line 493
    .line 494
    move-object/from16 p2, v12

    .line 495
    .line 496
    const-wide v11, 0x300000000L

    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    invoke-static {v7, v8, v11, v12}, Ltp0;->s(JJ)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-nez v7, :cond_f

    .line 506
    .line 507
    new-instance v7, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    const-string v8, "The specified color must be encoded in an RGB color space. The supplied color space is "

    .line 510
    .line 511
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    iget-wide v10, v3, Lsu;->b:J

    .line 515
    .line 516
    invoke-static {v10, v11}, Ltp0;->Q(J)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v7

    .line 527
    invoke-static {v7}, Ljz0;->a(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :cond_f
    check-cast v3, Lka2;

    .line 531
    .line 532
    iget-object v3, v3, Lka2;->p:Lga2;

    .line 533
    .line 534
    invoke-static {v13, v14}, Lju;->h(J)F

    .line 535
    .line 536
    .line 537
    move-result v7

    .line 538
    float-to-double v7, v7

    .line 539
    invoke-virtual {v3, v7, v8}, Lga2;->e(D)D

    .line 540
    .line 541
    .line 542
    move-result-wide v7

    .line 543
    invoke-static {v13, v14}, Lju;->g(J)F

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    float-to-double v10, v10

    .line 548
    invoke-virtual {v3, v10, v11}, Lga2;->e(D)D

    .line 549
    .line 550
    .line 551
    move-result-wide v10

    .line 552
    invoke-static {v13, v14}, Lju;->e(J)F

    .line 553
    .line 554
    .line 555
    move-result v12

    .line 556
    float-to-double v12, v12

    .line 557
    invoke-virtual {v3, v12, v13}, Lga2;->e(D)D

    .line 558
    .line 559
    .line 560
    move-result-wide v12

    .line 561
    const-wide v16, 0x3fcb367a0f9096bcL    # 0.2126

    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    mul-double v7, v7, v16

    .line 567
    .line 568
    const-wide v16, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    mul-double v10, v10, v16

    .line 574
    .line 575
    add-double/2addr v10, v7

    .line 576
    const-wide v7, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    mul-double/2addr v12, v7

    .line 582
    add-double/2addr v12, v10

    .line 583
    double-to-float v3, v12

    .line 584
    const/4 v7, 0x0

    .line 585
    cmpg-float v8, v3, v7

    .line 586
    .line 587
    if-gez v8, :cond_10

    .line 588
    .line 589
    move v3, v7

    .line 590
    :cond_10
    cmpl-float v7, v3, p1

    .line 591
    .line 592
    if-lez v7, :cond_11

    .line 593
    .line 594
    move/from16 v7, p1

    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_11
    move v7, v3

    .line 598
    :goto_e
    const v3, 0x3f147ae1    # 0.58f

    .line 599
    .line 600
    .line 601
    cmpl-float v3, v7, v3

    .line 602
    .line 603
    if-lez v3, :cond_12

    .line 604
    .line 605
    sget-wide v7, Lju;->b:J

    .line 606
    .line 607
    const v3, 0x3f3851ec    # 0.72f

    .line 608
    .line 609
    .line 610
    invoke-static {v3, v7, v8}, Lju;->b(FJ)J

    .line 611
    .line 612
    .line 613
    move-result-wide v7

    .line 614
    goto :goto_f

    .line 615
    :cond_12
    sget-wide v7, Lju;->c:J

    .line 616
    .line 617
    :goto_f
    const/16 v10, 0x30

    .line 618
    .line 619
    invoke-static/range {v5 .. v10}, Lfx0;->a(Lsx0;Luh1;JLpx;I)V

    .line 620
    .line 621
    .line 622
    const/4 v3, 0x0

    .line 623
    invoke-virtual {v9, v3}, Lgo0;->p(Z)V

    .line 624
    .line 625
    .line 626
    move-object/from16 v16, p2

    .line 627
    .line 628
    goto :goto_10

    .line 629
    :cond_13
    move v3, v11

    .line 630
    move-object/from16 p2, v12

    .line 631
    .line 632
    if-nez v1, :cond_14

    .line 633
    .line 634
    const v5, 0x4b3f0a8e    # 1.2520078E7f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v9, v5}, Lgo0;->W(I)V

    .line 638
    .line 639
    .line 640
    new-instance v16, Lm13;

    .line 641
    .line 642
    sget-object v5, Lur1;->a:Ltu2;

    .line 643
    .line 644
    invoke-virtual {v9, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v5

    .line 648
    check-cast v5, Llp1;

    .line 649
    .line 650
    iget-wide v5, v5, Llp1;->f:J

    .line 651
    .line 652
    const/16 v7, 0x10

    .line 653
    .line 654
    invoke-static {v7}, Lrg3;->D(I)J

    .line 655
    .line 656
    .line 657
    move-result-wide v19

    .line 658
    sget-object v21, Lim0;->m:Lim0;

    .line 659
    .line 660
    const/16 v28, 0x0

    .line 661
    .line 662
    const v29, 0xfffff8

    .line 663
    .line 664
    .line 665
    const-wide/16 v22, 0x0

    .line 666
    .line 667
    const/16 v24, 0x0

    .line 668
    .line 669
    const-wide/16 v25, 0x0

    .line 670
    .line 671
    const/16 v27, 0x0

    .line 672
    .line 673
    move-wide/from16 v17, v5

    .line 674
    .line 675
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 676
    .line 677
    .line 678
    const/4 v13, 0x6

    .line 679
    const/16 v14, 0x3fa

    .line 680
    .line 681
    const-string v5, "!"

    .line 682
    .line 683
    const/4 v6, 0x0

    .line 684
    const/4 v8, 0x0

    .line 685
    move-object v12, v9

    .line 686
    const/4 v9, 0x0

    .line 687
    const/4 v10, 0x0

    .line 688
    const/4 v11, 0x0

    .line 689
    move-object/from16 v7, v16

    .line 690
    .line 691
    move-object/from16 v16, p2

    .line 692
    .line 693
    invoke-static/range {v5 .. v14}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 694
    .line 695
    .line 696
    move-object v9, v12

    .line 697
    invoke-virtual {v9, v3}, Lgo0;->p(Z)V

    .line 698
    .line 699
    .line 700
    goto :goto_10

    .line 701
    :cond_14
    move-object/from16 v16, p2

    .line 702
    .line 703
    const v5, 0x4b43c486    # 1.282983E7f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v9, v5}, Lgo0;->W(I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v9, v3}, Lgo0;->p(Z)V

    .line 710
    .line 711
    .line 712
    :goto_10
    invoke-virtual {v9, v15}, Lgo0;->p(Z)V

    .line 713
    .line 714
    .line 715
    move-object v5, v2

    .line 716
    move-object/from16 v2, v16

    .line 717
    .line 718
    :goto_11
    move v3, v0

    .line 719
    goto :goto_12

    .line 720
    :cond_15
    invoke-virtual {v9}, Lgo0;->R()V

    .line 721
    .line 722
    .line 723
    move-object/from16 v2, p1

    .line 724
    .line 725
    move-object v5, v6

    .line 726
    goto :goto_11

    .line 727
    :goto_12
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    if-eqz v8, :cond_16

    .line 732
    .line 733
    new-instance v0, Lu13;

    .line 734
    .line 735
    move/from16 v6, p6

    .line 736
    .line 737
    move/from16 v7, p7

    .line 738
    .line 739
    invoke-direct/range {v0 .. v7}, Lu13;-><init>(Lju;Luh1;ZFLxm0;II)V

    .line 740
    .line 741
    .line 742
    iput-object v0, v8, Lb62;->d:Lmn0;

    .line 743
    .line 744
    :cond_16
    return-void
.end method

.method public static final i(Ljava/util/List;Ljava/lang/String;Lin0;Lpx;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v9, p3

    .line 10
    .line 11
    check-cast v9, Lgo0;

    .line 12
    .line 13
    const v4, 0x7439204c

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v4}, Lgo0;->X(I)Lgo0;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v9, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v12, 0x2

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v12

    .line 29
    :goto_0
    or-int/2addr v4, v3

    .line 30
    invoke-virtual {v9, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v5, 0x10

    .line 40
    .line 41
    :goto_1
    or-int/2addr v4, v5

    .line 42
    invoke-virtual {v9, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x100

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x80

    .line 52
    .line 53
    :goto_2
    or-int v14, v4, v5

    .line 54
    .line 55
    and-int/lit16 v4, v14, 0x93

    .line 56
    .line 57
    const/16 v5, 0x92

    .line 58
    .line 59
    if-eq v4, v5, :cond_3

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/4 v4, 0x0

    .line 64
    :goto_3
    and-int/lit8 v5, v14, 0x1

    .line 65
    .line 66
    invoke-virtual {v9, v5, v4}, Lgo0;->O(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_d

    .line 71
    .line 72
    new-instance v4, Lxf;

    .line 73
    .line 74
    new-instance v5, Ls;

    .line 75
    .line 76
    invoke-direct {v5, v12}, Ls;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const/high16 v7, 0x41000000    # 8.0f

    .line 80
    .line 81
    invoke-direct {v4, v7, v5}, Lxf;-><init>(FLs;)V

    .line 82
    .line 83
    .line 84
    sget-object v5, Lsn;->u:Lpk;

    .line 85
    .line 86
    const/4 v8, 0x6

    .line 87
    invoke-static {v4, v5, v9, v8}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-wide v10, v9, Lgo0;->T:J

    .line 92
    .line 93
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {v9}, Lgo0;->l()Lyy1;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    sget-object v11, Lrh1;->a:Lrh1;

    .line 102
    .line 103
    invoke-static {v9, v11}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    sget-object v16, Lhx;->c:Lgx;

    .line 108
    .line 109
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    sget-object v6, Lgx;->b:Ljy;

    .line 113
    .line 114
    invoke-virtual {v9}, Lgo0;->Z()V

    .line 115
    .line 116
    .line 117
    iget-boolean v13, v9, Lgo0;->S:Z

    .line 118
    .line 119
    if-eqz v13, :cond_4

    .line 120
    .line 121
    invoke-virtual {v9, v6}, Lgo0;->k(Lxm0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    invoke-virtual {v9}, Lgo0;->i0()V

    .line 126
    .line 127
    .line 128
    :goto_4
    sget-object v6, Lgx;->e:Llc;

    .line 129
    .line 130
    invoke-static {v9, v6, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object v4, Lgx;->d:Llc;

    .line 134
    .line 135
    invoke-static {v9, v4, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v5, Lgx;->f:Llc;

    .line 143
    .line 144
    invoke-static {v9, v5, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object v4, Lgx;->g:Lv6;

    .line 148
    .line 149
    invoke-static {v9, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 150
    .line 151
    .line 152
    sget-object v4, Lgx;->c:Llc;

    .line 153
    .line 154
    invoke-static {v9, v4, v15}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const v4, -0x3799eb6c

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v4}, Lgo0;->W(I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v8, v0}, Ldu;->l0(ILjava/util/List;)Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_c

    .line 176
    .line 177
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, Ljava/util/List;

    .line 182
    .line 183
    new-instance v5, Lxf;

    .line 184
    .line 185
    new-instance v6, Ls;

    .line 186
    .line 187
    invoke-direct {v6, v12}, Ls;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v5, v7, v6}, Lxf;-><init>(FLs;)V

    .line 191
    .line 192
    .line 193
    sget-object v6, Lsn;->t:Lqk;

    .line 194
    .line 195
    const/16 v8, 0x36

    .line 196
    .line 197
    invoke-static {v5, v6, v9, v8}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    iget-wide v7, v9, Lgo0;->T:J

    .line 202
    .line 203
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    invoke-virtual {v9}, Lgo0;->l()Lyy1;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-static {v9, v11}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    sget-object v15, Lhx;->c:Lgx;

    .line 216
    .line 217
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    sget-object v15, Lgx;->b:Ljy;

    .line 221
    .line 222
    invoke-virtual {v9}, Lgo0;->Z()V

    .line 223
    .line 224
    .line 225
    iget-boolean v6, v9, Lgo0;->S:Z

    .line 226
    .line 227
    if-eqz v6, :cond_5

    .line 228
    .line 229
    invoke-virtual {v9, v15}, Lgo0;->k(Lxm0;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_5
    invoke-virtual {v9}, Lgo0;->i0()V

    .line 234
    .line 235
    .line 236
    :goto_6
    sget-object v6, Lgx;->e:Llc;

    .line 237
    .line 238
    invoke-static {v9, v6, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    sget-object v5, Lgx;->d:Llc;

    .line 242
    .line 243
    invoke-static {v9, v5, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    sget-object v6, Lgx;->f:Llc;

    .line 251
    .line 252
    invoke-static {v9, v6, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    sget-object v5, Lgx;->g:Lv6;

    .line 256
    .line 257
    invoke-static {v9, v5}, Lyf3;->b(Lpx;Lin0;)V

    .line 258
    .line 259
    .line 260
    sget-object v5, Lgx;->c:Llc;

    .line 261
    .line 262
    invoke-static {v9, v5, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    const v5, -0x1230932

    .line 266
    .line 267
    .line 268
    invoke-virtual {v9, v5}, Lgo0;->W(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    :goto_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_b

    .line 280
    .line 281
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Lju;

    .line 286
    .line 287
    iget-wide v4, v4, Lju;->a:J

    .line 288
    .line 289
    invoke-virtual {v9, v4, v5}, Lgo0;->e(J)Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    sget-object v8, Lnx;->a:Leb;

    .line 298
    .line 299
    if-nez v6, :cond_6

    .line 300
    .line 301
    if-ne v7, v8, :cond_7

    .line 302
    .line 303
    :cond_6
    invoke-static {v4, v5}, Lp7;->O(J)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v9, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_7
    check-cast v7, Ljava/lang/String;

    .line 311
    .line 312
    new-instance v6, Lju;

    .line 313
    .line 314
    invoke-direct {v6, v4, v5}, Lju;-><init>(J)V

    .line 315
    .line 316
    .line 317
    move-object v4, v6

    .line 318
    invoke-static {v7, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    and-int/lit16 v5, v14, 0x380

    .line 323
    .line 324
    const/16 v10, 0x100

    .line 325
    .line 326
    if-ne v5, v10, :cond_8

    .line 327
    .line 328
    const/4 v5, 0x1

    .line 329
    goto :goto_8

    .line 330
    :cond_8
    const/4 v5, 0x0

    .line 331
    :goto_8
    invoke-virtual {v9, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v17

    .line 335
    or-int v5, v5, v17

    .line 336
    .line 337
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    if-nez v5, :cond_a

    .line 342
    .line 343
    if-ne v10, v8, :cond_9

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_9
    const/4 v5, 0x1

    .line 347
    goto :goto_a

    .line 348
    :cond_a
    :goto_9
    new-instance v10, Lbu1;

    .line 349
    .line 350
    const/4 v5, 0x1

    .line 351
    invoke-direct {v10, v2, v7, v5}, Lbu1;-><init>(Lin0;Ljava/lang/String;I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :goto_a
    move-object v8, v10

    .line 358
    check-cast v8, Lxm0;

    .line 359
    .line 360
    const/16 v10, 0xc00

    .line 361
    .line 362
    move-object v7, v11

    .line 363
    const/4 v11, 0x2

    .line 364
    move/from16 v16, v5

    .line 365
    .line 366
    const/4 v5, 0x0

    .line 367
    move-object/from16 v19, v7

    .line 368
    .line 369
    const/high16 v7, 0x42080000    # 34.0f

    .line 370
    .line 371
    move/from16 v12, v16

    .line 372
    .line 373
    const/16 v17, 0x100

    .line 374
    .line 375
    const/high16 v18, 0x41000000    # 8.0f

    .line 376
    .line 377
    invoke-static/range {v4 .. v11}, Lgf1;->h(Lju;Luh1;ZFLxm0;Lpx;II)V

    .line 378
    .line 379
    .line 380
    move-object/from16 v11, v19

    .line 381
    .line 382
    const/4 v12, 0x2

    .line 383
    goto :goto_7

    .line 384
    :cond_b
    move-object/from16 v19, v11

    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    const/4 v12, 0x1

    .line 388
    const/16 v17, 0x100

    .line 389
    .line 390
    const/high16 v18, 0x41000000    # 8.0f

    .line 391
    .line 392
    invoke-virtual {v9, v4}, Lgo0;->p(Z)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v9, v12}, Lgo0;->p(Z)V

    .line 396
    .line 397
    .line 398
    move/from16 v7, v18

    .line 399
    .line 400
    const/4 v12, 0x2

    .line 401
    goto/16 :goto_5

    .line 402
    .line 403
    :cond_c
    const/4 v4, 0x0

    .line 404
    const/4 v12, 0x1

    .line 405
    invoke-virtual {v9, v4}, Lgo0;->p(Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v9, v12}, Lgo0;->p(Z)V

    .line 409
    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_d
    invoke-virtual {v9}, Lgo0;->R()V

    .line 413
    .line 414
    .line 415
    :goto_b
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    if-eqz v4, :cond_e

    .line 420
    .line 421
    new-instance v5, Ltt0;

    .line 422
    .line 423
    invoke-direct {v5, v0, v1, v2, v3}, Ltt0;-><init>(Ljava/util/List;Ljava/lang/String;Lin0;I)V

    .line 424
    .line 425
    .line 426
    iput-object v5, v4, Lb62;->d:Lmn0;

    .line 427
    .line 428
    :cond_e
    return-void
.end method

.method public static final j(Lx13;Lin0;Lpx;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Lgo0;

    .line 10
    .line 11
    const v4, -0x7f22229e

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v4}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v4, 0x2

    .line 26
    :goto_0
    or-int/2addr v4, v2

    .line 27
    invoke-virtual {v3, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_1

    .line 32
    .line 33
    const/16 v7, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v7, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v4, v7

    .line 39
    and-int/lit8 v7, v4, 0x13

    .line 40
    .line 41
    const/16 v8, 0x12

    .line 42
    .line 43
    const/4 v10, 0x1

    .line 44
    if-eq v7, v8, :cond_2

    .line 45
    .line 46
    move v7, v10

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v7, 0x0

    .line 49
    :goto_2
    and-int/lit8 v8, v4, 0x1

    .line 50
    .line 51
    invoke-virtual {v3, v8, v7}, Lgo0;->O(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_e

    .line 56
    .line 57
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    sget-object v8, Lnx;->a:Leb;

    .line 62
    .line 63
    if-ne v7, v8, :cond_3

    .line 64
    .line 65
    new-instance v7, Lh11;

    .line 66
    .line 67
    const-wide/16 v11, 0x0

    .line 68
    .line 69
    invoke-direct {v7, v11, v12}, Lh11;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-static {v7}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v3, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    check-cast v7, Lxk1;

    .line 80
    .line 81
    and-int/lit8 v4, v4, 0xe

    .line 82
    .line 83
    invoke-static {v0, v3}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-static {v1, v3}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    const/4 v14, 0x0

    .line 96
    const/high16 v15, 0x3f800000    # 1.0f

    .line 97
    .line 98
    if-ne v13, v8, :cond_5

    .line 99
    .line 100
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    const/high16 v13, 0x42700000    # 60.0f

    .line 105
    .line 106
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v17

    .line 110
    const/high16 v13, 0x42f00000    # 120.0f

    .line 111
    .line 112
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v18

    .line 116
    const/high16 v13, 0x43340000    # 180.0f

    .line 117
    .line 118
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object v19

    .line 122
    const/high16 v13, 0x43700000    # 240.0f

    .line 123
    .line 124
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object v20

    .line 128
    const/high16 v13, 0x43960000    # 300.0f

    .line 129
    .line 130
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 131
    .line 132
    .line 133
    move-result-object v21

    .line 134
    const v13, 0x43b3ffdf    # 359.999f

    .line 135
    .line 136
    .line 137
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object v22

    .line 141
    filled-new-array/range {v16 .. v22}, [Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v16

    .line 145
    const/16 p2, 0x2

    .line 146
    .line 147
    invoke-static/range {v16 .. v16}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    new-instance v6, Ljava/util/ArrayList;

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const/16 v9, 0xa

    .line 156
    .line 157
    invoke-static {v5, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_4

    .line 173
    .line 174
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    check-cast v9, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    invoke-static {v9, v14, v13}, Lci0;->C(FFF)F

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-static {v15, v14, v15}, Lci0;->C(FFF)F

    .line 189
    .line 190
    .line 191
    move-result v18

    .line 192
    invoke-static {v15, v14, v15}, Lci0;->C(FFF)F

    .line 193
    .line 194
    .line 195
    move-result v19

    .line 196
    const/4 v13, 0x3

    .line 197
    new-array v13, v13, [F

    .line 198
    .line 199
    aput v9, v13, v17

    .line 200
    .line 201
    aput v18, v13, v10

    .line 202
    .line 203
    aput v19, v13, p2

    .line 204
    .line 205
    invoke-static {v13}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    move-object/from16 v19, v11

    .line 210
    .line 211
    invoke-static {v9}, Lsp0;->b(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide v10

    .line 215
    new-instance v9, Lju;

    .line 216
    .line 217
    invoke-direct {v9, v10, v11}, Lju;-><init>(J)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-object/from16 v11, v19

    .line 224
    .line 225
    const/4 v10, 0x1

    .line 226
    const v13, 0x43b3ffdf    # 359.999f

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_4
    move-object/from16 v19, v11

    .line 231
    .line 232
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move-object v13, v6

    .line 236
    goto :goto_4

    .line 237
    :cond_5
    move-object/from16 v19, v11

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    :goto_4
    check-cast v13, Ljava/util/List;

    .line 242
    .line 243
    iget v5, v0, Lx13;->a:F

    .line 244
    .line 245
    invoke-virtual {v3, v5}, Lgo0;->c(F)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    if-nez v5, :cond_6

    .line 254
    .line 255
    if-ne v6, v8, :cond_7

    .line 256
    .line 257
    :cond_6
    const/4 v5, 0x1

    .line 258
    goto :goto_5

    .line 259
    :cond_7
    const/4 v5, 0x1

    .line 260
    goto :goto_6

    .line 261
    :goto_5
    invoke-static {v0, v14, v15, v15, v5}, Lx13;->a(Lx13;FFFI)Lx13;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-static {v6}, Lgf1;->U(Lx13;)J

    .line 266
    .line 267
    .line 268
    move-result-wide v9

    .line 269
    new-instance v6, Lju;

    .line 270
    .line 271
    invoke-direct {v6, v9, v10}, Lju;-><init>(J)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_6
    check-cast v6, Lju;

    .line 278
    .line 279
    iget-wide v9, v6, Lju;->a:J

    .line 280
    .line 281
    const v6, 0x4479c000    # 999.0f

    .line 282
    .line 283
    .line 284
    invoke-static {v6}, Lgb2;->a(F)Lfb2;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    sget-object v11, Lte;->e:Lyi0;

    .line 289
    .line 290
    const/high16 v14, 0x41e00000    # 28.0f

    .line 291
    .line 292
    invoke-static {v11, v14}, Lte;->O(Luh1;F)Luh1;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    invoke-static {v11, v6}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    sget-object v14, Lur1;->a:Ltu2;

    .line 301
    .line 302
    invoke-virtual {v3, v14}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    check-cast v14, Llp1;

    .line 307
    .line 308
    move-object/from16 p2, v6

    .line 309
    .line 310
    iget-wide v5, v14, Llp1;->d:J

    .line 311
    .line 312
    new-instance v14, Lft2;

    .line 313
    .line 314
    invoke-direct {v14, v5, v6}, Lft2;-><init>(J)V

    .line 315
    .line 316
    .line 317
    new-instance v5, Lrl;

    .line 318
    .line 319
    move-object/from16 v6, p2

    .line 320
    .line 321
    invoke-direct {v5, v15, v14, v6}, Lrl;-><init>(FLft2;Leq2;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v11, v5}, Luh1;->c(Luh1;)Luh1;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    if-ne v6, v8, :cond_8

    .line 333
    .line 334
    new-instance v6, Lpr;

    .line 335
    .line 336
    const/16 v11, 0x19

    .line 337
    .line 338
    invoke-direct {v6, v7, v11}, Lpr;-><init>(Lxk1;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_8
    check-cast v6, Lin0;

    .line 345
    .line 346
    invoke-static {v5, v6}, Lgf1;->G(Luh1;Lin0;)Luh1;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    invoke-interface {v7}, Lgu2;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    check-cast v6, Lh11;

    .line 355
    .line 356
    iget-wide v14, v6, Lh11;->a:J

    .line 357
    .line 358
    new-instance v6, Lh11;

    .line 359
    .line 360
    invoke-direct {v6, v14, v15}, Lh11;-><init>(J)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    move-object/from16 v14, v19

    .line 368
    .line 369
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v15

    .line 373
    or-int/2addr v11, v15

    .line 374
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v15

    .line 378
    if-nez v11, :cond_9

    .line 379
    .line 380
    if-ne v15, v8, :cond_a

    .line 381
    .line 382
    :cond_9
    new-instance v15, Lw13;

    .line 383
    .line 384
    move/from16 v11, v17

    .line 385
    .line 386
    invoke-direct {v15, v7, v12, v14, v11}, Lw13;-><init>(Lxk1;Lxk1;Lxk1;I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_a
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 393
    .line 394
    invoke-static {v5, v6, v15}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-virtual {v3, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    const/4 v7, 0x4

    .line 403
    if-ne v4, v7, :cond_b

    .line 404
    .line 405
    const/16 v18, 0x1

    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_b
    const/16 v18, 0x0

    .line 409
    .line 410
    :goto_7
    or-int v4, v6, v18

    .line 411
    .line 412
    invoke-virtual {v3, v9, v10}, Lgo0;->e(J)Z

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    or-int/2addr v4, v6

    .line 417
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    if-nez v4, :cond_c

    .line 422
    .line 423
    if-ne v6, v8, :cond_d

    .line 424
    .line 425
    :cond_c
    new-instance v6, Lwo1;

    .line 426
    .line 427
    invoke-direct {v6, v13, v0, v9, v10}, Lwo1;-><init>(Ljava/util/List;Lx13;J)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :cond_d
    check-cast v6, Lin0;

    .line 434
    .line 435
    const/4 v11, 0x0

    .line 436
    invoke-static {v5, v6, v3, v11}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 437
    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_e
    const/4 v11, 0x0

    .line 441
    invoke-virtual {v3}, Lgo0;->R()V

    .line 442
    .line 443
    .line 444
    :goto_8
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    if-eqz v3, :cond_f

    .line 449
    .line 450
    new-instance v4, Lr13;

    .line 451
    .line 452
    invoke-direct {v4, v0, v1, v2, v11}, Lr13;-><init>(Lx13;Lin0;II)V

    .line 453
    .line 454
    .line 455
    iput-object v4, v3, Lb62;->d:Lmn0;

    .line 456
    .line 457
    :cond_f
    return-void
.end method

.method public static final k(Lx13;Lin0;Lpx;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Lgo0;

    .line 10
    .line 11
    const v4, -0x1c37021b

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v4}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v4, 0x2

    .line 26
    :goto_0
    or-int/2addr v4, v2

    .line 27
    invoke-virtual {v3, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/16 v6, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v6, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v4, v6

    .line 39
    and-int/lit8 v6, v4, 0x13

    .line 40
    .line 41
    const/16 v7, 0x12

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    if-eq v6, v7, :cond_2

    .line 45
    .line 46
    move v6, v9

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v6, 0x0

    .line 49
    :goto_2
    and-int/lit8 v7, v4, 0x1

    .line 50
    .line 51
    invoke-virtual {v3, v7, v6}, Lgo0;->O(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_c

    .line 56
    .line 57
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    sget-object v7, Lnx;->a:Leb;

    .line 62
    .line 63
    if-ne v6, v7, :cond_3

    .line 64
    .line 65
    new-instance v6, Lh11;

    .line 66
    .line 67
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    invoke-direct {v6, v10, v11}, Lh11;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    check-cast v6, Lxk1;

    .line 80
    .line 81
    and-int/lit8 v4, v4, 0xe

    .line 82
    .line 83
    invoke-static {v0, v3}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-static {v1, v3}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    iget v12, v0, Lx13;->a:F

    .line 92
    .line 93
    invoke-virtual {v3, v12}, Lgo0;->c(F)Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    const/high16 v14, 0x3f800000    # 1.0f

    .line 102
    .line 103
    if-nez v12, :cond_4

    .line 104
    .line 105
    if-ne v13, v7, :cond_5

    .line 106
    .line 107
    :cond_4
    const/4 v12, 0x0

    .line 108
    invoke-static {v0, v12, v14, v14, v9}, Lx13;->a(Lx13;FFFI)Lx13;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-static {v12}, Lgf1;->U(Lx13;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    new-instance v15, Lju;

    .line 117
    .line 118
    invoke-direct {v15, v12, v13}, Lju;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v13, v15

    .line 125
    :cond_5
    check-cast v13, Lju;

    .line 126
    .line 127
    iget-wide v12, v13, Lju;->a:J

    .line 128
    .line 129
    const/high16 v15, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-static {v15}, Lgb2;->a(F)Lfb2;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    sget-object v16, Lte;->e:Lyi0;

    .line 136
    .line 137
    invoke-static/range {v16 .. v16}, Lup0;->f(Luh1;)Luh1;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {v8, v15}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    sget-object v5, Lur1;->a:Ltu2;

    .line 146
    .line 147
    invoke-virtual {v3, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Llp1;

    .line 152
    .line 153
    move-object/from16 v17, v10

    .line 154
    .line 155
    iget-wide v9, v5, Llp1;->d:J

    .line 156
    .line 157
    new-instance v5, Lft2;

    .line 158
    .line 159
    invoke-direct {v5, v9, v10}, Lft2;-><init>(J)V

    .line 160
    .line 161
    .line 162
    new-instance v9, Lrl;

    .line 163
    .line 164
    invoke-direct {v9, v14, v5, v15}, Lrl;-><init>(FLft2;Leq2;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v8, v9}, Luh1;->c(Luh1;)Luh1;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    if-ne v8, v7, :cond_6

    .line 176
    .line 177
    new-instance v8, Lpr;

    .line 178
    .line 179
    const/16 v9, 0x1a

    .line 180
    .line 181
    invoke-direct {v8, v6, v9}, Lpr;-><init>(Lxk1;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    check-cast v8, Lin0;

    .line 188
    .line 189
    invoke-static {v5, v8}, Lgf1;->G(Luh1;Lin0;)Luh1;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    check-cast v8, Lh11;

    .line 198
    .line 199
    iget-wide v8, v8, Lh11;->a:J

    .line 200
    .line 201
    new-instance v10, Lh11;

    .line 202
    .line 203
    invoke-direct {v10, v8, v9}, Lh11;-><init>(J)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    move-object/from16 v9, v17

    .line 211
    .line 212
    invoke-virtual {v3, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    or-int/2addr v8, v14

    .line 217
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    if-nez v8, :cond_7

    .line 222
    .line 223
    if-ne v14, v7, :cond_8

    .line 224
    .line 225
    :cond_7
    new-instance v14, Lw13;

    .line 226
    .line 227
    const/4 v8, 0x1

    .line 228
    invoke-direct {v14, v6, v11, v9, v8}, Lw13;-><init>(Lxk1;Lxk1;Lxk1;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_8
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 235
    .line 236
    invoke-static {v5, v10, v14}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v3, v12, v13}, Lgo0;->e(J)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    const/4 v8, 0x4

    .line 245
    if-ne v4, v8, :cond_9

    .line 246
    .line 247
    const/4 v8, 0x1

    .line 248
    goto :goto_3

    .line 249
    :cond_9
    const/4 v8, 0x0

    .line 250
    :goto_3
    or-int v4, v6, v8

    .line 251
    .line 252
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    if-nez v4, :cond_a

    .line 257
    .line 258
    if-ne v6, v7, :cond_b

    .line 259
    .line 260
    :cond_a
    new-instance v6, Lbp1;

    .line 261
    .line 262
    invoke-direct {v6, v12, v13, v0}, Lbp1;-><init>(JLx13;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_b
    check-cast v6, Lin0;

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    invoke-static {v5, v6, v3, v4}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_c
    invoke-virtual {v3}, Lgo0;->R()V

    .line 276
    .line 277
    .line 278
    :goto_4
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-eqz v3, :cond_d

    .line 283
    .line 284
    new-instance v4, Lr13;

    .line 285
    .line 286
    const/4 v8, 0x1

    .line 287
    invoke-direct {v4, v0, v1, v2, v8}, Lr13;-><init>(Lx13;Lin0;II)V

    .line 288
    .line 289
    .line 290
    iput-object v4, v3, Lb62;->d:Lmn0;

    .line 291
    .line 292
    :cond_d
    return-void
.end method

.method public static final l(Lxk1;Lxk1;Lxk1;J)V
    .locals 3

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh11;

    .line 6
    .line 7
    iget-wide v0, v0, Lh11;->a:J

    .line 8
    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    shr-long/2addr v0, v2

    .line 12
    long-to-int v0, v0

    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    shr-long/2addr p3, v2

    .line 17
    long-to-int p3, p3

    .line 18
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lh11;

    .line 27
    .line 28
    iget-wide v0, p0, Lh11;->a:J

    .line 29
    .line 30
    shr-long/2addr v0, v2

    .line 31
    long-to-int p0, v0

    .line 32
    int-to-float p0, p0

    .line 33
    div-float/2addr p3, p0

    .line 34
    const/high16 p0, 0x3f800000    # 1.0f

    .line 35
    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-static {p3, p4, p0}, Lci0;->C(FFF)F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const p3, 0x43b3ffdf    # 359.999f

    .line 42
    .line 43
    .line 44
    mul-float/2addr p0, p3

    .line 45
    invoke-static {p0, p4, p3}, Lci0;->C(FFF)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-interface {p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lin0;

    .line 54
    .line 55
    invoke-interface {p2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lx13;

    .line 60
    .line 61
    const/4 p3, 0x6

    .line 62
    invoke-static {p2, p0, p4, p4, p3}, Lx13;->a(Lx13;FFFI)Lx13;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static final m(Lxk1;Lxk1;Lxk1;J)V
    .locals 7

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh11;

    .line 6
    .line 7
    iget-wide v0, v0, Lh11;->a:J

    .line 8
    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    shr-long/2addr v0, v2

    .line 12
    long-to-int v0, v0

    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lh11;

    .line 20
    .line 21
    iget-wide v0, v0, Lh11;->a:J

    .line 22
    .line 23
    const-wide v3, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v0, v3

    .line 29
    long-to-int v0, v0

    .line 30
    if-gtz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    shr-long v0, p3, v2

    .line 34
    .line 35
    long-to-int v0, v0

    .line 36
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lh11;

    .line 45
    .line 46
    iget-wide v5, v1, Lh11;->a:J

    .line 47
    .line 48
    shr-long v1, v5, v2

    .line 49
    .line 50
    long-to-int v1, v1

    .line 51
    int-to-float v1, v1

    .line 52
    div-float/2addr v0, v1

    .line 53
    const/4 v1, 0x0

    .line 54
    const/high16 v2, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Lci0;->C(FFF)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    and-long/2addr p3, v3

    .line 61
    long-to-int p3, p3

    .line 62
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Lh11;

    .line 71
    .line 72
    iget-wide v5, p0, Lh11;->a:J

    .line 73
    .line 74
    and-long/2addr v3, v5

    .line 75
    long-to-int p0, v3

    .line 76
    int-to-float p0, p0

    .line 77
    div-float/2addr p3, p0

    .line 78
    sub-float p0, v2, p3

    .line 79
    .line 80
    invoke-static {p0, v1, v2}, Lci0;->C(FFF)F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-interface {p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lin0;

    .line 89
    .line 90
    invoke-interface {p2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Lx13;

    .line 95
    .line 96
    const/4 p3, 0x1

    .line 97
    invoke-static {p2, v1, v0, p0, p3}, Lx13;->a(Lx13;FFFI)Lx13;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_1
    :goto_0
    return-void
.end method

.method public static final n(Luh1;JLeq2;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lmj;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lmj;-><init>(JLeq2;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static p(Lt00;Lt00;Lmn0;)Lt00;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lrj;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p2, Lrj;

    .line 9
    .line 10
    invoke-virtual {p2, p1, p0}, Lrj;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p1}, Lt00;->f()La20;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lzd0;->h:Lzd0;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    new-instance v0, Lu11;

    .line 24
    .line 25
    invoke-direct {v0, p1, p0, p2}, Lu11;-><init>(Lt00;Lt00;Lmn0;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance v1, Lv11;

    .line 30
    .line 31
    invoke-direct {v1, p1, v0, p2, p0}, Lv11;-><init>(Lt00;La20;Lmn0;Lt00;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public static q(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    int-to-char v1, v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const/16 v2, 0x80

    .line 32
    .line 33
    if-ge v1, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    and-int/lit16 v3, v1, 0xe0

    .line 40
    .line 41
    const/16 v4, 0xc0

    .line 42
    .line 43
    if-ne v3, v4, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/lit16 v4, v3, 0xc0

    .line 50
    .line 51
    if-ne v4, v2, :cond_3

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    shl-int/lit8 v1, v1, 0x6

    .line 56
    .line 57
    and-int/lit8 v2, v3, 0x3f

    .line 58
    .line 59
    or-int/2addr v1, v2

    .line 60
    int-to-char v1, v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 66
    .line 67
    const-string v0, "bad second byte"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_4
    and-int/lit16 v3, v1, 0xf0

    .line 74
    .line 75
    const/16 v4, 0xe0

    .line 76
    .line 77
    if-ne v3, v4, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    and-int/lit16 v5, v3, 0xc0

    .line 88
    .line 89
    if-ne v5, v2, :cond_5

    .line 90
    .line 91
    and-int/lit16 v5, v4, 0xc0

    .line 92
    .line 93
    if-ne v5, v2, :cond_5

    .line 94
    .line 95
    and-int/lit8 v1, v1, 0xf

    .line 96
    .line 97
    shl-int/lit8 v1, v1, 0xc

    .line 98
    .line 99
    and-int/lit8 v2, v3, 0x3f

    .line 100
    .line 101
    shl-int/lit8 v2, v2, 0x6

    .line 102
    .line 103
    or-int/2addr v1, v2

    .line 104
    and-int/lit8 v2, v4, 0x3f

    .line 105
    .line 106
    or-int/2addr v1, v2

    .line 107
    int-to-char v1, v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 113
    .line 114
    const-string v0, "bad second or third byte"

    .line 115
    .line 116
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_6
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 121
    .line 122
    const-string v0, "bad byte"

    .line 123
    .line 124
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static r(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lb5;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lse;->v(Landroid/graphics/BitmapFactory$Options;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-static {p2}, Lgf1;->B(Lb5;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    iget-object p2, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    if-ne p2, v0, :cond_0

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    const-string v1, ""

    .line 30
    .line 31
    invoke-static {v1, p2}, Lfg1;->o(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    iput-object p2, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p0, v2, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 47
    .line 48
    .line 49
    :cond_1
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    :try_start_1
    invoke-static {p0}, Lgf1;->S(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 57
    .line 58
    .line 59
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    return-object p2

    .line 62
    :catchall_0
    move-exception p2

    .line 63
    move-object v2, p0

    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception p2

    .line 66
    :goto_1
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 69
    .line 70
    .line 71
    :cond_3
    sget-object p0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    iput-object p0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 74
    .line 75
    throw p2

    .line 76
    :cond_4
    invoke-static {p0, v2, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static final s(Lt91;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt91;->e:Lt03;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Lt91;->d:Lsz0;

    .line 7
    .line 8
    iget-object v3, p0, Lt91;->v:Ln10;

    .line 9
    .line 10
    iget-object v2, v2, Lsz0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lk03;

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    const/4 v6, 0x3

    .line 17
    invoke-static {v2, v1, v4, v5, v6}, Lk03;->a(Lk03;Lsd;JI)Lk03;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v3, v2}, Ln10;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Lt03;->a:Lo03;

    .line 25
    .line 26
    iget-object v3, v2, Lo03;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    iget-object v0, v2, Lo03;->a:Lv02;

    .line 35
    .line 36
    invoke-interface {v0}, Lv02;->g()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eq v4, v0, :cond_0

    .line 45
    .line 46
    :cond_2
    :goto_0
    iput-object v1, p0, Lt91;->e:Lt03;

    .line 47
    .line 48
    return-void
.end method

.method public static t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-virtual {v1, v2}, Lox2;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v1, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    iget v5, v1, Lox2;->a:I

    .line 18
    .line 19
    add-int/2addr v3, v5

    .line 20
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v3, 0x6

    .line 24
    invoke-virtual {v1, v3}, Lox2;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget-object v5, v1, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    iget v6, v1, Lox2;->a:I

    .line 33
    .line 34
    add-int/2addr v4, v6

    .line 35
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 36
    .line 37
    .line 38
    :cond_1
    const/16 v4, 0x8

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Lox2;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget v6, v1, Lox2;->a:I

    .line 47
    .line 48
    add-int/2addr v4, v6

    .line 49
    invoke-virtual {v1, v4}, Lox2;->d(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v4, 0x0

    .line 55
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/16 v6, 0xa

    .line 59
    .line 60
    invoke-virtual {v1, v6}, Lox2;->b(I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x0

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    iget-object v8, v1, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    iget v9, v1, Lox2;->a:I

    .line 70
    .line 71
    add-int/2addr v6, v9

    .line 72
    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v6, v7

    .line 78
    :goto_1
    const/4 v8, 0x1

    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    if-ne v6, v8, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const/4 v9, 0x2

    .line 86
    if-ne v6, v9, :cond_6

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    const/4 v9, 0x3

    .line 90
    if-ne v6, v9, :cond_16

    .line 91
    .line 92
    :goto_2
    new-instance v6, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    const/16 v9, 0xc

    .line 98
    .line 99
    invoke-virtual {v1, v9}, Lox2;->b(I)I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_7

    .line 104
    .line 105
    invoke-virtual {v1, v10}, Lox2;->f(I)I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    move v10, v7

    .line 111
    :goto_3
    move v11, v7

    .line 112
    :goto_4
    if-ge v11, v10, :cond_15

    .line 113
    .line 114
    new-instance v12, La;

    .line 115
    .line 116
    invoke-direct {v12}, Lox2;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v9}, Lox2;->b(I)I

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-eqz v13, :cond_8

    .line 124
    .line 125
    invoke-virtual {v1, v13}, Lox2;->e(I)I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    mul-int/lit8 v14, v11, 0x4

    .line 130
    .line 131
    add-int/2addr v14, v13

    .line 132
    invoke-virtual {v1, v14}, Lox2;->a(I)I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    iget-object v14, v1, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v13, v14}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_8
    const/4 v12, 0x0

    .line 146
    :goto_5
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v13, La;

    .line 150
    .line 151
    invoke-direct {v13}, Lox2;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v3}, Lox2;->b(I)I

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    if-eqz v14, :cond_9

    .line 159
    .line 160
    iget v15, v12, Lox2;->a:I

    .line 161
    .line 162
    add-int/2addr v14, v15

    .line 163
    invoke-virtual {v12, v14}, Lox2;->a(I)I

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v13, v14, v15}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    const/4 v13, 0x0

    .line 177
    :goto_6
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v14, Lvd;

    .line 181
    .line 182
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    if-eqz v15, :cond_a

    .line 189
    .line 190
    iget v5, v12, Lox2;->a:I

    .line 191
    .line 192
    add-int/2addr v15, v5

    .line 193
    invoke-virtual {v12, v15}, Lox2;->d(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    goto :goto_7

    .line 198
    :cond_a
    move-object/from16 v5, v16

    .line 199
    .line 200
    :goto_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v13, v3}, Lox2;->b(I)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_b

    .line 208
    .line 209
    iget-object v15, v13, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    iget v3, v13, Lox2;->a:I

    .line 212
    .line 213
    add-int/2addr v12, v3

    .line 214
    invoke-virtual {v15, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    goto :goto_8

    .line 219
    :cond_b
    move v3, v7

    .line 220
    :goto_8
    invoke-static {v3}, Lxe1;->t(B)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v3}, Lvi0;->u(I)I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    packed-switch v12, :pswitch_data_0

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lc80;->s()V

    .line 232
    .line 233
    .line 234
    return-object v16

    .line 235
    :pswitch_0
    new-instance v12, Lg;

    .line 236
    .line 237
    invoke-direct {v12}, Lox2;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    check-cast v12, Lg;

    .line 248
    .line 249
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    if-eqz v13, :cond_c

    .line 254
    .line 255
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 256
    .line 257
    iget v12, v12, Lox2;->a:I

    .line 258
    .line 259
    add-int/2addr v13, v12

    .line 260
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    if-eqz v12, :cond_c

    .line 265
    .line 266
    move v12, v8

    .line 267
    goto :goto_9

    .line 268
    :cond_c
    move v12, v7

    .line 269
    :goto_9
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    goto/16 :goto_12

    .line 274
    .line 275
    :pswitch_1
    new-instance v12, Ln;

    .line 276
    .line 277
    invoke-direct {v12}, Lox2;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    check-cast v12, Ln;

    .line 288
    .line 289
    goto/16 :goto_12

    .line 290
    .line 291
    :pswitch_2
    new-instance v12, Lc;

    .line 292
    .line 293
    invoke-direct {v12}, Lox2;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    check-cast v12, Lc;

    .line 304
    .line 305
    invoke-static {v0, v12}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    goto/16 :goto_12

    .line 310
    .line 311
    :pswitch_3
    new-instance v12, Lb;

    .line 312
    .line 313
    invoke-direct {v12}, Lox2;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    check-cast v12, Lb;

    .line 324
    .line 325
    invoke-static {v0, v12}, Lfg1;->x(Lorg/luckypray/dexkit/DexKitBridge;Lb;)Lwd;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    goto/16 :goto_12

    .line 330
    .line 331
    :pswitch_4
    new-instance v12, Lq;

    .line 332
    .line 333
    invoke-direct {v12}, Lox2;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    check-cast v12, Lq;

    .line 344
    .line 345
    invoke-static {v0, v12}, Lse;->B(Lorg/luckypray/dexkit/DexKitBridge;Lq;)Lji0;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    goto/16 :goto_12

    .line 350
    .line 351
    :pswitch_5
    new-instance v12, Lr;

    .line 352
    .line 353
    invoke-direct {v12}, Lox2;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    check-cast v12, Lr;

    .line 364
    .line 365
    invoke-static {v0, v12}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    goto/16 :goto_12

    .line 370
    .line 371
    :pswitch_6
    new-instance v12, Lf;

    .line 372
    .line 373
    invoke-direct {v12}, Lox2;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 377
    .line 378
    .line 379
    move-result-object v12

    .line 380
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    check-cast v12, Lf;

    .line 384
    .line 385
    invoke-static {v0, v12}, Ltl;->z(Lorg/luckypray/dexkit/DexKitBridge;Lf;)Lus;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    goto/16 :goto_12

    .line 390
    .line 391
    :pswitch_7
    new-instance v12, Lp;

    .line 392
    .line 393
    invoke-direct {v12}, Lox2;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 397
    .line 398
    .line 399
    move-result-object v12

    .line 400
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    check-cast v12, Lp;

    .line 404
    .line 405
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 406
    .line 407
    .line 408
    move-result v13

    .line 409
    if-eqz v13, :cond_d

    .line 410
    .line 411
    iget v15, v12, Lox2;->a:I

    .line 412
    .line 413
    add-int/2addr v13, v15

    .line 414
    invoke-virtual {v12, v13}, Lox2;->d(I)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v12

    .line 418
    goto :goto_a

    .line 419
    :cond_d
    move-object/from16 v12, v16

    .line 420
    .line 421
    :goto_a
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    goto/16 :goto_12

    .line 425
    .line 426
    :pswitch_8
    new-instance v12, Lj;

    .line 427
    .line 428
    invoke-direct {v12}, Lox2;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    check-cast v12, Lj;

    .line 439
    .line 440
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_e

    .line 445
    .line 446
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 447
    .line 448
    iget v12, v12, Lox2;->a:I

    .line 449
    .line 450
    add-int/2addr v13, v12

    .line 451
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 452
    .line 453
    .line 454
    move-result-wide v12

    .line 455
    goto :goto_b

    .line 456
    :cond_e
    const-wide/16 v12, 0x0

    .line 457
    .line 458
    :goto_b
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    goto/16 :goto_12

    .line 463
    .line 464
    :pswitch_9
    new-instance v12, Lk;

    .line 465
    .line 466
    invoke-direct {v12}, Lox2;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 470
    .line 471
    .line 472
    move-result-object v12

    .line 473
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    check-cast v12, Lk;

    .line 477
    .line 478
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 479
    .line 480
    .line 481
    move-result v13

    .line 482
    if-eqz v13, :cond_f

    .line 483
    .line 484
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 485
    .line 486
    iget v12, v12, Lox2;->a:I

    .line 487
    .line 488
    add-int/2addr v13, v12

    .line 489
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    goto :goto_c

    .line 494
    :cond_f
    const/4 v12, 0x0

    .line 495
    :goto_c
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    goto/16 :goto_12

    .line 500
    .line 501
    :pswitch_a
    new-instance v12, Lm;

    .line 502
    .line 503
    invoke-direct {v12}, Lox2;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    check-cast v12, Lm;

    .line 514
    .line 515
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 516
    .line 517
    .line 518
    move-result v13

    .line 519
    if-eqz v13, :cond_10

    .line 520
    .line 521
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 522
    .line 523
    iget v12, v12, Lox2;->a:I

    .line 524
    .line 525
    add-int/2addr v13, v12

    .line 526
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 527
    .line 528
    .line 529
    move-result-wide v12

    .line 530
    goto :goto_d

    .line 531
    :cond_10
    const-wide/16 v12, 0x0

    .line 532
    .line 533
    :goto_d
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    goto/16 :goto_12

    .line 538
    .line 539
    :pswitch_b
    new-instance v12, Ll;

    .line 540
    .line 541
    invoke-direct {v12}, Lox2;-><init>()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 545
    .line 546
    .line 547
    move-result-object v12

    .line 548
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    check-cast v12, Ll;

    .line 552
    .line 553
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 554
    .line 555
    .line 556
    move-result v13

    .line 557
    if-eqz v13, :cond_11

    .line 558
    .line 559
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 560
    .line 561
    iget v12, v12, Lox2;->a:I

    .line 562
    .line 563
    add-int/2addr v13, v12

    .line 564
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 565
    .line 566
    .line 567
    move-result v12

    .line 568
    goto :goto_e

    .line 569
    :cond_11
    move v12, v7

    .line 570
    :goto_e
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object v12

    .line 574
    goto/16 :goto_12

    .line 575
    .line 576
    :pswitch_c
    new-instance v12, Li;

    .line 577
    .line 578
    invoke-direct {v12}, Lox2;-><init>()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 582
    .line 583
    .line 584
    move-result-object v12

    .line 585
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    check-cast v12, Li;

    .line 589
    .line 590
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 591
    .line 592
    .line 593
    move-result v13

    .line 594
    if-eqz v13, :cond_12

    .line 595
    .line 596
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 597
    .line 598
    iget v12, v12, Lox2;->a:I

    .line 599
    .line 600
    add-int/2addr v13, v12

    .line 601
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 602
    .line 603
    .line 604
    move-result v12

    .line 605
    goto :goto_f

    .line 606
    :cond_12
    move v12, v7

    .line 607
    :goto_f
    invoke-static {v12}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 608
    .line 609
    .line 610
    move-result-object v12

    .line 611
    goto :goto_12

    .line 612
    :pswitch_d
    new-instance v12, Lo;

    .line 613
    .line 614
    invoke-direct {v12}, Lox2;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 618
    .line 619
    .line 620
    move-result-object v12

    .line 621
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    check-cast v12, Lo;

    .line 625
    .line 626
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 627
    .line 628
    .line 629
    move-result v13

    .line 630
    if-eqz v13, :cond_13

    .line 631
    .line 632
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 633
    .line 634
    iget v12, v12, Lox2;->a:I

    .line 635
    .line 636
    add-int/2addr v13, v12

    .line 637
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 638
    .line 639
    .line 640
    move-result v12

    .line 641
    goto :goto_10

    .line 642
    :cond_13
    move v12, v7

    .line 643
    :goto_10
    invoke-static {v12}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 644
    .line 645
    .line 646
    move-result-object v12

    .line 647
    goto :goto_12

    .line 648
    :pswitch_e
    new-instance v12, Lh;

    .line 649
    .line 650
    invoke-direct {v12}, Lox2;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v13, v12}, La;->k(Lox2;)Lox2;

    .line 654
    .line 655
    .line 656
    move-result-object v12

    .line 657
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    check-cast v12, Lh;

    .line 661
    .line 662
    invoke-virtual {v12, v2}, Lox2;->b(I)I

    .line 663
    .line 664
    .line 665
    move-result v13

    .line 666
    if-eqz v13, :cond_14

    .line 667
    .line 668
    iget-object v15, v12, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 669
    .line 670
    iget v12, v12, Lox2;->a:I

    .line 671
    .line 672
    add-int/2addr v13, v12

    .line 673
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 674
    .line 675
    .line 676
    move-result v12

    .line 677
    goto :goto_11

    .line 678
    :cond_14
    move v12, v7

    .line 679
    :goto_11
    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 680
    .line 681
    .line 682
    move-result-object v12

    .line 683
    :goto_12
    new-instance v13, Lxd;

    .line 684
    .line 685
    invoke-direct {v13, v3, v12}, Lxd;-><init>(ILjava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    invoke-direct {v14, v0, v5, v13}, Lvd;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lxd;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    add-int/lit8 v11, v11, 0x1

    .line 695
    .line 696
    const/4 v3, 0x6

    .line 697
    goto/16 :goto_4

    .line 698
    .line 699
    :cond_15
    new-instance v1, Lud;

    .line 700
    .line 701
    invoke-direct {v1, v0, v4, v6}, Lud;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 702
    .line 703
    .line 704
    return-object v1

    .line 705
    :cond_16
    const/16 v16, 0x0

    .line 706
    .line 707
    const-string v0, "Unknown AnnotationVisibilityType: "

    .line 708
    .line 709
    invoke-static {v0, v6}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    return-object v16

    .line 717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public static final u(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final v(II[F)F
    .locals 0

    .line 1
    sub-int/2addr p0, p1

    .line 2
    mul-int/lit8 p0, p0, 0x2

    .line 3
    .line 4
    add-int/lit8 p0, p0, 0x1

    .line 5
    .line 6
    aget p0, p2, p0

    .line 7
    .line 8
    return p0
.end method

.method public static w()Z
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lb7;->U0:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "android.os.SystemProperties"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lb7;->U0:Ljava/lang/Class;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lb7;->V0:Ljava/lang/reflect/Method;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lb7;->U0:Ljava/lang/Class;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string v2, "getBoolean"

    .line 23
    .line 24
    const-class v3, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v0, v1

    .line 38
    :goto_0
    sput-object v0, Lb7;->V0:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    :cond_2
    sget-object v0, Lb7;->V0:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    const-string v2, "debug.layout"

    .line 45
    .line 46
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move-object v0, v1

    .line 58
    :goto_1
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v1, v0

    .line 63
    check-cast v1, Ljava/lang/Boolean;

    .line 64
    .line 65
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return v0

    .line 72
    :catch_0
    const/4 v0, 0x0

    .line 73
    return v0
.end method

.method public static x(Landroid/view/Display;I)Leb2;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-static {p0, p1}, Ll7;->d(Landroid/view/Display;I)Landroid/view/RoundedCorner;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance p1, Leb2;

    .line 15
    .line 16
    invoke-static {p0}, Ll7;->b(Landroid/view/RoundedCorner;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "Invalid position: "

    .line 33
    .line 34
    invoke-static {p0, v0}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :cond_2
    :goto_0
    invoke-static {p0}, Ll7;->x(Landroid/view/RoundedCorner;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p0}, Ll7;->c(Landroid/view/RoundedCorner;)Landroid/graphics/Point;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, v1, v0, p0}, Leb2;-><init>(IILandroid/graphics/Point;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    return-object v2
.end method

.method public static final y(Lw03;Landroid/text/Layout;Lcj;ILandroid/graphics/RectF;Lom2;Ls9;Z)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineTop(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineBottom(I)I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v9, v1, :cond_1

    .line 32
    .line 33
    :cond_0
    const/4 v10, -0x1

    .line 34
    goto/16 :goto_1e

    .line 35
    .line 36
    :cond_1
    sub-int/2addr v1, v9

    .line 37
    mul-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    new-array v11, v1, [F

    .line 40
    .line 41
    iget-object v12, v0, Lw03;->f:Landroid/text/Layout;

    .line 42
    .line 43
    invoke-virtual {v12, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 44
    .line 45
    .line 46
    move-result v13

    .line 47
    invoke-virtual {v0, v3}, Lw03;->f(I)I

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    sub-int v15, v14, v13

    .line 52
    .line 53
    mul-int/lit8 v15, v15, 0x2

    .line 54
    .line 55
    if-lt v1, v15, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string v1, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"

    .line 59
    .line 60
    invoke-static {v1}, Llz0;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    new-instance v1, Leu0;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Leu0;-><init>(Lw03;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v12, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v15, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    if-ne v0, v10, :cond_3

    .line 75
    .line 76
    move v0, v10

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move v0, v15

    .line 79
    :goto_1
    move/from16 v16, v15

    .line 80
    .line 81
    :goto_2
    if-ge v13, v14, :cond_7

    .line 82
    .line 83
    invoke-virtual {v12, v13}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 84
    .line 85
    .line 86
    move-result v17

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    if-nez v17, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1, v13, v15, v15, v10}, Leu0;->a(IZZZ)F

    .line 92
    .line 93
    .line 94
    move-result v17

    .line 95
    add-int/lit8 v15, v13, 0x1

    .line 96
    .line 97
    invoke-virtual {v1, v15, v10, v10, v10}, Leu0;->a(IZZZ)F

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    move/from16 v18, v0

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    if-eqz v0, :cond_5

    .line 105
    .line 106
    if-eqz v17, :cond_5

    .line 107
    .line 108
    const/4 v15, 0x0

    .line 109
    invoke-virtual {v1, v13, v15, v15, v15}, Leu0;->a(IZZZ)F

    .line 110
    .line 111
    .line 112
    move-result v17

    .line 113
    move/from16 v18, v0

    .line 114
    .line 115
    add-int/lit8 v0, v13, 0x1

    .line 116
    .line 117
    invoke-virtual {v1, v0, v10, v10, v15}, Leu0;->a(IZZZ)F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    move/from16 v15, v17

    .line 122
    .line 123
    move/from16 v17, v0

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    move/from16 v18, v0

    .line 127
    .line 128
    const/4 v15, 0x0

    .line 129
    if-eqz v17, :cond_6

    .line 130
    .line 131
    invoke-virtual {v1, v13, v15, v15, v10}, Leu0;->a(IZZZ)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    add-int/lit8 v15, v13, 0x1

    .line 136
    .line 137
    invoke-virtual {v1, v15, v10, v10, v10}, Leu0;->a(IZZZ)F

    .line 138
    .line 139
    .line 140
    move-result v17

    .line 141
    :goto_3
    move v15, v0

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    invoke-virtual {v1, v13, v15, v15, v15}, Leu0;->a(IZZZ)F

    .line 144
    .line 145
    .line 146
    move-result v17

    .line 147
    add-int/lit8 v0, v13, 0x1

    .line 148
    .line 149
    invoke-virtual {v1, v0, v10, v10, v15}, Leu0;->a(IZZZ)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    goto :goto_3

    .line 154
    :goto_4
    aput v17, v11, v16

    .line 155
    .line 156
    add-int/lit8 v0, v16, 0x1

    .line 157
    .line 158
    aput v15, v11, v0

    .line 159
    .line 160
    add-int/lit8 v16, v16, 0x2

    .line 161
    .line 162
    add-int/lit8 v13, v13, 0x1

    .line 163
    .line 164
    move/from16 v0, v18

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    iget-object v0, v2, Lcj;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Landroid/text/Layout;

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    const/4 v15, 0x0

    .line 181
    invoke-virtual {v2, v1, v15}, Lcj;->j(IZ)I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    invoke-virtual {v2, v12}, Lcj;->k(I)I

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    sub-int v14, v1, v13

    .line 190
    .line 191
    sub-int v13, v3, v13

    .line 192
    .line 193
    invoke-virtual {v2, v12}, Lcj;->e(I)Ljava/text/Bidi;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_a

    .line 198
    .line 199
    invoke-virtual {v2, v14, v13}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-nez v2, :cond_8

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_8
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    new-array v3, v0, [Lf61;

    .line 211
    .line 212
    const/4 v15, 0x0

    .line 213
    :goto_5
    if-ge v15, v0, :cond_b

    .line 214
    .line 215
    new-instance v12, Lf61;

    .line 216
    .line 217
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunStart(I)I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    add-int/2addr v13, v1

    .line 222
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    add-int/2addr v14, v1

    .line 227
    invoke-virtual {v2, v15}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    move/from16 p2, v0

    .line 232
    .line 233
    rem-int/lit8 v0, v16, 0x2

    .line 234
    .line 235
    if-ne v0, v10, :cond_9

    .line 236
    .line 237
    move v0, v10

    .line 238
    goto :goto_6

    .line 239
    :cond_9
    const/4 v0, 0x0

    .line 240
    :goto_6
    invoke-direct {v12, v13, v14, v0}, Lf61;-><init>(IIZ)V

    .line 241
    .line 242
    .line 243
    aput-object v12, v3, v15

    .line 244
    .line 245
    add-int/lit8 v15, v15, 0x1

    .line 246
    .line 247
    move/from16 v0, p2

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_a
    :goto_7
    new-instance v2, Lf61;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    invoke-direct {v2, v1, v3, v0}, Lf61;-><init>(IIZ)V

    .line 257
    .line 258
    .line 259
    filled-new-array {v2}, [Lf61;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    :cond_b
    if-eqz p7, :cond_c

    .line 264
    .line 265
    new-instance v0, Lc11;

    .line 266
    .line 267
    array-length v1, v3

    .line 268
    sub-int/2addr v1, v10

    .line 269
    const/4 v15, 0x0

    .line 270
    invoke-direct {v0, v15, v1, v10}, La11;-><init>(III)V

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_c
    const/4 v15, 0x0

    .line 275
    array-length v0, v3

    .line 276
    sub-int/2addr v0, v10

    .line 277
    new-instance v1, La11;

    .line 278
    .line 279
    const/4 v2, -0x1

    .line 280
    invoke-direct {v1, v0, v15, v2}, La11;-><init>(III)V

    .line 281
    .line 282
    .line 283
    move-object v0, v1

    .line 284
    :goto_8
    iget v1, v0, La11;->h:I

    .line 285
    .line 286
    iget v2, v0, La11;->i:I

    .line 287
    .line 288
    iget v0, v0, La11;->j:I

    .line 289
    .line 290
    if-lez v0, :cond_d

    .line 291
    .line 292
    if-le v1, v2, :cond_e

    .line 293
    .line 294
    :cond_d
    if-gez v0, :cond_0

    .line 295
    .line 296
    if-gt v2, v1, :cond_0

    .line 297
    .line 298
    :cond_e
    :goto_9
    aget-object v12, v3, v1

    .line 299
    .line 300
    iget-boolean v13, v12, Lf61;->c:Z

    .line 301
    .line 302
    iget v14, v12, Lf61;->a:I

    .line 303
    .line 304
    iget v12, v12, Lf61;->b:I

    .line 305
    .line 306
    if-eqz v13, :cond_f

    .line 307
    .line 308
    add-int/lit8 v15, v12, -0x1

    .line 309
    .line 310
    sub-int/2addr v15, v9

    .line 311
    mul-int/lit8 v15, v15, 0x2

    .line 312
    .line 313
    aget v15, v11, v15

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_f
    sub-int v15, v14, v9

    .line 317
    .line 318
    mul-int/lit8 v15, v15, 0x2

    .line 319
    .line 320
    aget v15, v11, v15

    .line 321
    .line 322
    :goto_a
    if-eqz v13, :cond_10

    .line 323
    .line 324
    invoke-static {v14, v9, v11}, Lgf1;->v(II[F)F

    .line 325
    .line 326
    .line 327
    move-result v16

    .line 328
    goto :goto_b

    .line 329
    :cond_10
    add-int/lit8 v10, v12, -0x1

    .line 330
    .line 331
    invoke-static {v10, v9, v11}, Lgf1;->v(II[F)F

    .line 332
    .line 333
    .line 334
    move-result v16

    .line 335
    :goto_b
    iget v10, v4, Landroid/graphics/RectF;->left:F

    .line 336
    .line 337
    move/from16 v17, v0

    .line 338
    .line 339
    if-eqz p7, :cond_24

    .line 340
    .line 341
    cmpl-float v18, v16, v10

    .line 342
    .line 343
    if-ltz v18, :cond_19

    .line 344
    .line 345
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 346
    .line 347
    cmpg-float v18, v15, v0

    .line 348
    .line 349
    if-gtz v18, :cond_19

    .line 350
    .line 351
    if-nez v13, :cond_11

    .line 352
    .line 353
    cmpg-float v10, v10, v15

    .line 354
    .line 355
    if-lez v10, :cond_12

    .line 356
    .line 357
    :cond_11
    if-eqz v13, :cond_13

    .line 358
    .line 359
    cmpl-float v0, v0, v16

    .line 360
    .line 361
    if-ltz v0, :cond_13

    .line 362
    .line 363
    :cond_12
    move v0, v14

    .line 364
    goto :goto_d

    .line 365
    :cond_13
    move v0, v12

    .line 366
    move v10, v14

    .line 367
    :goto_c
    sub-int v15, v0, v10

    .line 368
    .line 369
    move/from16 p3, v0

    .line 370
    .line 371
    const/4 v0, 0x1

    .line 372
    if-le v15, v0, :cond_17

    .line 373
    .line 374
    add-int v0, p3, v10

    .line 375
    .line 376
    div-int/lit8 v0, v0, 0x2

    .line 377
    .line 378
    sub-int v15, v0, v9

    .line 379
    .line 380
    mul-int/lit8 v15, v15, 0x2

    .line 381
    .line 382
    aget v15, v11, v15

    .line 383
    .line 384
    move/from16 v16, v0

    .line 385
    .line 386
    if-nez v13, :cond_14

    .line 387
    .line 388
    iget v0, v4, Landroid/graphics/RectF;->left:F

    .line 389
    .line 390
    cmpl-float v0, v15, v0

    .line 391
    .line 392
    if-gtz v0, :cond_15

    .line 393
    .line 394
    :cond_14
    if-eqz v13, :cond_16

    .line 395
    .line 396
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 397
    .line 398
    cmpg-float v0, v15, v0

    .line 399
    .line 400
    if-gez v0, :cond_16

    .line 401
    .line 402
    :cond_15
    move/from16 v0, v16

    .line 403
    .line 404
    goto :goto_c

    .line 405
    :cond_16
    move/from16 v0, p3

    .line 406
    .line 407
    move/from16 v10, v16

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_17
    if-eqz v13, :cond_18

    .line 411
    .line 412
    move/from16 v0, p3

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_18
    move v0, v10

    .line 416
    :goto_d
    invoke-interface {v5, v0}, Lom2;->c(I)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    const/4 v10, -0x1

    .line 421
    if-ne v0, v10, :cond_1b

    .line 422
    .line 423
    :cond_19
    :goto_e
    move-object/from16 v18, v3

    .line 424
    .line 425
    :cond_1a
    :goto_f
    const/4 v14, -0x1

    .line 426
    goto/16 :goto_1d

    .line 427
    .line 428
    :cond_1b
    invoke-interface {v5, v0}, Lom2;->b(I)I

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-lt v10, v12, :cond_1c

    .line 433
    .line 434
    goto :goto_e

    .line 435
    :cond_1c
    if-ge v10, v14, :cond_1d

    .line 436
    .line 437
    goto :goto_10

    .line 438
    :cond_1d
    move v14, v10

    .line 439
    :goto_10
    if-le v0, v12, :cond_1e

    .line 440
    .line 441
    move v0, v12

    .line 442
    :cond_1e
    new-instance v10, Landroid/graphics/RectF;

    .line 443
    .line 444
    int-to-float v15, v7

    .line 445
    move/from16 p3, v0

    .line 446
    .line 447
    int-to-float v0, v8

    .line 448
    move-object/from16 v18, v3

    .line 449
    .line 450
    const/4 v3, 0x0

    .line 451
    invoke-direct {v10, v3, v15, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 452
    .line 453
    .line 454
    move/from16 v0, p3

    .line 455
    .line 456
    :cond_1f
    :goto_11
    if-eqz v13, :cond_20

    .line 457
    .line 458
    add-int/lit8 v3, v0, -0x1

    .line 459
    .line 460
    sub-int/2addr v3, v9

    .line 461
    mul-int/lit8 v3, v3, 0x2

    .line 462
    .line 463
    aget v3, v11, v3

    .line 464
    .line 465
    goto :goto_12

    .line 466
    :cond_20
    sub-int v3, v14, v9

    .line 467
    .line 468
    mul-int/lit8 v3, v3, 0x2

    .line 469
    .line 470
    aget v3, v11, v3

    .line 471
    .line 472
    :goto_12
    iput v3, v10, Landroid/graphics/RectF;->left:F

    .line 473
    .line 474
    if-eqz v13, :cond_21

    .line 475
    .line 476
    invoke-static {v14, v9, v11}, Lgf1;->v(II[F)F

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    goto :goto_13

    .line 481
    :cond_21
    add-int/lit8 v0, v0, -0x1

    .line 482
    .line 483
    invoke-static {v0, v9, v11}, Lgf1;->v(II[F)F

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    :goto_13
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 488
    .line 489
    invoke-virtual {v6, v10, v4}, Ls9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    check-cast v0, Ljava/lang/Boolean;

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-eqz v0, :cond_22

    .line 500
    .line 501
    goto/16 :goto_1d

    .line 502
    .line 503
    :cond_22
    invoke-interface {v5, v14}, Lom2;->k(I)I

    .line 504
    .line 505
    .line 506
    move-result v14

    .line 507
    const/4 v0, -0x1

    .line 508
    if-eq v14, v0, :cond_1a

    .line 509
    .line 510
    if-lt v14, v12, :cond_23

    .line 511
    .line 512
    goto :goto_f

    .line 513
    :cond_23
    invoke-interface {v5, v14}, Lom2;->c(I)I

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-le v0, v12, :cond_1f

    .line 518
    .line 519
    move v0, v12

    .line 520
    goto :goto_11

    .line 521
    :cond_24
    move-object/from16 v18, v3

    .line 522
    .line 523
    cmpl-float v0, v16, v10

    .line 524
    .line 525
    if-ltz v0, :cond_2d

    .line 526
    .line 527
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 528
    .line 529
    cmpg-float v3, v15, v0

    .line 530
    .line 531
    if-gtz v3, :cond_2d

    .line 532
    .line 533
    if-nez v13, :cond_25

    .line 534
    .line 535
    cmpl-float v0, v0, v16

    .line 536
    .line 537
    if-gez v0, :cond_26

    .line 538
    .line 539
    :cond_25
    if-eqz v13, :cond_27

    .line 540
    .line 541
    cmpg-float v0, v10, v15

    .line 542
    .line 543
    if-gtz v0, :cond_27

    .line 544
    .line 545
    :cond_26
    add-int/lit8 v0, v12, -0x1

    .line 546
    .line 547
    :goto_14
    const/4 v15, 0x1

    .line 548
    goto :goto_16

    .line 549
    :cond_27
    move v0, v12

    .line 550
    move v3, v14

    .line 551
    :goto_15
    sub-int v10, v0, v3

    .line 552
    .line 553
    const/4 v15, 0x1

    .line 554
    if-le v10, v15, :cond_2b

    .line 555
    .line 556
    add-int v10, v0, v3

    .line 557
    .line 558
    div-int/lit8 v10, v10, 0x2

    .line 559
    .line 560
    sub-int v15, v10, v9

    .line 561
    .line 562
    mul-int/lit8 v15, v15, 0x2

    .line 563
    .line 564
    aget v15, v11, v15

    .line 565
    .line 566
    move/from16 p3, v0

    .line 567
    .line 568
    if-nez v13, :cond_28

    .line 569
    .line 570
    iget v0, v4, Landroid/graphics/RectF;->right:F

    .line 571
    .line 572
    cmpl-float v0, v15, v0

    .line 573
    .line 574
    if-gtz v0, :cond_29

    .line 575
    .line 576
    :cond_28
    if-eqz v13, :cond_2a

    .line 577
    .line 578
    iget v0, v4, Landroid/graphics/RectF;->left:F

    .line 579
    .line 580
    cmpg-float v0, v15, v0

    .line 581
    .line 582
    if-gez v0, :cond_2a

    .line 583
    .line 584
    :cond_29
    move v0, v10

    .line 585
    goto :goto_15

    .line 586
    :cond_2a
    move/from16 v0, p3

    .line 587
    .line 588
    move v3, v10

    .line 589
    goto :goto_15

    .line 590
    :cond_2b
    move/from16 p3, v0

    .line 591
    .line 592
    if-eqz v13, :cond_2c

    .line 593
    .line 594
    move/from16 v0, p3

    .line 595
    .line 596
    goto :goto_14

    .line 597
    :cond_2c
    move v0, v3

    .line 598
    goto :goto_14

    .line 599
    :goto_16
    add-int/2addr v0, v15

    .line 600
    invoke-interface {v5, v0}, Lom2;->b(I)I

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    const/4 v10, -0x1

    .line 605
    if-ne v0, v10, :cond_2e

    .line 606
    .line 607
    :cond_2d
    :goto_17
    const/4 v12, -0x1

    .line 608
    goto :goto_1c

    .line 609
    :cond_2e
    invoke-interface {v5, v0}, Lom2;->c(I)I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    if-gt v3, v14, :cond_2f

    .line 614
    .line 615
    goto :goto_17

    .line 616
    :cond_2f
    if-ge v0, v14, :cond_30

    .line 617
    .line 618
    move v0, v14

    .line 619
    :cond_30
    if-le v3, v12, :cond_31

    .line 620
    .line 621
    goto :goto_18

    .line 622
    :cond_31
    move v12, v3

    .line 623
    :goto_18
    new-instance v3, Landroid/graphics/RectF;

    .line 624
    .line 625
    int-to-float v10, v7

    .line 626
    int-to-float v15, v8

    .line 627
    move/from16 p3, v0

    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    invoke-direct {v3, v0, v10, v0, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 631
    .line 632
    .line 633
    move/from16 v0, p3

    .line 634
    .line 635
    :cond_32
    :goto_19
    if-eqz v13, :cond_33

    .line 636
    .line 637
    add-int/lit8 v10, v12, -0x1

    .line 638
    .line 639
    sub-int/2addr v10, v9

    .line 640
    mul-int/lit8 v10, v10, 0x2

    .line 641
    .line 642
    aget v10, v11, v10

    .line 643
    .line 644
    goto :goto_1a

    .line 645
    :cond_33
    sub-int v10, v0, v9

    .line 646
    .line 647
    mul-int/lit8 v10, v10, 0x2

    .line 648
    .line 649
    aget v10, v11, v10

    .line 650
    .line 651
    :goto_1a
    iput v10, v3, Landroid/graphics/RectF;->left:F

    .line 652
    .line 653
    if-eqz v13, :cond_34

    .line 654
    .line 655
    invoke-static {v0, v9, v11}, Lgf1;->v(II[F)F

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    goto :goto_1b

    .line 660
    :cond_34
    add-int/lit8 v0, v12, -0x1

    .line 661
    .line 662
    invoke-static {v0, v9, v11}, Lgf1;->v(II[F)F

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    :goto_1b
    iput v0, v3, Landroid/graphics/RectF;->right:F

    .line 667
    .line 668
    invoke-virtual {v6, v3, v4}, Ls9;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    check-cast v0, Ljava/lang/Boolean;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-eqz v0, :cond_35

    .line 679
    .line 680
    goto :goto_1c

    .line 681
    :cond_35
    invoke-interface {v5, v12}, Lom2;->l(I)I

    .line 682
    .line 683
    .line 684
    move-result v12

    .line 685
    const/4 v10, -0x1

    .line 686
    if-eq v12, v10, :cond_2d

    .line 687
    .line 688
    if-gt v12, v14, :cond_36

    .line 689
    .line 690
    goto :goto_17

    .line 691
    :cond_36
    invoke-interface {v5, v12}, Lom2;->b(I)I

    .line 692
    .line 693
    .line 694
    move-result v0

    .line 695
    if-ge v0, v14, :cond_32

    .line 696
    .line 697
    move v0, v14

    .line 698
    goto :goto_19

    .line 699
    :goto_1c
    move v14, v12

    .line 700
    :goto_1d
    if-ltz v14, :cond_37

    .line 701
    .line 702
    return v14

    .line 703
    :cond_37
    if-eq v1, v2, :cond_0

    .line 704
    .line 705
    add-int v1, v1, v17

    .line 706
    .line 707
    move/from16 v0, v17

    .line 708
    .line 709
    move-object/from16 v3, v18

    .line 710
    .line 711
    const/4 v10, 0x1

    .line 712
    goto/16 :goto_9

    .line 713
    .line 714
    :goto_1e
    return v10
.end method

.method public static z(Lt00;)Lt00;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lu00;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Lu00;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object p0, v0, Lu00;->j:Lt00;

    .line 16
    .line 17
    if-nez p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Lu00;->f()La20;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v1, Lgd3;->p:Lgd3;

    .line 24
    .line 25
    invoke-interface {p0, v1}, La20;->o(Lz10;)Ly10;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lc20;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    new-instance v1, Lk90;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0}, Lk90;-><init>(Lc20;Lu00;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v1, v0

    .line 40
    :goto_1
    iput-object v1, v0, Lu00;->j:Lt00;

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    return-object p0
.end method
