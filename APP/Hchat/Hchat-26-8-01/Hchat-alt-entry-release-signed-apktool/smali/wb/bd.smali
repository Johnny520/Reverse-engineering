.class public final synthetic Lwb/bd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLandroid/app/Activity;Lfg/l;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/bd;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, Lwb/bd;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p1, p0, Lwb/bd;->i:J

    .line 10
    .line 11
    iput-object p3, p0, Lwb/bd;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/bd;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/util/List;JLjava/lang/String;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lwb/bd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/bd;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/bd;->k:Ljava/lang/Object;

    iput-wide p3, p0, Lwb/bd;->i:J

    iput-object p5, p0, Lwb/bd;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/bd;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/bd;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v6, v1

    .line 11
    check-cast v6, Landroid/app/Activity;

    .line 12
    .line 13
    iget-object v1, v0, Lwb/bd;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Lfg/l;

    .line 17
    .line 18
    move-object/from16 v5, p1

    .line 19
    .line 20
    check-cast v5, Lfg/a;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Li0/h0;

    .line 25
    .line 26
    move-object/from16 v2, p3

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v3, v2, 0x6

    .line 38
    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v3, 0x2

    .line 50
    :goto_0
    or-int/2addr v2, v3

    .line 51
    :cond_1
    move v8, v2

    .line 52
    and-int/lit8 v2, v8, 0x13

    .line 53
    .line 54
    const/16 v3, 0x12

    .line 55
    .line 56
    if-eq v2, v3, :cond_2

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v2, 0x0

    .line 61
    :goto_1
    and-int/lit8 v3, v8, 0x1

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Li0/h0;->S(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    new-instance v2, Lwb/kf;

    .line 70
    .line 71
    iget-wide v3, v0, Lwb/bd;->i:J

    .line 72
    .line 73
    invoke-direct/range {v2 .. v7}, Lwb/kf;-><init>(JLfg/a;Landroid/app/Activity;Lfg/l;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v17, v5

    .line 77
    .line 78
    const v3, 0x69fc74c8

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v2, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 82
    .line 83
    .line 84
    move-result-object v23

    .line 85
    shl-int/lit8 v2, v8, 0x18

    .line 86
    .line 87
    const/high16 v3, 0xe000000

    .line 88
    .line 89
    and-int/2addr v2, v3

    .line 90
    or-int/lit8 v25, v2, 0x6

    .line 91
    .line 92
    const/16 v26, 0xc00

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    iget-object v9, v0, Lwb/bd;->h:Ljava/lang/String;

    .line 96
    .line 97
    const-wide/16 v10, 0x0

    .line 98
    .line 99
    const-wide/16 v12, 0x0

    .line 100
    .line 101
    const-wide/16 v14, 0x0

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const-wide/16 v18, 0x0

    .line 106
    .line 107
    const-wide/16 v20, 0x0

    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    move-object/from16 v24, v1

    .line 112
    .line 113
    invoke-static/range {v8 .. v26}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    move-object/from16 v24, v1

    .line 118
    .line 119
    invoke-virtual/range {v24 .. v24}, Li0/h0;->V()V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_0
    iget-object v1, v0, Lwb/bd;->j:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v3, v1

    .line 128
    check-cast v3, Landroid/content/SharedPreferences;

    .line 129
    .line 130
    iget-object v1, v0, Lwb/bd;->k:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v4, v1

    .line 133
    check-cast v4, Ljava/util/List;

    .line 134
    .line 135
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, Lr/d;

    .line 138
    .line 139
    move-object/from16 v8, p2

    .line 140
    .line 141
    check-cast v8, Li0/h0;

    .line 142
    .line 143
    move-object/from16 v2, p3

    .line 144
    .line 145
    check-cast v2, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    and-int/lit8 v1, v2, 0x11

    .line 155
    .line 156
    const/16 v5, 0x10

    .line 157
    .line 158
    const/4 v9, 0x1

    .line 159
    if-eq v1, v5, :cond_4

    .line 160
    .line 161
    move v1, v9

    .line 162
    goto :goto_3

    .line 163
    :cond_4
    const/4 v1, 0x0

    .line 164
    :goto_3
    and-int/2addr v2, v9

    .line 165
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    new-instance v2, Lwb/kf;

    .line 172
    .line 173
    iget-wide v5, v0, Lwb/bd;->i:J

    .line 174
    .line 175
    iget-object v7, v0, Lwb/bd;->h:Ljava/lang/String;

    .line 176
    .line 177
    invoke-direct/range {v2 .. v7}, Lwb/kf;-><init>(Landroid/content/SharedPreferences;Ljava/util/List;JLjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const v1, -0x475f559d

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    const/16 v2, 0x30

    .line 188
    .line 189
    const/4 v3, 0x0

    .line 190
    invoke-static {v3, v1, v8, v2, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_5
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 195
    .line 196
    .line 197
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 198
    .line 199
    return-object v1

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
