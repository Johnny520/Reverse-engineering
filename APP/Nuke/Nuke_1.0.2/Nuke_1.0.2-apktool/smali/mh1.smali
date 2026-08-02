.class public final synthetic Lmh1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic a:Lz70;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/reflect/Constructor;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Integer;

.field public final synthetic f:Lml2;


# direct methods
.method public synthetic constructor <init>(Lz70;Ljava/lang/Class;Ljava/lang/reflect/Constructor;ILjava/lang/Integer;Lml2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmh1;->a:Lz70;

    .line 5
    .line 6
    iput-object p2, p0, Lmh1;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lmh1;->c:Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    iput p4, p0, Lmh1;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lmh1;->e:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p6, p0, Lmh1;->f:Lml2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

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
    iget-object v3, v0, Lmh1;->a:Lz70;

    .line 8
    .line 9
    iget-object v4, v3, Lz70;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, v3, Lz70;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, v3, Lz70;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v7, v3, Lz70;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v7, Ljava/lang/String;

    .line 24
    .line 25
    iget-object v8, v3, Lz70;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v8, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v9, v3, Lz70;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v9, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, v3, Lz70;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v10, v0, Lmh1;->b:Ljava/lang/Class;

    .line 38
    .line 39
    iget-object v11, v0, Lmh1;->c:Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    iget v13, v0, Lmh1;->d:I

    .line 43
    .line 44
    iget-object v14, v0, Lmh1;->f:Lml2;

    .line 45
    .line 46
    if-eqz v4, :cond_9

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v15

    .line 52
    invoke-static {v15, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_0
    invoke-static {v15, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_1
    invoke-static {v15, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    invoke-static {v15, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    filled-new-array {v10, v12}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v11, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :cond_3
    invoke-static {v15, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :cond_4
    invoke-static {v15, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    invoke-static {v15, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    if-eqz p3, :cond_6

    .line 118
    .line 119
    invoke-static/range {p3 .. p3}, Lmg;->l0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_0

    .line 124
    :cond_6
    move-object v0, v12

    .line 125
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v0, Landroid/app/Activity;

    .line 129
    .line 130
    invoke-virtual {v14, v0}, Lml2;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    return-object v12

    .line 134
    :cond_7
    if-nez p3, :cond_8

    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    new-array v0, v0, [Ljava/lang/Object;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    move-object/from16 v0, p3

    .line 141
    .line 142
    :goto_1
    array-length v3, v0

    .line 143
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v1, v2, v0}, Li42;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    :cond_9
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_a

    .line 161
    .line 162
    :goto_2
    return-object v10

    .line 163
    :cond_a
    invoke-static {v4, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_b

    .line 168
    .line 169
    :goto_3
    const-string v0, "SettingGroup_Main_Nuke"

    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_b
    invoke-static {v4, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_c

    .line 177
    .line 178
    filled-new-array {v10, v12}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v11, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :cond_c
    invoke-static {v4, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_d

    .line 192
    .line 193
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :cond_d
    invoke-static {v4, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_e

    .line 203
    .line 204
    :goto_4
    iget-object v0, v0, Lmh1;->e:Ljava/lang/Integer;

    .line 205
    .line 206
    return-object v0

    .line 207
    :cond_e
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_10

    .line 212
    .line 213
    if-eqz p3, :cond_f

    .line 214
    .line 215
    invoke-static/range {p3 .. p3}, Lmg;->l0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto :goto_5

    .line 220
    :cond_f
    move-object v0, v12

    .line 221
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    check-cast v0, Landroid/app/Activity;

    .line 225
    .line 226
    invoke-virtual {v14, v0}, Lml2;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    return-object v12

    .line 230
    :cond_10
    if-nez p3, :cond_11

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    new-array v0, v0, [Ljava/lang/Object;

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_11
    move-object/from16 v0, p3

    .line 237
    .line 238
    :goto_6
    array-length v3, v0

    .line 239
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v1, v2, v0}, Li42;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0
.end method
