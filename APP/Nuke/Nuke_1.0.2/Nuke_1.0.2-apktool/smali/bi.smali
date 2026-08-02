.class public final synthetic Lbi;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lbi;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbi;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbi;->a:Lbi;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.chat.AutoReceiveTransferMoney.AutoReceiveTransferMoneyConf"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "waitTime"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "useWhitelist"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "whitelist"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "blacklist"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "autoReplyConf"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lbi;->descriptor:Lyo2;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object p0, Lbi;->descriptor:Lyo2;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ly40;->b(Lyo2;)Lvx;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Ldi;->f:[Lj71;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move v7, v2

    .line 15
    move v10, v7

    .line 16
    move-wide v8, v3

    .line 17
    move-object v11, v5

    .line 18
    move-object v12, v11

    .line 19
    move-object v13, v12

    .line 20
    move v3, v1

    .line 21
    :goto_0
    if-eqz v3, :cond_6

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, -0x1

    .line 28
    if-eq v4, v5, :cond_5

    .line 29
    .line 30
    if-eqz v4, :cond_4

    .line 31
    .line 32
    if-eq v4, v1, :cond_3

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    if-eq v4, v5, :cond_2

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    if-eq v4, v5, :cond_1

    .line 39
    .line 40
    const/4 v5, 0x4

    .line 41
    if-ne v4, v5, :cond_0

    .line 42
    .line 43
    sget-object v4, Lei;->a:Lei;

    .line 44
    .line 45
    invoke-interface {p1, p0, v5, v4, v13}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v13, v4

    .line 50
    check-cast v13, Lgi;

    .line 51
    .line 52
    or-int/lit8 v7, v7, 0x10

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p0, Le83;

    .line 56
    .line 57
    invoke-direct {p0, v4}, Le83;-><init>(I)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_1
    aget-object v4, v0, v5

    .line 62
    .line 63
    invoke-interface {v4}, Lj71;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lw41;

    .line 68
    .line 69
    invoke-interface {p1, p0, v5, v4, v12}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move-object v12, v4

    .line 74
    check-cast v12, Ljava/util/Set;

    .line 75
    .line 76
    or-int/lit8 v7, v7, 0x8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    aget-object v4, v0, v5

    .line 80
    .line 81
    invoke-interface {v4}, Lj71;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Lw41;

    .line 86
    .line 87
    invoke-interface {p1, p0, v5, v4, v11}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object v11, v4

    .line 92
    check-cast v11, Ljava/util/Set;

    .line 93
    .line 94
    or-int/lit8 v7, v7, 0x4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-interface {p1, p0, v1}, Lvx;->q(Lyo2;I)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    or-int/lit8 v7, v7, 0x2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-interface {p1, p0, v2}, Lvx;->z(Lyo2;I)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    or-int/lit8 v7, v7, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    move v3, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 114
    .line 115
    .line 116
    new-instance v6, Ldi;

    .line 117
    .line 118
    invoke-direct/range {v6 .. v13}, Ldi;-><init>(IJZLjava/util/Set;Ljava/util/Set;Lgi;)V

    .line 119
    .line 120
    .line 121
    return-object v6
.end method

.method public final b()[Lw41;
    .locals 3

    .line 1
    sget-object p0, Ldi;->f:[Lj71;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [Lw41;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, Led1;->a:Led1;

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    sget-object v2, Lll;->a:Lll;

    .line 13
    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    aget-object v2, p0, v1

    .line 18
    .line 19
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    aget-object p0, p0, v1

    .line 27
    .line 28
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    aput-object p0, v0, v1

    .line 33
    .line 34
    const/4 p0, 0x4

    .line 35
    sget-object v1, Lei;->a:Lei;

    .line 36
    .line 37
    aput-object v1, v0, p0

    .line 38
    .line 39
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p2, Ldi;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Ldi;->e:Lgi;

    .line 7
    .line 8
    iget-object v0, p2, Ldi;->d:Ljava/util/Set;

    .line 9
    .line 10
    iget-object v1, p2, Ldi;->c:Ljava/util/Set;

    .line 11
    .line 12
    iget-boolean v2, p2, Ldi;->b:Z

    .line 13
    .line 14
    iget-wide v3, p2, Ldi;->a:J

    .line 15
    .line 16
    sget-object p2, Lbi;->descriptor:Lyo2;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lve0;->b(Lyo2;)Lwx;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v5, Ldi;->f:[Lj71;

    .line 23
    .line 24
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v6, v3, v6

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    :goto_0
    move-object v6, p1

    .line 38
    check-cast v6, Ldv2;

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-virtual {v6, p2, v7, v3, v4}, Ldv2;->v(Lyo2;IJ)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    if-eqz v2, :cond_3

    .line 52
    .line 53
    :goto_1
    move-object v3, p1

    .line 54
    check-cast v3, Ldv2;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-virtual {v3, p2, v4, v2}, Ldv2;->r(Lyo2;IZ)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    sget-object v3, Lfe0;->h:Lfe0;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_5

    .line 74
    .line 75
    :goto_2
    const/4 v2, 0x2

    .line 76
    aget-object v4, v5, v2

    .line 77
    .line 78
    invoke-interface {v4}, Lj71;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lw41;

    .line 83
    .line 84
    move-object v6, p1

    .line 85
    check-cast v6, Ldv2;

    .line 86
    .line 87
    invoke-virtual {v6, p2, v2, v4, v1}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    invoke-static {v0, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_7

    .line 102
    .line 103
    :goto_3
    const/4 v1, 0x3

    .line 104
    aget-object v2, v5, v1

    .line 105
    .line 106
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lw41;

    .line 111
    .line 112
    move-object v3, p1

    .line 113
    check-cast v3, Ldv2;

    .line 114
    .line 115
    invoke-virtual {v3, p2, v1, v2, v0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_8
    new-instance v0, Lgi;

    .line 126
    .line 127
    invoke-direct {v0}, Lgi;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_9

    .line 135
    .line 136
    :goto_4
    sget-object v0, Lei;->a:Lei;

    .line 137
    .line 138
    move-object v1, p1

    .line 139
    check-cast v1, Ldv2;

    .line 140
    .line 141
    const/4 v2, 0x4

    .line 142
    invoke-virtual {v1, p2, v2, v0, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_9
    invoke-interface {p1, p2}, Lwx;->a(Lyo2;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lbi;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
