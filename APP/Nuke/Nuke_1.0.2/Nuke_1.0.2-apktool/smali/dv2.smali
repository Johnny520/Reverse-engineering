.class public final Ldv2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lve0;
.implements Lwx;


# instance fields
.field public final a:Lox;

.field public final b:Lu21;

.field public final c:Lfg3;

.field public final d:[Ldv2;

.field public final e:Lf31;

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lox;Lu21;Lfg3;[Ldv2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldv2;->a:Lox;

    .line 8
    .line 9
    iput-object p2, p0, Ldv2;->b:Lu21;

    .line 10
    .line 11
    iput-object p3, p0, Ldv2;->c:Lfg3;

    .line 12
    .line 13
    iput-object p4, p0, Ldv2;->d:[Ldv2;

    .line 14
    .line 15
    iget-object p1, p2, Lu21;->a:Lf31;

    .line 16
    .line 17
    iput-object p1, p0, Ldv2;->e:Lf31;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    aget-object p2, p4, p1

    .line 26
    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    if-eq p2, p0, :cond_1

    .line 30
    .line 31
    :cond_0
    aput-object p0, p4, p1

    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lyo2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldv2;->a:Lox;

    .line 5
    .line 6
    invoke-virtual {p1}, Lox;->m()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lox;->c()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Ldv2;->c:Lfg3;

    .line 13
    .line 14
    iget-char p0, p0, Lfg3;->i:C

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lox;->e(C)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b(Lyo2;)Lwx;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldv2;->b:Lu21;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lgg3;->f(Lu21;Lyo2;)Lfg3;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-char v2, v1, Lfg3;->h:C

    .line 11
    .line 12
    iget-object v3, p0, Ldv2;->a:Lox;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lox;->e(C)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lox;->a()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Ldv2;->g:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v4, p0, Ldv2;->h:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Lyo2;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :cond_0
    invoke-virtual {v3}, Lox;->b()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lox;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x3a

    .line 39
    .line 40
    invoke-virtual {v3, p1}, Lox;->e(C)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lox;->k()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v4}, Ldv2;->p(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Ldv2;->g:Ljava/lang/String;

    .line 51
    .line 52
    iput-object p1, p0, Ldv2;->h:Ljava/lang/String;

    .line 53
    .line 54
    :cond_1
    iget-object p1, p0, Ldv2;->c:Lfg3;

    .line 55
    .line 56
    if-ne p1, v1, :cond_2

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    iget-object p0, p0, Ldv2;->d:[Ldv2;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    aget-object p1, p0, p1

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    new-instance p1, Ldv2;

    .line 73
    .line 74
    invoke-direct {p1, v3, v0, v1, p0}, Ldv2;-><init>(Lox;Lu21;Lfg3;[Ldv2;)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lox;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldk;

    .line 9
    .line 10
    const-string v0, "null"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldk;->w(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(Lyo2;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final e(Lw41;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldv2;->b:Lu21;

    .line 5
    .line 6
    iget-object v1, v0, Lu21;->a:Lf31;

    .line 7
    .line 8
    instance-of v2, p1, Le3;

    .line 9
    .line 10
    iget-object v3, v1, Lf31;->g:Lzs;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v5, Lzs;->h:Lzs;

    .line 16
    .line 17
    if-eq v3, v5, :cond_6

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_6

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v3, v5, :cond_2

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    if-ne v3, v5, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {}, Lc80;->s()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Lyo2;->c()Ls11;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v5, Lyv2;->g:Lyv2;

    .line 46
    .line 47
    invoke-static {v3, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-nez v5, :cond_3

    .line 52
    .line 53
    sget-object v5, Lyv2;->j:Lyv2;

    .line 54
    .line 55
    invoke-static {v3, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_6

    .line 60
    .line 61
    :cond_3
    :goto_0
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-interface {v3}, Lyo2;->getAnnotations()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_5

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Ljava/lang/annotation/Annotation;

    .line 87
    .line 88
    instance-of v6, v5, Le31;

    .line 89
    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    check-cast v5, Le31;

    .line 93
    .line 94
    invoke-interface {v5}, Le31;->discriminator()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    iget-object v3, v1, Lf31;->e:Ljava/lang/String;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    :goto_1
    move-object v3, v4

    .line 103
    :goto_2
    if-nez v2, :cond_d

    .line 104
    .line 105
    if-eqz v3, :cond_c

    .line 106
    .line 107
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v2}, Lsp0;->N(Lu21;Lyo2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2}, Ltl;->m(Lyo2;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_8

    .line 126
    .line 127
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-interface {p0}, Lyo2;->b()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p1}, Lyo2;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object p2, v1, Lf31;->g:Lzs;

    .line 144
    .line 145
    sget-object v0, Lzs;->i:Lzs;

    .line 146
    .line 147
    if-ne p2, v0, :cond_7

    .line 148
    .line 149
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_7

    .line 154
    .line 155
    const-string p0, "in ALL_JSON_OBJECTS class discriminator mode"

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v0, "as base class \'"

    .line 161
    .line 162
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const/16 p0, 0x27

    .line 169
    .line 170
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :goto_3
    const-string p2, "\' cannot be serialized "

    .line 178
    .line 179
    const-string v0, " because it has property name that conflicts with JSON class discriminator \'"

    .line 180
    .line 181
    const-string v1, "Class \'"

    .line 182
    .line 183
    invoke-static {v1, p1, p2, p0, v0}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    const-string p1, "\'."

    .line 188
    .line 189
    invoke-static {p0, v3, p1}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    new-instance p1, Lr31;

    .line 194
    .line 195
    const-string p2, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."

    .line 196
    .line 197
    invoke-direct {p1, p0, p2}, Lr31;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :cond_8
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {v0}, Lyo2;->c()Ls11;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    instance-of v1, v0, Lcp2;

    .line 213
    .line 214
    if-nez v1, :cond_b

    .line 215
    .line 216
    instance-of v1, v0, Lf32;

    .line 217
    .line 218
    if-nez v1, :cond_a

    .line 219
    .line 220
    instance-of v0, v0, Lx12;

    .line 221
    .line 222
    if-nez v0, :cond_9

    .line 223
    .line 224
    invoke-interface {p1}, Lw41;->e()Lyo2;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Lyo2;->b()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v3, p0, Ldv2;->g:Ljava/lang/String;

    .line 233
    .line 234
    iput-object v0, p0, Ldv2;->h:Ljava/lang/String;

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_9
    const-string p0, "Actual serializer for polymorphic cannot be polymorphic itself"

    .line 238
    .line 239
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_a
    const-string p0, "Primitives cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 244
    .line 245
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_b
    const-string p0, "Enums cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 250
    .line 251
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_c
    :goto_4
    invoke-interface {p1, p0, p2}, Lw41;->d(Lve0;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_d
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    throw v4
.end method

.method public final f(D)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    iget-object p0, p0, Lox;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ldk;

    .line 18
    .line 19
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ldk;->w(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmpg-double p0, v0, v2

    .line 36
    .line 37
    if-gtz p0, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p1, Lr31;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    invoke-static {p0, p2}, Lp7;->F(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p2, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'"

    .line 52
    .line 53
    invoke-direct {p1, p0, p2}, Lr31;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public final g(S)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lox;->h(S)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final h(Lyo2;ILjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lnv2;->a:Lnv2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Ldv2;->e:Lf31;

    .line 9
    .line 10
    iget-boolean v0, v0, Lf31;->c:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    :goto_0
    sget-object v0, Lnv2;->a:Lnv2;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lnv2;->b:Lg32;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    if-nez p3, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Lve0;->c()V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-interface {p0, v0, p3}, Lve0;->e(Lw41;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-void
.end method

.method public final i(B)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lox;->d(B)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    iget-object p0, p0, Lox;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ldk;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Ldk;->w(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final k(Lyo2;)Lve0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lev2;->a(Lyo2;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Ldv2;->c:Lfg3;

    .line 10
    .line 11
    iget-object v3, p0, Ldv2;->b:Lu21;

    .line 12
    .line 13
    iget-object v4, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    instance-of p1, v4, Lsx;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, v4, Lox;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ldk;

    .line 25
    .line 26
    iget-boolean p0, p0, Ldv2;->f:Z

    .line 27
    .line 28
    new-instance v4, Lsx;

    .line 29
    .line 30
    invoke-direct {v4, p1, p0}, Lsx;-><init>(Ldk;Z)V

    .line 31
    .line 32
    .line 33
    :goto_0
    new-instance p0, Ldv2;

    .line 34
    .line 35
    invoke-direct {p0, v4, v3, v2, v1}, Ldv2;-><init>(Lox;Lu21;Lfg3;[Ldv2;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-interface {p1}, Lyo2;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    sget-object v0, Ll31;->a:Lgz0;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    instance-of p1, v4, Lrx;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object p1, v4, Lox;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Ldk;

    .line 61
    .line 62
    iget-boolean p0, p0, Ldv2;->f:Z

    .line 63
    .line 64
    new-instance v4, Lrx;

    .line 65
    .line 66
    invoke-direct {v4, p1, p0}, Lrx;-><init>(Ldk;Z)V

    .line 67
    .line 68
    .line 69
    :goto_1
    new-instance p0, Ldv2;

    .line 70
    .line 71
    invoke-direct {p0, v4, v3, v2, v1}, Ldv2;-><init>(Lox;Lu21;Lfg3;[Ldv2;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    iget-object v0, p0, Ldv2;->g:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    invoke-interface {p1}, Lyo2;->b()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Ldv2;->h:Ljava/lang/String;

    .line 84
    .line 85
    :cond_4
    return-object p0
.end method

.method public final l(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lox;->f(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final m(F)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    iget-object p0, p0, Lox;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ldk;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ldk;->w(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 31
    .line 32
    .line 33
    cmpg-float p0, p0, v0

    .line 34
    .line 35
    if-gtz p0, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, Lr31;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-static {p0, v0}, Lp7;->F(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'"

    .line 50
    .line 51
    invoke-direct {p1, p0, v0}, Lr31;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final n(J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldv2;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lox;->g(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final o(C)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldv2;->a:Lox;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lox;->i(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final q(Lyo2;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, Lyo2;->e(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r(Lyo2;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Ldv2;->j(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final s(Lyo2;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldv2;->c:Lfg3;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x2c

    .line 11
    .line 12
    iget-object v2, p0, Ldv2;->a:Lox;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eq v0, v3, :cond_7

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/16 v5, 0x3a

    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    if-eq v0, v6, :cond_4

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    if-eq v0, v6, :cond_1

    .line 25
    .line 26
    iget-boolean v0, v2, Lox;->h:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lox;->e(C)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v2}, Lox;->b()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ldv2;->b:Lu21;

    .line 37
    .line 38
    invoke-static {v0, p1}, Lsp0;->N(Lu21;Lyo2;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, p2}, Lyo2;->e(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ldv2;->p(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5}, Lox;->e(C)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lox;->k()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    if-nez p2, :cond_2

    .line 56
    .line 57
    iput-boolean v3, p0, Ldv2;->f:Z

    .line 58
    .line 59
    :cond_2
    if-ne p2, v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Lox;->e(C)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lox;->k()V

    .line 65
    .line 66
    .line 67
    iput-boolean v4, p0, Ldv2;->f:Z

    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :cond_4
    iget-boolean p1, v2, Lox;->h:Z

    .line 71
    .line 72
    if-nez p1, :cond_6

    .line 73
    .line 74
    rem-int/2addr p2, v6

    .line 75
    if-nez p2, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Lox;->e(C)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Lox;->b()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-virtual {v2, v5}, Lox;->e(C)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lox;->k()V

    .line 88
    .line 89
    .line 90
    move v3, v4

    .line 91
    :goto_0
    iput-boolean v3, p0, Ldv2;->f:Z

    .line 92
    .line 93
    return-void

    .line 94
    :cond_6
    iput-boolean v3, p0, Ldv2;->f:Z

    .line 95
    .line 96
    invoke-virtual {v2}, Lox;->b()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_7
    iget-boolean p0, v2, Lox;->h:Z

    .line 101
    .line 102
    if-nez p0, :cond_8

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Lox;->e(C)V

    .line 105
    .line 106
    .line 107
    :cond_8
    invoke-virtual {v2}, Lox;->b()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final t(Ld32;I)Lve0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lrb1;->j(I)Lyo2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ldv2;->k(Lyo2;)Lve0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final u(IILyo2;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3, p1}, Ldv2;->s(Lyo2;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Ldv2;->l(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v(Lyo2;IJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3, p4}, Ldv2;->n(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w(Lyo2;ILw41;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p3, p4}, Lve0;->e(Lw41;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x(Lyo2;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ldv2;->s(Lyo2;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p3}, Ldv2;->p(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
