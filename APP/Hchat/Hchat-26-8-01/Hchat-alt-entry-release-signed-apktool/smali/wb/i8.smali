.class public final synthetic Lwb/i8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p10, p0, Lwb/i8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/i8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/i8;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/i8;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/i8;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/i8;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/i8;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/i8;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/i8;->o:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/i8;->p:Li0/a1;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/i8;->g:I

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
    iget-object v10, v0, Lwb/i8;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v11, v0, Lwb/i8;->i:Landroid/content/Context;

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
    new-instance v9, Lwb/wk;

    .line 68
    .line 69
    const/16 v18, 0x1

    .line 70
    .line 71
    iget-object v12, v0, Lwb/i8;->k:Li0/a1;

    .line 72
    .line 73
    iget-object v13, v0, Lwb/i8;->l:Li0/a1;

    .line 74
    .line 75
    iget-object v14, v0, Lwb/i8;->m:Li0/a1;

    .line 76
    .line 77
    iget-object v15, v0, Lwb/i8;->n:Li0/a1;

    .line 78
    .line 79
    iget-object v1, v0, Lwb/i8;->o:Li0/a1;

    .line 80
    .line 81
    iget-object v2, v0, Lwb/i8;->p:Li0/a1;

    .line 82
    .line 83
    move-object/from16 v16, v1

    .line 84
    .line 85
    move-object/from16 v17, v2

    .line 86
    .line 87
    invoke-direct/range {v9 .. v18}, Lwb/wk;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v2, v9

    .line 94
    :cond_2
    move-object v3, v2

    .line 95
    check-cast v3, Lfg/a;

    .line 96
    .line 97
    const/16 v9, 0x186

    .line 98
    .line 99
    const/16 v10, 0x30

    .line 100
    .line 101
    const-string v2, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 102
    .line 103
    const-string v4, "\u8fd4\u56de"

    .line 104
    .line 105
    iget-object v5, v0, Lwb/i8;->j:Lfg/a;

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    invoke-static/range {v2 .. v10}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 114
    .line 115
    .line 116
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 117
    .line 118
    return-object v1

    .line 119
    :pswitch_0
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, Lth/a;

    .line 122
    .line 123
    move-object/from16 v8, p2

    .line 124
    .line 125
    check-cast v8, Li0/h0;

    .line 126
    .line 127
    move-object/from16 v2, p3

    .line 128
    .line 129
    check-cast v2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    and-int/lit8 v1, v2, 0x11

    .line 139
    .line 140
    const/16 v3, 0x10

    .line 141
    .line 142
    const/4 v4, 0x1

    .line 143
    if-eq v1, v3, :cond_4

    .line 144
    .line 145
    move v1, v4

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    const/4 v1, 0x0

    .line 148
    :goto_2
    and-int/2addr v2, v4

    .line 149
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    iget-object v10, v0, Lwb/i8;->h:Landroid/content/SharedPreferences;

    .line 156
    .line 157
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iget-object v11, v0, Lwb/i8;->i:Landroid/content/Context;

    .line 162
    .line 163
    invoke-virtual {v8, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    or-int/2addr v1, v2

    .line 168
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-nez v1, :cond_5

    .line 173
    .line 174
    sget-object v1, Li0/l;->a:Li0/e;

    .line 175
    .line 176
    if-ne v2, v1, :cond_6

    .line 177
    .line 178
    :cond_5
    new-instance v9, Lwb/wk;

    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    iget-object v12, v0, Lwb/i8;->k:Li0/a1;

    .line 183
    .line 184
    iget-object v13, v0, Lwb/i8;->l:Li0/a1;

    .line 185
    .line 186
    iget-object v14, v0, Lwb/i8;->m:Li0/a1;

    .line 187
    .line 188
    iget-object v15, v0, Lwb/i8;->n:Li0/a1;

    .line 189
    .line 190
    iget-object v1, v0, Lwb/i8;->o:Li0/a1;

    .line 191
    .line 192
    iget-object v2, v0, Lwb/i8;->p:Li0/a1;

    .line 193
    .line 194
    move-object/from16 v16, v1

    .line 195
    .line 196
    move-object/from16 v17, v2

    .line 197
    .line 198
    invoke-direct/range {v9 .. v18}, Lwb/wk;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    move-object v2, v9

    .line 205
    :cond_6
    move-object v3, v2

    .line 206
    check-cast v3, Lfg/a;

    .line 207
    .line 208
    const/16 v9, 0x186

    .line 209
    .line 210
    const/16 v10, 0x30

    .line 211
    .line 212
    const-string v2, "\u4fdd\u5b58\u8bbe\u7f6e"

    .line 213
    .line 214
    const-string v4, "\u8fd4\u56de"

    .line 215
    .line 216
    iget-object v5, v0, Lwb/i8;->j:Lfg/a;

    .line 217
    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    invoke-static/range {v2 .. v10}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 225
    .line 226
    .line 227
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 228
    .line 229
    return-object v1

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
