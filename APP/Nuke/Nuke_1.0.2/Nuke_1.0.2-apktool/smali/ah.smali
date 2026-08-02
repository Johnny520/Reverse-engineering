.class public final synthetic Lah;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lah;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lah;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lah;->a:Lah;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.chat.AutoReceiveRedPacket.AutoReceiveRedPacketConf"

    .line 11
    .line 12
    const/4 v3, 0x6

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
    const-string v0, "receiveMode"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "useWhitelist"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "whitelist"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "blacklist"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "autoReplyConf"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lah;->descriptor:Lyo2;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, Lah;->descriptor:Lyo2;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ly40;->b(Lyo2;)Lvx;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lch;->g:[Lj71;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move v9, v4

    .line 17
    move v12, v9

    .line 18
    move v13, v12

    .line 19
    move-wide v10, v5

    .line 20
    move-object v14, v7

    .line 21
    move-object v15, v14

    .line 22
    move v5, v3

    .line 23
    :goto_0
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, Lvx;->j(Lyo2;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    packed-switch v6, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance v0, Le83;

    .line 33
    .line 34
    invoke-direct {v0, v6}, Le83;-><init>(I)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_0
    const/4 v6, 0x5

    .line 39
    sget-object v8, Ldh;->a:Ldh;

    .line 40
    .line 41
    invoke-interface {v1, v0, v6, v8, v7}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    move-object v7, v6

    .line 46
    check-cast v7, Lfh;

    .line 47
    .line 48
    or-int/lit8 v9, v9, 0x20

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    const/4 v6, 0x4

    .line 52
    aget-object v8, v2, v6

    .line 53
    .line 54
    invoke-interface {v8}, Lj71;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Lw41;

    .line 59
    .line 60
    invoke-interface {v1, v0, v6, v8, v15}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    move-object v15, v6

    .line 65
    check-cast v15, Ljava/util/Set;

    .line 66
    .line 67
    or-int/lit8 v9, v9, 0x10

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_2
    const/4 v6, 0x3

    .line 71
    aget-object v8, v2, v6

    .line 72
    .line 73
    invoke-interface {v8}, Lj71;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Lw41;

    .line 78
    .line 79
    invoke-interface {v1, v0, v6, v8, v14}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    move-object v14, v6

    .line 84
    check-cast v14, Ljava/util/Set;

    .line 85
    .line 86
    or-int/lit8 v9, v9, 0x8

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_3
    const/4 v6, 0x2

    .line 90
    invoke-interface {v1, v0, v6}, Lvx;->q(Lyo2;I)Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    or-int/lit8 v9, v9, 0x4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_4
    invoke-interface {v1, v0, v3}, Lvx;->u(Lyo2;I)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    or-int/lit8 v9, v9, 0x2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_5
    invoke-interface {v1, v0, v4}, Lvx;->z(Lyo2;I)J

    .line 105
    .line 106
    .line 107
    move-result-wide v10

    .line 108
    or-int/lit8 v9, v9, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_6
    move v5, v4

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-interface {v1, v0}, Lvx;->a(Lyo2;)V

    .line 114
    .line 115
    .line 116
    new-instance v8, Lch;

    .line 117
    .line 118
    move-object/from16 v16, v7

    .line 119
    .line 120
    invoke-direct/range {v8 .. v16}, Lch;-><init>(IJIZLjava/util/Set;Ljava/util/Set;Lfh;)V

    .line 121
    .line 122
    .line 123
    return-object v8

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()[Lw41;
    .locals 3

    .line 1
    sget-object p0, Lch;->g:[Lj71;

    .line 2
    .line 3
    const/4 v0, 0x6

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
    sget-object v2, Lf11;->a:Lf11;

    .line 13
    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    sget-object v2, Lll;->a:Lll;

    .line 18
    .line 19
    aput-object v2, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    aget-object v2, p0, v1

    .line 23
    .line 24
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    aget-object p0, p0, v1

    .line 32
    .line 33
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    aput-object p0, v0, v1

    .line 38
    .line 39
    const/4 p0, 0x5

    .line 40
    sget-object v1, Ldh;->a:Ldh;

    .line 41
    .line 42
    aput-object v1, v0, p0

    .line 43
    .line 44
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p2, Lch;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lch;->f:Lfh;

    .line 7
    .line 8
    iget-object v0, p2, Lch;->e:Ljava/util/Set;

    .line 9
    .line 10
    iget-object v1, p2, Lch;->d:Ljava/util/Set;

    .line 11
    .line 12
    iget-boolean v2, p2, Lch;->c:Z

    .line 13
    .line 14
    iget v3, p2, Lch;->b:I

    .line 15
    .line 16
    iget-wide v4, p2, Lch;->a:J

    .line 17
    .line 18
    sget-object p2, Lah;->descriptor:Lyo2;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Lve0;->b(Lyo2;)Lwx;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object v6, Lch;->g:[Lj71;

    .line 25
    .line 26
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    cmp-long v7, v4, v7

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    :goto_0
    move-object v7, p1

    .line 40
    check-cast v7, Ldv2;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-virtual {v7, p2, v8, v4, v5}, Ldv2;->v(Lyo2;IJ)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    if-eq v3, v5, :cond_3

    .line 55
    .line 56
    :goto_1
    move-object v4, p1

    .line 57
    check-cast v4, Ldv2;

    .line 58
    .line 59
    invoke-virtual {v4, v5, v3, p2}, Ldv2;->u(IILyo2;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    if-eqz v2, :cond_5

    .line 70
    .line 71
    :goto_2
    move-object v3, p1

    .line 72
    check-cast v3, Ldv2;

    .line 73
    .line 74
    const/4 v4, 0x2

    .line 75
    invoke-virtual {v3, p2, v4, v2}, Ldv2;->r(Lyo2;IZ)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sget-object v3, Lfe0;->h:Lfe0;

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_7

    .line 92
    .line 93
    :goto_3
    const/4 v2, 0x3

    .line 94
    aget-object v4, v6, v2

    .line 95
    .line 96
    invoke-interface {v4}, Lj71;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Lw41;

    .line 101
    .line 102
    move-object v5, p1

    .line 103
    check-cast v5, Ldv2;

    .line 104
    .line 105
    invoke-virtual {v5, p2, v2, v4, v1}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_8
    invoke-static {v0, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_9

    .line 120
    .line 121
    :goto_4
    const/4 v1, 0x4

    .line 122
    aget-object v2, v6, v1

    .line 123
    .line 124
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Lw41;

    .line 129
    .line 130
    move-object v3, p1

    .line 131
    check-cast v3, Ldv2;

    .line 132
    .line 133
    invoke-virtual {v3, p2, v1, v2, v0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_9
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_a

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_a
    new-instance v0, Lfh;

    .line 144
    .line 145
    invoke-direct {v0}, Lfh;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_b

    .line 153
    .line 154
    :goto_5
    sget-object v0, Ldh;->a:Ldh;

    .line 155
    .line 156
    move-object v1, p1

    .line 157
    check-cast v1, Ldv2;

    .line 158
    .line 159
    const/4 v2, 0x5

    .line 160
    invoke-virtual {v1, p2, v2, v0, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_b
    invoke-interface {p1, p2}, Lwx;->a(Lyo2;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lah;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
