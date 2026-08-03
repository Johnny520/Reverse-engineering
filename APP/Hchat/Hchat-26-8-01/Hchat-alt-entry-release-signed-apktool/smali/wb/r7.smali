.class public final synthetic Lwb/r7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/r7;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/r7;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/r7;->i:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/r7;->j:Lfg/a;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/r7;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/r7;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/r7;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/r7;->n:Li0/a1;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lwb/r7;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/r7;->i:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/r7;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/r7;->j:Lfg/a;

    iput-object p4, p0, Lwb/r7;->k:Li0/a1;

    iput-object p5, p0, Lwb/r7;->l:Li0/a1;

    iput-object p6, p0, Lwb/r7;->m:Li0/a1;

    iput-object p7, p0, Lwb/r7;->n:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/r7;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lth/a;

    .line 11
    .line 12
    move-object/from16 v8, p2

    .line 13
    .line 14
    check-cast v8, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v1, v2, 0x11

    .line 28
    .line 29
    const/16 v3, 0x10

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq v1, v3, :cond_0

    .line 33
    .line 34
    move v1, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    and-int/2addr v2, v4

    .line 38
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object v10, v0, Lwb/r7;->h:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v11, v0, Lwb/r7;->i:Landroid/content/SharedPreferences;

    .line 51
    .line 52
    invoke-virtual {v8, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    or-int/2addr v1, v2

    .line 57
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    sget-object v1, Li0/l;->a:Li0/e;

    .line 64
    .line 65
    if-ne v2, v1, :cond_2

    .line 66
    .line 67
    :cond_1
    new-instance v9, Lwb/tk;

    .line 68
    .line 69
    iget-object v12, v0, Lwb/r7;->k:Li0/a1;

    .line 70
    .line 71
    iget-object v13, v0, Lwb/r7;->l:Li0/a1;

    .line 72
    .line 73
    iget-object v14, v0, Lwb/r7;->m:Li0/a1;

    .line 74
    .line 75
    iget-object v15, v0, Lwb/r7;->n:Li0/a1;

    .line 76
    .line 77
    invoke-direct/range {v9 .. v15}, Lwb/tk;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v9

    .line 84
    :cond_2
    move-object v3, v2

    .line 85
    check-cast v3, Lfg/a;

    .line 86
    .line 87
    const/16 v9, 0x186

    .line 88
    .line 89
    const/16 v10, 0x30

    .line 90
    .line 91
    const-string v2, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 92
    .line 93
    const-string v4, "\u8fd4\u56de"

    .line 94
    .line 95
    iget-object v5, v0, Lwb/r7;->j:Lfg/a;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    invoke-static/range {v2 .. v10}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_0
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, Lth/a;

    .line 112
    .line 113
    move-object/from16 v8, p2

    .line 114
    .line 115
    check-cast v8, Li0/h0;

    .line 116
    .line 117
    move-object/from16 v2, p3

    .line 118
    .line 119
    check-cast v2, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 v1, v2, 0x11

    .line 129
    .line 130
    const/16 v3, 0x10

    .line 131
    .line 132
    const/4 v4, 0x1

    .line 133
    if-eq v1, v3, :cond_4

    .line 134
    .line 135
    move v1, v4

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const/4 v1, 0x0

    .line 138
    :goto_2
    and-int/2addr v2, v4

    .line 139
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    iget-object v10, v0, Lwb/r7;->i:Landroid/content/SharedPreferences;

    .line 146
    .line 147
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iget-object v11, v0, Lwb/r7;->h:Landroid/content/Context;

    .line 152
    .line 153
    invoke-virtual {v8, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    or-int/2addr v1, v2

    .line 158
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-nez v1, :cond_5

    .line 163
    .line 164
    sget-object v1, Li0/l;->a:Li0/e;

    .line 165
    .line 166
    if-ne v2, v1, :cond_6

    .line 167
    .line 168
    :cond_5
    new-instance v9, Lwb/tk;

    .line 169
    .line 170
    iget-object v12, v0, Lwb/r7;->k:Li0/a1;

    .line 171
    .line 172
    iget-object v13, v0, Lwb/r7;->l:Li0/a1;

    .line 173
    .line 174
    iget-object v14, v0, Lwb/r7;->m:Li0/a1;

    .line 175
    .line 176
    iget-object v15, v0, Lwb/r7;->n:Li0/a1;

    .line 177
    .line 178
    invoke-direct/range {v9 .. v15}, Lwb/tk;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move-object v2, v9

    .line 185
    :cond_6
    move-object v3, v2

    .line 186
    check-cast v3, Lfg/a;

    .line 187
    .line 188
    const/16 v9, 0x186

    .line 189
    .line 190
    const/16 v10, 0x30

    .line 191
    .line 192
    const-string v2, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 193
    .line 194
    const-string v4, "\u8fd4\u56de"

    .line 195
    .line 196
    iget-object v5, v0, Lwb/r7;->j:Lfg/a;

    .line 197
    .line 198
    const/4 v6, 0x0

    .line 199
    const/4 v7, 0x0

    .line 200
    invoke-static/range {v2 .. v10}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_7
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 205
    .line 206
    .line 207
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 208
    .line 209
    return-object v1

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
