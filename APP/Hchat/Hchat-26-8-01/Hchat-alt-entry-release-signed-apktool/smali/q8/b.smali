.class public final synthetic Lq8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic g:Lq8/h;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/Class;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/Class;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lq8/h;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8/b;->g:Lq8/h;

    .line 5
    .line 6
    iput-object p2, p0, Lq8/b;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lq8/b;->i:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Lq8/b;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lq8/b;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lq8/b;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lq8/b;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lq8/b;->n:Ljava/lang/Class;

    .line 19
    .line 20
    iput-object p9, p0, Lq8/b;->o:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lq8/b;->g:Lq8/h;

    .line 2
    .line 3
    iget-object v1, p0, Lq8/b;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lq8/b;->i:Ljava/lang/Class;

    .line 6
    .line 7
    iget-object v3, p0, Lq8/b;->j:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lq8/b;->k:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lq8/b;->l:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lq8/b;->m:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lq8/b;->n:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object v8, p0, Lq8/b;->o:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    const/4 v10, 0x0

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    new-array v11, v10, [Ljava/lang/Object;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v11, p3

    .line 30
    :goto_0
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    if-eqz p3, :cond_3

    .line 58
    .line 59
    array-length v1, p3

    .line 60
    if-lez v1, :cond_3

    .line 61
    .line 62
    aget-object p1, p3, v10

    .line 63
    .line 64
    check-cast p1, Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    invoke-static {p1, p2, v10}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 71
    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_3
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    const-string p1, "SettingGroup_Main_Other_Hchat"

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_7

    .line 88
    .line 89
    iget-object p1, v0, Lq8/h;->h:Ljava/lang/Class;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iget-object v2, v0, Lq8/h;->h:Ljava/lang/Class;

    .line 94
    .line 95
    :cond_5
    iget-object p1, v0, Lq8/h;->i:Ljava/lang/Class;

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    iget-object v7, v0, Lq8/h;->i:Ljava/lang/Class;

    .line 100
    .line 101
    :cond_6
    iget-object p1, v0, Lq8/h;->c:Le8/c;

    .line 102
    .line 103
    iget-object p1, p1, Le8/c;->m:Ljava/lang/Class;

    .line 104
    .line 105
    const-class p2, Ljava/lang/Class;

    .line 106
    .line 107
    filled-new-array {p2, p2}, [Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    filled-new-array {v2, v7}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_7
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-eqz p3, :cond_8

    .line 129
    .line 130
    const p1, -0x48435854

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :cond_8
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-eqz p3, :cond_19

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 149
    .line 150
    if-eq p3, v0, :cond_18

    .line 151
    .line 152
    const-class v0, Ljava/lang/Boolean;

    .line 153
    .line 154
    if-ne p3, v0, :cond_9

    .line 155
    .line 156
    goto/16 :goto_8

    .line 157
    .line 158
    :cond_9
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 159
    .line 160
    if-eq p3, v0, :cond_17

    .line 161
    .line 162
    const-class v0, Ljava/lang/Byte;

    .line 163
    .line 164
    if-ne p3, v0, :cond_a

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_a
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 168
    .line 169
    if-eq p3, v0, :cond_16

    .line 170
    .line 171
    const-class v0, Ljava/lang/Short;

    .line 172
    .line 173
    if-ne p3, v0, :cond_b

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_b
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 177
    .line 178
    if-eq p3, v0, :cond_15

    .line 179
    .line 180
    const-class v0, Ljava/lang/Integer;

    .line 181
    .line 182
    if-ne p3, v0, :cond_c

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_c
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 186
    .line 187
    if-eq p3, v0, :cond_14

    .line 188
    .line 189
    const-class v0, Ljava/lang/Long;

    .line 190
    .line 191
    if-ne p3, v0, :cond_d

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_d
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 195
    .line 196
    if-eq p3, v0, :cond_13

    .line 197
    .line 198
    const-class v0, Ljava/lang/Float;

    .line 199
    .line 200
    if-ne p3, v0, :cond_e

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_e
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 204
    .line 205
    if-eq p3, v0, :cond_12

    .line 206
    .line 207
    const-class v0, Ljava/lang/Double;

    .line 208
    .line 209
    if-ne p3, v0, :cond_f

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_f
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 213
    .line 214
    if-eq p3, v0, :cond_11

    .line 215
    .line 216
    const-class v0, Ljava/lang/Character;

    .line 217
    .line 218
    if-ne p3, v0, :cond_10

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_10
    invoke-static {p1, p2, v11}, Ly4/c;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1

    .line 226
    :cond_11
    :goto_1
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    return-object p1

    .line 231
    :cond_12
    :goto_2
    const-wide/16 p1, 0x0

    .line 232
    .line 233
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    return-object p1

    .line 238
    :cond_13
    :goto_3
    const/4 p1, 0x0

    .line 239
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    return-object p1

    .line 244
    :cond_14
    :goto_4
    const-wide/16 p1, 0x0

    .line 245
    .line 246
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :cond_15
    :goto_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    :cond_16
    :goto_6
    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    return-object p1

    .line 261
    :cond_17
    :goto_7
    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    return-object p1

    .line 266
    :cond_18
    :goto_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 267
    .line 268
    return-object p1

    .line 269
    :cond_19
    invoke-static {p1, p2, v11}, Ly4/c;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    return-object p1
.end method
