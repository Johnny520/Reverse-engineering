.class public final synthetic Lf;
.super Lhx;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 1
    iput p7, p0, Lf;->d:I

    .line 2
    .line 3
    move-object v0, p4

    .line 4
    move-object p4, p2

    .line 5
    move p2, p6

    .line 6
    move-object p6, p5

    .line 7
    move-object p5, v0

    .line 8
    invoke-direct/range {p0 .. p6}, Lgx;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf;->d:I

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    iget-object v0, v0, Lqc;->receiver:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lf40;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lf40;->s(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :pswitch_0
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v0, v0, Lqc;->receiver:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ln;

    .line 33
    .line 34
    iget-object v3, v0, Ln;->F:Lzg0;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Ln;->G0()V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    iget-object v1, v0, Ln;->t:Lxg0;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    iget-object v1, v3, Lzg0;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v5, v3, Lzg0;->a:[J

    .line 51
    .line 52
    array-length v6, v5

    .line 53
    add-int/lit8 v6, v6, -0x2

    .line 54
    .line 55
    const/4 v7, 0x3

    .line 56
    if-ltz v6, :cond_4

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    move v9, v8

    .line 60
    :goto_0
    aget-wide v10, v5, v9

    .line 61
    .line 62
    not-long v12, v10

    .line 63
    const/4 v14, 0x7

    .line 64
    shl-long/2addr v12, v14

    .line 65
    and-long/2addr v12, v10

    .line 66
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v12, v14

    .line 72
    cmp-long v12, v12, v14

    .line 73
    .line 74
    if-eqz v12, :cond_3

    .line 75
    .line 76
    sub-int v12, v9, v6

    .line 77
    .line 78
    not-int v12, v12

    .line 79
    ushr-int/lit8 v12, v12, 0x1f

    .line 80
    .line 81
    const/16 v13, 0x8

    .line 82
    .line 83
    rsub-int/lit8 v12, v12, 0x8

    .line 84
    .line 85
    move v14, v8

    .line 86
    :goto_1
    if-ge v14, v12, :cond_2

    .line 87
    .line 88
    const-wide/16 v15, 0xff

    .line 89
    .line 90
    and-long/2addr v15, v10

    .line 91
    const-wide/16 v17, 0x80

    .line 92
    .line 93
    cmp-long v15, v15, v17

    .line 94
    .line 95
    if-gez v15, :cond_1

    .line 96
    .line 97
    shl-int/lit8 v15, v9, 0x3

    .line 98
    .line 99
    add-int/2addr v15, v14

    .line 100
    aget-object v15, v1, v15

    .line 101
    .line 102
    check-cast v15, Ljs0;

    .line 103
    .line 104
    move/from16 p0, v13

    .line 105
    .line 106
    invoke-virtual {v0}, Loe0;->k0()Lyk;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    move-object/from16 v16, v1

    .line 111
    .line 112
    new-instance v1, Ll;

    .line 113
    .line 114
    invoke-direct {v1, v0, v15, v4, v8}, Ll;-><init>(Ln;Ljs0;Lik;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v13, v4, v1, v7}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_1
    move-object/from16 v16, v1

    .line 122
    .line 123
    move/from16 p0, v13

    .line 124
    .line 125
    :goto_2
    shr-long v10, v10, p0

    .line 126
    .line 127
    add-int/lit8 v14, v14, 0x1

    .line 128
    .line 129
    move/from16 v13, p0

    .line 130
    .line 131
    move-object/from16 v1, v16

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    move-object/from16 v16, v1

    .line 135
    .line 136
    move v1, v13

    .line 137
    if-ne v12, v1, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    move-object/from16 v16, v1

    .line 141
    .line 142
    :goto_3
    if-eq v9, v6, :cond_4

    .line 143
    .line 144
    add-int/lit8 v9, v9, 0x1

    .line 145
    .line 146
    move-object/from16 v1, v16

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    iget-object v1, v0, Ln;->H:Ljs0;

    .line 150
    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    invoke-virtual {v0}, Loe0;->k0()Lyk;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v6, Ll;

    .line 158
    .line 159
    const/4 v8, 0x1

    .line 160
    invoke-direct {v6, v0, v1, v4, v8}, Ll;-><init>(Ln;Ljs0;Lik;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v5, v4, v6, v7}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-virtual {v3}, Lzg0;->a()V

    .line 167
    .line 168
    .line 169
    iput-object v4, v0, Ln;->H:Ljs0;

    .line 170
    .line 171
    invoke-virtual {v0}, Ln;->H0()V

    .line 172
    .line 173
    .line 174
    :goto_4
    return-object v2

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
